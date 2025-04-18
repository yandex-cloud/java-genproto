package yandex.cloud.api.datasphere.v2.jobs;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing Project Jobs. Do not use these methods manually.
 * For working with DataSphere Jobs, install DataSphere CLI via `pip install datasphere`.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/datasphere/v2/jobs/project_job_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ProjectJobServiceGrpc {

  private ProjectJobServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.datasphere.v2.jobs.ProjectJobService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.jobs.DSPJS.CreateProjectJobRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.datasphere.v2.jobs.DSPJS.CreateProjectJobRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.jobs.DSPJS.CreateProjectJobRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.jobs.DSPJS.CreateProjectJobRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = ProjectJobServiceGrpc.getCreateMethod) == null) {
      synchronized (ProjectJobServiceGrpc.class) {
        if ((getCreateMethod = ProjectJobServiceGrpc.getCreateMethod) == null) {
          ProjectJobServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.datasphere.v2.jobs.DSPJS.CreateProjectJobRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datasphere.v2.jobs.DSPJS.CreateProjectJobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectJobServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.jobs.DSPJS.CloneProjectJobRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCloneMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Clone",
      requestType = yandex.cloud.api.datasphere.v2.jobs.DSPJS.CloneProjectJobRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.jobs.DSPJS.CloneProjectJobRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCloneMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.jobs.DSPJS.CloneProjectJobRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCloneMethod;
    if ((getCloneMethod = ProjectJobServiceGrpc.getCloneMethod) == null) {
      synchronized (ProjectJobServiceGrpc.class) {
        if ((getCloneMethod = ProjectJobServiceGrpc.getCloneMethod) == null) {
          ProjectJobServiceGrpc.getCloneMethod = getCloneMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.datasphere.v2.jobs.DSPJS.CloneProjectJobRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Clone"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datasphere.v2.jobs.DSPJS.CloneProjectJobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectJobServiceMethodDescriptorSupplier("Clone"))
              .build();
        }
      }
    }
    return getCloneMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.jobs.DSPJS.ExecuteProjectJobRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getExecuteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Execute",
      requestType = yandex.cloud.api.datasphere.v2.jobs.DSPJS.ExecuteProjectJobRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.jobs.DSPJS.ExecuteProjectJobRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getExecuteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.jobs.DSPJS.ExecuteProjectJobRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getExecuteMethod;
    if ((getExecuteMethod = ProjectJobServiceGrpc.getExecuteMethod) == null) {
      synchronized (ProjectJobServiceGrpc.class) {
        if ((getExecuteMethod = ProjectJobServiceGrpc.getExecuteMethod) == null) {
          ProjectJobServiceGrpc.getExecuteMethod = getExecuteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.datasphere.v2.jobs.DSPJS.ExecuteProjectJobRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Execute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datasphere.v2.jobs.DSPJS.ExecuteProjectJobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectJobServiceMethodDescriptorSupplier("Execute"))
              .build();
        }
      }
    }
    return getExecuteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.jobs.DSPJS.CancelProjectJobRequest,
      com.google.protobuf.Empty> getCancelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Cancel",
      requestType = yandex.cloud.api.datasphere.v2.jobs.DSPJS.CancelProjectJobRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.jobs.DSPJS.CancelProjectJobRequest,
      com.google.protobuf.Empty> getCancelMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.jobs.DSPJS.CancelProjectJobRequest, com.google.protobuf.Empty> getCancelMethod;
    if ((getCancelMethod = ProjectJobServiceGrpc.getCancelMethod) == null) {
      synchronized (ProjectJobServiceGrpc.class) {
        if ((getCancelMethod = ProjectJobServiceGrpc.getCancelMethod) == null) {
          ProjectJobServiceGrpc.getCancelMethod = getCancelMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.datasphere.v2.jobs.DSPJS.CancelProjectJobRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Cancel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datasphere.v2.jobs.DSPJS.CancelProjectJobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectJobServiceMethodDescriptorSupplier("Cancel"))
              .build();
        }
      }
    }
    return getCancelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.jobs.DSPJS.ReadProjectJobStdLogsRequest,
      yandex.cloud.api.datasphere.v2.jobs.DSPJS.ReadProjectJobStdLogsResponse> getReadStdLogsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReadStdLogs",
      requestType = yandex.cloud.api.datasphere.v2.jobs.DSPJS.ReadProjectJobStdLogsRequest.class,
      responseType = yandex.cloud.api.datasphere.v2.jobs.DSPJS.ReadProjectJobStdLogsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.jobs.DSPJS.ReadProjectJobStdLogsRequest,
      yandex.cloud.api.datasphere.v2.jobs.DSPJS.ReadProjectJobStdLogsResponse> getReadStdLogsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.jobs.DSPJS.ReadProjectJobStdLogsRequest, yandex.cloud.api.datasphere.v2.jobs.DSPJS.ReadProjectJobStdLogsResponse> getReadStdLogsMethod;
    if ((getReadStdLogsMethod = ProjectJobServiceGrpc.getReadStdLogsMethod) == null) {
      synchronized (ProjectJobServiceGrpc.class) {
        if ((getReadStdLogsMethod = ProjectJobServiceGrpc.getReadStdLogsMethod) == null) {
          ProjectJobServiceGrpc.getReadStdLogsMethod = getReadStdLogsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.datasphere.v2.jobs.DSPJS.ReadProjectJobStdLogsRequest, yandex.cloud.api.datasphere.v2.jobs.DSPJS.ReadProjectJobStdLogsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReadStdLogs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datasphere.v2.jobs.DSPJS.ReadProjectJobStdLogsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datasphere.v2.jobs.DSPJS.ReadProjectJobStdLogsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectJobServiceMethodDescriptorSupplier("ReadStdLogs"))
              .build();
        }
      }
    }
    return getReadStdLogsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.jobs.DSPJS.ReadProjectJobLogsRequest,
      yandex.cloud.api.datasphere.v2.jobs.DSPJS.ReadProjectJobLogsResponse> getReadLogsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReadLogs",
      requestType = yandex.cloud.api.datasphere.v2.jobs.DSPJS.ReadProjectJobLogsRequest.class,
      responseType = yandex.cloud.api.datasphere.v2.jobs.DSPJS.ReadProjectJobLogsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.jobs.DSPJS.ReadProjectJobLogsRequest,
      yandex.cloud.api.datasphere.v2.jobs.DSPJS.ReadProjectJobLogsResponse> getReadLogsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.jobs.DSPJS.ReadProjectJobLogsRequest, yandex.cloud.api.datasphere.v2.jobs.DSPJS.ReadProjectJobLogsResponse> getReadLogsMethod;
    if ((getReadLogsMethod = ProjectJobServiceGrpc.getReadLogsMethod) == null) {
      synchronized (ProjectJobServiceGrpc.class) {
        if ((getReadLogsMethod = ProjectJobServiceGrpc.getReadLogsMethod) == null) {
          ProjectJobServiceGrpc.getReadLogsMethod = getReadLogsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.datasphere.v2.jobs.DSPJS.ReadProjectJobLogsRequest, yandex.cloud.api.datasphere.v2.jobs.DSPJS.ReadProjectJobLogsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReadLogs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datasphere.v2.jobs.DSPJS.ReadProjectJobLogsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datasphere.v2.jobs.DSPJS.ReadProjectJobLogsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectJobServiceMethodDescriptorSupplier("ReadLogs"))
              .build();
        }
      }
    }
    return getReadLogsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.jobs.DSPJS.DownloadProjectJobFilesRequest,
      yandex.cloud.api.datasphere.v2.jobs.DSPJS.DownloadProjectJobFilesResponse> getDownloadJobFilesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DownloadJobFiles",
      requestType = yandex.cloud.api.datasphere.v2.jobs.DSPJS.DownloadProjectJobFilesRequest.class,
      responseType = yandex.cloud.api.datasphere.v2.jobs.DSPJS.DownloadProjectJobFilesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.jobs.DSPJS.DownloadProjectJobFilesRequest,
      yandex.cloud.api.datasphere.v2.jobs.DSPJS.DownloadProjectJobFilesResponse> getDownloadJobFilesMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.jobs.DSPJS.DownloadProjectJobFilesRequest, yandex.cloud.api.datasphere.v2.jobs.DSPJS.DownloadProjectJobFilesResponse> getDownloadJobFilesMethod;
    if ((getDownloadJobFilesMethod = ProjectJobServiceGrpc.getDownloadJobFilesMethod) == null) {
      synchronized (ProjectJobServiceGrpc.class) {
        if ((getDownloadJobFilesMethod = ProjectJobServiceGrpc.getDownloadJobFilesMethod) == null) {
          ProjectJobServiceGrpc.getDownloadJobFilesMethod = getDownloadJobFilesMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.datasphere.v2.jobs.DSPJS.DownloadProjectJobFilesRequest, yandex.cloud.api.datasphere.v2.jobs.DSPJS.DownloadProjectJobFilesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DownloadJobFiles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datasphere.v2.jobs.DSPJS.DownloadProjectJobFilesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datasphere.v2.jobs.DSPJS.DownloadProjectJobFilesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectJobServiceMethodDescriptorSupplier("DownloadJobFiles"))
              .build();
        }
      }
    }
    return getDownloadJobFilesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.jobs.DSPJS.ListProjectJobRequest,
      yandex.cloud.api.datasphere.v2.jobs.DSPJS.ListProjectJobResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.datasphere.v2.jobs.DSPJS.ListProjectJobRequest.class,
      responseType = yandex.cloud.api.datasphere.v2.jobs.DSPJS.ListProjectJobResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.jobs.DSPJS.ListProjectJobRequest,
      yandex.cloud.api.datasphere.v2.jobs.DSPJS.ListProjectJobResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.jobs.DSPJS.ListProjectJobRequest, yandex.cloud.api.datasphere.v2.jobs.DSPJS.ListProjectJobResponse> getListMethod;
    if ((getListMethod = ProjectJobServiceGrpc.getListMethod) == null) {
      synchronized (ProjectJobServiceGrpc.class) {
        if ((getListMethod = ProjectJobServiceGrpc.getListMethod) == null) {
          ProjectJobServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.datasphere.v2.jobs.DSPJS.ListProjectJobRequest, yandex.cloud.api.datasphere.v2.jobs.DSPJS.ListProjectJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datasphere.v2.jobs.DSPJS.ListProjectJobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datasphere.v2.jobs.DSPJS.ListProjectJobResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectJobServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.jobs.DSPJS.GetProjectJobRequest,
      yandex.cloud.api.datasphere.v2.jobs.Jobs.Job> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.datasphere.v2.jobs.DSPJS.GetProjectJobRequest.class,
      responseType = yandex.cloud.api.datasphere.v2.jobs.Jobs.Job.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.jobs.DSPJS.GetProjectJobRequest,
      yandex.cloud.api.datasphere.v2.jobs.Jobs.Job> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.jobs.DSPJS.GetProjectJobRequest, yandex.cloud.api.datasphere.v2.jobs.Jobs.Job> getGetMethod;
    if ((getGetMethod = ProjectJobServiceGrpc.getGetMethod) == null) {
      synchronized (ProjectJobServiceGrpc.class) {
        if ((getGetMethod = ProjectJobServiceGrpc.getGetMethod) == null) {
          ProjectJobServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.datasphere.v2.jobs.DSPJS.GetProjectJobRequest, yandex.cloud.api.datasphere.v2.jobs.Jobs.Job>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datasphere.v2.jobs.DSPJS.GetProjectJobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datasphere.v2.jobs.Jobs.Job.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectJobServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.jobs.DSPJS.DeleteProjectJobRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.datasphere.v2.jobs.DSPJS.DeleteProjectJobRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.jobs.DSPJS.DeleteProjectJobRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.jobs.DSPJS.DeleteProjectJobRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = ProjectJobServiceGrpc.getDeleteMethod) == null) {
      synchronized (ProjectJobServiceGrpc.class) {
        if ((getDeleteMethod = ProjectJobServiceGrpc.getDeleteMethod) == null) {
          ProjectJobServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.datasphere.v2.jobs.DSPJS.DeleteProjectJobRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datasphere.v2.jobs.DSPJS.DeleteProjectJobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectJobServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.jobs.DSPJS.DeleteProjectJobDataRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteData",
      requestType = yandex.cloud.api.datasphere.v2.jobs.DSPJS.DeleteProjectJobDataRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.jobs.DSPJS.DeleteProjectJobDataRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteDataMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.jobs.DSPJS.DeleteProjectJobDataRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteDataMethod;
    if ((getDeleteDataMethod = ProjectJobServiceGrpc.getDeleteDataMethod) == null) {
      synchronized (ProjectJobServiceGrpc.class) {
        if ((getDeleteDataMethod = ProjectJobServiceGrpc.getDeleteDataMethod) == null) {
          ProjectJobServiceGrpc.getDeleteDataMethod = getDeleteDataMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.datasphere.v2.jobs.DSPJS.DeleteProjectJobDataRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datasphere.v2.jobs.DSPJS.DeleteProjectJobDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectJobServiceMethodDescriptorSupplier("DeleteData"))
              .build();
        }
      }
    }
    return getDeleteDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.jobs.DSPJS.DeleteAllProjectJobDataRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteAllDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAllData",
      requestType = yandex.cloud.api.datasphere.v2.jobs.DSPJS.DeleteAllProjectJobDataRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.jobs.DSPJS.DeleteAllProjectJobDataRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteAllDataMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.jobs.DSPJS.DeleteAllProjectJobDataRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteAllDataMethod;
    if ((getDeleteAllDataMethod = ProjectJobServiceGrpc.getDeleteAllDataMethod) == null) {
      synchronized (ProjectJobServiceGrpc.class) {
        if ((getDeleteAllDataMethod = ProjectJobServiceGrpc.getDeleteAllDataMethod) == null) {
          ProjectJobServiceGrpc.getDeleteAllDataMethod = getDeleteAllDataMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.datasphere.v2.jobs.DSPJS.DeleteAllProjectJobDataRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAllData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datasphere.v2.jobs.DSPJS.DeleteAllProjectJobDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectJobServiceMethodDescriptorSupplier("DeleteAllData"))
              .build();
        }
      }
    }
    return getDeleteAllDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.jobs.DSPJS.SetProjectJobDataTtlRequest,
      yandex.cloud.api.datasphere.v2.jobs.DSPJS.SetProjectJobDataTtlResponse> getSetDataTtlMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetDataTtl",
      requestType = yandex.cloud.api.datasphere.v2.jobs.DSPJS.SetProjectJobDataTtlRequest.class,
      responseType = yandex.cloud.api.datasphere.v2.jobs.DSPJS.SetProjectJobDataTtlResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.jobs.DSPJS.SetProjectJobDataTtlRequest,
      yandex.cloud.api.datasphere.v2.jobs.DSPJS.SetProjectJobDataTtlResponse> getSetDataTtlMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.jobs.DSPJS.SetProjectJobDataTtlRequest, yandex.cloud.api.datasphere.v2.jobs.DSPJS.SetProjectJobDataTtlResponse> getSetDataTtlMethod;
    if ((getSetDataTtlMethod = ProjectJobServiceGrpc.getSetDataTtlMethod) == null) {
      synchronized (ProjectJobServiceGrpc.class) {
        if ((getSetDataTtlMethod = ProjectJobServiceGrpc.getSetDataTtlMethod) == null) {
          ProjectJobServiceGrpc.getSetDataTtlMethod = getSetDataTtlMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.datasphere.v2.jobs.DSPJS.SetProjectJobDataTtlRequest, yandex.cloud.api.datasphere.v2.jobs.DSPJS.SetProjectJobDataTtlResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetDataTtl"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datasphere.v2.jobs.DSPJS.SetProjectJobDataTtlRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datasphere.v2.jobs.DSPJS.SetProjectJobDataTtlResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectJobServiceMethodDescriptorSupplier("SetDataTtl"))
              .build();
        }
      }
    }
    return getSetDataTtlMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProjectJobServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProjectJobServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProjectJobServiceStub>() {
        @java.lang.Override
        public ProjectJobServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProjectJobServiceStub(channel, callOptions);
        }
      };
    return ProjectJobServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProjectJobServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProjectJobServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProjectJobServiceBlockingStub>() {
        @java.lang.Override
        public ProjectJobServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProjectJobServiceBlockingStub(channel, callOptions);
        }
      };
    return ProjectJobServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProjectJobServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProjectJobServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProjectJobServiceFutureStub>() {
        @java.lang.Override
        public ProjectJobServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProjectJobServiceFutureStub(channel, callOptions);
        }
      };
    return ProjectJobServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing Project Jobs. Do not use these methods manually.
   * For working with DataSphere Jobs, install DataSphere CLI via `pip install datasphere`.
   * </pre>
   */
  public static abstract class ProjectJobServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Creates job.
     * </pre>
     */
    public void create(yandex.cloud.api.datasphere.v2.jobs.DSPJS.CreateProjectJobRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Clone job.
     * </pre>
     */
    public void clone(yandex.cloud.api.datasphere.v2.jobs.DSPJS.CloneProjectJobRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCloneMethod(), responseObserver);
    }

    /**
     * <pre>
     * Runs job execution.
     * </pre>
     */
    public void execute(yandex.cloud.api.datasphere.v2.jobs.DSPJS.ExecuteProjectJobRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExecuteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Cancels running job.
     * </pre>
     */
    public void cancel(yandex.cloud.api.datasphere.v2.jobs.DSPJS.CancelProjectJobRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns stream of job logs.
     * </pre>
     */
    @java.lang.Deprecated
    public void readStdLogs(yandex.cloud.api.datasphere.v2.jobs.DSPJS.ReadProjectJobStdLogsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.datasphere.v2.jobs.DSPJS.ReadProjectJobStdLogsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReadStdLogsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns stream of job logs.
     * </pre>
     */
    public void readLogs(yandex.cloud.api.datasphere.v2.jobs.DSPJS.ReadProjectJobLogsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.datasphere.v2.jobs.DSPJS.ReadProjectJobLogsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReadLogsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns download urls for job files.
     * </pre>
     */
    public void downloadJobFiles(yandex.cloud.api.datasphere.v2.jobs.DSPJS.DownloadProjectJobFilesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.datasphere.v2.jobs.DSPJS.DownloadProjectJobFilesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDownloadJobFilesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists jobs.
     * </pre>
     */
    public void list(yandex.cloud.api.datasphere.v2.jobs.DSPJS.ListProjectJobRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.datasphere.v2.jobs.DSPJS.ListProjectJobResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns job by id.
     * </pre>
     */
    public void get(yandex.cloud.api.datasphere.v2.jobs.DSPJS.GetProjectJobRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.datasphere.v2.jobs.Jobs.Job> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes specified job.
     * </pre>
     */
    public void delete(yandex.cloud.api.datasphere.v2.jobs.DSPJS.DeleteProjectJobRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete job data.
     * </pre>
     */
    public void deleteData(yandex.cloud.api.datasphere.v2.jobs.DSPJS.DeleteProjectJobDataRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteDataMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete all jobs data.
     * </pre>
     */
    public void deleteAllData(yandex.cloud.api.datasphere.v2.jobs.DSPJS.DeleteAllProjectJobDataRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAllDataMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update job data ttl.
     * </pre>
     */
    public void setDataTtl(yandex.cloud.api.datasphere.v2.jobs.DSPJS.SetProjectJobDataTtlRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.datasphere.v2.jobs.DSPJS.SetProjectJobDataTtlResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetDataTtlMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.datasphere.v2.jobs.DSPJS.CreateProjectJobRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getCloneMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.datasphere.v2.jobs.DSPJS.CloneProjectJobRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CLONE)))
          .addMethod(
            getExecuteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.datasphere.v2.jobs.DSPJS.ExecuteProjectJobRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_EXECUTE)))
          .addMethod(
            getCancelMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.datasphere.v2.jobs.DSPJS.CancelProjectJobRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_CANCEL)))
          .addMethod(
            getReadStdLogsMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                yandex.cloud.api.datasphere.v2.jobs.DSPJS.ReadProjectJobStdLogsRequest,
                yandex.cloud.api.datasphere.v2.jobs.DSPJS.ReadProjectJobStdLogsResponse>(
                  this, METHODID_READ_STD_LOGS)))
          .addMethod(
            getReadLogsMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                yandex.cloud.api.datasphere.v2.jobs.DSPJS.ReadProjectJobLogsRequest,
                yandex.cloud.api.datasphere.v2.jobs.DSPJS.ReadProjectJobLogsResponse>(
                  this, METHODID_READ_LOGS)))
          .addMethod(
            getDownloadJobFilesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.datasphere.v2.jobs.DSPJS.DownloadProjectJobFilesRequest,
                yandex.cloud.api.datasphere.v2.jobs.DSPJS.DownloadProjectJobFilesResponse>(
                  this, METHODID_DOWNLOAD_JOB_FILES)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.datasphere.v2.jobs.DSPJS.ListProjectJobRequest,
                yandex.cloud.api.datasphere.v2.jobs.DSPJS.ListProjectJobResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.datasphere.v2.jobs.DSPJS.GetProjectJobRequest,
                yandex.cloud.api.datasphere.v2.jobs.Jobs.Job>(
                  this, METHODID_GET)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.datasphere.v2.jobs.DSPJS.DeleteProjectJobRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getDeleteDataMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.datasphere.v2.jobs.DSPJS.DeleteProjectJobDataRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE_DATA)))
          .addMethod(
            getDeleteAllDataMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.datasphere.v2.jobs.DSPJS.DeleteAllProjectJobDataRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE_ALL_DATA)))
          .addMethod(
            getSetDataTtlMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.datasphere.v2.jobs.DSPJS.SetProjectJobDataTtlRequest,
                yandex.cloud.api.datasphere.v2.jobs.DSPJS.SetProjectJobDataTtlResponse>(
                  this, METHODID_SET_DATA_TTL)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing Project Jobs. Do not use these methods manually.
   * For working with DataSphere Jobs, install DataSphere CLI via `pip install datasphere`.
   * </pre>
   */
  public static final class ProjectJobServiceStub extends io.grpc.stub.AbstractAsyncStub<ProjectJobServiceStub> {
    private ProjectJobServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProjectJobServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProjectJobServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates job.
     * </pre>
     */
    public void create(yandex.cloud.api.datasphere.v2.jobs.DSPJS.CreateProjectJobRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Clone job.
     * </pre>
     */
    public void clone(yandex.cloud.api.datasphere.v2.jobs.DSPJS.CloneProjectJobRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCloneMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Runs job execution.
     * </pre>
     */
    public void execute(yandex.cloud.api.datasphere.v2.jobs.DSPJS.ExecuteProjectJobRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExecuteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Cancels running job.
     * </pre>
     */
    public void cancel(yandex.cloud.api.datasphere.v2.jobs.DSPJS.CancelProjectJobRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns stream of job logs.
     * </pre>
     */
    @java.lang.Deprecated
    public void readStdLogs(yandex.cloud.api.datasphere.v2.jobs.DSPJS.ReadProjectJobStdLogsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.datasphere.v2.jobs.DSPJS.ReadProjectJobStdLogsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getReadStdLogsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns stream of job logs.
     * </pre>
     */
    public void readLogs(yandex.cloud.api.datasphere.v2.jobs.DSPJS.ReadProjectJobLogsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.datasphere.v2.jobs.DSPJS.ReadProjectJobLogsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getReadLogsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns download urls for job files.
     * </pre>
     */
    public void downloadJobFiles(yandex.cloud.api.datasphere.v2.jobs.DSPJS.DownloadProjectJobFilesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.datasphere.v2.jobs.DSPJS.DownloadProjectJobFilesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDownloadJobFilesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists jobs.
     * </pre>
     */
    public void list(yandex.cloud.api.datasphere.v2.jobs.DSPJS.ListProjectJobRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.datasphere.v2.jobs.DSPJS.ListProjectJobResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns job by id.
     * </pre>
     */
    public void get(yandex.cloud.api.datasphere.v2.jobs.DSPJS.GetProjectJobRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.datasphere.v2.jobs.Jobs.Job> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes specified job.
     * </pre>
     */
    public void delete(yandex.cloud.api.datasphere.v2.jobs.DSPJS.DeleteProjectJobRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete job data.
     * </pre>
     */
    public void deleteData(yandex.cloud.api.datasphere.v2.jobs.DSPJS.DeleteProjectJobDataRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete all jobs data.
     * </pre>
     */
    public void deleteAllData(yandex.cloud.api.datasphere.v2.jobs.DSPJS.DeleteAllProjectJobDataRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAllDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update job data ttl.
     * </pre>
     */
    public void setDataTtl(yandex.cloud.api.datasphere.v2.jobs.DSPJS.SetProjectJobDataTtlRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.datasphere.v2.jobs.DSPJS.SetProjectJobDataTtlResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetDataTtlMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Project Jobs. Do not use these methods manually.
   * For working with DataSphere Jobs, install DataSphere CLI via `pip install datasphere`.
   * </pre>
   */
  public static final class ProjectJobServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ProjectJobServiceBlockingStub> {
    private ProjectJobServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProjectJobServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProjectJobServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates job.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.datasphere.v2.jobs.DSPJS.CreateProjectJobRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Clone job.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation clone(yandex.cloud.api.datasphere.v2.jobs.DSPJS.CloneProjectJobRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCloneMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Runs job execution.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation execute(yandex.cloud.api.datasphere.v2.jobs.DSPJS.ExecuteProjectJobRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExecuteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Cancels running job.
     * </pre>
     */
    public com.google.protobuf.Empty cancel(yandex.cloud.api.datasphere.v2.jobs.DSPJS.CancelProjectJobRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns stream of job logs.
     * </pre>
     */
    @java.lang.Deprecated
    public java.util.Iterator<yandex.cloud.api.datasphere.v2.jobs.DSPJS.ReadProjectJobStdLogsResponse> readStdLogs(
        yandex.cloud.api.datasphere.v2.jobs.DSPJS.ReadProjectJobStdLogsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getReadStdLogsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns stream of job logs.
     * </pre>
     */
    public java.util.Iterator<yandex.cloud.api.datasphere.v2.jobs.DSPJS.ReadProjectJobLogsResponse> readLogs(
        yandex.cloud.api.datasphere.v2.jobs.DSPJS.ReadProjectJobLogsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getReadLogsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns download urls for job files.
     * </pre>
     */
    public yandex.cloud.api.datasphere.v2.jobs.DSPJS.DownloadProjectJobFilesResponse downloadJobFiles(yandex.cloud.api.datasphere.v2.jobs.DSPJS.DownloadProjectJobFilesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDownloadJobFilesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists jobs.
     * </pre>
     */
    public yandex.cloud.api.datasphere.v2.jobs.DSPJS.ListProjectJobResponse list(yandex.cloud.api.datasphere.v2.jobs.DSPJS.ListProjectJobRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns job by id.
     * </pre>
     */
    public yandex.cloud.api.datasphere.v2.jobs.Jobs.Job get(yandex.cloud.api.datasphere.v2.jobs.DSPJS.GetProjectJobRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes specified job.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.datasphere.v2.jobs.DSPJS.DeleteProjectJobRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete job data.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation deleteData(yandex.cloud.api.datasphere.v2.jobs.DSPJS.DeleteProjectJobDataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteDataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete all jobs data.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation deleteAllData(yandex.cloud.api.datasphere.v2.jobs.DSPJS.DeleteAllProjectJobDataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAllDataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update job data ttl.
     * </pre>
     */
    public yandex.cloud.api.datasphere.v2.jobs.DSPJS.SetProjectJobDataTtlResponse setDataTtl(yandex.cloud.api.datasphere.v2.jobs.DSPJS.SetProjectJobDataTtlRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetDataTtlMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Project Jobs. Do not use these methods manually.
   * For working with DataSphere Jobs, install DataSphere CLI via `pip install datasphere`.
   * </pre>
   */
  public static final class ProjectJobServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ProjectJobServiceFutureStub> {
    private ProjectJobServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProjectJobServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProjectJobServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates job.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.datasphere.v2.jobs.DSPJS.CreateProjectJobRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Clone job.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> clone(
        yandex.cloud.api.datasphere.v2.jobs.DSPJS.CloneProjectJobRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCloneMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Runs job execution.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> execute(
        yandex.cloud.api.datasphere.v2.jobs.DSPJS.ExecuteProjectJobRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExecuteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Cancels running job.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> cancel(
        yandex.cloud.api.datasphere.v2.jobs.DSPJS.CancelProjectJobRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns download urls for job files.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.datasphere.v2.jobs.DSPJS.DownloadProjectJobFilesResponse> downloadJobFiles(
        yandex.cloud.api.datasphere.v2.jobs.DSPJS.DownloadProjectJobFilesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDownloadJobFilesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists jobs.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.datasphere.v2.jobs.DSPJS.ListProjectJobResponse> list(
        yandex.cloud.api.datasphere.v2.jobs.DSPJS.ListProjectJobRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns job by id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.datasphere.v2.jobs.Jobs.Job> get(
        yandex.cloud.api.datasphere.v2.jobs.DSPJS.GetProjectJobRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes specified job.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.datasphere.v2.jobs.DSPJS.DeleteProjectJobRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete job data.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> deleteData(
        yandex.cloud.api.datasphere.v2.jobs.DSPJS.DeleteProjectJobDataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteDataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete all jobs data.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> deleteAllData(
        yandex.cloud.api.datasphere.v2.jobs.DSPJS.DeleteAllProjectJobDataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAllDataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update job data ttl.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.datasphere.v2.jobs.DSPJS.SetProjectJobDataTtlResponse> setDataTtl(
        yandex.cloud.api.datasphere.v2.jobs.DSPJS.SetProjectJobDataTtlRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetDataTtlMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_CLONE = 1;
  private static final int METHODID_EXECUTE = 2;
  private static final int METHODID_CANCEL = 3;
  private static final int METHODID_READ_STD_LOGS = 4;
  private static final int METHODID_READ_LOGS = 5;
  private static final int METHODID_DOWNLOAD_JOB_FILES = 6;
  private static final int METHODID_LIST = 7;
  private static final int METHODID_GET = 8;
  private static final int METHODID_DELETE = 9;
  private static final int METHODID_DELETE_DATA = 10;
  private static final int METHODID_DELETE_ALL_DATA = 11;
  private static final int METHODID_SET_DATA_TTL = 12;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProjectJobServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProjectJobServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.datasphere.v2.jobs.DSPJS.CreateProjectJobRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_CLONE:
          serviceImpl.clone((yandex.cloud.api.datasphere.v2.jobs.DSPJS.CloneProjectJobRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_EXECUTE:
          serviceImpl.execute((yandex.cloud.api.datasphere.v2.jobs.DSPJS.ExecuteProjectJobRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_CANCEL:
          serviceImpl.cancel((yandex.cloud.api.datasphere.v2.jobs.DSPJS.CancelProjectJobRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_READ_STD_LOGS:
          serviceImpl.readStdLogs((yandex.cloud.api.datasphere.v2.jobs.DSPJS.ReadProjectJobStdLogsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.datasphere.v2.jobs.DSPJS.ReadProjectJobStdLogsResponse>) responseObserver);
          break;
        case METHODID_READ_LOGS:
          serviceImpl.readLogs((yandex.cloud.api.datasphere.v2.jobs.DSPJS.ReadProjectJobLogsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.datasphere.v2.jobs.DSPJS.ReadProjectJobLogsResponse>) responseObserver);
          break;
        case METHODID_DOWNLOAD_JOB_FILES:
          serviceImpl.downloadJobFiles((yandex.cloud.api.datasphere.v2.jobs.DSPJS.DownloadProjectJobFilesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.datasphere.v2.jobs.DSPJS.DownloadProjectJobFilesResponse>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.datasphere.v2.jobs.DSPJS.ListProjectJobRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.datasphere.v2.jobs.DSPJS.ListProjectJobResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.datasphere.v2.jobs.DSPJS.GetProjectJobRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.datasphere.v2.jobs.Jobs.Job>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.datasphere.v2.jobs.DSPJS.DeleteProjectJobRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE_DATA:
          serviceImpl.deleteData((yandex.cloud.api.datasphere.v2.jobs.DSPJS.DeleteProjectJobDataRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE_ALL_DATA:
          serviceImpl.deleteAllData((yandex.cloud.api.datasphere.v2.jobs.DSPJS.DeleteAllProjectJobDataRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_SET_DATA_TTL:
          serviceImpl.setDataTtl((yandex.cloud.api.datasphere.v2.jobs.DSPJS.SetProjectJobDataTtlRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.datasphere.v2.jobs.DSPJS.SetProjectJobDataTtlResponse>) responseObserver);
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

  private static abstract class ProjectJobServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProjectJobServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.datasphere.v2.jobs.DSPJS.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProjectJobService");
    }
  }

  private static final class ProjectJobServiceFileDescriptorSupplier
      extends ProjectJobServiceBaseDescriptorSupplier {
    ProjectJobServiceFileDescriptorSupplier() {}
  }

  private static final class ProjectJobServiceMethodDescriptorSupplier
      extends ProjectJobServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProjectJobServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ProjectJobServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProjectJobServiceFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getCloneMethod())
              .addMethod(getExecuteMethod())
              .addMethod(getCancelMethod())
              .addMethod(getReadStdLogsMethod())
              .addMethod(getReadLogsMethod())
              .addMethod(getDownloadJobFilesMethod())
              .addMethod(getListMethod())
              .addMethod(getGetMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getDeleteDataMethod())
              .addMethod(getDeleteAllDataMethod())
              .addMethod(getSetDataTtlMethod())
              .build();
        }
      }
    }
    return result;
  }
}
