package yandex.cloud.api.lockbox.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Set of methods to access payload of secrets.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/lockbox/v1/payload_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PayloadServiceGrpc {

  private PayloadServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.lockbox.v1.PayloadService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.GetPayloadRequest,
      yandex.cloud.api.lockbox.v1.PayloadOuterClass.Payload> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.GetPayloadRequest.class,
      responseType = yandex.cloud.api.lockbox.v1.PayloadOuterClass.Payload.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.GetPayloadRequest,
      yandex.cloud.api.lockbox.v1.PayloadOuterClass.Payload> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.GetPayloadRequest, yandex.cloud.api.lockbox.v1.PayloadOuterClass.Payload> getGetMethod;
    if ((getGetMethod = PayloadServiceGrpc.getGetMethod) == null) {
      synchronized (PayloadServiceGrpc.class) {
        if ((getGetMethod = PayloadServiceGrpc.getGetMethod) == null) {
          PayloadServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.GetPayloadRequest, yandex.cloud.api.lockbox.v1.PayloadOuterClass.Payload>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.GetPayloadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.lockbox.v1.PayloadOuterClass.Payload.getDefaultInstance()))
              .setSchemaDescriptor(new PayloadServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.GetExRequest,
      yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.GetExResponse> getGetExMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEx",
      requestType = yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.GetExRequest.class,
      responseType = yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.GetExResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.GetExRequest,
      yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.GetExResponse> getGetExMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.GetExRequest, yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.GetExResponse> getGetExMethod;
    if ((getGetExMethod = PayloadServiceGrpc.getGetExMethod) == null) {
      synchronized (PayloadServiceGrpc.class) {
        if ((getGetExMethod = PayloadServiceGrpc.getGetExMethod) == null) {
          PayloadServiceGrpc.getGetExMethod = getGetExMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.GetExRequest, yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.GetExResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEx"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.GetExRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.GetExResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PayloadServiceMethodDescriptorSupplier("GetEx"))
              .build();
        }
      }
    }
    return getGetExMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PayloadServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PayloadServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PayloadServiceStub>() {
        @java.lang.Override
        public PayloadServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PayloadServiceStub(channel, callOptions);
        }
      };
    return PayloadServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PayloadServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PayloadServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PayloadServiceBlockingStub>() {
        @java.lang.Override
        public PayloadServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PayloadServiceBlockingStub(channel, callOptions);
        }
      };
    return PayloadServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PayloadServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PayloadServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PayloadServiceFutureStub>() {
        @java.lang.Override
        public PayloadServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PayloadServiceFutureStub(channel, callOptions);
        }
      };
    return PayloadServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Set of methods to access payload of secrets.
   * </pre>
   */
  public static abstract class PayloadServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the payload of the specified secret.
     * To get the list of all available secrets, make a [SecretService.List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.GetPayloadRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.lockbox.v1.PayloadOuterClass.Payload> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     */
    public void getEx(yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.GetExRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.GetExResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetExMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.GetPayloadRequest,
                yandex.cloud.api.lockbox.v1.PayloadOuterClass.Payload>(
                  this, METHODID_GET)))
          .addMethod(
            getGetExMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.GetExRequest,
                yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.GetExResponse>(
                  this, METHODID_GET_EX)))
          .build();
    }
  }

  /**
   * <pre>
   * Set of methods to access payload of secrets.
   * </pre>
   */
  public static final class PayloadServiceStub extends io.grpc.stub.AbstractAsyncStub<PayloadServiceStub> {
    private PayloadServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PayloadServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PayloadServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the payload of the specified secret.
     * To get the list of all available secrets, make a [SecretService.List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.GetPayloadRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.lockbox.v1.PayloadOuterClass.Payload> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getEx(yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.GetExRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.GetExResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetExMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Set of methods to access payload of secrets.
   * </pre>
   */
  public static final class PayloadServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<PayloadServiceBlockingStub> {
    private PayloadServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PayloadServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PayloadServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the payload of the specified secret.
     * To get the list of all available secrets, make a [SecretService.List] request.
     * </pre>
     */
    public yandex.cloud.api.lockbox.v1.PayloadOuterClass.Payload get(yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.GetPayloadRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.GetExResponse getEx(yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.GetExRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetExMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Set of methods to access payload of secrets.
   * </pre>
   */
  public static final class PayloadServiceFutureStub extends io.grpc.stub.AbstractFutureStub<PayloadServiceFutureStub> {
    private PayloadServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PayloadServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PayloadServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the payload of the specified secret.
     * To get the list of all available secrets, make a [SecretService.List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.lockbox.v1.PayloadOuterClass.Payload> get(
        yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.GetPayloadRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.GetExResponse> getEx(
        yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.GetExRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetExMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_GET_EX = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PayloadServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PayloadServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.GetPayloadRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.lockbox.v1.PayloadOuterClass.Payload>) responseObserver);
          break;
        case METHODID_GET_EX:
          serviceImpl.getEx((yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.GetExRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.GetExResponse>) responseObserver);
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

  private static abstract class PayloadServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PayloadServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.lockbox.v1.PayloadServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PayloadService");
    }
  }

  private static final class PayloadServiceFileDescriptorSupplier
      extends PayloadServiceBaseDescriptorSupplier {
    PayloadServiceFileDescriptorSupplier() {}
  }

  private static final class PayloadServiceMethodDescriptorSupplier
      extends PayloadServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PayloadServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PayloadServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PayloadServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getGetExMethod())
              .build();
        }
      }
    }
    return result;
  }
}
