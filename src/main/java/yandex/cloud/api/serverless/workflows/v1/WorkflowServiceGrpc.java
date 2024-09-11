package yandex.cloud.api.serverless.workflows.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Set of methods for managing Workflows.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/serverless/workflows/v1/workflow_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class WorkflowServiceGrpc {

  private WorkflowServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.serverless.workflows.v1.WorkflowService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.CreateWorkflowRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.CreateWorkflowRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.CreateWorkflowRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.CreateWorkflowRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = WorkflowServiceGrpc.getCreateMethod) == null) {
      synchronized (WorkflowServiceGrpc.class) {
        if ((getCreateMethod = WorkflowServiceGrpc.getCreateMethod) == null) {
          WorkflowServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.CreateWorkflowRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.CreateWorkflowRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new WorkflowServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.UpdateWorkflowRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.UpdateWorkflowRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.UpdateWorkflowRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.UpdateWorkflowRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = WorkflowServiceGrpc.getUpdateMethod) == null) {
      synchronized (WorkflowServiceGrpc.class) {
        if ((getUpdateMethod = WorkflowServiceGrpc.getUpdateMethod) == null) {
          WorkflowServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.UpdateWorkflowRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.UpdateWorkflowRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new WorkflowServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.GetWorkflowRequest,
      yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.GetWorkflowResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.GetWorkflowRequest.class,
      responseType = yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.GetWorkflowResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.GetWorkflowRequest,
      yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.GetWorkflowResponse> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.GetWorkflowRequest, yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.GetWorkflowResponse> getGetMethod;
    if ((getGetMethod = WorkflowServiceGrpc.getGetMethod) == null) {
      synchronized (WorkflowServiceGrpc.class) {
        if ((getGetMethod = WorkflowServiceGrpc.getGetMethod) == null) {
          WorkflowServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.GetWorkflowRequest, yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.GetWorkflowResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.GetWorkflowRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.GetWorkflowResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WorkflowServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.DeleteWorkflowRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.DeleteWorkflowRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.DeleteWorkflowRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.DeleteWorkflowRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = WorkflowServiceGrpc.getDeleteMethod) == null) {
      synchronized (WorkflowServiceGrpc.class) {
        if ((getDeleteMethod = WorkflowServiceGrpc.getDeleteMethod) == null) {
          WorkflowServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.DeleteWorkflowRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.DeleteWorkflowRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new WorkflowServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.ListWorkflowsRequest,
      yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.ListWorkflowsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.ListWorkflowsRequest.class,
      responseType = yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.ListWorkflowsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.ListWorkflowsRequest,
      yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.ListWorkflowsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.ListWorkflowsRequest, yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.ListWorkflowsResponse> getListMethod;
    if ((getListMethod = WorkflowServiceGrpc.getListMethod) == null) {
      synchronized (WorkflowServiceGrpc.class) {
        if ((getListMethod = WorkflowServiceGrpc.getListMethod) == null) {
          WorkflowServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.ListWorkflowsRequest, yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.ListWorkflowsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.ListWorkflowsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.ListWorkflowsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WorkflowServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.ListOperationsRequest,
      yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.ListOperationsResponse> getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.ListOperationsRequest.class,
      responseType = yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.ListOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.ListOperationsRequest,
      yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.ListOperationsResponse> getListOperationsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.ListOperationsRequest, yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.ListOperationsResponse> getListOperationsMethod;
    if ((getListOperationsMethod = WorkflowServiceGrpc.getListOperationsMethod) == null) {
      synchronized (WorkflowServiceGrpc.class) {
        if ((getListOperationsMethod = WorkflowServiceGrpc.getListOperationsMethod) == null) {
          WorkflowServiceGrpc.getListOperationsMethod = getListOperationsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.ListOperationsRequest, yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.ListOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.ListOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.ListOperationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WorkflowServiceMethodDescriptorSupplier("ListOperations"))
              .build();
        }
      }
    }
    return getListOperationsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WorkflowServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WorkflowServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WorkflowServiceStub>() {
        @java.lang.Override
        public WorkflowServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WorkflowServiceStub(channel, callOptions);
        }
      };
    return WorkflowServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WorkflowServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WorkflowServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WorkflowServiceBlockingStub>() {
        @java.lang.Override
        public WorkflowServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WorkflowServiceBlockingStub(channel, callOptions);
        }
      };
    return WorkflowServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WorkflowServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WorkflowServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WorkflowServiceFutureStub>() {
        @java.lang.Override
        public WorkflowServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WorkflowServiceFutureStub(channel, callOptions);
        }
      };
    return WorkflowServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Set of methods for managing Workflows.
   * </pre>
   */
  public static abstract class WorkflowServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Creates Workflow in specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.CreateWorkflowRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates specified Workflow.
     * </pre>
     */
    public void update(yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.UpdateWorkflowRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves specified Workflow.
     * </pre>
     */
    public void get(yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.GetWorkflowRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.GetWorkflowResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes specified Workflow.
     * </pre>
     */
    public void delete(yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.DeleteWorkflowRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves list of Workflows in specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.ListWorkflowsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.ListWorkflowsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists operations for specified Workflow.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.ListOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.ListOperationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.CreateWorkflowRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.UpdateWorkflowRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.GetWorkflowRequest,
                yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.GetWorkflowResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.DeleteWorkflowRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.ListWorkflowsRequest,
                yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.ListWorkflowsResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getListOperationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.ListOperationsRequest,
                yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.ListOperationsResponse>(
                  this, METHODID_LIST_OPERATIONS)))
          .build();
    }
  }

  /**
   * <pre>
   * Set of methods for managing Workflows.
   * </pre>
   */
  public static final class WorkflowServiceStub extends io.grpc.stub.AbstractAsyncStub<WorkflowServiceStub> {
    private WorkflowServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WorkflowServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WorkflowServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates Workflow in specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.CreateWorkflowRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates specified Workflow.
     * </pre>
     */
    public void update(yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.UpdateWorkflowRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves specified Workflow.
     * </pre>
     */
    public void get(yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.GetWorkflowRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.GetWorkflowResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes specified Workflow.
     * </pre>
     */
    public void delete(yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.DeleteWorkflowRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves list of Workflows in specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.ListWorkflowsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.ListWorkflowsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists operations for specified Workflow.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.ListOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.ListOperationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Set of methods for managing Workflows.
   * </pre>
   */
  public static final class WorkflowServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<WorkflowServiceBlockingStub> {
    private WorkflowServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WorkflowServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WorkflowServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates Workflow in specified folder.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.CreateWorkflowRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates specified Workflow.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.UpdateWorkflowRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves specified Workflow.
     * </pre>
     */
    public yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.GetWorkflowResponse get(yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.GetWorkflowRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes specified Workflow.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.DeleteWorkflowRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves list of Workflows in specified folder.
     * </pre>
     */
    public yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.ListWorkflowsResponse list(yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.ListWorkflowsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists operations for specified Workflow.
     * </pre>
     */
    public yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.ListOperationsResponse listOperations(yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.ListOperationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Set of methods for managing Workflows.
   * </pre>
   */
  public static final class WorkflowServiceFutureStub extends io.grpc.stub.AbstractFutureStub<WorkflowServiceFutureStub> {
    private WorkflowServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WorkflowServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WorkflowServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates Workflow in specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.CreateWorkflowRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates specified Workflow.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.UpdateWorkflowRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves specified Workflow.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.GetWorkflowResponse> get(
        yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.GetWorkflowRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes specified Workflow.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.DeleteWorkflowRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves list of Workflows in specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.ListWorkflowsResponse> list(
        yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.ListWorkflowsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists operations for specified Workflow.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.ListOperationsResponse> listOperations(
        yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.ListOperationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_UPDATE = 1;
  private static final int METHODID_GET = 2;
  private static final int METHODID_DELETE = 3;
  private static final int METHODID_LIST = 4;
  private static final int METHODID_LIST_OPERATIONS = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final WorkflowServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(WorkflowServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.CreateWorkflowRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.UpdateWorkflowRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.GetWorkflowRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.GetWorkflowResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.DeleteWorkflowRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.ListWorkflowsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.ListWorkflowsResponse>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.ListOperationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.ListOperationsResponse>) responseObserver);
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

  private static abstract class WorkflowServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WorkflowServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.serverless.workflows.v1.WorkflowServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WorkflowService");
    }
  }

  private static final class WorkflowServiceFileDescriptorSupplier
      extends WorkflowServiceBaseDescriptorSupplier {
    WorkflowServiceFileDescriptorSupplier() {}
  }

  private static final class WorkflowServiceMethodDescriptorSupplier
      extends WorkflowServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WorkflowServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (WorkflowServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WorkflowServiceFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getGetMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getListMethod())
              .addMethod(getListOperationsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
