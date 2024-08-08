package ds.SmartClimateControlService;

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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.12.0)",
    comments = "Source: SmartClimateControl.proto")
public final class SmartClimateControlServiceGrpc {

  private SmartClimateControlServiceGrpc() {}

  public static final String SERVICE_NAME = "SmartClimateControlService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetClimateReadingDoMethod()} instead. 
  public static final io.grpc.MethodDescriptor<ds.SmartClimateControlService.GetClimateReadingRequest,
      ds.SmartClimateControlService.GetClimateReadingResponse> METHOD_GET_CLIMATE_READING_DO = getGetClimateReadingDoMethodHelper();

  private static volatile io.grpc.MethodDescriptor<ds.SmartClimateControlService.GetClimateReadingRequest,
      ds.SmartClimateControlService.GetClimateReadingResponse> getGetClimateReadingDoMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<ds.SmartClimateControlService.GetClimateReadingRequest,
      ds.SmartClimateControlService.GetClimateReadingResponse> getGetClimateReadingDoMethod() {
    return getGetClimateReadingDoMethodHelper();
  }

  private static io.grpc.MethodDescriptor<ds.SmartClimateControlService.GetClimateReadingRequest,
      ds.SmartClimateControlService.GetClimateReadingResponse> getGetClimateReadingDoMethodHelper() {
    io.grpc.MethodDescriptor<ds.SmartClimateControlService.GetClimateReadingRequest, ds.SmartClimateControlService.GetClimateReadingResponse> getGetClimateReadingDoMethod;
    if ((getGetClimateReadingDoMethod = SmartClimateControlServiceGrpc.getGetClimateReadingDoMethod) == null) {
      synchronized (SmartClimateControlServiceGrpc.class) {
        if ((getGetClimateReadingDoMethod = SmartClimateControlServiceGrpc.getGetClimateReadingDoMethod) == null) {
          SmartClimateControlServiceGrpc.getGetClimateReadingDoMethod = getGetClimateReadingDoMethod = 
              io.grpc.MethodDescriptor.<ds.SmartClimateControlService.GetClimateReadingRequest, ds.SmartClimateControlService.GetClimateReadingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartClimateControlService", "GetClimateReading_do"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.SmartClimateControlService.GetClimateReadingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.SmartClimateControlService.GetClimateReadingResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartClimateControlServiceMethodDescriptorSupplier("GetClimateReading_do"))
                  .build();
          }
        }
     }
     return getGetClimateReadingDoMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSetTemperatureDoMethod()} instead. 
  public static final io.grpc.MethodDescriptor<ds.SmartClimateControlService.SetTemperatureRequest,
      ds.SmartClimateControlService.SetTemperatureResponse> METHOD_SET_TEMPERATURE_DO = getSetTemperatureDoMethodHelper();

  private static volatile io.grpc.MethodDescriptor<ds.SmartClimateControlService.SetTemperatureRequest,
      ds.SmartClimateControlService.SetTemperatureResponse> getSetTemperatureDoMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<ds.SmartClimateControlService.SetTemperatureRequest,
      ds.SmartClimateControlService.SetTemperatureResponse> getSetTemperatureDoMethod() {
    return getSetTemperatureDoMethodHelper();
  }

  private static io.grpc.MethodDescriptor<ds.SmartClimateControlService.SetTemperatureRequest,
      ds.SmartClimateControlService.SetTemperatureResponse> getSetTemperatureDoMethodHelper() {
    io.grpc.MethodDescriptor<ds.SmartClimateControlService.SetTemperatureRequest, ds.SmartClimateControlService.SetTemperatureResponse> getSetTemperatureDoMethod;
    if ((getSetTemperatureDoMethod = SmartClimateControlServiceGrpc.getSetTemperatureDoMethod) == null) {
      synchronized (SmartClimateControlServiceGrpc.class) {
        if ((getSetTemperatureDoMethod = SmartClimateControlServiceGrpc.getSetTemperatureDoMethod) == null) {
          SmartClimateControlServiceGrpc.getSetTemperatureDoMethod = getSetTemperatureDoMethod = 
              io.grpc.MethodDescriptor.<ds.SmartClimateControlService.SetTemperatureRequest, ds.SmartClimateControlService.SetTemperatureResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartClimateControlService", "SetTemperature_do"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.SmartClimateControlService.SetTemperatureRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.SmartClimateControlService.SetTemperatureResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartClimateControlServiceMethodDescriptorSupplier("SetTemperature_do"))
                  .build();
          }
        }
     }
     return getSetTemperatureDoMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSetHumidityDoMethod()} instead. 
  public static final io.grpc.MethodDescriptor<ds.SmartClimateControlService.SetHumidityRequest,
      ds.SmartClimateControlService.SetHumidityResponse> METHOD_SET_HUMIDITY_DO = getSetHumidityDoMethodHelper();

