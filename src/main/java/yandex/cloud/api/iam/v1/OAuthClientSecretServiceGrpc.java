package yandex.cloud.api.iam.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing OAuthClientSecret resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/iam/v1/oauth_client_secret_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class OAuthClientSecretServiceGrpc {

  private OAuthClientSecretServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.iam.v1.OAuthClientSecretService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.OauthClientSecretService.GetOAuthClientSecretRequest,
      yandex.cloud.api.iam.v1.OauthClientSecret.OAuthClientSecret> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.iam.v1.OauthClientSecretService.GetOAuthClientSecretRequest.class,
      responseType = yandex.cloud.api.iam.v1.OauthClientSecret.OAuthClientSecret.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.OauthClientSecretService.GetOAuthClientSecretRequest,
      yandex.cloud.api.iam.v1.OauthClientSecret.OAuthClientSecret> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.OauthClientSecretService.GetOAuthClientSecretRequest, yandex.cloud.api.iam.v1.OauthClientSecret.OAuthClientSecret> getGetMethod;
    if ((getGetMethod = OAuthClientSecretServiceGrpc.getGetMethod) == null) {
      synchronized (OAuthClientSecretServiceGrpc.class) {
        if ((getGetMethod = OAuthClientSecretServiceGrpc.getGetMethod) == null) {
          OAuthClientSecretServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iam.v1.OauthClientSecretService.GetOAuthClientSecretRequest, yandex.cloud.api.iam.v1.OauthClientSecret.OAuthClientSecret>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.OauthClientSecretService.GetOAuthClientSecretRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.OauthClientSecret.OAuthClientSecret.getDefaultInstance()))
              .setSchemaDescriptor(new OAuthClientSecretServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.OauthClientSecretService.ListOAuthClientSecretsRequest,
      yandex.cloud.api.iam.v1.OauthClientSecretService.ListOAuthClientSecretsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.iam.v1.OauthClientSecretService.ListOAuthClientSecretsRequest.class,
      responseType = yandex.cloud.api.iam.v1.OauthClientSecretService.ListOAuthClientSecretsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.OauthClientSecretService.ListOAuthClientSecretsRequest,
      yandex.cloud.api.iam.v1.OauthClientSecretService.ListOAuthClientSecretsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.OauthClientSecretService.ListOAuthClientSecretsRequest, yandex.cloud.api.iam.v1.OauthClientSecretService.ListOAuthClientSecretsResponse> getListMethod;
    if ((getListMethod = OAuthClientSecretServiceGrpc.getListMethod) == null) {
      synchronized (OAuthClientSecretServiceGrpc.class) {
        if ((getListMethod = OAuthClientSecretServiceGrpc.getListMethod) == null) {
          OAuthClientSecretServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iam.v1.OauthClientSecretService.ListOAuthClientSecretsRequest, yandex.cloud.api.iam.v1.OauthClientSecretService.ListOAuthClientSecretsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.OauthClientSecretService.ListOAuthClientSecretsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.OauthClientSecretService.ListOAuthClientSecretsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OAuthClientSecretServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.OauthClientSecretService.CreateOAuthClientSecretRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.iam.v1.OauthClientSecretService.CreateOAuthClientSecretRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.OauthClientSecretService.CreateOAuthClientSecretRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.OauthClientSecretService.CreateOAuthClientSecretRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = OAuthClientSecretServiceGrpc.getCreateMethod) == null) {
      synchronized (OAuthClientSecretServiceGrpc.class) {
        if ((getCreateMethod = OAuthClientSecretServiceGrpc.getCreateMethod) == null) {
          OAuthClientSecretServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iam.v1.OauthClientSecretService.CreateOAuthClientSecretRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.OauthClientSecretService.CreateOAuthClientSecretRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new OAuthClientSecretServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.OauthClientSecretService.DeleteOAuthClientSecretRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.iam.v1.OauthClientSecretService.DeleteOAuthClientSecretRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.OauthClientSecretService.DeleteOAuthClientSecretRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.OauthClientSecretService.DeleteOAuthClientSecretRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = OAuthClientSecretServiceGrpc.getDeleteMethod) == null) {
      synchronized (OAuthClientSecretServiceGrpc.class) {
        if ((getDeleteMethod = OAuthClientSecretServiceGrpc.getDeleteMethod) == null) {
          OAuthClientSecretServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iam.v1.OauthClientSecretService.DeleteOAuthClientSecretRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.OauthClientSecretService.DeleteOAuthClientSecretRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new OAuthClientSecretServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OAuthClientSecretServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OAuthClientSecretServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OAuthClientSecretServiceStub>() {
        @java.lang.Override
        public OAuthClientSecretServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OAuthClientSecretServiceStub(channel, callOptions);
        }
      };
    return OAuthClientSecretServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OAuthClientSecretServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OAuthClientSecretServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OAuthClientSecretServiceBlockingStub>() {
        @java.lang.Override
        public OAuthClientSecretServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OAuthClientSecretServiceBlockingStub(channel, callOptions);
        }
      };
    return OAuthClientSecretServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OAuthClientSecretServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OAuthClientSecretServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OAuthClientSecretServiceFutureStub>() {
        @java.lang.Override
        public OAuthClientSecretServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OAuthClientSecretServiceFutureStub(channel, callOptions);
        }
      };
    return OAuthClientSecretServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing OAuthClientSecret resources.
   * </pre>
   */
  public static abstract class OAuthClientSecretServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the sepcified OAuthClientSecret resource.
     * To get the list of available OAuthClientSecret resources, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.iam.v1.OauthClientSecretService.GetOAuthClientSecretRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.OauthClientSecret.OAuthClientSecret> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of OAuthClientSecret resources of the specified OAuthClient.
     * </pre>
     */
    public void list(yandex.cloud.api.iam.v1.OauthClientSecretService.ListOAuthClientSecretsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.OauthClientSecretService.ListOAuthClientSecretsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates an OAuthClientSecret resource for the specified OAuthClient.
     * </pre>
     */
    public void create(yandex.cloud.api.iam.v1.OauthClientSecretService.CreateOAuthClientSecretRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified OAuthClientSecret resource.
     * </pre>
     */
    public void delete(yandex.cloud.api.iam.v1.OauthClientSecretService.DeleteOAuthClientSecretRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iam.v1.OauthClientSecretService.GetOAuthClientSecretRequest,
                yandex.cloud.api.iam.v1.OauthClientSecret.OAuthClientSecret>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iam.v1.OauthClientSecretService.ListOAuthClientSecretsRequest,
                yandex.cloud.api.iam.v1.OauthClientSecretService.ListOAuthClientSecretsResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iam.v1.OauthClientSecretService.CreateOAuthClientSecretRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iam.v1.OauthClientSecretService.DeleteOAuthClientSecretRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing OAuthClientSecret resources.
   * </pre>
   */
  public static final class OAuthClientSecretServiceStub extends io.grpc.stub.AbstractAsyncStub<OAuthClientSecretServiceStub> {
    private OAuthClientSecretServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OAuthClientSecretServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OAuthClientSecretServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the sepcified OAuthClientSecret resource.
     * To get the list of available OAuthClientSecret resources, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.iam.v1.OauthClientSecretService.GetOAuthClientSecretRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.OauthClientSecret.OAuthClientSecret> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of OAuthClientSecret resources of the specified OAuthClient.
     * </pre>
     */
    public void list(yandex.cloud.api.iam.v1.OauthClientSecretService.ListOAuthClientSecretsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.OauthClientSecretService.ListOAuthClientSecretsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates an OAuthClientSecret resource for the specified OAuthClient.
     * </pre>
     */
    public void create(yandex.cloud.api.iam.v1.OauthClientSecretService.CreateOAuthClientSecretRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified OAuthClientSecret resource.
     * </pre>
     */
    public void delete(yandex.cloud.api.iam.v1.OauthClientSecretService.DeleteOAuthClientSecretRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing OAuthClientSecret resources.
   * </pre>
   */
  public static final class OAuthClientSecretServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<OAuthClientSecretServiceBlockingStub> {
    private OAuthClientSecretServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OAuthClientSecretServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OAuthClientSecretServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the sepcified OAuthClientSecret resource.
     * To get the list of available OAuthClientSecret resources, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.iam.v1.OauthClientSecret.OAuthClientSecret get(yandex.cloud.api.iam.v1.OauthClientSecretService.GetOAuthClientSecretRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of OAuthClientSecret resources of the specified OAuthClient.
     * </pre>
     */
    public yandex.cloud.api.iam.v1.OauthClientSecretService.ListOAuthClientSecretsResponse list(yandex.cloud.api.iam.v1.OauthClientSecretService.ListOAuthClientSecretsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates an OAuthClientSecret resource for the specified OAuthClient.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.iam.v1.OauthClientSecretService.CreateOAuthClientSecretRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified OAuthClientSecret resource.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.iam.v1.OauthClientSecretService.DeleteOAuthClientSecretRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing OAuthClientSecret resources.
   * </pre>
   */
  public static final class OAuthClientSecretServiceFutureStub extends io.grpc.stub.AbstractFutureStub<OAuthClientSecretServiceFutureStub> {
    private OAuthClientSecretServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OAuthClientSecretServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OAuthClientSecretServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the sepcified OAuthClientSecret resource.
     * To get the list of available OAuthClientSecret resources, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.iam.v1.OauthClientSecret.OAuthClientSecret> get(
        yandex.cloud.api.iam.v1.OauthClientSecretService.GetOAuthClientSecretRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of OAuthClientSecret resources of the specified OAuthClient.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.iam.v1.OauthClientSecretService.ListOAuthClientSecretsResponse> list(
        yandex.cloud.api.iam.v1.OauthClientSecretService.ListOAuthClientSecretsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates an OAuthClientSecret resource for the specified OAuthClient.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.iam.v1.OauthClientSecretService.CreateOAuthClientSecretRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified OAuthClientSecret resource.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.iam.v1.OauthClientSecretService.DeleteOAuthClientSecretRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_DELETE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final OAuthClientSecretServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(OAuthClientSecretServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.iam.v1.OauthClientSecretService.GetOAuthClientSecretRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.OauthClientSecret.OAuthClientSecret>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.iam.v1.OauthClientSecretService.ListOAuthClientSecretsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.OauthClientSecretService.ListOAuthClientSecretsResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.iam.v1.OauthClientSecretService.CreateOAuthClientSecretRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.iam.v1.OauthClientSecretService.DeleteOAuthClientSecretRequest) request,
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

  private static abstract class OAuthClientSecretServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OAuthClientSecretServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.iam.v1.OauthClientSecretService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("OAuthClientSecretService");
    }
  }

  private static final class OAuthClientSecretServiceFileDescriptorSupplier
      extends OAuthClientSecretServiceBaseDescriptorSupplier {
    OAuthClientSecretServiceFileDescriptorSupplier() {}
  }

  private static final class OAuthClientSecretServiceMethodDescriptorSupplier
      extends OAuthClientSecretServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    OAuthClientSecretServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (OAuthClientSecretServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OAuthClientSecretServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .addMethod(getDeleteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
