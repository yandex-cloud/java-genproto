package yandex.cloud.api.compute.v1.instancegroup;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing InstanceGroup resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/compute/v1/instancegroup/instance_group_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class InstanceGroupServiceGrpc {

  private InstanceGroupServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.compute.v1.instancegroup.InstanceGroupService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.GetInstanceGroupRequest,
      yandex.cloud.api.compute.v1.instancegroup.InstanceGroupOuterClass.InstanceGroup> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.GetInstanceGroupRequest.class,
      responseType = yandex.cloud.api.compute.v1.instancegroup.InstanceGroupOuterClass.InstanceGroup.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.GetInstanceGroupRequest,
      yandex.cloud.api.compute.v1.instancegroup.InstanceGroupOuterClass.InstanceGroup> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.GetInstanceGroupRequest, yandex.cloud.api.compute.v1.instancegroup.InstanceGroupOuterClass.InstanceGroup> getGetMethod;
    if ((getGetMethod = InstanceGroupServiceGrpc.getGetMethod) == null) {
      synchronized (InstanceGroupServiceGrpc.class) {
        if ((getGetMethod = InstanceGroupServiceGrpc.getGetMethod) == null) {
          InstanceGroupServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.GetInstanceGroupRequest, yandex.cloud.api.compute.v1.instancegroup.InstanceGroupOuterClass.InstanceGroup>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.GetInstanceGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.instancegroup.InstanceGroupOuterClass.InstanceGroup.getDefaultInstance()))
              .setSchemaDescriptor(new InstanceGroupServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupsRequest,
      yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupsRequest.class,
      responseType = yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupsRequest,
      yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupsRequest, yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupsResponse> getListMethod;
    if ((getListMethod = InstanceGroupServiceGrpc.getListMethod) == null) {
      synchronized (InstanceGroupServiceGrpc.class) {
        if ((getListMethod = InstanceGroupServiceGrpc.getListMethod) == null) {
          InstanceGroupServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupsRequest, yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InstanceGroupServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.CreateInstanceGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.CreateInstanceGroupRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.CreateInstanceGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.CreateInstanceGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = InstanceGroupServiceGrpc.getCreateMethod) == null) {
      synchronized (InstanceGroupServiceGrpc.class) {
        if ((getCreateMethod = InstanceGroupServiceGrpc.getCreateMethod) == null) {
          InstanceGroupServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.CreateInstanceGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.CreateInstanceGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new InstanceGroupServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.CreateInstanceGroupFromYamlRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateFromYamlMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateFromYaml",
      requestType = yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.CreateInstanceGroupFromYamlRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.CreateInstanceGroupFromYamlRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateFromYamlMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.CreateInstanceGroupFromYamlRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateFromYamlMethod;
    if ((getCreateFromYamlMethod = InstanceGroupServiceGrpc.getCreateFromYamlMethod) == null) {
      synchronized (InstanceGroupServiceGrpc.class) {
        if ((getCreateFromYamlMethod = InstanceGroupServiceGrpc.getCreateFromYamlMethod) == null) {
          InstanceGroupServiceGrpc.getCreateFromYamlMethod = getCreateFromYamlMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.CreateInstanceGroupFromYamlRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateFromYaml"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.CreateInstanceGroupFromYamlRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new InstanceGroupServiceMethodDescriptorSupplier("CreateFromYaml"))
              .build();
        }
      }
    }
    return getCreateFromYamlMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.UpdateInstanceGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.UpdateInstanceGroupRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.UpdateInstanceGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.UpdateInstanceGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = InstanceGroupServiceGrpc.getUpdateMethod) == null) {
      synchronized (InstanceGroupServiceGrpc.class) {
        if ((getUpdateMethod = InstanceGroupServiceGrpc.getUpdateMethod) == null) {
          InstanceGroupServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.UpdateInstanceGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.UpdateInstanceGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new InstanceGroupServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.UpdateInstanceGroupFromYamlRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateFromYamlMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateFromYaml",
      requestType = yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.UpdateInstanceGroupFromYamlRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.UpdateInstanceGroupFromYamlRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateFromYamlMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.UpdateInstanceGroupFromYamlRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateFromYamlMethod;
    if ((getUpdateFromYamlMethod = InstanceGroupServiceGrpc.getUpdateFromYamlMethod) == null) {
      synchronized (InstanceGroupServiceGrpc.class) {
        if ((getUpdateFromYamlMethod = InstanceGroupServiceGrpc.getUpdateFromYamlMethod) == null) {
          InstanceGroupServiceGrpc.getUpdateFromYamlMethod = getUpdateFromYamlMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.UpdateInstanceGroupFromYamlRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateFromYaml"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.UpdateInstanceGroupFromYamlRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new InstanceGroupServiceMethodDescriptorSupplier("UpdateFromYaml"))
              .build();
        }
      }
    }
    return getUpdateFromYamlMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.StopInstanceGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getStopMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Stop",
      requestType = yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.StopInstanceGroupRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.StopInstanceGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getStopMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.StopInstanceGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getStopMethod;
    if ((getStopMethod = InstanceGroupServiceGrpc.getStopMethod) == null) {
      synchronized (InstanceGroupServiceGrpc.class) {
        if ((getStopMethod = InstanceGroupServiceGrpc.getStopMethod) == null) {
          InstanceGroupServiceGrpc.getStopMethod = getStopMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.StopInstanceGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Stop"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.StopInstanceGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new InstanceGroupServiceMethodDescriptorSupplier("Stop"))
              .build();
        }
      }
    }
    return getStopMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.StartInstanceGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getStartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Start",
      requestType = yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.StartInstanceGroupRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.StartInstanceGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getStartMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.StartInstanceGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getStartMethod;
    if ((getStartMethod = InstanceGroupServiceGrpc.getStartMethod) == null) {
      synchronized (InstanceGroupServiceGrpc.class) {
        if ((getStartMethod = InstanceGroupServiceGrpc.getStartMethod) == null) {
          InstanceGroupServiceGrpc.getStartMethod = getStartMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.StartInstanceGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Start"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.StartInstanceGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new InstanceGroupServiceMethodDescriptorSupplier("Start"))
              .build();
        }
      }
    }
    return getStartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.DeleteInstanceGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.DeleteInstanceGroupRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.DeleteInstanceGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.DeleteInstanceGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = InstanceGroupServiceGrpc.getDeleteMethod) == null) {
      synchronized (InstanceGroupServiceGrpc.class) {
        if ((getDeleteMethod = InstanceGroupServiceGrpc.getDeleteMethod) == null) {
          InstanceGroupServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.DeleteInstanceGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.DeleteInstanceGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new InstanceGroupServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupInstancesRequest,
      yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupInstancesResponse> getListInstancesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListInstances",
      requestType = yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupInstancesRequest.class,
      responseType = yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupInstancesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupInstancesRequest,
      yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupInstancesResponse> getListInstancesMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupInstancesRequest, yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupInstancesResponse> getListInstancesMethod;
    if ((getListInstancesMethod = InstanceGroupServiceGrpc.getListInstancesMethod) == null) {
      synchronized (InstanceGroupServiceGrpc.class) {
        if ((getListInstancesMethod = InstanceGroupServiceGrpc.getListInstancesMethod) == null) {
          InstanceGroupServiceGrpc.getListInstancesMethod = getListInstancesMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupInstancesRequest, yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupInstancesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListInstances"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupInstancesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupInstancesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InstanceGroupServiceMethodDescriptorSupplier("ListInstances"))
              .build();
        }
      }
    }
    return getListInstancesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.DeleteInstancesRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteInstancesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteInstances",
      requestType = yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.DeleteInstancesRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.DeleteInstancesRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteInstancesMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.DeleteInstancesRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteInstancesMethod;
    if ((getDeleteInstancesMethod = InstanceGroupServiceGrpc.getDeleteInstancesMethod) == null) {
      synchronized (InstanceGroupServiceGrpc.class) {
        if ((getDeleteInstancesMethod = InstanceGroupServiceGrpc.getDeleteInstancesMethod) == null) {
          InstanceGroupServiceGrpc.getDeleteInstancesMethod = getDeleteInstancesMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.DeleteInstancesRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteInstances"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.DeleteInstancesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new InstanceGroupServiceMethodDescriptorSupplier("DeleteInstances"))
              .build();
        }
      }
    }
    return getDeleteInstancesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.StopInstancesRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getStopInstancesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StopInstances",
      requestType = yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.StopInstancesRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.StopInstancesRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getStopInstancesMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.StopInstancesRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getStopInstancesMethod;
    if ((getStopInstancesMethod = InstanceGroupServiceGrpc.getStopInstancesMethod) == null) {
      synchronized (InstanceGroupServiceGrpc.class) {
        if ((getStopInstancesMethod = InstanceGroupServiceGrpc.getStopInstancesMethod) == null) {
          InstanceGroupServiceGrpc.getStopInstancesMethod = getStopInstancesMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.StopInstancesRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StopInstances"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.StopInstancesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new InstanceGroupServiceMethodDescriptorSupplier("StopInstances"))
              .build();
        }
      }
    }
    return getStopInstancesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupOperationsRequest,
      yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupOperationsResponse> getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupOperationsRequest.class,
      responseType = yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupOperationsRequest,
      yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupOperationsResponse> getListOperationsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupOperationsRequest, yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupOperationsResponse> getListOperationsMethod;
    if ((getListOperationsMethod = InstanceGroupServiceGrpc.getListOperationsMethod) == null) {
      synchronized (InstanceGroupServiceGrpc.class) {
        if ((getListOperationsMethod = InstanceGroupServiceGrpc.getListOperationsMethod) == null) {
          InstanceGroupServiceGrpc.getListOperationsMethod = getListOperationsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupOperationsRequest, yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupOperationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InstanceGroupServiceMethodDescriptorSupplier("ListOperations"))
              .build();
        }
      }
    }
    return getListOperationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupLogRecordsRequest,
      yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupLogRecordsResponse> getListLogRecordsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListLogRecords",
      requestType = yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupLogRecordsRequest.class,
      responseType = yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupLogRecordsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupLogRecordsRequest,
      yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupLogRecordsResponse> getListLogRecordsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupLogRecordsRequest, yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupLogRecordsResponse> getListLogRecordsMethod;
    if ((getListLogRecordsMethod = InstanceGroupServiceGrpc.getListLogRecordsMethod) == null) {
      synchronized (InstanceGroupServiceGrpc.class) {
        if ((getListLogRecordsMethod = InstanceGroupServiceGrpc.getListLogRecordsMethod) == null) {
          InstanceGroupServiceGrpc.getListLogRecordsMethod = getListLogRecordsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupLogRecordsRequest, yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupLogRecordsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListLogRecords"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupLogRecordsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupLogRecordsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InstanceGroupServiceMethodDescriptorSupplier("ListLogRecords"))
              .build();
        }
      }
    }
    return getListLogRecordsMethod;
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
    if ((getListAccessBindingsMethod = InstanceGroupServiceGrpc.getListAccessBindingsMethod) == null) {
      synchronized (InstanceGroupServiceGrpc.class) {
        if ((getListAccessBindingsMethod = InstanceGroupServiceGrpc.getListAccessBindingsMethod) == null) {
          InstanceGroupServiceGrpc.getListAccessBindingsMethod = getListAccessBindingsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.ListAccessBindingsRequest, yandex.cloud.api.access.Access.ListAccessBindingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.ListAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.ListAccessBindingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InstanceGroupServiceMethodDescriptorSupplier("ListAccessBindings"))
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
    if ((getSetAccessBindingsMethod = InstanceGroupServiceGrpc.getSetAccessBindingsMethod) == null) {
      synchronized (InstanceGroupServiceGrpc.class) {
        if ((getSetAccessBindingsMethod = InstanceGroupServiceGrpc.getSetAccessBindingsMethod) == null) {
          InstanceGroupServiceGrpc.getSetAccessBindingsMethod = getSetAccessBindingsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.SetAccessBindingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.SetAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new InstanceGroupServiceMethodDescriptorSupplier("SetAccessBindings"))
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
    if ((getUpdateAccessBindingsMethod = InstanceGroupServiceGrpc.getUpdateAccessBindingsMethod) == null) {
      synchronized (InstanceGroupServiceGrpc.class) {
        if ((getUpdateAccessBindingsMethod = InstanceGroupServiceGrpc.getUpdateAccessBindingsMethod) == null) {
          InstanceGroupServiceGrpc.getUpdateAccessBindingsMethod = getUpdateAccessBindingsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.UpdateAccessBindingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.UpdateAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new InstanceGroupServiceMethodDescriptorSupplier("UpdateAccessBindings"))
              .build();
        }
      }
    }
    return getUpdateAccessBindingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ResumeInstanceGroupProcessesRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getResumeProcessesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResumeProcesses",
      requestType = yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ResumeInstanceGroupProcessesRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ResumeInstanceGroupProcessesRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getResumeProcessesMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ResumeInstanceGroupProcessesRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getResumeProcessesMethod;
    if ((getResumeProcessesMethod = InstanceGroupServiceGrpc.getResumeProcessesMethod) == null) {
      synchronized (InstanceGroupServiceGrpc.class) {
        if ((getResumeProcessesMethod = InstanceGroupServiceGrpc.getResumeProcessesMethod) == null) {
          InstanceGroupServiceGrpc.getResumeProcessesMethod = getResumeProcessesMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ResumeInstanceGroupProcessesRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResumeProcesses"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ResumeInstanceGroupProcessesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new InstanceGroupServiceMethodDescriptorSupplier("ResumeProcesses"))
              .build();
        }
      }
    }
    return getResumeProcessesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.PauseInstanceGroupProcessesRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getPauseProcessesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PauseProcesses",
      requestType = yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.PauseInstanceGroupProcessesRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.PauseInstanceGroupProcessesRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getPauseProcessesMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.PauseInstanceGroupProcessesRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getPauseProcessesMethod;
    if ((getPauseProcessesMethod = InstanceGroupServiceGrpc.getPauseProcessesMethod) == null) {
      synchronized (InstanceGroupServiceGrpc.class) {
        if ((getPauseProcessesMethod = InstanceGroupServiceGrpc.getPauseProcessesMethod) == null) {
          InstanceGroupServiceGrpc.getPauseProcessesMethod = getPauseProcessesMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.PauseInstanceGroupProcessesRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PauseProcesses"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.PauseInstanceGroupProcessesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new InstanceGroupServiceMethodDescriptorSupplier("PauseProcesses"))
              .build();
        }
      }
    }
    return getPauseProcessesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static InstanceGroupServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InstanceGroupServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InstanceGroupServiceStub>() {
        @java.lang.Override
        public InstanceGroupServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InstanceGroupServiceStub(channel, callOptions);
        }
      };
    return InstanceGroupServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static InstanceGroupServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InstanceGroupServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InstanceGroupServiceBlockingStub>() {
        @java.lang.Override
        public InstanceGroupServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InstanceGroupServiceBlockingStub(channel, callOptions);
        }
      };
    return InstanceGroupServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static InstanceGroupServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InstanceGroupServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InstanceGroupServiceFutureStub>() {
        @java.lang.Override
        public InstanceGroupServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InstanceGroupServiceFutureStub(channel, callOptions);
        }
      };
    return InstanceGroupServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing InstanceGroup resources.
   * </pre>
   */
  public static abstract class InstanceGroupServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified InstanceGroup resource.
     * To get the list of available InstanceGroup resources, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.GetInstanceGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupOuterClass.InstanceGroup> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of InstanceGroup resources in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates an instance group in the specified folder.
     * This method starts an operation that can be cancelled by another operation.
     * </pre>
     */
    public void create(yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.CreateInstanceGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates an instance group in the specified folder from a YAML file.
     * This method starts an operation that can be cancelled by another operation.
     * </pre>
     */
    public void createFromYaml(yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.CreateInstanceGroupFromYamlRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateFromYamlMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified instance group.
     * This method starts an operation that can be cancelled by another operation.
     * </pre>
     */
    public void update(yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.UpdateInstanceGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified instance group from a YAML file.
     * This method starts an operation that can be cancelled by another operation.
     * </pre>
     */
    public void updateFromYaml(yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.UpdateInstanceGroupFromYamlRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateFromYamlMethod(), responseObserver);
    }

    /**
     * <pre>
     * Stops the specified instance group.
     * </pre>
     */
    public void stop(yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.StopInstanceGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStopMethod(), responseObserver);
    }

    /**
     * <pre>
     * Starts the specified instance group.
     * </pre>
     */
    public void start(yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.StartInstanceGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStartMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified instance group.
     * </pre>
     */
    public void delete(yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.DeleteInstanceGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists instances for the specified instance group.
     * </pre>
     */
    public void listInstances(yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupInstancesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupInstancesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListInstancesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete instances from the instance group.
     * </pre>
     */
    public void deleteInstances(yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.DeleteInstancesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteInstancesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Stop instances from the instance group.
     * </pre>
     */
    public void stopInstances(yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.StopInstancesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStopInstancesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified instance group.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupOperationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists logs for the specified instance group.
     * </pre>
     */
    public void listLogRecords(yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupLogRecordsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupLogRecordsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListLogRecordsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists existing access bindings for the specified instance group.
     * </pre>
     */
    public void listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.access.Access.ListAccessBindingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAccessBindingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sets access bindings for the specified instance group.
     * </pre>
     */
    public void setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetAccessBindingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates access bindings for the specified instance group.
     * </pre>
     */
    public void updateAccessBindings(yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAccessBindingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Resumes all processes regarding management of the specified instance group,
     * i.e. scaling, checking instances' health, auto-healing and updating them.
     * </pre>
     */
    public void resumeProcesses(yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ResumeInstanceGroupProcessesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResumeProcessesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Pauses all processes regarding management of the specified instance group,
     * i.e. scaling, checking instances' health, auto-healing and updating them. Running instances are not stopped.
     * </pre>
     */
    public void pauseProcesses(yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.PauseInstanceGroupProcessesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPauseProcessesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.GetInstanceGroupRequest,
                yandex.cloud.api.compute.v1.instancegroup.InstanceGroupOuterClass.InstanceGroup>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupsRequest,
                yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupsResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.CreateInstanceGroupRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getCreateFromYamlMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.CreateInstanceGroupFromYamlRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE_FROM_YAML)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.UpdateInstanceGroupRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getUpdateFromYamlMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.UpdateInstanceGroupFromYamlRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE_FROM_YAML)))
          .addMethod(
            getStopMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.StopInstanceGroupRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_STOP)))
          .addMethod(
            getStartMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.StartInstanceGroupRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_START)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.DeleteInstanceGroupRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListInstancesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupInstancesRequest,
                yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupInstancesResponse>(
                  this, METHODID_LIST_INSTANCES)))
          .addMethod(
            getDeleteInstancesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.DeleteInstancesRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE_INSTANCES)))
          .addMethod(
            getStopInstancesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.StopInstancesRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_STOP_INSTANCES)))
          .addMethod(
            getListOperationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupOperationsRequest,
                yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupOperationsResponse>(
                  this, METHODID_LIST_OPERATIONS)))
          .addMethod(
            getListLogRecordsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupLogRecordsRequest,
                yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupLogRecordsResponse>(
                  this, METHODID_LIST_LOG_RECORDS)))
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
            getResumeProcessesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ResumeInstanceGroupProcessesRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_RESUME_PROCESSES)))
          .addMethod(
            getPauseProcessesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.PauseInstanceGroupProcessesRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_PAUSE_PROCESSES)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing InstanceGroup resources.
   * </pre>
   */
  public static final class InstanceGroupServiceStub extends io.grpc.stub.AbstractAsyncStub<InstanceGroupServiceStub> {
    private InstanceGroupServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InstanceGroupServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InstanceGroupServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified InstanceGroup resource.
     * To get the list of available InstanceGroup resources, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.GetInstanceGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupOuterClass.InstanceGroup> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of InstanceGroup resources in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates an instance group in the specified folder.
     * This method starts an operation that can be cancelled by another operation.
     * </pre>
     */
    public void create(yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.CreateInstanceGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates an instance group in the specified folder from a YAML file.
     * This method starts an operation that can be cancelled by another operation.
     * </pre>
     */
    public void createFromYaml(yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.CreateInstanceGroupFromYamlRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateFromYamlMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified instance group.
     * This method starts an operation that can be cancelled by another operation.
     * </pre>
     */
    public void update(yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.UpdateInstanceGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified instance group from a YAML file.
     * This method starts an operation that can be cancelled by another operation.
     * </pre>
     */
    public void updateFromYaml(yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.UpdateInstanceGroupFromYamlRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateFromYamlMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Stops the specified instance group.
     * </pre>
     */
    public void stop(yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.StopInstanceGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStopMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Starts the specified instance group.
     * </pre>
     */
    public void start(yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.StartInstanceGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified instance group.
     * </pre>
     */
    public void delete(yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.DeleteInstanceGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists instances for the specified instance group.
     * </pre>
     */
    public void listInstances(yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupInstancesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupInstancesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListInstancesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete instances from the instance group.
     * </pre>
     */
    public void deleteInstances(yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.DeleteInstancesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteInstancesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Stop instances from the instance group.
     * </pre>
     */
    public void stopInstances(yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.StopInstancesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStopInstancesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified instance group.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupOperationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists logs for the specified instance group.
     * </pre>
     */
    public void listLogRecords(yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupLogRecordsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupLogRecordsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListLogRecordsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists existing access bindings for the specified instance group.
     * </pre>
     */
    public void listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.access.Access.ListAccessBindingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sets access bindings for the specified instance group.
     * </pre>
     */
    public void setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates access bindings for the specified instance group.
     * </pre>
     */
    public void updateAccessBindings(yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Resumes all processes regarding management of the specified instance group,
     * i.e. scaling, checking instances' health, auto-healing and updating them.
     * </pre>
     */
    public void resumeProcesses(yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ResumeInstanceGroupProcessesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResumeProcessesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Pauses all processes regarding management of the specified instance group,
     * i.e. scaling, checking instances' health, auto-healing and updating them. Running instances are not stopped.
     * </pre>
     */
    public void pauseProcesses(yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.PauseInstanceGroupProcessesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPauseProcessesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing InstanceGroup resources.
   * </pre>
   */
  public static final class InstanceGroupServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<InstanceGroupServiceBlockingStub> {
    private InstanceGroupServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InstanceGroupServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InstanceGroupServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified InstanceGroup resource.
     * To get the list of available InstanceGroup resources, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.compute.v1.instancegroup.InstanceGroupOuterClass.InstanceGroup get(yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.GetInstanceGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of InstanceGroup resources in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupsResponse list(yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates an instance group in the specified folder.
     * This method starts an operation that can be cancelled by another operation.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.CreateInstanceGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates an instance group in the specified folder from a YAML file.
     * This method starts an operation that can be cancelled by another operation.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation createFromYaml(yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.CreateInstanceGroupFromYamlRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateFromYamlMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified instance group.
     * This method starts an operation that can be cancelled by another operation.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.UpdateInstanceGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified instance group from a YAML file.
     * This method starts an operation that can be cancelled by another operation.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation updateFromYaml(yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.UpdateInstanceGroupFromYamlRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateFromYamlMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Stops the specified instance group.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation stop(yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.StopInstanceGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStopMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Starts the specified instance group.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation start(yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.StartInstanceGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStartMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified instance group.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.DeleteInstanceGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists instances for the specified instance group.
     * </pre>
     */
    public yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupInstancesResponse listInstances(yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupInstancesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListInstancesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete instances from the instance group.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation deleteInstances(yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.DeleteInstancesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteInstancesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Stop instances from the instance group.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation stopInstances(yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.StopInstancesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStopInstancesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists operations for the specified instance group.
     * </pre>
     */
    public yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupOperationsResponse listOperations(yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupOperationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists logs for the specified instance group.
     * </pre>
     */
    public yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupLogRecordsResponse listLogRecords(yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupLogRecordsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListLogRecordsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists existing access bindings for the specified instance group.
     * </pre>
     */
    public yandex.cloud.api.access.Access.ListAccessBindingsResponse listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAccessBindingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets access bindings for the specified instance group.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetAccessBindingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates access bindings for the specified instance group.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation updateAccessBindings(yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAccessBindingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Resumes all processes regarding management of the specified instance group,
     * i.e. scaling, checking instances' health, auto-healing and updating them.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation resumeProcesses(yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ResumeInstanceGroupProcessesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResumeProcessesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Pauses all processes regarding management of the specified instance group,
     * i.e. scaling, checking instances' health, auto-healing and updating them. Running instances are not stopped.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation pauseProcesses(yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.PauseInstanceGroupProcessesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPauseProcessesMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing InstanceGroup resources.
   * </pre>
   */
  public static final class InstanceGroupServiceFutureStub extends io.grpc.stub.AbstractFutureStub<InstanceGroupServiceFutureStub> {
    private InstanceGroupServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InstanceGroupServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InstanceGroupServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified InstanceGroup resource.
     * To get the list of available InstanceGroup resources, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupOuterClass.InstanceGroup> get(
        yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.GetInstanceGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of InstanceGroup resources in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupsResponse> list(
        yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates an instance group in the specified folder.
     * This method starts an operation that can be cancelled by another operation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.CreateInstanceGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates an instance group in the specified folder from a YAML file.
     * This method starts an operation that can be cancelled by another operation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> createFromYaml(
        yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.CreateInstanceGroupFromYamlRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateFromYamlMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified instance group.
     * This method starts an operation that can be cancelled by another operation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.UpdateInstanceGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified instance group from a YAML file.
     * This method starts an operation that can be cancelled by another operation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> updateFromYaml(
        yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.UpdateInstanceGroupFromYamlRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateFromYamlMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Stops the specified instance group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> stop(
        yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.StopInstanceGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStopMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Starts the specified instance group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> start(
        yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.StartInstanceGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStartMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified instance group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.DeleteInstanceGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists instances for the specified instance group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupInstancesResponse> listInstances(
        yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupInstancesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListInstancesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete instances from the instance group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> deleteInstances(
        yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.DeleteInstancesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteInstancesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Stop instances from the instance group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> stopInstances(
        yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.StopInstancesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStopInstancesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists operations for the specified instance group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupOperationsResponse> listOperations(
        yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupOperationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists logs for the specified instance group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupLogRecordsResponse> listLogRecords(
        yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupLogRecordsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListLogRecordsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists existing access bindings for the specified instance group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.access.Access.ListAccessBindingsResponse> listAccessBindings(
        yandex.cloud.api.access.Access.ListAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAccessBindingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sets access bindings for the specified instance group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> setAccessBindings(
        yandex.cloud.api.access.Access.SetAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetAccessBindingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates access bindings for the specified instance group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> updateAccessBindings(
        yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAccessBindingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Resumes all processes regarding management of the specified instance group,
     * i.e. scaling, checking instances' health, auto-healing and updating them.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> resumeProcesses(
        yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ResumeInstanceGroupProcessesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResumeProcessesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Pauses all processes regarding management of the specified instance group,
     * i.e. scaling, checking instances' health, auto-healing and updating them. Running instances are not stopped.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> pauseProcesses(
        yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.PauseInstanceGroupProcessesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPauseProcessesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_CREATE_FROM_YAML = 3;
  private static final int METHODID_UPDATE = 4;
  private static final int METHODID_UPDATE_FROM_YAML = 5;
  private static final int METHODID_STOP = 6;
  private static final int METHODID_START = 7;
  private static final int METHODID_DELETE = 8;
  private static final int METHODID_LIST_INSTANCES = 9;
  private static final int METHODID_DELETE_INSTANCES = 10;
  private static final int METHODID_STOP_INSTANCES = 11;
  private static final int METHODID_LIST_OPERATIONS = 12;
  private static final int METHODID_LIST_LOG_RECORDS = 13;
  private static final int METHODID_LIST_ACCESS_BINDINGS = 14;
  private static final int METHODID_SET_ACCESS_BINDINGS = 15;
  private static final int METHODID_UPDATE_ACCESS_BINDINGS = 16;
  private static final int METHODID_RESUME_PROCESSES = 17;
  private static final int METHODID_PAUSE_PROCESSES = 18;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final InstanceGroupServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(InstanceGroupServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.GetInstanceGroupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupOuterClass.InstanceGroup>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupsResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.CreateInstanceGroupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_CREATE_FROM_YAML:
          serviceImpl.createFromYaml((yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.CreateInstanceGroupFromYamlRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.UpdateInstanceGroupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE_FROM_YAML:
          serviceImpl.updateFromYaml((yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.UpdateInstanceGroupFromYamlRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_STOP:
          serviceImpl.stop((yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.StopInstanceGroupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_START:
          serviceImpl.start((yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.StartInstanceGroupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.DeleteInstanceGroupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_INSTANCES:
          serviceImpl.listInstances((yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupInstancesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupInstancesResponse>) responseObserver);
          break;
        case METHODID_DELETE_INSTANCES:
          serviceImpl.deleteInstances((yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.DeleteInstancesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_STOP_INSTANCES:
          serviceImpl.stopInstances((yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.StopInstancesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupOperationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupOperationsResponse>) responseObserver);
          break;
        case METHODID_LIST_LOG_RECORDS:
          serviceImpl.listLogRecords((yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupLogRecordsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupLogRecordsResponse>) responseObserver);
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
        case METHODID_RESUME_PROCESSES:
          serviceImpl.resumeProcesses((yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ResumeInstanceGroupProcessesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_PAUSE_PROCESSES:
          serviceImpl.pauseProcesses((yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.PauseInstanceGroupProcessesRequest) request,
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

  private static abstract class InstanceGroupServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    InstanceGroupServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("InstanceGroupService");
    }
  }

  private static final class InstanceGroupServiceFileDescriptorSupplier
      extends InstanceGroupServiceBaseDescriptorSupplier {
    InstanceGroupServiceFileDescriptorSupplier() {}
  }

  private static final class InstanceGroupServiceMethodDescriptorSupplier
      extends InstanceGroupServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    InstanceGroupServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (InstanceGroupServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new InstanceGroupServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .addMethod(getCreateFromYamlMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getUpdateFromYamlMethod())
              .addMethod(getStopMethod())
              .addMethod(getStartMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getListInstancesMethod())
              .addMethod(getDeleteInstancesMethod())
              .addMethod(getStopInstancesMethod())
              .addMethod(getListOperationsMethod())
              .addMethod(getListLogRecordsMethod())
              .addMethod(getListAccessBindingsMethod())
              .addMethod(getSetAccessBindingsMethod())
              .addMethod(getUpdateAccessBindingsMethod())
              .addMethod(getResumeProcessesMethod())
              .addMethod(getPauseProcessesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
