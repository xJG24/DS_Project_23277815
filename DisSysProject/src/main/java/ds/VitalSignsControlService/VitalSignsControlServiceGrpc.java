package ds.VitalSignsControlService;

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
    comments = "Source: VitalSignsControl.proto")
public final class VitalSignsControlServiceGrpc {

  private VitalSignsControlServiceGrpc() {}

  public static final String SERVICE_NAME = "ds.VitalSignsControlService.VitalSignsControlService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetVitalSignsLatestDoMethod()} instead. 
  public static final io.grpc.MethodDescriptor<ds.VitalSignsControlService.GetVitalSignsRequest,
      ds.VitalSignsControlService.GetVitalSignsLatestResponse> METHOD_GET_VITAL_SIGNS_LATEST_DO = getGetVitalSignsLatestDoMethodHelper();

  private static volatile io.grpc.MethodDescriptor<ds.VitalSignsControlService.GetVitalSignsRequest,
      ds.VitalSignsControlService.GetVitalSignsLatestResponse> getGetVitalSignsLatestDoMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<ds.VitalSignsControlService.GetVitalSignsRequest,
      ds.VitalSignsControlService.GetVitalSignsLatestResponse> getGetVitalSignsLatestDoMethod() {
    return getGetVitalSignsLatestDoMethodHelper();
  }

  private static io.grpc.MethodDescriptor<ds.VitalSignsControlService.GetVitalSignsRequest,
      ds.VitalSignsControlService.GetVitalSignsLatestResponse> getGetVitalSignsLatestDoMethodHelper() {
    io.grpc.MethodDescriptor<ds.VitalSignsControlService.GetVitalSignsRequest, ds.VitalSignsControlService.GetVitalSignsLatestResponse> getGetVitalSignsLatestDoMethod;
    if ((getGetVitalSignsLatestDoMethod = VitalSignsControlServiceGrpc.getGetVitalSignsLatestDoMethod) == null) {
      synchronized (VitalSignsControlServiceGrpc.class) {
        if ((getGetVitalSignsLatestDoMethod = VitalSignsControlServiceGrpc.getGetVitalSignsLatestDoMethod) == null) {
          VitalSignsControlServiceGrpc.getGetVitalSignsLatestDoMethod = getGetVitalSignsLatestDoMethod = 
              io.grpc.MethodDescriptor.<ds.VitalSignsControlService.GetVitalSignsRequest, ds.VitalSignsControlService.GetVitalSignsLatestResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ds.VitalSignsControlService.VitalSignsControlService", "GetVitalSignsLatest_do"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.VitalSignsControlService.GetVitalSignsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.VitalSignsControlService.GetVitalSignsLatestResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new VitalSignsControlServiceMethodDescriptorSupplier("GetVitalSignsLatest_do"))
                  .build();
          }
        }
     }
     return getGetVitalSignsLatestDoMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetVitalSignsHistoryDoMethod()} instead. 
  public static final io.grpc.MethodDescriptor<ds.VitalSignsControlService.GetVitalSignsRequest,
      ds.VitalSignsControlService.GetVitalSignsHistoryResponse> METHOD_GET_VITAL_SIGNS_HISTORY_DO = getGetVitalSignsHistoryDoMethodHelper();

  private static volatile io.grpc.MethodDescriptor<ds.VitalSignsControlService.GetVitalSignsRequest,
      ds.VitalSignsControlService.GetVitalSignsHistoryResponse> getGetVitalSignsHistoryDoMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<ds.VitalSignsControlService.GetVitalSignsRequest,
      ds.VitalSignsControlService.GetVitalSignsHistoryResponse> getGetVitalSignsHistoryDoMethod() {
    return getGetVitalSignsHistoryDoMethodHelper();
  }

