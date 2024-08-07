package yandex.cloud.api.cdn.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing Cache Service resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/cdn/v1/cache_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CacheServiceGrpc {

  private CacheServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.cdn.v1.CacheService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.CacheServiceOuterClass.PurgeCacheRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getPurgeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Purge",
      requestType = yandex.cloud.api.cdn.v1.CacheServiceOuterClass.PurgeCacheRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.CacheServiceOuterClass.PurgeCacheRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getPurgeMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.CacheServiceOuterClass.PurgeCacheRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getPurgeMethod;
    if ((getPurgeMethod = CacheServiceGrpc.getPurgeMethod) == null) {
      synchronized (CacheServiceGrpc.class) {
        if ((getPurgeMethod = CacheServiceGrpc.getPurgeMethod) == null) {
          CacheServiceGrpc.getPurgeMethod = getPurgeMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cdn.v1.CacheServiceOuterClass.PurgeCacheRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Purge"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cdn.v1.CacheServiceOuterClass.PurgeCacheRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new CacheServiceMethodDescriptorSupplier("Purge"))
              .build();
        }
      }
    }
    return getPurgeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.CacheServiceOuterClass.PrefetchCacheRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getPrefetchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Prefetch",
      requestType = yandex.cloud.api.cdn.v1.CacheServiceOuterClass.PrefetchCacheRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.CacheServiceOuterClass.PrefetchCacheRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getPrefetchMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.CacheServiceOuterClass.PrefetchCacheRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getPrefetchMethod;
    if ((getPrefetchMethod = CacheServiceGrpc.getPrefetchMethod) == null) {
      synchronized (CacheServiceGrpc.class) {
        if ((getPrefetchMethod = CacheServiceGrpc.getPrefetchMethod) == null) {
          CacheServiceGrpc.getPrefetchMethod = getPrefetchMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cdn.v1.CacheServiceOuterClass.PrefetchCacheRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Prefetch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cdn.v1.CacheServiceOuterClass.PrefetchCacheRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new CacheServiceMethodDescriptorSupplier("Prefetch"))
              .build();
        }
      }
    }
    return getPrefetchMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CacheServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CacheServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CacheServiceStub>() {
        @java.lang.Override
        public CacheServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CacheServiceStub(channel, callOptions);
        }
      };
    return CacheServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CacheServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CacheServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CacheServiceBlockingStub>() {
        @java.lang.Override
        public CacheServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CacheServiceBlockingStub(channel, callOptions);
        }
      };
    return CacheServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CacheServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CacheServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CacheServiceFutureStub>() {
        @java.lang.Override
        public CacheServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CacheServiceFutureStub(channel, callOptions);
        }
      };
    return CacheServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing Cache Service resources.
   * </pre>
   */
  public static abstract class CacheServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Removes specified files from the cache of the specified resource. For details about purging, see [documentation](/docs/cdn/concepts/caching#purge).
     * Purging may take up to 15 minutes.
     * </pre>
     */
    public void purge(yandex.cloud.api.cdn.v1.CacheServiceOuterClass.PurgeCacheRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPurgeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Uploads specified files from origins to cache of the specified resource. For defails about prefetching, see [documentation](/docs/cdn/concepts/caching#prefetch).
     * </pre>
     */
    public void prefetch(yandex.cloud.api.cdn.v1.CacheServiceOuterClass.PrefetchCacheRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPrefetchMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPurgeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cdn.v1.CacheServiceOuterClass.PurgeCacheRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_PURGE)))
          .addMethod(
            getPrefetchMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cdn.v1.CacheServiceOuterClass.PrefetchCacheRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_PREFETCH)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing Cache Service resources.
   * </pre>
   */
  public static final class CacheServiceStub extends io.grpc.stub.AbstractAsyncStub<CacheServiceStub> {
    private CacheServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CacheServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CacheServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Removes specified files from the cache of the specified resource. For details about purging, see [documentation](/docs/cdn/concepts/caching#purge).
     * Purging may take up to 15 minutes.
     * </pre>
     */
    public void purge(yandex.cloud.api.cdn.v1.CacheServiceOuterClass.PurgeCacheRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPurgeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Uploads specified files from origins to cache of the specified resource. For defails about prefetching, see [documentation](/docs/cdn/concepts/caching#prefetch).
     * </pre>
     */
    public void prefetch(yandex.cloud.api.cdn.v1.CacheServiceOuterClass.PrefetchCacheRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPrefetchMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Cache Service resources.
   * </pre>
   */
  public static final class CacheServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CacheServiceBlockingStub> {
    private CacheServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CacheServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CacheServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Removes specified files from the cache of the specified resource. For details about purging, see [documentation](/docs/cdn/concepts/caching#purge).
     * Purging may take up to 15 minutes.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation purge(yandex.cloud.api.cdn.v1.CacheServiceOuterClass.PurgeCacheRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPurgeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Uploads specified files from origins to cache of the specified resource. For defails about prefetching, see [documentation](/docs/cdn/concepts/caching#prefetch).
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation prefetch(yandex.cloud.api.cdn.v1.CacheServiceOuterClass.PrefetchCacheRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPrefetchMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Cache Service resources.
   * </pre>
   */
  public static final class CacheServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CacheServiceFutureStub> {
    private CacheServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CacheServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CacheServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Removes specified files from the cache of the specified resource. For details about purging, see [documentation](/docs/cdn/concepts/caching#purge).
     * Purging may take up to 15 minutes.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> purge(
        yandex.cloud.api.cdn.v1.CacheServiceOuterClass.PurgeCacheRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPurgeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Uploads specified files from origins to cache of the specified resource. For defails about prefetching, see [documentation](/docs/cdn/concepts/caching#prefetch).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> prefetch(
        yandex.cloud.api.cdn.v1.CacheServiceOuterClass.PrefetchCacheRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPrefetchMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PURGE = 0;
  private static final int METHODID_PREFETCH = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CacheServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CacheServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PURGE:
          serviceImpl.purge((yandex.cloud.api.cdn.v1.CacheServiceOuterClass.PurgeCacheRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_PREFETCH:
          serviceImpl.prefetch((yandex.cloud.api.cdn.v1.CacheServiceOuterClass.PrefetchCacheRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
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

  private static abstract class CacheServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CacheServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.cdn.v1.CacheServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CacheService");
    }
  }

  private static final class CacheServiceFileDescriptorSupplier
      extends CacheServiceBaseDescriptorSupplier {
    CacheServiceFileDescriptorSupplier() {}
  }

  private static final class CacheServiceMethodDescriptorSupplier
      extends CacheServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CacheServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CacheServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CacheServiceFileDescriptorSupplier())
              .addMethod(getPurgeMethod())
              .addMethod(getPrefetchMethod())
              .build();
        }
      }
    }
    return result;
  }
}
