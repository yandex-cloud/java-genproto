package yandex.cloud.api.kms.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Set of methods that perform symmetric encryption and decryption.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.0)",
    comments = "Source: yandex/cloud/kms/v1/symmetric_crypto_service.proto")
public final class SymmetricCryptoServiceGrpc {

  private SymmetricCryptoServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.kms.v1.SymmetricCryptoService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.SymmetricEncryptRequest,
      yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.SymmetricEncryptResponse> getEncryptMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Encrypt",
      requestType = yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.SymmetricEncryptRequest.class,
      responseType = yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.SymmetricEncryptResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.SymmetricEncryptRequest,
      yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.SymmetricEncryptResponse> getEncryptMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.SymmetricEncryptRequest, yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.SymmetricEncryptResponse> getEncryptMethod;
    if ((getEncryptMethod = SymmetricCryptoServiceGrpc.getEncryptMethod) == null) {
      synchronized (SymmetricCryptoServiceGrpc.class) {
        if ((getEncryptMethod = SymmetricCryptoServiceGrpc.getEncryptMethod) == null) {
          SymmetricCryptoServiceGrpc.getEncryptMethod = getEncryptMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.SymmetricEncryptRequest, yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.SymmetricEncryptResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.kms.v1.SymmetricCryptoService", "Encrypt"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.SymmetricEncryptRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.SymmetricEncryptResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SymmetricCryptoServiceMethodDescriptorSupplier("Encrypt"))
                  .build();
          }
        }
     }
     return getEncryptMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.SymmetricDecryptRequest,
      yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.SymmetricDecryptResponse> getDecryptMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Decrypt",
      requestType = yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.SymmetricDecryptRequest.class,
      responseType = yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.SymmetricDecryptResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.SymmetricDecryptRequest,
      yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.SymmetricDecryptResponse> getDecryptMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.SymmetricDecryptRequest, yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.SymmetricDecryptResponse> getDecryptMethod;
    if ((getDecryptMethod = SymmetricCryptoServiceGrpc.getDecryptMethod) == null) {
      synchronized (SymmetricCryptoServiceGrpc.class) {
        if ((getDecryptMethod = SymmetricCryptoServiceGrpc.getDecryptMethod) == null) {
          SymmetricCryptoServiceGrpc.getDecryptMethod = getDecryptMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.SymmetricDecryptRequest, yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.SymmetricDecryptResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.kms.v1.SymmetricCryptoService", "Decrypt"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.SymmetricDecryptRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.SymmetricDecryptResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SymmetricCryptoServiceMethodDescriptorSupplier("Decrypt"))
                  .build();
          }
        }
     }
     return getDecryptMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.SymmetricReEncryptRequest,
      yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.SymmetricReEncryptResponse> getReEncryptMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReEncrypt",
      requestType = yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.SymmetricReEncryptRequest.class,
      responseType = yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.SymmetricReEncryptResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.SymmetricReEncryptRequest,
      yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.SymmetricReEncryptResponse> getReEncryptMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.SymmetricReEncryptRequest, yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.SymmetricReEncryptResponse> getReEncryptMethod;
    if ((getReEncryptMethod = SymmetricCryptoServiceGrpc.getReEncryptMethod) == null) {
      synchronized (SymmetricCryptoServiceGrpc.class) {
        if ((getReEncryptMethod = SymmetricCryptoServiceGrpc.getReEncryptMethod) == null) {
          SymmetricCryptoServiceGrpc.getReEncryptMethod = getReEncryptMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.SymmetricReEncryptRequest, yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.SymmetricReEncryptResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.kms.v1.SymmetricCryptoService", "ReEncrypt"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.SymmetricReEncryptRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.SymmetricReEncryptResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SymmetricCryptoServiceMethodDescriptorSupplier("ReEncrypt"))
                  .build();
          }
        }
     }
     return getReEncryptMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.GenerateDataKeyRequest,
      yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.GenerateDataKeyResponse> getGenerateDataKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateDataKey",
      requestType = yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.GenerateDataKeyRequest.class,
      responseType = yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.GenerateDataKeyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.GenerateDataKeyRequest,
      yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.GenerateDataKeyResponse> getGenerateDataKeyMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.GenerateDataKeyRequest, yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.GenerateDataKeyResponse> getGenerateDataKeyMethod;
    if ((getGenerateDataKeyMethod = SymmetricCryptoServiceGrpc.getGenerateDataKeyMethod) == null) {
      synchronized (SymmetricCryptoServiceGrpc.class) {
        if ((getGenerateDataKeyMethod = SymmetricCryptoServiceGrpc.getGenerateDataKeyMethod) == null) {
          SymmetricCryptoServiceGrpc.getGenerateDataKeyMethod = getGenerateDataKeyMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.GenerateDataKeyRequest, yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.GenerateDataKeyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.kms.v1.SymmetricCryptoService", "GenerateDataKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.GenerateDataKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.GenerateDataKeyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SymmetricCryptoServiceMethodDescriptorSupplier("GenerateDataKey"))
                  .build();
          }
        }
     }
     return getGenerateDataKeyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SymmetricCryptoServiceStub newStub(io.grpc.Channel channel) {
    return new SymmetricCryptoServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SymmetricCryptoServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SymmetricCryptoServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SymmetricCryptoServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SymmetricCryptoServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Set of methods that perform symmetric encryption and decryption.
   * </pre>
   */
  public static abstract class SymmetricCryptoServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Encrypts given plaintext with the specified key.
     * </pre>
     */
    public void encrypt(yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.SymmetricEncryptRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.SymmetricEncryptResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEncryptMethod(), responseObserver);
    }

    /**
     * <pre>
     * Decrypts the given ciphertext with the specified key.
     * </pre>
     */
    public void decrypt(yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.SymmetricDecryptRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.SymmetricDecryptResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDecryptMethod(), responseObserver);
    }

    /**
     * <pre>
     * Re-encrypts a ciphertext with the specified KMS key.
     * </pre>
     */
    public void reEncrypt(yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.SymmetricReEncryptRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.SymmetricReEncryptResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getReEncryptMethod(), responseObserver);
    }

    /**
     * <pre>
     * Generates a new symmetric data encryption key (not a KMS key) and returns
     * the generated key as plaintext and as ciphertext encrypted with the specified symmetric KMS key.
     * </pre>
     */
    public void generateDataKey(yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.GenerateDataKeyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.GenerateDataKeyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGenerateDataKeyMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getEncryptMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.SymmetricEncryptRequest,
                yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.SymmetricEncryptResponse>(
                  this, METHODID_ENCRYPT)))
          .addMethod(
            getDecryptMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.SymmetricDecryptRequest,
                yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.SymmetricDecryptResponse>(
                  this, METHODID_DECRYPT)))
          .addMethod(
            getReEncryptMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.SymmetricReEncryptRequest,
                yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.SymmetricReEncryptResponse>(
                  this, METHODID_RE_ENCRYPT)))
          .addMethod(
            getGenerateDataKeyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.GenerateDataKeyRequest,
                yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.GenerateDataKeyResponse>(
                  this, METHODID_GENERATE_DATA_KEY)))
          .build();
    }
  }

  /**
   * <pre>
   * Set of methods that perform symmetric encryption and decryption.
   * </pre>
   */
  public static final class SymmetricCryptoServiceStub extends io.grpc.stub.AbstractStub<SymmetricCryptoServiceStub> {
    private SymmetricCryptoServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SymmetricCryptoServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SymmetricCryptoServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SymmetricCryptoServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Encrypts given plaintext with the specified key.
     * </pre>
     */
    public void encrypt(yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.SymmetricEncryptRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.SymmetricEncryptResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEncryptMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Decrypts the given ciphertext with the specified key.
     * </pre>
     */
    public void decrypt(yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.SymmetricDecryptRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.SymmetricDecryptResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDecryptMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Re-encrypts a ciphertext with the specified KMS key.
     * </pre>
     */
    public void reEncrypt(yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.SymmetricReEncryptRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.SymmetricReEncryptResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReEncryptMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Generates a new symmetric data encryption key (not a KMS key) and returns
     * the generated key as plaintext and as ciphertext encrypted with the specified symmetric KMS key.
     * </pre>
     */
    public void generateDataKey(yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.GenerateDataKeyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.GenerateDataKeyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGenerateDataKeyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Set of methods that perform symmetric encryption and decryption.
   * </pre>
   */
  public static final class SymmetricCryptoServiceBlockingStub extends io.grpc.stub.AbstractStub<SymmetricCryptoServiceBlockingStub> {
    private SymmetricCryptoServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SymmetricCryptoServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SymmetricCryptoServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SymmetricCryptoServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Encrypts given plaintext with the specified key.
     * </pre>
     */
    public yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.SymmetricEncryptResponse encrypt(yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.SymmetricEncryptRequest request) {
      return blockingUnaryCall(
          getChannel(), getEncryptMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Decrypts the given ciphertext with the specified key.
     * </pre>
     */
    public yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.SymmetricDecryptResponse decrypt(yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.SymmetricDecryptRequest request) {
      return blockingUnaryCall(
          getChannel(), getDecryptMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Re-encrypts a ciphertext with the specified KMS key.
     * </pre>
     */
    public yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.SymmetricReEncryptResponse reEncrypt(yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.SymmetricReEncryptRequest request) {
      return blockingUnaryCall(
          getChannel(), getReEncryptMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Generates a new symmetric data encryption key (not a KMS key) and returns
     * the generated key as plaintext and as ciphertext encrypted with the specified symmetric KMS key.
     * </pre>
     */
    public yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.GenerateDataKeyResponse generateDataKey(yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.GenerateDataKeyRequest request) {
      return blockingUnaryCall(
          getChannel(), getGenerateDataKeyMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Set of methods that perform symmetric encryption and decryption.
   * </pre>
   */
  public static final class SymmetricCryptoServiceFutureStub extends io.grpc.stub.AbstractStub<SymmetricCryptoServiceFutureStub> {
    private SymmetricCryptoServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SymmetricCryptoServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SymmetricCryptoServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SymmetricCryptoServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Encrypts given plaintext with the specified key.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.SymmetricEncryptResponse> encrypt(
        yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.SymmetricEncryptRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getEncryptMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Decrypts the given ciphertext with the specified key.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.SymmetricDecryptResponse> decrypt(
        yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.SymmetricDecryptRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDecryptMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Re-encrypts a ciphertext with the specified KMS key.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.SymmetricReEncryptResponse> reEncrypt(
        yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.SymmetricReEncryptRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getReEncryptMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Generates a new symmetric data encryption key (not a KMS key) and returns
     * the generated key as plaintext and as ciphertext encrypted with the specified symmetric KMS key.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.GenerateDataKeyResponse> generateDataKey(
        yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.GenerateDataKeyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGenerateDataKeyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ENCRYPT = 0;
  private static final int METHODID_DECRYPT = 1;
  private static final int METHODID_RE_ENCRYPT = 2;
  private static final int METHODID_GENERATE_DATA_KEY = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SymmetricCryptoServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SymmetricCryptoServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ENCRYPT:
          serviceImpl.encrypt((yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.SymmetricEncryptRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.SymmetricEncryptResponse>) responseObserver);
          break;
        case METHODID_DECRYPT:
          serviceImpl.decrypt((yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.SymmetricDecryptRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.SymmetricDecryptResponse>) responseObserver);
          break;
        case METHODID_RE_ENCRYPT:
          serviceImpl.reEncrypt((yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.SymmetricReEncryptRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.SymmetricReEncryptResponse>) responseObserver);
          break;
        case METHODID_GENERATE_DATA_KEY:
          serviceImpl.generateDataKey((yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.GenerateDataKeyRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.GenerateDataKeyResponse>) responseObserver);
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

  private static abstract class SymmetricCryptoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SymmetricCryptoServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.kms.v1.SymmetricCryptoServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SymmetricCryptoService");
    }
  }

  private static final class SymmetricCryptoServiceFileDescriptorSupplier
      extends SymmetricCryptoServiceBaseDescriptorSupplier {
    SymmetricCryptoServiceFileDescriptorSupplier() {}
  }

  private static final class SymmetricCryptoServiceMethodDescriptorSupplier
      extends SymmetricCryptoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SymmetricCryptoServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SymmetricCryptoServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SymmetricCryptoServiceFileDescriptorSupplier())
              .addMethod(getEncryptMethod())
              .addMethod(getDecryptMethod())
              .addMethod(getReEncryptMethod())
              .addMethod(getGenerateDataKeyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
