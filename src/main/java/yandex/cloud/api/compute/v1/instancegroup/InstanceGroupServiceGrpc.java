package yandex.cloud.api.compute.v1.instancegroup;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * A set of methods for managing InstanceGroup resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.0)",
    comments = "Source: yandex/cloud/compute/v1/instancegroup/instance_group_service.proto")
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
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.compute.v1.instancegroup.InstanceGroupService", "Get"))
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
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.compute.v1.instancegroup.InstanceGroupService", "List"))
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
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.compute.v1.instancegroup.InstanceGroupService", "Create"))
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
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.compute.v1.instancegroup.InstanceGroupService", "CreateFromYaml"))
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
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.compute.v1.instancegroup.InstanceGroupService", "Update"))
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
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.compute.v1.instancegroup.InstanceGroupService", "UpdateFromYaml"))
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
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.compute.v1.instancegroup.InstanceGroupService", "Stop"))
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
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.compute.v1.instancegroup.InstanceGroupService", "Start"))
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
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.compute.v1.instancegroup.InstanceGroupService", "Delete"))
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
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.compute.v1.instancegroup.InstanceGroupService", "ListInstances"))
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
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.compute.v1.instancegroup.InstanceGroupService", "ListOperations"))
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
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.compute.v1.instancegroup.InstanceGroupService", "ListLogRecords"))
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

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static InstanceGroupServiceStub newStub(io.grpc.Channel channel) {
    return new InstanceGroupServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static InstanceGroupServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new InstanceGroupServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static InstanceGroupServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new InstanceGroupServiceFutureStub(channel);
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
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of InstanceGroup resources in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates an instance group in the specified folder.
     * This method starts an operation that can be cancelled by another operation.
     * </pre>
     */
    public void create(yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.CreateInstanceGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates an instance group in the specified folder from a YAML file.
     * This method starts an operation that can be cancelled by another operation.
     * </pre>
     */
    public void createFromYaml(yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.CreateInstanceGroupFromYamlRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateFromYamlMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified instance group.
     * This method starts an operation that can be cancelled by another operation.
     * </pre>
     */
    public void update(yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.UpdateInstanceGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified instance group from a YAML file.
     * This method starts an operation that can be cancelled by another operation.
     * </pre>
     */
    public void updateFromYaml(yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.UpdateInstanceGroupFromYamlRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateFromYamlMethod(), responseObserver);
    }

    /**
     * <pre>
     * Stops the specified instance group.
     * </pre>
     */
    public void stop(yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.StopInstanceGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getStopMethod(), responseObserver);
    }

    /**
     * <pre>
     * Starts the specified instance group.
     * </pre>
     */
    public void start(yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.StartInstanceGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getStartMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified instance group.
     * </pre>
     */
    public void delete(yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.DeleteInstanceGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists instances for the specified instance group.
     * </pre>
     */
    public void listInstances(yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupInstancesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupInstancesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListInstancesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified instance group.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupOperationsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists logs for the specified instance group.
     * </pre>
     */
    public void listLogRecords(yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupLogRecordsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupLogRecordsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListLogRecordsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.GetInstanceGroupRequest,
                yandex.cloud.api.compute.v1.instancegroup.InstanceGroupOuterClass.InstanceGroup>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupsRequest,
                yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupsResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.CreateInstanceGroupRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getCreateFromYamlMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.CreateInstanceGroupFromYamlRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE_FROM_YAML)))
          .addMethod(
            getUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.UpdateInstanceGroupRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getUpdateFromYamlMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.UpdateInstanceGroupFromYamlRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE_FROM_YAML)))
          .addMethod(
            getStopMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.StopInstanceGroupRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_STOP)))
          .addMethod(
            getStartMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.StartInstanceGroupRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_START)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.DeleteInstanceGroupRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListInstancesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupInstancesRequest,
                yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupInstancesResponse>(
                  this, METHODID_LIST_INSTANCES)))
          .addMethod(
            getListOperationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupOperationsRequest,
                yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupOperationsResponse>(
                  this, METHODID_LIST_OPERATIONS)))
          .addMethod(
            getListLogRecordsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupLogRecordsRequest,
                yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupLogRecordsResponse>(
                  this, METHODID_LIST_LOG_RECORDS)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing InstanceGroup resources.
   * </pre>
   */
  public static final class InstanceGroupServiceStub extends io.grpc.stub.AbstractStub<InstanceGroupServiceStub> {
    private InstanceGroupServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InstanceGroupServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InstanceGroupServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
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
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of InstanceGroup resources in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupsResponse> responseObserver) {
      asyncUnaryCall(
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
      asyncUnaryCall(
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
      asyncUnaryCall(
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
      asyncUnaryCall(
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
      asyncUnaryCall(
          getChannel().newCall(getUpdateFromYamlMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Stops the specified instance group.
     * </pre>
     */
    public void stop(yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.StopInstanceGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStopMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Starts the specified instance group.
     * </pre>
     */
    public void start(yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.StartInstanceGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified instance group.
     * </pre>
     */
    public void delete(yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.DeleteInstanceGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists instances for the specified instance group.
     * </pre>
     */
    public void listInstances(yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupInstancesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupInstancesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListInstancesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified instance group.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupOperationsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists logs for the specified instance group.
     * </pre>
     */
    public void listLogRecords(yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupLogRecordsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupLogRecordsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListLogRecordsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing InstanceGroup resources.
   * </pre>
   */
  public static final class InstanceGroupServiceBlockingStub extends io.grpc.stub.AbstractStub<InstanceGroupServiceBlockingStub> {
    private InstanceGroupServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InstanceGroupServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InstanceGroupServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InstanceGroupServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified InstanceGroup resource.
     * To get the list of available InstanceGroup resources, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.compute.v1.instancegroup.InstanceGroupOuterClass.InstanceGroup get(yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.GetInstanceGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of InstanceGroup resources in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupsResponse list(yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates an instance group in the specified folder.
     * This method starts an operation that can be cancelled by another operation.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.CreateInstanceGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates an instance group in the specified folder from a YAML file.
     * This method starts an operation that can be cancelled by another operation.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation createFromYaml(yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.CreateInstanceGroupFromYamlRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateFromYamlMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified instance group.
     * This method starts an operation that can be cancelled by another operation.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.UpdateInstanceGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified instance group from a YAML file.
     * This method starts an operation that can be cancelled by another operation.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation updateFromYaml(yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.UpdateInstanceGroupFromYamlRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateFromYamlMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Stops the specified instance group.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation stop(yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.StopInstanceGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getStopMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Starts the specified instance group.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation start(yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.StartInstanceGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getStartMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified instance group.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.DeleteInstanceGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists instances for the specified instance group.
     * </pre>
     */
    public yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupInstancesResponse listInstances(yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupInstancesRequest request) {
      return blockingUnaryCall(
          getChannel(), getListInstancesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists operations for the specified instance group.
     * </pre>
     */
    public yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupOperationsResponse listOperations(yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupOperationsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists logs for the specified instance group.
     * </pre>
     */
    public yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupLogRecordsResponse listLogRecords(yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupLogRecordsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListLogRecordsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing InstanceGroup resources.
   * </pre>
   */
  public static final class InstanceGroupServiceFutureStub extends io.grpc.stub.AbstractStub<InstanceGroupServiceFutureStub> {
    private InstanceGroupServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InstanceGroupServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InstanceGroupServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
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
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of InstanceGroup resources in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupsResponse> list(
        yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupsRequest request) {
      return futureUnaryCall(
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
      return futureUnaryCall(
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
      return futureUnaryCall(
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
      return futureUnaryCall(
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
      return futureUnaryCall(
          getChannel().newCall(getUpdateFromYamlMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Stops the specified instance group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> stop(
        yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.StopInstanceGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStopMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Starts the specified instance group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> start(
        yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.StartInstanceGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStartMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified instance group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.DeleteInstanceGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists instances for the specified instance group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupInstancesResponse> listInstances(
        yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupInstancesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListInstancesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists operations for the specified instance group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupOperationsResponse> listOperations(
        yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupOperationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists logs for the specified instance group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupLogRecordsResponse> listLogRecords(
        yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupLogRecordsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListLogRecordsMethod(), getCallOptions()), request);
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
  private static final int METHODID_LIST_OPERATIONS = 10;
  private static final int METHODID_LIST_LOG_RECORDS = 11;

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
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupOperationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupOperationsResponse>) responseObserver);
          break;
        case METHODID_LIST_LOG_RECORDS:
          serviceImpl.listLogRecords((yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupLogRecordsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.instancegroup.InstanceGroupServiceOuterClass.ListInstanceGroupLogRecordsResponse>) responseObserver);
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
              .addMethod(getListOperationsMethod())
              .addMethod(getListLogRecordsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
