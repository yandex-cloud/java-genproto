package yandex.cloud.api.containerregistry.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing scan policy resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/containerregistry/v1/scan_policy_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ScanPolicyServiceGrpc {

  private ScanPolicyServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.containerregistry.v1.ScanPolicyService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.ScanPolicyServiceOuterClass.GetScanPolicyRequest,
      yandex.cloud.api.containerregistry.v1.ScanPolicyOuterClass.ScanPolicy> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.containerregistry.v1.ScanPolicyServiceOuterClass.GetScanPolicyRequest.class,
      responseType = yandex.cloud.api.containerregistry.v1.ScanPolicyOuterClass.ScanPolicy.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.ScanPolicyServiceOuterClass.GetScanPolicyRequest,
      yandex.cloud.api.containerregistry.v1.ScanPolicyOuterClass.ScanPolicy> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.ScanPolicyServiceOuterClass.GetScanPolicyRequest, yandex.cloud.api.containerregistry.v1.ScanPolicyOuterClass.ScanPolicy> getGetMethod;
    if ((getGetMethod = ScanPolicyServiceGrpc.getGetMethod) == null) {
      synchronized (ScanPolicyServiceGrpc.class) {
        if ((getGetMethod = ScanPolicyServiceGrpc.getGetMethod) == null) {
          ScanPolicyServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.containerregistry.v1.ScanPolicyServiceOuterClass.GetScanPolicyRequest, yandex.cloud.api.containerregistry.v1.ScanPolicyOuterClass.ScanPolicy>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.containerregistry.v1.ScanPolicyServiceOuterClass.GetScanPolicyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.containerregistry.v1.ScanPolicyOuterClass.ScanPolicy.getDefaultInstance()))
              .setSchemaDescriptor(new ScanPolicyServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.ScanPolicyServiceOuterClass.GetScanPolicyByRegistryRequest,
      yandex.cloud.api.containerregistry.v1.ScanPolicyOuterClass.ScanPolicy> getGetByRegistryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetByRegistry",
      requestType = yandex.cloud.api.containerregistry.v1.ScanPolicyServiceOuterClass.GetScanPolicyByRegistryRequest.class,
      responseType = yandex.cloud.api.containerregistry.v1.ScanPolicyOuterClass.ScanPolicy.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.ScanPolicyServiceOuterClass.GetScanPolicyByRegistryRequest,
      yandex.cloud.api.containerregistry.v1.ScanPolicyOuterClass.ScanPolicy> getGetByRegistryMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.ScanPolicyServiceOuterClass.GetScanPolicyByRegistryRequest, yandex.cloud.api.containerregistry.v1.ScanPolicyOuterClass.ScanPolicy> getGetByRegistryMethod;
    if ((getGetByRegistryMethod = ScanPolicyServiceGrpc.getGetByRegistryMethod) == null) {
      synchronized (ScanPolicyServiceGrpc.class) {
        if ((getGetByRegistryMethod = ScanPolicyServiceGrpc.getGetByRegistryMethod) == null) {
          ScanPolicyServiceGrpc.getGetByRegistryMethod = getGetByRegistryMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.containerregistry.v1.ScanPolicyServiceOuterClass.GetScanPolicyByRegistryRequest, yandex.cloud.api.containerregistry.v1.ScanPolicyOuterClass.ScanPolicy>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetByRegistry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.containerregistry.v1.ScanPolicyServiceOuterClass.GetScanPolicyByRegistryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.containerregistry.v1.ScanPolicyOuterClass.ScanPolicy.getDefaultInstance()))
              .setSchemaDescriptor(new ScanPolicyServiceMethodDescriptorSupplier("GetByRegistry"))
              .build();
        }
      }
    }
    return getGetByRegistryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.ScanPolicyServiceOuterClass.CreateScanPolicyRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.containerregistry.v1.ScanPolicyServiceOuterClass.CreateScanPolicyRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.ScanPolicyServiceOuterClass.CreateScanPolicyRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.ScanPolicyServiceOuterClass.CreateScanPolicyRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = ScanPolicyServiceGrpc.getCreateMethod) == null) {
      synchronized (ScanPolicyServiceGrpc.class) {
        if ((getCreateMethod = ScanPolicyServiceGrpc.getCreateMethod) == null) {
          ScanPolicyServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.containerregistry.v1.ScanPolicyServiceOuterClass.CreateScanPolicyRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.containerregistry.v1.ScanPolicyServiceOuterClass.CreateScanPolicyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ScanPolicyServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.ScanPolicyServiceOuterClass.UpdateScanPolicyRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.containerregistry.v1.ScanPolicyServiceOuterClass.UpdateScanPolicyRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.ScanPolicyServiceOuterClass.UpdateScanPolicyRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.ScanPolicyServiceOuterClass.UpdateScanPolicyRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = ScanPolicyServiceGrpc.getUpdateMethod) == null) {
      synchronized (ScanPolicyServiceGrpc.class) {
        if ((getUpdateMethod = ScanPolicyServiceGrpc.getUpdateMethod) == null) {
          ScanPolicyServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.containerregistry.v1.ScanPolicyServiceOuterClass.UpdateScanPolicyRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.containerregistry.v1.ScanPolicyServiceOuterClass.UpdateScanPolicyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ScanPolicyServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.ScanPolicyServiceOuterClass.DeleteScanPolicyRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.containerregistry.v1.ScanPolicyServiceOuterClass.DeleteScanPolicyRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.ScanPolicyServiceOuterClass.DeleteScanPolicyRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.ScanPolicyServiceOuterClass.DeleteScanPolicyRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = ScanPolicyServiceGrpc.getDeleteMethod) == null) {
      synchronized (ScanPolicyServiceGrpc.class) {
        if ((getDeleteMethod = ScanPolicyServiceGrpc.getDeleteMethod) == null) {
          ScanPolicyServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.containerregistry.v1.ScanPolicyServiceOuterClass.DeleteScanPolicyRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.containerregistry.v1.ScanPolicyServiceOuterClass.DeleteScanPolicyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ScanPolicyServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ScanPolicyServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ScanPolicyServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ScanPolicyServiceStub>() {
        @java.lang.Override
        public ScanPolicyServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ScanPolicyServiceStub(channel, callOptions);
        }
      };
    return ScanPolicyServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ScanPolicyServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ScanPolicyServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ScanPolicyServiceBlockingStub>() {
        @java.lang.Override
        public ScanPolicyServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ScanPolicyServiceBlockingStub(channel, callOptions);
        }
      };
    return ScanPolicyServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ScanPolicyServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ScanPolicyServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ScanPolicyServiceFutureStub>() {
        @java.lang.Override
        public ScanPolicyServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ScanPolicyServiceFutureStub(channel, callOptions);
        }
      };
    return ScanPolicyServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing scan policy resources.
   * </pre>
   */
  public static abstract class ScanPolicyServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified scan policy.
     * </pre>
     */
    public void get(yandex.cloud.api.containerregistry.v1.ScanPolicyServiceOuterClass.GetScanPolicyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.containerregistry.v1.ScanPolicyOuterClass.ScanPolicy> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns scan policy for the registry if any exists.
     * </pre>
     */
    public void getByRegistry(yandex.cloud.api.containerregistry.v1.ScanPolicyServiceOuterClass.GetScanPolicyByRegistryRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.containerregistry.v1.ScanPolicyOuterClass.ScanPolicy> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetByRegistryMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a scan policy for the specified registry.
     * </pre>
     */
    public void create(yandex.cloud.api.containerregistry.v1.ScanPolicyServiceOuterClass.CreateScanPolicyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified scan policy.
     * </pre>
     */
    public void update(yandex.cloud.api.containerregistry.v1.ScanPolicyServiceOuterClass.UpdateScanPolicyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified scan policy.
     * </pre>
     */
    public void delete(yandex.cloud.api.containerregistry.v1.ScanPolicyServiceOuterClass.DeleteScanPolicyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.containerregistry.v1.ScanPolicyServiceOuterClass.GetScanPolicyRequest,
                yandex.cloud.api.containerregistry.v1.ScanPolicyOuterClass.ScanPolicy>(
                  this, METHODID_GET)))
          .addMethod(
            getGetByRegistryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.containerregistry.v1.ScanPolicyServiceOuterClass.GetScanPolicyByRegistryRequest,
                yandex.cloud.api.containerregistry.v1.ScanPolicyOuterClass.ScanPolicy>(
                  this, METHODID_GET_BY_REGISTRY)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.containerregistry.v1.ScanPolicyServiceOuterClass.CreateScanPolicyRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.containerregistry.v1.ScanPolicyServiceOuterClass.UpdateScanPolicyRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.containerregistry.v1.ScanPolicyServiceOuterClass.DeleteScanPolicyRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing scan policy resources.
   * </pre>
   */
  public static final class ScanPolicyServiceStub extends io.grpc.stub.AbstractAsyncStub<ScanPolicyServiceStub> {
    private ScanPolicyServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ScanPolicyServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ScanPolicyServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified scan policy.
     * </pre>
     */
    public void get(yandex.cloud.api.containerregistry.v1.ScanPolicyServiceOuterClass.GetScanPolicyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.containerregistry.v1.ScanPolicyOuterClass.ScanPolicy> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns scan policy for the registry if any exists.
     * </pre>
     */
    public void getByRegistry(yandex.cloud.api.containerregistry.v1.ScanPolicyServiceOuterClass.GetScanPolicyByRegistryRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.containerregistry.v1.ScanPolicyOuterClass.ScanPolicy> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetByRegistryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a scan policy for the specified registry.
     * </pre>
     */
    public void create(yandex.cloud.api.containerregistry.v1.ScanPolicyServiceOuterClass.CreateScanPolicyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified scan policy.
     * </pre>
     */
    public void update(yandex.cloud.api.containerregistry.v1.ScanPolicyServiceOuterClass.UpdateScanPolicyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified scan policy.
     * </pre>
     */
    public void delete(yandex.cloud.api.containerregistry.v1.ScanPolicyServiceOuterClass.DeleteScanPolicyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing scan policy resources.
   * </pre>
   */
  public static final class ScanPolicyServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ScanPolicyServiceBlockingStub> {
    private ScanPolicyServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ScanPolicyServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ScanPolicyServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified scan policy.
     * </pre>
     */
    public yandex.cloud.api.containerregistry.v1.ScanPolicyOuterClass.ScanPolicy get(yandex.cloud.api.containerregistry.v1.ScanPolicyServiceOuterClass.GetScanPolicyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns scan policy for the registry if any exists.
     * </pre>
     */
    public yandex.cloud.api.containerregistry.v1.ScanPolicyOuterClass.ScanPolicy getByRegistry(yandex.cloud.api.containerregistry.v1.ScanPolicyServiceOuterClass.GetScanPolicyByRegistryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetByRegistryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a scan policy for the specified registry.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.containerregistry.v1.ScanPolicyServiceOuterClass.CreateScanPolicyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified scan policy.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.containerregistry.v1.ScanPolicyServiceOuterClass.UpdateScanPolicyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified scan policy.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.containerregistry.v1.ScanPolicyServiceOuterClass.DeleteScanPolicyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing scan policy resources.
   * </pre>
   */
  public static final class ScanPolicyServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ScanPolicyServiceFutureStub> {
    private ScanPolicyServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ScanPolicyServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ScanPolicyServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified scan policy.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.containerregistry.v1.ScanPolicyOuterClass.ScanPolicy> get(
        yandex.cloud.api.containerregistry.v1.ScanPolicyServiceOuterClass.GetScanPolicyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns scan policy for the registry if any exists.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.containerregistry.v1.ScanPolicyOuterClass.ScanPolicy> getByRegistry(
        yandex.cloud.api.containerregistry.v1.ScanPolicyServiceOuterClass.GetScanPolicyByRegistryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetByRegistryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a scan policy for the specified registry.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.containerregistry.v1.ScanPolicyServiceOuterClass.CreateScanPolicyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified scan policy.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.containerregistry.v1.ScanPolicyServiceOuterClass.UpdateScanPolicyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified scan policy.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.containerregistry.v1.ScanPolicyServiceOuterClass.DeleteScanPolicyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_GET_BY_REGISTRY = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_DELETE = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ScanPolicyServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ScanPolicyServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.containerregistry.v1.ScanPolicyServiceOuterClass.GetScanPolicyRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.containerregistry.v1.ScanPolicyOuterClass.ScanPolicy>) responseObserver);
          break;
        case METHODID_GET_BY_REGISTRY:
          serviceImpl.getByRegistry((yandex.cloud.api.containerregistry.v1.ScanPolicyServiceOuterClass.GetScanPolicyByRegistryRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.containerregistry.v1.ScanPolicyOuterClass.ScanPolicy>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.containerregistry.v1.ScanPolicyServiceOuterClass.CreateScanPolicyRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.containerregistry.v1.ScanPolicyServiceOuterClass.UpdateScanPolicyRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.containerregistry.v1.ScanPolicyServiceOuterClass.DeleteScanPolicyRequest) request,
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

  private static abstract class ScanPolicyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ScanPolicyServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.containerregistry.v1.ScanPolicyServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ScanPolicyService");
    }
  }

  private static final class ScanPolicyServiceFileDescriptorSupplier
      extends ScanPolicyServiceBaseDescriptorSupplier {
    ScanPolicyServiceFileDescriptorSupplier() {}
  }

  private static final class ScanPolicyServiceMethodDescriptorSupplier
      extends ScanPolicyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ScanPolicyServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ScanPolicyServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ScanPolicyServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getGetByRegistryMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
