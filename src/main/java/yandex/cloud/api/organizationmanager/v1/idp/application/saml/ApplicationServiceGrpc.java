package yandex.cloud.api.organizationmanager.v1.idp.application.saml;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing SAML applications in the Identity Provider system.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/organizationmanager/v1/idp/application/saml/application_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ApplicationServiceGrpc {

  private ApplicationServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.organizationmanager.v1.idp.application.saml.ApplicationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.GetApplicationRequest,
      yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationOuterClass.Application> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.GetApplicationRequest.class,
      responseType = yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationOuterClass.Application.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.GetApplicationRequest,
      yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationOuterClass.Application> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.GetApplicationRequest, yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationOuterClass.Application> getGetMethod;
    if ((getGetMethod = ApplicationServiceGrpc.getGetMethod) == null) {
      synchronized (ApplicationServiceGrpc.class) {
        if ((getGetMethod = ApplicationServiceGrpc.getGetMethod) == null) {
          ApplicationServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.GetApplicationRequest, yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationOuterClass.Application>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.GetApplicationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationOuterClass.Application.getDefaultInstance()))
              .setSchemaDescriptor(new ApplicationServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListApplicationsRequest,
      yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListApplicationsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListApplicationsRequest.class,
      responseType = yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListApplicationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListApplicationsRequest,
      yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListApplicationsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListApplicationsRequest, yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListApplicationsResponse> getListMethod;
    if ((getListMethod = ApplicationServiceGrpc.getListMethod) == null) {
      synchronized (ApplicationServiceGrpc.class) {
        if ((getListMethod = ApplicationServiceGrpc.getListMethod) == null) {
          ApplicationServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListApplicationsRequest, yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListApplicationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListApplicationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListApplicationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApplicationServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.CreateApplicationRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.CreateApplicationRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.CreateApplicationRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.CreateApplicationRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = ApplicationServiceGrpc.getCreateMethod) == null) {
      synchronized (ApplicationServiceGrpc.class) {
        if ((getCreateMethod = ApplicationServiceGrpc.getCreateMethod) == null) {
          ApplicationServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.CreateApplicationRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.CreateApplicationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ApplicationServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.UpdateApplicationRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.UpdateApplicationRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.UpdateApplicationRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.UpdateApplicationRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = ApplicationServiceGrpc.getUpdateMethod) == null) {
      synchronized (ApplicationServiceGrpc.class) {
        if ((getUpdateMethod = ApplicationServiceGrpc.getUpdateMethod) == null) {
          ApplicationServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.UpdateApplicationRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.UpdateApplicationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ApplicationServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.DeleteApplicationRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.DeleteApplicationRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.DeleteApplicationRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.DeleteApplicationRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = ApplicationServiceGrpc.getDeleteMethod) == null) {
      synchronized (ApplicationServiceGrpc.class) {
        if ((getDeleteMethod = ApplicationServiceGrpc.getDeleteMethod) == null) {
          ApplicationServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.DeleteApplicationRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.DeleteApplicationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ApplicationServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.SuspendApplicationRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getSuspendMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Suspend",
      requestType = yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.SuspendApplicationRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.SuspendApplicationRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getSuspendMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.SuspendApplicationRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getSuspendMethod;
    if ((getSuspendMethod = ApplicationServiceGrpc.getSuspendMethod) == null) {
      synchronized (ApplicationServiceGrpc.class) {
        if ((getSuspendMethod = ApplicationServiceGrpc.getSuspendMethod) == null) {
          ApplicationServiceGrpc.getSuspendMethod = getSuspendMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.SuspendApplicationRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Suspend"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.SuspendApplicationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ApplicationServiceMethodDescriptorSupplier("Suspend"))
              .build();
        }
      }
    }
    return getSuspendMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ReactivateApplicationRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getReactivateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Reactivate",
      requestType = yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ReactivateApplicationRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ReactivateApplicationRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getReactivateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ReactivateApplicationRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getReactivateMethod;
    if ((getReactivateMethod = ApplicationServiceGrpc.getReactivateMethod) == null) {
      synchronized (ApplicationServiceGrpc.class) {
        if ((getReactivateMethod = ApplicationServiceGrpc.getReactivateMethod) == null) {
          ApplicationServiceGrpc.getReactivateMethod = getReactivateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ReactivateApplicationRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Reactivate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ReactivateApplicationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ApplicationServiceMethodDescriptorSupplier("Reactivate"))
              .build();
        }
      }
    }
    return getReactivateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListSupportedAttributeValuesRequest,
      yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListSupportedAttributeValuesResponse> getListSupportedAttributeValuesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSupportedAttributeValues",
      requestType = yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListSupportedAttributeValuesRequest.class,
      responseType = yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListSupportedAttributeValuesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListSupportedAttributeValuesRequest,
      yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListSupportedAttributeValuesResponse> getListSupportedAttributeValuesMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListSupportedAttributeValuesRequest, yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListSupportedAttributeValuesResponse> getListSupportedAttributeValuesMethod;
    if ((getListSupportedAttributeValuesMethod = ApplicationServiceGrpc.getListSupportedAttributeValuesMethod) == null) {
      synchronized (ApplicationServiceGrpc.class) {
        if ((getListSupportedAttributeValuesMethod = ApplicationServiceGrpc.getListSupportedAttributeValuesMethod) == null) {
          ApplicationServiceGrpc.getListSupportedAttributeValuesMethod = getListSupportedAttributeValuesMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListSupportedAttributeValuesRequest, yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListSupportedAttributeValuesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListSupportedAttributeValues"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListSupportedAttributeValuesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListSupportedAttributeValuesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApplicationServiceMethodDescriptorSupplier("ListSupportedAttributeValues"))
              .build();
        }
      }
    }
    return getListSupportedAttributeValuesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListApplicationOperationsRequest,
      yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListApplicationOperationsResponse> getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListApplicationOperationsRequest.class,
      responseType = yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListApplicationOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListApplicationOperationsRequest,
      yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListApplicationOperationsResponse> getListOperationsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListApplicationOperationsRequest, yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListApplicationOperationsResponse> getListOperationsMethod;
    if ((getListOperationsMethod = ApplicationServiceGrpc.getListOperationsMethod) == null) {
      synchronized (ApplicationServiceGrpc.class) {
        if ((getListOperationsMethod = ApplicationServiceGrpc.getListOperationsMethod) == null) {
          ApplicationServiceGrpc.getListOperationsMethod = getListOperationsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListApplicationOperationsRequest, yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListApplicationOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListApplicationOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListApplicationOperationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApplicationServiceMethodDescriptorSupplier("ListOperations"))
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
    if ((getListAccessBindingsMethod = ApplicationServiceGrpc.getListAccessBindingsMethod) == null) {
      synchronized (ApplicationServiceGrpc.class) {
        if ((getListAccessBindingsMethod = ApplicationServiceGrpc.getListAccessBindingsMethod) == null) {
          ApplicationServiceGrpc.getListAccessBindingsMethod = getListAccessBindingsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.ListAccessBindingsRequest, yandex.cloud.api.access.Access.ListAccessBindingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.ListAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.ListAccessBindingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApplicationServiceMethodDescriptorSupplier("ListAccessBindings"))
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
    if ((getSetAccessBindingsMethod = ApplicationServiceGrpc.getSetAccessBindingsMethod) == null) {
      synchronized (ApplicationServiceGrpc.class) {
        if ((getSetAccessBindingsMethod = ApplicationServiceGrpc.getSetAccessBindingsMethod) == null) {
          ApplicationServiceGrpc.getSetAccessBindingsMethod = getSetAccessBindingsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.SetAccessBindingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.SetAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ApplicationServiceMethodDescriptorSupplier("SetAccessBindings"))
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
    if ((getUpdateAccessBindingsMethod = ApplicationServiceGrpc.getUpdateAccessBindingsMethod) == null) {
      synchronized (ApplicationServiceGrpc.class) {
        if ((getUpdateAccessBindingsMethod = ApplicationServiceGrpc.getUpdateAccessBindingsMethod) == null) {
          ApplicationServiceGrpc.getUpdateAccessBindingsMethod = getUpdateAccessBindingsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.UpdateAccessBindingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.UpdateAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ApplicationServiceMethodDescriptorSupplier("UpdateAccessBindings"))
              .build();
        }
      }
    }
    return getUpdateAccessBindingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListAssignmentsRequest,
      yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListAssignmentsResponse> getListAssignmentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAssignments",
      requestType = yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListAssignmentsRequest.class,
      responseType = yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListAssignmentsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListAssignmentsRequest,
      yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListAssignmentsResponse> getListAssignmentsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListAssignmentsRequest, yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListAssignmentsResponse> getListAssignmentsMethod;
    if ((getListAssignmentsMethod = ApplicationServiceGrpc.getListAssignmentsMethod) == null) {
      synchronized (ApplicationServiceGrpc.class) {
        if ((getListAssignmentsMethod = ApplicationServiceGrpc.getListAssignmentsMethod) == null) {
          ApplicationServiceGrpc.getListAssignmentsMethod = getListAssignmentsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListAssignmentsRequest, yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListAssignmentsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAssignments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListAssignmentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListAssignmentsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApplicationServiceMethodDescriptorSupplier("ListAssignments"))
              .build();
        }
      }
    }
    return getListAssignmentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.UpdateAssignmentsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateAssignmentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAssignments",
      requestType = yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.UpdateAssignmentsRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.UpdateAssignmentsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateAssignmentsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.UpdateAssignmentsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateAssignmentsMethod;
    if ((getUpdateAssignmentsMethod = ApplicationServiceGrpc.getUpdateAssignmentsMethod) == null) {
      synchronized (ApplicationServiceGrpc.class) {
        if ((getUpdateAssignmentsMethod = ApplicationServiceGrpc.getUpdateAssignmentsMethod) == null) {
          ApplicationServiceGrpc.getUpdateAssignmentsMethod = getUpdateAssignmentsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.UpdateAssignmentsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAssignments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.UpdateAssignmentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ApplicationServiceMethodDescriptorSupplier("UpdateAssignments"))
              .build();
        }
      }
    }
    return getUpdateAssignmentsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ApplicationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ApplicationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ApplicationServiceStub>() {
        @java.lang.Override
        public ApplicationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ApplicationServiceStub(channel, callOptions);
        }
      };
    return ApplicationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ApplicationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ApplicationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ApplicationServiceBlockingStub>() {
        @java.lang.Override
        public ApplicationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ApplicationServiceBlockingStub(channel, callOptions);
        }
      };
    return ApplicationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ApplicationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ApplicationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ApplicationServiceFutureStub>() {
        @java.lang.Override
        public ApplicationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ApplicationServiceFutureStub(channel, callOptions);
        }
      };
    return ApplicationServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing SAML applications in the Identity Provider system.
   * </pre>
   */
  public static abstract class ApplicationServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified SAML application.
     * To get the list of available applications, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.GetApplicationRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationOuterClass.Application> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of SAML applications in the specified organization.
     * </pre>
     */
    public void list(yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListApplicationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListApplicationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a SAML application in the specified organization.
     * </pre>
     */
    public void create(yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.CreateApplicationRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified SAML application.
     * </pre>
     */
    public void update(yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.UpdateApplicationRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified SAML application.
     * </pre>
     */
    public void delete(yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.DeleteApplicationRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Suspends the specified SAML application.
     * </pre>
     */
    public void suspend(yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.SuspendApplicationRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSuspendMethod(), responseObserver);
    }

    /**
     * <pre>
     * Reactivates a previously suspended SAML application.
     * </pre>
     */
    public void reactivate(yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ReactivateApplicationRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReactivateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the list of supported attribute values for SAML applications.
     * </pre>
     */
    public void listSupportedAttributeValues(yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListSupportedAttributeValuesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListSupportedAttributeValuesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListSupportedAttributeValuesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified SAML application.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListApplicationOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListApplicationOperationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists access bindings for the specified SAML application.
     * </pre>
     */
    public void listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.access.Access.ListAccessBindingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAccessBindingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sets access bindings for the specified SAML application.
     * </pre>
     */
    public void setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetAccessBindingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates access bindings for the specified SAML application.
     * </pre>
     */
    public void updateAccessBindings(yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAccessBindingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists assignments for the specified SAML application.
     * </pre>
     */
    public void listAssignments(yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListAssignmentsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListAssignmentsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAssignmentsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates assignments for the specified SAML application.
     * </pre>
     */
    public void updateAssignments(yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.UpdateAssignmentsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAssignmentsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.GetApplicationRequest,
                yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationOuterClass.Application>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListApplicationsRequest,
                yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListApplicationsResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.CreateApplicationRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.UpdateApplicationRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.DeleteApplicationRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getSuspendMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.SuspendApplicationRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_SUSPEND)))
          .addMethod(
            getReactivateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ReactivateApplicationRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_REACTIVATE)))
          .addMethod(
            getListSupportedAttributeValuesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListSupportedAttributeValuesRequest,
                yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListSupportedAttributeValuesResponse>(
                  this, METHODID_LIST_SUPPORTED_ATTRIBUTE_VALUES)))
          .addMethod(
            getListOperationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListApplicationOperationsRequest,
                yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListApplicationOperationsResponse>(
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
          .addMethod(
            getListAssignmentsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListAssignmentsRequest,
                yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListAssignmentsResponse>(
                  this, METHODID_LIST_ASSIGNMENTS)))
          .addMethod(
            getUpdateAssignmentsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.UpdateAssignmentsRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE_ASSIGNMENTS)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing SAML applications in the Identity Provider system.
   * </pre>
   */
  public static final class ApplicationServiceStub extends io.grpc.stub.AbstractAsyncStub<ApplicationServiceStub> {
    private ApplicationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ApplicationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ApplicationServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified SAML application.
     * To get the list of available applications, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.GetApplicationRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationOuterClass.Application> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of SAML applications in the specified organization.
     * </pre>
     */
    public void list(yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListApplicationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListApplicationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a SAML application in the specified organization.
     * </pre>
     */
    public void create(yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.CreateApplicationRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified SAML application.
     * </pre>
     */
    public void update(yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.UpdateApplicationRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified SAML application.
     * </pre>
     */
    public void delete(yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.DeleteApplicationRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Suspends the specified SAML application.
     * </pre>
     */
    public void suspend(yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.SuspendApplicationRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSuspendMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Reactivates a previously suspended SAML application.
     * </pre>
     */
    public void reactivate(yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ReactivateApplicationRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReactivateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the list of supported attribute values for SAML applications.
     * </pre>
     */
    public void listSupportedAttributeValues(yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListSupportedAttributeValuesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListSupportedAttributeValuesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListSupportedAttributeValuesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified SAML application.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListApplicationOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListApplicationOperationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists access bindings for the specified SAML application.
     * </pre>
     */
    public void listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.access.Access.ListAccessBindingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sets access bindings for the specified SAML application.
     * </pre>
     */
    public void setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates access bindings for the specified SAML application.
     * </pre>
     */
    public void updateAccessBindings(yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists assignments for the specified SAML application.
     * </pre>
     */
    public void listAssignments(yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListAssignmentsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListAssignmentsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAssignmentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates assignments for the specified SAML application.
     * </pre>
     */
    public void updateAssignments(yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.UpdateAssignmentsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAssignmentsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing SAML applications in the Identity Provider system.
   * </pre>
   */
  public static final class ApplicationServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ApplicationServiceBlockingStub> {
    private ApplicationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ApplicationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ApplicationServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified SAML application.
     * To get the list of available applications, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationOuterClass.Application get(yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.GetApplicationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of SAML applications in the specified organization.
     * </pre>
     */
    public yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListApplicationsResponse list(yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListApplicationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a SAML application in the specified organization.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.CreateApplicationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified SAML application.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.UpdateApplicationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified SAML application.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.DeleteApplicationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Suspends the specified SAML application.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation suspend(yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.SuspendApplicationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSuspendMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Reactivates a previously suspended SAML application.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation reactivate(yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ReactivateApplicationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReactivateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the list of supported attribute values for SAML applications.
     * </pre>
     */
    public yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListSupportedAttributeValuesResponse listSupportedAttributeValues(yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListSupportedAttributeValuesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListSupportedAttributeValuesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists operations for the specified SAML application.
     * </pre>
     */
    public yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListApplicationOperationsResponse listOperations(yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListApplicationOperationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists access bindings for the specified SAML application.
     * </pre>
     */
    public yandex.cloud.api.access.Access.ListAccessBindingsResponse listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAccessBindingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets access bindings for the specified SAML application.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetAccessBindingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates access bindings for the specified SAML application.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation updateAccessBindings(yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAccessBindingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists assignments for the specified SAML application.
     * </pre>
     */
    public yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListAssignmentsResponse listAssignments(yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListAssignmentsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAssignmentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates assignments for the specified SAML application.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation updateAssignments(yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.UpdateAssignmentsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAssignmentsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing SAML applications in the Identity Provider system.
   * </pre>
   */
  public static final class ApplicationServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ApplicationServiceFutureStub> {
    private ApplicationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ApplicationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ApplicationServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified SAML application.
     * To get the list of available applications, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationOuterClass.Application> get(
        yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.GetApplicationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of SAML applications in the specified organization.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListApplicationsResponse> list(
        yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListApplicationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a SAML application in the specified organization.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.CreateApplicationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified SAML application.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.UpdateApplicationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified SAML application.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.DeleteApplicationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Suspends the specified SAML application.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> suspend(
        yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.SuspendApplicationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSuspendMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Reactivates a previously suspended SAML application.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> reactivate(
        yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ReactivateApplicationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReactivateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the list of supported attribute values for SAML applications.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListSupportedAttributeValuesResponse> listSupportedAttributeValues(
        yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListSupportedAttributeValuesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListSupportedAttributeValuesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists operations for the specified SAML application.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListApplicationOperationsResponse> listOperations(
        yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListApplicationOperationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists access bindings for the specified SAML application.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.access.Access.ListAccessBindingsResponse> listAccessBindings(
        yandex.cloud.api.access.Access.ListAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAccessBindingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sets access bindings for the specified SAML application.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> setAccessBindings(
        yandex.cloud.api.access.Access.SetAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetAccessBindingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates access bindings for the specified SAML application.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> updateAccessBindings(
        yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAccessBindingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists assignments for the specified SAML application.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListAssignmentsResponse> listAssignments(
        yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListAssignmentsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAssignmentsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates assignments for the specified SAML application.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> updateAssignments(
        yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.UpdateAssignmentsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAssignmentsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_DELETE = 4;
  private static final int METHODID_SUSPEND = 5;
  private static final int METHODID_REACTIVATE = 6;
  private static final int METHODID_LIST_SUPPORTED_ATTRIBUTE_VALUES = 7;
  private static final int METHODID_LIST_OPERATIONS = 8;
  private static final int METHODID_LIST_ACCESS_BINDINGS = 9;
  private static final int METHODID_SET_ACCESS_BINDINGS = 10;
  private static final int METHODID_UPDATE_ACCESS_BINDINGS = 11;
  private static final int METHODID_LIST_ASSIGNMENTS = 12;
  private static final int METHODID_UPDATE_ASSIGNMENTS = 13;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ApplicationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ApplicationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.GetApplicationRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationOuterClass.Application>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListApplicationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListApplicationsResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.CreateApplicationRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.UpdateApplicationRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.DeleteApplicationRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_SUSPEND:
          serviceImpl.suspend((yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.SuspendApplicationRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_REACTIVATE:
          serviceImpl.reactivate((yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ReactivateApplicationRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_SUPPORTED_ATTRIBUTE_VALUES:
          serviceImpl.listSupportedAttributeValues((yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListSupportedAttributeValuesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListSupportedAttributeValuesResponse>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListApplicationOperationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListApplicationOperationsResponse>) responseObserver);
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
        case METHODID_LIST_ASSIGNMENTS:
          serviceImpl.listAssignments((yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListAssignmentsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.ListAssignmentsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ASSIGNMENTS:
          serviceImpl.updateAssignments((yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.UpdateAssignmentsRequest) request,
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

  private static abstract class ApplicationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ApplicationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.organizationmanager.v1.idp.application.saml.ApplicationServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ApplicationService");
    }
  }

  private static final class ApplicationServiceFileDescriptorSupplier
      extends ApplicationServiceBaseDescriptorSupplier {
    ApplicationServiceFileDescriptorSupplier() {}
  }

  private static final class ApplicationServiceMethodDescriptorSupplier
      extends ApplicationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ApplicationServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ApplicationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ApplicationServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getSuspendMethod())
              .addMethod(getReactivateMethod())
              .addMethod(getListSupportedAttributeValuesMethod())
              .addMethod(getListOperationsMethod())
              .addMethod(getListAccessBindingsMethod())
              .addMethod(getSetAccessBindingsMethod())
              .addMethod(getUpdateAccessBindingsMethod())
              .addMethod(getListAssignmentsMethod())
              .addMethod(getUpdateAssignmentsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
