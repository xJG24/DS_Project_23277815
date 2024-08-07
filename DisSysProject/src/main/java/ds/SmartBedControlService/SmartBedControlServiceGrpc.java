package ds.SmartBedControlService;

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
    comments = "Source: SmartBedControl.proto")
public final class SmartBedControlServiceGrpc {

  private SmartBedControlServiceGrpc() {}

  public static final String SERVICE_NAME = "ds.SmartBedControlService.SmartBedControlService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetBedPositionDoMethod()} instead. 
  public static final io.grpc.MethodDescriptor<ds.SmartBedControlService.Empty,
      ds.SmartBedControlService.GetBedPositionResponse> METHOD_GET_BED_POSITION_DO = getGetBedPositionDoMethodHelper();

  private static volatile io.grpc.MethodDescriptor<ds.SmartBedControlService.Empty,
      ds.SmartBedControlService.GetBedPositionResponse> getGetBedPositionDoMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<ds.SmartBedControlService.Empty,
      ds.SmartBedControlService.GetBedPositionResponse> getGetBedPositionDoMethod() {
    return getGetBedPositionDoMethodHelper();
  }

  private static io.grpc.MethodDescriptor<ds.SmartBedControlService.Empty,
      ds.SmartBedControlService.GetBedPositionResponse> getGetBedPositionDoMethodHelper() {
    io.grpc.MethodDescriptor<ds.SmartBedControlService.Empty, ds.SmartBedControlService.GetBedPositionResponse> getGetBedPositionDoMethod;
    if ((getGetBedPositionDoMethod = SmartBedControlServiceGrpc.getGetBedPositionDoMethod) == null) {
      synchronized (SmartBedControlServiceGrpc.class) {
        if ((getGetBedPositionDoMethod = SmartBedControlServiceGrpc.getGetBedPositionDoMethod) == null) {
          SmartBedControlServiceGrpc.getGetBedPositionDoMethod = getGetBedPositionDoMethod = 
              io.grpc.MethodDescriptor.<ds.SmartBedControlService.Empty, ds.SmartBedControlService.GetBedPositionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ds.SmartBedControlService.SmartBedControlService", "GetBedPosition_do"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.SmartBedControlService.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.SmartBedControlService.GetBedPositionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartBedControlServiceMethodDescriptorSupplier("GetBedPosition_do"))
                  .build();
          }
        }
     }
     return getGetBedPositionDoMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSetBedHeadPositionDoMethod()} instead. 
  public static final io.grpc.MethodDescriptor<ds.SmartBedControlService.SetBedHeadPositionRequest,
      ds.SmartBedControlService.SetBedHeadPositionResponse> METHOD_SET_BED_HEAD_POSITION_DO = getSetBedHeadPositionDoMethodHelper();

  private static volatile io.grpc.MethodDescriptor<ds.SmartBedControlService.SetBedHeadPositionRequest,
      ds.SmartBedControlService.SetBedHeadPositionResponse> getSetBedHeadPositionDoMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<ds.SmartBedControlService.SetBedHeadPositionRequest,
      ds.SmartBedControlService.SetBedHeadPositionResponse> getSetBedHeadPositionDoMethod() {
    return getSetBedHeadPositionDoMethodHelper();
  }

  private static io.grpc.MethodDescriptor<ds.SmartBedControlService.SetBedHeadPositionRequest,
      ds.SmartBedControlService.SetBedHeadPositionResponse> getSetBedHeadPositionDoMethodHelper() {
    io.grpc.MethodDescriptor<ds.SmartBedControlService.SetBedHeadPositionRequest, ds.SmartBedControlService.SetBedHeadPositionResponse> getSetBedHeadPositionDoMethod;
    if ((getSetBedHeadPositionDoMethod = SmartBedControlServiceGrpc.getSetBedHeadPositionDoMethod) == null) {
      synchronized (SmartBedControlServiceGrpc.class) {
        if ((getSetBedHeadPositionDoMethod = SmartBedControlServiceGrpc.getSetBedHeadPositionDoMethod) == null) {
          SmartBedControlServiceGrpc.getSetBedHeadPositionDoMethod = getSetBedHeadPositionDoMethod = 
              io.grpc.MethodDescriptor.<ds.SmartBedControlService.SetBedHeadPositionRequest, ds.SmartBedControlService.SetBedHeadPositionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ds.SmartBedControlService.SmartBedControlService", "SetBedHeadPosition_do"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.SmartBedControlService.SetBedHeadPositionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.SmartBedControlService.SetBedHeadPositionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartBedControlServiceMethodDescriptorSupplier("SetBedHeadPosition_do"))
                  .build();
          }
        }
     }
     return getSetBedHeadPositionDoMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSetBedFootPositionDoMethod()} instead. 
  public static final io.grpc.MethodDescriptor<ds.SmartBedControlService.SetBedFootPositionRequest,
      ds.SmartBedControlService.SetBedFootPositionResponse> METHOD_SET_BED_FOOT_POSITION_DO = getSetBedFootPositionDoMethodHelper();

