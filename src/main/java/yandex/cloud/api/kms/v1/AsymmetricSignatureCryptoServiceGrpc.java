package yandex.cloud.api.kms.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Set of methods that perform asymmetric signature.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/kms/v1/asymmetricsignature/asymmetric_signature_crypto_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AsymmetricSignatureCryptoServiceGrpc {

  private AsymmetricSignatureCryptoServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.kms.v1.asymmetricsignature.AsymmetricSignatureCryptoService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.kms.v1.AsymmetricSignatureCryptoServiceOuterClass.AsymmetricSignRequest,
      yandex.cloud.api.kms.v1.AsymmetricSignatureCryptoServiceOuterClass.AsymmetricSignResponse> getSignMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Sign",
      requestType = yandex.cloud.api.kms.v1.AsymmetricSignatureCryptoServiceOuterClass.AsymmetricSignRequest.class,
      responseType = yandex.cloud.api.kms.v1.AsymmetricSignatureCryptoServiceOuterClass.AsymmetricSignResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.kms.v1.AsymmetricSignatureCryptoServiceOuterClass.AsymmetricSignRequest,
      yandex.cloud.api.kms.v1.AsymmetricSignatureCryptoServiceOuterClass.AsymmetricSignResponse> getSignMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.kms.v1.AsymmetricSignatureCryptoServiceOuterClass.AsymmetricSignRequest, yandex.cloud.api.kms.v1.AsymmetricSignatureCryptoServiceOuterClass.AsymmetricSignResponse> getSignMethod;
    if ((getSignMethod = AsymmetricSignatureCryptoServiceGrpc.getSignMethod) == null) {
      synchronized (AsymmetricSignatureCryptoServiceGrpc.class) {
        if ((getSignMethod = AsymmetricSignatureCryptoServiceGrpc.getSignMethod) == null) {
          AsymmetricSignatureCryptoServiceGrpc.getSignMethod = getSignMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.kms.v1.AsymmetricSignatureCryptoServiceOuterClass.AsymmetricSignRequest, yandex.cloud.api.kms.v1.AsymmetricSignatureCryptoServiceOuterClass.AsymmetricSignResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Sign"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.kms.v1.AsymmetricSignatureCryptoServiceOuterClass.AsymmetricSignRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.kms.v1.AsymmetricSignatureCryptoServiceOuterClass.AsymmetricSignResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AsymmetricSignatureCryptoServiceMethodDescriptorSupplier("Sign"))
              .build();
        }
      }
    }
    return getSignMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.kms.v1.AsymmetricSignatureCryptoServiceOuterClass.AsymmetricSignHashRequest,
      yandex.cloud.api.kms.v1.AsymmetricSignatureCryptoServiceOuterClass.AsymmetricSignHashResponse> getSignHashMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SignHash",
      requestType = yandex.cloud.api.kms.v1.AsymmetricSignatureCryptoServiceOuterClass.AsymmetricSignHashRequest.class,
      responseType = yandex.cloud.api.kms.v1.AsymmetricSignatureCryptoServiceOuterClass.AsymmetricSignHashResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.kms.v1.AsymmetricSignatureCryptoServiceOuterClass.AsymmetricSignHashRequest,
      yandex.cloud.api.kms.v1.AsymmetricSignatureCryptoServiceOuterClass.AsymmetricSignHashResponse> getSignHashMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.kms.v1.AsymmetricSignatureCryptoServiceOuterClass.AsymmetricSignHashRequest, yandex.cloud.api.kms.v1.AsymmetricSignatureCryptoServiceOuterClass.AsymmetricSignHashResponse> getSignHashMethod;
    if ((getSignHashMethod = AsymmetricSignatureCryptoServiceGrpc.getSignHashMethod) == null) {
      synchronized (AsymmetricSignatureCryptoServiceGrpc.class) {
        if ((getSignHashMethod = AsymmetricSignatureCryptoServiceGrpc.getSignHashMethod) == null) {
          AsymmetricSignatureCryptoServiceGrpc.getSignHashMethod = getSignHashMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.kms.v1.AsymmetricSignatureCryptoServiceOuterClass.AsymmetricSignHashRequest, yandex.cloud.api.kms.v1.AsymmetricSignatureCryptoServiceOuterClass.AsymmetricSignHashResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SignHash"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.kms.v1.AsymmetricSignatureCryptoServiceOuterClass.AsymmetricSignHashRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.kms.v1.AsymmetricSignatureCryptoServiceOuterClass.AsymmetricSignHashResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AsymmetricSignatureCryptoServiceMethodDescriptorSupplier("SignHash"))
              .build();
        }
      }
    }
    return getSignHashMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.kms.v1.AsymmetricSignatureCryptoServiceOuterClass.AsymmetricGetPublicKeyRequest,
      yandex.cloud.api.kms.v1.AsymmetricSignatureCryptoServiceOuterClass.AsymmetricGetPublicKeyResponse> getGetPublicKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPublicKey",
      requestType = yandex.cloud.api.kms.v1.AsymmetricSignatureCryptoServiceOuterClass.AsymmetricGetPublicKeyRequest.class,
      responseType = yandex.cloud.api.kms.v1.AsymmetricSignatureCryptoServiceOuterClass.AsymmetricGetPublicKeyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.kms.v1.AsymmetricSignatureCryptoServiceOuterClass.AsymmetricGetPublicKeyRequest,
      yandex.cloud.api.kms.v1.AsymmetricSignatureCryptoServiceOuterClass.AsymmetricGetPublicKeyResponse> getGetPublicKeyMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.kms.v1.AsymmetricSignatureCryptoServiceOuterClass.AsymmetricGetPublicKeyRequest, yandex.cloud.api.kms.v1.AsymmetricSignatureCryptoServiceOuterClass.AsymmetricGetPublicKeyResponse> getGetPublicKeyMethod;
    if ((getGetPublicKeyMethod = AsymmetricSignatureCryptoServiceGrpc.getGetPublicKeyMethod) == null) {
      synchronized (AsymmetricSignatureCryptoServiceGrpc.class) {
        if ((getGetPublicKeyMethod = AsymmetricSignatureCryptoServiceGrpc.getGetPublicKeyMethod) == null) {
          AsymmetricSignatureCryptoServiceGrpc.getGetPublicKeyMethod = getGetPublicKeyMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.kms.v1.AsymmetricSignatureCryptoServiceOuterClass.AsymmetricGetPublicKeyRequest, yandex.cloud.api.kms.v1.AsymmetricSignatureCryptoServiceOuterClass.AsymmetricGetPublicKeyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPublicKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.kms.v1.AsymmetricSignatureCryptoServiceOuterClass.AsymmetricGetPublicKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.kms.v1.AsymmetricSignatureCryptoServiceOuterClass.AsymmetricGetPublicKeyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AsymmetricSignatureCryptoServiceMethodDescriptorSupplier("GetPublicKey"))
              .build();
        }
      }
    }
    return getGetPublicKeyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AsymmetricSignatureCryptoServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AsymmetricSignatureCryptoServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AsymmetricSignatureCryptoServiceStub>() {
        @java.lang.Override
        public AsymmetricSignatureCryptoServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AsymmetricSignatureCryptoServiceStub(channel, callOptions);
        }
      };
    return AsymmetricSignatureCryptoServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AsymmetricSignatureCryptoServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AsymmetricSignatureCryptoServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AsymmetricSignatureCryptoServiceBlockingStub>() {
        @java.lang.Override
        public AsymmetricSignatureCryptoServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AsymmetricSignatureCryptoServiceBlockingStub(channel, callOptions);
        }
      };
    return AsymmetricSignatureCryptoServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AsymmetricSignatureCryptoServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AsymmetricSignatureCryptoServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AsymmetricSignatureCryptoServiceFutureStub>() {
        @java.lang.Override
        public AsymmetricSignatureCryptoServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AsymmetricSignatureCryptoServiceFutureStub(channel, callOptions);
        }
      };
    return AsymmetricSignatureCryptoServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Set of methods that perform asymmetric signature.
   * </pre>
   */
  public static abstract class AsymmetricSignatureCryptoServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Signs data specified KMS key.
     * </pre>
     */
    public void sign(yandex.cloud.api.kms.v1.AsymmetricSignatureCryptoServiceOuterClass.AsymmetricSignRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.kms.v1.AsymmetricSignatureCryptoServiceOuterClass.AsymmetricSignResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSignMethod(), responseObserver);
    }

    /**
     * <pre>
     * Signs hash value specified KMS key.
     * </pre>
     */
    public void signHash(yandex.cloud.api.kms.v1.AsymmetricSignatureCryptoServiceOuterClass.AsymmetricSignHashRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.kms.v1.AsymmetricSignatureCryptoServiceOuterClass.AsymmetricSignHashResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSignHashMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets value of public key.
     * </pre>
     */
    public void getPublicKey(yandex.cloud.api.kms.v1.AsymmetricSignatureCryptoServiceOuterClass.AsymmetricGetPublicKeyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.kms.v1.AsymmetricSignatureCryptoServiceOuterClass.AsymmetricGetPublicKeyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPublicKeyMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSignMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.kms.v1.AsymmetricSignatureCryptoServiceOuterClass.AsymmetricSignRequest,
                yandex.cloud.api.kms.v1.AsymmetricSignatureCryptoServiceOuterClass.AsymmetricSignResponse>(
                  this, METHODID_SIGN)))
          .addMethod(
            getSignHashMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.kms.v1.AsymmetricSignatureCryptoServiceOuterClass.AsymmetricSignHashRequest,
                yandex.cloud.api.kms.v1.AsymmetricSignatureCryptoServiceOuterClass.AsymmetricSignHashResponse>(
                  this, METHODID_SIGN_HASH)))
          .addMethod(
            getGetPublicKeyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.kms.v1.AsymmetricSignatureCryptoServiceOuterClass.AsymmetricGetPublicKeyRequest,
                yandex.cloud.api.kms.v1.AsymmetricSignatureCryptoServiceOuterClass.AsymmetricGetPublicKeyResponse>(
                  this, METHODID_GET_PUBLIC_KEY)))
          .build();
    }
  }

  /**
   * <pre>
   * Set of methods that perform asymmetric signature.
   * </pre>
   */
  public static final class AsymmetricSignatureCryptoServiceStub extends io.grpc.stub.AbstractAsyncStub<AsymmetricSignatureCryptoServiceStub> {
    private AsymmetricSignatureCryptoServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AsymmetricSignatureCryptoServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AsymmetricSignatureCryptoServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Signs data specified KMS key.
     * </pre>
     */
    public void sign(yandex.cloud.api.kms.v1.AsymmetricSignatureCryptoServiceOuterClass.AsymmetricSignRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.kms.v1.AsymmetricSignatureCryptoServiceOuterClass.AsymmetricSignResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSignMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Signs hash value specified KMS key.
     * </pre>
     */
    public void signHash(yandex.cloud.api.kms.v1.AsymmetricSignatureCryptoServiceOuterClass.AsymmetricSignHashRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.kms.v1.AsymmetricSignatureCryptoServiceOuterClass.AsymmetricSignHashResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSignHashMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets value of public key.
     * </pre>
     */
    public void getPublicKey(yandex.cloud.api.kms.v1.AsymmetricSignatureCryptoServiceOuterClass.AsymmetricGetPublicKeyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.kms.v1.AsymmetricSignatureCryptoServiceOuterClass.AsymmetricGetPublicKeyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPublicKeyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Set of methods that perform asymmetric signature.
   * </pre>
   */
  public static final class AsymmetricSignatureCryptoServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AsymmetricSignatureCryptoServiceBlockingStub> {
    private AsymmetricSignatureCryptoServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AsymmetricSignatureCryptoServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AsymmetricSignatureCryptoServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Signs data specified KMS key.
     * </pre>
     */
    public yandex.cloud.api.kms.v1.AsymmetricSignatureCryptoServiceOuterClass.AsymmetricSignResponse sign(yandex.cloud.api.kms.v1.AsymmetricSignatureCryptoServiceOuterClass.AsymmetricSignRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSignMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Signs hash value specified KMS key.
     * </pre>
     */
    public yandex.cloud.api.kms.v1.AsymmetricSignatureCryptoServiceOuterClass.AsymmetricSignHashResponse signHash(yandex.cloud.api.kms.v1.AsymmetricSignatureCryptoServiceOuterClass.AsymmetricSignHashRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSignHashMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets value of public key.
     * </pre>
     */
    public yandex.cloud.api.kms.v1.AsymmetricSignatureCryptoServiceOuterClass.AsymmetricGetPublicKeyResponse getPublicKey(yandex.cloud.api.kms.v1.AsymmetricSignatureCryptoServiceOuterClass.AsymmetricGetPublicKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPublicKeyMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Set of methods that perform asymmetric signature.
   * </pre>
   */
  public static final class AsymmetricSignatureCryptoServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AsymmetricSignatureCryptoServiceFutureStub> {
    private AsymmetricSignatureCryptoServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AsymmetricSignatureCryptoServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AsymmetricSignatureCryptoServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Signs data specified KMS key.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.kms.v1.AsymmetricSignatureCryptoServiceOuterClass.AsymmetricSignResponse> sign(
        yandex.cloud.api.kms.v1.AsymmetricSignatureCryptoServiceOuterClass.AsymmetricSignRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSignMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Signs hash value specified KMS key.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.kms.v1.AsymmetricSignatureCryptoServiceOuterClass.AsymmetricSignHashResponse> signHash(
        yandex.cloud.api.kms.v1.AsymmetricSignatureCryptoServiceOuterClass.AsymmetricSignHashRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSignHashMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets value of public key.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.kms.v1.AsymmetricSignatureCryptoServiceOuterClass.AsymmetricGetPublicKeyResponse> getPublicKey(
        yandex.cloud.api.kms.v1.AsymmetricSignatureCryptoServiceOuterClass.AsymmetricGetPublicKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPublicKeyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SIGN = 0;
  private static final int METHODID_SIGN_HASH = 1;
  private static final int METHODID_GET_PUBLIC_KEY = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsymmetricSignatureCryptoServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AsymmetricSignatureCryptoServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SIGN:
          serviceImpl.sign((yandex.cloud.api.kms.v1.AsymmetricSignatureCryptoServiceOuterClass.AsymmetricSignRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.kms.v1.AsymmetricSignatureCryptoServiceOuterClass.AsymmetricSignResponse>) responseObserver);
          break;
        case METHODID_SIGN_HASH:
          serviceImpl.signHash((yandex.cloud.api.kms.v1.AsymmetricSignatureCryptoServiceOuterClass.AsymmetricSignHashRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.kms.v1.AsymmetricSignatureCryptoServiceOuterClass.AsymmetricSignHashResponse>) responseObserver);
          break;
        case METHODID_GET_PUBLIC_KEY:
          serviceImpl.getPublicKey((yandex.cloud.api.kms.v1.AsymmetricSignatureCryptoServiceOuterClass.AsymmetricGetPublicKeyRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.kms.v1.AsymmetricSignatureCryptoServiceOuterClass.AsymmetricGetPublicKeyResponse>) responseObserver);
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

  private static abstract class AsymmetricSignatureCryptoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AsymmetricSignatureCryptoServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.kms.v1.AsymmetricSignatureCryptoServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AsymmetricSignatureCryptoService");
    }
  }

  private static final class AsymmetricSignatureCryptoServiceFileDescriptorSupplier
      extends AsymmetricSignatureCryptoServiceBaseDescriptorSupplier {
    AsymmetricSignatureCryptoServiceFileDescriptorSupplier() {}
  }

  private static final class AsymmetricSignatureCryptoServiceMethodDescriptorSupplier
      extends AsymmetricSignatureCryptoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AsymmetricSignatureCryptoServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AsymmetricSignatureCryptoServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AsymmetricSignatureCryptoServiceFileDescriptorSupplier())
              .addMethod(getSignMethod())
              .addMethod(getSignHashMethod())
              .addMethod(getGetPublicKeyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
