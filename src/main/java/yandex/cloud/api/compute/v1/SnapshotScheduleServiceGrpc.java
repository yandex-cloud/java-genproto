package yandex.cloud.api.compute.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing snapshot schedules.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/compute/v1/snapshot_schedule_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SnapshotScheduleServiceGrpc {

  private SnapshotScheduleServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.compute.v1.SnapshotScheduleService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.GetSnapshotScheduleRequest,
      yandex.cloud.api.compute.v1.SnapshotScheduleOuterClass.SnapshotSchedule> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.GetSnapshotScheduleRequest.class,
      responseType = yandex.cloud.api.compute.v1.SnapshotScheduleOuterClass.SnapshotSchedule.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.GetSnapshotScheduleRequest,
      yandex.cloud.api.compute.v1.SnapshotScheduleOuterClass.SnapshotSchedule> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.GetSnapshotScheduleRequest, yandex.cloud.api.compute.v1.SnapshotScheduleOuterClass.SnapshotSchedule> getGetMethod;
    if ((getGetMethod = SnapshotScheduleServiceGrpc.getGetMethod) == null) {
      synchronized (SnapshotScheduleServiceGrpc.class) {
        if ((getGetMethod = SnapshotScheduleServiceGrpc.getGetMethod) == null) {
          SnapshotScheduleServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.GetSnapshotScheduleRequest, yandex.cloud.api.compute.v1.SnapshotScheduleOuterClass.SnapshotSchedule>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.GetSnapshotScheduleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.SnapshotScheduleOuterClass.SnapshotSchedule.getDefaultInstance()))
              .setSchemaDescriptor(new SnapshotScheduleServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotSchedulesRequest,
      yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotSchedulesResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotSchedulesRequest.class,
      responseType = yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotSchedulesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotSchedulesRequest,
      yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotSchedulesResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotSchedulesRequest, yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotSchedulesResponse> getListMethod;
    if ((getListMethod = SnapshotScheduleServiceGrpc.getListMethod) == null) {
      synchronized (SnapshotScheduleServiceGrpc.class) {
        if ((getListMethod = SnapshotScheduleServiceGrpc.getListMethod) == null) {
          SnapshotScheduleServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotSchedulesRequest, yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotSchedulesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotSchedulesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotSchedulesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SnapshotScheduleServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.CreateSnapshotScheduleRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.CreateSnapshotScheduleRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.CreateSnapshotScheduleRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.CreateSnapshotScheduleRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = SnapshotScheduleServiceGrpc.getCreateMethod) == null) {
      synchronized (SnapshotScheduleServiceGrpc.class) {
        if ((getCreateMethod = SnapshotScheduleServiceGrpc.getCreateMethod) == null) {
          SnapshotScheduleServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.CreateSnapshotScheduleRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.CreateSnapshotScheduleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new SnapshotScheduleServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.UpdateSnapshotScheduleRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.UpdateSnapshotScheduleRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.UpdateSnapshotScheduleRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.UpdateSnapshotScheduleRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = SnapshotScheduleServiceGrpc.getUpdateMethod) == null) {
      synchronized (SnapshotScheduleServiceGrpc.class) {
        if ((getUpdateMethod = SnapshotScheduleServiceGrpc.getUpdateMethod) == null) {
          SnapshotScheduleServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.UpdateSnapshotScheduleRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.UpdateSnapshotScheduleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new SnapshotScheduleServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.DeleteSnapshotScheduleRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.DeleteSnapshotScheduleRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.DeleteSnapshotScheduleRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.DeleteSnapshotScheduleRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = SnapshotScheduleServiceGrpc.getDeleteMethod) == null) {
      synchronized (SnapshotScheduleServiceGrpc.class) {
        if ((getDeleteMethod = SnapshotScheduleServiceGrpc.getDeleteMethod) == null) {
          SnapshotScheduleServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.DeleteSnapshotScheduleRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.DeleteSnapshotScheduleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new SnapshotScheduleServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.UpdateSnapshotScheduleDisksRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateDisksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateDisks",
      requestType = yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.UpdateSnapshotScheduleDisksRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.UpdateSnapshotScheduleDisksRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateDisksMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.UpdateSnapshotScheduleDisksRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateDisksMethod;
    if ((getUpdateDisksMethod = SnapshotScheduleServiceGrpc.getUpdateDisksMethod) == null) {
      synchronized (SnapshotScheduleServiceGrpc.class) {
        if ((getUpdateDisksMethod = SnapshotScheduleServiceGrpc.getUpdateDisksMethod) == null) {
          SnapshotScheduleServiceGrpc.getUpdateDisksMethod = getUpdateDisksMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.UpdateSnapshotScheduleDisksRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateDisks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.UpdateSnapshotScheduleDisksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new SnapshotScheduleServiceMethodDescriptorSupplier("UpdateDisks"))
              .build();
        }
      }
    }
    return getUpdateDisksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.DisableSnapshotScheduleRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDisableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Disable",
      requestType = yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.DisableSnapshotScheduleRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.DisableSnapshotScheduleRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDisableMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.DisableSnapshotScheduleRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDisableMethod;
    if ((getDisableMethod = SnapshotScheduleServiceGrpc.getDisableMethod) == null) {
      synchronized (SnapshotScheduleServiceGrpc.class) {
        if ((getDisableMethod = SnapshotScheduleServiceGrpc.getDisableMethod) == null) {
          SnapshotScheduleServiceGrpc.getDisableMethod = getDisableMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.DisableSnapshotScheduleRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Disable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.DisableSnapshotScheduleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new SnapshotScheduleServiceMethodDescriptorSupplier("Disable"))
              .build();
        }
      }
    }
    return getDisableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.EnableSnapshotScheduleRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getEnableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Enable",
      requestType = yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.EnableSnapshotScheduleRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.EnableSnapshotScheduleRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getEnableMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.EnableSnapshotScheduleRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getEnableMethod;
    if ((getEnableMethod = SnapshotScheduleServiceGrpc.getEnableMethod) == null) {
      synchronized (SnapshotScheduleServiceGrpc.class) {
        if ((getEnableMethod = SnapshotScheduleServiceGrpc.getEnableMethod) == null) {
          SnapshotScheduleServiceGrpc.getEnableMethod = getEnableMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.EnableSnapshotScheduleRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Enable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.EnableSnapshotScheduleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new SnapshotScheduleServiceMethodDescriptorSupplier("Enable"))
              .build();
        }
      }
    }
    return getEnableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotScheduleOperationsRequest,
      yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotScheduleOperationsResponse> getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotScheduleOperationsRequest.class,
      responseType = yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotScheduleOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotScheduleOperationsRequest,
      yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotScheduleOperationsResponse> getListOperationsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotScheduleOperationsRequest, yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotScheduleOperationsResponse> getListOperationsMethod;
    if ((getListOperationsMethod = SnapshotScheduleServiceGrpc.getListOperationsMethod) == null) {
      synchronized (SnapshotScheduleServiceGrpc.class) {
        if ((getListOperationsMethod = SnapshotScheduleServiceGrpc.getListOperationsMethod) == null) {
          SnapshotScheduleServiceGrpc.getListOperationsMethod = getListOperationsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotScheduleOperationsRequest, yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotScheduleOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotScheduleOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotScheduleOperationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SnapshotScheduleServiceMethodDescriptorSupplier("ListOperations"))
              .build();
        }
      }
    }
    return getListOperationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotScheduleSnapshotsRequest,
      yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotScheduleSnapshotsResponse> getListSnapshotsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSnapshots",
      requestType = yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotScheduleSnapshotsRequest.class,
      responseType = yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotScheduleSnapshotsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotScheduleSnapshotsRequest,
      yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotScheduleSnapshotsResponse> getListSnapshotsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotScheduleSnapshotsRequest, yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotScheduleSnapshotsResponse> getListSnapshotsMethod;
    if ((getListSnapshotsMethod = SnapshotScheduleServiceGrpc.getListSnapshotsMethod) == null) {
      synchronized (SnapshotScheduleServiceGrpc.class) {
        if ((getListSnapshotsMethod = SnapshotScheduleServiceGrpc.getListSnapshotsMethod) == null) {
          SnapshotScheduleServiceGrpc.getListSnapshotsMethod = getListSnapshotsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotScheduleSnapshotsRequest, yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotScheduleSnapshotsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListSnapshots"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotScheduleSnapshotsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotScheduleSnapshotsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SnapshotScheduleServiceMethodDescriptorSupplier("ListSnapshots"))
              .build();
        }
      }
    }
    return getListSnapshotsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotScheduleDisksRequest,
      yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotScheduleDisksResponse> getListDisksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDisks",
      requestType = yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotScheduleDisksRequest.class,
      responseType = yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotScheduleDisksResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotScheduleDisksRequest,
      yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotScheduleDisksResponse> getListDisksMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotScheduleDisksRequest, yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotScheduleDisksResponse> getListDisksMethod;
    if ((getListDisksMethod = SnapshotScheduleServiceGrpc.getListDisksMethod) == null) {
      synchronized (SnapshotScheduleServiceGrpc.class) {
        if ((getListDisksMethod = SnapshotScheduleServiceGrpc.getListDisksMethod) == null) {
          SnapshotScheduleServiceGrpc.getListDisksMethod = getListDisksMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotScheduleDisksRequest, yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotScheduleDisksResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListDisks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotScheduleDisksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotScheduleDisksResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SnapshotScheduleServiceMethodDescriptorSupplier("ListDisks"))
              .build();
        }
      }
    }
    return getListDisksMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SnapshotScheduleServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SnapshotScheduleServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SnapshotScheduleServiceStub>() {
        @java.lang.Override
        public SnapshotScheduleServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SnapshotScheduleServiceStub(channel, callOptions);
        }
      };
    return SnapshotScheduleServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SnapshotScheduleServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SnapshotScheduleServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SnapshotScheduleServiceBlockingStub>() {
        @java.lang.Override
        public SnapshotScheduleServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SnapshotScheduleServiceBlockingStub(channel, callOptions);
        }
      };
    return SnapshotScheduleServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SnapshotScheduleServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SnapshotScheduleServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SnapshotScheduleServiceFutureStub>() {
        @java.lang.Override
        public SnapshotScheduleServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SnapshotScheduleServiceFutureStub(channel, callOptions);
        }
      };
    return SnapshotScheduleServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing snapshot schedules.
   * </pre>
   */
  public static abstract class SnapshotScheduleServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified snapshot schedule.
     * To get the list of available snapshot schedules, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.GetSnapshotScheduleRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.SnapshotScheduleOuterClass.SnapshotSchedule> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of snapshot schedules in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotSchedulesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotSchedulesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a snapshot schedule in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.CreateSnapshotScheduleRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified snapshot schedule.
     * The schedule is updated only after all snapshot creations and deletions triggered by the schedule are completed.
     * </pre>
     */
    public void update(yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.UpdateSnapshotScheduleRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified snapshot schedule.
     * Deleting a snapshot schedule removes its data permanently and is irreversible. However, deleting a schedule
     * does not delete any snapshots created by the schedule. You must delete snapshots separately.
     * The schedule is deleted only after all snapshot creations and deletions triggered by the schedule are completed.
     * </pre>
     */
    public void delete(yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.DeleteSnapshotScheduleRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the list of disks attached to the specified schedule.
     * The schedule is updated only after all snapshot creations and deletions triggered by the schedule are completed.
     * </pre>
     */
    public void updateDisks(yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.UpdateSnapshotScheduleDisksRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateDisksMethod(), responseObserver);
    }

    /**
     * <pre>
     * Disables the specified snapshot schedule.
     * The [SnapshotSchedule.status] is changed to `INACTIVE`: the schedule is interrupted, snapshots won't be created
     * or deleted.
     * The schedule is disabled only after all snapshot creations and deletions triggered by the schedule are completed.
     * </pre>
     */
    public void disable(yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.DisableSnapshotScheduleRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDisableMethod(), responseObserver);
    }

    /**
     * <pre>
     * Enables the specified snapshot schedule.
     * The [SnapshotSchedule.status] is changed to `ACTIVE`: new disk snapshots will be created, old ones deleted
     * (if [SnapshotSchedule.retention_policy] is specified).
     * </pre>
     */
    public void enable(yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.EnableSnapshotScheduleRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEnableMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified snapshot schedule.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotScheduleOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotScheduleOperationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of snapshots created by the specified snapshot schedule.
     * </pre>
     */
    public void listSnapshots(yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotScheduleSnapshotsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotScheduleSnapshotsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListSnapshotsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of disks attached to the specified snapshot schedule.
     * </pre>
     */
    public void listDisks(yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotScheduleDisksRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotScheduleDisksResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListDisksMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.GetSnapshotScheduleRequest,
                yandex.cloud.api.compute.v1.SnapshotScheduleOuterClass.SnapshotSchedule>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotSchedulesRequest,
                yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotSchedulesResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.CreateSnapshotScheduleRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.UpdateSnapshotScheduleRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.DeleteSnapshotScheduleRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getUpdateDisksMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.UpdateSnapshotScheduleDisksRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE_DISKS)))
          .addMethod(
            getDisableMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.DisableSnapshotScheduleRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DISABLE)))
          .addMethod(
            getEnableMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.EnableSnapshotScheduleRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_ENABLE)))
          .addMethod(
            getListOperationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotScheduleOperationsRequest,
                yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotScheduleOperationsResponse>(
                  this, METHODID_LIST_OPERATIONS)))
          .addMethod(
            getListSnapshotsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotScheduleSnapshotsRequest,
                yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotScheduleSnapshotsResponse>(
                  this, METHODID_LIST_SNAPSHOTS)))
          .addMethod(
            getListDisksMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotScheduleDisksRequest,
                yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotScheduleDisksResponse>(
                  this, METHODID_LIST_DISKS)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing snapshot schedules.
   * </pre>
   */
  public static final class SnapshotScheduleServiceStub extends io.grpc.stub.AbstractAsyncStub<SnapshotScheduleServiceStub> {
    private SnapshotScheduleServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SnapshotScheduleServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SnapshotScheduleServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified snapshot schedule.
     * To get the list of available snapshot schedules, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.GetSnapshotScheduleRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.SnapshotScheduleOuterClass.SnapshotSchedule> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of snapshot schedules in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotSchedulesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotSchedulesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a snapshot schedule in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.CreateSnapshotScheduleRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified snapshot schedule.
     * The schedule is updated only after all snapshot creations and deletions triggered by the schedule are completed.
     * </pre>
     */
    public void update(yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.UpdateSnapshotScheduleRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified snapshot schedule.
     * Deleting a snapshot schedule removes its data permanently and is irreversible. However, deleting a schedule
     * does not delete any snapshots created by the schedule. You must delete snapshots separately.
     * The schedule is deleted only after all snapshot creations and deletions triggered by the schedule are completed.
     * </pre>
     */
    public void delete(yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.DeleteSnapshotScheduleRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the list of disks attached to the specified schedule.
     * The schedule is updated only after all snapshot creations and deletions triggered by the schedule are completed.
     * </pre>
     */
    public void updateDisks(yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.UpdateSnapshotScheduleDisksRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateDisksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Disables the specified snapshot schedule.
     * The [SnapshotSchedule.status] is changed to `INACTIVE`: the schedule is interrupted, snapshots won't be created
     * or deleted.
     * The schedule is disabled only after all snapshot creations and deletions triggered by the schedule are completed.
     * </pre>
     */
    public void disable(yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.DisableSnapshotScheduleRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDisableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Enables the specified snapshot schedule.
     * The [SnapshotSchedule.status] is changed to `ACTIVE`: new disk snapshots will be created, old ones deleted
     * (if [SnapshotSchedule.retention_policy] is specified).
     * </pre>
     */
    public void enable(yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.EnableSnapshotScheduleRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEnableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified snapshot schedule.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotScheduleOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotScheduleOperationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of snapshots created by the specified snapshot schedule.
     * </pre>
     */
    public void listSnapshots(yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotScheduleSnapshotsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotScheduleSnapshotsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListSnapshotsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of disks attached to the specified snapshot schedule.
     * </pre>
     */
    public void listDisks(yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotScheduleDisksRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotScheduleDisksResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListDisksMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing snapshot schedules.
   * </pre>
   */
  public static final class SnapshotScheduleServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<SnapshotScheduleServiceBlockingStub> {
    private SnapshotScheduleServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SnapshotScheduleServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SnapshotScheduleServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified snapshot schedule.
     * To get the list of available snapshot schedules, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.compute.v1.SnapshotScheduleOuterClass.SnapshotSchedule get(yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.GetSnapshotScheduleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of snapshot schedules in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotSchedulesResponse list(yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotSchedulesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a snapshot schedule in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.CreateSnapshotScheduleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified snapshot schedule.
     * The schedule is updated only after all snapshot creations and deletions triggered by the schedule are completed.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.UpdateSnapshotScheduleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified snapshot schedule.
     * Deleting a snapshot schedule removes its data permanently and is irreversible. However, deleting a schedule
     * does not delete any snapshots created by the schedule. You must delete snapshots separately.
     * The schedule is deleted only after all snapshot creations and deletions triggered by the schedule are completed.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.DeleteSnapshotScheduleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the list of disks attached to the specified schedule.
     * The schedule is updated only after all snapshot creations and deletions triggered by the schedule are completed.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation updateDisks(yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.UpdateSnapshotScheduleDisksRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateDisksMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Disables the specified snapshot schedule.
     * The [SnapshotSchedule.status] is changed to `INACTIVE`: the schedule is interrupted, snapshots won't be created
     * or deleted.
     * The schedule is disabled only after all snapshot creations and deletions triggered by the schedule are completed.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation disable(yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.DisableSnapshotScheduleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDisableMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Enables the specified snapshot schedule.
     * The [SnapshotSchedule.status] is changed to `ACTIVE`: new disk snapshots will be created, old ones deleted
     * (if [SnapshotSchedule.retention_policy] is specified).
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation enable(yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.EnableSnapshotScheduleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEnableMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists operations for the specified snapshot schedule.
     * </pre>
     */
    public yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotScheduleOperationsResponse listOperations(yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotScheduleOperationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of snapshots created by the specified snapshot schedule.
     * </pre>
     */
    public yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotScheduleSnapshotsResponse listSnapshots(yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotScheduleSnapshotsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListSnapshotsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of disks attached to the specified snapshot schedule.
     * </pre>
     */
    public yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotScheduleDisksResponse listDisks(yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotScheduleDisksRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListDisksMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing snapshot schedules.
   * </pre>
   */
  public static final class SnapshotScheduleServiceFutureStub extends io.grpc.stub.AbstractFutureStub<SnapshotScheduleServiceFutureStub> {
    private SnapshotScheduleServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SnapshotScheduleServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SnapshotScheduleServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified snapshot schedule.
     * To get the list of available snapshot schedules, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.compute.v1.SnapshotScheduleOuterClass.SnapshotSchedule> get(
        yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.GetSnapshotScheduleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of snapshot schedules in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotSchedulesResponse> list(
        yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotSchedulesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a snapshot schedule in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.CreateSnapshotScheduleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified snapshot schedule.
     * The schedule is updated only after all snapshot creations and deletions triggered by the schedule are completed.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.UpdateSnapshotScheduleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified snapshot schedule.
     * Deleting a snapshot schedule removes its data permanently and is irreversible. However, deleting a schedule
     * does not delete any snapshots created by the schedule. You must delete snapshots separately.
     * The schedule is deleted only after all snapshot creations and deletions triggered by the schedule are completed.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.DeleteSnapshotScheduleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the list of disks attached to the specified schedule.
     * The schedule is updated only after all snapshot creations and deletions triggered by the schedule are completed.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> updateDisks(
        yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.UpdateSnapshotScheduleDisksRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateDisksMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Disables the specified snapshot schedule.
     * The [SnapshotSchedule.status] is changed to `INACTIVE`: the schedule is interrupted, snapshots won't be created
     * or deleted.
     * The schedule is disabled only after all snapshot creations and deletions triggered by the schedule are completed.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> disable(
        yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.DisableSnapshotScheduleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDisableMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Enables the specified snapshot schedule.
     * The [SnapshotSchedule.status] is changed to `ACTIVE`: new disk snapshots will be created, old ones deleted
     * (if [SnapshotSchedule.retention_policy] is specified).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> enable(
        yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.EnableSnapshotScheduleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEnableMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists operations for the specified snapshot schedule.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotScheduleOperationsResponse> listOperations(
        yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotScheduleOperationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of snapshots created by the specified snapshot schedule.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotScheduleSnapshotsResponse> listSnapshots(
        yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotScheduleSnapshotsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListSnapshotsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of disks attached to the specified snapshot schedule.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotScheduleDisksResponse> listDisks(
        yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotScheduleDisksRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListDisksMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_DELETE = 4;
  private static final int METHODID_UPDATE_DISKS = 5;
  private static final int METHODID_DISABLE = 6;
  private static final int METHODID_ENABLE = 7;
  private static final int METHODID_LIST_OPERATIONS = 8;
  private static final int METHODID_LIST_SNAPSHOTS = 9;
  private static final int METHODID_LIST_DISKS = 10;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SnapshotScheduleServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SnapshotScheduleServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.GetSnapshotScheduleRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.SnapshotScheduleOuterClass.SnapshotSchedule>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotSchedulesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotSchedulesResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.CreateSnapshotScheduleRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.UpdateSnapshotScheduleRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.DeleteSnapshotScheduleRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE_DISKS:
          serviceImpl.updateDisks((yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.UpdateSnapshotScheduleDisksRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DISABLE:
          serviceImpl.disable((yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.DisableSnapshotScheduleRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_ENABLE:
          serviceImpl.enable((yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.EnableSnapshotScheduleRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotScheduleOperationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotScheduleOperationsResponse>) responseObserver);
          break;
        case METHODID_LIST_SNAPSHOTS:
          serviceImpl.listSnapshots((yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotScheduleSnapshotsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotScheduleSnapshotsResponse>) responseObserver);
          break;
        case METHODID_LIST_DISKS:
          serviceImpl.listDisks((yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotScheduleDisksRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.ListSnapshotScheduleDisksResponse>) responseObserver);
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

  private static abstract class SnapshotScheduleServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SnapshotScheduleServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.compute.v1.SnapshotScheduleServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SnapshotScheduleService");
    }
  }

  private static final class SnapshotScheduleServiceFileDescriptorSupplier
      extends SnapshotScheduleServiceBaseDescriptorSupplier {
    SnapshotScheduleServiceFileDescriptorSupplier() {}
  }

  private static final class SnapshotScheduleServiceMethodDescriptorSupplier
      extends SnapshotScheduleServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SnapshotScheduleServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SnapshotScheduleServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SnapshotScheduleServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getUpdateDisksMethod())
              .addMethod(getDisableMethod())
              .addMethod(getEnableMethod())
              .addMethod(getListOperationsMethod())
              .addMethod(getListSnapshotsMethod())
              .addMethod(getListDisksMethod())
              .build();
        }
      }
    }
    return result;
  }
}
