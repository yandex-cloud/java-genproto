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
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.speechsense.v1.TalkServiceProto.StreamTalkRequest,
      yandex.cloud.api.speechsense.v1.TalkServiceProto.UploadTalkResponse> getUploadAsStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UploadAsStream",
      requestType = yandex.cloud.api.speechsense.v1.TalkServiceProto.StreamTalkRequest.class,
      responseType = yandex.cloud.api.speechsense.v1.TalkServiceProto.UploadTalkResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.speechsense.v1.TalkServiceProto.StreamTalkRequest,
      yandex.cloud.api.speechsense.v1.TalkServiceProto.UploadTalkResponse> getUploadAsStreamMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.speechsense.v1.TalkServiceProto.StreamTalkRequest, yandex.cloud.api.speechsense.v1.TalkServiceProto.UploadTalkResponse> getUploadAsStreamMethod;
    if ((getUploadAsStreamMethod = TalkServiceGrpc.getUploadAsStreamMethod) == null) {
      synchronized (TalkServiceGrpc.class) {
        if ((getUploadAsStreamMethod = TalkServiceGrpc.getUploadAsStreamMethod) == null) {
          TalkServiceGrpc.getUploadAsStreamMethod = getUploadAsStreamMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.speechsense.v1.TalkServiceProto.StreamTalkRequest, yandex.cloud.api.speechsense.v1.TalkServiceProto.UploadTalkResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UploadAsStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.speechsense.v1.TalkServiceProto.StreamTalkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.speechsense.v1.TalkServiceProto.UploadTalkResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TalkServiceMethodDescriptorSupplier("UploadAsStream"))
              .build();
        }
      }
    }
    return getUploadAsStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.speechsense.v1.TalkServiceProto.UploadTalkRequest,
      yandex.cloud.api.speechsense.v1.TalkServiceProto.UploadTalkResponse> getUploadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Upload",
      requestType = yandex.cloud.api.speechsense.v1.TalkServiceProto.UploadTalkRequest.class,
      responseType = yandex.cloud.api.speechsense.v1.TalkServiceProto.UploadTalkResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.speechsense.v1.TalkServiceProto.UploadTalkRequest,
      yandex.cloud.api.speechsense.v1.TalkServiceProto.UploadTalkResponse> getUploadMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.speechsense.v1.TalkServiceProto.UploadTalkRequest, yandex.cloud.api.speechsense.v1.TalkServiceProto.UploadTalkResponse> getUploadMethod;
    if ((getUploadMethod = TalkServiceGrpc.getUploadMethod) == null) {
      synchronized (TalkServiceGrpc.class) {
        if ((getUploadMethod = TalkServiceGrpc.getUploadMethod) == null) {
          TalkServiceGrpc.getUploadMethod = getUploadMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.speechsense.v1.TalkServiceProto.UploadTalkRequest, yandex.cloud.api.speechsense.v1.TalkServiceProto.UploadTalkResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Upload"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.speechsense.v1.TalkServiceProto.UploadTalkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.speechsense.v1.TalkServiceProto.UploadTalkResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TalkServiceMethodDescriptorSupplier("Upload"))
              .build();
        }
      }
    }
    return getUploadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.speechsense.v1.TalkServiceProto.UploadTextRequest,
      yandex.cloud.api.speechsense.v1.TalkServiceProto.UploadTextResponse> getUploadTextMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UploadText",
      requestType = yandex.cloud.api.speechsense.v1.TalkServiceProto.UploadTextRequest.class,
      responseType = yandex.cloud.api.speechsense.v1.TalkServiceProto.UploadTextResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.speechsense.v1.TalkServiceProto.UploadTextRequest,
      yandex.cloud.api.speechsense.v1.TalkServiceProto.UploadTextResponse> getUploadTextMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.speechsense.v1.TalkServiceProto.UploadTextRequest, yandex.cloud.api.speechsense.v1.TalkServiceProto.UploadTextResponse> getUploadTextMethod;
    if ((getUploadTextMethod = TalkServiceGrpc.getUploadTextMethod) == null) {
      synchronized (TalkServiceGrpc.class) {
        if ((getUploadTextMethod = TalkServiceGrpc.getUploadTextMethod) == null) {
          TalkServiceGrpc.getUploadTextMethod = getUploadTextMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.speechsense.v1.TalkServiceProto.UploadTextRequest, yandex.cloud.api.speechsense.v1.TalkServiceProto.UploadTextResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UploadText"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.speechsense.v1.TalkServiceProto.UploadTextRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.speechsense.v1.TalkServiceProto.UploadTextResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TalkServiceMethodDescriptorSupplier("UploadText"))
              .build();
        }
      }
    }
    return getUploadTextMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.speechsense.v1.TalkServiceProto.StreamTalkRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUploadBadgeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UploadBadge",
      requestType = yandex.cloud.api.speechsense.v1.TalkServiceProto.StreamTalkRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.speechsense.v1.TalkServiceProto.StreamTalkRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUploadBadgeMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.speechsense.v1.TalkServiceProto.StreamTalkRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUploadBadgeMethod;
    if ((getUploadBadgeMethod = TalkServiceGrpc.getUploadBadgeMethod) == null) {
      synchronized (TalkServiceGrpc.class) {
        if ((getUploadBadgeMethod = TalkServiceGrpc.getUploadBadgeMethod) == null) {
          TalkServiceGrpc.getUploadBadgeMethod = getUploadBadgeMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.speechsense.v1.TalkServiceProto.StreamTalkRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UploadBadge"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.speechsense.v1.TalkServiceProto.StreamTalkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new TalkServiceMethodDescriptorSupplier("UploadBadge"))
              .build();
        }
      }
    }
    return getUploadBadgeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.speechsense.v1.TalkServiceProto.SearchTalkRequest,
      yandex.cloud.api.speechsense.v1.TalkServiceProto.SearchTalkResponse> getSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Search",
      requestType = yandex.cloud.api.speechsense.v1.TalkServiceProto.SearchTalkRequest.class,
      responseType = yandex.cloud.api.speechsense.v1.TalkServiceProto.SearchTalkResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.speechsense.v1.TalkServiceProto.SearchTalkRequest,
      yandex.cloud.api.speechsense.v1.TalkServiceProto.SearchTalkResponse> getSearchMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.speechsense.v1.TalkServiceProto.SearchTalkRequest, yandex.cloud.api.speechsense.v1.TalkServiceProto.SearchTalkResponse> getSearchMethod;
    if ((getSearchMethod = TalkServiceGrpc.getSearchMethod) == null) {
      synchronized (TalkServiceGrpc.class) {
        if ((getSearchMethod = TalkServiceGrpc.getSearchMethod) == null) {
          TalkServiceGrpc.getSearchMethod = getSearchMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.speechsense.v1.TalkServiceProto.SearchTalkRequest, yandex.cloud.api.speechsense.v1.TalkServiceProto.SearchTalkResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Search"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.speechsense.v1.TalkServiceProto.SearchTalkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.speechsense.v1.TalkServiceProto.SearchTalkResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TalkServiceMethodDescriptorSupplier("Search"))
              .build();
        }
      }
    }
    return getSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.speechsense.v1.TalkServiceProto.GetTalkRequest,
      yandex.cloud.api.speechsense.v1.TalkServiceProto.GetTalkResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.speechsense.v1.TalkServiceProto.GetTalkRequest.class,
      responseType = yandex.cloud.api.speechsense.v1.TalkServiceProto.GetTalkResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.speechsense.v1.TalkServiceProto.GetTalkRequest,
      yandex.cloud.api.speechsense.v1.TalkServiceProto.GetTalkResponse> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.speechsense.v1.TalkServiceProto.GetTalkRequest, yandex.cloud.api.speechsense.v1.TalkServiceProto.GetTalkResponse> getGetMethod;
    if ((getGetMethod = TalkServiceGrpc.getGetMethod) == null) {
      synchronized (TalkServiceGrpc.class) {
        if ((getGetMethod = TalkServiceGrpc.getGetMethod) == null) {
          TalkServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.speechsense.v1.TalkServiceProto.GetTalkRequest, yandex.cloud.api.speechsense.v1.TalkServiceProto.GetTalkResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.speechsense.v1.TalkServiceProto.GetTalkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.speechsense.v1.TalkServiceProto.GetTalkResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TalkServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
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
    public io.grpc.stub.StreamObserver<yandex.cloud.api.speechsense.v1.TalkServiceProto.StreamTalkRequest> uploadAsStream(
        io.grpc.stub.StreamObserver<yandex.cloud.api.speechsense.v1.TalkServiceProto.UploadTalkResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getUploadAsStreamMethod(), responseObserver);
    }

    /**
     * <pre>
     * rpc for uploading talk document as single message
     * </pre>
     */
    public void upload(yandex.cloud.api.speechsense.v1.TalkServiceProto.UploadTalkRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.speechsense.v1.TalkServiceProto.UploadTalkResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUploadMethod(), responseObserver);
    }

    /**
     * <pre>
     * rpc for uploading text talk document
     * </pre>
     */
    public void uploadText(yandex.cloud.api.speechsense.v1.TalkServiceProto.UploadTextRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.speechsense.v1.TalkServiceProto.UploadTextResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUploadTextMethod(), responseObserver);
    }

    /**
     * <pre>
     * rpc for streaming document that contains combined talks. First message should contain Talk related metadata,
     * second - audio metadata, others should contain audio bytes in chunks
     * </pre>
     */
    public io.grpc.stub.StreamObserver<yandex.cloud.api.speechsense.v1.TalkServiceProto.StreamTalkRequest> uploadBadge(
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getUploadBadgeMethod(), responseObserver);
    }

    /**
     * <pre>
     * rpc for searching talks. will return ids only
     * </pre>
     */
    public void search(yandex.cloud.api.speechsense.v1.TalkServiceProto.SearchTalkRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.speechsense.v1.TalkServiceProto.SearchTalkResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchMethod(), responseObserver);
    }

    /**
     * <pre>
     * rpc for bulk get
     * </pre>
     */
    public void get(yandex.cloud.api.speechsense.v1.TalkServiceProto.GetTalkRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.speechsense.v1.TalkServiceProto.GetTalkResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getUploadAsStreamMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                yandex.cloud.api.speechsense.v1.TalkServiceProto.StreamTalkRequest,
                yandex.cloud.api.speechsense.v1.TalkServiceProto.UploadTalkResponse>(
                  this, METHODID_UPLOAD_AS_STREAM)))
          .addMethod(
            getUploadMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.speechsense.v1.TalkServiceProto.UploadTalkRequest,
                yandex.cloud.api.speechsense.v1.TalkServiceProto.UploadTalkResponse>(
                  this, METHODID_UPLOAD)))
          .addMethod(
            getUploadTextMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.speechsense.v1.TalkServiceProto.UploadTextRequest,
                yandex.cloud.api.speechsense.v1.TalkServiceProto.UploadTextResponse>(
                  this, METHODID_UPLOAD_TEXT)))
          .addMethod(
            getUploadBadgeMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                yandex.cloud.api.speechsense.v1.TalkServiceProto.StreamTalkRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPLOAD_BADGE)))
          .addMethod(
            getSearchMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.speechsense.v1.TalkServiceProto.SearchTalkRequest,
                yandex.cloud.api.speechsense.v1.TalkServiceProto.SearchTalkResponse>(
                  this, METHODID_SEARCH)))
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.speechsense.v1.TalkServiceProto.GetTalkRequest,
                yandex.cloud.api.speechsense.v1.TalkServiceProto.GetTalkResponse>(
                  this, METHODID_GET)))
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
    public io.grpc.stub.StreamObserver<yandex.cloud.api.speechsense.v1.TalkServiceProto.StreamTalkRequest> uploadAsStream(
        io.grpc.stub.StreamObserver<yandex.cloud.api.speechsense.v1.TalkServiceProto.UploadTalkResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getUploadAsStreamMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * rpc for uploading talk document as single message
     * </pre>
     */
    public void upload(yandex.cloud.api.speechsense.v1.TalkServiceProto.UploadTalkRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.speechsense.v1.TalkServiceProto.UploadTalkResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUploadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * rpc for uploading text talk document
     * </pre>
     */
    public void uploadText(yandex.cloud.api.speechsense.v1.TalkServiceProto.UploadTextRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.speechsense.v1.TalkServiceProto.UploadTextResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUploadTextMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * rpc for streaming document that contains combined talks. First message should contain Talk related metadata,
     * second - audio metadata, others should contain audio bytes in chunks
     * </pre>
     */
    public io.grpc.stub.StreamObserver<yandex.cloud.api.speechsense.v1.TalkServiceProto.StreamTalkRequest> uploadBadge(
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getUploadBadgeMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * rpc for searching talks. will return ids only
     * </pre>
     */
    public void search(yandex.cloud.api.speechsense.v1.TalkServiceProto.SearchTalkRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.speechsense.v1.TalkServiceProto.SearchTalkResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * rpc for bulk get
     * </pre>
     */
    public void get(yandex.cloud.api.speechsense.v1.TalkServiceProto.GetTalkRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.speechsense.v1.TalkServiceProto.GetTalkResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
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
    public yandex.cloud.api.speechsense.v1.TalkServiceProto.UploadTalkResponse upload(yandex.cloud.api.speechsense.v1.TalkServiceProto.UploadTalkRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUploadMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * rpc for uploading text talk document
     * </pre>
     */
    public yandex.cloud.api.speechsense.v1.TalkServiceProto.UploadTextResponse uploadText(yandex.cloud.api.speechsense.v1.TalkServiceProto.UploadTextRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUploadTextMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * rpc for searching talks. will return ids only
     * </pre>
     */
    public yandex.cloud.api.speechsense.v1.TalkServiceProto.SearchTalkResponse search(yandex.cloud.api.speechsense.v1.TalkServiceProto.SearchTalkRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * rpc for bulk get
     * </pre>
     */
    public yandex.cloud.api.speechsense.v1.TalkServiceProto.GetTalkResponse get(yandex.cloud.api.speechsense.v1.TalkServiceProto.GetTalkRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.speechsense.v1.TalkServiceProto.UploadTalkResponse> upload(
        yandex.cloud.api.speechsense.v1.TalkServiceProto.UploadTalkRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUploadMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * rpc for uploading text talk document
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.speechsense.v1.TalkServiceProto.UploadTextResponse> uploadText(
        yandex.cloud.api.speechsense.v1.TalkServiceProto.UploadTextRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUploadTextMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * rpc for searching talks. will return ids only
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.speechsense.v1.TalkServiceProto.SearchTalkResponse> search(
        yandex.cloud.api.speechsense.v1.TalkServiceProto.SearchTalkRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * rpc for bulk get
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.speechsense.v1.TalkServiceProto.GetTalkResponse> get(
        yandex.cloud.api.speechsense.v1.TalkServiceProto.GetTalkRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UPLOAD = 0;
  private static final int METHODID_UPLOAD_TEXT = 1;
  private static final int METHODID_SEARCH = 2;
  private static final int METHODID_GET = 3;
  private static final int METHODID_UPLOAD_AS_STREAM = 4;
  private static final int METHODID_UPLOAD_BADGE = 5;

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
          serviceImpl.upload((yandex.cloud.api.speechsense.v1.TalkServiceProto.UploadTalkRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.speechsense.v1.TalkServiceProto.UploadTalkResponse>) responseObserver);
          break;
        case METHODID_UPLOAD_TEXT:
          serviceImpl.uploadText((yandex.cloud.api.speechsense.v1.TalkServiceProto.UploadTextRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.speechsense.v1.TalkServiceProto.UploadTextResponse>) responseObserver);
          break;
        case METHODID_SEARCH:
          serviceImpl.search((yandex.cloud.api.speechsense.v1.TalkServiceProto.SearchTalkRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.speechsense.v1.TalkServiceProto.SearchTalkResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.speechsense.v1.TalkServiceProto.GetTalkRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.speechsense.v1.TalkServiceProto.GetTalkResponse>) responseObserver);
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
              (io.grpc.stub.StreamObserver<yandex.cloud.api.speechsense.v1.TalkServiceProto.UploadTalkResponse>) responseObserver);
        case METHODID_UPLOAD_BADGE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.uploadBadge(
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
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
      return yandex.cloud.api.speechsense.v1.TalkServiceProto.getDescriptor();
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
              .addMethod(getUploadBadgeMethod())
              .addMethod(getSearchMethod())
              .addMethod(getGetMethod())
              .build();
        }
      }
    }
    return result;
  }
}
