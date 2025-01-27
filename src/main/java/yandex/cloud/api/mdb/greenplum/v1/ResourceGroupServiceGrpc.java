package yandex.cloud.api.mdb.greenplum.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/mdb/greenplum/v1/resource_groups_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ResourceGroupServiceGrpc {

  private ResourceGroupServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.mdb.greenplum.v1.ResourceGroupService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.greenplum.v1.ResourceGroupsService.ListResourceGroupsRequest,
      yandex.cloud.api.mdb.greenplum.v1.ResourceGroupsService.ListResourceGroupsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.mdb.greenplum.v1.ResourceGroupsService.ListResourceGroupsRequest.class,
      responseType = yandex.cloud.api.mdb.greenplum.v1.ResourceGroupsService.ListResourceGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.greenplum.v1.ResourceGroupsService.ListResourceGroupsRequest,
      yandex.cloud.api.mdb.greenplum.v1.ResourceGroupsService.ListResourceGroupsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.greenplum.v1.ResourceGroupsService.ListResourceGroupsRequest, yandex.cloud.api.mdb.greenplum.v1.ResourceGroupsService.ListResourceGroupsResponse> getListMethod;
    if ((getListMethod = ResourceGroupServiceGrpc.getListMethod) == null) {
      synchronized (ResourceGroupServiceGrpc.class) {
        if ((getListMethod = ResourceGroupServiceGrpc.getListMethod) == null) {
          ResourceGroupServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.greenplum.v1.ResourceGroupsService.ListResourceGroupsRequest, yandex.cloud.api.mdb.greenplum.v1.ResourceGroupsService.ListResourceGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.greenplum.v1.ResourceGroupsService.ListResourceGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.greenplum.v1.ResourceGroupsService.ListResourceGroupsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ResourceGroupServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.greenplum.v1.ResourceGroupsService.GetResourceGroupAtRevisionRequest,
      yandex.cloud.api.mdb.greenplum.v1.ResourceGroups.ResourceGroup> getGetAtRevisionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAtRevision",
      requestType = yandex.cloud.api.mdb.greenplum.v1.ResourceGroupsService.GetResourceGroupAtRevisionRequest.class,
      responseType = yandex.cloud.api.mdb.greenplum.v1.ResourceGroups.ResourceGroup.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.greenplum.v1.ResourceGroupsService.GetResourceGroupAtRevisionRequest,
      yandex.cloud.api.mdb.greenplum.v1.ResourceGroups.ResourceGroup> getGetAtRevisionMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.greenplum.v1.ResourceGroupsService.GetResourceGroupAtRevisionRequest, yandex.cloud.api.mdb.greenplum.v1.ResourceGroups.ResourceGroup> getGetAtRevisionMethod;
    if ((getGetAtRevisionMethod = ResourceGroupServiceGrpc.getGetAtRevisionMethod) == null) {
      synchronized (ResourceGroupServiceGrpc.class) {
        if ((getGetAtRevisionMethod = ResourceGroupServiceGrpc.getGetAtRevisionMethod) == null) {
          ResourceGroupServiceGrpc.getGetAtRevisionMethod = getGetAtRevisionMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.greenplum.v1.ResourceGroupsService.GetResourceGroupAtRevisionRequest, yandex.cloud.api.mdb.greenplum.v1.ResourceGroups.ResourceGroup>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAtRevision"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.greenplum.v1.ResourceGroupsService.GetResourceGroupAtRevisionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.greenplum.v1.ResourceGroups.ResourceGroup.getDefaultInstance()))
              .setSchemaDescriptor(new ResourceGroupServiceMethodDescriptorSupplier("GetAtRevision"))
              .build();
        }
      }
    }
    return getGetAtRevisionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.greenplum.v1.ResourceGroupsService.CreateResourceGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.mdb.greenplum.v1.ResourceGroupsService.CreateResourceGroupRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.greenplum.v1.ResourceGroupsService.CreateResourceGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.greenplum.v1.ResourceGroupsService.CreateResourceGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = ResourceGroupServiceGrpc.getCreateMethod) == null) {
      synchronized (ResourceGroupServiceGrpc.class) {
        if ((getCreateMethod = ResourceGroupServiceGrpc.getCreateMethod) == null) {
          ResourceGroupServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.greenplum.v1.ResourceGroupsService.CreateResourceGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.greenplum.v1.ResourceGroupsService.CreateResourceGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ResourceGroupServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.greenplum.v1.ResourceGroupsService.UpdateResourceGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.mdb.greenplum.v1.ResourceGroupsService.UpdateResourceGroupRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.greenplum.v1.ResourceGroupsService.UpdateResourceGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.greenplum.v1.ResourceGroupsService.UpdateResourceGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = ResourceGroupServiceGrpc.getUpdateMethod) == null) {
      synchronized (ResourceGroupServiceGrpc.class) {
        if ((getUpdateMethod = ResourceGroupServiceGrpc.getUpdateMethod) == null) {
          ResourceGroupServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.greenplum.v1.ResourceGroupsService.UpdateResourceGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.greenplum.v1.ResourceGroupsService.UpdateResourceGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ResourceGroupServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.greenplum.v1.ResourceGroupsService.DeleteResourceGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.mdb.greenplum.v1.ResourceGroupsService.DeleteResourceGroupRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.greenplum.v1.ResourceGroupsService.DeleteResourceGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.greenplum.v1.ResourceGroupsService.DeleteResourceGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = ResourceGroupServiceGrpc.getDeleteMethod) == null) {
      synchronized (ResourceGroupServiceGrpc.class) {
        if ((getDeleteMethod = ResourceGroupServiceGrpc.getDeleteMethod) == null) {
          ResourceGroupServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.greenplum.v1.ResourceGroupsService.DeleteResourceGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.greenplum.v1.ResourceGroupsService.DeleteResourceGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ResourceGroupServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ResourceGroupServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ResourceGroupServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ResourceGroupServiceStub>() {
        @java.lang.Override
        public ResourceGroupServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ResourceGroupServiceStub(channel, callOptions);
        }
      };
    return ResourceGroupServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ResourceGroupServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ResourceGroupServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ResourceGroupServiceBlockingStub>() {
        @java.lang.Override
        public ResourceGroupServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ResourceGroupServiceBlockingStub(channel, callOptions);
        }
      };
    return ResourceGroupServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ResourceGroupServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ResourceGroupServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ResourceGroupServiceFutureStub>() {
        @java.lang.Override
        public ResourceGroupServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ResourceGroupServiceFutureStub(channel, callOptions);
        }
      };
    return ResourceGroupServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ResourceGroupServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * List all resource group
     * </pre>
     */
    public void list(yandex.cloud.api.mdb.greenplum.v1.ResourceGroupsService.ListResourceGroupsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.greenplum.v1.ResourceGroupsService.ListResourceGroupsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the specified resource group at revision.
     * </pre>
     */
    public void getAtRevision(yandex.cloud.api.mdb.greenplum.v1.ResourceGroupsService.GetResourceGroupAtRevisionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.greenplum.v1.ResourceGroups.ResourceGroup> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAtRevisionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates resource group
     * </pre>
     */
    public void create(yandex.cloud.api.mdb.greenplum.v1.ResourceGroupsService.CreateResourceGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update resource group
     * </pre>
     */
    public void update(yandex.cloud.api.mdb.greenplum.v1.ResourceGroupsService.UpdateResourceGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete resource group
     * </pre>
     */
    public void delete(yandex.cloud.api.mdb.greenplum.v1.ResourceGroupsService.DeleteResourceGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.greenplum.v1.ResourceGroupsService.ListResourceGroupsRequest,
                yandex.cloud.api.mdb.greenplum.v1.ResourceGroupsService.ListResourceGroupsResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getGetAtRevisionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.greenplum.v1.ResourceGroupsService.GetResourceGroupAtRevisionRequest,
                yandex.cloud.api.mdb.greenplum.v1.ResourceGroups.ResourceGroup>(
                  this, METHODID_GET_AT_REVISION)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.greenplum.v1.ResourceGroupsService.CreateResourceGroupRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.greenplum.v1.ResourceGroupsService.UpdateResourceGroupRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.greenplum.v1.ResourceGroupsService.DeleteResourceGroupRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .build();
    }
  }

  /**
   */
  public static final class ResourceGroupServiceStub extends io.grpc.stub.AbstractAsyncStub<ResourceGroupServiceStub> {
    private ResourceGroupServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ResourceGroupServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ResourceGroupServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * List all resource group
     * </pre>
     */
    public void list(yandex.cloud.api.mdb.greenplum.v1.ResourceGroupsService.ListResourceGroupsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.greenplum.v1.ResourceGroupsService.ListResourceGroupsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the specified resource group at revision.
     * </pre>
     */
    public void getAtRevision(yandex.cloud.api.mdb.greenplum.v1.ResourceGroupsService.GetResourceGroupAtRevisionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.greenplum.v1.ResourceGroups.ResourceGroup> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAtRevisionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates resource group
     * </pre>
     */
    public void create(yandex.cloud.api.mdb.greenplum.v1.ResourceGroupsService.CreateResourceGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update resource group
     * </pre>
     */
    public void update(yandex.cloud.api.mdb.greenplum.v1.ResourceGroupsService.UpdateResourceGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete resource group
     * </pre>
     */
    public void delete(yandex.cloud.api.mdb.greenplum.v1.ResourceGroupsService.DeleteResourceGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ResourceGroupServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ResourceGroupServiceBlockingStub> {
    private ResourceGroupServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ResourceGroupServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ResourceGroupServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * List all resource group
     * </pre>
     */
    public yandex.cloud.api.mdb.greenplum.v1.ResourceGroupsService.ListResourceGroupsResponse list(yandex.cloud.api.mdb.greenplum.v1.ResourceGroupsService.ListResourceGroupsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the specified resource group at revision.
     * </pre>
     */
    public yandex.cloud.api.mdb.greenplum.v1.ResourceGroups.ResourceGroup getAtRevision(yandex.cloud.api.mdb.greenplum.v1.ResourceGroupsService.GetResourceGroupAtRevisionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAtRevisionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates resource group
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.mdb.greenplum.v1.ResourceGroupsService.CreateResourceGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update resource group
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.mdb.greenplum.v1.ResourceGroupsService.UpdateResourceGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete resource group
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.mdb.greenplum.v1.ResourceGroupsService.DeleteResourceGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ResourceGroupServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ResourceGroupServiceFutureStub> {
    private ResourceGroupServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ResourceGroupServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ResourceGroupServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * List all resource group
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.mdb.greenplum.v1.ResourceGroupsService.ListResourceGroupsResponse> list(
        yandex.cloud.api.mdb.greenplum.v1.ResourceGroupsService.ListResourceGroupsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the specified resource group at revision.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.mdb.greenplum.v1.ResourceGroups.ResourceGroup> getAtRevision(
        yandex.cloud.api.mdb.greenplum.v1.ResourceGroupsService.GetResourceGroupAtRevisionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAtRevisionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates resource group
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.mdb.greenplum.v1.ResourceGroupsService.CreateResourceGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update resource group
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.mdb.greenplum.v1.ResourceGroupsService.UpdateResourceGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete resource group
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.mdb.greenplum.v1.ResourceGroupsService.DeleteResourceGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST = 0;
  private static final int METHODID_GET_AT_REVISION = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_DELETE = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ResourceGroupServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ResourceGroupServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.mdb.greenplum.v1.ResourceGroupsService.ListResourceGroupsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.greenplum.v1.ResourceGroupsService.ListResourceGroupsResponse>) responseObserver);
          break;
        case METHODID_GET_AT_REVISION:
          serviceImpl.getAtRevision((yandex.cloud.api.mdb.greenplum.v1.ResourceGroupsService.GetResourceGroupAtRevisionRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.greenplum.v1.ResourceGroups.ResourceGroup>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.mdb.greenplum.v1.ResourceGroupsService.CreateResourceGroupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.mdb.greenplum.v1.ResourceGroupsService.UpdateResourceGroupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.mdb.greenplum.v1.ResourceGroupsService.DeleteResourceGroupRequest) request,
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

  private static abstract class ResourceGroupServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ResourceGroupServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.mdb.greenplum.v1.ResourceGroupsService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ResourceGroupService");
    }
  }

  private static final class ResourceGroupServiceFileDescriptorSupplier
      extends ResourceGroupServiceBaseDescriptorSupplier {
    ResourceGroupServiceFileDescriptorSupplier() {}
  }

  private static final class ResourceGroupServiceMethodDescriptorSupplier
      extends ResourceGroupServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ResourceGroupServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ResourceGroupServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ResourceGroupServiceFileDescriptorSupplier())
              .addMethod(getListMethod())
              .addMethod(getGetAtRevisionMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
