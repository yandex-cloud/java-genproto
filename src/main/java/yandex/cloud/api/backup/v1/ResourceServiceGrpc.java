package yandex.cloud.api.backup.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/backup/v1/resource_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ResourceServiceGrpc {

  private ResourceServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.backup.v1.ResourceService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.backup.v1.ResourceServiceOuterClass.ListResourcesRequest,
      yandex.cloud.api.backup.v1.ResourceServiceOuterClass.ListResourcesResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.backup.v1.ResourceServiceOuterClass.ListResourcesRequest.class,
      responseType = yandex.cloud.api.backup.v1.ResourceServiceOuterClass.ListResourcesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.backup.v1.ResourceServiceOuterClass.ListResourcesRequest,
      yandex.cloud.api.backup.v1.ResourceServiceOuterClass.ListResourcesResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.backup.v1.ResourceServiceOuterClass.ListResourcesRequest, yandex.cloud.api.backup.v1.ResourceServiceOuterClass.ListResourcesResponse> getListMethod;
    if ((getListMethod = ResourceServiceGrpc.getListMethod) == null) {
      synchronized (ResourceServiceGrpc.class) {
        if ((getListMethod = ResourceServiceGrpc.getListMethod) == null) {
          ResourceServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.backup.v1.ResourceServiceOuterClass.ListResourcesRequest, yandex.cloud.api.backup.v1.ResourceServiceOuterClass.ListResourcesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.backup.v1.ResourceServiceOuterClass.ListResourcesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.backup.v1.ResourceServiceOuterClass.ListResourcesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ResourceServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.backup.v1.ResourceServiceOuterClass.GetResourceRequest,
      yandex.cloud.api.backup.v1.ResourceServiceOuterClass.GetResourceResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.backup.v1.ResourceServiceOuterClass.GetResourceRequest.class,
      responseType = yandex.cloud.api.backup.v1.ResourceServiceOuterClass.GetResourceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.backup.v1.ResourceServiceOuterClass.GetResourceRequest,
      yandex.cloud.api.backup.v1.ResourceServiceOuterClass.GetResourceResponse> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.backup.v1.ResourceServiceOuterClass.GetResourceRequest, yandex.cloud.api.backup.v1.ResourceServiceOuterClass.GetResourceResponse> getGetMethod;
    if ((getGetMethod = ResourceServiceGrpc.getGetMethod) == null) {
      synchronized (ResourceServiceGrpc.class) {
        if ((getGetMethod = ResourceServiceGrpc.getGetMethod) == null) {
          ResourceServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.backup.v1.ResourceServiceOuterClass.GetResourceRequest, yandex.cloud.api.backup.v1.ResourceServiceOuterClass.GetResourceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.backup.v1.ResourceServiceOuterClass.GetResourceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.backup.v1.ResourceServiceOuterClass.GetResourceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ResourceServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.backup.v1.ResourceServiceOuterClass.DeleteResourceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.backup.v1.ResourceServiceOuterClass.DeleteResourceRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.backup.v1.ResourceServiceOuterClass.DeleteResourceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.backup.v1.ResourceServiceOuterClass.DeleteResourceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = ResourceServiceGrpc.getDeleteMethod) == null) {
      synchronized (ResourceServiceGrpc.class) {
        if ((getDeleteMethod = ResourceServiceGrpc.getDeleteMethod) == null) {
          ResourceServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.backup.v1.ResourceServiceOuterClass.DeleteResourceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.backup.v1.ResourceServiceOuterClass.DeleteResourceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ResourceServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.backup.v1.ResourceServiceOuterClass.ListTasksRequest,
      yandex.cloud.api.backup.v1.ResourceServiceOuterClass.ListTasksResponse> getListTasksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListTasks",
      requestType = yandex.cloud.api.backup.v1.ResourceServiceOuterClass.ListTasksRequest.class,
      responseType = yandex.cloud.api.backup.v1.ResourceServiceOuterClass.ListTasksResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.backup.v1.ResourceServiceOuterClass.ListTasksRequest,
      yandex.cloud.api.backup.v1.ResourceServiceOuterClass.ListTasksResponse> getListTasksMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.backup.v1.ResourceServiceOuterClass.ListTasksRequest, yandex.cloud.api.backup.v1.ResourceServiceOuterClass.ListTasksResponse> getListTasksMethod;
    if ((getListTasksMethod = ResourceServiceGrpc.getListTasksMethod) == null) {
      synchronized (ResourceServiceGrpc.class) {
        if ((getListTasksMethod = ResourceServiceGrpc.getListTasksMethod) == null) {
          ResourceServiceGrpc.getListTasksMethod = getListTasksMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.backup.v1.ResourceServiceOuterClass.ListTasksRequest, yandex.cloud.api.backup.v1.ResourceServiceOuterClass.ListTasksResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListTasks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.backup.v1.ResourceServiceOuterClass.ListTasksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.backup.v1.ResourceServiceOuterClass.ListTasksResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ResourceServiceMethodDescriptorSupplier("ListTasks"))
              .build();
        }
      }
    }
    return getListTasksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.backup.v1.ResourceServiceOuterClass.ListDirectoryRequest,
      yandex.cloud.api.backup.v1.ResourceServiceOuterClass.ListDirectoryResponse> getListDirectoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDirectory",
      requestType = yandex.cloud.api.backup.v1.ResourceServiceOuterClass.ListDirectoryRequest.class,
      responseType = yandex.cloud.api.backup.v1.ResourceServiceOuterClass.ListDirectoryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.backup.v1.ResourceServiceOuterClass.ListDirectoryRequest,
      yandex.cloud.api.backup.v1.ResourceServiceOuterClass.ListDirectoryResponse> getListDirectoryMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.backup.v1.ResourceServiceOuterClass.ListDirectoryRequest, yandex.cloud.api.backup.v1.ResourceServiceOuterClass.ListDirectoryResponse> getListDirectoryMethod;
    if ((getListDirectoryMethod = ResourceServiceGrpc.getListDirectoryMethod) == null) {
      synchronized (ResourceServiceGrpc.class) {
        if ((getListDirectoryMethod = ResourceServiceGrpc.getListDirectoryMethod) == null) {
          ResourceServiceGrpc.getListDirectoryMethod = getListDirectoryMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.backup.v1.ResourceServiceOuterClass.ListDirectoryRequest, yandex.cloud.api.backup.v1.ResourceServiceOuterClass.ListDirectoryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListDirectory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.backup.v1.ResourceServiceOuterClass.ListDirectoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.backup.v1.ResourceServiceOuterClass.ListDirectoryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ResourceServiceMethodDescriptorSupplier("ListDirectory"))
              .build();
        }
      }
    }
    return getListDirectoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.backup.v1.ResourceServiceOuterClass.CreateDirectoryRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateDirectoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateDirectory",
      requestType = yandex.cloud.api.backup.v1.ResourceServiceOuterClass.CreateDirectoryRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.backup.v1.ResourceServiceOuterClass.CreateDirectoryRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateDirectoryMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.backup.v1.ResourceServiceOuterClass.CreateDirectoryRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateDirectoryMethod;
    if ((getCreateDirectoryMethod = ResourceServiceGrpc.getCreateDirectoryMethod) == null) {
      synchronized (ResourceServiceGrpc.class) {
        if ((getCreateDirectoryMethod = ResourceServiceGrpc.getCreateDirectoryMethod) == null) {
          ResourceServiceGrpc.getCreateDirectoryMethod = getCreateDirectoryMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.backup.v1.ResourceServiceOuterClass.CreateDirectoryRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateDirectory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.backup.v1.ResourceServiceOuterClass.CreateDirectoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ResourceServiceMethodDescriptorSupplier("CreateDirectory"))
              .build();
        }
      }
    }
    return getCreateDirectoryMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ResourceServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ResourceServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ResourceServiceStub>() {
        @java.lang.Override
        public ResourceServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ResourceServiceStub(channel, callOptions);
        }
      };
    return ResourceServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ResourceServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ResourceServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ResourceServiceBlockingStub>() {
        @java.lang.Override
        public ResourceServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ResourceServiceBlockingStub(channel, callOptions);
        }
      };
    return ResourceServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ResourceServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ResourceServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ResourceServiceFutureStub>() {
        @java.lang.Override
        public ResourceServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ResourceServiceFutureStub(channel, callOptions);
        }
      };
    return ResourceServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ResourceServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * List resources: [Compute Cloud instances](/docs/backup/concepts/vm-connection#os).
     * </pre>
     */
    public void list(yandex.cloud.api.backup.v1.ResourceServiceOuterClass.ListResourcesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.backup.v1.ResourceServiceOuterClass.ListResourcesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get specific Compute Cloud instance.
     * </pre>
     */
    public void get(yandex.cloud.api.backup.v1.ResourceServiceOuterClass.GetResourceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.backup.v1.ResourceServiceOuterClass.GetResourceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete specific Compute Cloud instance from Cloud Backup. It does not delete
     * instance from Cloud Compute service.
     * </pre>
     */
    public void delete(yandex.cloud.api.backup.v1.ResourceServiceOuterClass.DeleteResourceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * List tasks of resources.
     * </pre>
     */
    public void listTasks(yandex.cloud.api.backup.v1.ResourceServiceOuterClass.ListTasksRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.backup.v1.ResourceServiceOuterClass.ListTasksResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListTasksMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListDirectory returns all subdirectories found in requested directory identified
     * by the id.
     * </pre>
     */
    public void listDirectory(yandex.cloud.api.backup.v1.ResourceServiceOuterClass.ListDirectoryRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.backup.v1.ResourceServiceOuterClass.ListDirectoryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListDirectoryMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateDirectory creates new directory by requested path.
     * </pre>
     */
    public void createDirectory(yandex.cloud.api.backup.v1.ResourceServiceOuterClass.CreateDirectoryRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateDirectoryMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.backup.v1.ResourceServiceOuterClass.ListResourcesRequest,
                yandex.cloud.api.backup.v1.ResourceServiceOuterClass.ListResourcesResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.backup.v1.ResourceServiceOuterClass.GetResourceRequest,
                yandex.cloud.api.backup.v1.ResourceServiceOuterClass.GetResourceResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.backup.v1.ResourceServiceOuterClass.DeleteResourceRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListTasksMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.backup.v1.ResourceServiceOuterClass.ListTasksRequest,
                yandex.cloud.api.backup.v1.ResourceServiceOuterClass.ListTasksResponse>(
                  this, METHODID_LIST_TASKS)))
          .addMethod(
            getListDirectoryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.backup.v1.ResourceServiceOuterClass.ListDirectoryRequest,
                yandex.cloud.api.backup.v1.ResourceServiceOuterClass.ListDirectoryResponse>(
                  this, METHODID_LIST_DIRECTORY)))
          .addMethod(
            getCreateDirectoryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.backup.v1.ResourceServiceOuterClass.CreateDirectoryRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE_DIRECTORY)))
          .build();
    }
  }

  /**
   */
  public static final class ResourceServiceStub extends io.grpc.stub.AbstractAsyncStub<ResourceServiceStub> {
    private ResourceServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ResourceServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ResourceServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * List resources: [Compute Cloud instances](/docs/backup/concepts/vm-connection#os).
     * </pre>
     */
    public void list(yandex.cloud.api.backup.v1.ResourceServiceOuterClass.ListResourcesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.backup.v1.ResourceServiceOuterClass.ListResourcesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get specific Compute Cloud instance.
     * </pre>
     */
    public void get(yandex.cloud.api.backup.v1.ResourceServiceOuterClass.GetResourceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.backup.v1.ResourceServiceOuterClass.GetResourceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete specific Compute Cloud instance from Cloud Backup. It does not delete
     * instance from Cloud Compute service.
     * </pre>
     */
    public void delete(yandex.cloud.api.backup.v1.ResourceServiceOuterClass.DeleteResourceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List tasks of resources.
     * </pre>
     */
    public void listTasks(yandex.cloud.api.backup.v1.ResourceServiceOuterClass.ListTasksRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.backup.v1.ResourceServiceOuterClass.ListTasksResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListTasksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListDirectory returns all subdirectories found in requested directory identified
     * by the id.
     * </pre>
     */
    public void listDirectory(yandex.cloud.api.backup.v1.ResourceServiceOuterClass.ListDirectoryRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.backup.v1.ResourceServiceOuterClass.ListDirectoryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListDirectoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateDirectory creates new directory by requested path.
     * </pre>
     */
    public void createDirectory(yandex.cloud.api.backup.v1.ResourceServiceOuterClass.CreateDirectoryRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateDirectoryMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ResourceServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ResourceServiceBlockingStub> {
    private ResourceServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ResourceServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ResourceServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * List resources: [Compute Cloud instances](/docs/backup/concepts/vm-connection#os).
     * </pre>
     */
    public yandex.cloud.api.backup.v1.ResourceServiceOuterClass.ListResourcesResponse list(yandex.cloud.api.backup.v1.ResourceServiceOuterClass.ListResourcesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get specific Compute Cloud instance.
     * </pre>
     */
    public yandex.cloud.api.backup.v1.ResourceServiceOuterClass.GetResourceResponse get(yandex.cloud.api.backup.v1.ResourceServiceOuterClass.GetResourceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete specific Compute Cloud instance from Cloud Backup. It does not delete
     * instance from Cloud Compute service.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.backup.v1.ResourceServiceOuterClass.DeleteResourceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List tasks of resources.
     * </pre>
     */
    public yandex.cloud.api.backup.v1.ResourceServiceOuterClass.ListTasksResponse listTasks(yandex.cloud.api.backup.v1.ResourceServiceOuterClass.ListTasksRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListTasksMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListDirectory returns all subdirectories found in requested directory identified
     * by the id.
     * </pre>
     */
    public yandex.cloud.api.backup.v1.ResourceServiceOuterClass.ListDirectoryResponse listDirectory(yandex.cloud.api.backup.v1.ResourceServiceOuterClass.ListDirectoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListDirectoryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateDirectory creates new directory by requested path.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation createDirectory(yandex.cloud.api.backup.v1.ResourceServiceOuterClass.CreateDirectoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateDirectoryMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ResourceServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ResourceServiceFutureStub> {
    private ResourceServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ResourceServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ResourceServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * List resources: [Compute Cloud instances](/docs/backup/concepts/vm-connection#os).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.backup.v1.ResourceServiceOuterClass.ListResourcesResponse> list(
        yandex.cloud.api.backup.v1.ResourceServiceOuterClass.ListResourcesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get specific Compute Cloud instance.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.backup.v1.ResourceServiceOuterClass.GetResourceResponse> get(
        yandex.cloud.api.backup.v1.ResourceServiceOuterClass.GetResourceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete specific Compute Cloud instance from Cloud Backup. It does not delete
     * instance from Cloud Compute service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.backup.v1.ResourceServiceOuterClass.DeleteResourceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List tasks of resources.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.backup.v1.ResourceServiceOuterClass.ListTasksResponse> listTasks(
        yandex.cloud.api.backup.v1.ResourceServiceOuterClass.ListTasksRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListTasksMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListDirectory returns all subdirectories found in requested directory identified
     * by the id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.backup.v1.ResourceServiceOuterClass.ListDirectoryResponse> listDirectory(
        yandex.cloud.api.backup.v1.ResourceServiceOuterClass.ListDirectoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListDirectoryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateDirectory creates new directory by requested path.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> createDirectory(
        yandex.cloud.api.backup.v1.ResourceServiceOuterClass.CreateDirectoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateDirectoryMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST = 0;
  private static final int METHODID_GET = 1;
  private static final int METHODID_DELETE = 2;
  private static final int METHODID_LIST_TASKS = 3;
  private static final int METHODID_LIST_DIRECTORY = 4;
  private static final int METHODID_CREATE_DIRECTORY = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ResourceServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ResourceServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.backup.v1.ResourceServiceOuterClass.ListResourcesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.backup.v1.ResourceServiceOuterClass.ListResourcesResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.backup.v1.ResourceServiceOuterClass.GetResourceRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.backup.v1.ResourceServiceOuterClass.GetResourceResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.backup.v1.ResourceServiceOuterClass.DeleteResourceRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_TASKS:
          serviceImpl.listTasks((yandex.cloud.api.backup.v1.ResourceServiceOuterClass.ListTasksRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.backup.v1.ResourceServiceOuterClass.ListTasksResponse>) responseObserver);
          break;
        case METHODID_LIST_DIRECTORY:
          serviceImpl.listDirectory((yandex.cloud.api.backup.v1.ResourceServiceOuterClass.ListDirectoryRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.backup.v1.ResourceServiceOuterClass.ListDirectoryResponse>) responseObserver);
          break;
        case METHODID_CREATE_DIRECTORY:
          serviceImpl.createDirectory((yandex.cloud.api.backup.v1.ResourceServiceOuterClass.CreateDirectoryRequest) request,
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

  private static abstract class ResourceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ResourceServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.backup.v1.ResourceServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ResourceService");
    }
  }

  private static final class ResourceServiceFileDescriptorSupplier
      extends ResourceServiceBaseDescriptorSupplier {
    ResourceServiceFileDescriptorSupplier() {}
  }

  private static final class ResourceServiceMethodDescriptorSupplier
      extends ResourceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ResourceServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ResourceServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ResourceServiceFileDescriptorSupplier())
              .addMethod(getListMethod())
              .addMethod(getGetMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getListTasksMethod())
              .addMethod(getListDirectoryMethod())
              .addMethod(getCreateDirectoryMethod())
              .build();
        }
      }
    }
    return result;
  }
}
