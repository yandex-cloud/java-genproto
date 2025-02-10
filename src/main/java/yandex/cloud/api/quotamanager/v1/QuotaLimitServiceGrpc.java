package yandex.cloud.api.quotamanager.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing quota limits.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/quotamanager/v1/quota_limit_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QuotaLimitServiceGrpc {

  private QuotaLimitServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.quotamanager.v1.QuotaLimitService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.quotamanager.v1.QuotaLimitServiceOuterClass.GetQuotaLimitRequest,
      yandex.cloud.api.quotamanager.v1.QuotaLimitServiceOuterClass.QuotaLimit> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.quotamanager.v1.QuotaLimitServiceOuterClass.GetQuotaLimitRequest.class,
      responseType = yandex.cloud.api.quotamanager.v1.QuotaLimitServiceOuterClass.QuotaLimit.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.quotamanager.v1.QuotaLimitServiceOuterClass.GetQuotaLimitRequest,
      yandex.cloud.api.quotamanager.v1.QuotaLimitServiceOuterClass.QuotaLimit> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.quotamanager.v1.QuotaLimitServiceOuterClass.GetQuotaLimitRequest, yandex.cloud.api.quotamanager.v1.QuotaLimitServiceOuterClass.QuotaLimit> getGetMethod;
    if ((getGetMethod = QuotaLimitServiceGrpc.getGetMethod) == null) {
      synchronized (QuotaLimitServiceGrpc.class) {
        if ((getGetMethod = QuotaLimitServiceGrpc.getGetMethod) == null) {
          QuotaLimitServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.quotamanager.v1.QuotaLimitServiceOuterClass.GetQuotaLimitRequest, yandex.cloud.api.quotamanager.v1.QuotaLimitServiceOuterClass.QuotaLimit>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.quotamanager.v1.QuotaLimitServiceOuterClass.GetQuotaLimitRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.quotamanager.v1.QuotaLimitServiceOuterClass.QuotaLimit.getDefaultInstance()))
              .setSchemaDescriptor(new QuotaLimitServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.quotamanager.v1.QuotaLimitServiceOuterClass.ListQuotaLimitsRequest,
      yandex.cloud.api.quotamanager.v1.QuotaLimitServiceOuterClass.ListQuotaLimitsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.quotamanager.v1.QuotaLimitServiceOuterClass.ListQuotaLimitsRequest.class,
      responseType = yandex.cloud.api.quotamanager.v1.QuotaLimitServiceOuterClass.ListQuotaLimitsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.quotamanager.v1.QuotaLimitServiceOuterClass.ListQuotaLimitsRequest,
      yandex.cloud.api.quotamanager.v1.QuotaLimitServiceOuterClass.ListQuotaLimitsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.quotamanager.v1.QuotaLimitServiceOuterClass.ListQuotaLimitsRequest, yandex.cloud.api.quotamanager.v1.QuotaLimitServiceOuterClass.ListQuotaLimitsResponse> getListMethod;
    if ((getListMethod = QuotaLimitServiceGrpc.getListMethod) == null) {
      synchronized (QuotaLimitServiceGrpc.class) {
        if ((getListMethod = QuotaLimitServiceGrpc.getListMethod) == null) {
          QuotaLimitServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.quotamanager.v1.QuotaLimitServiceOuterClass.ListQuotaLimitsRequest, yandex.cloud.api.quotamanager.v1.QuotaLimitServiceOuterClass.ListQuotaLimitsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.quotamanager.v1.QuotaLimitServiceOuterClass.ListQuotaLimitsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.quotamanager.v1.QuotaLimitServiceOuterClass.ListQuotaLimitsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QuotaLimitServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.quotamanager.v1.QuotaLimitServiceOuterClass.ListServicesRequest,
      yandex.cloud.api.quotamanager.v1.QuotaLimitServiceOuterClass.ListServicesResponse> getListServicesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListServices",
      requestType = yandex.cloud.api.quotamanager.v1.QuotaLimitServiceOuterClass.ListServicesRequest.class,
      responseType = yandex.cloud.api.quotamanager.v1.QuotaLimitServiceOuterClass.ListServicesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.quotamanager.v1.QuotaLimitServiceOuterClass.ListServicesRequest,
      yandex.cloud.api.quotamanager.v1.QuotaLimitServiceOuterClass.ListServicesResponse> getListServicesMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.quotamanager.v1.QuotaLimitServiceOuterClass.ListServicesRequest, yandex.cloud.api.quotamanager.v1.QuotaLimitServiceOuterClass.ListServicesResponse> getListServicesMethod;
    if ((getListServicesMethod = QuotaLimitServiceGrpc.getListServicesMethod) == null) {
      synchronized (QuotaLimitServiceGrpc.class) {
        if ((getListServicesMethod = QuotaLimitServiceGrpc.getListServicesMethod) == null) {
          QuotaLimitServiceGrpc.getListServicesMethod = getListServicesMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.quotamanager.v1.QuotaLimitServiceOuterClass.ListServicesRequest, yandex.cloud.api.quotamanager.v1.QuotaLimitServiceOuterClass.ListServicesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListServices"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.quotamanager.v1.QuotaLimitServiceOuterClass.ListServicesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.quotamanager.v1.QuotaLimitServiceOuterClass.ListServicesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QuotaLimitServiceMethodDescriptorSupplier("ListServices"))
              .build();
        }
      }
    }
    return getListServicesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static QuotaLimitServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QuotaLimitServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QuotaLimitServiceStub>() {
        @java.lang.Override
        public QuotaLimitServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QuotaLimitServiceStub(channel, callOptions);
        }
      };
    return QuotaLimitServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static QuotaLimitServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QuotaLimitServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QuotaLimitServiceBlockingStub>() {
        @java.lang.Override
        public QuotaLimitServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QuotaLimitServiceBlockingStub(channel, callOptions);
        }
      };
    return QuotaLimitServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static QuotaLimitServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QuotaLimitServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QuotaLimitServiceFutureStub>() {
        @java.lang.Override
        public QuotaLimitServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QuotaLimitServiceFutureStub(channel, callOptions);
        }
      };
    return QuotaLimitServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing quota limits.
   * </pre>
   */
  public static abstract class QuotaLimitServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified quota limit.
     * </pre>
     */
    public void get(yandex.cloud.api.quotamanager.v1.QuotaLimitServiceOuterClass.GetQuotaLimitRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.quotamanager.v1.QuotaLimitServiceOuterClass.QuotaLimit> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of quota limits for a given service.
     * </pre>
     */
    public void list(yandex.cloud.api.quotamanager.v1.QuotaLimitServiceOuterClass.ListQuotaLimitsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.quotamanager.v1.QuotaLimitServiceOuterClass.ListQuotaLimitsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of services available for quota management.
     * </pre>
     */
    public void listServices(yandex.cloud.api.quotamanager.v1.QuotaLimitServiceOuterClass.ListServicesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.quotamanager.v1.QuotaLimitServiceOuterClass.ListServicesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListServicesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.quotamanager.v1.QuotaLimitServiceOuterClass.GetQuotaLimitRequest,
                yandex.cloud.api.quotamanager.v1.QuotaLimitServiceOuterClass.QuotaLimit>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.quotamanager.v1.QuotaLimitServiceOuterClass.ListQuotaLimitsRequest,
                yandex.cloud.api.quotamanager.v1.QuotaLimitServiceOuterClass.ListQuotaLimitsResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getListServicesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.quotamanager.v1.QuotaLimitServiceOuterClass.ListServicesRequest,
                yandex.cloud.api.quotamanager.v1.QuotaLimitServiceOuterClass.ListServicesResponse>(
                  this, METHODID_LIST_SERVICES)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing quota limits.
   * </pre>
   */
  public static final class QuotaLimitServiceStub extends io.grpc.stub.AbstractAsyncStub<QuotaLimitServiceStub> {
    private QuotaLimitServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QuotaLimitServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QuotaLimitServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified quota limit.
     * </pre>
     */
    public void get(yandex.cloud.api.quotamanager.v1.QuotaLimitServiceOuterClass.GetQuotaLimitRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.quotamanager.v1.QuotaLimitServiceOuterClass.QuotaLimit> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of quota limits for a given service.
     * </pre>
     */
    public void list(yandex.cloud.api.quotamanager.v1.QuotaLimitServiceOuterClass.ListQuotaLimitsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.quotamanager.v1.QuotaLimitServiceOuterClass.ListQuotaLimitsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of services available for quota management.
     * </pre>
     */
    public void listServices(yandex.cloud.api.quotamanager.v1.QuotaLimitServiceOuterClass.ListServicesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.quotamanager.v1.QuotaLimitServiceOuterClass.ListServicesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListServicesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing quota limits.
   * </pre>
   */
  public static final class QuotaLimitServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<QuotaLimitServiceBlockingStub> {
    private QuotaLimitServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QuotaLimitServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QuotaLimitServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified quota limit.
     * </pre>
     */
    public yandex.cloud.api.quotamanager.v1.QuotaLimitServiceOuterClass.QuotaLimit get(yandex.cloud.api.quotamanager.v1.QuotaLimitServiceOuterClass.GetQuotaLimitRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of quota limits for a given service.
     * </pre>
     */
    public yandex.cloud.api.quotamanager.v1.QuotaLimitServiceOuterClass.ListQuotaLimitsResponse list(yandex.cloud.api.quotamanager.v1.QuotaLimitServiceOuterClass.ListQuotaLimitsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of services available for quota management.
     * </pre>
     */
    public yandex.cloud.api.quotamanager.v1.QuotaLimitServiceOuterClass.ListServicesResponse listServices(yandex.cloud.api.quotamanager.v1.QuotaLimitServiceOuterClass.ListServicesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListServicesMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing quota limits.
   * </pre>
   */
  public static final class QuotaLimitServiceFutureStub extends io.grpc.stub.AbstractFutureStub<QuotaLimitServiceFutureStub> {
    private QuotaLimitServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QuotaLimitServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QuotaLimitServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified quota limit.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.quotamanager.v1.QuotaLimitServiceOuterClass.QuotaLimit> get(
        yandex.cloud.api.quotamanager.v1.QuotaLimitServiceOuterClass.GetQuotaLimitRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of quota limits for a given service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.quotamanager.v1.QuotaLimitServiceOuterClass.ListQuotaLimitsResponse> list(
        yandex.cloud.api.quotamanager.v1.QuotaLimitServiceOuterClass.ListQuotaLimitsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of services available for quota management.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.quotamanager.v1.QuotaLimitServiceOuterClass.ListServicesResponse> listServices(
        yandex.cloud.api.quotamanager.v1.QuotaLimitServiceOuterClass.ListServicesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListServicesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_LIST_SERVICES = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final QuotaLimitServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(QuotaLimitServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.quotamanager.v1.QuotaLimitServiceOuterClass.GetQuotaLimitRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.quotamanager.v1.QuotaLimitServiceOuterClass.QuotaLimit>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.quotamanager.v1.QuotaLimitServiceOuterClass.ListQuotaLimitsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.quotamanager.v1.QuotaLimitServiceOuterClass.ListQuotaLimitsResponse>) responseObserver);
          break;
        case METHODID_LIST_SERVICES:
          serviceImpl.listServices((yandex.cloud.api.quotamanager.v1.QuotaLimitServiceOuterClass.ListServicesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.quotamanager.v1.QuotaLimitServiceOuterClass.ListServicesResponse>) responseObserver);
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

  private static abstract class QuotaLimitServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QuotaLimitServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.quotamanager.v1.QuotaLimitServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("QuotaLimitService");
    }
  }

  private static final class QuotaLimitServiceFileDescriptorSupplier
      extends QuotaLimitServiceBaseDescriptorSupplier {
    QuotaLimitServiceFileDescriptorSupplier() {}
  }

  private static final class QuotaLimitServiceMethodDescriptorSupplier
      extends QuotaLimitServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    QuotaLimitServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (QuotaLimitServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new QuotaLimitServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getListServicesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
