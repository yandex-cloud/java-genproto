package yandex.cloud.api.organizationmanager.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing groups.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/organizationmanager/v1/group_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class GroupServiceGrpc {

  private GroupServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.organizationmanager.v1.GroupService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.GetGroupRequest,
      yandex.cloud.api.organizationmanager.v1.GroupOuterClass.Group> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.GetGroupRequest.class,
      responseType = yandex.cloud.api.organizationmanager.v1.GroupOuterClass.Group.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.GetGroupRequest,
      yandex.cloud.api.organizationmanager.v1.GroupOuterClass.Group> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.GetGroupRequest, yandex.cloud.api.organizationmanager.v1.GroupOuterClass.Group> getGetMethod;
    if ((getGetMethod = GroupServiceGrpc.getGetMethod) == null) {
      synchronized (GroupServiceGrpc.class) {
        if ((getGetMethod = GroupServiceGrpc.getGetMethod) == null) {
          GroupServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.GetGroupRequest, yandex.cloud.api.organizationmanager.v1.GroupOuterClass.Group>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.GetGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.GroupOuterClass.Group.getDefaultInstance()))
              .setSchemaDescriptor(new GroupServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ResolveExternalGroupRequest,
      yandex.cloud.api.organizationmanager.v1.GroupOuterClass.Group> getResolveExternalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResolveExternal",
      requestType = yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ResolveExternalGroupRequest.class,
      responseType = yandex.cloud.api.organizationmanager.v1.GroupOuterClass.Group.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ResolveExternalGroupRequest,
      yandex.cloud.api.organizationmanager.v1.GroupOuterClass.Group> getResolveExternalMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ResolveExternalGroupRequest, yandex.cloud.api.organizationmanager.v1.GroupOuterClass.Group> getResolveExternalMethod;
    if ((getResolveExternalMethod = GroupServiceGrpc.getResolveExternalMethod) == null) {
      synchronized (GroupServiceGrpc.class) {
        if ((getResolveExternalMethod = GroupServiceGrpc.getResolveExternalMethod) == null) {
          GroupServiceGrpc.getResolveExternalMethod = getResolveExternalMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ResolveExternalGroupRequest, yandex.cloud.api.organizationmanager.v1.GroupOuterClass.Group>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResolveExternal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ResolveExternalGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.GroupOuterClass.Group.getDefaultInstance()))
              .setSchemaDescriptor(new GroupServiceMethodDescriptorSupplier("ResolveExternal"))
              .build();
        }
      }
    }
    return getResolveExternalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListGroupsRequest,
      yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListGroupsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListGroupsRequest.class,
      responseType = yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListGroupsRequest,
      yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListGroupsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListGroupsRequest, yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListGroupsResponse> getListMethod;
    if ((getListMethod = GroupServiceGrpc.getListMethod) == null) {
      synchronized (GroupServiceGrpc.class) {
        if ((getListMethod = GroupServiceGrpc.getListMethod) == null) {
          GroupServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListGroupsRequest, yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListGroupsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GroupServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListExternalGroupsRequest,
      yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListExternalGroupsResponse> getListExternalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListExternal",
      requestType = yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListExternalGroupsRequest.class,
      responseType = yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListExternalGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListExternalGroupsRequest,
      yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListExternalGroupsResponse> getListExternalMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListExternalGroupsRequest, yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListExternalGroupsResponse> getListExternalMethod;
    if ((getListExternalMethod = GroupServiceGrpc.getListExternalMethod) == null) {
      synchronized (GroupServiceGrpc.class) {
        if ((getListExternalMethod = GroupServiceGrpc.getListExternalMethod) == null) {
          GroupServiceGrpc.getListExternalMethod = getListExternalMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListExternalGroupsRequest, yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListExternalGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListExternal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListExternalGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListExternalGroupsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GroupServiceMethodDescriptorSupplier("ListExternal"))
              .build();
        }
      }
    }
    return getListExternalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.CreateGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.CreateGroupRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.CreateGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.CreateGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = GroupServiceGrpc.getCreateMethod) == null) {
      synchronized (GroupServiceGrpc.class) {
        if ((getCreateMethod = GroupServiceGrpc.getCreateMethod) == null) {
          GroupServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.CreateGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.CreateGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new GroupServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.CreateExternalGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateExternalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateExternal",
      requestType = yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.CreateExternalGroupRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.CreateExternalGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateExternalMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.CreateExternalGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateExternalMethod;
    if ((getCreateExternalMethod = GroupServiceGrpc.getCreateExternalMethod) == null) {
      synchronized (GroupServiceGrpc.class) {
        if ((getCreateExternalMethod = GroupServiceGrpc.getCreateExternalMethod) == null) {
          GroupServiceGrpc.getCreateExternalMethod = getCreateExternalMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.CreateExternalGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateExternal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.CreateExternalGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new GroupServiceMethodDescriptorSupplier("CreateExternal"))
              .build();
        }
      }
    }
    return getCreateExternalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.UpdateGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.UpdateGroupRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.UpdateGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.UpdateGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = GroupServiceGrpc.getUpdateMethod) == null) {
      synchronized (GroupServiceGrpc.class) {
        if ((getUpdateMethod = GroupServiceGrpc.getUpdateMethod) == null) {
          GroupServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.UpdateGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.UpdateGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new GroupServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ConvertToExternalGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getConvertToExternalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConvertToExternal",
      requestType = yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ConvertToExternalGroupRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ConvertToExternalGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getConvertToExternalMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ConvertToExternalGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getConvertToExternalMethod;
    if ((getConvertToExternalMethod = GroupServiceGrpc.getConvertToExternalMethod) == null) {
      synchronized (GroupServiceGrpc.class) {
        if ((getConvertToExternalMethod = GroupServiceGrpc.getConvertToExternalMethod) == null) {
          GroupServiceGrpc.getConvertToExternalMethod = getConvertToExternalMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ConvertToExternalGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ConvertToExternal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ConvertToExternalGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new GroupServiceMethodDescriptorSupplier("ConvertToExternal"))
              .build();
        }
      }
    }
    return getConvertToExternalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ConvertAllToBasicGroupsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getConvertAllToBasicMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConvertAllToBasic",
      requestType = yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ConvertAllToBasicGroupsRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ConvertAllToBasicGroupsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getConvertAllToBasicMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ConvertAllToBasicGroupsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getConvertAllToBasicMethod;
    if ((getConvertAllToBasicMethod = GroupServiceGrpc.getConvertAllToBasicMethod) == null) {
      synchronized (GroupServiceGrpc.class) {
        if ((getConvertAllToBasicMethod = GroupServiceGrpc.getConvertAllToBasicMethod) == null) {
          GroupServiceGrpc.getConvertAllToBasicMethod = getConvertAllToBasicMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ConvertAllToBasicGroupsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ConvertAllToBasic"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ConvertAllToBasicGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new GroupServiceMethodDescriptorSupplier("ConvertAllToBasic"))
              .build();
        }
      }
    }
    return getConvertAllToBasicMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.DeleteGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.DeleteGroupRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.DeleteGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.DeleteGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = GroupServiceGrpc.getDeleteMethod) == null) {
      synchronized (GroupServiceGrpc.class) {
        if ((getDeleteMethod = GroupServiceGrpc.getDeleteMethod) == null) {
          GroupServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.DeleteGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.DeleteGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new GroupServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListGroupOperationsRequest,
      yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListGroupOperationsResponse> getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListGroupOperationsRequest.class,
      responseType = yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListGroupOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListGroupOperationsRequest,
      yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListGroupOperationsResponse> getListOperationsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListGroupOperationsRequest, yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListGroupOperationsResponse> getListOperationsMethod;
    if ((getListOperationsMethod = GroupServiceGrpc.getListOperationsMethod) == null) {
      synchronized (GroupServiceGrpc.class) {
        if ((getListOperationsMethod = GroupServiceGrpc.getListOperationsMethod) == null) {
          GroupServiceGrpc.getListOperationsMethod = getListOperationsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListGroupOperationsRequest, yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListGroupOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListGroupOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListGroupOperationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GroupServiceMethodDescriptorSupplier("ListOperations"))
              .build();
        }
      }
    }
    return getListOperationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListGroupMembersRequest,
      yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListGroupMembersResponse> getListMembersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListMembers",
      requestType = yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListGroupMembersRequest.class,
      responseType = yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListGroupMembersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListGroupMembersRequest,
      yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListGroupMembersResponse> getListMembersMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListGroupMembersRequest, yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListGroupMembersResponse> getListMembersMethod;
    if ((getListMembersMethod = GroupServiceGrpc.getListMembersMethod) == null) {
      synchronized (GroupServiceGrpc.class) {
        if ((getListMembersMethod = GroupServiceGrpc.getListMembersMethod) == null) {
          GroupServiceGrpc.getListMembersMethod = getListMembersMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListGroupMembersRequest, yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListGroupMembersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListMembers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListGroupMembersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListGroupMembersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GroupServiceMethodDescriptorSupplier("ListMembers"))
              .build();
        }
      }
    }
    return getListMembersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.UpdateGroupMembersRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMembersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateMembers",
      requestType = yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.UpdateGroupMembersRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.UpdateGroupMembersRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMembersMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.UpdateGroupMembersRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMembersMethod;
    if ((getUpdateMembersMethod = GroupServiceGrpc.getUpdateMembersMethod) == null) {
      synchronized (GroupServiceGrpc.class) {
        if ((getUpdateMembersMethod = GroupServiceGrpc.getUpdateMembersMethod) == null) {
          GroupServiceGrpc.getUpdateMembersMethod = getUpdateMembersMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.UpdateGroupMembersRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateMembers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.UpdateGroupMembersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new GroupServiceMethodDescriptorSupplier("UpdateMembers"))
              .build();
        }
      }
    }
    return getUpdateMembersMethod;
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
    if ((getListAccessBindingsMethod = GroupServiceGrpc.getListAccessBindingsMethod) == null) {
      synchronized (GroupServiceGrpc.class) {
        if ((getListAccessBindingsMethod = GroupServiceGrpc.getListAccessBindingsMethod) == null) {
          GroupServiceGrpc.getListAccessBindingsMethod = getListAccessBindingsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.ListAccessBindingsRequest, yandex.cloud.api.access.Access.ListAccessBindingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.ListAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.ListAccessBindingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GroupServiceMethodDescriptorSupplier("ListAccessBindings"))
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
    if ((getSetAccessBindingsMethod = GroupServiceGrpc.getSetAccessBindingsMethod) == null) {
      synchronized (GroupServiceGrpc.class) {
        if ((getSetAccessBindingsMethod = GroupServiceGrpc.getSetAccessBindingsMethod) == null) {
          GroupServiceGrpc.getSetAccessBindingsMethod = getSetAccessBindingsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.SetAccessBindingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.SetAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new GroupServiceMethodDescriptorSupplier("SetAccessBindings"))
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
    if ((getUpdateAccessBindingsMethod = GroupServiceGrpc.getUpdateAccessBindingsMethod) == null) {
      synchronized (GroupServiceGrpc.class) {
        if ((getUpdateAccessBindingsMethod = GroupServiceGrpc.getUpdateAccessBindingsMethod) == null) {
          GroupServiceGrpc.getUpdateAccessBindingsMethod = getUpdateAccessBindingsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.UpdateAccessBindingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.UpdateAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new GroupServiceMethodDescriptorSupplier("UpdateAccessBindings"))
              .build();
        }
      }
    }
    return getUpdateAccessBindingsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GroupServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GroupServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GroupServiceStub>() {
        @java.lang.Override
        public GroupServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GroupServiceStub(channel, callOptions);
        }
      };
    return GroupServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GroupServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GroupServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GroupServiceBlockingStub>() {
        @java.lang.Override
        public GroupServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GroupServiceBlockingStub(channel, callOptions);
        }
      };
    return GroupServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GroupServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GroupServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GroupServiceFutureStub>() {
        @java.lang.Override
        public GroupServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GroupServiceFutureStub(channel, callOptions);
        }
      };
    return GroupServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing groups.
   * </pre>
   */
  public static abstract class GroupServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified Group resource.
     * To get the list of available Group resources, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.GetGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.GroupOuterClass.Group> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns external group by subject container and external id
     * </pre>
     */
    public void resolveExternal(yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ResolveExternalGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.GroupOuterClass.Group> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResolveExternalMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of group resources.
     * </pre>
     */
    public void list(yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListGroupsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListGroupsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of external group linked subject container
     * </pre>
     */
    public void listExternal(yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListExternalGroupsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListExternalGroupsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListExternalMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a group in the specified organization.
     * </pre>
     */
    public void create(yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.CreateGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates an external group.
     * </pre>
     */
    public void createExternal(yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.CreateExternalGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateExternalMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified group.
     * </pre>
     */
    public void update(yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.UpdateGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Converts single basic (not external) group to external. Precondition: group must be basic. 
     * </pre>
     */
    public void convertToExternal(yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ConvertToExternalGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConvertToExternalMethod(), responseObserver);
    }

    /**
     * <pre>
     * Converts all groups that belongs to subject container from external to basic (not external).
     * </pre>
     */
    public void convertAllToBasic(yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ConvertAllToBasicGroupsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConvertAllToBasicMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified group.
     * </pre>
     */
    public void delete(yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.DeleteGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified group.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListGroupOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListGroupOperationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * List group active members.
     * </pre>
     */
    public void listMembers(yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListGroupMembersRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListGroupMembersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMembersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update group members.
     * </pre>
     */
    public void updateMembers(yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.UpdateGroupMembersRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMembersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists access bindings for the specified group.
     * </pre>
     */
    public void listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.access.Access.ListAccessBindingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAccessBindingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sets access bindings for the specified group.
     * </pre>
     */
    public void setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetAccessBindingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates access bindings for the specified group.
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
                yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.GetGroupRequest,
                yandex.cloud.api.organizationmanager.v1.GroupOuterClass.Group>(
                  this, METHODID_GET)))
          .addMethod(
            getResolveExternalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ResolveExternalGroupRequest,
                yandex.cloud.api.organizationmanager.v1.GroupOuterClass.Group>(
                  this, METHODID_RESOLVE_EXTERNAL)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListGroupsRequest,
                yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListGroupsResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getListExternalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListExternalGroupsRequest,
                yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListExternalGroupsResponse>(
                  this, METHODID_LIST_EXTERNAL)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.CreateGroupRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getCreateExternalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.CreateExternalGroupRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE_EXTERNAL)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.UpdateGroupRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getConvertToExternalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ConvertToExternalGroupRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CONVERT_TO_EXTERNAL)))
          .addMethod(
            getConvertAllToBasicMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ConvertAllToBasicGroupsRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CONVERT_ALL_TO_BASIC)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.DeleteGroupRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListOperationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListGroupOperationsRequest,
                yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListGroupOperationsResponse>(
                  this, METHODID_LIST_OPERATIONS)))
          .addMethod(
            getListMembersMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListGroupMembersRequest,
                yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListGroupMembersResponse>(
                  this, METHODID_LIST_MEMBERS)))
          .addMethod(
            getUpdateMembersMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.UpdateGroupMembersRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE_MEMBERS)))
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
   * A set of methods for managing groups.
   * </pre>
   */
  public static final class GroupServiceStub extends io.grpc.stub.AbstractAsyncStub<GroupServiceStub> {
    private GroupServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GroupServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GroupServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified Group resource.
     * To get the list of available Group resources, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.GetGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.GroupOuterClass.Group> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns external group by subject container and external id
     * </pre>
     */
    public void resolveExternal(yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ResolveExternalGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.GroupOuterClass.Group> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResolveExternalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of group resources.
     * </pre>
     */
    public void list(yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListGroupsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListGroupsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of external group linked subject container
     * </pre>
     */
    public void listExternal(yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListExternalGroupsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListExternalGroupsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListExternalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a group in the specified organization.
     * </pre>
     */
    public void create(yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.CreateGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates an external group.
     * </pre>
     */
    public void createExternal(yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.CreateExternalGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateExternalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified group.
     * </pre>
     */
    public void update(yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.UpdateGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Converts single basic (not external) group to external. Precondition: group must be basic. 
     * </pre>
     */
    public void convertToExternal(yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ConvertToExternalGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConvertToExternalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Converts all groups that belongs to subject container from external to basic (not external).
     * </pre>
     */
    public void convertAllToBasic(yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ConvertAllToBasicGroupsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConvertAllToBasicMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified group.
     * </pre>
     */
    public void delete(yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.DeleteGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified group.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListGroupOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListGroupOperationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List group active members.
     * </pre>
     */
    public void listMembers(yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListGroupMembersRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListGroupMembersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMembersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update group members.
     * </pre>
     */
    public void updateMembers(yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.UpdateGroupMembersRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMembersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists access bindings for the specified group.
     * </pre>
     */
    public void listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.access.Access.ListAccessBindingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sets access bindings for the specified group.
     * </pre>
     */
    public void setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates access bindings for the specified group.
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
   * A set of methods for managing groups.
   * </pre>
   */
  public static final class GroupServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<GroupServiceBlockingStub> {
    private GroupServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GroupServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GroupServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified Group resource.
     * To get the list of available Group resources, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.organizationmanager.v1.GroupOuterClass.Group get(yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.GetGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns external group by subject container and external id
     * </pre>
     */
    public yandex.cloud.api.organizationmanager.v1.GroupOuterClass.Group resolveExternal(yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ResolveExternalGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResolveExternalMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of group resources.
     * </pre>
     */
    public yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListGroupsResponse list(yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListGroupsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of external group linked subject container
     * </pre>
     */
    public yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListExternalGroupsResponse listExternal(yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListExternalGroupsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListExternalMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a group in the specified organization.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.CreateGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates an external group.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation createExternal(yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.CreateExternalGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateExternalMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified group.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.UpdateGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Converts single basic (not external) group to external. Precondition: group must be basic. 
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation convertToExternal(yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ConvertToExternalGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConvertToExternalMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Converts all groups that belongs to subject container from external to basic (not external).
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation convertAllToBasic(yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ConvertAllToBasicGroupsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConvertAllToBasicMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified group.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.DeleteGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists operations for the specified group.
     * </pre>
     */
    public yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListGroupOperationsResponse listOperations(yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListGroupOperationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List group active members.
     * </pre>
     */
    public yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListGroupMembersResponse listMembers(yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListGroupMembersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMembersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update group members.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation updateMembers(yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.UpdateGroupMembersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMembersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists access bindings for the specified group.
     * </pre>
     */
    public yandex.cloud.api.access.Access.ListAccessBindingsResponse listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAccessBindingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets access bindings for the specified group.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetAccessBindingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates access bindings for the specified group.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation updateAccessBindings(yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAccessBindingsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing groups.
   * </pre>
   */
  public static final class GroupServiceFutureStub extends io.grpc.stub.AbstractFutureStub<GroupServiceFutureStub> {
    private GroupServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GroupServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GroupServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified Group resource.
     * To get the list of available Group resources, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.organizationmanager.v1.GroupOuterClass.Group> get(
        yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.GetGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns external group by subject container and external id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.organizationmanager.v1.GroupOuterClass.Group> resolveExternal(
        yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ResolveExternalGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResolveExternalMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of group resources.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListGroupsResponse> list(
        yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListGroupsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of external group linked subject container
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListExternalGroupsResponse> listExternal(
        yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListExternalGroupsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListExternalMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a group in the specified organization.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.CreateGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates an external group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> createExternal(
        yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.CreateExternalGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateExternalMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.UpdateGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Converts single basic (not external) group to external. Precondition: group must be basic. 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> convertToExternal(
        yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ConvertToExternalGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConvertToExternalMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Converts all groups that belongs to subject container from external to basic (not external).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> convertAllToBasic(
        yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ConvertAllToBasicGroupsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConvertAllToBasicMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.DeleteGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists operations for the specified group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListGroupOperationsResponse> listOperations(
        yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListGroupOperationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List group active members.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListGroupMembersResponse> listMembers(
        yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListGroupMembersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMembersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update group members.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> updateMembers(
        yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.UpdateGroupMembersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMembersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists access bindings for the specified group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.access.Access.ListAccessBindingsResponse> listAccessBindings(
        yandex.cloud.api.access.Access.ListAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAccessBindingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sets access bindings for the specified group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> setAccessBindings(
        yandex.cloud.api.access.Access.SetAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetAccessBindingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates access bindings for the specified group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> updateAccessBindings(
        yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAccessBindingsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_RESOLVE_EXTERNAL = 1;
  private static final int METHODID_LIST = 2;
  private static final int METHODID_LIST_EXTERNAL = 3;
  private static final int METHODID_CREATE = 4;
  private static final int METHODID_CREATE_EXTERNAL = 5;
  private static final int METHODID_UPDATE = 6;
  private static final int METHODID_CONVERT_TO_EXTERNAL = 7;
  private static final int METHODID_CONVERT_ALL_TO_BASIC = 8;
  private static final int METHODID_DELETE = 9;
  private static final int METHODID_LIST_OPERATIONS = 10;
  private static final int METHODID_LIST_MEMBERS = 11;
  private static final int METHODID_UPDATE_MEMBERS = 12;
  private static final int METHODID_LIST_ACCESS_BINDINGS = 13;
  private static final int METHODID_SET_ACCESS_BINDINGS = 14;
  private static final int METHODID_UPDATE_ACCESS_BINDINGS = 15;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GroupServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GroupServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.GetGroupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.GroupOuterClass.Group>) responseObserver);
          break;
        case METHODID_RESOLVE_EXTERNAL:
          serviceImpl.resolveExternal((yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ResolveExternalGroupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.GroupOuterClass.Group>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListGroupsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListGroupsResponse>) responseObserver);
          break;
        case METHODID_LIST_EXTERNAL:
          serviceImpl.listExternal((yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListExternalGroupsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListExternalGroupsResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.CreateGroupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_CREATE_EXTERNAL:
          serviceImpl.createExternal((yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.CreateExternalGroupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.UpdateGroupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_CONVERT_TO_EXTERNAL:
          serviceImpl.convertToExternal((yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ConvertToExternalGroupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_CONVERT_ALL_TO_BASIC:
          serviceImpl.convertAllToBasic((yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ConvertAllToBasicGroupsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.DeleteGroupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListGroupOperationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListGroupOperationsResponse>) responseObserver);
          break;
        case METHODID_LIST_MEMBERS:
          serviceImpl.listMembers((yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListGroupMembersRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.ListGroupMembersResponse>) responseObserver);
          break;
        case METHODID_UPDATE_MEMBERS:
          serviceImpl.updateMembers((yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.UpdateGroupMembersRequest) request,
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

  private static abstract class GroupServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GroupServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.organizationmanager.v1.GroupServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GroupService");
    }
  }

  private static final class GroupServiceFileDescriptorSupplier
      extends GroupServiceBaseDescriptorSupplier {
    GroupServiceFileDescriptorSupplier() {}
  }

  private static final class GroupServiceMethodDescriptorSupplier
      extends GroupServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GroupServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (GroupServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GroupServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getResolveExternalMethod())
              .addMethod(getListMethod())
              .addMethod(getListExternalMethod())
              .addMethod(getCreateMethod())
              .addMethod(getCreateExternalMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getConvertToExternalMethod())
              .addMethod(getConvertAllToBasicMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getListOperationsMethod())
              .addMethod(getListMembersMethod())
              .addMethod(getUpdateMembersMethod())
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
