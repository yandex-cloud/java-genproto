package yandex.cloud.api.speechsense.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/speechsense/v1/talk_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TalkServiceGrpc {

  private TalkServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.speechsense.v1.TalkService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.speechsense.v1.TalkProto.StreamTalkRequest,
      yandex.cloud.api.speechsense.v1.TalkProto.UploadTalkResponse> getUploadAsStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UploadAsStream",
      requestType = yandex.cloud.api.speechsense.v1.TalkProto.StreamTalkRequest.class,
      responseType = yandex.cloud.api.speechsense.v1.TalkProto.UploadTalkResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.speechsense.v1.TalkProto.StreamTalkRequest,
      yandex.cloud.api.speechsense.v1.TalkProto.UploadTalkResponse> getUploadAsStreamMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.speechsense.v1.TalkProto.StreamTalkRequest, yandex.cloud.api.speechsense.v1.TalkProto.UploadTalkResponse> getUploadAsStreamMethod;
    if ((getUploadAsStreamMethod = TalkServiceGrpc.getUploadAsStreamMethod) == null) {
      synchronized (TalkServiceGrpc.class) {
        if ((getUploadAsStreamMethod = TalkServiceGrpc.getUploadAsStreamMethod) == null) {
          TalkServiceGrpc.getUploadAsStreamMethod = getUploadAsStreamMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.speechsense.v1.TalkProto.StreamTalkRequest, yandex.cloud.api.speechsense.v1.TalkProto.UploadTalkResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UploadAsStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.speechsense.v1.TalkProto.StreamTalkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.speechsense.v1.TalkProto.UploadTalkResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TalkServiceMethodDescriptorSupplier("UploadAsStream"))
              .build();
        }
      }
    }
    return getUploadAsStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.speechsense.v1.TalkProto.UploadTalkRequest,
      yandex.cloud.api.speechsense.v1.TalkProto.UploadTalkResponse> getUploadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Upload",
      requestType = yandex.cloud.api.speechsense.v1.TalkProto.UploadTalkRequest.class,
      responseType = yandex.cloud.api.speechsense.v1.TalkProto.UploadTalkResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.speechsense.v1.TalkProto.UploadTalkRequest,
      yandex.cloud.api.speechsense.v1.TalkProto.UploadTalkResponse> getUploadMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.speechsense.v1.TalkProto.UploadTalkRequest, yandex.cloud.api.speechsense.v1.TalkProto.UploadTalkResponse> getUploadMethod;
    if ((getUploadMethod = TalkServiceGrpc.getUploadMethod) == null) {
      synchronized (TalkServiceGrpc.class) {
        if ((getUploadMethod = TalkServiceGrpc.getUploadMethod) == null) {
          TalkServiceGrpc.getUploadMethod = getUploadMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.speechsense.v1.TalkProto.UploadTalkRequest, yandex.cloud.api.speechsense.v1.TalkProto.UploadTalkResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Upload"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.speechsense.v1.TalkProto.UploadTalkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.speechsense.v1.TalkProto.UploadTalkResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TalkServiceMethodDescriptorSupplier("Upload"))
              .build();
        }
      }
    }
    return getUploadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.speechsense.v1.TalkProto.UploadTextRequest,
      yandex.cloud.api.speechsense.v1.TalkProto.UploadTextResponse> getUploadTextMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UploadText",
      requestType = yandex.cloud.api.speechsense.v1.TalkProto.UploadTextRequest.class,
      responseType = yandex.cloud.api.speechsense.v1.TalkProto.UploadTextResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.speechsense.v1.TalkProto.UploadTextRequest,
      yandex.cloud.api.speechsense.v1.TalkProto.UploadTextResponse> getUploadTextMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.speechsense.v1.TalkProto.UploadTextRequest, yandex.cloud.api.speechsense.v1.TalkProto.UploadTextResponse> getUploadTextMethod;
    if ((getUploadTextMethod = TalkServiceGrpc.getUploadTextMethod) == null) {
      synchronized (TalkServiceGrpc.class) {
        if ((getUploadTextMethod = TalkServiceGrpc.getUploadTextMethod) == null) {
          TalkServiceGrpc.getUploadTextMethod = getUploadTextMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.speechsense.v1.TalkProto.UploadTextRequest, yandex.cloud.api.speechsense.v1.TalkProto.UploadTextResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UploadText"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.speechsense.v1.TalkProto.UploadTextRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.speechsense.v1.TalkProto.UploadTextResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TalkServiceMethodDescriptorSupplier("UploadText"))
              .build();
        }
      }
    }
    return getUploadTextMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TalkServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TalkServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TalkServiceStub>() {
        @java.lang.Override
        public TalkServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TalkServiceStub(channel, callOptions);
        }
      };
    return TalkServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TalkServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TalkServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TalkServiceBlockingStub>() {
        @java.lang.Override
        public TalkServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TalkServiceBlockingStub(channel, callOptions);
        }
      };
    return TalkServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TalkServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TalkServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TalkServiceFutureStub>() {
        @java.lang.Override
        public TalkServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TalkServiceFutureStub(channel, callOptions);
        }
      };
    return TalkServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class TalkServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * rpc for streaming talk documents. First message should contain Talk related metadata,
     * second - audio metadata, others should contain audio bytes in chunks
     * </pre>
     */
    public io.grpc.stub.StreamObserver<yandex.cloud.api.speechsense.v1.TalkProto.StreamTalkRequest> uploadAsStream(
        io.grpc.stub.StreamObserver<yandex.cloud.api.speechsense.v1.TalkProto.UploadTalkResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getUploadAsStreamMethod(), responseObserver);
    }

    /**
     * <pre>
     * rpc for uploading talk document as single message
     * </pre>
     */
    public void upload(yandex.cloud.api.speechsense.v1.TalkProto.UploadTalkRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.speechsense.v1.TalkProto.UploadTalkResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUploadMethod(), responseObserver);
    }

    /**
     * <pre>
     * rpc for uploading text talk document
     * </pre>
     */
    public void uploadText(yandex.cloud.api.speechsense.v1.TalkProto.UploadTextRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.speechsense.v1.TalkProto.UploadTextResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUploadTextMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getUploadAsStreamMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                yandex.cloud.api.speechsense.v1.TalkProto.StreamTalkRequest,
                yandex.cloud.api.speechsense.v1.TalkProto.UploadTalkResponse>(
                  this, METHODID_UPLOAD_AS_STREAM)))
          .addMethod(
            getUploadMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.speechsense.v1.TalkProto.UploadTalkRequest,
                yandex.cloud.api.speechsense.v1.TalkProto.UploadTalkResponse>(
                  this, METHODID_UPLOAD)))
          .addMethod(
            getUploadTextMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.speechsense.v1.TalkProto.UploadTextRequest,
                yandex.cloud.api.speechsense.v1.TalkProto.UploadTextResponse>(
                  this, METHODID_UPLOAD_TEXT)))
          .build();
    }
  }

  /**
   */
  public static final class TalkServiceStub extends io.grpc.stub.AbstractAsyncStub<TalkServiceStub> {
    private TalkServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TalkServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TalkServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * rpc for streaming talk documents. First message should contain Talk related metadata,
     * second - audio metadata, others should contain audio bytes in chunks
     * </pre>
     */
    public io.grpc.stub.StreamObserver<yandex.cloud.api.speechsense.v1.TalkProto.StreamTalkRequest> uploadAsStream(
        io.grpc.stub.StreamObserver<yandex.cloud.api.speechsense.v1.TalkProto.UploadTalkResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getUploadAsStreamMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * rpc for uploading talk document as single message
     * </pre>
     */
    public void upload(yandex.cloud.api.speechsense.v1.TalkProto.UploadTalkRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.speechsense.v1.TalkProto.UploadTalkResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUploadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * rpc for uploading text talk document
     * </pre>
     */
    public void uploadText(yandex.cloud.api.speechsense.v1.TalkProto.UploadTextRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.speechsense.v1.TalkProto.UploadTextResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUploadTextMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TalkServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<TalkServiceBlockingStub> {
    private TalkServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TalkServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TalkServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * rpc for uploading talk document as single message
     * </pre>
     */
    public yandex.cloud.api.speechsense.v1.TalkProto.UploadTalkResponse upload(yandex.cloud.api.speechsense.v1.TalkProto.UploadTalkRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUploadMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * rpc for uploading text talk document
     * </pre>
     */
    public yandex.cloud.api.speechsense.v1.TalkProto.UploadTextResponse uploadText(yandex.cloud.api.speechsense.v1.TalkProto.UploadTextRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUploadTextMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TalkServiceFutureStub extends io.grpc.stub.AbstractFutureStub<TalkServiceFutureStub> {
    private TalkServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TalkServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TalkServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * rpc for uploading talk document as single message
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.speechsense.v1.TalkProto.UploadTalkResponse> upload(
        yandex.cloud.api.speechsense.v1.TalkProto.UploadTalkRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUploadMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * rpc for uploading text talk document
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.speechsense.v1.TalkProto.UploadTextResponse> uploadText(
        yandex.cloud.api.speechsense.v1.TalkProto.UploadTextRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUploadTextMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UPLOAD = 0;
  private static final int METHODID_UPLOAD_TEXT = 1;
  private static final int METHODID_UPLOAD_AS_STREAM = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TalkServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TalkServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UPLOAD:
          serviceImpl.upload((yandex.cloud.api.speechsense.v1.TalkProto.UploadTalkRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.speechsense.v1.TalkProto.UploadTalkResponse>) responseObserver);
          break;
        case METHODID_UPLOAD_TEXT:
          serviceImpl.uploadText((yandex.cloud.api.speechsense.v1.TalkProto.UploadTextRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.speechsense.v1.TalkProto.UploadTextResponse>) responseObserver);
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
        case METHODID_UPLOAD_AS_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.uploadAsStream(
              (io.grpc.stub.StreamObserver<yandex.cloud.api.speechsense.v1.TalkProto.UploadTalkResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class TalkServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TalkServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.speechsense.v1.TalkProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TalkService");
    }
  }

  private static final class TalkServiceFileDescriptorSupplier
      extends TalkServiceBaseDescriptorSupplier {
    TalkServiceFileDescriptorSupplier() {}
  }

  private static final class TalkServiceMethodDescriptorSupplier
      extends TalkServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TalkServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TalkServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TalkServiceFileDescriptorSupplier())
              .addMethod(getUploadAsStreamMethod())
              .addMethod(getUploadMethod())
              .addMethod(getUploadTextMethod())
              .build();
        }
      }
    }
    return result;
  }
}
