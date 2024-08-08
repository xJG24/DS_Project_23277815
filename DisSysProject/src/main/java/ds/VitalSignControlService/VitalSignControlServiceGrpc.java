package ds.VitalSignControlService;

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
    comments = "Source: VitalSignsMonitor.proto")
public final class VitalSignControlServiceGrpc {

  private VitalSignControlServiceGrpc() {}

  public static final String SERVICE_NAME = "ds.VitalSignControlService.VitalSignControlService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetVitalSignsDoMethod()} instead. 
  public static final io.grpc.MethodDescriptor<ds.VitalSignControlService.GetVitalSignsRequest,
      ds.VitalSignControlService.GetVitalSignsResponse> METHOD_GET_VITAL_SIGNS_DO = getGetVitalSignsDoMethodHelper();

  private static volatile io.grpc.MethodDescriptor<ds.VitalSignControlService.GetVitalSignsRequest,
      ds.VitalSignControlService.GetVitalSignsResponse> getGetVitalSignsDoMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<ds.VitalSignControlService.GetVitalSignsRequest,
      ds.VitalSignControlService.GetVitalSignsResponse> getGetVitalSignsDoMethod() {
    return getGetVitalSignsDoMethodHelper();
  }

  private static io.grpc.MethodDescriptor<ds.VitalSignControlService.GetVitalSignsRequest,
      ds.VitalSignControlService.GetVitalSignsResponse> getGetVitalSignsDoMethodHelper() {
    io.grpc.MethodDescriptor<ds.VitalSignControlService.GetVitalSignsRequest, ds.VitalSignControlService.GetVitalSignsResponse> getGetVitalSignsDoMethod;
    if ((getGetVitalSignsDoMethod = VitalSignControlServiceGrpc.getGetVitalSignsDoMethod) == null) {
      synchronized (VitalSignControlServiceGrpc.class) {
        if ((getGetVitalSignsDoMethod = VitalSignControlServiceGrpc.getGetVitalSignsDoMethod) == null) {
          VitalSignControlServiceGrpc.getGetVitalSignsDoMethod = getGetVitalSignsDoMethod = 
              io.grpc.MethodDescriptor.<ds.VitalSignControlService.GetVitalSignsRequest, ds.VitalSignControlService.GetVitalSignsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ds.VitalSignControlService.VitalSignControlService", "GetVitalSigns_do"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.VitalSignControlService.GetVitalSignsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.VitalSignControlService.GetVitalSignsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new VitalSignControlServiceMethodDescriptorSupplier("GetVitalSigns_do"))
                  .build();
          }
        }
     }
     return getGetVitalSignsDoMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSetVitalSignsDoMethod()} instead. 
  public static final io.grpc.MethodDescriptor<ds.VitalSignControlService.SetVitalSignsRequest,
      ds.VitalSignControlService.SetVitalSignsResponse> METHOD_SET_VITAL_SIGNS_DO = getSetVitalSignsDoMethodHelper();

  private static volatile io.grpc.MethodDescriptor<ds.VitalSignControlService.SetVitalSignsRequest,
      ds.VitalSignControlService.SetVitalSignsResponse> getSetVitalSignsDoMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<ds.VitalSignControlService.SetVitalSignsRequest,
      ds.VitalSignControlService.SetVitalSignsResponse> getSetVitalSignsDoMethod() {
    return getSetVitalSignsDoMethodHelper();
  }

