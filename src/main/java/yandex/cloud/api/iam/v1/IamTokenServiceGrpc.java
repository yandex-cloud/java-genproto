package yandex.cloud.api.iam.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing IAM tokens.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/iam/v1/iam_token_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class IamTokenServiceGrpc {

  private IamTokenServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.iam.v1.IamTokenService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.CreateIamTokenRequest,
      yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.CreateIamTokenResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.CreateIamTokenRequest.class,
      responseType = yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.CreateIamTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.CreateIamTokenRequest,
      yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.CreateIamTokenResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.CreateIamTokenRequest, yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.CreateIamTokenResponse> getCreateMethod;
    if ((getCreateMethod = IamTokenServiceGrpc.getCreateMethod) == null) {
      synchronized (IamTokenServiceGrpc.class) {
        if ((getCreateMethod = IamTokenServiceGrpc.getCreateMethod) == null) {
          IamTokenServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.CreateIamTokenRequest, yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.CreateIamTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.CreateIamTokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.CreateIamTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IamTokenServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.CreateIamTokenForServiceAccountRequest,
      yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.CreateIamTokenResponse> getCreateForServiceAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateForServiceAccount",
      requestType = yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.CreateIamTokenForServiceAccountRequest.class,
      responseType = yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.CreateIamTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.CreateIamTokenForServiceAccountRequest,
      yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.CreateIamTokenResponse> getCreateForServiceAccountMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.CreateIamTokenForServiceAccountRequest, yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.CreateIamTokenResponse> getCreateForServiceAccountMethod;
    if ((getCreateForServiceAccountMethod = IamTokenServiceGrpc.getCreateForServiceAccountMethod) == null) {
      synchronized (IamTokenServiceGrpc.class) {
        if ((getCreateForServiceAccountMethod = IamTokenServiceGrpc.getCreateForServiceAccountMethod) == null) {
          IamTokenServiceGrpc.getCreateForServiceAccountMethod = getCreateForServiceAccountMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.CreateIamTokenForServiceAccountRequest, yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.CreateIamTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateForServiceAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.CreateIamTokenForServiceAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.CreateIamTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IamTokenServiceMethodDescriptorSupplier("CreateForServiceAccount"))
              .build();
        }
      }
    }
    return getCreateForServiceAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.RevokeIamTokenRequest,
      yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.RevokeIamTokenResponse> getRevokeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Revoke",
      requestType = yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.RevokeIamTokenRequest.class,
      responseType = yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.RevokeIamTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.RevokeIamTokenRequest,
      yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.RevokeIamTokenResponse> getRevokeMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.RevokeIamTokenRequest, yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.RevokeIamTokenResponse> getRevokeMethod;
    if ((getRevokeMethod = IamTokenServiceGrpc.getRevokeMethod) == null) {
      synchronized (IamTokenServiceGrpc.class) {
        if ((getRevokeMethod = IamTokenServiceGrpc.getRevokeMethod) == null) {
          IamTokenServiceGrpc.getRevokeMethod = getRevokeMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.RevokeIamTokenRequest, yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.RevokeIamTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Revoke"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.RevokeIamTokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.RevokeIamTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IamTokenServiceMethodDescriptorSupplier("Revoke"))
              .build();
        }
      }
    }
    return getRevokeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IamTokenServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IamTokenServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IamTokenServiceStub>() {
        @java.lang.Override
        public IamTokenServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IamTokenServiceStub(channel, callOptions);
        }
      };
    return IamTokenServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IamTokenServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IamTokenServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IamTokenServiceBlockingStub>() {
        @java.lang.Override
        public IamTokenServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IamTokenServiceBlockingStub(channel, callOptions);
        }
      };
    return IamTokenServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static IamTokenServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IamTokenServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IamTokenServiceFutureStub>() {
        @java.lang.Override
        public IamTokenServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IamTokenServiceFutureStub(channel, callOptions);
        }
      };
    return IamTokenServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing IAM tokens.
   * </pre>
   */
  public static abstract class IamTokenServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Create an IAM token for the specified identity.
     * </pre>
     */
    public void create(yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.CreateIamTokenRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.CreateIamTokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create an IAM token for service account.
     * </pre>
     */
    public void createForServiceAccount(yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.CreateIamTokenForServiceAccountRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.CreateIamTokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateForServiceAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * Revoke the IAM token.
     * </pre>
     */
    public void revoke(yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.RevokeIamTokenRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.RevokeIamTokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRevokeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.CreateIamTokenRequest,
                yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.CreateIamTokenResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getCreateForServiceAccountMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.CreateIamTokenForServiceAccountRequest,
                yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.CreateIamTokenResponse>(
                  this, METHODID_CREATE_FOR_SERVICE_ACCOUNT)))
          .addMethod(
            getRevokeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.RevokeIamTokenRequest,
                yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.RevokeIamTokenResponse>(
                  this, METHODID_REVOKE)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing IAM tokens.
   * </pre>
   */
  public static final class IamTokenServiceStub extends io.grpc.stub.AbstractAsyncStub<IamTokenServiceStub> {
    private IamTokenServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IamTokenServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IamTokenServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create an IAM token for the specified identity.
     * </pre>
     */
    public void create(yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.CreateIamTokenRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.CreateIamTokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create an IAM token for service account.
     * </pre>
     */
    public void createForServiceAccount(yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.CreateIamTokenForServiceAccountRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.CreateIamTokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateForServiceAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Revoke the IAM token.
     * </pre>
     */
    public void revoke(yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.RevokeIamTokenRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.RevokeIamTokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRevokeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing IAM tokens.
   * </pre>
   */
  public static final class IamTokenServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<IamTokenServiceBlockingStub> {
    private IamTokenServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IamTokenServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IamTokenServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create an IAM token for the specified identity.
     * </pre>
     */
    public yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.CreateIamTokenResponse create(yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.CreateIamTokenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create an IAM token for service account.
     * </pre>
     */
    public yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.CreateIamTokenResponse createForServiceAccount(yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.CreateIamTokenForServiceAccountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateForServiceAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Revoke the IAM token.
     * </pre>
     */
    public yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.RevokeIamTokenResponse revoke(yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.RevokeIamTokenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRevokeMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing IAM tokens.
   * </pre>
   */
  public static final class IamTokenServiceFutureStub extends io.grpc.stub.AbstractFutureStub<IamTokenServiceFutureStub> {
    private IamTokenServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IamTokenServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IamTokenServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create an IAM token for the specified identity.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.CreateIamTokenResponse> create(
        yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.CreateIamTokenRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create an IAM token for service account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.CreateIamTokenResponse> createForServiceAccount(
        yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.CreateIamTokenForServiceAccountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateForServiceAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Revoke the IAM token.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.RevokeIamTokenResponse> revoke(
        yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.RevokeIamTokenRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRevokeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_CREATE_FOR_SERVICE_ACCOUNT = 1;
  private static final int METHODID_REVOKE = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final IamTokenServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(IamTokenServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.CreateIamTokenRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.CreateIamTokenResponse>) responseObserver);
          break;
        case METHODID_CREATE_FOR_SERVICE_ACCOUNT:
          serviceImpl.createForServiceAccount((yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.CreateIamTokenForServiceAccountRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.CreateIamTokenResponse>) responseObserver);
          break;
        case METHODID_REVOKE:
          serviceImpl.revoke((yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.RevokeIamTokenRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.RevokeIamTokenResponse>) responseObserver);
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

  private static abstract class IamTokenServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    IamTokenServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("IamTokenService");
    }
  }

  private static final class IamTokenServiceFileDescriptorSupplier
      extends IamTokenServiceBaseDescriptorSupplier {
    IamTokenServiceFileDescriptorSupplier() {}
  }

  private static final class IamTokenServiceMethodDescriptorSupplier
      extends IamTokenServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    IamTokenServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (IamTokenServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new IamTokenServiceFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getCreateForServiceAccountMethod())
              .addMethod(getRevokeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
