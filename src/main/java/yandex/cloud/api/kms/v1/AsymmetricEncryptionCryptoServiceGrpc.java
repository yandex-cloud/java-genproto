package yandex.cloud.api.kms.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Set of methods that perform asymmetric decryption.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/kms/v1/asymmetricencryption/asymmetric_encryption_crypto_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AsymmetricEncryptionCryptoServiceGrpc {

  private AsymmetricEncryptionCryptoServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.kms.v1.asymmetricencryption.AsymmetricEncryptionCryptoService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.kms.v1.AsymmetricEncryptionCryptoServiceOuterClass.AsymmetricDecryptRequest,
      yandex.cloud.api.kms.v1.AsymmetricEncryptionCryptoServiceOuterClass.AsymmetricDecryptResponse> getDecryptMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Decrypt",
      requestType = yandex.cloud.api.kms.v1.AsymmetricEncryptionCryptoServiceOuterClass.AsymmetricDecryptRequest.class,
      responseType = yandex.cloud.api.kms.v1.AsymmetricEncryptionCryptoServiceOuterClass.AsymmetricDecryptResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.kms.v1.AsymmetricEncryptionCryptoServiceOuterClass.AsymmetricDecryptRequest,
      yandex.cloud.api.kms.v1.AsymmetricEncryptionCryptoServiceOuterClass.AsymmetricDecryptResponse> getDecryptMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.kms.v1.AsymmetricEncryptionCryptoServiceOuterClass.AsymmetricDecryptRequest, yandex.cloud.api.kms.v1.AsymmetricEncryptionCryptoServiceOuterClass.AsymmetricDecryptResponse> getDecryptMethod;
    if ((getDecryptMethod = AsymmetricEncryptionCryptoServiceGrpc.getDecryptMethod) == null) {
      synchronized (AsymmetricEncryptionCryptoServiceGrpc.class) {
        if ((getDecryptMethod = AsymmetricEncryptionCryptoServiceGrpc.getDecryptMethod) == null) {
          AsymmetricEncryptionCryptoServiceGrpc.getDecryptMethod = getDecryptMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.kms.v1.AsymmetricEncryptionCryptoServiceOuterClass.AsymmetricDecryptRequest, yandex.cloud.api.kms.v1.AsymmetricEncryptionCryptoServiceOuterClass.AsymmetricDecryptResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Decrypt"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.kms.v1.AsymmetricEncryptionCryptoServiceOuterClass.AsymmetricDecryptRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.kms.v1.AsymmetricEncryptionCryptoServiceOuterClass.AsymmetricDecryptResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AsymmetricEncryptionCryptoServiceMethodDescriptorSupplier("Decrypt"))
              .build();
        }
      }
    }
    return getDecryptMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.kms.v1.AsymmetricEncryptionCryptoServiceOuterClass.AsymmetricGetPublicKeyRequest,
      yandex.cloud.api.kms.v1.AsymmetricEncryptionCryptoServiceOuterClass.AsymmetricGetPublicKeyResponse> getGetPublicKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPublicKey",
      requestType = yandex.cloud.api.kms.v1.AsymmetricEncryptionCryptoServiceOuterClass.AsymmetricGetPublicKeyRequest.class,
      responseType = yandex.cloud.api.kms.v1.AsymmetricEncryptionCryptoServiceOuterClass.AsymmetricGetPublicKeyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.kms.v1.AsymmetricEncryptionCryptoServiceOuterClass.AsymmetricGetPublicKeyRequest,
      yandex.cloud.api.kms.v1.AsymmetricEncryptionCryptoServiceOuterClass.AsymmetricGetPublicKeyResponse> getGetPublicKeyMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.kms.v1.AsymmetricEncryptionCryptoServiceOuterClass.AsymmetricGetPublicKeyRequest, yandex.cloud.api.kms.v1.AsymmetricEncryptionCryptoServiceOuterClass.AsymmetricGetPublicKeyResponse> getGetPublicKeyMethod;
    if ((getGetPublicKeyMethod = AsymmetricEncryptionCryptoServiceGrpc.getGetPublicKeyMethod) == null) {
      synchronized (AsymmetricEncryptionCryptoServiceGrpc.class) {
        if ((getGetPublicKeyMethod = AsymmetricEncryptionCryptoServiceGrpc.getGetPublicKeyMethod) == null) {
          AsymmetricEncryptionCryptoServiceGrpc.getGetPublicKeyMethod = getGetPublicKeyMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.kms.v1.AsymmetricEncryptionCryptoServiceOuterClass.AsymmetricGetPublicKeyRequest, yandex.cloud.api.kms.v1.AsymmetricEncryptionCryptoServiceOuterClass.AsymmetricGetPublicKeyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPublicKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.kms.v1.AsymmetricEncryptionCryptoServiceOuterClass.AsymmetricGetPublicKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.kms.v1.AsymmetricEncryptionCryptoServiceOuterClass.AsymmetricGetPublicKeyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AsymmetricEncryptionCryptoServiceMethodDescriptorSupplier("GetPublicKey"))
              .build();
        }
      }
    }
    return getGetPublicKeyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AsymmetricEncryptionCryptoServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AsymmetricEncryptionCryptoServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AsymmetricEncryptionCryptoServiceStub>() {
        @java.lang.Override
        public AsymmetricEncryptionCryptoServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AsymmetricEncryptionCryptoServiceStub(channel, callOptions);
        }
      };
    return AsymmetricEncryptionCryptoServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AsymmetricEncryptionCryptoServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AsymmetricEncryptionCryptoServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AsymmetricEncryptionCryptoServiceBlockingStub>() {
        @java.lang.Override
        public AsymmetricEncryptionCryptoServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AsymmetricEncryptionCryptoServiceBlockingStub(channel, callOptions);
        }
      };
    return AsymmetricEncryptionCryptoServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AsymmetricEncryptionCryptoServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AsymmetricEncryptionCryptoServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AsymmetricEncryptionCryptoServiceFutureStub>() {
        @java.lang.Override
        public AsymmetricEncryptionCryptoServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AsymmetricEncryptionCryptoServiceFutureStub(channel, callOptions);
        }
      };
    return AsymmetricEncryptionCryptoServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Set of methods that perform asymmetric decryption.
   * </pre>
   */
  public static abstract class AsymmetricEncryptionCryptoServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Decrypts the given ciphertext with the specified key.
     * </pre>
     */
    public void decrypt(yandex.cloud.api.kms.v1.AsymmetricEncryptionCryptoServiceOuterClass.AsymmetricDecryptRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.kms.v1.AsymmetricEncryptionCryptoServiceOuterClass.AsymmetricDecryptResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDecryptMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets value of public key.
     * </pre>
     */
    public void getPublicKey(yandex.cloud.api.kms.v1.AsymmetricEncryptionCryptoServiceOuterClass.AsymmetricGetPublicKeyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.kms.v1.AsymmetricEncryptionCryptoServiceOuterClass.AsymmetricGetPublicKeyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPublicKeyMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDecryptMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.kms.v1.AsymmetricEncryptionCryptoServiceOuterClass.AsymmetricDecryptRequest,
                yandex.cloud.api.kms.v1.AsymmetricEncryptionCryptoServiceOuterClass.AsymmetricDecryptResponse>(
                  this, METHODID_DECRYPT)))
          .addMethod(
            getGetPublicKeyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.kms.v1.AsymmetricEncryptionCryptoServiceOuterClass.AsymmetricGetPublicKeyRequest,
                yandex.cloud.api.kms.v1.AsymmetricEncryptionCryptoServiceOuterClass.AsymmetricGetPublicKeyResponse>(
                  this, METHODID_GET_PUBLIC_KEY)))
          .build();
    }
  }

  /**
   * <pre>
   * Set of methods that perform asymmetric decryption.
   * </pre>
   */
  public static final class AsymmetricEncryptionCryptoServiceStub extends io.grpc.stub.AbstractAsyncStub<AsymmetricEncryptionCryptoServiceStub> {
    private AsymmetricEncryptionCryptoServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AsymmetricEncryptionCryptoServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AsymmetricEncryptionCryptoServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Decrypts the given ciphertext with the specified key.
     * </pre>
     */
    public void decrypt(yandex.cloud.api.kms.v1.AsymmetricEncryptionCryptoServiceOuterClass.AsymmetricDecryptRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.kms.v1.AsymmetricEncryptionCryptoServiceOuterClass.AsymmetricDecryptResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDecryptMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets value of public key.
     * </pre>
     */
    public void getPublicKey(yandex.cloud.api.kms.v1.AsymmetricEncryptionCryptoServiceOuterClass.AsymmetricGetPublicKeyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.kms.v1.AsymmetricEncryptionCryptoServiceOuterClass.AsymmetricGetPublicKeyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPublicKeyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Set of methods that perform asymmetric decryption.
   * </pre>
   */
  public static final class AsymmetricEncryptionCryptoServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AsymmetricEncryptionCryptoServiceBlockingStub> {
    private AsymmetricEncryptionCryptoServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AsymmetricEncryptionCryptoServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AsymmetricEncryptionCryptoServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Decrypts the given ciphertext with the specified key.
     * </pre>
     */
    public yandex.cloud.api.kms.v1.AsymmetricEncryptionCryptoServiceOuterClass.AsymmetricDecryptResponse decrypt(yandex.cloud.api.kms.v1.AsymmetricEncryptionCryptoServiceOuterClass.AsymmetricDecryptRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDecryptMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets value of public key.
     * </pre>
     */
    public yandex.cloud.api.kms.v1.AsymmetricEncryptionCryptoServiceOuterClass.AsymmetricGetPublicKeyResponse getPublicKey(yandex.cloud.api.kms.v1.AsymmetricEncryptionCryptoServiceOuterClass.AsymmetricGetPublicKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPublicKeyMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Set of methods that perform asymmetric decryption.
   * </pre>
   */
  public static final class AsymmetricEncryptionCryptoServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AsymmetricEncryptionCryptoServiceFutureStub> {
    private AsymmetricEncryptionCryptoServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AsymmetricEncryptionCryptoServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AsymmetricEncryptionCryptoServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Decrypts the given ciphertext with the specified key.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.kms.v1.AsymmetricEncryptionCryptoServiceOuterClass.AsymmetricDecryptResponse> decrypt(
        yandex.cloud.api.kms.v1.AsymmetricEncryptionCryptoServiceOuterClass.AsymmetricDecryptRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDecryptMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets value of public key.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.kms.v1.AsymmetricEncryptionCryptoServiceOuterClass.AsymmetricGetPublicKeyResponse> getPublicKey(
        yandex.cloud.api.kms.v1.AsymmetricEncryptionCryptoServiceOuterClass.AsymmetricGetPublicKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPublicKeyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DECRYPT = 0;
  private static final int METHODID_GET_PUBLIC_KEY = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsymmetricEncryptionCryptoServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AsymmetricEncryptionCryptoServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DECRYPT:
          serviceImpl.decrypt((yandex.cloud.api.kms.v1.AsymmetricEncryptionCryptoServiceOuterClass.AsymmetricDecryptRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.kms.v1.AsymmetricEncryptionCryptoServiceOuterClass.AsymmetricDecryptResponse>) responseObserver);
          break;
        case METHODID_GET_PUBLIC_KEY:
          serviceImpl.getPublicKey((yandex.cloud.api.kms.v1.AsymmetricEncryptionCryptoServiceOuterClass.AsymmetricGetPublicKeyRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.kms.v1.AsymmetricEncryptionCryptoServiceOuterClass.AsymmetricGetPublicKeyResponse>) responseObserver);
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

  private static abstract class AsymmetricEncryptionCryptoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AsymmetricEncryptionCryptoServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.kms.v1.AsymmetricEncryptionCryptoServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AsymmetricEncryptionCryptoService");
    }
  }

  private static final class AsymmetricEncryptionCryptoServiceFileDescriptorSupplier
      extends AsymmetricEncryptionCryptoServiceBaseDescriptorSupplier {
    AsymmetricEncryptionCryptoServiceFileDescriptorSupplier() {}
  }

  private static final class AsymmetricEncryptionCryptoServiceMethodDescriptorSupplier
      extends AsymmetricEncryptionCryptoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AsymmetricEncryptionCryptoServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AsymmetricEncryptionCryptoServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AsymmetricEncryptionCryptoServiceFileDescriptorSupplier())
              .addMethod(getDecryptMethod())
              .addMethod(getGetPublicKeyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
