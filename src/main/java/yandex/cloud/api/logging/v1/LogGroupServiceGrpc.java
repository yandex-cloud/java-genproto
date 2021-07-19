package yandex.cloud.api.logging.v1;

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
 * A set of methods for managing log groups.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.0)",
    comments = "Source: yandex/cloud/logging/v1/log_group_service.proto")
public final class LogGroupServiceGrpc {

  private LogGroupServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.logging.v1.LogGroupService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetLogGroupRequest,
      yandex.cloud.api.logging.v1.LogGroupOuterClass.LogGroup> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetLogGroupRequest.class,
      responseType = yandex.cloud.api.logging.v1.LogGroupOuterClass.LogGroup.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetLogGroupRequest,
      yandex.cloud.api.logging.v1.LogGroupOuterClass.LogGroup> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetLogGroupRequest, yandex.cloud.api.logging.v1.LogGroupOuterClass.LogGroup> getGetMethod;
    if ((getGetMethod = LogGroupServiceGrpc.getGetMethod) == null) {
      synchronized (LogGroupServiceGrpc.class) {
        if ((getGetMethod = LogGroupServiceGrpc.getGetMethod) == null) {
          LogGroupServiceGrpc.getGetMethod = getGetMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetLogGroupRequest, yandex.cloud.api.logging.v1.LogGroupOuterClass.LogGroup>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.logging.v1.LogGroupService", "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetLogGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.logging.v1.LogGroupOuterClass.LogGroup.getDefaultInstance()))
                  .setSchemaDescriptor(new LogGroupServiceMethodDescriptorSupplier("Get"))
                  .build();
          }
        }
     }
     return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetDefaultLogGroupRequest,
      yandex.cloud.api.logging.v1.LogGroupOuterClass.LogGroup> getGetDefaultMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDefault",
      requestType = yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetDefaultLogGroupRequest.class,
      responseType = yandex.cloud.api.logging.v1.LogGroupOuterClass.LogGroup.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetDefaultLogGroupRequest,
      yandex.cloud.api.logging.v1.LogGroupOuterClass.LogGroup> getGetDefaultMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetDefaultLogGroupRequest, yandex.cloud.api.logging.v1.LogGroupOuterClass.LogGroup> getGetDefaultMethod;
    if ((getGetDefaultMethod = LogGroupServiceGrpc.getGetDefaultMethod) == null) {
      synchronized (LogGroupServiceGrpc.class) {
        if ((getGetDefaultMethod = LogGroupServiceGrpc.getGetDefaultMethod) == null) {
          LogGroupServiceGrpc.getGetDefaultMethod = getGetDefaultMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetDefaultLogGroupRequest, yandex.cloud.api.logging.v1.LogGroupOuterClass.LogGroup>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.logging.v1.LogGroupService", "GetDefault"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetDefaultLogGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.logging.v1.LogGroupOuterClass.LogGroup.getDefaultInstance()))
                  .setSchemaDescriptor(new LogGroupServiceMethodDescriptorSupplier("GetDefault"))
                  .build();
          }
        }
     }
     return getGetDefaultMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetLogGroupStatsRequest,
      yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetLogGroupStatsResponse> getStatsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Stats",
      requestType = yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetLogGroupStatsRequest.class,
      responseType = yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetLogGroupStatsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetLogGroupStatsRequest,
      yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetLogGroupStatsResponse> getStatsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetLogGroupStatsRequest, yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetLogGroupStatsResponse> getStatsMethod;
    if ((getStatsMethod = LogGroupServiceGrpc.getStatsMethod) == null) {
      synchronized (LogGroupServiceGrpc.class) {
        if ((getStatsMethod = LogGroupServiceGrpc.getStatsMethod) == null) {
          LogGroupServiceGrpc.getStatsMethod = getStatsMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetLogGroupStatsRequest, yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetLogGroupStatsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.logging.v1.LogGroupService", "Stats"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetLogGroupStatsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetLogGroupStatsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LogGroupServiceMethodDescriptorSupplier("Stats"))
                  .build();
          }
        }
     }
     return getStatsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListLogGroupsRequest,
      yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListLogGroupsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListLogGroupsRequest.class,
      responseType = yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListLogGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListLogGroupsRequest,
      yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListLogGroupsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListLogGroupsRequest, yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListLogGroupsResponse> getListMethod;
    if ((getListMethod = LogGroupServiceGrpc.getListMethod) == null) {
      synchronized (LogGroupServiceGrpc.class) {
        if ((getListMethod = LogGroupServiceGrpc.getListMethod) == null) {
          LogGroupServiceGrpc.getListMethod = getListMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListLogGroupsRequest, yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListLogGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.logging.v1.LogGroupService", "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListLogGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListLogGroupsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LogGroupServiceMethodDescriptorSupplier("List"))
                  .build();
          }
        }
     }
     return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.CreateLogGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.CreateLogGroupRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.CreateLogGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.CreateLogGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = LogGroupServiceGrpc.getCreateMethod) == null) {
      synchronized (LogGroupServiceGrpc.class) {
        if ((getCreateMethod = LogGroupServiceGrpc.getCreateMethod) == null) {
          LogGroupServiceGrpc.getCreateMethod = getCreateMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.CreateLogGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.logging.v1.LogGroupService", "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.CreateLogGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new LogGroupServiceMethodDescriptorSupplier("Create"))
                  .build();
          }
        }
     }
     return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.UpdateLogGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.UpdateLogGroupRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.UpdateLogGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.UpdateLogGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = LogGroupServiceGrpc.getUpdateMethod) == null) {
      synchronized (LogGroupServiceGrpc.class) {
        if ((getUpdateMethod = LogGroupServiceGrpc.getUpdateMethod) == null) {
          LogGroupServiceGrpc.getUpdateMethod = getUpdateMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.UpdateLogGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.logging.v1.LogGroupService", "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.UpdateLogGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new LogGroupServiceMethodDescriptorSupplier("Update"))
                  .build();
          }
        }
     }
     return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.DeleteLogGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.DeleteLogGroupRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.DeleteLogGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.DeleteLogGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = LogGroupServiceGrpc.getDeleteMethod) == null) {
      synchronized (LogGroupServiceGrpc.class) {
        if ((getDeleteMethod = LogGroupServiceGrpc.getDeleteMethod) == null) {
          LogGroupServiceGrpc.getDeleteMethod = getDeleteMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.DeleteLogGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.logging.v1.LogGroupService", "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.DeleteLogGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new LogGroupServiceMethodDescriptorSupplier("Delete"))
                  .build();
          }
        }
     }
     return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListResourcesRequest,
      yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListResourcesResponse> getListResourcesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListResources",
      requestType = yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListResourcesRequest.class,
      responseType = yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListResourcesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListResourcesRequest,
      yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListResourcesResponse> getListResourcesMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListResourcesRequest, yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListResourcesResponse> getListResourcesMethod;
    if ((getListResourcesMethod = LogGroupServiceGrpc.getListResourcesMethod) == null) {
      synchronized (LogGroupServiceGrpc.class) {
        if ((getListResourcesMethod = LogGroupServiceGrpc.getListResourcesMethod) == null) {
          LogGroupServiceGrpc.getListResourcesMethod = getListResourcesMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListResourcesRequest, yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListResourcesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.logging.v1.LogGroupService", "ListResources"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListResourcesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListResourcesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LogGroupServiceMethodDescriptorSupplier("ListResources"))
                  .build();
          }
        }
     }
     return getListResourcesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListOperationsRequest,
      yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListOperationsResponse> getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListOperationsRequest.class,
      responseType = yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListOperationsRequest,
      yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListOperationsResponse> getListOperationsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListOperationsRequest, yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListOperationsResponse> getListOperationsMethod;
    if ((getListOperationsMethod = LogGroupServiceGrpc.getListOperationsMethod) == null) {
      synchronized (LogGroupServiceGrpc.class) {
        if ((getListOperationsMethod = LogGroupServiceGrpc.getListOperationsMethod) == null) {
          LogGroupServiceGrpc.getListOperationsMethod = getListOperationsMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListOperationsRequest, yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.logging.v1.LogGroupService", "ListOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListOperationsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LogGroupServiceMethodDescriptorSupplier("ListOperations"))
                  .build();
          }
        }
     }
     return getListOperationsMethod;
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
    if ((getListAccessBindingsMethod = LogGroupServiceGrpc.getListAccessBindingsMethod) == null) {
      synchronized (LogGroupServiceGrpc.class) {
        if ((getListAccessBindingsMethod = LogGroupServiceGrpc.getListAccessBindingsMethod) == null) {
          LogGroupServiceGrpc.getListAccessBindingsMethod = getListAccessBindingsMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.ListAccessBindingsRequest, yandex.cloud.api.access.Access.ListAccessBindingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.logging.v1.LogGroupService", "ListAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.ListAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.ListAccessBindingsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LogGroupServiceMethodDescriptorSupplier("ListAccessBindings"))
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
    if ((getSetAccessBindingsMethod = LogGroupServiceGrpc.getSetAccessBindingsMethod) == null) {
      synchronized (LogGroupServiceGrpc.class) {
        if ((getSetAccessBindingsMethod = LogGroupServiceGrpc.getSetAccessBindingsMethod) == null) {
          LogGroupServiceGrpc.getSetAccessBindingsMethod = getSetAccessBindingsMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.SetAccessBindingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.logging.v1.LogGroupService", "SetAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.SetAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new LogGroupServiceMethodDescriptorSupplier("SetAccessBindings"))
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
    if ((getUpdateAccessBindingsMethod = LogGroupServiceGrpc.getUpdateAccessBindingsMethod) == null) {
      synchronized (LogGroupServiceGrpc.class) {
        if ((getUpdateAccessBindingsMethod = LogGroupServiceGrpc.getUpdateAccessBindingsMethod) == null) {
          LogGroupServiceGrpc.getUpdateAccessBindingsMethod = getUpdateAccessBindingsMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.UpdateAccessBindingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.logging.v1.LogGroupService", "UpdateAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.UpdateAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new LogGroupServiceMethodDescriptorSupplier("UpdateAccessBindings"))
                  .build();
          }
        }
     }
     return getUpdateAccessBindingsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LogGroupServiceStub newStub(io.grpc.Channel channel) {
    return new LogGroupServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LogGroupServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new LogGroupServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LogGroupServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new LogGroupServiceFutureStub(channel);
  }

  /**
   * <pre>
   * A set of methods for managing log groups.
   * </pre>
   */
  public static abstract class LogGroupServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified log group.
     * To get the list of all available log groups, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetLogGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.logging.v1.LogGroupOuterClass.LogGroup> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns default log group for the folder.
     * To get the list of all available log groups, make a [List] request.
     * </pre>
     */
    public void getDefault(yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetDefaultLogGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.logging.v1.LogGroupOuterClass.LogGroup> responseObserver) {
      asyncUnimplementedUnaryCall(getGetDefaultMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns stats for the specified log group.
     * </pre>
     */
    public void stats(yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetLogGroupStatsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetLogGroupStatsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStatsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of log groups in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListLogGroupsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListLogGroupsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a log group in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.CreateLogGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified log group.
     * </pre>
     */
    public void update(yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.UpdateLogGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified log group.
     * </pre>
     */
    public void delete(yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.DeleteLogGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the resources (type and IDs) in the specified log group.
     * </pre>
     */
    public void listResources(yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListResourcesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListResourcesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListResourcesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified log group.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListOperationsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists existing access bindings for the specified log group.
     * </pre>
     */
    public void listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.access.Access.ListAccessBindingsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListAccessBindingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sets access bindings for the specified log group.
     * </pre>
     */
    public void setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getSetAccessBindingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates access bindings for the specified log group.
     * </pre>
     */
    public void updateAccessBindings(yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateAccessBindingsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetLogGroupRequest,
                yandex.cloud.api.logging.v1.LogGroupOuterClass.LogGroup>(
                  this, METHODID_GET)))
          .addMethod(
            getGetDefaultMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetDefaultLogGroupRequest,
                yandex.cloud.api.logging.v1.LogGroupOuterClass.LogGroup>(
                  this, METHODID_GET_DEFAULT)))
          .addMethod(
            getStatsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetLogGroupStatsRequest,
                yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetLogGroupStatsResponse>(
                  this, METHODID_STATS)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListLogGroupsRequest,
                yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListLogGroupsResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.CreateLogGroupRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.UpdateLogGroupRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.DeleteLogGroupRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListResourcesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListResourcesRequest,
                yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListResourcesResponse>(
                  this, METHODID_LIST_RESOURCES)))
          .addMethod(
            getListOperationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListOperationsRequest,
                yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListOperationsResponse>(
                  this, METHODID_LIST_OPERATIONS)))
          .addMethod(
            getListAccessBindingsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.access.Access.ListAccessBindingsRequest,
                yandex.cloud.api.access.Access.ListAccessBindingsResponse>(
                  this, METHODID_LIST_ACCESS_BINDINGS)))
          .addMethod(
            getSetAccessBindingsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.access.Access.SetAccessBindingsRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_SET_ACCESS_BINDINGS)))
          .addMethod(
            getUpdateAccessBindingsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.access.Access.UpdateAccessBindingsRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE_ACCESS_BINDINGS)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing log groups.
   * </pre>
   */
  public static final class LogGroupServiceStub extends io.grpc.stub.AbstractStub<LogGroupServiceStub> {
    private LogGroupServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LogGroupServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LogGroupServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LogGroupServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified log group.
     * To get the list of all available log groups, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetLogGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.logging.v1.LogGroupOuterClass.LogGroup> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns default log group for the folder.
     * To get the list of all available log groups, make a [List] request.
     * </pre>
     */
    public void getDefault(yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetDefaultLogGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.logging.v1.LogGroupOuterClass.LogGroup> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetDefaultMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns stats for the specified log group.
     * </pre>
     */
    public void stats(yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetLogGroupStatsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetLogGroupStatsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStatsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of log groups in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListLogGroupsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListLogGroupsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a log group in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.CreateLogGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified log group.
     * </pre>
     */
    public void update(yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.UpdateLogGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified log group.
     * </pre>
     */
    public void delete(yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.DeleteLogGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the resources (type and IDs) in the specified log group.
     * </pre>
     */
    public void listResources(yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListResourcesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListResourcesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListResourcesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified log group.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListOperationsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists existing access bindings for the specified log group.
     * </pre>
     */
    public void listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.access.Access.ListAccessBindingsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sets access bindings for the specified log group.
     * </pre>
     */
    public void setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates access bindings for the specified log group.
     * </pre>
     */
    public void updateAccessBindings(yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing log groups.
   * </pre>
   */
  public static final class LogGroupServiceBlockingStub extends io.grpc.stub.AbstractStub<LogGroupServiceBlockingStub> {
    private LogGroupServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LogGroupServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LogGroupServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LogGroupServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified log group.
     * To get the list of all available log groups, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.logging.v1.LogGroupOuterClass.LogGroup get(yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetLogGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns default log group for the folder.
     * To get the list of all available log groups, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.logging.v1.LogGroupOuterClass.LogGroup getDefault(yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetDefaultLogGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetDefaultMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns stats for the specified log group.
     * </pre>
     */
    public yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetLogGroupStatsResponse stats(yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetLogGroupStatsRequest request) {
      return blockingUnaryCall(
          getChannel(), getStatsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of log groups in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListLogGroupsResponse list(yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListLogGroupsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a log group in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.CreateLogGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified log group.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.UpdateLogGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified log group.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.DeleteLogGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the resources (type and IDs) in the specified log group.
     * </pre>
     */
    public yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListResourcesResponse listResources(yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListResourcesRequest request) {
      return blockingUnaryCall(
          getChannel(), getListResourcesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists operations for the specified log group.
     * </pre>
     */
    public yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListOperationsResponse listOperations(yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListOperationsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists existing access bindings for the specified log group.
     * </pre>
     */
    public yandex.cloud.api.access.Access.ListAccessBindingsResponse listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListAccessBindingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets access bindings for the specified log group.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetAccessBindingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates access bindings for the specified log group.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation updateAccessBindings(yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateAccessBindingsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing log groups.
   * </pre>
   */
  public static final class LogGroupServiceFutureStub extends io.grpc.stub.AbstractStub<LogGroupServiceFutureStub> {
    private LogGroupServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LogGroupServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LogGroupServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LogGroupServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified log group.
     * To get the list of all available log groups, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.logging.v1.LogGroupOuterClass.LogGroup> get(
        yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetLogGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns default log group for the folder.
     * To get the list of all available log groups, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.logging.v1.LogGroupOuterClass.LogGroup> getDefault(
        yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetDefaultLogGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetDefaultMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns stats for the specified log group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetLogGroupStatsResponse> stats(
        yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetLogGroupStatsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStatsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of log groups in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListLogGroupsResponse> list(
        yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListLogGroupsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a log group in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.CreateLogGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified log group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.UpdateLogGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified log group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.DeleteLogGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the resources (type and IDs) in the specified log group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListResourcesResponse> listResources(
        yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListResourcesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListResourcesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists operations for the specified log group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListOperationsResponse> listOperations(
        yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListOperationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists existing access bindings for the specified log group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.access.Access.ListAccessBindingsResponse> listAccessBindings(
        yandex.cloud.api.access.Access.ListAccessBindingsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListAccessBindingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sets access bindings for the specified log group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> setAccessBindings(
        yandex.cloud.api.access.Access.SetAccessBindingsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetAccessBindingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates access bindings for the specified log group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> updateAccessBindings(
        yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateAccessBindingsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_GET_DEFAULT = 1;
  private static final int METHODID_STATS = 2;
  private static final int METHODID_LIST = 3;
  private static final int METHODID_CREATE = 4;
  private static final int METHODID_UPDATE = 5;
  private static final int METHODID_DELETE = 6;
  private static final int METHODID_LIST_RESOURCES = 7;
  private static final int METHODID_LIST_OPERATIONS = 8;
  private static final int METHODID_LIST_ACCESS_BINDINGS = 9;
  private static final int METHODID_SET_ACCESS_BINDINGS = 10;
  private static final int METHODID_UPDATE_ACCESS_BINDINGS = 11;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LogGroupServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LogGroupServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetLogGroupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.logging.v1.LogGroupOuterClass.LogGroup>) responseObserver);
          break;
        case METHODID_GET_DEFAULT:
          serviceImpl.getDefault((yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetDefaultLogGroupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.logging.v1.LogGroupOuterClass.LogGroup>) responseObserver);
          break;
        case METHODID_STATS:
          serviceImpl.stats((yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetLogGroupStatsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetLogGroupStatsResponse>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListLogGroupsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListLogGroupsResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.CreateLogGroupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.UpdateLogGroupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.DeleteLogGroupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_RESOURCES:
          serviceImpl.listResources((yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListResourcesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListResourcesResponse>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListOperationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListOperationsResponse>) responseObserver);
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

  private static abstract class LogGroupServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LogGroupServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LogGroupService");
    }
  }

  private static final class LogGroupServiceFileDescriptorSupplier
      extends LogGroupServiceBaseDescriptorSupplier {
    LogGroupServiceFileDescriptorSupplier() {}
  }

  private static final class LogGroupServiceMethodDescriptorSupplier
      extends LogGroupServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LogGroupServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (LogGroupServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LogGroupServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getGetDefaultMethod())
              .addMethod(getStatsMethod())
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getListResourcesMethod())
              .addMethod(getListOperationsMethod())
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
