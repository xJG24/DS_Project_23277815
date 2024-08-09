package ds.VitalSignsControlService;

import java.io.IOException;

import ds.VitalSignsControlService.VitalSignsControlServiceGrpc.VitalSignsControlServiceImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import ds.VitalSignsControlService.GetVitalSignsRequest;
import ds.VitalSignsControlService.GetVitalSignsLatestResponse;
import ds.VitalSignsControlService.GetVitalSignsHistoryResponse;
import ds.VitalSignsControlService.OperationalStatus;
import ds.VitalSignsControlService.SetVitalSignsRequest;
import ds.VitalSignsControlService.SetVitalSignsResponse;
import ds.VitalSignsControlService.VitalSignsMonitorRequest;
import ds.VitalSignsControlService.VitalSignsMonitorResponse;
import ds.VitalSignsControlService.Record;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.google.type.DateTime;

import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

import java.io.*;

public class VitalSignsControlService extends VitalSignsControlServiceImplBase {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		VitalSignsControlService vitalSignsControlService = new VitalSignsControlService();

		int port = 50053;
		Server server = ServerBuilder.forPort(port)
				.addService(vitalSignsControlService)
				.build()
				.start();

		System.out.println("Vital Sign Control Service started, listening on " + port);

		server.awaitTermination();

	}

	@Override
	public void getVitalSignsLatestDo(GetVitalSignsRequest request, StreamObserver<GetVitalSignsLatestResponse> responseObserver) {
	    int patientID = request.getPatientID();
	    Record record = readLastMatchingEntry("src/main/resources/vitals.txt", patientID);
	    
	    GetVitalSignsLatestResponse response = GetVitalSignsLatestResponse.newBuilder()
	            .setPatientID(record.getPatientID())
	            .setHeartRateBPM(record.getHeartRateBPM())
	            .setBodyTemp(record.getBodyTemp())
	            .setSpo2(record.getSpo2())
	            .setTime(record.getTime())
	            .build();

	    responseObserver.onNext(response);
	    responseObserver.onCompleted();
	}
	
	// Server streaming method
	@Override
	public void getVitalSignsHistoryDo(GetVitalSignsRequest request, StreamObserver<GetVitalSignsHistoryResponse> responseObserver) {
		int patientID = request.getPatientID();
		Path filePath = Paths.get("src/main/resources/vitals.txt");
		
		try (Scanner scanner = new Scanner(filePath)) {
	        while (scanner.hasNextLine()) {
	            String currentEntry = scanner.nextLine().trim();
	            Record record = compileRecordFromString(currentEntry);
	            
	            // if record matches given PatientID and is not null compile response message
	            if (record != null && record.getPatientID() == patientID) {
	                GetVitalSignsHistoryResponse response = GetVitalSignsHistoryResponse.newBuilder()
	                        .setPatientID(record.getPatientID())
	                        .setHeartRateBPM(record.getHeartRateBPM())
	                        .setBodyTemp(record.getBodyTemp())
	                        .setSpo2(record.getSpo2())
	                        .setTime(record.getTime())
	                        .build();
	                
	                responseObserver.onNext(response);
	        }
		}
	        // finish sending responses when there are no more matching entries
	        responseObserver.onCompleted();
		}
		catch (IOException e) {
			System.out.println("Response error" + e.getMessage());
		}
	}
	
	@Override
	public void setVitalSignsDo(SetVitalSignsRequest request, 
			StreamObserver<SetVitalSignsResponse> responseObserver) {
		Record toAppend = new Record(request.getPatientID(),request.getHeartRateBPM(),
				request.getBodyTemp(),request.getSpo2(),request.getTime());
		String filePath = "src/main/resources/vitals.txt";
		//write record to file
		appendRecordToFile(filePath, toAppend);
		// check string has been added 
		Record lastMatchingRecord = readLastMatchingEntry(filePath, toAppend.getPatientID());
		if(lastMatchingRecord.equals(toAppend)) {
			// compose success response
			SetVitalSignsResponse response = SetVitalSignsResponse.newBuilder()
					.setPatientID(lastMatchingRecord.getPatientID())
					.setResult(OperationalStatus.Success)
					.setStatusMessage("Vital Signs Updated Successfully")
					.build();
					
			responseObserver.onNext(response);
		    responseObserver.onCompleted();
			} else {
				// compose failure response
				SetVitalSignsResponse response = SetVitalSignsResponse.newBuilder()
						.setPatientID(lastMatchingRecord.getPatientID())
						.setResult(OperationalStatus.Failure)
						.setStatusMessage("Vital Signs Update Failed, please try again")
						.build();
			}
		}
	
	//bidi streaming method
	@Override
	public StreamObserver<VitalSignsMonitorRequest> monitorVitalSignsReading(
		    StreamObserver<VitalSignsMonitorResponse> responseObserver) {
		
				return new StreamObserver<VitalSignsMonitorRequest>() {
					
					public void onNext(VitalSignsMonitorRequest request) {
						// build record to validate against
						Record record = new Record(request.getPatientID(),request.getHeartRateBPM(),
								request.getBodyTemp(),request.getSpo2(),request.getTime());
						
						// validate the vitals are in range
						String message = validateSafeRange(record);
						String isSafeRangeMessage = "Vitals are in a safe range";
						
						if(!message.equals(isSafeRangeMessage)) {
							
							//build is unsafe response
							VitalSignsMonitorResponse response = VitalSignsMonitorResponse.newBuilder()
									.setPatientID(record.getPatientID())
									.setResult(OperationalStatus.Error)
									.setStatusMessage("Error: "  + message)
									.build();
							responseObserver.onNext(response);
						} else {
							//build is safe response
							VitalSignsMonitorResponse response = VitalSignsMonitorResponse.newBuilder()
									.setPatientID(record.getPatientID())
									.setResult(OperationalStatus.Success)
									.setStatusMessage("Success: " + message)
									.build();
							responseObserver.onNext(response);
						}						
					}

					@Override
					public void onError(Throwable t) {
						t.printStackTrace();
						VitalSignsMonitorResponse response = VitalSignsMonitorResponse.newBuilder()
								.setPatientID(0)
								.setResult(OperationalStatus.Error)
								.setStatusMessage("Operational Error")
								.build();
						responseObserver.onNext(response);
						responseObserver.onCompleted();
						
					}

					@Override
					public void onCompleted() {
						responseObserver.onCompleted();
						
					}
				};
	}


