package yandex.cloud.api.cic.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing PublicConnection resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/cic/v1/public_connection_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PublicConnectionServiceGrpc {

  private PublicConnectionServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.cic.v1.PublicConnectionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cic.v1.PublicConnectionServiceOuterClass.GetPublicConnectionRequest,
      yandex.cloud.api.cic.v1.PublicConnectionOuterClass.PublicConnection> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.cic.v1.PublicConnectionServiceOuterClass.GetPublicConnectionRequest.class,
      responseType = yandex.cloud.api.cic.v1.PublicConnectionOuterClass.PublicConnection.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cic.v1.PublicConnectionServiceOuterClass.GetPublicConnectionRequest,
      yandex.cloud.api.cic.v1.PublicConnectionOuterClass.PublicConnection> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cic.v1.PublicConnectionServiceOuterClass.GetPublicConnectionRequest, yandex.cloud.api.cic.v1.PublicConnectionOuterClass.PublicConnection> getGetMethod;
    if ((getGetMethod = PublicConnectionServiceGrpc.getGetMethod) == null) {
      synchronized (PublicConnectionServiceGrpc.class) {
        if ((getGetMethod = PublicConnectionServiceGrpc.getGetMethod) == null) {
          PublicConnectionServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cic.v1.PublicConnectionServiceOuterClass.GetPublicConnectionRequest, yandex.cloud.api.cic.v1.PublicConnectionOuterClass.PublicConnection>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cic.v1.PublicConnectionServiceOuterClass.GetPublicConnectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cic.v1.PublicConnectionOuterClass.PublicConnection.getDefaultInstance()))
              .setSchemaDescriptor(new PublicConnectionServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cic.v1.PublicConnectionServiceOuterClass.ListPublicConnectionsRequest,
      yandex.cloud.api.cic.v1.PublicConnectionServiceOuterClass.ListPublicConnectionsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.cic.v1.PublicConnectionServiceOuterClass.ListPublicConnectionsRequest.class,
      responseType = yandex.cloud.api.cic.v1.PublicConnectionServiceOuterClass.ListPublicConnectionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cic.v1.PublicConnectionServiceOuterClass.ListPublicConnectionsRequest,
      yandex.cloud.api.cic.v1.PublicConnectionServiceOuterClass.ListPublicConnectionsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cic.v1.PublicConnectionServiceOuterClass.ListPublicConnectionsRequest, yandex.cloud.api.cic.v1.PublicConnectionServiceOuterClass.ListPublicConnectionsResponse> getListMethod;
    if ((getListMethod = PublicConnectionServiceGrpc.getListMethod) == null) {
      synchronized (PublicConnectionServiceGrpc.class) {
        if ((getListMethod = PublicConnectionServiceGrpc.getListMethod) == null) {
          PublicConnectionServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cic.v1.PublicConnectionServiceOuterClass.ListPublicConnectionsRequest, yandex.cloud.api.cic.v1.PublicConnectionServiceOuterClass.ListPublicConnectionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cic.v1.PublicConnectionServiceOuterClass.ListPublicConnectionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cic.v1.PublicConnectionServiceOuterClass.ListPublicConnectionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PublicConnectionServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PublicConnectionServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PublicConnectionServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PublicConnectionServiceStub>() {
        @java.lang.Override
        public PublicConnectionServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PublicConnectionServiceStub(channel, callOptions);
        }
      };
    return PublicConnectionServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PublicConnectionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PublicConnectionServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PublicConnectionServiceBlockingStub>() {
        @java.lang.Override
        public PublicConnectionServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PublicConnectionServiceBlockingStub(channel, callOptions);
        }
      };
    return PublicConnectionServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PublicConnectionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PublicConnectionServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PublicConnectionServiceFutureStub>() {
        @java.lang.Override
        public PublicConnectionServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PublicConnectionServiceFutureStub(channel, callOptions);
        }
      };
    return PublicConnectionServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing PublicConnection resources.
   * </pre>
   */
  public static abstract class PublicConnectionServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified PublicConnection resource.
     * To get the list of available PublicConnection resources, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.cic.v1.PublicConnectionServiceOuterClass.GetPublicConnectionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cic.v1.PublicConnectionOuterClass.PublicConnection> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of PublicConnection resources in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.cic.v1.PublicConnectionServiceOuterClass.ListPublicConnectionsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cic.v1.PublicConnectionServiceOuterClass.ListPublicConnectionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cic.v1.PublicConnectionServiceOuterClass.GetPublicConnectionRequest,
                yandex.cloud.api.cic.v1.PublicConnectionOuterClass.PublicConnection>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cic.v1.PublicConnectionServiceOuterClass.ListPublicConnectionsRequest,
                yandex.cloud.api.cic.v1.PublicConnectionServiceOuterClass.ListPublicConnectionsResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing PublicConnection resources.
   * </pre>
   */
  public static final class PublicConnectionServiceStub extends io.grpc.stub.AbstractAsyncStub<PublicConnectionServiceStub> {
    private PublicConnectionServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PublicConnectionServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PublicConnectionServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified PublicConnection resource.
     * To get the list of available PublicConnection resources, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.cic.v1.PublicConnectionServiceOuterClass.GetPublicConnectionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cic.v1.PublicConnectionOuterClass.PublicConnection> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of PublicConnection resources in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.cic.v1.PublicConnectionServiceOuterClass.ListPublicConnectionsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cic.v1.PublicConnectionServiceOuterClass.ListPublicConnectionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing PublicConnection resources.
   * </pre>
   */
  public static final class PublicConnectionServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<PublicConnectionServiceBlockingStub> {
    private PublicConnectionServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PublicConnectionServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PublicConnectionServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified PublicConnection resource.
     * To get the list of available PublicConnection resources, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.cic.v1.PublicConnectionOuterClass.PublicConnection get(yandex.cloud.api.cic.v1.PublicConnectionServiceOuterClass.GetPublicConnectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of PublicConnection resources in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.cic.v1.PublicConnectionServiceOuterClass.ListPublicConnectionsResponse list(yandex.cloud.api.cic.v1.PublicConnectionServiceOuterClass.ListPublicConnectionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing PublicConnection resources.
   * </pre>
   */
  public static final class PublicConnectionServiceFutureStub extends io.grpc.stub.AbstractFutureStub<PublicConnectionServiceFutureStub> {
    private PublicConnectionServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PublicConnectionServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PublicConnectionServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified PublicConnection resource.
     * To get the list of available PublicConnection resources, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.cic.v1.PublicConnectionOuterClass.PublicConnection> get(
        yandex.cloud.api.cic.v1.PublicConnectionServiceOuterClass.GetPublicConnectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of PublicConnection resources in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.cic.v1.PublicConnectionServiceOuterClass.ListPublicConnectionsResponse> list(
        yandex.cloud.api.cic.v1.PublicConnectionServiceOuterClass.ListPublicConnectionsRequest request) {
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
    private final PublicConnectionServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PublicConnectionServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.cic.v1.PublicConnectionServiceOuterClass.GetPublicConnectionRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.cic.v1.PublicConnectionOuterClass.PublicConnection>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.cic.v1.PublicConnectionServiceOuterClass.ListPublicConnectionsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.cic.v1.PublicConnectionServiceOuterClass.ListPublicConnectionsResponse>) responseObserver);
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

  private static abstract class PublicConnectionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PublicConnectionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.cic.v1.PublicConnectionServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PublicConnectionService");
    }
  }

  private static final class PublicConnectionServiceFileDescriptorSupplier
      extends PublicConnectionServiceBaseDescriptorSupplier {
    PublicConnectionServiceFileDescriptorSupplier() {}
  }

  private static final class PublicConnectionServiceMethodDescriptorSupplier
      extends PublicConnectionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PublicConnectionServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PublicConnectionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PublicConnectionServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
