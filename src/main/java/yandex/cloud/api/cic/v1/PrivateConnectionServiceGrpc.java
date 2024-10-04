package yandex.cloud.api.cic.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing PrivateConnection resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/cic/v1/private_connection_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PrivateConnectionServiceGrpc {

  private PrivateConnectionServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.cic.v1.PrivateConnectionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.GetPrivateConnectionRequest,
      yandex.cloud.api.cic.v1.PrivateConnectionOuterClass.PrivateConnection> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.GetPrivateConnectionRequest.class,
      responseType = yandex.cloud.api.cic.v1.PrivateConnectionOuterClass.PrivateConnection.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.GetPrivateConnectionRequest,
      yandex.cloud.api.cic.v1.PrivateConnectionOuterClass.PrivateConnection> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.GetPrivateConnectionRequest, yandex.cloud.api.cic.v1.PrivateConnectionOuterClass.PrivateConnection> getGetMethod;
    if ((getGetMethod = PrivateConnectionServiceGrpc.getGetMethod) == null) {
      synchronized (PrivateConnectionServiceGrpc.class) {
        if ((getGetMethod = PrivateConnectionServiceGrpc.getGetMethod) == null) {
          PrivateConnectionServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.GetPrivateConnectionRequest, yandex.cloud.api.cic.v1.PrivateConnectionOuterClass.PrivateConnection>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.GetPrivateConnectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cic.v1.PrivateConnectionOuterClass.PrivateConnection.getDefaultInstance()))
              .setSchemaDescriptor(new PrivateConnectionServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.ListPrivateConnectionsRequest,
      yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.ListPrivateConnectionsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.ListPrivateConnectionsRequest.class,
      responseType = yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.ListPrivateConnectionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.ListPrivateConnectionsRequest,
      yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.ListPrivateConnectionsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.ListPrivateConnectionsRequest, yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.ListPrivateConnectionsResponse> getListMethod;
    if ((getListMethod = PrivateConnectionServiceGrpc.getListMethod) == null) {
      synchronized (PrivateConnectionServiceGrpc.class) {
        if ((getListMethod = PrivateConnectionServiceGrpc.getListMethod) == null) {
          PrivateConnectionServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.ListPrivateConnectionsRequest, yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.ListPrivateConnectionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.ListPrivateConnectionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.ListPrivateConnectionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PrivateConnectionServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PrivateConnectionServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PrivateConnectionServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PrivateConnectionServiceStub>() {
        @java.lang.Override
        public PrivateConnectionServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PrivateConnectionServiceStub(channel, callOptions);
        }
      };
    return PrivateConnectionServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PrivateConnectionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PrivateConnectionServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PrivateConnectionServiceBlockingStub>() {
        @java.lang.Override
        public PrivateConnectionServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PrivateConnectionServiceBlockingStub(channel, callOptions);
        }
      };
    return PrivateConnectionServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PrivateConnectionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PrivateConnectionServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PrivateConnectionServiceFutureStub>() {
        @java.lang.Override
        public PrivateConnectionServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PrivateConnectionServiceFutureStub(channel, callOptions);
        }
      };
    return PrivateConnectionServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing PrivateConnection resources.
   * </pre>
   */
  public static abstract class PrivateConnectionServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified PrivateConnection resource.
     * To get the list of available PrivateConnection resources, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.GetPrivateConnectionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cic.v1.PrivateConnectionOuterClass.PrivateConnection> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of PrivateConnection resources in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.ListPrivateConnectionsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.ListPrivateConnectionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.GetPrivateConnectionRequest,
                yandex.cloud.api.cic.v1.PrivateConnectionOuterClass.PrivateConnection>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.ListPrivateConnectionsRequest,
                yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.ListPrivateConnectionsResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing PrivateConnection resources.
   * </pre>
   */
  public static final class PrivateConnectionServiceStub extends io.grpc.stub.AbstractAsyncStub<PrivateConnectionServiceStub> {
    private PrivateConnectionServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PrivateConnectionServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PrivateConnectionServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified PrivateConnection resource.
     * To get the list of available PrivateConnection resources, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.GetPrivateConnectionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cic.v1.PrivateConnectionOuterClass.PrivateConnection> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of PrivateConnection resources in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.ListPrivateConnectionsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.ListPrivateConnectionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing PrivateConnection resources.
   * </pre>
   */
  public static final class PrivateConnectionServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<PrivateConnectionServiceBlockingStub> {
    private PrivateConnectionServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PrivateConnectionServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PrivateConnectionServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified PrivateConnection resource.
     * To get the list of available PrivateConnection resources, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.cic.v1.PrivateConnectionOuterClass.PrivateConnection get(yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.GetPrivateConnectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of PrivateConnection resources in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.ListPrivateConnectionsResponse list(yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.ListPrivateConnectionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing PrivateConnection resources.
   * </pre>
   */
  public static final class PrivateConnectionServiceFutureStub extends io.grpc.stub.AbstractFutureStub<PrivateConnectionServiceFutureStub> {
    private PrivateConnectionServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PrivateConnectionServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PrivateConnectionServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified PrivateConnection resource.
     * To get the list of available PrivateConnection resources, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.cic.v1.PrivateConnectionOuterClass.PrivateConnection> get(
        yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.GetPrivateConnectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of PrivateConnection resources in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.ListPrivateConnectionsResponse> list(
        yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.ListPrivateConnectionsRequest request) {
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
    private final PrivateConnectionServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PrivateConnectionServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.GetPrivateConnectionRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.cic.v1.PrivateConnectionOuterClass.PrivateConnection>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.ListPrivateConnectionsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.ListPrivateConnectionsResponse>) responseObserver);
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

  private static abstract class PrivateConnectionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PrivateConnectionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.cic.v1.PrivateConnectionServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PrivateConnectionService");
    }
  }

  private static final class PrivateConnectionServiceFileDescriptorSupplier
      extends PrivateConnectionServiceBaseDescriptorSupplier {
    PrivateConnectionServiceFileDescriptorSupplier() {}
  }

  private static final class PrivateConnectionServiceMethodDescriptorSupplier
      extends PrivateConnectionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PrivateConnectionServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PrivateConnectionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PrivateConnectionServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