// method to read a file until the last entry which matches the provided ID
//returns the latest string as a record object
private static Record readLastMatchingEntry(String file, int patientID) {
    Path filePath = Paths.get(file);
    Record lastEntryRecord = null;
    try (Scanner scanner = new Scanner(filePath)) {
        while (scanner.hasNextLine()) {
            String currentEntry = scanner.nextLine().trim();
            Record currentEntryRecord = compileRecordFromString(currentEntry);
            if (currentEntryRecord != null && currentEntryRecord.getPatientID() == patientID) {
                lastEntryRecord = currentEntryRecord;
            }
        }
    } catch (IOException e) {
        System.out.println("Error reading file: " + e.getMessage());
    }	
    return lastEntryRecord;
}

//method which takes a record and turns it into a formatted string then appends to list
private static void appendRecordToFile(String file, Record record) {
    String newRecord = "\n" 
    		+ record.getPatientID() + ", "
    		+ record.getHeartRateBPM() + ", "
    		+ record.getBodyTemp() + ", "
    		+ record.getSpo2() + ", "
    		+ record.getTime();
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
        	writer.append(newRecord);
        }
    catch (IOException e) {
    	System.out.println("There was an error writing to file " + e.getMessage());
    }
    		
}


// robust record compiler, which ensures that if anomalous data has been recorded it is not returned 
private static Record compileRecordFromString(String record) throws NumberFormatException {
	String[] fields = record.split(",");
	
	int newID;
	int newHeartRate;
	double newBodyTemp;
	int newSpo2;
	String newTime;
	
	if(fields.length != 5) {
		return null;
	}
	try {
		newID = Integer.parseInt((fields[0]).trim());
	} catch (NumberFormatException e) {
		System.out.println("ID field contains and error" + e.getMessage());
		return null;
	}
	try {
		newHeartRate = Integer.parseInt((fields[1]).trim());
	} catch (NumberFormatException e) {
		System.out.println("HeartRate field contains and error" + e.getMessage());
		return null;
	}
	try {
		newBodyTemp = Double.parseDouble((fields[2]).trim());
	} catch (NumberFormatException e) {
		System.out.println("Body Temperature field contains and error" + e.getMessage());
		return null;
	}
	try {
		newSpo2 = Integer.parseInt((fields[3]).trim());
	} catch (NumberFormatException e) {
		System.out.println("Blood Oxygen field contains and error" + e.getMessage());
		return null;
	}
	try {
		newTime = fields[4].trim();
	} catch (InputMismatchException e) {
		System.out.println("Time field contains and error" + e.getMessage());
		return null;
	}
	Record newRecord = new Record(newID, newHeartRate, newBodyTemp,newSpo2,newTime);
	return newRecord;
	}

	//method to monitor vitals as safe
	private static String validateSafeRange(Record record) {
		String isSafeRangeMessage = "Vitals are in a safe range";
		String isUnsafeRangeMessage = "";
		if(record.getHeartRateBPM() < 60 || record.getHeartRateBPM() > 110) {
			isUnsafeRangeMessage += "Heart Rate is out of safe range: " + record.getHeartRateBPM() + "bpm\n";
		}
		if(record.getBodyTemp() < 36.5 || record.getBodyTemp() > 37.5){
			isUnsafeRangeMessage += "Body temperature is out of safe range: " + record.getBodyTemp() + "C\n";
		}
		if(record.getSpo2() < 90 || record.getSpo2() > 100) {
			isUnsafeRangeMessage += "Blood Oxygen is out of safe range: " + record.getSpo2() + "%\n";
		}
		if(isUnsafeRangeMessage.isBlank()) {
			return isSafeRangeMessage;
		} else {
			return isUnsafeRangeMessage;
		}
	}
}
