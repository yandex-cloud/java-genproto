package yandex.cloud.api.ai.assistants.v1.runs;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * RunService provides operations for managing runs.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/ai/assistants/v1/runs/run_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RunServiceGrpc {

  private RunServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.ai.assistants.v1.runs.RunService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.CreateRunRequest,
      yandex.cloud.api.ai.assistants.v1.runs.RunOuterClass.Run> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.CreateRunRequest.class,
      responseType = yandex.cloud.api.ai.assistants.v1.runs.RunOuterClass.Run.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.CreateRunRequest,
      yandex.cloud.api.ai.assistants.v1.runs.RunOuterClass.Run> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.CreateRunRequest, yandex.cloud.api.ai.assistants.v1.runs.RunOuterClass.Run> getCreateMethod;
    if ((getCreateMethod = RunServiceGrpc.getCreateMethod) == null) {
      synchronized (RunServiceGrpc.class) {
        if ((getCreateMethod = RunServiceGrpc.getCreateMethod) == null) {
          RunServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.CreateRunRequest, yandex.cloud.api.ai.assistants.v1.runs.RunOuterClass.Run>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.CreateRunRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.assistants.v1.runs.RunOuterClass.Run.getDefaultInstance()))
              .setSchemaDescriptor(new RunServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.ListenRunRequest,
      yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.StreamEvent> getListenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Listen",
      requestType = yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.ListenRunRequest.class,
      responseType = yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.StreamEvent.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.ListenRunRequest,
      yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.StreamEvent> getListenMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.ListenRunRequest, yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.StreamEvent> getListenMethod;
    if ((getListenMethod = RunServiceGrpc.getListenMethod) == null) {
      synchronized (RunServiceGrpc.class) {
        if ((getListenMethod = RunServiceGrpc.getListenMethod) == null) {
          RunServiceGrpc.getListenMethod = getListenMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.ListenRunRequest, yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.StreamEvent>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Listen"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.ListenRunRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.StreamEvent.getDefaultInstance()))
              .setSchemaDescriptor(new RunServiceMethodDescriptorSupplier("Listen"))
              .build();
        }
      }
    }
    return getListenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.AttachRunRequest,
      yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.StreamEvent> getAttachMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Attach",
      requestType = yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.AttachRunRequest.class,
      responseType = yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.StreamEvent.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.AttachRunRequest,
      yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.StreamEvent> getAttachMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.AttachRunRequest, yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.StreamEvent> getAttachMethod;
    if ((getAttachMethod = RunServiceGrpc.getAttachMethod) == null) {
      synchronized (RunServiceGrpc.class) {
        if ((getAttachMethod = RunServiceGrpc.getAttachMethod) == null) {
          RunServiceGrpc.getAttachMethod = getAttachMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.AttachRunRequest, yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.StreamEvent>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Attach"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.AttachRunRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.StreamEvent.getDefaultInstance()))
              .setSchemaDescriptor(new RunServiceMethodDescriptorSupplier("Attach"))
              .build();
        }
      }
    }
    return getAttachMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.GetRunRequest,
      yandex.cloud.api.ai.assistants.v1.runs.RunOuterClass.Run> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.GetRunRequest.class,
      responseType = yandex.cloud.api.ai.assistants.v1.runs.RunOuterClass.Run.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.GetRunRequest,
      yandex.cloud.api.ai.assistants.v1.runs.RunOuterClass.Run> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.GetRunRequest, yandex.cloud.api.ai.assistants.v1.runs.RunOuterClass.Run> getGetMethod;
    if ((getGetMethod = RunServiceGrpc.getGetMethod) == null) {
      synchronized (RunServiceGrpc.class) {
        if ((getGetMethod = RunServiceGrpc.getGetMethod) == null) {
          RunServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.GetRunRequest, yandex.cloud.api.ai.assistants.v1.runs.RunOuterClass.Run>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.GetRunRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.assistants.v1.runs.RunOuterClass.Run.getDefaultInstance()))
              .setSchemaDescriptor(new RunServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.GetLastRunByThreadRequest,
      yandex.cloud.api.ai.assistants.v1.runs.RunOuterClass.Run> getGetLastByThreadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLastByThread",
      requestType = yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.GetLastRunByThreadRequest.class,
      responseType = yandex.cloud.api.ai.assistants.v1.runs.RunOuterClass.Run.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.GetLastRunByThreadRequest,
      yandex.cloud.api.ai.assistants.v1.runs.RunOuterClass.Run> getGetLastByThreadMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.GetLastRunByThreadRequest, yandex.cloud.api.ai.assistants.v1.runs.RunOuterClass.Run> getGetLastByThreadMethod;
    if ((getGetLastByThreadMethod = RunServiceGrpc.getGetLastByThreadMethod) == null) {
      synchronized (RunServiceGrpc.class) {
        if ((getGetLastByThreadMethod = RunServiceGrpc.getGetLastByThreadMethod) == null) {
          RunServiceGrpc.getGetLastByThreadMethod = getGetLastByThreadMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.GetLastRunByThreadRequest, yandex.cloud.api.ai.assistants.v1.runs.RunOuterClass.Run>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLastByThread"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.GetLastRunByThreadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.assistants.v1.runs.RunOuterClass.Run.getDefaultInstance()))
              .setSchemaDescriptor(new RunServiceMethodDescriptorSupplier("GetLastByThread"))
              .build();
        }
      }
    }
    return getGetLastByThreadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.ListRunsRequest,
      yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.ListRunsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.ListRunsRequest.class,
      responseType = yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.ListRunsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.ListRunsRequest,
      yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.ListRunsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.ListRunsRequest, yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.ListRunsResponse> getListMethod;
    if ((getListMethod = RunServiceGrpc.getListMethod) == null) {
      synchronized (RunServiceGrpc.class) {
        if ((getListMethod = RunServiceGrpc.getListMethod) == null) {
          RunServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.ListRunsRequest, yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.ListRunsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.ListRunsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.ListRunsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RunServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.SubmitToRunRequest,
      yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.SubmitToRunResponse> getSubmitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Submit",
      requestType = yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.SubmitToRunRequest.class,
      responseType = yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.SubmitToRunResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.SubmitToRunRequest,
      yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.SubmitToRunResponse> getSubmitMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.SubmitToRunRequest, yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.SubmitToRunResponse> getSubmitMethod;
    if ((getSubmitMethod = RunServiceGrpc.getSubmitMethod) == null) {
      synchronized (RunServiceGrpc.class) {
        if ((getSubmitMethod = RunServiceGrpc.getSubmitMethod) == null) {
          RunServiceGrpc.getSubmitMethod = getSubmitMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.SubmitToRunRequest, yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.SubmitToRunResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Submit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.SubmitToRunRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.SubmitToRunResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RunServiceMethodDescriptorSupplier("Submit"))
              .build();
        }
      }
    }
    return getSubmitMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RunServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RunServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RunServiceStub>() {
        @java.lang.Override
        public RunServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RunServiceStub(channel, callOptions);
        }
      };
    return RunServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RunServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RunServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RunServiceBlockingStub>() {
        @java.lang.Override
        public RunServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RunServiceBlockingStub(channel, callOptions);
        }
      };
    return RunServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RunServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RunServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RunServiceFutureStub>() {
        @java.lang.Override
        public RunServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RunServiceFutureStub(channel, callOptions);
        }
      };
    return RunServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * RunService provides operations for managing runs.
   * </pre>
   */
  public static abstract class RunServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Create a new run for a given assistant and thread.
     * </pre>
     */
    public void create(yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.CreateRunRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.runs.RunOuterClass.Run> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Listen to events from a specific run.
     * If the run was created with `stream = false`, Listen will only respond with the final status of the run
     * and will not stream partial messages or intermediate events.
     * </pre>
     */
    public void listen(yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.ListenRunRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.StreamEvent> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListenMethod(), responseObserver);
    }

    /**
     * <pre>
     * Bi-directional streaming method to interact with a specific run.
     * Like `Listen`, `Attach` streams events from the run, but also allows clients to send events back.
     * For example, it can be used to submit function call results when the run is waiting for user input.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.AttachRunRequest> attach(
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.StreamEvent> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getAttachMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieve details of a specific run by its ID.
     * </pre>
     */
    public void get(yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.GetRunRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.runs.RunOuterClass.Run> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the most recent run for a specific thread.
     * </pre>
     */
    public void getLastByThread(yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.GetLastRunByThreadRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.runs.RunOuterClass.Run> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLastByThreadMethod(), responseObserver);
    }

    /**
     * <pre>
     * List runs in a specific folder.
     * </pre>
     */
    public void list(yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.ListRunsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.ListRunsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Submit event to run
     * For example, submit function call results when the run is waiting for user input.
     * </pre>
     */
    public void submit(yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.SubmitToRunRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.SubmitToRunResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubmitMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.CreateRunRequest,
                yandex.cloud.api.ai.assistants.v1.runs.RunOuterClass.Run>(
                  this, METHODID_CREATE)))
          .addMethod(
            getListenMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.ListenRunRequest,
                yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.StreamEvent>(
                  this, METHODID_LISTEN)))
          .addMethod(
            getAttachMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.AttachRunRequest,
                yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.StreamEvent>(
                  this, METHODID_ATTACH)))
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.GetRunRequest,
                yandex.cloud.api.ai.assistants.v1.runs.RunOuterClass.Run>(
                  this, METHODID_GET)))
          .addMethod(
            getGetLastByThreadMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.GetLastRunByThreadRequest,
                yandex.cloud.api.ai.assistants.v1.runs.RunOuterClass.Run>(
                  this, METHODID_GET_LAST_BY_THREAD)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.ListRunsRequest,
                yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.ListRunsResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getSubmitMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.SubmitToRunRequest,
                yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.SubmitToRunResponse>(
                  this, METHODID_SUBMIT)))
          .build();
    }
  }

  /**
   * <pre>
   * RunService provides operations for managing runs.
   * </pre>
   */
  public static final class RunServiceStub extends io.grpc.stub.AbstractAsyncStub<RunServiceStub> {
    private RunServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RunServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RunServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a new run for a given assistant and thread.
     * </pre>
     */
    public void create(yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.CreateRunRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.runs.RunOuterClass.Run> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Listen to events from a specific run.
     * If the run was created with `stream = false`, Listen will only respond with the final status of the run
     * and will not stream partial messages or intermediate events.
     * </pre>
     */
    public void listen(yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.ListenRunRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.StreamEvent> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Bi-directional streaming method to interact with a specific run.
     * Like `Listen`, `Attach` streams events from the run, but also allows clients to send events back.
     * For example, it can be used to submit function call results when the run is waiting for user input.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.AttachRunRequest> attach(
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.StreamEvent> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getAttachMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Retrieve details of a specific run by its ID.
     * </pre>
     */
    public void get(yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.GetRunRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.runs.RunOuterClass.Run> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the most recent run for a specific thread.
     * </pre>
     */
    public void getLastByThread(yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.GetLastRunByThreadRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.runs.RunOuterClass.Run> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLastByThreadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List runs in a specific folder.
     * </pre>
     */
    public void list(yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.ListRunsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.ListRunsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Submit event to run
     * For example, submit function call results when the run is waiting for user input.
     * </pre>
     */
    public void submit(yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.SubmitToRunRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.SubmitToRunResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubmitMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * RunService provides operations for managing runs.
   * </pre>
   */
  public static final class RunServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<RunServiceBlockingStub> {
    private RunServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RunServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RunServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a new run for a given assistant and thread.
     * </pre>
     */
    public yandex.cloud.api.ai.assistants.v1.runs.RunOuterClass.Run create(yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.CreateRunRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Listen to events from a specific run.
     * If the run was created with `stream = false`, Listen will only respond with the final status of the run
     * and will not stream partial messages or intermediate events.
     * </pre>
     */
    public java.util.Iterator<yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.StreamEvent> listen(
        yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.ListenRunRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListenMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve details of a specific run by its ID.
     * </pre>
     */
    public yandex.cloud.api.ai.assistants.v1.runs.RunOuterClass.Run get(yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.GetRunRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the most recent run for a specific thread.
     * </pre>
     */
    public yandex.cloud.api.ai.assistants.v1.runs.RunOuterClass.Run getLastByThread(yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.GetLastRunByThreadRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLastByThreadMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List runs in a specific folder.
     * </pre>
     */
    public yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.ListRunsResponse list(yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.ListRunsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Submit event to run
     * For example, submit function call results when the run is waiting for user input.
     * </pre>
     */
    public yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.SubmitToRunResponse submit(yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.SubmitToRunRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubmitMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * RunService provides operations for managing runs.
   * </pre>
   */
  public static final class RunServiceFutureStub extends io.grpc.stub.AbstractFutureStub<RunServiceFutureStub> {
    private RunServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RunServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RunServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a new run for a given assistant and thread.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ai.assistants.v1.runs.RunOuterClass.Run> create(
        yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.CreateRunRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve details of a specific run by its ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ai.assistants.v1.runs.RunOuterClass.Run> get(
        yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.GetRunRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the most recent run for a specific thread.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ai.assistants.v1.runs.RunOuterClass.Run> getLastByThread(
        yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.GetLastRunByThreadRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLastByThreadMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List runs in a specific folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.ListRunsResponse> list(
        yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.ListRunsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Submit event to run
     * For example, submit function call results when the run is waiting for user input.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.SubmitToRunResponse> submit(
        yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.SubmitToRunRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubmitMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_LISTEN = 1;
  private static final int METHODID_GET = 2;
  private static final int METHODID_GET_LAST_BY_THREAD = 3;
  private static final int METHODID_LIST = 4;
  private static final int METHODID_SUBMIT = 5;
  private static final int METHODID_ATTACH = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RunServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RunServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.CreateRunRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.runs.RunOuterClass.Run>) responseObserver);
          break;
        case METHODID_LISTEN:
          serviceImpl.listen((yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.ListenRunRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.StreamEvent>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.GetRunRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.runs.RunOuterClass.Run>) responseObserver);
          break;
        case METHODID_GET_LAST_BY_THREAD:
          serviceImpl.getLastByThread((yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.GetLastRunByThreadRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.runs.RunOuterClass.Run>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.ListRunsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.ListRunsResponse>) responseObserver);
          break;
        case METHODID_SUBMIT:
          serviceImpl.submit((yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.SubmitToRunRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.SubmitToRunResponse>) responseObserver);
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
        case METHODID_ATTACH:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.attach(
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.StreamEvent>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class RunServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RunServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.ai.assistants.v1.runs.RunServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RunService");
    }
  }

  private static final class RunServiceFileDescriptorSupplier
      extends RunServiceBaseDescriptorSupplier {
    RunServiceFileDescriptorSupplier() {}
  }

  private static final class RunServiceMethodDescriptorSupplier
      extends RunServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RunServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (RunServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RunServiceFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getListenMethod())
              .addMethod(getAttachMethod())
              .addMethod(getGetMethod())
              .addMethod(getGetLastByThreadMethod())
              .addMethod(getListMethod())
              .addMethod(getSubmitMethod())
              .build();
        }
      }
    }
    return result;
  }
}
