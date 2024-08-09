package testingService;

import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import testingService.*;
import testingService.TestingServiceGrpc.TestingServiceImplBase;


public class TestingService extends TestingServiceImplBase{



	public static void main(String[] args) throws InterruptedException, IOException {
		TestingService service1 = new TestingService();

		int port = 50051;

		Server server = ServerBuilder.forPort(port)
				.addService(service1)
				.build()
				.start();

		System.out.println("Service-1 started, listening on " + port);

		server.awaitTermination();
	}
}