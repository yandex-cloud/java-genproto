package yandex.cloud.api.mdb.opensearch.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing OpenSearch clusters.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/mdb/opensearch/v1/cluster_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ClusterServiceGrpc {

  private ClusterServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.mdb.opensearch.v1.ClusterService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.GetClusterRequest,
      yandex.cloud.api.mdb.opensearch.v1.ClusterOuterClass.Cluster> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.GetClusterRequest.class,
      responseType = yandex.cloud.api.mdb.opensearch.v1.ClusterOuterClass.Cluster.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.GetClusterRequest,
      yandex.cloud.api.mdb.opensearch.v1.ClusterOuterClass.Cluster> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.GetClusterRequest, yandex.cloud.api.mdb.opensearch.v1.ClusterOuterClass.Cluster> getGetMethod;
    if ((getGetMethod = ClusterServiceGrpc.getGetMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getGetMethod = ClusterServiceGrpc.getGetMethod) == null) {
          ClusterServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.GetClusterRequest, yandex.cloud.api.mdb.opensearch.v1.ClusterOuterClass.Cluster>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.GetClusterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.opensearch.v1.ClusterOuterClass.Cluster.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClustersRequest,
      yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClustersResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClustersRequest.class,
      responseType = yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClustersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClustersRequest,
      yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClustersResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClustersRequest, yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClustersResponse> getListMethod;
    if ((getListMethod = ClusterServiceGrpc.getListMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getListMethod = ClusterServiceGrpc.getListMethod) == null) {
          ClusterServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClustersRequest, yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClustersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClustersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClustersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.CreateClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.CreateClusterRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.CreateClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.CreateClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = ClusterServiceGrpc.getCreateMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getCreateMethod = ClusterServiceGrpc.getCreateMethod) == null) {
          ClusterServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.CreateClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.CreateClusterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.UpdateClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.UpdateClusterRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.UpdateClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.UpdateClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = ClusterServiceGrpc.getUpdateMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getUpdateMethod = ClusterServiceGrpc.getUpdateMethod) == null) {
          ClusterServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.UpdateClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.UpdateClusterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.DeleteClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.DeleteClusterRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.DeleteClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.DeleteClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = ClusterServiceGrpc.getDeleteMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getDeleteMethod = ClusterServiceGrpc.getDeleteMethod) == null) {
          ClusterServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.DeleteClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.DeleteClusterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.BackupClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getBackupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Backup",
      requestType = yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.BackupClusterRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.BackupClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getBackupMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.BackupClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getBackupMethod;
    if ((getBackupMethod = ClusterServiceGrpc.getBackupMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getBackupMethod = ClusterServiceGrpc.getBackupMethod) == null) {
          ClusterServiceGrpc.getBackupMethod = getBackupMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.BackupClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Backup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.BackupClusterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("Backup"))
              .build();
        }
      }
    }
    return getBackupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.DeleteBackupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteBackupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteBackup",
      requestType = yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.DeleteBackupRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.DeleteBackupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteBackupMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.DeleteBackupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteBackupMethod;
    if ((getDeleteBackupMethod = ClusterServiceGrpc.getDeleteBackupMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getDeleteBackupMethod = ClusterServiceGrpc.getDeleteBackupMethod) == null) {
          ClusterServiceGrpc.getDeleteBackupMethod = getDeleteBackupMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.DeleteBackupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteBackup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.DeleteBackupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("DeleteBackup"))
              .build();
        }
      }
    }
    return getDeleteBackupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.RestoreClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRestoreMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Restore",
      requestType = yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.RestoreClusterRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.RestoreClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRestoreMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.RestoreClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getRestoreMethod;
    if ((getRestoreMethod = ClusterServiceGrpc.getRestoreMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getRestoreMethod = ClusterServiceGrpc.getRestoreMethod) == null) {
          ClusterServiceGrpc.getRestoreMethod = getRestoreMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.RestoreClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Restore"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.RestoreClusterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("Restore"))
              .build();
        }
      }
    }
    return getRestoreMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.RescheduleMaintenanceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRescheduleMaintenanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RescheduleMaintenance",
      requestType = yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.RescheduleMaintenanceRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.RescheduleMaintenanceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRescheduleMaintenanceMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.RescheduleMaintenanceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getRescheduleMaintenanceMethod;
    if ((getRescheduleMaintenanceMethod = ClusterServiceGrpc.getRescheduleMaintenanceMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getRescheduleMaintenanceMethod = ClusterServiceGrpc.getRescheduleMaintenanceMethod) == null) {
          ClusterServiceGrpc.getRescheduleMaintenanceMethod = getRescheduleMaintenanceMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.RescheduleMaintenanceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RescheduleMaintenance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.RescheduleMaintenanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("RescheduleMaintenance"))
              .build();
        }
      }
    }
    return getRescheduleMaintenanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterBackupsRequest,
      yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterBackupsResponse> getListBackupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListBackups",
      requestType = yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterBackupsRequest.class,
      responseType = yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterBackupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterBackupsRequest,
      yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterBackupsResponse> getListBackupsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterBackupsRequest, yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterBackupsResponse> getListBackupsMethod;
    if ((getListBackupsMethod = ClusterServiceGrpc.getListBackupsMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getListBackupsMethod = ClusterServiceGrpc.getListBackupsMethod) == null) {
          ClusterServiceGrpc.getListBackupsMethod = getListBackupsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterBackupsRequest, yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterBackupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListBackups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterBackupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterBackupsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("ListBackups"))
              .build();
        }
      }
    }
    return getListBackupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.MoveClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getMoveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Move",
      requestType = yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.MoveClusterRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.MoveClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getMoveMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.MoveClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getMoveMethod;
    if ((getMoveMethod = ClusterServiceGrpc.getMoveMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getMoveMethod = ClusterServiceGrpc.getMoveMethod) == null) {
          ClusterServiceGrpc.getMoveMethod = getMoveMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.MoveClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Move"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.MoveClusterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("Move"))
              .build();
        }
      }
    }
    return getMoveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.StartClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getStartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Start",
      requestType = yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.StartClusterRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.StartClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getStartMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.StartClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getStartMethod;
    if ((getStartMethod = ClusterServiceGrpc.getStartMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getStartMethod = ClusterServiceGrpc.getStartMethod) == null) {
          ClusterServiceGrpc.getStartMethod = getStartMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.StartClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Start"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.StartClusterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("Start"))
              .build();
        }
      }
    }
    return getStartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.StopClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getStopMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Stop",
      requestType = yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.StopClusterRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.StopClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getStopMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.StopClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getStopMethod;
    if ((getStopMethod = ClusterServiceGrpc.getStopMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getStopMethod = ClusterServiceGrpc.getStopMethod) == null) {
          ClusterServiceGrpc.getStopMethod = getStopMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.StopClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Stop"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.StopClusterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("Stop"))
              .build();
        }
      }
    }
    return getStopMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterLogsRequest,
      yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterLogsResponse> getListLogsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListLogs",
      requestType = yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterLogsRequest.class,
      responseType = yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterLogsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterLogsRequest,
      yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterLogsResponse> getListLogsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterLogsRequest, yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterLogsResponse> getListLogsMethod;
    if ((getListLogsMethod = ClusterServiceGrpc.getListLogsMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getListLogsMethod = ClusterServiceGrpc.getListLogsMethod) == null) {
          ClusterServiceGrpc.getListLogsMethod = getListLogsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterLogsRequest, yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterLogsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListLogs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterLogsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterLogsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("ListLogs"))
              .build();
        }
      }
    }
    return getListLogsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.StreamClusterLogsRequest,
      yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.StreamLogRecord> getStreamLogsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamLogs",
      requestType = yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.StreamClusterLogsRequest.class,
      responseType = yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.StreamLogRecord.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.StreamClusterLogsRequest,
      yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.StreamLogRecord> getStreamLogsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.StreamClusterLogsRequest, yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.StreamLogRecord> getStreamLogsMethod;
    if ((getStreamLogsMethod = ClusterServiceGrpc.getStreamLogsMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getStreamLogsMethod = ClusterServiceGrpc.getStreamLogsMethod) == null) {
          ClusterServiceGrpc.getStreamLogsMethod = getStreamLogsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.StreamClusterLogsRequest, yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.StreamLogRecord>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamLogs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.StreamClusterLogsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.StreamLogRecord.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("StreamLogs"))
              .build();
        }
      }
    }
    return getStreamLogsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterOperationsRequest,
      yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterOperationsResponse> getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterOperationsRequest.class,
      responseType = yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterOperationsRequest,
      yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterOperationsResponse> getListOperationsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterOperationsRequest, yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterOperationsResponse> getListOperationsMethod;
    if ((getListOperationsMethod = ClusterServiceGrpc.getListOperationsMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getListOperationsMethod = ClusterServiceGrpc.getListOperationsMethod) == null) {
          ClusterServiceGrpc.getListOperationsMethod = getListOperationsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterOperationsRequest, yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterOperationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("ListOperations"))
              .build();
        }
      }
    }
    return getListOperationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterHostsRequest,
      yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterHostsResponse> getListHostsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListHosts",
      requestType = yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterHostsRequest.class,
      responseType = yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterHostsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterHostsRequest,
      yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterHostsResponse> getListHostsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterHostsRequest, yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterHostsResponse> getListHostsMethod;
    if ((getListHostsMethod = ClusterServiceGrpc.getListHostsMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getListHostsMethod = ClusterServiceGrpc.getListHostsMethod) == null) {
          ClusterServiceGrpc.getListHostsMethod = getListHostsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterHostsRequest, yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterHostsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListHosts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterHostsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterHostsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("ListHosts"))
              .build();
        }
      }
    }
    return getListHostsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.AddOpenSearchNodeGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getAddOpenSearchNodeGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddOpenSearchNodeGroup",
      requestType = yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.AddOpenSearchNodeGroupRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.AddOpenSearchNodeGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getAddOpenSearchNodeGroupMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.AddOpenSearchNodeGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getAddOpenSearchNodeGroupMethod;
    if ((getAddOpenSearchNodeGroupMethod = ClusterServiceGrpc.getAddOpenSearchNodeGroupMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getAddOpenSearchNodeGroupMethod = ClusterServiceGrpc.getAddOpenSearchNodeGroupMethod) == null) {
          ClusterServiceGrpc.getAddOpenSearchNodeGroupMethod = getAddOpenSearchNodeGroupMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.AddOpenSearchNodeGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddOpenSearchNodeGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.AddOpenSearchNodeGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("AddOpenSearchNodeGroup"))
              .build();
        }
      }
    }
    return getAddOpenSearchNodeGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.DeleteOpenSearchNodeGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteOpenSearchNodeGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteOpenSearchNodeGroup",
      requestType = yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.DeleteOpenSearchNodeGroupRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.DeleteOpenSearchNodeGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteOpenSearchNodeGroupMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.DeleteOpenSearchNodeGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteOpenSearchNodeGroupMethod;
    if ((getDeleteOpenSearchNodeGroupMethod = ClusterServiceGrpc.getDeleteOpenSearchNodeGroupMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getDeleteOpenSearchNodeGroupMethod = ClusterServiceGrpc.getDeleteOpenSearchNodeGroupMethod) == null) {
          ClusterServiceGrpc.getDeleteOpenSearchNodeGroupMethod = getDeleteOpenSearchNodeGroupMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.DeleteOpenSearchNodeGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteOpenSearchNodeGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.DeleteOpenSearchNodeGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("DeleteOpenSearchNodeGroup"))
              .build();
        }
      }
    }
    return getDeleteOpenSearchNodeGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.UpdateOpenSearchNodeGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateOpenSearchNodeGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateOpenSearchNodeGroup",
      requestType = yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.UpdateOpenSearchNodeGroupRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.UpdateOpenSearchNodeGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateOpenSearchNodeGroupMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.UpdateOpenSearchNodeGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateOpenSearchNodeGroupMethod;
    if ((getUpdateOpenSearchNodeGroupMethod = ClusterServiceGrpc.getUpdateOpenSearchNodeGroupMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getUpdateOpenSearchNodeGroupMethod = ClusterServiceGrpc.getUpdateOpenSearchNodeGroupMethod) == null) {
          ClusterServiceGrpc.getUpdateOpenSearchNodeGroupMethod = getUpdateOpenSearchNodeGroupMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.UpdateOpenSearchNodeGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateOpenSearchNodeGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.UpdateOpenSearchNodeGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("UpdateOpenSearchNodeGroup"))
              .build();
        }
      }
    }
    return getUpdateOpenSearchNodeGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.AddDashboardsNodeGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getAddDashboardsNodeGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddDashboardsNodeGroup",
      requestType = yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.AddDashboardsNodeGroupRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.AddDashboardsNodeGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getAddDashboardsNodeGroupMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.AddDashboardsNodeGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getAddDashboardsNodeGroupMethod;
    if ((getAddDashboardsNodeGroupMethod = ClusterServiceGrpc.getAddDashboardsNodeGroupMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getAddDashboardsNodeGroupMethod = ClusterServiceGrpc.getAddDashboardsNodeGroupMethod) == null) {
          ClusterServiceGrpc.getAddDashboardsNodeGroupMethod = getAddDashboardsNodeGroupMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.AddDashboardsNodeGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddDashboardsNodeGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.AddDashboardsNodeGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("AddDashboardsNodeGroup"))
              .build();
        }
      }
    }
    return getAddDashboardsNodeGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.DeleteDashboardsNodeGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteDashboardsNodeGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteDashboardsNodeGroup",
      requestType = yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.DeleteDashboardsNodeGroupRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.DeleteDashboardsNodeGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteDashboardsNodeGroupMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.DeleteDashboardsNodeGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteDashboardsNodeGroupMethod;
    if ((getDeleteDashboardsNodeGroupMethod = ClusterServiceGrpc.getDeleteDashboardsNodeGroupMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getDeleteDashboardsNodeGroupMethod = ClusterServiceGrpc.getDeleteDashboardsNodeGroupMethod) == null) {
          ClusterServiceGrpc.getDeleteDashboardsNodeGroupMethod = getDeleteDashboardsNodeGroupMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.DeleteDashboardsNodeGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteDashboardsNodeGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.DeleteDashboardsNodeGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("DeleteDashboardsNodeGroup"))
              .build();
        }
      }
    }
    return getDeleteDashboardsNodeGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.UpdateDashboardsNodeGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateDashboardsNodeGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateDashboardsNodeGroup",
      requestType = yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.UpdateDashboardsNodeGroupRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.UpdateDashboardsNodeGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateDashboardsNodeGroupMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.UpdateDashboardsNodeGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateDashboardsNodeGroupMethod;
    if ((getUpdateDashboardsNodeGroupMethod = ClusterServiceGrpc.getUpdateDashboardsNodeGroupMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getUpdateDashboardsNodeGroupMethod = ClusterServiceGrpc.getUpdateDashboardsNodeGroupMethod) == null) {
          ClusterServiceGrpc.getUpdateDashboardsNodeGroupMethod = getUpdateDashboardsNodeGroupMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.UpdateDashboardsNodeGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateDashboardsNodeGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.UpdateDashboardsNodeGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("UpdateDashboardsNodeGroup"))
              .build();
        }
      }
    }
    return getUpdateDashboardsNodeGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.GetAuthSettingsRequest,
      yandex.cloud.api.mdb.opensearch.v1.Auth.AuthSettings> getGetAuthSettingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAuthSettings",
      requestType = yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.GetAuthSettingsRequest.class,
      responseType = yandex.cloud.api.mdb.opensearch.v1.Auth.AuthSettings.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.GetAuthSettingsRequest,
      yandex.cloud.api.mdb.opensearch.v1.Auth.AuthSettings> getGetAuthSettingsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.GetAuthSettingsRequest, yandex.cloud.api.mdb.opensearch.v1.Auth.AuthSettings> getGetAuthSettingsMethod;
    if ((getGetAuthSettingsMethod = ClusterServiceGrpc.getGetAuthSettingsMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getGetAuthSettingsMethod = ClusterServiceGrpc.getGetAuthSettingsMethod) == null) {
          ClusterServiceGrpc.getGetAuthSettingsMethod = getGetAuthSettingsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.GetAuthSettingsRequest, yandex.cloud.api.mdb.opensearch.v1.Auth.AuthSettings>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAuthSettings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.GetAuthSettingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.opensearch.v1.Auth.AuthSettings.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("GetAuthSettings"))
              .build();
        }
      }
    }
    return getGetAuthSettingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.UpdateAuthSettingsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateAuthSettingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAuthSettings",
      requestType = yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.UpdateAuthSettingsRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.UpdateAuthSettingsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateAuthSettingsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.UpdateAuthSettingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateAuthSettingsMethod;
    if ((getUpdateAuthSettingsMethod = ClusterServiceGrpc.getUpdateAuthSettingsMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getUpdateAuthSettingsMethod = ClusterServiceGrpc.getUpdateAuthSettingsMethod) == null) {
          ClusterServiceGrpc.getUpdateAuthSettingsMethod = getUpdateAuthSettingsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.UpdateAuthSettingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAuthSettings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.UpdateAuthSettingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("UpdateAuthSettings"))
              .build();
        }
      }
    }
    return getUpdateAuthSettingsMethod;
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
   * A set of methods for managing OpenSearch clusters.
   * </pre>
   */
  public static abstract class ClusterServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified OpenSearch cluster.
     * To get the list of all available OpenSearch clusters, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.GetClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.opensearch.v1.ClusterOuterClass.Cluster> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of OpenSearch clusters that belong to the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClustersRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClustersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates an OpenSearch cluster in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.CreateClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified OpenSearch cluster.
     * </pre>
     */
    public void update(yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.UpdateClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified OpenSearch cluster.
     * </pre>
     */
    public void delete(yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.DeleteClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a backup for the specified OpenSearch cluster.
     * </pre>
     */
    public void backup(yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.BackupClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBackupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete backup for the specified OpenSearch cluster.
     * </pre>
     */
    public void deleteBackup(yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.DeleteBackupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteBackupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a new OpenSearch cluster using the specified backup.
     * </pre>
     */
    public void restore(yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.RestoreClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRestoreMethod(), responseObserver);
    }

    /**
     * <pre>
     * Reschedules a planned maintenance operation.
     * </pre>
     */
    public void rescheduleMaintenance(yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.RescheduleMaintenanceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRescheduleMaintenanceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns a list of available backups for the specified OpenSearch cluster.
     * </pre>
     */
    public void listBackups(yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterBackupsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterBackupsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListBackupsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Moves the specified OpenSearch cluster to the specified folder.
     * </pre>
     */
    public void move(yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.MoveClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMoveMethod(), responseObserver);
    }

    /**
     * <pre>
     * Starts the specified OpenSearch cluster.
     * </pre>
     */
    public void start(yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.StartClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStartMethod(), responseObserver);
    }

    /**
     * <pre>
     * Stops the specified OpenSearch cluster.
     * </pre>
     */
    public void stop(yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.StopClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStopMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves logs for the specified OpenSearch cluster.
     * </pre>
     */
    public void listLogs(yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterLogsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterLogsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListLogsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Same as ListLogs but using server-side streaming. Also allows for 'tail -f' semantics.
     * </pre>
     */
    public void streamLogs(yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.StreamClusterLogsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.StreamLogRecord> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStreamLogsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of Operation resources for the specified cluster.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterOperationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves a list of hosts for the specified cluster.
     * </pre>
     */
    public void listHosts(yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterHostsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterHostsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListHostsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates an OpenSearch type host group.
     * </pre>
     */
    public void addOpenSearchNodeGroup(yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.AddOpenSearchNodeGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddOpenSearchNodeGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes an OpenSearch type host group.
     * </pre>
     */
    public void deleteOpenSearchNodeGroup(yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.DeleteOpenSearchNodeGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteOpenSearchNodeGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates an OpenSearch type host group.
     * </pre>
     */
    public void updateOpenSearchNodeGroup(yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.UpdateOpenSearchNodeGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateOpenSearchNodeGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a Dashboards type host group.
     * </pre>
     */
    public void addDashboardsNodeGroup(yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.AddDashboardsNodeGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddDashboardsNodeGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes a Dashboards type host group.
     * </pre>
     */
    public void deleteDashboardsNodeGroup(yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.DeleteDashboardsNodeGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteDashboardsNodeGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates a Dashboards type host group.
     * </pre>
     */
    public void updateDashboardsNodeGroup(yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.UpdateDashboardsNodeGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateDashboardsNodeGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves auth settings for specified cluster.
     * </pre>
     */
    public void getAuthSettings(yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.GetAuthSettingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.opensearch.v1.Auth.AuthSettings> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAuthSettingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates auth settings for specified cluster.
     * </pre>
     */
    public void updateAuthSettings(yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.UpdateAuthSettingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAuthSettingsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.GetClusterRequest,
                yandex.cloud.api.mdb.opensearch.v1.ClusterOuterClass.Cluster>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClustersRequest,
                yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClustersResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.CreateClusterRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.UpdateClusterRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.DeleteClusterRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getBackupMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.BackupClusterRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_BACKUP)))
          .addMethod(
            getDeleteBackupMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.DeleteBackupRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE_BACKUP)))
          .addMethod(
            getRestoreMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.RestoreClusterRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_RESTORE)))
          .addMethod(
            getRescheduleMaintenanceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.RescheduleMaintenanceRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_RESCHEDULE_MAINTENANCE)))
          .addMethod(
            getListBackupsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterBackupsRequest,
                yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterBackupsResponse>(
                  this, METHODID_LIST_BACKUPS)))
          .addMethod(
            getMoveMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.MoveClusterRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_MOVE)))
          .addMethod(
            getStartMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.StartClusterRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_START)))
          .addMethod(
            getStopMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.StopClusterRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_STOP)))
          .addMethod(
            getListLogsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterLogsRequest,
                yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterLogsResponse>(
                  this, METHODID_LIST_LOGS)))
          .addMethod(
            getStreamLogsMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.StreamClusterLogsRequest,
                yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.StreamLogRecord>(
                  this, METHODID_STREAM_LOGS)))
          .addMethod(
            getListOperationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterOperationsRequest,
                yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterOperationsResponse>(
                  this, METHODID_LIST_OPERATIONS)))
          .addMethod(
            getListHostsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterHostsRequest,
                yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterHostsResponse>(
                  this, METHODID_LIST_HOSTS)))
          .addMethod(
            getAddOpenSearchNodeGroupMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.AddOpenSearchNodeGroupRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_ADD_OPEN_SEARCH_NODE_GROUP)))
          .addMethod(
            getDeleteOpenSearchNodeGroupMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.DeleteOpenSearchNodeGroupRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE_OPEN_SEARCH_NODE_GROUP)))
          .addMethod(
            getUpdateOpenSearchNodeGroupMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.UpdateOpenSearchNodeGroupRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE_OPEN_SEARCH_NODE_GROUP)))
          .addMethod(
            getAddDashboardsNodeGroupMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.AddDashboardsNodeGroupRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_ADD_DASHBOARDS_NODE_GROUP)))
          .addMethod(
            getDeleteDashboardsNodeGroupMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.DeleteDashboardsNodeGroupRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE_DASHBOARDS_NODE_GROUP)))
          .addMethod(
            getUpdateDashboardsNodeGroupMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.UpdateDashboardsNodeGroupRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE_DASHBOARDS_NODE_GROUP)))
          .addMethod(
            getGetAuthSettingsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.GetAuthSettingsRequest,
                yandex.cloud.api.mdb.opensearch.v1.Auth.AuthSettings>(
                  this, METHODID_GET_AUTH_SETTINGS)))
          .addMethod(
            getUpdateAuthSettingsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.UpdateAuthSettingsRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE_AUTH_SETTINGS)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing OpenSearch clusters.
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
     * Returns the specified OpenSearch cluster.
     * To get the list of all available OpenSearch clusters, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.GetClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.opensearch.v1.ClusterOuterClass.Cluster> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of OpenSearch clusters that belong to the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClustersRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClustersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates an OpenSearch cluster in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.CreateClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified OpenSearch cluster.
     * </pre>
     */
    public void update(yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.UpdateClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified OpenSearch cluster.
     * </pre>
     */
    public void delete(yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.DeleteClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a backup for the specified OpenSearch cluster.
     * </pre>
     */
    public void backup(yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.BackupClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBackupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete backup for the specified OpenSearch cluster.
     * </pre>
     */
    public void deleteBackup(yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.DeleteBackupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteBackupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a new OpenSearch cluster using the specified backup.
     * </pre>
     */
    public void restore(yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.RestoreClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRestoreMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Reschedules a planned maintenance operation.
     * </pre>
     */
    public void rescheduleMaintenance(yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.RescheduleMaintenanceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRescheduleMaintenanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns a list of available backups for the specified OpenSearch cluster.
     * </pre>
     */
    public void listBackups(yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterBackupsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterBackupsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListBackupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Moves the specified OpenSearch cluster to the specified folder.
     * </pre>
     */
    public void move(yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.MoveClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMoveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Starts the specified OpenSearch cluster.
     * </pre>
     */
    public void start(yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.StartClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Stops the specified OpenSearch cluster.
     * </pre>
     */
    public void stop(yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.StopClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStopMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves logs for the specified OpenSearch cluster.
     * </pre>
     */
    public void listLogs(yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterLogsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterLogsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListLogsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Same as ListLogs but using server-side streaming. Also allows for 'tail -f' semantics.
     * </pre>
     */
    public void streamLogs(yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.StreamClusterLogsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.StreamLogRecord> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getStreamLogsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of Operation resources for the specified cluster.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterOperationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves a list of hosts for the specified cluster.
     * </pre>
     */
    public void listHosts(yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterHostsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterHostsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListHostsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates an OpenSearch type host group.
     * </pre>
     */
    public void addOpenSearchNodeGroup(yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.AddOpenSearchNodeGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddOpenSearchNodeGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes an OpenSearch type host group.
     * </pre>
     */
    public void deleteOpenSearchNodeGroup(yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.DeleteOpenSearchNodeGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteOpenSearchNodeGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates an OpenSearch type host group.
     * </pre>
     */
    public void updateOpenSearchNodeGroup(yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.UpdateOpenSearchNodeGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateOpenSearchNodeGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a Dashboards type host group.
     * </pre>
     */
    public void addDashboardsNodeGroup(yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.AddDashboardsNodeGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddDashboardsNodeGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a Dashboards type host group.
     * </pre>
     */
    public void deleteDashboardsNodeGroup(yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.DeleteDashboardsNodeGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteDashboardsNodeGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates a Dashboards type host group.
     * </pre>
     */
    public void updateDashboardsNodeGroup(yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.UpdateDashboardsNodeGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateDashboardsNodeGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves auth settings for specified cluster.
     * </pre>
     */
    public void getAuthSettings(yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.GetAuthSettingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.opensearch.v1.Auth.AuthSettings> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAuthSettingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates auth settings for specified cluster.
     * </pre>
     */
    public void updateAuthSettings(yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.UpdateAuthSettingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAuthSettingsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing OpenSearch clusters.
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
     * Returns the specified OpenSearch cluster.
     * To get the list of all available OpenSearch clusters, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.mdb.opensearch.v1.ClusterOuterClass.Cluster get(yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.GetClusterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of OpenSearch clusters that belong to the specified folder.
     * </pre>
     */
    public yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClustersResponse list(yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClustersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates an OpenSearch cluster in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.CreateClusterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified OpenSearch cluster.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.UpdateClusterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified OpenSearch cluster.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.DeleteClusterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a backup for the specified OpenSearch cluster.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation backup(yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.BackupClusterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBackupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete backup for the specified OpenSearch cluster.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation deleteBackup(yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.DeleteBackupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteBackupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new OpenSearch cluster using the specified backup.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation restore(yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.RestoreClusterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRestoreMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Reschedules a planned maintenance operation.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation rescheduleMaintenance(yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.RescheduleMaintenanceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRescheduleMaintenanceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns a list of available backups for the specified OpenSearch cluster.
     * </pre>
     */
    public yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterBackupsResponse listBackups(yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterBackupsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListBackupsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Moves the specified OpenSearch cluster to the specified folder.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation move(yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.MoveClusterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMoveMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Starts the specified OpenSearch cluster.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation start(yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.StartClusterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStartMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Stops the specified OpenSearch cluster.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation stop(yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.StopClusterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStopMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves logs for the specified OpenSearch cluster.
     * </pre>
     */
    public yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterLogsResponse listLogs(yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterLogsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListLogsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Same as ListLogs but using server-side streaming. Also allows for 'tail -f' semantics.
     * </pre>
     */
    public java.util.Iterator<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.StreamLogRecord> streamLogs(
        yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.StreamClusterLogsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getStreamLogsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of Operation resources for the specified cluster.
     * </pre>
     */
    public yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterOperationsResponse listOperations(yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterOperationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves a list of hosts for the specified cluster.
     * </pre>
     */
    public yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterHostsResponse listHosts(yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterHostsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListHostsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates an OpenSearch type host group.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation addOpenSearchNodeGroup(yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.AddOpenSearchNodeGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddOpenSearchNodeGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes an OpenSearch type host group.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation deleteOpenSearchNodeGroup(yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.DeleteOpenSearchNodeGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteOpenSearchNodeGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates an OpenSearch type host group.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation updateOpenSearchNodeGroup(yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.UpdateOpenSearchNodeGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateOpenSearchNodeGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a Dashboards type host group.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation addDashboardsNodeGroup(yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.AddDashboardsNodeGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddDashboardsNodeGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a Dashboards type host group.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation deleteDashboardsNodeGroup(yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.DeleteDashboardsNodeGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteDashboardsNodeGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a Dashboards type host group.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation updateDashboardsNodeGroup(yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.UpdateDashboardsNodeGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateDashboardsNodeGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves auth settings for specified cluster.
     * </pre>
     */
    public yandex.cloud.api.mdb.opensearch.v1.Auth.AuthSettings getAuthSettings(yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.GetAuthSettingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAuthSettingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates auth settings for specified cluster.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation updateAuthSettings(yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.UpdateAuthSettingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAuthSettingsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing OpenSearch clusters.
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
     * Returns the specified OpenSearch cluster.
     * To get the list of all available OpenSearch clusters, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.mdb.opensearch.v1.ClusterOuterClass.Cluster> get(
        yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.GetClusterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of OpenSearch clusters that belong to the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClustersResponse> list(
        yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClustersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates an OpenSearch cluster in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.CreateClusterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified OpenSearch cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.UpdateClusterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified OpenSearch cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.DeleteClusterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a backup for the specified OpenSearch cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> backup(
        yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.BackupClusterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBackupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete backup for the specified OpenSearch cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> deleteBackup(
        yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.DeleteBackupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteBackupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a new OpenSearch cluster using the specified backup.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> restore(
        yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.RestoreClusterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRestoreMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Reschedules a planned maintenance operation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> rescheduleMaintenance(
        yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.RescheduleMaintenanceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRescheduleMaintenanceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns a list of available backups for the specified OpenSearch cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterBackupsResponse> listBackups(
        yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterBackupsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListBackupsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Moves the specified OpenSearch cluster to the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> move(
        yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.MoveClusterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMoveMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Starts the specified OpenSearch cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> start(
        yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.StartClusterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStartMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Stops the specified OpenSearch cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> stop(
        yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.StopClusterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStopMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves logs for the specified OpenSearch cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterLogsResponse> listLogs(
        yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterLogsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListLogsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of Operation resources for the specified cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterOperationsResponse> listOperations(
        yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterOperationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves a list of hosts for the specified cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterHostsResponse> listHosts(
        yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterHostsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListHostsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates an OpenSearch type host group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> addOpenSearchNodeGroup(
        yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.AddOpenSearchNodeGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddOpenSearchNodeGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes an OpenSearch type host group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> deleteOpenSearchNodeGroup(
        yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.DeleteOpenSearchNodeGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteOpenSearchNodeGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates an OpenSearch type host group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> updateOpenSearchNodeGroup(
        yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.UpdateOpenSearchNodeGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateOpenSearchNodeGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a Dashboards type host group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> addDashboardsNodeGroup(
        yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.AddDashboardsNodeGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddDashboardsNodeGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a Dashboards type host group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> deleteDashboardsNodeGroup(
        yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.DeleteDashboardsNodeGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteDashboardsNodeGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates a Dashboards type host group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> updateDashboardsNodeGroup(
        yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.UpdateDashboardsNodeGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateDashboardsNodeGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves auth settings for specified cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.mdb.opensearch.v1.Auth.AuthSettings> getAuthSettings(
        yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.GetAuthSettingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAuthSettingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates auth settings for specified cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> updateAuthSettings(
        yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.UpdateAuthSettingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAuthSettingsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_DELETE = 4;
  private static final int METHODID_BACKUP = 5;
  private static final int METHODID_DELETE_BACKUP = 6;
  private static final int METHODID_RESTORE = 7;
  private static final int METHODID_RESCHEDULE_MAINTENANCE = 8;
  private static final int METHODID_LIST_BACKUPS = 9;
  private static final int METHODID_MOVE = 10;
  private static final int METHODID_START = 11;
  private static final int METHODID_STOP = 12;
  private static final int METHODID_LIST_LOGS = 13;
  private static final int METHODID_STREAM_LOGS = 14;
  private static final int METHODID_LIST_OPERATIONS = 15;
  private static final int METHODID_LIST_HOSTS = 16;
  private static final int METHODID_ADD_OPEN_SEARCH_NODE_GROUP = 17;
  private static final int METHODID_DELETE_OPEN_SEARCH_NODE_GROUP = 18;
  private static final int METHODID_UPDATE_OPEN_SEARCH_NODE_GROUP = 19;
  private static final int METHODID_ADD_DASHBOARDS_NODE_GROUP = 20;
  private static final int METHODID_DELETE_DASHBOARDS_NODE_GROUP = 21;
  private static final int METHODID_UPDATE_DASHBOARDS_NODE_GROUP = 22;
  private static final int METHODID_GET_AUTH_SETTINGS = 23;
  private static final int METHODID_UPDATE_AUTH_SETTINGS = 24;

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
          serviceImpl.get((yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.GetClusterRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.opensearch.v1.ClusterOuterClass.Cluster>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClustersRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClustersResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.CreateClusterRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.UpdateClusterRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.DeleteClusterRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_BACKUP:
          serviceImpl.backup((yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.BackupClusterRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE_BACKUP:
          serviceImpl.deleteBackup((yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.DeleteBackupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_RESTORE:
          serviceImpl.restore((yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.RestoreClusterRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_RESCHEDULE_MAINTENANCE:
          serviceImpl.rescheduleMaintenance((yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.RescheduleMaintenanceRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_BACKUPS:
          serviceImpl.listBackups((yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterBackupsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterBackupsResponse>) responseObserver);
          break;
        case METHODID_MOVE:
          serviceImpl.move((yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.MoveClusterRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_START:
          serviceImpl.start((yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.StartClusterRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_STOP:
          serviceImpl.stop((yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.StopClusterRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_LOGS:
          serviceImpl.listLogs((yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterLogsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterLogsResponse>) responseObserver);
          break;
        case METHODID_STREAM_LOGS:
          serviceImpl.streamLogs((yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.StreamClusterLogsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.StreamLogRecord>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterOperationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterOperationsResponse>) responseObserver);
          break;
        case METHODID_LIST_HOSTS:
          serviceImpl.listHosts((yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterHostsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.ListClusterHostsResponse>) responseObserver);
          break;
        case METHODID_ADD_OPEN_SEARCH_NODE_GROUP:
          serviceImpl.addOpenSearchNodeGroup((yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.AddOpenSearchNodeGroupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE_OPEN_SEARCH_NODE_GROUP:
          serviceImpl.deleteOpenSearchNodeGroup((yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.DeleteOpenSearchNodeGroupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE_OPEN_SEARCH_NODE_GROUP:
          serviceImpl.updateOpenSearchNodeGroup((yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.UpdateOpenSearchNodeGroupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_ADD_DASHBOARDS_NODE_GROUP:
          serviceImpl.addDashboardsNodeGroup((yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.AddDashboardsNodeGroupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE_DASHBOARDS_NODE_GROUP:
          serviceImpl.deleteDashboardsNodeGroup((yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.DeleteDashboardsNodeGroupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE_DASHBOARDS_NODE_GROUP:
          serviceImpl.updateDashboardsNodeGroup((yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.UpdateDashboardsNodeGroupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_GET_AUTH_SETTINGS:
          serviceImpl.getAuthSettings((yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.GetAuthSettingsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.opensearch.v1.Auth.AuthSettings>) responseObserver);
          break;
        case METHODID_UPDATE_AUTH_SETTINGS:
          serviceImpl.updateAuthSettings((yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.UpdateAuthSettingsRequest) request,
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
      return yandex.cloud.api.mdb.opensearch.v1.ClusterServiceOuterClass.getDescriptor();
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
              .addMethod(getBackupMethod())
              .addMethod(getDeleteBackupMethod())
              .addMethod(getRestoreMethod())
              .addMethod(getRescheduleMaintenanceMethod())
              .addMethod(getListBackupsMethod())
              .addMethod(getMoveMethod())
              .addMethod(getStartMethod())
              .addMethod(getStopMethod())
              .addMethod(getListLogsMethod())
              .addMethod(getStreamLogsMethod())
              .addMethod(getListOperationsMethod())
              .addMethod(getListHostsMethod())
              .addMethod(getAddOpenSearchNodeGroupMethod())
              .addMethod(getDeleteOpenSearchNodeGroupMethod())
              .addMethod(getUpdateOpenSearchNodeGroupMethod())
              .addMethod(getAddDashboardsNodeGroupMethod())
              .addMethod(getDeleteDashboardsNodeGroupMethod())
              .addMethod(getUpdateDashboardsNodeGroupMethod())
              .addMethod(getGetAuthSettingsMethod())
              .addMethod(getUpdateAuthSettingsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
