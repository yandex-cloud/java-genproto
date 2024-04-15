package yandex.cloud.api.ai.foundation_models.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service for asynchronous text generation.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/ai/foundation_models/v1/text_generation/text_generation_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TextGenerationAsyncServiceGrpc {

  private TextGenerationAsyncServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.ai.foundation_models.v1.TextGenerationAsyncService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.CompletionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCompletionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Completion",
      requestType = yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.CompletionRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.CompletionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCompletionMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.CompletionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCompletionMethod;
    if ((getCompletionMethod = TextGenerationAsyncServiceGrpc.getCompletionMethod) == null) {
      synchronized (TextGenerationAsyncServiceGrpc.class) {
        if ((getCompletionMethod = TextGenerationAsyncServiceGrpc.getCompletionMethod) == null) {
          TextGenerationAsyncServiceGrpc.getCompletionMethod = getCompletionMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.CompletionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Completion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.CompletionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new TextGenerationAsyncServiceMethodDescriptorSupplier("Completion"))
              .build();
        }
      }
    }
    return getCompletionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TextGenerationAsyncServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TextGenerationAsyncServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TextGenerationAsyncServiceStub>() {
        @java.lang.Override
        public TextGenerationAsyncServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TextGenerationAsyncServiceStub(channel, callOptions);
        }
      };
    return TextGenerationAsyncServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TextGenerationAsyncServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TextGenerationAsyncServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TextGenerationAsyncServiceBlockingStub>() {
        @java.lang.Override
        public TextGenerationAsyncServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TextGenerationAsyncServiceBlockingStub(channel, callOptions);
        }
      };
    return TextGenerationAsyncServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TextGenerationAsyncServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TextGenerationAsyncServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TextGenerationAsyncServiceFutureStub>() {
        @java.lang.Override
        public TextGenerationAsyncServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TextGenerationAsyncServiceFutureStub(channel, callOptions);
        }
      };
    return TextGenerationAsyncServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service for asynchronous text generation.
   * </pre>
   */
  public static abstract class TextGenerationAsyncServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * A method for generating text completions in [asynchronous mode](/docs/foundation-models/concepts/#working-mode).
     * </pre>
     */
    public void completion(yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.CompletionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCompletionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCompletionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.CompletionRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_COMPLETION)))
          .build();
    }
  }

  /**
   * <pre>
   * Service for asynchronous text generation.
   * </pre>
   */
  public static final class TextGenerationAsyncServiceStub extends io.grpc.stub.AbstractAsyncStub<TextGenerationAsyncServiceStub> {
    private TextGenerationAsyncServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TextGenerationAsyncServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TextGenerationAsyncServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * A method for generating text completions in [asynchronous mode](/docs/foundation-models/concepts/#working-mode).
     * </pre>
     */
    public void completion(yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.CompletionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCompletionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service for asynchronous text generation.
   * </pre>
   */
  public static final class TextGenerationAsyncServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<TextGenerationAsyncServiceBlockingStub> {
    private TextGenerationAsyncServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TextGenerationAsyncServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TextGenerationAsyncServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * A method for generating text completions in [asynchronous mode](/docs/foundation-models/concepts/#working-mode).
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation completion(yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.CompletionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCompletionMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service for asynchronous text generation.
   * </pre>
   */
  public static final class TextGenerationAsyncServiceFutureStub extends io.grpc.stub.AbstractFutureStub<TextGenerationAsyncServiceFutureStub> {
    private TextGenerationAsyncServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TextGenerationAsyncServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TextGenerationAsyncServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * A method for generating text completions in [asynchronous mode](/docs/foundation-models/concepts/#working-mode).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> completion(
        yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.CompletionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCompletionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_COMPLETION = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TextGenerationAsyncServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TextGenerationAsyncServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_COMPLETION:
          serviceImpl.completion((yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.CompletionRequest) request,
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

  private static abstract class TextGenerationAsyncServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TextGenerationAsyncServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TextGenerationAsyncService");
    }
  }

  private static final class TextGenerationAsyncServiceFileDescriptorSupplier
      extends TextGenerationAsyncServiceBaseDescriptorSupplier {
    TextGenerationAsyncServiceFileDescriptorSupplier() {}
  }

  private static final class TextGenerationAsyncServiceMethodDescriptorSupplier
      extends TextGenerationAsyncServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TextGenerationAsyncServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TextGenerationAsyncServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TextGenerationAsyncServiceFileDescriptorSupplier())
              .addMethod(getCompletionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
