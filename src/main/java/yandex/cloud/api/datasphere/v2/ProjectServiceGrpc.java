package yandex.cloud.api.datasphere.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing Project resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/datasphere/v2/project_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ProjectServiceGrpc {

  private ProjectServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.datasphere.v2.ProjectService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.CreateProjectRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.CreateProjectRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.CreateProjectRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.CreateProjectRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = ProjectServiceGrpc.getCreateMethod) == null) {
      synchronized (ProjectServiceGrpc.class) {
        if ((getCreateMethod = ProjectServiceGrpc.getCreateMethod) == null) {
          ProjectServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.CreateProjectRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.CreateProjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.UpdateProjectRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.UpdateProjectRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.UpdateProjectRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.UpdateProjectRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = ProjectServiceGrpc.getUpdateMethod) == null) {
      synchronized (ProjectServiceGrpc.class) {
        if ((getUpdateMethod = ProjectServiceGrpc.getUpdateMethod) == null) {
          ProjectServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.UpdateProjectRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.UpdateProjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.DeleteProjectRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.DeleteProjectRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.DeleteProjectRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.DeleteProjectRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = ProjectServiceGrpc.getDeleteMethod) == null) {
      synchronized (ProjectServiceGrpc.class) {
        if ((getDeleteMethod = ProjectServiceGrpc.getDeleteMethod) == null) {
          ProjectServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.DeleteProjectRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.DeleteProjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.OpenProjectRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getOpenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Open",
      requestType = yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.OpenProjectRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.OpenProjectRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getOpenMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.OpenProjectRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getOpenMethod;
    if ((getOpenMethod = ProjectServiceGrpc.getOpenMethod) == null) {
      synchronized (ProjectServiceGrpc.class) {
        if ((getOpenMethod = ProjectServiceGrpc.getOpenMethod) == null) {
          ProjectServiceGrpc.getOpenMethod = getOpenMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.OpenProjectRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Open"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.OpenProjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectServiceMethodDescriptorSupplier("Open"))
              .build();
        }
      }
    }
    return getOpenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.GetProjectRequest,
      yandex.cloud.api.datasphere.v2.ProjectOuterClass.Project> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.GetProjectRequest.class,
      responseType = yandex.cloud.api.datasphere.v2.ProjectOuterClass.Project.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.GetProjectRequest,
      yandex.cloud.api.datasphere.v2.ProjectOuterClass.Project> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.GetProjectRequest, yandex.cloud.api.datasphere.v2.ProjectOuterClass.Project> getGetMethod;
    if ((getGetMethod = ProjectServiceGrpc.getGetMethod) == null) {
      synchronized (ProjectServiceGrpc.class) {
        if ((getGetMethod = ProjectServiceGrpc.getGetMethod) == null) {
          ProjectServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.GetProjectRequest, yandex.cloud.api.datasphere.v2.ProjectOuterClass.Project>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.GetProjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datasphere.v2.ProjectOuterClass.Project.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.ListProjectsRequest,
      yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.ListProjectsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.ListProjectsRequest.class,
      responseType = yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.ListProjectsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.ListProjectsRequest,
      yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.ListProjectsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.ListProjectsRequest, yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.ListProjectsResponse> getListMethod;
    if ((getListMethod = ProjectServiceGrpc.getListMethod) == null) {
      synchronized (ProjectServiceGrpc.class) {
        if ((getListMethod = ProjectServiceGrpc.getListMethod) == null) {
          ProjectServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.ListProjectsRequest, yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.ListProjectsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.ListProjectsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.ListProjectsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.GetUnitBalanceRequest,
      yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.GetUnitBalanceResponse> getGetUnitBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUnitBalance",
      requestType = yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.GetUnitBalanceRequest.class,
      responseType = yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.GetUnitBalanceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.GetUnitBalanceRequest,
      yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.GetUnitBalanceResponse> getGetUnitBalanceMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.GetUnitBalanceRequest, yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.GetUnitBalanceResponse> getGetUnitBalanceMethod;
    if ((getGetUnitBalanceMethod = ProjectServiceGrpc.getGetUnitBalanceMethod) == null) {
      synchronized (ProjectServiceGrpc.class) {
        if ((getGetUnitBalanceMethod = ProjectServiceGrpc.getGetUnitBalanceMethod) == null) {
          ProjectServiceGrpc.getGetUnitBalanceMethod = getGetUnitBalanceMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.GetUnitBalanceRequest, yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.GetUnitBalanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUnitBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.GetUnitBalanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.GetUnitBalanceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectServiceMethodDescriptorSupplier("GetUnitBalance"))
              .build();
        }
      }
    }
    return getGetUnitBalanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.SetUnitBalanceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getSetUnitBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetUnitBalance",
      requestType = yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.SetUnitBalanceRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.SetUnitBalanceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getSetUnitBalanceMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.SetUnitBalanceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getSetUnitBalanceMethod;
    if ((getSetUnitBalanceMethod = ProjectServiceGrpc.getSetUnitBalanceMethod) == null) {
      synchronized (ProjectServiceGrpc.class) {
        if ((getSetUnitBalanceMethod = ProjectServiceGrpc.getSetUnitBalanceMethod) == null) {
          ProjectServiceGrpc.getSetUnitBalanceMethod = getSetUnitBalanceMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.SetUnitBalanceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetUnitBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.SetUnitBalanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectServiceMethodDescriptorSupplier("SetUnitBalance"))
              .build();
        }
      }
    }
    return getSetUnitBalanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.ProjectExecutionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getExecuteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Execute",
      requestType = yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.ProjectExecutionRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.ProjectExecutionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getExecuteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.ProjectExecutionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getExecuteMethod;
    if ((getExecuteMethod = ProjectServiceGrpc.getExecuteMethod) == null) {
      synchronized (ProjectServiceGrpc.class) {
        if ((getExecuteMethod = ProjectServiceGrpc.getExecuteMethod) == null) {
          ProjectServiceGrpc.getExecuteMethod = getExecuteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.ProjectExecutionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Execute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.ProjectExecutionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectServiceMethodDescriptorSupplier("Execute"))
              .build();
        }
      }
    }
    return getExecuteMethod;
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
    if ((getListAccessBindingsMethod = ProjectServiceGrpc.getListAccessBindingsMethod) == null) {
      synchronized (ProjectServiceGrpc.class) {
        if ((getListAccessBindingsMethod = ProjectServiceGrpc.getListAccessBindingsMethod) == null) {
          ProjectServiceGrpc.getListAccessBindingsMethod = getListAccessBindingsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.ListAccessBindingsRequest, yandex.cloud.api.access.Access.ListAccessBindingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.ListAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.ListAccessBindingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectServiceMethodDescriptorSupplier("ListAccessBindings"))
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
    if ((getSetAccessBindingsMethod = ProjectServiceGrpc.getSetAccessBindingsMethod) == null) {
      synchronized (ProjectServiceGrpc.class) {
        if ((getSetAccessBindingsMethod = ProjectServiceGrpc.getSetAccessBindingsMethod) == null) {
          ProjectServiceGrpc.getSetAccessBindingsMethod = getSetAccessBindingsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.SetAccessBindingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.SetAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectServiceMethodDescriptorSupplier("SetAccessBindings"))
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
    if ((getUpdateAccessBindingsMethod = ProjectServiceGrpc.getUpdateAccessBindingsMethod) == null) {
      synchronized (ProjectServiceGrpc.class) {
        if ((getUpdateAccessBindingsMethod = ProjectServiceGrpc.getUpdateAccessBindingsMethod) == null) {
          ProjectServiceGrpc.getUpdateAccessBindingsMethod = getUpdateAccessBindingsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.UpdateAccessBindingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.UpdateAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectServiceMethodDescriptorSupplier("UpdateAccessBindings"))
              .build();
        }
      }
    }
    return getUpdateAccessBindingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.AddResourceToProjectRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getAddResourceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddResource",
      requestType = yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.AddResourceToProjectRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.AddResourceToProjectRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getAddResourceMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.AddResourceToProjectRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getAddResourceMethod;
    if ((getAddResourceMethod = ProjectServiceGrpc.getAddResourceMethod) == null) {
      synchronized (ProjectServiceGrpc.class) {
        if ((getAddResourceMethod = ProjectServiceGrpc.getAddResourceMethod) == null) {
          ProjectServiceGrpc.getAddResourceMethod = getAddResourceMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.AddResourceToProjectRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddResource"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.AddResourceToProjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectServiceMethodDescriptorSupplier("AddResource"))
              .build();
        }
      }
    }
    return getAddResourceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.RemoveResourceFromProjectRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRemoveResourceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveResource",
      requestType = yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.RemoveResourceFromProjectRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.RemoveResourceFromProjectRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRemoveResourceMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.RemoveResourceFromProjectRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getRemoveResourceMethod;
    if ((getRemoveResourceMethod = ProjectServiceGrpc.getRemoveResourceMethod) == null) {
      synchronized (ProjectServiceGrpc.class) {
        if ((getRemoveResourceMethod = ProjectServiceGrpc.getRemoveResourceMethod) == null) {
          ProjectServiceGrpc.getRemoveResourceMethod = getRemoveResourceMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.RemoveResourceFromProjectRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveResource"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.RemoveResourceFromProjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectServiceMethodDescriptorSupplier("RemoveResource"))
              .build();
        }
      }
    }
    return getRemoveResourceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.ResizeProjectDiskRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getResizeDiskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResizeDisk",
      requestType = yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.ResizeProjectDiskRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.ResizeProjectDiskRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getResizeDiskMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.ResizeProjectDiskRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getResizeDiskMethod;
    if ((getResizeDiskMethod = ProjectServiceGrpc.getResizeDiskMethod) == null) {
      synchronized (ProjectServiceGrpc.class) {
        if ((getResizeDiskMethod = ProjectServiceGrpc.getResizeDiskMethod) == null) {
          ProjectServiceGrpc.getResizeDiskMethod = getResizeDiskMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.ResizeProjectDiskRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResizeDisk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.ResizeProjectDiskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectServiceMethodDescriptorSupplier("ResizeDisk"))
              .build();
        }
      }
    }
    return getResizeDiskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      yandex.cloud.api.datasphere.v2.Restrictions.GetRestrictionsMetaResponse> getGetRestrictionsMetaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRestrictionsMeta",
      requestType = com.google.protobuf.Empty.class,
      responseType = yandex.cloud.api.datasphere.v2.Restrictions.GetRestrictionsMetaResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      yandex.cloud.api.datasphere.v2.Restrictions.GetRestrictionsMetaResponse> getGetRestrictionsMetaMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, yandex.cloud.api.datasphere.v2.Restrictions.GetRestrictionsMetaResponse> getGetRestrictionsMetaMethod;
    if ((getGetRestrictionsMetaMethod = ProjectServiceGrpc.getGetRestrictionsMetaMethod) == null) {
      synchronized (ProjectServiceGrpc.class) {
        if ((getGetRestrictionsMetaMethod = ProjectServiceGrpc.getGetRestrictionsMetaMethod) == null) {
          ProjectServiceGrpc.getGetRestrictionsMetaMethod = getGetRestrictionsMetaMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, yandex.cloud.api.datasphere.v2.Restrictions.GetRestrictionsMetaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRestrictionsMeta"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datasphere.v2.Restrictions.GetRestrictionsMetaResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectServiceMethodDescriptorSupplier("GetRestrictionsMeta"))
              .build();
        }
      }
    }
    return getGetRestrictionsMetaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.GetProjectRestrictionsRequest,
      yandex.cloud.api.datasphere.v2.Restrictions.RestrictionsResponse> getGetRestrictionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRestrictions",
      requestType = yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.GetProjectRestrictionsRequest.class,
      responseType = yandex.cloud.api.datasphere.v2.Restrictions.RestrictionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.GetProjectRestrictionsRequest,
      yandex.cloud.api.datasphere.v2.Restrictions.RestrictionsResponse> getGetRestrictionsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.GetProjectRestrictionsRequest, yandex.cloud.api.datasphere.v2.Restrictions.RestrictionsResponse> getGetRestrictionsMethod;
    if ((getGetRestrictionsMethod = ProjectServiceGrpc.getGetRestrictionsMethod) == null) {
      synchronized (ProjectServiceGrpc.class) {
        if ((getGetRestrictionsMethod = ProjectServiceGrpc.getGetRestrictionsMethod) == null) {
          ProjectServiceGrpc.getGetRestrictionsMethod = getGetRestrictionsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.GetProjectRestrictionsRequest, yandex.cloud.api.datasphere.v2.Restrictions.RestrictionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRestrictions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.GetProjectRestrictionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datasphere.v2.Restrictions.RestrictionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectServiceMethodDescriptorSupplier("GetRestrictions"))
              .build();
        }
      }
    }
    return getGetRestrictionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.SetProjectRestrictionsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getSetRestrictionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetRestrictions",
      requestType = yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.SetProjectRestrictionsRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.SetProjectRestrictionsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getSetRestrictionsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.SetProjectRestrictionsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getSetRestrictionsMethod;
    if ((getSetRestrictionsMethod = ProjectServiceGrpc.getSetRestrictionsMethod) == null) {
      synchronized (ProjectServiceGrpc.class) {
        if ((getSetRestrictionsMethod = ProjectServiceGrpc.getSetRestrictionsMethod) == null) {
          ProjectServiceGrpc.getSetRestrictionsMethod = getSetRestrictionsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.SetProjectRestrictionsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetRestrictions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.SetProjectRestrictionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectServiceMethodDescriptorSupplier("SetRestrictions"))
              .build();
        }
      }
    }
    return getSetRestrictionsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProjectServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProjectServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProjectServiceStub>() {
        @java.lang.Override
        public ProjectServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProjectServiceStub(channel, callOptions);
        }
      };
    return ProjectServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProjectServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProjectServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProjectServiceBlockingStub>() {
        @java.lang.Override
        public ProjectServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProjectServiceBlockingStub(channel, callOptions);
        }
      };
    return ProjectServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProjectServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProjectServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProjectServiceFutureStub>() {
        @java.lang.Override
        public ProjectServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProjectServiceFutureStub(channel, callOptions);
        }
      };
    return ProjectServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing Project resources.
   * </pre>
   */
  public static abstract class ProjectServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Creates a project in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.CreateProjectRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified project.
     * </pre>
     */
    public void update(yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.UpdateProjectRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified project.
     * </pre>
     */
    public void delete(yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.DeleteProjectRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Opens the specified project.
     * </pre>
     */
    public void open(yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.OpenProjectRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOpenMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the specified project.
     * </pre>
     */
    public void get(yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.GetProjectRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.datasphere.v2.ProjectOuterClass.Project> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists projects for the specified community.
     * </pre>
     */
    public void list(yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.ListProjectsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.ListProjectsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the unit balance of the specified project.
     * </pre>
     */
    public void getUnitBalance(yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.GetUnitBalanceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.GetUnitBalanceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUnitBalanceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sets the unit balance of the specified project.
     * </pre>
     */
    public void setUnitBalance(yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.SetUnitBalanceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetUnitBalanceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Executes code of the specified notebook using configuration defined in the project settings. If the default project configuration is not specified, `c1.4` is used.
     * </pre>
     */
    public void execute(yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.ProjectExecutionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExecuteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists access bindings for the project.
     * </pre>
     */
    public void listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.access.Access.ListAccessBindingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAccessBindingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sets access bindings for the project.
     * </pre>
     */
    public void setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetAccessBindingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates access bindings for the project.
     * </pre>
     */
    public void updateAccessBindings(yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAccessBindingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Adds shared resource to project
     * </pre>
     */
    public void addResource(yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.AddResourceToProjectRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddResourceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Removes shared resource from project
     * </pre>
     */
    public void removeResource(yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.RemoveResourceFromProjectRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveResourceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Resizes project disk
     * </pre>
     */
    public void resizeDisk(yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.ResizeProjectDiskRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResizeDiskMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get meta information about available restrictions.
     * </pre>
     */
    public void getRestrictionsMeta(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.datasphere.v2.Restrictions.GetRestrictionsMetaResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRestrictionsMetaMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get current project restrictions.
     * </pre>
     */
    public void getRestrictions(yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.GetProjectRestrictionsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.datasphere.v2.Restrictions.RestrictionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRestrictionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set project restrictions.
     * </pre>
     */
    public void setRestrictions(yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.SetProjectRestrictionsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetRestrictionsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.CreateProjectRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.UpdateProjectRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.DeleteProjectRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getOpenMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.OpenProjectRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_OPEN)))
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.GetProjectRequest,
                yandex.cloud.api.datasphere.v2.ProjectOuterClass.Project>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.ListProjectsRequest,
                yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.ListProjectsResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getGetUnitBalanceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.GetUnitBalanceRequest,
                yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.GetUnitBalanceResponse>(
                  this, METHODID_GET_UNIT_BALANCE)))
          .addMethod(
            getSetUnitBalanceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.SetUnitBalanceRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_SET_UNIT_BALANCE)))
          .addMethod(
            getExecuteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.ProjectExecutionRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_EXECUTE)))
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
          .addMethod(
            getAddResourceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.AddResourceToProjectRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_ADD_RESOURCE)))
          .addMethod(
            getRemoveResourceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.RemoveResourceFromProjectRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_REMOVE_RESOURCE)))
          .addMethod(
            getResizeDiskMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.ResizeProjectDiskRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_RESIZE_DISK)))
          .addMethod(
            getGetRestrictionsMetaMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                yandex.cloud.api.datasphere.v2.Restrictions.GetRestrictionsMetaResponse>(
                  this, METHODID_GET_RESTRICTIONS_META)))
          .addMethod(
            getGetRestrictionsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.GetProjectRestrictionsRequest,
                yandex.cloud.api.datasphere.v2.Restrictions.RestrictionsResponse>(
                  this, METHODID_GET_RESTRICTIONS)))
          .addMethod(
            getSetRestrictionsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.SetProjectRestrictionsRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_SET_RESTRICTIONS)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing Project resources.
   * </pre>
   */
  public static final class ProjectServiceStub extends io.grpc.stub.AbstractAsyncStub<ProjectServiceStub> {
    private ProjectServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProjectServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProjectServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a project in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.CreateProjectRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified project.
     * </pre>
     */
    public void update(yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.UpdateProjectRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified project.
     * </pre>
     */
    public void delete(yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.DeleteProjectRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Opens the specified project.
     * </pre>
     */
    public void open(yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.OpenProjectRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOpenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the specified project.
     * </pre>
     */
    public void get(yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.GetProjectRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.datasphere.v2.ProjectOuterClass.Project> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists projects for the specified community.
     * </pre>
     */
    public void list(yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.ListProjectsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.ListProjectsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the unit balance of the specified project.
     * </pre>
     */
    public void getUnitBalance(yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.GetUnitBalanceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.GetUnitBalanceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUnitBalanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sets the unit balance of the specified project.
     * </pre>
     */
    public void setUnitBalance(yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.SetUnitBalanceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetUnitBalanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Executes code of the specified notebook using configuration defined in the project settings. If the default project configuration is not specified, `c1.4` is used.
     * </pre>
     */
    public void execute(yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.ProjectExecutionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExecuteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists access bindings for the project.
     * </pre>
     */
    public void listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.access.Access.ListAccessBindingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sets access bindings for the project.
     * </pre>
     */
    public void setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates access bindings for the project.
     * </pre>
     */
    public void updateAccessBindings(yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Adds shared resource to project
     * </pre>
     */
    public void addResource(yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.AddResourceToProjectRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddResourceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Removes shared resource from project
     * </pre>
     */
    public void removeResource(yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.RemoveResourceFromProjectRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveResourceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Resizes project disk
     * </pre>
     */
    public void resizeDisk(yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.ResizeProjectDiskRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResizeDiskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get meta information about available restrictions.
     * </pre>
     */
    public void getRestrictionsMeta(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.datasphere.v2.Restrictions.GetRestrictionsMetaResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRestrictionsMetaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get current project restrictions.
     * </pre>
     */
    public void getRestrictions(yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.GetProjectRestrictionsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.datasphere.v2.Restrictions.RestrictionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRestrictionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set project restrictions.
     * </pre>
     */
    public void setRestrictions(yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.SetProjectRestrictionsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetRestrictionsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Project resources.
   * </pre>
   */
  public static final class ProjectServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ProjectServiceBlockingStub> {
    private ProjectServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProjectServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProjectServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a project in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.CreateProjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified project.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.UpdateProjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified project.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.DeleteProjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Opens the specified project.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation open(yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.OpenProjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOpenMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the specified project.
     * </pre>
     */
    public yandex.cloud.api.datasphere.v2.ProjectOuterClass.Project get(yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.GetProjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists projects for the specified community.
     * </pre>
     */
    public yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.ListProjectsResponse list(yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.ListProjectsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the unit balance of the specified project.
     * </pre>
     */
    public yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.GetUnitBalanceResponse getUnitBalance(yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.GetUnitBalanceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUnitBalanceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets the unit balance of the specified project.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation setUnitBalance(yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.SetUnitBalanceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetUnitBalanceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Executes code of the specified notebook using configuration defined in the project settings. If the default project configuration is not specified, `c1.4` is used.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation execute(yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.ProjectExecutionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExecuteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists access bindings for the project.
     * </pre>
     */
    public yandex.cloud.api.access.Access.ListAccessBindingsResponse listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAccessBindingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets access bindings for the project.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetAccessBindingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates access bindings for the project.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation updateAccessBindings(yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAccessBindingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Adds shared resource to project
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation addResource(yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.AddResourceToProjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddResourceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Removes shared resource from project
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation removeResource(yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.RemoveResourceFromProjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveResourceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Resizes project disk
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation resizeDisk(yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.ResizeProjectDiskRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResizeDiskMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get meta information about available restrictions.
     * </pre>
     */
    public yandex.cloud.api.datasphere.v2.Restrictions.GetRestrictionsMetaResponse getRestrictionsMeta(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRestrictionsMetaMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get current project restrictions.
     * </pre>
     */
    public yandex.cloud.api.datasphere.v2.Restrictions.RestrictionsResponse getRestrictions(yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.GetProjectRestrictionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRestrictionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set project restrictions.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation setRestrictions(yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.SetProjectRestrictionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetRestrictionsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Project resources.
   * </pre>
   */
  public static final class ProjectServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ProjectServiceFutureStub> {
    private ProjectServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProjectServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProjectServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a project in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.CreateProjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified project.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.UpdateProjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified project.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.DeleteProjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Opens the specified project.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> open(
        yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.OpenProjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOpenMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the specified project.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.datasphere.v2.ProjectOuterClass.Project> get(
        yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.GetProjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists projects for the specified community.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.ListProjectsResponse> list(
        yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.ListProjectsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the unit balance of the specified project.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.GetUnitBalanceResponse> getUnitBalance(
        yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.GetUnitBalanceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUnitBalanceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sets the unit balance of the specified project.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> setUnitBalance(
        yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.SetUnitBalanceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetUnitBalanceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Executes code of the specified notebook using configuration defined in the project settings. If the default project configuration is not specified, `c1.4` is used.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> execute(
        yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.ProjectExecutionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExecuteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists access bindings for the project.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.access.Access.ListAccessBindingsResponse> listAccessBindings(
        yandex.cloud.api.access.Access.ListAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAccessBindingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sets access bindings for the project.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> setAccessBindings(
        yandex.cloud.api.access.Access.SetAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetAccessBindingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates access bindings for the project.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> updateAccessBindings(
        yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAccessBindingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Adds shared resource to project
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> addResource(
        yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.AddResourceToProjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddResourceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Removes shared resource from project
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> removeResource(
        yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.RemoveResourceFromProjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveResourceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Resizes project disk
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> resizeDisk(
        yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.ResizeProjectDiskRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResizeDiskMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get meta information about available restrictions.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.datasphere.v2.Restrictions.GetRestrictionsMetaResponse> getRestrictionsMeta(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRestrictionsMetaMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get current project restrictions.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.datasphere.v2.Restrictions.RestrictionsResponse> getRestrictions(
        yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.GetProjectRestrictionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRestrictionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set project restrictions.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> setRestrictions(
        yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.SetProjectRestrictionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetRestrictionsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_UPDATE = 1;
  private static final int METHODID_DELETE = 2;
  private static final int METHODID_OPEN = 3;
  private static final int METHODID_GET = 4;
  private static final int METHODID_LIST = 5;
  private static final int METHODID_GET_UNIT_BALANCE = 6;
  private static final int METHODID_SET_UNIT_BALANCE = 7;
  private static final int METHODID_EXECUTE = 8;
  private static final int METHODID_LIST_ACCESS_BINDINGS = 9;
  private static final int METHODID_SET_ACCESS_BINDINGS = 10;
  private static final int METHODID_UPDATE_ACCESS_BINDINGS = 11;
  private static final int METHODID_ADD_RESOURCE = 12;
  private static final int METHODID_REMOVE_RESOURCE = 13;
  private static final int METHODID_RESIZE_DISK = 14;
  private static final int METHODID_GET_RESTRICTIONS_META = 15;
  private static final int METHODID_GET_RESTRICTIONS = 16;
  private static final int METHODID_SET_RESTRICTIONS = 17;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProjectServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProjectServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.CreateProjectRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.UpdateProjectRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.DeleteProjectRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_OPEN:
          serviceImpl.open((yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.OpenProjectRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.GetProjectRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.datasphere.v2.ProjectOuterClass.Project>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.ListProjectsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.ListProjectsResponse>) responseObserver);
          break;
        case METHODID_GET_UNIT_BALANCE:
          serviceImpl.getUnitBalance((yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.GetUnitBalanceRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.GetUnitBalanceResponse>) responseObserver);
          break;
        case METHODID_SET_UNIT_BALANCE:
          serviceImpl.setUnitBalance((yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.SetUnitBalanceRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_EXECUTE:
          serviceImpl.execute((yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.ProjectExecutionRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
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
        case METHODID_ADD_RESOURCE:
          serviceImpl.addResource((yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.AddResourceToProjectRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_REMOVE_RESOURCE:
          serviceImpl.removeResource((yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.RemoveResourceFromProjectRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_RESIZE_DISK:
          serviceImpl.resizeDisk((yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.ResizeProjectDiskRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_GET_RESTRICTIONS_META:
          serviceImpl.getRestrictionsMeta((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.datasphere.v2.Restrictions.GetRestrictionsMetaResponse>) responseObserver);
          break;
        case METHODID_GET_RESTRICTIONS:
          serviceImpl.getRestrictions((yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.GetProjectRestrictionsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.datasphere.v2.Restrictions.RestrictionsResponse>) responseObserver);
          break;
        case METHODID_SET_RESTRICTIONS:
          serviceImpl.setRestrictions((yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.SetProjectRestrictionsRequest) request,
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

  private static abstract class ProjectServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProjectServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.datasphere.v2.ProjectServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProjectService");
    }
  }

  private static final class ProjectServiceFileDescriptorSupplier
      extends ProjectServiceBaseDescriptorSupplier {
    ProjectServiceFileDescriptorSupplier() {}
  }

  private static final class ProjectServiceMethodDescriptorSupplier
      extends ProjectServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProjectServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ProjectServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProjectServiceFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getOpenMethod())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getGetUnitBalanceMethod())
              .addMethod(getSetUnitBalanceMethod())
              .addMethod(getExecuteMethod())
              .addMethod(getListAccessBindingsMethod())
              .addMethod(getSetAccessBindingsMethod())
              .addMethod(getUpdateAccessBindingsMethod())
              .addMethod(getAddResourceMethod())
              .addMethod(getRemoveResourceMethod())
              .addMethod(getResizeDiskMethod())
              .addMethod(getGetRestrictionsMetaMethod())
              .addMethod(getGetRestrictionsMethod())
              .addMethod(getSetRestrictionsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
