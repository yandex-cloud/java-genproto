package yandex.cloud.api.ai.stt.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/ai/stt/v2/stt_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SttServiceGrpc {

  private SttServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.ai.stt.v2.SttService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.stt.v2.SttServiceOuterClass.LongRunningRecognitionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getLongRunningRecognizeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LongRunningRecognize",
      requestType = yandex.cloud.api.ai.stt.v2.SttServiceOuterClass.LongRunningRecognitionRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.stt.v2.SttServiceOuterClass.LongRunningRecognitionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getLongRunningRecognizeMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.stt.v2.SttServiceOuterClass.LongRunningRecognitionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getLongRunningRecognizeMethod;
    if ((getLongRunningRecognizeMethod = SttServiceGrpc.getLongRunningRecognizeMethod) == null) {
      synchronized (SttServiceGrpc.class) {
        if ((getLongRunningRecognizeMethod = SttServiceGrpc.getLongRunningRecognizeMethod) == null) {
          SttServiceGrpc.getLongRunningRecognizeMethod = getLongRunningRecognizeMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.stt.v2.SttServiceOuterClass.LongRunningRecognitionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LongRunningRecognize"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.stt.v2.SttServiceOuterClass.LongRunningRecognitionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new SttServiceMethodDescriptorSupplier("LongRunningRecognize"))
              .build();
        }
      }
    }
    return getLongRunningRecognizeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.stt.v2.SttServiceOuterClass.StreamingRecognitionRequest,
      yandex.cloud.api.ai.stt.v2.SttServiceOuterClass.StreamingRecognitionResponse> getStreamingRecognizeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamingRecognize",
      requestType = yandex.cloud.api.ai.stt.v2.SttServiceOuterClass.StreamingRecognitionRequest.class,
      responseType = yandex.cloud.api.ai.stt.v2.SttServiceOuterClass.StreamingRecognitionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.stt.v2.SttServiceOuterClass.StreamingRecognitionRequest,
      yandex.cloud.api.ai.stt.v2.SttServiceOuterClass.StreamingRecognitionResponse> getStreamingRecognizeMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.stt.v2.SttServiceOuterClass.StreamingRecognitionRequest, yandex.cloud.api.ai.stt.v2.SttServiceOuterClass.StreamingRecognitionResponse> getStreamingRecognizeMethod;
    if ((getStreamingRecognizeMethod = SttServiceGrpc.getStreamingRecognizeMethod) == null) {
      synchronized (SttServiceGrpc.class) {
        if ((getStreamingRecognizeMethod = SttServiceGrpc.getStreamingRecognizeMethod) == null) {
          SttServiceGrpc.getStreamingRecognizeMethod = getStreamingRecognizeMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.stt.v2.SttServiceOuterClass.StreamingRecognitionRequest, yandex.cloud.api.ai.stt.v2.SttServiceOuterClass.StreamingRecognitionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamingRecognize"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.stt.v2.SttServiceOuterClass.StreamingRecognitionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.stt.v2.SttServiceOuterClass.StreamingRecognitionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SttServiceMethodDescriptorSupplier("StreamingRecognize"))
              .build();
        }
      }
    }
    return getStreamingRecognizeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SttServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SttServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SttServiceStub>() {
        @java.lang.Override
        public SttServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SttServiceStub(channel, callOptions);
        }
      };
    return SttServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SttServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SttServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SttServiceBlockingStub>() {
        @java.lang.Override
        public SttServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SttServiceBlockingStub(channel, callOptions);
        }
      };
    return SttServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SttServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SttServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SttServiceFutureStub>() {
        @java.lang.Override
        public SttServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SttServiceFutureStub(channel, callOptions);
        }
      };
    return SttServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SttServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void longRunningRecognize(yandex.cloud.api.ai.stt.v2.SttServiceOuterClass.LongRunningRecognitionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLongRunningRecognizeMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<yandex.cloud.api.ai.stt.v2.SttServiceOuterClass.StreamingRecognitionRequest> streamingRecognize(
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.stt.v2.SttServiceOuterClass.StreamingRecognitionResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getStreamingRecognizeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLongRunningRecognizeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.stt.v2.SttServiceOuterClass.LongRunningRecognitionRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_LONG_RUNNING_RECOGNIZE)))
          .addMethod(
            getStreamingRecognizeMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                yandex.cloud.api.ai.stt.v2.SttServiceOuterClass.StreamingRecognitionRequest,
                yandex.cloud.api.ai.stt.v2.SttServiceOuterClass.StreamingRecognitionResponse>(
                  this, METHODID_STREAMING_RECOGNIZE)))
          .build();
    }
  }

  /**
   */
  public static final class SttServiceStub extends io.grpc.stub.AbstractAsyncStub<SttServiceStub> {
    private SttServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SttServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SttServiceStub(channel, callOptions);
    }

    /**
     */
    public void longRunningRecognize(yandex.cloud.api.ai.stt.v2.SttServiceOuterClass.LongRunningRecognitionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLongRunningRecognizeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<yandex.cloud.api.ai.stt.v2.SttServiceOuterClass.StreamingRecognitionRequest> streamingRecognize(
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.stt.v2.SttServiceOuterClass.StreamingRecognitionResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getStreamingRecognizeMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class SttServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<SttServiceBlockingStub> {
    private SttServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SttServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SttServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation longRunningRecognize(yandex.cloud.api.ai.stt.v2.SttServiceOuterClass.LongRunningRecognitionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLongRunningRecognizeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SttServiceFutureStub extends io.grpc.stub.AbstractFutureStub<SttServiceFutureStub> {
    private SttServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SttServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SttServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> longRunningRecognize(
        yandex.cloud.api.ai.stt.v2.SttServiceOuterClass.LongRunningRecognitionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLongRunningRecognizeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LONG_RUNNING_RECOGNIZE = 0;
  private static final int METHODID_STREAMING_RECOGNIZE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SttServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SttServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LONG_RUNNING_RECOGNIZE:
          serviceImpl.longRunningRecognize((yandex.cloud.api.ai.stt.v2.SttServiceOuterClass.LongRunningRecognitionRequest) request,
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
        case METHODID_STREAMING_RECOGNIZE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.streamingRecognize(
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ai.stt.v2.SttServiceOuterClass.StreamingRecognitionResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SttServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SttServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.ai.stt.v2.SttServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SttService");
    }
  }

  private static final class SttServiceFileDescriptorSupplier
      extends SttServiceBaseDescriptorSupplier {
    SttServiceFileDescriptorSupplier() {}
  }

  private static final class SttServiceMethodDescriptorSupplier
      extends SttServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SttServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SttServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SttServiceFileDescriptorSupplier())
              .addMethod(getLongRunningRecognizeMethod())
              .addMethod(getStreamingRecognizeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
