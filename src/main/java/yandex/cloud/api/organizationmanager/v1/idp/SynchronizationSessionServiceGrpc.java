package yandex.cloud.api.organizationmanager.v1.idp;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing synchronization sessions.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/organizationmanager/v1/idp/synchronization_session_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SynchronizationSessionServiceGrpc {

  private SynchronizationSessionServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.organizationmanager.v1.idp.SynchronizationSessionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.OpenSessionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getOpenSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OpenSession",
      requestType = yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.OpenSessionRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.OpenSessionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getOpenSessionMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.OpenSessionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getOpenSessionMethod;
    if ((getOpenSessionMethod = SynchronizationSessionServiceGrpc.getOpenSessionMethod) == null) {
      synchronized (SynchronizationSessionServiceGrpc.class) {
        if ((getOpenSessionMethod = SynchronizationSessionServiceGrpc.getOpenSessionMethod) == null) {
          SynchronizationSessionServiceGrpc.getOpenSessionMethod = getOpenSessionMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.OpenSessionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OpenSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.OpenSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new SynchronizationSessionServiceMethodDescriptorSupplier("OpenSession"))
              .build();
        }
      }
    }
    return getOpenSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.CloseSessionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCloseSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CloseSession",
      requestType = yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.CloseSessionRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.CloseSessionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCloseSessionMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.CloseSessionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCloseSessionMethod;
    if ((getCloseSessionMethod = SynchronizationSessionServiceGrpc.getCloseSessionMethod) == null) {
      synchronized (SynchronizationSessionServiceGrpc.class) {
        if ((getCloseSessionMethod = SynchronizationSessionServiceGrpc.getCloseSessionMethod) == null) {
          SynchronizationSessionServiceGrpc.getCloseSessionMethod = getCloseSessionMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.CloseSessionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CloseSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.CloseSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new SynchronizationSessionServiceMethodDescriptorSupplier("CloseSession"))
              .build();
        }
      }
    }
    return getCloseSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.ReportSessionProgressRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getReportSessionProgressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReportSessionProgress",
      requestType = yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.ReportSessionProgressRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.ReportSessionProgressRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getReportSessionProgressMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.ReportSessionProgressRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getReportSessionProgressMethod;
    if ((getReportSessionProgressMethod = SynchronizationSessionServiceGrpc.getReportSessionProgressMethod) == null) {
      synchronized (SynchronizationSessionServiceGrpc.class) {
        if ((getReportSessionProgressMethod = SynchronizationSessionServiceGrpc.getReportSessionProgressMethod) == null) {
          SynchronizationSessionServiceGrpc.getReportSessionProgressMethod = getReportSessionProgressMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.ReportSessionProgressRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReportSessionProgress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.ReportSessionProgressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new SynchronizationSessionServiceMethodDescriptorSupplier("ReportSessionProgress"))
              .build();
        }
      }
    }
    return getReportSessionProgressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.HeartbeatRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getHeartbeatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Heartbeat",
      requestType = yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.HeartbeatRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.HeartbeatRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getHeartbeatMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.HeartbeatRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getHeartbeatMethod;
    if ((getHeartbeatMethod = SynchronizationSessionServiceGrpc.getHeartbeatMethod) == null) {
      synchronized (SynchronizationSessionServiceGrpc.class) {
        if ((getHeartbeatMethod = SynchronizationSessionServiceGrpc.getHeartbeatMethod) == null) {
          SynchronizationSessionServiceGrpc.getHeartbeatMethod = getHeartbeatMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.HeartbeatRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Heartbeat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.HeartbeatRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new SynchronizationSessionServiceMethodDescriptorSupplier("Heartbeat"))
              .build();
        }
      }
    }
    return getHeartbeatMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.GetSessionRequest,
      yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.GetSessionResponse> getGetSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSession",
      requestType = yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.GetSessionRequest.class,
      responseType = yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.GetSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.GetSessionRequest,
      yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.GetSessionResponse> getGetSessionMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.GetSessionRequest, yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.GetSessionResponse> getGetSessionMethod;
    if ((getGetSessionMethod = SynchronizationSessionServiceGrpc.getGetSessionMethod) == null) {
      synchronized (SynchronizationSessionServiceGrpc.class) {
        if ((getGetSessionMethod = SynchronizationSessionServiceGrpc.getGetSessionMethod) == null) {
          SynchronizationSessionServiceGrpc.getGetSessionMethod = getGetSessionMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.GetSessionRequest, yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.GetSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.GetSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.GetSessionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SynchronizationSessionServiceMethodDescriptorSupplier("GetSession"))
              .build();
        }
      }
    }
    return getGetSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.ListSessionsRequest,
      yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.ListSessionsResponse> getListSessionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSessions",
      requestType = yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.ListSessionsRequest.class,
      responseType = yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.ListSessionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.ListSessionsRequest,
      yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.ListSessionsResponse> getListSessionsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.ListSessionsRequest, yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.ListSessionsResponse> getListSessionsMethod;
    if ((getListSessionsMethod = SynchronizationSessionServiceGrpc.getListSessionsMethod) == null) {
      synchronized (SynchronizationSessionServiceGrpc.class) {
        if ((getListSessionsMethod = SynchronizationSessionServiceGrpc.getListSessionsMethod) == null) {
          SynchronizationSessionServiceGrpc.getListSessionsMethod = getListSessionsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.ListSessionsRequest, yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.ListSessionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListSessions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.ListSessionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.ListSessionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SynchronizationSessionServiceMethodDescriptorSupplier("ListSessions"))
              .build();
        }
      }
    }
    return getListSessionsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SynchronizationSessionServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SynchronizationSessionServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SynchronizationSessionServiceStub>() {
        @java.lang.Override
        public SynchronizationSessionServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SynchronizationSessionServiceStub(channel, callOptions);
        }
      };
    return SynchronizationSessionServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SynchronizationSessionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SynchronizationSessionServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SynchronizationSessionServiceBlockingStub>() {
        @java.lang.Override
        public SynchronizationSessionServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SynchronizationSessionServiceBlockingStub(channel, callOptions);
        }
      };
    return SynchronizationSessionServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SynchronizationSessionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SynchronizationSessionServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SynchronizationSessionServiceFutureStub>() {
        @java.lang.Override
        public SynchronizationSessionServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SynchronizationSessionServiceFutureStub(channel, callOptions);
        }
      };
    return SynchronizationSessionServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing synchronization sessions.
   * </pre>
   */
  public static abstract class SynchronizationSessionServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Opens a new synchronization session.
     * </pre>
     */
    public void openSession(yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.OpenSessionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOpenSessionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Closes a synchronization session.
     * </pre>
     */
    public void closeSession(yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.CloseSessionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCloseSessionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Reports progress for a synchronization session.
     * </pre>
     */
    public void reportSessionProgress(yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.ReportSessionProgressRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReportSessionProgressMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sends a heartbeat for a synchronization session.
     * </pre>
     */
    public void heartbeat(yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.HeartbeatRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHeartbeatMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the specified synchronization session.
     * </pre>
     */
    public void getSession(yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.GetSessionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.GetSessionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSessionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists synchronization sessions for a subject container.
     * </pre>
     */
    public void listSessions(yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.ListSessionsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.ListSessionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListSessionsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getOpenSessionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.OpenSessionRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_OPEN_SESSION)))
          .addMethod(
            getCloseSessionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.CloseSessionRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CLOSE_SESSION)))
          .addMethod(
            getReportSessionProgressMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.ReportSessionProgressRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_REPORT_SESSION_PROGRESS)))
          .addMethod(
            getHeartbeatMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.HeartbeatRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_HEARTBEAT)))
          .addMethod(
            getGetSessionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.GetSessionRequest,
                yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.GetSessionResponse>(
                  this, METHODID_GET_SESSION)))
          .addMethod(
            getListSessionsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.ListSessionsRequest,
                yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.ListSessionsResponse>(
                  this, METHODID_LIST_SESSIONS)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing synchronization sessions.
   * </pre>
   */
  public static final class SynchronizationSessionServiceStub extends io.grpc.stub.AbstractAsyncStub<SynchronizationSessionServiceStub> {
    private SynchronizationSessionServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SynchronizationSessionServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SynchronizationSessionServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Opens a new synchronization session.
     * </pre>
     */
    public void openSession(yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.OpenSessionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOpenSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Closes a synchronization session.
     * </pre>
     */
    public void closeSession(yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.CloseSessionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCloseSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Reports progress for a synchronization session.
     * </pre>
     */
    public void reportSessionProgress(yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.ReportSessionProgressRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReportSessionProgressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sends a heartbeat for a synchronization session.
     * </pre>
     */
    public void heartbeat(yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.HeartbeatRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHeartbeatMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the specified synchronization session.
     * </pre>
     */
    public void getSession(yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.GetSessionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.GetSessionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists synchronization sessions for a subject container.
     * </pre>
     */
    public void listSessions(yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.ListSessionsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.ListSessionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListSessionsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing synchronization sessions.
   * </pre>
   */
  public static final class SynchronizationSessionServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<SynchronizationSessionServiceBlockingStub> {
    private SynchronizationSessionServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SynchronizationSessionServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SynchronizationSessionServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Opens a new synchronization session.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation openSession(yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.OpenSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOpenSessionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Closes a synchronization session.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation closeSession(yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.CloseSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCloseSessionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Reports progress for a synchronization session.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation reportSessionProgress(yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.ReportSessionProgressRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReportSessionProgressMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sends a heartbeat for a synchronization session.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation heartbeat(yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.HeartbeatRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHeartbeatMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the specified synchronization session.
     * </pre>
     */
    public yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.GetSessionResponse getSession(yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.GetSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSessionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists synchronization sessions for a subject container.
     * </pre>
     */
    public yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.ListSessionsResponse listSessions(yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.ListSessionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListSessionsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing synchronization sessions.
   * </pre>
   */
  public static final class SynchronizationSessionServiceFutureStub extends io.grpc.stub.AbstractFutureStub<SynchronizationSessionServiceFutureStub> {
    private SynchronizationSessionServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SynchronizationSessionServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SynchronizationSessionServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Opens a new synchronization session.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> openSession(
        yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.OpenSessionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOpenSessionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Closes a synchronization session.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> closeSession(
        yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.CloseSessionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCloseSessionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Reports progress for a synchronization session.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> reportSessionProgress(
        yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.ReportSessionProgressRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReportSessionProgressMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sends a heartbeat for a synchronization session.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> heartbeat(
        yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.HeartbeatRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHeartbeatMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the specified synchronization session.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.GetSessionResponse> getSession(
        yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.GetSessionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSessionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists synchronization sessions for a subject container.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.ListSessionsResponse> listSessions(
        yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.ListSessionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListSessionsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_OPEN_SESSION = 0;
  private static final int METHODID_CLOSE_SESSION = 1;
  private static final int METHODID_REPORT_SESSION_PROGRESS = 2;
  private static final int METHODID_HEARTBEAT = 3;
  private static final int METHODID_GET_SESSION = 4;
  private static final int METHODID_LIST_SESSIONS = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SynchronizationSessionServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SynchronizationSessionServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_OPEN_SESSION:
          serviceImpl.openSession((yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.OpenSessionRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_CLOSE_SESSION:
          serviceImpl.closeSession((yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.CloseSessionRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_REPORT_SESSION_PROGRESS:
          serviceImpl.reportSessionProgress((yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.ReportSessionProgressRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_HEARTBEAT:
          serviceImpl.heartbeat((yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.HeartbeatRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_GET_SESSION:
          serviceImpl.getSession((yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.GetSessionRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.GetSessionResponse>) responseObserver);
          break;
        case METHODID_LIST_SESSIONS:
          serviceImpl.listSessions((yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.ListSessionsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.ListSessionsResponse>) responseObserver);
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

  private static abstract class SynchronizationSessionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SynchronizationSessionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSessionServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SynchronizationSessionService");
    }
  }

  private static final class SynchronizationSessionServiceFileDescriptorSupplier
      extends SynchronizationSessionServiceBaseDescriptorSupplier {
    SynchronizationSessionServiceFileDescriptorSupplier() {}
  }

  private static final class SynchronizationSessionServiceMethodDescriptorSupplier
      extends SynchronizationSessionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SynchronizationSessionServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SynchronizationSessionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SynchronizationSessionServiceFileDescriptorSupplier())
              .addMethod(getOpenSessionMethod())
              .addMethod(getCloseSessionMethod())
              .addMethod(getReportSessionProgressMethod())
              .addMethod(getHeartbeatMethod())
              .addMethod(getGetSessionMethod())
              .addMethod(getListSessionsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
