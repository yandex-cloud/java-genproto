package yandex.cloud.api.iam.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing Refresh Tokens.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/iam/v1/refresh_token_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RefreshTokenServiceGrpc {

  private RefreshTokenServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.iam.v1.RefreshTokenService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.RefreshTokenServiceOuterClass.ListRefreshTokensRequest,
      yandex.cloud.api.iam.v1.RefreshTokenServiceOuterClass.ListRefreshTokensResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.iam.v1.RefreshTokenServiceOuterClass.ListRefreshTokensRequest.class,
      responseType = yandex.cloud.api.iam.v1.RefreshTokenServiceOuterClass.ListRefreshTokensResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.RefreshTokenServiceOuterClass.ListRefreshTokensRequest,
      yandex.cloud.api.iam.v1.RefreshTokenServiceOuterClass.ListRefreshTokensResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.RefreshTokenServiceOuterClass.ListRefreshTokensRequest, yandex.cloud.api.iam.v1.RefreshTokenServiceOuterClass.ListRefreshTokensResponse> getListMethod;
    if ((getListMethod = RefreshTokenServiceGrpc.getListMethod) == null) {
      synchronized (RefreshTokenServiceGrpc.class) {
        if ((getListMethod = RefreshTokenServiceGrpc.getListMethod) == null) {
          RefreshTokenServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iam.v1.RefreshTokenServiceOuterClass.ListRefreshTokensRequest, yandex.cloud.api.iam.v1.RefreshTokenServiceOuterClass.ListRefreshTokensResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.RefreshTokenServiceOuterClass.ListRefreshTokensRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.RefreshTokenServiceOuterClass.ListRefreshTokensResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RefreshTokenServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.RefreshTokenServiceOuterClass.RevokeRefreshTokenRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRevokeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Revoke",
      requestType = yandex.cloud.api.iam.v1.RefreshTokenServiceOuterClass.RevokeRefreshTokenRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.RefreshTokenServiceOuterClass.RevokeRefreshTokenRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRevokeMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.RefreshTokenServiceOuterClass.RevokeRefreshTokenRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getRevokeMethod;
    if ((getRevokeMethod = RefreshTokenServiceGrpc.getRevokeMethod) == null) {
      synchronized (RefreshTokenServiceGrpc.class) {
        if ((getRevokeMethod = RefreshTokenServiceGrpc.getRevokeMethod) == null) {
          RefreshTokenServiceGrpc.getRevokeMethod = getRevokeMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iam.v1.RefreshTokenServiceOuterClass.RevokeRefreshTokenRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Revoke"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.RefreshTokenServiceOuterClass.RevokeRefreshTokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new RefreshTokenServiceMethodDescriptorSupplier("Revoke"))
              .build();
        }
      }
    }
    return getRevokeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RefreshTokenServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RefreshTokenServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RefreshTokenServiceStub>() {
        @java.lang.Override
        public RefreshTokenServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RefreshTokenServiceStub(channel, callOptions);
        }
      };
    return RefreshTokenServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RefreshTokenServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RefreshTokenServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RefreshTokenServiceBlockingStub>() {
        @java.lang.Override
        public RefreshTokenServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RefreshTokenServiceBlockingStub(channel, callOptions);
        }
      };
    return RefreshTokenServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RefreshTokenServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RefreshTokenServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RefreshTokenServiceFutureStub>() {
        @java.lang.Override
        public RefreshTokenServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RefreshTokenServiceFutureStub(channel, callOptions);
        }
      };
    return RefreshTokenServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing Refresh Tokens.
   * </pre>
   */
  public static abstract class RefreshTokenServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * List subjects Refresh Tokens.
     * </pre>
     */
    public void list(yandex.cloud.api.iam.v1.RefreshTokenServiceOuterClass.ListRefreshTokensRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.RefreshTokenServiceOuterClass.ListRefreshTokensResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Revoke Refresh Tokens. Several Refresh Tokens can be revoked by one request.
     * </pre>
     */
    public void revoke(yandex.cloud.api.iam.v1.RefreshTokenServiceOuterClass.RevokeRefreshTokenRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRevokeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iam.v1.RefreshTokenServiceOuterClass.ListRefreshTokensRequest,
                yandex.cloud.api.iam.v1.RefreshTokenServiceOuterClass.ListRefreshTokensResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getRevokeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iam.v1.RefreshTokenServiceOuterClass.RevokeRefreshTokenRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_REVOKE)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing Refresh Tokens.
   * </pre>
   */
  public static final class RefreshTokenServiceStub extends io.grpc.stub.AbstractAsyncStub<RefreshTokenServiceStub> {
    private RefreshTokenServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RefreshTokenServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RefreshTokenServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * List subjects Refresh Tokens.
     * </pre>
     */
    public void list(yandex.cloud.api.iam.v1.RefreshTokenServiceOuterClass.ListRefreshTokensRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.RefreshTokenServiceOuterClass.ListRefreshTokensResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Revoke Refresh Tokens. Several Refresh Tokens can be revoked by one request.
     * </pre>
     */
    public void revoke(yandex.cloud.api.iam.v1.RefreshTokenServiceOuterClass.RevokeRefreshTokenRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRevokeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Refresh Tokens.
   * </pre>
   */
  public static final class RefreshTokenServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<RefreshTokenServiceBlockingStub> {
    private RefreshTokenServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RefreshTokenServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RefreshTokenServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * List subjects Refresh Tokens.
     * </pre>
     */
    public yandex.cloud.api.iam.v1.RefreshTokenServiceOuterClass.ListRefreshTokensResponse list(yandex.cloud.api.iam.v1.RefreshTokenServiceOuterClass.ListRefreshTokensRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Revoke Refresh Tokens. Several Refresh Tokens can be revoked by one request.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation revoke(yandex.cloud.api.iam.v1.RefreshTokenServiceOuterClass.RevokeRefreshTokenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRevokeMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Refresh Tokens.
   * </pre>
   */
  public static final class RefreshTokenServiceFutureStub extends io.grpc.stub.AbstractFutureStub<RefreshTokenServiceFutureStub> {
    private RefreshTokenServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RefreshTokenServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RefreshTokenServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * List subjects Refresh Tokens.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.iam.v1.RefreshTokenServiceOuterClass.ListRefreshTokensResponse> list(
        yandex.cloud.api.iam.v1.RefreshTokenServiceOuterClass.ListRefreshTokensRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Revoke Refresh Tokens. Several Refresh Tokens can be revoked by one request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> revoke(
        yandex.cloud.api.iam.v1.RefreshTokenServiceOuterClass.RevokeRefreshTokenRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRevokeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST = 0;
  private static final int METHODID_REVOKE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RefreshTokenServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RefreshTokenServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.iam.v1.RefreshTokenServiceOuterClass.ListRefreshTokensRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.RefreshTokenServiceOuterClass.ListRefreshTokensResponse>) responseObserver);
          break;
        case METHODID_REVOKE:
          serviceImpl.revoke((yandex.cloud.api.iam.v1.RefreshTokenServiceOuterClass.RevokeRefreshTokenRequest) request,
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

  private static abstract class RefreshTokenServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RefreshTokenServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.iam.v1.RefreshTokenServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RefreshTokenService");
    }
  }

  private static final class RefreshTokenServiceFileDescriptorSupplier
      extends RefreshTokenServiceBaseDescriptorSupplier {
    RefreshTokenServiceFileDescriptorSupplier() {}
  }

  private static final class RefreshTokenServiceMethodDescriptorSupplier
      extends RefreshTokenServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RefreshTokenServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (RefreshTokenServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RefreshTokenServiceFileDescriptorSupplier())
              .addMethod(getListMethod())
              .addMethod(getRevokeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
