package yandex.cloud.api.cloudrouter.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing RoutingInstance resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/cloudrouter/v1/routing_instance_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RoutingInstanceServiceGrpc {

  private RoutingInstanceServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.cloudrouter.v1.RoutingInstanceService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.GetRoutingInstanceRequest,
      yandex.cloud.api.cloudrouter.v1.RoutingInstanceOuterClass.RoutingInstance> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.GetRoutingInstanceRequest.class,
      responseType = yandex.cloud.api.cloudrouter.v1.RoutingInstanceOuterClass.RoutingInstance.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.GetRoutingInstanceRequest,
      yandex.cloud.api.cloudrouter.v1.RoutingInstanceOuterClass.RoutingInstance> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.GetRoutingInstanceRequest, yandex.cloud.api.cloudrouter.v1.RoutingInstanceOuterClass.RoutingInstance> getGetMethod;
    if ((getGetMethod = RoutingInstanceServiceGrpc.getGetMethod) == null) {
      synchronized (RoutingInstanceServiceGrpc.class) {
        if ((getGetMethod = RoutingInstanceServiceGrpc.getGetMethod) == null) {
          RoutingInstanceServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.GetRoutingInstanceRequest, yandex.cloud.api.cloudrouter.v1.RoutingInstanceOuterClass.RoutingInstance>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.GetRoutingInstanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cloudrouter.v1.RoutingInstanceOuterClass.RoutingInstance.getDefaultInstance()))
              .setSchemaDescriptor(new RoutingInstanceServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.GetRoutingInstanceByVpcNetworkIdRequest,
      yandex.cloud.api.cloudrouter.v1.RoutingInstanceOuterClass.RoutingInstance> getGetByVpcNetworkIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetByVpcNetworkId",
      requestType = yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.GetRoutingInstanceByVpcNetworkIdRequest.class,
      responseType = yandex.cloud.api.cloudrouter.v1.RoutingInstanceOuterClass.RoutingInstance.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.GetRoutingInstanceByVpcNetworkIdRequest,
      yandex.cloud.api.cloudrouter.v1.RoutingInstanceOuterClass.RoutingInstance> getGetByVpcNetworkIdMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.GetRoutingInstanceByVpcNetworkIdRequest, yandex.cloud.api.cloudrouter.v1.RoutingInstanceOuterClass.RoutingInstance> getGetByVpcNetworkIdMethod;
    if ((getGetByVpcNetworkIdMethod = RoutingInstanceServiceGrpc.getGetByVpcNetworkIdMethod) == null) {
      synchronized (RoutingInstanceServiceGrpc.class) {
        if ((getGetByVpcNetworkIdMethod = RoutingInstanceServiceGrpc.getGetByVpcNetworkIdMethod) == null) {
          RoutingInstanceServiceGrpc.getGetByVpcNetworkIdMethod = getGetByVpcNetworkIdMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.GetRoutingInstanceByVpcNetworkIdRequest, yandex.cloud.api.cloudrouter.v1.RoutingInstanceOuterClass.RoutingInstance>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetByVpcNetworkId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.GetRoutingInstanceByVpcNetworkIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cloudrouter.v1.RoutingInstanceOuterClass.RoutingInstance.getDefaultInstance()))
              .setSchemaDescriptor(new RoutingInstanceServiceMethodDescriptorSupplier("GetByVpcNetworkId"))
              .build();
        }
      }
    }
    return getGetByVpcNetworkIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.GetRoutingInstanceByCicPrivateConnectionIdRequest,
      yandex.cloud.api.cloudrouter.v1.RoutingInstanceOuterClass.RoutingInstance> getGetByCicPrivateConnectionIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetByCicPrivateConnectionId",
      requestType = yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.GetRoutingInstanceByCicPrivateConnectionIdRequest.class,
      responseType = yandex.cloud.api.cloudrouter.v1.RoutingInstanceOuterClass.RoutingInstance.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.GetRoutingInstanceByCicPrivateConnectionIdRequest,
      yandex.cloud.api.cloudrouter.v1.RoutingInstanceOuterClass.RoutingInstance> getGetByCicPrivateConnectionIdMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.GetRoutingInstanceByCicPrivateConnectionIdRequest, yandex.cloud.api.cloudrouter.v1.RoutingInstanceOuterClass.RoutingInstance> getGetByCicPrivateConnectionIdMethod;
    if ((getGetByCicPrivateConnectionIdMethod = RoutingInstanceServiceGrpc.getGetByCicPrivateConnectionIdMethod) == null) {
      synchronized (RoutingInstanceServiceGrpc.class) {
        if ((getGetByCicPrivateConnectionIdMethod = RoutingInstanceServiceGrpc.getGetByCicPrivateConnectionIdMethod) == null) {
          RoutingInstanceServiceGrpc.getGetByCicPrivateConnectionIdMethod = getGetByCicPrivateConnectionIdMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.GetRoutingInstanceByCicPrivateConnectionIdRequest, yandex.cloud.api.cloudrouter.v1.RoutingInstanceOuterClass.RoutingInstance>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetByCicPrivateConnectionId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.GetRoutingInstanceByCicPrivateConnectionIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cloudrouter.v1.RoutingInstanceOuterClass.RoutingInstance.getDefaultInstance()))
              .setSchemaDescriptor(new RoutingInstanceServiceMethodDescriptorSupplier("GetByCicPrivateConnectionId"))
              .build();
        }
      }
    }
    return getGetByCicPrivateConnectionIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.ListRoutingInstancesRequest,
      yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.ListRoutingInstancesResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.ListRoutingInstancesRequest.class,
      responseType = yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.ListRoutingInstancesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.ListRoutingInstancesRequest,
      yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.ListRoutingInstancesResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.ListRoutingInstancesRequest, yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.ListRoutingInstancesResponse> getListMethod;
    if ((getListMethod = RoutingInstanceServiceGrpc.getListMethod) == null) {
      synchronized (RoutingInstanceServiceGrpc.class) {
        if ((getListMethod = RoutingInstanceServiceGrpc.getListMethod) == null) {
          RoutingInstanceServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.ListRoutingInstancesRequest, yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.ListRoutingInstancesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.ListRoutingInstancesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.ListRoutingInstancesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RoutingInstanceServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.CreateRoutingInstanceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.CreateRoutingInstanceRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.CreateRoutingInstanceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.CreateRoutingInstanceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = RoutingInstanceServiceGrpc.getCreateMethod) == null) {
      synchronized (RoutingInstanceServiceGrpc.class) {
        if ((getCreateMethod = RoutingInstanceServiceGrpc.getCreateMethod) == null) {
          RoutingInstanceServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.CreateRoutingInstanceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.CreateRoutingInstanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new RoutingInstanceServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.UpdateRoutingInstanceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.UpdateRoutingInstanceRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.UpdateRoutingInstanceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.UpdateRoutingInstanceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = RoutingInstanceServiceGrpc.getUpdateMethod) == null) {
      synchronized (RoutingInstanceServiceGrpc.class) {
        if ((getUpdateMethod = RoutingInstanceServiceGrpc.getUpdateMethod) == null) {
          RoutingInstanceServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.UpdateRoutingInstanceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.UpdateRoutingInstanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new RoutingInstanceServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.UpsertPrefixesRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpsertPrefixesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpsertPrefixes",
      requestType = yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.UpsertPrefixesRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.UpsertPrefixesRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpsertPrefixesMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.UpsertPrefixesRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpsertPrefixesMethod;
    if ((getUpsertPrefixesMethod = RoutingInstanceServiceGrpc.getUpsertPrefixesMethod) == null) {
      synchronized (RoutingInstanceServiceGrpc.class) {
        if ((getUpsertPrefixesMethod = RoutingInstanceServiceGrpc.getUpsertPrefixesMethod) == null) {
          RoutingInstanceServiceGrpc.getUpsertPrefixesMethod = getUpsertPrefixesMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.UpsertPrefixesRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpsertPrefixes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.UpsertPrefixesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new RoutingInstanceServiceMethodDescriptorSupplier("UpsertPrefixes"))
              .build();
        }
      }
    }
    return getUpsertPrefixesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.RemovePrefixesRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRemovePrefixesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemovePrefixes",
      requestType = yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.RemovePrefixesRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.RemovePrefixesRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRemovePrefixesMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.RemovePrefixesRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getRemovePrefixesMethod;
    if ((getRemovePrefixesMethod = RoutingInstanceServiceGrpc.getRemovePrefixesMethod) == null) {
      synchronized (RoutingInstanceServiceGrpc.class) {
        if ((getRemovePrefixesMethod = RoutingInstanceServiceGrpc.getRemovePrefixesMethod) == null) {
          RoutingInstanceServiceGrpc.getRemovePrefixesMethod = getRemovePrefixesMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.RemovePrefixesRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemovePrefixes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.RemovePrefixesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new RoutingInstanceServiceMethodDescriptorSupplier("RemovePrefixes"))
              .build();
        }
      }
    }
    return getRemovePrefixesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.AddPrivateConnectionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getAddPrivateConnectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddPrivateConnection",
      requestType = yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.AddPrivateConnectionRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.AddPrivateConnectionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getAddPrivateConnectionMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.AddPrivateConnectionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getAddPrivateConnectionMethod;
    if ((getAddPrivateConnectionMethod = RoutingInstanceServiceGrpc.getAddPrivateConnectionMethod) == null) {
      synchronized (RoutingInstanceServiceGrpc.class) {
        if ((getAddPrivateConnectionMethod = RoutingInstanceServiceGrpc.getAddPrivateConnectionMethod) == null) {
          RoutingInstanceServiceGrpc.getAddPrivateConnectionMethod = getAddPrivateConnectionMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.AddPrivateConnectionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddPrivateConnection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.AddPrivateConnectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new RoutingInstanceServiceMethodDescriptorSupplier("AddPrivateConnection"))
              .build();
        }
      }
    }
    return getAddPrivateConnectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.RemovePrivateConnectionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRemovePrivateConnectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemovePrivateConnection",
      requestType = yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.RemovePrivateConnectionRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.RemovePrivateConnectionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRemovePrivateConnectionMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.RemovePrivateConnectionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getRemovePrivateConnectionMethod;
    if ((getRemovePrivateConnectionMethod = RoutingInstanceServiceGrpc.getRemovePrivateConnectionMethod) == null) {
      synchronized (RoutingInstanceServiceGrpc.class) {
        if ((getRemovePrivateConnectionMethod = RoutingInstanceServiceGrpc.getRemovePrivateConnectionMethod) == null) {
          RoutingInstanceServiceGrpc.getRemovePrivateConnectionMethod = getRemovePrivateConnectionMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.RemovePrivateConnectionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemovePrivateConnection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.RemovePrivateConnectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new RoutingInstanceServiceMethodDescriptorSupplier("RemovePrivateConnection"))
              .build();
        }
      }
    }
    return getRemovePrivateConnectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.DeleteRoutingInstanceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.DeleteRoutingInstanceRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.DeleteRoutingInstanceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.DeleteRoutingInstanceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = RoutingInstanceServiceGrpc.getDeleteMethod) == null) {
      synchronized (RoutingInstanceServiceGrpc.class) {
        if ((getDeleteMethod = RoutingInstanceServiceGrpc.getDeleteMethod) == null) {
          RoutingInstanceServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.DeleteRoutingInstanceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.DeleteRoutingInstanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new RoutingInstanceServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.ListRoutingInstanceOperationsRequest,
      yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.ListRoutingInstanceOperationsResponse> getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.ListRoutingInstanceOperationsRequest.class,
      responseType = yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.ListRoutingInstanceOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.ListRoutingInstanceOperationsRequest,
      yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.ListRoutingInstanceOperationsResponse> getListOperationsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.ListRoutingInstanceOperationsRequest, yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.ListRoutingInstanceOperationsResponse> getListOperationsMethod;
    if ((getListOperationsMethod = RoutingInstanceServiceGrpc.getListOperationsMethod) == null) {
      synchronized (RoutingInstanceServiceGrpc.class) {
        if ((getListOperationsMethod = RoutingInstanceServiceGrpc.getListOperationsMethod) == null) {
          RoutingInstanceServiceGrpc.getListOperationsMethod = getListOperationsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.ListRoutingInstanceOperationsRequest, yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.ListRoutingInstanceOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.ListRoutingInstanceOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.ListRoutingInstanceOperationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RoutingInstanceServiceMethodDescriptorSupplier("ListOperations"))
              .build();
        }
      }
    }
    return getListOperationsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RoutingInstanceServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RoutingInstanceServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RoutingInstanceServiceStub>() {
        @java.lang.Override
        public RoutingInstanceServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RoutingInstanceServiceStub(channel, callOptions);
        }
      };
    return RoutingInstanceServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RoutingInstanceServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RoutingInstanceServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RoutingInstanceServiceBlockingStub>() {
        @java.lang.Override
        public RoutingInstanceServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RoutingInstanceServiceBlockingStub(channel, callOptions);
        }
      };
    return RoutingInstanceServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RoutingInstanceServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RoutingInstanceServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RoutingInstanceServiceFutureStub>() {
        @java.lang.Override
        public RoutingInstanceServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RoutingInstanceServiceFutureStub(channel, callOptions);
        }
      };
    return RoutingInstanceServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing RoutingInstance resources.
   * </pre>
   */
  public static abstract class RoutingInstanceServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified RoutingInstance resource.
     * To get the list of available RoutingInstance resources, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.GetRoutingInstanceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cloudrouter.v1.RoutingInstanceOuterClass.RoutingInstance> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the RoutingInstance resource by vpcNetworkId
     * To get the list of available RoutingInstance resources, make a [List] request.
     * </pre>
     */
    public void getByVpcNetworkId(yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.GetRoutingInstanceByVpcNetworkIdRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cloudrouter.v1.RoutingInstanceOuterClass.RoutingInstance> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetByVpcNetworkIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the RoutingInstance resource by cicPrivateConnectionId
     * To get the list of available RoutingInstance resources, make a [List] request.
     * </pre>
     */
    public void getByCicPrivateConnectionId(yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.GetRoutingInstanceByCicPrivateConnectionIdRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cloudrouter.v1.RoutingInstanceOuterClass.RoutingInstance> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetByCicPrivateConnectionIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of RoutingInstance resources in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.ListRoutingInstancesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.ListRoutingInstancesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a RoutingInstance resource in the specified folder using the data specified in the request.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public void create(yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.CreateRoutingInstanceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates a RoutingInstance resource using the data specified in the request.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public void update(yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.UpdateRoutingInstanceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Upserts specified prefixes to a RoutingInstance resource.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public void upsertPrefixes(yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.UpsertPrefixesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpsertPrefixesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Removes specified prefixes from a RoutingInstance resource.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public void removePrefixes(yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.RemovePrefixesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemovePrefixesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Adds specified PrivateConnection to a RoutingInstance resource.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public void addPrivateConnection(yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.AddPrivateConnectionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddPrivateConnectionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Removes specified PrivateConnection from a RoutingInstance resource.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public void removePrivateConnection(yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.RemovePrivateConnectionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemovePrivateConnectionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes a RoutingInstance resource.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public void delete(yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.DeleteRoutingInstanceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified RoutingInstance.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.ListRoutingInstanceOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.ListRoutingInstanceOperationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.GetRoutingInstanceRequest,
                yandex.cloud.api.cloudrouter.v1.RoutingInstanceOuterClass.RoutingInstance>(
                  this, METHODID_GET)))
          .addMethod(
            getGetByVpcNetworkIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.GetRoutingInstanceByVpcNetworkIdRequest,
                yandex.cloud.api.cloudrouter.v1.RoutingInstanceOuterClass.RoutingInstance>(
                  this, METHODID_GET_BY_VPC_NETWORK_ID)))
          .addMethod(
            getGetByCicPrivateConnectionIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.GetRoutingInstanceByCicPrivateConnectionIdRequest,
                yandex.cloud.api.cloudrouter.v1.RoutingInstanceOuterClass.RoutingInstance>(
                  this, METHODID_GET_BY_CIC_PRIVATE_CONNECTION_ID)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.ListRoutingInstancesRequest,
                yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.ListRoutingInstancesResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.CreateRoutingInstanceRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.UpdateRoutingInstanceRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getUpsertPrefixesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.UpsertPrefixesRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPSERT_PREFIXES)))
          .addMethod(
            getRemovePrefixesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.RemovePrefixesRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_REMOVE_PREFIXES)))
          .addMethod(
            getAddPrivateConnectionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.AddPrivateConnectionRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_ADD_PRIVATE_CONNECTION)))
          .addMethod(
            getRemovePrivateConnectionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.RemovePrivateConnectionRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_REMOVE_PRIVATE_CONNECTION)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.DeleteRoutingInstanceRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListOperationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.ListRoutingInstanceOperationsRequest,
                yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.ListRoutingInstanceOperationsResponse>(
                  this, METHODID_LIST_OPERATIONS)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing RoutingInstance resources.
   * </pre>
   */
  public static final class RoutingInstanceServiceStub extends io.grpc.stub.AbstractAsyncStub<RoutingInstanceServiceStub> {
    private RoutingInstanceServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RoutingInstanceServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RoutingInstanceServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified RoutingInstance resource.
     * To get the list of available RoutingInstance resources, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.GetRoutingInstanceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cloudrouter.v1.RoutingInstanceOuterClass.RoutingInstance> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the RoutingInstance resource by vpcNetworkId
     * To get the list of available RoutingInstance resources, make a [List] request.
     * </pre>
     */
    public void getByVpcNetworkId(yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.GetRoutingInstanceByVpcNetworkIdRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cloudrouter.v1.RoutingInstanceOuterClass.RoutingInstance> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetByVpcNetworkIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the RoutingInstance resource by cicPrivateConnectionId
     * To get the list of available RoutingInstance resources, make a [List] request.
     * </pre>
     */
    public void getByCicPrivateConnectionId(yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.GetRoutingInstanceByCicPrivateConnectionIdRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cloudrouter.v1.RoutingInstanceOuterClass.RoutingInstance> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetByCicPrivateConnectionIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of RoutingInstance resources in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.ListRoutingInstancesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.ListRoutingInstancesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a RoutingInstance resource in the specified folder using the data specified in the request.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public void create(yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.CreateRoutingInstanceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates a RoutingInstance resource using the data specified in the request.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public void update(yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.UpdateRoutingInstanceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Upserts specified prefixes to a RoutingInstance resource.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public void upsertPrefixes(yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.UpsertPrefixesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpsertPrefixesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Removes specified prefixes from a RoutingInstance resource.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public void removePrefixes(yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.RemovePrefixesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemovePrefixesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Adds specified PrivateConnection to a RoutingInstance resource.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public void addPrivateConnection(yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.AddPrivateConnectionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddPrivateConnectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Removes specified PrivateConnection from a RoutingInstance resource.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public void removePrivateConnection(yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.RemovePrivateConnectionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemovePrivateConnectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a RoutingInstance resource.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public void delete(yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.DeleteRoutingInstanceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified RoutingInstance.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.ListRoutingInstanceOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.ListRoutingInstanceOperationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing RoutingInstance resources.
   * </pre>
   */
  public static final class RoutingInstanceServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<RoutingInstanceServiceBlockingStub> {
    private RoutingInstanceServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RoutingInstanceServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RoutingInstanceServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified RoutingInstance resource.
     * To get the list of available RoutingInstance resources, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.cloudrouter.v1.RoutingInstanceOuterClass.RoutingInstance get(yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.GetRoutingInstanceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the RoutingInstance resource by vpcNetworkId
     * To get the list of available RoutingInstance resources, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.cloudrouter.v1.RoutingInstanceOuterClass.RoutingInstance getByVpcNetworkId(yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.GetRoutingInstanceByVpcNetworkIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetByVpcNetworkIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the RoutingInstance resource by cicPrivateConnectionId
     * To get the list of available RoutingInstance resources, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.cloudrouter.v1.RoutingInstanceOuterClass.RoutingInstance getByCicPrivateConnectionId(yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.GetRoutingInstanceByCicPrivateConnectionIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetByCicPrivateConnectionIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of RoutingInstance resources in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.ListRoutingInstancesResponse list(yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.ListRoutingInstancesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a RoutingInstance resource in the specified folder using the data specified in the request.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.CreateRoutingInstanceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a RoutingInstance resource using the data specified in the request.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.UpdateRoutingInstanceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Upserts specified prefixes to a RoutingInstance resource.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation upsertPrefixes(yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.UpsertPrefixesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpsertPrefixesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Removes specified prefixes from a RoutingInstance resource.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation removePrefixes(yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.RemovePrefixesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemovePrefixesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Adds specified PrivateConnection to a RoutingInstance resource.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation addPrivateConnection(yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.AddPrivateConnectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddPrivateConnectionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Removes specified PrivateConnection from a RoutingInstance resource.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation removePrivateConnection(yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.RemovePrivateConnectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemovePrivateConnectionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a RoutingInstance resource.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.DeleteRoutingInstanceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists operations for the specified RoutingInstance.
     * </pre>
     */
    public yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.ListRoutingInstanceOperationsResponse listOperations(yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.ListRoutingInstanceOperationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing RoutingInstance resources.
   * </pre>
   */
  public static final class RoutingInstanceServiceFutureStub extends io.grpc.stub.AbstractFutureStub<RoutingInstanceServiceFutureStub> {
    private RoutingInstanceServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RoutingInstanceServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RoutingInstanceServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified RoutingInstance resource.
     * To get the list of available RoutingInstance resources, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.cloudrouter.v1.RoutingInstanceOuterClass.RoutingInstance> get(
        yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.GetRoutingInstanceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the RoutingInstance resource by vpcNetworkId
     * To get the list of available RoutingInstance resources, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.cloudrouter.v1.RoutingInstanceOuterClass.RoutingInstance> getByVpcNetworkId(
        yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.GetRoutingInstanceByVpcNetworkIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetByVpcNetworkIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the RoutingInstance resource by cicPrivateConnectionId
     * To get the list of available RoutingInstance resources, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.cloudrouter.v1.RoutingInstanceOuterClass.RoutingInstance> getByCicPrivateConnectionId(
        yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.GetRoutingInstanceByCicPrivateConnectionIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetByCicPrivateConnectionIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of RoutingInstance resources in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.ListRoutingInstancesResponse> list(
        yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.ListRoutingInstancesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a RoutingInstance resource in the specified folder using the data specified in the request.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.CreateRoutingInstanceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates a RoutingInstance resource using the data specified in the request.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.UpdateRoutingInstanceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Upserts specified prefixes to a RoutingInstance resource.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> upsertPrefixes(
        yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.UpsertPrefixesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpsertPrefixesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Removes specified prefixes from a RoutingInstance resource.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> removePrefixes(
        yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.RemovePrefixesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemovePrefixesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Adds specified PrivateConnection to a RoutingInstance resource.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> addPrivateConnection(
        yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.AddPrivateConnectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddPrivateConnectionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Removes specified PrivateConnection from a RoutingInstance resource.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> removePrivateConnection(
        yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.RemovePrivateConnectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemovePrivateConnectionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a RoutingInstance resource.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.DeleteRoutingInstanceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists operations for the specified RoutingInstance.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.ListRoutingInstanceOperationsResponse> listOperations(
        yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.ListRoutingInstanceOperationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_GET_BY_VPC_NETWORK_ID = 1;
  private static final int METHODID_GET_BY_CIC_PRIVATE_CONNECTION_ID = 2;
  private static final int METHODID_LIST = 3;
  private static final int METHODID_CREATE = 4;
  private static final int METHODID_UPDATE = 5;
  private static final int METHODID_UPSERT_PREFIXES = 6;
  private static final int METHODID_REMOVE_PREFIXES = 7;
  private static final int METHODID_ADD_PRIVATE_CONNECTION = 8;
  private static final int METHODID_REMOVE_PRIVATE_CONNECTION = 9;
  private static final int METHODID_DELETE = 10;
  private static final int METHODID_LIST_OPERATIONS = 11;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RoutingInstanceServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RoutingInstanceServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.GetRoutingInstanceRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.cloudrouter.v1.RoutingInstanceOuterClass.RoutingInstance>) responseObserver);
          break;
        case METHODID_GET_BY_VPC_NETWORK_ID:
          serviceImpl.getByVpcNetworkId((yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.GetRoutingInstanceByVpcNetworkIdRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.cloudrouter.v1.RoutingInstanceOuterClass.RoutingInstance>) responseObserver);
          break;
        case METHODID_GET_BY_CIC_PRIVATE_CONNECTION_ID:
          serviceImpl.getByCicPrivateConnectionId((yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.GetRoutingInstanceByCicPrivateConnectionIdRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.cloudrouter.v1.RoutingInstanceOuterClass.RoutingInstance>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.ListRoutingInstancesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.ListRoutingInstancesResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.CreateRoutingInstanceRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.UpdateRoutingInstanceRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPSERT_PREFIXES:
          serviceImpl.upsertPrefixes((yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.UpsertPrefixesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_REMOVE_PREFIXES:
          serviceImpl.removePrefixes((yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.RemovePrefixesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_ADD_PRIVATE_CONNECTION:
          serviceImpl.addPrivateConnection((yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.AddPrivateConnectionRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_REMOVE_PRIVATE_CONNECTION:
          serviceImpl.removePrivateConnection((yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.RemovePrivateConnectionRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.DeleteRoutingInstanceRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.ListRoutingInstanceOperationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.ListRoutingInstanceOperationsResponse>) responseObserver);
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

  private static abstract class RoutingInstanceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RoutingInstanceServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.cloudrouter.v1.RoutingInstanceServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RoutingInstanceService");
    }
  }

  private static final class RoutingInstanceServiceFileDescriptorSupplier
      extends RoutingInstanceServiceBaseDescriptorSupplier {
    RoutingInstanceServiceFileDescriptorSupplier() {}
  }

  private static final class RoutingInstanceServiceMethodDescriptorSupplier
      extends RoutingInstanceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RoutingInstanceServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (RoutingInstanceServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RoutingInstanceServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getGetByVpcNetworkIdMethod())
              .addMethod(getGetByCicPrivateConnectionIdMethod())
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getUpsertPrefixesMethod())
              .addMethod(getRemovePrefixesMethod())
              .addMethod(getAddPrivateConnectionMethod())
              .addMethod(getRemovePrivateConnectionMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getListOperationsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
