package yandex.cloud.api.cloudregistry.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing LifecyclePolicy resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/cloudregistry/v1/lifecycle_policy_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class LifecyclePolicyServiceGrpc {

  private LifecyclePolicyServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.cloudregistry.v1.LifecyclePolicyService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.CreateLifecyclePolicyRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.CreateLifecyclePolicyRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.CreateLifecyclePolicyRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.CreateLifecyclePolicyRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = LifecyclePolicyServiceGrpc.getCreateMethod) == null) {
      synchronized (LifecyclePolicyServiceGrpc.class) {
        if ((getCreateMethod = LifecyclePolicyServiceGrpc.getCreateMethod) == null) {
          LifecyclePolicyServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.CreateLifecyclePolicyRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.CreateLifecyclePolicyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new LifecyclePolicyServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.UpdateLifecyclePolicyRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.UpdateLifecyclePolicyRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.UpdateLifecyclePolicyRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.UpdateLifecyclePolicyRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = LifecyclePolicyServiceGrpc.getUpdateMethod) == null) {
      synchronized (LifecyclePolicyServiceGrpc.class) {
        if ((getUpdateMethod = LifecyclePolicyServiceGrpc.getUpdateMethod) == null) {
          LifecyclePolicyServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.UpdateLifecyclePolicyRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.UpdateLifecyclePolicyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new LifecyclePolicyServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.DeleteLifecyclePolicyRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.DeleteLifecyclePolicyRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.DeleteLifecyclePolicyRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.DeleteLifecyclePolicyRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = LifecyclePolicyServiceGrpc.getDeleteMethod) == null) {
      synchronized (LifecyclePolicyServiceGrpc.class) {
        if ((getDeleteMethod = LifecyclePolicyServiceGrpc.getDeleteMethod) == null) {
          LifecyclePolicyServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.DeleteLifecyclePolicyRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.DeleteLifecyclePolicyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new LifecyclePolicyServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.GetLifecyclePolicyRequest,
      yandex.cloud.api.cloudregistry.v1.LifecyclePolicyOuterClass.LifecyclePolicy> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.GetLifecyclePolicyRequest.class,
      responseType = yandex.cloud.api.cloudregistry.v1.LifecyclePolicyOuterClass.LifecyclePolicy.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.GetLifecyclePolicyRequest,
      yandex.cloud.api.cloudregistry.v1.LifecyclePolicyOuterClass.LifecyclePolicy> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.GetLifecyclePolicyRequest, yandex.cloud.api.cloudregistry.v1.LifecyclePolicyOuterClass.LifecyclePolicy> getGetMethod;
    if ((getGetMethod = LifecyclePolicyServiceGrpc.getGetMethod) == null) {
      synchronized (LifecyclePolicyServiceGrpc.class) {
        if ((getGetMethod = LifecyclePolicyServiceGrpc.getGetMethod) == null) {
          LifecyclePolicyServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.GetLifecyclePolicyRequest, yandex.cloud.api.cloudregistry.v1.LifecyclePolicyOuterClass.LifecyclePolicy>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.GetLifecyclePolicyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cloudregistry.v1.LifecyclePolicyOuterClass.LifecyclePolicy.getDefaultInstance()))
              .setSchemaDescriptor(new LifecyclePolicyServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.ListLifecyclePolicyRequest,
      yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.ListLifecyclePolicyResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.ListLifecyclePolicyRequest.class,
      responseType = yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.ListLifecyclePolicyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.ListLifecyclePolicyRequest,
      yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.ListLifecyclePolicyResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.ListLifecyclePolicyRequest, yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.ListLifecyclePolicyResponse> getListMethod;
    if ((getListMethod = LifecyclePolicyServiceGrpc.getListMethod) == null) {
      synchronized (LifecyclePolicyServiceGrpc.class) {
        if ((getListMethod = LifecyclePolicyServiceGrpc.getListMethod) == null) {
          LifecyclePolicyServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.ListLifecyclePolicyRequest, yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.ListLifecyclePolicyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.ListLifecyclePolicyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.ListLifecyclePolicyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LifecyclePolicyServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.ChangeLifecyclePolicyStateRequest,
      com.google.protobuf.Empty> getChangeStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChangeState",
      requestType = yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.ChangeLifecyclePolicyStateRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.ChangeLifecyclePolicyStateRequest,
      com.google.protobuf.Empty> getChangeStateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.ChangeLifecyclePolicyStateRequest, com.google.protobuf.Empty> getChangeStateMethod;
    if ((getChangeStateMethod = LifecyclePolicyServiceGrpc.getChangeStateMethod) == null) {
      synchronized (LifecyclePolicyServiceGrpc.class) {
        if ((getChangeStateMethod = LifecyclePolicyServiceGrpc.getChangeStateMethod) == null) {
          LifecyclePolicyServiceGrpc.getChangeStateMethod = getChangeStateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.ChangeLifecyclePolicyStateRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ChangeState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.ChangeLifecyclePolicyStateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new LifecyclePolicyServiceMethodDescriptorSupplier("ChangeState"))
              .build();
        }
      }
    }
    return getChangeStateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LifecyclePolicyServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LifecyclePolicyServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LifecyclePolicyServiceStub>() {
        @java.lang.Override
        public LifecyclePolicyServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LifecyclePolicyServiceStub(channel, callOptions);
        }
      };
    return LifecyclePolicyServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LifecyclePolicyServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LifecyclePolicyServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LifecyclePolicyServiceBlockingStub>() {
        @java.lang.Override
        public LifecyclePolicyServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LifecyclePolicyServiceBlockingStub(channel, callOptions);
        }
      };
    return LifecyclePolicyServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LifecyclePolicyServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LifecyclePolicyServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LifecyclePolicyServiceFutureStub>() {
        @java.lang.Override
        public LifecyclePolicyServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LifecyclePolicyServiceFutureStub(channel, callOptions);
        }
      };
    return LifecyclePolicyServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing LifecyclePolicy resources.
   * </pre>
   */
  public static abstract class LifecyclePolicyServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Creates a lifecycle policy in the specified registry.
     * </pre>
     */
    public void create(yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.CreateLifecyclePolicyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified lifecycle policy.
     * </pre>
     */
    public void update(yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.UpdateLifecyclePolicyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified lifecycle policy.
     * </pre>
     */
    public void delete(yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.DeleteLifecyclePolicyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the specified lifecycle policy.
     * </pre>
     */
    public void get(yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.GetLifecyclePolicyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cloudregistry.v1.LifecyclePolicyOuterClass.LifecyclePolicy> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of lifecycle policies in the specified registry.
     * </pre>
     */
    public void list(yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.ListLifecyclePolicyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.ListLifecyclePolicyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Changes the state of the specified lifecycle policy.
     * </pre>
     */
    public void changeState(yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.ChangeLifecyclePolicyStateRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getChangeStateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.CreateLifecyclePolicyRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.UpdateLifecyclePolicyRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.DeleteLifecyclePolicyRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.GetLifecyclePolicyRequest,
                yandex.cloud.api.cloudregistry.v1.LifecyclePolicyOuterClass.LifecyclePolicy>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.ListLifecyclePolicyRequest,
                yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.ListLifecyclePolicyResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getChangeStateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.ChangeLifecyclePolicyStateRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_CHANGE_STATE)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing LifecyclePolicy resources.
   * </pre>
   */
  public static final class LifecyclePolicyServiceStub extends io.grpc.stub.AbstractAsyncStub<LifecyclePolicyServiceStub> {
    private LifecyclePolicyServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LifecyclePolicyServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LifecyclePolicyServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a lifecycle policy in the specified registry.
     * </pre>
     */
    public void create(yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.CreateLifecyclePolicyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified lifecycle policy.
     * </pre>
     */
    public void update(yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.UpdateLifecyclePolicyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified lifecycle policy.
     * </pre>
     */
    public void delete(yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.DeleteLifecyclePolicyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the specified lifecycle policy.
     * </pre>
     */
    public void get(yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.GetLifecyclePolicyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cloudregistry.v1.LifecyclePolicyOuterClass.LifecyclePolicy> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of lifecycle policies in the specified registry.
     * </pre>
     */
    public void list(yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.ListLifecyclePolicyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.ListLifecyclePolicyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Changes the state of the specified lifecycle policy.
     * </pre>
     */
    public void changeState(yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.ChangeLifecyclePolicyStateRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getChangeStateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing LifecyclePolicy resources.
   * </pre>
   */
  public static final class LifecyclePolicyServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<LifecyclePolicyServiceBlockingStub> {
    private LifecyclePolicyServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LifecyclePolicyServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LifecyclePolicyServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a lifecycle policy in the specified registry.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.CreateLifecyclePolicyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified lifecycle policy.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.UpdateLifecyclePolicyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified lifecycle policy.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.DeleteLifecyclePolicyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the specified lifecycle policy.
     * </pre>
     */
    public yandex.cloud.api.cloudregistry.v1.LifecyclePolicyOuterClass.LifecyclePolicy get(yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.GetLifecyclePolicyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of lifecycle policies in the specified registry.
     * </pre>
     */
    public yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.ListLifecyclePolicyResponse list(yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.ListLifecyclePolicyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Changes the state of the specified lifecycle policy.
     * </pre>
     */
    public com.google.protobuf.Empty changeState(yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.ChangeLifecyclePolicyStateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getChangeStateMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing LifecyclePolicy resources.
   * </pre>
   */
  public static final class LifecyclePolicyServiceFutureStub extends io.grpc.stub.AbstractFutureStub<LifecyclePolicyServiceFutureStub> {
    private LifecyclePolicyServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LifecyclePolicyServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LifecyclePolicyServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a lifecycle policy in the specified registry.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.CreateLifecyclePolicyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified lifecycle policy.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.UpdateLifecyclePolicyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified lifecycle policy.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.DeleteLifecyclePolicyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the specified lifecycle policy.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.cloudregistry.v1.LifecyclePolicyOuterClass.LifecyclePolicy> get(
        yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.GetLifecyclePolicyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of lifecycle policies in the specified registry.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.ListLifecyclePolicyResponse> list(
        yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.ListLifecyclePolicyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Changes the state of the specified lifecycle policy.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> changeState(
        yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.ChangeLifecyclePolicyStateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getChangeStateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_UPDATE = 1;
  private static final int METHODID_DELETE = 2;
  private static final int METHODID_GET = 3;
  private static final int METHODID_LIST = 4;
  private static final int METHODID_CHANGE_STATE = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LifecyclePolicyServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LifecyclePolicyServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.CreateLifecyclePolicyRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.UpdateLifecyclePolicyRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.DeleteLifecyclePolicyRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.GetLifecyclePolicyRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.cloudregistry.v1.LifecyclePolicyOuterClass.LifecyclePolicy>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.ListLifecyclePolicyRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.ListLifecyclePolicyResponse>) responseObserver);
          break;
        case METHODID_CHANGE_STATE:
          serviceImpl.changeState((yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.ChangeLifecyclePolicyStateRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
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

  private static abstract class LifecyclePolicyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LifecyclePolicyServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.cloudregistry.v1.LifecyclePolicyServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LifecyclePolicyService");
    }
  }

  private static final class LifecyclePolicyServiceFileDescriptorSupplier
      extends LifecyclePolicyServiceBaseDescriptorSupplier {
    LifecyclePolicyServiceFileDescriptorSupplier() {}
  }

  private static final class LifecyclePolicyServiceMethodDescriptorSupplier
      extends LifecyclePolicyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LifecyclePolicyServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (LifecyclePolicyServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LifecyclePolicyServiceFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getChangeStateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
