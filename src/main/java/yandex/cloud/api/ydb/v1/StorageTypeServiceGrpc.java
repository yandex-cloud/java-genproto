package yandex.cloud.api.ydb.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/ydb/v1/storage_type_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class StorageTypeServiceGrpc {

  private StorageTypeServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.ydb.v1.StorageTypeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ydb.v1.StorageTypeServiceOuterClass.GetStorageTypeRequest,
      yandex.cloud.api.ydb.v1.StorageTypeOuterClass.StorageType> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.ydb.v1.StorageTypeServiceOuterClass.GetStorageTypeRequest.class,
      responseType = yandex.cloud.api.ydb.v1.StorageTypeOuterClass.StorageType.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ydb.v1.StorageTypeServiceOuterClass.GetStorageTypeRequest,
      yandex.cloud.api.ydb.v1.StorageTypeOuterClass.StorageType> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ydb.v1.StorageTypeServiceOuterClass.GetStorageTypeRequest, yandex.cloud.api.ydb.v1.StorageTypeOuterClass.StorageType> getGetMethod;
    if ((getGetMethod = StorageTypeServiceGrpc.getGetMethod) == null) {
      synchronized (StorageTypeServiceGrpc.class) {
        if ((getGetMethod = StorageTypeServiceGrpc.getGetMethod) == null) {
          StorageTypeServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ydb.v1.StorageTypeServiceOuterClass.GetStorageTypeRequest, yandex.cloud.api.ydb.v1.StorageTypeOuterClass.StorageType>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ydb.v1.StorageTypeServiceOuterClass.GetStorageTypeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ydb.v1.StorageTypeOuterClass.StorageType.getDefaultInstance()))
              .setSchemaDescriptor(new StorageTypeServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ydb.v1.StorageTypeServiceOuterClass.ListStorageTypesRequest,
      yandex.cloud.api.ydb.v1.StorageTypeServiceOuterClass.ListStorageTypesResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.ydb.v1.StorageTypeServiceOuterClass.ListStorageTypesRequest.class,
      responseType = yandex.cloud.api.ydb.v1.StorageTypeServiceOuterClass.ListStorageTypesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ydb.v1.StorageTypeServiceOuterClass.ListStorageTypesRequest,
      yandex.cloud.api.ydb.v1.StorageTypeServiceOuterClass.ListStorageTypesResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ydb.v1.StorageTypeServiceOuterClass.ListStorageTypesRequest, yandex.cloud.api.ydb.v1.StorageTypeServiceOuterClass.ListStorageTypesResponse> getListMethod;
    if ((getListMethod = StorageTypeServiceGrpc.getListMethod) == null) {
      synchronized (StorageTypeServiceGrpc.class) {
        if ((getListMethod = StorageTypeServiceGrpc.getListMethod) == null) {
          StorageTypeServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ydb.v1.StorageTypeServiceOuterClass.ListStorageTypesRequest, yandex.cloud.api.ydb.v1.StorageTypeServiceOuterClass.ListStorageTypesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ydb.v1.StorageTypeServiceOuterClass.ListStorageTypesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ydb.v1.StorageTypeServiceOuterClass.ListStorageTypesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StorageTypeServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StorageTypeServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StorageTypeServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StorageTypeServiceStub>() {
        @java.lang.Override
        public StorageTypeServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StorageTypeServiceStub(channel, callOptions);
        }
      };
    return StorageTypeServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StorageTypeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StorageTypeServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StorageTypeServiceBlockingStub>() {
        @java.lang.Override
        public StorageTypeServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StorageTypeServiceBlockingStub(channel, callOptions);
        }
      };
    return StorageTypeServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StorageTypeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StorageTypeServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StorageTypeServiceFutureStub>() {
        @java.lang.Override
        public StorageTypeServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StorageTypeServiceFutureStub(channel, callOptions);
        }
      };
    return StorageTypeServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class StorageTypeServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified storage types.
     * </pre>
     */
    public void get(yandex.cloud.api.ydb.v1.StorageTypeServiceOuterClass.GetStorageTypeRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ydb.v1.StorageTypeOuterClass.StorageType> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the list of available storage types.
     * </pre>
     */
    public void list(yandex.cloud.api.ydb.v1.StorageTypeServiceOuterClass.ListStorageTypesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ydb.v1.StorageTypeServiceOuterClass.ListStorageTypesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ydb.v1.StorageTypeServiceOuterClass.GetStorageTypeRequest,
                yandex.cloud.api.ydb.v1.StorageTypeOuterClass.StorageType>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ydb.v1.StorageTypeServiceOuterClass.ListStorageTypesRequest,
                yandex.cloud.api.ydb.v1.StorageTypeServiceOuterClass.ListStorageTypesResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   */
  public static final class StorageTypeServiceStub extends io.grpc.stub.AbstractAsyncStub<StorageTypeServiceStub> {
    private StorageTypeServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StorageTypeServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StorageTypeServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified storage types.
     * </pre>
     */
    public void get(yandex.cloud.api.ydb.v1.StorageTypeServiceOuterClass.GetStorageTypeRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ydb.v1.StorageTypeOuterClass.StorageType> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the list of available storage types.
     * </pre>
     */
    public void list(yandex.cloud.api.ydb.v1.StorageTypeServiceOuterClass.ListStorageTypesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ydb.v1.StorageTypeServiceOuterClass.ListStorageTypesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class StorageTypeServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<StorageTypeServiceBlockingStub> {
    private StorageTypeServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StorageTypeServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StorageTypeServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified storage types.
     * </pre>
     */
    public yandex.cloud.api.ydb.v1.StorageTypeOuterClass.StorageType get(yandex.cloud.api.ydb.v1.StorageTypeServiceOuterClass.GetStorageTypeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the list of available storage types.
     * </pre>
     */
    public yandex.cloud.api.ydb.v1.StorageTypeServiceOuterClass.ListStorageTypesResponse list(yandex.cloud.api.ydb.v1.StorageTypeServiceOuterClass.ListStorageTypesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class StorageTypeServiceFutureStub extends io.grpc.stub.AbstractFutureStub<StorageTypeServiceFutureStub> {
    private StorageTypeServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StorageTypeServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StorageTypeServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified storage types.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ydb.v1.StorageTypeOuterClass.StorageType> get(
        yandex.cloud.api.ydb.v1.StorageTypeServiceOuterClass.GetStorageTypeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the list of available storage types.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ydb.v1.StorageTypeServiceOuterClass.ListStorageTypesResponse> list(
        yandex.cloud.api.ydb.v1.StorageTypeServiceOuterClass.ListStorageTypesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final StorageTypeServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(StorageTypeServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.ydb.v1.StorageTypeServiceOuterClass.GetStorageTypeRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ydb.v1.StorageTypeOuterClass.StorageType>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.ydb.v1.StorageTypeServiceOuterClass.ListStorageTypesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ydb.v1.StorageTypeServiceOuterClass.ListStorageTypesResponse>) responseObserver);
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

  private static abstract class StorageTypeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StorageTypeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.ydb.v1.StorageTypeServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StorageTypeService");
    }
  }

  private static final class StorageTypeServiceFileDescriptorSupplier
      extends StorageTypeServiceBaseDescriptorSupplier {
    StorageTypeServiceFileDescriptorSupplier() {}
  }

  private static final class StorageTypeServiceMethodDescriptorSupplier
      extends StorageTypeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StorageTypeServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (StorageTypeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StorageTypeServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
