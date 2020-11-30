package yandex.cloud.api.lockbox.v1;

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
 * A set of methods for managing secrets.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.0)",
    comments = "Source: yandex/cloud/lockbox/v1/secret_service.proto")
public final class SecretServiceGrpc {

  private SecretServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.lockbox.v1.SecretService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.GetSecretRequest,
      yandex.cloud.api.lockbox.v1.SecretOuterClass.Secret> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.GetSecretRequest.class,
      responseType = yandex.cloud.api.lockbox.v1.SecretOuterClass.Secret.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.GetSecretRequest,
      yandex.cloud.api.lockbox.v1.SecretOuterClass.Secret> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.GetSecretRequest, yandex.cloud.api.lockbox.v1.SecretOuterClass.Secret> getGetMethod;
    if ((getGetMethod = SecretServiceGrpc.getGetMethod) == null) {
      synchronized (SecretServiceGrpc.class) {
        if ((getGetMethod = SecretServiceGrpc.getGetMethod) == null) {
          SecretServiceGrpc.getGetMethod = getGetMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.GetSecretRequest, yandex.cloud.api.lockbox.v1.SecretOuterClass.Secret>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.lockbox.v1.SecretService", "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.GetSecretRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.lockbox.v1.SecretOuterClass.Secret.getDefaultInstance()))
                  .setSchemaDescriptor(new SecretServiceMethodDescriptorSupplier("Get"))
                  .build();
          }
        }
     }
     return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ListSecretsRequest,
      yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ListSecretsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ListSecretsRequest.class,
      responseType = yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ListSecretsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ListSecretsRequest,
      yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ListSecretsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ListSecretsRequest, yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ListSecretsResponse> getListMethod;
    if ((getListMethod = SecretServiceGrpc.getListMethod) == null) {
      synchronized (SecretServiceGrpc.class) {
        if ((getListMethod = SecretServiceGrpc.getListMethod) == null) {
          SecretServiceGrpc.getListMethod = getListMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ListSecretsRequest, yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ListSecretsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.lockbox.v1.SecretService", "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ListSecretsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ListSecretsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SecretServiceMethodDescriptorSupplier("List"))
                  .build();
          }
        }
     }
     return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.CreateSecretRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.CreateSecretRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.CreateSecretRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.CreateSecretRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = SecretServiceGrpc.getCreateMethod) == null) {
      synchronized (SecretServiceGrpc.class) {
        if ((getCreateMethod = SecretServiceGrpc.getCreateMethod) == null) {
          SecretServiceGrpc.getCreateMethod = getCreateMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.CreateSecretRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.lockbox.v1.SecretService", "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.CreateSecretRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new SecretServiceMethodDescriptorSupplier("Create"))
                  .build();
          }
        }
     }
     return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.UpdateSecretRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.UpdateSecretRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.UpdateSecretRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.UpdateSecretRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = SecretServiceGrpc.getUpdateMethod) == null) {
      synchronized (SecretServiceGrpc.class) {
        if ((getUpdateMethod = SecretServiceGrpc.getUpdateMethod) == null) {
          SecretServiceGrpc.getUpdateMethod = getUpdateMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.UpdateSecretRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.lockbox.v1.SecretService", "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.UpdateSecretRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new SecretServiceMethodDescriptorSupplier("Update"))
                  .build();
          }
        }
     }
     return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.DeleteSecretRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.DeleteSecretRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.DeleteSecretRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.DeleteSecretRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = SecretServiceGrpc.getDeleteMethod) == null) {
      synchronized (SecretServiceGrpc.class) {
        if ((getDeleteMethod = SecretServiceGrpc.getDeleteMethod) == null) {
          SecretServiceGrpc.getDeleteMethod = getDeleteMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.DeleteSecretRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.lockbox.v1.SecretService", "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.DeleteSecretRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new SecretServiceMethodDescriptorSupplier("Delete"))
                  .build();
          }
        }
     }
     return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ActivateSecretRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getActivateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Activate",
      requestType = yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ActivateSecretRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ActivateSecretRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getActivateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ActivateSecretRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getActivateMethod;
    if ((getActivateMethod = SecretServiceGrpc.getActivateMethod) == null) {
      synchronized (SecretServiceGrpc.class) {
        if ((getActivateMethod = SecretServiceGrpc.getActivateMethod) == null) {
          SecretServiceGrpc.getActivateMethod = getActivateMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ActivateSecretRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.lockbox.v1.SecretService", "Activate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ActivateSecretRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new SecretServiceMethodDescriptorSupplier("Activate"))
                  .build();
          }
        }
     }
     return getActivateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.DeactivateSecretRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeactivateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Deactivate",
      requestType = yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.DeactivateSecretRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.DeactivateSecretRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeactivateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.DeactivateSecretRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeactivateMethod;
    if ((getDeactivateMethod = SecretServiceGrpc.getDeactivateMethod) == null) {
      synchronized (SecretServiceGrpc.class) {
        if ((getDeactivateMethod = SecretServiceGrpc.getDeactivateMethod) == null) {
          SecretServiceGrpc.getDeactivateMethod = getDeactivateMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.DeactivateSecretRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.lockbox.v1.SecretService", "Deactivate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.DeactivateSecretRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new SecretServiceMethodDescriptorSupplier("Deactivate"))
                  .build();
          }
        }
     }
     return getDeactivateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ListVersionsRequest,
      yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ListVersionsResponse> getListVersionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListVersions",
      requestType = yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ListVersionsRequest.class,
      responseType = yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ListVersionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ListVersionsRequest,
      yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ListVersionsResponse> getListVersionsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ListVersionsRequest, yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ListVersionsResponse> getListVersionsMethod;
    if ((getListVersionsMethod = SecretServiceGrpc.getListVersionsMethod) == null) {
      synchronized (SecretServiceGrpc.class) {
        if ((getListVersionsMethod = SecretServiceGrpc.getListVersionsMethod) == null) {
          SecretServiceGrpc.getListVersionsMethod = getListVersionsMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ListVersionsRequest, yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ListVersionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.lockbox.v1.SecretService", "ListVersions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ListVersionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ListVersionsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SecretServiceMethodDescriptorSupplier("ListVersions"))
                  .build();
          }
        }
     }
     return getListVersionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.AddVersionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getAddVersionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddVersion",
      requestType = yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.AddVersionRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.AddVersionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getAddVersionMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.AddVersionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getAddVersionMethod;
    if ((getAddVersionMethod = SecretServiceGrpc.getAddVersionMethod) == null) {
      synchronized (SecretServiceGrpc.class) {
        if ((getAddVersionMethod = SecretServiceGrpc.getAddVersionMethod) == null) {
          SecretServiceGrpc.getAddVersionMethod = getAddVersionMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.AddVersionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.lockbox.v1.SecretService", "AddVersion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.AddVersionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new SecretServiceMethodDescriptorSupplier("AddVersion"))
                  .build();
          }
        }
     }
     return getAddVersionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ScheduleVersionDestructionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getScheduleVersionDestructionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ScheduleVersionDestruction",
      requestType = yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ScheduleVersionDestructionRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ScheduleVersionDestructionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getScheduleVersionDestructionMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ScheduleVersionDestructionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getScheduleVersionDestructionMethod;
    if ((getScheduleVersionDestructionMethod = SecretServiceGrpc.getScheduleVersionDestructionMethod) == null) {
      synchronized (SecretServiceGrpc.class) {
        if ((getScheduleVersionDestructionMethod = SecretServiceGrpc.getScheduleVersionDestructionMethod) == null) {
          SecretServiceGrpc.getScheduleVersionDestructionMethod = getScheduleVersionDestructionMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ScheduleVersionDestructionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.lockbox.v1.SecretService", "ScheduleVersionDestruction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ScheduleVersionDestructionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new SecretServiceMethodDescriptorSupplier("ScheduleVersionDestruction"))
                  .build();
          }
        }
     }
     return getScheduleVersionDestructionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.CancelVersionDestructionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCancelVersionDestructionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelVersionDestruction",
      requestType = yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.CancelVersionDestructionRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.CancelVersionDestructionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCancelVersionDestructionMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.CancelVersionDestructionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCancelVersionDestructionMethod;
    if ((getCancelVersionDestructionMethod = SecretServiceGrpc.getCancelVersionDestructionMethod) == null) {
      synchronized (SecretServiceGrpc.class) {
        if ((getCancelVersionDestructionMethod = SecretServiceGrpc.getCancelVersionDestructionMethod) == null) {
          SecretServiceGrpc.getCancelVersionDestructionMethod = getCancelVersionDestructionMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.CancelVersionDestructionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.lockbox.v1.SecretService", "CancelVersionDestruction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.CancelVersionDestructionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new SecretServiceMethodDescriptorSupplier("CancelVersionDestruction"))
                  .build();
          }
        }
     }
     return getCancelVersionDestructionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ListSecretOperationsRequest,
      yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ListSecretOperationsResponse> getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ListSecretOperationsRequest.class,
      responseType = yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ListSecretOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ListSecretOperationsRequest,
      yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ListSecretOperationsResponse> getListOperationsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ListSecretOperationsRequest, yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ListSecretOperationsResponse> getListOperationsMethod;
    if ((getListOperationsMethod = SecretServiceGrpc.getListOperationsMethod) == null) {
      synchronized (SecretServiceGrpc.class) {
        if ((getListOperationsMethod = SecretServiceGrpc.getListOperationsMethod) == null) {
          SecretServiceGrpc.getListOperationsMethod = getListOperationsMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ListSecretOperationsRequest, yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ListSecretOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.lockbox.v1.SecretService", "ListOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ListSecretOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ListSecretOperationsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SecretServiceMethodDescriptorSupplier("ListOperations"))
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
    if ((getListAccessBindingsMethod = SecretServiceGrpc.getListAccessBindingsMethod) == null) {
      synchronized (SecretServiceGrpc.class) {
        if ((getListAccessBindingsMethod = SecretServiceGrpc.getListAccessBindingsMethod) == null) {
          SecretServiceGrpc.getListAccessBindingsMethod = getListAccessBindingsMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.ListAccessBindingsRequest, yandex.cloud.api.access.Access.ListAccessBindingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.lockbox.v1.SecretService", "ListAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.ListAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.ListAccessBindingsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SecretServiceMethodDescriptorSupplier("ListAccessBindings"))
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
    if ((getSetAccessBindingsMethod = SecretServiceGrpc.getSetAccessBindingsMethod) == null) {
      synchronized (SecretServiceGrpc.class) {
        if ((getSetAccessBindingsMethod = SecretServiceGrpc.getSetAccessBindingsMethod) == null) {
          SecretServiceGrpc.getSetAccessBindingsMethod = getSetAccessBindingsMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.SetAccessBindingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.lockbox.v1.SecretService", "SetAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.SetAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new SecretServiceMethodDescriptorSupplier("SetAccessBindings"))
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
    if ((getUpdateAccessBindingsMethod = SecretServiceGrpc.getUpdateAccessBindingsMethod) == null) {
      synchronized (SecretServiceGrpc.class) {
        if ((getUpdateAccessBindingsMethod = SecretServiceGrpc.getUpdateAccessBindingsMethod) == null) {
          SecretServiceGrpc.getUpdateAccessBindingsMethod = getUpdateAccessBindingsMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.UpdateAccessBindingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.lockbox.v1.SecretService", "UpdateAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.UpdateAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new SecretServiceMethodDescriptorSupplier("UpdateAccessBindings"))
                  .build();
          }
        }
     }
     return getUpdateAccessBindingsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SecretServiceStub newStub(io.grpc.Channel channel) {
    return new SecretServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SecretServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SecretServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SecretServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SecretServiceFutureStub(channel);
  }

  /**
   * <pre>
   * A set of methods for managing secrets.
   * </pre>
   */
  public static abstract class SecretServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified secret.
     * To get the list of all available secrets, make a [List] request.
     * Use [PayloadService.Get] to get the payload (confidential data themselves) of the secret.
     * </pre>
     */
    public void get(yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.GetSecretRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.lockbox.v1.SecretOuterClass.Secret> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of secrets in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ListSecretsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ListSecretsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a secret in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.CreateSecretRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified secret.
     * </pre>
     */
    public void update(yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.UpdateSecretRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified secret.
     * </pre>
     */
    public void delete(yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.DeleteSecretRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Activates the specified secret.
     * </pre>
     */
    public void activate(yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ActivateSecretRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getActivateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deactivates the specified secret.
     * </pre>
     */
    public void deactivate(yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.DeactivateSecretRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getDeactivateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of versions of the specified secret.
     * </pre>
     */
    public void listVersions(yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ListVersionsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ListVersionsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListVersionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Adds new version based on a previous one.
     * </pre>
     */
    public void addVersion(yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.AddVersionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getAddVersionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Schedules the specified version for destruction.
     * Scheduled destruction can be cancelled with the [SecretService.CancelVersionDestruction] method.
     * </pre>
     */
    public void scheduleVersionDestruction(yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ScheduleVersionDestructionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getScheduleVersionDestructionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Cancels previously scheduled version destruction, if the version hasn't been destroyed yet.
     * </pre>
     */
    public void cancelVersionDestruction(yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.CancelVersionDestructionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getCancelVersionDestructionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified secret.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ListSecretOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ListSecretOperationsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists existing access bindings for the specified secret.
     * </pre>
     */
    public void listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.access.Access.ListAccessBindingsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListAccessBindingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sets access bindings for the secret.
     * </pre>
     */
    public void setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getSetAccessBindingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates access bindings for the secret.
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
                yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.GetSecretRequest,
                yandex.cloud.api.lockbox.v1.SecretOuterClass.Secret>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ListSecretsRequest,
                yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ListSecretsResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.CreateSecretRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.UpdateSecretRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.DeleteSecretRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getActivateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ActivateSecretRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_ACTIVATE)))
          .addMethod(
            getDeactivateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.DeactivateSecretRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DEACTIVATE)))
          .addMethod(
            getListVersionsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ListVersionsRequest,
                yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ListVersionsResponse>(
                  this, METHODID_LIST_VERSIONS)))
          .addMethod(
            getAddVersionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.AddVersionRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_ADD_VERSION)))
          .addMethod(
            getScheduleVersionDestructionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ScheduleVersionDestructionRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_SCHEDULE_VERSION_DESTRUCTION)))
          .addMethod(
            getCancelVersionDestructionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.CancelVersionDestructionRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CANCEL_VERSION_DESTRUCTION)))
          .addMethod(
            getListOperationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ListSecretOperationsRequest,
                yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ListSecretOperationsResponse>(
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
   * A set of methods for managing secrets.
   * </pre>
   */
  public static final class SecretServiceStub extends io.grpc.stub.AbstractStub<SecretServiceStub> {
    private SecretServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SecretServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SecretServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SecretServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified secret.
     * To get the list of all available secrets, make a [List] request.
     * Use [PayloadService.Get] to get the payload (confidential data themselves) of the secret.
     * </pre>
     */
    public void get(yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.GetSecretRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.lockbox.v1.SecretOuterClass.Secret> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of secrets in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ListSecretsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ListSecretsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a secret in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.CreateSecretRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified secret.
     * </pre>
     */
    public void update(yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.UpdateSecretRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified secret.
     * </pre>
     */
    public void delete(yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.DeleteSecretRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Activates the specified secret.
     * </pre>
     */
    public void activate(yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ActivateSecretRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getActivateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deactivates the specified secret.
     * </pre>
     */
    public void deactivate(yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.DeactivateSecretRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeactivateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of versions of the specified secret.
     * </pre>
     */
    public void listVersions(yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ListVersionsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ListVersionsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListVersionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Adds new version based on a previous one.
     * </pre>
     */
    public void addVersion(yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.AddVersionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddVersionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Schedules the specified version for destruction.
     * Scheduled destruction can be cancelled with the [SecretService.CancelVersionDestruction] method.
     * </pre>
     */
    public void scheduleVersionDestruction(yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ScheduleVersionDestructionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getScheduleVersionDestructionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Cancels previously scheduled version destruction, if the version hasn't been destroyed yet.
     * </pre>
     */
    public void cancelVersionDestruction(yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.CancelVersionDestructionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCancelVersionDestructionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified secret.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ListSecretOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ListSecretOperationsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists existing access bindings for the specified secret.
     * </pre>
     */
    public void listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.access.Access.ListAccessBindingsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sets access bindings for the secret.
     * </pre>
     */
    public void setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates access bindings for the secret.
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
   * A set of methods for managing secrets.
   * </pre>
   */
  public static final class SecretServiceBlockingStub extends io.grpc.stub.AbstractStub<SecretServiceBlockingStub> {
    private SecretServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SecretServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SecretServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SecretServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified secret.
     * To get the list of all available secrets, make a [List] request.
     * Use [PayloadService.Get] to get the payload (confidential data themselves) of the secret.
     * </pre>
     */
    public yandex.cloud.api.lockbox.v1.SecretOuterClass.Secret get(yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.GetSecretRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of secrets in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ListSecretsResponse list(yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ListSecretsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a secret in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.CreateSecretRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified secret.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.UpdateSecretRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified secret.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.DeleteSecretRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Activates the specified secret.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation activate(yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ActivateSecretRequest request) {
      return blockingUnaryCall(
          getChannel(), getActivateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deactivates the specified secret.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation deactivate(yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.DeactivateSecretRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeactivateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of versions of the specified secret.
     * </pre>
     */
    public yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ListVersionsResponse listVersions(yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ListVersionsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListVersionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Adds new version based on a previous one.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation addVersion(yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.AddVersionRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddVersionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Schedules the specified version for destruction.
     * Scheduled destruction can be cancelled with the [SecretService.CancelVersionDestruction] method.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation scheduleVersionDestruction(yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ScheduleVersionDestructionRequest request) {
      return blockingUnaryCall(
          getChannel(), getScheduleVersionDestructionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Cancels previously scheduled version destruction, if the version hasn't been destroyed yet.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation cancelVersionDestruction(yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.CancelVersionDestructionRequest request) {
      return blockingUnaryCall(
          getChannel(), getCancelVersionDestructionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists operations for the specified secret.
     * </pre>
     */
    public yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ListSecretOperationsResponse listOperations(yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ListSecretOperationsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists existing access bindings for the specified secret.
     * </pre>
     */
    public yandex.cloud.api.access.Access.ListAccessBindingsResponse listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListAccessBindingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets access bindings for the secret.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetAccessBindingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates access bindings for the secret.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation updateAccessBindings(yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateAccessBindingsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing secrets.
   * </pre>
   */
  public static final class SecretServiceFutureStub extends io.grpc.stub.AbstractStub<SecretServiceFutureStub> {
    private SecretServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SecretServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SecretServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SecretServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified secret.
     * To get the list of all available secrets, make a [List] request.
     * Use [PayloadService.Get] to get the payload (confidential data themselves) of the secret.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.lockbox.v1.SecretOuterClass.Secret> get(
        yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.GetSecretRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of secrets in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ListSecretsResponse> list(
        yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ListSecretsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a secret in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.CreateSecretRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified secret.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.UpdateSecretRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified secret.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.DeleteSecretRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Activates the specified secret.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> activate(
        yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ActivateSecretRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getActivateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deactivates the specified secret.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> deactivate(
        yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.DeactivateSecretRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeactivateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of versions of the specified secret.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ListVersionsResponse> listVersions(
        yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ListVersionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListVersionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Adds new version based on a previous one.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> addVersion(
        yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.AddVersionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddVersionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Schedules the specified version for destruction.
     * Scheduled destruction can be cancelled with the [SecretService.CancelVersionDestruction] method.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> scheduleVersionDestruction(
        yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ScheduleVersionDestructionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getScheduleVersionDestructionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Cancels previously scheduled version destruction, if the version hasn't been destroyed yet.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> cancelVersionDestruction(
        yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.CancelVersionDestructionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCancelVersionDestructionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists operations for the specified secret.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ListSecretOperationsResponse> listOperations(
        yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ListSecretOperationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists existing access bindings for the specified secret.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.access.Access.ListAccessBindingsResponse> listAccessBindings(
        yandex.cloud.api.access.Access.ListAccessBindingsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListAccessBindingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sets access bindings for the secret.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> setAccessBindings(
        yandex.cloud.api.access.Access.SetAccessBindingsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetAccessBindingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates access bindings for the secret.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> updateAccessBindings(
        yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateAccessBindingsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_DELETE = 4;
  private static final int METHODID_ACTIVATE = 5;
  private static final int METHODID_DEACTIVATE = 6;
  private static final int METHODID_LIST_VERSIONS = 7;
  private static final int METHODID_ADD_VERSION = 8;
  private static final int METHODID_SCHEDULE_VERSION_DESTRUCTION = 9;
  private static final int METHODID_CANCEL_VERSION_DESTRUCTION = 10;
  private static final int METHODID_LIST_OPERATIONS = 11;
  private static final int METHODID_LIST_ACCESS_BINDINGS = 12;
  private static final int METHODID_SET_ACCESS_BINDINGS = 13;
  private static final int METHODID_UPDATE_ACCESS_BINDINGS = 14;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SecretServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SecretServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.GetSecretRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.lockbox.v1.SecretOuterClass.Secret>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ListSecretsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ListSecretsResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.CreateSecretRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.UpdateSecretRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.DeleteSecretRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_ACTIVATE:
          serviceImpl.activate((yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ActivateSecretRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DEACTIVATE:
          serviceImpl.deactivate((yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.DeactivateSecretRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_VERSIONS:
          serviceImpl.listVersions((yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ListVersionsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ListVersionsResponse>) responseObserver);
          break;
        case METHODID_ADD_VERSION:
          serviceImpl.addVersion((yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.AddVersionRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_SCHEDULE_VERSION_DESTRUCTION:
          serviceImpl.scheduleVersionDestruction((yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ScheduleVersionDestructionRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_CANCEL_VERSION_DESTRUCTION:
          serviceImpl.cancelVersionDestruction((yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.CancelVersionDestructionRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ListSecretOperationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.ListSecretOperationsResponse>) responseObserver);
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

  private static abstract class SecretServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SecretServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.lockbox.v1.SecretServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SecretService");
    }
  }

  private static final class SecretServiceFileDescriptorSupplier
      extends SecretServiceBaseDescriptorSupplier {
    SecretServiceFileDescriptorSupplier() {}
  }

  private static final class SecretServiceMethodDescriptorSupplier
      extends SecretServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SecretServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SecretServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SecretServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getActivateMethod())
              .addMethod(getDeactivateMethod())
              .addMethod(getListVersionsMethod())
              .addMethod(getAddVersionMethod())
              .addMethod(getScheduleVersionDestructionMethod())
              .addMethod(getCancelVersionDestructionMethod())
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
