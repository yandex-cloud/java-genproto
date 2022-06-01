package yandex.cloud.api.iam.v1.awscompatibility;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing access keys.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/iam/v1/awscompatibility/access_key_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AccessKeyServiceGrpc {

  private AccessKeyServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.iam.v1.awscompatibility.AccessKeyService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.ListAccessKeysRequest,
      yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.ListAccessKeysResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.ListAccessKeysRequest.class,
      responseType = yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.ListAccessKeysResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.ListAccessKeysRequest,
      yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.ListAccessKeysResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.ListAccessKeysRequest, yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.ListAccessKeysResponse> getListMethod;
    if ((getListMethod = AccessKeyServiceGrpc.getListMethod) == null) {
      synchronized (AccessKeyServiceGrpc.class) {
        if ((getListMethod = AccessKeyServiceGrpc.getListMethod) == null) {
          AccessKeyServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.ListAccessKeysRequest, yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.ListAccessKeysResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.ListAccessKeysRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.ListAccessKeysResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccessKeyServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.GetAccessKeyRequest,
      yandex.cloud.api.iam.v1.awscompatibility.AccessKeyOuterClass.AccessKey> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.GetAccessKeyRequest.class,
      responseType = yandex.cloud.api.iam.v1.awscompatibility.AccessKeyOuterClass.AccessKey.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.GetAccessKeyRequest,
      yandex.cloud.api.iam.v1.awscompatibility.AccessKeyOuterClass.AccessKey> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.GetAccessKeyRequest, yandex.cloud.api.iam.v1.awscompatibility.AccessKeyOuterClass.AccessKey> getGetMethod;
    if ((getGetMethod = AccessKeyServiceGrpc.getGetMethod) == null) {
      synchronized (AccessKeyServiceGrpc.class) {
        if ((getGetMethod = AccessKeyServiceGrpc.getGetMethod) == null) {
          AccessKeyServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.GetAccessKeyRequest, yandex.cloud.api.iam.v1.awscompatibility.AccessKeyOuterClass.AccessKey>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.GetAccessKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.awscompatibility.AccessKeyOuterClass.AccessKey.getDefaultInstance()))
              .setSchemaDescriptor(new AccessKeyServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.CreateAccessKeyRequest,
      yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.CreateAccessKeyResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.CreateAccessKeyRequest.class,
      responseType = yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.CreateAccessKeyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.CreateAccessKeyRequest,
      yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.CreateAccessKeyResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.CreateAccessKeyRequest, yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.CreateAccessKeyResponse> getCreateMethod;
    if ((getCreateMethod = AccessKeyServiceGrpc.getCreateMethod) == null) {
      synchronized (AccessKeyServiceGrpc.class) {
        if ((getCreateMethod = AccessKeyServiceGrpc.getCreateMethod) == null) {
          AccessKeyServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.CreateAccessKeyRequest, yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.CreateAccessKeyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.CreateAccessKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.CreateAccessKeyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccessKeyServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.UpdateAccessKeyRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.UpdateAccessKeyRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.UpdateAccessKeyRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.UpdateAccessKeyRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = AccessKeyServiceGrpc.getUpdateMethod) == null) {
      synchronized (AccessKeyServiceGrpc.class) {
        if ((getUpdateMethod = AccessKeyServiceGrpc.getUpdateMethod) == null) {
          AccessKeyServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.UpdateAccessKeyRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.UpdateAccessKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new AccessKeyServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.DeleteAccessKeyRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.DeleteAccessKeyRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.DeleteAccessKeyRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.DeleteAccessKeyRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = AccessKeyServiceGrpc.getDeleteMethod) == null) {
      synchronized (AccessKeyServiceGrpc.class) {
        if ((getDeleteMethod = AccessKeyServiceGrpc.getDeleteMethod) == null) {
          AccessKeyServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.DeleteAccessKeyRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.DeleteAccessKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new AccessKeyServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.ListAccessKeyOperationsRequest,
      yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.ListAccessKeyOperationsResponse> getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.ListAccessKeyOperationsRequest.class,
      responseType = yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.ListAccessKeyOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.ListAccessKeyOperationsRequest,
      yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.ListAccessKeyOperationsResponse> getListOperationsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.ListAccessKeyOperationsRequest, yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.ListAccessKeyOperationsResponse> getListOperationsMethod;
    if ((getListOperationsMethod = AccessKeyServiceGrpc.getListOperationsMethod) == null) {
      synchronized (AccessKeyServiceGrpc.class) {
        if ((getListOperationsMethod = AccessKeyServiceGrpc.getListOperationsMethod) == null) {
          AccessKeyServiceGrpc.getListOperationsMethod = getListOperationsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.ListAccessKeyOperationsRequest, yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.ListAccessKeyOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.ListAccessKeyOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.ListAccessKeyOperationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccessKeyServiceMethodDescriptorSupplier("ListOperations"))
              .build();
        }
      }
    }
    return getListOperationsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AccessKeyServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccessKeyServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccessKeyServiceStub>() {
        @java.lang.Override
        public AccessKeyServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccessKeyServiceStub(channel, callOptions);
        }
      };
    return AccessKeyServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AccessKeyServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccessKeyServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccessKeyServiceBlockingStub>() {
        @java.lang.Override
        public AccessKeyServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccessKeyServiceBlockingStub(channel, callOptions);
        }
      };
    return AccessKeyServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AccessKeyServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccessKeyServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccessKeyServiceFutureStub>() {
        @java.lang.Override
        public AccessKeyServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccessKeyServiceFutureStub(channel, callOptions);
        }
      };
    return AccessKeyServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing access keys.
   * </pre>
   */
  public static abstract class AccessKeyServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Retrieves the list of access keys for the specified service account.
     * </pre>
     */
    public void list(yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.ListAccessKeysRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.ListAccessKeysResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the specified access key.
     * To get the list of available access keys, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.GetAccessKeyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.awscompatibility.AccessKeyOuterClass.AccessKey> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates an access key for the specified service account.
     * </pre>
     */
    public void create(yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.CreateAccessKeyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.CreateAccessKeyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified access key.
     * </pre>
     */
    public void update(yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.UpdateAccessKeyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified access key.
     * </pre>
     */
    public void delete(yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.DeleteAccessKeyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of operations for the specified access key.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.ListAccessKeyOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.ListAccessKeyOperationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.ListAccessKeysRequest,
                yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.ListAccessKeysResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.GetAccessKeyRequest,
                yandex.cloud.api.iam.v1.awscompatibility.AccessKeyOuterClass.AccessKey>(
                  this, METHODID_GET)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.CreateAccessKeyRequest,
                yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.CreateAccessKeyResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.UpdateAccessKeyRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.DeleteAccessKeyRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListOperationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.ListAccessKeyOperationsRequest,
                yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.ListAccessKeyOperationsResponse>(
                  this, METHODID_LIST_OPERATIONS)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing access keys.
   * </pre>
   */
  public static final class AccessKeyServiceStub extends io.grpc.stub.AbstractAsyncStub<AccessKeyServiceStub> {
    private AccessKeyServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccessKeyServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccessKeyServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves the list of access keys for the specified service account.
     * </pre>
     */
    public void list(yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.ListAccessKeysRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.ListAccessKeysResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the specified access key.
     * To get the list of available access keys, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.GetAccessKeyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.awscompatibility.AccessKeyOuterClass.AccessKey> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates an access key for the specified service account.
     * </pre>
     */
    public void create(yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.CreateAccessKeyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.CreateAccessKeyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified access key.
     * </pre>
     */
    public void update(yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.UpdateAccessKeyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified access key.
     * </pre>
     */
    public void delete(yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.DeleteAccessKeyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of operations for the specified access key.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.ListAccessKeyOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.ListAccessKeyOperationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing access keys.
   * </pre>
   */
  public static final class AccessKeyServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AccessKeyServiceBlockingStub> {
    private AccessKeyServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccessKeyServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccessKeyServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves the list of access keys for the specified service account.
     * </pre>
     */
    public yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.ListAccessKeysResponse list(yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.ListAccessKeysRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the specified access key.
     * To get the list of available access keys, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.iam.v1.awscompatibility.AccessKeyOuterClass.AccessKey get(yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.GetAccessKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates an access key for the specified service account.
     * </pre>
     */
    public yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.CreateAccessKeyResponse create(yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.CreateAccessKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified access key.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.UpdateAccessKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified access key.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.DeleteAccessKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of operations for the specified access key.
     * </pre>
     */
    public yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.ListAccessKeyOperationsResponse listOperations(yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.ListAccessKeyOperationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing access keys.
   * </pre>
   */
  public static final class AccessKeyServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AccessKeyServiceFutureStub> {
    private AccessKeyServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccessKeyServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccessKeyServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves the list of access keys for the specified service account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.ListAccessKeysResponse> list(
        yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.ListAccessKeysRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the specified access key.
     * To get the list of available access keys, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.iam.v1.awscompatibility.AccessKeyOuterClass.AccessKey> get(
        yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.GetAccessKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates an access key for the specified service account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.CreateAccessKeyResponse> create(
        yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.CreateAccessKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified access key.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.UpdateAccessKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified access key.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.DeleteAccessKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of operations for the specified access key.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.ListAccessKeyOperationsResponse> listOperations(
        yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.ListAccessKeyOperationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST = 0;
  private static final int METHODID_GET = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_DELETE = 4;
  private static final int METHODID_LIST_OPERATIONS = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AccessKeyServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AccessKeyServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.ListAccessKeysRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.ListAccessKeysResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.GetAccessKeyRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.awscompatibility.AccessKeyOuterClass.AccessKey>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.CreateAccessKeyRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.CreateAccessKeyResponse>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.UpdateAccessKeyRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.DeleteAccessKeyRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.ListAccessKeyOperationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.ListAccessKeyOperationsResponse>) responseObserver);
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

  private static abstract class AccessKeyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AccessKeyServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.iam.v1.awscompatibility.AccessKeyServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AccessKeyService");
    }
  }

  private static final class AccessKeyServiceFileDescriptorSupplier
      extends AccessKeyServiceBaseDescriptorSupplier {
    AccessKeyServiceFileDescriptorSupplier() {}
  }

  private static final class AccessKeyServiceMethodDescriptorSupplier
      extends AccessKeyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AccessKeyServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AccessKeyServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AccessKeyServiceFileDescriptorSupplier())
              .addMethod(getListMethod())
              .addMethod(getGetMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getListOperationsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
