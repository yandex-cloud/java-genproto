package yandex.cloud.api.cic.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing TrunkConnection resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/cic/v1/trunk_connection_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TrunkConnectionServiceGrpc {

  private TrunkConnectionServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.cic.v1.TrunkConnectionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.GetTrunkConnectionRequest,
      yandex.cloud.api.cic.v1.TrunkConnectionOuterClass.TrunkConnection> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.GetTrunkConnectionRequest.class,
      responseType = yandex.cloud.api.cic.v1.TrunkConnectionOuterClass.TrunkConnection.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.GetTrunkConnectionRequest,
      yandex.cloud.api.cic.v1.TrunkConnectionOuterClass.TrunkConnection> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.GetTrunkConnectionRequest, yandex.cloud.api.cic.v1.TrunkConnectionOuterClass.TrunkConnection> getGetMethod;
    if ((getGetMethod = TrunkConnectionServiceGrpc.getGetMethod) == null) {
      synchronized (TrunkConnectionServiceGrpc.class) {
        if ((getGetMethod = TrunkConnectionServiceGrpc.getGetMethod) == null) {
          TrunkConnectionServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.GetTrunkConnectionRequest, yandex.cloud.api.cic.v1.TrunkConnectionOuterClass.TrunkConnection>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.GetTrunkConnectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cic.v1.TrunkConnectionOuterClass.TrunkConnection.getDefaultInstance()))
              .setSchemaDescriptor(new TrunkConnectionServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.ListTrunkConnectionsRequest,
      yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.ListTrunkConnectionsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.ListTrunkConnectionsRequest.class,
      responseType = yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.ListTrunkConnectionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.ListTrunkConnectionsRequest,
      yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.ListTrunkConnectionsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.ListTrunkConnectionsRequest, yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.ListTrunkConnectionsResponse> getListMethod;
    if ((getListMethod = TrunkConnectionServiceGrpc.getListMethod) == null) {
      synchronized (TrunkConnectionServiceGrpc.class) {
        if ((getListMethod = TrunkConnectionServiceGrpc.getListMethod) == null) {
          TrunkConnectionServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.ListTrunkConnectionsRequest, yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.ListTrunkConnectionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.ListTrunkConnectionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.ListTrunkConnectionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TrunkConnectionServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TrunkConnectionServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TrunkConnectionServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TrunkConnectionServiceStub>() {
        @java.lang.Override
        public TrunkConnectionServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TrunkConnectionServiceStub(channel, callOptions);
        }
      };
    return TrunkConnectionServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TrunkConnectionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TrunkConnectionServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TrunkConnectionServiceBlockingStub>() {
        @java.lang.Override
        public TrunkConnectionServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TrunkConnectionServiceBlockingStub(channel, callOptions);
        }
      };
    return TrunkConnectionServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TrunkConnectionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TrunkConnectionServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TrunkConnectionServiceFutureStub>() {
        @java.lang.Override
        public TrunkConnectionServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TrunkConnectionServiceFutureStub(channel, callOptions);
        }
      };
    return TrunkConnectionServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing TrunkConnection resources.
   * </pre>
   */
  public static abstract class TrunkConnectionServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified TrunkConnection resource.
     * To get the list of available TrunkConnection resources, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.GetTrunkConnectionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cic.v1.TrunkConnectionOuterClass.TrunkConnection> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of TrunkConnection resources in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.ListTrunkConnectionsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.ListTrunkConnectionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.GetTrunkConnectionRequest,
                yandex.cloud.api.cic.v1.TrunkConnectionOuterClass.TrunkConnection>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.ListTrunkConnectionsRequest,
                yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.ListTrunkConnectionsResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing TrunkConnection resources.
   * </pre>
   */
  public static final class TrunkConnectionServiceStub extends io.grpc.stub.AbstractAsyncStub<TrunkConnectionServiceStub> {
    private TrunkConnectionServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrunkConnectionServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TrunkConnectionServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified TrunkConnection resource.
     * To get the list of available TrunkConnection resources, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.GetTrunkConnectionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cic.v1.TrunkConnectionOuterClass.TrunkConnection> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of TrunkConnection resources in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.ListTrunkConnectionsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.ListTrunkConnectionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing TrunkConnection resources.
   * </pre>
   */
  public static final class TrunkConnectionServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<TrunkConnectionServiceBlockingStub> {
    private TrunkConnectionServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrunkConnectionServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TrunkConnectionServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified TrunkConnection resource.
     * To get the list of available TrunkConnection resources, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.cic.v1.TrunkConnectionOuterClass.TrunkConnection get(yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.GetTrunkConnectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of TrunkConnection resources in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.ListTrunkConnectionsResponse list(yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.ListTrunkConnectionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing TrunkConnection resources.
   * </pre>
   */
  public static final class TrunkConnectionServiceFutureStub extends io.grpc.stub.AbstractFutureStub<TrunkConnectionServiceFutureStub> {
    private TrunkConnectionServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrunkConnectionServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TrunkConnectionServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified TrunkConnection resource.
     * To get the list of available TrunkConnection resources, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.cic.v1.TrunkConnectionOuterClass.TrunkConnection> get(
        yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.GetTrunkConnectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of TrunkConnection resources in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.ListTrunkConnectionsResponse> list(
        yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.ListTrunkConnectionsRequest request) {
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
    private final TrunkConnectionServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TrunkConnectionServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.GetTrunkConnectionRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.cic.v1.TrunkConnectionOuterClass.TrunkConnection>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.ListTrunkConnectionsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.ListTrunkConnectionsResponse>) responseObserver);
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

  private static abstract class TrunkConnectionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TrunkConnectionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.cic.v1.TrunkConnectionServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TrunkConnectionService");
    }
  }

  private static final class TrunkConnectionServiceFileDescriptorSupplier
      extends TrunkConnectionServiceBaseDescriptorSupplier {
    TrunkConnectionServiceFileDescriptorSupplier() {}
  }

  private static final class TrunkConnectionServiceMethodDescriptorSupplier
      extends TrunkConnectionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TrunkConnectionServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TrunkConnectionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TrunkConnectionServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
