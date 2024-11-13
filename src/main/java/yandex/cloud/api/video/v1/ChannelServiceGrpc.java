package yandex.cloud.api.video.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Channel management service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/video/v1/channel_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ChannelServiceGrpc {

  private ChannelServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.video.v1.ChannelService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.ChannelServiceOuterClass.GetChannelRequest,
      yandex.cloud.api.video.v1.ChannelOuterClass.Channel> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.video.v1.ChannelServiceOuterClass.GetChannelRequest.class,
      responseType = yandex.cloud.api.video.v1.ChannelOuterClass.Channel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.ChannelServiceOuterClass.GetChannelRequest,
      yandex.cloud.api.video.v1.ChannelOuterClass.Channel> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.ChannelServiceOuterClass.GetChannelRequest, yandex.cloud.api.video.v1.ChannelOuterClass.Channel> getGetMethod;
    if ((getGetMethod = ChannelServiceGrpc.getGetMethod) == null) {
      synchronized (ChannelServiceGrpc.class) {
        if ((getGetMethod = ChannelServiceGrpc.getGetMethod) == null) {
          ChannelServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.video.v1.ChannelServiceOuterClass.GetChannelRequest, yandex.cloud.api.video.v1.ChannelOuterClass.Channel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.ChannelServiceOuterClass.GetChannelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.ChannelOuterClass.Channel.getDefaultInstance()))
              .setSchemaDescriptor(new ChannelServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.ChannelServiceOuterClass.ListChannelsRequest,
      yandex.cloud.api.video.v1.ChannelServiceOuterClass.ListChannelsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.video.v1.ChannelServiceOuterClass.ListChannelsRequest.class,
      responseType = yandex.cloud.api.video.v1.ChannelServiceOuterClass.ListChannelsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.ChannelServiceOuterClass.ListChannelsRequest,
      yandex.cloud.api.video.v1.ChannelServiceOuterClass.ListChannelsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.ChannelServiceOuterClass.ListChannelsRequest, yandex.cloud.api.video.v1.ChannelServiceOuterClass.ListChannelsResponse> getListMethod;
    if ((getListMethod = ChannelServiceGrpc.getListMethod) == null) {
      synchronized (ChannelServiceGrpc.class) {
        if ((getListMethod = ChannelServiceGrpc.getListMethod) == null) {
          ChannelServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.video.v1.ChannelServiceOuterClass.ListChannelsRequest, yandex.cloud.api.video.v1.ChannelServiceOuterClass.ListChannelsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.ChannelServiceOuterClass.ListChannelsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.ChannelServiceOuterClass.ListChannelsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ChannelServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.ChannelServiceOuterClass.CreateChannelRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.video.v1.ChannelServiceOuterClass.CreateChannelRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.ChannelServiceOuterClass.CreateChannelRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.ChannelServiceOuterClass.CreateChannelRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = ChannelServiceGrpc.getCreateMethod) == null) {
      synchronized (ChannelServiceGrpc.class) {
        if ((getCreateMethod = ChannelServiceGrpc.getCreateMethod) == null) {
          ChannelServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.video.v1.ChannelServiceOuterClass.CreateChannelRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.ChannelServiceOuterClass.CreateChannelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ChannelServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.ChannelServiceOuterClass.UpdateChannelRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.video.v1.ChannelServiceOuterClass.UpdateChannelRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.ChannelServiceOuterClass.UpdateChannelRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.ChannelServiceOuterClass.UpdateChannelRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = ChannelServiceGrpc.getUpdateMethod) == null) {
      synchronized (ChannelServiceGrpc.class) {
        if ((getUpdateMethod = ChannelServiceGrpc.getUpdateMethod) == null) {
          ChannelServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.video.v1.ChannelServiceOuterClass.UpdateChannelRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.ChannelServiceOuterClass.UpdateChannelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ChannelServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.ChannelServiceOuterClass.DeleteChannelRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.video.v1.ChannelServiceOuterClass.DeleteChannelRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.ChannelServiceOuterClass.DeleteChannelRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.ChannelServiceOuterClass.DeleteChannelRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = ChannelServiceGrpc.getDeleteMethod) == null) {
      synchronized (ChannelServiceGrpc.class) {
        if ((getDeleteMethod = ChannelServiceGrpc.getDeleteMethod) == null) {
          ChannelServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.video.v1.ChannelServiceOuterClass.DeleteChannelRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.ChannelServiceOuterClass.DeleteChannelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ChannelServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.ChannelServiceOuterClass.BatchDeleteChannelsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getBatchDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchDelete",
      requestType = yandex.cloud.api.video.v1.ChannelServiceOuterClass.BatchDeleteChannelsRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.ChannelServiceOuterClass.BatchDeleteChannelsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getBatchDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.ChannelServiceOuterClass.BatchDeleteChannelsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getBatchDeleteMethod;
    if ((getBatchDeleteMethod = ChannelServiceGrpc.getBatchDeleteMethod) == null) {
      synchronized (ChannelServiceGrpc.class) {
        if ((getBatchDeleteMethod = ChannelServiceGrpc.getBatchDeleteMethod) == null) {
          ChannelServiceGrpc.getBatchDeleteMethod = getBatchDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.video.v1.ChannelServiceOuterClass.BatchDeleteChannelsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchDelete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.ChannelServiceOuterClass.BatchDeleteChannelsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ChannelServiceMethodDescriptorSupplier("BatchDelete"))
              .build();
        }
      }
    }
    return getBatchDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ChannelServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ChannelServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ChannelServiceStub>() {
        @java.lang.Override
        public ChannelServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ChannelServiceStub(channel, callOptions);
        }
      };
    return ChannelServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ChannelServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ChannelServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ChannelServiceBlockingStub>() {
        @java.lang.Override
        public ChannelServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ChannelServiceBlockingStub(channel, callOptions);
        }
      };
    return ChannelServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ChannelServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ChannelServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ChannelServiceFutureStub>() {
        @java.lang.Override
        public ChannelServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ChannelServiceFutureStub(channel, callOptions);
        }
      };
    return ChannelServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Channel management service.
   * </pre>
   */
  public static abstract class ChannelServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specific channel.
     * </pre>
     */
    public void get(yandex.cloud.api.video.v1.ChannelServiceOuterClass.GetChannelRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.ChannelOuterClass.Channel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * List channels for organization.
     * </pre>
     */
    public void list(yandex.cloud.api.video.v1.ChannelServiceOuterClass.ListChannelsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.ChannelServiceOuterClass.ListChannelsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create channel.
     * </pre>
     */
    public void create(yandex.cloud.api.video.v1.ChannelServiceOuterClass.CreateChannelRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update channel.
     * </pre>
     */
    public void update(yandex.cloud.api.video.v1.ChannelServiceOuterClass.UpdateChannelRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete channel.
     * </pre>
     */
    public void delete(yandex.cloud.api.video.v1.ChannelServiceOuterClass.DeleteChannelRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Batch delete channels.
     * </pre>
     */
    public void batchDelete(yandex.cloud.api.video.v1.ChannelServiceOuterClass.BatchDeleteChannelsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchDeleteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.video.v1.ChannelServiceOuterClass.GetChannelRequest,
                yandex.cloud.api.video.v1.ChannelOuterClass.Channel>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.video.v1.ChannelServiceOuterClass.ListChannelsRequest,
                yandex.cloud.api.video.v1.ChannelServiceOuterClass.ListChannelsResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.video.v1.ChannelServiceOuterClass.CreateChannelRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.video.v1.ChannelServiceOuterClass.UpdateChannelRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.video.v1.ChannelServiceOuterClass.DeleteChannelRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getBatchDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.video.v1.ChannelServiceOuterClass.BatchDeleteChannelsRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_BATCH_DELETE)))
          .build();
    }
  }

  /**
   * <pre>
   * Channel management service.
   * </pre>
   */
  public static final class ChannelServiceStub extends io.grpc.stub.AbstractAsyncStub<ChannelServiceStub> {
    private ChannelServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChannelServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ChannelServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specific channel.
     * </pre>
     */
    public void get(yandex.cloud.api.video.v1.ChannelServiceOuterClass.GetChannelRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.ChannelOuterClass.Channel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List channels for organization.
     * </pre>
     */
    public void list(yandex.cloud.api.video.v1.ChannelServiceOuterClass.ListChannelsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.ChannelServiceOuterClass.ListChannelsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create channel.
     * </pre>
     */
    public void create(yandex.cloud.api.video.v1.ChannelServiceOuterClass.CreateChannelRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update channel.
     * </pre>
     */
    public void update(yandex.cloud.api.video.v1.ChannelServiceOuterClass.UpdateChannelRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete channel.
     * </pre>
     */
    public void delete(yandex.cloud.api.video.v1.ChannelServiceOuterClass.DeleteChannelRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Batch delete channels.
     * </pre>
     */
    public void batchDelete(yandex.cloud.api.video.v1.ChannelServiceOuterClass.BatchDeleteChannelsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Channel management service.
   * </pre>
   */
  public static final class ChannelServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ChannelServiceBlockingStub> {
    private ChannelServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChannelServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ChannelServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specific channel.
     * </pre>
     */
    public yandex.cloud.api.video.v1.ChannelOuterClass.Channel get(yandex.cloud.api.video.v1.ChannelServiceOuterClass.GetChannelRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List channels for organization.
     * </pre>
     */
    public yandex.cloud.api.video.v1.ChannelServiceOuterClass.ListChannelsResponse list(yandex.cloud.api.video.v1.ChannelServiceOuterClass.ListChannelsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create channel.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.video.v1.ChannelServiceOuterClass.CreateChannelRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update channel.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.video.v1.ChannelServiceOuterClass.UpdateChannelRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete channel.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.video.v1.ChannelServiceOuterClass.DeleteChannelRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Batch delete channels.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation batchDelete(yandex.cloud.api.video.v1.ChannelServiceOuterClass.BatchDeleteChannelsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Channel management service.
   * </pre>
   */
  public static final class ChannelServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ChannelServiceFutureStub> {
    private ChannelServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChannelServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ChannelServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specific channel.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.video.v1.ChannelOuterClass.Channel> get(
        yandex.cloud.api.video.v1.ChannelServiceOuterClass.GetChannelRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List channels for organization.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.video.v1.ChannelServiceOuterClass.ListChannelsResponse> list(
        yandex.cloud.api.video.v1.ChannelServiceOuterClass.ListChannelsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create channel.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.video.v1.ChannelServiceOuterClass.CreateChannelRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update channel.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.video.v1.ChannelServiceOuterClass.UpdateChannelRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete channel.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.video.v1.ChannelServiceOuterClass.DeleteChannelRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Batch delete channels.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> batchDelete(
        yandex.cloud.api.video.v1.ChannelServiceOuterClass.BatchDeleteChannelsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchDeleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_DELETE = 4;
  private static final int METHODID_BATCH_DELETE = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ChannelServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ChannelServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.video.v1.ChannelServiceOuterClass.GetChannelRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.ChannelOuterClass.Channel>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.video.v1.ChannelServiceOuterClass.ListChannelsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.ChannelServiceOuterClass.ListChannelsResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.video.v1.ChannelServiceOuterClass.CreateChannelRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.video.v1.ChannelServiceOuterClass.UpdateChannelRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.video.v1.ChannelServiceOuterClass.DeleteChannelRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_BATCH_DELETE:
          serviceImpl.batchDelete((yandex.cloud.api.video.v1.ChannelServiceOuterClass.BatchDeleteChannelsRequest) request,
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ChannelServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ChannelServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.video.v1.ChannelServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ChannelService");
    }
  }

  private static final class ChannelServiceFileDescriptorSupplier
      extends ChannelServiceBaseDescriptorSupplier {
    ChannelServiceFileDescriptorSupplier() {}
  }

  private static final class ChannelServiceMethodDescriptorSupplier
      extends ChannelServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ChannelServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ChannelServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ChannelServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getBatchDeleteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
