package yandex.cloud.api.organizationmanager.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * a set of methods for managing MFA enforcements
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/organizationmanager/v1/mfa_enforcement_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MfaEnforcementServiceGrpc {

  private MfaEnforcementServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.organizationmanager.v1.MfaEnforcementService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.CreateMfaEnforcementRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.CreateMfaEnforcementRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.CreateMfaEnforcementRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.CreateMfaEnforcementRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = MfaEnforcementServiceGrpc.getCreateMethod) == null) {
      synchronized (MfaEnforcementServiceGrpc.class) {
        if ((getCreateMethod = MfaEnforcementServiceGrpc.getCreateMethod) == null) {
          MfaEnforcementServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.CreateMfaEnforcementRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.CreateMfaEnforcementRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new MfaEnforcementServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.UpdateMfaEnforcementRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.UpdateMfaEnforcementRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.UpdateMfaEnforcementRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.UpdateMfaEnforcementRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = MfaEnforcementServiceGrpc.getUpdateMethod) == null) {
      synchronized (MfaEnforcementServiceGrpc.class) {
        if ((getUpdateMethod = MfaEnforcementServiceGrpc.getUpdateMethod) == null) {
          MfaEnforcementServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.UpdateMfaEnforcementRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.UpdateMfaEnforcementRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new MfaEnforcementServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ActivateMfaEnforcementRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getActivateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Activate",
      requestType = yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ActivateMfaEnforcementRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ActivateMfaEnforcementRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getActivateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ActivateMfaEnforcementRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getActivateMethod;
    if ((getActivateMethod = MfaEnforcementServiceGrpc.getActivateMethod) == null) {
      synchronized (MfaEnforcementServiceGrpc.class) {
        if ((getActivateMethod = MfaEnforcementServiceGrpc.getActivateMethod) == null) {
          MfaEnforcementServiceGrpc.getActivateMethod = getActivateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ActivateMfaEnforcementRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Activate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ActivateMfaEnforcementRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new MfaEnforcementServiceMethodDescriptorSupplier("Activate"))
              .build();
        }
      }
    }
    return getActivateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.DeactivateMfaEnforcementRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeactivateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Deactivate",
      requestType = yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.DeactivateMfaEnforcementRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.DeactivateMfaEnforcementRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeactivateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.DeactivateMfaEnforcementRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeactivateMethod;
    if ((getDeactivateMethod = MfaEnforcementServiceGrpc.getDeactivateMethod) == null) {
      synchronized (MfaEnforcementServiceGrpc.class) {
        if ((getDeactivateMethod = MfaEnforcementServiceGrpc.getDeactivateMethod) == null) {
          MfaEnforcementServiceGrpc.getDeactivateMethod = getDeactivateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.DeactivateMfaEnforcementRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Deactivate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.DeactivateMfaEnforcementRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new MfaEnforcementServiceMethodDescriptorSupplier("Deactivate"))
              .build();
        }
      }
    }
    return getDeactivateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.DeleteMfaEnforcementRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.DeleteMfaEnforcementRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.DeleteMfaEnforcementRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.DeleteMfaEnforcementRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = MfaEnforcementServiceGrpc.getDeleteMethod) == null) {
      synchronized (MfaEnforcementServiceGrpc.class) {
        if ((getDeleteMethod = MfaEnforcementServiceGrpc.getDeleteMethod) == null) {
          MfaEnforcementServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.DeleteMfaEnforcementRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.DeleteMfaEnforcementRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new MfaEnforcementServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.GetMfaEnforcementRequest,
      yandex.cloud.api.organizationmanager.v1.MfaEnforcementOuterClass.MfaEnforcement> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.GetMfaEnforcementRequest.class,
      responseType = yandex.cloud.api.organizationmanager.v1.MfaEnforcementOuterClass.MfaEnforcement.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.GetMfaEnforcementRequest,
      yandex.cloud.api.organizationmanager.v1.MfaEnforcementOuterClass.MfaEnforcement> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.GetMfaEnforcementRequest, yandex.cloud.api.organizationmanager.v1.MfaEnforcementOuterClass.MfaEnforcement> getGetMethod;
    if ((getGetMethod = MfaEnforcementServiceGrpc.getGetMethod) == null) {
      synchronized (MfaEnforcementServiceGrpc.class) {
        if ((getGetMethod = MfaEnforcementServiceGrpc.getGetMethod) == null) {
          MfaEnforcementServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.GetMfaEnforcementRequest, yandex.cloud.api.organizationmanager.v1.MfaEnforcementOuterClass.MfaEnforcement>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.GetMfaEnforcementRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.MfaEnforcementOuterClass.MfaEnforcement.getDefaultInstance()))
              .setSchemaDescriptor(new MfaEnforcementServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ListMfaEnforcementsRequest,
      yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ListMfaEnforcementsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ListMfaEnforcementsRequest.class,
      responseType = yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ListMfaEnforcementsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ListMfaEnforcementsRequest,
      yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ListMfaEnforcementsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ListMfaEnforcementsRequest, yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ListMfaEnforcementsResponse> getListMethod;
    if ((getListMethod = MfaEnforcementServiceGrpc.getListMethod) == null) {
      synchronized (MfaEnforcementServiceGrpc.class) {
        if ((getListMethod = MfaEnforcementServiceGrpc.getListMethod) == null) {
          MfaEnforcementServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ListMfaEnforcementsRequest, yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ListMfaEnforcementsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ListMfaEnforcementsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ListMfaEnforcementsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MfaEnforcementServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.UpdateAudienceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateAudienceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAudience",
      requestType = yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.UpdateAudienceRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.UpdateAudienceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateAudienceMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.UpdateAudienceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateAudienceMethod;
    if ((getUpdateAudienceMethod = MfaEnforcementServiceGrpc.getUpdateAudienceMethod) == null) {
      synchronized (MfaEnforcementServiceGrpc.class) {
        if ((getUpdateAudienceMethod = MfaEnforcementServiceGrpc.getUpdateAudienceMethod) == null) {
          MfaEnforcementServiceGrpc.getUpdateAudienceMethod = getUpdateAudienceMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.UpdateAudienceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAudience"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.UpdateAudienceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new MfaEnforcementServiceMethodDescriptorSupplier("UpdateAudience"))
              .build();
        }
      }
    }
    return getUpdateAudienceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ListAudienceRequest,
      yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ListAudienceResponse> getListAudienceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAudience",
      requestType = yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ListAudienceRequest.class,
      responseType = yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ListAudienceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ListAudienceRequest,
      yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ListAudienceResponse> getListAudienceMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ListAudienceRequest, yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ListAudienceResponse> getListAudienceMethod;
    if ((getListAudienceMethod = MfaEnforcementServiceGrpc.getListAudienceMethod) == null) {
      synchronized (MfaEnforcementServiceGrpc.class) {
        if ((getListAudienceMethod = MfaEnforcementServiceGrpc.getListAudienceMethod) == null) {
          MfaEnforcementServiceGrpc.getListAudienceMethod = getListAudienceMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ListAudienceRequest, yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ListAudienceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAudience"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ListAudienceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ListAudienceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MfaEnforcementServiceMethodDescriptorSupplier("ListAudience"))
              .build();
        }
      }
    }
    return getListAudienceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.UpdateExcludedAudienceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateExcludedAudienceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateExcludedAudience",
      requestType = yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.UpdateExcludedAudienceRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.UpdateExcludedAudienceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateExcludedAudienceMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.UpdateExcludedAudienceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateExcludedAudienceMethod;
    if ((getUpdateExcludedAudienceMethod = MfaEnforcementServiceGrpc.getUpdateExcludedAudienceMethod) == null) {
      synchronized (MfaEnforcementServiceGrpc.class) {
        if ((getUpdateExcludedAudienceMethod = MfaEnforcementServiceGrpc.getUpdateExcludedAudienceMethod) == null) {
          MfaEnforcementServiceGrpc.getUpdateExcludedAudienceMethod = getUpdateExcludedAudienceMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.UpdateExcludedAudienceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateExcludedAudience"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.UpdateExcludedAudienceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new MfaEnforcementServiceMethodDescriptorSupplier("UpdateExcludedAudience"))
              .build();
        }
      }
    }
    return getUpdateExcludedAudienceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ListExcludedAudienceRequest,
      yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ListExcludedAudienceResponse> getListExcludedAudienceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListExcludedAudience",
      requestType = yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ListExcludedAudienceRequest.class,
      responseType = yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ListExcludedAudienceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ListExcludedAudienceRequest,
      yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ListExcludedAudienceResponse> getListExcludedAudienceMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ListExcludedAudienceRequest, yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ListExcludedAudienceResponse> getListExcludedAudienceMethod;
    if ((getListExcludedAudienceMethod = MfaEnforcementServiceGrpc.getListExcludedAudienceMethod) == null) {
      synchronized (MfaEnforcementServiceGrpc.class) {
        if ((getListExcludedAudienceMethod = MfaEnforcementServiceGrpc.getListExcludedAudienceMethod) == null) {
          MfaEnforcementServiceGrpc.getListExcludedAudienceMethod = getListExcludedAudienceMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ListExcludedAudienceRequest, yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ListExcludedAudienceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListExcludedAudience"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ListExcludedAudienceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ListExcludedAudienceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MfaEnforcementServiceMethodDescriptorSupplier("ListExcludedAudience"))
              .build();
        }
      }
    }
    return getListExcludedAudienceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MfaEnforcementServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MfaEnforcementServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MfaEnforcementServiceStub>() {
        @java.lang.Override
        public MfaEnforcementServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MfaEnforcementServiceStub(channel, callOptions);
        }
      };
    return MfaEnforcementServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MfaEnforcementServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MfaEnforcementServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MfaEnforcementServiceBlockingStub>() {
        @java.lang.Override
        public MfaEnforcementServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MfaEnforcementServiceBlockingStub(channel, callOptions);
        }
      };
    return MfaEnforcementServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MfaEnforcementServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MfaEnforcementServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MfaEnforcementServiceFutureStub>() {
        @java.lang.Override
        public MfaEnforcementServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MfaEnforcementServiceFutureStub(channel, callOptions);
        }
      };
    return MfaEnforcementServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * a set of methods for managing MFA enforcements
   * </pre>
   */
  public static abstract class MfaEnforcementServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * creates an MFA enforcement in the specified organization
     * </pre>
     */
    public void create(yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.CreateMfaEnforcementRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * updates the specified MFA enforcement
     * </pre>
     */
    public void update(yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.UpdateMfaEnforcementRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * activates the specified MFA enforcement
     * </pre>
     */
    public void activate(yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ActivateMfaEnforcementRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getActivateMethod(), responseObserver);
    }

    /**
     * <pre>
     * deactivates the specified MFA enforcement
     * </pre>
     */
    public void deactivate(yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.DeactivateMfaEnforcementRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeactivateMethod(), responseObserver);
    }

    /**
     * <pre>
     * deletes the specified MFA enforcement
     * </pre>
     */
    public void delete(yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.DeleteMfaEnforcementRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * returns the specified MFA enforcement
     * </pre>
     */
    public void get(yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.GetMfaEnforcementRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.MfaEnforcementOuterClass.MfaEnforcement> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * returns MFA enforcements for the specified organization
     * </pre>
     */
    public void list(yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ListMfaEnforcementsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ListMfaEnforcementsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * updates specified MFA enforcement's audience
     * </pre>
     */
    public void updateAudience(yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.UpdateAudienceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAudienceMethod(), responseObserver);
    }

    /**
     * <pre>
     * returns specified MFA enforcement's audience
     * </pre>
     */
    public void listAudience(yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ListAudienceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ListAudienceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAudienceMethod(), responseObserver);
    }

    /**
     * <pre>
     * updates specified MFA enforcement's excluded audience
     * </pre>
     */
    public void updateExcludedAudience(yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.UpdateExcludedAudienceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateExcludedAudienceMethod(), responseObserver);
    }

    /**
     * <pre>
     * returns specified MFA enforcement's excluded audience
     * </pre>
     */
    public void listExcludedAudience(yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ListExcludedAudienceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ListExcludedAudienceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListExcludedAudienceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.CreateMfaEnforcementRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.UpdateMfaEnforcementRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getActivateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ActivateMfaEnforcementRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_ACTIVATE)))
          .addMethod(
            getDeactivateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.DeactivateMfaEnforcementRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DEACTIVATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.DeleteMfaEnforcementRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.GetMfaEnforcementRequest,
                yandex.cloud.api.organizationmanager.v1.MfaEnforcementOuterClass.MfaEnforcement>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ListMfaEnforcementsRequest,
                yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ListMfaEnforcementsResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getUpdateAudienceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.UpdateAudienceRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE_AUDIENCE)))
          .addMethod(
            getListAudienceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ListAudienceRequest,
                yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ListAudienceResponse>(
                  this, METHODID_LIST_AUDIENCE)))
          .addMethod(
            getUpdateExcludedAudienceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.UpdateExcludedAudienceRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE_EXCLUDED_AUDIENCE)))
          .addMethod(
            getListExcludedAudienceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ListExcludedAudienceRequest,
                yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ListExcludedAudienceResponse>(
                  this, METHODID_LIST_EXCLUDED_AUDIENCE)))
          .build();
    }
  }

  /**
   * <pre>
   * a set of methods for managing MFA enforcements
   * </pre>
   */
  public static final class MfaEnforcementServiceStub extends io.grpc.stub.AbstractAsyncStub<MfaEnforcementServiceStub> {
    private MfaEnforcementServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MfaEnforcementServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MfaEnforcementServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * creates an MFA enforcement in the specified organization
     * </pre>
     */
    public void create(yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.CreateMfaEnforcementRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * updates the specified MFA enforcement
     * </pre>
     */
    public void update(yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.UpdateMfaEnforcementRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * activates the specified MFA enforcement
     * </pre>
     */
    public void activate(yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ActivateMfaEnforcementRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getActivateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * deactivates the specified MFA enforcement
     * </pre>
     */
    public void deactivate(yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.DeactivateMfaEnforcementRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeactivateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * deletes the specified MFA enforcement
     * </pre>
     */
    public void delete(yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.DeleteMfaEnforcementRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * returns the specified MFA enforcement
     * </pre>
     */
    public void get(yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.GetMfaEnforcementRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.MfaEnforcementOuterClass.MfaEnforcement> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * returns MFA enforcements for the specified organization
     * </pre>
     */
    public void list(yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ListMfaEnforcementsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ListMfaEnforcementsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * updates specified MFA enforcement's audience
     * </pre>
     */
    public void updateAudience(yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.UpdateAudienceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAudienceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * returns specified MFA enforcement's audience
     * </pre>
     */
    public void listAudience(yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ListAudienceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ListAudienceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAudienceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * updates specified MFA enforcement's excluded audience
     * </pre>
     */
    public void updateExcludedAudience(yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.UpdateExcludedAudienceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateExcludedAudienceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * returns specified MFA enforcement's excluded audience
     * </pre>
     */
    public void listExcludedAudience(yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ListExcludedAudienceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ListExcludedAudienceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListExcludedAudienceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * a set of methods for managing MFA enforcements
   * </pre>
   */
  public static final class MfaEnforcementServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<MfaEnforcementServiceBlockingStub> {
    private MfaEnforcementServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MfaEnforcementServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MfaEnforcementServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * creates an MFA enforcement in the specified organization
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.CreateMfaEnforcementRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * updates the specified MFA enforcement
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.UpdateMfaEnforcementRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * activates the specified MFA enforcement
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation activate(yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ActivateMfaEnforcementRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getActivateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * deactivates the specified MFA enforcement
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation deactivate(yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.DeactivateMfaEnforcementRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeactivateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * deletes the specified MFA enforcement
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.DeleteMfaEnforcementRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * returns the specified MFA enforcement
     * </pre>
     */
    public yandex.cloud.api.organizationmanager.v1.MfaEnforcementOuterClass.MfaEnforcement get(yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.GetMfaEnforcementRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * returns MFA enforcements for the specified organization
     * </pre>
     */
    public yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ListMfaEnforcementsResponse list(yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ListMfaEnforcementsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * updates specified MFA enforcement's audience
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation updateAudience(yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.UpdateAudienceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAudienceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * returns specified MFA enforcement's audience
     * </pre>
     */
    public yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ListAudienceResponse listAudience(yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ListAudienceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAudienceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * updates specified MFA enforcement's excluded audience
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation updateExcludedAudience(yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.UpdateExcludedAudienceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateExcludedAudienceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * returns specified MFA enforcement's excluded audience
     * </pre>
     */
    public yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ListExcludedAudienceResponse listExcludedAudience(yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ListExcludedAudienceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListExcludedAudienceMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * a set of methods for managing MFA enforcements
   * </pre>
   */
  public static final class MfaEnforcementServiceFutureStub extends io.grpc.stub.AbstractFutureStub<MfaEnforcementServiceFutureStub> {
    private MfaEnforcementServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MfaEnforcementServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MfaEnforcementServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * creates an MFA enforcement in the specified organization
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.CreateMfaEnforcementRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * updates the specified MFA enforcement
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.UpdateMfaEnforcementRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * activates the specified MFA enforcement
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> activate(
        yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ActivateMfaEnforcementRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getActivateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * deactivates the specified MFA enforcement
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> deactivate(
        yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.DeactivateMfaEnforcementRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeactivateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * deletes the specified MFA enforcement
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.DeleteMfaEnforcementRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * returns the specified MFA enforcement
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.organizationmanager.v1.MfaEnforcementOuterClass.MfaEnforcement> get(
        yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.GetMfaEnforcementRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * returns MFA enforcements for the specified organization
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ListMfaEnforcementsResponse> list(
        yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ListMfaEnforcementsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * updates specified MFA enforcement's audience
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> updateAudience(
        yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.UpdateAudienceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAudienceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * returns specified MFA enforcement's audience
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ListAudienceResponse> listAudience(
        yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ListAudienceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAudienceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * updates specified MFA enforcement's excluded audience
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> updateExcludedAudience(
        yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.UpdateExcludedAudienceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateExcludedAudienceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * returns specified MFA enforcement's excluded audience
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ListExcludedAudienceResponse> listExcludedAudience(
        yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ListExcludedAudienceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListExcludedAudienceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_UPDATE = 1;
  private static final int METHODID_ACTIVATE = 2;
  private static final int METHODID_DEACTIVATE = 3;
  private static final int METHODID_DELETE = 4;
  private static final int METHODID_GET = 5;
  private static final int METHODID_LIST = 6;
  private static final int METHODID_UPDATE_AUDIENCE = 7;
  private static final int METHODID_LIST_AUDIENCE = 8;
  private static final int METHODID_UPDATE_EXCLUDED_AUDIENCE = 9;
  private static final int METHODID_LIST_EXCLUDED_AUDIENCE = 10;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MfaEnforcementServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MfaEnforcementServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.CreateMfaEnforcementRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.UpdateMfaEnforcementRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_ACTIVATE:
          serviceImpl.activate((yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ActivateMfaEnforcementRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DEACTIVATE:
          serviceImpl.deactivate((yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.DeactivateMfaEnforcementRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.DeleteMfaEnforcementRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.GetMfaEnforcementRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.MfaEnforcementOuterClass.MfaEnforcement>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ListMfaEnforcementsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ListMfaEnforcementsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_AUDIENCE:
          serviceImpl.updateAudience((yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.UpdateAudienceRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_AUDIENCE:
          serviceImpl.listAudience((yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ListAudienceRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ListAudienceResponse>) responseObserver);
          break;
        case METHODID_UPDATE_EXCLUDED_AUDIENCE:
          serviceImpl.updateExcludedAudience((yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.UpdateExcludedAudienceRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_EXCLUDED_AUDIENCE:
          serviceImpl.listExcludedAudience((yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ListExcludedAudienceRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.ListExcludedAudienceResponse>) responseObserver);
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

  private static abstract class MfaEnforcementServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MfaEnforcementServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.organizationmanager.v1.MfaEnforcementServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MfaEnforcementService");
    }
  }

  private static final class MfaEnforcementServiceFileDescriptorSupplier
      extends MfaEnforcementServiceBaseDescriptorSupplier {
    MfaEnforcementServiceFileDescriptorSupplier() {}
  }

  private static final class MfaEnforcementServiceMethodDescriptorSupplier
      extends MfaEnforcementServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MfaEnforcementServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MfaEnforcementServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MfaEnforcementServiceFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getActivateMethod())
              .addMethod(getDeactivateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getUpdateAudienceMethod())
              .addMethod(getListAudienceMethod())
              .addMethod(getUpdateExcludedAudienceMethod())
              .addMethod(getListExcludedAudienceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
