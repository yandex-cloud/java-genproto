package yandex.cloud.api.loadtesting.agent.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/loadtesting/agent/v1/agent_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AgentServiceGrpc {

  private AgentServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.loadtesting.agent.v1.AgentService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.loadtesting.agent.v1.AgentServiceOuterClass.ClaimAgentStatusRequest,
      yandex.cloud.api.loadtesting.agent.v1.AgentServiceOuterClass.ClaimAgentStatusResponse> getClaimStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClaimStatus",
      requestType = yandex.cloud.api.loadtesting.agent.v1.AgentServiceOuterClass.ClaimAgentStatusRequest.class,
      responseType = yandex.cloud.api.loadtesting.agent.v1.AgentServiceOuterClass.ClaimAgentStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.loadtesting.agent.v1.AgentServiceOuterClass.ClaimAgentStatusRequest,
      yandex.cloud.api.loadtesting.agent.v1.AgentServiceOuterClass.ClaimAgentStatusResponse> getClaimStatusMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.loadtesting.agent.v1.AgentServiceOuterClass.ClaimAgentStatusRequest, yandex.cloud.api.loadtesting.agent.v1.AgentServiceOuterClass.ClaimAgentStatusResponse> getClaimStatusMethod;
    if ((getClaimStatusMethod = AgentServiceGrpc.getClaimStatusMethod) == null) {
      synchronized (AgentServiceGrpc.class) {
        if ((getClaimStatusMethod = AgentServiceGrpc.getClaimStatusMethod) == null) {
          AgentServiceGrpc.getClaimStatusMethod = getClaimStatusMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.loadtesting.agent.v1.AgentServiceOuterClass.ClaimAgentStatusRequest, yandex.cloud.api.loadtesting.agent.v1.AgentServiceOuterClass.ClaimAgentStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClaimStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.loadtesting.agent.v1.AgentServiceOuterClass.ClaimAgentStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.loadtesting.agent.v1.AgentServiceOuterClass.ClaimAgentStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AgentServiceMethodDescriptorSupplier("ClaimStatus"))
              .build();
        }
      }
    }
    return getClaimStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.loadtesting.agent.v1.AgentServiceOuterClass.ReportEventLogsRequest,
      yandex.cloud.api.loadtesting.agent.v1.AgentServiceOuterClass.ReportEventLogsResponse> getReportEventLogsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReportEventLogs",
      requestType = yandex.cloud.api.loadtesting.agent.v1.AgentServiceOuterClass.ReportEventLogsRequest.class,
      responseType = yandex.cloud.api.loadtesting.agent.v1.AgentServiceOuterClass.ReportEventLogsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.loadtesting.agent.v1.AgentServiceOuterClass.ReportEventLogsRequest,
      yandex.cloud.api.loadtesting.agent.v1.AgentServiceOuterClass.ReportEventLogsResponse> getReportEventLogsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.loadtesting.agent.v1.AgentServiceOuterClass.ReportEventLogsRequest, yandex.cloud.api.loadtesting.agent.v1.AgentServiceOuterClass.ReportEventLogsResponse> getReportEventLogsMethod;
    if ((getReportEventLogsMethod = AgentServiceGrpc.getReportEventLogsMethod) == null) {
      synchronized (AgentServiceGrpc.class) {
        if ((getReportEventLogsMethod = AgentServiceGrpc.getReportEventLogsMethod) == null) {
          AgentServiceGrpc.getReportEventLogsMethod = getReportEventLogsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.loadtesting.agent.v1.AgentServiceOuterClass.ReportEventLogsRequest, yandex.cloud.api.loadtesting.agent.v1.AgentServiceOuterClass.ReportEventLogsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReportEventLogs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.loadtesting.agent.v1.AgentServiceOuterClass.ReportEventLogsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.loadtesting.agent.v1.AgentServiceOuterClass.ReportEventLogsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AgentServiceMethodDescriptorSupplier("ReportEventLogs"))
              .build();
        }
      }
    }
    return getReportEventLogsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AgentServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AgentServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AgentServiceStub>() {
        @java.lang.Override
        public AgentServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AgentServiceStub(channel, callOptions);
        }
      };
    return AgentServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AgentServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AgentServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AgentServiceBlockingStub>() {
        @java.lang.Override
        public AgentServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AgentServiceBlockingStub(channel, callOptions);
        }
      };
    return AgentServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AgentServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AgentServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AgentServiceFutureStub>() {
        @java.lang.Override
        public AgentServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AgentServiceFutureStub(channel, callOptions);
        }
      };
    return AgentServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class AgentServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Claims status for the specified agent.
     * </pre>
     */
    public void claimStatus(yandex.cloud.api.loadtesting.agent.v1.AgentServiceOuterClass.ClaimAgentStatusRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.loadtesting.agent.v1.AgentServiceOuterClass.ClaimAgentStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClaimStatusMethod(), responseObserver);
    }

    /**
     */
    public void reportEventLogs(yandex.cloud.api.loadtesting.agent.v1.AgentServiceOuterClass.ReportEventLogsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.loadtesting.agent.v1.AgentServiceOuterClass.ReportEventLogsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReportEventLogsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getClaimStatusMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.loadtesting.agent.v1.AgentServiceOuterClass.ClaimAgentStatusRequest,
                yandex.cloud.api.loadtesting.agent.v1.AgentServiceOuterClass.ClaimAgentStatusResponse>(
                  this, METHODID_CLAIM_STATUS)))
          .addMethod(
            getReportEventLogsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.loadtesting.agent.v1.AgentServiceOuterClass.ReportEventLogsRequest,
                yandex.cloud.api.loadtesting.agent.v1.AgentServiceOuterClass.ReportEventLogsResponse>(
                  this, METHODID_REPORT_EVENT_LOGS)))
          .build();
    }
  }

  /**
   */
  public static final class AgentServiceStub extends io.grpc.stub.AbstractAsyncStub<AgentServiceStub> {
    private AgentServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AgentServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AgentServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Claims status for the specified agent.
     * </pre>
     */
    public void claimStatus(yandex.cloud.api.loadtesting.agent.v1.AgentServiceOuterClass.ClaimAgentStatusRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.loadtesting.agent.v1.AgentServiceOuterClass.ClaimAgentStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClaimStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void reportEventLogs(yandex.cloud.api.loadtesting.agent.v1.AgentServiceOuterClass.ReportEventLogsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.loadtesting.agent.v1.AgentServiceOuterClass.ReportEventLogsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReportEventLogsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AgentServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AgentServiceBlockingStub> {
    private AgentServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AgentServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AgentServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Claims status for the specified agent.
     * </pre>
     */
    public yandex.cloud.api.loadtesting.agent.v1.AgentServiceOuterClass.ClaimAgentStatusResponse claimStatus(yandex.cloud.api.loadtesting.agent.v1.AgentServiceOuterClass.ClaimAgentStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClaimStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.loadtesting.agent.v1.AgentServiceOuterClass.ReportEventLogsResponse reportEventLogs(yandex.cloud.api.loadtesting.agent.v1.AgentServiceOuterClass.ReportEventLogsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReportEventLogsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AgentServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AgentServiceFutureStub> {
    private AgentServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AgentServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AgentServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Claims status for the specified agent.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.loadtesting.agent.v1.AgentServiceOuterClass.ClaimAgentStatusResponse> claimStatus(
        yandex.cloud.api.loadtesting.agent.v1.AgentServiceOuterClass.ClaimAgentStatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClaimStatusMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.loadtesting.agent.v1.AgentServiceOuterClass.ReportEventLogsResponse> reportEventLogs(
        yandex.cloud.api.loadtesting.agent.v1.AgentServiceOuterClass.ReportEventLogsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReportEventLogsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CLAIM_STATUS = 0;
  private static final int METHODID_REPORT_EVENT_LOGS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AgentServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AgentServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CLAIM_STATUS:
          serviceImpl.claimStatus((yandex.cloud.api.loadtesting.agent.v1.AgentServiceOuterClass.ClaimAgentStatusRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.loadtesting.agent.v1.AgentServiceOuterClass.ClaimAgentStatusResponse>) responseObserver);
          break;
        case METHODID_REPORT_EVENT_LOGS:
          serviceImpl.reportEventLogs((yandex.cloud.api.loadtesting.agent.v1.AgentServiceOuterClass.ReportEventLogsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.loadtesting.agent.v1.AgentServiceOuterClass.ReportEventLogsResponse>) responseObserver);
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

  private static abstract class AgentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AgentServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.loadtesting.agent.v1.AgentServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AgentService");
    }
  }

  private static final class AgentServiceFileDescriptorSupplier
      extends AgentServiceBaseDescriptorSupplier {
    AgentServiceFileDescriptorSupplier() {}
  }

  private static final class AgentServiceMethodDescriptorSupplier
      extends AgentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AgentServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AgentServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AgentServiceFileDescriptorSupplier())
              .addMethod(getClaimStatusMethod())
              .addMethod(getReportEventLogsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
