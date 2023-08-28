package yandex.cloud.api.ai.ocr.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/ai/ocr/v1/ocr_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TextRecognitionAsyncServiceGrpc {

  private TextRecognitionAsyncServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.ai.ocr.v1.TextRecognitionAsyncService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.ocr.v1.OcrService.RecognizeTextRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRecognizeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Recognize",
      requestType = yandex.cloud.api.ai.ocr.v1.OcrService.RecognizeTextRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.ocr.v1.OcrService.RecognizeTextRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRecognizeMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.ocr.v1.OcrService.RecognizeTextRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getRecognizeMethod;
    if ((getRecognizeMethod = TextRecognitionAsyncServiceGrpc.getRecognizeMethod) == null) {
      synchronized (TextRecognitionAsyncServiceGrpc.class) {
        if ((getRecognizeMethod = TextRecognitionAsyncServiceGrpc.getRecognizeMethod) == null) {
          TextRecognitionAsyncServiceGrpc.getRecognizeMethod = getRecognizeMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.ocr.v1.OcrService.RecognizeTextRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Recognize"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.ocr.v1.OcrService.RecognizeTextRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new TextRecognitionAsyncServiceMethodDescriptorSupplier("Recognize"))
              .build();
        }
      }
    }
    return getRecognizeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.ocr.v1.OcrService.GetRecognitionRequest,
      yandex.cloud.api.ai.ocr.v1.OcrService.RecognizeTextResponse> getGetRecognitionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRecognition",
      requestType = yandex.cloud.api.ai.ocr.v1.OcrService.GetRecognitionRequest.class,
      responseType = yandex.cloud.api.ai.ocr.v1.OcrService.RecognizeTextResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.ocr.v1.OcrService.GetRecognitionRequest,
      yandex.cloud.api.ai.ocr.v1.OcrService.RecognizeTextResponse> getGetRecognitionMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.ocr.v1.OcrService.GetRecognitionRequest, yandex.cloud.api.ai.ocr.v1.OcrService.RecognizeTextResponse> getGetRecognitionMethod;
    if ((getGetRecognitionMethod = TextRecognitionAsyncServiceGrpc.getGetRecognitionMethod) == null) {
      synchronized (TextRecognitionAsyncServiceGrpc.class) {
        if ((getGetRecognitionMethod = TextRecognitionAsyncServiceGrpc.getGetRecognitionMethod) == null) {
          TextRecognitionAsyncServiceGrpc.getGetRecognitionMethod = getGetRecognitionMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.ocr.v1.OcrService.GetRecognitionRequest, yandex.cloud.api.ai.ocr.v1.OcrService.RecognizeTextResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRecognition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.ocr.v1.OcrService.GetRecognitionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.ocr.v1.OcrService.RecognizeTextResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TextRecognitionAsyncServiceMethodDescriptorSupplier("GetRecognition"))
              .build();
        }
      }
    }
    return getGetRecognitionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TextRecognitionAsyncServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TextRecognitionAsyncServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TextRecognitionAsyncServiceStub>() {
        @java.lang.Override
        public TextRecognitionAsyncServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TextRecognitionAsyncServiceStub(channel, callOptions);
        }
      };
    return TextRecognitionAsyncServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TextRecognitionAsyncServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TextRecognitionAsyncServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TextRecognitionAsyncServiceBlockingStub>() {
        @java.lang.Override
        public TextRecognitionAsyncServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TextRecognitionAsyncServiceBlockingStub(channel, callOptions);
        }
      };
    return TextRecognitionAsyncServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TextRecognitionAsyncServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TextRecognitionAsyncServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TextRecognitionAsyncServiceFutureStub>() {
        @java.lang.Override
        public TextRecognitionAsyncServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TextRecognitionAsyncServiceFutureStub(channel, callOptions);
        }
      };
    return TextRecognitionAsyncServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class TextRecognitionAsyncServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void recognize(yandex.cloud.api.ai.ocr.v1.OcrService.RecognizeTextRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRecognizeMethod(), responseObserver);
    }

    /**
     */
    public void getRecognition(yandex.cloud.api.ai.ocr.v1.OcrService.GetRecognitionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.ocr.v1.OcrService.RecognizeTextResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRecognitionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRecognizeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.ocr.v1.OcrService.RecognizeTextRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_RECOGNIZE)))
          .addMethod(
            getGetRecognitionMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                yandex.cloud.api.ai.ocr.v1.OcrService.GetRecognitionRequest,
                yandex.cloud.api.ai.ocr.v1.OcrService.RecognizeTextResponse>(
                  this, METHODID_GET_RECOGNITION)))
          .build();
    }
  }

  /**
   */
  public static final class TextRecognitionAsyncServiceStub extends io.grpc.stub.AbstractAsyncStub<TextRecognitionAsyncServiceStub> {
    private TextRecognitionAsyncServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TextRecognitionAsyncServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TextRecognitionAsyncServiceStub(channel, callOptions);
    }

    /**
     */
    public void recognize(yandex.cloud.api.ai.ocr.v1.OcrService.RecognizeTextRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRecognizeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRecognition(yandex.cloud.api.ai.ocr.v1.OcrService.GetRecognitionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.ocr.v1.OcrService.RecognizeTextResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetRecognitionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TextRecognitionAsyncServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<TextRecognitionAsyncServiceBlockingStub> {
    private TextRecognitionAsyncServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TextRecognitionAsyncServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TextRecognitionAsyncServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation recognize(yandex.cloud.api.ai.ocr.v1.OcrService.RecognizeTextRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRecognizeMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<yandex.cloud.api.ai.ocr.v1.OcrService.RecognizeTextResponse> getRecognition(
        yandex.cloud.api.ai.ocr.v1.OcrService.GetRecognitionRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetRecognitionMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TextRecognitionAsyncServiceFutureStub extends io.grpc.stub.AbstractFutureStub<TextRecognitionAsyncServiceFutureStub> {
    private TextRecognitionAsyncServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TextRecognitionAsyncServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TextRecognitionAsyncServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> recognize(
        yandex.cloud.api.ai.ocr.v1.OcrService.RecognizeTextRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRecognizeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RECOGNIZE = 0;
  private static final int METHODID_GET_RECOGNITION = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TextRecognitionAsyncServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TextRecognitionAsyncServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RECOGNIZE:
          serviceImpl.recognize((yandex.cloud.api.ai.ocr.v1.OcrService.RecognizeTextRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_GET_RECOGNITION:
          serviceImpl.getRecognition((yandex.cloud.api.ai.ocr.v1.OcrService.GetRecognitionRequest) request,
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

  private static abstract class TextRecognitionAsyncServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TextRecognitionAsyncServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.ai.ocr.v1.OcrService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TextRecognitionAsyncService");
    }
  }

  private static final class TextRecognitionAsyncServiceFileDescriptorSupplier
      extends TextRecognitionAsyncServiceBaseDescriptorSupplier {
    TextRecognitionAsyncServiceFileDescriptorSupplier() {}
  }

  private static final class TextRecognitionAsyncServiceMethodDescriptorSupplier
      extends TextRecognitionAsyncServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TextRecognitionAsyncServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TextRecognitionAsyncServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TextRecognitionAsyncServiceFileDescriptorSupplier())
              .addMethod(getRecognizeMethod())
              .addMethod(getGetRecognitionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
