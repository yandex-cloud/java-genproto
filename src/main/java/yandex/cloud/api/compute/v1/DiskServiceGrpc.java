package yandex.cloud.api.compute.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing Disk resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/compute/v1/disk_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DiskServiceGrpc {

  private DiskServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.compute.v1.DiskService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.DiskServiceOuterClass.GetDiskRequest,
      yandex.cloud.api.compute.v1.DiskOuterClass.Disk> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.compute.v1.DiskServiceOuterClass.GetDiskRequest.class,
      responseType = yandex.cloud.api.compute.v1.DiskOuterClass.Disk.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.DiskServiceOuterClass.GetDiskRequest,
      yandex.cloud.api.compute.v1.DiskOuterClass.Disk> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.DiskServiceOuterClass.GetDiskRequest, yandex.cloud.api.compute.v1.DiskOuterClass.Disk> getGetMethod;
    if ((getGetMethod = DiskServiceGrpc.getGetMethod) == null) {
      synchronized (DiskServiceGrpc.class) {
        if ((getGetMethod = DiskServiceGrpc.getGetMethod) == null) {
          DiskServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.DiskServiceOuterClass.GetDiskRequest, yandex.cloud.api.compute.v1.DiskOuterClass.Disk>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.DiskServiceOuterClass.GetDiskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.DiskOuterClass.Disk.getDefaultInstance()))
              .setSchemaDescriptor(new DiskServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.DiskServiceOuterClass.ListDisksRequest,
      yandex.cloud.api.compute.v1.DiskServiceOuterClass.ListDisksResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.compute.v1.DiskServiceOuterClass.ListDisksRequest.class,
      responseType = yandex.cloud.api.compute.v1.DiskServiceOuterClass.ListDisksResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.DiskServiceOuterClass.ListDisksRequest,
      yandex.cloud.api.compute.v1.DiskServiceOuterClass.ListDisksResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.DiskServiceOuterClass.ListDisksRequest, yandex.cloud.api.compute.v1.DiskServiceOuterClass.ListDisksResponse> getListMethod;
    if ((getListMethod = DiskServiceGrpc.getListMethod) == null) {
      synchronized (DiskServiceGrpc.class) {
        if ((getListMethod = DiskServiceGrpc.getListMethod) == null) {
          DiskServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.DiskServiceOuterClass.ListDisksRequest, yandex.cloud.api.compute.v1.DiskServiceOuterClass.ListDisksResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.DiskServiceOuterClass.ListDisksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.DiskServiceOuterClass.ListDisksResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DiskServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.DiskServiceOuterClass.CreateDiskRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.compute.v1.DiskServiceOuterClass.CreateDiskRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.DiskServiceOuterClass.CreateDiskRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.DiskServiceOuterClass.CreateDiskRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = DiskServiceGrpc.getCreateMethod) == null) {
      synchronized (DiskServiceGrpc.class) {
        if ((getCreateMethod = DiskServiceGrpc.getCreateMethod) == null) {
          DiskServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.DiskServiceOuterClass.CreateDiskRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.DiskServiceOuterClass.CreateDiskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new DiskServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.DiskServiceOuterClass.UpdateDiskRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.compute.v1.DiskServiceOuterClass.UpdateDiskRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.DiskServiceOuterClass.UpdateDiskRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.DiskServiceOuterClass.UpdateDiskRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = DiskServiceGrpc.getUpdateMethod) == null) {
      synchronized (DiskServiceGrpc.class) {
        if ((getUpdateMethod = DiskServiceGrpc.getUpdateMethod) == null) {
          DiskServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.DiskServiceOuterClass.UpdateDiskRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.DiskServiceOuterClass.UpdateDiskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new DiskServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.DiskServiceOuterClass.DeleteDiskRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.compute.v1.DiskServiceOuterClass.DeleteDiskRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.DiskServiceOuterClass.DeleteDiskRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.DiskServiceOuterClass.DeleteDiskRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = DiskServiceGrpc.getDeleteMethod) == null) {
      synchronized (DiskServiceGrpc.class) {
        if ((getDeleteMethod = DiskServiceGrpc.getDeleteMethod) == null) {
          DiskServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.DiskServiceOuterClass.DeleteDiskRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.DiskServiceOuterClass.DeleteDiskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new DiskServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.DiskServiceOuterClass.ListDiskOperationsRequest,
      yandex.cloud.api.compute.v1.DiskServiceOuterClass.ListDiskOperationsResponse> getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = yandex.cloud.api.compute.v1.DiskServiceOuterClass.ListDiskOperationsRequest.class,
      responseType = yandex.cloud.api.compute.v1.DiskServiceOuterClass.ListDiskOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.DiskServiceOuterClass.ListDiskOperationsRequest,
      yandex.cloud.api.compute.v1.DiskServiceOuterClass.ListDiskOperationsResponse> getListOperationsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.DiskServiceOuterClass.ListDiskOperationsRequest, yandex.cloud.api.compute.v1.DiskServiceOuterClass.ListDiskOperationsResponse> getListOperationsMethod;
    if ((getListOperationsMethod = DiskServiceGrpc.getListOperationsMethod) == null) {
      synchronized (DiskServiceGrpc.class) {
        if ((getListOperationsMethod = DiskServiceGrpc.getListOperationsMethod) == null) {
          DiskServiceGrpc.getListOperationsMethod = getListOperationsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.DiskServiceOuterClass.ListDiskOperationsRequest, yandex.cloud.api.compute.v1.DiskServiceOuterClass.ListDiskOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.DiskServiceOuterClass.ListDiskOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.DiskServiceOuterClass.ListDiskOperationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DiskServiceMethodDescriptorSupplier("ListOperations"))
              .build();
        }
      }
    }
    return getListOperationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.DiskServiceOuterClass.MoveDiskRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getMoveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Move",
      requestType = yandex.cloud.api.compute.v1.DiskServiceOuterClass.MoveDiskRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.DiskServiceOuterClass.MoveDiskRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getMoveMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.DiskServiceOuterClass.MoveDiskRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getMoveMethod;
    if ((getMoveMethod = DiskServiceGrpc.getMoveMethod) == null) {
      synchronized (DiskServiceGrpc.class) {
        if ((getMoveMethod = DiskServiceGrpc.getMoveMethod) == null) {
          DiskServiceGrpc.getMoveMethod = getMoveMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.DiskServiceOuterClass.MoveDiskRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Move"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.DiskServiceOuterClass.MoveDiskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new DiskServiceMethodDescriptorSupplier("Move"))
              .build();
        }
      }
    }
    return getMoveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.DiskServiceOuterClass.RelocateDiskRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRelocateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Relocate",
      requestType = yandex.cloud.api.compute.v1.DiskServiceOuterClass.RelocateDiskRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.DiskServiceOuterClass.RelocateDiskRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRelocateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.DiskServiceOuterClass.RelocateDiskRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getRelocateMethod;
    if ((getRelocateMethod = DiskServiceGrpc.getRelocateMethod) == null) {
      synchronized (DiskServiceGrpc.class) {
        if ((getRelocateMethod = DiskServiceGrpc.getRelocateMethod) == null) {
          DiskServiceGrpc.getRelocateMethod = getRelocateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.DiskServiceOuterClass.RelocateDiskRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Relocate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.DiskServiceOuterClass.RelocateDiskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new DiskServiceMethodDescriptorSupplier("Relocate"))
              .build();
        }
      }
    }
    return getRelocateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.DiskServiceOuterClass.ListDiskSnapshotSchedulesRequest,
      yandex.cloud.api.compute.v1.DiskServiceOuterClass.ListDiskSnapshotSchedulesResponse> getListSnapshotSchedulesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSnapshotSchedules",
      requestType = yandex.cloud.api.compute.v1.DiskServiceOuterClass.ListDiskSnapshotSchedulesRequest.class,
      responseType = yandex.cloud.api.compute.v1.DiskServiceOuterClass.ListDiskSnapshotSchedulesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.DiskServiceOuterClass.ListDiskSnapshotSchedulesRequest,
      yandex.cloud.api.compute.v1.DiskServiceOuterClass.ListDiskSnapshotSchedulesResponse> getListSnapshotSchedulesMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.DiskServiceOuterClass.ListDiskSnapshotSchedulesRequest, yandex.cloud.api.compute.v1.DiskServiceOuterClass.ListDiskSnapshotSchedulesResponse> getListSnapshotSchedulesMethod;
    if ((getListSnapshotSchedulesMethod = DiskServiceGrpc.getListSnapshotSchedulesMethod) == null) {
      synchronized (DiskServiceGrpc.class) {
        if ((getListSnapshotSchedulesMethod = DiskServiceGrpc.getListSnapshotSchedulesMethod) == null) {
          DiskServiceGrpc.getListSnapshotSchedulesMethod = getListSnapshotSchedulesMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.DiskServiceOuterClass.ListDiskSnapshotSchedulesRequest, yandex.cloud.api.compute.v1.DiskServiceOuterClass.ListDiskSnapshotSchedulesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListSnapshotSchedules"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.DiskServiceOuterClass.ListDiskSnapshotSchedulesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.DiskServiceOuterClass.ListDiskSnapshotSchedulesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DiskServiceMethodDescriptorSupplier("ListSnapshotSchedules"))
              .build();
        }
      }
    }
    return getListSnapshotSchedulesMethod;
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
    if ((getListAccessBindingsMethod = DiskServiceGrpc.getListAccessBindingsMethod) == null) {
      synchronized (DiskServiceGrpc.class) {
        if ((getListAccessBindingsMethod = DiskServiceGrpc.getListAccessBindingsMethod) == null) {
          DiskServiceGrpc.getListAccessBindingsMethod = getListAccessBindingsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.ListAccessBindingsRequest, yandex.cloud.api.access.Access.ListAccessBindingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.ListAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.ListAccessBindingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DiskServiceMethodDescriptorSupplier("ListAccessBindings"))
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
    if ((getSetAccessBindingsMethod = DiskServiceGrpc.getSetAccessBindingsMethod) == null) {
      synchronized (DiskServiceGrpc.class) {
        if ((getSetAccessBindingsMethod = DiskServiceGrpc.getSetAccessBindingsMethod) == null) {
          DiskServiceGrpc.getSetAccessBindingsMethod = getSetAccessBindingsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.SetAccessBindingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.SetAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new DiskServiceMethodDescriptorSupplier("SetAccessBindings"))
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
    if ((getUpdateAccessBindingsMethod = DiskServiceGrpc.getUpdateAccessBindingsMethod) == null) {
      synchronized (DiskServiceGrpc.class) {
        if ((getUpdateAccessBindingsMethod = DiskServiceGrpc.getUpdateAccessBindingsMethod) == null) {
          DiskServiceGrpc.getUpdateAccessBindingsMethod = getUpdateAccessBindingsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.UpdateAccessBindingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.UpdateAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new DiskServiceMethodDescriptorSupplier("UpdateAccessBindings"))
              .build();
        }
      }
    }
    return getUpdateAccessBindingsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DiskServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DiskServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DiskServiceStub>() {
        @java.lang.Override
        public DiskServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DiskServiceStub(channel, callOptions);
        }
      };
    return DiskServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DiskServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DiskServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DiskServiceBlockingStub>() {
        @java.lang.Override
        public DiskServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DiskServiceBlockingStub(channel, callOptions);
        }
      };
    return DiskServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DiskServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DiskServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DiskServiceFutureStub>() {
        @java.lang.Override
        public DiskServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DiskServiceFutureStub(channel, callOptions);
        }
      };
    return DiskServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing Disk resources.
   * </pre>
   */
  public static abstract class DiskServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified Disk resource.
     * To get the list of available Disk resources, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.compute.v1.DiskServiceOuterClass.GetDiskRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.DiskOuterClass.Disk> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of Disk resources in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.compute.v1.DiskServiceOuterClass.ListDisksRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.DiskServiceOuterClass.ListDisksResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a disk in the specified folder.
     * You can create an empty disk or restore it from a snapshot or an image.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public void create(yandex.cloud.api.compute.v1.DiskServiceOuterClass.CreateDiskRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified disk.
     * </pre>
     */
    public void update(yandex.cloud.api.compute.v1.DiskServiceOuterClass.UpdateDiskRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified disk.
     * Deleting a disk removes its data permanently and is irreversible. However, deleting a disk does not delete
     * any snapshots or images previously made from the disk. You must delete snapshots and images separately.
     * It is not possible to delete a disk that is attached to an instance.
     * </pre>
     */
    public void delete(yandex.cloud.api.compute.v1.DiskServiceOuterClass.DeleteDiskRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified disk.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.compute.v1.DiskServiceOuterClass.ListDiskOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.DiskServiceOuterClass.ListDiskOperationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Moves the specified disk to another folder of the same cloud.
     * </pre>
     */
    public void move(yandex.cloud.api.compute.v1.DiskServiceOuterClass.MoveDiskRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMoveMethod(), responseObserver);
    }

    /**
     * <pre>
     * Moves the specified disk to another availability zone
     * Disk must be detached from instances. To move attached
     * disk use [InstanceService.Relocate] request.
     * </pre>
     */
    public void relocate(yandex.cloud.api.compute.v1.DiskServiceOuterClass.RelocateDiskRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRelocateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of snapshot schedules the specified disk is attached to.
     * </pre>
     */
    public void listSnapshotSchedules(yandex.cloud.api.compute.v1.DiskServiceOuterClass.ListDiskSnapshotSchedulesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.DiskServiceOuterClass.ListDiskSnapshotSchedulesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListSnapshotSchedulesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists access bindings for the disk.
     * </pre>
     */
    public void listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.access.Access.ListAccessBindingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAccessBindingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sets access bindings for the disk.
     * </pre>
     */
    public void setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetAccessBindingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates access bindings for the disk.
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
                yandex.cloud.api.compute.v1.DiskServiceOuterClass.GetDiskRequest,
                yandex.cloud.api.compute.v1.DiskOuterClass.Disk>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.DiskServiceOuterClass.ListDisksRequest,
                yandex.cloud.api.compute.v1.DiskServiceOuterClass.ListDisksResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.DiskServiceOuterClass.CreateDiskRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.DiskServiceOuterClass.UpdateDiskRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.DiskServiceOuterClass.DeleteDiskRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListOperationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.DiskServiceOuterClass.ListDiskOperationsRequest,
                yandex.cloud.api.compute.v1.DiskServiceOuterClass.ListDiskOperationsResponse>(
                  this, METHODID_LIST_OPERATIONS)))
          .addMethod(
            getMoveMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.DiskServiceOuterClass.MoveDiskRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_MOVE)))
          .addMethod(
            getRelocateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.DiskServiceOuterClass.RelocateDiskRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_RELOCATE)))
          .addMethod(
            getListSnapshotSchedulesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.DiskServiceOuterClass.ListDiskSnapshotSchedulesRequest,
                yandex.cloud.api.compute.v1.DiskServiceOuterClass.ListDiskSnapshotSchedulesResponse>(
                  this, METHODID_LIST_SNAPSHOT_SCHEDULES)))
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
   * A set of methods for managing Disk resources.
   * </pre>
   */
  public static final class DiskServiceStub extends io.grpc.stub.AbstractAsyncStub<DiskServiceStub> {
    private DiskServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DiskServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DiskServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified Disk resource.
     * To get the list of available Disk resources, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.compute.v1.DiskServiceOuterClass.GetDiskRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.DiskOuterClass.Disk> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of Disk resources in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.compute.v1.DiskServiceOuterClass.ListDisksRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.DiskServiceOuterClass.ListDisksResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a disk in the specified folder.
     * You can create an empty disk or restore it from a snapshot or an image.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public void create(yandex.cloud.api.compute.v1.DiskServiceOuterClass.CreateDiskRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified disk.
     * </pre>
     */
    public void update(yandex.cloud.api.compute.v1.DiskServiceOuterClass.UpdateDiskRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified disk.
     * Deleting a disk removes its data permanently and is irreversible. However, deleting a disk does not delete
     * any snapshots or images previously made from the disk. You must delete snapshots and images separately.
     * It is not possible to delete a disk that is attached to an instance.
     * </pre>
     */
    public void delete(yandex.cloud.api.compute.v1.DiskServiceOuterClass.DeleteDiskRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified disk.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.compute.v1.DiskServiceOuterClass.ListDiskOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.DiskServiceOuterClass.ListDiskOperationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Moves the specified disk to another folder of the same cloud.
     * </pre>
     */
    public void move(yandex.cloud.api.compute.v1.DiskServiceOuterClass.MoveDiskRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMoveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Moves the specified disk to another availability zone
     * Disk must be detached from instances. To move attached
     * disk use [InstanceService.Relocate] request.
     * </pre>
     */
    public void relocate(yandex.cloud.api.compute.v1.DiskServiceOuterClass.RelocateDiskRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRelocateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of snapshot schedules the specified disk is attached to.
     * </pre>
     */
    public void listSnapshotSchedules(yandex.cloud.api.compute.v1.DiskServiceOuterClass.ListDiskSnapshotSchedulesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.DiskServiceOuterClass.ListDiskSnapshotSchedulesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListSnapshotSchedulesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists access bindings for the disk.
     * </pre>
     */
    public void listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.access.Access.ListAccessBindingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sets access bindings for the disk.
     * </pre>
     */
    public void setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates access bindings for the disk.
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
   * A set of methods for managing Disk resources.
   * </pre>
   */
  public static final class DiskServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<DiskServiceBlockingStub> {
    private DiskServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DiskServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DiskServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified Disk resource.
     * To get the list of available Disk resources, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.compute.v1.DiskOuterClass.Disk get(yandex.cloud.api.compute.v1.DiskServiceOuterClass.GetDiskRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of Disk resources in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.compute.v1.DiskServiceOuterClass.ListDisksResponse list(yandex.cloud.api.compute.v1.DiskServiceOuterClass.ListDisksRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a disk in the specified folder.
     * You can create an empty disk or restore it from a snapshot or an image.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.compute.v1.DiskServiceOuterClass.CreateDiskRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified disk.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.compute.v1.DiskServiceOuterClass.UpdateDiskRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified disk.
     * Deleting a disk removes its data permanently and is irreversible. However, deleting a disk does not delete
     * any snapshots or images previously made from the disk. You must delete snapshots and images separately.
     * It is not possible to delete a disk that is attached to an instance.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.compute.v1.DiskServiceOuterClass.DeleteDiskRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists operations for the specified disk.
     * </pre>
     */
    public yandex.cloud.api.compute.v1.DiskServiceOuterClass.ListDiskOperationsResponse listOperations(yandex.cloud.api.compute.v1.DiskServiceOuterClass.ListDiskOperationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Moves the specified disk to another folder of the same cloud.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation move(yandex.cloud.api.compute.v1.DiskServiceOuterClass.MoveDiskRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMoveMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Moves the specified disk to another availability zone
     * Disk must be detached from instances. To move attached
     * disk use [InstanceService.Relocate] request.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation relocate(yandex.cloud.api.compute.v1.DiskServiceOuterClass.RelocateDiskRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRelocateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of snapshot schedules the specified disk is attached to.
     * </pre>
     */
    public yandex.cloud.api.compute.v1.DiskServiceOuterClass.ListDiskSnapshotSchedulesResponse listSnapshotSchedules(yandex.cloud.api.compute.v1.DiskServiceOuterClass.ListDiskSnapshotSchedulesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListSnapshotSchedulesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists access bindings for the disk.
     * </pre>
     */
    public yandex.cloud.api.access.Access.ListAccessBindingsResponse listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAccessBindingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets access bindings for the disk.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetAccessBindingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates access bindings for the disk.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation updateAccessBindings(yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAccessBindingsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Disk resources.
   * </pre>
   */
  public static final class DiskServiceFutureStub extends io.grpc.stub.AbstractFutureStub<DiskServiceFutureStub> {
    private DiskServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DiskServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DiskServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified Disk resource.
     * To get the list of available Disk resources, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.compute.v1.DiskOuterClass.Disk> get(
        yandex.cloud.api.compute.v1.DiskServiceOuterClass.GetDiskRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of Disk resources in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.compute.v1.DiskServiceOuterClass.ListDisksResponse> list(
        yandex.cloud.api.compute.v1.DiskServiceOuterClass.ListDisksRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a disk in the specified folder.
     * You can create an empty disk or restore it from a snapshot or an image.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.compute.v1.DiskServiceOuterClass.CreateDiskRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified disk.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.compute.v1.DiskServiceOuterClass.UpdateDiskRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified disk.
     * Deleting a disk removes its data permanently and is irreversible. However, deleting a disk does not delete
     * any snapshots or images previously made from the disk. You must delete snapshots and images separately.
     * It is not possible to delete a disk that is attached to an instance.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.compute.v1.DiskServiceOuterClass.DeleteDiskRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists operations for the specified disk.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.compute.v1.DiskServiceOuterClass.ListDiskOperationsResponse> listOperations(
        yandex.cloud.api.compute.v1.DiskServiceOuterClass.ListDiskOperationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Moves the specified disk to another folder of the same cloud.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> move(
        yandex.cloud.api.compute.v1.DiskServiceOuterClass.MoveDiskRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMoveMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Moves the specified disk to another availability zone
     * Disk must be detached from instances. To move attached
     * disk use [InstanceService.Relocate] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> relocate(
        yandex.cloud.api.compute.v1.DiskServiceOuterClass.RelocateDiskRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRelocateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of snapshot schedules the specified disk is attached to.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.compute.v1.DiskServiceOuterClass.ListDiskSnapshotSchedulesResponse> listSnapshotSchedules(
        yandex.cloud.api.compute.v1.DiskServiceOuterClass.ListDiskSnapshotSchedulesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListSnapshotSchedulesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists access bindings for the disk.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.access.Access.ListAccessBindingsResponse> listAccessBindings(
        yandex.cloud.api.access.Access.ListAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAccessBindingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sets access bindings for the disk.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> setAccessBindings(
        yandex.cloud.api.access.Access.SetAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetAccessBindingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates access bindings for the disk.
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
  private static final int METHODID_LIST_OPERATIONS = 5;
  private static final int METHODID_MOVE = 6;
  private static final int METHODID_RELOCATE = 7;
  private static final int METHODID_LIST_SNAPSHOT_SCHEDULES = 8;
  private static final int METHODID_LIST_ACCESS_BINDINGS = 9;
  private static final int METHODID_SET_ACCESS_BINDINGS = 10;
  private static final int METHODID_UPDATE_ACCESS_BINDINGS = 11;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DiskServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DiskServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.compute.v1.DiskServiceOuterClass.GetDiskRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.DiskOuterClass.Disk>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.compute.v1.DiskServiceOuterClass.ListDisksRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.DiskServiceOuterClass.ListDisksResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.compute.v1.DiskServiceOuterClass.CreateDiskRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.compute.v1.DiskServiceOuterClass.UpdateDiskRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.compute.v1.DiskServiceOuterClass.DeleteDiskRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((yandex.cloud.api.compute.v1.DiskServiceOuterClass.ListDiskOperationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.DiskServiceOuterClass.ListDiskOperationsResponse>) responseObserver);
          break;
        case METHODID_MOVE:
          serviceImpl.move((yandex.cloud.api.compute.v1.DiskServiceOuterClass.MoveDiskRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_RELOCATE:
          serviceImpl.relocate((yandex.cloud.api.compute.v1.DiskServiceOuterClass.RelocateDiskRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_SNAPSHOT_SCHEDULES:
          serviceImpl.listSnapshotSchedules((yandex.cloud.api.compute.v1.DiskServiceOuterClass.ListDiskSnapshotSchedulesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.DiskServiceOuterClass.ListDiskSnapshotSchedulesResponse>) responseObserver);
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

  private static abstract class DiskServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DiskServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.compute.v1.DiskServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DiskService");
    }
  }

  private static final class DiskServiceFileDescriptorSupplier
      extends DiskServiceBaseDescriptorSupplier {
    DiskServiceFileDescriptorSupplier() {}
  }

  private static final class DiskServiceMethodDescriptorSupplier
      extends DiskServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DiskServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DiskServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DiskServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getListOperationsMethod())
              .addMethod(getMoveMethod())
              .addMethod(getRelocateMethod())
              .addMethod(getListSnapshotSchedulesMethod())
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
