package yandex.cloud.api.iam.v1.workload;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing federated credentials.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/iam/v1/workload/federated_credential_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class FederatedCredentialServiceGrpc {

  private FederatedCredentialServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.iam.v1.workload.FederatedCredentialService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.workload.FederatedCredentialServiceOuterClass.GetFederatedCredentialRequest,
      yandex.cloud.api.iam.v1.workload.FederatedCredentialOuterClass.FederatedCredential> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.iam.v1.workload.FederatedCredentialServiceOuterClass.GetFederatedCredentialRequest.class,
      responseType = yandex.cloud.api.iam.v1.workload.FederatedCredentialOuterClass.FederatedCredential.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.workload.FederatedCredentialServiceOuterClass.GetFederatedCredentialRequest,
      yandex.cloud.api.iam.v1.workload.FederatedCredentialOuterClass.FederatedCredential> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.workload.FederatedCredentialServiceOuterClass.GetFederatedCredentialRequest, yandex.cloud.api.iam.v1.workload.FederatedCredentialOuterClass.FederatedCredential> getGetMethod;
    if ((getGetMethod = FederatedCredentialServiceGrpc.getGetMethod) == null) {
      synchronized (FederatedCredentialServiceGrpc.class) {
        if ((getGetMethod = FederatedCredentialServiceGrpc.getGetMethod) == null) {
          FederatedCredentialServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iam.v1.workload.FederatedCredentialServiceOuterClass.GetFederatedCredentialRequest, yandex.cloud.api.iam.v1.workload.FederatedCredentialOuterClass.FederatedCredential>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.workload.FederatedCredentialServiceOuterClass.GetFederatedCredentialRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.workload.FederatedCredentialOuterClass.FederatedCredential.getDefaultInstance()))
              .setSchemaDescriptor(new FederatedCredentialServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.workload.FederatedCredentialServiceOuterClass.ListFederatedCredentialsRequest,
      yandex.cloud.api.iam.v1.workload.FederatedCredentialServiceOuterClass.ListFederatedCredentialsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.iam.v1.workload.FederatedCredentialServiceOuterClass.ListFederatedCredentialsRequest.class,
      responseType = yandex.cloud.api.iam.v1.workload.FederatedCredentialServiceOuterClass.ListFederatedCredentialsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.workload.FederatedCredentialServiceOuterClass.ListFederatedCredentialsRequest,
      yandex.cloud.api.iam.v1.workload.FederatedCredentialServiceOuterClass.ListFederatedCredentialsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.workload.FederatedCredentialServiceOuterClass.ListFederatedCredentialsRequest, yandex.cloud.api.iam.v1.workload.FederatedCredentialServiceOuterClass.ListFederatedCredentialsResponse> getListMethod;
    if ((getListMethod = FederatedCredentialServiceGrpc.getListMethod) == null) {
      synchronized (FederatedCredentialServiceGrpc.class) {
        if ((getListMethod = FederatedCredentialServiceGrpc.getListMethod) == null) {
          FederatedCredentialServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iam.v1.workload.FederatedCredentialServiceOuterClass.ListFederatedCredentialsRequest, yandex.cloud.api.iam.v1.workload.FederatedCredentialServiceOuterClass.ListFederatedCredentialsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.workload.FederatedCredentialServiceOuterClass.ListFederatedCredentialsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.workload.FederatedCredentialServiceOuterClass.ListFederatedCredentialsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FederatedCredentialServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.workload.FederatedCredentialServiceOuterClass.CreateFederatedCredentialRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.iam.v1.workload.FederatedCredentialServiceOuterClass.CreateFederatedCredentialRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.workload.FederatedCredentialServiceOuterClass.CreateFederatedCredentialRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.workload.FederatedCredentialServiceOuterClass.CreateFederatedCredentialRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = FederatedCredentialServiceGrpc.getCreateMethod) == null) {
      synchronized (FederatedCredentialServiceGrpc.class) {
        if ((getCreateMethod = FederatedCredentialServiceGrpc.getCreateMethod) == null) {
          FederatedCredentialServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iam.v1.workload.FederatedCredentialServiceOuterClass.CreateFederatedCredentialRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.workload.FederatedCredentialServiceOuterClass.CreateFederatedCredentialRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new FederatedCredentialServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.workload.FederatedCredentialServiceOuterClass.DeleteFederatedCredentialRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.iam.v1.workload.FederatedCredentialServiceOuterClass.DeleteFederatedCredentialRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.workload.FederatedCredentialServiceOuterClass.DeleteFederatedCredentialRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.workload.FederatedCredentialServiceOuterClass.DeleteFederatedCredentialRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = FederatedCredentialServiceGrpc.getDeleteMethod) == null) {
      synchronized (FederatedCredentialServiceGrpc.class) {
        if ((getDeleteMethod = FederatedCredentialServiceGrpc.getDeleteMethod) == null) {
          FederatedCredentialServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iam.v1.workload.FederatedCredentialServiceOuterClass.DeleteFederatedCredentialRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.workload.FederatedCredentialServiceOuterClass.DeleteFederatedCredentialRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new FederatedCredentialServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FederatedCredentialServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FederatedCredentialServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FederatedCredentialServiceStub>() {
        @java.lang.Override
        public FederatedCredentialServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FederatedCredentialServiceStub(channel, callOptions);
        }
      };
    return FederatedCredentialServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FederatedCredentialServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FederatedCredentialServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FederatedCredentialServiceBlockingStub>() {
        @java.lang.Override
        public FederatedCredentialServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FederatedCredentialServiceBlockingStub(channel, callOptions);
        }
      };
    return FederatedCredentialServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FederatedCredentialServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FederatedCredentialServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FederatedCredentialServiceFutureStub>() {
        @java.lang.Override
        public FederatedCredentialServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FederatedCredentialServiceFutureStub(channel, callOptions);
        }
      };
    return FederatedCredentialServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing federated credentials.
   * </pre>
   */
  public static abstract class FederatedCredentialServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified federated credential.
     * To get the list of available federated credentials, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.iam.v1.workload.FederatedCredentialServiceOuterClass.GetFederatedCredentialRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.workload.FederatedCredentialOuterClass.FederatedCredential> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of federated credentials for the specified service account.
     * </pre>
     */
    public void list(yandex.cloud.api.iam.v1.workload.FederatedCredentialServiceOuterClass.ListFederatedCredentialsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.workload.FederatedCredentialServiceOuterClass.ListFederatedCredentialsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a federated credential for the specified service account.
     * </pre>
     */
    public void create(yandex.cloud.api.iam.v1.workload.FederatedCredentialServiceOuterClass.CreateFederatedCredentialRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified federated credential.
     * </pre>
     */
    public void delete(yandex.cloud.api.iam.v1.workload.FederatedCredentialServiceOuterClass.DeleteFederatedCredentialRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iam.v1.workload.FederatedCredentialServiceOuterClass.GetFederatedCredentialRequest,
                yandex.cloud.api.iam.v1.workload.FederatedCredentialOuterClass.FederatedCredential>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iam.v1.workload.FederatedCredentialServiceOuterClass.ListFederatedCredentialsRequest,
                yandex.cloud.api.iam.v1.workload.FederatedCredentialServiceOuterClass.ListFederatedCredentialsResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iam.v1.workload.FederatedCredentialServiceOuterClass.CreateFederatedCredentialRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iam.v1.workload.FederatedCredentialServiceOuterClass.DeleteFederatedCredentialRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing federated credentials.
   * </pre>
   */
  public static final class FederatedCredentialServiceStub extends io.grpc.stub.AbstractAsyncStub<FederatedCredentialServiceStub> {
    private FederatedCredentialServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FederatedCredentialServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FederatedCredentialServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified federated credential.
     * To get the list of available federated credentials, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.iam.v1.workload.FederatedCredentialServiceOuterClass.GetFederatedCredentialRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.workload.FederatedCredentialOuterClass.FederatedCredential> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of federated credentials for the specified service account.
     * </pre>
     */
    public void list(yandex.cloud.api.iam.v1.workload.FederatedCredentialServiceOuterClass.ListFederatedCredentialsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.workload.FederatedCredentialServiceOuterClass.ListFederatedCredentialsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a federated credential for the specified service account.
     * </pre>
     */
    public void create(yandex.cloud.api.iam.v1.workload.FederatedCredentialServiceOuterClass.CreateFederatedCredentialRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified federated credential.
     * </pre>
     */
    public void delete(yandex.cloud.api.iam.v1.workload.FederatedCredentialServiceOuterClass.DeleteFederatedCredentialRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing federated credentials.
   * </pre>
   */
  public static final class FederatedCredentialServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<FederatedCredentialServiceBlockingStub> {
    private FederatedCredentialServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FederatedCredentialServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FederatedCredentialServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified federated credential.
     * To get the list of available federated credentials, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.iam.v1.workload.FederatedCredentialOuterClass.FederatedCredential get(yandex.cloud.api.iam.v1.workload.FederatedCredentialServiceOuterClass.GetFederatedCredentialRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of federated credentials for the specified service account.
     * </pre>
     */
    public yandex.cloud.api.iam.v1.workload.FederatedCredentialServiceOuterClass.ListFederatedCredentialsResponse list(yandex.cloud.api.iam.v1.workload.FederatedCredentialServiceOuterClass.ListFederatedCredentialsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a federated credential for the specified service account.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.iam.v1.workload.FederatedCredentialServiceOuterClass.CreateFederatedCredentialRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified federated credential.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.iam.v1.workload.FederatedCredentialServiceOuterClass.DeleteFederatedCredentialRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing federated credentials.
   * </pre>
   */
  public static final class FederatedCredentialServiceFutureStub extends io.grpc.stub.AbstractFutureStub<FederatedCredentialServiceFutureStub> {
    private FederatedCredentialServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FederatedCredentialServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FederatedCredentialServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified federated credential.
     * To get the list of available federated credentials, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.iam.v1.workload.FederatedCredentialOuterClass.FederatedCredential> get(
        yandex.cloud.api.iam.v1.workload.FederatedCredentialServiceOuterClass.GetFederatedCredentialRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of federated credentials for the specified service account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.iam.v1.workload.FederatedCredentialServiceOuterClass.ListFederatedCredentialsResponse> list(
        yandex.cloud.api.iam.v1.workload.FederatedCredentialServiceOuterClass.ListFederatedCredentialsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a federated credential for the specified service account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.iam.v1.workload.FederatedCredentialServiceOuterClass.CreateFederatedCredentialRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified federated credential.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.iam.v1.workload.FederatedCredentialServiceOuterClass.DeleteFederatedCredentialRequest request) {
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
    private final FederatedCredentialServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FederatedCredentialServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.iam.v1.workload.FederatedCredentialServiceOuterClass.GetFederatedCredentialRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.workload.FederatedCredentialOuterClass.FederatedCredential>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.iam.v1.workload.FederatedCredentialServiceOuterClass.ListFederatedCredentialsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.workload.FederatedCredentialServiceOuterClass.ListFederatedCredentialsResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.iam.v1.workload.FederatedCredentialServiceOuterClass.CreateFederatedCredentialRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.iam.v1.workload.FederatedCredentialServiceOuterClass.DeleteFederatedCredentialRequest) request,
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

  private static abstract class FederatedCredentialServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FederatedCredentialServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.iam.v1.workload.FederatedCredentialServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FederatedCredentialService");
    }
  }

  private static final class FederatedCredentialServiceFileDescriptorSupplier
      extends FederatedCredentialServiceBaseDescriptorSupplier {
    FederatedCredentialServiceFileDescriptorSupplier() {}
  }

  private static final class FederatedCredentialServiceMethodDescriptorSupplier
      extends FederatedCredentialServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FederatedCredentialServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (FederatedCredentialServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FederatedCredentialServiceFileDescriptorSupplier())
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
