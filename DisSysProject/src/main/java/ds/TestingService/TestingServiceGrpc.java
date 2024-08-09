package ds.TestingService;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Interface exported by the server.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.12.0)",
    comments = "Source: test.proto")
public final class TestingServiceGrpc {

  private TestingServiceGrpc() {}

  public static final String SERVICE_NAME = "ds.TestingService.TestingService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getTestServicesMethod()} instead. 
  public static final io.grpc.MethodDescriptor<ds.TestingService.TestRequest,
      ds.TestingService.TestResponse> METHOD_TEST_SERVICES = getTestServicesMethodHelper();

  private static volatile io.grpc.MethodDescriptor<ds.TestingService.TestRequest,
      ds.TestingService.TestResponse> getTestServicesMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<ds.TestingService.TestRequest,
      ds.TestingService.TestResponse> getTestServicesMethod() {
    return getTestServicesMethodHelper();
  }

  private static io.grpc.MethodDescriptor<ds.TestingService.TestRequest,
      ds.TestingService.TestResponse> getTestServicesMethodHelper() {
    io.grpc.MethodDescriptor<ds.TestingService.TestRequest, ds.TestingService.TestResponse> getTestServicesMethod;
    if ((getTestServicesMethod = TestingServiceGrpc.getTestServicesMethod) == null) {
      synchronized (TestingServiceGrpc.class) {
        if ((getTestServicesMethod = TestingServiceGrpc.getTestServicesMethod) == null) {
          TestingServiceGrpc.getTestServicesMethod = getTestServicesMethod = 
              io.grpc.MethodDescriptor.<ds.TestingService.TestRequest, ds.TestingService.TestResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ds.TestingService.TestingService", "testServices"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.TestingService.TestRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.TestingService.TestResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TestingServiceMethodDescriptorSupplier("testServices"))
                  .build();
          }
        }
     }
     return getTestServicesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TestingServiceStub newStub(io.grpc.Channel channel) {
    return new TestingServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TestingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TestingServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TestingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TestingServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class TestingServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void testServices(ds.TestingService.TestRequest request,
        io.grpc.stub.StreamObserver<ds.TestingService.TestResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTestServicesMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getTestServicesMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                ds.TestingService.TestRequest,
                ds.TestingService.TestResponse>(
                  this, METHODID_TEST_SERVICES)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class TestingServiceStub extends io.grpc.stub.AbstractStub<TestingServiceStub> {
    private TestingServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TestingServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TestingServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TestingServiceStub(channel, callOptions);
    }

    /**
     */
    public void testServices(ds.TestingService.TestRequest request,
        io.grpc.stub.StreamObserver<ds.TestingService.TestResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTestServicesMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class TestingServiceBlockingStub extends io.grpc.stub.AbstractStub<TestingServiceBlockingStub> {
    private TestingServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TestingServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TestingServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TestingServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ds.TestingService.TestResponse testServices(ds.TestingService.TestRequest request) {
      return blockingUnaryCall(
          getChannel(), getTestServicesMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class TestingServiceFutureStub extends io.grpc.stub.AbstractStub<TestingServiceFutureStub> {
    private TestingServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TestingServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TestingServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TestingServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ds.TestingService.TestResponse> testServices(
        ds.TestingService.TestRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTestServicesMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TEST_SERVICES = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TestingServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TestingServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TEST_SERVICES:
          serviceImpl.testServices((ds.TestingService.TestRequest) request,
              (io.grpc.stub.StreamObserver<ds.TestingService.TestResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class TestingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TestingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ds.TestingService.TestingServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TestingService");
    }
  }

  private static final class TestingServiceFileDescriptorSupplier
      extends TestingServiceBaseDescriptorSupplier {
    TestingServiceFileDescriptorSupplier() {}
  }

  private static final class TestingServiceMethodDescriptorSupplier
      extends TestingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TestingServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (TestingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TestingServiceFileDescriptorSupplier())
              .addMethod(getTestServicesMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