  private static io.grpc.MethodDescriptor<ds.VitalSignControlService.SetVitalSignsRequest,
      ds.VitalSignControlService.SetVitalSignsResponse> getSetVitalSignsDoMethodHelper() {
    io.grpc.MethodDescriptor<ds.VitalSignControlService.SetVitalSignsRequest, ds.VitalSignControlService.SetVitalSignsResponse> getSetVitalSignsDoMethod;
    if ((getSetVitalSignsDoMethod = VitalSignControlServiceGrpc.getSetVitalSignsDoMethod) == null) {
      synchronized (VitalSignControlServiceGrpc.class) {
        if ((getSetVitalSignsDoMethod = VitalSignControlServiceGrpc.getSetVitalSignsDoMethod) == null) {
          VitalSignControlServiceGrpc.getSetVitalSignsDoMethod = getSetVitalSignsDoMethod = 
              io.grpc.MethodDescriptor.<ds.VitalSignControlService.SetVitalSignsRequest, ds.VitalSignControlService.SetVitalSignsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "ds.VitalSignControlService.VitalSignControlService", "SetVitalSigns_do"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.VitalSignControlService.SetVitalSignsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.VitalSignControlService.SetVitalSignsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new VitalSignControlServiceMethodDescriptorSupplier("SetVitalSigns_do"))
                  .build();
          }
        }
     }
     return getSetVitalSignsDoMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getMonitorVitalSignsReadingMethod()} instead. 
  public static final io.grpc.MethodDescriptor<ds.VitalSignControlService.VitalSignsMonitorRequest,
      ds.VitalSignControlService.VitalSignsMonitorResponse> METHOD_MONITOR_VITAL_SIGNS_READING = getMonitorVitalSignsReadingMethodHelper();

  private static volatile io.grpc.MethodDescriptor<ds.VitalSignControlService.VitalSignsMonitorRequest,
      ds.VitalSignControlService.VitalSignsMonitorResponse> getMonitorVitalSignsReadingMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<ds.VitalSignControlService.VitalSignsMonitorRequest,
      ds.VitalSignControlService.VitalSignsMonitorResponse> getMonitorVitalSignsReadingMethod() {
    return getMonitorVitalSignsReadingMethodHelper();
  }

  private static io.grpc.MethodDescriptor<ds.VitalSignControlService.VitalSignsMonitorRequest,
      ds.VitalSignControlService.VitalSignsMonitorResponse> getMonitorVitalSignsReadingMethodHelper() {
    io.grpc.MethodDescriptor<ds.VitalSignControlService.VitalSignsMonitorRequest, ds.VitalSignControlService.VitalSignsMonitorResponse> getMonitorVitalSignsReadingMethod;
    if ((getMonitorVitalSignsReadingMethod = VitalSignControlServiceGrpc.getMonitorVitalSignsReadingMethod) == null) {
      synchronized (VitalSignControlServiceGrpc.class) {
        if ((getMonitorVitalSignsReadingMethod = VitalSignControlServiceGrpc.getMonitorVitalSignsReadingMethod) == null) {
          VitalSignControlServiceGrpc.getMonitorVitalSignsReadingMethod = getMonitorVitalSignsReadingMethod = 
              io.grpc.MethodDescriptor.<ds.VitalSignControlService.VitalSignsMonitorRequest, ds.VitalSignControlService.VitalSignsMonitorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "ds.VitalSignControlService.VitalSignControlService", "MonitorVitalSignsReading"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.VitalSignControlService.VitalSignsMonitorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.VitalSignControlService.VitalSignsMonitorResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new VitalSignControlServiceMethodDescriptorSupplier("MonitorVitalSignsReading"))
                  .build();
          }
        }
     }
     return getMonitorVitalSignsReadingMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getAlertStaffOfVitalSignsProblemMethod()} instead. 
  public static final io.grpc.MethodDescriptor<ds.VitalSignControlService.VitalSignsProblemRequest,
      ds.VitalSignControlService.VitalSignsProblemResponse> METHOD_ALERT_STAFF_OF_VITAL_SIGNS_PROBLEM = getAlertStaffOfVitalSignsProblemMethodHelper();

  private static volatile io.grpc.MethodDescriptor<ds.VitalSignControlService.VitalSignsProblemRequest,
      ds.VitalSignControlService.VitalSignsProblemResponse> getAlertStaffOfVitalSignsProblemMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<ds.VitalSignControlService.VitalSignsProblemRequest,
      ds.VitalSignControlService.VitalSignsProblemResponse> getAlertStaffOfVitalSignsProblemMethod() {
    return getAlertStaffOfVitalSignsProblemMethodHelper();
  }

  private static io.grpc.MethodDescriptor<ds.VitalSignControlService.VitalSignsProblemRequest,
      ds.VitalSignControlService.VitalSignsProblemResponse> getAlertStaffOfVitalSignsProblemMethodHelper() {
    io.grpc.MethodDescriptor<ds.VitalSignControlService.VitalSignsProblemRequest, ds.VitalSignControlService.VitalSignsProblemResponse> getAlertStaffOfVitalSignsProblemMethod;
    if ((getAlertStaffOfVitalSignsProblemMethod = VitalSignControlServiceGrpc.getAlertStaffOfVitalSignsProblemMethod) == null) {
      synchronized (VitalSignControlServiceGrpc.class) {
        if ((getAlertStaffOfVitalSignsProblemMethod = VitalSignControlServiceGrpc.getAlertStaffOfVitalSignsProblemMethod) == null) {
          VitalSignControlServiceGrpc.getAlertStaffOfVitalSignsProblemMethod = getAlertStaffOfVitalSignsProblemMethod = 
              io.grpc.MethodDescriptor.<ds.VitalSignControlService.VitalSignsProblemRequest, ds.VitalSignControlService.VitalSignsProblemResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ds.VitalSignControlService.VitalSignControlService", "AlertStaffOfVitalSignsProblem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.VitalSignControlService.VitalSignsProblemRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.VitalSignControlService.VitalSignsProblemResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new VitalSignControlServiceMethodDescriptorSupplier("AlertStaffOfVitalSignsProblem"))
                  .build();
          }
        }
     }
     return getAlertStaffOfVitalSignsProblemMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static VitalSignControlServiceStub newStub(io.grpc.Channel channel) {
    return new VitalSignControlServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static VitalSignControlServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new VitalSignControlServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static VitalSignControlServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new VitalSignControlServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class VitalSignControlServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getVitalSignsDo(ds.VitalSignControlService.GetVitalSignsRequest request,
        io.grpc.stub.StreamObserver<ds.VitalSignControlService.GetVitalSignsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetVitalSignsDoMethodHelper(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ds.VitalSignControlService.SetVitalSignsRequest> setVitalSignsDo(
        io.grpc.stub.StreamObserver<ds.VitalSignControlService.SetVitalSignsResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getSetVitalSignsDoMethodHelper(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ds.VitalSignControlService.VitalSignsMonitorRequest> monitorVitalSignsReading(
        io.grpc.stub.StreamObserver<ds.VitalSignControlService.VitalSignsMonitorResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getMonitorVitalSignsReadingMethodHelper(), responseObserver);
    }

    /**
     */
    public void alertStaffOfVitalSignsProblem(ds.VitalSignControlService.VitalSignsProblemRequest request,
        io.grpc.stub.StreamObserver<ds.VitalSignControlService.VitalSignsProblemResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAlertStaffOfVitalSignsProblemMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetVitalSignsDoMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                ds.VitalSignControlService.GetVitalSignsRequest,
                ds.VitalSignControlService.GetVitalSignsResponse>(
                  this, METHODID_GET_VITAL_SIGNS_DO)))
          .addMethod(
            getSetVitalSignsDoMethodHelper(),
            asyncClientStreamingCall(
              new MethodHandlers<
                ds.VitalSignControlService.SetVitalSignsRequest,
                ds.VitalSignControlService.SetVitalSignsResponse>(
                  this, METHODID_SET_VITAL_SIGNS_DO)))
          .addMethod(
            getMonitorVitalSignsReadingMethodHelper(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                ds.VitalSignControlService.VitalSignsMonitorRequest,
                ds.VitalSignControlService.VitalSignsMonitorResponse>(
                  this, METHODID_MONITOR_VITAL_SIGNS_READING)))
          .addMethod(
            getAlertStaffOfVitalSignsProblemMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                ds.VitalSignControlService.VitalSignsProblemRequest,
                ds.VitalSignControlService.VitalSignsProblemResponse>(
                  this, METHODID_ALERT_STAFF_OF_VITAL_SIGNS_PROBLEM)))
          .build();
    }
  }

  /**
   */
  public static final class VitalSignControlServiceStub extends io.grpc.stub.AbstractStub<VitalSignControlServiceStub> {
    private VitalSignControlServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VitalSignControlServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VitalSignControlServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VitalSignControlServiceStub(channel, callOptions);
    }

    /**
     */
    public void getVitalSignsDo(ds.VitalSignControlService.GetVitalSignsRequest request,
        io.grpc.stub.StreamObserver<ds.VitalSignControlService.GetVitalSignsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetVitalSignsDoMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ds.VitalSignControlService.SetVitalSignsRequest> setVitalSignsDo(
        io.grpc.stub.StreamObserver<ds.VitalSignControlService.SetVitalSignsResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getSetVitalSignsDoMethodHelper(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ds.VitalSignControlService.VitalSignsMonitorRequest> monitorVitalSignsReading(
        io.grpc.stub.StreamObserver<ds.VitalSignControlService.VitalSignsMonitorResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getMonitorVitalSignsReadingMethodHelper(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void alertStaffOfVitalSignsProblem(ds.VitalSignControlService.VitalSignsProblemRequest request,
        io.grpc.stub.StreamObserver<ds.VitalSignControlService.VitalSignsProblemResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAlertStaffOfVitalSignsProblemMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class VitalSignControlServiceBlockingStub extends io.grpc.stub.AbstractStub<VitalSignControlServiceBlockingStub> {
    private VitalSignControlServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VitalSignControlServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VitalSignControlServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VitalSignControlServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ds.VitalSignControlService.GetVitalSignsResponse getVitalSignsDo(ds.VitalSignControlService.GetVitalSignsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetVitalSignsDoMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public ds.VitalSignControlService.VitalSignsProblemResponse alertStaffOfVitalSignsProblem(ds.VitalSignControlService.VitalSignsProblemRequest request) {
      return blockingUnaryCall(
          getChannel(), getAlertStaffOfVitalSignsProblemMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class VitalSignControlServiceFutureStub extends io.grpc.stub.AbstractStub<VitalSignControlServiceFutureStub> {
    private VitalSignControlServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VitalSignControlServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VitalSignControlServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VitalSignControlServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ds.VitalSignControlService.GetVitalSignsResponse> getVitalSignsDo(
        ds.VitalSignControlService.GetVitalSignsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetVitalSignsDoMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ds.VitalSignControlService.VitalSignsProblemResponse> alertStaffOfVitalSignsProblem(
        ds.VitalSignControlService.VitalSignsProblemRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAlertStaffOfVitalSignsProblemMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_VITAL_SIGNS_DO = 0;
  private static final int METHODID_ALERT_STAFF_OF_VITAL_SIGNS_PROBLEM = 1;
  private static final int METHODID_SET_VITAL_SIGNS_DO = 2;
  private static final int METHODID_MONITOR_VITAL_SIGNS_READING = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final VitalSignControlServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(VitalSignControlServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_VITAL_SIGNS_DO:
          serviceImpl.getVitalSignsDo((ds.VitalSignControlService.GetVitalSignsRequest) request,
              (io.grpc.stub.StreamObserver<ds.VitalSignControlService.GetVitalSignsResponse>) responseObserver);
          break;
        case METHODID_ALERT_STAFF_OF_VITAL_SIGNS_PROBLEM:
          serviceImpl.alertStaffOfVitalSignsProblem((ds.VitalSignControlService.VitalSignsProblemRequest) request,
              (io.grpc.stub.StreamObserver<ds.VitalSignControlService.VitalSignsProblemResponse>) responseObserver);
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
        case METHODID_SET_VITAL_SIGNS_DO:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.setVitalSignsDo(
              (io.grpc.stub.StreamObserver<ds.VitalSignControlService.SetVitalSignsResponse>) responseObserver);
        case METHODID_MONITOR_VITAL_SIGNS_READING:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.monitorVitalSignsReading(
              (io.grpc.stub.StreamObserver<ds.VitalSignControlService.VitalSignsMonitorResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class VitalSignControlServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    VitalSignControlServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ds.VitalSignControlService.VitalSignControlServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("VitalSignControlService");
    }
  }

  private static final class VitalSignControlServiceFileDescriptorSupplier
      extends VitalSignControlServiceBaseDescriptorSupplier {
    VitalSignControlServiceFileDescriptorSupplier() {}
  }

  private static final class VitalSignControlServiceMethodDescriptorSupplier
      extends VitalSignControlServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    VitalSignControlServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (VitalSignControlServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new VitalSignControlServiceFileDescriptorSupplier())
              .addMethod(getGetVitalSignsDoMethodHelper())
              .addMethod(getSetVitalSignsDoMethodHelper())
              .addMethod(getMonitorVitalSignsReadingMethodHelper())
              .addMethod(getAlertStaffOfVitalSignsProblemMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
