package yandex.cloud.api.compute.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing groups of dedicated hosts.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/compute/v1/host_group_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class HostGroupServiceGrpc {

  private HostGroupServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.compute.v1.HostGroupService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.GetHostGroupRequest,
      yandex.cloud.api.compute.v1.HostGroupOuterClass.HostGroup> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.GetHostGroupRequest.class,
      responseType = yandex.cloud.api.compute.v1.HostGroupOuterClass.HostGroup.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.GetHostGroupRequest,
      yandex.cloud.api.compute.v1.HostGroupOuterClass.HostGroup> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.GetHostGroupRequest, yandex.cloud.api.compute.v1.HostGroupOuterClass.HostGroup> getGetMethod;
    if ((getGetMethod = HostGroupServiceGrpc.getGetMethod) == null) {
      synchronized (HostGroupServiceGrpc.class) {
        if ((getGetMethod = HostGroupServiceGrpc.getGetMethod) == null) {
          HostGroupServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.GetHostGroupRequest, yandex.cloud.api.compute.v1.HostGroupOuterClass.HostGroup>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.GetHostGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.HostGroupOuterClass.HostGroup.getDefaultInstance()))
              .setSchemaDescriptor(new HostGroupServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupsRequest,
      yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupsRequest.class,
      responseType = yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupsRequest,
      yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupsRequest, yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupsResponse> getListMethod;
    if ((getListMethod = HostGroupServiceGrpc.getListMethod) == null) {
      synchronized (HostGroupServiceGrpc.class) {
        if ((getListMethod = HostGroupServiceGrpc.getListMethod) == null) {
          HostGroupServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupsRequest, yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HostGroupServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.CreateHostGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.CreateHostGroupRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.CreateHostGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.CreateHostGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = HostGroupServiceGrpc.getCreateMethod) == null) {
      synchronized (HostGroupServiceGrpc.class) {
        if ((getCreateMethod = HostGroupServiceGrpc.getCreateMethod) == null) {
          HostGroupServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.CreateHostGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.CreateHostGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new HostGroupServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.UpdateHostGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.UpdateHostGroupRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.UpdateHostGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.UpdateHostGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = HostGroupServiceGrpc.getUpdateMethod) == null) {
      synchronized (HostGroupServiceGrpc.class) {
        if ((getUpdateMethod = HostGroupServiceGrpc.getUpdateMethod) == null) {
          HostGroupServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.UpdateHostGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.UpdateHostGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new HostGroupServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.DeleteHostGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.DeleteHostGroupRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.DeleteHostGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.DeleteHostGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = HostGroupServiceGrpc.getDeleteMethod) == null) {
      synchronized (HostGroupServiceGrpc.class) {
        if ((getDeleteMethod = HostGroupServiceGrpc.getDeleteMethod) == null) {
          HostGroupServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.DeleteHostGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.DeleteHostGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new HostGroupServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupOperationsRequest,
      yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupOperationsResponse> getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupOperationsRequest.class,
      responseType = yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupOperationsRequest,
      yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupOperationsResponse> getListOperationsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupOperationsRequest, yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupOperationsResponse> getListOperationsMethod;
    if ((getListOperationsMethod = HostGroupServiceGrpc.getListOperationsMethod) == null) {
      synchronized (HostGroupServiceGrpc.class) {
        if ((getListOperationsMethod = HostGroupServiceGrpc.getListOperationsMethod) == null) {
          HostGroupServiceGrpc.getListOperationsMethod = getListOperationsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupOperationsRequest, yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupOperationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HostGroupServiceMethodDescriptorSupplier("ListOperations"))
              .build();
        }
      }
    }
    return getListOperationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupInstancesRequest,
      yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupInstancesResponse> getListInstancesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListInstances",
      requestType = yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupInstancesRequest.class,
      responseType = yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupInstancesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupInstancesRequest,
      yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupInstancesResponse> getListInstancesMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupInstancesRequest, yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupInstancesResponse> getListInstancesMethod;
    if ((getListInstancesMethod = HostGroupServiceGrpc.getListInstancesMethod) == null) {
      synchronized (HostGroupServiceGrpc.class) {
        if ((getListInstancesMethod = HostGroupServiceGrpc.getListInstancesMethod) == null) {
          HostGroupServiceGrpc.getListInstancesMethod = getListInstancesMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupInstancesRequest, yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupInstancesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListInstances"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupInstancesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupInstancesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HostGroupServiceMethodDescriptorSupplier("ListInstances"))
              .build();
        }
      }
    }
    return getListInstancesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupHostsRequest,
      yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupHostsResponse> getListHostsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListHosts",
      requestType = yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupHostsRequest.class,
      responseType = yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupHostsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupHostsRequest,
      yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupHostsResponse> getListHostsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupHostsRequest, yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupHostsResponse> getListHostsMethod;
    if ((getListHostsMethod = HostGroupServiceGrpc.getListHostsMethod) == null) {
      synchronized (HostGroupServiceGrpc.class) {
        if ((getListHostsMethod = HostGroupServiceGrpc.getListHostsMethod) == null) {
          HostGroupServiceGrpc.getListHostsMethod = getListHostsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupHostsRequest, yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupHostsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListHosts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupHostsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupHostsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HostGroupServiceMethodDescriptorSupplier("ListHosts"))
              .build();
        }
      }
    }
    return getListHostsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.UpdateHostGroupHostRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateHostMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateHost",
      requestType = yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.UpdateHostGroupHostRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.UpdateHostGroupHostRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateHostMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.UpdateHostGroupHostRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateHostMethod;
    if ((getUpdateHostMethod = HostGroupServiceGrpc.getUpdateHostMethod) == null) {
      synchronized (HostGroupServiceGrpc.class) {
        if ((getUpdateHostMethod = HostGroupServiceGrpc.getUpdateHostMethod) == null) {
          HostGroupServiceGrpc.getUpdateHostMethod = getUpdateHostMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.UpdateHostGroupHostRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateHost"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.UpdateHostGroupHostRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new HostGroupServiceMethodDescriptorSupplier("UpdateHost"))
              .build();
        }
      }
    }
    return getUpdateHostMethod;
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
    if ((getListAccessBindingsMethod = HostGroupServiceGrpc.getListAccessBindingsMethod) == null) {
      synchronized (HostGroupServiceGrpc.class) {
        if ((getListAccessBindingsMethod = HostGroupServiceGrpc.getListAccessBindingsMethod) == null) {
          HostGroupServiceGrpc.getListAccessBindingsMethod = getListAccessBindingsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.ListAccessBindingsRequest, yandex.cloud.api.access.Access.ListAccessBindingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.ListAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.ListAccessBindingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HostGroupServiceMethodDescriptorSupplier("ListAccessBindings"))
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
    if ((getSetAccessBindingsMethod = HostGroupServiceGrpc.getSetAccessBindingsMethod) == null) {
      synchronized (HostGroupServiceGrpc.class) {
        if ((getSetAccessBindingsMethod = HostGroupServiceGrpc.getSetAccessBindingsMethod) == null) {
          HostGroupServiceGrpc.getSetAccessBindingsMethod = getSetAccessBindingsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.SetAccessBindingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.SetAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new HostGroupServiceMethodDescriptorSupplier("SetAccessBindings"))
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
    if ((getUpdateAccessBindingsMethod = HostGroupServiceGrpc.getUpdateAccessBindingsMethod) == null) {
      synchronized (HostGroupServiceGrpc.class) {
        if ((getUpdateAccessBindingsMethod = HostGroupServiceGrpc.getUpdateAccessBindingsMethod) == null) {
          HostGroupServiceGrpc.getUpdateAccessBindingsMethod = getUpdateAccessBindingsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.UpdateAccessBindingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.UpdateAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new HostGroupServiceMethodDescriptorSupplier("UpdateAccessBindings"))
              .build();
        }
      }
    }
    return getUpdateAccessBindingsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HostGroupServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HostGroupServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HostGroupServiceStub>() {
        @java.lang.Override
        public HostGroupServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HostGroupServiceStub(channel, callOptions);
        }
      };
    return HostGroupServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HostGroupServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HostGroupServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HostGroupServiceBlockingStub>() {
        @java.lang.Override
        public HostGroupServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HostGroupServiceBlockingStub(channel, callOptions);
        }
      };
    return HostGroupServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HostGroupServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HostGroupServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HostGroupServiceFutureStub>() {
        @java.lang.Override
        public HostGroupServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HostGroupServiceFutureStub(channel, callOptions);
        }
      };
    return HostGroupServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing groups of dedicated hosts.
   * </pre>
   */
  public static abstract class HostGroupServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified host group.
     * </pre>
     */
    public void get(yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.GetHostGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.HostGroupOuterClass.HostGroup> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of host groups in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a host group in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.CreateHostGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified host group.
     * </pre>
     */
    public void update(yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.UpdateHostGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified host group.
     * </pre>
     */
    public void delete(yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.DeleteHostGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified host group.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupOperationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists instances that belongs to the specified host group.
     * </pre>
     */
    public void listInstances(yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupInstancesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupInstancesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListInstancesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists hosts that belongs to the specified host group.
     * </pre>
     */
    public void listHosts(yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupHostsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupHostsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListHostsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update host
     * </pre>
     */
    public void updateHost(yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.UpdateHostGroupHostRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateHostMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists access bindings for the host group.
     * </pre>
     */
    public void listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.access.Access.ListAccessBindingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAccessBindingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sets access bindings for the host group.
     * </pre>
     */
    public void setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetAccessBindingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates access bindings for the host group.
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
                yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.GetHostGroupRequest,
                yandex.cloud.api.compute.v1.HostGroupOuterClass.HostGroup>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupsRequest,
                yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupsResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.CreateHostGroupRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.UpdateHostGroupRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.DeleteHostGroupRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListOperationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupOperationsRequest,
                yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupOperationsResponse>(
                  this, METHODID_LIST_OPERATIONS)))
          .addMethod(
            getListInstancesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupInstancesRequest,
                yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupInstancesResponse>(
                  this, METHODID_LIST_INSTANCES)))
          .addMethod(
            getListHostsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupHostsRequest,
                yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupHostsResponse>(
                  this, METHODID_LIST_HOSTS)))
          .addMethod(
            getUpdateHostMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.UpdateHostGroupHostRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE_HOST)))
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
   * A set of methods for managing groups of dedicated hosts.
   * </pre>
   */
  public static final class HostGroupServiceStub extends io.grpc.stub.AbstractAsyncStub<HostGroupServiceStub> {
    private HostGroupServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HostGroupServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HostGroupServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified host group.
     * </pre>
     */
    public void get(yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.GetHostGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.HostGroupOuterClass.HostGroup> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of host groups in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a host group in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.CreateHostGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified host group.
     * </pre>
     */
    public void update(yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.UpdateHostGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified host group.
     * </pre>
     */
    public void delete(yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.DeleteHostGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified host group.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupOperationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists instances that belongs to the specified host group.
     * </pre>
     */
    public void listInstances(yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupInstancesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupInstancesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListInstancesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists hosts that belongs to the specified host group.
     * </pre>
     */
    public void listHosts(yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupHostsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupHostsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListHostsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update host
     * </pre>
     */
    public void updateHost(yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.UpdateHostGroupHostRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateHostMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists access bindings for the host group.
     * </pre>
     */
    public void listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.access.Access.ListAccessBindingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sets access bindings for the host group.
     * </pre>
     */
    public void setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates access bindings for the host group.
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
   * A set of methods for managing groups of dedicated hosts.
   * </pre>
   */
  public static final class HostGroupServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<HostGroupServiceBlockingStub> {
    private HostGroupServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HostGroupServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HostGroupServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified host group.
     * </pre>
     */
    public yandex.cloud.api.compute.v1.HostGroupOuterClass.HostGroup get(yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.GetHostGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of host groups in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupsResponse list(yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a host group in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.CreateHostGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified host group.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.UpdateHostGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified host group.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.DeleteHostGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists operations for the specified host group.
     * </pre>
     */
    public yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupOperationsResponse listOperations(yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupOperationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists instances that belongs to the specified host group.
     * </pre>
     */
    public yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupInstancesResponse listInstances(yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupInstancesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListInstancesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists hosts that belongs to the specified host group.
     * </pre>
     */
    public yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupHostsResponse listHosts(yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupHostsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListHostsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update host
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation updateHost(yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.UpdateHostGroupHostRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateHostMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists access bindings for the host group.
     * </pre>
     */
    public yandex.cloud.api.access.Access.ListAccessBindingsResponse listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAccessBindingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets access bindings for the host group.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetAccessBindingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates access bindings for the host group.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation updateAccessBindings(yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAccessBindingsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing groups of dedicated hosts.
   * </pre>
   */
  public static final class HostGroupServiceFutureStub extends io.grpc.stub.AbstractFutureStub<HostGroupServiceFutureStub> {
    private HostGroupServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HostGroupServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HostGroupServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified host group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.compute.v1.HostGroupOuterClass.HostGroup> get(
        yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.GetHostGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of host groups in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupsResponse> list(
        yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a host group in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.CreateHostGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified host group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.UpdateHostGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified host group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.DeleteHostGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists operations for the specified host group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupOperationsResponse> listOperations(
        yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupOperationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists instances that belongs to the specified host group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupInstancesResponse> listInstances(
        yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupInstancesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListInstancesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists hosts that belongs to the specified host group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupHostsResponse> listHosts(
        yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupHostsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListHostsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update host
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> updateHost(
        yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.UpdateHostGroupHostRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateHostMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists access bindings for the host group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.access.Access.ListAccessBindingsResponse> listAccessBindings(
        yandex.cloud.api.access.Access.ListAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAccessBindingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sets access bindings for the host group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> setAccessBindings(
        yandex.cloud.api.access.Access.SetAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetAccessBindingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates access bindings for the host group.
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
  private static final int METHODID_LIST_INSTANCES = 6;
  private static final int METHODID_LIST_HOSTS = 7;
  private static final int METHODID_UPDATE_HOST = 8;
  private static final int METHODID_LIST_ACCESS_BINDINGS = 9;
  private static final int METHODID_SET_ACCESS_BINDINGS = 10;
  private static final int METHODID_UPDATE_ACCESS_BINDINGS = 11;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HostGroupServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HostGroupServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.GetHostGroupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.HostGroupOuterClass.HostGroup>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupsResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.CreateHostGroupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.UpdateHostGroupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.DeleteHostGroupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupOperationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupOperationsResponse>) responseObserver);
          break;
        case METHODID_LIST_INSTANCES:
          serviceImpl.listInstances((yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupInstancesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupInstancesResponse>) responseObserver);
          break;
        case METHODID_LIST_HOSTS:
          serviceImpl.listHosts((yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupHostsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupHostsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_HOST:
          serviceImpl.updateHost((yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.UpdateHostGroupHostRequest) request,
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

  private static abstract class HostGroupServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HostGroupServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HostGroupService");
    }
  }

  private static final class HostGroupServiceFileDescriptorSupplier
      extends HostGroupServiceBaseDescriptorSupplier {
    HostGroupServiceFileDescriptorSupplier() {}
  }

  private static final class HostGroupServiceMethodDescriptorSupplier
      extends HostGroupServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HostGroupServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (HostGroupServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HostGroupServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getListOperationsMethod())
              .addMethod(getListInstancesMethod())
              .addMethod(getListHostsMethod())
              .addMethod(getUpdateHostMethod())
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
