package yandex.cloud.api.loadtesting.agent.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/loadtesting/agent/v1/agent_registration_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AgentRegistrationServiceGrpc {

  private AgentRegistrationServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.loadtesting.agent.v1.AgentRegistrationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.loadtesting.agent.v1.AgentRegistrationServiceOuterClass.RegisterRequest,
      yandex.cloud.api.loadtesting.agent.v1.AgentRegistrationServiceOuterClass.RegisterResponse> getRegisterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Register",
      requestType = yandex.cloud.api.loadtesting.agent.v1.AgentRegistrationServiceOuterClass.RegisterRequest.class,
      responseType = yandex.cloud.api.loadtesting.agent.v1.AgentRegistrationServiceOuterClass.RegisterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.loadtesting.agent.v1.AgentRegistrationServiceOuterClass.RegisterRequest,
      yandex.cloud.api.loadtesting.agent.v1.AgentRegistrationServiceOuterClass.RegisterResponse> getRegisterMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.loadtesting.agent.v1.AgentRegistrationServiceOuterClass.RegisterRequest, yandex.cloud.api.loadtesting.agent.v1.AgentRegistrationServiceOuterClass.RegisterResponse> getRegisterMethod;
    if ((getRegisterMethod = AgentRegistrationServiceGrpc.getRegisterMethod) == null) {
      synchronized (AgentRegistrationServiceGrpc.class) {
        if ((getRegisterMethod = AgentRegistrationServiceGrpc.getRegisterMethod) == null) {
          AgentRegistrationServiceGrpc.getRegisterMethod = getRegisterMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.loadtesting.agent.v1.AgentRegistrationServiceOuterClass.RegisterRequest, yandex.cloud.api.loadtesting.agent.v1.AgentRegistrationServiceOuterClass.RegisterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Register"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.loadtesting.agent.v1.AgentRegistrationServiceOuterClass.RegisterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.loadtesting.agent.v1.AgentRegistrationServiceOuterClass.RegisterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AgentRegistrationServiceMethodDescriptorSupplier("Register"))
              .build();
        }
      }
    }
    return getRegisterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.loadtesting.agent.v1.AgentRegistrationServiceOuterClass.ExternalAgentRegisterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getExternalAgentRegisterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExternalAgentRegister",
      requestType = yandex.cloud.api.loadtesting.agent.v1.AgentRegistrationServiceOuterClass.ExternalAgentRegisterRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.loadtesting.agent.v1.AgentRegistrationServiceOuterClass.ExternalAgentRegisterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getExternalAgentRegisterMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.loadtesting.agent.v1.AgentRegistrationServiceOuterClass.ExternalAgentRegisterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getExternalAgentRegisterMethod;
    if ((getExternalAgentRegisterMethod = AgentRegistrationServiceGrpc.getExternalAgentRegisterMethod) == null) {
      synchronized (AgentRegistrationServiceGrpc.class) {
        if ((getExternalAgentRegisterMethod = AgentRegistrationServiceGrpc.getExternalAgentRegisterMethod) == null) {
          AgentRegistrationServiceGrpc.getExternalAgentRegisterMethod = getExternalAgentRegisterMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.loadtesting.agent.v1.AgentRegistrationServiceOuterClass.ExternalAgentRegisterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExternalAgentRegister"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.loadtesting.agent.v1.AgentRegistrationServiceOuterClass.ExternalAgentRegisterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new AgentRegistrationServiceMethodDescriptorSupplier("ExternalAgentRegister"))
              .build();
        }
      }
    }
    return getExternalAgentRegisterMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AgentRegistrationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AgentRegistrationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AgentRegistrationServiceStub>() {
        @java.lang.Override
        public AgentRegistrationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AgentRegistrationServiceStub(channel, callOptions);
        }
      };
    return AgentRegistrationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AgentRegistrationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AgentRegistrationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AgentRegistrationServiceBlockingStub>() {
        @java.lang.Override
        public AgentRegistrationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AgentRegistrationServiceBlockingStub(channel, callOptions);
        }
      };
    return AgentRegistrationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AgentRegistrationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AgentRegistrationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AgentRegistrationServiceFutureStub>() {
        @java.lang.Override
        public AgentRegistrationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AgentRegistrationServiceFutureStub(channel, callOptions);
        }
      };
    return AgentRegistrationServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class AgentRegistrationServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Registers specified agent.
     * </pre>
     */
    public void register(yandex.cloud.api.loadtesting.agent.v1.AgentRegistrationServiceOuterClass.RegisterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.loadtesting.agent.v1.AgentRegistrationServiceOuterClass.RegisterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterMethod(), responseObserver);
    }

    /**
     * <pre>
     * Registers external agent.
     * </pre>
     */
    public void externalAgentRegister(yandex.cloud.api.loadtesting.agent.v1.AgentRegistrationServiceOuterClass.ExternalAgentRegisterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExternalAgentRegisterMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegisterMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.loadtesting.agent.v1.AgentRegistrationServiceOuterClass.RegisterRequest,
                yandex.cloud.api.loadtesting.agent.v1.AgentRegistrationServiceOuterClass.RegisterResponse>(
                  this, METHODID_REGISTER)))
          .addMethod(
            getExternalAgentRegisterMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.loadtesting.agent.v1.AgentRegistrationServiceOuterClass.ExternalAgentRegisterRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_EXTERNAL_AGENT_REGISTER)))
          .build();
    }
  }

  /**
   */
  public static final class AgentRegistrationServiceStub extends io.grpc.stub.AbstractAsyncStub<AgentRegistrationServiceStub> {
    private AgentRegistrationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AgentRegistrationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AgentRegistrationServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Registers specified agent.
     * </pre>
     */
    public void register(yandex.cloud.api.loadtesting.agent.v1.AgentRegistrationServiceOuterClass.RegisterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.loadtesting.agent.v1.AgentRegistrationServiceOuterClass.RegisterResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Registers external agent.
     * </pre>
     */
    public void externalAgentRegister(yandex.cloud.api.loadtesting.agent.v1.AgentRegistrationServiceOuterClass.ExternalAgentRegisterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExternalAgentRegisterMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AgentRegistrationServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AgentRegistrationServiceBlockingStub> {
    private AgentRegistrationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AgentRegistrationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AgentRegistrationServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Registers specified agent.
     * </pre>
     */
    public yandex.cloud.api.loadtesting.agent.v1.AgentRegistrationServiceOuterClass.RegisterResponse register(yandex.cloud.api.loadtesting.agent.v1.AgentRegistrationServiceOuterClass.RegisterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Registers external agent.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation externalAgentRegister(yandex.cloud.api.loadtesting.agent.v1.AgentRegistrationServiceOuterClass.ExternalAgentRegisterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExternalAgentRegisterMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AgentRegistrationServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AgentRegistrationServiceFutureStub> {
    private AgentRegistrationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AgentRegistrationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AgentRegistrationServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Registers specified agent.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.loadtesting.agent.v1.AgentRegistrationServiceOuterClass.RegisterResponse> register(
        yandex.cloud.api.loadtesting.agent.v1.AgentRegistrationServiceOuterClass.RegisterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Registers external agent.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> externalAgentRegister(
        yandex.cloud.api.loadtesting.agent.v1.AgentRegistrationServiceOuterClass.ExternalAgentRegisterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExternalAgentRegisterMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER = 0;
  private static final int METHODID_EXTERNAL_AGENT_REGISTER = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AgentRegistrationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AgentRegistrationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER:
          serviceImpl.register((yandex.cloud.api.loadtesting.agent.v1.AgentRegistrationServiceOuterClass.RegisterRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.loadtesting.agent.v1.AgentRegistrationServiceOuterClass.RegisterResponse>) responseObserver);
          break;
        case METHODID_EXTERNAL_AGENT_REGISTER:
          serviceImpl.externalAgentRegister((yandex.cloud.api.loadtesting.agent.v1.AgentRegistrationServiceOuterClass.ExternalAgentRegisterRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
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

  private static abstract class AgentRegistrationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AgentRegistrationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.loadtesting.agent.v1.AgentRegistrationServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AgentRegistrationService");
    }
  }

  private static final class AgentRegistrationServiceFileDescriptorSupplier
      extends AgentRegistrationServiceBaseDescriptorSupplier {
    AgentRegistrationServiceFileDescriptorSupplier() {}
  }

  private static final class AgentRegistrationServiceMethodDescriptorSupplier
      extends AgentRegistrationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AgentRegistrationServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AgentRegistrationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AgentRegistrationServiceFileDescriptorSupplier())
              .addMethod(getRegisterMethod())
              .addMethod(getExternalAgentRegisterMethod())
              .build();
        }
      }
    }
    return result;
  }
}