  private static volatile io.grpc.MethodDescriptor<ds.SmartClimateControlService.SetHumidityRequest,
      ds.SmartClimateControlService.SetHumidityResponse> getSetHumidityDoMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<ds.SmartClimateControlService.SetHumidityRequest,
      ds.SmartClimateControlService.SetHumidityResponse> getSetHumidityDoMethod() {
    return getSetHumidityDoMethodHelper();
  }

  private static io.grpc.MethodDescriptor<ds.SmartClimateControlService.SetHumidityRequest,
      ds.SmartClimateControlService.SetHumidityResponse> getSetHumidityDoMethodHelper() {
    io.grpc.MethodDescriptor<ds.SmartClimateControlService.SetHumidityRequest, ds.SmartClimateControlService.SetHumidityResponse> getSetHumidityDoMethod;
    if ((getSetHumidityDoMethod = SmartClimateControlServiceGrpc.getSetHumidityDoMethod) == null) {
      synchronized (SmartClimateControlServiceGrpc.class) {
        if ((getSetHumidityDoMethod = SmartClimateControlServiceGrpc.getSetHumidityDoMethod) == null) {
          SmartClimateControlServiceGrpc.getSetHumidityDoMethod = getSetHumidityDoMethod = 
              io.grpc.MethodDescriptor.<ds.SmartClimateControlService.SetHumidityRequest, ds.SmartClimateControlService.SetHumidityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartClimateControlService", "SetHumidity_do"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.SmartClimateControlService.SetHumidityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.SmartClimateControlService.SetHumidityResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartClimateControlServiceMethodDescriptorSupplier("SetHumidity_do"))
                  .build();
          }
        }
     }
     return getSetHumidityDoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SmartClimateControlServiceStub newStub(io.grpc.Channel channel) {
    return new SmartClimateControlServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SmartClimateControlServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SmartClimateControlServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SmartClimateControlServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SmartClimateControlServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class SmartClimateControlServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getClimateReadingDo(ds.SmartClimateControlService.GetClimateReadingRequest request,
        io.grpc.stub.StreamObserver<ds.SmartClimateControlService.GetClimateReadingResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetClimateReadingDoMethodHelper(), responseObserver);
    }

    /**
     */
    public void setTemperatureDo(ds.SmartClimateControlService.SetTemperatureRequest request,
        io.grpc.stub.StreamObserver<ds.SmartClimateControlService.SetTemperatureResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetTemperatureDoMethodHelper(), responseObserver);
    }

