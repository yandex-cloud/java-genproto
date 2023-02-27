package yandex.cloud.api.iot.devices.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing registry.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/iot/devices/v1/registry_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RegistryServiceGrpc {

  private RegistryServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.iot.devices.v1.RegistryService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.GetRegistryRequest,
      yandex.cloud.api.iot.devices.v1.RegistryOuterClass.Registry> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.GetRegistryRequest.class,
      responseType = yandex.cloud.api.iot.devices.v1.RegistryOuterClass.Registry.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.GetRegistryRequest,
      yandex.cloud.api.iot.devices.v1.RegistryOuterClass.Registry> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.GetRegistryRequest, yandex.cloud.api.iot.devices.v1.RegistryOuterClass.Registry> getGetMethod;
    if ((getGetMethod = RegistryServiceGrpc.getGetMethod) == null) {
      synchronized (RegistryServiceGrpc.class) {
        if ((getGetMethod = RegistryServiceGrpc.getGetMethod) == null) {
          RegistryServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.GetRegistryRequest, yandex.cloud.api.iot.devices.v1.RegistryOuterClass.Registry>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.GetRegistryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iot.devices.v1.RegistryOuterClass.Registry.getDefaultInstance()))
              .setSchemaDescriptor(new RegistryServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.GetByNameRegistryRequest,
      yandex.cloud.api.iot.devices.v1.RegistryOuterClass.Registry> getGetByNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetByName",
      requestType = yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.GetByNameRegistryRequest.class,
      responseType = yandex.cloud.api.iot.devices.v1.RegistryOuterClass.Registry.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.GetByNameRegistryRequest,
      yandex.cloud.api.iot.devices.v1.RegistryOuterClass.Registry> getGetByNameMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.GetByNameRegistryRequest, yandex.cloud.api.iot.devices.v1.RegistryOuterClass.Registry> getGetByNameMethod;
    if ((getGetByNameMethod = RegistryServiceGrpc.getGetByNameMethod) == null) {
      synchronized (RegistryServiceGrpc.class) {
        if ((getGetByNameMethod = RegistryServiceGrpc.getGetByNameMethod) == null) {
          RegistryServiceGrpc.getGetByNameMethod = getGetByNameMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.GetByNameRegistryRequest, yandex.cloud.api.iot.devices.v1.RegistryOuterClass.Registry>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetByName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.GetByNameRegistryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iot.devices.v1.RegistryOuterClass.Registry.getDefaultInstance()))
              .setSchemaDescriptor(new RegistryServiceMethodDescriptorSupplier("GetByName"))
              .build();
        }
      }
    }
    return getGetByNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistriesRequest,
      yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistriesResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistriesRequest.class,
      responseType = yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistriesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistriesRequest,
      yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistriesResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistriesRequest, yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistriesResponse> getListMethod;
    if ((getListMethod = RegistryServiceGrpc.getListMethod) == null) {
      synchronized (RegistryServiceGrpc.class) {
        if ((getListMethod = RegistryServiceGrpc.getListMethod) == null) {
          RegistryServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistriesRequest, yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistriesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistriesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistriesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RegistryServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.CreateRegistryRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.CreateRegistryRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.CreateRegistryRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.CreateRegistryRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = RegistryServiceGrpc.getCreateMethod) == null) {
      synchronized (RegistryServiceGrpc.class) {
        if ((getCreateMethod = RegistryServiceGrpc.getCreateMethod) == null) {
          RegistryServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.CreateRegistryRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.CreateRegistryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new RegistryServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.UpdateRegistryRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.UpdateRegistryRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.UpdateRegistryRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.UpdateRegistryRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = RegistryServiceGrpc.getUpdateMethod) == null) {
      synchronized (RegistryServiceGrpc.class) {
        if ((getUpdateMethod = RegistryServiceGrpc.getUpdateMethod) == null) {
          RegistryServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.UpdateRegistryRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.UpdateRegistryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new RegistryServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.DeleteRegistryRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.DeleteRegistryRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.DeleteRegistryRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.DeleteRegistryRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = RegistryServiceGrpc.getDeleteMethod) == null) {
      synchronized (RegistryServiceGrpc.class) {
        if ((getDeleteMethod = RegistryServiceGrpc.getDeleteMethod) == null) {
          RegistryServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.DeleteRegistryRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.DeleteRegistryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new RegistryServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryCertificatesRequest,
      yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryCertificatesResponse> getListCertificatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListCertificates",
      requestType = yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryCertificatesRequest.class,
      responseType = yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryCertificatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryCertificatesRequest,
      yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryCertificatesResponse> getListCertificatesMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryCertificatesRequest, yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryCertificatesResponse> getListCertificatesMethod;
    if ((getListCertificatesMethod = RegistryServiceGrpc.getListCertificatesMethod) == null) {
      synchronized (RegistryServiceGrpc.class) {
        if ((getListCertificatesMethod = RegistryServiceGrpc.getListCertificatesMethod) == null) {
          RegistryServiceGrpc.getListCertificatesMethod = getListCertificatesMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryCertificatesRequest, yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryCertificatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListCertificates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryCertificatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryCertificatesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RegistryServiceMethodDescriptorSupplier("ListCertificates"))
              .build();
        }
      }
    }
    return getListCertificatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.AddRegistryCertificateRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getAddCertificateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddCertificate",
      requestType = yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.AddRegistryCertificateRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.AddRegistryCertificateRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getAddCertificateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.AddRegistryCertificateRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getAddCertificateMethod;
    if ((getAddCertificateMethod = RegistryServiceGrpc.getAddCertificateMethod) == null) {
      synchronized (RegistryServiceGrpc.class) {
        if ((getAddCertificateMethod = RegistryServiceGrpc.getAddCertificateMethod) == null) {
          RegistryServiceGrpc.getAddCertificateMethod = getAddCertificateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.AddRegistryCertificateRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddCertificate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.AddRegistryCertificateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new RegistryServiceMethodDescriptorSupplier("AddCertificate"))
              .build();
        }
      }
    }
    return getAddCertificateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.DeleteRegistryCertificateRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteCertificateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteCertificate",
      requestType = yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.DeleteRegistryCertificateRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.DeleteRegistryCertificateRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteCertificateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.DeleteRegistryCertificateRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteCertificateMethod;
    if ((getDeleteCertificateMethod = RegistryServiceGrpc.getDeleteCertificateMethod) == null) {
      synchronized (RegistryServiceGrpc.class) {
        if ((getDeleteCertificateMethod = RegistryServiceGrpc.getDeleteCertificateMethod) == null) {
          RegistryServiceGrpc.getDeleteCertificateMethod = getDeleteCertificateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.DeleteRegistryCertificateRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteCertificate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.DeleteRegistryCertificateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new RegistryServiceMethodDescriptorSupplier("DeleteCertificate"))
              .build();
        }
      }
    }
    return getDeleteCertificateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryPasswordsRequest,
      yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryPasswordsResponse> getListPasswordsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListPasswords",
      requestType = yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryPasswordsRequest.class,
      responseType = yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryPasswordsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryPasswordsRequest,
      yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryPasswordsResponse> getListPasswordsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryPasswordsRequest, yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryPasswordsResponse> getListPasswordsMethod;
    if ((getListPasswordsMethod = RegistryServiceGrpc.getListPasswordsMethod) == null) {
      synchronized (RegistryServiceGrpc.class) {
        if ((getListPasswordsMethod = RegistryServiceGrpc.getListPasswordsMethod) == null) {
          RegistryServiceGrpc.getListPasswordsMethod = getListPasswordsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryPasswordsRequest, yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryPasswordsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListPasswords"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryPasswordsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryPasswordsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RegistryServiceMethodDescriptorSupplier("ListPasswords"))
              .build();
        }
      }
    }
    return getListPasswordsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.AddRegistryPasswordRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getAddPasswordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddPassword",
      requestType = yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.AddRegistryPasswordRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.AddRegistryPasswordRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getAddPasswordMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.AddRegistryPasswordRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getAddPasswordMethod;
    if ((getAddPasswordMethod = RegistryServiceGrpc.getAddPasswordMethod) == null) {
      synchronized (RegistryServiceGrpc.class) {
        if ((getAddPasswordMethod = RegistryServiceGrpc.getAddPasswordMethod) == null) {
          RegistryServiceGrpc.getAddPasswordMethod = getAddPasswordMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.AddRegistryPasswordRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddPassword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.AddRegistryPasswordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new RegistryServiceMethodDescriptorSupplier("AddPassword"))
              .build();
        }
      }
    }
    return getAddPasswordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.DeleteRegistryPasswordRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeletePasswordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeletePassword",
      requestType = yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.DeleteRegistryPasswordRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.DeleteRegistryPasswordRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeletePasswordMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.DeleteRegistryPasswordRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeletePasswordMethod;
    if ((getDeletePasswordMethod = RegistryServiceGrpc.getDeletePasswordMethod) == null) {
      synchronized (RegistryServiceGrpc.class) {
        if ((getDeletePasswordMethod = RegistryServiceGrpc.getDeletePasswordMethod) == null) {
          RegistryServiceGrpc.getDeletePasswordMethod = getDeletePasswordMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.DeleteRegistryPasswordRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeletePassword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.DeleteRegistryPasswordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new RegistryServiceMethodDescriptorSupplier("DeletePassword"))
              .build();
        }
      }
    }
    return getDeletePasswordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListDeviceTopicAliasesRequest,
      yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListDeviceTopicAliasesResponse> getListDeviceTopicAliasesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDeviceTopicAliases",
      requestType = yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListDeviceTopicAliasesRequest.class,
      responseType = yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListDeviceTopicAliasesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListDeviceTopicAliasesRequest,
      yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListDeviceTopicAliasesResponse> getListDeviceTopicAliasesMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListDeviceTopicAliasesRequest, yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListDeviceTopicAliasesResponse> getListDeviceTopicAliasesMethod;
    if ((getListDeviceTopicAliasesMethod = RegistryServiceGrpc.getListDeviceTopicAliasesMethod) == null) {
      synchronized (RegistryServiceGrpc.class) {
        if ((getListDeviceTopicAliasesMethod = RegistryServiceGrpc.getListDeviceTopicAliasesMethod) == null) {
          RegistryServiceGrpc.getListDeviceTopicAliasesMethod = getListDeviceTopicAliasesMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListDeviceTopicAliasesRequest, yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListDeviceTopicAliasesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListDeviceTopicAliases"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListDeviceTopicAliasesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListDeviceTopicAliasesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RegistryServiceMethodDescriptorSupplier("ListDeviceTopicAliases"))
              .build();
        }
      }
    }
    return getListDeviceTopicAliasesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListDataStreamExportsRequest,
      yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListDataStreamExportsResponse> getListDataStreamExportsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDataStreamExports",
      requestType = yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListDataStreamExportsRequest.class,
      responseType = yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListDataStreamExportsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListDataStreamExportsRequest,
      yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListDataStreamExportsResponse> getListDataStreamExportsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListDataStreamExportsRequest, yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListDataStreamExportsResponse> getListDataStreamExportsMethod;
    if ((getListDataStreamExportsMethod = RegistryServiceGrpc.getListDataStreamExportsMethod) == null) {
      synchronized (RegistryServiceGrpc.class) {
        if ((getListDataStreamExportsMethod = RegistryServiceGrpc.getListDataStreamExportsMethod) == null) {
          RegistryServiceGrpc.getListDataStreamExportsMethod = getListDataStreamExportsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListDataStreamExportsRequest, yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListDataStreamExportsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListDataStreamExports"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListDataStreamExportsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListDataStreamExportsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RegistryServiceMethodDescriptorSupplier("ListDataStreamExports"))
              .build();
        }
      }
    }
    return getListDataStreamExportsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.AddDataStreamExportRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getAddDataStreamExportMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddDataStreamExport",
      requestType = yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.AddDataStreamExportRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.AddDataStreamExportRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getAddDataStreamExportMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.AddDataStreamExportRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getAddDataStreamExportMethod;
    if ((getAddDataStreamExportMethod = RegistryServiceGrpc.getAddDataStreamExportMethod) == null) {
      synchronized (RegistryServiceGrpc.class) {
        if ((getAddDataStreamExportMethod = RegistryServiceGrpc.getAddDataStreamExportMethod) == null) {
          RegistryServiceGrpc.getAddDataStreamExportMethod = getAddDataStreamExportMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.AddDataStreamExportRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddDataStreamExport"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.AddDataStreamExportRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new RegistryServiceMethodDescriptorSupplier("AddDataStreamExport"))
              .build();
        }
      }
    }
    return getAddDataStreamExportMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.DeleteDataStreamExportRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteDataStreamExportMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteDataStreamExport",
      requestType = yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.DeleteDataStreamExportRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.DeleteDataStreamExportRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteDataStreamExportMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.DeleteDataStreamExportRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteDataStreamExportMethod;
    if ((getDeleteDataStreamExportMethod = RegistryServiceGrpc.getDeleteDataStreamExportMethod) == null) {
      synchronized (RegistryServiceGrpc.class) {
        if ((getDeleteDataStreamExportMethod = RegistryServiceGrpc.getDeleteDataStreamExportMethod) == null) {
          RegistryServiceGrpc.getDeleteDataStreamExportMethod = getDeleteDataStreamExportMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.DeleteDataStreamExportRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteDataStreamExport"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.DeleteDataStreamExportRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new RegistryServiceMethodDescriptorSupplier("DeleteDataStreamExport"))
              .build();
        }
      }
    }
    return getDeleteDataStreamExportMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryOperationsRequest,
      yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryOperationsResponse> getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryOperationsRequest.class,
      responseType = yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryOperationsRequest,
      yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryOperationsResponse> getListOperationsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryOperationsRequest, yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryOperationsResponse> getListOperationsMethod;
    if ((getListOperationsMethod = RegistryServiceGrpc.getListOperationsMethod) == null) {
      synchronized (RegistryServiceGrpc.class) {
        if ((getListOperationsMethod = RegistryServiceGrpc.getListOperationsMethod) == null) {
          RegistryServiceGrpc.getListOperationsMethod = getListOperationsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryOperationsRequest, yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryOperationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RegistryServiceMethodDescriptorSupplier("ListOperations"))
              .build();
        }
      }
    }
    return getListOperationsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RegistryServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RegistryServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RegistryServiceStub>() {
        @java.lang.Override
        public RegistryServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RegistryServiceStub(channel, callOptions);
        }
      };
    return RegistryServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RegistryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RegistryServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RegistryServiceBlockingStub>() {
        @java.lang.Override
        public RegistryServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RegistryServiceBlockingStub(channel, callOptions);
        }
      };
    return RegistryServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RegistryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RegistryServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RegistryServiceFutureStub>() {
        @java.lang.Override
        public RegistryServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RegistryServiceFutureStub(channel, callOptions);
        }
      };
    return RegistryServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing registry.
   * </pre>
   */
  public static abstract class RegistryServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified registry.
     * To get the list of available registries, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.GetRegistryRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iot.devices.v1.RegistryOuterClass.Registry> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     */
    public void getByName(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.GetByNameRegistryRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iot.devices.v1.RegistryOuterClass.Registry> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetByNameMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of registries in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistriesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistriesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a registry in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.CreateRegistryRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified registry.
     * </pre>
     */
    public void update(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.UpdateRegistryRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified registry.
     * </pre>
     */
    public void delete(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.DeleteRegistryRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of registry certificates for the specified registry.
     * </pre>
     */
    public void listCertificates(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryCertificatesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryCertificatesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListCertificatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Adds a certificate.
     * </pre>
     */
    public void addCertificate(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.AddRegistryCertificateRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddCertificateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified registry certificate.
     * </pre>
     */
    public void deleteCertificate(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.DeleteRegistryCertificateRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteCertificateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of passwords for the specified registry.
     * </pre>
     */
    public void listPasswords(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryPasswordsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryPasswordsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListPasswordsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Adds password for the specified registry.
     * </pre>
     */
    public void addPassword(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.AddRegistryPasswordRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddPasswordMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified password.
     * </pre>
     */
    public void deletePassword(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.DeleteRegistryPasswordRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeletePasswordMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of device topic aliases for the specified registry.
     * </pre>
     */
    public void listDeviceTopicAliases(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListDeviceTopicAliasesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListDeviceTopicAliasesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListDeviceTopicAliasesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of YDS exports for the specified registry.
     * </pre>
     */
    public void listDataStreamExports(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListDataStreamExportsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListDataStreamExportsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListDataStreamExportsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Adds YDS export for the specified registry.
     * </pre>
     */
    public void addDataStreamExport(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.AddDataStreamExportRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddDataStreamExportMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified YDS export.
     * </pre>
     */
    public void deleteDataStreamExport(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.DeleteDataStreamExportRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteDataStreamExportMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified registry.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryOperationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.GetRegistryRequest,
                yandex.cloud.api.iot.devices.v1.RegistryOuterClass.Registry>(
                  this, METHODID_GET)))
          .addMethod(
            getGetByNameMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.GetByNameRegistryRequest,
                yandex.cloud.api.iot.devices.v1.RegistryOuterClass.Registry>(
                  this, METHODID_GET_BY_NAME)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistriesRequest,
                yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistriesResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.CreateRegistryRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.UpdateRegistryRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.DeleteRegistryRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListCertificatesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryCertificatesRequest,
                yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryCertificatesResponse>(
                  this, METHODID_LIST_CERTIFICATES)))
          .addMethod(
            getAddCertificateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.AddRegistryCertificateRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_ADD_CERTIFICATE)))
          .addMethod(
            getDeleteCertificateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.DeleteRegistryCertificateRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE_CERTIFICATE)))
          .addMethod(
            getListPasswordsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryPasswordsRequest,
                yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryPasswordsResponse>(
                  this, METHODID_LIST_PASSWORDS)))
          .addMethod(
            getAddPasswordMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.AddRegistryPasswordRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_ADD_PASSWORD)))
          .addMethod(
            getDeletePasswordMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.DeleteRegistryPasswordRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE_PASSWORD)))
          .addMethod(
            getListDeviceTopicAliasesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListDeviceTopicAliasesRequest,
                yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListDeviceTopicAliasesResponse>(
                  this, METHODID_LIST_DEVICE_TOPIC_ALIASES)))
          .addMethod(
            getListDataStreamExportsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListDataStreamExportsRequest,
                yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListDataStreamExportsResponse>(
                  this, METHODID_LIST_DATA_STREAM_EXPORTS)))
          .addMethod(
            getAddDataStreamExportMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.AddDataStreamExportRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_ADD_DATA_STREAM_EXPORT)))
          .addMethod(
            getDeleteDataStreamExportMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.DeleteDataStreamExportRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE_DATA_STREAM_EXPORT)))
          .addMethod(
            getListOperationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryOperationsRequest,
                yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryOperationsResponse>(
                  this, METHODID_LIST_OPERATIONS)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing registry.
   * </pre>
   */
  public static final class RegistryServiceStub extends io.grpc.stub.AbstractAsyncStub<RegistryServiceStub> {
    private RegistryServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RegistryServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RegistryServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified registry.
     * To get the list of available registries, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.GetRegistryRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iot.devices.v1.RegistryOuterClass.Registry> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getByName(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.GetByNameRegistryRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iot.devices.v1.RegistryOuterClass.Registry> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetByNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of registries in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistriesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistriesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a registry in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.CreateRegistryRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified registry.
     * </pre>
     */
    public void update(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.UpdateRegistryRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified registry.
     * </pre>
     */
    public void delete(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.DeleteRegistryRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of registry certificates for the specified registry.
     * </pre>
     */
    public void listCertificates(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryCertificatesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryCertificatesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListCertificatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Adds a certificate.
     * </pre>
     */
    public void addCertificate(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.AddRegistryCertificateRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddCertificateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified registry certificate.
     * </pre>
     */
    public void deleteCertificate(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.DeleteRegistryCertificateRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteCertificateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of passwords for the specified registry.
     * </pre>
     */
    public void listPasswords(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryPasswordsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryPasswordsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListPasswordsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Adds password for the specified registry.
     * </pre>
     */
    public void addPassword(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.AddRegistryPasswordRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddPasswordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified password.
     * </pre>
     */
    public void deletePassword(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.DeleteRegistryPasswordRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeletePasswordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of device topic aliases for the specified registry.
     * </pre>
     */
    public void listDeviceTopicAliases(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListDeviceTopicAliasesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListDeviceTopicAliasesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListDeviceTopicAliasesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of YDS exports for the specified registry.
     * </pre>
     */
    public void listDataStreamExports(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListDataStreamExportsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListDataStreamExportsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListDataStreamExportsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Adds YDS export for the specified registry.
     * </pre>
     */
    public void addDataStreamExport(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.AddDataStreamExportRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddDataStreamExportMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified YDS export.
     * </pre>
     */
    public void deleteDataStreamExport(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.DeleteDataStreamExportRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteDataStreamExportMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified registry.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryOperationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing registry.
   * </pre>
   */
  public static final class RegistryServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<RegistryServiceBlockingStub> {
    private RegistryServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RegistryServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RegistryServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified registry.
     * To get the list of available registries, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.iot.devices.v1.RegistryOuterClass.Registry get(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.GetRegistryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.iot.devices.v1.RegistryOuterClass.Registry getByName(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.GetByNameRegistryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetByNameMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of registries in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistriesResponse list(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistriesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a registry in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.CreateRegistryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified registry.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.UpdateRegistryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified registry.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.DeleteRegistryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of registry certificates for the specified registry.
     * </pre>
     */
    public yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryCertificatesResponse listCertificates(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryCertificatesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListCertificatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Adds a certificate.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation addCertificate(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.AddRegistryCertificateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddCertificateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified registry certificate.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation deleteCertificate(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.DeleteRegistryCertificateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteCertificateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of passwords for the specified registry.
     * </pre>
     */
    public yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryPasswordsResponse listPasswords(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryPasswordsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListPasswordsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Adds password for the specified registry.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation addPassword(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.AddRegistryPasswordRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddPasswordMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified password.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation deletePassword(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.DeleteRegistryPasswordRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeletePasswordMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of device topic aliases for the specified registry.
     * </pre>
     */
    public yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListDeviceTopicAliasesResponse listDeviceTopicAliases(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListDeviceTopicAliasesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListDeviceTopicAliasesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of YDS exports for the specified registry.
     * </pre>
     */
    public yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListDataStreamExportsResponse listDataStreamExports(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListDataStreamExportsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListDataStreamExportsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Adds YDS export for the specified registry.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation addDataStreamExport(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.AddDataStreamExportRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddDataStreamExportMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified YDS export.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation deleteDataStreamExport(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.DeleteDataStreamExportRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteDataStreamExportMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists operations for the specified registry.
     * </pre>
     */
    public yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryOperationsResponse listOperations(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryOperationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing registry.
   * </pre>
   */
  public static final class RegistryServiceFutureStub extends io.grpc.stub.AbstractFutureStub<RegistryServiceFutureStub> {
    private RegistryServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RegistryServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RegistryServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified registry.
     * To get the list of available registries, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.iot.devices.v1.RegistryOuterClass.Registry> get(
        yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.GetRegistryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.iot.devices.v1.RegistryOuterClass.Registry> getByName(
        yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.GetByNameRegistryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetByNameMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of registries in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistriesResponse> list(
        yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistriesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a registry in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.CreateRegistryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified registry.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.UpdateRegistryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified registry.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.DeleteRegistryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of registry certificates for the specified registry.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryCertificatesResponse> listCertificates(
        yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryCertificatesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListCertificatesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Adds a certificate.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> addCertificate(
        yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.AddRegistryCertificateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddCertificateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified registry certificate.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> deleteCertificate(
        yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.DeleteRegistryCertificateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteCertificateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of passwords for the specified registry.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryPasswordsResponse> listPasswords(
        yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryPasswordsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListPasswordsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Adds password for the specified registry.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> addPassword(
        yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.AddRegistryPasswordRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddPasswordMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified password.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> deletePassword(
        yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.DeleteRegistryPasswordRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeletePasswordMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of device topic aliases for the specified registry.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListDeviceTopicAliasesResponse> listDeviceTopicAliases(
        yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListDeviceTopicAliasesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListDeviceTopicAliasesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of YDS exports for the specified registry.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListDataStreamExportsResponse> listDataStreamExports(
        yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListDataStreamExportsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListDataStreamExportsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Adds YDS export for the specified registry.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> addDataStreamExport(
        yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.AddDataStreamExportRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddDataStreamExportMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified YDS export.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> deleteDataStreamExport(
        yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.DeleteDataStreamExportRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteDataStreamExportMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists operations for the specified registry.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryOperationsResponse> listOperations(
        yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryOperationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_GET_BY_NAME = 1;
  private static final int METHODID_LIST = 2;
  private static final int METHODID_CREATE = 3;
  private static final int METHODID_UPDATE = 4;
  private static final int METHODID_DELETE = 5;
  private static final int METHODID_LIST_CERTIFICATES = 6;
  private static final int METHODID_ADD_CERTIFICATE = 7;
  private static final int METHODID_DELETE_CERTIFICATE = 8;
  private static final int METHODID_LIST_PASSWORDS = 9;
  private static final int METHODID_ADD_PASSWORD = 10;
  private static final int METHODID_DELETE_PASSWORD = 11;
  private static final int METHODID_LIST_DEVICE_TOPIC_ALIASES = 12;
  private static final int METHODID_LIST_DATA_STREAM_EXPORTS = 13;
  private static final int METHODID_ADD_DATA_STREAM_EXPORT = 14;
  private static final int METHODID_DELETE_DATA_STREAM_EXPORT = 15;
  private static final int METHODID_LIST_OPERATIONS = 16;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RegistryServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RegistryServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.GetRegistryRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.iot.devices.v1.RegistryOuterClass.Registry>) responseObserver);
          break;
        case METHODID_GET_BY_NAME:
          serviceImpl.getByName((yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.GetByNameRegistryRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.iot.devices.v1.RegistryOuterClass.Registry>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistriesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistriesResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.CreateRegistryRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.UpdateRegistryRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.DeleteRegistryRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_CERTIFICATES:
          serviceImpl.listCertificates((yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryCertificatesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryCertificatesResponse>) responseObserver);
          break;
        case METHODID_ADD_CERTIFICATE:
          serviceImpl.addCertificate((yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.AddRegistryCertificateRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE_CERTIFICATE:
          serviceImpl.deleteCertificate((yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.DeleteRegistryCertificateRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_PASSWORDS:
          serviceImpl.listPasswords((yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryPasswordsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryPasswordsResponse>) responseObserver);
          break;
        case METHODID_ADD_PASSWORD:
          serviceImpl.addPassword((yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.AddRegistryPasswordRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE_PASSWORD:
          serviceImpl.deletePassword((yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.DeleteRegistryPasswordRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_DEVICE_TOPIC_ALIASES:
          serviceImpl.listDeviceTopicAliases((yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListDeviceTopicAliasesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListDeviceTopicAliasesResponse>) responseObserver);
          break;
        case METHODID_LIST_DATA_STREAM_EXPORTS:
          serviceImpl.listDataStreamExports((yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListDataStreamExportsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListDataStreamExportsResponse>) responseObserver);
          break;
        case METHODID_ADD_DATA_STREAM_EXPORT:
          serviceImpl.addDataStreamExport((yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.AddDataStreamExportRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE_DATA_STREAM_EXPORT:
          serviceImpl.deleteDataStreamExport((yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.DeleteDataStreamExportRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryOperationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryOperationsResponse>) responseObserver);
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

  private static abstract class RegistryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RegistryServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RegistryService");
    }
  }

  private static final class RegistryServiceFileDescriptorSupplier
      extends RegistryServiceBaseDescriptorSupplier {
    RegistryServiceFileDescriptorSupplier() {}
  }

  private static final class RegistryServiceMethodDescriptorSupplier
      extends RegistryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RegistryServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (RegistryServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RegistryServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getGetByNameMethod())
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getListCertificatesMethod())
              .addMethod(getAddCertificateMethod())
              .addMethod(getDeleteCertificateMethod())
              .addMethod(getListPasswordsMethod())
              .addMethod(getAddPasswordMethod())
              .addMethod(getDeletePasswordMethod())
              .addMethod(getListDeviceTopicAliasesMethod())
              .addMethod(getListDataStreamExportsMethod())
              .addMethod(getAddDataStreamExportMethod())
              .addMethod(getDeleteDataStreamExportMethod())
              .addMethod(getListOperationsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
