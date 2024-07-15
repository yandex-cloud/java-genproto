package yandex.cloud.api.loadtesting.api.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing test reports.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/loadtesting/api/v1/report_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ReportServiceGrpc {

  private ReportServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.loadtesting.api.v1.ReportService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.loadtesting.api.v1.ReportServiceOuterClass.GetTableReportRequest,
      yandex.cloud.api.loadtesting.api.v1.ReportServiceOuterClass.GetTableReportResponse> getGetTableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTable",
      requestType = yandex.cloud.api.loadtesting.api.v1.ReportServiceOuterClass.GetTableReportRequest.class,
      responseType = yandex.cloud.api.loadtesting.api.v1.ReportServiceOuterClass.GetTableReportResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.loadtesting.api.v1.ReportServiceOuterClass.GetTableReportRequest,
      yandex.cloud.api.loadtesting.api.v1.ReportServiceOuterClass.GetTableReportResponse> getGetTableMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.loadtesting.api.v1.ReportServiceOuterClass.GetTableReportRequest, yandex.cloud.api.loadtesting.api.v1.ReportServiceOuterClass.GetTableReportResponse> getGetTableMethod;
    if ((getGetTableMethod = ReportServiceGrpc.getGetTableMethod) == null) {
      synchronized (ReportServiceGrpc.class) {
        if ((getGetTableMethod = ReportServiceGrpc.getGetTableMethod) == null) {
          ReportServiceGrpc.getGetTableMethod = getGetTableMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.loadtesting.api.v1.ReportServiceOuterClass.GetTableReportRequest, yandex.cloud.api.loadtesting.api.v1.ReportServiceOuterClass.GetTableReportResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.loadtesting.api.v1.ReportServiceOuterClass.GetTableReportRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.loadtesting.api.v1.ReportServiceOuterClass.GetTableReportResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ReportServiceMethodDescriptorSupplier("GetTable"))
              .build();
        }
      }
    }
    return getGetTableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.loadtesting.api.v1.ReportServiceOuterClass.CalculateReportKpiValuesRequest,
      yandex.cloud.api.loadtesting.api.v1.ReportServiceOuterClass.CalculateReportKpiValuesResponse> getCalculateKpiValuesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CalculateKpiValues",
      requestType = yandex.cloud.api.loadtesting.api.v1.ReportServiceOuterClass.CalculateReportKpiValuesRequest.class,
      responseType = yandex.cloud.api.loadtesting.api.v1.ReportServiceOuterClass.CalculateReportKpiValuesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.loadtesting.api.v1.ReportServiceOuterClass.CalculateReportKpiValuesRequest,
      yandex.cloud.api.loadtesting.api.v1.ReportServiceOuterClass.CalculateReportKpiValuesResponse> getCalculateKpiValuesMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.loadtesting.api.v1.ReportServiceOuterClass.CalculateReportKpiValuesRequest, yandex.cloud.api.loadtesting.api.v1.ReportServiceOuterClass.CalculateReportKpiValuesResponse> getCalculateKpiValuesMethod;
    if ((getCalculateKpiValuesMethod = ReportServiceGrpc.getCalculateKpiValuesMethod) == null) {
      synchronized (ReportServiceGrpc.class) {
        if ((getCalculateKpiValuesMethod = ReportServiceGrpc.getCalculateKpiValuesMethod) == null) {
          ReportServiceGrpc.getCalculateKpiValuesMethod = getCalculateKpiValuesMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.loadtesting.api.v1.ReportServiceOuterClass.CalculateReportKpiValuesRequest, yandex.cloud.api.loadtesting.api.v1.ReportServiceOuterClass.CalculateReportKpiValuesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CalculateKpiValues"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.loadtesting.api.v1.ReportServiceOuterClass.CalculateReportKpiValuesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.loadtesting.api.v1.ReportServiceOuterClass.CalculateReportKpiValuesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ReportServiceMethodDescriptorSupplier("CalculateKpiValues"))
              .build();
        }
      }
    }
    return getCalculateKpiValuesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ReportServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ReportServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ReportServiceStub>() {
        @java.lang.Override
        public ReportServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ReportServiceStub(channel, callOptions);
        }
      };
    return ReportServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ReportServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ReportServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ReportServiceBlockingStub>() {
        @java.lang.Override
        public ReportServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ReportServiceBlockingStub(channel, callOptions);
        }
      };
    return ReportServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ReportServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ReportServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ReportServiceFutureStub>() {
        @java.lang.Override
        public ReportServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ReportServiceFutureStub(channel, callOptions);
        }
      };
    return ReportServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing test reports.
   * </pre>
   */
  public static abstract class ReportServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns a report table for the specified test.
     * </pre>
     */
    public void getTable(yandex.cloud.api.loadtesting.api.v1.ReportServiceOuterClass.GetTableReportRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.loadtesting.api.v1.ReportServiceOuterClass.GetTableReportResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTableMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns a list of KPI values for tests matching the specified filter.
     * </pre>
     */
    public void calculateKpiValues(yandex.cloud.api.loadtesting.api.v1.ReportServiceOuterClass.CalculateReportKpiValuesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.loadtesting.api.v1.ReportServiceOuterClass.CalculateReportKpiValuesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCalculateKpiValuesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetTableMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.loadtesting.api.v1.ReportServiceOuterClass.GetTableReportRequest,
                yandex.cloud.api.loadtesting.api.v1.ReportServiceOuterClass.GetTableReportResponse>(
                  this, METHODID_GET_TABLE)))
          .addMethod(
            getCalculateKpiValuesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.loadtesting.api.v1.ReportServiceOuterClass.CalculateReportKpiValuesRequest,
                yandex.cloud.api.loadtesting.api.v1.ReportServiceOuterClass.CalculateReportKpiValuesResponse>(
                  this, METHODID_CALCULATE_KPI_VALUES)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing test reports.
   * </pre>
   */
  public static final class ReportServiceStub extends io.grpc.stub.AbstractAsyncStub<ReportServiceStub> {
    private ReportServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReportServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ReportServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns a report table for the specified test.
     * </pre>
     */
    public void getTable(yandex.cloud.api.loadtesting.api.v1.ReportServiceOuterClass.GetTableReportRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.loadtesting.api.v1.ReportServiceOuterClass.GetTableReportResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns a list of KPI values for tests matching the specified filter.
     * </pre>
     */
    public void calculateKpiValues(yandex.cloud.api.loadtesting.api.v1.ReportServiceOuterClass.CalculateReportKpiValuesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.loadtesting.api.v1.ReportServiceOuterClass.CalculateReportKpiValuesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCalculateKpiValuesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing test reports.
   * </pre>
   */
  public static final class ReportServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ReportServiceBlockingStub> {
    private ReportServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReportServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ReportServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns a report table for the specified test.
     * </pre>
     */
    public yandex.cloud.api.loadtesting.api.v1.ReportServiceOuterClass.GetTableReportResponse getTable(yandex.cloud.api.loadtesting.api.v1.ReportServiceOuterClass.GetTableReportRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTableMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns a list of KPI values for tests matching the specified filter.
     * </pre>
     */
    public yandex.cloud.api.loadtesting.api.v1.ReportServiceOuterClass.CalculateReportKpiValuesResponse calculateKpiValues(yandex.cloud.api.loadtesting.api.v1.ReportServiceOuterClass.CalculateReportKpiValuesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCalculateKpiValuesMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing test reports.
   * </pre>
   */
  public static final class ReportServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ReportServiceFutureStub> {
    private ReportServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReportServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ReportServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns a report table for the specified test.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.loadtesting.api.v1.ReportServiceOuterClass.GetTableReportResponse> getTable(
        yandex.cloud.api.loadtesting.api.v1.ReportServiceOuterClass.GetTableReportRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTableMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns a list of KPI values for tests matching the specified filter.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.loadtesting.api.v1.ReportServiceOuterClass.CalculateReportKpiValuesResponse> calculateKpiValues(
        yandex.cloud.api.loadtesting.api.v1.ReportServiceOuterClass.CalculateReportKpiValuesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCalculateKpiValuesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_TABLE = 0;
  private static final int METHODID_CALCULATE_KPI_VALUES = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ReportServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ReportServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_TABLE:
          serviceImpl.getTable((yandex.cloud.api.loadtesting.api.v1.ReportServiceOuterClass.GetTableReportRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.loadtesting.api.v1.ReportServiceOuterClass.GetTableReportResponse>) responseObserver);
          break;
        case METHODID_CALCULATE_KPI_VALUES:
          serviceImpl.calculateKpiValues((yandex.cloud.api.loadtesting.api.v1.ReportServiceOuterClass.CalculateReportKpiValuesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.loadtesting.api.v1.ReportServiceOuterClass.CalculateReportKpiValuesResponse>) responseObserver);
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

  private static abstract class ReportServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ReportServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.loadtesting.api.v1.ReportServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ReportService");
    }
  }

  private static final class ReportServiceFileDescriptorSupplier
      extends ReportServiceBaseDescriptorSupplier {
    ReportServiceFileDescriptorSupplier() {}
  }

  private static final class ReportServiceMethodDescriptorSupplier
      extends ReportServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ReportServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ReportServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ReportServiceFileDescriptorSupplier())
              .addMethod(getGetTableMethod())
              .addMethod(getCalculateKpiValuesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
