package yandex.cloud.api.ai.foundation_models.v1.text_classification;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service for classifying text from input text.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/ai/foundation_models/v1/text_classification/text_classification_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TextClassificationServiceGrpc {

  private TextClassificationServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.ai.foundation_models.v1.text_classification.TextClassificationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.foundation_models.v1.text_classification.TextClassificationServiceOuterClass.TextClassificationRequest,
      yandex.cloud.api.ai.foundation_models.v1.text_classification.TextClassificationServiceOuterClass.TextClassificationResponse> getClassifyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Classify",
      requestType = yandex.cloud.api.ai.foundation_models.v1.text_classification.TextClassificationServiceOuterClass.TextClassificationRequest.class,
      responseType = yandex.cloud.api.ai.foundation_models.v1.text_classification.TextClassificationServiceOuterClass.TextClassificationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.foundation_models.v1.text_classification.TextClassificationServiceOuterClass.TextClassificationRequest,
      yandex.cloud.api.ai.foundation_models.v1.text_classification.TextClassificationServiceOuterClass.TextClassificationResponse> getClassifyMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.foundation_models.v1.text_classification.TextClassificationServiceOuterClass.TextClassificationRequest, yandex.cloud.api.ai.foundation_models.v1.text_classification.TextClassificationServiceOuterClass.TextClassificationResponse> getClassifyMethod;
    if ((getClassifyMethod = TextClassificationServiceGrpc.getClassifyMethod) == null) {
      synchronized (TextClassificationServiceGrpc.class) {
        if ((getClassifyMethod = TextClassificationServiceGrpc.getClassifyMethod) == null) {
          TextClassificationServiceGrpc.getClassifyMethod = getClassifyMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.foundation_models.v1.text_classification.TextClassificationServiceOuterClass.TextClassificationRequest, yandex.cloud.api.ai.foundation_models.v1.text_classification.TextClassificationServiceOuterClass.TextClassificationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Classify"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.foundation_models.v1.text_classification.TextClassificationServiceOuterClass.TextClassificationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.foundation_models.v1.text_classification.TextClassificationServiceOuterClass.TextClassificationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TextClassificationServiceMethodDescriptorSupplier("Classify"))
              .build();
        }
      }
    }
    return getClassifyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TextClassificationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TextClassificationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TextClassificationServiceStub>() {
        @java.lang.Override
        public TextClassificationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TextClassificationServiceStub(channel, callOptions);
        }
      };
    return TextClassificationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TextClassificationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TextClassificationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TextClassificationServiceBlockingStub>() {
        @java.lang.Override
        public TextClassificationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TextClassificationServiceBlockingStub(channel, callOptions);
        }
      };
    return TextClassificationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TextClassificationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TextClassificationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TextClassificationServiceFutureStub>() {
        @java.lang.Override
        public TextClassificationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TextClassificationServiceFutureStub(channel, callOptions);
        }
      };
    return TextClassificationServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service for classifying text from input text.
   * </pre>
   */
  public static abstract class TextClassificationServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * RPC method for classifying text.
     * </pre>
     */
    public void classify(yandex.cloud.api.ai.foundation_models.v1.text_classification.TextClassificationServiceOuterClass.TextClassificationRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.foundation_models.v1.text_classification.TextClassificationServiceOuterClass.TextClassificationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClassifyMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getClassifyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.foundation_models.v1.text_classification.TextClassificationServiceOuterClass.TextClassificationRequest,
                yandex.cloud.api.ai.foundation_models.v1.text_classification.TextClassificationServiceOuterClass.TextClassificationResponse>(
                  this, METHODID_CLASSIFY)))
          .build();
    }
  }

  /**
   * <pre>
   * Service for classifying text from input text.
   * </pre>
   */
  public static final class TextClassificationServiceStub extends io.grpc.stub.AbstractAsyncStub<TextClassificationServiceStub> {
    private TextClassificationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TextClassificationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TextClassificationServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * RPC method for classifying text.
     * </pre>
     */
    public void classify(yandex.cloud.api.ai.foundation_models.v1.text_classification.TextClassificationServiceOuterClass.TextClassificationRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.foundation_models.v1.text_classification.TextClassificationServiceOuterClass.TextClassificationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClassifyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service for classifying text from input text.
   * </pre>
   */
  public static final class TextClassificationServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<TextClassificationServiceBlockingStub> {
    private TextClassificationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TextClassificationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TextClassificationServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * RPC method for classifying text.
     * </pre>
     */
    public yandex.cloud.api.ai.foundation_models.v1.text_classification.TextClassificationServiceOuterClass.TextClassificationResponse classify(yandex.cloud.api.ai.foundation_models.v1.text_classification.TextClassificationServiceOuterClass.TextClassificationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClassifyMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service for classifying text from input text.
   * </pre>
   */
  public static final class TextClassificationServiceFutureStub extends io.grpc.stub.AbstractFutureStub<TextClassificationServiceFutureStub> {
    private TextClassificationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TextClassificationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TextClassificationServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * RPC method for classifying text.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ai.foundation_models.v1.text_classification.TextClassificationServiceOuterClass.TextClassificationResponse> classify(
        yandex.cloud.api.ai.foundation_models.v1.text_classification.TextClassificationServiceOuterClass.TextClassificationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClassifyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CLASSIFY = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TextClassificationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TextClassificationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CLASSIFY:
          serviceImpl.classify((yandex.cloud.api.ai.foundation_models.v1.text_classification.TextClassificationServiceOuterClass.TextClassificationRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ai.foundation_models.v1.text_classification.TextClassificationServiceOuterClass.TextClassificationResponse>) responseObserver);
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

  private static abstract class TextClassificationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TextClassificationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.ai.foundation_models.v1.text_classification.TextClassificationServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TextClassificationService");
    }
  }

  private static final class TextClassificationServiceFileDescriptorSupplier
      extends TextClassificationServiceBaseDescriptorSupplier {
    TextClassificationServiceFileDescriptorSupplier() {}
  }

  private static final class TextClassificationServiceMethodDescriptorSupplier
      extends TextClassificationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TextClassificationServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TextClassificationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TextClassificationServiceFileDescriptorSupplier())
              .addMethod(getClassifyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
