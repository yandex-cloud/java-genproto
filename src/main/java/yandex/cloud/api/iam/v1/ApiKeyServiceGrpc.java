package yandex.cloud.api.iam.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing API keys.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/iam/v1/api_key_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ApiKeyServiceGrpc {

  private ApiKeyServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.iam.v1.ApiKeyService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.ListApiKeysRequest,
      yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.ListApiKeysResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.ListApiKeysRequest.class,
      responseType = yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.ListApiKeysResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.ListApiKeysRequest,
      yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.ListApiKeysResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.ListApiKeysRequest, yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.ListApiKeysResponse> getListMethod;
    if ((getListMethod = ApiKeyServiceGrpc.getListMethod) == null) {
      synchronized (ApiKeyServiceGrpc.class) {
        if ((getListMethod = ApiKeyServiceGrpc.getListMethod) == null) {
          ApiKeyServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.ListApiKeysRequest, yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.ListApiKeysResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.ListApiKeysRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.ListApiKeysResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiKeyServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.GetApiKeyRequest,
      yandex.cloud.api.iam.v1.ApiKeyOuterClass.ApiKey> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.GetApiKeyRequest.class,
      responseType = yandex.cloud.api.iam.v1.ApiKeyOuterClass.ApiKey.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.GetApiKeyRequest,
      yandex.cloud.api.iam.v1.ApiKeyOuterClass.ApiKey> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.GetApiKeyRequest, yandex.cloud.api.iam.v1.ApiKeyOuterClass.ApiKey> getGetMethod;
    if ((getGetMethod = ApiKeyServiceGrpc.getGetMethod) == null) {
      synchronized (ApiKeyServiceGrpc.class) {
        if ((getGetMethod = ApiKeyServiceGrpc.getGetMethod) == null) {
          ApiKeyServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.GetApiKeyRequest, yandex.cloud.api.iam.v1.ApiKeyOuterClass.ApiKey>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.GetApiKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.ApiKeyOuterClass.ApiKey.getDefaultInstance()))
              .setSchemaDescriptor(new ApiKeyServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.CreateApiKeyRequest,
      yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.CreateApiKeyResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.CreateApiKeyRequest.class,
      responseType = yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.CreateApiKeyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.CreateApiKeyRequest,
      yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.CreateApiKeyResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.CreateApiKeyRequest, yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.CreateApiKeyResponse> getCreateMethod;
    if ((getCreateMethod = ApiKeyServiceGrpc.getCreateMethod) == null) {
      synchronized (ApiKeyServiceGrpc.class) {
        if ((getCreateMethod = ApiKeyServiceGrpc.getCreateMethod) == null) {
          ApiKeyServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.CreateApiKeyRequest, yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.CreateApiKeyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.CreateApiKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.CreateApiKeyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiKeyServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.UpdateApiKeyRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.UpdateApiKeyRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.UpdateApiKeyRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.UpdateApiKeyRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = ApiKeyServiceGrpc.getUpdateMethod) == null) {
      synchronized (ApiKeyServiceGrpc.class) {
        if ((getUpdateMethod = ApiKeyServiceGrpc.getUpdateMethod) == null) {
          ApiKeyServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.UpdateApiKeyRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.UpdateApiKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ApiKeyServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.DeleteApiKeyRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.DeleteApiKeyRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.DeleteApiKeyRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.DeleteApiKeyRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = ApiKeyServiceGrpc.getDeleteMethod) == null) {
      synchronized (ApiKeyServiceGrpc.class) {
        if ((getDeleteMethod = ApiKeyServiceGrpc.getDeleteMethod) == null) {
          ApiKeyServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.DeleteApiKeyRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.DeleteApiKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ApiKeyServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.ListApiKeyOperationsRequest,
      yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.ListApiKeyOperationsResponse> getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.ListApiKeyOperationsRequest.class,
      responseType = yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.ListApiKeyOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.ListApiKeyOperationsRequest,
      yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.ListApiKeyOperationsResponse> getListOperationsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.ListApiKeyOperationsRequest, yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.ListApiKeyOperationsResponse> getListOperationsMethod;
    if ((getListOperationsMethod = ApiKeyServiceGrpc.getListOperationsMethod) == null) {
      synchronized (ApiKeyServiceGrpc.class) {
        if ((getListOperationsMethod = ApiKeyServiceGrpc.getListOperationsMethod) == null) {
          ApiKeyServiceGrpc.getListOperationsMethod = getListOperationsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.ListApiKeyOperationsRequest, yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.ListApiKeyOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.ListApiKeyOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.ListApiKeyOperationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiKeyServiceMethodDescriptorSupplier("ListOperations"))
              .build();
        }
      }
    }
    return getListOperationsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ApiKeyServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ApiKeyServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ApiKeyServiceStub>() {
        @java.lang.Override
        public ApiKeyServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ApiKeyServiceStub(channel, callOptions);
        }
      };
    return ApiKeyServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ApiKeyServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ApiKeyServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ApiKeyServiceBlockingStub>() {
        @java.lang.Override
        public ApiKeyServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ApiKeyServiceBlockingStub(channel, callOptions);
        }
      };
    return ApiKeyServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ApiKeyServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ApiKeyServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ApiKeyServiceFutureStub>() {
        @java.lang.Override
        public ApiKeyServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ApiKeyServiceFutureStub(channel, callOptions);
        }
      };
    return ApiKeyServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing API keys.
   * </pre>
   */
  public static abstract class ApiKeyServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Retrieves the list of API keys for the specified service account.
     * </pre>
     */
    public void list(yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.ListApiKeysRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.ListApiKeysResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the specified API key.
     * To get the list of available API keys, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.GetApiKeyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.ApiKeyOuterClass.ApiKey> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates an API key for the specified service account.
     * </pre>
     */
    public void create(yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.CreateApiKeyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.CreateApiKeyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified API key.
     * </pre>
     */
    public void update(yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.UpdateApiKeyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified API key.
     * </pre>
     */
    public void delete(yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.DeleteApiKeyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of operations for the specified API key.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.ListApiKeyOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.ListApiKeyOperationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.ListApiKeysRequest,
                yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.ListApiKeysResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.GetApiKeyRequest,
                yandex.cloud.api.iam.v1.ApiKeyOuterClass.ApiKey>(
                  this, METHODID_GET)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.CreateApiKeyRequest,
                yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.CreateApiKeyResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.UpdateApiKeyRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.DeleteApiKeyRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListOperationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.ListApiKeyOperationsRequest,
                yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.ListApiKeyOperationsResponse>(
                  this, METHODID_LIST_OPERATIONS)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing API keys.
   * </pre>
   */
  public static final class ApiKeyServiceStub extends io.grpc.stub.AbstractAsyncStub<ApiKeyServiceStub> {
    private ApiKeyServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ApiKeyServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ApiKeyServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves the list of API keys for the specified service account.
     * </pre>
     */
    public void list(yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.ListApiKeysRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.ListApiKeysResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the specified API key.
     * To get the list of available API keys, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.GetApiKeyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.ApiKeyOuterClass.ApiKey> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates an API key for the specified service account.
     * </pre>
     */
    public void create(yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.CreateApiKeyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.CreateApiKeyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified API key.
     * </pre>
     */
    public void update(yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.UpdateApiKeyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified API key.
     * </pre>
     */
    public void delete(yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.DeleteApiKeyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of operations for the specified API key.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.ListApiKeyOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.ListApiKeyOperationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing API keys.
   * </pre>
   */
  public static final class ApiKeyServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ApiKeyServiceBlockingStub> {
    private ApiKeyServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ApiKeyServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ApiKeyServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves the list of API keys for the specified service account.
     * </pre>
     */
    public yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.ListApiKeysResponse list(yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.ListApiKeysRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the specified API key.
     * To get the list of available API keys, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.iam.v1.ApiKeyOuterClass.ApiKey get(yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.GetApiKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates an API key for the specified service account.
     * </pre>
     */
    public yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.CreateApiKeyResponse create(yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.CreateApiKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified API key.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.UpdateApiKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified API key.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.DeleteApiKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of operations for the specified API key.
     * </pre>
     */
    public yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.ListApiKeyOperationsResponse listOperations(yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.ListApiKeyOperationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing API keys.
   * </pre>
   */
  public static final class ApiKeyServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ApiKeyServiceFutureStub> {
    private ApiKeyServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ApiKeyServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ApiKeyServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves the list of API keys for the specified service account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.ListApiKeysResponse> list(
        yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.ListApiKeysRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the specified API key.
     * To get the list of available API keys, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.iam.v1.ApiKeyOuterClass.ApiKey> get(
        yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.GetApiKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates an API key for the specified service account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.CreateApiKeyResponse> create(
        yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.CreateApiKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified API key.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.UpdateApiKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified API key.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.DeleteApiKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of operations for the specified API key.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.ListApiKeyOperationsResponse> listOperations(
        yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.ListApiKeyOperationsRequest request) {
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
    private final ApiKeyServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ApiKeyServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.ListApiKeysRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.ListApiKeysResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.GetApiKeyRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.ApiKeyOuterClass.ApiKey>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.CreateApiKeyRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.CreateApiKeyResponse>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.UpdateApiKeyRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.DeleteApiKeyRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.ListApiKeyOperationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.ListApiKeyOperationsResponse>) responseObserver);
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

  private static abstract class ApiKeyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ApiKeyServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.iam.v1.ApiKeyServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ApiKeyService");
    }
  }

  private static final class ApiKeyServiceFileDescriptorSupplier
      extends ApiKeyServiceBaseDescriptorSupplier {
    ApiKeyServiceFileDescriptorSupplier() {}
  }

  private static final class ApiKeyServiceMethodDescriptorSupplier
      extends ApiKeyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ApiKeyServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ApiKeyServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ApiKeyServiceFileDescriptorSupplier())
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
