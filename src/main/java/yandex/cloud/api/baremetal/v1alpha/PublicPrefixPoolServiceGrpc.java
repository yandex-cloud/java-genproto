package yandex.cloud.api.baremetal.v1alpha;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/baremetal/v1alpha/public_prefix_pool_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PublicPrefixPoolServiceGrpc {

  private PublicPrefixPoolServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.baremetal.v1alpha.PublicPrefixPoolService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolServiceOuterClass.GetPublicPrefixPoolRequest,
      yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolOuterClass.PublicPrefixPool> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolServiceOuterClass.GetPublicPrefixPoolRequest.class,
      responseType = yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolOuterClass.PublicPrefixPool.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolServiceOuterClass.GetPublicPrefixPoolRequest,
      yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolOuterClass.PublicPrefixPool> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolServiceOuterClass.GetPublicPrefixPoolRequest, yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolOuterClass.PublicPrefixPool> getGetMethod;
    if ((getGetMethod = PublicPrefixPoolServiceGrpc.getGetMethod) == null) {
      synchronized (PublicPrefixPoolServiceGrpc.class) {
        if ((getGetMethod = PublicPrefixPoolServiceGrpc.getGetMethod) == null) {
          PublicPrefixPoolServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolServiceOuterClass.GetPublicPrefixPoolRequest, yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolOuterClass.PublicPrefixPool>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolServiceOuterClass.GetPublicPrefixPoolRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolOuterClass.PublicPrefixPool.getDefaultInstance()))
              .setSchemaDescriptor(new PublicPrefixPoolServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolServiceOuterClass.ListPublicPrefixPoolRequest,
      yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolServiceOuterClass.ListPublicPrefixPoolResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolServiceOuterClass.ListPublicPrefixPoolRequest.class,
      responseType = yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolServiceOuterClass.ListPublicPrefixPoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolServiceOuterClass.ListPublicPrefixPoolRequest,
      yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolServiceOuterClass.ListPublicPrefixPoolResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolServiceOuterClass.ListPublicPrefixPoolRequest, yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolServiceOuterClass.ListPublicPrefixPoolResponse> getListMethod;
    if ((getListMethod = PublicPrefixPoolServiceGrpc.getListMethod) == null) {
      synchronized (PublicPrefixPoolServiceGrpc.class) {
        if ((getListMethod = PublicPrefixPoolServiceGrpc.getListMethod) == null) {
          PublicPrefixPoolServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolServiceOuterClass.ListPublicPrefixPoolRequest, yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolServiceOuterClass.ListPublicPrefixPoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolServiceOuterClass.ListPublicPrefixPoolRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolServiceOuterClass.ListPublicPrefixPoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PublicPrefixPoolServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolServiceOuterClass.UpdatePublicPrefixPoolRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolServiceOuterClass.UpdatePublicPrefixPoolRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolServiceOuterClass.UpdatePublicPrefixPoolRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolServiceOuterClass.UpdatePublicPrefixPoolRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = PublicPrefixPoolServiceGrpc.getUpdateMethod) == null) {
      synchronized (PublicPrefixPoolServiceGrpc.class) {
        if ((getUpdateMethod = PublicPrefixPoolServiceGrpc.getUpdateMethod) == null) {
          PublicPrefixPoolServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolServiceOuterClass.UpdatePublicPrefixPoolRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolServiceOuterClass.UpdatePublicPrefixPoolRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new PublicPrefixPoolServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolServiceOuterClass.ListPublicPrefixPoolOperationsRequest,
      yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolServiceOuterClass.ListPublicPrefixPoolOperationsResponse> getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolServiceOuterClass.ListPublicPrefixPoolOperationsRequest.class,
      responseType = yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolServiceOuterClass.ListPublicPrefixPoolOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolServiceOuterClass.ListPublicPrefixPoolOperationsRequest,
      yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolServiceOuterClass.ListPublicPrefixPoolOperationsResponse> getListOperationsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolServiceOuterClass.ListPublicPrefixPoolOperationsRequest, yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolServiceOuterClass.ListPublicPrefixPoolOperationsResponse> getListOperationsMethod;
    if ((getListOperationsMethod = PublicPrefixPoolServiceGrpc.getListOperationsMethod) == null) {
      synchronized (PublicPrefixPoolServiceGrpc.class) {
        if ((getListOperationsMethod = PublicPrefixPoolServiceGrpc.getListOperationsMethod) == null) {
          PublicPrefixPoolServiceGrpc.getListOperationsMethod = getListOperationsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolServiceOuterClass.ListPublicPrefixPoolOperationsRequest, yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolServiceOuterClass.ListPublicPrefixPoolOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolServiceOuterClass.ListPublicPrefixPoolOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolServiceOuterClass.ListPublicPrefixPoolOperationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PublicPrefixPoolServiceMethodDescriptorSupplier("ListOperations"))
              .build();
        }
      }
    }
    return getListOperationsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PublicPrefixPoolServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PublicPrefixPoolServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PublicPrefixPoolServiceStub>() {
        @java.lang.Override
        public PublicPrefixPoolServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PublicPrefixPoolServiceStub(channel, callOptions);
        }
      };
    return PublicPrefixPoolServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PublicPrefixPoolServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PublicPrefixPoolServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PublicPrefixPoolServiceBlockingStub>() {
        @java.lang.Override
        public PublicPrefixPoolServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PublicPrefixPoolServiceBlockingStub(channel, callOptions);
        }
      };
    return PublicPrefixPoolServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PublicPrefixPoolServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PublicPrefixPoolServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PublicPrefixPoolServiceFutureStub>() {
        @java.lang.Override
        public PublicPrefixPoolServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PublicPrefixPoolServiceFutureStub(channel, callOptions);
        }
      };
    return PublicPrefixPoolServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class PublicPrefixPoolServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified public prefix pool.
     * </pre>
     */
    public void get(yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolServiceOuterClass.GetPublicPrefixPoolRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolOuterClass.PublicPrefixPool> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists public prefix pools in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolServiceOuterClass.ListPublicPrefixPoolRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolServiceOuterClass.ListPublicPrefixPoolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified public prefix pool.
     * </pre>
     */
    public void update(yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolServiceOuterClass.UpdatePublicPrefixPoolRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified public prefix pool.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolServiceOuterClass.ListPublicPrefixPoolOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolServiceOuterClass.ListPublicPrefixPoolOperationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolServiceOuterClass.GetPublicPrefixPoolRequest,
                yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolOuterClass.PublicPrefixPool>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolServiceOuterClass.ListPublicPrefixPoolRequest,
                yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolServiceOuterClass.ListPublicPrefixPoolResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolServiceOuterClass.UpdatePublicPrefixPoolRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getListOperationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolServiceOuterClass.ListPublicPrefixPoolOperationsRequest,
                yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolServiceOuterClass.ListPublicPrefixPoolOperationsResponse>(
                  this, METHODID_LIST_OPERATIONS)))
          .build();
    }
  }

  /**
   */
  public static final class PublicPrefixPoolServiceStub extends io.grpc.stub.AbstractAsyncStub<PublicPrefixPoolServiceStub> {
    private PublicPrefixPoolServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PublicPrefixPoolServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PublicPrefixPoolServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified public prefix pool.
     * </pre>
     */
    public void get(yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolServiceOuterClass.GetPublicPrefixPoolRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolOuterClass.PublicPrefixPool> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists public prefix pools in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolServiceOuterClass.ListPublicPrefixPoolRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolServiceOuterClass.ListPublicPrefixPoolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified public prefix pool.
     * </pre>
     */
    public void update(yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolServiceOuterClass.UpdatePublicPrefixPoolRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified public prefix pool.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolServiceOuterClass.ListPublicPrefixPoolOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolServiceOuterClass.ListPublicPrefixPoolOperationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PublicPrefixPoolServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<PublicPrefixPoolServiceBlockingStub> {
    private PublicPrefixPoolServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PublicPrefixPoolServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PublicPrefixPoolServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified public prefix pool.
     * </pre>
     */
    public yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolOuterClass.PublicPrefixPool get(yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolServiceOuterClass.GetPublicPrefixPoolRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists public prefix pools in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolServiceOuterClass.ListPublicPrefixPoolResponse list(yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolServiceOuterClass.ListPublicPrefixPoolRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified public prefix pool.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolServiceOuterClass.UpdatePublicPrefixPoolRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists operations for the specified public prefix pool.
     * </pre>
     */
    public yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolServiceOuterClass.ListPublicPrefixPoolOperationsResponse listOperations(yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolServiceOuterClass.ListPublicPrefixPoolOperationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PublicPrefixPoolServiceFutureStub extends io.grpc.stub.AbstractFutureStub<PublicPrefixPoolServiceFutureStub> {
    private PublicPrefixPoolServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PublicPrefixPoolServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PublicPrefixPoolServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified public prefix pool.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolOuterClass.PublicPrefixPool> get(
        yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolServiceOuterClass.GetPublicPrefixPoolRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists public prefix pools in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolServiceOuterClass.ListPublicPrefixPoolResponse> list(
        yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolServiceOuterClass.ListPublicPrefixPoolRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified public prefix pool.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolServiceOuterClass.UpdatePublicPrefixPoolRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists operations for the specified public prefix pool.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolServiceOuterClass.ListPublicPrefixPoolOperationsResponse> listOperations(
        yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolServiceOuterClass.ListPublicPrefixPoolOperationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_UPDATE = 2;
  private static final int METHODID_LIST_OPERATIONS = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PublicPrefixPoolServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PublicPrefixPoolServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolServiceOuterClass.GetPublicPrefixPoolRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolOuterClass.PublicPrefixPool>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolServiceOuterClass.ListPublicPrefixPoolRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolServiceOuterClass.ListPublicPrefixPoolResponse>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolServiceOuterClass.UpdatePublicPrefixPoolRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolServiceOuterClass.ListPublicPrefixPoolOperationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolServiceOuterClass.ListPublicPrefixPoolOperationsResponse>) responseObserver);
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

  private static abstract class PublicPrefixPoolServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PublicPrefixPoolServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.baremetal.v1alpha.PublicPrefixPoolServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PublicPrefixPoolService");
    }
  }

  private static final class PublicPrefixPoolServiceFileDescriptorSupplier
      extends PublicPrefixPoolServiceBaseDescriptorSupplier {
    PublicPrefixPoolServiceFileDescriptorSupplier() {}
  }

  private static final class PublicPrefixPoolServiceMethodDescriptorSupplier
      extends PublicPrefixPoolServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PublicPrefixPoolServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PublicPrefixPoolServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PublicPrefixPoolServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getListOperationsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
