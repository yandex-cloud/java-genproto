package yandex.cloud.api.iot.devices.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing devices.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/iot/devices/v1/device_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DeviceServiceGrpc {

  private DeviceServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.iot.devices.v1.DeviceService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.GetDeviceRequest,
      yandex.cloud.api.iot.devices.v1.DeviceOuterClass.Device> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.GetDeviceRequest.class,
      responseType = yandex.cloud.api.iot.devices.v1.DeviceOuterClass.Device.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.GetDeviceRequest,
      yandex.cloud.api.iot.devices.v1.DeviceOuterClass.Device> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.GetDeviceRequest, yandex.cloud.api.iot.devices.v1.DeviceOuterClass.Device> getGetMethod;
    if ((getGetMethod = DeviceServiceGrpc.getGetMethod) == null) {
      synchronized (DeviceServiceGrpc.class) {
        if ((getGetMethod = DeviceServiceGrpc.getGetMethod) == null) {
          DeviceServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.GetDeviceRequest, yandex.cloud.api.iot.devices.v1.DeviceOuterClass.Device>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.GetDeviceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iot.devices.v1.DeviceOuterClass.Device.getDefaultInstance()))
              .setSchemaDescriptor(new DeviceServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.GetByNameDeviceRequest,
      yandex.cloud.api.iot.devices.v1.DeviceOuterClass.Device> getGetByNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetByName",
      requestType = yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.GetByNameDeviceRequest.class,
      responseType = yandex.cloud.api.iot.devices.v1.DeviceOuterClass.Device.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.GetByNameDeviceRequest,
      yandex.cloud.api.iot.devices.v1.DeviceOuterClass.Device> getGetByNameMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.GetByNameDeviceRequest, yandex.cloud.api.iot.devices.v1.DeviceOuterClass.Device> getGetByNameMethod;
    if ((getGetByNameMethod = DeviceServiceGrpc.getGetByNameMethod) == null) {
      synchronized (DeviceServiceGrpc.class) {
        if ((getGetByNameMethod = DeviceServiceGrpc.getGetByNameMethod) == null) {
          DeviceServiceGrpc.getGetByNameMethod = getGetByNameMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.GetByNameDeviceRequest, yandex.cloud.api.iot.devices.v1.DeviceOuterClass.Device>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetByName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.GetByNameDeviceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iot.devices.v1.DeviceOuterClass.Device.getDefaultInstance()))
              .setSchemaDescriptor(new DeviceServiceMethodDescriptorSupplier("GetByName"))
              .build();
        }
      }
    }
    return getGetByNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDevicesRequest,
      yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDevicesResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDevicesRequest.class,
      responseType = yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDevicesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDevicesRequest,
      yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDevicesResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDevicesRequest, yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDevicesResponse> getListMethod;
    if ((getListMethod = DeviceServiceGrpc.getListMethod) == null) {
      synchronized (DeviceServiceGrpc.class) {
        if ((getListMethod = DeviceServiceGrpc.getListMethod) == null) {
          DeviceServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDevicesRequest, yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDevicesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDevicesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDevicesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DeviceServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.CreateDeviceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.CreateDeviceRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.CreateDeviceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.CreateDeviceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = DeviceServiceGrpc.getCreateMethod) == null) {
      synchronized (DeviceServiceGrpc.class) {
        if ((getCreateMethod = DeviceServiceGrpc.getCreateMethod) == null) {
          DeviceServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.CreateDeviceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.CreateDeviceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new DeviceServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.UpdateDeviceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.UpdateDeviceRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.UpdateDeviceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.UpdateDeviceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = DeviceServiceGrpc.getUpdateMethod) == null) {
      synchronized (DeviceServiceGrpc.class) {
        if ((getUpdateMethod = DeviceServiceGrpc.getUpdateMethod) == null) {
          DeviceServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.UpdateDeviceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.UpdateDeviceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new DeviceServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.DeleteDeviceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.DeleteDeviceRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.DeleteDeviceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.DeleteDeviceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = DeviceServiceGrpc.getDeleteMethod) == null) {
      synchronized (DeviceServiceGrpc.class) {
        if ((getDeleteMethod = DeviceServiceGrpc.getDeleteMethod) == null) {
          DeviceServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.DeleteDeviceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.DeleteDeviceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new DeviceServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDeviceCertificatesRequest,
      yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDeviceCertificatesResponse> getListCertificatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListCertificates",
      requestType = yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDeviceCertificatesRequest.class,
      responseType = yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDeviceCertificatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDeviceCertificatesRequest,
      yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDeviceCertificatesResponse> getListCertificatesMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDeviceCertificatesRequest, yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDeviceCertificatesResponse> getListCertificatesMethod;
    if ((getListCertificatesMethod = DeviceServiceGrpc.getListCertificatesMethod) == null) {
      synchronized (DeviceServiceGrpc.class) {
        if ((getListCertificatesMethod = DeviceServiceGrpc.getListCertificatesMethod) == null) {
          DeviceServiceGrpc.getListCertificatesMethod = getListCertificatesMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDeviceCertificatesRequest, yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDeviceCertificatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListCertificates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDeviceCertificatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDeviceCertificatesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DeviceServiceMethodDescriptorSupplier("ListCertificates"))
              .build();
        }
      }
    }
    return getListCertificatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.AddDeviceCertificateRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getAddCertificateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddCertificate",
      requestType = yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.AddDeviceCertificateRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.AddDeviceCertificateRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getAddCertificateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.AddDeviceCertificateRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getAddCertificateMethod;
    if ((getAddCertificateMethod = DeviceServiceGrpc.getAddCertificateMethod) == null) {
      synchronized (DeviceServiceGrpc.class) {
        if ((getAddCertificateMethod = DeviceServiceGrpc.getAddCertificateMethod) == null) {
          DeviceServiceGrpc.getAddCertificateMethod = getAddCertificateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.AddDeviceCertificateRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddCertificate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.AddDeviceCertificateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new DeviceServiceMethodDescriptorSupplier("AddCertificate"))
              .build();
        }
      }
    }
    return getAddCertificateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.DeleteDeviceCertificateRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteCertificateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteCertificate",
      requestType = yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.DeleteDeviceCertificateRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.DeleteDeviceCertificateRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteCertificateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.DeleteDeviceCertificateRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteCertificateMethod;
    if ((getDeleteCertificateMethod = DeviceServiceGrpc.getDeleteCertificateMethod) == null) {
      synchronized (DeviceServiceGrpc.class) {
        if ((getDeleteCertificateMethod = DeviceServiceGrpc.getDeleteCertificateMethod) == null) {
          DeviceServiceGrpc.getDeleteCertificateMethod = getDeleteCertificateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.DeleteDeviceCertificateRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteCertificate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.DeleteDeviceCertificateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new DeviceServiceMethodDescriptorSupplier("DeleteCertificate"))
              .build();
        }
      }
    }
    return getDeleteCertificateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDevicePasswordsRequest,
      yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDevicePasswordsResponse> getListPasswordsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListPasswords",
      requestType = yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDevicePasswordsRequest.class,
      responseType = yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDevicePasswordsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDevicePasswordsRequest,
      yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDevicePasswordsResponse> getListPasswordsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDevicePasswordsRequest, yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDevicePasswordsResponse> getListPasswordsMethod;
    if ((getListPasswordsMethod = DeviceServiceGrpc.getListPasswordsMethod) == null) {
      synchronized (DeviceServiceGrpc.class) {
        if ((getListPasswordsMethod = DeviceServiceGrpc.getListPasswordsMethod) == null) {
          DeviceServiceGrpc.getListPasswordsMethod = getListPasswordsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDevicePasswordsRequest, yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDevicePasswordsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListPasswords"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDevicePasswordsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDevicePasswordsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DeviceServiceMethodDescriptorSupplier("ListPasswords"))
              .build();
        }
      }
    }
    return getListPasswordsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.AddDevicePasswordRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getAddPasswordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddPassword",
      requestType = yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.AddDevicePasswordRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.AddDevicePasswordRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getAddPasswordMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.AddDevicePasswordRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getAddPasswordMethod;
    if ((getAddPasswordMethod = DeviceServiceGrpc.getAddPasswordMethod) == null) {
      synchronized (DeviceServiceGrpc.class) {
        if ((getAddPasswordMethod = DeviceServiceGrpc.getAddPasswordMethod) == null) {
          DeviceServiceGrpc.getAddPasswordMethod = getAddPasswordMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.AddDevicePasswordRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddPassword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.AddDevicePasswordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new DeviceServiceMethodDescriptorSupplier("AddPassword"))
              .build();
        }
      }
    }
    return getAddPasswordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.DeleteDevicePasswordRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeletePasswordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeletePassword",
      requestType = yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.DeleteDevicePasswordRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.DeleteDevicePasswordRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeletePasswordMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.DeleteDevicePasswordRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeletePasswordMethod;
    if ((getDeletePasswordMethod = DeviceServiceGrpc.getDeletePasswordMethod) == null) {
      synchronized (DeviceServiceGrpc.class) {
        if ((getDeletePasswordMethod = DeviceServiceGrpc.getDeletePasswordMethod) == null) {
          DeviceServiceGrpc.getDeletePasswordMethod = getDeletePasswordMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.DeleteDevicePasswordRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeletePassword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.DeleteDevicePasswordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new DeviceServiceMethodDescriptorSupplier("DeletePassword"))
              .build();
        }
      }
    }
    return getDeletePasswordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDeviceOperationsRequest,
      yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDeviceOperationsResponse> getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDeviceOperationsRequest.class,
      responseType = yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDeviceOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDeviceOperationsRequest,
      yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDeviceOperationsResponse> getListOperationsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDeviceOperationsRequest, yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDeviceOperationsResponse> getListOperationsMethod;
    if ((getListOperationsMethod = DeviceServiceGrpc.getListOperationsMethod) == null) {
      synchronized (DeviceServiceGrpc.class) {
        if ((getListOperationsMethod = DeviceServiceGrpc.getListOperationsMethod) == null) {
          DeviceServiceGrpc.getListOperationsMethod = getListOperationsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDeviceOperationsRequest, yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDeviceOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDeviceOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDeviceOperationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DeviceServiceMethodDescriptorSupplier("ListOperations"))
              .build();
        }
      }
    }
    return getListOperationsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DeviceServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DeviceServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DeviceServiceStub>() {
        @java.lang.Override
        public DeviceServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DeviceServiceStub(channel, callOptions);
        }
      };
    return DeviceServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DeviceServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DeviceServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DeviceServiceBlockingStub>() {
        @java.lang.Override
        public DeviceServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DeviceServiceBlockingStub(channel, callOptions);
        }
      };
    return DeviceServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DeviceServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DeviceServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DeviceServiceFutureStub>() {
        @java.lang.Override
        public DeviceServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DeviceServiceFutureStub(channel, callOptions);
        }
      };
    return DeviceServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing devices.
   * </pre>
   */
  public static abstract class DeviceServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified device.
     * To get the list of available devices, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.GetDeviceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iot.devices.v1.DeviceOuterClass.Device> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     */
    public void getByName(yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.GetByNameDeviceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iot.devices.v1.DeviceOuterClass.Device> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetByNameMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of devices in the specified registry.
     * </pre>
     */
    public void list(yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDevicesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDevicesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a device in the specified registry.
     * </pre>
     */
    public void create(yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.CreateDeviceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified device.
     * </pre>
     */
    public void update(yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.UpdateDeviceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified device.
     * </pre>
     */
    public void delete(yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.DeleteDeviceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of device certificates for the specified device.
     * </pre>
     */
    public void listCertificates(yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDeviceCertificatesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDeviceCertificatesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListCertificatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Adds a certificate.
     * </pre>
     */
    public void addCertificate(yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.AddDeviceCertificateRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddCertificateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified device certificate.
     * </pre>
     */
    public void deleteCertificate(yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.DeleteDeviceCertificateRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteCertificateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of passwords for the specified device.
     * </pre>
     */
    public void listPasswords(yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDevicePasswordsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDevicePasswordsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListPasswordsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Adds password for the specified device.
     * </pre>
     */
    public void addPassword(yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.AddDevicePasswordRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddPasswordMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified password.
     * </pre>
     */
    public void deletePassword(yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.DeleteDevicePasswordRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeletePasswordMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified device.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDeviceOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDeviceOperationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.GetDeviceRequest,
                yandex.cloud.api.iot.devices.v1.DeviceOuterClass.Device>(
                  this, METHODID_GET)))
          .addMethod(
            getGetByNameMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.GetByNameDeviceRequest,
                yandex.cloud.api.iot.devices.v1.DeviceOuterClass.Device>(
                  this, METHODID_GET_BY_NAME)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDevicesRequest,
                yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDevicesResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.CreateDeviceRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.UpdateDeviceRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.DeleteDeviceRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListCertificatesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDeviceCertificatesRequest,
                yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDeviceCertificatesResponse>(
                  this, METHODID_LIST_CERTIFICATES)))
          .addMethod(
            getAddCertificateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.AddDeviceCertificateRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_ADD_CERTIFICATE)))
          .addMethod(
            getDeleteCertificateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.DeleteDeviceCertificateRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE_CERTIFICATE)))
          .addMethod(
            getListPasswordsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDevicePasswordsRequest,
                yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDevicePasswordsResponse>(
                  this, METHODID_LIST_PASSWORDS)))
          .addMethod(
            getAddPasswordMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.AddDevicePasswordRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_ADD_PASSWORD)))
          .addMethod(
            getDeletePasswordMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.DeleteDevicePasswordRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE_PASSWORD)))
          .addMethod(
            getListOperationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDeviceOperationsRequest,
                yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDeviceOperationsResponse>(
                  this, METHODID_LIST_OPERATIONS)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing devices.
   * </pre>
   */
  public static final class DeviceServiceStub extends io.grpc.stub.AbstractAsyncStub<DeviceServiceStub> {
    private DeviceServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeviceServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DeviceServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified device.
     * To get the list of available devices, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.GetDeviceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iot.devices.v1.DeviceOuterClass.Device> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getByName(yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.GetByNameDeviceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iot.devices.v1.DeviceOuterClass.Device> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetByNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of devices in the specified registry.
     * </pre>
     */
    public void list(yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDevicesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDevicesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a device in the specified registry.
     * </pre>
     */
    public void create(yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.CreateDeviceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified device.
     * </pre>
     */
    public void update(yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.UpdateDeviceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified device.
     * </pre>
     */
    public void delete(yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.DeleteDeviceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of device certificates for the specified device.
     * </pre>
     */
    public void listCertificates(yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDeviceCertificatesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDeviceCertificatesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListCertificatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Adds a certificate.
     * </pre>
     */
    public void addCertificate(yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.AddDeviceCertificateRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddCertificateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified device certificate.
     * </pre>
     */
    public void deleteCertificate(yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.DeleteDeviceCertificateRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteCertificateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of passwords for the specified device.
     * </pre>
     */
    public void listPasswords(yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDevicePasswordsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDevicePasswordsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListPasswordsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Adds password for the specified device.
     * </pre>
     */
    public void addPassword(yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.AddDevicePasswordRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddPasswordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified password.
     * </pre>
     */
    public void deletePassword(yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.DeleteDevicePasswordRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeletePasswordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified device.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDeviceOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDeviceOperationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing devices.
   * </pre>
   */
  public static final class DeviceServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<DeviceServiceBlockingStub> {
    private DeviceServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeviceServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DeviceServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified device.
     * To get the list of available devices, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.iot.devices.v1.DeviceOuterClass.Device get(yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.GetDeviceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.iot.devices.v1.DeviceOuterClass.Device getByName(yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.GetByNameDeviceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetByNameMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of devices in the specified registry.
     * </pre>
     */
    public yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDevicesResponse list(yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDevicesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a device in the specified registry.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.CreateDeviceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified device.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.UpdateDeviceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified device.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.DeleteDeviceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of device certificates for the specified device.
     * </pre>
     */
    public yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDeviceCertificatesResponse listCertificates(yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDeviceCertificatesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListCertificatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Adds a certificate.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation addCertificate(yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.AddDeviceCertificateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddCertificateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified device certificate.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation deleteCertificate(yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.DeleteDeviceCertificateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteCertificateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of passwords for the specified device.
     * </pre>
     */
    public yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDevicePasswordsResponse listPasswords(yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDevicePasswordsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListPasswordsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Adds password for the specified device.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation addPassword(yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.AddDevicePasswordRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddPasswordMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified password.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation deletePassword(yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.DeleteDevicePasswordRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeletePasswordMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists operations for the specified device.
     * </pre>
     */
    public yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDeviceOperationsResponse listOperations(yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDeviceOperationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing devices.
   * </pre>
   */
  public static final class DeviceServiceFutureStub extends io.grpc.stub.AbstractFutureStub<DeviceServiceFutureStub> {
    private DeviceServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeviceServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DeviceServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified device.
     * To get the list of available devices, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.iot.devices.v1.DeviceOuterClass.Device> get(
        yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.GetDeviceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.iot.devices.v1.DeviceOuterClass.Device> getByName(
        yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.GetByNameDeviceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetByNameMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of devices in the specified registry.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDevicesResponse> list(
        yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDevicesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a device in the specified registry.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.CreateDeviceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified device.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.UpdateDeviceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified device.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.DeleteDeviceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of device certificates for the specified device.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDeviceCertificatesResponse> listCertificates(
        yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDeviceCertificatesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListCertificatesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Adds a certificate.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> addCertificate(
        yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.AddDeviceCertificateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddCertificateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified device certificate.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> deleteCertificate(
        yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.DeleteDeviceCertificateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteCertificateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of passwords for the specified device.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDevicePasswordsResponse> listPasswords(
        yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDevicePasswordsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListPasswordsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Adds password for the specified device.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> addPassword(
        yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.AddDevicePasswordRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddPasswordMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified password.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> deletePassword(
        yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.DeleteDevicePasswordRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeletePasswordMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists operations for the specified device.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDeviceOperationsResponse> listOperations(
        yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDeviceOperationsRequest request) {
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
  private static final int METHODID_LIST_OPERATIONS = 12;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DeviceServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DeviceServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.GetDeviceRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.iot.devices.v1.DeviceOuterClass.Device>) responseObserver);
          break;
        case METHODID_GET_BY_NAME:
          serviceImpl.getByName((yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.GetByNameDeviceRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.iot.devices.v1.DeviceOuterClass.Device>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDevicesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDevicesResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.CreateDeviceRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.UpdateDeviceRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.DeleteDeviceRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_CERTIFICATES:
          serviceImpl.listCertificates((yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDeviceCertificatesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDeviceCertificatesResponse>) responseObserver);
          break;
        case METHODID_ADD_CERTIFICATE:
          serviceImpl.addCertificate((yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.AddDeviceCertificateRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE_CERTIFICATE:
          serviceImpl.deleteCertificate((yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.DeleteDeviceCertificateRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_PASSWORDS:
          serviceImpl.listPasswords((yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDevicePasswordsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDevicePasswordsResponse>) responseObserver);
          break;
        case METHODID_ADD_PASSWORD:
          serviceImpl.addPassword((yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.AddDevicePasswordRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE_PASSWORD:
          serviceImpl.deletePassword((yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.DeleteDevicePasswordRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDeviceOperationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDeviceOperationsResponse>) responseObserver);
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

  private static abstract class DeviceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DeviceServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DeviceService");
    }
  }

  private static final class DeviceServiceFileDescriptorSupplier
      extends DeviceServiceBaseDescriptorSupplier {
    DeviceServiceFileDescriptorSupplier() {}
  }

  private static final class DeviceServiceMethodDescriptorSupplier
      extends DeviceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DeviceServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DeviceServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DeviceServiceFileDescriptorSupplier())
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
              .addMethod(getListOperationsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
