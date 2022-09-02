package yandex.cloud.api.serverless.apigateway.websocket.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing API Gateway WebSocket connections.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/serverless/apigateway/websocket/v1/connection_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ConnectionServiceGrpc {

  private ConnectionServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.serverless.apigateway.websocket.v1.ConnectionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.serverless.apigateway.websocket.v1.ConnectionServiceOuterClass.GetConnectionRequest,
      yandex.cloud.api.serverless.apigateway.websocket.v1.ConnectionOuterClass.Connection> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.serverless.apigateway.websocket.v1.ConnectionServiceOuterClass.GetConnectionRequest.class,
      responseType = yandex.cloud.api.serverless.apigateway.websocket.v1.ConnectionOuterClass.Connection.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.serverless.apigateway.websocket.v1.ConnectionServiceOuterClass.GetConnectionRequest,
      yandex.cloud.api.serverless.apigateway.websocket.v1.ConnectionOuterClass.Connection> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.serverless.apigateway.websocket.v1.ConnectionServiceOuterClass.GetConnectionRequest, yandex.cloud.api.serverless.apigateway.websocket.v1.ConnectionOuterClass.Connection> getGetMethod;
    if ((getGetMethod = ConnectionServiceGrpc.getGetMethod) == null) {
      synchronized (ConnectionServiceGrpc.class) {
        if ((getGetMethod = ConnectionServiceGrpc.getGetMethod) == null) {
          ConnectionServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.serverless.apigateway.websocket.v1.ConnectionServiceOuterClass.GetConnectionRequest, yandex.cloud.api.serverless.apigateway.websocket.v1.ConnectionOuterClass.Connection>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.apigateway.websocket.v1.ConnectionServiceOuterClass.GetConnectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.apigateway.websocket.v1.ConnectionOuterClass.Connection.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectionServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.serverless.apigateway.websocket.v1.ConnectionServiceOuterClass.SendToConnectionRequest,
      yandex.cloud.api.serverless.apigateway.websocket.v1.ConnectionServiceOuterClass.SendToConnectionResponse> getSendMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Send",
      requestType = yandex.cloud.api.serverless.apigateway.websocket.v1.ConnectionServiceOuterClass.SendToConnectionRequest.class,
      responseType = yandex.cloud.api.serverless.apigateway.websocket.v1.ConnectionServiceOuterClass.SendToConnectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.serverless.apigateway.websocket.v1.ConnectionServiceOuterClass.SendToConnectionRequest,
      yandex.cloud.api.serverless.apigateway.websocket.v1.ConnectionServiceOuterClass.SendToConnectionResponse> getSendMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.serverless.apigateway.websocket.v1.ConnectionServiceOuterClass.SendToConnectionRequest, yandex.cloud.api.serverless.apigateway.websocket.v1.ConnectionServiceOuterClass.SendToConnectionResponse> getSendMethod;
    if ((getSendMethod = ConnectionServiceGrpc.getSendMethod) == null) {
      synchronized (ConnectionServiceGrpc.class) {
        if ((getSendMethod = ConnectionServiceGrpc.getSendMethod) == null) {
          ConnectionServiceGrpc.getSendMethod = getSendMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.serverless.apigateway.websocket.v1.ConnectionServiceOuterClass.SendToConnectionRequest, yandex.cloud.api.serverless.apigateway.websocket.v1.ConnectionServiceOuterClass.SendToConnectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Send"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.apigateway.websocket.v1.ConnectionServiceOuterClass.SendToConnectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.apigateway.websocket.v1.ConnectionServiceOuterClass.SendToConnectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectionServiceMethodDescriptorSupplier("Send"))
              .build();
        }
      }
    }
    return getSendMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.serverless.apigateway.websocket.v1.ConnectionServiceOuterClass.DisconnectRequest,
      yandex.cloud.api.serverless.apigateway.websocket.v1.ConnectionServiceOuterClass.DisconnectResponse> getDisconnectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Disconnect",
      requestType = yandex.cloud.api.serverless.apigateway.websocket.v1.ConnectionServiceOuterClass.DisconnectRequest.class,
      responseType = yandex.cloud.api.serverless.apigateway.websocket.v1.ConnectionServiceOuterClass.DisconnectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.serverless.apigateway.websocket.v1.ConnectionServiceOuterClass.DisconnectRequest,
      yandex.cloud.api.serverless.apigateway.websocket.v1.ConnectionServiceOuterClass.DisconnectResponse> getDisconnectMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.serverless.apigateway.websocket.v1.ConnectionServiceOuterClass.DisconnectRequest, yandex.cloud.api.serverless.apigateway.websocket.v1.ConnectionServiceOuterClass.DisconnectResponse> getDisconnectMethod;
    if ((getDisconnectMethod = ConnectionServiceGrpc.getDisconnectMethod) == null) {
      synchronized (ConnectionServiceGrpc.class) {
        if ((getDisconnectMethod = ConnectionServiceGrpc.getDisconnectMethod) == null) {
          ConnectionServiceGrpc.getDisconnectMethod = getDisconnectMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.serverless.apigateway.websocket.v1.ConnectionServiceOuterClass.DisconnectRequest, yandex.cloud.api.serverless.apigateway.websocket.v1.ConnectionServiceOuterClass.DisconnectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Disconnect"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.apigateway.websocket.v1.ConnectionServiceOuterClass.DisconnectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.apigateway.websocket.v1.ConnectionServiceOuterClass.DisconnectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectionServiceMethodDescriptorSupplier("Disconnect"))
              .build();
        }
      }
    }
    return getDisconnectMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ConnectionServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConnectionServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConnectionServiceStub>() {
        @java.lang.Override
        public ConnectionServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConnectionServiceStub(channel, callOptions);
        }
      };
    return ConnectionServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ConnectionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConnectionServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConnectionServiceBlockingStub>() {
        @java.lang.Override
        public ConnectionServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConnectionServiceBlockingStub(channel, callOptions);
        }
      };
    return ConnectionServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ConnectionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConnectionServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConnectionServiceFutureStub>() {
        @java.lang.Override
        public ConnectionServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConnectionServiceFutureStub(channel, callOptions);
        }
      };
    return ConnectionServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing API Gateway WebSocket connections.
   * </pre>
   */
  public static abstract class ConnectionServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified connection info.
     * </pre>
     */
    public void get(yandex.cloud.api.serverless.apigateway.websocket.v1.ConnectionServiceOuterClass.GetConnectionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.apigateway.websocket.v1.ConnectionOuterClass.Connection> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sends data to the specified connection.
     * </pre>
     */
    public void send(yandex.cloud.api.serverless.apigateway.websocket.v1.ConnectionServiceOuterClass.SendToConnectionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.apigateway.websocket.v1.ConnectionServiceOuterClass.SendToConnectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendMethod(), responseObserver);
    }

    /**
     * <pre>
     * Disconnects the specified connection.
     * </pre>
     */
    public void disconnect(yandex.cloud.api.serverless.apigateway.websocket.v1.ConnectionServiceOuterClass.DisconnectRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.apigateway.websocket.v1.ConnectionServiceOuterClass.DisconnectResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDisconnectMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.apigateway.websocket.v1.ConnectionServiceOuterClass.GetConnectionRequest,
                yandex.cloud.api.serverless.apigateway.websocket.v1.ConnectionOuterClass.Connection>(
                  this, METHODID_GET)))
          .addMethod(
            getSendMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.apigateway.websocket.v1.ConnectionServiceOuterClass.SendToConnectionRequest,
                yandex.cloud.api.serverless.apigateway.websocket.v1.ConnectionServiceOuterClass.SendToConnectionResponse>(
                  this, METHODID_SEND)))
          .addMethod(
            getDisconnectMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.apigateway.websocket.v1.ConnectionServiceOuterClass.DisconnectRequest,
                yandex.cloud.api.serverless.apigateway.websocket.v1.ConnectionServiceOuterClass.DisconnectResponse>(
                  this, METHODID_DISCONNECT)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing API Gateway WebSocket connections.
   * </pre>
   */
  public static final class ConnectionServiceStub extends io.grpc.stub.AbstractAsyncStub<ConnectionServiceStub> {
    private ConnectionServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConnectionServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConnectionServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified connection info.
     * </pre>
     */
    public void get(yandex.cloud.api.serverless.apigateway.websocket.v1.ConnectionServiceOuterClass.GetConnectionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.apigateway.websocket.v1.ConnectionOuterClass.Connection> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sends data to the specified connection.
     * </pre>
     */
    public void send(yandex.cloud.api.serverless.apigateway.websocket.v1.ConnectionServiceOuterClass.SendToConnectionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.apigateway.websocket.v1.ConnectionServiceOuterClass.SendToConnectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Disconnects the specified connection.
     * </pre>
     */
    public void disconnect(yandex.cloud.api.serverless.apigateway.websocket.v1.ConnectionServiceOuterClass.DisconnectRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.apigateway.websocket.v1.ConnectionServiceOuterClass.DisconnectResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDisconnectMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing API Gateway WebSocket connections.
   * </pre>
   */
  public static final class ConnectionServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ConnectionServiceBlockingStub> {
    private ConnectionServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConnectionServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConnectionServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified connection info.
     * </pre>
     */
    public yandex.cloud.api.serverless.apigateway.websocket.v1.ConnectionOuterClass.Connection get(yandex.cloud.api.serverless.apigateway.websocket.v1.ConnectionServiceOuterClass.GetConnectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sends data to the specified connection.
     * </pre>
     */
    public yandex.cloud.api.serverless.apigateway.websocket.v1.ConnectionServiceOuterClass.SendToConnectionResponse send(yandex.cloud.api.serverless.apigateway.websocket.v1.ConnectionServiceOuterClass.SendToConnectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Disconnects the specified connection.
     * </pre>
     */
    public yandex.cloud.api.serverless.apigateway.websocket.v1.ConnectionServiceOuterClass.DisconnectResponse disconnect(yandex.cloud.api.serverless.apigateway.websocket.v1.ConnectionServiceOuterClass.DisconnectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDisconnectMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing API Gateway WebSocket connections.
   * </pre>
   */
  public static final class ConnectionServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ConnectionServiceFutureStub> {
    private ConnectionServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConnectionServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConnectionServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified connection info.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.serverless.apigateway.websocket.v1.ConnectionOuterClass.Connection> get(
        yandex.cloud.api.serverless.apigateway.websocket.v1.ConnectionServiceOuterClass.GetConnectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sends data to the specified connection.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.serverless.apigateway.websocket.v1.ConnectionServiceOuterClass.SendToConnectionResponse> send(
        yandex.cloud.api.serverless.apigateway.websocket.v1.ConnectionServiceOuterClass.SendToConnectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Disconnects the specified connection.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.serverless.apigateway.websocket.v1.ConnectionServiceOuterClass.DisconnectResponse> disconnect(
        yandex.cloud.api.serverless.apigateway.websocket.v1.ConnectionServiceOuterClass.DisconnectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDisconnectMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_SEND = 1;
  private static final int METHODID_DISCONNECT = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ConnectionServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ConnectionServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.serverless.apigateway.websocket.v1.ConnectionServiceOuterClass.GetConnectionRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.apigateway.websocket.v1.ConnectionOuterClass.Connection>) responseObserver);
          break;
        case METHODID_SEND:
          serviceImpl.send((yandex.cloud.api.serverless.apigateway.websocket.v1.ConnectionServiceOuterClass.SendToConnectionRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.apigateway.websocket.v1.ConnectionServiceOuterClass.SendToConnectionResponse>) responseObserver);
          break;
        case METHODID_DISCONNECT:
          serviceImpl.disconnect((yandex.cloud.api.serverless.apigateway.websocket.v1.ConnectionServiceOuterClass.DisconnectRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.apigateway.websocket.v1.ConnectionServiceOuterClass.DisconnectResponse>) responseObserver);
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

  private static abstract class ConnectionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ConnectionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.serverless.apigateway.websocket.v1.ConnectionServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ConnectionService");
    }
  }

  private static final class ConnectionServiceFileDescriptorSupplier
      extends ConnectionServiceBaseDescriptorSupplier {
    ConnectionServiceFileDescriptorSupplier() {}
  }

  private static final class ConnectionServiceMethodDescriptorSupplier
      extends ConnectionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ConnectionServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ConnectionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ConnectionServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getSendMethod())
              .addMethod(getDisconnectMethod())
              .build();
        }
      }
    }
    return result;
  }
}
