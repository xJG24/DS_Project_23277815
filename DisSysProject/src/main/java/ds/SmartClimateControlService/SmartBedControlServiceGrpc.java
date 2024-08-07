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
public final class SmartBedControlServiceGrpc {

  private SmartBedControlServiceGrpc() {}

  public static final String SERVICE_NAME = "SmartBedControlService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetClimateReadingMethod()} instead. 
  public static final io.grpc.MethodDescriptor<ds.SmartClimateControlService.GetClimateRequest,
      ds.SmartClimateControlService.GetClimateReadingResponse> METHOD_GET_CLIMATE_READING = getGetClimateReadingMethodHelper();

  private static volatile io.grpc.MethodDescriptor<ds.SmartClimateControlService.GetClimateRequest,
      ds.SmartClimateControlService.GetClimateReadingResponse> getGetClimateReadingMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<ds.SmartClimateControlService.GetClimateRequest,
      ds.SmartClimateControlService.GetClimateReadingResponse> getGetClimateReadingMethod() {
    return getGetClimateReadingMethodHelper();
  }

  private static io.grpc.MethodDescriptor<ds.SmartClimateControlService.GetClimateRequest,
      ds.SmartClimateControlService.GetClimateReadingResponse> getGetClimateReadingMethodHelper() {
    io.grpc.MethodDescriptor<ds.SmartClimateControlService.GetClimateRequest, ds.SmartClimateControlService.GetClimateReadingResponse> getGetClimateReadingMethod;
    if ((getGetClimateReadingMethod = SmartBedControlServiceGrpc.getGetClimateReadingMethod) == null) {
      synchronized (SmartBedControlServiceGrpc.class) {
        if ((getGetClimateReadingMethod = SmartBedControlServiceGrpc.getGetClimateReadingMethod) == null) {
          SmartBedControlServiceGrpc.getGetClimateReadingMethod = getGetClimateReadingMethod = 
              io.grpc.MethodDescriptor.<ds.SmartClimateControlService.GetClimateRequest, ds.SmartClimateControlService.GetClimateReadingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartBedControlService", "GetClimateReading"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.SmartClimateControlService.GetClimateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.SmartClimateControlService.GetClimateReadingResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartBedControlServiceMethodDescriptorSupplier("GetClimateReading"))
                  .build();
          }
        }
     }
     return getGetClimateReadingMethod;
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
    if ((getSetTemperatureDoMethod = SmartBedControlServiceGrpc.getSetTemperatureDoMethod) == null) {
      synchronized (SmartBedControlServiceGrpc.class) {
        if ((getSetTemperatureDoMethod = SmartBedControlServiceGrpc.getSetTemperatureDoMethod) == null) {
          SmartBedControlServiceGrpc.getSetTemperatureDoMethod = getSetTemperatureDoMethod = 
              io.grpc.MethodDescriptor.<ds.SmartClimateControlService.SetTemperatureRequest, ds.SmartClimateControlService.SetTemperatureResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartBedControlService", "SetTemperature_do"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.SmartClimateControlService.SetTemperatureRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.SmartClimateControlService.SetTemperatureResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartBedControlServiceMethodDescriptorSupplier("SetTemperature_do"))
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
    if ((getSetHumidityDoMethod = SmartBedControlServiceGrpc.getSetHumidityDoMethod) == null) {
      synchronized (SmartBedControlServiceGrpc.class) {
        if ((getSetHumidityDoMethod = SmartBedControlServiceGrpc.getSetHumidityDoMethod) == null) {
          SmartBedControlServiceGrpc.getSetHumidityDoMethod = getSetHumidityDoMethod = 
              io.grpc.MethodDescriptor.<ds.SmartClimateControlService.SetHumidityRequest, ds.SmartClimateControlService.SetHumidityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartBedControlService", "SetHumidity_do"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.SmartClimateControlService.SetHumidityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.SmartClimateControlService.SetHumidityResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartBedControlServiceMethodDescriptorSupplier("SetHumidity_do"))
                  .build();
          }
        }
     }
     return getSetHumidityDoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SmartBedControlServiceStub newStub(io.grpc.Channel channel) {
    return new SmartBedControlServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SmartBedControlServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SmartBedControlServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SmartBedControlServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SmartBedControlServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class SmartBedControlServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getClimateReading(ds.SmartClimateControlService.GetClimateRequest request,
        io.grpc.stub.StreamObserver<ds.SmartClimateControlService.GetClimateReadingResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetClimateReadingMethodHelper(), responseObserver);
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
            getGetClimateReadingMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                ds.SmartClimateControlService.GetClimateRequest,
                ds.SmartClimateControlService.GetClimateReadingResponse>(
                  this, METHODID_GET_CLIMATE_READING)))
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
  public static final class SmartBedControlServiceStub extends io.grpc.stub.AbstractStub<SmartBedControlServiceStub> {
    private SmartBedControlServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmartBedControlServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartBedControlServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmartBedControlServiceStub(channel, callOptions);
    }

    /**
     */
    public void getClimateReading(ds.SmartClimateControlService.GetClimateRequest request,
        io.grpc.stub.StreamObserver<ds.SmartClimateControlService.GetClimateReadingResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetClimateReadingMethodHelper(), getCallOptions()), request, responseObserver);
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
  public static final class SmartBedControlServiceBlockingStub extends io.grpc.stub.AbstractStub<SmartBedControlServiceBlockingStub> {
    private SmartBedControlServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmartBedControlServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartBedControlServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmartBedControlServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ds.SmartClimateControlService.GetClimateReadingResponse getClimateReading(ds.SmartClimateControlService.GetClimateRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetClimateReadingMethodHelper(), getCallOptions(), request);
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
  public static final class SmartBedControlServiceFutureStub extends io.grpc.stub.AbstractStub<SmartBedControlServiceFutureStub> {
    private SmartBedControlServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmartBedControlServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartBedControlServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmartBedControlServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ds.SmartClimateControlService.GetClimateReadingResponse> getClimateReading(
        ds.SmartClimateControlService.GetClimateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetClimateReadingMethodHelper(), getCallOptions()), request);
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

  private static final int METHODID_GET_CLIMATE_READING = 0;
  private static final int METHODID_SET_TEMPERATURE_DO = 1;
  private static final int METHODID_SET_HUMIDITY_DO = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SmartBedControlServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SmartBedControlServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CLIMATE_READING:
          serviceImpl.getClimateReading((ds.SmartClimateControlService.GetClimateRequest) request,
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

  private static abstract class SmartBedControlServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SmartBedControlServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ds.SmartClimateControlService.SmartClimateControlServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SmartBedControlService");
    }
  }

  private static final class SmartBedControlServiceFileDescriptorSupplier
      extends SmartBedControlServiceBaseDescriptorSupplier {
    SmartBedControlServiceFileDescriptorSupplier() {}
  }

  private static final class SmartBedControlServiceMethodDescriptorSupplier
      extends SmartBedControlServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SmartBedControlServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SmartBedControlServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SmartBedControlServiceFileDescriptorSupplier())
              .addMethod(getGetClimateReadingMethodHelper())
              .addMethod(getSetTemperatureDoMethodHelper())
              .addMethod(getSetHumidityDoMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
