package yandex.cloud.api.datasphere.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/datasphere/v2/s3_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class S3ServiceGrpc {

  private S3ServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.datasphere.v2.S3Service";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.S3ServiceOuterClass.ActivateS3Request,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getActivateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Activate",
      requestType = yandex.cloud.api.datasphere.v2.S3ServiceOuterClass.ActivateS3Request.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.S3ServiceOuterClass.ActivateS3Request,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getActivateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.S3ServiceOuterClass.ActivateS3Request, yandex.cloud.api.operation.OperationOuterClass.Operation> getActivateMethod;
    if ((getActivateMethod = S3ServiceGrpc.getActivateMethod) == null) {
      synchronized (S3ServiceGrpc.class) {
        if ((getActivateMethod = S3ServiceGrpc.getActivateMethod) == null) {
          S3ServiceGrpc.getActivateMethod = getActivateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.datasphere.v2.S3ServiceOuterClass.ActivateS3Request, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Activate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datasphere.v2.S3ServiceOuterClass.ActivateS3Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new S3ServiceMethodDescriptorSupplier("Activate"))
              .build();
        }
      }
    }
    return getActivateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.S3ServiceOuterClass.DeactivateS3Request,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeactivateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Deactivate",
      requestType = yandex.cloud.api.datasphere.v2.S3ServiceOuterClass.DeactivateS3Request.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.S3ServiceOuterClass.DeactivateS3Request,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeactivateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.S3ServiceOuterClass.DeactivateS3Request, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeactivateMethod;
    if ((getDeactivateMethod = S3ServiceGrpc.getDeactivateMethod) == null) {
      synchronized (S3ServiceGrpc.class) {
        if ((getDeactivateMethod = S3ServiceGrpc.getDeactivateMethod) == null) {
          S3ServiceGrpc.getDeactivateMethod = getDeactivateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.datasphere.v2.S3ServiceOuterClass.DeactivateS3Request, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Deactivate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datasphere.v2.S3ServiceOuterClass.DeactivateS3Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new S3ServiceMethodDescriptorSupplier("Deactivate"))
              .build();
        }
      }
    }
    return getDeactivateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static S3ServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<S3ServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<S3ServiceStub>() {
        @java.lang.Override
        public S3ServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new S3ServiceStub(channel, callOptions);
        }
      };
    return S3ServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static S3ServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<S3ServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<S3ServiceBlockingStub>() {
        @java.lang.Override
        public S3ServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new S3ServiceBlockingStub(channel, callOptions);
        }
      };
    return S3ServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static S3ServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<S3ServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<S3ServiceFutureStub>() {
        @java.lang.Override
        public S3ServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new S3ServiceFutureStub(channel, callOptions);
        }
      };
    return S3ServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class S3ServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Activates shared s3 for project
     * </pre>
     */
    public void activate(yandex.cloud.api.datasphere.v2.S3ServiceOuterClass.ActivateS3Request request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getActivateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deactivates shared s3 for project
     * </pre>
     */
    public void deactivate(yandex.cloud.api.datasphere.v2.S3ServiceOuterClass.DeactivateS3Request request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeactivateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getActivateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.datasphere.v2.S3ServiceOuterClass.ActivateS3Request,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_ACTIVATE)))
          .addMethod(
            getDeactivateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.datasphere.v2.S3ServiceOuterClass.DeactivateS3Request,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DEACTIVATE)))
          .build();
    }
  }

  /**
   */
  public static final class S3ServiceStub extends io.grpc.stub.AbstractAsyncStub<S3ServiceStub> {
    private S3ServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected S3ServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new S3ServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Activates shared s3 for project
     * </pre>
     */
    public void activate(yandex.cloud.api.datasphere.v2.S3ServiceOuterClass.ActivateS3Request request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getActivateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deactivates shared s3 for project
     * </pre>
     */
    public void deactivate(yandex.cloud.api.datasphere.v2.S3ServiceOuterClass.DeactivateS3Request request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeactivateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class S3ServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<S3ServiceBlockingStub> {
    private S3ServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected S3ServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new S3ServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Activates shared s3 for project
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation activate(yandex.cloud.api.datasphere.v2.S3ServiceOuterClass.ActivateS3Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getActivateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deactivates shared s3 for project
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation deactivate(yandex.cloud.api.datasphere.v2.S3ServiceOuterClass.DeactivateS3Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeactivateMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class S3ServiceFutureStub extends io.grpc.stub.AbstractFutureStub<S3ServiceFutureStub> {
    private S3ServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected S3ServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new S3ServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Activates shared s3 for project
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> activate(
        yandex.cloud.api.datasphere.v2.S3ServiceOuterClass.ActivateS3Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getActivateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deactivates shared s3 for project
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> deactivate(
        yandex.cloud.api.datasphere.v2.S3ServiceOuterClass.DeactivateS3Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeactivateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ACTIVATE = 0;
  private static final int METHODID_DEACTIVATE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final S3ServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(S3ServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ACTIVATE:
          serviceImpl.activate((yandex.cloud.api.datasphere.v2.S3ServiceOuterClass.ActivateS3Request) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DEACTIVATE:
          serviceImpl.deactivate((yandex.cloud.api.datasphere.v2.S3ServiceOuterClass.DeactivateS3Request) request,
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

  private static abstract class S3ServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    S3ServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.datasphere.v2.S3ServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("S3Service");
    }
  }

  private static final class S3ServiceFileDescriptorSupplier
      extends S3ServiceBaseDescriptorSupplier {
    S3ServiceFileDescriptorSupplier() {}
  }

  private static final class S3ServiceMethodDescriptorSupplier
      extends S3ServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    S3ServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (S3ServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new S3ServiceFileDescriptorSupplier())
              .addMethod(getActivateMethod())
              .addMethod(getDeactivateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
