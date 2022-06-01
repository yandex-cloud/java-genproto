package yandex.cloud.api.loadbalancer.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing TargetGroup resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/loadbalancer/v1/target_group_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TargetGroupServiceGrpc {

  private TargetGroupServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.loadbalancer.v1.TargetGroupService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.GetTargetGroupRequest,
      yandex.cloud.api.loadbalancer.v1.TargetGroupOuterClass.TargetGroup> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.GetTargetGroupRequest.class,
      responseType = yandex.cloud.api.loadbalancer.v1.TargetGroupOuterClass.TargetGroup.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.GetTargetGroupRequest,
      yandex.cloud.api.loadbalancer.v1.TargetGroupOuterClass.TargetGroup> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.GetTargetGroupRequest, yandex.cloud.api.loadbalancer.v1.TargetGroupOuterClass.TargetGroup> getGetMethod;
    if ((getGetMethod = TargetGroupServiceGrpc.getGetMethod) == null) {
      synchronized (TargetGroupServiceGrpc.class) {
        if ((getGetMethod = TargetGroupServiceGrpc.getGetMethod) == null) {
          TargetGroupServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.GetTargetGroupRequest, yandex.cloud.api.loadbalancer.v1.TargetGroupOuterClass.TargetGroup>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.GetTargetGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.loadbalancer.v1.TargetGroupOuterClass.TargetGroup.getDefaultInstance()))
              .setSchemaDescriptor(new TargetGroupServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupsRequest,
      yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupsRequest.class,
      responseType = yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupsRequest,
      yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupsRequest, yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupsResponse> getListMethod;
    if ((getListMethod = TargetGroupServiceGrpc.getListMethod) == null) {
      synchronized (TargetGroupServiceGrpc.class) {
        if ((getListMethod = TargetGroupServiceGrpc.getListMethod) == null) {
          TargetGroupServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupsRequest, yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TargetGroupServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.CreateTargetGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.CreateTargetGroupRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.CreateTargetGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.CreateTargetGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = TargetGroupServiceGrpc.getCreateMethod) == null) {
      synchronized (TargetGroupServiceGrpc.class) {
        if ((getCreateMethod = TargetGroupServiceGrpc.getCreateMethod) == null) {
          TargetGroupServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.CreateTargetGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.CreateTargetGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new TargetGroupServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.UpdateTargetGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.UpdateTargetGroupRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.UpdateTargetGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.UpdateTargetGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = TargetGroupServiceGrpc.getUpdateMethod) == null) {
      synchronized (TargetGroupServiceGrpc.class) {
        if ((getUpdateMethod = TargetGroupServiceGrpc.getUpdateMethod) == null) {
          TargetGroupServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.UpdateTargetGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.UpdateTargetGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new TargetGroupServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.DeleteTargetGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.DeleteTargetGroupRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.DeleteTargetGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.DeleteTargetGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = TargetGroupServiceGrpc.getDeleteMethod) == null) {
      synchronized (TargetGroupServiceGrpc.class) {
        if ((getDeleteMethod = TargetGroupServiceGrpc.getDeleteMethod) == null) {
          TargetGroupServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.DeleteTargetGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.DeleteTargetGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new TargetGroupServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.AddTargetsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getAddTargetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddTargets",
      requestType = yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.AddTargetsRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.AddTargetsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getAddTargetsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.AddTargetsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getAddTargetsMethod;
    if ((getAddTargetsMethod = TargetGroupServiceGrpc.getAddTargetsMethod) == null) {
      synchronized (TargetGroupServiceGrpc.class) {
        if ((getAddTargetsMethod = TargetGroupServiceGrpc.getAddTargetsMethod) == null) {
          TargetGroupServiceGrpc.getAddTargetsMethod = getAddTargetsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.AddTargetsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddTargets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.AddTargetsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new TargetGroupServiceMethodDescriptorSupplier("AddTargets"))
              .build();
        }
      }
    }
    return getAddTargetsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.RemoveTargetsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRemoveTargetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveTargets",
      requestType = yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.RemoveTargetsRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.RemoveTargetsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRemoveTargetsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.RemoveTargetsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getRemoveTargetsMethod;
    if ((getRemoveTargetsMethod = TargetGroupServiceGrpc.getRemoveTargetsMethod) == null) {
      synchronized (TargetGroupServiceGrpc.class) {
        if ((getRemoveTargetsMethod = TargetGroupServiceGrpc.getRemoveTargetsMethod) == null) {
          TargetGroupServiceGrpc.getRemoveTargetsMethod = getRemoveTargetsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.RemoveTargetsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveTargets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.RemoveTargetsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new TargetGroupServiceMethodDescriptorSupplier("RemoveTargets"))
              .build();
        }
      }
    }
    return getRemoveTargetsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupOperationsRequest,
      yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupOperationsResponse> getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupOperationsRequest.class,
      responseType = yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupOperationsRequest,
      yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupOperationsResponse> getListOperationsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupOperationsRequest, yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupOperationsResponse> getListOperationsMethod;
    if ((getListOperationsMethod = TargetGroupServiceGrpc.getListOperationsMethod) == null) {
      synchronized (TargetGroupServiceGrpc.class) {
        if ((getListOperationsMethod = TargetGroupServiceGrpc.getListOperationsMethod) == null) {
          TargetGroupServiceGrpc.getListOperationsMethod = getListOperationsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupOperationsRequest, yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupOperationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TargetGroupServiceMethodDescriptorSupplier("ListOperations"))
              .build();
        }
      }
    }
    return getListOperationsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TargetGroupServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TargetGroupServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TargetGroupServiceStub>() {
        @java.lang.Override
        public TargetGroupServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TargetGroupServiceStub(channel, callOptions);
        }
      };
    return TargetGroupServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TargetGroupServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TargetGroupServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TargetGroupServiceBlockingStub>() {
        @java.lang.Override
        public TargetGroupServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TargetGroupServiceBlockingStub(channel, callOptions);
        }
      };
    return TargetGroupServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TargetGroupServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TargetGroupServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TargetGroupServiceFutureStub>() {
        @java.lang.Override
        public TargetGroupServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TargetGroupServiceFutureStub(channel, callOptions);
        }
      };
    return TargetGroupServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing TargetGroup resources.
   * </pre>
   */
  public static abstract class TargetGroupServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified TargetGroup resource.
     * </pre>
     */
    public void get(yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.GetTargetGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.loadbalancer.v1.TargetGroupOuterClass.TargetGroup> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of TargetGroup resources in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a target group in the specified folder and adds the specified targets to it.
     * </pre>
     */
    public void create(yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.CreateTargetGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified target group.
     * </pre>
     */
    public void update(yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.UpdateTargetGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified target group.
     * </pre>
     */
    public void delete(yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.DeleteTargetGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Adds targets to the target group.
     * </pre>
     */
    public void addTargets(yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.AddTargetsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddTargetsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Removes targets from the target group.
     * </pre>
     */
    public void removeTargets(yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.RemoveTargetsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveTargetsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified target group.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupOperationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.GetTargetGroupRequest,
                yandex.cloud.api.loadbalancer.v1.TargetGroupOuterClass.TargetGroup>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupsRequest,
                yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupsResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.CreateTargetGroupRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.UpdateTargetGroupRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.DeleteTargetGroupRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getAddTargetsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.AddTargetsRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_ADD_TARGETS)))
          .addMethod(
            getRemoveTargetsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.RemoveTargetsRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_REMOVE_TARGETS)))
          .addMethod(
            getListOperationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupOperationsRequest,
                yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupOperationsResponse>(
                  this, METHODID_LIST_OPERATIONS)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing TargetGroup resources.
   * </pre>
   */
  public static final class TargetGroupServiceStub extends io.grpc.stub.AbstractAsyncStub<TargetGroupServiceStub> {
    private TargetGroupServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TargetGroupServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TargetGroupServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified TargetGroup resource.
     * </pre>
     */
    public void get(yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.GetTargetGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.loadbalancer.v1.TargetGroupOuterClass.TargetGroup> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of TargetGroup resources in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a target group in the specified folder and adds the specified targets to it.
     * </pre>
     */
    public void create(yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.CreateTargetGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified target group.
     * </pre>
     */
    public void update(yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.UpdateTargetGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified target group.
     * </pre>
     */
    public void delete(yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.DeleteTargetGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Adds targets to the target group.
     * </pre>
     */
    public void addTargets(yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.AddTargetsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddTargetsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Removes targets from the target group.
     * </pre>
     */
    public void removeTargets(yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.RemoveTargetsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveTargetsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified target group.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupOperationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing TargetGroup resources.
   * </pre>
   */
  public static final class TargetGroupServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<TargetGroupServiceBlockingStub> {
    private TargetGroupServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TargetGroupServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TargetGroupServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified TargetGroup resource.
     * </pre>
     */
    public yandex.cloud.api.loadbalancer.v1.TargetGroupOuterClass.TargetGroup get(yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.GetTargetGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of TargetGroup resources in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupsResponse list(yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a target group in the specified folder and adds the specified targets to it.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.CreateTargetGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified target group.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.UpdateTargetGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified target group.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.DeleteTargetGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Adds targets to the target group.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation addTargets(yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.AddTargetsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddTargetsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Removes targets from the target group.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation removeTargets(yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.RemoveTargetsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveTargetsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists operations for the specified target group.
     * </pre>
     */
    public yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupOperationsResponse listOperations(yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupOperationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing TargetGroup resources.
   * </pre>
   */
  public static final class TargetGroupServiceFutureStub extends io.grpc.stub.AbstractFutureStub<TargetGroupServiceFutureStub> {
    private TargetGroupServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TargetGroupServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TargetGroupServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified TargetGroup resource.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.loadbalancer.v1.TargetGroupOuterClass.TargetGroup> get(
        yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.GetTargetGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of TargetGroup resources in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupsResponse> list(
        yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a target group in the specified folder and adds the specified targets to it.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.CreateTargetGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified target group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.UpdateTargetGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified target group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.DeleteTargetGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Adds targets to the target group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> addTargets(
        yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.AddTargetsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddTargetsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Removes targets from the target group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> removeTargets(
        yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.RemoveTargetsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveTargetsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists operations for the specified target group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupOperationsResponse> listOperations(
        yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupOperationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_DELETE = 4;
  private static final int METHODID_ADD_TARGETS = 5;
  private static final int METHODID_REMOVE_TARGETS = 6;
  private static final int METHODID_LIST_OPERATIONS = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TargetGroupServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TargetGroupServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.GetTargetGroupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.loadbalancer.v1.TargetGroupOuterClass.TargetGroup>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupsResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.CreateTargetGroupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.UpdateTargetGroupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.DeleteTargetGroupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_ADD_TARGETS:
          serviceImpl.addTargets((yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.AddTargetsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_REMOVE_TARGETS:
          serviceImpl.removeTargets((yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.RemoveTargetsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupOperationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupOperationsResponse>) responseObserver);
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

  private static abstract class TargetGroupServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TargetGroupServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.loadbalancer.v1.TargetGroupServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TargetGroupService");
    }
  }

  private static final class TargetGroupServiceFileDescriptorSupplier
      extends TargetGroupServiceBaseDescriptorSupplier {
    TargetGroupServiceFileDescriptorSupplier() {}
  }

  private static final class TargetGroupServiceMethodDescriptorSupplier
      extends TargetGroupServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TargetGroupServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TargetGroupServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TargetGroupServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getAddTargetsMethod())
              .addMethod(getRemoveTargetsMethod())
              .addMethod(getListOperationsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
