package yandex.cloud.api.ydb.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/ydb/v1/location_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class LocationServiceGrpc {

  private LocationServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.ydb.v1.LocationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ydb.v1.LocationServiceOuterClass.GetLocationRequest,
      yandex.cloud.api.ydb.v1.LocationOuterClass.Location> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.ydb.v1.LocationServiceOuterClass.GetLocationRequest.class,
      responseType = yandex.cloud.api.ydb.v1.LocationOuterClass.Location.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ydb.v1.LocationServiceOuterClass.GetLocationRequest,
      yandex.cloud.api.ydb.v1.LocationOuterClass.Location> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ydb.v1.LocationServiceOuterClass.GetLocationRequest, yandex.cloud.api.ydb.v1.LocationOuterClass.Location> getGetMethod;
    if ((getGetMethod = LocationServiceGrpc.getGetMethod) == null) {
      synchronized (LocationServiceGrpc.class) {
        if ((getGetMethod = LocationServiceGrpc.getGetMethod) == null) {
          LocationServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ydb.v1.LocationServiceOuterClass.GetLocationRequest, yandex.cloud.api.ydb.v1.LocationOuterClass.Location>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ydb.v1.LocationServiceOuterClass.GetLocationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ydb.v1.LocationOuterClass.Location.getDefaultInstance()))
              .setSchemaDescriptor(new LocationServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ydb.v1.LocationServiceOuterClass.ListLocationsRequest,
      yandex.cloud.api.ydb.v1.LocationServiceOuterClass.ListLocationsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.ydb.v1.LocationServiceOuterClass.ListLocationsRequest.class,
      responseType = yandex.cloud.api.ydb.v1.LocationServiceOuterClass.ListLocationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ydb.v1.LocationServiceOuterClass.ListLocationsRequest,
      yandex.cloud.api.ydb.v1.LocationServiceOuterClass.ListLocationsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ydb.v1.LocationServiceOuterClass.ListLocationsRequest, yandex.cloud.api.ydb.v1.LocationServiceOuterClass.ListLocationsResponse> getListMethod;
    if ((getListMethod = LocationServiceGrpc.getListMethod) == null) {
      synchronized (LocationServiceGrpc.class) {
        if ((getListMethod = LocationServiceGrpc.getListMethod) == null) {
          LocationServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ydb.v1.LocationServiceOuterClass.ListLocationsRequest, yandex.cloud.api.ydb.v1.LocationServiceOuterClass.ListLocationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ydb.v1.LocationServiceOuterClass.ListLocationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ydb.v1.LocationServiceOuterClass.ListLocationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LocationServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LocationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LocationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LocationServiceStub>() {
        @java.lang.Override
        public LocationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LocationServiceStub(channel, callOptions);
        }
      };
    return LocationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LocationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LocationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LocationServiceBlockingStub>() {
        @java.lang.Override
        public LocationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LocationServiceBlockingStub(channel, callOptions);
        }
      };
    return LocationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LocationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LocationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LocationServiceFutureStub>() {
        @java.lang.Override
        public LocationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LocationServiceFutureStub(channel, callOptions);
        }
      };
    return LocationServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class LocationServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified location.
     * </pre>
     */
    public void get(yandex.cloud.api.ydb.v1.LocationServiceOuterClass.GetLocationRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ydb.v1.LocationOuterClass.Location> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the list of available locations.
     * </pre>
     */
    public void list(yandex.cloud.api.ydb.v1.LocationServiceOuterClass.ListLocationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ydb.v1.LocationServiceOuterClass.ListLocationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ydb.v1.LocationServiceOuterClass.GetLocationRequest,
                yandex.cloud.api.ydb.v1.LocationOuterClass.Location>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ydb.v1.LocationServiceOuterClass.ListLocationsRequest,
                yandex.cloud.api.ydb.v1.LocationServiceOuterClass.ListLocationsResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   */
  public static final class LocationServiceStub extends io.grpc.stub.AbstractAsyncStub<LocationServiceStub> {
    private LocationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LocationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LocationServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified location.
     * </pre>
     */
    public void get(yandex.cloud.api.ydb.v1.LocationServiceOuterClass.GetLocationRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ydb.v1.LocationOuterClass.Location> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the list of available locations.
     * </pre>
     */
    public void list(yandex.cloud.api.ydb.v1.LocationServiceOuterClass.ListLocationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ydb.v1.LocationServiceOuterClass.ListLocationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class LocationServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<LocationServiceBlockingStub> {
    private LocationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LocationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LocationServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified location.
     * </pre>
     */
    public yandex.cloud.api.ydb.v1.LocationOuterClass.Location get(yandex.cloud.api.ydb.v1.LocationServiceOuterClass.GetLocationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the list of available locations.
     * </pre>
     */
    public yandex.cloud.api.ydb.v1.LocationServiceOuterClass.ListLocationsResponse list(yandex.cloud.api.ydb.v1.LocationServiceOuterClass.ListLocationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class LocationServiceFutureStub extends io.grpc.stub.AbstractFutureStub<LocationServiceFutureStub> {
    private LocationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LocationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LocationServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified location.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ydb.v1.LocationOuterClass.Location> get(
        yandex.cloud.api.ydb.v1.LocationServiceOuterClass.GetLocationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the list of available locations.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ydb.v1.LocationServiceOuterClass.ListLocationsResponse> list(
        yandex.cloud.api.ydb.v1.LocationServiceOuterClass.ListLocationsRequest request) {
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
    private final LocationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LocationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.ydb.v1.LocationServiceOuterClass.GetLocationRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ydb.v1.LocationOuterClass.Location>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.ydb.v1.LocationServiceOuterClass.ListLocationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ydb.v1.LocationServiceOuterClass.ListLocationsResponse>) responseObserver);
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

  private static abstract class LocationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LocationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.ydb.v1.LocationServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LocationService");
    }
  }

  private static final class LocationServiceFileDescriptorSupplier
      extends LocationServiceBaseDescriptorSupplier {
    LocationServiceFileDescriptorSupplier() {}
  }

  private static final class LocationServiceMethodDescriptorSupplier
      extends LocationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LocationServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (LocationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LocationServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
