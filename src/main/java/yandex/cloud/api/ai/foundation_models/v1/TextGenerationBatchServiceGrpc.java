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
public final class TextGenerationBatchServiceGrpc {

  private TextGenerationBatchServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.ai.foundation_models.v1.TextGenerationBatchService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.BatchCompletionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCompletionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Completion",
      requestType = yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.BatchCompletionRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.BatchCompletionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCompletionMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.BatchCompletionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCompletionMethod;
    if ((getCompletionMethod = TextGenerationBatchServiceGrpc.getCompletionMethod) == null) {
      synchronized (TextGenerationBatchServiceGrpc.class) {
        if ((getCompletionMethod = TextGenerationBatchServiceGrpc.getCompletionMethod) == null) {
          TextGenerationBatchServiceGrpc.getCompletionMethod = getCompletionMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.BatchCompletionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Completion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.BatchCompletionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new TextGenerationBatchServiceMethodDescriptorSupplier("Completion"))
              .build();
        }
      }
    }
    return getCompletionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TextGenerationBatchServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TextGenerationBatchServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TextGenerationBatchServiceStub>() {
        @java.lang.Override
        public TextGenerationBatchServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TextGenerationBatchServiceStub(channel, callOptions);
        }
      };
    return TextGenerationBatchServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TextGenerationBatchServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TextGenerationBatchServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TextGenerationBatchServiceBlockingStub>() {
        @java.lang.Override
        public TextGenerationBatchServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TextGenerationBatchServiceBlockingStub(channel, callOptions);
        }
      };
    return TextGenerationBatchServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TextGenerationBatchServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TextGenerationBatchServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TextGenerationBatchServiceFutureStub>() {
        @java.lang.Override
        public TextGenerationBatchServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TextGenerationBatchServiceFutureStub(channel, callOptions);
        }
      };
    return TextGenerationBatchServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service for text generation.
   * </pre>
   */
  public static abstract class TextGenerationBatchServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * A method for generating text completions in [synchronous mode](/docs/foundation-models/concepts/#working-mode).
     * Note: Not implemented yet
     * </pre>
     */
    public void completion(yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.BatchCompletionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCompletionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCompletionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.BatchCompletionRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_COMPLETION)))
          .build();
    }
  }

  /**
   * <pre>
   * Service for text generation.
   * </pre>
   */
  public static final class TextGenerationBatchServiceStub extends io.grpc.stub.AbstractAsyncStub<TextGenerationBatchServiceStub> {
    private TextGenerationBatchServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TextGenerationBatchServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TextGenerationBatchServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * A method for generating text completions in [synchronous mode](/docs/foundation-models/concepts/#working-mode).
     * Note: Not implemented yet
     * </pre>
     */
    public void completion(yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.BatchCompletionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCompletionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service for text generation.
   * </pre>
   */
  public static final class TextGenerationBatchServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<TextGenerationBatchServiceBlockingStub> {
    private TextGenerationBatchServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TextGenerationBatchServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TextGenerationBatchServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * A method for generating text completions in [synchronous mode](/docs/foundation-models/concepts/#working-mode).
     * Note: Not implemented yet
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation completion(yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.BatchCompletionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCompletionMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service for text generation.
   * </pre>
   */
  public static final class TextGenerationBatchServiceFutureStub extends io.grpc.stub.AbstractFutureStub<TextGenerationBatchServiceFutureStub> {
    private TextGenerationBatchServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TextGenerationBatchServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TextGenerationBatchServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * A method for generating text completions in [synchronous mode](/docs/foundation-models/concepts/#working-mode).
     * Note: Not implemented yet
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> completion(
        yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.BatchCompletionRequest request) {
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
    private final TextGenerationBatchServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TextGenerationBatchServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_COMPLETION:
          serviceImpl.completion((yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.BatchCompletionRequest) request,
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

  private static abstract class TextGenerationBatchServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TextGenerationBatchServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.ai.foundation_models.v1.TextGenerationServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TextGenerationBatchService");
    }
  }

  private static final class TextGenerationBatchServiceFileDescriptorSupplier
      extends TextGenerationBatchServiceBaseDescriptorSupplier {
    TextGenerationBatchServiceFileDescriptorSupplier() {}
  }

  private static final class TextGenerationBatchServiceMethodDescriptorSupplier
      extends TextGenerationBatchServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TextGenerationBatchServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TextGenerationBatchServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TextGenerationBatchServiceFileDescriptorSupplier())
              .addMethod(getCompletionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
