package yandex.cloud.api.ai.foundation_models.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service for text generation.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/ai/foundation_models/v1/text_generation/text_generation_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TextGenerationServiceGrpc {

  private TextGenerationServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.ai.foundation_models.v1.TextGenerationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.CompletionRequest,
      yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.CompletionResponse> getCompletionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Completion",
      requestType = yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.CompletionRequest.class,
      responseType = yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.CompletionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.CompletionRequest,
      yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.CompletionResponse> getCompletionMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.CompletionRequest, yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.CompletionResponse> getCompletionMethod;
    if ((getCompletionMethod = TextGenerationServiceGrpc.getCompletionMethod) == null) {
      synchronized (TextGenerationServiceGrpc.class) {
        if ((getCompletionMethod = TextGenerationServiceGrpc.getCompletionMethod) == null) {
          TextGenerationServiceGrpc.getCompletionMethod = getCompletionMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.CompletionRequest, yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.CompletionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Completion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.CompletionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.CompletionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TextGenerationServiceMethodDescriptorSupplier("Completion"))
              .build();
        }
      }
    }
    return getCompletionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TextGenerationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TextGenerationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TextGenerationServiceStub>() {
        @java.lang.Override
        public TextGenerationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TextGenerationServiceStub(channel, callOptions);
        }
      };
    return TextGenerationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TextGenerationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TextGenerationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TextGenerationServiceBlockingStub>() {
        @java.lang.Override
        public TextGenerationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TextGenerationServiceBlockingStub(channel, callOptions);
        }
      };
    return TextGenerationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TextGenerationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TextGenerationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TextGenerationServiceFutureStub>() {
        @java.lang.Override
        public TextGenerationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TextGenerationServiceFutureStub(channel, callOptions);
        }
      };
    return TextGenerationServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service for text generation.
   * </pre>
   */
  public static abstract class TextGenerationServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * RPC method for generating text completions.
     * </pre>
     */
    public void completion(yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.CompletionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.CompletionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCompletionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCompletionMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.CompletionRequest,
                yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.CompletionResponse>(
                  this, METHODID_COMPLETION)))
          .build();
    }
  }

  /**
   * <pre>
   * Service for text generation.
   * </pre>
   */
  public static final class TextGenerationServiceStub extends io.grpc.stub.AbstractAsyncStub<TextGenerationServiceStub> {
    private TextGenerationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TextGenerationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TextGenerationServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * RPC method for generating text completions.
     * </pre>
     */
    public void completion(yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.CompletionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.CompletionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getCompletionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service for text generation.
   * </pre>
   */
  public static final class TextGenerationServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<TextGenerationServiceBlockingStub> {
    private TextGenerationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TextGenerationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TextGenerationServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * RPC method for generating text completions.
     * </pre>
     */
    public java.util.Iterator<yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.CompletionResponse> completion(
        yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.CompletionRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getCompletionMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service for text generation.
   * </pre>
   */
  public static final class TextGenerationServiceFutureStub extends io.grpc.stub.AbstractFutureStub<TextGenerationServiceFutureStub> {
    private TextGenerationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TextGenerationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TextGenerationServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_COMPLETION = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TextGenerationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TextGenerationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_COMPLETION:
          serviceImpl.completion((yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.CompletionRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.CompletionResponse>) responseObserver);
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

  private static abstract class TextGenerationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TextGenerationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TextGenerationService");
    }
  }

  private static final class TextGenerationServiceFileDescriptorSupplier
      extends TextGenerationServiceBaseDescriptorSupplier {
    TextGenerationServiceFileDescriptorSupplier() {}
  }

  private static final class TextGenerationServiceMethodDescriptorSupplier
      extends TextGenerationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TextGenerationServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TextGenerationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TextGenerationServiceFileDescriptorSupplier())
              .addMethod(getCompletionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
