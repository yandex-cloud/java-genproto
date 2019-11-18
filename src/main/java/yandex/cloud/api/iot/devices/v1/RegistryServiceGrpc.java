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
    comments = "Source: yandex/cloud/iot/devices/v1/registry_service.proto")
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
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.iot.devices.v1.RegistryService", "Get"))
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
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.iot.devices.v1.RegistryService", "List"))
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
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.iot.devices.v1.RegistryService", "Create"))
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
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.iot.devices.v1.RegistryService", "Update"))
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
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.iot.devices.v1.RegistryService", "Delete"))
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
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.iot.devices.v1.RegistryService", "ListCertificates"))
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
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.iot.devices.v1.RegistryService", "AddCertificate"))
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
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.iot.devices.v1.RegistryService", "DeleteCertificate"))
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
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.iot.devices.v1.RegistryService", "ListPasswords"))
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
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.iot.devices.v1.RegistryService", "AddPassword"))
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
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.iot.devices.v1.RegistryService", "DeletePassword"))
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
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.iot.devices.v1.RegistryService", "ListDeviceTopicAliases"))
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
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.iot.devices.v1.RegistryService", "ListOperations"))
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
    return new RegistryServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RegistryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RegistryServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RegistryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RegistryServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class RegistryServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void get(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.GetRegistryRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iot.devices.v1.RegistryOuterClass.Registry> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     */
    public void list(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistriesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistriesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     */
    public void create(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.CreateRegistryRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    public void update(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.UpdateRegistryRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     */
    public void delete(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.DeleteRegistryRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     */
    public void listCertificates(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryCertificatesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryCertificatesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListCertificatesMethod(), responseObserver);
    }

    /**
     */
    public void addCertificate(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.AddRegistryCertificateRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getAddCertificateMethod(), responseObserver);
    }

    /**
     */
    public void deleteCertificate(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.DeleteRegistryCertificateRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteCertificateMethod(), responseObserver);
    }

    /**
     */
    public void listPasswords(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryPasswordsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryPasswordsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListPasswordsMethod(), responseObserver);
    }

    /**
     */
    public void addPassword(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.AddRegistryPasswordRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getAddPasswordMethod(), responseObserver);
    }

    /**
     */
    public void deletePassword(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.DeleteRegistryPasswordRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getDeletePasswordMethod(), responseObserver);
    }

    /**
     */
    public void listDeviceTopicAliases(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListDeviceTopicAliasesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListDeviceTopicAliasesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListDeviceTopicAliasesMethod(), responseObserver);
    }

    /**
     */
    public void listOperations(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryOperationsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.GetRegistryRequest,
                yandex.cloud.api.iot.devices.v1.RegistryOuterClass.Registry>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistriesRequest,
                yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistriesResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.CreateRegistryRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.UpdateRegistryRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.DeleteRegistryRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListCertificatesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryCertificatesRequest,
                yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryCertificatesResponse>(
                  this, METHODID_LIST_CERTIFICATES)))
          .addMethod(
            getAddCertificateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.AddRegistryCertificateRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_ADD_CERTIFICATE)))
          .addMethod(
            getDeleteCertificateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.DeleteRegistryCertificateRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE_CERTIFICATE)))
          .addMethod(
            getListPasswordsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryPasswordsRequest,
                yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryPasswordsResponse>(
                  this, METHODID_LIST_PASSWORDS)))
          .addMethod(
            getAddPasswordMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.AddRegistryPasswordRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_ADD_PASSWORD)))
          .addMethod(
            getDeletePasswordMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.DeleteRegistryPasswordRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE_PASSWORD)))
          .addMethod(
            getListDeviceTopicAliasesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListDeviceTopicAliasesRequest,
                yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListDeviceTopicAliasesResponse>(
                  this, METHODID_LIST_DEVICE_TOPIC_ALIASES)))
          .addMethod(
            getListOperationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryOperationsRequest,
                yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryOperationsResponse>(
                  this, METHODID_LIST_OPERATIONS)))
          .build();
    }
  }

  /**
   */
  public static final class RegistryServiceStub extends io.grpc.stub.AbstractStub<RegistryServiceStub> {
    private RegistryServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RegistryServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RegistryServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RegistryServiceStub(channel, callOptions);
    }

    /**
     */
    public void get(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.GetRegistryRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iot.devices.v1.RegistryOuterClass.Registry> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void list(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistriesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistriesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void create(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.CreateRegistryRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void update(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.UpdateRegistryRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.DeleteRegistryRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listCertificates(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryCertificatesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryCertificatesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListCertificatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addCertificate(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.AddRegistryCertificateRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddCertificateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteCertificate(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.DeleteRegistryCertificateRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteCertificateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listPasswords(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryPasswordsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryPasswordsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListPasswordsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addPassword(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.AddRegistryPasswordRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddPasswordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deletePassword(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.DeleteRegistryPasswordRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeletePasswordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listDeviceTopicAliases(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListDeviceTopicAliasesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListDeviceTopicAliasesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListDeviceTopicAliasesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listOperations(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryOperationsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RegistryServiceBlockingStub extends io.grpc.stub.AbstractStub<RegistryServiceBlockingStub> {
    private RegistryServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RegistryServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RegistryServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RegistryServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public yandex.cloud.api.iot.devices.v1.RegistryOuterClass.Registry get(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.GetRegistryRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistriesResponse list(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistriesRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.CreateRegistryRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.UpdateRegistryRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.DeleteRegistryRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryCertificatesResponse listCertificates(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryCertificatesRequest request) {
      return blockingUnaryCall(
          getChannel(), getListCertificatesMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation addCertificate(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.AddRegistryCertificateRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddCertificateMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation deleteCertificate(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.DeleteRegistryCertificateRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteCertificateMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryPasswordsResponse listPasswords(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryPasswordsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListPasswordsMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation addPassword(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.AddRegistryPasswordRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddPasswordMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation deletePassword(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.DeleteRegistryPasswordRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeletePasswordMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListDeviceTopicAliasesResponse listDeviceTopicAliases(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListDeviceTopicAliasesRequest request) {
      return blockingUnaryCall(
          getChannel(), getListDeviceTopicAliasesMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryOperationsResponse listOperations(yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryOperationsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RegistryServiceFutureStub extends io.grpc.stub.AbstractStub<RegistryServiceFutureStub> {
    private RegistryServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RegistryServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RegistryServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RegistryServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.iot.devices.v1.RegistryOuterClass.Registry> get(
        yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.GetRegistryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistriesResponse> list(
        yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistriesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.CreateRegistryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.UpdateRegistryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.DeleteRegistryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryCertificatesResponse> listCertificates(
        yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryCertificatesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListCertificatesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> addCertificate(
        yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.AddRegistryCertificateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddCertificateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> deleteCertificate(
        yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.DeleteRegistryCertificateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteCertificateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryPasswordsResponse> listPasswords(
        yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryPasswordsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListPasswordsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> addPassword(
        yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.AddRegistryPasswordRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddPasswordMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> deletePassword(
        yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.DeleteRegistryPasswordRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeletePasswordMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListDeviceTopicAliasesResponse> listDeviceTopicAliases(
        yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListDeviceTopicAliasesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListDeviceTopicAliasesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryOperationsResponse> listOperations(
        yandex.cloud.api.iot.devices.v1.RegistryServiceOuterClass.ListRegistryOperationsRequest request) {
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
  private static final int METHODID_LIST_DEVICE_TOPIC_ALIASES = 11;
  private static final int METHODID_LIST_OPERATIONS = 12;

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
              .addMethod(getListOperationsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
