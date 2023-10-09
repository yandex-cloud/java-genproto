package yandex.cloud.api.compute.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing placement groups.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/compute/v1/placement_group_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PlacementGroupServiceGrpc {

  private PlacementGroupServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.compute.v1.PlacementGroupService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.GetPlacementGroupRequest,
      yandex.cloud.api.compute.v1.PlacementGroupOuterClass.PlacementGroup> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.GetPlacementGroupRequest.class,
      responseType = yandex.cloud.api.compute.v1.PlacementGroupOuterClass.PlacementGroup.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.GetPlacementGroupRequest,
      yandex.cloud.api.compute.v1.PlacementGroupOuterClass.PlacementGroup> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.GetPlacementGroupRequest, yandex.cloud.api.compute.v1.PlacementGroupOuterClass.PlacementGroup> getGetMethod;
    if ((getGetMethod = PlacementGroupServiceGrpc.getGetMethod) == null) {
      synchronized (PlacementGroupServiceGrpc.class) {
        if ((getGetMethod = PlacementGroupServiceGrpc.getGetMethod) == null) {
          PlacementGroupServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.GetPlacementGroupRequest, yandex.cloud.api.compute.v1.PlacementGroupOuterClass.PlacementGroup>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.GetPlacementGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.PlacementGroupOuterClass.PlacementGroup.getDefaultInstance()))
              .setSchemaDescriptor(new PlacementGroupServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.ListPlacementGroupsRequest,
      yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.ListPlacementGroupsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.ListPlacementGroupsRequest.class,
      responseType = yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.ListPlacementGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.ListPlacementGroupsRequest,
      yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.ListPlacementGroupsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.ListPlacementGroupsRequest, yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.ListPlacementGroupsResponse> getListMethod;
    if ((getListMethod = PlacementGroupServiceGrpc.getListMethod) == null) {
      synchronized (PlacementGroupServiceGrpc.class) {
        if ((getListMethod = PlacementGroupServiceGrpc.getListMethod) == null) {
          PlacementGroupServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.ListPlacementGroupsRequest, yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.ListPlacementGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.ListPlacementGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.ListPlacementGroupsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PlacementGroupServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.CreatePlacementGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.CreatePlacementGroupRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.CreatePlacementGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.CreatePlacementGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = PlacementGroupServiceGrpc.getCreateMethod) == null) {
      synchronized (PlacementGroupServiceGrpc.class) {
        if ((getCreateMethod = PlacementGroupServiceGrpc.getCreateMethod) == null) {
          PlacementGroupServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.CreatePlacementGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.CreatePlacementGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new PlacementGroupServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.UpdatePlacementGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.UpdatePlacementGroupRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.UpdatePlacementGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.UpdatePlacementGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = PlacementGroupServiceGrpc.getUpdateMethod) == null) {
      synchronized (PlacementGroupServiceGrpc.class) {
        if ((getUpdateMethod = PlacementGroupServiceGrpc.getUpdateMethod) == null) {
          PlacementGroupServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.UpdatePlacementGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.UpdatePlacementGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new PlacementGroupServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.DeletePlacementGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.DeletePlacementGroupRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.DeletePlacementGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.DeletePlacementGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = PlacementGroupServiceGrpc.getDeleteMethod) == null) {
      synchronized (PlacementGroupServiceGrpc.class) {
        if ((getDeleteMethod = PlacementGroupServiceGrpc.getDeleteMethod) == null) {
          PlacementGroupServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.DeletePlacementGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.DeletePlacementGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new PlacementGroupServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.ListPlacementGroupInstancesRequest,
      yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.ListPlacementGroupInstancesResponse> getListInstancesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListInstances",
      requestType = yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.ListPlacementGroupInstancesRequest.class,
      responseType = yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.ListPlacementGroupInstancesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.ListPlacementGroupInstancesRequest,
      yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.ListPlacementGroupInstancesResponse> getListInstancesMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.ListPlacementGroupInstancesRequest, yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.ListPlacementGroupInstancesResponse> getListInstancesMethod;
    if ((getListInstancesMethod = PlacementGroupServiceGrpc.getListInstancesMethod) == null) {
      synchronized (PlacementGroupServiceGrpc.class) {
        if ((getListInstancesMethod = PlacementGroupServiceGrpc.getListInstancesMethod) == null) {
          PlacementGroupServiceGrpc.getListInstancesMethod = getListInstancesMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.ListPlacementGroupInstancesRequest, yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.ListPlacementGroupInstancesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListInstances"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.ListPlacementGroupInstancesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.ListPlacementGroupInstancesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PlacementGroupServiceMethodDescriptorSupplier("ListInstances"))
              .build();
        }
      }
    }
    return getListInstancesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.ListPlacementGroupOperationsRequest,
      yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.ListPlacementGroupOperationsResponse> getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.ListPlacementGroupOperationsRequest.class,
      responseType = yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.ListPlacementGroupOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.ListPlacementGroupOperationsRequest,
      yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.ListPlacementGroupOperationsResponse> getListOperationsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.ListPlacementGroupOperationsRequest, yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.ListPlacementGroupOperationsResponse> getListOperationsMethod;
    if ((getListOperationsMethod = PlacementGroupServiceGrpc.getListOperationsMethod) == null) {
      synchronized (PlacementGroupServiceGrpc.class) {
        if ((getListOperationsMethod = PlacementGroupServiceGrpc.getListOperationsMethod) == null) {
          PlacementGroupServiceGrpc.getListOperationsMethod = getListOperationsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.ListPlacementGroupOperationsRequest, yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.ListPlacementGroupOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.ListPlacementGroupOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.ListPlacementGroupOperationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PlacementGroupServiceMethodDescriptorSupplier("ListOperations"))
              .build();
        }
      }
    }
    return getListOperationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.access.Access.ListAccessBindingsRequest,
      yandex.cloud.api.access.Access.ListAccessBindingsResponse> getListAccessBindingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAccessBindings",
      requestType = yandex.cloud.api.access.Access.ListAccessBindingsRequest.class,
      responseType = yandex.cloud.api.access.Access.ListAccessBindingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.access.Access.ListAccessBindingsRequest,
      yandex.cloud.api.access.Access.ListAccessBindingsResponse> getListAccessBindingsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.access.Access.ListAccessBindingsRequest, yandex.cloud.api.access.Access.ListAccessBindingsResponse> getListAccessBindingsMethod;
    if ((getListAccessBindingsMethod = PlacementGroupServiceGrpc.getListAccessBindingsMethod) == null) {
      synchronized (PlacementGroupServiceGrpc.class) {
        if ((getListAccessBindingsMethod = PlacementGroupServiceGrpc.getListAccessBindingsMethod) == null) {
          PlacementGroupServiceGrpc.getListAccessBindingsMethod = getListAccessBindingsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.ListAccessBindingsRequest, yandex.cloud.api.access.Access.ListAccessBindingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.ListAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.ListAccessBindingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PlacementGroupServiceMethodDescriptorSupplier("ListAccessBindings"))
              .build();
        }
      }
    }
    return getListAccessBindingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.access.Access.SetAccessBindingsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getSetAccessBindingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetAccessBindings",
      requestType = yandex.cloud.api.access.Access.SetAccessBindingsRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.access.Access.SetAccessBindingsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getSetAccessBindingsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.access.Access.SetAccessBindingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getSetAccessBindingsMethod;
    if ((getSetAccessBindingsMethod = PlacementGroupServiceGrpc.getSetAccessBindingsMethod) == null) {
      synchronized (PlacementGroupServiceGrpc.class) {
        if ((getSetAccessBindingsMethod = PlacementGroupServiceGrpc.getSetAccessBindingsMethod) == null) {
          PlacementGroupServiceGrpc.getSetAccessBindingsMethod = getSetAccessBindingsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.SetAccessBindingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.SetAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new PlacementGroupServiceMethodDescriptorSupplier("SetAccessBindings"))
              .build();
        }
      }
    }
    return getSetAccessBindingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.access.Access.UpdateAccessBindingsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateAccessBindingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAccessBindings",
      requestType = yandex.cloud.api.access.Access.UpdateAccessBindingsRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.access.Access.UpdateAccessBindingsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateAccessBindingsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.access.Access.UpdateAccessBindingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateAccessBindingsMethod;
    if ((getUpdateAccessBindingsMethod = PlacementGroupServiceGrpc.getUpdateAccessBindingsMethod) == null) {
      synchronized (PlacementGroupServiceGrpc.class) {
        if ((getUpdateAccessBindingsMethod = PlacementGroupServiceGrpc.getUpdateAccessBindingsMethod) == null) {
          PlacementGroupServiceGrpc.getUpdateAccessBindingsMethod = getUpdateAccessBindingsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.UpdateAccessBindingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.UpdateAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new PlacementGroupServiceMethodDescriptorSupplier("UpdateAccessBindings"))
              .build();
        }
      }
    }
    return getUpdateAccessBindingsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PlacementGroupServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PlacementGroupServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PlacementGroupServiceStub>() {
        @java.lang.Override
        public PlacementGroupServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PlacementGroupServiceStub(channel, callOptions);
        }
      };
    return PlacementGroupServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PlacementGroupServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PlacementGroupServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PlacementGroupServiceBlockingStub>() {
        @java.lang.Override
        public PlacementGroupServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PlacementGroupServiceBlockingStub(channel, callOptions);
        }
      };
    return PlacementGroupServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PlacementGroupServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PlacementGroupServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PlacementGroupServiceFutureStub>() {
        @java.lang.Override
        public PlacementGroupServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PlacementGroupServiceFutureStub(channel, callOptions);
        }
      };
    return PlacementGroupServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing placement groups.
   * </pre>
   */
  public static abstract class PlacementGroupServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified placement group.
     * To get the list of all available placement groups, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.GetPlacementGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.PlacementGroupOuterClass.PlacementGroup> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of placement groups in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.ListPlacementGroupsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.ListPlacementGroupsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a placement group in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.CreatePlacementGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified placement group.
     * </pre>
     */
    public void update(yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.UpdatePlacementGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified placement group.
     * </pre>
     */
    public void delete(yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.DeletePlacementGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists instances for the specified placement group.
     * </pre>
     */
    public void listInstances(yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.ListPlacementGroupInstancesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.ListPlacementGroupInstancesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListInstancesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified placement group.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.ListPlacementGroupOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.ListPlacementGroupOperationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists access bindings for the placement group.
     * </pre>
     */
    public void listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.access.Access.ListAccessBindingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAccessBindingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sets access bindings for the placement group.
     * </pre>
     */
    public void setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetAccessBindingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates access bindings for the placement group.
     * </pre>
     */
    public void updateAccessBindings(yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAccessBindingsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.GetPlacementGroupRequest,
                yandex.cloud.api.compute.v1.PlacementGroupOuterClass.PlacementGroup>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.ListPlacementGroupsRequest,
                yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.ListPlacementGroupsResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.CreatePlacementGroupRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.UpdatePlacementGroupRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.DeletePlacementGroupRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListInstancesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.ListPlacementGroupInstancesRequest,
                yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.ListPlacementGroupInstancesResponse>(
                  this, METHODID_LIST_INSTANCES)))
          .addMethod(
            getListOperationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.ListPlacementGroupOperationsRequest,
                yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.ListPlacementGroupOperationsResponse>(
                  this, METHODID_LIST_OPERATIONS)))
          .addMethod(
            getListAccessBindingsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.access.Access.ListAccessBindingsRequest,
                yandex.cloud.api.access.Access.ListAccessBindingsResponse>(
                  this, METHODID_LIST_ACCESS_BINDINGS)))
          .addMethod(
            getSetAccessBindingsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.access.Access.SetAccessBindingsRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_SET_ACCESS_BINDINGS)))
          .addMethod(
            getUpdateAccessBindingsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.access.Access.UpdateAccessBindingsRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE_ACCESS_BINDINGS)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing placement groups.
   * </pre>
   */
  public static final class PlacementGroupServiceStub extends io.grpc.stub.AbstractAsyncStub<PlacementGroupServiceStub> {
    private PlacementGroupServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PlacementGroupServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PlacementGroupServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified placement group.
     * To get the list of all available placement groups, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.GetPlacementGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.PlacementGroupOuterClass.PlacementGroup> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of placement groups in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.ListPlacementGroupsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.ListPlacementGroupsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a placement group in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.CreatePlacementGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified placement group.
     * </pre>
     */
    public void update(yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.UpdatePlacementGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified placement group.
     * </pre>
     */
    public void delete(yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.DeletePlacementGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists instances for the specified placement group.
     * </pre>
     */
    public void listInstances(yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.ListPlacementGroupInstancesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.ListPlacementGroupInstancesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListInstancesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified placement group.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.ListPlacementGroupOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.ListPlacementGroupOperationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists access bindings for the placement group.
     * </pre>
     */
    public void listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.access.Access.ListAccessBindingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sets access bindings for the placement group.
     * </pre>
     */
    public void setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates access bindings for the placement group.
     * </pre>
     */
    public void updateAccessBindings(yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing placement groups.
   * </pre>
   */
  public static final class PlacementGroupServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<PlacementGroupServiceBlockingStub> {
    private PlacementGroupServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PlacementGroupServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PlacementGroupServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified placement group.
     * To get the list of all available placement groups, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.compute.v1.PlacementGroupOuterClass.PlacementGroup get(yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.GetPlacementGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of placement groups in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.ListPlacementGroupsResponse list(yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.ListPlacementGroupsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a placement group in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.CreatePlacementGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified placement group.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.UpdatePlacementGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified placement group.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.DeletePlacementGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists instances for the specified placement group.
     * </pre>
     */
    public yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.ListPlacementGroupInstancesResponse listInstances(yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.ListPlacementGroupInstancesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListInstancesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists operations for the specified placement group.
     * </pre>
     */
    public yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.ListPlacementGroupOperationsResponse listOperations(yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.ListPlacementGroupOperationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists access bindings for the placement group.
     * </pre>
     */
    public yandex.cloud.api.access.Access.ListAccessBindingsResponse listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAccessBindingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets access bindings for the placement group.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetAccessBindingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates access bindings for the placement group.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation updateAccessBindings(yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAccessBindingsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing placement groups.
   * </pre>
   */
  public static final class PlacementGroupServiceFutureStub extends io.grpc.stub.AbstractFutureStub<PlacementGroupServiceFutureStub> {
    private PlacementGroupServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PlacementGroupServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PlacementGroupServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified placement group.
     * To get the list of all available placement groups, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.compute.v1.PlacementGroupOuterClass.PlacementGroup> get(
        yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.GetPlacementGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of placement groups in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.ListPlacementGroupsResponse> list(
        yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.ListPlacementGroupsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a placement group in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.CreatePlacementGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified placement group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.UpdatePlacementGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified placement group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.DeletePlacementGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists instances for the specified placement group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.ListPlacementGroupInstancesResponse> listInstances(
        yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.ListPlacementGroupInstancesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListInstancesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists operations for the specified placement group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.ListPlacementGroupOperationsResponse> listOperations(
        yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.ListPlacementGroupOperationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists access bindings for the placement group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.access.Access.ListAccessBindingsResponse> listAccessBindings(
        yandex.cloud.api.access.Access.ListAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAccessBindingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sets access bindings for the placement group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> setAccessBindings(
        yandex.cloud.api.access.Access.SetAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetAccessBindingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates access bindings for the placement group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> updateAccessBindings(
        yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAccessBindingsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_DELETE = 4;
  private static final int METHODID_LIST_INSTANCES = 5;
  private static final int METHODID_LIST_OPERATIONS = 6;
  private static final int METHODID_LIST_ACCESS_BINDINGS = 7;
  private static final int METHODID_SET_ACCESS_BINDINGS = 8;
  private static final int METHODID_UPDATE_ACCESS_BINDINGS = 9;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PlacementGroupServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PlacementGroupServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.GetPlacementGroupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.PlacementGroupOuterClass.PlacementGroup>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.ListPlacementGroupsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.ListPlacementGroupsResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.CreatePlacementGroupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.UpdatePlacementGroupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.DeletePlacementGroupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_INSTANCES:
          serviceImpl.listInstances((yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.ListPlacementGroupInstancesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.ListPlacementGroupInstancesResponse>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.ListPlacementGroupOperationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.ListPlacementGroupOperationsResponse>) responseObserver);
          break;
        case METHODID_LIST_ACCESS_BINDINGS:
          serviceImpl.listAccessBindings((yandex.cloud.api.access.Access.ListAccessBindingsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.access.Access.ListAccessBindingsResponse>) responseObserver);
          break;
        case METHODID_SET_ACCESS_BINDINGS:
          serviceImpl.setAccessBindings((yandex.cloud.api.access.Access.SetAccessBindingsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE_ACCESS_BINDINGS:
          serviceImpl.updateAccessBindings((yandex.cloud.api.access.Access.UpdateAccessBindingsRequest) request,
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

  private static abstract class PlacementGroupServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PlacementGroupServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.compute.v1.PlacementGroupServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PlacementGroupService");
    }
  }

  private static final class PlacementGroupServiceFileDescriptorSupplier
      extends PlacementGroupServiceBaseDescriptorSupplier {
    PlacementGroupServiceFileDescriptorSupplier() {}
  }

  private static final class PlacementGroupServiceMethodDescriptorSupplier
      extends PlacementGroupServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PlacementGroupServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PlacementGroupServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PlacementGroupServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getListInstancesMethod())
              .addMethod(getListOperationsMethod())
              .addMethod(getListAccessBindingsMethod())
              .addMethod(getSetAccessBindingsMethod())
              .addMethod(getUpdateAccessBindingsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
