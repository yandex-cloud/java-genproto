package yandex.cloud.api.dataproc.manager.v1;

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
 * Data Proc manager service defifnition
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.0)",
    comments = "Source: yandex/cloud/dataproc/manager/v1/manager_service.proto")
public final class DataprocManagerServiceGrpc {

  private DataprocManagerServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.dataproc.manager.v1.DataprocManagerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.dataproc.manager.v1.ManagerService.ReportRequest,
      yandex.cloud.api.dataproc.manager.v1.ManagerService.ReportReply> getReportMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Report",
      requestType = yandex.cloud.api.dataproc.manager.v1.ManagerService.ReportRequest.class,
      responseType = yandex.cloud.api.dataproc.manager.v1.ManagerService.ReportReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.dataproc.manager.v1.ManagerService.ReportRequest,
      yandex.cloud.api.dataproc.manager.v1.ManagerService.ReportReply> getReportMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.dataproc.manager.v1.ManagerService.ReportRequest, yandex.cloud.api.dataproc.manager.v1.ManagerService.ReportReply> getReportMethod;
    if ((getReportMethod = DataprocManagerServiceGrpc.getReportMethod) == null) {
      synchronized (DataprocManagerServiceGrpc.class) {
        if ((getReportMethod = DataprocManagerServiceGrpc.getReportMethod) == null) {
          DataprocManagerServiceGrpc.getReportMethod = getReportMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.dataproc.manager.v1.ManagerService.ReportRequest, yandex.cloud.api.dataproc.manager.v1.ManagerService.ReportReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.dataproc.manager.v1.DataprocManagerService", "Report"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.dataproc.manager.v1.ManagerService.ReportRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.dataproc.manager.v1.ManagerService.ReportReply.getDefaultInstance()))
                  .setSchemaDescriptor(new DataprocManagerServiceMethodDescriptorSupplier("Report"))
                  .build();
          }
        }
     }
     return getReportMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DataprocManagerServiceStub newStub(io.grpc.Channel channel) {
    return new DataprocManagerServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DataprocManagerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DataprocManagerServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DataprocManagerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DataprocManagerServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Data Proc manager service defifnition
   * </pre>
   */
  public static abstract class DataprocManagerServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Sends a status report from a host
     * </pre>
     */
    public void report(yandex.cloud.api.dataproc.manager.v1.ManagerService.ReportRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.dataproc.manager.v1.ManagerService.ReportReply> responseObserver) {
      asyncUnimplementedUnaryCall(getReportMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getReportMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.dataproc.manager.v1.ManagerService.ReportRequest,
                yandex.cloud.api.dataproc.manager.v1.ManagerService.ReportReply>(
                  this, METHODID_REPORT)))
          .build();
    }
  }

  /**
   * <pre>
   * Data Proc manager service defifnition
   * </pre>
   */
  public static final class DataprocManagerServiceStub extends io.grpc.stub.AbstractStub<DataprocManagerServiceStub> {
    private DataprocManagerServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DataprocManagerServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataprocManagerServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DataprocManagerServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a status report from a host
     * </pre>
     */
    public void report(yandex.cloud.api.dataproc.manager.v1.ManagerService.ReportRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.dataproc.manager.v1.ManagerService.ReportReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReportMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Data Proc manager service defifnition
   * </pre>
   */
  public static final class DataprocManagerServiceBlockingStub extends io.grpc.stub.AbstractStub<DataprocManagerServiceBlockingStub> {
    private DataprocManagerServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DataprocManagerServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataprocManagerServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DataprocManagerServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a status report from a host
     * </pre>
     */
    public yandex.cloud.api.dataproc.manager.v1.ManagerService.ReportReply report(yandex.cloud.api.dataproc.manager.v1.ManagerService.ReportRequest request) {
      return blockingUnaryCall(
          getChannel(), getReportMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Data Proc manager service defifnition
   * </pre>
   */
  public static final class DataprocManagerServiceFutureStub extends io.grpc.stub.AbstractStub<DataprocManagerServiceFutureStub> {
    private DataprocManagerServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DataprocManagerServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataprocManagerServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DataprocManagerServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a status report from a host
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.dataproc.manager.v1.ManagerService.ReportReply> report(
        yandex.cloud.api.dataproc.manager.v1.ManagerService.ReportRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getReportMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REPORT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DataprocManagerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DataprocManagerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REPORT:
          serviceImpl.report((yandex.cloud.api.dataproc.manager.v1.ManagerService.ReportRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.dataproc.manager.v1.ManagerService.ReportReply>) responseObserver);
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

  private static abstract class DataprocManagerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DataprocManagerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.dataproc.manager.v1.ManagerService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DataprocManagerService");
    }
  }

  private static final class DataprocManagerServiceFileDescriptorSupplier
      extends DataprocManagerServiceBaseDescriptorSupplier {
    DataprocManagerServiceFileDescriptorSupplier() {}
  }

  private static final class DataprocManagerServiceMethodDescriptorSupplier
      extends DataprocManagerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DataprocManagerServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DataprocManagerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DataprocManagerServiceFileDescriptorSupplier())
              .addMethod(getReportMethod())
              .build();
        }
      }
    }
    return result;
  }
}