  private static io.grpc.MethodDescriptor<ds.VitalSignsControlService.GetVitalSignsRequest,
      ds.VitalSignsControlService.GetVitalSignsHistoryResponse> getGetVitalSignsHistoryDoMethodHelper() {
    io.grpc.MethodDescriptor<ds.VitalSignsControlService.GetVitalSignsRequest, ds.VitalSignsControlService.GetVitalSignsHistoryResponse> getGetVitalSignsHistoryDoMethod;
    if ((getGetVitalSignsHistoryDoMethod = VitalSignsControlServiceGrpc.getGetVitalSignsHistoryDoMethod) == null) {
      synchronized (VitalSignsControlServiceGrpc.class) {
        if ((getGetVitalSignsHistoryDoMethod = VitalSignsControlServiceGrpc.getGetVitalSignsHistoryDoMethod) == null) {
          VitalSignsControlServiceGrpc.getGetVitalSignsHistoryDoMethod = getGetVitalSignsHistoryDoMethod = 
              io.grpc.MethodDescriptor.<ds.VitalSignsControlService.GetVitalSignsRequest, ds.VitalSignsControlService.GetVitalSignsHistoryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "ds.VitalSignsControlService.VitalSignsControlService", "GetVitalSignsHistory_do"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.VitalSignsControlService.GetVitalSignsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.VitalSignsControlService.GetVitalSignsHistoryResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new VitalSignsControlServiceMethodDescriptorSupplier("GetVitalSignsHistory_do"))
                  .build();
          }
        }
     }
     return getGetVitalSignsHistoryDoMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSetVitalSignsDoMethod()} instead. 
  public static final io.grpc.MethodDescriptor<ds.VitalSignsControlService.SetVitalSignsRequest,
      ds.VitalSignsControlService.SetVitalSignsResponse> METHOD_SET_VITAL_SIGNS_DO = getSetVitalSignsDoMethodHelper();

  private static volatile io.grpc.MethodDescriptor<ds.VitalSignsControlService.SetVitalSignsRequest,
      ds.VitalSignsControlService.SetVitalSignsResponse> getSetVitalSignsDoMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<ds.VitalSignsControlService.SetVitalSignsRequest,
      ds.VitalSignsControlService.SetVitalSignsResponse> getSetVitalSignsDoMethod() {
    return getSetVitalSignsDoMethodHelper();
  }

  private static io.grpc.MethodDescriptor<ds.VitalSignsControlService.SetVitalSignsRequest,
      ds.VitalSignsControlService.SetVitalSignsResponse> getSetVitalSignsDoMethodHelper() {
    io.grpc.MethodDescriptor<ds.VitalSignsControlService.SetVitalSignsRequest, ds.VitalSignsControlService.SetVitalSignsResponse> getSetVitalSignsDoMethod;
    if ((getSetVitalSignsDoMethod = VitalSignsControlServiceGrpc.getSetVitalSignsDoMethod) == null) {
      synchronized (VitalSignsControlServiceGrpc.class) {
        if ((getSetVitalSignsDoMethod = VitalSignsControlServiceGrpc.getSetVitalSignsDoMethod) == null) {
          VitalSignsControlServiceGrpc.getSetVitalSignsDoMethod = getSetVitalSignsDoMethod = 
              io.grpc.MethodDescriptor.<ds.VitalSignsControlService.SetVitalSignsRequest, ds.VitalSignsControlService.SetVitalSignsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ds.VitalSignsControlService.VitalSignsControlService", "SetVitalSigns_do"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.VitalSignsControlService.SetVitalSignsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.VitalSignsControlService.SetVitalSignsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new VitalSignsControlServiceMethodDescriptorSupplier("SetVitalSigns_do"))
                  .build();
          }
        }
     }
     return getSetVitalSignsDoMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getMonitorVitalSignsReadingMethod()} instead. 
  public static final io.grpc.MethodDescriptor<ds.VitalSignsControlService.VitalSignsMonitorRequest,
      ds.VitalSignsControlService.VitalSignsMonitorResponse> METHOD_MONITOR_VITAL_SIGNS_READING = getMonitorVitalSignsReadingMethodHelper();

  private static volatile io.grpc.MethodDescriptor<ds.VitalSignsControlService.VitalSignsMonitorRequest,
      ds.VitalSignsControlService.VitalSignsMonitorResponse> getMonitorVitalSignsReadingMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<ds.VitalSignsControlService.VitalSignsMonitorRequest,
      ds.VitalSignsControlService.VitalSignsMonitorResponse> getMonitorVitalSignsReadingMethod() {
    return getMonitorVitalSignsReadingMethodHelper();
  }

  private static io.grpc.MethodDescriptor<ds.VitalSignsControlService.VitalSignsMonitorRequest,
      ds.VitalSignsControlService.VitalSignsMonitorResponse> getMonitorVitalSignsReadingMethodHelper() {
    io.grpc.MethodDescriptor<ds.VitalSignsControlService.VitalSignsMonitorRequest, ds.VitalSignsControlService.VitalSignsMonitorResponse> getMonitorVitalSignsReadingMethod;
    if ((getMonitorVitalSignsReadingMethod = VitalSignsControlServiceGrpc.getMonitorVitalSignsReadingMethod) == null) {
      synchronized (VitalSignsControlServiceGrpc.class) {
        if ((getMonitorVitalSignsReadingMethod = VitalSignsControlServiceGrpc.getMonitorVitalSignsReadingMethod) == null) {
          VitalSignsControlServiceGrpc.getMonitorVitalSignsReadingMethod = getMonitorVitalSignsReadingMethod = 
              io.grpc.MethodDescriptor.<ds.VitalSignsControlService.VitalSignsMonitorRequest, ds.VitalSignsControlService.VitalSignsMonitorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "ds.VitalSignsControlService.VitalSignsControlService", "MonitorVitalSignsReading"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.VitalSignsControlService.VitalSignsMonitorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.VitalSignsControlService.VitalSignsMonitorResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new VitalSignsControlServiceMethodDescriptorSupplier("MonitorVitalSignsReading"))
                  .build();
          }
        }
     }
     return getMonitorVitalSignsReadingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static VitalSignsControlServiceStub newStub(io.grpc.Channel channel) {
    return new VitalSignsControlServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static VitalSignsControlServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new VitalSignsControlServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static VitalSignsControlServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new VitalSignsControlServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class VitalSignsControlServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getVitalSignsLatestDo(ds.VitalSignsControlService.GetVitalSignsRequest request,
        io.grpc.stub.StreamObserver<ds.VitalSignsControlService.GetVitalSignsLatestResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetVitalSignsLatestDoMethodHelper(), responseObserver);
    }

    /**
     */
    public void getVitalSignsHistoryDo(ds.VitalSignsControlService.GetVitalSignsRequest request,
        io.grpc.stub.StreamObserver<ds.VitalSignsControlService.GetVitalSignsHistoryResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetVitalSignsHistoryDoMethodHelper(), responseObserver);
    }

    /**
     */
    public void setVitalSignsDo(ds.VitalSignsControlService.SetVitalSignsRequest request,
        io.grpc.stub.StreamObserver<ds.VitalSignsControlService.SetVitalSignsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetVitalSignsDoMethodHelper(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ds.VitalSignsControlService.VitalSignsMonitorRequest> monitorVitalSignsReading(
        io.grpc.stub.StreamObserver<ds.VitalSignsControlService.VitalSignsMonitorResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getMonitorVitalSignsReadingMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetVitalSignsLatestDoMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                ds.VitalSignsControlService.GetVitalSignsRequest,
                ds.VitalSignsControlService.GetVitalSignsLatestResponse>(
                  this, METHODID_GET_VITAL_SIGNS_LATEST_DO)))
          .addMethod(
            getGetVitalSignsHistoryDoMethodHelper(),
            asyncServerStreamingCall(
              new MethodHandlers<
                ds.VitalSignsControlService.GetVitalSignsRequest,
                ds.VitalSignsControlService.GetVitalSignsHistoryResponse>(
                  this, METHODID_GET_VITAL_SIGNS_HISTORY_DO)))
          .addMethod(
            getSetVitalSignsDoMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                ds.VitalSignsControlService.SetVitalSignsRequest,
                ds.VitalSignsControlService.SetVitalSignsResponse>(
                  this, METHODID_SET_VITAL_SIGNS_DO)))
          .addMethod(
            getMonitorVitalSignsReadingMethodHelper(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                ds.VitalSignsControlService.VitalSignsMonitorRequest,
                ds.VitalSignsControlService.VitalSignsMonitorResponse>(
                  this, METHODID_MONITOR_VITAL_SIGNS_READING)))
          .build();
    }
  }

  /**
   */
  public static final class VitalSignsControlServiceStub extends io.grpc.stub.AbstractStub<VitalSignsControlServiceStub> {
    private VitalSignsControlServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VitalSignsControlServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VitalSignsControlServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VitalSignsControlServiceStub(channel, callOptions);
    }

    /**
     */
    public void getVitalSignsLatestDo(ds.VitalSignsControlService.GetVitalSignsRequest request,
        io.grpc.stub.StreamObserver<ds.VitalSignsControlService.GetVitalSignsLatestResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetVitalSignsLatestDoMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getVitalSignsHistoryDo(ds.VitalSignsControlService.GetVitalSignsRequest request,
        io.grpc.stub.StreamObserver<ds.VitalSignsControlService.GetVitalSignsHistoryResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetVitalSignsHistoryDoMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setVitalSignsDo(ds.VitalSignsControlService.SetVitalSignsRequest request,
        io.grpc.stub.StreamObserver<ds.VitalSignsControlService.SetVitalSignsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetVitalSignsDoMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ds.VitalSignsControlService.VitalSignsMonitorRequest> monitorVitalSignsReading(
        io.grpc.stub.StreamObserver<ds.VitalSignsControlService.VitalSignsMonitorResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getMonitorVitalSignsReadingMethodHelper(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class VitalSignsControlServiceBlockingStub extends io.grpc.stub.AbstractStub<VitalSignsControlServiceBlockingStub> {
    private VitalSignsControlServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VitalSignsControlServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VitalSignsControlServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VitalSignsControlServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ds.VitalSignsControlService.GetVitalSignsLatestResponse getVitalSignsLatestDo(ds.VitalSignsControlService.GetVitalSignsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetVitalSignsLatestDoMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<ds.VitalSignsControlService.GetVitalSignsHistoryResponse> getVitalSignsHistoryDo(
        ds.VitalSignsControlService.GetVitalSignsRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetVitalSignsHistoryDoMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public ds.VitalSignsControlService.SetVitalSignsResponse setVitalSignsDo(ds.VitalSignsControlService.SetVitalSignsRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetVitalSignsDoMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class VitalSignsControlServiceFutureStub extends io.grpc.stub.AbstractStub<VitalSignsControlServiceFutureStub> {
    private VitalSignsControlServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VitalSignsControlServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VitalSignsControlServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VitalSignsControlServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ds.VitalSignsControlService.GetVitalSignsLatestResponse> getVitalSignsLatestDo(
        ds.VitalSignsControlService.GetVitalSignsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetVitalSignsLatestDoMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ds.VitalSignsControlService.SetVitalSignsResponse> setVitalSignsDo(
        ds.VitalSignsControlService.SetVitalSignsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetVitalSignsDoMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_VITAL_SIGNS_LATEST_DO = 0;
  private static final int METHODID_GET_VITAL_SIGNS_HISTORY_DO = 1;
  private static final int METHODID_SET_VITAL_SIGNS_DO = 2;
  private static final int METHODID_MONITOR_VITAL_SIGNS_READING = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final VitalSignsControlServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(VitalSignsControlServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_VITAL_SIGNS_LATEST_DO:
          serviceImpl.getVitalSignsLatestDo((ds.VitalSignsControlService.GetVitalSignsRequest) request,
              (io.grpc.stub.StreamObserver<ds.VitalSignsControlService.GetVitalSignsLatestResponse>) responseObserver);
          break;
        case METHODID_GET_VITAL_SIGNS_HISTORY_DO:
          serviceImpl.getVitalSignsHistoryDo((ds.VitalSignsControlService.GetVitalSignsRequest) request,
              (io.grpc.stub.StreamObserver<ds.VitalSignsControlService.GetVitalSignsHistoryResponse>) responseObserver);
          break;
        case METHODID_SET_VITAL_SIGNS_DO:
          serviceImpl.setVitalSignsDo((ds.VitalSignsControlService.SetVitalSignsRequest) request,
              (io.grpc.stub.StreamObserver<ds.VitalSignsControlService.SetVitalSignsResponse>) responseObserver);
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
        case METHODID_MONITOR_VITAL_SIGNS_READING:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.monitorVitalSignsReading(
              (io.grpc.stub.StreamObserver<ds.VitalSignsControlService.VitalSignsMonitorResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class VitalSignsControlServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    VitalSignsControlServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ds.VitalSignsControlService.VitalSignControlServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("VitalSignsControlService");
    }
  }

  private static final class VitalSignsControlServiceFileDescriptorSupplier
      extends VitalSignsControlServiceBaseDescriptorSupplier {
    VitalSignsControlServiceFileDescriptorSupplier() {}
  }

  private static final class VitalSignsControlServiceMethodDescriptorSupplier
      extends VitalSignsControlServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    VitalSignsControlServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (VitalSignsControlServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new VitalSignsControlServiceFileDescriptorSupplier())
              .addMethod(getGetVitalSignsLatestDoMethodHelper())
              .addMethod(getGetVitalSignsHistoryDoMethodHelper())
              .addMethod(getSetVitalSignsDoMethodHelper())
              .addMethod(getMonitorVitalSignsReadingMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
