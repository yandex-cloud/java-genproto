package yandex.cloud.api.iam.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing OAuthClient resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/iam/v1/oauth_client_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class OAuthClientServiceGrpc {

  private OAuthClientServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.iam.v1.OAuthClientService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.OauthClientService.GetOAuthClientRequest,
      yandex.cloud.api.iam.v1.OauthClient.OAuthClient> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.iam.v1.OauthClientService.GetOAuthClientRequest.class,
      responseType = yandex.cloud.api.iam.v1.OauthClient.OAuthClient.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.OauthClientService.GetOAuthClientRequest,
      yandex.cloud.api.iam.v1.OauthClient.OAuthClient> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.OauthClientService.GetOAuthClientRequest, yandex.cloud.api.iam.v1.OauthClient.OAuthClient> getGetMethod;
    if ((getGetMethod = OAuthClientServiceGrpc.getGetMethod) == null) {
      synchronized (OAuthClientServiceGrpc.class) {
        if ((getGetMethod = OAuthClientServiceGrpc.getGetMethod) == null) {
          OAuthClientServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iam.v1.OauthClientService.GetOAuthClientRequest, yandex.cloud.api.iam.v1.OauthClient.OAuthClient>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.OauthClientService.GetOAuthClientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.OauthClient.OAuthClient.getDefaultInstance()))
              .setSchemaDescriptor(new OAuthClientServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.OauthClientService.ListOAuthClientsRequest,
      yandex.cloud.api.iam.v1.OauthClientService.ListOAuthClientsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.iam.v1.OauthClientService.ListOAuthClientsRequest.class,
      responseType = yandex.cloud.api.iam.v1.OauthClientService.ListOAuthClientsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.OauthClientService.ListOAuthClientsRequest,
      yandex.cloud.api.iam.v1.OauthClientService.ListOAuthClientsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.OauthClientService.ListOAuthClientsRequest, yandex.cloud.api.iam.v1.OauthClientService.ListOAuthClientsResponse> getListMethod;
    if ((getListMethod = OAuthClientServiceGrpc.getListMethod) == null) {
      synchronized (OAuthClientServiceGrpc.class) {
        if ((getListMethod = OAuthClientServiceGrpc.getListMethod) == null) {
          OAuthClientServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iam.v1.OauthClientService.ListOAuthClientsRequest, yandex.cloud.api.iam.v1.OauthClientService.ListOAuthClientsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.OauthClientService.ListOAuthClientsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.OauthClientService.ListOAuthClientsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OAuthClientServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.OauthClientService.CreateOAuthClientRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.iam.v1.OauthClientService.CreateOAuthClientRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.OauthClientService.CreateOAuthClientRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.OauthClientService.CreateOAuthClientRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = OAuthClientServiceGrpc.getCreateMethod) == null) {
      synchronized (OAuthClientServiceGrpc.class) {
        if ((getCreateMethod = OAuthClientServiceGrpc.getCreateMethod) == null) {
          OAuthClientServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iam.v1.OauthClientService.CreateOAuthClientRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.OauthClientService.CreateOAuthClientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new OAuthClientServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.OauthClientService.UpdateOAuthClientRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.iam.v1.OauthClientService.UpdateOAuthClientRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.OauthClientService.UpdateOAuthClientRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.OauthClientService.UpdateOAuthClientRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = OAuthClientServiceGrpc.getUpdateMethod) == null) {
      synchronized (OAuthClientServiceGrpc.class) {
        if ((getUpdateMethod = OAuthClientServiceGrpc.getUpdateMethod) == null) {
          OAuthClientServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iam.v1.OauthClientService.UpdateOAuthClientRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.OauthClientService.UpdateOAuthClientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new OAuthClientServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.OauthClientService.DeleteOAuthClientRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.iam.v1.OauthClientService.DeleteOAuthClientRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.OauthClientService.DeleteOAuthClientRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.OauthClientService.DeleteOAuthClientRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = OAuthClientServiceGrpc.getDeleteMethod) == null) {
      synchronized (OAuthClientServiceGrpc.class) {
        if ((getDeleteMethod = OAuthClientServiceGrpc.getDeleteMethod) == null) {
          OAuthClientServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iam.v1.OauthClientService.DeleteOAuthClientRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.OauthClientService.DeleteOAuthClientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new OAuthClientServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OAuthClientServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OAuthClientServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OAuthClientServiceStub>() {
        @java.lang.Override
        public OAuthClientServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OAuthClientServiceStub(channel, callOptions);
        }
      };
    return OAuthClientServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OAuthClientServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OAuthClientServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OAuthClientServiceBlockingStub>() {
        @java.lang.Override
        public OAuthClientServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OAuthClientServiceBlockingStub(channel, callOptions);
        }
      };
    return OAuthClientServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OAuthClientServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OAuthClientServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OAuthClientServiceFutureStub>() {
        @java.lang.Override
        public OAuthClientServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OAuthClientServiceFutureStub(channel, callOptions);
        }
      };
    return OAuthClientServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing OAuthClient resources.
   * </pre>
   */
  public static abstract class OAuthClientServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the sepcified OAuthClient resource.
     * To get the list of available OAuthClient resources, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.iam.v1.OauthClientService.GetOAuthClientRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.OauthClient.OAuthClient> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of OAuthClient resources views in the specified folder
     * </pre>
     */
    public void list(yandex.cloud.api.iam.v1.OauthClientService.ListOAuthClientsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.OauthClientService.ListOAuthClientsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates an oauth client in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.iam.v1.OauthClientService.CreateOAuthClientRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified oauth client.
     * </pre>
     */
    public void update(yandex.cloud.api.iam.v1.OauthClientService.UpdateOAuthClientRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified oauth client with all its secrets.
     * </pre>
     */
    public void delete(yandex.cloud.api.iam.v1.OauthClientService.DeleteOAuthClientRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iam.v1.OauthClientService.GetOAuthClientRequest,
                yandex.cloud.api.iam.v1.OauthClient.OAuthClient>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iam.v1.OauthClientService.ListOAuthClientsRequest,
                yandex.cloud.api.iam.v1.OauthClientService.ListOAuthClientsResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iam.v1.OauthClientService.CreateOAuthClientRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iam.v1.OauthClientService.UpdateOAuthClientRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iam.v1.OauthClientService.DeleteOAuthClientRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing OAuthClient resources.
   * </pre>
   */
  public static final class OAuthClientServiceStub extends io.grpc.stub.AbstractAsyncStub<OAuthClientServiceStub> {
    private OAuthClientServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OAuthClientServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OAuthClientServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the sepcified OAuthClient resource.
     * To get the list of available OAuthClient resources, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.iam.v1.OauthClientService.GetOAuthClientRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.OauthClient.OAuthClient> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of OAuthClient resources views in the specified folder
     * </pre>
     */
    public void list(yandex.cloud.api.iam.v1.OauthClientService.ListOAuthClientsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.OauthClientService.ListOAuthClientsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates an oauth client in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.iam.v1.OauthClientService.CreateOAuthClientRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified oauth client.
     * </pre>
     */
    public void update(yandex.cloud.api.iam.v1.OauthClientService.UpdateOAuthClientRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified oauth client with all its secrets.
     * </pre>
     */
    public void delete(yandex.cloud.api.iam.v1.OauthClientService.DeleteOAuthClientRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing OAuthClient resources.
   * </pre>
   */
  public static final class OAuthClientServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<OAuthClientServiceBlockingStub> {
    private OAuthClientServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OAuthClientServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OAuthClientServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the sepcified OAuthClient resource.
     * To get the list of available OAuthClient resources, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.iam.v1.OauthClient.OAuthClient get(yandex.cloud.api.iam.v1.OauthClientService.GetOAuthClientRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of OAuthClient resources views in the specified folder
     * </pre>
     */
    public yandex.cloud.api.iam.v1.OauthClientService.ListOAuthClientsResponse list(yandex.cloud.api.iam.v1.OauthClientService.ListOAuthClientsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates an oauth client in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.iam.v1.OauthClientService.CreateOAuthClientRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified oauth client.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.iam.v1.OauthClientService.UpdateOAuthClientRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified oauth client with all its secrets.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.iam.v1.OauthClientService.DeleteOAuthClientRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing OAuthClient resources.
   * </pre>
   */
  public static final class OAuthClientServiceFutureStub extends io.grpc.stub.AbstractFutureStub<OAuthClientServiceFutureStub> {
    private OAuthClientServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OAuthClientServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OAuthClientServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the sepcified OAuthClient resource.
     * To get the list of available OAuthClient resources, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.iam.v1.OauthClient.OAuthClient> get(
        yandex.cloud.api.iam.v1.OauthClientService.GetOAuthClientRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of OAuthClient resources views in the specified folder
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.iam.v1.OauthClientService.ListOAuthClientsResponse> list(
        yandex.cloud.api.iam.v1.OauthClientService.ListOAuthClientsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates an oauth client in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.iam.v1.OauthClientService.CreateOAuthClientRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified oauth client.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.iam.v1.OauthClientService.UpdateOAuthClientRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified oauth client with all its secrets.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.iam.v1.OauthClientService.DeleteOAuthClientRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_DELETE = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final OAuthClientServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(OAuthClientServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.iam.v1.OauthClientService.GetOAuthClientRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.OauthClient.OAuthClient>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.iam.v1.OauthClientService.ListOAuthClientsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.OauthClientService.ListOAuthClientsResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.iam.v1.OauthClientService.CreateOAuthClientRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.iam.v1.OauthClientService.UpdateOAuthClientRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.iam.v1.OauthClientService.DeleteOAuthClientRequest) request,
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

  private static abstract class OAuthClientServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OAuthClientServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.iam.v1.OauthClientService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("OAuthClientService");
    }
  }

  private static final class OAuthClientServiceFileDescriptorSupplier
      extends OAuthClientServiceBaseDescriptorSupplier {
    OAuthClientServiceFileDescriptorSupplier() {}
  }

  private static final class OAuthClientServiceMethodDescriptorSupplier
      extends OAuthClientServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    OAuthClientServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (OAuthClientServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OAuthClientServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
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
