package yandex.cloud.api.billing.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing Service resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/billing/v1/service_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ServiceServiceGrpc {

  private ServiceServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.billing.v1.ServiceService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.billing.v1.ServiceServiceOuterClass.GetServiceRequest,
      yandex.cloud.api.billing.v1.ServiceOuterClass.Service> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.billing.v1.ServiceServiceOuterClass.GetServiceRequest.class,
      responseType = yandex.cloud.api.billing.v1.ServiceOuterClass.Service.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.billing.v1.ServiceServiceOuterClass.GetServiceRequest,
      yandex.cloud.api.billing.v1.ServiceOuterClass.Service> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.billing.v1.ServiceServiceOuterClass.GetServiceRequest, yandex.cloud.api.billing.v1.ServiceOuterClass.Service> getGetMethod;
    if ((getGetMethod = ServiceServiceGrpc.getGetMethod) == null) {
      synchronized (ServiceServiceGrpc.class) {
        if ((getGetMethod = ServiceServiceGrpc.getGetMethod) == null) {
          ServiceServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.billing.v1.ServiceServiceOuterClass.GetServiceRequest, yandex.cloud.api.billing.v1.ServiceOuterClass.Service>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.billing.v1.ServiceServiceOuterClass.GetServiceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.billing.v1.ServiceOuterClass.Service.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.billing.v1.ServiceServiceOuterClass.ListServicesRequest,
      yandex.cloud.api.billing.v1.ServiceServiceOuterClass.ListServicesResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.billing.v1.ServiceServiceOuterClass.ListServicesRequest.class,
      responseType = yandex.cloud.api.billing.v1.ServiceServiceOuterClass.ListServicesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.billing.v1.ServiceServiceOuterClass.ListServicesRequest,
      yandex.cloud.api.billing.v1.ServiceServiceOuterClass.ListServicesResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.billing.v1.ServiceServiceOuterClass.ListServicesRequest, yandex.cloud.api.billing.v1.ServiceServiceOuterClass.ListServicesResponse> getListMethod;
    if ((getListMethod = ServiceServiceGrpc.getListMethod) == null) {
      synchronized (ServiceServiceGrpc.class) {
        if ((getListMethod = ServiceServiceGrpc.getListMethod) == null) {
          ServiceServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.billing.v1.ServiceServiceOuterClass.ListServicesRequest, yandex.cloud.api.billing.v1.ServiceServiceOuterClass.ListServicesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.billing.v1.ServiceServiceOuterClass.ListServicesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.billing.v1.ServiceServiceOuterClass.ListServicesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ServiceServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServiceServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServiceServiceStub>() {
        @java.lang.Override
        public ServiceServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServiceServiceStub(channel, callOptions);
        }
      };
    return ServiceServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ServiceServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServiceServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServiceServiceBlockingStub>() {
        @java.lang.Override
        public ServiceServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServiceServiceBlockingStub(channel, callOptions);
        }
      };
    return ServiceServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ServiceServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServiceServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServiceServiceFutureStub>() {
        @java.lang.Override
        public ServiceServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServiceServiceFutureStub(channel, callOptions);
        }
      };
    return ServiceServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing Service resources.
   * </pre>
   */
  public static abstract class ServiceServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified service.
     * </pre>
     */
    public void get(yandex.cloud.api.billing.v1.ServiceServiceOuterClass.GetServiceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.billing.v1.ServiceOuterClass.Service> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of services.
     * </pre>
     */
    public void list(yandex.cloud.api.billing.v1.ServiceServiceOuterClass.ListServicesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.billing.v1.ServiceServiceOuterClass.ListServicesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.billing.v1.ServiceServiceOuterClass.GetServiceRequest,
                yandex.cloud.api.billing.v1.ServiceOuterClass.Service>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.billing.v1.ServiceServiceOuterClass.ListServicesRequest,
                yandex.cloud.api.billing.v1.ServiceServiceOuterClass.ListServicesResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing Service resources.
   * </pre>
   */
  public static final class ServiceServiceStub extends io.grpc.stub.AbstractAsyncStub<ServiceServiceStub> {
    private ServiceServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServiceServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified service.
     * </pre>
     */
    public void get(yandex.cloud.api.billing.v1.ServiceServiceOuterClass.GetServiceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.billing.v1.ServiceOuterClass.Service> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of services.
     * </pre>
     */
    public void list(yandex.cloud.api.billing.v1.ServiceServiceOuterClass.ListServicesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.billing.v1.ServiceServiceOuterClass.ListServicesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Service resources.
   * </pre>
   */
  public static final class ServiceServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ServiceServiceBlockingStub> {
    private ServiceServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServiceServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified service.
     * </pre>
     */
    public yandex.cloud.api.billing.v1.ServiceOuterClass.Service get(yandex.cloud.api.billing.v1.ServiceServiceOuterClass.GetServiceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of services.
     * </pre>
     */
    public yandex.cloud.api.billing.v1.ServiceServiceOuterClass.ListServicesResponse list(yandex.cloud.api.billing.v1.ServiceServiceOuterClass.ListServicesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Service resources.
   * </pre>
   */
  public static final class ServiceServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ServiceServiceFutureStub> {
    private ServiceServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServiceServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.billing.v1.ServiceOuterClass.Service> get(
        yandex.cloud.api.billing.v1.ServiceServiceOuterClass.GetServiceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of services.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.billing.v1.ServiceServiceOuterClass.ListServicesResponse> list(
        yandex.cloud.api.billing.v1.ServiceServiceOuterClass.ListServicesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ServiceServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ServiceServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.billing.v1.ServiceServiceOuterClass.GetServiceRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.billing.v1.ServiceOuterClass.Service>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.billing.v1.ServiceServiceOuterClass.ListServicesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.billing.v1.ServiceServiceOuterClass.ListServicesResponse>) responseObserver);
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

  private static abstract class ServiceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ServiceServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.billing.v1.ServiceServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ServiceService");
    }
  }

  private static final class ServiceServiceFileDescriptorSupplier
      extends ServiceServiceBaseDescriptorSupplier {
    ServiceServiceFileDescriptorSupplier() {}
  }

  private static final class ServiceServiceMethodDescriptorSupplier
      extends ServiceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ServiceServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ServiceServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ServiceServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
