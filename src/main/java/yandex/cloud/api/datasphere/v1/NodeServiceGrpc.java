package yandex.cloud.api.datasphere.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing Node resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/datasphere/v1/node_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class NodeServiceGrpc {

  private NodeServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.datasphere.v1.NodeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v1.NodeServiceOuterClass.NodeExecutionRequest,
      yandex.cloud.api.datasphere.v1.NodeServiceOuterClass.NodeExecutionResponse> getExecuteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Execute",
      requestType = yandex.cloud.api.datasphere.v1.NodeServiceOuterClass.NodeExecutionRequest.class,
      responseType = yandex.cloud.api.datasphere.v1.NodeServiceOuterClass.NodeExecutionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v1.NodeServiceOuterClass.NodeExecutionRequest,
      yandex.cloud.api.datasphere.v1.NodeServiceOuterClass.NodeExecutionResponse> getExecuteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v1.NodeServiceOuterClass.NodeExecutionRequest, yandex.cloud.api.datasphere.v1.NodeServiceOuterClass.NodeExecutionResponse> getExecuteMethod;
    if ((getExecuteMethod = NodeServiceGrpc.getExecuteMethod) == null) {
      synchronized (NodeServiceGrpc.class) {
        if ((getExecuteMethod = NodeServiceGrpc.getExecuteMethod) == null) {
          NodeServiceGrpc.getExecuteMethod = getExecuteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.datasphere.v1.NodeServiceOuterClass.NodeExecutionRequest, yandex.cloud.api.datasphere.v1.NodeServiceOuterClass.NodeExecutionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Execute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datasphere.v1.NodeServiceOuterClass.NodeExecutionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datasphere.v1.NodeServiceOuterClass.NodeExecutionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NodeServiceMethodDescriptorSupplier("Execute"))
              .build();
        }
      }
    }
    return getExecuteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v1.NodeServiceOuterClass.AliasExecutionRequest,
      yandex.cloud.api.datasphere.v1.NodeServiceOuterClass.AliasExecutionResponse> getExecuteAliasMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExecuteAlias",
      requestType = yandex.cloud.api.datasphere.v1.NodeServiceOuterClass.AliasExecutionRequest.class,
      responseType = yandex.cloud.api.datasphere.v1.NodeServiceOuterClass.AliasExecutionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v1.NodeServiceOuterClass.AliasExecutionRequest,
      yandex.cloud.api.datasphere.v1.NodeServiceOuterClass.AliasExecutionResponse> getExecuteAliasMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v1.NodeServiceOuterClass.AliasExecutionRequest, yandex.cloud.api.datasphere.v1.NodeServiceOuterClass.AliasExecutionResponse> getExecuteAliasMethod;
    if ((getExecuteAliasMethod = NodeServiceGrpc.getExecuteAliasMethod) == null) {
      synchronized (NodeServiceGrpc.class) {
        if ((getExecuteAliasMethod = NodeServiceGrpc.getExecuteAliasMethod) == null) {
          NodeServiceGrpc.getExecuteAliasMethod = getExecuteAliasMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.datasphere.v1.NodeServiceOuterClass.AliasExecutionRequest, yandex.cloud.api.datasphere.v1.NodeServiceOuterClass.AliasExecutionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExecuteAlias"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datasphere.v1.NodeServiceOuterClass.AliasExecutionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datasphere.v1.NodeServiceOuterClass.AliasExecutionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NodeServiceMethodDescriptorSupplier("ExecuteAlias"))
              .build();
        }
      }
    }
    return getExecuteAliasMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NodeServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NodeServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NodeServiceStub>() {
        @java.lang.Override
        public NodeServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NodeServiceStub(channel, callOptions);
        }
      };
    return NodeServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NodeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NodeServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NodeServiceBlockingStub>() {
        @java.lang.Override
        public NodeServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NodeServiceBlockingStub(channel, callOptions);
        }
      };
    return NodeServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NodeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NodeServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NodeServiceFutureStub>() {
        @java.lang.Override
        public NodeServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NodeServiceFutureStub(channel, callOptions);
        }
      };
    return NodeServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing Node resources.
   * </pre>
   */
  public static abstract class NodeServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Executes deployed Node.
     * </pre>
     */
    public void execute(yandex.cloud.api.datasphere.v1.NodeServiceOuterClass.NodeExecutionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.datasphere.v1.NodeServiceOuterClass.NodeExecutionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExecuteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Executes NodeAlias requests.
     * </pre>
     */
    public void executeAlias(yandex.cloud.api.datasphere.v1.NodeServiceOuterClass.AliasExecutionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.datasphere.v1.NodeServiceOuterClass.AliasExecutionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExecuteAliasMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getExecuteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.datasphere.v1.NodeServiceOuterClass.NodeExecutionRequest,
                yandex.cloud.api.datasphere.v1.NodeServiceOuterClass.NodeExecutionResponse>(
                  this, METHODID_EXECUTE)))
          .addMethod(
            getExecuteAliasMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.datasphere.v1.NodeServiceOuterClass.AliasExecutionRequest,
                yandex.cloud.api.datasphere.v1.NodeServiceOuterClass.AliasExecutionResponse>(
                  this, METHODID_EXECUTE_ALIAS)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing Node resources.
   * </pre>
   */
  public static final class NodeServiceStub extends io.grpc.stub.AbstractAsyncStub<NodeServiceStub> {
    private NodeServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NodeServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NodeServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Executes deployed Node.
     * </pre>
     */
    public void execute(yandex.cloud.api.datasphere.v1.NodeServiceOuterClass.NodeExecutionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.datasphere.v1.NodeServiceOuterClass.NodeExecutionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExecuteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Executes NodeAlias requests.
     * </pre>
     */
    public void executeAlias(yandex.cloud.api.datasphere.v1.NodeServiceOuterClass.AliasExecutionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.datasphere.v1.NodeServiceOuterClass.AliasExecutionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExecuteAliasMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Node resources.
   * </pre>
   */
  public static final class NodeServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<NodeServiceBlockingStub> {
    private NodeServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NodeServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NodeServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Executes deployed Node.
     * </pre>
     */
    public yandex.cloud.api.datasphere.v1.NodeServiceOuterClass.NodeExecutionResponse execute(yandex.cloud.api.datasphere.v1.NodeServiceOuterClass.NodeExecutionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExecuteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Executes NodeAlias requests.
     * </pre>
     */
    public yandex.cloud.api.datasphere.v1.NodeServiceOuterClass.AliasExecutionResponse executeAlias(yandex.cloud.api.datasphere.v1.NodeServiceOuterClass.AliasExecutionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExecuteAliasMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Node resources.
   * </pre>
   */
  public static final class NodeServiceFutureStub extends io.grpc.stub.AbstractFutureStub<NodeServiceFutureStub> {
    private NodeServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NodeServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NodeServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Executes deployed Node.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.datasphere.v1.NodeServiceOuterClass.NodeExecutionResponse> execute(
        yandex.cloud.api.datasphere.v1.NodeServiceOuterClass.NodeExecutionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExecuteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Executes NodeAlias requests.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.datasphere.v1.NodeServiceOuterClass.AliasExecutionResponse> executeAlias(
        yandex.cloud.api.datasphere.v1.NodeServiceOuterClass.AliasExecutionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExecuteAliasMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_EXECUTE = 0;
  private static final int METHODID_EXECUTE_ALIAS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NodeServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(NodeServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_EXECUTE:
          serviceImpl.execute((yandex.cloud.api.datasphere.v1.NodeServiceOuterClass.NodeExecutionRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.datasphere.v1.NodeServiceOuterClass.NodeExecutionResponse>) responseObserver);
          break;
        case METHODID_EXECUTE_ALIAS:
          serviceImpl.executeAlias((yandex.cloud.api.datasphere.v1.NodeServiceOuterClass.AliasExecutionRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.datasphere.v1.NodeServiceOuterClass.AliasExecutionResponse>) responseObserver);
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

  private static abstract class NodeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NodeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.datasphere.v1.NodeServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("NodeService");
    }
  }

  private static final class NodeServiceFileDescriptorSupplier
      extends NodeServiceBaseDescriptorSupplier {
    NodeServiceFileDescriptorSupplier() {}
  }

  private static final class NodeServiceMethodDescriptorSupplier
      extends NodeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    NodeServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (NodeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NodeServiceFileDescriptorSupplier())
              .addMethod(getExecuteMethod())
              .addMethod(getExecuteAliasMethod())
              .build();
        }
      }
    }
    return result;
  }
}
