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


	@Override
	public void getBedPositionDo(Empty request, StreamObserver<GetBedPositionResponse> responseObserver) {
	    

	    GetBedPositionResponse response = GetBedPositionResponse.newBuilder()
	            .setBedHeadPosition(bedHeadPosition)
	            .setBedFootPosition(bedFootPosition)
	            .build();

	    responseObserver.onNext(response);
	    responseObserver.onCompleted();
	}
}