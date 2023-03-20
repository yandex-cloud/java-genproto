package yandex.cloud.api.organizationmanager.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * RPC service dedicated for federation group mapping.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/organizationmanager/v1/group_mapping_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class GroupMappingServiceGrpc {

  private GroupMappingServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.organizationmanager.v1.GroupMappingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.GetGroupMappingRequest,
      yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.GetGroupMappingResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.GetGroupMappingRequest.class,
      responseType = yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.GetGroupMappingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.GetGroupMappingRequest,
      yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.GetGroupMappingResponse> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.GetGroupMappingRequest, yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.GetGroupMappingResponse> getGetMethod;
    if ((getGetMethod = GroupMappingServiceGrpc.getGetMethod) == null) {
      synchronized (GroupMappingServiceGrpc.class) {
        if ((getGetMethod = GroupMappingServiceGrpc.getGetMethod) == null) {
          GroupMappingServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.GetGroupMappingRequest, yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.GetGroupMappingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.GetGroupMappingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.GetGroupMappingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GroupMappingServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.CreateGroupMappingRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.CreateGroupMappingRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.CreateGroupMappingRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.CreateGroupMappingRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = GroupMappingServiceGrpc.getCreateMethod) == null) {
      synchronized (GroupMappingServiceGrpc.class) {
        if ((getCreateMethod = GroupMappingServiceGrpc.getCreateMethod) == null) {
          GroupMappingServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.CreateGroupMappingRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.CreateGroupMappingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new GroupMappingServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.UpdateGroupMappingRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.UpdateGroupMappingRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.UpdateGroupMappingRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.UpdateGroupMappingRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = GroupMappingServiceGrpc.getUpdateMethod) == null) {
      synchronized (GroupMappingServiceGrpc.class) {
        if ((getUpdateMethod = GroupMappingServiceGrpc.getUpdateMethod) == null) {
          GroupMappingServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.UpdateGroupMappingRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.UpdateGroupMappingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new GroupMappingServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.DeleteGroupMappingRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.DeleteGroupMappingRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.DeleteGroupMappingRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.DeleteGroupMappingRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = GroupMappingServiceGrpc.getDeleteMethod) == null) {
      synchronized (GroupMappingServiceGrpc.class) {
        if ((getDeleteMethod = GroupMappingServiceGrpc.getDeleteMethod) == null) {
          GroupMappingServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.DeleteGroupMappingRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.DeleteGroupMappingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new GroupMappingServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.ListGroupMappingItemsRequest,
      yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.ListGroupMappingItemsResponse> getListItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListItems",
      requestType = yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.ListGroupMappingItemsRequest.class,
      responseType = yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.ListGroupMappingItemsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.ListGroupMappingItemsRequest,
      yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.ListGroupMappingItemsResponse> getListItemsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.ListGroupMappingItemsRequest, yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.ListGroupMappingItemsResponse> getListItemsMethod;
    if ((getListItemsMethod = GroupMappingServiceGrpc.getListItemsMethod) == null) {
      synchronized (GroupMappingServiceGrpc.class) {
        if ((getListItemsMethod = GroupMappingServiceGrpc.getListItemsMethod) == null) {
          GroupMappingServiceGrpc.getListItemsMethod = getListItemsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.ListGroupMappingItemsRequest, yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.ListGroupMappingItemsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.ListGroupMappingItemsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.ListGroupMappingItemsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GroupMappingServiceMethodDescriptorSupplier("ListItems"))
              .build();
        }
      }
    }
    return getListItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.UpdateGroupMappingItemsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateItems",
      requestType = yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.UpdateGroupMappingItemsRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.UpdateGroupMappingItemsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateItemsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.UpdateGroupMappingItemsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateItemsMethod;
    if ((getUpdateItemsMethod = GroupMappingServiceGrpc.getUpdateItemsMethod) == null) {
      synchronized (GroupMappingServiceGrpc.class) {
        if ((getUpdateItemsMethod = GroupMappingServiceGrpc.getUpdateItemsMethod) == null) {
          GroupMappingServiceGrpc.getUpdateItemsMethod = getUpdateItemsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.UpdateGroupMappingItemsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.UpdateGroupMappingItemsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new GroupMappingServiceMethodDescriptorSupplier("UpdateItems"))
              .build();
        }
      }
    }
    return getUpdateItemsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GroupMappingServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GroupMappingServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GroupMappingServiceStub>() {
        @java.lang.Override
        public GroupMappingServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GroupMappingServiceStub(channel, callOptions);
        }
      };
    return GroupMappingServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GroupMappingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GroupMappingServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GroupMappingServiceBlockingStub>() {
        @java.lang.Override
        public GroupMappingServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GroupMappingServiceBlockingStub(channel, callOptions);
        }
      };
    return GroupMappingServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GroupMappingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GroupMappingServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GroupMappingServiceFutureStub>() {
        @java.lang.Override
        public GroupMappingServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GroupMappingServiceFutureStub(channel, callOptions);
        }
      };
    return GroupMappingServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * RPC service dedicated for federation group mapping.
   * </pre>
   */
  public static abstract class GroupMappingServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns a group mapping configured for the specific federation
     * If a federation does not exist this call will return an error
     *    NOT_FOUND will be returned
     * If a federation exist, but has not ever been configured for group mapping
     *   the call FAILED_PRECONDITION will be returned.
     * </pre>
     */
    public void get(yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.GetGroupMappingRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.GetGroupMappingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Adds a group mapping for a federation
     * If mapping already exist, ALREADY_EXISTS will be returned
     * </pre>
     */
    public void create(yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.CreateGroupMappingRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates an existing group mapping for a federation
     * Errors:
     * - if federation is not found
     * In case of any error, no changes are applied to existing group mapping
     * This call is idempotent. The following actions do nothing:
     * - enabling when already enabled
     * - disabling when disabled
     * Such parts of request will be ignored. Others will be applied.
     * </pre>
     */
    public void update(yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.UpdateGroupMappingRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes a group mapping. This will remove all the mapping items
     * cascade.
     * </pre>
     */
    public void delete(yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.DeleteGroupMappingRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns all the group mappings items
     * Filtering is only supported by external_group_id or internal_group_id
     * </pre>
     */
    public void listItems(yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.ListGroupMappingItemsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.ListGroupMappingItemsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListItemsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates group mapping items for a specified federation
     * Errors:
     * - if federation is not found
     * - if internal group in the mapping added does not exist
     * In case of any error, no changes are applied to existing group mapping
     * This call is idempotent. The following actions do nothing:
     * - adding group mapping items that are already present
     * - removing group mapping items that are not present
     * Such parts of request will be ignored. Others will be applied.
     * </pre>
     */
    public void updateItems(yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.UpdateGroupMappingItemsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateItemsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.GetGroupMappingRequest,
                yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.GetGroupMappingResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.CreateGroupMappingRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.UpdateGroupMappingRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.DeleteGroupMappingRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListItemsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.ListGroupMappingItemsRequest,
                yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.ListGroupMappingItemsResponse>(
                  this, METHODID_LIST_ITEMS)))
          .addMethod(
            getUpdateItemsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.UpdateGroupMappingItemsRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE_ITEMS)))
          .build();
    }
  }

  /**
   * <pre>
   * RPC service dedicated for federation group mapping.
   * </pre>
   */
  public static final class GroupMappingServiceStub extends io.grpc.stub.AbstractAsyncStub<GroupMappingServiceStub> {
    private GroupMappingServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GroupMappingServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GroupMappingServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns a group mapping configured for the specific federation
     * If a federation does not exist this call will return an error
     *    NOT_FOUND will be returned
     * If a federation exist, but has not ever been configured for group mapping
     *   the call FAILED_PRECONDITION will be returned.
     * </pre>
     */
    public void get(yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.GetGroupMappingRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.GetGroupMappingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Adds a group mapping for a federation
     * If mapping already exist, ALREADY_EXISTS will be returned
     * </pre>
     */
    public void create(yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.CreateGroupMappingRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates an existing group mapping for a federation
     * Errors:
     * - if federation is not found
     * In case of any error, no changes are applied to existing group mapping
     * This call is idempotent. The following actions do nothing:
     * - enabling when already enabled
     * - disabling when disabled
     * Such parts of request will be ignored. Others will be applied.
     * </pre>
     */
    public void update(yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.UpdateGroupMappingRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a group mapping. This will remove all the mapping items
     * cascade.
     * </pre>
     */
    public void delete(yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.DeleteGroupMappingRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns all the group mappings items
     * Filtering is only supported by external_group_id or internal_group_id
     * </pre>
     */
    public void listItems(yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.ListGroupMappingItemsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.ListGroupMappingItemsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates group mapping items for a specified federation
     * Errors:
     * - if federation is not found
     * - if internal group in the mapping added does not exist
     * In case of any error, no changes are applied to existing group mapping
     * This call is idempotent. The following actions do nothing:
     * - adding group mapping items that are already present
     * - removing group mapping items that are not present
     * Such parts of request will be ignored. Others will be applied.
     * </pre>
     */
    public void updateItems(yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.UpdateGroupMappingItemsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateItemsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * RPC service dedicated for federation group mapping.
   * </pre>
   */
  public static final class GroupMappingServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<GroupMappingServiceBlockingStub> {
    private GroupMappingServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GroupMappingServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GroupMappingServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns a group mapping configured for the specific federation
     * If a federation does not exist this call will return an error
     *    NOT_FOUND will be returned
     * If a federation exist, but has not ever been configured for group mapping
     *   the call FAILED_PRECONDITION will be returned.
     * </pre>
     */
    public yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.GetGroupMappingResponse get(yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.GetGroupMappingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Adds a group mapping for a federation
     * If mapping already exist, ALREADY_EXISTS will be returned
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.CreateGroupMappingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates an existing group mapping for a federation
     * Errors:
     * - if federation is not found
     * In case of any error, no changes are applied to existing group mapping
     * This call is idempotent. The following actions do nothing:
     * - enabling when already enabled
     * - disabling when disabled
     * Such parts of request will be ignored. Others will be applied.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.UpdateGroupMappingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a group mapping. This will remove all the mapping items
     * cascade.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.DeleteGroupMappingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns all the group mappings items
     * Filtering is only supported by external_group_id or internal_group_id
     * </pre>
     */
    public yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.ListGroupMappingItemsResponse listItems(yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.ListGroupMappingItemsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListItemsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates group mapping items for a specified federation
     * Errors:
     * - if federation is not found
     * - if internal group in the mapping added does not exist
     * In case of any error, no changes are applied to existing group mapping
     * This call is idempotent. The following actions do nothing:
     * - adding group mapping items that are already present
     * - removing group mapping items that are not present
     * Such parts of request will be ignored. Others will be applied.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation updateItems(yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.UpdateGroupMappingItemsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateItemsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * RPC service dedicated for federation group mapping.
   * </pre>
   */
  public static final class GroupMappingServiceFutureStub extends io.grpc.stub.AbstractFutureStub<GroupMappingServiceFutureStub> {
    private GroupMappingServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GroupMappingServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GroupMappingServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns a group mapping configured for the specific federation
     * If a federation does not exist this call will return an error
     *    NOT_FOUND will be returned
     * If a federation exist, but has not ever been configured for group mapping
     *   the call FAILED_PRECONDITION will be returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.GetGroupMappingResponse> get(
        yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.GetGroupMappingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Adds a group mapping for a federation
     * If mapping already exist, ALREADY_EXISTS will be returned
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.CreateGroupMappingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates an existing group mapping for a federation
     * Errors:
     * - if federation is not found
     * In case of any error, no changes are applied to existing group mapping
     * This call is idempotent. The following actions do nothing:
     * - enabling when already enabled
     * - disabling when disabled
     * Such parts of request will be ignored. Others will be applied.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.UpdateGroupMappingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a group mapping. This will remove all the mapping items
     * cascade.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.DeleteGroupMappingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns all the group mappings items
     * Filtering is only supported by external_group_id or internal_group_id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.ListGroupMappingItemsResponse> listItems(
        yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.ListGroupMappingItemsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListItemsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates group mapping items for a specified federation
     * Errors:
     * - if federation is not found
     * - if internal group in the mapping added does not exist
     * In case of any error, no changes are applied to existing group mapping
     * This call is idempotent. The following actions do nothing:
     * - adding group mapping items that are already present
     * - removing group mapping items that are not present
     * Such parts of request will be ignored. Others will be applied.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> updateItems(
        yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.UpdateGroupMappingItemsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateItemsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_CREATE = 1;
  private static final int METHODID_UPDATE = 2;
  private static final int METHODID_DELETE = 3;
  private static final int METHODID_LIST_ITEMS = 4;
  private static final int METHODID_UPDATE_ITEMS = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GroupMappingServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GroupMappingServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.GetGroupMappingRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.GetGroupMappingResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.CreateGroupMappingRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.UpdateGroupMappingRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.DeleteGroupMappingRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_ITEMS:
          serviceImpl.listItems((yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.ListGroupMappingItemsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.ListGroupMappingItemsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ITEMS:
          serviceImpl.updateItems((yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.UpdateGroupMappingItemsRequest) request,
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

  private static abstract class GroupMappingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GroupMappingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.organizationmanager.v1.GroupMappingServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GroupMappingService");
    }
  }

  private static final class GroupMappingServiceFileDescriptorSupplier
      extends GroupMappingServiceBaseDescriptorSupplier {
    GroupMappingServiceFileDescriptorSupplier() {}
  }

  private static final class GroupMappingServiceMethodDescriptorSupplier
      extends GroupMappingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GroupMappingServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (GroupMappingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GroupMappingServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getListItemsMethod())
              .addMethod(getUpdateItemsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
