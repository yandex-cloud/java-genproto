package yandex.cloud.api.mdb.sqlserver.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing SQL Server clusters.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/mdb/sqlserver/v1/cluster_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ClusterServiceGrpc {

  private ClusterServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.mdb.sqlserver.v1.ClusterService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.sqlserver.v1.PSCS.GetClusterRequest,
      yandex.cloud.api.mdb.sqlserver.v1.PSC.Cluster> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.mdb.sqlserver.v1.PSCS.GetClusterRequest.class,
      responseType = yandex.cloud.api.mdb.sqlserver.v1.PSC.Cluster.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.sqlserver.v1.PSCS.GetClusterRequest,
      yandex.cloud.api.mdb.sqlserver.v1.PSC.Cluster> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.sqlserver.v1.PSCS.GetClusterRequest, yandex.cloud.api.mdb.sqlserver.v1.PSC.Cluster> getGetMethod;
    if ((getGetMethod = ClusterServiceGrpc.getGetMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getGetMethod = ClusterServiceGrpc.getGetMethod) == null) {
          ClusterServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.sqlserver.v1.PSCS.GetClusterRequest, yandex.cloud.api.mdb.sqlserver.v1.PSC.Cluster>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.sqlserver.v1.PSCS.GetClusterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.sqlserver.v1.PSC.Cluster.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClustersRequest,
      yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClustersResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClustersRequest.class,
      responseType = yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClustersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClustersRequest,
      yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClustersResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClustersRequest, yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClustersResponse> getListMethod;
    if ((getListMethod = ClusterServiceGrpc.getListMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getListMethod = ClusterServiceGrpc.getListMethod) == null) {
          ClusterServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClustersRequest, yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClustersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClustersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClustersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.sqlserver.v1.PSCS.CreateClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.mdb.sqlserver.v1.PSCS.CreateClusterRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.sqlserver.v1.PSCS.CreateClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.sqlserver.v1.PSCS.CreateClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = ClusterServiceGrpc.getCreateMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getCreateMethod = ClusterServiceGrpc.getCreateMethod) == null) {
          ClusterServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.sqlserver.v1.PSCS.CreateClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.sqlserver.v1.PSCS.CreateClusterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.sqlserver.v1.PSCS.UpdateClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.mdb.sqlserver.v1.PSCS.UpdateClusterRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.sqlserver.v1.PSCS.UpdateClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.sqlserver.v1.PSCS.UpdateClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = ClusterServiceGrpc.getUpdateMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getUpdateMethod = ClusterServiceGrpc.getUpdateMethod) == null) {
          ClusterServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.sqlserver.v1.PSCS.UpdateClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.sqlserver.v1.PSCS.UpdateClusterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.sqlserver.v1.PSCS.DeleteClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.mdb.sqlserver.v1.PSCS.DeleteClusterRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.sqlserver.v1.PSCS.DeleteClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.sqlserver.v1.PSCS.DeleteClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = ClusterServiceGrpc.getDeleteMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getDeleteMethod = ClusterServiceGrpc.getDeleteMethod) == null) {
          ClusterServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.sqlserver.v1.PSCS.DeleteClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.sqlserver.v1.PSCS.DeleteClusterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.sqlserver.v1.PSCS.StartClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getStartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Start",
      requestType = yandex.cloud.api.mdb.sqlserver.v1.PSCS.StartClusterRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.sqlserver.v1.PSCS.StartClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getStartMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.sqlserver.v1.PSCS.StartClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getStartMethod;
    if ((getStartMethod = ClusterServiceGrpc.getStartMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getStartMethod = ClusterServiceGrpc.getStartMethod) == null) {
          ClusterServiceGrpc.getStartMethod = getStartMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.sqlserver.v1.PSCS.StartClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Start"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.sqlserver.v1.PSCS.StartClusterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("Start"))
              .build();
        }
      }
    }
    return getStartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.sqlserver.v1.PSCS.StopClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getStopMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Stop",
      requestType = yandex.cloud.api.mdb.sqlserver.v1.PSCS.StopClusterRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.sqlserver.v1.PSCS.StopClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getStopMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.sqlserver.v1.PSCS.StopClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getStopMethod;
    if ((getStopMethod = ClusterServiceGrpc.getStopMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getStopMethod = ClusterServiceGrpc.getStopMethod) == null) {
          ClusterServiceGrpc.getStopMethod = getStopMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.sqlserver.v1.PSCS.StopClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Stop"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.sqlserver.v1.PSCS.StopClusterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("Stop"))
              .build();
        }
      }
    }
    return getStopMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.sqlserver.v1.PSCS.MoveClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getMoveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Move",
      requestType = yandex.cloud.api.mdb.sqlserver.v1.PSCS.MoveClusterRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.sqlserver.v1.PSCS.MoveClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getMoveMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.sqlserver.v1.PSCS.MoveClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getMoveMethod;
    if ((getMoveMethod = ClusterServiceGrpc.getMoveMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getMoveMethod = ClusterServiceGrpc.getMoveMethod) == null) {
          ClusterServiceGrpc.getMoveMethod = getMoveMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.sqlserver.v1.PSCS.MoveClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Move"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.sqlserver.v1.PSCS.MoveClusterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("Move"))
              .build();
        }
      }
    }
    return getMoveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.sqlserver.v1.PSCS.BackupClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getBackupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Backup",
      requestType = yandex.cloud.api.mdb.sqlserver.v1.PSCS.BackupClusterRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.sqlserver.v1.PSCS.BackupClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getBackupMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.sqlserver.v1.PSCS.BackupClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getBackupMethod;
    if ((getBackupMethod = ClusterServiceGrpc.getBackupMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getBackupMethod = ClusterServiceGrpc.getBackupMethod) == null) {
          ClusterServiceGrpc.getBackupMethod = getBackupMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.sqlserver.v1.PSCS.BackupClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Backup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.sqlserver.v1.PSCS.BackupClusterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("Backup"))
              .build();
        }
      }
    }
    return getBackupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.sqlserver.v1.PSCS.RestoreClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRestoreMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Restore",
      requestType = yandex.cloud.api.mdb.sqlserver.v1.PSCS.RestoreClusterRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.sqlserver.v1.PSCS.RestoreClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRestoreMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.sqlserver.v1.PSCS.RestoreClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getRestoreMethod;
    if ((getRestoreMethod = ClusterServiceGrpc.getRestoreMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getRestoreMethod = ClusterServiceGrpc.getRestoreMethod) == null) {
          ClusterServiceGrpc.getRestoreMethod = getRestoreMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.sqlserver.v1.PSCS.RestoreClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Restore"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.sqlserver.v1.PSCS.RestoreClusterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("Restore"))
              .build();
        }
      }
    }
    return getRestoreMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.sqlserver.v1.PSCS.StartClusterFailoverRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getStartFailoverMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartFailover",
      requestType = yandex.cloud.api.mdb.sqlserver.v1.PSCS.StartClusterFailoverRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.sqlserver.v1.PSCS.StartClusterFailoverRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getStartFailoverMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.sqlserver.v1.PSCS.StartClusterFailoverRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getStartFailoverMethod;
    if ((getStartFailoverMethod = ClusterServiceGrpc.getStartFailoverMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getStartFailoverMethod = ClusterServiceGrpc.getStartFailoverMethod) == null) {
          ClusterServiceGrpc.getStartFailoverMethod = getStartFailoverMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.sqlserver.v1.PSCS.StartClusterFailoverRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StartFailover"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.sqlserver.v1.PSCS.StartClusterFailoverRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("StartFailover"))
              .build();
        }
      }
    }
    return getStartFailoverMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterLogsRequest,
      yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterLogsResponse> getListLogsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListLogs",
      requestType = yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterLogsRequest.class,
      responseType = yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterLogsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterLogsRequest,
      yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterLogsResponse> getListLogsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterLogsRequest, yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterLogsResponse> getListLogsMethod;
    if ((getListLogsMethod = ClusterServiceGrpc.getListLogsMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getListLogsMethod = ClusterServiceGrpc.getListLogsMethod) == null) {
          ClusterServiceGrpc.getListLogsMethod = getListLogsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterLogsRequest, yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterLogsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListLogs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterLogsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterLogsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("ListLogs"))
              .build();
        }
      }
    }
    return getListLogsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterOperationsRequest,
      yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterOperationsResponse> getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterOperationsRequest.class,
      responseType = yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterOperationsRequest,
      yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterOperationsResponse> getListOperationsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterOperationsRequest, yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterOperationsResponse> getListOperationsMethod;
    if ((getListOperationsMethod = ClusterServiceGrpc.getListOperationsMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getListOperationsMethod = ClusterServiceGrpc.getListOperationsMethod) == null) {
          ClusterServiceGrpc.getListOperationsMethod = getListOperationsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterOperationsRequest, yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterOperationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("ListOperations"))
              .build();
        }
      }
    }
    return getListOperationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterBackupsRequest,
      yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterBackupsResponse> getListBackupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListBackups",
      requestType = yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterBackupsRequest.class,
      responseType = yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterBackupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterBackupsRequest,
      yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterBackupsResponse> getListBackupsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterBackupsRequest, yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterBackupsResponse> getListBackupsMethod;
    if ((getListBackupsMethod = ClusterServiceGrpc.getListBackupsMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getListBackupsMethod = ClusterServiceGrpc.getListBackupsMethod) == null) {
          ClusterServiceGrpc.getListBackupsMethod = getListBackupsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterBackupsRequest, yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterBackupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListBackups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterBackupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterBackupsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("ListBackups"))
              .build();
        }
      }
    }
    return getListBackupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterHostsRequest,
      yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterHostsResponse> getListHostsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListHosts",
      requestType = yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterHostsRequest.class,
      responseType = yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterHostsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterHostsRequest,
      yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterHostsResponse> getListHostsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterHostsRequest, yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterHostsResponse> getListHostsMethod;
    if ((getListHostsMethod = ClusterServiceGrpc.getListHostsMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getListHostsMethod = ClusterServiceGrpc.getListHostsMethod) == null) {
          ClusterServiceGrpc.getListHostsMethod = getListHostsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterHostsRequest, yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterHostsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListHosts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterHostsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterHostsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("ListHosts"))
              .build();
        }
      }
    }
    return getListHostsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.sqlserver.v1.PSCS.UpdateClusterHostsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateHostsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateHosts",
      requestType = yandex.cloud.api.mdb.sqlserver.v1.PSCS.UpdateClusterHostsRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.sqlserver.v1.PSCS.UpdateClusterHostsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateHostsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.sqlserver.v1.PSCS.UpdateClusterHostsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateHostsMethod;
    if ((getUpdateHostsMethod = ClusterServiceGrpc.getUpdateHostsMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getUpdateHostsMethod = ClusterServiceGrpc.getUpdateHostsMethod) == null) {
          ClusterServiceGrpc.getUpdateHostsMethod = getUpdateHostsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.sqlserver.v1.PSCS.UpdateClusterHostsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateHosts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.sqlserver.v1.PSCS.UpdateClusterHostsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("UpdateHosts"))
              .build();
        }
      }
    }
    return getUpdateHostsMethod;
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
   * A set of methods for managing SQL Server clusters.
   * </pre>
   */
  public static abstract class ClusterServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified SQL Server cluster.
     * To get the list of available SQL Server clusters, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.mdb.sqlserver.v1.PSCS.GetClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.sqlserver.v1.PSC.Cluster> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of SQL Server clusters that belong to the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClustersRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClustersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates an SQL Server cluster in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.mdb.sqlserver.v1.PSCS.CreateClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Modifies the specified SQL Server cluster.
     * </pre>
     */
    public void update(yandex.cloud.api.mdb.sqlserver.v1.PSCS.UpdateClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified SQL Server cluster.
     * </pre>
     */
    public void delete(yandex.cloud.api.mdb.sqlserver.v1.PSCS.DeleteClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Starts the specified SQL Server cluster.
     * </pre>
     */
    public void start(yandex.cloud.api.mdb.sqlserver.v1.PSCS.StartClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStartMethod(), responseObserver);
    }

    /**
     * <pre>
     * Stops the specified SQL Server cluster.
     * </pre>
     */
    public void stop(yandex.cloud.api.mdb.sqlserver.v1.PSCS.StopClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStopMethod(), responseObserver);
    }

    /**
     * <pre>
     * Moves the specified SQL Server cluster to the specified folder.
     * </pre>
     */
    public void move(yandex.cloud.api.mdb.sqlserver.v1.PSCS.MoveClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMoveMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a backup for the specified SQL Server cluster.
     * </pre>
     */
    public void backup(yandex.cloud.api.mdb.sqlserver.v1.PSCS.BackupClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBackupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a new SQL Server cluster using the specified backup.
     * </pre>
     */
    public void restore(yandex.cloud.api.mdb.sqlserver.v1.PSCS.RestoreClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRestoreMethod(), responseObserver);
    }

    /**
     * <pre>
     * Starts a manual failover for a cluster.
     * </pre>
     */
    public void startFailover(yandex.cloud.api.mdb.sqlserver.v1.PSCS.StartClusterFailoverRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStartFailoverMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves logs for the specified SQL Server cluster.
     * For more information about logs, see the [Logs](/docs/managed-sqlserver/operations/cluster-logs) section in the documentation.
     * </pre>
     */
    public void listLogs(yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterLogsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterLogsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListLogsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of operations for the specified SQL Server cluster.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterOperationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of available backups for the specified SQL Server cluster.
     * </pre>
     */
    public void listBackups(yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterBackupsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterBackupsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListBackupsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves a list of hosts for the specified SQL Server cluster.
     * </pre>
     */
    public void listHosts(yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterHostsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterHostsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListHostsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified hosts.
     * </pre>
     */
    public void updateHosts(yandex.cloud.api.mdb.sqlserver.v1.PSCS.UpdateClusterHostsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateHostsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.sqlserver.v1.PSCS.GetClusterRequest,
                yandex.cloud.api.mdb.sqlserver.v1.PSC.Cluster>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClustersRequest,
                yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClustersResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.sqlserver.v1.PSCS.CreateClusterRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.sqlserver.v1.PSCS.UpdateClusterRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.sqlserver.v1.PSCS.DeleteClusterRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getStartMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.sqlserver.v1.PSCS.StartClusterRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_START)))
          .addMethod(
            getStopMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.sqlserver.v1.PSCS.StopClusterRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_STOP)))
          .addMethod(
            getMoveMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.sqlserver.v1.PSCS.MoveClusterRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_MOVE)))
          .addMethod(
            getBackupMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.sqlserver.v1.PSCS.BackupClusterRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_BACKUP)))
          .addMethod(
            getRestoreMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.sqlserver.v1.PSCS.RestoreClusterRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_RESTORE)))
          .addMethod(
            getStartFailoverMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.sqlserver.v1.PSCS.StartClusterFailoverRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_START_FAILOVER)))
          .addMethod(
            getListLogsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterLogsRequest,
                yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterLogsResponse>(
                  this, METHODID_LIST_LOGS)))
          .addMethod(
            getListOperationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterOperationsRequest,
                yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterOperationsResponse>(
                  this, METHODID_LIST_OPERATIONS)))
          .addMethod(
            getListBackupsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterBackupsRequest,
                yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterBackupsResponse>(
                  this, METHODID_LIST_BACKUPS)))
          .addMethod(
            getListHostsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterHostsRequest,
                yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterHostsResponse>(
                  this, METHODID_LIST_HOSTS)))
          .addMethod(
            getUpdateHostsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.sqlserver.v1.PSCS.UpdateClusterHostsRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE_HOSTS)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing SQL Server clusters.
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
     * Returns the specified SQL Server cluster.
     * To get the list of available SQL Server clusters, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.mdb.sqlserver.v1.PSCS.GetClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.sqlserver.v1.PSC.Cluster> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of SQL Server clusters that belong to the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClustersRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClustersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates an SQL Server cluster in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.mdb.sqlserver.v1.PSCS.CreateClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Modifies the specified SQL Server cluster.
     * </pre>
     */
    public void update(yandex.cloud.api.mdb.sqlserver.v1.PSCS.UpdateClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified SQL Server cluster.
     * </pre>
     */
    public void delete(yandex.cloud.api.mdb.sqlserver.v1.PSCS.DeleteClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Starts the specified SQL Server cluster.
     * </pre>
     */
    public void start(yandex.cloud.api.mdb.sqlserver.v1.PSCS.StartClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Stops the specified SQL Server cluster.
     * </pre>
     */
    public void stop(yandex.cloud.api.mdb.sqlserver.v1.PSCS.StopClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStopMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Moves the specified SQL Server cluster to the specified folder.
     * </pre>
     */
    public void move(yandex.cloud.api.mdb.sqlserver.v1.PSCS.MoveClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMoveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a backup for the specified SQL Server cluster.
     * </pre>
     */
    public void backup(yandex.cloud.api.mdb.sqlserver.v1.PSCS.BackupClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBackupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a new SQL Server cluster using the specified backup.
     * </pre>
     */
    public void restore(yandex.cloud.api.mdb.sqlserver.v1.PSCS.RestoreClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRestoreMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Starts a manual failover for a cluster.
     * </pre>
     */
    public void startFailover(yandex.cloud.api.mdb.sqlserver.v1.PSCS.StartClusterFailoverRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStartFailoverMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves logs for the specified SQL Server cluster.
     * For more information about logs, see the [Logs](/docs/managed-sqlserver/operations/cluster-logs) section in the documentation.
     * </pre>
     */
    public void listLogs(yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterLogsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterLogsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListLogsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of operations for the specified SQL Server cluster.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterOperationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of available backups for the specified SQL Server cluster.
     * </pre>
     */
    public void listBackups(yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterBackupsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterBackupsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListBackupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves a list of hosts for the specified SQL Server cluster.
     * </pre>
     */
    public void listHosts(yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterHostsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterHostsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListHostsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified hosts.
     * </pre>
     */
    public void updateHosts(yandex.cloud.api.mdb.sqlserver.v1.PSCS.UpdateClusterHostsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateHostsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing SQL Server clusters.
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
     * Returns the specified SQL Server cluster.
     * To get the list of available SQL Server clusters, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.mdb.sqlserver.v1.PSC.Cluster get(yandex.cloud.api.mdb.sqlserver.v1.PSCS.GetClusterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of SQL Server clusters that belong to the specified folder.
     * </pre>
     */
    public yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClustersResponse list(yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClustersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates an SQL Server cluster in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.mdb.sqlserver.v1.PSCS.CreateClusterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Modifies the specified SQL Server cluster.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.mdb.sqlserver.v1.PSCS.UpdateClusterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified SQL Server cluster.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.mdb.sqlserver.v1.PSCS.DeleteClusterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Starts the specified SQL Server cluster.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation start(yandex.cloud.api.mdb.sqlserver.v1.PSCS.StartClusterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStartMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Stops the specified SQL Server cluster.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation stop(yandex.cloud.api.mdb.sqlserver.v1.PSCS.StopClusterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStopMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Moves the specified SQL Server cluster to the specified folder.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation move(yandex.cloud.api.mdb.sqlserver.v1.PSCS.MoveClusterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMoveMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a backup for the specified SQL Server cluster.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation backup(yandex.cloud.api.mdb.sqlserver.v1.PSCS.BackupClusterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBackupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new SQL Server cluster using the specified backup.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation restore(yandex.cloud.api.mdb.sqlserver.v1.PSCS.RestoreClusterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRestoreMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Starts a manual failover for a cluster.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation startFailover(yandex.cloud.api.mdb.sqlserver.v1.PSCS.StartClusterFailoverRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStartFailoverMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves logs for the specified SQL Server cluster.
     * For more information about logs, see the [Logs](/docs/managed-sqlserver/operations/cluster-logs) section in the documentation.
     * </pre>
     */
    public yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterLogsResponse listLogs(yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterLogsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListLogsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of operations for the specified SQL Server cluster.
     * </pre>
     */
    public yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterOperationsResponse listOperations(yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterOperationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of available backups for the specified SQL Server cluster.
     * </pre>
     */
    public yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterBackupsResponse listBackups(yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterBackupsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListBackupsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves a list of hosts for the specified SQL Server cluster.
     * </pre>
     */
    public yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterHostsResponse listHosts(yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterHostsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListHostsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified hosts.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation updateHosts(yandex.cloud.api.mdb.sqlserver.v1.PSCS.UpdateClusterHostsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateHostsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing SQL Server clusters.
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
     * Returns the specified SQL Server cluster.
     * To get the list of available SQL Server clusters, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.mdb.sqlserver.v1.PSC.Cluster> get(
        yandex.cloud.api.mdb.sqlserver.v1.PSCS.GetClusterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of SQL Server clusters that belong to the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClustersResponse> list(
        yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClustersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates an SQL Server cluster in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.mdb.sqlserver.v1.PSCS.CreateClusterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Modifies the specified SQL Server cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.mdb.sqlserver.v1.PSCS.UpdateClusterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified SQL Server cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.mdb.sqlserver.v1.PSCS.DeleteClusterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Starts the specified SQL Server cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> start(
        yandex.cloud.api.mdb.sqlserver.v1.PSCS.StartClusterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStartMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Stops the specified SQL Server cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> stop(
        yandex.cloud.api.mdb.sqlserver.v1.PSCS.StopClusterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStopMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Moves the specified SQL Server cluster to the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> move(
        yandex.cloud.api.mdb.sqlserver.v1.PSCS.MoveClusterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMoveMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a backup for the specified SQL Server cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> backup(
        yandex.cloud.api.mdb.sqlserver.v1.PSCS.BackupClusterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBackupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a new SQL Server cluster using the specified backup.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> restore(
        yandex.cloud.api.mdb.sqlserver.v1.PSCS.RestoreClusterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRestoreMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Starts a manual failover for a cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> startFailover(
        yandex.cloud.api.mdb.sqlserver.v1.PSCS.StartClusterFailoverRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStartFailoverMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves logs for the specified SQL Server cluster.
     * For more information about logs, see the [Logs](/docs/managed-sqlserver/operations/cluster-logs) section in the documentation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterLogsResponse> listLogs(
        yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterLogsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListLogsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of operations for the specified SQL Server cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterOperationsResponse> listOperations(
        yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterOperationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of available backups for the specified SQL Server cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterBackupsResponse> listBackups(
        yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterBackupsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListBackupsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves a list of hosts for the specified SQL Server cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterHostsResponse> listHosts(
        yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterHostsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListHostsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified hosts.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> updateHosts(
        yandex.cloud.api.mdb.sqlserver.v1.PSCS.UpdateClusterHostsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateHostsMethod(), getCallOptions()), request);
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
  private static final int METHODID_START_FAILOVER = 10;
  private static final int METHODID_LIST_LOGS = 11;
  private static final int METHODID_LIST_OPERATIONS = 12;
  private static final int METHODID_LIST_BACKUPS = 13;
  private static final int METHODID_LIST_HOSTS = 14;
  private static final int METHODID_UPDATE_HOSTS = 15;

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
          serviceImpl.get((yandex.cloud.api.mdb.sqlserver.v1.PSCS.GetClusterRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.sqlserver.v1.PSC.Cluster>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClustersRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClustersResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.mdb.sqlserver.v1.PSCS.CreateClusterRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.mdb.sqlserver.v1.PSCS.UpdateClusterRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.mdb.sqlserver.v1.PSCS.DeleteClusterRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_START:
          serviceImpl.start((yandex.cloud.api.mdb.sqlserver.v1.PSCS.StartClusterRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_STOP:
          serviceImpl.stop((yandex.cloud.api.mdb.sqlserver.v1.PSCS.StopClusterRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_MOVE:
          serviceImpl.move((yandex.cloud.api.mdb.sqlserver.v1.PSCS.MoveClusterRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_BACKUP:
          serviceImpl.backup((yandex.cloud.api.mdb.sqlserver.v1.PSCS.BackupClusterRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_RESTORE:
          serviceImpl.restore((yandex.cloud.api.mdb.sqlserver.v1.PSCS.RestoreClusterRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_START_FAILOVER:
          serviceImpl.startFailover((yandex.cloud.api.mdb.sqlserver.v1.PSCS.StartClusterFailoverRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_LOGS:
          serviceImpl.listLogs((yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterLogsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterLogsResponse>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterOperationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterOperationsResponse>) responseObserver);
          break;
        case METHODID_LIST_BACKUPS:
          serviceImpl.listBackups((yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterBackupsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterBackupsResponse>) responseObserver);
          break;
        case METHODID_LIST_HOSTS:
          serviceImpl.listHosts((yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterHostsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.sqlserver.v1.PSCS.ListClusterHostsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_HOSTS:
          serviceImpl.updateHosts((yandex.cloud.api.mdb.sqlserver.v1.PSCS.UpdateClusterHostsRequest) request,
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
      return yandex.cloud.api.mdb.sqlserver.v1.PSCS.getDescriptor();
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
              .addMethod(getStartFailoverMethod())
              .addMethod(getListLogsMethod())
              .addMethod(getListOperationsMethod())
              .addMethod(getListBackupsMethod())
              .addMethod(getListHostsMethod())
              .addMethod(getUpdateHostsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
