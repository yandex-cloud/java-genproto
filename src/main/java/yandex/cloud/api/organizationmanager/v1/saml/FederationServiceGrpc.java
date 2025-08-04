package yandex.cloud.api.organizationmanager.v1.saml;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing federations.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/organizationmanager/v1/saml/federation_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class FederationServiceGrpc {

  private FederationServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.organizationmanager.v1.saml.FederationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.GetFederationRequest,
      yandex.cloud.api.organizationmanager.v1.saml.FederationOuterClass.Federation> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.GetFederationRequest.class,
      responseType = yandex.cloud.api.organizationmanager.v1.saml.FederationOuterClass.Federation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.GetFederationRequest,
      yandex.cloud.api.organizationmanager.v1.saml.FederationOuterClass.Federation> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.GetFederationRequest, yandex.cloud.api.organizationmanager.v1.saml.FederationOuterClass.Federation> getGetMethod;
    if ((getGetMethod = FederationServiceGrpc.getGetMethod) == null) {
      synchronized (FederationServiceGrpc.class) {
        if ((getGetMethod = FederationServiceGrpc.getGetMethod) == null) {
          FederationServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.GetFederationRequest, yandex.cloud.api.organizationmanager.v1.saml.FederationOuterClass.Federation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.GetFederationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.saml.FederationOuterClass.Federation.getDefaultInstance()))
              .setSchemaDescriptor(new FederationServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederationsRequest,
      yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederationsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederationsRequest.class,
      responseType = yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederationsRequest,
      yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederationsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederationsRequest, yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederationsResponse> getListMethod;
    if ((getListMethod = FederationServiceGrpc.getListMethod) == null) {
      synchronized (FederationServiceGrpc.class) {
        if ((getListMethod = FederationServiceGrpc.getListMethod) == null) {
          FederationServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederationsRequest, yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FederationServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.CreateFederationRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.CreateFederationRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.CreateFederationRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.CreateFederationRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = FederationServiceGrpc.getCreateMethod) == null) {
      synchronized (FederationServiceGrpc.class) {
        if ((getCreateMethod = FederationServiceGrpc.getCreateMethod) == null) {
          FederationServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.CreateFederationRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.CreateFederationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new FederationServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.UpdateFederationRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.UpdateFederationRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.UpdateFederationRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.UpdateFederationRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = FederationServiceGrpc.getUpdateMethod) == null) {
      synchronized (FederationServiceGrpc.class) {
        if ((getUpdateMethod = FederationServiceGrpc.getUpdateMethod) == null) {
          FederationServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.UpdateFederationRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.UpdateFederationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new FederationServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.DeleteFederationRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.DeleteFederationRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.DeleteFederationRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.DeleteFederationRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = FederationServiceGrpc.getDeleteMethod) == null) {
      synchronized (FederationServiceGrpc.class) {
        if ((getDeleteMethod = FederationServiceGrpc.getDeleteMethod) == null) {
          FederationServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.DeleteFederationRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.DeleteFederationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new FederationServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.AddFederatedUserAccountsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getAddUserAccountsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddUserAccounts",
      requestType = yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.AddFederatedUserAccountsRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.AddFederatedUserAccountsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getAddUserAccountsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.AddFederatedUserAccountsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getAddUserAccountsMethod;
    if ((getAddUserAccountsMethod = FederationServiceGrpc.getAddUserAccountsMethod) == null) {
      synchronized (FederationServiceGrpc.class) {
        if ((getAddUserAccountsMethod = FederationServiceGrpc.getAddUserAccountsMethod) == null) {
          FederationServiceGrpc.getAddUserAccountsMethod = getAddUserAccountsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.AddFederatedUserAccountsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddUserAccounts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.AddFederatedUserAccountsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new FederationServiceMethodDescriptorSupplier("AddUserAccounts"))
              .build();
        }
      }
    }
    return getAddUserAccountsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.DeleteFederatedUserAccountsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteUserAccountsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteUserAccounts",
      requestType = yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.DeleteFederatedUserAccountsRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.DeleteFederatedUserAccountsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteUserAccountsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.DeleteFederatedUserAccountsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteUserAccountsMethod;
    if ((getDeleteUserAccountsMethod = FederationServiceGrpc.getDeleteUserAccountsMethod) == null) {
      synchronized (FederationServiceGrpc.class) {
        if ((getDeleteUserAccountsMethod = FederationServiceGrpc.getDeleteUserAccountsMethod) == null) {
          FederationServiceGrpc.getDeleteUserAccountsMethod = getDeleteUserAccountsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.DeleteFederatedUserAccountsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteUserAccounts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.DeleteFederatedUserAccountsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new FederationServiceMethodDescriptorSupplier("DeleteUserAccounts"))
              .build();
        }
      }
    }
    return getDeleteUserAccountsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederatedUserAccountsRequest,
      yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederatedUserAccountsResponse> getListUserAccountsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListUserAccounts",
      requestType = yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederatedUserAccountsRequest.class,
      responseType = yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederatedUserAccountsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederatedUserAccountsRequest,
      yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederatedUserAccountsResponse> getListUserAccountsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederatedUserAccountsRequest, yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederatedUserAccountsResponse> getListUserAccountsMethod;
    if ((getListUserAccountsMethod = FederationServiceGrpc.getListUserAccountsMethod) == null) {
      synchronized (FederationServiceGrpc.class) {
        if ((getListUserAccountsMethod = FederationServiceGrpc.getListUserAccountsMethod) == null) {
          FederationServiceGrpc.getListUserAccountsMethod = getListUserAccountsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederatedUserAccountsRequest, yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederatedUserAccountsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListUserAccounts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederatedUserAccountsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederatedUserAccountsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FederationServiceMethodDescriptorSupplier("ListUserAccounts"))
              .build();
        }
      }
    }
    return getListUserAccountsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederationOperationsRequest,
      yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederationOperationsResponse> getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederationOperationsRequest.class,
      responseType = yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederationOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederationOperationsRequest,
      yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederationOperationsResponse> getListOperationsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederationOperationsRequest, yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederationOperationsResponse> getListOperationsMethod;
    if ((getListOperationsMethod = FederationServiceGrpc.getListOperationsMethod) == null) {
      synchronized (FederationServiceGrpc.class) {
        if ((getListOperationsMethod = FederationServiceGrpc.getListOperationsMethod) == null) {
          FederationServiceGrpc.getListOperationsMethod = getListOperationsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederationOperationsRequest, yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederationOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederationOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederationOperationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FederationServiceMethodDescriptorSupplier("ListOperations"))
              .build();
        }
      }
    }
    return getListOperationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.GetFederationDomainRequest,
      yandex.cloud.api.organizationmanager.v1.saml.FederationOuterClass.Domain> getGetDomainMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDomain",
      requestType = yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.GetFederationDomainRequest.class,
      responseType = yandex.cloud.api.organizationmanager.v1.saml.FederationOuterClass.Domain.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.GetFederationDomainRequest,
      yandex.cloud.api.organizationmanager.v1.saml.FederationOuterClass.Domain> getGetDomainMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.GetFederationDomainRequest, yandex.cloud.api.organizationmanager.v1.saml.FederationOuterClass.Domain> getGetDomainMethod;
    if ((getGetDomainMethod = FederationServiceGrpc.getGetDomainMethod) == null) {
      synchronized (FederationServiceGrpc.class) {
        if ((getGetDomainMethod = FederationServiceGrpc.getGetDomainMethod) == null) {
          FederationServiceGrpc.getGetDomainMethod = getGetDomainMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.GetFederationDomainRequest, yandex.cloud.api.organizationmanager.v1.saml.FederationOuterClass.Domain>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDomain"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.GetFederationDomainRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.saml.FederationOuterClass.Domain.getDefaultInstance()))
              .setSchemaDescriptor(new FederationServiceMethodDescriptorSupplier("GetDomain"))
              .build();
        }
      }
    }
    return getGetDomainMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederationDomainsRequest,
      yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederationDomainsResponse> getListDomainsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDomains",
      requestType = yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederationDomainsRequest.class,
      responseType = yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederationDomainsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederationDomainsRequest,
      yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederationDomainsResponse> getListDomainsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederationDomainsRequest, yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederationDomainsResponse> getListDomainsMethod;
    if ((getListDomainsMethod = FederationServiceGrpc.getListDomainsMethod) == null) {
      synchronized (FederationServiceGrpc.class) {
        if ((getListDomainsMethod = FederationServiceGrpc.getListDomainsMethod) == null) {
          FederationServiceGrpc.getListDomainsMethod = getListDomainsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederationDomainsRequest, yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederationDomainsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListDomains"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederationDomainsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederationDomainsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FederationServiceMethodDescriptorSupplier("ListDomains"))
              .build();
        }
      }
    }
    return getListDomainsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.AddFederationDomainRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getAddDomainMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddDomain",
      requestType = yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.AddFederationDomainRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.AddFederationDomainRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getAddDomainMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.AddFederationDomainRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getAddDomainMethod;
    if ((getAddDomainMethod = FederationServiceGrpc.getAddDomainMethod) == null) {
      synchronized (FederationServiceGrpc.class) {
        if ((getAddDomainMethod = FederationServiceGrpc.getAddDomainMethod) == null) {
          FederationServiceGrpc.getAddDomainMethod = getAddDomainMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.AddFederationDomainRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddDomain"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.AddFederationDomainRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new FederationServiceMethodDescriptorSupplier("AddDomain"))
              .build();
        }
      }
    }
    return getAddDomainMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ValidateFederationDomainRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getValidateDomainMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValidateDomain",
      requestType = yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ValidateFederationDomainRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ValidateFederationDomainRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getValidateDomainMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ValidateFederationDomainRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getValidateDomainMethod;
    if ((getValidateDomainMethod = FederationServiceGrpc.getValidateDomainMethod) == null) {
      synchronized (FederationServiceGrpc.class) {
        if ((getValidateDomainMethod = FederationServiceGrpc.getValidateDomainMethod) == null) {
          FederationServiceGrpc.getValidateDomainMethod = getValidateDomainMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ValidateFederationDomainRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValidateDomain"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ValidateFederationDomainRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new FederationServiceMethodDescriptorSupplier("ValidateDomain"))
              .build();
        }
      }
    }
    return getValidateDomainMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.DeleteFederationDomainRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteDomainMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteDomain",
      requestType = yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.DeleteFederationDomainRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.DeleteFederationDomainRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteDomainMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.DeleteFederationDomainRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteDomainMethod;
    if ((getDeleteDomainMethod = FederationServiceGrpc.getDeleteDomainMethod) == null) {
      synchronized (FederationServiceGrpc.class) {
        if ((getDeleteDomainMethod = FederationServiceGrpc.getDeleteDomainMethod) == null) {
          FederationServiceGrpc.getDeleteDomainMethod = getDeleteDomainMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.DeleteFederationDomainRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteDomain"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.DeleteFederationDomainRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new FederationServiceMethodDescriptorSupplier("DeleteDomain"))
              .build();
        }
      }
    }
    return getDeleteDomainMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FederationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FederationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FederationServiceStub>() {
        @java.lang.Override
        public FederationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FederationServiceStub(channel, callOptions);
        }
      };
    return FederationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FederationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FederationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FederationServiceBlockingStub>() {
        @java.lang.Override
        public FederationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FederationServiceBlockingStub(channel, callOptions);
        }
      };
    return FederationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FederationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FederationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FederationServiceFutureStub>() {
        @java.lang.Override
        public FederationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FederationServiceFutureStub(channel, callOptions);
        }
      };
    return FederationServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing federations.
   * </pre>
   */
  public static abstract class FederationServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified federation.
     * To get the list of available federations, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.GetFederationRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.saml.FederationOuterClass.Federation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of federations in the specified organization.
     * </pre>
     */
    public void list(yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a federation in the specified organization.
     * </pre>
     */
    public void create(yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.CreateFederationRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified federation.
     * </pre>
     */
    public void update(yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.UpdateFederationRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified federation.
     * </pre>
     */
    public void delete(yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.DeleteFederationRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Adds users to the specified federation.
     * </pre>
     */
    public void addUserAccounts(yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.AddFederatedUserAccountsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddUserAccountsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes users from the specified federation.
     * </pre>
     */
    public void deleteUserAccounts(yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.DeleteFederatedUserAccountsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteUserAccountsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists users for the specified federation.
     * </pre>
     */
    public void listUserAccounts(yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederatedUserAccountsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederatedUserAccountsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListUserAccountsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified federation.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederationOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederationOperationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the specified domain in the federation.
     * To get the list of available domains, make a [ListDomains] request.
     * </pre>
     */
    public void getDomain(yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.GetFederationDomainRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.saml.FederationOuterClass.Domain> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDomainMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of domains in the specified federation.
     * </pre>
     */
    public void listDomains(yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederationDomainsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederationDomainsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListDomainsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Adds a domain to the specified federation.
     * </pre>
     */
    public void addDomain(yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.AddFederationDomainRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddDomainMethod(), responseObserver);
    }

    /**
     * <pre>
     * Validates a domain in the specified federation.
     * </pre>
     */
    public void validateDomain(yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ValidateFederationDomainRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValidateDomainMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified domain from the federation.
     * </pre>
     */
    public void deleteDomain(yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.DeleteFederationDomainRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteDomainMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.GetFederationRequest,
                yandex.cloud.api.organizationmanager.v1.saml.FederationOuterClass.Federation>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederationsRequest,
                yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederationsResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.CreateFederationRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.UpdateFederationRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.DeleteFederationRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getAddUserAccountsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.AddFederatedUserAccountsRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_ADD_USER_ACCOUNTS)))
          .addMethod(
            getDeleteUserAccountsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.DeleteFederatedUserAccountsRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE_USER_ACCOUNTS)))
          .addMethod(
            getListUserAccountsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederatedUserAccountsRequest,
                yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederatedUserAccountsResponse>(
                  this, METHODID_LIST_USER_ACCOUNTS)))
          .addMethod(
            getListOperationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederationOperationsRequest,
                yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederationOperationsResponse>(
                  this, METHODID_LIST_OPERATIONS)))
          .addMethod(
            getGetDomainMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.GetFederationDomainRequest,
                yandex.cloud.api.organizationmanager.v1.saml.FederationOuterClass.Domain>(
                  this, METHODID_GET_DOMAIN)))
          .addMethod(
            getListDomainsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederationDomainsRequest,
                yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederationDomainsResponse>(
                  this, METHODID_LIST_DOMAINS)))
          .addMethod(
            getAddDomainMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.AddFederationDomainRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_ADD_DOMAIN)))
          .addMethod(
            getValidateDomainMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ValidateFederationDomainRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_VALIDATE_DOMAIN)))
          .addMethod(
            getDeleteDomainMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.DeleteFederationDomainRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE_DOMAIN)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing federations.
   * </pre>
   */
  public static final class FederationServiceStub extends io.grpc.stub.AbstractAsyncStub<FederationServiceStub> {
    private FederationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FederationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FederationServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified federation.
     * To get the list of available federations, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.GetFederationRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.saml.FederationOuterClass.Federation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of federations in the specified organization.
     * </pre>
     */
    public void list(yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a federation in the specified organization.
     * </pre>
     */
    public void create(yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.CreateFederationRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified federation.
     * </pre>
     */
    public void update(yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.UpdateFederationRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified federation.
     * </pre>
     */
    public void delete(yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.DeleteFederationRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Adds users to the specified federation.
     * </pre>
     */
    public void addUserAccounts(yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.AddFederatedUserAccountsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddUserAccountsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes users from the specified federation.
     * </pre>
     */
    public void deleteUserAccounts(yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.DeleteFederatedUserAccountsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteUserAccountsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists users for the specified federation.
     * </pre>
     */
    public void listUserAccounts(yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederatedUserAccountsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederatedUserAccountsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListUserAccountsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified federation.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederationOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederationOperationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the specified domain in the federation.
     * To get the list of available domains, make a [ListDomains] request.
     * </pre>
     */
    public void getDomain(yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.GetFederationDomainRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.saml.FederationOuterClass.Domain> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDomainMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of domains in the specified federation.
     * </pre>
     */
    public void listDomains(yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederationDomainsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederationDomainsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListDomainsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Adds a domain to the specified federation.
     * </pre>
     */
    public void addDomain(yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.AddFederationDomainRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddDomainMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Validates a domain in the specified federation.
     * </pre>
     */
    public void validateDomain(yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ValidateFederationDomainRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValidateDomainMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified domain from the federation.
     * </pre>
     */
    public void deleteDomain(yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.DeleteFederationDomainRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteDomainMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing federations.
   * </pre>
   */
  public static final class FederationServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<FederationServiceBlockingStub> {
    private FederationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FederationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FederationServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified federation.
     * To get the list of available federations, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.organizationmanager.v1.saml.FederationOuterClass.Federation get(yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.GetFederationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of federations in the specified organization.
     * </pre>
     */
    public yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederationsResponse list(yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a federation in the specified organization.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.CreateFederationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified federation.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.UpdateFederationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified federation.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.DeleteFederationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Adds users to the specified federation.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation addUserAccounts(yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.AddFederatedUserAccountsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddUserAccountsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes users from the specified federation.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation deleteUserAccounts(yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.DeleteFederatedUserAccountsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteUserAccountsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists users for the specified federation.
     * </pre>
     */
    public yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederatedUserAccountsResponse listUserAccounts(yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederatedUserAccountsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListUserAccountsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists operations for the specified federation.
     * </pre>
     */
    public yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederationOperationsResponse listOperations(yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederationOperationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the specified domain in the federation.
     * To get the list of available domains, make a [ListDomains] request.
     * </pre>
     */
    public yandex.cloud.api.organizationmanager.v1.saml.FederationOuterClass.Domain getDomain(yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.GetFederationDomainRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDomainMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of domains in the specified federation.
     * </pre>
     */
    public yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederationDomainsResponse listDomains(yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederationDomainsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListDomainsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Adds a domain to the specified federation.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation addDomain(yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.AddFederationDomainRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddDomainMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Validates a domain in the specified federation.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation validateDomain(yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ValidateFederationDomainRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidateDomainMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified domain from the federation.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation deleteDomain(yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.DeleteFederationDomainRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteDomainMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing federations.
   * </pre>
   */
  public static final class FederationServiceFutureStub extends io.grpc.stub.AbstractFutureStub<FederationServiceFutureStub> {
    private FederationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FederationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FederationServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified federation.
     * To get the list of available federations, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.organizationmanager.v1.saml.FederationOuterClass.Federation> get(
        yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.GetFederationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of federations in the specified organization.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederationsResponse> list(
        yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a federation in the specified organization.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.CreateFederationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified federation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.UpdateFederationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified federation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.DeleteFederationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Adds users to the specified federation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> addUserAccounts(
        yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.AddFederatedUserAccountsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddUserAccountsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes users from the specified federation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> deleteUserAccounts(
        yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.DeleteFederatedUserAccountsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteUserAccountsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists users for the specified federation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederatedUserAccountsResponse> listUserAccounts(
        yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederatedUserAccountsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListUserAccountsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists operations for the specified federation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederationOperationsResponse> listOperations(
        yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederationOperationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the specified domain in the federation.
     * To get the list of available domains, make a [ListDomains] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.organizationmanager.v1.saml.FederationOuterClass.Domain> getDomain(
        yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.GetFederationDomainRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDomainMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of domains in the specified federation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederationDomainsResponse> listDomains(
        yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederationDomainsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListDomainsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Adds a domain to the specified federation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> addDomain(
        yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.AddFederationDomainRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddDomainMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Validates a domain in the specified federation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> validateDomain(
        yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ValidateFederationDomainRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValidateDomainMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified domain from the federation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> deleteDomain(
        yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.DeleteFederationDomainRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteDomainMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_DELETE = 4;
  private static final int METHODID_ADD_USER_ACCOUNTS = 5;
  private static final int METHODID_DELETE_USER_ACCOUNTS = 6;
  private static final int METHODID_LIST_USER_ACCOUNTS = 7;
  private static final int METHODID_LIST_OPERATIONS = 8;
  private static final int METHODID_GET_DOMAIN = 9;
  private static final int METHODID_LIST_DOMAINS = 10;
  private static final int METHODID_ADD_DOMAIN = 11;
  private static final int METHODID_VALIDATE_DOMAIN = 12;
  private static final int METHODID_DELETE_DOMAIN = 13;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FederationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FederationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.GetFederationRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.saml.FederationOuterClass.Federation>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederationsResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.CreateFederationRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.UpdateFederationRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.DeleteFederationRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_ADD_USER_ACCOUNTS:
          serviceImpl.addUserAccounts((yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.AddFederatedUserAccountsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE_USER_ACCOUNTS:
          serviceImpl.deleteUserAccounts((yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.DeleteFederatedUserAccountsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_USER_ACCOUNTS:
          serviceImpl.listUserAccounts((yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederatedUserAccountsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederatedUserAccountsResponse>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederationOperationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederationOperationsResponse>) responseObserver);
          break;
        case METHODID_GET_DOMAIN:
          serviceImpl.getDomain((yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.GetFederationDomainRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.saml.FederationOuterClass.Domain>) responseObserver);
          break;
        case METHODID_LIST_DOMAINS:
          serviceImpl.listDomains((yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederationDomainsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ListFederationDomainsResponse>) responseObserver);
          break;
        case METHODID_ADD_DOMAIN:
          serviceImpl.addDomain((yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.AddFederationDomainRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_VALIDATE_DOMAIN:
          serviceImpl.validateDomain((yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.ValidateFederationDomainRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE_DOMAIN:
          serviceImpl.deleteDomain((yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.DeleteFederationDomainRequest) request,
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

  private static abstract class FederationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FederationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.organizationmanager.v1.saml.FederationServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FederationService");
    }
  }

  private static final class FederationServiceFileDescriptorSupplier
      extends FederationServiceBaseDescriptorSupplier {
    FederationServiceFileDescriptorSupplier() {}
  }

  private static final class FederationServiceMethodDescriptorSupplier
      extends FederationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FederationServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (FederationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FederationServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getAddUserAccountsMethod())
              .addMethod(getDeleteUserAccountsMethod())
              .addMethod(getListUserAccountsMethod())
              .addMethod(getListOperationsMethod())
              .addMethod(getGetDomainMethod())
              .addMethod(getListDomainsMethod())
              .addMethod(getAddDomainMethod())
              .addMethod(getValidateDomainMethod())
              .addMethod(getDeleteDomainMethod())
              .build();
        }
      }
    }
    return result;
  }
}
