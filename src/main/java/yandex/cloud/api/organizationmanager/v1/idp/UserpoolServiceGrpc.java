package yandex.cloud.api.organizationmanager.v1.idp;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing userpools.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/organizationmanager/v1/idp/userpool_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UserpoolServiceGrpc {

  private UserpoolServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.organizationmanager.v1.idp.UserpoolService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.GetUserpoolRequest,
      yandex.cloud.api.organizationmanager.v1.idp.UserpoolOuterClass.Userpool> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.GetUserpoolRequest.class,
      responseType = yandex.cloud.api.organizationmanager.v1.idp.UserpoolOuterClass.Userpool.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.GetUserpoolRequest,
      yandex.cloud.api.organizationmanager.v1.idp.UserpoolOuterClass.Userpool> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.GetUserpoolRequest, yandex.cloud.api.organizationmanager.v1.idp.UserpoolOuterClass.Userpool> getGetMethod;
    if ((getGetMethod = UserpoolServiceGrpc.getGetMethod) == null) {
      synchronized (UserpoolServiceGrpc.class) {
        if ((getGetMethod = UserpoolServiceGrpc.getGetMethod) == null) {
          UserpoolServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.GetUserpoolRequest, yandex.cloud.api.organizationmanager.v1.idp.UserpoolOuterClass.Userpool>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.GetUserpoolRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.idp.UserpoolOuterClass.Userpool.getDefaultInstance()))
              .setSchemaDescriptor(new UserpoolServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ListUserpoolsRequest,
      yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ListUserpoolsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ListUserpoolsRequest.class,
      responseType = yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ListUserpoolsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ListUserpoolsRequest,
      yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ListUserpoolsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ListUserpoolsRequest, yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ListUserpoolsResponse> getListMethod;
    if ((getListMethod = UserpoolServiceGrpc.getListMethod) == null) {
      synchronized (UserpoolServiceGrpc.class) {
        if ((getListMethod = UserpoolServiceGrpc.getListMethod) == null) {
          UserpoolServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ListUserpoolsRequest, yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ListUserpoolsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ListUserpoolsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ListUserpoolsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserpoolServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.CreateUserpoolRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.CreateUserpoolRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.CreateUserpoolRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.CreateUserpoolRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = UserpoolServiceGrpc.getCreateMethod) == null) {
      synchronized (UserpoolServiceGrpc.class) {
        if ((getCreateMethod = UserpoolServiceGrpc.getCreateMethod) == null) {
          UserpoolServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.CreateUserpoolRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.CreateUserpoolRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new UserpoolServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.UpdateUserpoolRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.UpdateUserpoolRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.UpdateUserpoolRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.UpdateUserpoolRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = UserpoolServiceGrpc.getUpdateMethod) == null) {
      synchronized (UserpoolServiceGrpc.class) {
        if ((getUpdateMethod = UserpoolServiceGrpc.getUpdateMethod) == null) {
          UserpoolServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.UpdateUserpoolRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.UpdateUserpoolRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new UserpoolServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.DeleteUserpoolRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.DeleteUserpoolRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.DeleteUserpoolRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.DeleteUserpoolRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = UserpoolServiceGrpc.getDeleteMethod) == null) {
      synchronized (UserpoolServiceGrpc.class) {
        if ((getDeleteMethod = UserpoolServiceGrpc.getDeleteMethod) == null) {
          UserpoolServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.DeleteUserpoolRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.DeleteUserpoolRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new UserpoolServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.GetUserpoolDomainRequest,
      yandex.cloud.api.organizationmanager.v1.idp.UserpoolOuterClass.Domain> getGetDomainMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDomain",
      requestType = yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.GetUserpoolDomainRequest.class,
      responseType = yandex.cloud.api.organizationmanager.v1.idp.UserpoolOuterClass.Domain.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.GetUserpoolDomainRequest,
      yandex.cloud.api.organizationmanager.v1.idp.UserpoolOuterClass.Domain> getGetDomainMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.GetUserpoolDomainRequest, yandex.cloud.api.organizationmanager.v1.idp.UserpoolOuterClass.Domain> getGetDomainMethod;
    if ((getGetDomainMethod = UserpoolServiceGrpc.getGetDomainMethod) == null) {
      synchronized (UserpoolServiceGrpc.class) {
        if ((getGetDomainMethod = UserpoolServiceGrpc.getGetDomainMethod) == null) {
          UserpoolServiceGrpc.getGetDomainMethod = getGetDomainMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.GetUserpoolDomainRequest, yandex.cloud.api.organizationmanager.v1.idp.UserpoolOuterClass.Domain>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDomain"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.GetUserpoolDomainRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.idp.UserpoolOuterClass.Domain.getDefaultInstance()))
              .setSchemaDescriptor(new UserpoolServiceMethodDescriptorSupplier("GetDomain"))
              .build();
        }
      }
    }
    return getGetDomainMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ListUserpoolDomainsRequest,
      yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ListUserpoolDomainsResponse> getListDomainsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDomains",
      requestType = yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ListUserpoolDomainsRequest.class,
      responseType = yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ListUserpoolDomainsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ListUserpoolDomainsRequest,
      yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ListUserpoolDomainsResponse> getListDomainsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ListUserpoolDomainsRequest, yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ListUserpoolDomainsResponse> getListDomainsMethod;
    if ((getListDomainsMethod = UserpoolServiceGrpc.getListDomainsMethod) == null) {
      synchronized (UserpoolServiceGrpc.class) {
        if ((getListDomainsMethod = UserpoolServiceGrpc.getListDomainsMethod) == null) {
          UserpoolServiceGrpc.getListDomainsMethod = getListDomainsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ListUserpoolDomainsRequest, yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ListUserpoolDomainsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListDomains"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ListUserpoolDomainsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ListUserpoolDomainsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserpoolServiceMethodDescriptorSupplier("ListDomains"))
              .build();
        }
      }
    }
    return getListDomainsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.AddUserpoolDomainRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getAddDomainMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddDomain",
      requestType = yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.AddUserpoolDomainRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.AddUserpoolDomainRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getAddDomainMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.AddUserpoolDomainRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getAddDomainMethod;
    if ((getAddDomainMethod = UserpoolServiceGrpc.getAddDomainMethod) == null) {
      synchronized (UserpoolServiceGrpc.class) {
        if ((getAddDomainMethod = UserpoolServiceGrpc.getAddDomainMethod) == null) {
          UserpoolServiceGrpc.getAddDomainMethod = getAddDomainMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.AddUserpoolDomainRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddDomain"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.AddUserpoolDomainRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new UserpoolServiceMethodDescriptorSupplier("AddDomain"))
              .build();
        }
      }
    }
    return getAddDomainMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ValidateUserpoolDomainRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getValidateDomainMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValidateDomain",
      requestType = yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ValidateUserpoolDomainRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ValidateUserpoolDomainRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getValidateDomainMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ValidateUserpoolDomainRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getValidateDomainMethod;
    if ((getValidateDomainMethod = UserpoolServiceGrpc.getValidateDomainMethod) == null) {
      synchronized (UserpoolServiceGrpc.class) {
        if ((getValidateDomainMethod = UserpoolServiceGrpc.getValidateDomainMethod) == null) {
          UserpoolServiceGrpc.getValidateDomainMethod = getValidateDomainMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ValidateUserpoolDomainRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValidateDomain"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ValidateUserpoolDomainRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new UserpoolServiceMethodDescriptorSupplier("ValidateDomain"))
              .build();
        }
      }
    }
    return getValidateDomainMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.DeleteUserpoolDomainRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteDomainMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteDomain",
      requestType = yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.DeleteUserpoolDomainRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.DeleteUserpoolDomainRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteDomainMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.DeleteUserpoolDomainRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteDomainMethod;
    if ((getDeleteDomainMethod = UserpoolServiceGrpc.getDeleteDomainMethod) == null) {
      synchronized (UserpoolServiceGrpc.class) {
        if ((getDeleteDomainMethod = UserpoolServiceGrpc.getDeleteDomainMethod) == null) {
          UserpoolServiceGrpc.getDeleteDomainMethod = getDeleteDomainMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.DeleteUserpoolDomainRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteDomain"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.DeleteUserpoolDomainRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new UserpoolServiceMethodDescriptorSupplier("DeleteDomain"))
              .build();
        }
      }
    }
    return getDeleteDomainMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ListUserpoolOperationsRequest,
      yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ListUserpoolOperationsResponse> getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ListUserpoolOperationsRequest.class,
      responseType = yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ListUserpoolOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ListUserpoolOperationsRequest,
      yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ListUserpoolOperationsResponse> getListOperationsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ListUserpoolOperationsRequest, yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ListUserpoolOperationsResponse> getListOperationsMethod;
    if ((getListOperationsMethod = UserpoolServiceGrpc.getListOperationsMethod) == null) {
      synchronized (UserpoolServiceGrpc.class) {
        if ((getListOperationsMethod = UserpoolServiceGrpc.getListOperationsMethod) == null) {
          UserpoolServiceGrpc.getListOperationsMethod = getListOperationsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ListUserpoolOperationsRequest, yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ListUserpoolOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ListUserpoolOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ListUserpoolOperationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserpoolServiceMethodDescriptorSupplier("ListOperations"))
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
    if ((getListAccessBindingsMethod = UserpoolServiceGrpc.getListAccessBindingsMethod) == null) {
      synchronized (UserpoolServiceGrpc.class) {
        if ((getListAccessBindingsMethod = UserpoolServiceGrpc.getListAccessBindingsMethod) == null) {
          UserpoolServiceGrpc.getListAccessBindingsMethod = getListAccessBindingsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.ListAccessBindingsRequest, yandex.cloud.api.access.Access.ListAccessBindingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.ListAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.ListAccessBindingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserpoolServiceMethodDescriptorSupplier("ListAccessBindings"))
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
    if ((getSetAccessBindingsMethod = UserpoolServiceGrpc.getSetAccessBindingsMethod) == null) {
      synchronized (UserpoolServiceGrpc.class) {
        if ((getSetAccessBindingsMethod = UserpoolServiceGrpc.getSetAccessBindingsMethod) == null) {
          UserpoolServiceGrpc.getSetAccessBindingsMethod = getSetAccessBindingsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.SetAccessBindingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.SetAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new UserpoolServiceMethodDescriptorSupplier("SetAccessBindings"))
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
    if ((getUpdateAccessBindingsMethod = UserpoolServiceGrpc.getUpdateAccessBindingsMethod) == null) {
      synchronized (UserpoolServiceGrpc.class) {
        if ((getUpdateAccessBindingsMethod = UserpoolServiceGrpc.getUpdateAccessBindingsMethod) == null) {
          UserpoolServiceGrpc.getUpdateAccessBindingsMethod = getUpdateAccessBindingsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.UpdateAccessBindingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.UpdateAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new UserpoolServiceMethodDescriptorSupplier("UpdateAccessBindings"))
              .build();
        }
      }
    }
    return getUpdateAccessBindingsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserpoolServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserpoolServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserpoolServiceStub>() {
        @java.lang.Override
        public UserpoolServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserpoolServiceStub(channel, callOptions);
        }
      };
    return UserpoolServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserpoolServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserpoolServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserpoolServiceBlockingStub>() {
        @java.lang.Override
        public UserpoolServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserpoolServiceBlockingStub(channel, callOptions);
        }
      };
    return UserpoolServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserpoolServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserpoolServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserpoolServiceFutureStub>() {
        @java.lang.Override
        public UserpoolServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserpoolServiceFutureStub(channel, callOptions);
        }
      };
    return UserpoolServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing userpools.
   * </pre>
   */
  public static abstract class UserpoolServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified userpool.
     * To get the list of available userpools, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.GetUserpoolRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.idp.UserpoolOuterClass.Userpool> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of userpools in the specified organization.
     * </pre>
     */
    public void list(yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ListUserpoolsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ListUserpoolsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a userpool in the specified organization.
     * </pre>
     */
    public void create(yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.CreateUserpoolRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified userpool.
     * </pre>
     */
    public void update(yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.UpdateUserpoolRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified userpool.
     * </pre>
     */
    public void delete(yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.DeleteUserpoolRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the specified domain for a userpool.
     * </pre>
     */
    public void getDomain(yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.GetUserpoolDomainRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.idp.UserpoolOuterClass.Domain> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDomainMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists domains for the specified userpool.
     * </pre>
     */
    public void listDomains(yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ListUserpoolDomainsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ListUserpoolDomainsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListDomainsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Adds a domain to the specified userpool.
     * </pre>
     */
    public void addDomain(yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.AddUserpoolDomainRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddDomainMethod(), responseObserver);
    }

    /**
     * <pre>
     * Validates the specified domain for a userpool.
     * </pre>
     */
    public void validateDomain(yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ValidateUserpoolDomainRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValidateDomainMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified domain from a userpool.
     * </pre>
     */
    public void deleteDomain(yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.DeleteUserpoolDomainRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteDomainMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified userpool.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ListUserpoolOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ListUserpoolOperationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists access bindings for the specified userpool.
     * </pre>
     */
    public void listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.access.Access.ListAccessBindingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAccessBindingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sets access bindings for the specified userpool.
     * </pre>
     */
    public void setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetAccessBindingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates access bindings for the specified userpool.
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
                yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.GetUserpoolRequest,
                yandex.cloud.api.organizationmanager.v1.idp.UserpoolOuterClass.Userpool>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ListUserpoolsRequest,
                yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ListUserpoolsResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.CreateUserpoolRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.UpdateUserpoolRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.DeleteUserpoolRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getGetDomainMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.GetUserpoolDomainRequest,
                yandex.cloud.api.organizationmanager.v1.idp.UserpoolOuterClass.Domain>(
                  this, METHODID_GET_DOMAIN)))
          .addMethod(
            getListDomainsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ListUserpoolDomainsRequest,
                yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ListUserpoolDomainsResponse>(
                  this, METHODID_LIST_DOMAINS)))
          .addMethod(
            getAddDomainMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.AddUserpoolDomainRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_ADD_DOMAIN)))
          .addMethod(
            getValidateDomainMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ValidateUserpoolDomainRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_VALIDATE_DOMAIN)))
          .addMethod(
            getDeleteDomainMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.DeleteUserpoolDomainRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE_DOMAIN)))
          .addMethod(
            getListOperationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ListUserpoolOperationsRequest,
                yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ListUserpoolOperationsResponse>(
                  this, METHODID_LIST_OPERATIONS)))
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
   * A set of methods for managing userpools.
   * </pre>
   */
  public static final class UserpoolServiceStub extends io.grpc.stub.AbstractAsyncStub<UserpoolServiceStub> {
    private UserpoolServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserpoolServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserpoolServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified userpool.
     * To get the list of available userpools, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.GetUserpoolRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.idp.UserpoolOuterClass.Userpool> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of userpools in the specified organization.
     * </pre>
     */
    public void list(yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ListUserpoolsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ListUserpoolsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a userpool in the specified organization.
     * </pre>
     */
    public void create(yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.CreateUserpoolRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified userpool.
     * </pre>
     */
    public void update(yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.UpdateUserpoolRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified userpool.
     * </pre>
     */
    public void delete(yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.DeleteUserpoolRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the specified domain for a userpool.
     * </pre>
     */
    public void getDomain(yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.GetUserpoolDomainRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.idp.UserpoolOuterClass.Domain> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDomainMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists domains for the specified userpool.
     * </pre>
     */
    public void listDomains(yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ListUserpoolDomainsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ListUserpoolDomainsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListDomainsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Adds a domain to the specified userpool.
     * </pre>
     */
    public void addDomain(yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.AddUserpoolDomainRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddDomainMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Validates the specified domain for a userpool.
     * </pre>
     */
    public void validateDomain(yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ValidateUserpoolDomainRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValidateDomainMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified domain from a userpool.
     * </pre>
     */
    public void deleteDomain(yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.DeleteUserpoolDomainRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteDomainMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified userpool.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ListUserpoolOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ListUserpoolOperationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists access bindings for the specified userpool.
     * </pre>
     */
    public void listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.access.Access.ListAccessBindingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sets access bindings for the specified userpool.
     * </pre>
     */
    public void setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates access bindings for the specified userpool.
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
   * A set of methods for managing userpools.
   * </pre>
   */
  public static final class UserpoolServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<UserpoolServiceBlockingStub> {
    private UserpoolServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserpoolServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserpoolServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified userpool.
     * To get the list of available userpools, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.organizationmanager.v1.idp.UserpoolOuterClass.Userpool get(yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.GetUserpoolRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of userpools in the specified organization.
     * </pre>
     */
    public yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ListUserpoolsResponse list(yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ListUserpoolsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a userpool in the specified organization.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.CreateUserpoolRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified userpool.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.UpdateUserpoolRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified userpool.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.DeleteUserpoolRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the specified domain for a userpool.
     * </pre>
     */
    public yandex.cloud.api.organizationmanager.v1.idp.UserpoolOuterClass.Domain getDomain(yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.GetUserpoolDomainRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDomainMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists domains for the specified userpool.
     * </pre>
     */
    public yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ListUserpoolDomainsResponse listDomains(yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ListUserpoolDomainsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListDomainsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Adds a domain to the specified userpool.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation addDomain(yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.AddUserpoolDomainRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddDomainMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Validates the specified domain for a userpool.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation validateDomain(yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ValidateUserpoolDomainRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidateDomainMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified domain from a userpool.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation deleteDomain(yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.DeleteUserpoolDomainRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteDomainMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists operations for the specified userpool.
     * </pre>
     */
    public yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ListUserpoolOperationsResponse listOperations(yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ListUserpoolOperationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists access bindings for the specified userpool.
     * </pre>
     */
    public yandex.cloud.api.access.Access.ListAccessBindingsResponse listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAccessBindingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets access bindings for the specified userpool.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetAccessBindingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates access bindings for the specified userpool.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation updateAccessBindings(yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAccessBindingsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing userpools.
   * </pre>
   */
  public static final class UserpoolServiceFutureStub extends io.grpc.stub.AbstractFutureStub<UserpoolServiceFutureStub> {
    private UserpoolServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserpoolServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserpoolServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified userpool.
     * To get the list of available userpools, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.organizationmanager.v1.idp.UserpoolOuterClass.Userpool> get(
        yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.GetUserpoolRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of userpools in the specified organization.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ListUserpoolsResponse> list(
        yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ListUserpoolsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a userpool in the specified organization.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.CreateUserpoolRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified userpool.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.UpdateUserpoolRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified userpool.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.DeleteUserpoolRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the specified domain for a userpool.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.organizationmanager.v1.idp.UserpoolOuterClass.Domain> getDomain(
        yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.GetUserpoolDomainRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDomainMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists domains for the specified userpool.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ListUserpoolDomainsResponse> listDomains(
        yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ListUserpoolDomainsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListDomainsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Adds a domain to the specified userpool.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> addDomain(
        yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.AddUserpoolDomainRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddDomainMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Validates the specified domain for a userpool.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> validateDomain(
        yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ValidateUserpoolDomainRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValidateDomainMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified domain from a userpool.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> deleteDomain(
        yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.DeleteUserpoolDomainRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteDomainMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists operations for the specified userpool.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ListUserpoolOperationsResponse> listOperations(
        yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ListUserpoolOperationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists access bindings for the specified userpool.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.access.Access.ListAccessBindingsResponse> listAccessBindings(
        yandex.cloud.api.access.Access.ListAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAccessBindingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sets access bindings for the specified userpool.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> setAccessBindings(
        yandex.cloud.api.access.Access.SetAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetAccessBindingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates access bindings for the specified userpool.
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
  private static final int METHODID_GET_DOMAIN = 5;
  private static final int METHODID_LIST_DOMAINS = 6;
  private static final int METHODID_ADD_DOMAIN = 7;
  private static final int METHODID_VALIDATE_DOMAIN = 8;
  private static final int METHODID_DELETE_DOMAIN = 9;
  private static final int METHODID_LIST_OPERATIONS = 10;
  private static final int METHODID_LIST_ACCESS_BINDINGS = 11;
  private static final int METHODID_SET_ACCESS_BINDINGS = 12;
  private static final int METHODID_UPDATE_ACCESS_BINDINGS = 13;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserpoolServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserpoolServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.GetUserpoolRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.idp.UserpoolOuterClass.Userpool>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ListUserpoolsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ListUserpoolsResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.CreateUserpoolRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.UpdateUserpoolRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.DeleteUserpoolRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_GET_DOMAIN:
          serviceImpl.getDomain((yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.GetUserpoolDomainRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.idp.UserpoolOuterClass.Domain>) responseObserver);
          break;
        case METHODID_LIST_DOMAINS:
          serviceImpl.listDomains((yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ListUserpoolDomainsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ListUserpoolDomainsResponse>) responseObserver);
          break;
        case METHODID_ADD_DOMAIN:
          serviceImpl.addDomain((yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.AddUserpoolDomainRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_VALIDATE_DOMAIN:
          serviceImpl.validateDomain((yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ValidateUserpoolDomainRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE_DOMAIN:
          serviceImpl.deleteDomain((yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.DeleteUserpoolDomainRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ListUserpoolOperationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.ListUserpoolOperationsResponse>) responseObserver);
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

  private static abstract class UserpoolServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserpoolServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.organizationmanager.v1.idp.UserpoolServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserpoolService");
    }
  }

  private static final class UserpoolServiceFileDescriptorSupplier
      extends UserpoolServiceBaseDescriptorSupplier {
    UserpoolServiceFileDescriptorSupplier() {}
  }

  private static final class UserpoolServiceMethodDescriptorSupplier
      extends UserpoolServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserpoolServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserpoolServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserpoolServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getGetDomainMethod())
              .addMethod(getListDomainsMethod())
              .addMethod(getAddDomainMethod())
              .addMethod(getValidateDomainMethod())
              .addMethod(getDeleteDomainMethod())
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