  private static volatile io.grpc.MethodDescriptor<ds.SmartBedControlService.SetBedFootPositionRequest,
      ds.SmartBedControlService.SetBedFootPositionResponse> getSetBedFootPositionDoMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<ds.SmartBedControlService.SetBedFootPositionRequest,
      ds.SmartBedControlService.SetBedFootPositionResponse> getSetBedFootPositionDoMethod() {
    return getSetBedFootPositionDoMethodHelper();
  }

  private static io.grpc.MethodDescriptor<ds.SmartBedControlService.SetBedFootPositionRequest,
      ds.SmartBedControlService.SetBedFootPositionResponse> getSetBedFootPositionDoMethodHelper() {
    io.grpc.MethodDescriptor<ds.SmartBedControlService.SetBedFootPositionRequest, ds.SmartBedControlService.SetBedFootPositionResponse> getSetBedFootPositionDoMethod;
    if ((getSetBedFootPositionDoMethod = SmartBedControlServiceGrpc.getSetBedFootPositionDoMethod) == null) {
      synchronized (SmartBedControlServiceGrpc.class) {
        if ((getSetBedFootPositionDoMethod = SmartBedControlServiceGrpc.getSetBedFootPositionDoMethod) == null) {
          SmartBedControlServiceGrpc.getSetBedFootPositionDoMethod = getSetBedFootPositionDoMethod = 
              io.grpc.MethodDescriptor.<ds.SmartBedControlService.SetBedFootPositionRequest, ds.SmartBedControlService.SetBedFootPositionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ds.SmartBedControlService.SmartBedControlService", "SetBedFootPosition_do"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.SmartBedControlService.SetBedFootPositionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.SmartBedControlService.SetBedFootPositionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartBedControlServiceMethodDescriptorSupplier("SetBedFootPosition_do"))
                  .build();
          }
        }
     }
     return getSetBedFootPositionDoMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getResetBedPositionDoMethod()} instead. 
  public static final io.grpc.MethodDescriptor<ds.SmartBedControlService.Empty,
      ds.SmartBedControlService.ResetBedPositionResponse> METHOD_RESET_BED_POSITION_DO = getResetBedPositionDoMethodHelper();

  private static volatile io.grpc.MethodDescriptor<ds.SmartBedControlService.Empty,
      ds.SmartBedControlService.ResetBedPositionResponse> getResetBedPositionDoMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<ds.SmartBedControlService.Empty,
      ds.SmartBedControlService.ResetBedPositionResponse> getResetBedPositionDoMethod() {
    return getResetBedPositionDoMethodHelper();
  }

  private static io.grpc.MethodDescriptor<ds.SmartBedControlService.Empty,
      ds.SmartBedControlService.ResetBedPositionResponse> getResetBedPositionDoMethodHelper() {
    io.grpc.MethodDescriptor<ds.SmartBedControlService.Empty, ds.SmartBedControlService.ResetBedPositionResponse> getResetBedPositionDoMethod;
    if ((getResetBedPositionDoMethod = SmartBedControlServiceGrpc.getResetBedPositionDoMethod) == null) {
      synchronized (SmartBedControlServiceGrpc.class) {
        if ((getResetBedPositionDoMethod = SmartBedControlServiceGrpc.getResetBedPositionDoMethod) == null) {
          SmartBedControlServiceGrpc.getResetBedPositionDoMethod = getResetBedPositionDoMethod = 
              io.grpc.MethodDescriptor.<ds.SmartBedControlService.Empty, ds.SmartBedControlService.ResetBedPositionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ds.SmartBedControlService.SmartBedControlService", "ResetBedPosition_do"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.SmartBedControlService.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.SmartBedControlService.ResetBedPositionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartBedControlServiceMethodDescriptorSupplier("ResetBedPosition_do"))
                  .build();
          }
        }
     }
     return getResetBedPositionDoMethod;
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
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class SmartBedControlServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getBedPositionDo(ds.SmartBedControlService.Empty request,
        io.grpc.stub.StreamObserver<ds.SmartBedControlService.GetBedPositionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBedPositionDoMethodHelper(), responseObserver);
    }

