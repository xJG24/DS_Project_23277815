package ds.SmartBedControlService;

import java.io.IOException;

import ds.SmartBedControlService.SmartBedControlServiceGrpc.SmartBedControlServiceImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import ds.SmartBedControlService.Empty;
import ds.SmartBedControlService.GetBedPositionResponse;
import ds.SmartBedControlService.ResetBedPositionResponse;
import ds.SmartBedControlService.SetBedFootPositionResponse;
import ds.SmartBedControlService.SetBedHeadPositionResponse;
import ds.SmartBedControlService.OperationalStatus;


public class SmartBedControlService extends SmartBedControlServiceImplBase{
	
	float bedHeadPosition = 0.0F;
    float bedFootPosition = 0.0F;



	public static void main(String[] args) throws InterruptedException, IOException {
		SmartBedControlService smartBedControlService = new SmartBedControlService();

		int port = 50051;
		Server server = ServerBuilder.forPort(port)
				.addService(smartBedControlService)
				.build()
				.start();

		System.out.println("Smart Bed Control Service started, listening on " + port);

		server.awaitTermination();
	}

	// no error handling yet
	@Override
	public void getBedPositionDo(Empty request, StreamObserver<GetBedPositionResponse> responseObserver) {
	    

	    GetBedPositionResponse response = GetBedPositionResponse.newBuilder()
	            .setBedHeadPosition(bedHeadPosition)
	            .setBedFootPosition(bedFootPosition)
	            .build();

	    responseObserver.onNext(response);
	    responseObserver.onCompleted();
	}

	@Override
	public void setBedHeadPositionDo(SetBedHeadPositionRequest request, StreamObserver<SetBedHeadPositionResponse> responseObserver) {
		if (request.getBedHeadPosition() >= 0.0 && request.getBedHeadPosition() <= 10.0) {
			bedHeadPosition = request.getBedHeadPosition();
			SetBedHeadPositionResponse response = SetBedHeadPositionResponse.newBuilder()
					.setBedHeadPosition(request.getBedHeadPosition())
					.setResult(OperationalStatus.Success)
		            .setStatusMessage("Head position adjusted successfully.")
					.build();
			
			responseObserver.onNext(response);
		    responseObserver.onCompleted();
		} else {
			SetBedHeadPositionResponse response = SetBedHeadPositionResponse.newBuilder()
					.setBedHeadPosition(bedHeadPosition)
					.setResult(OperationalStatus.Failure)
		            .setStatusMessage("Head position out of range: Must be between 0.0 and 10.0.")
					.build();
			
			responseObserver.onNext(response);
		    responseObserver.onCompleted();
		}
		
	}
	
	// no error handling yet
	// maybe a try catch block + a validation method? 
	@Override
	public void setBedFootPositionDo(SetBedFootPositionRequest request, StreamObserver<SetBedFootPositionResponse> responseObserver) {
		
		if(request.getBedFootPosition() >= 0.0 && request.getBedFootPosition() <= 10.0) {
			bedFootPosition = request.getBedFootPosition();
			
			SetBedFootPositionResponse response = SetBedFootPositionResponse.newBuilder()
					.setBedFootPosition(request.getBedFootPosition())
					.setResult(OperationalStatus.Success)
		            .setStatusMessage("Foot position adjusted successfully.")
					.build();
			
			responseObserver.onNext(response);
		    responseObserver.onCompleted();
		} else {
			SetBedFootPositionResponse response = SetBedFootPositionResponse.newBuilder()
					.setBedFootPosition(bedFootPosition)
					.setResult(OperationalStatus.Failure)
		            .setStatusMessage("Foot position out of range: Must be between 0.0 and 10.0.")
					.build();
			
			responseObserver.onNext(response);
		    responseObserver.onCompleted();
		}
		
		
	}
	
	// no error handling yet
	// maybe a try catch block + a validation method? 
	@Override
	public void resetBedPositionDo(Empty request, StreamObserver<ResetBedPositionResponse> responseObserver) {
		bedHeadPosition = 0.0F;
		bedFootPosition = 0.0F;
		
		ResetBedPositionResponse response = ResetBedPositionResponse.newBuilder()
				.setBedHeadPosition(bedHeadPosition)
				.setBedFootPosition(bedFootPosition)
				.setResult(OperationalStatus.Success)
	            .setStatusMessage("Bed position reset successfully.")
				.build();
		
		responseObserver.onNext(response);
	    responseObserver.onCompleted();
	}
	
}