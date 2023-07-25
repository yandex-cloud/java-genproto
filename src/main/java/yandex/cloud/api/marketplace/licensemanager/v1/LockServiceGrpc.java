package yandex.cloud.api.marketplace.licensemanager.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/marketplace/licensemanager/v1/lock_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class LockServiceGrpc {

  private LockServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.marketplace.licensemanager.v1.LockService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.marketplace.licensemanager.v1.LockServiceOuterClass.GetLockRequest,
      yandex.cloud.api.marketplace.licensemanager.v1.LockOuterClass.Lock> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.marketplace.licensemanager.v1.LockServiceOuterClass.GetLockRequest.class,
      responseType = yandex.cloud.api.marketplace.licensemanager.v1.LockOuterClass.Lock.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.marketplace.licensemanager.v1.LockServiceOuterClass.GetLockRequest,
      yandex.cloud.api.marketplace.licensemanager.v1.LockOuterClass.Lock> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.marketplace.licensemanager.v1.LockServiceOuterClass.GetLockRequest, yandex.cloud.api.marketplace.licensemanager.v1.LockOuterClass.Lock> getGetMethod;
    if ((getGetMethod = LockServiceGrpc.getGetMethod) == null) {
      synchronized (LockServiceGrpc.class) {
        if ((getGetMethod = LockServiceGrpc.getGetMethod) == null) {
          LockServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.marketplace.licensemanager.v1.LockServiceOuterClass.GetLockRequest, yandex.cloud.api.marketplace.licensemanager.v1.LockOuterClass.Lock>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.marketplace.licensemanager.v1.LockServiceOuterClass.GetLockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.marketplace.licensemanager.v1.LockOuterClass.Lock.getDefaultInstance()))
              .setSchemaDescriptor(new LockServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.marketplace.licensemanager.v1.LockServiceOuterClass.GetLockByInstanceAndResourceRequest,
      yandex.cloud.api.marketplace.licensemanager.v1.LockOuterClass.Lock> getGetByInstanceAndResourceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetByInstanceAndResource",
      requestType = yandex.cloud.api.marketplace.licensemanager.v1.LockServiceOuterClass.GetLockByInstanceAndResourceRequest.class,
      responseType = yandex.cloud.api.marketplace.licensemanager.v1.LockOuterClass.Lock.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.marketplace.licensemanager.v1.LockServiceOuterClass.GetLockByInstanceAndResourceRequest,
      yandex.cloud.api.marketplace.licensemanager.v1.LockOuterClass.Lock> getGetByInstanceAndResourceMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.marketplace.licensemanager.v1.LockServiceOuterClass.GetLockByInstanceAndResourceRequest, yandex.cloud.api.marketplace.licensemanager.v1.LockOuterClass.Lock> getGetByInstanceAndResourceMethod;
    if ((getGetByInstanceAndResourceMethod = LockServiceGrpc.getGetByInstanceAndResourceMethod) == null) {
      synchronized (LockServiceGrpc.class) {
        if ((getGetByInstanceAndResourceMethod = LockServiceGrpc.getGetByInstanceAndResourceMethod) == null) {
          LockServiceGrpc.getGetByInstanceAndResourceMethod = getGetByInstanceAndResourceMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.marketplace.licensemanager.v1.LockServiceOuterClass.GetLockByInstanceAndResourceRequest, yandex.cloud.api.marketplace.licensemanager.v1.LockOuterClass.Lock>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetByInstanceAndResource"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.marketplace.licensemanager.v1.LockServiceOuterClass.GetLockByInstanceAndResourceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.marketplace.licensemanager.v1.LockOuterClass.Lock.getDefaultInstance()))
              .setSchemaDescriptor(new LockServiceMethodDescriptorSupplier("GetByInstanceAndResource"))
              .build();
        }
      }
    }
    return getGetByInstanceAndResourceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.marketplace.licensemanager.v1.LockServiceOuterClass.CreateLockRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.marketplace.licensemanager.v1.LockServiceOuterClass.CreateLockRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.marketplace.licensemanager.v1.LockServiceOuterClass.CreateLockRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.marketplace.licensemanager.v1.LockServiceOuterClass.CreateLockRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = LockServiceGrpc.getCreateMethod) == null) {
      synchronized (LockServiceGrpc.class) {
        if ((getCreateMethod = LockServiceGrpc.getCreateMethod) == null) {
          LockServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.marketplace.licensemanager.v1.LockServiceOuterClass.CreateLockRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.marketplace.licensemanager.v1.LockServiceOuterClass.CreateLockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new LockServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.marketplace.licensemanager.v1.LockServiceOuterClass.CreateLockRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getEnsureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Ensure",
      requestType = yandex.cloud.api.marketplace.licensemanager.v1.LockServiceOuterClass.CreateLockRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.marketplace.licensemanager.v1.LockServiceOuterClass.CreateLockRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getEnsureMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.marketplace.licensemanager.v1.LockServiceOuterClass.CreateLockRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getEnsureMethod;
    if ((getEnsureMethod = LockServiceGrpc.getEnsureMethod) == null) {
      synchronized (LockServiceGrpc.class) {
        if ((getEnsureMethod = LockServiceGrpc.getEnsureMethod) == null) {
          LockServiceGrpc.getEnsureMethod = getEnsureMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.marketplace.licensemanager.v1.LockServiceOuterClass.CreateLockRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Ensure"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.marketplace.licensemanager.v1.LockServiceOuterClass.CreateLockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new LockServiceMethodDescriptorSupplier("Ensure"))
              .build();
        }
      }
    }
    return getEnsureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.marketplace.licensemanager.v1.LockServiceOuterClass.DeleteLockRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.marketplace.licensemanager.v1.LockServiceOuterClass.DeleteLockRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.marketplace.licensemanager.v1.LockServiceOuterClass.DeleteLockRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.marketplace.licensemanager.v1.LockServiceOuterClass.DeleteLockRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = LockServiceGrpc.getDeleteMethod) == null) {
      synchronized (LockServiceGrpc.class) {
        if ((getDeleteMethod = LockServiceGrpc.getDeleteMethod) == null) {
          LockServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.marketplace.licensemanager.v1.LockServiceOuterClass.DeleteLockRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.marketplace.licensemanager.v1.LockServiceOuterClass.DeleteLockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new LockServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LockServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LockServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LockServiceStub>() {
        @java.lang.Override
        public LockServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LockServiceStub(channel, callOptions);
        }
      };
    return LockServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LockServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LockServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LockServiceBlockingStub>() {
        @java.lang.Override
        public LockServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LockServiceBlockingStub(channel, callOptions);
        }
      };
    return LockServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LockServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LockServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LockServiceFutureStub>() {
        @java.lang.Override
        public LockServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LockServiceFutureStub(channel, callOptions);
        }
      };
    return LockServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class LockServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void get(yandex.cloud.api.marketplace.licensemanager.v1.LockServiceOuterClass.GetLockRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.marketplace.licensemanager.v1.LockOuterClass.Lock> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     */
    public void getByInstanceAndResource(yandex.cloud.api.marketplace.licensemanager.v1.LockServiceOuterClass.GetLockByInstanceAndResourceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.marketplace.licensemanager.v1.LockOuterClass.Lock> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetByInstanceAndResourceMethod(), responseObserver);
    }

    /**
     */
    public void create(yandex.cloud.api.marketplace.licensemanager.v1.LockServiceOuterClass.CreateLockRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    public void ensure(yandex.cloud.api.marketplace.licensemanager.v1.LockServiceOuterClass.CreateLockRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEnsureMethod(), responseObserver);
    }

    /**
     */
    public void delete(yandex.cloud.api.marketplace.licensemanager.v1.LockServiceOuterClass.DeleteLockRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.marketplace.licensemanager.v1.LockServiceOuterClass.GetLockRequest,
                yandex.cloud.api.marketplace.licensemanager.v1.LockOuterClass.Lock>(
                  this, METHODID_GET)))
          .addMethod(
            getGetByInstanceAndResourceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.marketplace.licensemanager.v1.LockServiceOuterClass.GetLockByInstanceAndResourceRequest,
                yandex.cloud.api.marketplace.licensemanager.v1.LockOuterClass.Lock>(
                  this, METHODID_GET_BY_INSTANCE_AND_RESOURCE)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.marketplace.licensemanager.v1.LockServiceOuterClass.CreateLockRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getEnsureMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.marketplace.licensemanager.v1.LockServiceOuterClass.CreateLockRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_ENSURE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.marketplace.licensemanager.v1.LockServiceOuterClass.DeleteLockRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .build();
    }
  }

  /**
   */
  public static final class LockServiceStub extends io.grpc.stub.AbstractAsyncStub<LockServiceStub> {
    private LockServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LockServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LockServiceStub(channel, callOptions);
    }

    /**
     */
    public void get(yandex.cloud.api.marketplace.licensemanager.v1.LockServiceOuterClass.GetLockRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.marketplace.licensemanager.v1.LockOuterClass.Lock> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getByInstanceAndResource(yandex.cloud.api.marketplace.licensemanager.v1.LockServiceOuterClass.GetLockByInstanceAndResourceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.marketplace.licensemanager.v1.LockOuterClass.Lock> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetByInstanceAndResourceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void create(yandex.cloud.api.marketplace.licensemanager.v1.LockServiceOuterClass.CreateLockRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void ensure(yandex.cloud.api.marketplace.licensemanager.v1.LockServiceOuterClass.CreateLockRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEnsureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(yandex.cloud.api.marketplace.licensemanager.v1.LockServiceOuterClass.DeleteLockRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class LockServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<LockServiceBlockingStub> {
    private LockServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LockServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LockServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public yandex.cloud.api.marketplace.licensemanager.v1.LockOuterClass.Lock get(yandex.cloud.api.marketplace.licensemanager.v1.LockServiceOuterClass.GetLockRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.marketplace.licensemanager.v1.LockOuterClass.Lock getByInstanceAndResource(yandex.cloud.api.marketplace.licensemanager.v1.LockServiceOuterClass.GetLockByInstanceAndResourceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetByInstanceAndResourceMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.marketplace.licensemanager.v1.LockServiceOuterClass.CreateLockRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation ensure(yandex.cloud.api.marketplace.licensemanager.v1.LockServiceOuterClass.CreateLockRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEnsureMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.marketplace.licensemanager.v1.LockServiceOuterClass.DeleteLockRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class LockServiceFutureStub extends io.grpc.stub.AbstractFutureStub<LockServiceFutureStub> {
    private LockServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LockServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LockServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.marketplace.licensemanager.v1.LockOuterClass.Lock> get(
        yandex.cloud.api.marketplace.licensemanager.v1.LockServiceOuterClass.GetLockRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.marketplace.licensemanager.v1.LockOuterClass.Lock> getByInstanceAndResource(
        yandex.cloud.api.marketplace.licensemanager.v1.LockServiceOuterClass.GetLockByInstanceAndResourceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetByInstanceAndResourceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.marketplace.licensemanager.v1.LockServiceOuterClass.CreateLockRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> ensure(
        yandex.cloud.api.marketplace.licensemanager.v1.LockServiceOuterClass.CreateLockRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEnsureMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.marketplace.licensemanager.v1.LockServiceOuterClass.DeleteLockRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_GET_BY_INSTANCE_AND_RESOURCE = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_ENSURE = 3;
  private static final int METHODID_DELETE = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LockServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LockServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.marketplace.licensemanager.v1.LockServiceOuterClass.GetLockRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.marketplace.licensemanager.v1.LockOuterClass.Lock>) responseObserver);
          break;
        case METHODID_GET_BY_INSTANCE_AND_RESOURCE:
          serviceImpl.getByInstanceAndResource((yandex.cloud.api.marketplace.licensemanager.v1.LockServiceOuterClass.GetLockByInstanceAndResourceRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.marketplace.licensemanager.v1.LockOuterClass.Lock>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.marketplace.licensemanager.v1.LockServiceOuterClass.CreateLockRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_ENSURE:
          serviceImpl.ensure((yandex.cloud.api.marketplace.licensemanager.v1.LockServiceOuterClass.CreateLockRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.marketplace.licensemanager.v1.LockServiceOuterClass.DeleteLockRequest) request,
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

  private static abstract class LockServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LockServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.marketplace.licensemanager.v1.LockServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LockService");
    }
  }

  private static final class LockServiceFileDescriptorSupplier
      extends LockServiceBaseDescriptorSupplier {
    LockServiceFileDescriptorSupplier() {}
  }

  private static final class LockServiceMethodDescriptorSupplier
      extends LockServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LockServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (LockServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LockServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getGetByInstanceAndResourceMethod())
              .addMethod(getCreateMethod())
              .addMethod(getEnsureMethod())
              .addMethod(getDeleteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
