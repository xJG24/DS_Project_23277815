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
	
	@Override
	public void getVitalSignsHistoryDo(GetVitalSignsRequest request, StreamObserver<GetVitalSignsHistoryResponse> responseObserver) {
		
	}
	
	public static void setVitalSignsDo(SetVitalSignsRequest request, StreamObserver<SetVitalSignsResponse> responseObserver) {
		
	}
	
private static Record readEntry(String file) {
	Path filePath = Paths.get(file);
    Record entryRecord = null;
    try (Scanner scanner = new Scanner(filePath)) {
        while (scanner.hasNextLine()) {
        	
        }
    }
}

// method to read a file until the last entry which matches the provided ID
//returns the latest string as a record object
private static Record readLastMatchingEntry(String file, int patientID) {
    Path filePath = Paths.get(file);
    Record lastEntryRecord = null;
    try (Scanner scanner = new Scanner(filePath)) {
        while (scanner.hasNextLine()) {
            String currentEntry = scanner.nextLine().trim();
            Record currentEntryRecord = compileRecordFromFile(currentEntry);
            if (currentEntryRecord != null && currentEntryRecord.getPatientID() == patientID) {
                lastEntryRecord = currentEntryRecord;
            }
        }
    } catch (IOException e) {
        System.out.println("Error reading file: " + e.getMessage());
    }	
    return lastEntryRecord;
}

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
private static Record compileRecordFromFile(String record) throws NumberFormatException {
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
}
