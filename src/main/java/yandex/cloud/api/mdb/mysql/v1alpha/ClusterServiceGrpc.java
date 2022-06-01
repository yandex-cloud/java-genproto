package yandex.cloud.api.mdb.mysql.v1alpha;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing MySQL clusters.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/mdb/mysql/v1alpha/cluster_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ClusterServiceGrpc {

  private ClusterServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.mdb.mysql.v1alpha.ClusterService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.GetClusterRequest,
      yandex.cloud.api.mdb.mysql.v1alpha.ClusterOuterClass.Cluster> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.GetClusterRequest.class,
      responseType = yandex.cloud.api.mdb.mysql.v1alpha.ClusterOuterClass.Cluster.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.GetClusterRequest,
      yandex.cloud.api.mdb.mysql.v1alpha.ClusterOuterClass.Cluster> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.GetClusterRequest, yandex.cloud.api.mdb.mysql.v1alpha.ClusterOuterClass.Cluster> getGetMethod;
    if ((getGetMethod = ClusterServiceGrpc.getGetMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getGetMethod = ClusterServiceGrpc.getGetMethod) == null) {
          ClusterServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.GetClusterRequest, yandex.cloud.api.mdb.mysql.v1alpha.ClusterOuterClass.Cluster>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.GetClusterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.mysql.v1alpha.ClusterOuterClass.Cluster.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClustersRequest,
      yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClustersResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClustersRequest.class,
      responseType = yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClustersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClustersRequest,
      yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClustersResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClustersRequest, yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClustersResponse> getListMethod;
    if ((getListMethod = ClusterServiceGrpc.getListMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getListMethod = ClusterServiceGrpc.getListMethod) == null) {
          ClusterServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClustersRequest, yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClustersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClustersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClustersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.CreateClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.CreateClusterRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.CreateClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.CreateClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = ClusterServiceGrpc.getCreateMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getCreateMethod = ClusterServiceGrpc.getCreateMethod) == null) {
          ClusterServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.CreateClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.CreateClusterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.UpdateClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.UpdateClusterRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.UpdateClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.UpdateClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = ClusterServiceGrpc.getUpdateMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getUpdateMethod = ClusterServiceGrpc.getUpdateMethod) == null) {
          ClusterServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.UpdateClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.UpdateClusterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.DeleteClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.DeleteClusterRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.DeleteClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.DeleteClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = ClusterServiceGrpc.getDeleteMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getDeleteMethod = ClusterServiceGrpc.getDeleteMethod) == null) {
          ClusterServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.DeleteClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.DeleteClusterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.StartClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getStartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Start",
      requestType = yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.StartClusterRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.StartClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getStartMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.StartClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getStartMethod;
    if ((getStartMethod = ClusterServiceGrpc.getStartMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getStartMethod = ClusterServiceGrpc.getStartMethod) == null) {
          ClusterServiceGrpc.getStartMethod = getStartMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.StartClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Start"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.StartClusterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("Start"))
              .build();
        }
      }
    }
    return getStartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.StopClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getStopMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Stop",
      requestType = yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.StopClusterRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.StopClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getStopMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.StopClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getStopMethod;
    if ((getStopMethod = ClusterServiceGrpc.getStopMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getStopMethod = ClusterServiceGrpc.getStopMethod) == null) {
          ClusterServiceGrpc.getStopMethod = getStopMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.StopClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Stop"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.StopClusterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("Stop"))
              .build();
        }
      }
    }
    return getStopMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.BackupClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getBackupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Backup",
      requestType = yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.BackupClusterRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.BackupClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getBackupMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.BackupClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getBackupMethod;
    if ((getBackupMethod = ClusterServiceGrpc.getBackupMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getBackupMethod = ClusterServiceGrpc.getBackupMethod) == null) {
          ClusterServiceGrpc.getBackupMethod = getBackupMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.BackupClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Backup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.BackupClusterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("Backup"))
              .build();
        }
      }
    }
    return getBackupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.RestoreClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRestoreMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Restore",
      requestType = yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.RestoreClusterRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.RestoreClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRestoreMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.RestoreClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getRestoreMethod;
    if ((getRestoreMethod = ClusterServiceGrpc.getRestoreMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getRestoreMethod = ClusterServiceGrpc.getRestoreMethod) == null) {
          ClusterServiceGrpc.getRestoreMethod = getRestoreMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.RestoreClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Restore"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.RestoreClusterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("Restore"))
              .build();
        }
      }
    }
    return getRestoreMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterLogsRequest,
      yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterLogsResponse> getListLogsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListLogs",
      requestType = yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterLogsRequest.class,
      responseType = yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterLogsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterLogsRequest,
      yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterLogsResponse> getListLogsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterLogsRequest, yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterLogsResponse> getListLogsMethod;
    if ((getListLogsMethod = ClusterServiceGrpc.getListLogsMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getListLogsMethod = ClusterServiceGrpc.getListLogsMethod) == null) {
          ClusterServiceGrpc.getListLogsMethod = getListLogsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterLogsRequest, yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterLogsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListLogs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterLogsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterLogsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("ListLogs"))
              .build();
        }
      }
    }
    return getListLogsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterOperationsRequest,
      yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterOperationsResponse> getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterOperationsRequest.class,
      responseType = yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterOperationsRequest,
      yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterOperationsResponse> getListOperationsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterOperationsRequest, yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterOperationsResponse> getListOperationsMethod;
    if ((getListOperationsMethod = ClusterServiceGrpc.getListOperationsMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getListOperationsMethod = ClusterServiceGrpc.getListOperationsMethod) == null) {
          ClusterServiceGrpc.getListOperationsMethod = getListOperationsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterOperationsRequest, yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterOperationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("ListOperations"))
              .build();
        }
      }
    }
    return getListOperationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterBackupsRequest,
      yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterBackupsResponse> getListBackupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListBackups",
      requestType = yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterBackupsRequest.class,
      responseType = yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterBackupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterBackupsRequest,
      yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterBackupsResponse> getListBackupsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterBackupsRequest, yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterBackupsResponse> getListBackupsMethod;
    if ((getListBackupsMethod = ClusterServiceGrpc.getListBackupsMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getListBackupsMethod = ClusterServiceGrpc.getListBackupsMethod) == null) {
          ClusterServiceGrpc.getListBackupsMethod = getListBackupsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterBackupsRequest, yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterBackupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListBackups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterBackupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterBackupsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("ListBackups"))
              .build();
        }
      }
    }
    return getListBackupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterHostsRequest,
      yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterHostsResponse> getListHostsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListHosts",
      requestType = yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterHostsRequest.class,
      responseType = yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterHostsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterHostsRequest,
      yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterHostsResponse> getListHostsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterHostsRequest, yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterHostsResponse> getListHostsMethod;
    if ((getListHostsMethod = ClusterServiceGrpc.getListHostsMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getListHostsMethod = ClusterServiceGrpc.getListHostsMethod) == null) {
          ClusterServiceGrpc.getListHostsMethod = getListHostsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterHostsRequest, yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterHostsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListHosts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterHostsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterHostsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("ListHosts"))
              .build();
        }
      }
    }
    return getListHostsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.AddClusterHostsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getAddHostsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddHosts",
      requestType = yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.AddClusterHostsRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.AddClusterHostsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getAddHostsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.AddClusterHostsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getAddHostsMethod;
    if ((getAddHostsMethod = ClusterServiceGrpc.getAddHostsMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getAddHostsMethod = ClusterServiceGrpc.getAddHostsMethod) == null) {
          ClusterServiceGrpc.getAddHostsMethod = getAddHostsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.AddClusterHostsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddHosts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.AddClusterHostsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("AddHosts"))
              .build();
        }
      }
    }
    return getAddHostsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.DeleteClusterHostsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteHostsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteHosts",
      requestType = yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.DeleteClusterHostsRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.DeleteClusterHostsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteHostsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.DeleteClusterHostsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteHostsMethod;
    if ((getDeleteHostsMethod = ClusterServiceGrpc.getDeleteHostsMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getDeleteHostsMethod = ClusterServiceGrpc.getDeleteHostsMethod) == null) {
          ClusterServiceGrpc.getDeleteHostsMethod = getDeleteHostsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.DeleteClusterHostsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteHosts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.DeleteClusterHostsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("DeleteHosts"))
              .build();
        }
      }
    }
    return getDeleteHostsMethod;
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
   * A set of methods for managing MySQL clusters.
   * </pre>
   */
  public static abstract class ClusterServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified MySQL cluster.
     * To get the list of available MySQL clusters, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.GetClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.mysql.v1alpha.ClusterOuterClass.Cluster> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of MySQL clusters that belong to the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClustersRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClustersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a MySQL cluster in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.CreateClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Modifies the specified MySQL cluster.
     * </pre>
     */
    public void update(yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.UpdateClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified MySQL cluster.
     * </pre>
     */
    public void delete(yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.DeleteClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Starts the specified MySQL cluster.
     * </pre>
     */
    public void start(yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.StartClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStartMethod(), responseObserver);
    }

    /**
     * <pre>
     * Stops the specified MySQL cluster.
     * </pre>
     */
    public void stop(yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.StopClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStopMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a backup for the specified MySQL cluster.
     * </pre>
     */
    public void backup(yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.BackupClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBackupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a new MySQL cluster using the specified backup.
     * </pre>
     */
    public void restore(yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.RestoreClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRestoreMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves logs for the specified MySQL cluster.
     * </pre>
     */
    public void listLogs(yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterLogsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterLogsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListLogsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of operations for the specified MySQL cluster.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterOperationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of available backups for the specified MySQL cluster.
     * </pre>
     */
    public void listBackups(yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterBackupsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterBackupsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListBackupsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves a list of hosts for the specified MySQL cluster.
     * </pre>
     */
    public void listHosts(yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterHostsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterHostsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListHostsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates new hosts for a cluster.
     * </pre>
     */
    public void addHosts(yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.AddClusterHostsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddHostsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified hosts for a cluster.
     * </pre>
     */
    public void deleteHosts(yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.DeleteClusterHostsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteHostsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.GetClusterRequest,
                yandex.cloud.api.mdb.mysql.v1alpha.ClusterOuterClass.Cluster>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClustersRequest,
                yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClustersResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.CreateClusterRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.UpdateClusterRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.DeleteClusterRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getStartMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.StartClusterRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_START)))
          .addMethod(
            getStopMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.StopClusterRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_STOP)))
          .addMethod(
            getBackupMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.BackupClusterRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_BACKUP)))
          .addMethod(
            getRestoreMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.RestoreClusterRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_RESTORE)))
          .addMethod(
            getListLogsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterLogsRequest,
                yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterLogsResponse>(
                  this, METHODID_LIST_LOGS)))
          .addMethod(
            getListOperationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterOperationsRequest,
                yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterOperationsResponse>(
                  this, METHODID_LIST_OPERATIONS)))
          .addMethod(
            getListBackupsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterBackupsRequest,
                yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterBackupsResponse>(
                  this, METHODID_LIST_BACKUPS)))
          .addMethod(
            getListHostsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterHostsRequest,
                yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterHostsResponse>(
                  this, METHODID_LIST_HOSTS)))
          .addMethod(
            getAddHostsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.AddClusterHostsRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_ADD_HOSTS)))
          .addMethod(
            getDeleteHostsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.DeleteClusterHostsRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE_HOSTS)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing MySQL clusters.
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
     * Returns the specified MySQL cluster.
     * To get the list of available MySQL clusters, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.GetClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.mysql.v1alpha.ClusterOuterClass.Cluster> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of MySQL clusters that belong to the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClustersRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClustersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a MySQL cluster in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.CreateClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Modifies the specified MySQL cluster.
     * </pre>
     */
    public void update(yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.UpdateClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified MySQL cluster.
     * </pre>
     */
    public void delete(yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.DeleteClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Starts the specified MySQL cluster.
     * </pre>
     */
    public void start(yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.StartClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Stops the specified MySQL cluster.
     * </pre>
     */
    public void stop(yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.StopClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStopMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a backup for the specified MySQL cluster.
     * </pre>
     */
    public void backup(yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.BackupClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBackupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a new MySQL cluster using the specified backup.
     * </pre>
     */
    public void restore(yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.RestoreClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRestoreMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves logs for the specified MySQL cluster.
     * </pre>
     */
    public void listLogs(yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterLogsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterLogsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListLogsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of operations for the specified MySQL cluster.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterOperationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of available backups for the specified MySQL cluster.
     * </pre>
     */
    public void listBackups(yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterBackupsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterBackupsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListBackupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves a list of hosts for the specified MySQL cluster.
     * </pre>
     */
    public void listHosts(yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterHostsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterHostsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListHostsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates new hosts for a cluster.
     * </pre>
     */
    public void addHosts(yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.AddClusterHostsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddHostsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified hosts for a cluster.
     * </pre>
     */
    public void deleteHosts(yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.DeleteClusterHostsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteHostsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing MySQL clusters.
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
     * Returns the specified MySQL cluster.
     * To get the list of available MySQL clusters, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.mdb.mysql.v1alpha.ClusterOuterClass.Cluster get(yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.GetClusterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of MySQL clusters that belong to the specified folder.
     * </pre>
     */
    public yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClustersResponse list(yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClustersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a MySQL cluster in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.CreateClusterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Modifies the specified MySQL cluster.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.UpdateClusterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified MySQL cluster.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.DeleteClusterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Starts the specified MySQL cluster.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation start(yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.StartClusterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStartMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Stops the specified MySQL cluster.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation stop(yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.StopClusterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStopMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a backup for the specified MySQL cluster.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation backup(yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.BackupClusterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBackupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new MySQL cluster using the specified backup.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation restore(yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.RestoreClusterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRestoreMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves logs for the specified MySQL cluster.
     * </pre>
     */
    public yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterLogsResponse listLogs(yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterLogsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListLogsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of operations for the specified MySQL cluster.
     * </pre>
     */
    public yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterOperationsResponse listOperations(yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterOperationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of available backups for the specified MySQL cluster.
     * </pre>
     */
    public yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterBackupsResponse listBackups(yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterBackupsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListBackupsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves a list of hosts for the specified MySQL cluster.
     * </pre>
     */
    public yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterHostsResponse listHosts(yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterHostsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListHostsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates new hosts for a cluster.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation addHosts(yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.AddClusterHostsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddHostsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified hosts for a cluster.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation deleteHosts(yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.DeleteClusterHostsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteHostsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing MySQL clusters.
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
     * Returns the specified MySQL cluster.
     * To get the list of available MySQL clusters, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.mdb.mysql.v1alpha.ClusterOuterClass.Cluster> get(
        yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.GetClusterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of MySQL clusters that belong to the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClustersResponse> list(
        yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClustersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a MySQL cluster in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.CreateClusterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Modifies the specified MySQL cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.UpdateClusterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified MySQL cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.DeleteClusterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Starts the specified MySQL cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> start(
        yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.StartClusterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStartMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Stops the specified MySQL cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> stop(
        yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.StopClusterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStopMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a backup for the specified MySQL cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> backup(
        yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.BackupClusterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBackupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a new MySQL cluster using the specified backup.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> restore(
        yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.RestoreClusterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRestoreMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves logs for the specified MySQL cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterLogsResponse> listLogs(
        yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterLogsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListLogsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of operations for the specified MySQL cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterOperationsResponse> listOperations(
        yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterOperationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of available backups for the specified MySQL cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterBackupsResponse> listBackups(
        yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterBackupsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListBackupsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves a list of hosts for the specified MySQL cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterHostsResponse> listHosts(
        yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterHostsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListHostsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates new hosts for a cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> addHosts(
        yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.AddClusterHostsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddHostsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified hosts for a cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> deleteHosts(
        yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.DeleteClusterHostsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteHostsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_DELETE = 4;
  private static final int METHODID_START = 5;
  private static final int METHODID_STOP = 6;
  private static final int METHODID_BACKUP = 7;
  private static final int METHODID_RESTORE = 8;
  private static final int METHODID_LIST_LOGS = 9;
  private static final int METHODID_LIST_OPERATIONS = 10;
  private static final int METHODID_LIST_BACKUPS = 11;
  private static final int METHODID_LIST_HOSTS = 12;
  private static final int METHODID_ADD_HOSTS = 13;
  private static final int METHODID_DELETE_HOSTS = 14;

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
          serviceImpl.get((yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.GetClusterRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.mysql.v1alpha.ClusterOuterClass.Cluster>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClustersRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClustersResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.CreateClusterRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.UpdateClusterRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.DeleteClusterRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_START:
          serviceImpl.start((yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.StartClusterRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_STOP:
          serviceImpl.stop((yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.StopClusterRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_BACKUP:
          serviceImpl.backup((yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.BackupClusterRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_RESTORE:
          serviceImpl.restore((yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.RestoreClusterRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_LOGS:
          serviceImpl.listLogs((yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterLogsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterLogsResponse>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterOperationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterOperationsResponse>) responseObserver);
          break;
        case METHODID_LIST_BACKUPS:
          serviceImpl.listBackups((yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterBackupsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterBackupsResponse>) responseObserver);
          break;
        case METHODID_LIST_HOSTS:
          serviceImpl.listHosts((yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterHostsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.ListClusterHostsResponse>) responseObserver);
          break;
        case METHODID_ADD_HOSTS:
          serviceImpl.addHosts((yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.AddClusterHostsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE_HOSTS:
          serviceImpl.deleteHosts((yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.DeleteClusterHostsRequest) request,
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
      return yandex.cloud.api.mdb.mysql.v1alpha.ClusterServiceOuterClass.getDescriptor();
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
              .addMethod(getBackupMethod())
              .addMethod(getRestoreMethod())
              .addMethod(getListLogsMethod())
              .addMethod(getListOperationsMethod())
              .addMethod(getListBackupsMethod())
              .addMethod(getListHostsMethod())
              .addMethod(getAddHostsMethod())
              .addMethod(getDeleteHostsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
