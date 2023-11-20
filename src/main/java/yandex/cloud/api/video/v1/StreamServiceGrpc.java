package yandex.cloud.api.video.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/video/v1/stream_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class StreamServiceGrpc {

  private StreamServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.video.v1.StreamService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.StreamServiceOuterClass.GetStreamRequest,
      yandex.cloud.api.video.v1.StreamOuterClass.Stream> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.video.v1.StreamServiceOuterClass.GetStreamRequest.class,
      responseType = yandex.cloud.api.video.v1.StreamOuterClass.Stream.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.StreamServiceOuterClass.GetStreamRequest,
      yandex.cloud.api.video.v1.StreamOuterClass.Stream> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.StreamServiceOuterClass.GetStreamRequest, yandex.cloud.api.video.v1.StreamOuterClass.Stream> getGetMethod;
    if ((getGetMethod = StreamServiceGrpc.getGetMethod) == null) {
      synchronized (StreamServiceGrpc.class) {
        if ((getGetMethod = StreamServiceGrpc.getGetMethod) == null) {
          StreamServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.video.v1.StreamServiceOuterClass.GetStreamRequest, yandex.cloud.api.video.v1.StreamOuterClass.Stream>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.StreamServiceOuterClass.GetStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.StreamOuterClass.Stream.getDefaultInstance()))
              .setSchemaDescriptor(new StreamServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.StreamServiceOuterClass.ListStreamsRequest,
      yandex.cloud.api.video.v1.StreamServiceOuterClass.ListStreamsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.video.v1.StreamServiceOuterClass.ListStreamsRequest.class,
      responseType = yandex.cloud.api.video.v1.StreamServiceOuterClass.ListStreamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.StreamServiceOuterClass.ListStreamsRequest,
      yandex.cloud.api.video.v1.StreamServiceOuterClass.ListStreamsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.StreamServiceOuterClass.ListStreamsRequest, yandex.cloud.api.video.v1.StreamServiceOuterClass.ListStreamsResponse> getListMethod;
    if ((getListMethod = StreamServiceGrpc.getListMethod) == null) {
      synchronized (StreamServiceGrpc.class) {
        if ((getListMethod = StreamServiceGrpc.getListMethod) == null) {
          StreamServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.video.v1.StreamServiceOuterClass.ListStreamsRequest, yandex.cloud.api.video.v1.StreamServiceOuterClass.ListStreamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.StreamServiceOuterClass.ListStreamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.StreamServiceOuterClass.ListStreamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StreamServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.StreamServiceOuterClass.CreateStreamRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.video.v1.StreamServiceOuterClass.CreateStreamRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.StreamServiceOuterClass.CreateStreamRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.StreamServiceOuterClass.CreateStreamRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = StreamServiceGrpc.getCreateMethod) == null) {
      synchronized (StreamServiceGrpc.class) {
        if ((getCreateMethod = StreamServiceGrpc.getCreateMethod) == null) {
          StreamServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.video.v1.StreamServiceOuterClass.CreateStreamRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.StreamServiceOuterClass.CreateStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new StreamServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.StreamServiceOuterClass.UpdateStreamRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.video.v1.StreamServiceOuterClass.UpdateStreamRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.StreamServiceOuterClass.UpdateStreamRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.StreamServiceOuterClass.UpdateStreamRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = StreamServiceGrpc.getUpdateMethod) == null) {
      synchronized (StreamServiceGrpc.class) {
        if ((getUpdateMethod = StreamServiceGrpc.getUpdateMethod) == null) {
          StreamServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.video.v1.StreamServiceOuterClass.UpdateStreamRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.StreamServiceOuterClass.UpdateStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new StreamServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.StreamServiceOuterClass.DeleteStreamRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.video.v1.StreamServiceOuterClass.DeleteStreamRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.StreamServiceOuterClass.DeleteStreamRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.StreamServiceOuterClass.DeleteStreamRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = StreamServiceGrpc.getDeleteMethod) == null) {
      synchronized (StreamServiceGrpc.class) {
        if ((getDeleteMethod = StreamServiceGrpc.getDeleteMethod) == null) {
          StreamServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.video.v1.StreamServiceOuterClass.DeleteStreamRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.StreamServiceOuterClass.DeleteStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new StreamServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.StreamServiceOuterClass.PerformStreamActionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getPerformActionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PerformAction",
      requestType = yandex.cloud.api.video.v1.StreamServiceOuterClass.PerformStreamActionRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.StreamServiceOuterClass.PerformStreamActionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getPerformActionMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.StreamServiceOuterClass.PerformStreamActionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getPerformActionMethod;
    if ((getPerformActionMethod = StreamServiceGrpc.getPerformActionMethod) == null) {
      synchronized (StreamServiceGrpc.class) {
        if ((getPerformActionMethod = StreamServiceGrpc.getPerformActionMethod) == null) {
          StreamServiceGrpc.getPerformActionMethod = getPerformActionMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.video.v1.StreamServiceOuterClass.PerformStreamActionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PerformAction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.StreamServiceOuterClass.PerformStreamActionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new StreamServiceMethodDescriptorSupplier("PerformAction"))
              .build();
        }
      }
    }
    return getPerformActionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StreamServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StreamServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StreamServiceStub>() {
        @java.lang.Override
        public StreamServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StreamServiceStub(channel, callOptions);
        }
      };
    return StreamServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StreamServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StreamServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StreamServiceBlockingStub>() {
        @java.lang.Override
        public StreamServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StreamServiceBlockingStub(channel, callOptions);
        }
      };
    return StreamServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StreamServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StreamServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StreamServiceFutureStub>() {
        @java.lang.Override
        public StreamServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StreamServiceFutureStub(channel, callOptions);
        }
      };
    return StreamServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class StreamServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void get(yandex.cloud.api.video.v1.StreamServiceOuterClass.GetStreamRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.StreamOuterClass.Stream> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     */
    public void list(yandex.cloud.api.video.v1.StreamServiceOuterClass.ListStreamsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.StreamServiceOuterClass.ListStreamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     */
    public void create(yandex.cloud.api.video.v1.StreamServiceOuterClass.CreateStreamRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    public void update(yandex.cloud.api.video.v1.StreamServiceOuterClass.UpdateStreamRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     */
    public void delete(yandex.cloud.api.video.v1.StreamServiceOuterClass.DeleteStreamRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     */
    public void performAction(yandex.cloud.api.video.v1.StreamServiceOuterClass.PerformStreamActionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPerformActionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.video.v1.StreamServiceOuterClass.GetStreamRequest,
                yandex.cloud.api.video.v1.StreamOuterClass.Stream>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.video.v1.StreamServiceOuterClass.ListStreamsRequest,
                yandex.cloud.api.video.v1.StreamServiceOuterClass.ListStreamsResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.video.v1.StreamServiceOuterClass.CreateStreamRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.video.v1.StreamServiceOuterClass.UpdateStreamRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.video.v1.StreamServiceOuterClass.DeleteStreamRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getPerformActionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.video.v1.StreamServiceOuterClass.PerformStreamActionRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_PERFORM_ACTION)))
          .build();
    }
  }

  /**
   */
  public static final class StreamServiceStub extends io.grpc.stub.AbstractAsyncStub<StreamServiceStub> {
    private StreamServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StreamServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StreamServiceStub(channel, callOptions);
    }

    /**
     */
    public void get(yandex.cloud.api.video.v1.StreamServiceOuterClass.GetStreamRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.StreamOuterClass.Stream> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void list(yandex.cloud.api.video.v1.StreamServiceOuterClass.ListStreamsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.StreamServiceOuterClass.ListStreamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void create(yandex.cloud.api.video.v1.StreamServiceOuterClass.CreateStreamRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void update(yandex.cloud.api.video.v1.StreamServiceOuterClass.UpdateStreamRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(yandex.cloud.api.video.v1.StreamServiceOuterClass.DeleteStreamRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void performAction(yandex.cloud.api.video.v1.StreamServiceOuterClass.PerformStreamActionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPerformActionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class StreamServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<StreamServiceBlockingStub> {
    private StreamServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StreamServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StreamServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public yandex.cloud.api.video.v1.StreamOuterClass.Stream get(yandex.cloud.api.video.v1.StreamServiceOuterClass.GetStreamRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.video.v1.StreamServiceOuterClass.ListStreamsResponse list(yandex.cloud.api.video.v1.StreamServiceOuterClass.ListStreamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.video.v1.StreamServiceOuterClass.CreateStreamRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.video.v1.StreamServiceOuterClass.UpdateStreamRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.video.v1.StreamServiceOuterClass.DeleteStreamRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation performAction(yandex.cloud.api.video.v1.StreamServiceOuterClass.PerformStreamActionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPerformActionMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class StreamServiceFutureStub extends io.grpc.stub.AbstractFutureStub<StreamServiceFutureStub> {
    private StreamServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StreamServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StreamServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.video.v1.StreamOuterClass.Stream> get(
        yandex.cloud.api.video.v1.StreamServiceOuterClass.GetStreamRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.video.v1.StreamServiceOuterClass.ListStreamsResponse> list(
        yandex.cloud.api.video.v1.StreamServiceOuterClass.ListStreamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.video.v1.StreamServiceOuterClass.CreateStreamRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.video.v1.StreamServiceOuterClass.UpdateStreamRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.video.v1.StreamServiceOuterClass.DeleteStreamRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> performAction(
        yandex.cloud.api.video.v1.StreamServiceOuterClass.PerformStreamActionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPerformActionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_DELETE = 4;
  private static final int METHODID_PERFORM_ACTION = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final StreamServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(StreamServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.video.v1.StreamServiceOuterClass.GetStreamRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.StreamOuterClass.Stream>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.video.v1.StreamServiceOuterClass.ListStreamsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.StreamServiceOuterClass.ListStreamsResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.video.v1.StreamServiceOuterClass.CreateStreamRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.video.v1.StreamServiceOuterClass.UpdateStreamRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.video.v1.StreamServiceOuterClass.DeleteStreamRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_PERFORM_ACTION:
          serviceImpl.performAction((yandex.cloud.api.video.v1.StreamServiceOuterClass.PerformStreamActionRequest) request,
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

  private static abstract class StreamServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StreamServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.video.v1.StreamServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StreamService");
    }
  }

  private static final class StreamServiceFileDescriptorSupplier
      extends StreamServiceBaseDescriptorSupplier {
    StreamServiceFileDescriptorSupplier() {}
  }

  private static final class StreamServiceMethodDescriptorSupplier
      extends StreamServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StreamServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (StreamServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StreamServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getPerformActionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
