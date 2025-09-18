package yandex.cloud.api.ai.stt.v3;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for asynchronous speech recognition: recognize pre-recorded audio and receive results by request.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/ai/stt/v3/stt_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AsyncRecognizerGrpc {

  private AsyncRecognizerGrpc() {}

  public static final String SERVICE_NAME = "speechkit.stt.v3.AsyncRecognizer";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.stt.v3.Stt.RecognizeFileRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRecognizeFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RecognizeFile",
      requestType = yandex.cloud.api.ai.stt.v3.Stt.RecognizeFileRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.stt.v3.Stt.RecognizeFileRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRecognizeFileMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.stt.v3.Stt.RecognizeFileRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getRecognizeFileMethod;
    if ((getRecognizeFileMethod = AsyncRecognizerGrpc.getRecognizeFileMethod) == null) {
      synchronized (AsyncRecognizerGrpc.class) {
        if ((getRecognizeFileMethod = AsyncRecognizerGrpc.getRecognizeFileMethod) == null) {
          AsyncRecognizerGrpc.getRecognizeFileMethod = getRecognizeFileMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.stt.v3.Stt.RecognizeFileRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RecognizeFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.stt.v3.Stt.RecognizeFileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new AsyncRecognizerMethodDescriptorSupplier("RecognizeFile"))
              .build();
        }
      }
    }
    return getRecognizeFileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.stt.v3.SttService.GetRecognitionRequest,
      yandex.cloud.api.ai.stt.v3.Stt.StreamingResponse> getGetRecognitionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRecognition",
      requestType = yandex.cloud.api.ai.stt.v3.SttService.GetRecognitionRequest.class,
      responseType = yandex.cloud.api.ai.stt.v3.Stt.StreamingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.stt.v3.SttService.GetRecognitionRequest,
      yandex.cloud.api.ai.stt.v3.Stt.StreamingResponse> getGetRecognitionMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.stt.v3.SttService.GetRecognitionRequest, yandex.cloud.api.ai.stt.v3.Stt.StreamingResponse> getGetRecognitionMethod;
    if ((getGetRecognitionMethod = AsyncRecognizerGrpc.getGetRecognitionMethod) == null) {
      synchronized (AsyncRecognizerGrpc.class) {
        if ((getGetRecognitionMethod = AsyncRecognizerGrpc.getGetRecognitionMethod) == null) {
          AsyncRecognizerGrpc.getGetRecognitionMethod = getGetRecognitionMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.stt.v3.SttService.GetRecognitionRequest, yandex.cloud.api.ai.stt.v3.Stt.StreamingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRecognition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.stt.v3.SttService.GetRecognitionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.stt.v3.Stt.StreamingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AsyncRecognizerMethodDescriptorSupplier("GetRecognition"))
              .build();
        }
      }
    }
    return getGetRecognitionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.stt.v3.Stt.DeleteRecognitionRequest,
      com.google.protobuf.Empty> getDeleteRecognitionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteRecognition",
      requestType = yandex.cloud.api.ai.stt.v3.Stt.DeleteRecognitionRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.stt.v3.Stt.DeleteRecognitionRequest,
      com.google.protobuf.Empty> getDeleteRecognitionMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.stt.v3.Stt.DeleteRecognitionRequest, com.google.protobuf.Empty> getDeleteRecognitionMethod;
    if ((getDeleteRecognitionMethod = AsyncRecognizerGrpc.getDeleteRecognitionMethod) == null) {
      synchronized (AsyncRecognizerGrpc.class) {
        if ((getDeleteRecognitionMethod = AsyncRecognizerGrpc.getDeleteRecognitionMethod) == null) {
          AsyncRecognizerGrpc.getDeleteRecognitionMethod = getDeleteRecognitionMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.stt.v3.Stt.DeleteRecognitionRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteRecognition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.stt.v3.Stt.DeleteRecognitionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new AsyncRecognizerMethodDescriptorSupplier("DeleteRecognition"))
              .build();
        }
      }
    }
    return getDeleteRecognitionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AsyncRecognizerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AsyncRecognizerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AsyncRecognizerStub>() {
        @java.lang.Override
        public AsyncRecognizerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AsyncRecognizerStub(channel, callOptions);
        }
      };
    return AsyncRecognizerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AsyncRecognizerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AsyncRecognizerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AsyncRecognizerBlockingStub>() {
        @java.lang.Override
        public AsyncRecognizerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AsyncRecognizerBlockingStub(channel, callOptions);
        }
      };
    return AsyncRecognizerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AsyncRecognizerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AsyncRecognizerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AsyncRecognizerFutureStub>() {
        @java.lang.Override
        public AsyncRecognizerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AsyncRecognizerFutureStub(channel, callOptions);
        }
      };
    return AsyncRecognizerFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for asynchronous speech recognition: recognize pre-recorded audio and receive results by request.
   * </pre>
   */
  public static abstract class AsyncRecognizerImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Performs asynchronous speech recognition.
     * </pre>
     */
    public void recognizeFile(yandex.cloud.api.ai.stt.v3.Stt.RecognizeFileRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRecognizeFileMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets results of asynchronous recognition after finishing the operation.
     * </pre>
     */
    public void getRecognition(yandex.cloud.api.ai.stt.v3.SttService.GetRecognitionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.stt.v3.Stt.StreamingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRecognitionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes results of asynchronous recognition by operation ID.
     * </pre>
     */
    public void deleteRecognition(yandex.cloud.api.ai.stt.v3.Stt.DeleteRecognitionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteRecognitionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRecognizeFileMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.stt.v3.Stt.RecognizeFileRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_RECOGNIZE_FILE)))
          .addMethod(
            getGetRecognitionMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                yandex.cloud.api.ai.stt.v3.SttService.GetRecognitionRequest,
                yandex.cloud.api.ai.stt.v3.Stt.StreamingResponse>(
                  this, METHODID_GET_RECOGNITION)))
          .addMethod(
            getDeleteRecognitionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.stt.v3.Stt.DeleteRecognitionRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_RECOGNITION)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for asynchronous speech recognition: recognize pre-recorded audio and receive results by request.
   * </pre>
   */
  public static final class AsyncRecognizerStub extends io.grpc.stub.AbstractAsyncStub<AsyncRecognizerStub> {
    private AsyncRecognizerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AsyncRecognizerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AsyncRecognizerStub(channel, callOptions);
    }

    /**
     * <pre>
     * Performs asynchronous speech recognition.
     * </pre>
     */
    public void recognizeFile(yandex.cloud.api.ai.stt.v3.Stt.RecognizeFileRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRecognizeFileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets results of asynchronous recognition after finishing the operation.
     * </pre>
     */
    public void getRecognition(yandex.cloud.api.ai.stt.v3.SttService.GetRecognitionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.stt.v3.Stt.StreamingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetRecognitionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes results of asynchronous recognition by operation ID.
     * </pre>
     */
    public void deleteRecognition(yandex.cloud.api.ai.stt.v3.Stt.DeleteRecognitionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteRecognitionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for asynchronous speech recognition: recognize pre-recorded audio and receive results by request.
   * </pre>
   */
  public static final class AsyncRecognizerBlockingStub extends io.grpc.stub.AbstractBlockingStub<AsyncRecognizerBlockingStub> {
    private AsyncRecognizerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AsyncRecognizerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AsyncRecognizerBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Performs asynchronous speech recognition.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation recognizeFile(yandex.cloud.api.ai.stt.v3.Stt.RecognizeFileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRecognizeFileMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets results of asynchronous recognition after finishing the operation.
     * </pre>
     */
    public java.util.Iterator<yandex.cloud.api.ai.stt.v3.Stt.StreamingResponse> getRecognition(
        yandex.cloud.api.ai.stt.v3.SttService.GetRecognitionRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetRecognitionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes results of asynchronous recognition by operation ID.
     * </pre>
     */
    public com.google.protobuf.Empty deleteRecognition(yandex.cloud.api.ai.stt.v3.Stt.DeleteRecognitionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteRecognitionMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for asynchronous speech recognition: recognize pre-recorded audio and receive results by request.
   * </pre>
   */
  public static final class AsyncRecognizerFutureStub extends io.grpc.stub.AbstractFutureStub<AsyncRecognizerFutureStub> {
    private AsyncRecognizerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AsyncRecognizerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AsyncRecognizerFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Performs asynchronous speech recognition.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> recognizeFile(
        yandex.cloud.api.ai.stt.v3.Stt.RecognizeFileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRecognizeFileMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes results of asynchronous recognition by operation ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteRecognition(
        yandex.cloud.api.ai.stt.v3.Stt.DeleteRecognitionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteRecognitionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RECOGNIZE_FILE = 0;
  private static final int METHODID_GET_RECOGNITION = 1;
  private static final int METHODID_DELETE_RECOGNITION = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncRecognizerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncRecognizerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RECOGNIZE_FILE:
          serviceImpl.recognizeFile((yandex.cloud.api.ai.stt.v3.Stt.RecognizeFileRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_GET_RECOGNITION:
          serviceImpl.getRecognition((yandex.cloud.api.ai.stt.v3.SttService.GetRecognitionRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ai.stt.v3.Stt.StreamingResponse>) responseObserver);
          break;
        case METHODID_DELETE_RECOGNITION:
          serviceImpl.deleteRecognition((yandex.cloud.api.ai.stt.v3.Stt.DeleteRecognitionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
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

  private static abstract class AsyncRecognizerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AsyncRecognizerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.ai.stt.v3.SttService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AsyncRecognizer");
    }
  }

  private static final class AsyncRecognizerFileDescriptorSupplier
      extends AsyncRecognizerBaseDescriptorSupplier {
    AsyncRecognizerFileDescriptorSupplier() {}
  }

  private static final class AsyncRecognizerMethodDescriptorSupplier
      extends AsyncRecognizerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AsyncRecognizerMethodDescriptorSupplier(String methodName) {
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
      synchronized (AsyncRecognizerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AsyncRecognizerFileDescriptorSupplier())
              .addMethod(getRecognizeFileMethod())
              .addMethod(getGetRecognitionMethod())
              .addMethod(getDeleteRecognitionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
