package yandex.cloud.api.mdb.clickhouse.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing ClickHouse versions.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/mdb/clickhouse/v1/versions_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class VersionsServiceGrpc {

  private VersionsServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.mdb.clickhouse.v1.VersionsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.clickhouse.v1.VersionsServiceOuterClass.ListVersionsRequest,
      yandex.cloud.api.mdb.clickhouse.v1.VersionsServiceOuterClass.ListVersionsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.mdb.clickhouse.v1.VersionsServiceOuterClass.ListVersionsRequest.class,
      responseType = yandex.cloud.api.mdb.clickhouse.v1.VersionsServiceOuterClass.ListVersionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.clickhouse.v1.VersionsServiceOuterClass.ListVersionsRequest,
      yandex.cloud.api.mdb.clickhouse.v1.VersionsServiceOuterClass.ListVersionsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.clickhouse.v1.VersionsServiceOuterClass.ListVersionsRequest, yandex.cloud.api.mdb.clickhouse.v1.VersionsServiceOuterClass.ListVersionsResponse> getListMethod;
    if ((getListMethod = VersionsServiceGrpc.getListMethod) == null) {
      synchronized (VersionsServiceGrpc.class) {
        if ((getListMethod = VersionsServiceGrpc.getListMethod) == null) {
          VersionsServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.clickhouse.v1.VersionsServiceOuterClass.ListVersionsRequest, yandex.cloud.api.mdb.clickhouse.v1.VersionsServiceOuterClass.ListVersionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.clickhouse.v1.VersionsServiceOuterClass.ListVersionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.clickhouse.v1.VersionsServiceOuterClass.ListVersionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VersionsServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static VersionsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VersionsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VersionsServiceStub>() {
        @java.lang.Override
        public VersionsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VersionsServiceStub(channel, callOptions);
        }
      };
    return VersionsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static VersionsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VersionsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VersionsServiceBlockingStub>() {
        @java.lang.Override
        public VersionsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VersionsServiceBlockingStub(channel, callOptions);
        }
      };
    return VersionsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static VersionsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VersionsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VersionsServiceFutureStub>() {
        @java.lang.Override
        public VersionsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VersionsServiceFutureStub(channel, callOptions);
        }
      };
    return VersionsServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing ClickHouse versions.
   * </pre>
   */
  public static abstract class VersionsServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns list of available ClickHouse versions.
     * </pre>
     */
    public void list(yandex.cloud.api.mdb.clickhouse.v1.VersionsServiceOuterClass.ListVersionsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.clickhouse.v1.VersionsServiceOuterClass.ListVersionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.clickhouse.v1.VersionsServiceOuterClass.ListVersionsRequest,
                yandex.cloud.api.mdb.clickhouse.v1.VersionsServiceOuterClass.ListVersionsResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing ClickHouse versions.
   * </pre>
   */
  public static final class VersionsServiceStub extends io.grpc.stub.AbstractAsyncStub<VersionsServiceStub> {
    private VersionsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VersionsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VersionsServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns list of available ClickHouse versions.
     * </pre>
     */
    public void list(yandex.cloud.api.mdb.clickhouse.v1.VersionsServiceOuterClass.ListVersionsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.clickhouse.v1.VersionsServiceOuterClass.ListVersionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing ClickHouse versions.
   * </pre>
   */
  public static final class VersionsServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<VersionsServiceBlockingStub> {
    private VersionsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VersionsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VersionsServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns list of available ClickHouse versions.
     * </pre>
     */
    public yandex.cloud.api.mdb.clickhouse.v1.VersionsServiceOuterClass.ListVersionsResponse list(yandex.cloud.api.mdb.clickhouse.v1.VersionsServiceOuterClass.ListVersionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing ClickHouse versions.
   * </pre>
   */
  public static final class VersionsServiceFutureStub extends io.grpc.stub.AbstractFutureStub<VersionsServiceFutureStub> {
    private VersionsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VersionsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VersionsServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns list of available ClickHouse versions.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.mdb.clickhouse.v1.VersionsServiceOuterClass.ListVersionsResponse> list(
        yandex.cloud.api.mdb.clickhouse.v1.VersionsServiceOuterClass.ListVersionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final VersionsServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(VersionsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.mdb.clickhouse.v1.VersionsServiceOuterClass.ListVersionsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.clickhouse.v1.VersionsServiceOuterClass.ListVersionsResponse>) responseObserver);
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

  private static abstract class VersionsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    VersionsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.mdb.clickhouse.v1.VersionsServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("VersionsService");
    }
  }

  private static final class VersionsServiceFileDescriptorSupplier
      extends VersionsServiceBaseDescriptorSupplier {
    VersionsServiceFileDescriptorSupplier() {}
  }

  private static final class VersionsServiceMethodDescriptorSupplier
      extends VersionsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    VersionsServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (VersionsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new VersionsServiceFileDescriptorSupplier())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
