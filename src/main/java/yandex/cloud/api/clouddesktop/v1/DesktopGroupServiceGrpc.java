package yandex.cloud.api.clouddesktop.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing desktop group resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/clouddesktop/v1/desktop_group_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DesktopGroupServiceGrpc {

  private DesktopGroupServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.clouddesktop.v1.api.DesktopGroupService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.GetDesktopGroupRequest,
      yandex.cloud.api.clouddesktop.v1.DesktopGroupOuterClass.DesktopGroup> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.GetDesktopGroupRequest.class,
      responseType = yandex.cloud.api.clouddesktop.v1.DesktopGroupOuterClass.DesktopGroup.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.GetDesktopGroupRequest,
      yandex.cloud.api.clouddesktop.v1.DesktopGroupOuterClass.DesktopGroup> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.GetDesktopGroupRequest, yandex.cloud.api.clouddesktop.v1.DesktopGroupOuterClass.DesktopGroup> getGetMethod;
    if ((getGetMethod = DesktopGroupServiceGrpc.getGetMethod) == null) {
      synchronized (DesktopGroupServiceGrpc.class) {
        if ((getGetMethod = DesktopGroupServiceGrpc.getGetMethod) == null) {
          DesktopGroupServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.GetDesktopGroupRequest, yandex.cloud.api.clouddesktop.v1.DesktopGroupOuterClass.DesktopGroup>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.GetDesktopGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.clouddesktop.v1.DesktopGroupOuterClass.DesktopGroup.getDefaultInstance()))
              .setSchemaDescriptor(new DesktopGroupServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.ListDesktopGroupsRequest,
      yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.ListDesktopGroupsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.ListDesktopGroupsRequest.class,
      responseType = yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.ListDesktopGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.ListDesktopGroupsRequest,
      yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.ListDesktopGroupsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.ListDesktopGroupsRequest, yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.ListDesktopGroupsResponse> getListMethod;
    if ((getListMethod = DesktopGroupServiceGrpc.getListMethod) == null) {
      synchronized (DesktopGroupServiceGrpc.class) {
        if ((getListMethod = DesktopGroupServiceGrpc.getListMethod) == null) {
          DesktopGroupServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.ListDesktopGroupsRequest, yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.ListDesktopGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.ListDesktopGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.ListDesktopGroupsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DesktopGroupServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.ListDesktopGroupDesktopsRequest,
      yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.ListDesktopGroupDesktopsResponse> getListDesktopsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDesktops",
      requestType = yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.ListDesktopGroupDesktopsRequest.class,
      responseType = yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.ListDesktopGroupDesktopsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.ListDesktopGroupDesktopsRequest,
      yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.ListDesktopGroupDesktopsResponse> getListDesktopsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.ListDesktopGroupDesktopsRequest, yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.ListDesktopGroupDesktopsResponse> getListDesktopsMethod;
    if ((getListDesktopsMethod = DesktopGroupServiceGrpc.getListDesktopsMethod) == null) {
      synchronized (DesktopGroupServiceGrpc.class) {
        if ((getListDesktopsMethod = DesktopGroupServiceGrpc.getListDesktopsMethod) == null) {
          DesktopGroupServiceGrpc.getListDesktopsMethod = getListDesktopsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.ListDesktopGroupDesktopsRequest, yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.ListDesktopGroupDesktopsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListDesktops"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.ListDesktopGroupDesktopsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.ListDesktopGroupDesktopsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DesktopGroupServiceMethodDescriptorSupplier("ListDesktops"))
              .build();
        }
      }
    }
    return getListDesktopsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.ListDesktopGroupOperationsRequest,
      yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.ListDesktopGroupOperationsResponse> getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.ListDesktopGroupOperationsRequest.class,
      responseType = yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.ListDesktopGroupOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.ListDesktopGroupOperationsRequest,
      yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.ListDesktopGroupOperationsResponse> getListOperationsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.ListDesktopGroupOperationsRequest, yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.ListDesktopGroupOperationsResponse> getListOperationsMethod;
    if ((getListOperationsMethod = DesktopGroupServiceGrpc.getListOperationsMethod) == null) {
      synchronized (DesktopGroupServiceGrpc.class) {
        if ((getListOperationsMethod = DesktopGroupServiceGrpc.getListOperationsMethod) == null) {
          DesktopGroupServiceGrpc.getListOperationsMethod = getListOperationsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.ListDesktopGroupOperationsRequest, yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.ListDesktopGroupOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.ListDesktopGroupOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.ListDesktopGroupOperationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DesktopGroupServiceMethodDescriptorSupplier("ListOperations"))
              .build();
        }
      }
    }
    return getListOperationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.CreateDesktopGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.CreateDesktopGroupRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.CreateDesktopGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.CreateDesktopGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = DesktopGroupServiceGrpc.getCreateMethod) == null) {
      synchronized (DesktopGroupServiceGrpc.class) {
        if ((getCreateMethod = DesktopGroupServiceGrpc.getCreateMethod) == null) {
          DesktopGroupServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.CreateDesktopGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.CreateDesktopGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new DesktopGroupServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.UpdateDesktopGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.UpdateDesktopGroupRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.UpdateDesktopGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.UpdateDesktopGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = DesktopGroupServiceGrpc.getUpdateMethod) == null) {
      synchronized (DesktopGroupServiceGrpc.class) {
        if ((getUpdateMethod = DesktopGroupServiceGrpc.getUpdateMethod) == null) {
          DesktopGroupServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.UpdateDesktopGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.UpdateDesktopGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new DesktopGroupServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.DeleteDesktopGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.DeleteDesktopGroupRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.DeleteDesktopGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.DeleteDesktopGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = DesktopGroupServiceGrpc.getDeleteMethod) == null) {
      synchronized (DesktopGroupServiceGrpc.class) {
        if ((getDeleteMethod = DesktopGroupServiceGrpc.getDeleteMethod) == null) {
          DesktopGroupServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.DeleteDesktopGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.DeleteDesktopGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new DesktopGroupServiceMethodDescriptorSupplier("Delete"))
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
    if ((getListAccessBindingsMethod = DesktopGroupServiceGrpc.getListAccessBindingsMethod) == null) {
      synchronized (DesktopGroupServiceGrpc.class) {
        if ((getListAccessBindingsMethod = DesktopGroupServiceGrpc.getListAccessBindingsMethod) == null) {
          DesktopGroupServiceGrpc.getListAccessBindingsMethod = getListAccessBindingsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.ListAccessBindingsRequest, yandex.cloud.api.access.Access.ListAccessBindingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.ListAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.ListAccessBindingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DesktopGroupServiceMethodDescriptorSupplier("ListAccessBindings"))
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
    if ((getSetAccessBindingsMethod = DesktopGroupServiceGrpc.getSetAccessBindingsMethod) == null) {
      synchronized (DesktopGroupServiceGrpc.class) {
        if ((getSetAccessBindingsMethod = DesktopGroupServiceGrpc.getSetAccessBindingsMethod) == null) {
          DesktopGroupServiceGrpc.getSetAccessBindingsMethod = getSetAccessBindingsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.SetAccessBindingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.SetAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new DesktopGroupServiceMethodDescriptorSupplier("SetAccessBindings"))
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
    if ((getUpdateAccessBindingsMethod = DesktopGroupServiceGrpc.getUpdateAccessBindingsMethod) == null) {
      synchronized (DesktopGroupServiceGrpc.class) {
        if ((getUpdateAccessBindingsMethod = DesktopGroupServiceGrpc.getUpdateAccessBindingsMethod) == null) {
          DesktopGroupServiceGrpc.getUpdateAccessBindingsMethod = getUpdateAccessBindingsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.UpdateAccessBindingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.UpdateAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new DesktopGroupServiceMethodDescriptorSupplier("UpdateAccessBindings"))
              .build();
        }
      }
    }
    return getUpdateAccessBindingsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DesktopGroupServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DesktopGroupServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DesktopGroupServiceStub>() {
        @java.lang.Override
        public DesktopGroupServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DesktopGroupServiceStub(channel, callOptions);
        }
      };
    return DesktopGroupServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DesktopGroupServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DesktopGroupServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DesktopGroupServiceBlockingStub>() {
        @java.lang.Override
        public DesktopGroupServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DesktopGroupServiceBlockingStub(channel, callOptions);
        }
      };
    return DesktopGroupServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DesktopGroupServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DesktopGroupServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DesktopGroupServiceFutureStub>() {
        @java.lang.Override
        public DesktopGroupServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DesktopGroupServiceFutureStub(channel, callOptions);
        }
      };
    return DesktopGroupServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing desktop group resources.
   * </pre>
   */
  public static abstract class DesktopGroupServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified desktop group resource.
     * To get the list of available desktop groups, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.GetDesktopGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.clouddesktop.v1.DesktopGroupOuterClass.DesktopGroup> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of desktop group resources.
     * </pre>
     */
    public void list(yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.ListDesktopGroupsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.ListDesktopGroupsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of desktops resources.
     * </pre>
     */
    public void listDesktops(yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.ListDesktopGroupDesktopsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.ListDesktopGroupDesktopsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListDesktopsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns list of the operations for the specified desktop group.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.ListDesktopGroupOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.ListDesktopGroupOperationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates desktop group in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.CreateDesktopGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates desktop group properties
     * </pre>
     */
    public void update(yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.UpdateDesktopGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified desktop group.
     * </pre>
     */
    public void delete(yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.DeleteDesktopGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns a list of the access bindings for the specified desktop group.
     * </pre>
     */
    public void listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.access.Access.ListAccessBindingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAccessBindingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sets access bindings for the specified desktop group.
     * </pre>
     */
    public void setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetAccessBindingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates access bindings of the specified desktop group.
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
                yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.GetDesktopGroupRequest,
                yandex.cloud.api.clouddesktop.v1.DesktopGroupOuterClass.DesktopGroup>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.ListDesktopGroupsRequest,
                yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.ListDesktopGroupsResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getListDesktopsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.ListDesktopGroupDesktopsRequest,
                yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.ListDesktopGroupDesktopsResponse>(
                  this, METHODID_LIST_DESKTOPS)))
          .addMethod(
            getListOperationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.ListDesktopGroupOperationsRequest,
                yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.ListDesktopGroupOperationsResponse>(
                  this, METHODID_LIST_OPERATIONS)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.CreateDesktopGroupRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.UpdateDesktopGroupRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.DeleteDesktopGroupRequest,
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
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing desktop group resources.
   * </pre>
   */
  public static final class DesktopGroupServiceStub extends io.grpc.stub.AbstractAsyncStub<DesktopGroupServiceStub> {
    private DesktopGroupServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DesktopGroupServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DesktopGroupServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified desktop group resource.
     * To get the list of available desktop groups, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.GetDesktopGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.clouddesktop.v1.DesktopGroupOuterClass.DesktopGroup> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of desktop group resources.
     * </pre>
     */
    public void list(yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.ListDesktopGroupsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.ListDesktopGroupsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of desktops resources.
     * </pre>
     */
    public void listDesktops(yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.ListDesktopGroupDesktopsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.ListDesktopGroupDesktopsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListDesktopsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns list of the operations for the specified desktop group.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.ListDesktopGroupOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.ListDesktopGroupOperationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates desktop group in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.CreateDesktopGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates desktop group properties
     * </pre>
     */
    public void update(yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.UpdateDesktopGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified desktop group.
     * </pre>
     */
    public void delete(yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.DeleteDesktopGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns a list of the access bindings for the specified desktop group.
     * </pre>
     */
    public void listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.access.Access.ListAccessBindingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sets access bindings for the specified desktop group.
     * </pre>
     */
    public void setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates access bindings of the specified desktop group.
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
   * A set of methods for managing desktop group resources.
   * </pre>
   */
  public static final class DesktopGroupServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<DesktopGroupServiceBlockingStub> {
    private DesktopGroupServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DesktopGroupServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DesktopGroupServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified desktop group resource.
     * To get the list of available desktop groups, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.clouddesktop.v1.DesktopGroupOuterClass.DesktopGroup get(yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.GetDesktopGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of desktop group resources.
     * </pre>
     */
    public yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.ListDesktopGroupsResponse list(yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.ListDesktopGroupsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of desktops resources.
     * </pre>
     */
    public yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.ListDesktopGroupDesktopsResponse listDesktops(yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.ListDesktopGroupDesktopsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListDesktopsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns list of the operations for the specified desktop group.
     * </pre>
     */
    public yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.ListDesktopGroupOperationsResponse listOperations(yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.ListDesktopGroupOperationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates desktop group in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.CreateDesktopGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates desktop group properties
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.UpdateDesktopGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified desktop group.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.DeleteDesktopGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns a list of the access bindings for the specified desktop group.
     * </pre>
     */
    public yandex.cloud.api.access.Access.ListAccessBindingsResponse listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAccessBindingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets access bindings for the specified desktop group.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetAccessBindingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates access bindings of the specified desktop group.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation updateAccessBindings(yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAccessBindingsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing desktop group resources.
   * </pre>
   */
  public static final class DesktopGroupServiceFutureStub extends io.grpc.stub.AbstractFutureStub<DesktopGroupServiceFutureStub> {
    private DesktopGroupServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DesktopGroupServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DesktopGroupServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified desktop group resource.
     * To get the list of available desktop groups, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.clouddesktop.v1.DesktopGroupOuterClass.DesktopGroup> get(
        yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.GetDesktopGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of desktop group resources.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.ListDesktopGroupsResponse> list(
        yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.ListDesktopGroupsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of desktops resources.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.ListDesktopGroupDesktopsResponse> listDesktops(
        yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.ListDesktopGroupDesktopsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListDesktopsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns list of the operations for the specified desktop group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.ListDesktopGroupOperationsResponse> listOperations(
        yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.ListDesktopGroupOperationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates desktop group in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.CreateDesktopGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates desktop group properties
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.UpdateDesktopGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified desktop group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.DeleteDesktopGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns a list of the access bindings for the specified desktop group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.access.Access.ListAccessBindingsResponse> listAccessBindings(
        yandex.cloud.api.access.Access.ListAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAccessBindingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sets access bindings for the specified desktop group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> setAccessBindings(
        yandex.cloud.api.access.Access.SetAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetAccessBindingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates access bindings of the specified desktop group.
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
  private static final int METHODID_LIST_DESKTOPS = 2;
  private static final int METHODID_LIST_OPERATIONS = 3;
  private static final int METHODID_CREATE = 4;
  private static final int METHODID_UPDATE = 5;
  private static final int METHODID_DELETE = 6;
  private static final int METHODID_LIST_ACCESS_BINDINGS = 7;
  private static final int METHODID_SET_ACCESS_BINDINGS = 8;
  private static final int METHODID_UPDATE_ACCESS_BINDINGS = 9;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DesktopGroupServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DesktopGroupServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.GetDesktopGroupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.clouddesktop.v1.DesktopGroupOuterClass.DesktopGroup>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.ListDesktopGroupsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.ListDesktopGroupsResponse>) responseObserver);
          break;
        case METHODID_LIST_DESKTOPS:
          serviceImpl.listDesktops((yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.ListDesktopGroupDesktopsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.ListDesktopGroupDesktopsResponse>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.ListDesktopGroupOperationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.ListDesktopGroupOperationsResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.CreateDesktopGroupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.UpdateDesktopGroupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.DeleteDesktopGroupRequest) request,
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

  private static abstract class DesktopGroupServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DesktopGroupServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.clouddesktop.v1.DesktopGroupServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DesktopGroupService");
    }
  }

  private static final class DesktopGroupServiceFileDescriptorSupplier
      extends DesktopGroupServiceBaseDescriptorSupplier {
    DesktopGroupServiceFileDescriptorSupplier() {}
  }

  private static final class DesktopGroupServiceMethodDescriptorSupplier
      extends DesktopGroupServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DesktopGroupServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DesktopGroupServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DesktopGroupServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getListDesktopsMethod())
              .addMethod(getListOperationsMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
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
