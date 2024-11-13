package yandex.cloud.api.cloudregistry.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing Registry resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/cloudregistry/v1/registry_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RegistryServiceGrpc {

  private RegistryServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.cloudregistry.v1.RegistryService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.GetRegistryRequest,
      yandex.cloud.api.cloudregistry.v1.RegistryOuterClass.Registry> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.GetRegistryRequest.class,
      responseType = yandex.cloud.api.cloudregistry.v1.RegistryOuterClass.Registry.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.GetRegistryRequest,
      yandex.cloud.api.cloudregistry.v1.RegistryOuterClass.Registry> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.GetRegistryRequest, yandex.cloud.api.cloudregistry.v1.RegistryOuterClass.Registry> getGetMethod;
    if ((getGetMethod = RegistryServiceGrpc.getGetMethod) == null) {
      synchronized (RegistryServiceGrpc.class) {
        if ((getGetMethod = RegistryServiceGrpc.getGetMethod) == null) {
          RegistryServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.GetRegistryRequest, yandex.cloud.api.cloudregistry.v1.RegistryOuterClass.Registry>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.GetRegistryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cloudregistry.v1.RegistryOuterClass.Registry.getDefaultInstance()))
              .setSchemaDescriptor(new RegistryServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.ListRegistriesRequest,
      yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.ListRegistriesResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.ListRegistriesRequest.class,
      responseType = yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.ListRegistriesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.ListRegistriesRequest,
      yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.ListRegistriesResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.ListRegistriesRequest, yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.ListRegistriesResponse> getListMethod;
    if ((getListMethod = RegistryServiceGrpc.getListMethod) == null) {
      synchronized (RegistryServiceGrpc.class) {
        if ((getListMethod = RegistryServiceGrpc.getListMethod) == null) {
          RegistryServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.ListRegistriesRequest, yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.ListRegistriesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.ListRegistriesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.ListRegistriesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RegistryServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.CreateRegistryRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.CreateRegistryRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.CreateRegistryRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.CreateRegistryRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = RegistryServiceGrpc.getCreateMethod) == null) {
      synchronized (RegistryServiceGrpc.class) {
        if ((getCreateMethod = RegistryServiceGrpc.getCreateMethod) == null) {
          RegistryServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.CreateRegistryRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.CreateRegistryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new RegistryServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.UpdateRegistryRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.UpdateRegistryRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.UpdateRegistryRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.UpdateRegistryRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = RegistryServiceGrpc.getUpdateMethod) == null) {
      synchronized (RegistryServiceGrpc.class) {
        if ((getUpdateMethod = RegistryServiceGrpc.getUpdateMethod) == null) {
          RegistryServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.UpdateRegistryRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.UpdateRegistryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new RegistryServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.DeleteRegistryRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.DeleteRegistryRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.DeleteRegistryRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.DeleteRegistryRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = RegistryServiceGrpc.getDeleteMethod) == null) {
      synchronized (RegistryServiceGrpc.class) {
        if ((getDeleteMethod = RegistryServiceGrpc.getDeleteMethod) == null) {
          RegistryServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.DeleteRegistryRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.DeleteRegistryRequest.getDefaultInstance()))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAccessBindings"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetAccessBindings"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAccessBindings"))
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

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.ListIpPermissionsRequest,
      yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.ListIpPermissionsResponse> getListIpPermissionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListIpPermissions",
      requestType = yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.ListIpPermissionsRequest.class,
      responseType = yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.ListIpPermissionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.ListIpPermissionsRequest,
      yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.ListIpPermissionsResponse> getListIpPermissionsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.ListIpPermissionsRequest, yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.ListIpPermissionsResponse> getListIpPermissionsMethod;
    if ((getListIpPermissionsMethod = RegistryServiceGrpc.getListIpPermissionsMethod) == null) {
      synchronized (RegistryServiceGrpc.class) {
        if ((getListIpPermissionsMethod = RegistryServiceGrpc.getListIpPermissionsMethod) == null) {
          RegistryServiceGrpc.getListIpPermissionsMethod = getListIpPermissionsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.ListIpPermissionsRequest, yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.ListIpPermissionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListIpPermissions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.ListIpPermissionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.ListIpPermissionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RegistryServiceMethodDescriptorSupplier("ListIpPermissions"))
              .build();
        }
      }
    }
    return getListIpPermissionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.SetIpPermissionsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getSetIpPermissionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetIpPermissions",
      requestType = yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.SetIpPermissionsRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.SetIpPermissionsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getSetIpPermissionsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.SetIpPermissionsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getSetIpPermissionsMethod;
    if ((getSetIpPermissionsMethod = RegistryServiceGrpc.getSetIpPermissionsMethod) == null) {
      synchronized (RegistryServiceGrpc.class) {
        if ((getSetIpPermissionsMethod = RegistryServiceGrpc.getSetIpPermissionsMethod) == null) {
          RegistryServiceGrpc.getSetIpPermissionsMethod = getSetIpPermissionsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.SetIpPermissionsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetIpPermissions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.SetIpPermissionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new RegistryServiceMethodDescriptorSupplier("SetIpPermissions"))
              .build();
        }
      }
    }
    return getSetIpPermissionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.UpdateIpPermissionsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateIpPermissionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateIpPermissions",
      requestType = yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.UpdateIpPermissionsRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.UpdateIpPermissionsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateIpPermissionsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.UpdateIpPermissionsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateIpPermissionsMethod;
    if ((getUpdateIpPermissionsMethod = RegistryServiceGrpc.getUpdateIpPermissionsMethod) == null) {
      synchronized (RegistryServiceGrpc.class) {
        if ((getUpdateIpPermissionsMethod = RegistryServiceGrpc.getUpdateIpPermissionsMethod) == null) {
          RegistryServiceGrpc.getUpdateIpPermissionsMethod = getUpdateIpPermissionsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.UpdateIpPermissionsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateIpPermissions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.UpdateIpPermissionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new RegistryServiceMethodDescriptorSupplier("UpdateIpPermissions"))
              .build();
        }
      }
    }
    return getUpdateIpPermissionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.ListArtifactsRequest,
      yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.ListArtifactsResponse> getListArtifactsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListArtifacts",
      requestType = yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.ListArtifactsRequest.class,
      responseType = yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.ListArtifactsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.ListArtifactsRequest,
      yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.ListArtifactsResponse> getListArtifactsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.ListArtifactsRequest, yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.ListArtifactsResponse> getListArtifactsMethod;
    if ((getListArtifactsMethod = RegistryServiceGrpc.getListArtifactsMethod) == null) {
      synchronized (RegistryServiceGrpc.class) {
        if ((getListArtifactsMethod = RegistryServiceGrpc.getListArtifactsMethod) == null) {
          RegistryServiceGrpc.getListArtifactsMethod = getListArtifactsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.ListArtifactsRequest, yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.ListArtifactsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListArtifacts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.ListArtifactsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.ListArtifactsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RegistryServiceMethodDescriptorSupplier("ListArtifacts"))
              .build();
        }
      }
    }
    return getListArtifactsMethod;
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
   * A set of methods for managing Registry resources.
   * </pre>
   */
  public static abstract class RegistryServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified Registry resource.
     * To get the list of available Registry resources, make a [RegistryService.List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.GetRegistryRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cloudregistry.v1.RegistryOuterClass.Registry> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of Registry resources in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.ListRegistriesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.ListRegistriesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a registry in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.CreateRegistryRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified registry.
     * </pre>
     */
    public void update(yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.UpdateRegistryRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified registry.
     * </pre>
     */
    public void delete(yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.DeleteRegistryRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists access bindings for the specified registry.
     * </pre>
     */
    public void listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.access.Access.ListAccessBindingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAccessBindingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sets access bindings for the specified registry.
     * </pre>
     */
    public void setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetAccessBindingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates access bindings for the specified registry.
     * </pre>
     */
    public void updateAccessBindings(yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAccessBindingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * List ip permissions for the specified registry.
     * </pre>
     */
    public void listIpPermissions(yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.ListIpPermissionsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.ListIpPermissionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListIpPermissionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set ip permissions for the specified registry.
     * </pre>
     */
    public void setIpPermissions(yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.SetIpPermissionsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetIpPermissionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update ip permissions for the specified registry.
     * </pre>
     */
    public void updateIpPermissions(yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.UpdateIpPermissionsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateIpPermissionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of registry artifact resources in the specified registry.
     * </pre>
     */
    public void listArtifacts(yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.ListArtifactsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.ListArtifactsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListArtifactsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.GetRegistryRequest,
                yandex.cloud.api.cloudregistry.v1.RegistryOuterClass.Registry>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.ListRegistriesRequest,
                yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.ListRegistriesResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.CreateRegistryRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.UpdateRegistryRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.DeleteRegistryRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
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
            getListIpPermissionsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.ListIpPermissionsRequest,
                yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.ListIpPermissionsResponse>(
                  this, METHODID_LIST_IP_PERMISSIONS)))
          .addMethod(
            getSetIpPermissionsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.SetIpPermissionsRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_SET_IP_PERMISSIONS)))
          .addMethod(
            getUpdateIpPermissionsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.UpdateIpPermissionsRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE_IP_PERMISSIONS)))
          .addMethod(
            getListArtifactsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.ListArtifactsRequest,
                yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.ListArtifactsResponse>(
                  this, METHODID_LIST_ARTIFACTS)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing Registry resources.
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
     * Returns the specified Registry resource.
     * To get the list of available Registry resources, make a [RegistryService.List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.GetRegistryRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cloudregistry.v1.RegistryOuterClass.Registry> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of Registry resources in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.ListRegistriesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.ListRegistriesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a registry in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.CreateRegistryRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified registry.
     * </pre>
     */
    public void update(yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.UpdateRegistryRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified registry.
     * </pre>
     */
    public void delete(yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.DeleteRegistryRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists access bindings for the specified registry.
     * </pre>
     */
    public void listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.access.Access.ListAccessBindingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sets access bindings for the specified registry.
     * </pre>
     */
    public void setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates access bindings for the specified registry.
     * </pre>
     */
    public void updateAccessBindings(yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List ip permissions for the specified registry.
     * </pre>
     */
    public void listIpPermissions(yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.ListIpPermissionsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.ListIpPermissionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListIpPermissionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set ip permissions for the specified registry.
     * </pre>
     */
    public void setIpPermissions(yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.SetIpPermissionsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetIpPermissionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update ip permissions for the specified registry.
     * </pre>
     */
    public void updateIpPermissions(yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.UpdateIpPermissionsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateIpPermissionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of registry artifact resources in the specified registry.
     * </pre>
     */
    public void listArtifacts(yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.ListArtifactsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.ListArtifactsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListArtifactsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Registry resources.
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
     * Returns the specified Registry resource.
     * To get the list of available Registry resources, make a [RegistryService.List] request.
     * </pre>
     */
    public yandex.cloud.api.cloudregistry.v1.RegistryOuterClass.Registry get(yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.GetRegistryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of Registry resources in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.ListRegistriesResponse list(yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.ListRegistriesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a registry in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.CreateRegistryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified registry.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.UpdateRegistryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified registry.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.DeleteRegistryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists access bindings for the specified registry.
     * </pre>
     */
    public yandex.cloud.api.access.Access.ListAccessBindingsResponse listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAccessBindingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets access bindings for the specified registry.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetAccessBindingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates access bindings for the specified registry.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation updateAccessBindings(yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAccessBindingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List ip permissions for the specified registry.
     * </pre>
     */
    public yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.ListIpPermissionsResponse listIpPermissions(yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.ListIpPermissionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListIpPermissionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set ip permissions for the specified registry.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation setIpPermissions(yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.SetIpPermissionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetIpPermissionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update ip permissions for the specified registry.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation updateIpPermissions(yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.UpdateIpPermissionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateIpPermissionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of registry artifact resources in the specified registry.
     * </pre>
     */
    public yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.ListArtifactsResponse listArtifacts(yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.ListArtifactsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListArtifactsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Registry resources.
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
     * Returns the specified Registry resource.
     * To get the list of available Registry resources, make a [RegistryService.List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.cloudregistry.v1.RegistryOuterClass.Registry> get(
        yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.GetRegistryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of Registry resources in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.ListRegistriesResponse> list(
        yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.ListRegistriesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a registry in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.CreateRegistryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified registry.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.UpdateRegistryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified registry.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.DeleteRegistryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists access bindings for the specified registry.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.access.Access.ListAccessBindingsResponse> listAccessBindings(
        yandex.cloud.api.access.Access.ListAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAccessBindingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sets access bindings for the specified registry.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> setAccessBindings(
        yandex.cloud.api.access.Access.SetAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetAccessBindingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates access bindings for the specified registry.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> updateAccessBindings(
        yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAccessBindingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List ip permissions for the specified registry.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.ListIpPermissionsResponse> listIpPermissions(
        yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.ListIpPermissionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListIpPermissionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set ip permissions for the specified registry.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> setIpPermissions(
        yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.SetIpPermissionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetIpPermissionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update ip permissions for the specified registry.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> updateIpPermissions(
        yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.UpdateIpPermissionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateIpPermissionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of registry artifact resources in the specified registry.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.ListArtifactsResponse> listArtifacts(
        yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.ListArtifactsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListArtifactsMethod(), getCallOptions()), request);
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
  private static final int METHODID_LIST_IP_PERMISSIONS = 8;
  private static final int METHODID_SET_IP_PERMISSIONS = 9;
  private static final int METHODID_UPDATE_IP_PERMISSIONS = 10;
  private static final int METHODID_LIST_ARTIFACTS = 11;

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
          serviceImpl.get((yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.GetRegistryRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.cloudregistry.v1.RegistryOuterClass.Registry>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.ListRegistriesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.ListRegistriesResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.CreateRegistryRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.UpdateRegistryRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.DeleteRegistryRequest) request,
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
        case METHODID_LIST_IP_PERMISSIONS:
          serviceImpl.listIpPermissions((yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.ListIpPermissionsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.ListIpPermissionsResponse>) responseObserver);
          break;
        case METHODID_SET_IP_PERMISSIONS:
          serviceImpl.setIpPermissions((yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.SetIpPermissionsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE_IP_PERMISSIONS:
          serviceImpl.updateIpPermissions((yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.UpdateIpPermissionsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_ARTIFACTS:
          serviceImpl.listArtifacts((yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.ListArtifactsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.ListArtifactsResponse>) responseObserver);
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
      return yandex.cloud.api.cloudregistry.v1.RegistryServiceOuterClass.getDescriptor();
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
              .addMethod(getListIpPermissionsMethod())
              .addMethod(getSetIpPermissionsMethod())
              .addMethod(getUpdateIpPermissionsMethod())
              .addMethod(getListArtifactsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
