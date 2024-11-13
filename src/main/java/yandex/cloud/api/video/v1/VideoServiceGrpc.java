package yandex.cloud.api.video.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Video management service.
 * </pre>
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

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.VideoServiceOuterClass.BatchGetVideosRequest,
      yandex.cloud.api.video.v1.VideoServiceOuterClass.BatchGetVideosResponse> getBatchGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchGet",
      requestType = yandex.cloud.api.video.v1.VideoServiceOuterClass.BatchGetVideosRequest.class,
      responseType = yandex.cloud.api.video.v1.VideoServiceOuterClass.BatchGetVideosResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.VideoServiceOuterClass.BatchGetVideosRequest,
      yandex.cloud.api.video.v1.VideoServiceOuterClass.BatchGetVideosResponse> getBatchGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.VideoServiceOuterClass.BatchGetVideosRequest, yandex.cloud.api.video.v1.VideoServiceOuterClass.BatchGetVideosResponse> getBatchGetMethod;
    if ((getBatchGetMethod = VideoServiceGrpc.getBatchGetMethod) == null) {
      synchronized (VideoServiceGrpc.class) {
        if ((getBatchGetMethod = VideoServiceGrpc.getBatchGetMethod) == null) {
          VideoServiceGrpc.getBatchGetMethod = getBatchGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.video.v1.VideoServiceOuterClass.BatchGetVideosRequest, yandex.cloud.api.video.v1.VideoServiceOuterClass.BatchGetVideosResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchGet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.VideoServiceOuterClass.BatchGetVideosRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.VideoServiceOuterClass.BatchGetVideosResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VideoServiceMethodDescriptorSupplier("BatchGet"))
              .build();
        }
      }
    }
    return getBatchGetMethod;
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

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.VideoServiceOuterClass.TranscodeVideoRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getTranscodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Transcode",
      requestType = yandex.cloud.api.video.v1.VideoServiceOuterClass.TranscodeVideoRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.VideoServiceOuterClass.TranscodeVideoRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getTranscodeMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.VideoServiceOuterClass.TranscodeVideoRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getTranscodeMethod;
    if ((getTranscodeMethod = VideoServiceGrpc.getTranscodeMethod) == null) {
      synchronized (VideoServiceGrpc.class) {
        if ((getTranscodeMethod = VideoServiceGrpc.getTranscodeMethod) == null) {
          VideoServiceGrpc.getTranscodeMethod = getTranscodeMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.video.v1.VideoServiceOuterClass.TranscodeVideoRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Transcode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.VideoServiceOuterClass.TranscodeVideoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new VideoServiceMethodDescriptorSupplier("Transcode"))
              .build();
        }
      }
    }
    return getTranscodeMethod;
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

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.VideoServiceOuterClass.BatchDeleteVideosRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getBatchDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchDelete",
      requestType = yandex.cloud.api.video.v1.VideoServiceOuterClass.BatchDeleteVideosRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.VideoServiceOuterClass.BatchDeleteVideosRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getBatchDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.VideoServiceOuterClass.BatchDeleteVideosRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getBatchDeleteMethod;
    if ((getBatchDeleteMethod = VideoServiceGrpc.getBatchDeleteMethod) == null) {
      synchronized (VideoServiceGrpc.class) {
        if ((getBatchDeleteMethod = VideoServiceGrpc.getBatchDeleteMethod) == null) {
          VideoServiceGrpc.getBatchDeleteMethod = getBatchDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.video.v1.VideoServiceOuterClass.BatchDeleteVideosRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchDelete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.VideoServiceOuterClass.BatchDeleteVideosRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new VideoServiceMethodDescriptorSupplier("BatchDelete"))
              .build();
        }
      }
    }
    return getBatchDeleteMethod;
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

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.VideoServiceOuterClass.GetVideoManifestsRequest,
      yandex.cloud.api.video.v1.VideoServiceOuterClass.GetVideoManifestsResponse> getGetManifestsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetManifests",
      requestType = yandex.cloud.api.video.v1.VideoServiceOuterClass.GetVideoManifestsRequest.class,
      responseType = yandex.cloud.api.video.v1.VideoServiceOuterClass.GetVideoManifestsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.VideoServiceOuterClass.GetVideoManifestsRequest,
      yandex.cloud.api.video.v1.VideoServiceOuterClass.GetVideoManifestsResponse> getGetManifestsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.VideoServiceOuterClass.GetVideoManifestsRequest, yandex.cloud.api.video.v1.VideoServiceOuterClass.GetVideoManifestsResponse> getGetManifestsMethod;
    if ((getGetManifestsMethod = VideoServiceGrpc.getGetManifestsMethod) == null) {
      synchronized (VideoServiceGrpc.class) {
        if ((getGetManifestsMethod = VideoServiceGrpc.getGetManifestsMethod) == null) {
          VideoServiceGrpc.getGetManifestsMethod = getGetManifestsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.video.v1.VideoServiceOuterClass.GetVideoManifestsRequest, yandex.cloud.api.video.v1.VideoServiceOuterClass.GetVideoManifestsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetManifests"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.VideoServiceOuterClass.GetVideoManifestsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.VideoServiceOuterClass.GetVideoManifestsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VideoServiceMethodDescriptorSupplier("GetManifests"))
              .build();
        }
      }
    }
    return getGetManifestsMethod;
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
   * <pre>
   * Video management service.
   * </pre>
   */
  public static abstract class VideoServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specific video.
     * </pre>
     */
    public void get(yandex.cloud.api.video.v1.VideoServiceOuterClass.GetVideoRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.VideoOuterClass.Video> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * List videos for channel.
     * </pre>
     */
    public void list(yandex.cloud.api.video.v1.VideoServiceOuterClass.ListVideoRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.VideoServiceOuterClass.ListVideoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Batch get video in specific channel.
     * </pre>
     */
    public void batchGet(yandex.cloud.api.video.v1.VideoServiceOuterClass.BatchGetVideosRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.VideoServiceOuterClass.BatchGetVideosResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create video.
     * </pre>
     */
    public void create(yandex.cloud.api.video.v1.VideoServiceOuterClass.CreateVideoRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update video.
     * </pre>
     */
    public void update(yandex.cloud.api.video.v1.VideoServiceOuterClass.UpdateVideoRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Transcode video.
     * </pre>
     */
    public void transcode(yandex.cloud.api.video.v1.VideoServiceOuterClass.TranscodeVideoRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTranscodeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete video.
     * </pre>
     */
    public void delete(yandex.cloud.api.video.v1.VideoServiceOuterClass.DeleteVideoRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Batch delete video.
     * </pre>
     */
    public void batchDelete(yandex.cloud.api.video.v1.VideoServiceOuterClass.BatchDeleteVideosRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Perform an action on the episode.
     * </pre>
     */
    public void performAction(yandex.cloud.api.video.v1.VideoServiceOuterClass.PerformVideoActionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPerformActionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns url to the player.
     * </pre>
     */
    public void getPlayerURL(yandex.cloud.api.video.v1.VideoServiceOuterClass.GetVideoPlayerURLRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.VideoServiceOuterClass.GetVideoPlayerURLResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPlayerURLMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns manifest urls.
     * </pre>
     */
    public void getManifests(yandex.cloud.api.video.v1.VideoServiceOuterClass.GetVideoManifestsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.VideoServiceOuterClass.GetVideoManifestsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetManifestsMethod(), responseObserver);
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
            getBatchGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.video.v1.VideoServiceOuterClass.BatchGetVideosRequest,
                yandex.cloud.api.video.v1.VideoServiceOuterClass.BatchGetVideosResponse>(
                  this, METHODID_BATCH_GET)))
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
            getTranscodeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.video.v1.VideoServiceOuterClass.TranscodeVideoRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_TRANSCODE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.video.v1.VideoServiceOuterClass.DeleteVideoRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getBatchDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.video.v1.VideoServiceOuterClass.BatchDeleteVideosRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_BATCH_DELETE)))
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
          .addMethod(
            getGetManifestsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.video.v1.VideoServiceOuterClass.GetVideoManifestsRequest,
                yandex.cloud.api.video.v1.VideoServiceOuterClass.GetVideoManifestsResponse>(
                  this, METHODID_GET_MANIFESTS)))
          .build();
    }
  }

  /**
   * <pre>
   * Video management service.
   * </pre>
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
     * <pre>
     * Returns the specific video.
     * </pre>
     */
    public void get(yandex.cloud.api.video.v1.VideoServiceOuterClass.GetVideoRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.VideoOuterClass.Video> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List videos for channel.
     * </pre>
     */
    public void list(yandex.cloud.api.video.v1.VideoServiceOuterClass.ListVideoRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.VideoServiceOuterClass.ListVideoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Batch get video in specific channel.
     * </pre>
     */
    public void batchGet(yandex.cloud.api.video.v1.VideoServiceOuterClass.BatchGetVideosRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.VideoServiceOuterClass.BatchGetVideosResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create video.
     * </pre>
     */
    public void create(yandex.cloud.api.video.v1.VideoServiceOuterClass.CreateVideoRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update video.
     * </pre>
     */
    public void update(yandex.cloud.api.video.v1.VideoServiceOuterClass.UpdateVideoRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Transcode video.
     * </pre>
     */
    public void transcode(yandex.cloud.api.video.v1.VideoServiceOuterClass.TranscodeVideoRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTranscodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete video.
     * </pre>
     */
    public void delete(yandex.cloud.api.video.v1.VideoServiceOuterClass.DeleteVideoRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Batch delete video.
     * </pre>
     */
    public void batchDelete(yandex.cloud.api.video.v1.VideoServiceOuterClass.BatchDeleteVideosRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Perform an action on the episode.
     * </pre>
     */
    public void performAction(yandex.cloud.api.video.v1.VideoServiceOuterClass.PerformVideoActionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPerformActionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns url to the player.
     * </pre>
     */
    public void getPlayerURL(yandex.cloud.api.video.v1.VideoServiceOuterClass.GetVideoPlayerURLRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.VideoServiceOuterClass.GetVideoPlayerURLResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPlayerURLMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns manifest urls.
     * </pre>
     */
    public void getManifests(yandex.cloud.api.video.v1.VideoServiceOuterClass.GetVideoManifestsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.VideoServiceOuterClass.GetVideoManifestsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetManifestsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Video management service.
   * </pre>
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
     * <pre>
     * Returns the specific video.
     * </pre>
     */
    public yandex.cloud.api.video.v1.VideoOuterClass.Video get(yandex.cloud.api.video.v1.VideoServiceOuterClass.GetVideoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List videos for channel.
     * </pre>
     */
    public yandex.cloud.api.video.v1.VideoServiceOuterClass.ListVideoResponse list(yandex.cloud.api.video.v1.VideoServiceOuterClass.ListVideoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Batch get video in specific channel.
     * </pre>
     */
    public yandex.cloud.api.video.v1.VideoServiceOuterClass.BatchGetVideosResponse batchGet(yandex.cloud.api.video.v1.VideoServiceOuterClass.BatchGetVideosRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create video.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.video.v1.VideoServiceOuterClass.CreateVideoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update video.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.video.v1.VideoServiceOuterClass.UpdateVideoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Transcode video.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation transcode(yandex.cloud.api.video.v1.VideoServiceOuterClass.TranscodeVideoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTranscodeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete video.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.video.v1.VideoServiceOuterClass.DeleteVideoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Batch delete video.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation batchDelete(yandex.cloud.api.video.v1.VideoServiceOuterClass.BatchDeleteVideosRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Perform an action on the episode.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation performAction(yandex.cloud.api.video.v1.VideoServiceOuterClass.PerformVideoActionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPerformActionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns url to the player.
     * </pre>
     */
    public yandex.cloud.api.video.v1.VideoServiceOuterClass.GetVideoPlayerURLResponse getPlayerURL(yandex.cloud.api.video.v1.VideoServiceOuterClass.GetVideoPlayerURLRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPlayerURLMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns manifest urls.
     * </pre>
     */
    public yandex.cloud.api.video.v1.VideoServiceOuterClass.GetVideoManifestsResponse getManifests(yandex.cloud.api.video.v1.VideoServiceOuterClass.GetVideoManifestsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetManifestsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Video management service.
   * </pre>
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
     * <pre>
     * Returns the specific video.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.video.v1.VideoOuterClass.Video> get(
        yandex.cloud.api.video.v1.VideoServiceOuterClass.GetVideoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List videos for channel.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.video.v1.VideoServiceOuterClass.ListVideoResponse> list(
        yandex.cloud.api.video.v1.VideoServiceOuterClass.ListVideoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Batch get video in specific channel.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.video.v1.VideoServiceOuterClass.BatchGetVideosResponse> batchGet(
        yandex.cloud.api.video.v1.VideoServiceOuterClass.BatchGetVideosRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create video.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.video.v1.VideoServiceOuterClass.CreateVideoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update video.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.video.v1.VideoServiceOuterClass.UpdateVideoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Transcode video.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> transcode(
        yandex.cloud.api.video.v1.VideoServiceOuterClass.TranscodeVideoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTranscodeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete video.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.video.v1.VideoServiceOuterClass.DeleteVideoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Batch delete video.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> batchDelete(
        yandex.cloud.api.video.v1.VideoServiceOuterClass.BatchDeleteVideosRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Perform an action on the episode.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> performAction(
        yandex.cloud.api.video.v1.VideoServiceOuterClass.PerformVideoActionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPerformActionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns url to the player.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.video.v1.VideoServiceOuterClass.GetVideoPlayerURLResponse> getPlayerURL(
        yandex.cloud.api.video.v1.VideoServiceOuterClass.GetVideoPlayerURLRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPlayerURLMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns manifest urls.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.video.v1.VideoServiceOuterClass.GetVideoManifestsResponse> getManifests(
        yandex.cloud.api.video.v1.VideoServiceOuterClass.GetVideoManifestsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetManifestsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_BATCH_GET = 2;
  private static final int METHODID_CREATE = 3;
  private static final int METHODID_UPDATE = 4;
  private static final int METHODID_TRANSCODE = 5;
  private static final int METHODID_DELETE = 6;
  private static final int METHODID_BATCH_DELETE = 7;
  private static final int METHODID_PERFORM_ACTION = 8;
  private static final int METHODID_GET_PLAYER_URL = 9;
  private static final int METHODID_GET_MANIFESTS = 10;

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
        case METHODID_BATCH_GET:
          serviceImpl.batchGet((yandex.cloud.api.video.v1.VideoServiceOuterClass.BatchGetVideosRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.VideoServiceOuterClass.BatchGetVideosResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.video.v1.VideoServiceOuterClass.CreateVideoRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.video.v1.VideoServiceOuterClass.UpdateVideoRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_TRANSCODE:
          serviceImpl.transcode((yandex.cloud.api.video.v1.VideoServiceOuterClass.TranscodeVideoRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.video.v1.VideoServiceOuterClass.DeleteVideoRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_BATCH_DELETE:
          serviceImpl.batchDelete((yandex.cloud.api.video.v1.VideoServiceOuterClass.BatchDeleteVideosRequest) request,
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
        case METHODID_GET_MANIFESTS:
          serviceImpl.getManifests((yandex.cloud.api.video.v1.VideoServiceOuterClass.GetVideoManifestsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.VideoServiceOuterClass.GetVideoManifestsResponse>) responseObserver);
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
              .addMethod(getBatchGetMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getTranscodeMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getBatchDeleteMethod())
              .addMethod(getPerformActionMethod())
              .addMethod(getGetPlayerURLMethod())
              .addMethod(getGetManifestsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
