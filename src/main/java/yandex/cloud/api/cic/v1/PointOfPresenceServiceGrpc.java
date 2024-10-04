package yandex.cloud.api.cic.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing PointOfPresence resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/cic/v1/point_of_presence_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PointOfPresenceServiceGrpc {

  private PointOfPresenceServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.cic.v1.PointOfPresenceService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cic.v1.PointOfPresenceServiceOuterClass.GetPointOfPresenceRequest,
      yandex.cloud.api.cic.v1.PointOfPresenceOuterClass.PointOfPresence> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.cic.v1.PointOfPresenceServiceOuterClass.GetPointOfPresenceRequest.class,
      responseType = yandex.cloud.api.cic.v1.PointOfPresenceOuterClass.PointOfPresence.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cic.v1.PointOfPresenceServiceOuterClass.GetPointOfPresenceRequest,
      yandex.cloud.api.cic.v1.PointOfPresenceOuterClass.PointOfPresence> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cic.v1.PointOfPresenceServiceOuterClass.GetPointOfPresenceRequest, yandex.cloud.api.cic.v1.PointOfPresenceOuterClass.PointOfPresence> getGetMethod;
    if ((getGetMethod = PointOfPresenceServiceGrpc.getGetMethod) == null) {
      synchronized (PointOfPresenceServiceGrpc.class) {
        if ((getGetMethod = PointOfPresenceServiceGrpc.getGetMethod) == null) {
          PointOfPresenceServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cic.v1.PointOfPresenceServiceOuterClass.GetPointOfPresenceRequest, yandex.cloud.api.cic.v1.PointOfPresenceOuterClass.PointOfPresence>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cic.v1.PointOfPresenceServiceOuterClass.GetPointOfPresenceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cic.v1.PointOfPresenceOuterClass.PointOfPresence.getDefaultInstance()))
              .setSchemaDescriptor(new PointOfPresenceServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cic.v1.PointOfPresenceServiceOuterClass.ListPointOfPresencesRequest,
      yandex.cloud.api.cic.v1.PointOfPresenceServiceOuterClass.ListPointOfPresencesResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.cic.v1.PointOfPresenceServiceOuterClass.ListPointOfPresencesRequest.class,
      responseType = yandex.cloud.api.cic.v1.PointOfPresenceServiceOuterClass.ListPointOfPresencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cic.v1.PointOfPresenceServiceOuterClass.ListPointOfPresencesRequest,
      yandex.cloud.api.cic.v1.PointOfPresenceServiceOuterClass.ListPointOfPresencesResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cic.v1.PointOfPresenceServiceOuterClass.ListPointOfPresencesRequest, yandex.cloud.api.cic.v1.PointOfPresenceServiceOuterClass.ListPointOfPresencesResponse> getListMethod;
    if ((getListMethod = PointOfPresenceServiceGrpc.getListMethod) == null) {
      synchronized (PointOfPresenceServiceGrpc.class) {
        if ((getListMethod = PointOfPresenceServiceGrpc.getListMethod) == null) {
          PointOfPresenceServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cic.v1.PointOfPresenceServiceOuterClass.ListPointOfPresencesRequest, yandex.cloud.api.cic.v1.PointOfPresenceServiceOuterClass.ListPointOfPresencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cic.v1.PointOfPresenceServiceOuterClass.ListPointOfPresencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cic.v1.PointOfPresenceServiceOuterClass.ListPointOfPresencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PointOfPresenceServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PointOfPresenceServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PointOfPresenceServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PointOfPresenceServiceStub>() {
        @java.lang.Override
        public PointOfPresenceServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PointOfPresenceServiceStub(channel, callOptions);
        }
      };
    return PointOfPresenceServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PointOfPresenceServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PointOfPresenceServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PointOfPresenceServiceBlockingStub>() {
        @java.lang.Override
        public PointOfPresenceServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PointOfPresenceServiceBlockingStub(channel, callOptions);
        }
      };
    return PointOfPresenceServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PointOfPresenceServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PointOfPresenceServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PointOfPresenceServiceFutureStub>() {
        @java.lang.Override
        public PointOfPresenceServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PointOfPresenceServiceFutureStub(channel, callOptions);
        }
      };
    return PointOfPresenceServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing PointOfPresence resources.
   * </pre>
   */
  public static abstract class PointOfPresenceServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified PointOfPresence resource.
     * To get the list of available PointOfPresence resources, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.cic.v1.PointOfPresenceServiceOuterClass.GetPointOfPresenceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cic.v1.PointOfPresenceOuterClass.PointOfPresence> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of PointOfPresence resources in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.cic.v1.PointOfPresenceServiceOuterClass.ListPointOfPresencesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cic.v1.PointOfPresenceServiceOuterClass.ListPointOfPresencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cic.v1.PointOfPresenceServiceOuterClass.GetPointOfPresenceRequest,
                yandex.cloud.api.cic.v1.PointOfPresenceOuterClass.PointOfPresence>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cic.v1.PointOfPresenceServiceOuterClass.ListPointOfPresencesRequest,
                yandex.cloud.api.cic.v1.PointOfPresenceServiceOuterClass.ListPointOfPresencesResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing PointOfPresence resources.
   * </pre>
   */
  public static final class PointOfPresenceServiceStub extends io.grpc.stub.AbstractAsyncStub<PointOfPresenceServiceStub> {
    private PointOfPresenceServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PointOfPresenceServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PointOfPresenceServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified PointOfPresence resource.
     * To get the list of available PointOfPresence resources, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.cic.v1.PointOfPresenceServiceOuterClass.GetPointOfPresenceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cic.v1.PointOfPresenceOuterClass.PointOfPresence> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of PointOfPresence resources in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.cic.v1.PointOfPresenceServiceOuterClass.ListPointOfPresencesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cic.v1.PointOfPresenceServiceOuterClass.ListPointOfPresencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing PointOfPresence resources.
   * </pre>
   */
  public static final class PointOfPresenceServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<PointOfPresenceServiceBlockingStub> {
    private PointOfPresenceServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PointOfPresenceServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PointOfPresenceServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified PointOfPresence resource.
     * To get the list of available PointOfPresence resources, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.cic.v1.PointOfPresenceOuterClass.PointOfPresence get(yandex.cloud.api.cic.v1.PointOfPresenceServiceOuterClass.GetPointOfPresenceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of PointOfPresence resources in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.cic.v1.PointOfPresenceServiceOuterClass.ListPointOfPresencesResponse list(yandex.cloud.api.cic.v1.PointOfPresenceServiceOuterClass.ListPointOfPresencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing PointOfPresence resources.
   * </pre>
   */
  public static final class PointOfPresenceServiceFutureStub extends io.grpc.stub.AbstractFutureStub<PointOfPresenceServiceFutureStub> {
    private PointOfPresenceServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PointOfPresenceServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PointOfPresenceServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified PointOfPresence resource.
     * To get the list of available PointOfPresence resources, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.cic.v1.PointOfPresenceOuterClass.PointOfPresence> get(
        yandex.cloud.api.cic.v1.PointOfPresenceServiceOuterClass.GetPointOfPresenceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of PointOfPresence resources in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.cic.v1.PointOfPresenceServiceOuterClass.ListPointOfPresencesResponse> list(
        yandex.cloud.api.cic.v1.PointOfPresenceServiceOuterClass.ListPointOfPresencesRequest request) {
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
    private final PointOfPresenceServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PointOfPresenceServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.cic.v1.PointOfPresenceServiceOuterClass.GetPointOfPresenceRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.cic.v1.PointOfPresenceOuterClass.PointOfPresence>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.cic.v1.PointOfPresenceServiceOuterClass.ListPointOfPresencesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.cic.v1.PointOfPresenceServiceOuterClass.ListPointOfPresencesResponse>) responseObserver);
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

  private static abstract class PointOfPresenceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PointOfPresenceServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.cic.v1.PointOfPresenceServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PointOfPresenceService");
    }
  }

  private static final class PointOfPresenceServiceFileDescriptorSupplier
      extends PointOfPresenceServiceBaseDescriptorSupplier {
    PointOfPresenceServiceFileDescriptorSupplier() {}
  }

  private static final class PointOfPresenceServiceMethodDescriptorSupplier
      extends PointOfPresenceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PointOfPresenceServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PointOfPresenceServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PointOfPresenceServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