    /**
     */
    public void setHumidityDo(ds.SmartClimateControlService.SetHumidityRequest request,
        io.grpc.stub.StreamObserver<ds.SmartClimateControlService.SetHumidityResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetHumidityDoMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetClimateReadingDoMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                ds.SmartClimateControlService.GetClimateReadingRequest,
                ds.SmartClimateControlService.GetClimateReadingResponse>(
                  this, METHODID_GET_CLIMATE_READING_DO)))
          .addMethod(
            getSetTemperatureDoMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                ds.SmartClimateControlService.SetTemperatureRequest,
                ds.SmartClimateControlService.SetTemperatureResponse>(
                  this, METHODID_SET_TEMPERATURE_DO)))
          .addMethod(
            getSetHumidityDoMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                ds.SmartClimateControlService.SetHumidityRequest,
                ds.SmartClimateControlService.SetHumidityResponse>(
                  this, METHODID_SET_HUMIDITY_DO)))
          .build();
    }
  }

  /**
   */
  public static final class SmartClimateControlServiceStub extends io.grpc.stub.AbstractStub<SmartClimateControlServiceStub> {
    private SmartClimateControlServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmartClimateControlServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartClimateControlServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmartClimateControlServiceStub(channel, callOptions);
    }

    /**
     */
    public void getClimateReadingDo(ds.SmartClimateControlService.GetClimateReadingRequest request,
        io.grpc.stub.StreamObserver<ds.SmartClimateControlService.GetClimateReadingResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetClimateReadingDoMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setTemperatureDo(ds.SmartClimateControlService.SetTemperatureRequest request,
        io.grpc.stub.StreamObserver<ds.SmartClimateControlService.SetTemperatureResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetTemperatureDoMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setHumidityDo(ds.SmartClimateControlService.SetHumidityRequest request,
        io.grpc.stub.StreamObserver<ds.SmartClimateControlService.SetHumidityResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetHumidityDoMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SmartClimateControlServiceBlockingStub extends io.grpc.stub.AbstractStub<SmartClimateControlServiceBlockingStub> {
    private SmartClimateControlServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmartClimateControlServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartClimateControlServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmartClimateControlServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ds.SmartClimateControlService.GetClimateReadingResponse getClimateReadingDo(ds.SmartClimateControlService.GetClimateReadingRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetClimateReadingDoMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public ds.SmartClimateControlService.SetTemperatureResponse setTemperatureDo(ds.SmartClimateControlService.SetTemperatureRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetTemperatureDoMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public ds.SmartClimateControlService.SetHumidityResponse setHumidityDo(ds.SmartClimateControlService.SetHumidityRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetHumidityDoMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SmartClimateControlServiceFutureStub extends io.grpc.stub.AbstractStub<SmartClimateControlServiceFutureStub> {
    private SmartClimateControlServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmartClimateControlServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartClimateControlServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmartClimateControlServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ds.SmartClimateControlService.GetClimateReadingResponse> getClimateReadingDo(
        ds.SmartClimateControlService.GetClimateReadingRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetClimateReadingDoMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ds.SmartClimateControlService.SetTemperatureResponse> setTemperatureDo(
        ds.SmartClimateControlService.SetTemperatureRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetTemperatureDoMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ds.SmartClimateControlService.SetHumidityResponse> setHumidityDo(
        ds.SmartClimateControlService.SetHumidityRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetHumidityDoMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CLIMATE_READING_DO = 0;
  private static final int METHODID_SET_TEMPERATURE_DO = 1;
  private static final int METHODID_SET_HUMIDITY_DO = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SmartClimateControlServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SmartClimateControlServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CLIMATE_READING_DO:
          serviceImpl.getClimateReadingDo((ds.SmartClimateControlService.GetClimateReadingRequest) request,
              (io.grpc.stub.StreamObserver<ds.SmartClimateControlService.GetClimateReadingResponse>) responseObserver);
          break;
        case METHODID_SET_TEMPERATURE_DO:
          serviceImpl.setTemperatureDo((ds.SmartClimateControlService.SetTemperatureRequest) request,
              (io.grpc.stub.StreamObserver<ds.SmartClimateControlService.SetTemperatureResponse>) responseObserver);
          break;
        case METHODID_SET_HUMIDITY_DO:
          serviceImpl.setHumidityDo((ds.SmartClimateControlService.SetHumidityRequest) request,
              (io.grpc.stub.StreamObserver<ds.SmartClimateControlService.SetHumidityResponse>) responseObserver);
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

  private static abstract class SmartClimateControlServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SmartClimateControlServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ds.SmartClimateControlService.SmartClimateControlServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SmartClimateControlService");
    }
  }

  private static final class SmartClimateControlServiceFileDescriptorSupplier
      extends SmartClimateControlServiceBaseDescriptorSupplier {
    SmartClimateControlServiceFileDescriptorSupplier() {}
  }

  private static final class SmartClimateControlServiceMethodDescriptorSupplier
      extends SmartClimateControlServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SmartClimateControlServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SmartClimateControlServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SmartClimateControlServiceFileDescriptorSupplier())
              .addMethod(getGetClimateReadingDoMethodHelper())
              .addMethod(getSetTemperatureDoMethodHelper())
              .addMethod(getSetHumidityDoMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
