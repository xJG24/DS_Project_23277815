package ds.SmartClimateControlService;

import java.io.IOException;

import ds.SmartClimateControlService.SmartClimateControlServiceGrpc.SmartClimateControlServiceImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import ds.SmartBedControlService.Empty;
import ds.SmartBedControlService.GetBedPositionResponse;
import ds.SmartBedControlService.SetBedHeadPositionRequest;
import ds.SmartBedControlService.SetBedHeadPositionResponse;
import ds.SmartBedControlService.SmartBedControlService;
import ds.SmartBedControlService.SmartBedControlServiceGrpc.SmartBedControlServiceImplBase;
import ds.SmartClimateControlService.GetClimateReadingResponse;
import ds.SmartClimateControlService.GetClimateReadingRequest;
import ds.SmartClimateControlService.OperationalStatus;
import ds.SmartClimateControlService.SetHumidityRequest;
import ds.SmartClimateControlService.SetHumidityResponse;
import ds.SmartClimateControlService.SetTemperatureRequest;
import ds.SmartClimateControlService.SetTemperatureResponse;

public class SmartClimateControlService extends SmartClimateControlServiceImplBase{
	
	float temperature = 23.0F;
	float humidity = 60.0F;
	
	public static void main(String[] args) throws InterruptedException, IOException {
		SmartClimateControlService smartClimateControlService = new SmartClimateControlService();

		int port = 50052;
		Server server = ServerBuilder.forPort(port)
				.addService(smartClimateControlService)
				.build()
				.start();

		System.out.println("Smart Climate Control Service started, listening on " + port);

		server.awaitTermination();
	}
	
	
		//no error handling yet
		@Override
		public void getClimateReadingDo(GetClimateReadingRequest request, StreamObserver<GetClimateReadingResponse> responseObserver) {
		    

			GetClimateReadingResponse response = GetClimateReadingResponse.newBuilder()
					.setRoomID(request.getRoomID())
		            .setTemperature(temperature)
		            .setHumidity(humidity)
		            .build();

		    responseObserver.onNext(response);
		    responseObserver.onCompleted();
		}
		
		// no error handling yet
		// maybe a try catch block + a validation method? 
		@Override
		public void setTemperatureDo(SetTemperatureRequest request, StreamObserver<SetTemperatureResponse> responseObserver) {
			temperature = request.getTemperature();
			
			SetTemperatureResponse response = SetTemperatureResponse.newBuilder()
					.setTemperature(temperature)
					.setResult(OperationalStatus.Success)
		            .setStatusMessage("Temperature successfully set to " + temperature + ".")
					.build();
			
			responseObserver.onNext(response);
		    responseObserver.onCompleted();
		}
		// no error handling yet
		// maybe a try catch block + a validation method? 
		@Override
		public void setHumidityDo(SetHumidityRequest request, StreamObserver<SetHumidityResponse> responseObserver) {
			humidity = request.getHumidity();
			
			SetHumidityResponse response = SetHumidityResponse.newBuilder()
					.setHumidity(humidity)
					.setResult(OperationalStatus.Success)
		            .setStatusMessage("Humidity successfully set to " + humidity + ".")
					.build();
			
			responseObserver.onNext(response);
		    responseObserver.onCompleted();
		}		

}

