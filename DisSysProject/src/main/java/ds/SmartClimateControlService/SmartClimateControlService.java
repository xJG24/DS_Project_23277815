package ds.SmartClimateControlService;

import java.io.IOException;

import ds.SmartClimateControlService.SmartClimateControlServiceGrpc.SmartClimateControlServiceImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

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
			
			// if request is in range update variable 
			if (request.getTemperature() >= 18.0 && request.getTemperature() <= 25.0) {
				temperature = request.getTemperature();
				
				
				SetTemperatureResponse response = SetTemperatureResponse.newBuilder()
						.setTemperature(temperature)
						.setResult(OperationalStatus.Success)
			            .setStatusMessage("Temperature successfully set to " + temperature + ".")
						.build();
				
				responseObserver.onNext(response);
			    responseObserver.onCompleted();
			} else {
				SetTemperatureResponse response = SetTemperatureResponse.newBuilder()
						.setTemperature(temperature)
						.setResult(OperationalStatus.Failure)
			            .setStatusMessage("Temperature Out Of Range: Must be between 18C and 25C.")
						.build();
				
				responseObserver.onNext(response);
			    responseObserver.onCompleted();
			}
			
		}

		
		@Override
		public void setHumidityDo(SetHumidityRequest request, StreamObserver<SetHumidityResponse> responseObserver) {
			
			// if request is in range update variable 
			if(request.getHumidity() >= 30 && request.getHumidity() <= 60) {
				humidity = request.getHumidity();
				SetHumidityResponse response = SetHumidityResponse.newBuilder()
					.setHumidity(humidity)
					.setResult(OperationalStatus.Success)
		            .setStatusMessage("Humidity successfully set to " + humidity + ".")
					.build();
			
			responseObserver.onNext(response);
		    responseObserver.onCompleted();
			} else {
				SetHumidityResponse response = SetHumidityResponse.newBuilder()
						.setHumidity(humidity)
						.setResult(OperationalStatus.Failure)
			            .setStatusMessage("Humidity Out Of Range: Must be between 30% and 60%.")
						.build();
				
				responseObserver.onNext(response);
			    responseObserver.onCompleted();
			}
				
				
		}		

}

