package yandex.cloud.api.video.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/video/v1/video_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class VideoServiceGrpc {

  private VideoServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.video.v1.VideoService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.VideoServiceOuterClass.GetVideoRequest,
      yandex.cloud.api.video.v1.VideoOuterClass.Video> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.video.v1.VideoServiceOuterClass.GetVideoRequest.class,
      responseType = yandex.cloud.api.video.v1.VideoOuterClass.Video.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.VideoServiceOuterClass.GetVideoRequest,
      yandex.cloud.api.video.v1.VideoOuterClass.Video> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.VideoServiceOuterClass.GetVideoRequest, yandex.cloud.api.video.v1.VideoOuterClass.Video> getGetMethod;
    if ((getGetMethod = VideoServiceGrpc.getGetMethod) == null) {
      synchronized (VideoServiceGrpc.class) {
        if ((getGetMethod = VideoServiceGrpc.getGetMethod) == null) {
          VideoServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.video.v1.VideoServiceOuterClass.GetVideoRequest, yandex.cloud.api.video.v1.VideoOuterClass.Video>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.VideoServiceOuterClass.GetVideoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.VideoOuterClass.Video.getDefaultInstance()))
              .setSchemaDescriptor(new VideoServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.VideoServiceOuterClass.ListVideoRequest,
      yandex.cloud.api.video.v1.VideoServiceOuterClass.ListVideoResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.video.v1.VideoServiceOuterClass.ListVideoRequest.class,
      responseType = yandex.cloud.api.video.v1.VideoServiceOuterClass.ListVideoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.VideoServiceOuterClass.ListVideoRequest,
      yandex.cloud.api.video.v1.VideoServiceOuterClass.ListVideoResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.VideoServiceOuterClass.ListVideoRequest, yandex.cloud.api.video.v1.VideoServiceOuterClass.ListVideoResponse> getListMethod;
    if ((getListMethod = VideoServiceGrpc.getListMethod) == null) {
      synchronized (VideoServiceGrpc.class) {
        if ((getListMethod = VideoServiceGrpc.getListMethod) == null) {
          VideoServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.video.v1.VideoServiceOuterClass.ListVideoRequest, yandex.cloud.api.video.v1.VideoServiceOuterClass.ListVideoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.VideoServiceOuterClass.ListVideoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.VideoServiceOuterClass.ListVideoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VideoServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.VideoServiceOuterClass.CreateVideoRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.video.v1.VideoServiceOuterClass.CreateVideoRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.VideoServiceOuterClass.CreateVideoRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.VideoServiceOuterClass.CreateVideoRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = VideoServiceGrpc.getCreateMethod) == null) {
      synchronized (VideoServiceGrpc.class) {
        if ((getCreateMethod = VideoServiceGrpc.getCreateMethod) == null) {
          VideoServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.video.v1.VideoServiceOuterClass.CreateVideoRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.VideoServiceOuterClass.CreateVideoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new VideoServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.VideoServiceOuterClass.UpdateVideoRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.video.v1.VideoServiceOuterClass.UpdateVideoRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.VideoServiceOuterClass.UpdateVideoRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.VideoServiceOuterClass.UpdateVideoRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = VideoServiceGrpc.getUpdateMethod) == null) {
      synchronized (VideoServiceGrpc.class) {
        if ((getUpdateMethod = VideoServiceGrpc.getUpdateMethod) == null) {
          VideoServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.video.v1.VideoServiceOuterClass.UpdateVideoRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.VideoServiceOuterClass.UpdateVideoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new VideoServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.VideoServiceOuterClass.DeleteVideoRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.video.v1.VideoServiceOuterClass.DeleteVideoRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.VideoServiceOuterClass.DeleteVideoRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.VideoServiceOuterClass.DeleteVideoRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = VideoServiceGrpc.getDeleteMethod) == null) {
      synchronized (VideoServiceGrpc.class) {
        if ((getDeleteMethod = VideoServiceGrpc.getDeleteMethod) == null) {
          VideoServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.video.v1.VideoServiceOuterClass.DeleteVideoRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.VideoServiceOuterClass.DeleteVideoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new VideoServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.VideoServiceOuterClass.PerformVideoActionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getPerformActionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PerformAction",
      requestType = yandex.cloud.api.video.v1.VideoServiceOuterClass.PerformVideoActionRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.VideoServiceOuterClass.PerformVideoActionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getPerformActionMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.VideoServiceOuterClass.PerformVideoActionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getPerformActionMethod;
    if ((getPerformActionMethod = VideoServiceGrpc.getPerformActionMethod) == null) {
      synchronized (VideoServiceGrpc.class) {
        if ((getPerformActionMethod = VideoServiceGrpc.getPerformActionMethod) == null) {
          VideoServiceGrpc.getPerformActionMethod = getPerformActionMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.video.v1.VideoServiceOuterClass.PerformVideoActionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PerformAction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.VideoServiceOuterClass.PerformVideoActionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new VideoServiceMethodDescriptorSupplier("PerformAction"))
              .build();
        }
      }
    }
    return getPerformActionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.VideoServiceOuterClass.GetVideoPlayerURLRequest,
      yandex.cloud.api.video.v1.VideoServiceOuterClass.GetVideoPlayerURLResponse> getGetPlayerURLMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPlayerURL",
      requestType = yandex.cloud.api.video.v1.VideoServiceOuterClass.GetVideoPlayerURLRequest.class,
      responseType = yandex.cloud.api.video.v1.VideoServiceOuterClass.GetVideoPlayerURLResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.VideoServiceOuterClass.GetVideoPlayerURLRequest,
      yandex.cloud.api.video.v1.VideoServiceOuterClass.GetVideoPlayerURLResponse> getGetPlayerURLMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.VideoServiceOuterClass.GetVideoPlayerURLRequest, yandex.cloud.api.video.v1.VideoServiceOuterClass.GetVideoPlayerURLResponse> getGetPlayerURLMethod;
    if ((getGetPlayerURLMethod = VideoServiceGrpc.getGetPlayerURLMethod) == null) {
      synchronized (VideoServiceGrpc.class) {
        if ((getGetPlayerURLMethod = VideoServiceGrpc.getGetPlayerURLMethod) == null) {
          VideoServiceGrpc.getGetPlayerURLMethod = getGetPlayerURLMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.video.v1.VideoServiceOuterClass.GetVideoPlayerURLRequest, yandex.cloud.api.video.v1.VideoServiceOuterClass.GetVideoPlayerURLResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPlayerURL"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.VideoServiceOuterClass.GetVideoPlayerURLRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.VideoServiceOuterClass.GetVideoPlayerURLResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VideoServiceMethodDescriptorSupplier("GetPlayerURL"))
              .build();
        }
      }
    }
    return getGetPlayerURLMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static VideoServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VideoServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VideoServiceStub>() {
        @java.lang.Override
        public VideoServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VideoServiceStub(channel, callOptions);
        }
      };
    return VideoServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static VideoServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VideoServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VideoServiceBlockingStub>() {
        @java.lang.Override
        public VideoServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VideoServiceBlockingStub(channel, callOptions);
        }
      };
    return VideoServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static VideoServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VideoServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VideoServiceFutureStub>() {
        @java.lang.Override
        public VideoServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VideoServiceFutureStub(channel, callOptions);
        }
      };
    return VideoServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class VideoServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void get(yandex.cloud.api.video.v1.VideoServiceOuterClass.GetVideoRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.VideoOuterClass.Video> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     */
    public void list(yandex.cloud.api.video.v1.VideoServiceOuterClass.ListVideoRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.VideoServiceOuterClass.ListVideoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     */
    public void create(yandex.cloud.api.video.v1.VideoServiceOuterClass.CreateVideoRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    public void update(yandex.cloud.api.video.v1.VideoServiceOuterClass.UpdateVideoRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     */
    public void delete(yandex.cloud.api.video.v1.VideoServiceOuterClass.DeleteVideoRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     */
    public void performAction(yandex.cloud.api.video.v1.VideoServiceOuterClass.PerformVideoActionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPerformActionMethod(), responseObserver);
    }

    /**
     */
    public void getPlayerURL(yandex.cloud.api.video.v1.VideoServiceOuterClass.GetVideoPlayerURLRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.VideoServiceOuterClass.GetVideoPlayerURLResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPlayerURLMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.video.v1.VideoServiceOuterClass.GetVideoRequest,
                yandex.cloud.api.video.v1.VideoOuterClass.Video>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.video.v1.VideoServiceOuterClass.ListVideoRequest,
                yandex.cloud.api.video.v1.VideoServiceOuterClass.ListVideoResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.video.v1.VideoServiceOuterClass.CreateVideoRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.video.v1.VideoServiceOuterClass.UpdateVideoRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.video.v1.VideoServiceOuterClass.DeleteVideoRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getPerformActionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.video.v1.VideoServiceOuterClass.PerformVideoActionRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_PERFORM_ACTION)))
          .addMethod(
            getGetPlayerURLMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.video.v1.VideoServiceOuterClass.GetVideoPlayerURLRequest,
                yandex.cloud.api.video.v1.VideoServiceOuterClass.GetVideoPlayerURLResponse>(
                  this, METHODID_GET_PLAYER_URL)))
          .build();
    }
  }

  /**
   */
  public static final class VideoServiceStub extends io.grpc.stub.AbstractAsyncStub<VideoServiceStub> {
    private VideoServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VideoServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VideoServiceStub(channel, callOptions);
    }

    /**
     */
    public void get(yandex.cloud.api.video.v1.VideoServiceOuterClass.GetVideoRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.VideoOuterClass.Video> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void list(yandex.cloud.api.video.v1.VideoServiceOuterClass.ListVideoRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.VideoServiceOuterClass.ListVideoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void create(yandex.cloud.api.video.v1.VideoServiceOuterClass.CreateVideoRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void update(yandex.cloud.api.video.v1.VideoServiceOuterClass.UpdateVideoRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(yandex.cloud.api.video.v1.VideoServiceOuterClass.DeleteVideoRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void performAction(yandex.cloud.api.video.v1.VideoServiceOuterClass.PerformVideoActionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPerformActionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPlayerURL(yandex.cloud.api.video.v1.VideoServiceOuterClass.GetVideoPlayerURLRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.VideoServiceOuterClass.GetVideoPlayerURLResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPlayerURLMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class VideoServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<VideoServiceBlockingStub> {
    private VideoServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VideoServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VideoServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public yandex.cloud.api.video.v1.VideoOuterClass.Video get(yandex.cloud.api.video.v1.VideoServiceOuterClass.GetVideoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.video.v1.VideoServiceOuterClass.ListVideoResponse list(yandex.cloud.api.video.v1.VideoServiceOuterClass.ListVideoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.video.v1.VideoServiceOuterClass.CreateVideoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.video.v1.VideoServiceOuterClass.UpdateVideoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.video.v1.VideoServiceOuterClass.DeleteVideoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation performAction(yandex.cloud.api.video.v1.VideoServiceOuterClass.PerformVideoActionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPerformActionMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.video.v1.VideoServiceOuterClass.GetVideoPlayerURLResponse getPlayerURL(yandex.cloud.api.video.v1.VideoServiceOuterClass.GetVideoPlayerURLRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPlayerURLMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class VideoServiceFutureStub extends io.grpc.stub.AbstractFutureStub<VideoServiceFutureStub> {
    private VideoServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VideoServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VideoServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.video.v1.VideoOuterClass.Video> get(
        yandex.cloud.api.video.v1.VideoServiceOuterClass.GetVideoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.video.v1.VideoServiceOuterClass.ListVideoResponse> list(
        yandex.cloud.api.video.v1.VideoServiceOuterClass.ListVideoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.video.v1.VideoServiceOuterClass.CreateVideoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.video.v1.VideoServiceOuterClass.UpdateVideoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.video.v1.VideoServiceOuterClass.DeleteVideoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> performAction(
        yandex.cloud.api.video.v1.VideoServiceOuterClass.PerformVideoActionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPerformActionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.video.v1.VideoServiceOuterClass.GetVideoPlayerURLResponse> getPlayerURL(
        yandex.cloud.api.video.v1.VideoServiceOuterClass.GetVideoPlayerURLRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPlayerURLMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_DELETE = 4;
  private static final int METHODID_PERFORM_ACTION = 5;
  private static final int METHODID_GET_PLAYER_URL = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final VideoServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(VideoServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.video.v1.VideoServiceOuterClass.GetVideoRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.VideoOuterClass.Video>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.video.v1.VideoServiceOuterClass.ListVideoRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.VideoServiceOuterClass.ListVideoResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.video.v1.VideoServiceOuterClass.CreateVideoRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.video.v1.VideoServiceOuterClass.UpdateVideoRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.video.v1.VideoServiceOuterClass.DeleteVideoRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_PERFORM_ACTION:
          serviceImpl.performAction((yandex.cloud.api.video.v1.VideoServiceOuterClass.PerformVideoActionRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_GET_PLAYER_URL:
          serviceImpl.getPlayerURL((yandex.cloud.api.video.v1.VideoServiceOuterClass.GetVideoPlayerURLRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.VideoServiceOuterClass.GetVideoPlayerURLResponse>) responseObserver);
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

  private static abstract class VideoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    VideoServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.video.v1.VideoServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("VideoService");
    }
  }

  private static final class VideoServiceFileDescriptorSupplier
      extends VideoServiceBaseDescriptorSupplier {
    VideoServiceFileDescriptorSupplier() {}
  }

  private static final class VideoServiceMethodDescriptorSupplier
      extends VideoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    VideoServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (VideoServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new VideoServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getPerformActionMethod())
              .addMethod(getGetPlayerURLMethod())
              .build();
        }
      }
    }
    return result;
  }
}
