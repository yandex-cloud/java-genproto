package yandex.cloud.api.mdb.postgresql.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for getting PostgreSQL performance diagnostics.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/mdb/postgresql/v1/perf_diag_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PerformanceDiagnosticsServiceGrpc {

  private PerformanceDiagnosticsServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.mdb.postgresql.v1.PerformanceDiagnosticsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.postgresql.v1.PerfDiagService.ListRawStatementsRequest,
      yandex.cloud.api.mdb.postgresql.v1.PerfDiagService.ListRawStatementsResponse> getListRawStatementsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListRawStatements",
      requestType = yandex.cloud.api.mdb.postgresql.v1.PerfDiagService.ListRawStatementsRequest.class,
      responseType = yandex.cloud.api.mdb.postgresql.v1.PerfDiagService.ListRawStatementsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.postgresql.v1.PerfDiagService.ListRawStatementsRequest,
      yandex.cloud.api.mdb.postgresql.v1.PerfDiagService.ListRawStatementsResponse> getListRawStatementsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.postgresql.v1.PerfDiagService.ListRawStatementsRequest, yandex.cloud.api.mdb.postgresql.v1.PerfDiagService.ListRawStatementsResponse> getListRawStatementsMethod;
    if ((getListRawStatementsMethod = PerformanceDiagnosticsServiceGrpc.getListRawStatementsMethod) == null) {
      synchronized (PerformanceDiagnosticsServiceGrpc.class) {
        if ((getListRawStatementsMethod = PerformanceDiagnosticsServiceGrpc.getListRawStatementsMethod) == null) {
          PerformanceDiagnosticsServiceGrpc.getListRawStatementsMethod = getListRawStatementsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.postgresql.v1.PerfDiagService.ListRawStatementsRequest, yandex.cloud.api.mdb.postgresql.v1.PerfDiagService.ListRawStatementsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListRawStatements"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.postgresql.v1.PerfDiagService.ListRawStatementsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.postgresql.v1.PerfDiagService.ListRawStatementsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PerformanceDiagnosticsServiceMethodDescriptorSupplier("ListRawStatements"))
              .build();
        }
      }
    }
    return getListRawStatementsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PerformanceDiagnosticsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PerformanceDiagnosticsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PerformanceDiagnosticsServiceStub>() {
        @java.lang.Override
        public PerformanceDiagnosticsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PerformanceDiagnosticsServiceStub(channel, callOptions);
        }
      };
    return PerformanceDiagnosticsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PerformanceDiagnosticsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PerformanceDiagnosticsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PerformanceDiagnosticsServiceBlockingStub>() {
        @java.lang.Override
        public PerformanceDiagnosticsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PerformanceDiagnosticsServiceBlockingStub(channel, callOptions);
        }
      };
    return PerformanceDiagnosticsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PerformanceDiagnosticsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PerformanceDiagnosticsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PerformanceDiagnosticsServiceFutureStub>() {
        @java.lang.Override
        public PerformanceDiagnosticsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PerformanceDiagnosticsServiceFutureStub(channel, callOptions);
        }
      };
    return PerformanceDiagnosticsServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for getting PostgreSQL performance diagnostics.
   * </pre>
   */
  public static abstract class PerformanceDiagnosticsServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Handlers for raw data export
     * </pre>
     */
    public void listRawStatements(yandex.cloud.api.mdb.postgresql.v1.PerfDiagService.ListRawStatementsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.postgresql.v1.PerfDiagService.ListRawStatementsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListRawStatementsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListRawStatementsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.postgresql.v1.PerfDiagService.ListRawStatementsRequest,
                yandex.cloud.api.mdb.postgresql.v1.PerfDiagService.ListRawStatementsResponse>(
                  this, METHODID_LIST_RAW_STATEMENTS)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for getting PostgreSQL performance diagnostics.
   * </pre>
   */
  public static final class PerformanceDiagnosticsServiceStub extends io.grpc.stub.AbstractAsyncStub<PerformanceDiagnosticsServiceStub> {
    private PerformanceDiagnosticsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PerformanceDiagnosticsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PerformanceDiagnosticsServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Handlers for raw data export
     * </pre>
     */
    public void listRawStatements(yandex.cloud.api.mdb.postgresql.v1.PerfDiagService.ListRawStatementsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.postgresql.v1.PerfDiagService.ListRawStatementsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListRawStatementsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for getting PostgreSQL performance diagnostics.
   * </pre>
   */
  public static final class PerformanceDiagnosticsServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<PerformanceDiagnosticsServiceBlockingStub> {
    private PerformanceDiagnosticsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PerformanceDiagnosticsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PerformanceDiagnosticsServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Handlers for raw data export
     * </pre>
     */
    public yandex.cloud.api.mdb.postgresql.v1.PerfDiagService.ListRawStatementsResponse listRawStatements(yandex.cloud.api.mdb.postgresql.v1.PerfDiagService.ListRawStatementsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListRawStatementsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for getting PostgreSQL performance diagnostics.
   * </pre>
   */
  public static final class PerformanceDiagnosticsServiceFutureStub extends io.grpc.stub.AbstractFutureStub<PerformanceDiagnosticsServiceFutureStub> {
    private PerformanceDiagnosticsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PerformanceDiagnosticsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PerformanceDiagnosticsServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Handlers for raw data export
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.mdb.postgresql.v1.PerfDiagService.ListRawStatementsResponse> listRawStatements(
        yandex.cloud.api.mdb.postgresql.v1.PerfDiagService.ListRawStatementsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListRawStatementsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_RAW_STATEMENTS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PerformanceDiagnosticsServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PerformanceDiagnosticsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_RAW_STATEMENTS:
          serviceImpl.listRawStatements((yandex.cloud.api.mdb.postgresql.v1.PerfDiagService.ListRawStatementsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.postgresql.v1.PerfDiagService.ListRawStatementsResponse>) responseObserver);
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

  private static abstract class PerformanceDiagnosticsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PerformanceDiagnosticsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.mdb.postgresql.v1.PerfDiagService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PerformanceDiagnosticsService");
    }
  }

  private static final class PerformanceDiagnosticsServiceFileDescriptorSupplier
      extends PerformanceDiagnosticsServiceBaseDescriptorSupplier {
    PerformanceDiagnosticsServiceFileDescriptorSupplier() {}
  }

  private static final class PerformanceDiagnosticsServiceMethodDescriptorSupplier
      extends PerformanceDiagnosticsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PerformanceDiagnosticsServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PerformanceDiagnosticsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PerformanceDiagnosticsServiceFileDescriptorSupplier())
              .addMethod(getListRawStatementsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
