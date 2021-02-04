package yandex.cloud.api.containerregistry.v1;

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
 * A set of methods for managing Registry resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.0)",
    comments = "Source: yandex/cloud/containerregistry/v1/registry_service.proto")
public final class RegistryServiceGrpc {

  private RegistryServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.containerregistry.v1.RegistryService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.GetRegistryRequest,
      yandex.cloud.api.containerregistry.v1.RegistryOuterClass.Registry> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.GetRegistryRequest.class,
      responseType = yandex.cloud.api.containerregistry.v1.RegistryOuterClass.Registry.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.GetRegistryRequest,
      yandex.cloud.api.containerregistry.v1.RegistryOuterClass.Registry> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.GetRegistryRequest, yandex.cloud.api.containerregistry.v1.RegistryOuterClass.Registry> getGetMethod;
    if ((getGetMethod = RegistryServiceGrpc.getGetMethod) == null) {
      synchronized (RegistryServiceGrpc.class) {
        if ((getGetMethod = RegistryServiceGrpc.getGetMethod) == null) {
          RegistryServiceGrpc.getGetMethod = getGetMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.GetRegistryRequest, yandex.cloud.api.containerregistry.v1.RegistryOuterClass.Registry>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.containerregistry.v1.RegistryService", "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.GetRegistryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.containerregistry.v1.RegistryOuterClass.Registry.getDefaultInstance()))
                  .setSchemaDescriptor(new RegistryServiceMethodDescriptorSupplier("Get"))
                  .build();
          }
        }
     }
     return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.ListRegistriesRequest,
      yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.ListRegistriesResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.ListRegistriesRequest.class,
      responseType = yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.ListRegistriesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.ListRegistriesRequest,
      yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.ListRegistriesResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.ListRegistriesRequest, yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.ListRegistriesResponse> getListMethod;
    if ((getListMethod = RegistryServiceGrpc.getListMethod) == null) {
      synchronized (RegistryServiceGrpc.class) {
        if ((getListMethod = RegistryServiceGrpc.getListMethod) == null) {
          RegistryServiceGrpc.getListMethod = getListMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.ListRegistriesRequest, yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.ListRegistriesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.containerregistry.v1.RegistryService", "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.ListRegistriesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.ListRegistriesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RegistryServiceMethodDescriptorSupplier("List"))
                  .build();
          }
        }
     }
     return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.CreateRegistryRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.CreateRegistryRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.CreateRegistryRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.CreateRegistryRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = RegistryServiceGrpc.getCreateMethod) == null) {
      synchronized (RegistryServiceGrpc.class) {
        if ((getCreateMethod = RegistryServiceGrpc.getCreateMethod) == null) {
          RegistryServiceGrpc.getCreateMethod = getCreateMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.CreateRegistryRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.containerregistry.v1.RegistryService", "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.CreateRegistryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new RegistryServiceMethodDescriptorSupplier("Create"))
                  .build();
          }
        }
     }
     return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.UpdateRegistryRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.UpdateRegistryRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.UpdateRegistryRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.UpdateRegistryRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = RegistryServiceGrpc.getUpdateMethod) == null) {
      synchronized (RegistryServiceGrpc.class) {
        if ((getUpdateMethod = RegistryServiceGrpc.getUpdateMethod) == null) {
          RegistryServiceGrpc.getUpdateMethod = getUpdateMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.UpdateRegistryRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.containerregistry.v1.RegistryService", "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.UpdateRegistryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new RegistryServiceMethodDescriptorSupplier("Update"))
                  .build();
          }
        }
     }
     return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.DeleteRegistryRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.DeleteRegistryRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.DeleteRegistryRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.DeleteRegistryRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = RegistryServiceGrpc.getDeleteMethod) == null) {
      synchronized (RegistryServiceGrpc.class) {
        if ((getDeleteMethod = RegistryServiceGrpc.getDeleteMethod) == null) {
          RegistryServiceGrpc.getDeleteMethod = getDeleteMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.DeleteRegistryRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.containerregistry.v1.RegistryService", "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.DeleteRegistryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new RegistryServiceMethodDescriptorSupplier("Delete"))
                  .build();
          }
        }
     }
     return getDeleteMethod;
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
    if ((getListAccessBindingsMethod = RegistryServiceGrpc.getListAccessBindingsMethod) == null) {
      synchronized (RegistryServiceGrpc.class) {
        if ((getListAccessBindingsMethod = RegistryServiceGrpc.getListAccessBindingsMethod) == null) {
          RegistryServiceGrpc.getListAccessBindingsMethod = getListAccessBindingsMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.ListAccessBindingsRequest, yandex.cloud.api.access.Access.ListAccessBindingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.containerregistry.v1.RegistryService", "ListAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.ListAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.ListAccessBindingsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RegistryServiceMethodDescriptorSupplier("ListAccessBindings"))
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
    if ((getSetAccessBindingsMethod = RegistryServiceGrpc.getSetAccessBindingsMethod) == null) {
      synchronized (RegistryServiceGrpc.class) {
        if ((getSetAccessBindingsMethod = RegistryServiceGrpc.getSetAccessBindingsMethod) == null) {
          RegistryServiceGrpc.getSetAccessBindingsMethod = getSetAccessBindingsMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.SetAccessBindingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.containerregistry.v1.RegistryService", "SetAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.SetAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new RegistryServiceMethodDescriptorSupplier("SetAccessBindings"))
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
    if ((getUpdateAccessBindingsMethod = RegistryServiceGrpc.getUpdateAccessBindingsMethod) == null) {
      synchronized (RegistryServiceGrpc.class) {
        if ((getUpdateAccessBindingsMethod = RegistryServiceGrpc.getUpdateAccessBindingsMethod) == null) {
          RegistryServiceGrpc.getUpdateAccessBindingsMethod = getUpdateAccessBindingsMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.UpdateAccessBindingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.containerregistry.v1.RegistryService", "UpdateAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.UpdateAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new RegistryServiceMethodDescriptorSupplier("UpdateAccessBindings"))
                  .build();
          }
        }
     }
     return getUpdateAccessBindingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.ListIpPermissionRequest,
      yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.ListIpPermissionsResponse> getListIpPermissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListIpPermission",
      requestType = yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.ListIpPermissionRequest.class,
      responseType = yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.ListIpPermissionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.ListIpPermissionRequest,
      yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.ListIpPermissionsResponse> getListIpPermissionMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.ListIpPermissionRequest, yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.ListIpPermissionsResponse> getListIpPermissionMethod;
    if ((getListIpPermissionMethod = RegistryServiceGrpc.getListIpPermissionMethod) == null) {
      synchronized (RegistryServiceGrpc.class) {
        if ((getListIpPermissionMethod = RegistryServiceGrpc.getListIpPermissionMethod) == null) {
          RegistryServiceGrpc.getListIpPermissionMethod = getListIpPermissionMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.ListIpPermissionRequest, yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.ListIpPermissionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.containerregistry.v1.RegistryService", "ListIpPermission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.ListIpPermissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.ListIpPermissionsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RegistryServiceMethodDescriptorSupplier("ListIpPermission"))
                  .build();
          }
        }
     }
     return getListIpPermissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.SetIpPermissionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getSetIpPermissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetIpPermission",
      requestType = yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.SetIpPermissionRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.SetIpPermissionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getSetIpPermissionMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.SetIpPermissionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getSetIpPermissionMethod;
    if ((getSetIpPermissionMethod = RegistryServiceGrpc.getSetIpPermissionMethod) == null) {
      synchronized (RegistryServiceGrpc.class) {
        if ((getSetIpPermissionMethod = RegistryServiceGrpc.getSetIpPermissionMethod) == null) {
          RegistryServiceGrpc.getSetIpPermissionMethod = getSetIpPermissionMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.SetIpPermissionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.containerregistry.v1.RegistryService", "SetIpPermission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.SetIpPermissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new RegistryServiceMethodDescriptorSupplier("SetIpPermission"))
                  .build();
          }
        }
     }
     return getSetIpPermissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.UpdateIpPermissionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateIpPermissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateIpPermission",
      requestType = yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.UpdateIpPermissionRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.UpdateIpPermissionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateIpPermissionMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.UpdateIpPermissionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateIpPermissionMethod;
    if ((getUpdateIpPermissionMethod = RegistryServiceGrpc.getUpdateIpPermissionMethod) == null) {
      synchronized (RegistryServiceGrpc.class) {
        if ((getUpdateIpPermissionMethod = RegistryServiceGrpc.getUpdateIpPermissionMethod) == null) {
          RegistryServiceGrpc.getUpdateIpPermissionMethod = getUpdateIpPermissionMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.UpdateIpPermissionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.containerregistry.v1.RegistryService", "UpdateIpPermission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.UpdateIpPermissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new RegistryServiceMethodDescriptorSupplier("UpdateIpPermission"))
                  .build();
          }
        }
     }
     return getUpdateIpPermissionMethod;
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
   * <pre>
   * A set of methods for managing Registry resources.
   * </pre>
   */
  public static abstract class RegistryServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified Registry resource.
     * To get the list of available Registry resources, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.GetRegistryRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.containerregistry.v1.RegistryOuterClass.Registry> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of Registry resources in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.ListRegistriesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.ListRegistriesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a registry in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.CreateRegistryRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified registry.
     * </pre>
     */
    public void update(yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.UpdateRegistryRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified registry.
     * </pre>
     */
    public void delete(yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.DeleteRegistryRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists access bindings for the specified registry.
     * </pre>
     */
    public void listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.access.Access.ListAccessBindingsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListAccessBindingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sets access bindings for the specified registry.
     * </pre>
     */
    public void setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getSetAccessBindingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates access bindings for the specified registry.
     * </pre>
     */
    public void updateAccessBindings(yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateAccessBindingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * List ip permissions for the specified registry.
     * </pre>
     */
    public void listIpPermission(yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.ListIpPermissionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.ListIpPermissionsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListIpPermissionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set ip permissions for the specified registry.
     * </pre>
     */
    public void setIpPermission(yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.SetIpPermissionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getSetIpPermissionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update ip permissions for the specified registry.
     * </pre>
     */
    public void updateIpPermission(yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.UpdateIpPermissionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateIpPermissionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.GetRegistryRequest,
                yandex.cloud.api.containerregistry.v1.RegistryOuterClass.Registry>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.ListRegistriesRequest,
                yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.ListRegistriesResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.CreateRegistryRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.UpdateRegistryRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.DeleteRegistryRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
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
          .addMethod(
            getListIpPermissionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.ListIpPermissionRequest,
                yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.ListIpPermissionsResponse>(
                  this, METHODID_LIST_IP_PERMISSION)))
          .addMethod(
            getSetIpPermissionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.SetIpPermissionRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_SET_IP_PERMISSION)))
          .addMethod(
            getUpdateIpPermissionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.UpdateIpPermissionRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE_IP_PERMISSION)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing Registry resources.
   * </pre>
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
     * <pre>
     * Returns the specified Registry resource.
     * To get the list of available Registry resources, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.GetRegistryRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.containerregistry.v1.RegistryOuterClass.Registry> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of Registry resources in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.ListRegistriesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.ListRegistriesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a registry in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.CreateRegistryRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified registry.
     * </pre>
     */
    public void update(yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.UpdateRegistryRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified registry.
     * </pre>
     */
    public void delete(yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.DeleteRegistryRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists access bindings for the specified registry.
     * </pre>
     */
    public void listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.access.Access.ListAccessBindingsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sets access bindings for the specified registry.
     * </pre>
     */
    public void setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates access bindings for the specified registry.
     * </pre>
     */
    public void updateAccessBindings(yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List ip permissions for the specified registry.
     * </pre>
     */
    public void listIpPermission(yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.ListIpPermissionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.ListIpPermissionsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListIpPermissionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set ip permissions for the specified registry.
     * </pre>
     */
    public void setIpPermission(yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.SetIpPermissionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetIpPermissionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update ip permissions for the specified registry.
     * </pre>
     */
    public void updateIpPermission(yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.UpdateIpPermissionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateIpPermissionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Registry resources.
   * </pre>
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
     * <pre>
     * Returns the specified Registry resource.
     * To get the list of available Registry resources, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.containerregistry.v1.RegistryOuterClass.Registry get(yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.GetRegistryRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of Registry resources in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.ListRegistriesResponse list(yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.ListRegistriesRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a registry in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.CreateRegistryRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified registry.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.UpdateRegistryRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified registry.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.DeleteRegistryRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists access bindings for the specified registry.
     * </pre>
     */
    public yandex.cloud.api.access.Access.ListAccessBindingsResponse listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListAccessBindingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets access bindings for the specified registry.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetAccessBindingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates access bindings for the specified registry.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation updateAccessBindings(yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateAccessBindingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List ip permissions for the specified registry.
     * </pre>
     */
    public yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.ListIpPermissionsResponse listIpPermission(yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.ListIpPermissionRequest request) {
      return blockingUnaryCall(
          getChannel(), getListIpPermissionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set ip permissions for the specified registry.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation setIpPermission(yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.SetIpPermissionRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetIpPermissionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update ip permissions for the specified registry.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation updateIpPermission(yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.UpdateIpPermissionRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateIpPermissionMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Registry resources.
   * </pre>
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
     * <pre>
     * Returns the specified Registry resource.
     * To get the list of available Registry resources, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.containerregistry.v1.RegistryOuterClass.Registry> get(
        yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.GetRegistryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of Registry resources in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.ListRegistriesResponse> list(
        yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.ListRegistriesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a registry in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.CreateRegistryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified registry.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.UpdateRegistryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified registry.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.DeleteRegistryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists access bindings for the specified registry.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.access.Access.ListAccessBindingsResponse> listAccessBindings(
        yandex.cloud.api.access.Access.ListAccessBindingsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListAccessBindingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sets access bindings for the specified registry.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> setAccessBindings(
        yandex.cloud.api.access.Access.SetAccessBindingsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetAccessBindingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates access bindings for the specified registry.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> updateAccessBindings(
        yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateAccessBindingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List ip permissions for the specified registry.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.ListIpPermissionsResponse> listIpPermission(
        yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.ListIpPermissionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListIpPermissionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set ip permissions for the specified registry.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> setIpPermission(
        yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.SetIpPermissionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetIpPermissionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update ip permissions for the specified registry.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> updateIpPermission(
        yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.UpdateIpPermissionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateIpPermissionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_DELETE = 4;
  private static final int METHODID_LIST_ACCESS_BINDINGS = 5;
  private static final int METHODID_SET_ACCESS_BINDINGS = 6;
  private static final int METHODID_UPDATE_ACCESS_BINDINGS = 7;
  private static final int METHODID_LIST_IP_PERMISSION = 8;
  private static final int METHODID_SET_IP_PERMISSION = 9;
  private static final int METHODID_UPDATE_IP_PERMISSION = 10;

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
          serviceImpl.get((yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.GetRegistryRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.containerregistry.v1.RegistryOuterClass.Registry>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.ListRegistriesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.ListRegistriesResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.CreateRegistryRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.UpdateRegistryRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.DeleteRegistryRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
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
        case METHODID_LIST_IP_PERMISSION:
          serviceImpl.listIpPermission((yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.ListIpPermissionRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.ListIpPermissionsResponse>) responseObserver);
          break;
        case METHODID_SET_IP_PERMISSION:
          serviceImpl.setIpPermission((yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.SetIpPermissionRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE_IP_PERMISSION:
          serviceImpl.updateIpPermission((yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.UpdateIpPermissionRequest) request,
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

  private static abstract class RegistryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RegistryServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.containerregistry.v1.RegistryServiceOuterClass.getDescriptor();
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
              .addMethod(getListAccessBindingsMethod())
              .addMethod(getSetAccessBindingsMethod())
              .addMethod(getUpdateAccessBindingsMethod())
              .addMethod(getListIpPermissionMethod())
              .addMethod(getSetIpPermissionMethod())
              .addMethod(getUpdateIpPermissionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
