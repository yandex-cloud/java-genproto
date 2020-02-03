package yandex.cloud.api.kms.v1;

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
 * Set of methods for managing symmetric KMS keys.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.0)",
    comments = "Source: yandex/cloud/kms/v1/symmetric_key_service.proto")
public final class SymmetricKeyServiceGrpc {

  private SymmetricKeyServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.kms.v1.SymmetricKeyService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.CreateSymmetricKeyRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.CreateSymmetricKeyRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.CreateSymmetricKeyRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.CreateSymmetricKeyRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = SymmetricKeyServiceGrpc.getCreateMethod) == null) {
      synchronized (SymmetricKeyServiceGrpc.class) {
        if ((getCreateMethod = SymmetricKeyServiceGrpc.getCreateMethod) == null) {
          SymmetricKeyServiceGrpc.getCreateMethod = getCreateMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.CreateSymmetricKeyRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.kms.v1.SymmetricKeyService", "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.CreateSymmetricKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new SymmetricKeyServiceMethodDescriptorSupplier("Create"))
                  .build();
          }
        }
     }
     return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.GetSymmetricKeyRequest,
      yandex.cloud.api.kms.v1.SymmetricKeyOuterClass.SymmetricKey> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.GetSymmetricKeyRequest.class,
      responseType = yandex.cloud.api.kms.v1.SymmetricKeyOuterClass.SymmetricKey.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.GetSymmetricKeyRequest,
      yandex.cloud.api.kms.v1.SymmetricKeyOuterClass.SymmetricKey> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.GetSymmetricKeyRequest, yandex.cloud.api.kms.v1.SymmetricKeyOuterClass.SymmetricKey> getGetMethod;
    if ((getGetMethod = SymmetricKeyServiceGrpc.getGetMethod) == null) {
      synchronized (SymmetricKeyServiceGrpc.class) {
        if ((getGetMethod = SymmetricKeyServiceGrpc.getGetMethod) == null) {
          SymmetricKeyServiceGrpc.getGetMethod = getGetMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.GetSymmetricKeyRequest, yandex.cloud.api.kms.v1.SymmetricKeyOuterClass.SymmetricKey>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.kms.v1.SymmetricKeyService", "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.GetSymmetricKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.kms.v1.SymmetricKeyOuterClass.SymmetricKey.getDefaultInstance()))
                  .setSchemaDescriptor(new SymmetricKeyServiceMethodDescriptorSupplier("Get"))
                  .build();
          }
        }
     }
     return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ListSymmetricKeysRequest,
      yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ListSymmetricKeysResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ListSymmetricKeysRequest.class,
      responseType = yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ListSymmetricKeysResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ListSymmetricKeysRequest,
      yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ListSymmetricKeysResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ListSymmetricKeysRequest, yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ListSymmetricKeysResponse> getListMethod;
    if ((getListMethod = SymmetricKeyServiceGrpc.getListMethod) == null) {
      synchronized (SymmetricKeyServiceGrpc.class) {
        if ((getListMethod = SymmetricKeyServiceGrpc.getListMethod) == null) {
          SymmetricKeyServiceGrpc.getListMethod = getListMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ListSymmetricKeysRequest, yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ListSymmetricKeysResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.kms.v1.SymmetricKeyService", "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ListSymmetricKeysRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ListSymmetricKeysResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SymmetricKeyServiceMethodDescriptorSupplier("List"))
                  .build();
          }
        }
     }
     return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ListSymmetricKeyVersionsRequest,
      yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ListSymmetricKeyVersionsResponse> getListVersionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListVersions",
      requestType = yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ListSymmetricKeyVersionsRequest.class,
      responseType = yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ListSymmetricKeyVersionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ListSymmetricKeyVersionsRequest,
      yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ListSymmetricKeyVersionsResponse> getListVersionsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ListSymmetricKeyVersionsRequest, yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ListSymmetricKeyVersionsResponse> getListVersionsMethod;
    if ((getListVersionsMethod = SymmetricKeyServiceGrpc.getListVersionsMethod) == null) {
      synchronized (SymmetricKeyServiceGrpc.class) {
        if ((getListVersionsMethod = SymmetricKeyServiceGrpc.getListVersionsMethod) == null) {
          SymmetricKeyServiceGrpc.getListVersionsMethod = getListVersionsMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ListSymmetricKeyVersionsRequest, yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ListSymmetricKeyVersionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.kms.v1.SymmetricKeyService", "ListVersions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ListSymmetricKeyVersionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ListSymmetricKeyVersionsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SymmetricKeyServiceMethodDescriptorSupplier("ListVersions"))
                  .build();
          }
        }
     }
     return getListVersionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.UpdateSymmetricKeyRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.UpdateSymmetricKeyRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.UpdateSymmetricKeyRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.UpdateSymmetricKeyRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = SymmetricKeyServiceGrpc.getUpdateMethod) == null) {
      synchronized (SymmetricKeyServiceGrpc.class) {
        if ((getUpdateMethod = SymmetricKeyServiceGrpc.getUpdateMethod) == null) {
          SymmetricKeyServiceGrpc.getUpdateMethod = getUpdateMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.UpdateSymmetricKeyRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.kms.v1.SymmetricKeyService", "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.UpdateSymmetricKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new SymmetricKeyServiceMethodDescriptorSupplier("Update"))
                  .build();
          }
        }
     }
     return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.DeleteSymmetricKeyRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.DeleteSymmetricKeyRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.DeleteSymmetricKeyRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.DeleteSymmetricKeyRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = SymmetricKeyServiceGrpc.getDeleteMethod) == null) {
      synchronized (SymmetricKeyServiceGrpc.class) {
        if ((getDeleteMethod = SymmetricKeyServiceGrpc.getDeleteMethod) == null) {
          SymmetricKeyServiceGrpc.getDeleteMethod = getDeleteMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.DeleteSymmetricKeyRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.kms.v1.SymmetricKeyService", "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.DeleteSymmetricKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new SymmetricKeyServiceMethodDescriptorSupplier("Delete"))
                  .build();
          }
        }
     }
     return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.SetPrimarySymmetricKeyVersionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getSetPrimaryVersionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetPrimaryVersion",
      requestType = yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.SetPrimarySymmetricKeyVersionRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.SetPrimarySymmetricKeyVersionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getSetPrimaryVersionMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.SetPrimarySymmetricKeyVersionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getSetPrimaryVersionMethod;
    if ((getSetPrimaryVersionMethod = SymmetricKeyServiceGrpc.getSetPrimaryVersionMethod) == null) {
      synchronized (SymmetricKeyServiceGrpc.class) {
        if ((getSetPrimaryVersionMethod = SymmetricKeyServiceGrpc.getSetPrimaryVersionMethod) == null) {
          SymmetricKeyServiceGrpc.getSetPrimaryVersionMethod = getSetPrimaryVersionMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.SetPrimarySymmetricKeyVersionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.kms.v1.SymmetricKeyService", "SetPrimaryVersion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.SetPrimarySymmetricKeyVersionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new SymmetricKeyServiceMethodDescriptorSupplier("SetPrimaryVersion"))
                  .build();
          }
        }
     }
     return getSetPrimaryVersionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ScheduleSymmetricKeyVersionDestructionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getScheduleVersionDestructionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ScheduleVersionDestruction",
      requestType = yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ScheduleSymmetricKeyVersionDestructionRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ScheduleSymmetricKeyVersionDestructionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getScheduleVersionDestructionMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ScheduleSymmetricKeyVersionDestructionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getScheduleVersionDestructionMethod;
    if ((getScheduleVersionDestructionMethod = SymmetricKeyServiceGrpc.getScheduleVersionDestructionMethod) == null) {
      synchronized (SymmetricKeyServiceGrpc.class) {
        if ((getScheduleVersionDestructionMethod = SymmetricKeyServiceGrpc.getScheduleVersionDestructionMethod) == null) {
          SymmetricKeyServiceGrpc.getScheduleVersionDestructionMethod = getScheduleVersionDestructionMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ScheduleSymmetricKeyVersionDestructionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.kms.v1.SymmetricKeyService", "ScheduleVersionDestruction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ScheduleSymmetricKeyVersionDestructionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new SymmetricKeyServiceMethodDescriptorSupplier("ScheduleVersionDestruction"))
                  .build();
          }
        }
     }
     return getScheduleVersionDestructionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.CancelSymmetricKeyVersionDestructionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCancelVersionDestructionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelVersionDestruction",
      requestType = yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.CancelSymmetricKeyVersionDestructionRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.CancelSymmetricKeyVersionDestructionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCancelVersionDestructionMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.CancelSymmetricKeyVersionDestructionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCancelVersionDestructionMethod;
    if ((getCancelVersionDestructionMethod = SymmetricKeyServiceGrpc.getCancelVersionDestructionMethod) == null) {
      synchronized (SymmetricKeyServiceGrpc.class) {
        if ((getCancelVersionDestructionMethod = SymmetricKeyServiceGrpc.getCancelVersionDestructionMethod) == null) {
          SymmetricKeyServiceGrpc.getCancelVersionDestructionMethod = getCancelVersionDestructionMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.CancelSymmetricKeyVersionDestructionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.kms.v1.SymmetricKeyService", "CancelVersionDestruction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.CancelSymmetricKeyVersionDestructionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new SymmetricKeyServiceMethodDescriptorSupplier("CancelVersionDestruction"))
                  .build();
          }
        }
     }
     return getCancelVersionDestructionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.RotateSymmetricKeyRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRotateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Rotate",
      requestType = yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.RotateSymmetricKeyRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.RotateSymmetricKeyRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRotateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.RotateSymmetricKeyRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getRotateMethod;
    if ((getRotateMethod = SymmetricKeyServiceGrpc.getRotateMethod) == null) {
      synchronized (SymmetricKeyServiceGrpc.class) {
        if ((getRotateMethod = SymmetricKeyServiceGrpc.getRotateMethod) == null) {
          SymmetricKeyServiceGrpc.getRotateMethod = getRotateMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.RotateSymmetricKeyRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.kms.v1.SymmetricKeyService", "Rotate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.RotateSymmetricKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new SymmetricKeyServiceMethodDescriptorSupplier("Rotate"))
                  .build();
          }
        }
     }
     return getRotateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ListSymmetricKeyOperationsRequest,
      yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ListSymmetricKeyOperationsResponse> getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ListSymmetricKeyOperationsRequest.class,
      responseType = yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ListSymmetricKeyOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ListSymmetricKeyOperationsRequest,
      yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ListSymmetricKeyOperationsResponse> getListOperationsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ListSymmetricKeyOperationsRequest, yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ListSymmetricKeyOperationsResponse> getListOperationsMethod;
    if ((getListOperationsMethod = SymmetricKeyServiceGrpc.getListOperationsMethod) == null) {
      synchronized (SymmetricKeyServiceGrpc.class) {
        if ((getListOperationsMethod = SymmetricKeyServiceGrpc.getListOperationsMethod) == null) {
          SymmetricKeyServiceGrpc.getListOperationsMethod = getListOperationsMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ListSymmetricKeyOperationsRequest, yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ListSymmetricKeyOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.kms.v1.SymmetricKeyService", "ListOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ListSymmetricKeyOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ListSymmetricKeyOperationsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SymmetricKeyServiceMethodDescriptorSupplier("ListOperations"))
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
    if ((getListAccessBindingsMethod = SymmetricKeyServiceGrpc.getListAccessBindingsMethod) == null) {
      synchronized (SymmetricKeyServiceGrpc.class) {
        if ((getListAccessBindingsMethod = SymmetricKeyServiceGrpc.getListAccessBindingsMethod) == null) {
          SymmetricKeyServiceGrpc.getListAccessBindingsMethod = getListAccessBindingsMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.ListAccessBindingsRequest, yandex.cloud.api.access.Access.ListAccessBindingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.kms.v1.SymmetricKeyService", "ListAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.ListAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.ListAccessBindingsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SymmetricKeyServiceMethodDescriptorSupplier("ListAccessBindings"))
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
    if ((getSetAccessBindingsMethod = SymmetricKeyServiceGrpc.getSetAccessBindingsMethod) == null) {
      synchronized (SymmetricKeyServiceGrpc.class) {
        if ((getSetAccessBindingsMethod = SymmetricKeyServiceGrpc.getSetAccessBindingsMethod) == null) {
          SymmetricKeyServiceGrpc.getSetAccessBindingsMethod = getSetAccessBindingsMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.SetAccessBindingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.kms.v1.SymmetricKeyService", "SetAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.SetAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new SymmetricKeyServiceMethodDescriptorSupplier("SetAccessBindings"))
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
    if ((getUpdateAccessBindingsMethod = SymmetricKeyServiceGrpc.getUpdateAccessBindingsMethod) == null) {
      synchronized (SymmetricKeyServiceGrpc.class) {
        if ((getUpdateAccessBindingsMethod = SymmetricKeyServiceGrpc.getUpdateAccessBindingsMethod) == null) {
          SymmetricKeyServiceGrpc.getUpdateAccessBindingsMethod = getUpdateAccessBindingsMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.UpdateAccessBindingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.kms.v1.SymmetricKeyService", "UpdateAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.UpdateAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new SymmetricKeyServiceMethodDescriptorSupplier("UpdateAccessBindings"))
                  .build();
          }
        }
     }
     return getUpdateAccessBindingsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SymmetricKeyServiceStub newStub(io.grpc.Channel channel) {
    return new SymmetricKeyServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SymmetricKeyServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SymmetricKeyServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SymmetricKeyServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SymmetricKeyServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Set of methods for managing symmetric KMS keys.
   * </pre>
   */
  public static abstract class SymmetricKeyServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Creates a symmetric KMS key in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.CreateSymmetricKeyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the specified symmetric KMS key.
     *  To get the list of available symmetric KMS keys, make a [SymmetricKeyService.List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.GetSymmetricKeyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.kms.v1.SymmetricKeyOuterClass.SymmetricKey> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the list of symmetric KMS keys in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ListSymmetricKeysRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ListSymmetricKeysResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the list of versions of the specified symmetric KMS key.
     * </pre>
     */
    public void listVersions(yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ListSymmetricKeyVersionsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ListSymmetricKeyVersionsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListVersionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified symmetric KMS key.
     * </pre>
     */
    public void update(yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.UpdateSymmetricKeyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified symmetric KMS key. This action also automatically schedules
     * the destruction of all of the key's versions in 72 hours.
     * The key and its versions appear absent in [SymmetricKeyService.Get] and [SymmetricKeyService.List]
     * requests, but can be restored within 72 hours with a request to tech support.
     * </pre>
     */
    public void delete(yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.DeleteSymmetricKeyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sets the primary version for the specified key. The primary version is used
     * by default for all encrypt/decrypt operations where no version ID is specified.
     * </pre>
     */
    public void setPrimaryVersion(yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.SetPrimarySymmetricKeyVersionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getSetPrimaryVersionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Schedules the specified key version for destruction.
     * Scheduled destruction can be cancelled with the [SymmetricKeyService.CancelVersionDestruction] method.
     * </pre>
     */
    public void scheduleVersionDestruction(yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ScheduleSymmetricKeyVersionDestructionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getScheduleVersionDestructionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Cancels previously scheduled version destruction, if the version hasn't been destroyed yet.
     * </pre>
     */
    public void cancelVersionDestruction(yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.CancelSymmetricKeyVersionDestructionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getCancelVersionDestructionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Rotates the specified key: creates a new key version and makes it the primary version.
     * The old version remains available for decryption of ciphertext encrypted with it.
     * </pre>
     */
    public void rotate(yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.RotateSymmetricKeyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getRotateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified symmetric KMS key.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ListSymmetricKeyOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ListSymmetricKeyOperationsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists existing access bindings for the specified key.
     * </pre>
     */
    public void listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.access.Access.ListAccessBindingsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListAccessBindingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sets access bindings for the key.
     * </pre>
     */
    public void setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getSetAccessBindingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates access bindings for the specified key.
     * </pre>
     */
    public void updateAccessBindings(yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateAccessBindingsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.CreateSymmetricKeyRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.GetSymmetricKeyRequest,
                yandex.cloud.api.kms.v1.SymmetricKeyOuterClass.SymmetricKey>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ListSymmetricKeysRequest,
                yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ListSymmetricKeysResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getListVersionsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ListSymmetricKeyVersionsRequest,
                yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ListSymmetricKeyVersionsResponse>(
                  this, METHODID_LIST_VERSIONS)))
          .addMethod(
            getUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.UpdateSymmetricKeyRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.DeleteSymmetricKeyRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getSetPrimaryVersionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.SetPrimarySymmetricKeyVersionRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_SET_PRIMARY_VERSION)))
          .addMethod(
            getScheduleVersionDestructionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ScheduleSymmetricKeyVersionDestructionRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_SCHEDULE_VERSION_DESTRUCTION)))
          .addMethod(
            getCancelVersionDestructionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.CancelSymmetricKeyVersionDestructionRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CANCEL_VERSION_DESTRUCTION)))
          .addMethod(
            getRotateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.RotateSymmetricKeyRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_ROTATE)))
          .addMethod(
            getListOperationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ListSymmetricKeyOperationsRequest,
                yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ListSymmetricKeyOperationsResponse>(
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
   * Set of methods for managing symmetric KMS keys.
   * </pre>
   */
  public static final class SymmetricKeyServiceStub extends io.grpc.stub.AbstractStub<SymmetricKeyServiceStub> {
    private SymmetricKeyServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SymmetricKeyServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SymmetricKeyServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SymmetricKeyServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a symmetric KMS key in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.CreateSymmetricKeyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the specified symmetric KMS key.
     *  To get the list of available symmetric KMS keys, make a [SymmetricKeyService.List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.GetSymmetricKeyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.kms.v1.SymmetricKeyOuterClass.SymmetricKey> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the list of symmetric KMS keys in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ListSymmetricKeysRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ListSymmetricKeysResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the list of versions of the specified symmetric KMS key.
     * </pre>
     */
    public void listVersions(yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ListSymmetricKeyVersionsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ListSymmetricKeyVersionsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListVersionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified symmetric KMS key.
     * </pre>
     */
    public void update(yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.UpdateSymmetricKeyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified symmetric KMS key. This action also automatically schedules
     * the destruction of all of the key's versions in 72 hours.
     * The key and its versions appear absent in [SymmetricKeyService.Get] and [SymmetricKeyService.List]
     * requests, but can be restored within 72 hours with a request to tech support.
     * </pre>
     */
    public void delete(yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.DeleteSymmetricKeyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sets the primary version for the specified key. The primary version is used
     * by default for all encrypt/decrypt operations where no version ID is specified.
     * </pre>
     */
    public void setPrimaryVersion(yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.SetPrimarySymmetricKeyVersionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetPrimaryVersionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Schedules the specified key version for destruction.
     * Scheduled destruction can be cancelled with the [SymmetricKeyService.CancelVersionDestruction] method.
     * </pre>
     */
    public void scheduleVersionDestruction(yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ScheduleSymmetricKeyVersionDestructionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getScheduleVersionDestructionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Cancels previously scheduled version destruction, if the version hasn't been destroyed yet.
     * </pre>
     */
    public void cancelVersionDestruction(yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.CancelSymmetricKeyVersionDestructionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCancelVersionDestructionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Rotates the specified key: creates a new key version and makes it the primary version.
     * The old version remains available for decryption of ciphertext encrypted with it.
     * </pre>
     */
    public void rotate(yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.RotateSymmetricKeyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRotateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified symmetric KMS key.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ListSymmetricKeyOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ListSymmetricKeyOperationsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists existing access bindings for the specified key.
     * </pre>
     */
    public void listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.access.Access.ListAccessBindingsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sets access bindings for the key.
     * </pre>
     */
    public void setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates access bindings for the specified key.
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
   * Set of methods for managing symmetric KMS keys.
   * </pre>
   */
  public static final class SymmetricKeyServiceBlockingStub extends io.grpc.stub.AbstractStub<SymmetricKeyServiceBlockingStub> {
    private SymmetricKeyServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SymmetricKeyServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SymmetricKeyServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SymmetricKeyServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a symmetric KMS key in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.CreateSymmetricKeyRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the specified symmetric KMS key.
     *  To get the list of available symmetric KMS keys, make a [SymmetricKeyService.List] request.
     * </pre>
     */
    public yandex.cloud.api.kms.v1.SymmetricKeyOuterClass.SymmetricKey get(yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.GetSymmetricKeyRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the list of symmetric KMS keys in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ListSymmetricKeysResponse list(yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ListSymmetricKeysRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the list of versions of the specified symmetric KMS key.
     * </pre>
     */
    public yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ListSymmetricKeyVersionsResponse listVersions(yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ListSymmetricKeyVersionsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListVersionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified symmetric KMS key.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.UpdateSymmetricKeyRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified symmetric KMS key. This action also automatically schedules
     * the destruction of all of the key's versions in 72 hours.
     * The key and its versions appear absent in [SymmetricKeyService.Get] and [SymmetricKeyService.List]
     * requests, but can be restored within 72 hours with a request to tech support.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.DeleteSymmetricKeyRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets the primary version for the specified key. The primary version is used
     * by default for all encrypt/decrypt operations where no version ID is specified.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation setPrimaryVersion(yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.SetPrimarySymmetricKeyVersionRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetPrimaryVersionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Schedules the specified key version for destruction.
     * Scheduled destruction can be cancelled with the [SymmetricKeyService.CancelVersionDestruction] method.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation scheduleVersionDestruction(yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ScheduleSymmetricKeyVersionDestructionRequest request) {
      return blockingUnaryCall(
          getChannel(), getScheduleVersionDestructionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Cancels previously scheduled version destruction, if the version hasn't been destroyed yet.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation cancelVersionDestruction(yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.CancelSymmetricKeyVersionDestructionRequest request) {
      return blockingUnaryCall(
          getChannel(), getCancelVersionDestructionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Rotates the specified key: creates a new key version and makes it the primary version.
     * The old version remains available for decryption of ciphertext encrypted with it.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation rotate(yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.RotateSymmetricKeyRequest request) {
      return blockingUnaryCall(
          getChannel(), getRotateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists operations for the specified symmetric KMS key.
     * </pre>
     */
    public yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ListSymmetricKeyOperationsResponse listOperations(yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ListSymmetricKeyOperationsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists existing access bindings for the specified key.
     * </pre>
     */
    public yandex.cloud.api.access.Access.ListAccessBindingsResponse listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListAccessBindingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets access bindings for the key.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetAccessBindingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates access bindings for the specified key.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation updateAccessBindings(yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateAccessBindingsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Set of methods for managing symmetric KMS keys.
   * </pre>
   */
  public static final class SymmetricKeyServiceFutureStub extends io.grpc.stub.AbstractStub<SymmetricKeyServiceFutureStub> {
    private SymmetricKeyServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SymmetricKeyServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SymmetricKeyServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SymmetricKeyServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a symmetric KMS key in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.CreateSymmetricKeyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the specified symmetric KMS key.
     *  To get the list of available symmetric KMS keys, make a [SymmetricKeyService.List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.kms.v1.SymmetricKeyOuterClass.SymmetricKey> get(
        yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.GetSymmetricKeyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the list of symmetric KMS keys in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ListSymmetricKeysResponse> list(
        yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ListSymmetricKeysRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the list of versions of the specified symmetric KMS key.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ListSymmetricKeyVersionsResponse> listVersions(
        yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ListSymmetricKeyVersionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListVersionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified symmetric KMS key.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.UpdateSymmetricKeyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified symmetric KMS key. This action also automatically schedules
     * the destruction of all of the key's versions in 72 hours.
     * The key and its versions appear absent in [SymmetricKeyService.Get] and [SymmetricKeyService.List]
     * requests, but can be restored within 72 hours with a request to tech support.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.DeleteSymmetricKeyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sets the primary version for the specified key. The primary version is used
     * by default for all encrypt/decrypt operations where no version ID is specified.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> setPrimaryVersion(
        yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.SetPrimarySymmetricKeyVersionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetPrimaryVersionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Schedules the specified key version for destruction.
     * Scheduled destruction can be cancelled with the [SymmetricKeyService.CancelVersionDestruction] method.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> scheduleVersionDestruction(
        yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ScheduleSymmetricKeyVersionDestructionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getScheduleVersionDestructionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Cancels previously scheduled version destruction, if the version hasn't been destroyed yet.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> cancelVersionDestruction(
        yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.CancelSymmetricKeyVersionDestructionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCancelVersionDestructionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Rotates the specified key: creates a new key version and makes it the primary version.
     * The old version remains available for decryption of ciphertext encrypted with it.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> rotate(
        yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.RotateSymmetricKeyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRotateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists operations for the specified symmetric KMS key.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ListSymmetricKeyOperationsResponse> listOperations(
        yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ListSymmetricKeyOperationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists existing access bindings for the specified key.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.access.Access.ListAccessBindingsResponse> listAccessBindings(
        yandex.cloud.api.access.Access.ListAccessBindingsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListAccessBindingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sets access bindings for the key.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> setAccessBindings(
        yandex.cloud.api.access.Access.SetAccessBindingsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetAccessBindingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates access bindings for the specified key.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> updateAccessBindings(
        yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateAccessBindingsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_GET = 1;
  private static final int METHODID_LIST = 2;
  private static final int METHODID_LIST_VERSIONS = 3;
  private static final int METHODID_UPDATE = 4;
  private static final int METHODID_DELETE = 5;
  private static final int METHODID_SET_PRIMARY_VERSION = 6;
  private static final int METHODID_SCHEDULE_VERSION_DESTRUCTION = 7;
  private static final int METHODID_CANCEL_VERSION_DESTRUCTION = 8;
  private static final int METHODID_ROTATE = 9;
  private static final int METHODID_LIST_OPERATIONS = 10;
  private static final int METHODID_LIST_ACCESS_BINDINGS = 11;
  private static final int METHODID_SET_ACCESS_BINDINGS = 12;
  private static final int METHODID_UPDATE_ACCESS_BINDINGS = 13;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SymmetricKeyServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SymmetricKeyServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.CreateSymmetricKeyRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.GetSymmetricKeyRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.kms.v1.SymmetricKeyOuterClass.SymmetricKey>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ListSymmetricKeysRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ListSymmetricKeysResponse>) responseObserver);
          break;
        case METHODID_LIST_VERSIONS:
          serviceImpl.listVersions((yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ListSymmetricKeyVersionsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ListSymmetricKeyVersionsResponse>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.UpdateSymmetricKeyRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.DeleteSymmetricKeyRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_SET_PRIMARY_VERSION:
          serviceImpl.setPrimaryVersion((yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.SetPrimarySymmetricKeyVersionRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_SCHEDULE_VERSION_DESTRUCTION:
          serviceImpl.scheduleVersionDestruction((yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ScheduleSymmetricKeyVersionDestructionRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_CANCEL_VERSION_DESTRUCTION:
          serviceImpl.cancelVersionDestruction((yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.CancelSymmetricKeyVersionDestructionRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_ROTATE:
          serviceImpl.rotate((yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.RotateSymmetricKeyRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ListSymmetricKeyOperationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.ListSymmetricKeyOperationsResponse>) responseObserver);
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

  private static abstract class SymmetricKeyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SymmetricKeyServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.kms.v1.SymmetricKeyServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SymmetricKeyService");
    }
  }

  private static final class SymmetricKeyServiceFileDescriptorSupplier
      extends SymmetricKeyServiceBaseDescriptorSupplier {
    SymmetricKeyServiceFileDescriptorSupplier() {}
  }

  private static final class SymmetricKeyServiceMethodDescriptorSupplier
      extends SymmetricKeyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SymmetricKeyServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SymmetricKeyServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SymmetricKeyServiceFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getListVersionsMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getSetPrimaryVersionMethod())
              .addMethod(getScheduleVersionDestructionMethod())
              .addMethod(getCancelVersionDestructionMethod())
              .addMethod(getRotateMethod())
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