    /**
     */
    public void setBedHeadPositionDo(ds.SmartBedControlService.SetBedHeadPositionRequest request,
        io.grpc.stub.StreamObserver<ds.SmartBedControlService.SetBedHeadPositionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetBedHeadPositionDoMethodHelper(), responseObserver);
    }

    /**
     */
    public void setBedFootPositionDo(ds.SmartBedControlService.SetBedFootPositionRequest request,
        io.grpc.stub.StreamObserver<ds.SmartBedControlService.SetBedFootPositionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetBedFootPositionDoMethodHelper(), responseObserver);
    }

    /**
     */
    public void resetBedPositionDo(ds.SmartBedControlService.Empty request,
        io.grpc.stub.StreamObserver<ds.SmartBedControlService.ResetBedPositionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getResetBedPositionDoMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetBedPositionDoMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                ds.SmartBedControlService.Empty,
                ds.SmartBedControlService.GetBedPositionResponse>(
                  this, METHODID_GET_BED_POSITION_DO)))
          .addMethod(
            getSetBedHeadPositionDoMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                ds.SmartBedControlService.SetBedHeadPositionRequest,
                ds.SmartBedControlService.SetBedHeadPositionResponse>(
                  this, METHODID_SET_BED_HEAD_POSITION_DO)))
          .addMethod(
            getSetBedFootPositionDoMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                ds.SmartBedControlService.SetBedFootPositionRequest,
                ds.SmartBedControlService.SetBedFootPositionResponse>(
                  this, METHODID_SET_BED_FOOT_POSITION_DO)))
          .addMethod(
            getResetBedPositionDoMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                ds.SmartBedControlService.Empty,
                ds.SmartBedControlService.ResetBedPositionResponse>(
                  this, METHODID_RESET_BED_POSITION_DO)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
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
    public void getBedPositionDo(ds.SmartBedControlService.Empty request,
        io.grpc.stub.StreamObserver<ds.SmartBedControlService.GetBedPositionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBedPositionDoMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setBedHeadPositionDo(ds.SmartBedControlService.SetBedHeadPositionRequest request,
        io.grpc.stub.StreamObserver<ds.SmartBedControlService.SetBedHeadPositionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetBedHeadPositionDoMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setBedFootPositionDo(ds.SmartBedControlService.SetBedFootPositionRequest request,
        io.grpc.stub.StreamObserver<ds.SmartBedControlService.SetBedFootPositionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetBedFootPositionDoMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void resetBedPositionDo(ds.SmartBedControlService.Empty request,
        io.grpc.stub.StreamObserver<ds.SmartBedControlService.ResetBedPositionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getResetBedPositionDoMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
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
    public ds.SmartBedControlService.GetBedPositionResponse getBedPositionDo(ds.SmartBedControlService.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetBedPositionDoMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public ds.SmartBedControlService.SetBedHeadPositionResponse setBedHeadPositionDo(ds.SmartBedControlService.SetBedHeadPositionRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetBedHeadPositionDoMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public ds.SmartBedControlService.SetBedFootPositionResponse setBedFootPositionDo(ds.SmartBedControlService.SetBedFootPositionRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetBedFootPositionDoMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public ds.SmartBedControlService.ResetBedPositionResponse resetBedPositionDo(ds.SmartBedControlService.Empty request) {
      return blockingUnaryCall(
          getChannel(), getResetBedPositionDoMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
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
    public com.google.common.util.concurrent.ListenableFuture<ds.SmartBedControlService.GetBedPositionResponse> getBedPositionDo(
        ds.SmartBedControlService.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBedPositionDoMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ds.SmartBedControlService.SetBedHeadPositionResponse> setBedHeadPositionDo(
        ds.SmartBedControlService.SetBedHeadPositionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetBedHeadPositionDoMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ds.SmartBedControlService.SetBedFootPositionResponse> setBedFootPositionDo(
        ds.SmartBedControlService.SetBedFootPositionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetBedFootPositionDoMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ds.SmartBedControlService.ResetBedPositionResponse> resetBedPositionDo(
        ds.SmartBedControlService.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getResetBedPositionDoMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_BED_POSITION_DO = 0;
  private static final int METHODID_SET_BED_HEAD_POSITION_DO = 1;
  private static final int METHODID_SET_BED_FOOT_POSITION_DO = 2;
  private static final int METHODID_RESET_BED_POSITION_DO = 3;

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
        case METHODID_GET_BED_POSITION_DO:
          serviceImpl.getBedPositionDo((ds.SmartBedControlService.Empty) request,
              (io.grpc.stub.StreamObserver<ds.SmartBedControlService.GetBedPositionResponse>) responseObserver);
          break;
        case METHODID_SET_BED_HEAD_POSITION_DO:
          serviceImpl.setBedHeadPositionDo((ds.SmartBedControlService.SetBedHeadPositionRequest) request,
              (io.grpc.stub.StreamObserver<ds.SmartBedControlService.SetBedHeadPositionResponse>) responseObserver);
          break;
        case METHODID_SET_BED_FOOT_POSITION_DO:
          serviceImpl.setBedFootPositionDo((ds.SmartBedControlService.SetBedFootPositionRequest) request,
              (io.grpc.stub.StreamObserver<ds.SmartBedControlService.SetBedFootPositionResponse>) responseObserver);
          break;
        case METHODID_RESET_BED_POSITION_DO:
          serviceImpl.resetBedPositionDo((ds.SmartBedControlService.Empty) request,
              (io.grpc.stub.StreamObserver<ds.SmartBedControlService.ResetBedPositionResponse>) responseObserver);
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
      return ds.SmartBedControlService.SmartBedControlServiceImpl.getDescriptor();
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
              .addMethod(getGetBedPositionDoMethodHelper())
              .addMethod(getSetBedHeadPositionDoMethodHelper())
              .addMethod(getSetBedFootPositionDoMethodHelper())
              .addMethod(getResetBedPositionDoMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
