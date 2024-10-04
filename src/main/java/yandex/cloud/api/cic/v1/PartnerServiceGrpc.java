package yandex.cloud.api.cic.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing Partner resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/cic/v1/partner_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PartnerServiceGrpc {

  private PartnerServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.cic.v1.PartnerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cic.v1.PartnerServiceOuterClass.GetPartnerRequest,
      yandex.cloud.api.cic.v1.PartnerOuterClass.Partner> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.cic.v1.PartnerServiceOuterClass.GetPartnerRequest.class,
      responseType = yandex.cloud.api.cic.v1.PartnerOuterClass.Partner.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cic.v1.PartnerServiceOuterClass.GetPartnerRequest,
      yandex.cloud.api.cic.v1.PartnerOuterClass.Partner> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cic.v1.PartnerServiceOuterClass.GetPartnerRequest, yandex.cloud.api.cic.v1.PartnerOuterClass.Partner> getGetMethod;
    if ((getGetMethod = PartnerServiceGrpc.getGetMethod) == null) {
      synchronized (PartnerServiceGrpc.class) {
        if ((getGetMethod = PartnerServiceGrpc.getGetMethod) == null) {
          PartnerServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cic.v1.PartnerServiceOuterClass.GetPartnerRequest, yandex.cloud.api.cic.v1.PartnerOuterClass.Partner>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cic.v1.PartnerServiceOuterClass.GetPartnerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cic.v1.PartnerOuterClass.Partner.getDefaultInstance()))
              .setSchemaDescriptor(new PartnerServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cic.v1.PartnerServiceOuterClass.ListPartnersRequest,
      yandex.cloud.api.cic.v1.PartnerServiceOuterClass.ListPartnersResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.cic.v1.PartnerServiceOuterClass.ListPartnersRequest.class,
      responseType = yandex.cloud.api.cic.v1.PartnerServiceOuterClass.ListPartnersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cic.v1.PartnerServiceOuterClass.ListPartnersRequest,
      yandex.cloud.api.cic.v1.PartnerServiceOuterClass.ListPartnersResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cic.v1.PartnerServiceOuterClass.ListPartnersRequest, yandex.cloud.api.cic.v1.PartnerServiceOuterClass.ListPartnersResponse> getListMethod;
    if ((getListMethod = PartnerServiceGrpc.getListMethod) == null) {
      synchronized (PartnerServiceGrpc.class) {
        if ((getListMethod = PartnerServiceGrpc.getListMethod) == null) {
          PartnerServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cic.v1.PartnerServiceOuterClass.ListPartnersRequest, yandex.cloud.api.cic.v1.PartnerServiceOuterClass.ListPartnersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cic.v1.PartnerServiceOuterClass.ListPartnersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cic.v1.PartnerServiceOuterClass.ListPartnersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PartnerServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PartnerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PartnerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PartnerServiceStub>() {
        @java.lang.Override
        public PartnerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PartnerServiceStub(channel, callOptions);
        }
      };
    return PartnerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PartnerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PartnerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PartnerServiceBlockingStub>() {
        @java.lang.Override
        public PartnerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PartnerServiceBlockingStub(channel, callOptions);
        }
      };
    return PartnerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PartnerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PartnerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PartnerServiceFutureStub>() {
        @java.lang.Override
        public PartnerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PartnerServiceFutureStub(channel, callOptions);
        }
      };
    return PartnerServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing Partner resources.
   * </pre>
   */
  public static abstract class PartnerServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified Partner resource.
     * To get the list of available Partner resources, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.cic.v1.PartnerServiceOuterClass.GetPartnerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cic.v1.PartnerOuterClass.Partner> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of Partner resources in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.cic.v1.PartnerServiceOuterClass.ListPartnersRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cic.v1.PartnerServiceOuterClass.ListPartnersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cic.v1.PartnerServiceOuterClass.GetPartnerRequest,
                yandex.cloud.api.cic.v1.PartnerOuterClass.Partner>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cic.v1.PartnerServiceOuterClass.ListPartnersRequest,
                yandex.cloud.api.cic.v1.PartnerServiceOuterClass.ListPartnersResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing Partner resources.
   * </pre>
   */
  public static final class PartnerServiceStub extends io.grpc.stub.AbstractAsyncStub<PartnerServiceStub> {
    private PartnerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PartnerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PartnerServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified Partner resource.
     * To get the list of available Partner resources, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.cic.v1.PartnerServiceOuterClass.GetPartnerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cic.v1.PartnerOuterClass.Partner> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of Partner resources in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.cic.v1.PartnerServiceOuterClass.ListPartnersRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cic.v1.PartnerServiceOuterClass.ListPartnersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Partner resources.
   * </pre>
   */
  public static final class PartnerServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<PartnerServiceBlockingStub> {
    private PartnerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PartnerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PartnerServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified Partner resource.
     * To get the list of available Partner resources, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.cic.v1.PartnerOuterClass.Partner get(yandex.cloud.api.cic.v1.PartnerServiceOuterClass.GetPartnerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of Partner resources in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.cic.v1.PartnerServiceOuterClass.ListPartnersResponse list(yandex.cloud.api.cic.v1.PartnerServiceOuterClass.ListPartnersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Partner resources.
   * </pre>
   */
  public static final class PartnerServiceFutureStub extends io.grpc.stub.AbstractFutureStub<PartnerServiceFutureStub> {
    private PartnerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PartnerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PartnerServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified Partner resource.
     * To get the list of available Partner resources, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.cic.v1.PartnerOuterClass.Partner> get(
        yandex.cloud.api.cic.v1.PartnerServiceOuterClass.GetPartnerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of Partner resources in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.cic.v1.PartnerServiceOuterClass.ListPartnersResponse> list(
        yandex.cloud.api.cic.v1.PartnerServiceOuterClass.ListPartnersRequest request) {
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
    private final PartnerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PartnerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.cic.v1.PartnerServiceOuterClass.GetPartnerRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.cic.v1.PartnerOuterClass.Partner>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.cic.v1.PartnerServiceOuterClass.ListPartnersRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.cic.v1.PartnerServiceOuterClass.ListPartnersResponse>) responseObserver);
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

  private static abstract class PartnerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PartnerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.cic.v1.PartnerServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PartnerService");
    }
  }

  private static final class PartnerServiceFileDescriptorSupplier
      extends PartnerServiceBaseDescriptorSupplier {
    PartnerServiceFileDescriptorSupplier() {}
  }

  private static final class PartnerServiceMethodDescriptorSupplier
      extends PartnerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PartnerServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PartnerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PartnerServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
