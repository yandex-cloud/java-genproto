package yandex.cloud.api.video.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Playlist management service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/video/v1/playlist_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PlaylistServiceGrpc {

  private PlaylistServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.video.v1.PlaylistService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.PlaylistServiceOuterClass.GetPlaylistRequest,
      yandex.cloud.api.video.v1.PlaylistOuterClass.Playlist> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.video.v1.PlaylistServiceOuterClass.GetPlaylistRequest.class,
      responseType = yandex.cloud.api.video.v1.PlaylistOuterClass.Playlist.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.PlaylistServiceOuterClass.GetPlaylistRequest,
      yandex.cloud.api.video.v1.PlaylistOuterClass.Playlist> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.PlaylistServiceOuterClass.GetPlaylistRequest, yandex.cloud.api.video.v1.PlaylistOuterClass.Playlist> getGetMethod;
    if ((getGetMethod = PlaylistServiceGrpc.getGetMethod) == null) {
      synchronized (PlaylistServiceGrpc.class) {
        if ((getGetMethod = PlaylistServiceGrpc.getGetMethod) == null) {
          PlaylistServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.video.v1.PlaylistServiceOuterClass.GetPlaylistRequest, yandex.cloud.api.video.v1.PlaylistOuterClass.Playlist>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.PlaylistServiceOuterClass.GetPlaylistRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.PlaylistOuterClass.Playlist.getDefaultInstance()))
              .setSchemaDescriptor(new PlaylistServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.PlaylistServiceOuterClass.ListPlaylistsRequest,
      yandex.cloud.api.video.v1.PlaylistServiceOuterClass.ListPlaylistsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.video.v1.PlaylistServiceOuterClass.ListPlaylistsRequest.class,
      responseType = yandex.cloud.api.video.v1.PlaylistServiceOuterClass.ListPlaylistsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.PlaylistServiceOuterClass.ListPlaylistsRequest,
      yandex.cloud.api.video.v1.PlaylistServiceOuterClass.ListPlaylistsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.PlaylistServiceOuterClass.ListPlaylistsRequest, yandex.cloud.api.video.v1.PlaylistServiceOuterClass.ListPlaylistsResponse> getListMethod;
    if ((getListMethod = PlaylistServiceGrpc.getListMethod) == null) {
      synchronized (PlaylistServiceGrpc.class) {
        if ((getListMethod = PlaylistServiceGrpc.getListMethod) == null) {
          PlaylistServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.video.v1.PlaylistServiceOuterClass.ListPlaylistsRequest, yandex.cloud.api.video.v1.PlaylistServiceOuterClass.ListPlaylistsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.PlaylistServiceOuterClass.ListPlaylistsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.PlaylistServiceOuterClass.ListPlaylistsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PlaylistServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.PlaylistServiceOuterClass.CreatePlaylistRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.video.v1.PlaylistServiceOuterClass.CreatePlaylistRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.PlaylistServiceOuterClass.CreatePlaylistRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.PlaylistServiceOuterClass.CreatePlaylistRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = PlaylistServiceGrpc.getCreateMethod) == null) {
      synchronized (PlaylistServiceGrpc.class) {
        if ((getCreateMethod = PlaylistServiceGrpc.getCreateMethod) == null) {
          PlaylistServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.video.v1.PlaylistServiceOuterClass.CreatePlaylistRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.PlaylistServiceOuterClass.CreatePlaylistRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new PlaylistServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.PlaylistServiceOuterClass.UpdatePlaylistRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.video.v1.PlaylistServiceOuterClass.UpdatePlaylistRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.PlaylistServiceOuterClass.UpdatePlaylistRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.PlaylistServiceOuterClass.UpdatePlaylistRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = PlaylistServiceGrpc.getUpdateMethod) == null) {
      synchronized (PlaylistServiceGrpc.class) {
        if ((getUpdateMethod = PlaylistServiceGrpc.getUpdateMethod) == null) {
          PlaylistServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.video.v1.PlaylistServiceOuterClass.UpdatePlaylistRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.PlaylistServiceOuterClass.UpdatePlaylistRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new PlaylistServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.PlaylistServiceOuterClass.DeletePlaylistRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.video.v1.PlaylistServiceOuterClass.DeletePlaylistRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.PlaylistServiceOuterClass.DeletePlaylistRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.PlaylistServiceOuterClass.DeletePlaylistRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = PlaylistServiceGrpc.getDeleteMethod) == null) {
      synchronized (PlaylistServiceGrpc.class) {
        if ((getDeleteMethod = PlaylistServiceGrpc.getDeleteMethod) == null) {
          PlaylistServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.video.v1.PlaylistServiceOuterClass.DeletePlaylistRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.PlaylistServiceOuterClass.DeletePlaylistRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new PlaylistServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.PlaylistServiceOuterClass.BatchDeletePlaylistsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getBatchDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchDelete",
      requestType = yandex.cloud.api.video.v1.PlaylistServiceOuterClass.BatchDeletePlaylistsRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.PlaylistServiceOuterClass.BatchDeletePlaylistsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getBatchDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.PlaylistServiceOuterClass.BatchDeletePlaylistsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getBatchDeleteMethod;
    if ((getBatchDeleteMethod = PlaylistServiceGrpc.getBatchDeleteMethod) == null) {
      synchronized (PlaylistServiceGrpc.class) {
        if ((getBatchDeleteMethod = PlaylistServiceGrpc.getBatchDeleteMethod) == null) {
          PlaylistServiceGrpc.getBatchDeleteMethod = getBatchDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.video.v1.PlaylistServiceOuterClass.BatchDeletePlaylistsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchDelete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.PlaylistServiceOuterClass.BatchDeletePlaylistsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new PlaylistServiceMethodDescriptorSupplier("BatchDelete"))
              .build();
        }
      }
    }
    return getBatchDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.PlaylistServiceOuterClass.GetPlaylistPlayerURLRequest,
      yandex.cloud.api.video.v1.PlaylistServiceOuterClass.GetPlaylistPlayerURLResponse> getGetPlayerURLMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPlayerURL",
      requestType = yandex.cloud.api.video.v1.PlaylistServiceOuterClass.GetPlaylistPlayerURLRequest.class,
      responseType = yandex.cloud.api.video.v1.PlaylistServiceOuterClass.GetPlaylistPlayerURLResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.PlaylistServiceOuterClass.GetPlaylistPlayerURLRequest,
      yandex.cloud.api.video.v1.PlaylistServiceOuterClass.GetPlaylistPlayerURLResponse> getGetPlayerURLMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.PlaylistServiceOuterClass.GetPlaylistPlayerURLRequest, yandex.cloud.api.video.v1.PlaylistServiceOuterClass.GetPlaylistPlayerURLResponse> getGetPlayerURLMethod;
    if ((getGetPlayerURLMethod = PlaylistServiceGrpc.getGetPlayerURLMethod) == null) {
      synchronized (PlaylistServiceGrpc.class) {
        if ((getGetPlayerURLMethod = PlaylistServiceGrpc.getGetPlayerURLMethod) == null) {
          PlaylistServiceGrpc.getGetPlayerURLMethod = getGetPlayerURLMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.video.v1.PlaylistServiceOuterClass.GetPlaylistPlayerURLRequest, yandex.cloud.api.video.v1.PlaylistServiceOuterClass.GetPlaylistPlayerURLResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPlayerURL"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.PlaylistServiceOuterClass.GetPlaylistPlayerURLRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.PlaylistServiceOuterClass.GetPlaylistPlayerURLResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PlaylistServiceMethodDescriptorSupplier("GetPlayerURL"))
              .build();
        }
      }
    }
    return getGetPlayerURLMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PlaylistServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PlaylistServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PlaylistServiceStub>() {
        @java.lang.Override
        public PlaylistServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PlaylistServiceStub(channel, callOptions);
        }
      };
    return PlaylistServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PlaylistServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PlaylistServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PlaylistServiceBlockingStub>() {
        @java.lang.Override
        public PlaylistServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PlaylistServiceBlockingStub(channel, callOptions);
        }
      };
    return PlaylistServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PlaylistServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PlaylistServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PlaylistServiceFutureStub>() {
        @java.lang.Override
        public PlaylistServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PlaylistServiceFutureStub(channel, callOptions);
        }
      };
    return PlaylistServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Playlist management service.
   * </pre>
   */
  public static abstract class PlaylistServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Get the specific playlist.
     * </pre>
     */
    public void get(yandex.cloud.api.video.v1.PlaylistServiceOuterClass.GetPlaylistRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.PlaylistOuterClass.Playlist> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * List playlists for a channel.
     * </pre>
     */
    public void list(yandex.cloud.api.video.v1.PlaylistServiceOuterClass.ListPlaylistsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.PlaylistServiceOuterClass.ListPlaylistsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create playlist.
     * </pre>
     */
    public void create(yandex.cloud.api.video.v1.PlaylistServiceOuterClass.CreatePlaylistRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update playlist.
     * </pre>
     */
    public void update(yandex.cloud.api.video.v1.PlaylistServiceOuterClass.UpdatePlaylistRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete playlist.
     * </pre>
     */
    public void delete(yandex.cloud.api.video.v1.PlaylistServiceOuterClass.DeletePlaylistRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Batch delete playlists.
     * </pre>
     */
    public void batchDelete(yandex.cloud.api.video.v1.PlaylistServiceOuterClass.BatchDeletePlaylistsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get player url.
     * </pre>
     */
    public void getPlayerURL(yandex.cloud.api.video.v1.PlaylistServiceOuterClass.GetPlaylistPlayerURLRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.PlaylistServiceOuterClass.GetPlaylistPlayerURLResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPlayerURLMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.video.v1.PlaylistServiceOuterClass.GetPlaylistRequest,
                yandex.cloud.api.video.v1.PlaylistOuterClass.Playlist>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.video.v1.PlaylistServiceOuterClass.ListPlaylistsRequest,
                yandex.cloud.api.video.v1.PlaylistServiceOuterClass.ListPlaylistsResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.video.v1.PlaylistServiceOuterClass.CreatePlaylistRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.video.v1.PlaylistServiceOuterClass.UpdatePlaylistRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.video.v1.PlaylistServiceOuterClass.DeletePlaylistRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getBatchDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.video.v1.PlaylistServiceOuterClass.BatchDeletePlaylistsRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_BATCH_DELETE)))
          .addMethod(
            getGetPlayerURLMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.video.v1.PlaylistServiceOuterClass.GetPlaylistPlayerURLRequest,
                yandex.cloud.api.video.v1.PlaylistServiceOuterClass.GetPlaylistPlayerURLResponse>(
                  this, METHODID_GET_PLAYER_URL)))
          .build();
    }
  }

  /**
   * <pre>
   * Playlist management service.
   * </pre>
   */
  public static final class PlaylistServiceStub extends io.grpc.stub.AbstractAsyncStub<PlaylistServiceStub> {
    private PlaylistServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PlaylistServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PlaylistServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get the specific playlist.
     * </pre>
     */
    public void get(yandex.cloud.api.video.v1.PlaylistServiceOuterClass.GetPlaylistRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.PlaylistOuterClass.Playlist> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List playlists for a channel.
     * </pre>
     */
    public void list(yandex.cloud.api.video.v1.PlaylistServiceOuterClass.ListPlaylistsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.PlaylistServiceOuterClass.ListPlaylistsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create playlist.
     * </pre>
     */
    public void create(yandex.cloud.api.video.v1.PlaylistServiceOuterClass.CreatePlaylistRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update playlist.
     * </pre>
     */
    public void update(yandex.cloud.api.video.v1.PlaylistServiceOuterClass.UpdatePlaylistRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete playlist.
     * </pre>
     */
    public void delete(yandex.cloud.api.video.v1.PlaylistServiceOuterClass.DeletePlaylistRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Batch delete playlists.
     * </pre>
     */
    public void batchDelete(yandex.cloud.api.video.v1.PlaylistServiceOuterClass.BatchDeletePlaylistsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get player url.
     * </pre>
     */
    public void getPlayerURL(yandex.cloud.api.video.v1.PlaylistServiceOuterClass.GetPlaylistPlayerURLRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.PlaylistServiceOuterClass.GetPlaylistPlayerURLResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPlayerURLMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Playlist management service.
   * </pre>
   */
  public static final class PlaylistServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<PlaylistServiceBlockingStub> {
    private PlaylistServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PlaylistServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PlaylistServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get the specific playlist.
     * </pre>
     */
    public yandex.cloud.api.video.v1.PlaylistOuterClass.Playlist get(yandex.cloud.api.video.v1.PlaylistServiceOuterClass.GetPlaylistRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List playlists for a channel.
     * </pre>
     */
    public yandex.cloud.api.video.v1.PlaylistServiceOuterClass.ListPlaylistsResponse list(yandex.cloud.api.video.v1.PlaylistServiceOuterClass.ListPlaylistsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create playlist.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.video.v1.PlaylistServiceOuterClass.CreatePlaylistRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update playlist.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.video.v1.PlaylistServiceOuterClass.UpdatePlaylistRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete playlist.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.video.v1.PlaylistServiceOuterClass.DeletePlaylistRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Batch delete playlists.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation batchDelete(yandex.cloud.api.video.v1.PlaylistServiceOuterClass.BatchDeletePlaylistsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get player url.
     * </pre>
     */
    public yandex.cloud.api.video.v1.PlaylistServiceOuterClass.GetPlaylistPlayerURLResponse getPlayerURL(yandex.cloud.api.video.v1.PlaylistServiceOuterClass.GetPlaylistPlayerURLRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPlayerURLMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Playlist management service.
   * </pre>
   */
  public static final class PlaylistServiceFutureStub extends io.grpc.stub.AbstractFutureStub<PlaylistServiceFutureStub> {
    private PlaylistServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PlaylistServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PlaylistServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get the specific playlist.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.video.v1.PlaylistOuterClass.Playlist> get(
        yandex.cloud.api.video.v1.PlaylistServiceOuterClass.GetPlaylistRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List playlists for a channel.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.video.v1.PlaylistServiceOuterClass.ListPlaylistsResponse> list(
        yandex.cloud.api.video.v1.PlaylistServiceOuterClass.ListPlaylistsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create playlist.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.video.v1.PlaylistServiceOuterClass.CreatePlaylistRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update playlist.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.video.v1.PlaylistServiceOuterClass.UpdatePlaylistRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete playlist.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.video.v1.PlaylistServiceOuterClass.DeletePlaylistRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Batch delete playlists.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> batchDelete(
        yandex.cloud.api.video.v1.PlaylistServiceOuterClass.BatchDeletePlaylistsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get player url.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.video.v1.PlaylistServiceOuterClass.GetPlaylistPlayerURLResponse> getPlayerURL(
        yandex.cloud.api.video.v1.PlaylistServiceOuterClass.GetPlaylistPlayerURLRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPlayerURLMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_DELETE = 4;
  private static final int METHODID_BATCH_DELETE = 5;
  private static final int METHODID_GET_PLAYER_URL = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PlaylistServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PlaylistServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.video.v1.PlaylistServiceOuterClass.GetPlaylistRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.PlaylistOuterClass.Playlist>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.video.v1.PlaylistServiceOuterClass.ListPlaylistsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.PlaylistServiceOuterClass.ListPlaylistsResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.video.v1.PlaylistServiceOuterClass.CreatePlaylistRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.video.v1.PlaylistServiceOuterClass.UpdatePlaylistRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.video.v1.PlaylistServiceOuterClass.DeletePlaylistRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_BATCH_DELETE:
          serviceImpl.batchDelete((yandex.cloud.api.video.v1.PlaylistServiceOuterClass.BatchDeletePlaylistsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_GET_PLAYER_URL:
          serviceImpl.getPlayerURL((yandex.cloud.api.video.v1.PlaylistServiceOuterClass.GetPlaylistPlayerURLRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.PlaylistServiceOuterClass.GetPlaylistPlayerURLResponse>) responseObserver);
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

  private static abstract class PlaylistServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PlaylistServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.video.v1.PlaylistServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PlaylistService");
    }
  }

  private static final class PlaylistServiceFileDescriptorSupplier
      extends PlaylistServiceBaseDescriptorSupplier {
    PlaylistServiceFileDescriptorSupplier() {}
  }

  private static final class PlaylistServiceMethodDescriptorSupplier
      extends PlaylistServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PlaylistServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PlaylistServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PlaylistServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getBatchDeleteMethod())
              .addMethod(getGetPlayerURLMethod())
              .build();
        }
      }
    }
    return result;
  }
}
