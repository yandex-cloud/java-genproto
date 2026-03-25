package yandex.cloud.api.backup.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/backup/v1/setup_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SetupServiceGrpc {

  private SetupServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.backup.v1.SetupService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.backup.v1.SetupServiceOuterClass.GetAgentInstallCommandRequest,
      yandex.cloud.api.backup.v1.SetupServiceOuterClass.GetAgentInstallCommandResponse> getGetAgentInstallCommandMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAgentInstallCommand",
      requestType = yandex.cloud.api.backup.v1.SetupServiceOuterClass.GetAgentInstallCommandRequest.class,
      responseType = yandex.cloud.api.backup.v1.SetupServiceOuterClass.GetAgentInstallCommandResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.backup.v1.SetupServiceOuterClass.GetAgentInstallCommandRequest,
      yandex.cloud.api.backup.v1.SetupServiceOuterClass.GetAgentInstallCommandResponse> getGetAgentInstallCommandMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.backup.v1.SetupServiceOuterClass.GetAgentInstallCommandRequest, yandex.cloud.api.backup.v1.SetupServiceOuterClass.GetAgentInstallCommandResponse> getGetAgentInstallCommandMethod;
    if ((getGetAgentInstallCommandMethod = SetupServiceGrpc.getGetAgentInstallCommandMethod) == null) {
      synchronized (SetupServiceGrpc.class) {
        if ((getGetAgentInstallCommandMethod = SetupServiceGrpc.getGetAgentInstallCommandMethod) == null) {
          SetupServiceGrpc.getGetAgentInstallCommandMethod = getGetAgentInstallCommandMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.backup.v1.SetupServiceOuterClass.GetAgentInstallCommandRequest, yandex.cloud.api.backup.v1.SetupServiceOuterClass.GetAgentInstallCommandResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAgentInstallCommand"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.backup.v1.SetupServiceOuterClass.GetAgentInstallCommandRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.backup.v1.SetupServiceOuterClass.GetAgentInstallCommandResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SetupServiceMethodDescriptorSupplier("GetAgentInstallCommand"))
              .build();
        }
      }
    }
    return getGetAgentInstallCommandMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SetupServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SetupServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SetupServiceStub>() {
        @java.lang.Override
        public SetupServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SetupServiceStub(channel, callOptions);
        }
      };
    return SetupServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SetupServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SetupServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SetupServiceBlockingStub>() {
        @java.lang.Override
        public SetupServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SetupServiceBlockingStub(channel, callOptions);
        }
      };
    return SetupServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SetupServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SetupServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SetupServiceFutureStub>() {
        @java.lang.Override
        public SetupServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SetupServiceFutureStub(channel, callOptions);
        }
      };
    return SetupServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SetupServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAgentInstallCommand(yandex.cloud.api.backup.v1.SetupServiceOuterClass.GetAgentInstallCommandRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.backup.v1.SetupServiceOuterClass.GetAgentInstallCommandResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAgentInstallCommandMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAgentInstallCommandMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.backup.v1.SetupServiceOuterClass.GetAgentInstallCommandRequest,
                yandex.cloud.api.backup.v1.SetupServiceOuterClass.GetAgentInstallCommandResponse>(
                  this, METHODID_GET_AGENT_INSTALL_COMMAND)))
          .build();
    }
  }

  /**
   */
  public static final class SetupServiceStub extends io.grpc.stub.AbstractAsyncStub<SetupServiceStub> {
    private SetupServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SetupServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SetupServiceStub(channel, callOptions);
    }

    /**
     */
    public void getAgentInstallCommand(yandex.cloud.api.backup.v1.SetupServiceOuterClass.GetAgentInstallCommandRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.backup.v1.SetupServiceOuterClass.GetAgentInstallCommandResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAgentInstallCommandMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SetupServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<SetupServiceBlockingStub> {
    private SetupServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SetupServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SetupServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public yandex.cloud.api.backup.v1.SetupServiceOuterClass.GetAgentInstallCommandResponse getAgentInstallCommand(yandex.cloud.api.backup.v1.SetupServiceOuterClass.GetAgentInstallCommandRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAgentInstallCommandMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SetupServiceFutureStub extends io.grpc.stub.AbstractFutureStub<SetupServiceFutureStub> {
    private SetupServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SetupServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SetupServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.backup.v1.SetupServiceOuterClass.GetAgentInstallCommandResponse> getAgentInstallCommand(
        yandex.cloud.api.backup.v1.SetupServiceOuterClass.GetAgentInstallCommandRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAgentInstallCommandMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_AGENT_INSTALL_COMMAND = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SetupServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SetupServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_AGENT_INSTALL_COMMAND:
          serviceImpl.getAgentInstallCommand((yandex.cloud.api.backup.v1.SetupServiceOuterClass.GetAgentInstallCommandRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.backup.v1.SetupServiceOuterClass.GetAgentInstallCommandResponse>) responseObserver);
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

  private static abstract class SetupServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SetupServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.backup.v1.SetupServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SetupService");
    }
  }

  private static final class SetupServiceFileDescriptorSupplier
      extends SetupServiceBaseDescriptorSupplier {
    SetupServiceFileDescriptorSupplier() {}
  }

  private static final class SetupServiceMethodDescriptorSupplier
      extends SetupServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SetupServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SetupServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SetupServiceFileDescriptorSupplier())
              .addMethod(getGetAgentInstallCommandMethod())
              .build();
        }
      }
    }
    return result;
  }
}
