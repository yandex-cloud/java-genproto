package yandex.cloud.api.serverless.workflows.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/serverless/workflows/v1/execution_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ExecutionServiceGrpc {

  private ExecutionServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.serverless.workflows.v1.ExecutionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.StartExecutionRequest,
      yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.StartExecutionResponse> getStartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Start",
      requestType = yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.StartExecutionRequest.class,
      responseType = yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.StartExecutionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.StartExecutionRequest,
      yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.StartExecutionResponse> getStartMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.StartExecutionRequest, yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.StartExecutionResponse> getStartMethod;
    if ((getStartMethod = ExecutionServiceGrpc.getStartMethod) == null) {
      synchronized (ExecutionServiceGrpc.class) {
        if ((getStartMethod = ExecutionServiceGrpc.getStartMethod) == null) {
          ExecutionServiceGrpc.getStartMethod = getStartMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.StartExecutionRequest, yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.StartExecutionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Start"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.StartExecutionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.StartExecutionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ExecutionServiceMethodDescriptorSupplier("Start"))
              .build();
        }
      }
    }
    return getStartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.StopExecutionRequest,
      yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.StopExecutionResponse> getStopMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Stop",
      requestType = yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.StopExecutionRequest.class,
      responseType = yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.StopExecutionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.StopExecutionRequest,
      yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.StopExecutionResponse> getStopMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.StopExecutionRequest, yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.StopExecutionResponse> getStopMethod;
    if ((getStopMethod = ExecutionServiceGrpc.getStopMethod) == null) {
      synchronized (ExecutionServiceGrpc.class) {
        if ((getStopMethod = ExecutionServiceGrpc.getStopMethod) == null) {
          ExecutionServiceGrpc.getStopMethod = getStopMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.StopExecutionRequest, yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.StopExecutionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Stop"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.StopExecutionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.StopExecutionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ExecutionServiceMethodDescriptorSupplier("Stop"))
              .build();
        }
      }
    }
    return getStopMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.GetExecutionRequest,
      yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.GetExecutionResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.GetExecutionRequest.class,
      responseType = yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.GetExecutionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.GetExecutionRequest,
      yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.GetExecutionResponse> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.GetExecutionRequest, yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.GetExecutionResponse> getGetMethod;
    if ((getGetMethod = ExecutionServiceGrpc.getGetMethod) == null) {
      synchronized (ExecutionServiceGrpc.class) {
        if ((getGetMethod = ExecutionServiceGrpc.getGetMethod) == null) {
          ExecutionServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.GetExecutionRequest, yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.GetExecutionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.GetExecutionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.GetExecutionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ExecutionServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.GetExecutionHistoryRequest,
      yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.GetExecutionHistoryResponse> getGetHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetHistory",
      requestType = yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.GetExecutionHistoryRequest.class,
      responseType = yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.GetExecutionHistoryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.GetExecutionHistoryRequest,
      yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.GetExecutionHistoryResponse> getGetHistoryMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.GetExecutionHistoryRequest, yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.GetExecutionHistoryResponse> getGetHistoryMethod;
    if ((getGetHistoryMethod = ExecutionServiceGrpc.getGetHistoryMethod) == null) {
      synchronized (ExecutionServiceGrpc.class) {
        if ((getGetHistoryMethod = ExecutionServiceGrpc.getGetHistoryMethod) == null) {
          ExecutionServiceGrpc.getGetHistoryMethod = getGetHistoryMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.GetExecutionHistoryRequest, yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.GetExecutionHistoryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.GetExecutionHistoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.GetExecutionHistoryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ExecutionServiceMethodDescriptorSupplier("GetHistory"))
              .build();
        }
      }
    }
    return getGetHistoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.ListExecutionsRequest,
      yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.ListExecutionsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.ListExecutionsRequest.class,
      responseType = yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.ListExecutionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.ListExecutionsRequest,
      yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.ListExecutionsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.ListExecutionsRequest, yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.ListExecutionsResponse> getListMethod;
    if ((getListMethod = ExecutionServiceGrpc.getListMethod) == null) {
      synchronized (ExecutionServiceGrpc.class) {
        if ((getListMethod = ExecutionServiceGrpc.getListMethod) == null) {
          ExecutionServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.ListExecutionsRequest, yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.ListExecutionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.ListExecutionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.ListExecutionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ExecutionServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ExecutionServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExecutionServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExecutionServiceStub>() {
        @java.lang.Override
        public ExecutionServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExecutionServiceStub(channel, callOptions);
        }
      };
    return ExecutionServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ExecutionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExecutionServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExecutionServiceBlockingStub>() {
        @java.lang.Override
        public ExecutionServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExecutionServiceBlockingStub(channel, callOptions);
        }
      };
    return ExecutionServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ExecutionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExecutionServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExecutionServiceFutureStub>() {
        @java.lang.Override
        public ExecutionServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExecutionServiceFutureStub(channel, callOptions);
        }
      };
    return ExecutionServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ExecutionServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Starts new Workflow execution.
     * </pre>
     */
    public void start(yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.StartExecutionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.StartExecutionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStartMethod(), responseObserver);
    }

    /**
     * <pre>
     * Stops specified Workflow execution.
     * </pre>
     */
    public void stop(yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.StopExecutionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.StopExecutionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStopMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves specified Workflow execution.
     * </pre>
     */
    public void get(yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.GetExecutionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.GetExecutionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves detailed history of specified Workflow execution.
     * </pre>
     */
    public void getHistory(yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.GetExecutionHistoryRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.GetExecutionHistoryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetHistoryMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves list of Workflow executions.
     * </pre>
     */
    public void list(yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.ListExecutionsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.ListExecutionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getStartMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.StartExecutionRequest,
                yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.StartExecutionResponse>(
                  this, METHODID_START)))
          .addMethod(
            getStopMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.StopExecutionRequest,
                yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.StopExecutionResponse>(
                  this, METHODID_STOP)))
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.GetExecutionRequest,
                yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.GetExecutionResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getGetHistoryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.GetExecutionHistoryRequest,
                yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.GetExecutionHistoryResponse>(
                  this, METHODID_GET_HISTORY)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.ListExecutionsRequest,
                yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.ListExecutionsResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   */
  public static final class ExecutionServiceStub extends io.grpc.stub.AbstractAsyncStub<ExecutionServiceStub> {
    private ExecutionServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExecutionServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExecutionServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Starts new Workflow execution.
     * </pre>
     */
    public void start(yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.StartExecutionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.StartExecutionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Stops specified Workflow execution.
     * </pre>
     */
    public void stop(yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.StopExecutionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.StopExecutionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStopMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves specified Workflow execution.
     * </pre>
     */
    public void get(yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.GetExecutionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.GetExecutionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves detailed history of specified Workflow execution.
     * </pre>
     */
    public void getHistory(yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.GetExecutionHistoryRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.GetExecutionHistoryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetHistoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves list of Workflow executions.
     * </pre>
     */
    public void list(yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.ListExecutionsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.ListExecutionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ExecutionServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ExecutionServiceBlockingStub> {
    private ExecutionServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExecutionServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExecutionServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Starts new Workflow execution.
     * </pre>
     */
    public yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.StartExecutionResponse start(yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.StartExecutionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStartMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Stops specified Workflow execution.
     * </pre>
     */
    public yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.StopExecutionResponse stop(yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.StopExecutionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStopMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves specified Workflow execution.
     * </pre>
     */
    public yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.GetExecutionResponse get(yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.GetExecutionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves detailed history of specified Workflow execution.
     * </pre>
     */
    public yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.GetExecutionHistoryResponse getHistory(yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.GetExecutionHistoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetHistoryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves list of Workflow executions.
     * </pre>
     */
    public yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.ListExecutionsResponse list(yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.ListExecutionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ExecutionServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ExecutionServiceFutureStub> {
    private ExecutionServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExecutionServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExecutionServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Starts new Workflow execution.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.StartExecutionResponse> start(
        yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.StartExecutionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStartMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Stops specified Workflow execution.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.StopExecutionResponse> stop(
        yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.StopExecutionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStopMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves specified Workflow execution.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.GetExecutionResponse> get(
        yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.GetExecutionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves detailed history of specified Workflow execution.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.GetExecutionHistoryResponse> getHistory(
        yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.GetExecutionHistoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetHistoryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves list of Workflow executions.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.ListExecutionsResponse> list(
        yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.ListExecutionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_START = 0;
  private static final int METHODID_STOP = 1;
  private static final int METHODID_GET = 2;
  private static final int METHODID_GET_HISTORY = 3;
  private static final int METHODID_LIST = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ExecutionServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ExecutionServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_START:
          serviceImpl.start((yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.StartExecutionRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.StartExecutionResponse>) responseObserver);
          break;
        case METHODID_STOP:
          serviceImpl.stop((yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.StopExecutionRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.StopExecutionResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.GetExecutionRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.GetExecutionResponse>) responseObserver);
          break;
        case METHODID_GET_HISTORY:
          serviceImpl.getHistory((yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.GetExecutionHistoryRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.GetExecutionHistoryResponse>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.ListExecutionsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.ListExecutionsResponse>) responseObserver);
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

  private static abstract class ExecutionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ExecutionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.serverless.workflows.v1.ExecutionServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ExecutionService");
    }
  }

  private static final class ExecutionServiceFileDescriptorSupplier
      extends ExecutionServiceBaseDescriptorSupplier {
    ExecutionServiceFileDescriptorSupplier() {}
  }

  private static final class ExecutionServiceMethodDescriptorSupplier
      extends ExecutionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ExecutionServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ExecutionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ExecutionServiceFileDescriptorSupplier())
              .addMethod(getStartMethod())
              .addMethod(getStopMethod())
              .addMethod(getGetMethod())
              .addMethod(getGetHistoryMethod())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
