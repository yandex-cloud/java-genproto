package yandex.cloud.api.mdb.redis.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing Redis clusters.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/mdb/redis/v1/cluster_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ClusterServiceGrpc {

  private ClusterServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.mdb.redis.v1.ClusterService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.GetClusterRequest,
      yandex.cloud.api.mdb.redis.v1.ClusterOuterClass.Cluster> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.GetClusterRequest.class,
      responseType = yandex.cloud.api.mdb.redis.v1.ClusterOuterClass.Cluster.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.GetClusterRequest,
      yandex.cloud.api.mdb.redis.v1.ClusterOuterClass.Cluster> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.GetClusterRequest, yandex.cloud.api.mdb.redis.v1.ClusterOuterClass.Cluster> getGetMethod;
    if ((getGetMethod = ClusterServiceGrpc.getGetMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getGetMethod = ClusterServiceGrpc.getGetMethod) == null) {
          ClusterServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.GetClusterRequest, yandex.cloud.api.mdb.redis.v1.ClusterOuterClass.Cluster>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.GetClusterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.redis.v1.ClusterOuterClass.Cluster.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClustersRequest,
      yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClustersResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClustersRequest.class,
      responseType = yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClustersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClustersRequest,
      yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClustersResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClustersRequest, yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClustersResponse> getListMethod;
    if ((getListMethod = ClusterServiceGrpc.getListMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getListMethod = ClusterServiceGrpc.getListMethod) == null) {
          ClusterServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClustersRequest, yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClustersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClustersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClustersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.CreateClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.CreateClusterRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.CreateClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.CreateClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = ClusterServiceGrpc.getCreateMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getCreateMethod = ClusterServiceGrpc.getCreateMethod) == null) {
          ClusterServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.CreateClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.CreateClusterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.UpdateClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.UpdateClusterRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.UpdateClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.UpdateClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = ClusterServiceGrpc.getUpdateMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getUpdateMethod = ClusterServiceGrpc.getUpdateMethod) == null) {
          ClusterServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.UpdateClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.UpdateClusterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.DeleteClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.DeleteClusterRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.DeleteClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.DeleteClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = ClusterServiceGrpc.getDeleteMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getDeleteMethod = ClusterServiceGrpc.getDeleteMethod) == null) {
          ClusterServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.DeleteClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.DeleteClusterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.StartClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getStartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Start",
      requestType = yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.StartClusterRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.StartClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getStartMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.StartClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getStartMethod;
    if ((getStartMethod = ClusterServiceGrpc.getStartMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getStartMethod = ClusterServiceGrpc.getStartMethod) == null) {
          ClusterServiceGrpc.getStartMethod = getStartMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.StartClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Start"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.StartClusterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("Start"))
              .build();
        }
      }
    }
    return getStartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.StopClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getStopMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Stop",
      requestType = yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.StopClusterRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.StopClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getStopMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.StopClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getStopMethod;
    if ((getStopMethod = ClusterServiceGrpc.getStopMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getStopMethod = ClusterServiceGrpc.getStopMethod) == null) {
          ClusterServiceGrpc.getStopMethod = getStopMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.StopClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Stop"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.StopClusterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("Stop"))
              .build();
        }
      }
    }
    return getStopMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.MoveClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getMoveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Move",
      requestType = yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.MoveClusterRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.MoveClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getMoveMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.MoveClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getMoveMethod;
    if ((getMoveMethod = ClusterServiceGrpc.getMoveMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getMoveMethod = ClusterServiceGrpc.getMoveMethod) == null) {
          ClusterServiceGrpc.getMoveMethod = getMoveMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.MoveClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Move"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.MoveClusterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("Move"))
              .build();
        }
      }
    }
    return getMoveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.BackupClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getBackupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Backup",
      requestType = yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.BackupClusterRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.BackupClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getBackupMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.BackupClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getBackupMethod;
    if ((getBackupMethod = ClusterServiceGrpc.getBackupMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getBackupMethod = ClusterServiceGrpc.getBackupMethod) == null) {
          ClusterServiceGrpc.getBackupMethod = getBackupMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.BackupClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Backup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.BackupClusterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("Backup"))
              .build();
        }
      }
    }
    return getBackupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.RestoreClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRestoreMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Restore",
      requestType = yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.RestoreClusterRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.RestoreClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRestoreMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.RestoreClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getRestoreMethod;
    if ((getRestoreMethod = ClusterServiceGrpc.getRestoreMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getRestoreMethod = ClusterServiceGrpc.getRestoreMethod) == null) {
          ClusterServiceGrpc.getRestoreMethod = getRestoreMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.RestoreClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Restore"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.RestoreClusterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("Restore"))
              .build();
        }
      }
    }
    return getRestoreMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.RescheduleMaintenanceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRescheduleMaintenanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RescheduleMaintenance",
      requestType = yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.RescheduleMaintenanceRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.RescheduleMaintenanceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRescheduleMaintenanceMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.RescheduleMaintenanceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getRescheduleMaintenanceMethod;
    if ((getRescheduleMaintenanceMethod = ClusterServiceGrpc.getRescheduleMaintenanceMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getRescheduleMaintenanceMethod = ClusterServiceGrpc.getRescheduleMaintenanceMethod) == null) {
          ClusterServiceGrpc.getRescheduleMaintenanceMethod = getRescheduleMaintenanceMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.RescheduleMaintenanceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RescheduleMaintenance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.RescheduleMaintenanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("RescheduleMaintenance"))
              .build();
        }
      }
    }
    return getRescheduleMaintenanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.StartClusterFailoverRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getStartFailoverMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartFailover",
      requestType = yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.StartClusterFailoverRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.StartClusterFailoverRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getStartFailoverMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.StartClusterFailoverRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getStartFailoverMethod;
    if ((getStartFailoverMethod = ClusterServiceGrpc.getStartFailoverMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getStartFailoverMethod = ClusterServiceGrpc.getStartFailoverMethod) == null) {
          ClusterServiceGrpc.getStartFailoverMethod = getStartFailoverMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.StartClusterFailoverRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StartFailover"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.StartClusterFailoverRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("StartFailover"))
              .build();
        }
      }
    }
    return getStartFailoverMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterLogsRequest,
      yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterLogsResponse> getListLogsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListLogs",
      requestType = yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterLogsRequest.class,
      responseType = yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterLogsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterLogsRequest,
      yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterLogsResponse> getListLogsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterLogsRequest, yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterLogsResponse> getListLogsMethod;
    if ((getListLogsMethod = ClusterServiceGrpc.getListLogsMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getListLogsMethod = ClusterServiceGrpc.getListLogsMethod) == null) {
          ClusterServiceGrpc.getListLogsMethod = getListLogsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterLogsRequest, yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterLogsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListLogs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterLogsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterLogsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("ListLogs"))
              .build();
        }
      }
    }
    return getListLogsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.StreamClusterLogsRequest,
      yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.StreamLogRecord> getStreamLogsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamLogs",
      requestType = yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.StreamClusterLogsRequest.class,
      responseType = yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.StreamLogRecord.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.StreamClusterLogsRequest,
      yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.StreamLogRecord> getStreamLogsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.StreamClusterLogsRequest, yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.StreamLogRecord> getStreamLogsMethod;
    if ((getStreamLogsMethod = ClusterServiceGrpc.getStreamLogsMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getStreamLogsMethod = ClusterServiceGrpc.getStreamLogsMethod) == null) {
          ClusterServiceGrpc.getStreamLogsMethod = getStreamLogsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.StreamClusterLogsRequest, yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.StreamLogRecord>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamLogs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.StreamClusterLogsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.StreamLogRecord.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("StreamLogs"))
              .build();
        }
      }
    }
    return getStreamLogsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterOperationsRequest,
      yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterOperationsResponse> getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterOperationsRequest.class,
      responseType = yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterOperationsRequest,
      yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterOperationsResponse> getListOperationsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterOperationsRequest, yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterOperationsResponse> getListOperationsMethod;
    if ((getListOperationsMethod = ClusterServiceGrpc.getListOperationsMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getListOperationsMethod = ClusterServiceGrpc.getListOperationsMethod) == null) {
          ClusterServiceGrpc.getListOperationsMethod = getListOperationsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterOperationsRequest, yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterOperationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("ListOperations"))
              .build();
        }
      }
    }
    return getListOperationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterBackupsRequest,
      yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterBackupsResponse> getListBackupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListBackups",
      requestType = yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterBackupsRequest.class,
      responseType = yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterBackupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterBackupsRequest,
      yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterBackupsResponse> getListBackupsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterBackupsRequest, yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterBackupsResponse> getListBackupsMethod;
    if ((getListBackupsMethod = ClusterServiceGrpc.getListBackupsMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getListBackupsMethod = ClusterServiceGrpc.getListBackupsMethod) == null) {
          ClusterServiceGrpc.getListBackupsMethod = getListBackupsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterBackupsRequest, yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterBackupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListBackups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterBackupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterBackupsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("ListBackups"))
              .build();
        }
      }
    }
    return getListBackupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterHostsRequest,
      yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterHostsResponse> getListHostsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListHosts",
      requestType = yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterHostsRequest.class,
      responseType = yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterHostsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterHostsRequest,
      yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterHostsResponse> getListHostsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterHostsRequest, yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterHostsResponse> getListHostsMethod;
    if ((getListHostsMethod = ClusterServiceGrpc.getListHostsMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getListHostsMethod = ClusterServiceGrpc.getListHostsMethod) == null) {
          ClusterServiceGrpc.getListHostsMethod = getListHostsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterHostsRequest, yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterHostsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListHosts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterHostsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterHostsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("ListHosts"))
              .build();
        }
      }
    }
    return getListHostsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.AddClusterHostsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getAddHostsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddHosts",
      requestType = yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.AddClusterHostsRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.AddClusterHostsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getAddHostsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.AddClusterHostsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getAddHostsMethod;
    if ((getAddHostsMethod = ClusterServiceGrpc.getAddHostsMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getAddHostsMethod = ClusterServiceGrpc.getAddHostsMethod) == null) {
          ClusterServiceGrpc.getAddHostsMethod = getAddHostsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.AddClusterHostsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddHosts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.AddClusterHostsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("AddHosts"))
              .build();
        }
      }
    }
    return getAddHostsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.DeleteClusterHostsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteHostsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteHosts",
      requestType = yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.DeleteClusterHostsRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.DeleteClusterHostsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteHostsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.DeleteClusterHostsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteHostsMethod;
    if ((getDeleteHostsMethod = ClusterServiceGrpc.getDeleteHostsMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getDeleteHostsMethod = ClusterServiceGrpc.getDeleteHostsMethod) == null) {
          ClusterServiceGrpc.getDeleteHostsMethod = getDeleteHostsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.DeleteClusterHostsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteHosts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.DeleteClusterHostsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("DeleteHosts"))
              .build();
        }
      }
    }
    return getDeleteHostsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.UpdateClusterHostsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateHostsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateHosts",
      requestType = yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.UpdateClusterHostsRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.UpdateClusterHostsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateHostsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.UpdateClusterHostsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateHostsMethod;
    if ((getUpdateHostsMethod = ClusterServiceGrpc.getUpdateHostsMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getUpdateHostsMethod = ClusterServiceGrpc.getUpdateHostsMethod) == null) {
          ClusterServiceGrpc.getUpdateHostsMethod = getUpdateHostsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.UpdateClusterHostsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateHosts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.UpdateClusterHostsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("UpdateHosts"))
              .build();
        }
      }
    }
    return getUpdateHostsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.GetClusterShardRequest,
      yandex.cloud.api.mdb.redis.v1.ClusterOuterClass.Shard> getGetShardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetShard",
      requestType = yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.GetClusterShardRequest.class,
      responseType = yandex.cloud.api.mdb.redis.v1.ClusterOuterClass.Shard.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.GetClusterShardRequest,
      yandex.cloud.api.mdb.redis.v1.ClusterOuterClass.Shard> getGetShardMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.GetClusterShardRequest, yandex.cloud.api.mdb.redis.v1.ClusterOuterClass.Shard> getGetShardMethod;
    if ((getGetShardMethod = ClusterServiceGrpc.getGetShardMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getGetShardMethod = ClusterServiceGrpc.getGetShardMethod) == null) {
          ClusterServiceGrpc.getGetShardMethod = getGetShardMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.GetClusterShardRequest, yandex.cloud.api.mdb.redis.v1.ClusterOuterClass.Shard>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetShard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.GetClusterShardRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.redis.v1.ClusterOuterClass.Shard.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("GetShard"))
              .build();
        }
      }
    }
    return getGetShardMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterShardsRequest,
      yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterShardsResponse> getListShardsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListShards",
      requestType = yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterShardsRequest.class,
      responseType = yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterShardsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterShardsRequest,
      yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterShardsResponse> getListShardsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterShardsRequest, yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterShardsResponse> getListShardsMethod;
    if ((getListShardsMethod = ClusterServiceGrpc.getListShardsMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getListShardsMethod = ClusterServiceGrpc.getListShardsMethod) == null) {
          ClusterServiceGrpc.getListShardsMethod = getListShardsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterShardsRequest, yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterShardsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListShards"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterShardsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterShardsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("ListShards"))
              .build();
        }
      }
    }
    return getListShardsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.AddClusterShardRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getAddShardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddShard",
      requestType = yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.AddClusterShardRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.AddClusterShardRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getAddShardMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.AddClusterShardRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getAddShardMethod;
    if ((getAddShardMethod = ClusterServiceGrpc.getAddShardMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getAddShardMethod = ClusterServiceGrpc.getAddShardMethod) == null) {
          ClusterServiceGrpc.getAddShardMethod = getAddShardMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.AddClusterShardRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddShard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.AddClusterShardRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("AddShard"))
              .build();
        }
      }
    }
    return getAddShardMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.DeleteClusterShardRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteShardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteShard",
      requestType = yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.DeleteClusterShardRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.DeleteClusterShardRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteShardMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.DeleteClusterShardRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteShardMethod;
    if ((getDeleteShardMethod = ClusterServiceGrpc.getDeleteShardMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getDeleteShardMethod = ClusterServiceGrpc.getDeleteShardMethod) == null) {
          ClusterServiceGrpc.getDeleteShardMethod = getDeleteShardMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.DeleteClusterShardRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteShard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.DeleteClusterShardRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("DeleteShard"))
              .build();
        }
      }
    }
    return getDeleteShardMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.RebalanceClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRebalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Rebalance",
      requestType = yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.RebalanceClusterRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.RebalanceClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRebalanceMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.RebalanceClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getRebalanceMethod;
    if ((getRebalanceMethod = ClusterServiceGrpc.getRebalanceMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getRebalanceMethod = ClusterServiceGrpc.getRebalanceMethod) == null) {
          ClusterServiceGrpc.getRebalanceMethod = getRebalanceMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.RebalanceClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Rebalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.RebalanceClusterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("Rebalance"))
              .build();
        }
      }
    }
    return getRebalanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.EnableShardingClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getEnableShardingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnableSharding",
      requestType = yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.EnableShardingClusterRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.EnableShardingClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getEnableShardingMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.EnableShardingClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getEnableShardingMethod;
    if ((getEnableShardingMethod = ClusterServiceGrpc.getEnableShardingMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getEnableShardingMethod = ClusterServiceGrpc.getEnableShardingMethod) == null) {
          ClusterServiceGrpc.getEnableShardingMethod = getEnableShardingMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.EnableShardingClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EnableSharding"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.EnableShardingClusterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("EnableSharding"))
              .build();
        }
      }
    }
    return getEnableShardingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ClusterServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClusterServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClusterServiceStub>() {
        @java.lang.Override
        public ClusterServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClusterServiceStub(channel, callOptions);
        }
      };
    return ClusterServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ClusterServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClusterServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClusterServiceBlockingStub>() {
        @java.lang.Override
        public ClusterServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClusterServiceBlockingStub(channel, callOptions);
        }
      };
    return ClusterServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ClusterServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClusterServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClusterServiceFutureStub>() {
        @java.lang.Override
        public ClusterServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClusterServiceFutureStub(channel, callOptions);
        }
      };
    return ClusterServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing Redis clusters.
   * </pre>
   */
  public static abstract class ClusterServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified Redis cluster.
     * To get the list of available Redis clusters, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.GetClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.redis.v1.ClusterOuterClass.Cluster> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of Redis clusters that belong
     * to the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClustersRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClustersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a Redis cluster in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.CreateClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified Redis cluster.
     * </pre>
     */
    public void update(yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.UpdateClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified Redis cluster.
     * </pre>
     */
    public void delete(yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.DeleteClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Start the specified Redis cluster.
     * </pre>
     */
    public void start(yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.StartClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStartMethod(), responseObserver);
    }

    /**
     * <pre>
     * Stop the specified Redis cluster.
     * </pre>
     */
    public void stop(yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.StopClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStopMethod(), responseObserver);
    }

    /**
     * <pre>
     * Moves a Redis cluster to the specified folder.
     * </pre>
     */
    public void move(yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.MoveClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMoveMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a backup for the specified Redis cluster.
     * </pre>
     */
    public void backup(yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.BackupClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBackupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a new Redis cluster using the specified backup.
     * </pre>
     */
    public void restore(yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.RestoreClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRestoreMethod(), responseObserver);
    }

    /**
     * <pre>
     * Reschedules planned maintenance operation.
     * </pre>
     */
    public void rescheduleMaintenance(yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.RescheduleMaintenanceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRescheduleMaintenanceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Start a manual failover on the specified Redis cluster.
     * </pre>
     */
    public void startFailover(yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.StartClusterFailoverRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStartFailoverMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves logs for the specified Redis cluster.
     * </pre>
     */
    public void listLogs(yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterLogsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterLogsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListLogsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Same as ListLogs but using server-side streaming. Also allows for 'tail -f' semantics.
     * </pre>
     */
    public void streamLogs(yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.StreamClusterLogsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.StreamLogRecord> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStreamLogsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of operations for the specified cluster.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterOperationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of available backups for the specified Redis cluster.
     * </pre>
     */
    public void listBackups(yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterBackupsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterBackupsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListBackupsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves a list of hosts for the specified cluster.
     * </pre>
     */
    public void listHosts(yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterHostsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterHostsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListHostsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates new hosts for a cluster.
     * </pre>
     */
    public void addHosts(yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.AddClusterHostsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddHostsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified hosts for a cluster.
     * </pre>
     */
    public void deleteHosts(yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.DeleteClusterHostsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteHostsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified hosts.
     * </pre>
     */
    public void updateHosts(yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.UpdateClusterHostsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateHostsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the specified shard.
     * </pre>
     */
    public void getShard(yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.GetClusterShardRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.redis.v1.ClusterOuterClass.Shard> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetShardMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves a list of shards.
     * </pre>
     */
    public void listShards(yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterShardsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterShardsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListShardsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a new shard.
     * </pre>
     */
    public void addShard(yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.AddClusterShardRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddShardMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified shard.
     * </pre>
     */
    public void deleteShard(yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.DeleteClusterShardRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteShardMethod(), responseObserver);
    }

    /**
     * <pre>
     * Rebalances the cluster. Evenly distributes all the hash slots between the shards.
     * </pre>
     */
    public void rebalance(yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.RebalanceClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRebalanceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Enable Sharding on non sharded cluster
     * </pre>
     */
    public void enableSharding(yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.EnableShardingClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEnableShardingMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.GetClusterRequest,
                yandex.cloud.api.mdb.redis.v1.ClusterOuterClass.Cluster>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClustersRequest,
                yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClustersResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.CreateClusterRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.UpdateClusterRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.DeleteClusterRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getStartMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.StartClusterRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_START)))
          .addMethod(
            getStopMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.StopClusterRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_STOP)))
          .addMethod(
            getMoveMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.MoveClusterRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_MOVE)))
          .addMethod(
            getBackupMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.BackupClusterRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_BACKUP)))
          .addMethod(
            getRestoreMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.RestoreClusterRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_RESTORE)))
          .addMethod(
            getRescheduleMaintenanceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.RescheduleMaintenanceRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_RESCHEDULE_MAINTENANCE)))
          .addMethod(
            getStartFailoverMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.StartClusterFailoverRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_START_FAILOVER)))
          .addMethod(
            getListLogsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterLogsRequest,
                yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterLogsResponse>(
                  this, METHODID_LIST_LOGS)))
          .addMethod(
            getStreamLogsMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.StreamClusterLogsRequest,
                yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.StreamLogRecord>(
                  this, METHODID_STREAM_LOGS)))
          .addMethod(
            getListOperationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterOperationsRequest,
                yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterOperationsResponse>(
                  this, METHODID_LIST_OPERATIONS)))
          .addMethod(
            getListBackupsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterBackupsRequest,
                yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterBackupsResponse>(
                  this, METHODID_LIST_BACKUPS)))
          .addMethod(
            getListHostsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterHostsRequest,
                yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterHostsResponse>(
                  this, METHODID_LIST_HOSTS)))
          .addMethod(
            getAddHostsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.AddClusterHostsRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_ADD_HOSTS)))
          .addMethod(
            getDeleteHostsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.DeleteClusterHostsRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE_HOSTS)))
          .addMethod(
            getUpdateHostsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.UpdateClusterHostsRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE_HOSTS)))
          .addMethod(
            getGetShardMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.GetClusterShardRequest,
                yandex.cloud.api.mdb.redis.v1.ClusterOuterClass.Shard>(
                  this, METHODID_GET_SHARD)))
          .addMethod(
            getListShardsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterShardsRequest,
                yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterShardsResponse>(
                  this, METHODID_LIST_SHARDS)))
          .addMethod(
            getAddShardMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.AddClusterShardRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_ADD_SHARD)))
          .addMethod(
            getDeleteShardMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.DeleteClusterShardRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE_SHARD)))
          .addMethod(
            getRebalanceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.RebalanceClusterRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_REBALANCE)))
          .addMethod(
            getEnableShardingMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.EnableShardingClusterRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_ENABLE_SHARDING)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing Redis clusters.
   * </pre>
   */
  public static final class ClusterServiceStub extends io.grpc.stub.AbstractAsyncStub<ClusterServiceStub> {
    private ClusterServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClusterServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClusterServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified Redis cluster.
     * To get the list of available Redis clusters, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.GetClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.redis.v1.ClusterOuterClass.Cluster> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of Redis clusters that belong
     * to the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClustersRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClustersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a Redis cluster in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.CreateClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified Redis cluster.
     * </pre>
     */
    public void update(yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.UpdateClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified Redis cluster.
     * </pre>
     */
    public void delete(yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.DeleteClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Start the specified Redis cluster.
     * </pre>
     */
    public void start(yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.StartClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Stop the specified Redis cluster.
     * </pre>
     */
    public void stop(yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.StopClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStopMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Moves a Redis cluster to the specified folder.
     * </pre>
     */
    public void move(yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.MoveClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMoveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a backup for the specified Redis cluster.
     * </pre>
     */
    public void backup(yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.BackupClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBackupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a new Redis cluster using the specified backup.
     * </pre>
     */
    public void restore(yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.RestoreClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRestoreMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Reschedules planned maintenance operation.
     * </pre>
     */
    public void rescheduleMaintenance(yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.RescheduleMaintenanceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRescheduleMaintenanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Start a manual failover on the specified Redis cluster.
     * </pre>
     */
    public void startFailover(yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.StartClusterFailoverRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStartFailoverMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves logs for the specified Redis cluster.
     * </pre>
     */
    public void listLogs(yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterLogsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterLogsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListLogsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Same as ListLogs but using server-side streaming. Also allows for 'tail -f' semantics.
     * </pre>
     */
    public void streamLogs(yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.StreamClusterLogsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.StreamLogRecord> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getStreamLogsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of operations for the specified cluster.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterOperationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of available backups for the specified Redis cluster.
     * </pre>
     */
    public void listBackups(yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterBackupsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterBackupsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListBackupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves a list of hosts for the specified cluster.
     * </pre>
     */
    public void listHosts(yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterHostsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterHostsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListHostsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates new hosts for a cluster.
     * </pre>
     */
    public void addHosts(yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.AddClusterHostsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddHostsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified hosts for a cluster.
     * </pre>
     */
    public void deleteHosts(yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.DeleteClusterHostsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteHostsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified hosts.
     * </pre>
     */
    public void updateHosts(yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.UpdateClusterHostsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateHostsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the specified shard.
     * </pre>
     */
    public void getShard(yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.GetClusterShardRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.redis.v1.ClusterOuterClass.Shard> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetShardMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves a list of shards.
     * </pre>
     */
    public void listShards(yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterShardsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterShardsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListShardsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a new shard.
     * </pre>
     */
    public void addShard(yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.AddClusterShardRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddShardMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified shard.
     * </pre>
     */
    public void deleteShard(yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.DeleteClusterShardRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteShardMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Rebalances the cluster. Evenly distributes all the hash slots between the shards.
     * </pre>
     */
    public void rebalance(yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.RebalanceClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRebalanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Enable Sharding on non sharded cluster
     * </pre>
     */
    public void enableSharding(yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.EnableShardingClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEnableShardingMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Redis clusters.
   * </pre>
   */
  public static final class ClusterServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ClusterServiceBlockingStub> {
    private ClusterServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClusterServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClusterServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified Redis cluster.
     * To get the list of available Redis clusters, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.mdb.redis.v1.ClusterOuterClass.Cluster get(yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.GetClusterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of Redis clusters that belong
     * to the specified folder.
     * </pre>
     */
    public yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClustersResponse list(yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClustersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a Redis cluster in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.CreateClusterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified Redis cluster.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.UpdateClusterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified Redis cluster.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.DeleteClusterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Start the specified Redis cluster.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation start(yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.StartClusterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStartMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Stop the specified Redis cluster.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation stop(yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.StopClusterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStopMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Moves a Redis cluster to the specified folder.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation move(yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.MoveClusterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMoveMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a backup for the specified Redis cluster.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation backup(yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.BackupClusterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBackupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new Redis cluster using the specified backup.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation restore(yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.RestoreClusterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRestoreMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Reschedules planned maintenance operation.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation rescheduleMaintenance(yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.RescheduleMaintenanceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRescheduleMaintenanceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Start a manual failover on the specified Redis cluster.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation startFailover(yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.StartClusterFailoverRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStartFailoverMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves logs for the specified Redis cluster.
     * </pre>
     */
    public yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterLogsResponse listLogs(yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterLogsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListLogsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Same as ListLogs but using server-side streaming. Also allows for 'tail -f' semantics.
     * </pre>
     */
    public java.util.Iterator<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.StreamLogRecord> streamLogs(
        yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.StreamClusterLogsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getStreamLogsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of operations for the specified cluster.
     * </pre>
     */
    public yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterOperationsResponse listOperations(yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterOperationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of available backups for the specified Redis cluster.
     * </pre>
     */
    public yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterBackupsResponse listBackups(yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterBackupsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListBackupsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves a list of hosts for the specified cluster.
     * </pre>
     */
    public yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterHostsResponse listHosts(yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterHostsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListHostsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates new hosts for a cluster.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation addHosts(yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.AddClusterHostsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddHostsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified hosts for a cluster.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation deleteHosts(yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.DeleteClusterHostsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteHostsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified hosts.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation updateHosts(yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.UpdateClusterHostsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateHostsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the specified shard.
     * </pre>
     */
    public yandex.cloud.api.mdb.redis.v1.ClusterOuterClass.Shard getShard(yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.GetClusterShardRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetShardMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves a list of shards.
     * </pre>
     */
    public yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterShardsResponse listShards(yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterShardsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListShardsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new shard.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation addShard(yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.AddClusterShardRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddShardMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified shard.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation deleteShard(yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.DeleteClusterShardRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteShardMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Rebalances the cluster. Evenly distributes all the hash slots between the shards.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation rebalance(yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.RebalanceClusterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRebalanceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Enable Sharding on non sharded cluster
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation enableSharding(yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.EnableShardingClusterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEnableShardingMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Redis clusters.
   * </pre>
   */
  public static final class ClusterServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ClusterServiceFutureStub> {
    private ClusterServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClusterServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClusterServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified Redis cluster.
     * To get the list of available Redis clusters, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.mdb.redis.v1.ClusterOuterClass.Cluster> get(
        yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.GetClusterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of Redis clusters that belong
     * to the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClustersResponse> list(
        yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClustersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a Redis cluster in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.CreateClusterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified Redis cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.UpdateClusterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified Redis cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.DeleteClusterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Start the specified Redis cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> start(
        yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.StartClusterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStartMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Stop the specified Redis cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> stop(
        yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.StopClusterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStopMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Moves a Redis cluster to the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> move(
        yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.MoveClusterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMoveMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a backup for the specified Redis cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> backup(
        yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.BackupClusterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBackupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a new Redis cluster using the specified backup.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> restore(
        yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.RestoreClusterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRestoreMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Reschedules planned maintenance operation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> rescheduleMaintenance(
        yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.RescheduleMaintenanceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRescheduleMaintenanceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Start a manual failover on the specified Redis cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> startFailover(
        yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.StartClusterFailoverRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStartFailoverMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves logs for the specified Redis cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterLogsResponse> listLogs(
        yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterLogsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListLogsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of operations for the specified cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterOperationsResponse> listOperations(
        yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterOperationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of available backups for the specified Redis cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterBackupsResponse> listBackups(
        yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterBackupsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListBackupsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves a list of hosts for the specified cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterHostsResponse> listHosts(
        yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterHostsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListHostsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates new hosts for a cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> addHosts(
        yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.AddClusterHostsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddHostsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified hosts for a cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> deleteHosts(
        yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.DeleteClusterHostsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteHostsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified hosts.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> updateHosts(
        yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.UpdateClusterHostsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateHostsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the specified shard.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.mdb.redis.v1.ClusterOuterClass.Shard> getShard(
        yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.GetClusterShardRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetShardMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves a list of shards.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterShardsResponse> listShards(
        yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterShardsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListShardsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a new shard.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> addShard(
        yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.AddClusterShardRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddShardMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified shard.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> deleteShard(
        yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.DeleteClusterShardRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteShardMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Rebalances the cluster. Evenly distributes all the hash slots between the shards.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> rebalance(
        yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.RebalanceClusterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRebalanceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Enable Sharding on non sharded cluster
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> enableSharding(
        yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.EnableShardingClusterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEnableShardingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_DELETE = 4;
  private static final int METHODID_START = 5;
  private static final int METHODID_STOP = 6;
  private static final int METHODID_MOVE = 7;
  private static final int METHODID_BACKUP = 8;
  private static final int METHODID_RESTORE = 9;
  private static final int METHODID_RESCHEDULE_MAINTENANCE = 10;
  private static final int METHODID_START_FAILOVER = 11;
  private static final int METHODID_LIST_LOGS = 12;
  private static final int METHODID_STREAM_LOGS = 13;
  private static final int METHODID_LIST_OPERATIONS = 14;
  private static final int METHODID_LIST_BACKUPS = 15;
  private static final int METHODID_LIST_HOSTS = 16;
  private static final int METHODID_ADD_HOSTS = 17;
  private static final int METHODID_DELETE_HOSTS = 18;
  private static final int METHODID_UPDATE_HOSTS = 19;
  private static final int METHODID_GET_SHARD = 20;
  private static final int METHODID_LIST_SHARDS = 21;
  private static final int METHODID_ADD_SHARD = 22;
  private static final int METHODID_DELETE_SHARD = 23;
  private static final int METHODID_REBALANCE = 24;
  private static final int METHODID_ENABLE_SHARDING = 25;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ClusterServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ClusterServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.GetClusterRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.redis.v1.ClusterOuterClass.Cluster>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClustersRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClustersResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.CreateClusterRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.UpdateClusterRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.DeleteClusterRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_START:
          serviceImpl.start((yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.StartClusterRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_STOP:
          serviceImpl.stop((yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.StopClusterRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_MOVE:
          serviceImpl.move((yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.MoveClusterRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_BACKUP:
          serviceImpl.backup((yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.BackupClusterRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_RESTORE:
          serviceImpl.restore((yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.RestoreClusterRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_RESCHEDULE_MAINTENANCE:
          serviceImpl.rescheduleMaintenance((yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.RescheduleMaintenanceRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_START_FAILOVER:
          serviceImpl.startFailover((yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.StartClusterFailoverRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_LOGS:
          serviceImpl.listLogs((yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterLogsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterLogsResponse>) responseObserver);
          break;
        case METHODID_STREAM_LOGS:
          serviceImpl.streamLogs((yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.StreamClusterLogsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.StreamLogRecord>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterOperationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterOperationsResponse>) responseObserver);
          break;
        case METHODID_LIST_BACKUPS:
          serviceImpl.listBackups((yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterBackupsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterBackupsResponse>) responseObserver);
          break;
        case METHODID_LIST_HOSTS:
          serviceImpl.listHosts((yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterHostsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterHostsResponse>) responseObserver);
          break;
        case METHODID_ADD_HOSTS:
          serviceImpl.addHosts((yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.AddClusterHostsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE_HOSTS:
          serviceImpl.deleteHosts((yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.DeleteClusterHostsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE_HOSTS:
          serviceImpl.updateHosts((yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.UpdateClusterHostsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_GET_SHARD:
          serviceImpl.getShard((yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.GetClusterShardRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.redis.v1.ClusterOuterClass.Shard>) responseObserver);
          break;
        case METHODID_LIST_SHARDS:
          serviceImpl.listShards((yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterShardsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.ListClusterShardsResponse>) responseObserver);
          break;
        case METHODID_ADD_SHARD:
          serviceImpl.addShard((yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.AddClusterShardRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE_SHARD:
          serviceImpl.deleteShard((yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.DeleteClusterShardRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_REBALANCE:
          serviceImpl.rebalance((yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.RebalanceClusterRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_ENABLE_SHARDING:
          serviceImpl.enableSharding((yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.EnableShardingClusterRequest) request,
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

  private static abstract class ClusterServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ClusterServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.mdb.redis.v1.ClusterServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ClusterService");
    }
  }

  private static final class ClusterServiceFileDescriptorSupplier
      extends ClusterServiceBaseDescriptorSupplier {
    ClusterServiceFileDescriptorSupplier() {}
  }

  private static final class ClusterServiceMethodDescriptorSupplier
      extends ClusterServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ClusterServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ClusterServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ClusterServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getStartMethod())
              .addMethod(getStopMethod())
              .addMethod(getMoveMethod())
              .addMethod(getBackupMethod())
              .addMethod(getRestoreMethod())
              .addMethod(getRescheduleMaintenanceMethod())
              .addMethod(getStartFailoverMethod())
              .addMethod(getListLogsMethod())
              .addMethod(getStreamLogsMethod())
              .addMethod(getListOperationsMethod())
              .addMethod(getListBackupsMethod())
              .addMethod(getListHostsMethod())
              .addMethod(getAddHostsMethod())
              .addMethod(getDeleteHostsMethod())
              .addMethod(getUpdateHostsMethod())
              .addMethod(getGetShardMethod())
              .addMethod(getListShardsMethod())
              .addMethod(getAddShardMethod())
              .addMethod(getDeleteShardMethod())
              .addMethod(getRebalanceMethod())
              .addMethod(getEnableShardingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
