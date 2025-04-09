package yandex.cloud.api.baremetal.v1alpha;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods to retrieve information about default storages.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/baremetal/v1alpha/storage_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class StorageServiceGrpc {

  private StorageServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.baremetal.v1alpha.StorageService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.StorageServiceOuterClass.GetDefaultStorageRequest,
      yandex.cloud.api.baremetal.v1alpha.StorageServiceOuterClass.DefaultStorage> getGetDefaultMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDefault",
      requestType = yandex.cloud.api.baremetal.v1alpha.StorageServiceOuterClass.GetDefaultStorageRequest.class,
      responseType = yandex.cloud.api.baremetal.v1alpha.StorageServiceOuterClass.DefaultStorage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.StorageServiceOuterClass.GetDefaultStorageRequest,
      yandex.cloud.api.baremetal.v1alpha.StorageServiceOuterClass.DefaultStorage> getGetDefaultMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.StorageServiceOuterClass.GetDefaultStorageRequest, yandex.cloud.api.baremetal.v1alpha.StorageServiceOuterClass.DefaultStorage> getGetDefaultMethod;
    if ((getGetDefaultMethod = StorageServiceGrpc.getGetDefaultMethod) == null) {
      synchronized (StorageServiceGrpc.class) {
        if ((getGetDefaultMethod = StorageServiceGrpc.getGetDefaultMethod) == null) {
          StorageServiceGrpc.getGetDefaultMethod = getGetDefaultMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.baremetal.v1alpha.StorageServiceOuterClass.GetDefaultStorageRequest, yandex.cloud.api.baremetal.v1alpha.StorageServiceOuterClass.DefaultStorage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDefault"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.baremetal.v1alpha.StorageServiceOuterClass.GetDefaultStorageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.baremetal.v1alpha.StorageServiceOuterClass.DefaultStorage.getDefaultInstance()))
              .setSchemaDescriptor(new StorageServiceMethodDescriptorSupplier("GetDefault"))
              .build();
        }
      }
    }
    return getGetDefaultMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.StorageServiceOuterClass.BatchGetDefaultStoragesRequest,
      yandex.cloud.api.baremetal.v1alpha.StorageServiceOuterClass.BatchGetDefaultStoragesResponse> getBatchGetDefaultMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchGetDefault",
      requestType = yandex.cloud.api.baremetal.v1alpha.StorageServiceOuterClass.BatchGetDefaultStoragesRequest.class,
      responseType = yandex.cloud.api.baremetal.v1alpha.StorageServiceOuterClass.BatchGetDefaultStoragesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.StorageServiceOuterClass.BatchGetDefaultStoragesRequest,
      yandex.cloud.api.baremetal.v1alpha.StorageServiceOuterClass.BatchGetDefaultStoragesResponse> getBatchGetDefaultMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.StorageServiceOuterClass.BatchGetDefaultStoragesRequest, yandex.cloud.api.baremetal.v1alpha.StorageServiceOuterClass.BatchGetDefaultStoragesResponse> getBatchGetDefaultMethod;
    if ((getBatchGetDefaultMethod = StorageServiceGrpc.getBatchGetDefaultMethod) == null) {
      synchronized (StorageServiceGrpc.class) {
        if ((getBatchGetDefaultMethod = StorageServiceGrpc.getBatchGetDefaultMethod) == null) {
          StorageServiceGrpc.getBatchGetDefaultMethod = getBatchGetDefaultMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.baremetal.v1alpha.StorageServiceOuterClass.BatchGetDefaultStoragesRequest, yandex.cloud.api.baremetal.v1alpha.StorageServiceOuterClass.BatchGetDefaultStoragesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchGetDefault"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.baremetal.v1alpha.StorageServiceOuterClass.BatchGetDefaultStoragesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.baremetal.v1alpha.StorageServiceOuterClass.BatchGetDefaultStoragesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StorageServiceMethodDescriptorSupplier("BatchGetDefault"))
              .build();
        }
      }
    }
    return getBatchGetDefaultMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StorageServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StorageServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StorageServiceStub>() {
        @java.lang.Override
        public StorageServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StorageServiceStub(channel, callOptions);
        }
      };
    return StorageServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StorageServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StorageServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StorageServiceBlockingStub>() {
        @java.lang.Override
        public StorageServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StorageServiceBlockingStub(channel, callOptions);
        }
      };
    return StorageServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StorageServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StorageServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StorageServiceFutureStub>() {
        @java.lang.Override
        public StorageServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StorageServiceFutureStub(channel, callOptions);
        }
      };
    return StorageServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods to retrieve information about default storages.
   * </pre>
   */
  public static abstract class StorageServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the default storage for the specified configuration.
     * </pre>
     */
    public void getDefault(yandex.cloud.api.baremetal.v1alpha.StorageServiceOuterClass.GetDefaultStorageRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.baremetal.v1alpha.StorageServiceOuterClass.DefaultStorage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDefaultMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the default storages for the specified configurations.
     * </pre>
     */
    public void batchGetDefault(yandex.cloud.api.baremetal.v1alpha.StorageServiceOuterClass.BatchGetDefaultStoragesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.baremetal.v1alpha.StorageServiceOuterClass.BatchGetDefaultStoragesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchGetDefaultMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetDefaultMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.baremetal.v1alpha.StorageServiceOuterClass.GetDefaultStorageRequest,
                yandex.cloud.api.baremetal.v1alpha.StorageServiceOuterClass.DefaultStorage>(
                  this, METHODID_GET_DEFAULT)))
          .addMethod(
            getBatchGetDefaultMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.baremetal.v1alpha.StorageServiceOuterClass.BatchGetDefaultStoragesRequest,
                yandex.cloud.api.baremetal.v1alpha.StorageServiceOuterClass.BatchGetDefaultStoragesResponse>(
                  this, METHODID_BATCH_GET_DEFAULT)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods to retrieve information about default storages.
   * </pre>
   */
  public static final class StorageServiceStub extends io.grpc.stub.AbstractAsyncStub<StorageServiceStub> {
    private StorageServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StorageServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StorageServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the default storage for the specified configuration.
     * </pre>
     */
    public void getDefault(yandex.cloud.api.baremetal.v1alpha.StorageServiceOuterClass.GetDefaultStorageRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.baremetal.v1alpha.StorageServiceOuterClass.DefaultStorage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDefaultMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the default storages for the specified configurations.
     * </pre>
     */
    public void batchGetDefault(yandex.cloud.api.baremetal.v1alpha.StorageServiceOuterClass.BatchGetDefaultStoragesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.baremetal.v1alpha.StorageServiceOuterClass.BatchGetDefaultStoragesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchGetDefaultMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods to retrieve information about default storages.
   * </pre>
   */
  public static final class StorageServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<StorageServiceBlockingStub> {
    private StorageServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StorageServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StorageServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the default storage for the specified configuration.
     * </pre>
     */
    public yandex.cloud.api.baremetal.v1alpha.StorageServiceOuterClass.DefaultStorage getDefault(yandex.cloud.api.baremetal.v1alpha.StorageServiceOuterClass.GetDefaultStorageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDefaultMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the default storages for the specified configurations.
     * </pre>
     */
    public yandex.cloud.api.baremetal.v1alpha.StorageServiceOuterClass.BatchGetDefaultStoragesResponse batchGetDefault(yandex.cloud.api.baremetal.v1alpha.StorageServiceOuterClass.BatchGetDefaultStoragesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchGetDefaultMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods to retrieve information about default storages.
   * </pre>
   */
  public static final class StorageServiceFutureStub extends io.grpc.stub.AbstractFutureStub<StorageServiceFutureStub> {
    private StorageServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StorageServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StorageServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the default storage for the specified configuration.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.baremetal.v1alpha.StorageServiceOuterClass.DefaultStorage> getDefault(
        yandex.cloud.api.baremetal.v1alpha.StorageServiceOuterClass.GetDefaultStorageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDefaultMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the default storages for the specified configurations.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.baremetal.v1alpha.StorageServiceOuterClass.BatchGetDefaultStoragesResponse> batchGetDefault(
        yandex.cloud.api.baremetal.v1alpha.StorageServiceOuterClass.BatchGetDefaultStoragesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchGetDefaultMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_DEFAULT = 0;
  private static final int METHODID_BATCH_GET_DEFAULT = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final StorageServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(StorageServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_DEFAULT:
          serviceImpl.getDefault((yandex.cloud.api.baremetal.v1alpha.StorageServiceOuterClass.GetDefaultStorageRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.baremetal.v1alpha.StorageServiceOuterClass.DefaultStorage>) responseObserver);
          break;
        case METHODID_BATCH_GET_DEFAULT:
          serviceImpl.batchGetDefault((yandex.cloud.api.baremetal.v1alpha.StorageServiceOuterClass.BatchGetDefaultStoragesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.baremetal.v1alpha.StorageServiceOuterClass.BatchGetDefaultStoragesResponse>) responseObserver);
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

  private static abstract class StorageServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StorageServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.baremetal.v1alpha.StorageServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StorageService");
    }
  }

  private static final class StorageServiceFileDescriptorSupplier
      extends StorageServiceBaseDescriptorSupplier {
    StorageServiceFileDescriptorSupplier() {}
  }

  private static final class StorageServiceMethodDescriptorSupplier
      extends StorageServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StorageServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (StorageServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StorageServiceFileDescriptorSupplier())
              .addMethod(getGetDefaultMethod())
              .addMethod(getBatchGetDefaultMethod())
              .build();
        }
      }
    }
    return result;
  }
}
