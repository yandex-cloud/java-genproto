package yandex.cloud.api.compute.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing DiskPlacementGroup resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/compute/v1/disk_placement_group_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DiskPlacementGroupServiceGrpc {

  private DiskPlacementGroupServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.compute.v1.DiskPlacementGroupService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.GetDiskPlacementGroupRequest,
      yandex.cloud.api.compute.v1.DiskPlacementGroupOuterClass.DiskPlacementGroup> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.GetDiskPlacementGroupRequest.class,
      responseType = yandex.cloud.api.compute.v1.DiskPlacementGroupOuterClass.DiskPlacementGroup.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.GetDiskPlacementGroupRequest,
      yandex.cloud.api.compute.v1.DiskPlacementGroupOuterClass.DiskPlacementGroup> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.GetDiskPlacementGroupRequest, yandex.cloud.api.compute.v1.DiskPlacementGroupOuterClass.DiskPlacementGroup> getGetMethod;
    if ((getGetMethod = DiskPlacementGroupServiceGrpc.getGetMethod) == null) {
      synchronized (DiskPlacementGroupServiceGrpc.class) {
        if ((getGetMethod = DiskPlacementGroupServiceGrpc.getGetMethod) == null) {
          DiskPlacementGroupServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.GetDiskPlacementGroupRequest, yandex.cloud.api.compute.v1.DiskPlacementGroupOuterClass.DiskPlacementGroup>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.GetDiskPlacementGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.DiskPlacementGroupOuterClass.DiskPlacementGroup.getDefaultInstance()))
              .setSchemaDescriptor(new DiskPlacementGroupServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.ListDiskPlacementGroupsRequest,
      yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.ListDiskPlacementGroupsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.ListDiskPlacementGroupsRequest.class,
      responseType = yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.ListDiskPlacementGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.ListDiskPlacementGroupsRequest,
      yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.ListDiskPlacementGroupsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.ListDiskPlacementGroupsRequest, yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.ListDiskPlacementGroupsResponse> getListMethod;
    if ((getListMethod = DiskPlacementGroupServiceGrpc.getListMethod) == null) {
      synchronized (DiskPlacementGroupServiceGrpc.class) {
        if ((getListMethod = DiskPlacementGroupServiceGrpc.getListMethod) == null) {
          DiskPlacementGroupServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.ListDiskPlacementGroupsRequest, yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.ListDiskPlacementGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.ListDiskPlacementGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.ListDiskPlacementGroupsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DiskPlacementGroupServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.CreateDiskPlacementGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.CreateDiskPlacementGroupRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.CreateDiskPlacementGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.CreateDiskPlacementGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = DiskPlacementGroupServiceGrpc.getCreateMethod) == null) {
      synchronized (DiskPlacementGroupServiceGrpc.class) {
        if ((getCreateMethod = DiskPlacementGroupServiceGrpc.getCreateMethod) == null) {
          DiskPlacementGroupServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.CreateDiskPlacementGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.CreateDiskPlacementGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new DiskPlacementGroupServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.UpdateDiskPlacementGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.UpdateDiskPlacementGroupRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.UpdateDiskPlacementGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.UpdateDiskPlacementGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = DiskPlacementGroupServiceGrpc.getUpdateMethod) == null) {
      synchronized (DiskPlacementGroupServiceGrpc.class) {
        if ((getUpdateMethod = DiskPlacementGroupServiceGrpc.getUpdateMethod) == null) {
          DiskPlacementGroupServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.UpdateDiskPlacementGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.UpdateDiskPlacementGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new DiskPlacementGroupServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.DeleteDiskPlacementGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.DeleteDiskPlacementGroupRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.DeleteDiskPlacementGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.DeleteDiskPlacementGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = DiskPlacementGroupServiceGrpc.getDeleteMethod) == null) {
      synchronized (DiskPlacementGroupServiceGrpc.class) {
        if ((getDeleteMethod = DiskPlacementGroupServiceGrpc.getDeleteMethod) == null) {
          DiskPlacementGroupServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.DeleteDiskPlacementGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.DeleteDiskPlacementGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new DiskPlacementGroupServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.ListDiskPlacementGroupDisksRequest,
      yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.ListDiskPlacementGroupDisksResponse> getListDisksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDisks",
      requestType = yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.ListDiskPlacementGroupDisksRequest.class,
      responseType = yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.ListDiskPlacementGroupDisksResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.ListDiskPlacementGroupDisksRequest,
      yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.ListDiskPlacementGroupDisksResponse> getListDisksMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.ListDiskPlacementGroupDisksRequest, yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.ListDiskPlacementGroupDisksResponse> getListDisksMethod;
    if ((getListDisksMethod = DiskPlacementGroupServiceGrpc.getListDisksMethod) == null) {
      synchronized (DiskPlacementGroupServiceGrpc.class) {
        if ((getListDisksMethod = DiskPlacementGroupServiceGrpc.getListDisksMethod) == null) {
          DiskPlacementGroupServiceGrpc.getListDisksMethod = getListDisksMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.ListDiskPlacementGroupDisksRequest, yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.ListDiskPlacementGroupDisksResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListDisks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.ListDiskPlacementGroupDisksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.ListDiskPlacementGroupDisksResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DiskPlacementGroupServiceMethodDescriptorSupplier("ListDisks"))
              .build();
        }
      }
    }
    return getListDisksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.ListDiskPlacementGroupOperationsRequest,
      yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.ListDiskPlacementGroupOperationsResponse> getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.ListDiskPlacementGroupOperationsRequest.class,
      responseType = yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.ListDiskPlacementGroupOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.ListDiskPlacementGroupOperationsRequest,
      yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.ListDiskPlacementGroupOperationsResponse> getListOperationsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.ListDiskPlacementGroupOperationsRequest, yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.ListDiskPlacementGroupOperationsResponse> getListOperationsMethod;
    if ((getListOperationsMethod = DiskPlacementGroupServiceGrpc.getListOperationsMethod) == null) {
      synchronized (DiskPlacementGroupServiceGrpc.class) {
        if ((getListOperationsMethod = DiskPlacementGroupServiceGrpc.getListOperationsMethod) == null) {
          DiskPlacementGroupServiceGrpc.getListOperationsMethod = getListOperationsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.ListDiskPlacementGroupOperationsRequest, yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.ListDiskPlacementGroupOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.ListDiskPlacementGroupOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.ListDiskPlacementGroupOperationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DiskPlacementGroupServiceMethodDescriptorSupplier("ListOperations"))
              .build();
        }
      }
    }
    return getListOperationsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DiskPlacementGroupServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DiskPlacementGroupServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DiskPlacementGroupServiceStub>() {
        @java.lang.Override
        public DiskPlacementGroupServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DiskPlacementGroupServiceStub(channel, callOptions);
        }
      };
    return DiskPlacementGroupServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DiskPlacementGroupServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DiskPlacementGroupServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DiskPlacementGroupServiceBlockingStub>() {
        @java.lang.Override
        public DiskPlacementGroupServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DiskPlacementGroupServiceBlockingStub(channel, callOptions);
        }
      };
    return DiskPlacementGroupServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DiskPlacementGroupServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DiskPlacementGroupServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DiskPlacementGroupServiceFutureStub>() {
        @java.lang.Override
        public DiskPlacementGroupServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DiskPlacementGroupServiceFutureStub(channel, callOptions);
        }
      };
    return DiskPlacementGroupServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing DiskPlacementGroup resources.
   * </pre>
   */
  public static abstract class DiskPlacementGroupServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified placement group.
     * </pre>
     */
    public void get(yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.GetDiskPlacementGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.DiskPlacementGroupOuterClass.DiskPlacementGroup> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of placement groups in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.ListDiskPlacementGroupsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.ListDiskPlacementGroupsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a placement group in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.CreateDiskPlacementGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified placement group.
     * </pre>
     */
    public void update(yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.UpdateDiskPlacementGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified placement group.
     * </pre>
     */
    public void delete(yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.DeleteDiskPlacementGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists disks for the specified placement group.
     * </pre>
     */
    public void listDisks(yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.ListDiskPlacementGroupDisksRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.ListDiskPlacementGroupDisksResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListDisksMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified placement group.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.ListDiskPlacementGroupOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.ListDiskPlacementGroupOperationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.GetDiskPlacementGroupRequest,
                yandex.cloud.api.compute.v1.DiskPlacementGroupOuterClass.DiskPlacementGroup>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.ListDiskPlacementGroupsRequest,
                yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.ListDiskPlacementGroupsResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.CreateDiskPlacementGroupRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.UpdateDiskPlacementGroupRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.DeleteDiskPlacementGroupRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListDisksMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.ListDiskPlacementGroupDisksRequest,
                yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.ListDiskPlacementGroupDisksResponse>(
                  this, METHODID_LIST_DISKS)))
          .addMethod(
            getListOperationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.ListDiskPlacementGroupOperationsRequest,
                yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.ListDiskPlacementGroupOperationsResponse>(
                  this, METHODID_LIST_OPERATIONS)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing DiskPlacementGroup resources.
   * </pre>
   */
  public static final class DiskPlacementGroupServiceStub extends io.grpc.stub.AbstractAsyncStub<DiskPlacementGroupServiceStub> {
    private DiskPlacementGroupServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DiskPlacementGroupServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DiskPlacementGroupServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified placement group.
     * </pre>
     */
    public void get(yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.GetDiskPlacementGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.DiskPlacementGroupOuterClass.DiskPlacementGroup> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of placement groups in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.ListDiskPlacementGroupsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.ListDiskPlacementGroupsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a placement group in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.CreateDiskPlacementGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified placement group.
     * </pre>
     */
    public void update(yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.UpdateDiskPlacementGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified placement group.
     * </pre>
     */
    public void delete(yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.DeleteDiskPlacementGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists disks for the specified placement group.
     * </pre>
     */
    public void listDisks(yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.ListDiskPlacementGroupDisksRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.ListDiskPlacementGroupDisksResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListDisksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified placement group.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.ListDiskPlacementGroupOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.ListDiskPlacementGroupOperationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing DiskPlacementGroup resources.
   * </pre>
   */
  public static final class DiskPlacementGroupServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<DiskPlacementGroupServiceBlockingStub> {
    private DiskPlacementGroupServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DiskPlacementGroupServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DiskPlacementGroupServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified placement group.
     * </pre>
     */
    public yandex.cloud.api.compute.v1.DiskPlacementGroupOuterClass.DiskPlacementGroup get(yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.GetDiskPlacementGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of placement groups in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.ListDiskPlacementGroupsResponse list(yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.ListDiskPlacementGroupsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a placement group in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.CreateDiskPlacementGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified placement group.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.UpdateDiskPlacementGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified placement group.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.DeleteDiskPlacementGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists disks for the specified placement group.
     * </pre>
     */
    public yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.ListDiskPlacementGroupDisksResponse listDisks(yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.ListDiskPlacementGroupDisksRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListDisksMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists operations for the specified placement group.
     * </pre>
     */
    public yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.ListDiskPlacementGroupOperationsResponse listOperations(yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.ListDiskPlacementGroupOperationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing DiskPlacementGroup resources.
   * </pre>
   */
  public static final class DiskPlacementGroupServiceFutureStub extends io.grpc.stub.AbstractFutureStub<DiskPlacementGroupServiceFutureStub> {
    private DiskPlacementGroupServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DiskPlacementGroupServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DiskPlacementGroupServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified placement group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.compute.v1.DiskPlacementGroupOuterClass.DiskPlacementGroup> get(
        yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.GetDiskPlacementGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of placement groups in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.ListDiskPlacementGroupsResponse> list(
        yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.ListDiskPlacementGroupsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a placement group in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.CreateDiskPlacementGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified placement group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.UpdateDiskPlacementGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified placement group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.DeleteDiskPlacementGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists disks for the specified placement group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.ListDiskPlacementGroupDisksResponse> listDisks(
        yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.ListDiskPlacementGroupDisksRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListDisksMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists operations for the specified placement group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.ListDiskPlacementGroupOperationsResponse> listOperations(
        yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.ListDiskPlacementGroupOperationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_DELETE = 4;
  private static final int METHODID_LIST_DISKS = 5;
  private static final int METHODID_LIST_OPERATIONS = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DiskPlacementGroupServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DiskPlacementGroupServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.GetDiskPlacementGroupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.DiskPlacementGroupOuterClass.DiskPlacementGroup>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.ListDiskPlacementGroupsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.ListDiskPlacementGroupsResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.CreateDiskPlacementGroupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.UpdateDiskPlacementGroupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.DeleteDiskPlacementGroupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_DISKS:
          serviceImpl.listDisks((yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.ListDiskPlacementGroupDisksRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.ListDiskPlacementGroupDisksResponse>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.ListDiskPlacementGroupOperationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.ListDiskPlacementGroupOperationsResponse>) responseObserver);
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

  private static abstract class DiskPlacementGroupServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DiskPlacementGroupServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.compute.v1.DiskPlacementGroupServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DiskPlacementGroupService");
    }
  }

  private static final class DiskPlacementGroupServiceFileDescriptorSupplier
      extends DiskPlacementGroupServiceBaseDescriptorSupplier {
    DiskPlacementGroupServiceFileDescriptorSupplier() {}
  }

  private static final class DiskPlacementGroupServiceMethodDescriptorSupplier
      extends DiskPlacementGroupServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DiskPlacementGroupServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DiskPlacementGroupServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DiskPlacementGroupServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getListDisksMethod())
              .addMethod(getListOperationsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
