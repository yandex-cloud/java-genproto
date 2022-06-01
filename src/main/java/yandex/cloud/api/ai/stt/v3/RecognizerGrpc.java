package yandex.cloud.api.ai.stt.v3;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for voice recognition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/ai/stt/v3/stt_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RecognizerGrpc {

  private RecognizerGrpc() {}

  public static final String SERVICE_NAME = "speechkit.stt.v3.Recognizer";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.stt.v3.Stt.StreamingRequest,
      yandex.cloud.api.ai.stt.v3.Stt.StreamingResponse> getRecognizeStreamingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RecognizeStreaming",
      requestType = yandex.cloud.api.ai.stt.v3.Stt.StreamingRequest.class,
      responseType = yandex.cloud.api.ai.stt.v3.Stt.StreamingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.stt.v3.Stt.StreamingRequest,
      yandex.cloud.api.ai.stt.v3.Stt.StreamingResponse> getRecognizeStreamingMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.stt.v3.Stt.StreamingRequest, yandex.cloud.api.ai.stt.v3.Stt.StreamingResponse> getRecognizeStreamingMethod;
    if ((getRecognizeStreamingMethod = RecognizerGrpc.getRecognizeStreamingMethod) == null) {
      synchronized (RecognizerGrpc.class) {
        if ((getRecognizeStreamingMethod = RecognizerGrpc.getRecognizeStreamingMethod) == null) {
          RecognizerGrpc.getRecognizeStreamingMethod = getRecognizeStreamingMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.stt.v3.Stt.StreamingRequest, yandex.cloud.api.ai.stt.v3.Stt.StreamingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RecognizeStreaming"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.stt.v3.Stt.StreamingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.stt.v3.Stt.StreamingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RecognizerMethodDescriptorSupplier("RecognizeStreaming"))
              .build();
        }
      }
    }
    return getRecognizeStreamingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RecognizerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RecognizerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RecognizerStub>() {
        @java.lang.Override
        public RecognizerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RecognizerStub(channel, callOptions);
        }
      };
    return RecognizerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RecognizerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RecognizerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RecognizerBlockingStub>() {
        @java.lang.Override
        public RecognizerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RecognizerBlockingStub(channel, callOptions);
        }
      };
    return RecognizerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RecognizerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RecognizerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RecognizerFutureStub>() {
        @java.lang.Override
        public RecognizerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RecognizerFutureStub(channel, callOptions);
        }
      };
    return RecognizerFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for voice recognition.
   * </pre>
   */
  public static abstract class RecognizerImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Expects audio in real-time
     * </pre>
     */
    public io.grpc.stub.StreamObserver<yandex.cloud.api.ai.stt.v3.Stt.StreamingRequest> recognizeStreaming(
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.stt.v3.Stt.StreamingResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getRecognizeStreamingMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRecognizeStreamingMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                yandex.cloud.api.ai.stt.v3.Stt.StreamingRequest,
                yandex.cloud.api.ai.stt.v3.Stt.StreamingResponse>(
                  this, METHODID_RECOGNIZE_STREAMING)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for voice recognition.
   * </pre>
   */
  public static final class RecognizerStub extends io.grpc.stub.AbstractAsyncStub<RecognizerStub> {
    private RecognizerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RecognizerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RecognizerStub(channel, callOptions);
    }

    /**
     * <pre>
     * Expects audio in real-time
     * </pre>
     */
    public io.grpc.stub.StreamObserver<yandex.cloud.api.ai.stt.v3.Stt.StreamingRequest> recognizeStreaming(
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.stt.v3.Stt.StreamingResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getRecognizeStreamingMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for voice recognition.
   * </pre>
   */
  public static final class RecognizerBlockingStub extends io.grpc.stub.AbstractBlockingStub<RecognizerBlockingStub> {
    private RecognizerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RecognizerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RecognizerBlockingStub(channel, callOptions);
    }
  }

  /**
   * <pre>
   * A set of methods for voice recognition.
   * </pre>
   */
  public static final class RecognizerFutureStub extends io.grpc.stub.AbstractFutureStub<RecognizerFutureStub> {
    private RecognizerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RecognizerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RecognizerFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_RECOGNIZE_STREAMING = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RecognizerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RecognizerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RECOGNIZE_STREAMING:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.recognizeStreaming(
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ai.stt.v3.Stt.StreamingResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class RecognizerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RecognizerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.ai.stt.v3.SttService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Recognizer");
    }
  }

  private static final class RecognizerFileDescriptorSupplier
      extends RecognizerBaseDescriptorSupplier {
    RecognizerFileDescriptorSupplier() {}
  }

  private static final class RecognizerMethodDescriptorSupplier
      extends RecognizerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RecognizerMethodDescriptorSupplier(String methodName) {
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
      synchronized (RecognizerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RecognizerFileDescriptorSupplier())
              .addMethod(getRecognizeStreamingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
