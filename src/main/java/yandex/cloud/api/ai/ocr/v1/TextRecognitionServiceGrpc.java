package yandex.cloud.api.ai.ocr.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for the Vision OCR service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/ai/ocr/v1/ocr_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TextRecognitionServiceGrpc {

  private TextRecognitionServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.ai.ocr.v1.TextRecognitionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.ocr.v1.OcrService.RecognizeTextRequest,
      yandex.cloud.api.ai.ocr.v1.OcrService.RecognizeTextResponse> getRecognizeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Recognize",
      requestType = yandex.cloud.api.ai.ocr.v1.OcrService.RecognizeTextRequest.class,
      responseType = yandex.cloud.api.ai.ocr.v1.OcrService.RecognizeTextResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.ocr.v1.OcrService.RecognizeTextRequest,
      yandex.cloud.api.ai.ocr.v1.OcrService.RecognizeTextResponse> getRecognizeMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.ocr.v1.OcrService.RecognizeTextRequest, yandex.cloud.api.ai.ocr.v1.OcrService.RecognizeTextResponse> getRecognizeMethod;
    if ((getRecognizeMethod = TextRecognitionServiceGrpc.getRecognizeMethod) == null) {
      synchronized (TextRecognitionServiceGrpc.class) {
        if ((getRecognizeMethod = TextRecognitionServiceGrpc.getRecognizeMethod) == null) {
          TextRecognitionServiceGrpc.getRecognizeMethod = getRecognizeMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.ocr.v1.OcrService.RecognizeTextRequest, yandex.cloud.api.ai.ocr.v1.OcrService.RecognizeTextResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Recognize"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.ocr.v1.OcrService.RecognizeTextRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.ocr.v1.OcrService.RecognizeTextResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TextRecognitionServiceMethodDescriptorSupplier("Recognize"))
              .build();
        }
      }
    }
    return getRecognizeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TextRecognitionServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TextRecognitionServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TextRecognitionServiceStub>() {
        @java.lang.Override
        public TextRecognitionServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TextRecognitionServiceStub(channel, callOptions);
        }
      };
    return TextRecognitionServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TextRecognitionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TextRecognitionServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TextRecognitionServiceBlockingStub>() {
        @java.lang.Override
        public TextRecognitionServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TextRecognitionServiceBlockingStub(channel, callOptions);
        }
      };
    return TextRecognitionServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TextRecognitionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TextRecognitionServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TextRecognitionServiceFutureStub>() {
        @java.lang.Override
        public TextRecognitionServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TextRecognitionServiceFutureStub(channel, callOptions);
        }
      };
    return TextRecognitionServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for the Vision OCR service.
   * </pre>
   */
  public static abstract class TextRecognitionServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * To send the image for text recognition.
     * </pre>
     */
    public void recognize(yandex.cloud.api.ai.ocr.v1.OcrService.RecognizeTextRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.ocr.v1.OcrService.RecognizeTextResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRecognizeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRecognizeMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                yandex.cloud.api.ai.ocr.v1.OcrService.RecognizeTextRequest,
                yandex.cloud.api.ai.ocr.v1.OcrService.RecognizeTextResponse>(
                  this, METHODID_RECOGNIZE)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for the Vision OCR service.
   * </pre>
   */
  public static final class TextRecognitionServiceStub extends io.grpc.stub.AbstractAsyncStub<TextRecognitionServiceStub> {
    private TextRecognitionServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TextRecognitionServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TextRecognitionServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * To send the image for text recognition.
     * </pre>
     */
    public void recognize(yandex.cloud.api.ai.ocr.v1.OcrService.RecognizeTextRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.ocr.v1.OcrService.RecognizeTextResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getRecognizeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for the Vision OCR service.
   * </pre>
   */
  public static final class TextRecognitionServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<TextRecognitionServiceBlockingStub> {
    private TextRecognitionServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TextRecognitionServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TextRecognitionServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * To send the image for text recognition.
     * </pre>
     */
    public java.util.Iterator<yandex.cloud.api.ai.ocr.v1.OcrService.RecognizeTextResponse> recognize(
        yandex.cloud.api.ai.ocr.v1.OcrService.RecognizeTextRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getRecognizeMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for the Vision OCR service.
   * </pre>
   */
  public static final class TextRecognitionServiceFutureStub extends io.grpc.stub.AbstractFutureStub<TextRecognitionServiceFutureStub> {
    private TextRecognitionServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TextRecognitionServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TextRecognitionServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_RECOGNIZE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TextRecognitionServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TextRecognitionServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RECOGNIZE:
          serviceImpl.recognize((yandex.cloud.api.ai.ocr.v1.OcrService.RecognizeTextRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ai.ocr.v1.OcrService.RecognizeTextResponse>) responseObserver);
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

  private static abstract class TextRecognitionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TextRecognitionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.ai.ocr.v1.OcrService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TextRecognitionService");
    }
  }

  private static final class TextRecognitionServiceFileDescriptorSupplier
      extends TextRecognitionServiceBaseDescriptorSupplier {
    TextRecognitionServiceFileDescriptorSupplier() {}
  }

  private static final class TextRecognitionServiceMethodDescriptorSupplier
      extends TextRecognitionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TextRecognitionServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TextRecognitionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TextRecognitionServiceFileDescriptorSupplier())
              .addMethod(getRecognizeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
