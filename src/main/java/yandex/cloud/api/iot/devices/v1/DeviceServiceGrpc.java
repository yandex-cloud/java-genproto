package yandex.cloud.api.iot.devices.v1;

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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.0)",
    comments = "Source: yandex/cloud/iot/devices/v1/device_service.proto")
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
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.iot.devices.v1.DeviceService", "Get"))
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
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.iot.devices.v1.DeviceService", "List"))
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
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.iot.devices.v1.DeviceService", "Create"))
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
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.iot.devices.v1.DeviceService", "Update"))
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
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.iot.devices.v1.DeviceService", "Delete"))
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
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.iot.devices.v1.DeviceService", "ListCertificates"))
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
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.iot.devices.v1.DeviceService", "AddCertificate"))
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
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.iot.devices.v1.DeviceService", "DeleteCertificate"))
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
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.iot.devices.v1.DeviceService", "ListPasswords"))
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
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.iot.devices.v1.DeviceService", "AddPassword"))
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
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.iot.devices.v1.DeviceService", "DeletePassword"))
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
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.iot.devices.v1.DeviceService", "ListOperations"))
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
    return new DeviceServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DeviceServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DeviceServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DeviceServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DeviceServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class DeviceServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void get(yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.GetDeviceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iot.devices.v1.DeviceOuterClass.Device> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     */
    public void list(yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDevicesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDevicesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     */
    public void create(yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.CreateDeviceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    public void update(yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.UpdateDeviceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     */
    public void delete(yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.DeleteDeviceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     */
    public void listCertificates(yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDeviceCertificatesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDeviceCertificatesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListCertificatesMethod(), responseObserver);
    }

    /**
     */
    public void addCertificate(yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.AddDeviceCertificateRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getAddCertificateMethod(), responseObserver);
    }

    /**
     */
    public void deleteCertificate(yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.DeleteDeviceCertificateRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteCertificateMethod(), responseObserver);
    }

    /**
     */
    public void listPasswords(yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDevicePasswordsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDevicePasswordsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListPasswordsMethod(), responseObserver);
    }

    /**
     */
    public void addPassword(yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.AddDevicePasswordRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getAddPasswordMethod(), responseObserver);
    }

    /**
     */
    public void deletePassword(yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.DeleteDevicePasswordRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getDeletePasswordMethod(), responseObserver);
    }

    /**
     */
    public void listOperations(yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDeviceOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDeviceOperationsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.GetDeviceRequest,
                yandex.cloud.api.iot.devices.v1.DeviceOuterClass.Device>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDevicesRequest,
                yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDevicesResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.CreateDeviceRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.UpdateDeviceRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.DeleteDeviceRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListCertificatesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDeviceCertificatesRequest,
                yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDeviceCertificatesResponse>(
                  this, METHODID_LIST_CERTIFICATES)))
          .addMethod(
            getAddCertificateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.AddDeviceCertificateRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_ADD_CERTIFICATE)))
          .addMethod(
            getDeleteCertificateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.DeleteDeviceCertificateRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE_CERTIFICATE)))
          .addMethod(
            getListPasswordsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDevicePasswordsRequest,
                yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDevicePasswordsResponse>(
                  this, METHODID_LIST_PASSWORDS)))
          .addMethod(
            getAddPasswordMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.AddDevicePasswordRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_ADD_PASSWORD)))
          .addMethod(
            getDeletePasswordMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.DeleteDevicePasswordRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE_PASSWORD)))
          .addMethod(
            getListOperationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDeviceOperationsRequest,
                yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDeviceOperationsResponse>(
                  this, METHODID_LIST_OPERATIONS)))
          .build();
    }
  }

  /**
   */
  public static final class DeviceServiceStub extends io.grpc.stub.AbstractStub<DeviceServiceStub> {
    private DeviceServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DeviceServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeviceServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DeviceServiceStub(channel, callOptions);
    }

    /**
     */
    public void get(yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.GetDeviceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iot.devices.v1.DeviceOuterClass.Device> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void list(yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDevicesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDevicesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void create(yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.CreateDeviceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void update(yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.UpdateDeviceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.DeleteDeviceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listCertificates(yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDeviceCertificatesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDeviceCertificatesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListCertificatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addCertificate(yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.AddDeviceCertificateRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddCertificateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteCertificate(yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.DeleteDeviceCertificateRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteCertificateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listPasswords(yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDevicePasswordsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDevicePasswordsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListPasswordsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addPassword(yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.AddDevicePasswordRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddPasswordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deletePassword(yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.DeleteDevicePasswordRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeletePasswordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listOperations(yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDeviceOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDeviceOperationsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DeviceServiceBlockingStub extends io.grpc.stub.AbstractStub<DeviceServiceBlockingStub> {
    private DeviceServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DeviceServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeviceServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DeviceServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public yandex.cloud.api.iot.devices.v1.DeviceOuterClass.Device get(yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.GetDeviceRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDevicesResponse list(yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDevicesRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.CreateDeviceRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.UpdateDeviceRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.DeleteDeviceRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDeviceCertificatesResponse listCertificates(yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDeviceCertificatesRequest request) {
      return blockingUnaryCall(
          getChannel(), getListCertificatesMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation addCertificate(yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.AddDeviceCertificateRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddCertificateMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation deleteCertificate(yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.DeleteDeviceCertificateRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteCertificateMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDevicePasswordsResponse listPasswords(yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDevicePasswordsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListPasswordsMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation addPassword(yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.AddDevicePasswordRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddPasswordMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation deletePassword(yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.DeleteDevicePasswordRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeletePasswordMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDeviceOperationsResponse listOperations(yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDeviceOperationsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DeviceServiceFutureStub extends io.grpc.stub.AbstractStub<DeviceServiceFutureStub> {
    private DeviceServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DeviceServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeviceServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DeviceServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.iot.devices.v1.DeviceOuterClass.Device> get(
        yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.GetDeviceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDevicesResponse> list(
        yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDevicesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.CreateDeviceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.UpdateDeviceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.DeleteDeviceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDeviceCertificatesResponse> listCertificates(
        yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDeviceCertificatesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListCertificatesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> addCertificate(
        yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.AddDeviceCertificateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddCertificateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> deleteCertificate(
        yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.DeleteDeviceCertificateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteCertificateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDevicePasswordsResponse> listPasswords(
        yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDevicePasswordsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListPasswordsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> addPassword(
        yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.AddDevicePasswordRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddPasswordMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> deletePassword(
        yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.DeleteDevicePasswordRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeletePasswordMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDeviceOperationsResponse> listOperations(
        yandex.cloud.api.iot.devices.v1.DeviceServiceOuterClass.ListDeviceOperationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_DELETE = 4;
  private static final int METHODID_LIST_CERTIFICATES = 5;
  private static final int METHODID_ADD_CERTIFICATE = 6;
  private static final int METHODID_DELETE_CERTIFICATE = 7;
  private static final int METHODID_LIST_PASSWORDS = 8;
  private static final int METHODID_ADD_PASSWORD = 9;
  private static final int METHODID_DELETE_PASSWORD = 10;
  private static final int METHODID_LIST_OPERATIONS = 11;

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
