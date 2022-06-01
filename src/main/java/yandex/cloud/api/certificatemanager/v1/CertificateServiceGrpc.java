package yandex.cloud.api.certificatemanager.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing certificates.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/certificatemanager/v1/certificate_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CertificateServiceGrpc {

  private CertificateServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.certificatemanager.v1.CertificateService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.GetCertificateRequest,
      yandex.cloud.api.certificatemanager.v1.CertificateOuterClass.Certificate> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.GetCertificateRequest.class,
      responseType = yandex.cloud.api.certificatemanager.v1.CertificateOuterClass.Certificate.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.GetCertificateRequest,
      yandex.cloud.api.certificatemanager.v1.CertificateOuterClass.Certificate> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.GetCertificateRequest, yandex.cloud.api.certificatemanager.v1.CertificateOuterClass.Certificate> getGetMethod;
    if ((getGetMethod = CertificateServiceGrpc.getGetMethod) == null) {
      synchronized (CertificateServiceGrpc.class) {
        if ((getGetMethod = CertificateServiceGrpc.getGetMethod) == null) {
          CertificateServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.GetCertificateRequest, yandex.cloud.api.certificatemanager.v1.CertificateOuterClass.Certificate>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.GetCertificateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.certificatemanager.v1.CertificateOuterClass.Certificate.getDefaultInstance()))
              .setSchemaDescriptor(new CertificateServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificatesRequest,
      yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificatesResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificatesRequest.class,
      responseType = yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificatesRequest,
      yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificatesResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificatesRequest, yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificatesResponse> getListMethod;
    if ((getListMethod = CertificateServiceGrpc.getListMethod) == null) {
      synchronized (CertificateServiceGrpc.class) {
        if ((getListMethod = CertificateServiceGrpc.getListMethod) == null) {
          CertificateServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificatesRequest, yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificatesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CertificateServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListVersionsRequest,
      yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListVersionsResponse> getListVersionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListVersions",
      requestType = yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListVersionsRequest.class,
      responseType = yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListVersionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListVersionsRequest,
      yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListVersionsResponse> getListVersionsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListVersionsRequest, yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListVersionsResponse> getListVersionsMethod;
    if ((getListVersionsMethod = CertificateServiceGrpc.getListVersionsMethod) == null) {
      synchronized (CertificateServiceGrpc.class) {
        if ((getListVersionsMethod = CertificateServiceGrpc.getListVersionsMethod) == null) {
          CertificateServiceGrpc.getListVersionsMethod = getListVersionsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListVersionsRequest, yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListVersionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListVersions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListVersionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListVersionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CertificateServiceMethodDescriptorSupplier("ListVersions"))
              .build();
        }
      }
    }
    return getListVersionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.CreateCertificateRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.CreateCertificateRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.CreateCertificateRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.CreateCertificateRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = CertificateServiceGrpc.getCreateMethod) == null) {
      synchronized (CertificateServiceGrpc.class) {
        if ((getCreateMethod = CertificateServiceGrpc.getCreateMethod) == null) {
          CertificateServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.CreateCertificateRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.CreateCertificateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new CertificateServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.UpdateCertificateRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.UpdateCertificateRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.UpdateCertificateRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.UpdateCertificateRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = CertificateServiceGrpc.getUpdateMethod) == null) {
      synchronized (CertificateServiceGrpc.class) {
        if ((getUpdateMethod = CertificateServiceGrpc.getUpdateMethod) == null) {
          CertificateServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.UpdateCertificateRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.UpdateCertificateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new CertificateServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.DeleteCertificateRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.DeleteCertificateRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.DeleteCertificateRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.DeleteCertificateRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = CertificateServiceGrpc.getDeleteMethod) == null) {
      synchronized (CertificateServiceGrpc.class) {
        if ((getDeleteMethod = CertificateServiceGrpc.getDeleteMethod) == null) {
          CertificateServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.DeleteCertificateRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.DeleteCertificateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new CertificateServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.RequestNewCertificateRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRequestNewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RequestNew",
      requestType = yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.RequestNewCertificateRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.RequestNewCertificateRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRequestNewMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.RequestNewCertificateRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getRequestNewMethod;
    if ((getRequestNewMethod = CertificateServiceGrpc.getRequestNewMethod) == null) {
      synchronized (CertificateServiceGrpc.class) {
        if ((getRequestNewMethod = CertificateServiceGrpc.getRequestNewMethod) == null) {
          CertificateServiceGrpc.getRequestNewMethod = getRequestNewMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.RequestNewCertificateRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RequestNew"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.RequestNewCertificateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new CertificateServiceMethodDescriptorSupplier("RequestNew"))
              .build();
        }
      }
    }
    return getRequestNewMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificateOperationsRequest,
      yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificateOperationsResponse> getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificateOperationsRequest.class,
      responseType = yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificateOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificateOperationsRequest,
      yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificateOperationsResponse> getListOperationsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificateOperationsRequest, yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificateOperationsResponse> getListOperationsMethod;
    if ((getListOperationsMethod = CertificateServiceGrpc.getListOperationsMethod) == null) {
      synchronized (CertificateServiceGrpc.class) {
        if ((getListOperationsMethod = CertificateServiceGrpc.getListOperationsMethod) == null) {
          CertificateServiceGrpc.getListOperationsMethod = getListOperationsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificateOperationsRequest, yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificateOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificateOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificateOperationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CertificateServiceMethodDescriptorSupplier("ListOperations"))
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
    if ((getListAccessBindingsMethod = CertificateServiceGrpc.getListAccessBindingsMethod) == null) {
      synchronized (CertificateServiceGrpc.class) {
        if ((getListAccessBindingsMethod = CertificateServiceGrpc.getListAccessBindingsMethod) == null) {
          CertificateServiceGrpc.getListAccessBindingsMethod = getListAccessBindingsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.ListAccessBindingsRequest, yandex.cloud.api.access.Access.ListAccessBindingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.ListAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.ListAccessBindingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CertificateServiceMethodDescriptorSupplier("ListAccessBindings"))
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
    if ((getSetAccessBindingsMethod = CertificateServiceGrpc.getSetAccessBindingsMethod) == null) {
      synchronized (CertificateServiceGrpc.class) {
        if ((getSetAccessBindingsMethod = CertificateServiceGrpc.getSetAccessBindingsMethod) == null) {
          CertificateServiceGrpc.getSetAccessBindingsMethod = getSetAccessBindingsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.SetAccessBindingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.SetAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new CertificateServiceMethodDescriptorSupplier("SetAccessBindings"))
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
    if ((getUpdateAccessBindingsMethod = CertificateServiceGrpc.getUpdateAccessBindingsMethod) == null) {
      synchronized (CertificateServiceGrpc.class) {
        if ((getUpdateAccessBindingsMethod = CertificateServiceGrpc.getUpdateAccessBindingsMethod) == null) {
          CertificateServiceGrpc.getUpdateAccessBindingsMethod = getUpdateAccessBindingsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.UpdateAccessBindingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.UpdateAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new CertificateServiceMethodDescriptorSupplier("UpdateAccessBindings"))
              .build();
        }
      }
    }
    return getUpdateAccessBindingsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CertificateServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CertificateServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CertificateServiceStub>() {
        @java.lang.Override
        public CertificateServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CertificateServiceStub(channel, callOptions);
        }
      };
    return CertificateServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CertificateServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CertificateServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CertificateServiceBlockingStub>() {
        @java.lang.Override
        public CertificateServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CertificateServiceBlockingStub(channel, callOptions);
        }
      };
    return CertificateServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CertificateServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CertificateServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CertificateServiceFutureStub>() {
        @java.lang.Override
        public CertificateServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CertificateServiceFutureStub(channel, callOptions);
        }
      };
    return CertificateServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing certificates.
   * </pre>
   */
  public static abstract class CertificateServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified certificate.
     * To get the list of available certificates, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.GetCertificateRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.certificatemanager.v1.CertificateOuterClass.Certificate> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the list of certificates in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificatesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificatesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     */
    public void listVersions(yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListVersionsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListVersionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListVersionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a certificate in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.CreateCertificateRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified certificate.
     * </pre>
     */
    public void update(yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.UpdateCertificateRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified certificate.
     * </pre>
     */
    public void delete(yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.DeleteCertificateRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Request a certificate in the specified folder.
     * </pre>
     */
    public void requestNew(yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.RequestNewCertificateRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRequestNewMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified certificate.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificateOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificateOperationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists existing access bindings for the specified certificate.
     * </pre>
     */
    public void listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.access.Access.ListAccessBindingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAccessBindingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sets access bindings for the certificate.
     * </pre>
     */
    public void setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetAccessBindingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates access bindings for the specified certificate.
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
                yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.GetCertificateRequest,
                yandex.cloud.api.certificatemanager.v1.CertificateOuterClass.Certificate>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificatesRequest,
                yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificatesResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getListVersionsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListVersionsRequest,
                yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListVersionsResponse>(
                  this, METHODID_LIST_VERSIONS)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.CreateCertificateRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.UpdateCertificateRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.DeleteCertificateRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getRequestNewMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.RequestNewCertificateRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_REQUEST_NEW)))
          .addMethod(
            getListOperationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificateOperationsRequest,
                yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificateOperationsResponse>(
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
   * A set of methods for managing certificates.
   * </pre>
   */
  public static final class CertificateServiceStub extends io.grpc.stub.AbstractAsyncStub<CertificateServiceStub> {
    private CertificateServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CertificateServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CertificateServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified certificate.
     * To get the list of available certificates, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.GetCertificateRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.certificatemanager.v1.CertificateOuterClass.Certificate> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the list of certificates in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificatesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificatesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listVersions(yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListVersionsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListVersionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListVersionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a certificate in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.CreateCertificateRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified certificate.
     * </pre>
     */
    public void update(yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.UpdateCertificateRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified certificate.
     * </pre>
     */
    public void delete(yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.DeleteCertificateRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Request a certificate in the specified folder.
     * </pre>
     */
    public void requestNew(yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.RequestNewCertificateRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRequestNewMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified certificate.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificateOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificateOperationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists existing access bindings for the specified certificate.
     * </pre>
     */
    public void listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.access.Access.ListAccessBindingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sets access bindings for the certificate.
     * </pre>
     */
    public void setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates access bindings for the specified certificate.
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
   * A set of methods for managing certificates.
   * </pre>
   */
  public static final class CertificateServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CertificateServiceBlockingStub> {
    private CertificateServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CertificateServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CertificateServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified certificate.
     * To get the list of available certificates, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.certificatemanager.v1.CertificateOuterClass.Certificate get(yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.GetCertificateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the list of certificates in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificatesResponse list(yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificatesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListVersionsResponse listVersions(yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListVersionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListVersionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a certificate in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.CreateCertificateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified certificate.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.UpdateCertificateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified certificate.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.DeleteCertificateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Request a certificate in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation requestNew(yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.RequestNewCertificateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRequestNewMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists operations for the specified certificate.
     * </pre>
     */
    public yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificateOperationsResponse listOperations(yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificateOperationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists existing access bindings for the specified certificate.
     * </pre>
     */
    public yandex.cloud.api.access.Access.ListAccessBindingsResponse listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAccessBindingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets access bindings for the certificate.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetAccessBindingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates access bindings for the specified certificate.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation updateAccessBindings(yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAccessBindingsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing certificates.
   * </pre>
   */
  public static final class CertificateServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CertificateServiceFutureStub> {
    private CertificateServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CertificateServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CertificateServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified certificate.
     * To get the list of available certificates, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.certificatemanager.v1.CertificateOuterClass.Certificate> get(
        yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.GetCertificateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the list of certificates in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificatesResponse> list(
        yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificatesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListVersionsResponse> listVersions(
        yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListVersionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListVersionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a certificate in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.CreateCertificateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified certificate.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.UpdateCertificateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified certificate.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.DeleteCertificateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Request a certificate in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> requestNew(
        yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.RequestNewCertificateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRequestNewMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists operations for the specified certificate.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificateOperationsResponse> listOperations(
        yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificateOperationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists existing access bindings for the specified certificate.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.access.Access.ListAccessBindingsResponse> listAccessBindings(
        yandex.cloud.api.access.Access.ListAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAccessBindingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sets access bindings for the certificate.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> setAccessBindings(
        yandex.cloud.api.access.Access.SetAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetAccessBindingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates access bindings for the specified certificate.
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
  private static final int METHODID_LIST_VERSIONS = 2;
  private static final int METHODID_CREATE = 3;
  private static final int METHODID_UPDATE = 4;
  private static final int METHODID_DELETE = 5;
  private static final int METHODID_REQUEST_NEW = 6;
  private static final int METHODID_LIST_OPERATIONS = 7;
  private static final int METHODID_LIST_ACCESS_BINDINGS = 8;
  private static final int METHODID_SET_ACCESS_BINDINGS = 9;
  private static final int METHODID_UPDATE_ACCESS_BINDINGS = 10;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CertificateServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CertificateServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.GetCertificateRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.certificatemanager.v1.CertificateOuterClass.Certificate>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificatesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificatesResponse>) responseObserver);
          break;
        case METHODID_LIST_VERSIONS:
          serviceImpl.listVersions((yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListVersionsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListVersionsResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.CreateCertificateRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.UpdateCertificateRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.DeleteCertificateRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_REQUEST_NEW:
          serviceImpl.requestNew((yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.RequestNewCertificateRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificateOperationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.ListCertificateOperationsResponse>) responseObserver);
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

  private static abstract class CertificateServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CertificateServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.certificatemanager.v1.CertificateServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CertificateService");
    }
  }

  private static final class CertificateServiceFileDescriptorSupplier
      extends CertificateServiceBaseDescriptorSupplier {
    CertificateServiceFileDescriptorSupplier() {}
  }

  private static final class CertificateServiceMethodDescriptorSupplier
      extends CertificateServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CertificateServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CertificateServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CertificateServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getListVersionsMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getRequestNewMethod())
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
