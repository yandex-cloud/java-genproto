package yandex.cloud.api.ai.foundation_models.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service for tokenizing input content.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/ai/foundation_models/v1/text_generation/text_generation_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TokenizerServiceGrpc {

  private TokenizerServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.ai.foundation_models.v1.TokenizerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.TokenizeRequest,
      yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.TokenizeResponse> getTokenizeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Tokenize",
      requestType = yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.TokenizeRequest.class,
      responseType = yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.TokenizeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.TokenizeRequest,
      yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.TokenizeResponse> getTokenizeMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.TokenizeRequest, yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.TokenizeResponse> getTokenizeMethod;
    if ((getTokenizeMethod = TokenizerServiceGrpc.getTokenizeMethod) == null) {
      synchronized (TokenizerServiceGrpc.class) {
        if ((getTokenizeMethod = TokenizerServiceGrpc.getTokenizeMethod) == null) {
          TokenizerServiceGrpc.getTokenizeMethod = getTokenizeMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.TokenizeRequest, yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.TokenizeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Tokenize"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.TokenizeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.TokenizeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TokenizerServiceMethodDescriptorSupplier("Tokenize"))
              .build();
        }
      }
    }
    return getTokenizeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.CompletionRequest,
      yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.TokenizeResponse> getTokenizeCompletionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TokenizeCompletion",
      requestType = yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.CompletionRequest.class,
      responseType = yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.TokenizeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.CompletionRequest,
      yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.TokenizeResponse> getTokenizeCompletionMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.CompletionRequest, yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.TokenizeResponse> getTokenizeCompletionMethod;
    if ((getTokenizeCompletionMethod = TokenizerServiceGrpc.getTokenizeCompletionMethod) == null) {
      synchronized (TokenizerServiceGrpc.class) {
        if ((getTokenizeCompletionMethod = TokenizerServiceGrpc.getTokenizeCompletionMethod) == null) {
          TokenizerServiceGrpc.getTokenizeCompletionMethod = getTokenizeCompletionMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.CompletionRequest, yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.TokenizeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TokenizeCompletion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.CompletionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.TokenizeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TokenizerServiceMethodDescriptorSupplier("TokenizeCompletion"))
              .build();
        }
      }
    }
    return getTokenizeCompletionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TokenizerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TokenizerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TokenizerServiceStub>() {
        @java.lang.Override
        public TokenizerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TokenizerServiceStub(channel, callOptions);
        }
      };
    return TokenizerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TokenizerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TokenizerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TokenizerServiceBlockingStub>() {
        @java.lang.Override
        public TokenizerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TokenizerServiceBlockingStub(channel, callOptions);
        }
      };
    return TokenizerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TokenizerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TokenizerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TokenizerServiceFutureStub>() {
        @java.lang.Override
        public TokenizerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TokenizerServiceFutureStub(channel, callOptions);
        }
      };
    return TokenizerServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service for tokenizing input content.
   * </pre>
   */
  public static abstract class TokenizerServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * RPC method for tokenizing text.
     * </pre>
     */
    public void tokenize(yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.TokenizeRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.TokenizeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTokenizeMethod(), responseObserver);
    }

    /**
     * <pre>
     * RPC method for tokenizing content of CompletionRequest
     * </pre>
     */
    public void tokenizeCompletion(yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.CompletionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.TokenizeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTokenizeCompletionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getTokenizeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.TokenizeRequest,
                yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.TokenizeResponse>(
                  this, METHODID_TOKENIZE)))
          .addMethod(
            getTokenizeCompletionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.CompletionRequest,
                yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.TokenizeResponse>(
                  this, METHODID_TOKENIZE_COMPLETION)))
          .build();
    }
  }

  /**
   * <pre>
   * Service for tokenizing input content.
   * </pre>
   */
  public static final class TokenizerServiceStub extends io.grpc.stub.AbstractAsyncStub<TokenizerServiceStub> {
    private TokenizerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TokenizerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TokenizerServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * RPC method for tokenizing text.
     * </pre>
     */
    public void tokenize(yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.TokenizeRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.TokenizeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTokenizeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RPC method for tokenizing content of CompletionRequest
     * </pre>
     */
    public void tokenizeCompletion(yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.CompletionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.TokenizeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTokenizeCompletionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service for tokenizing input content.
   * </pre>
   */
  public static final class TokenizerServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<TokenizerServiceBlockingStub> {
    private TokenizerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TokenizerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TokenizerServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * RPC method for tokenizing text.
     * </pre>
     */
    public yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.TokenizeResponse tokenize(yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.TokenizeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTokenizeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RPC method for tokenizing content of CompletionRequest
     * </pre>
     */
    public yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.TokenizeResponse tokenizeCompletion(yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.CompletionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTokenizeCompletionMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service for tokenizing input content.
   * </pre>
   */
  public static final class TokenizerServiceFutureStub extends io.grpc.stub.AbstractFutureStub<TokenizerServiceFutureStub> {
    private TokenizerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TokenizerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TokenizerServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * RPC method for tokenizing text.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.TokenizeResponse> tokenize(
        yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.TokenizeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTokenizeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RPC method for tokenizing content of CompletionRequest
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.TokenizeResponse> tokenizeCompletion(
        yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.CompletionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTokenizeCompletionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TOKENIZE = 0;
  private static final int METHODID_TOKENIZE_COMPLETION = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TokenizerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TokenizerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TOKENIZE:
          serviceImpl.tokenize((yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.TokenizeRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.TokenizeResponse>) responseObserver);
          break;
        case METHODID_TOKENIZE_COMPLETION:
          serviceImpl.tokenizeCompletion((yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.CompletionRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.TokenizeResponse>) responseObserver);
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

  private static abstract class TokenizerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TokenizerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TokenizerService");
    }
  }

  private static final class TokenizerServiceFileDescriptorSupplier
      extends TokenizerServiceBaseDescriptorSupplier {
    TokenizerServiceFileDescriptorSupplier() {}
  }

  private static final class TokenizerServiceMethodDescriptorSupplier
      extends TokenizerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TokenizerServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TokenizerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TokenizerServiceFileDescriptorSupplier())
              .addMethod(getTokenizeMethod())
              .addMethod(getTokenizeCompletionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
