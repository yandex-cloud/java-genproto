package yandex.cloud.api.ai.assistants.v1.threads;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/ai/assistants/v1/threads/thread_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ThreadServiceGrpc {

  private ThreadServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.ai.assistants.v1.threads.ThreadService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.CreateThreadRequest,
      yandex.cloud.api.ai.assistants.v1.threads.ThreadOuterClass.Thread> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.CreateThreadRequest.class,
      responseType = yandex.cloud.api.ai.assistants.v1.threads.ThreadOuterClass.Thread.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.CreateThreadRequest,
      yandex.cloud.api.ai.assistants.v1.threads.ThreadOuterClass.Thread> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.CreateThreadRequest, yandex.cloud.api.ai.assistants.v1.threads.ThreadOuterClass.Thread> getCreateMethod;
    if ((getCreateMethod = ThreadServiceGrpc.getCreateMethod) == null) {
      synchronized (ThreadServiceGrpc.class) {
        if ((getCreateMethod = ThreadServiceGrpc.getCreateMethod) == null) {
          ThreadServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.CreateThreadRequest, yandex.cloud.api.ai.assistants.v1.threads.ThreadOuterClass.Thread>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.CreateThreadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.assistants.v1.threads.ThreadOuterClass.Thread.getDefaultInstance()))
              .setSchemaDescriptor(new ThreadServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.GetThreadRequest,
      yandex.cloud.api.ai.assistants.v1.threads.ThreadOuterClass.Thread> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.GetThreadRequest.class,
      responseType = yandex.cloud.api.ai.assistants.v1.threads.ThreadOuterClass.Thread.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.GetThreadRequest,
      yandex.cloud.api.ai.assistants.v1.threads.ThreadOuterClass.Thread> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.GetThreadRequest, yandex.cloud.api.ai.assistants.v1.threads.ThreadOuterClass.Thread> getGetMethod;
    if ((getGetMethod = ThreadServiceGrpc.getGetMethod) == null) {
      synchronized (ThreadServiceGrpc.class) {
        if ((getGetMethod = ThreadServiceGrpc.getGetMethod) == null) {
          ThreadServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.GetThreadRequest, yandex.cloud.api.ai.assistants.v1.threads.ThreadOuterClass.Thread>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.GetThreadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.assistants.v1.threads.ThreadOuterClass.Thread.getDefaultInstance()))
              .setSchemaDescriptor(new ThreadServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.UpdateThreadRequest,
      yandex.cloud.api.ai.assistants.v1.threads.ThreadOuterClass.Thread> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.UpdateThreadRequest.class,
      responseType = yandex.cloud.api.ai.assistants.v1.threads.ThreadOuterClass.Thread.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.UpdateThreadRequest,
      yandex.cloud.api.ai.assistants.v1.threads.ThreadOuterClass.Thread> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.UpdateThreadRequest, yandex.cloud.api.ai.assistants.v1.threads.ThreadOuterClass.Thread> getUpdateMethod;
    if ((getUpdateMethod = ThreadServiceGrpc.getUpdateMethod) == null) {
      synchronized (ThreadServiceGrpc.class) {
        if ((getUpdateMethod = ThreadServiceGrpc.getUpdateMethod) == null) {
          ThreadServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.UpdateThreadRequest, yandex.cloud.api.ai.assistants.v1.threads.ThreadOuterClass.Thread>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.UpdateThreadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.assistants.v1.threads.ThreadOuterClass.Thread.getDefaultInstance()))
              .setSchemaDescriptor(new ThreadServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.DeleteThreadRequest,
      yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.DeleteThreadResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.DeleteThreadRequest.class,
      responseType = yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.DeleteThreadResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.DeleteThreadRequest,
      yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.DeleteThreadResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.DeleteThreadRequest, yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.DeleteThreadResponse> getDeleteMethod;
    if ((getDeleteMethod = ThreadServiceGrpc.getDeleteMethod) == null) {
      synchronized (ThreadServiceGrpc.class) {
        if ((getDeleteMethod = ThreadServiceGrpc.getDeleteMethod) == null) {
          ThreadServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.DeleteThreadRequest, yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.DeleteThreadResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.DeleteThreadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.DeleteThreadResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ThreadServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.ListThreadsRequest,
      yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.ListThreadsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.ListThreadsRequest.class,
      responseType = yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.ListThreadsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.ListThreadsRequest,
      yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.ListThreadsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.ListThreadsRequest, yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.ListThreadsResponse> getListMethod;
    if ((getListMethod = ThreadServiceGrpc.getListMethod) == null) {
      synchronized (ThreadServiceGrpc.class) {
        if ((getListMethod = ThreadServiceGrpc.getListMethod) == null) {
          ThreadServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.ListThreadsRequest, yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.ListThreadsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.ListThreadsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.ListThreadsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ThreadServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ThreadServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ThreadServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ThreadServiceStub>() {
        @java.lang.Override
        public ThreadServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ThreadServiceStub(channel, callOptions);
        }
      };
    return ThreadServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ThreadServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ThreadServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ThreadServiceBlockingStub>() {
        @java.lang.Override
        public ThreadServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ThreadServiceBlockingStub(channel, callOptions);
        }
      };
    return ThreadServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ThreadServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ThreadServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ThreadServiceFutureStub>() {
        @java.lang.Override
        public ThreadServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ThreadServiceFutureStub(channel, callOptions);
        }
      };
    return ThreadServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ThreadServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void create(yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.CreateThreadRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.threads.ThreadOuterClass.Thread> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    public void get(yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.GetThreadRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.threads.ThreadOuterClass.Thread> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     */
    public void update(yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.UpdateThreadRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.threads.ThreadOuterClass.Thread> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     */
    public void delete(yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.DeleteThreadRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.DeleteThreadResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     */
    public void list(yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.ListThreadsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.ListThreadsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.CreateThreadRequest,
                yandex.cloud.api.ai.assistants.v1.threads.ThreadOuterClass.Thread>(
                  this, METHODID_CREATE)))
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.GetThreadRequest,
                yandex.cloud.api.ai.assistants.v1.threads.ThreadOuterClass.Thread>(
                  this, METHODID_GET)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.UpdateThreadRequest,
                yandex.cloud.api.ai.assistants.v1.threads.ThreadOuterClass.Thread>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.DeleteThreadRequest,
                yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.DeleteThreadResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.ListThreadsRequest,
                yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.ListThreadsResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   */
  public static final class ThreadServiceStub extends io.grpc.stub.AbstractAsyncStub<ThreadServiceStub> {
    private ThreadServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ThreadServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ThreadServiceStub(channel, callOptions);
    }

    /**
     */
    public void create(yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.CreateThreadRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.threads.ThreadOuterClass.Thread> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void get(yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.GetThreadRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.threads.ThreadOuterClass.Thread> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void update(yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.UpdateThreadRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.threads.ThreadOuterClass.Thread> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.DeleteThreadRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.DeleteThreadResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void list(yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.ListThreadsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.ListThreadsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ThreadServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ThreadServiceBlockingStub> {
    private ThreadServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ThreadServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ThreadServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public yandex.cloud.api.ai.assistants.v1.threads.ThreadOuterClass.Thread create(yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.CreateThreadRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.ai.assistants.v1.threads.ThreadOuterClass.Thread get(yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.GetThreadRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.ai.assistants.v1.threads.ThreadOuterClass.Thread update(yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.UpdateThreadRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.DeleteThreadResponse delete(yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.DeleteThreadRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.ListThreadsResponse list(yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.ListThreadsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ThreadServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ThreadServiceFutureStub> {
    private ThreadServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ThreadServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ThreadServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ai.assistants.v1.threads.ThreadOuterClass.Thread> create(
        yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.CreateThreadRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ai.assistants.v1.threads.ThreadOuterClass.Thread> get(
        yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.GetThreadRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ai.assistants.v1.threads.ThreadOuterClass.Thread> update(
        yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.UpdateThreadRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.DeleteThreadResponse> delete(
        yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.DeleteThreadRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.ListThreadsResponse> list(
        yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.ListThreadsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_GET = 1;
  private static final int METHODID_UPDATE = 2;
  private static final int METHODID_DELETE = 3;
  private static final int METHODID_LIST = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ThreadServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ThreadServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.CreateThreadRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.threads.ThreadOuterClass.Thread>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.GetThreadRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.threads.ThreadOuterClass.Thread>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.UpdateThreadRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.threads.ThreadOuterClass.Thread>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.DeleteThreadRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.DeleteThreadResponse>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.ListThreadsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.ListThreadsResponse>) responseObserver);
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

  private static abstract class ThreadServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ThreadServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.ai.assistants.v1.threads.ThreadServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ThreadService");
    }
  }

  private static final class ThreadServiceFileDescriptorSupplier
      extends ThreadServiceBaseDescriptorSupplier {
    ThreadServiceFileDescriptorSupplier() {}
  }

  private static final class ThreadServiceMethodDescriptorSupplier
      extends ThreadServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ThreadServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ThreadServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ThreadServiceFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getGetMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
