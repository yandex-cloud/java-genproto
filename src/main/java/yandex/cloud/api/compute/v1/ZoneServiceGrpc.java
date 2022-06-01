package yandex.cloud.api.compute.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods to retrieve information about availability zones.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/compute/v1/zone_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ZoneServiceGrpc {

  private ZoneServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.compute.v1.ZoneService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.ZoneServiceOuterClass.GetZoneRequest,
      yandex.cloud.api.compute.v1.ZoneOuterClass.Zone> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.compute.v1.ZoneServiceOuterClass.GetZoneRequest.class,
      responseType = yandex.cloud.api.compute.v1.ZoneOuterClass.Zone.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.ZoneServiceOuterClass.GetZoneRequest,
      yandex.cloud.api.compute.v1.ZoneOuterClass.Zone> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.ZoneServiceOuterClass.GetZoneRequest, yandex.cloud.api.compute.v1.ZoneOuterClass.Zone> getGetMethod;
    if ((getGetMethod = ZoneServiceGrpc.getGetMethod) == null) {
      synchronized (ZoneServiceGrpc.class) {
        if ((getGetMethod = ZoneServiceGrpc.getGetMethod) == null) {
          ZoneServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.ZoneServiceOuterClass.GetZoneRequest, yandex.cloud.api.compute.v1.ZoneOuterClass.Zone>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.ZoneServiceOuterClass.GetZoneRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.ZoneOuterClass.Zone.getDefaultInstance()))
              .setSchemaDescriptor(new ZoneServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.ZoneServiceOuterClass.ListZonesRequest,
      yandex.cloud.api.compute.v1.ZoneServiceOuterClass.ListZonesResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.compute.v1.ZoneServiceOuterClass.ListZonesRequest.class,
      responseType = yandex.cloud.api.compute.v1.ZoneServiceOuterClass.ListZonesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.ZoneServiceOuterClass.ListZonesRequest,
      yandex.cloud.api.compute.v1.ZoneServiceOuterClass.ListZonesResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.ZoneServiceOuterClass.ListZonesRequest, yandex.cloud.api.compute.v1.ZoneServiceOuterClass.ListZonesResponse> getListMethod;
    if ((getListMethod = ZoneServiceGrpc.getListMethod) == null) {
      synchronized (ZoneServiceGrpc.class) {
        if ((getListMethod = ZoneServiceGrpc.getListMethod) == null) {
          ZoneServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.ZoneServiceOuterClass.ListZonesRequest, yandex.cloud.api.compute.v1.ZoneServiceOuterClass.ListZonesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.ZoneServiceOuterClass.ListZonesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.ZoneServiceOuterClass.ListZonesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ZoneServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ZoneServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ZoneServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ZoneServiceStub>() {
        @java.lang.Override
        public ZoneServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ZoneServiceStub(channel, callOptions);
        }
      };
    return ZoneServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ZoneServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ZoneServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ZoneServiceBlockingStub>() {
        @java.lang.Override
        public ZoneServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ZoneServiceBlockingStub(channel, callOptions);
        }
      };
    return ZoneServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ZoneServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ZoneServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ZoneServiceFutureStub>() {
        @java.lang.Override
        public ZoneServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ZoneServiceFutureStub(channel, callOptions);
        }
      };
    return ZoneServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods to retrieve information about availability zones.
   * </pre>
   */
  public static abstract class ZoneServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the information about the specified availability zone.
     * To get the list of availability zones, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.compute.v1.ZoneServiceOuterClass.GetZoneRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.ZoneOuterClass.Zone> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of availability zones.
     * </pre>
     */
    public void list(yandex.cloud.api.compute.v1.ZoneServiceOuterClass.ListZonesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.ZoneServiceOuterClass.ListZonesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.ZoneServiceOuterClass.GetZoneRequest,
                yandex.cloud.api.compute.v1.ZoneOuterClass.Zone>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.ZoneServiceOuterClass.ListZonesRequest,
                yandex.cloud.api.compute.v1.ZoneServiceOuterClass.ListZonesResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods to retrieve information about availability zones.
   * </pre>
   */
  public static final class ZoneServiceStub extends io.grpc.stub.AbstractAsyncStub<ZoneServiceStub> {
    private ZoneServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ZoneServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ZoneServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the information about the specified availability zone.
     * To get the list of availability zones, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.compute.v1.ZoneServiceOuterClass.GetZoneRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.ZoneOuterClass.Zone> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of availability zones.
     * </pre>
     */
    public void list(yandex.cloud.api.compute.v1.ZoneServiceOuterClass.ListZonesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.ZoneServiceOuterClass.ListZonesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods to retrieve information about availability zones.
   * </pre>
   */
  public static final class ZoneServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ZoneServiceBlockingStub> {
    private ZoneServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ZoneServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ZoneServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the information about the specified availability zone.
     * To get the list of availability zones, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.compute.v1.ZoneOuterClass.Zone get(yandex.cloud.api.compute.v1.ZoneServiceOuterClass.GetZoneRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of availability zones.
     * </pre>
     */
    public yandex.cloud.api.compute.v1.ZoneServiceOuterClass.ListZonesResponse list(yandex.cloud.api.compute.v1.ZoneServiceOuterClass.ListZonesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods to retrieve information about availability zones.
   * </pre>
   */
  public static final class ZoneServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ZoneServiceFutureStub> {
    private ZoneServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ZoneServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ZoneServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the information about the specified availability zone.
     * To get the list of availability zones, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.compute.v1.ZoneOuterClass.Zone> get(
        yandex.cloud.api.compute.v1.ZoneServiceOuterClass.GetZoneRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of availability zones.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.compute.v1.ZoneServiceOuterClass.ListZonesResponse> list(
        yandex.cloud.api.compute.v1.ZoneServiceOuterClass.ListZonesRequest request) {
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
    private final ZoneServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ZoneServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.compute.v1.ZoneServiceOuterClass.GetZoneRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.ZoneOuterClass.Zone>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.compute.v1.ZoneServiceOuterClass.ListZonesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.ZoneServiceOuterClass.ListZonesResponse>) responseObserver);
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

  private static abstract class ZoneServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ZoneServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.compute.v1.ZoneServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ZoneService");
    }
  }

  private static final class ZoneServiceFileDescriptorSupplier
      extends ZoneServiceBaseDescriptorSupplier {
    ZoneServiceFileDescriptorSupplier() {}
  }

  private static final class ZoneServiceMethodDescriptorSupplier
      extends ZoneServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ZoneServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ZoneServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ZoneServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
