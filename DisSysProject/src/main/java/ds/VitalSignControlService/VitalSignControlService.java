package ds.VitalSignControlService;

import java.io.IOException;

import ds.VitalSignControlService.VitalSignControlServiceGrpc.VitalSignControlServiceImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import ds.SmartBedControlService.Empty;
import ds.SmartBedControlService.GetBedPositionResponse;
import ds.SmartBedControlService.SmartBedControlService;
import ds.VitalSignControlService.GetVitalSignsRequest;
import ds.VitalSignControlService.GetVitalSignsResponse;
import ds.VitalSignControlService.OperationalStatus;
import ds.VitalSignControlService.SetVitalSignsRequest;
import ds.VitalSignControlService.SetVitalSignsResponse;
import ds.VitalSignControlService.VitalSignsMonitorRequest;
import ds.VitalSignControlService.VitalSignsMonitorResponse;
import ds.VitalSignControlService.VitalSignsProblemRequest;
import ds.VitalSignControlService.VitalSignsProblemResponse;
import ds.VitalSignControlService.Record;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.google.type.DateTime;

import java.io.*;


public class VitalSignControlService extends VitalSignControlServiceImplBase {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		VitalSignControlService vitalSignControlService = new VitalSignControlService();

		int port = 50053;
		Server server = ServerBuilder.forPort(port)
				.addService(vitalSignControlService)
				.build()
				.start();

		System.out.println("Vital Sign Control Service started, listening on " + port);

		server.awaitTermination();
		
		
		public static void getVitalSignsDo(GetVitalSignsRequest request, StreamObserver<GetVitalSignsResponse> responseObserver) {
		    int PatientID = request.getPatientID();
		    Record record = readLastMatchingEntry("src/main/resources/vitals.txt", patientID);
		    
		    // work out how to get results into fields
			GetVitalSignsResponse response = GetVitalSignsResponse.newBuilder()
		            .setPatientID(record.getPatientID())
		            .setHeartRate(record.getHeartRateBPM())
		            .setBodyTemp(record.getBodyTemp())
		            .setSpo2(record.getSpo2())
		            .setTime(record.getTime())
		            .build();

		    responseObserver.onNext(response);
		    responseObserver.onCompleted();
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
            //calling helper method
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
		System.out.println("ID field contains and error" + e.getMessage());
		return null;
	}
	try {
		newBodyTemp = Double.parseDouble((fields[2]).trim());
	} catch (NumberFormatException e) {
		System.out.println("ID field contains and error" + e.getMessage());
		return null;
	}
	try {
		newSpo2 = Integer.parseInt((fields[3]).trim());
	} catch (NumberFormatException e) {
		System.out.println("ID field contains and error" + e.getMessage());
		return null;
	}
	try {
		newTime = fields[4].trim();
	} catch (InputMismatchException e) {
		System.out.println("ID field contains and error" + e.getMessage());
		return null;
	}
	Record newRecord = new Record(newID, newHeartRate, newBodyTemp,newSpo2,newTime);
	return newRecord;
	}
}


	



/*
   	rpc GetVitalSigns(GetVitalSignsRequest) returns (GetVitalSignsResponse);
	rpc SetVitalSigns(stream SetVitalSignsRequest) returns (SetVitalSignsResponse);
	rpc MonitorVitalSignsReading(stream VitalSignsMonitorRequest) returns (stream VitalSignsMonitorResponse);
	rpc AlertStaffOfVitalSignsProblem(VitalSignsProblemRequest) returns (VitalSignsProblemResponse);
 * */
