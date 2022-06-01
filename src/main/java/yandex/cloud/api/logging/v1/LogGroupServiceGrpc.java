package yandex.cloud.api.logging.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing log groups.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/logging/v1/log_group_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class LogGroupServiceGrpc {

  private LogGroupServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.logging.v1.LogGroupService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetLogGroupRequest,
      yandex.cloud.api.logging.v1.LogGroupOuterClass.LogGroup> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetLogGroupRequest.class,
      responseType = yandex.cloud.api.logging.v1.LogGroupOuterClass.LogGroup.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetLogGroupRequest,
      yandex.cloud.api.logging.v1.LogGroupOuterClass.LogGroup> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetLogGroupRequest, yandex.cloud.api.logging.v1.LogGroupOuterClass.LogGroup> getGetMethod;
    if ((getGetMethod = LogGroupServiceGrpc.getGetMethod) == null) {
      synchronized (LogGroupServiceGrpc.class) {
        if ((getGetMethod = LogGroupServiceGrpc.getGetMethod) == null) {
          LogGroupServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetLogGroupRequest, yandex.cloud.api.logging.v1.LogGroupOuterClass.LogGroup>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetLogGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.logging.v1.LogGroupOuterClass.LogGroup.getDefaultInstance()))
              .setSchemaDescriptor(new LogGroupServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetLogGroupStatsRequest,
      yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetLogGroupStatsResponse> getStatsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Stats",
      requestType = yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetLogGroupStatsRequest.class,
      responseType = yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetLogGroupStatsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetLogGroupStatsRequest,
      yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetLogGroupStatsResponse> getStatsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetLogGroupStatsRequest, yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetLogGroupStatsResponse> getStatsMethod;
    if ((getStatsMethod = LogGroupServiceGrpc.getStatsMethod) == null) {
      synchronized (LogGroupServiceGrpc.class) {
        if ((getStatsMethod = LogGroupServiceGrpc.getStatsMethod) == null) {
          LogGroupServiceGrpc.getStatsMethod = getStatsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetLogGroupStatsRequest, yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetLogGroupStatsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Stats"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetLogGroupStatsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetLogGroupStatsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LogGroupServiceMethodDescriptorSupplier("Stats"))
              .build();
        }
      }
    }
    return getStatsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListLogGroupsRequest,
      yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListLogGroupsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListLogGroupsRequest.class,
      responseType = yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListLogGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListLogGroupsRequest,
      yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListLogGroupsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListLogGroupsRequest, yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListLogGroupsResponse> getListMethod;
    if ((getListMethod = LogGroupServiceGrpc.getListMethod) == null) {
      synchronized (LogGroupServiceGrpc.class) {
        if ((getListMethod = LogGroupServiceGrpc.getListMethod) == null) {
          LogGroupServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListLogGroupsRequest, yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListLogGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListLogGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListLogGroupsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LogGroupServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.CreateLogGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.CreateLogGroupRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.CreateLogGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.CreateLogGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = LogGroupServiceGrpc.getCreateMethod) == null) {
      synchronized (LogGroupServiceGrpc.class) {
        if ((getCreateMethod = LogGroupServiceGrpc.getCreateMethod) == null) {
          LogGroupServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.CreateLogGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.CreateLogGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new LogGroupServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.UpdateLogGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.UpdateLogGroupRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.UpdateLogGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.UpdateLogGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = LogGroupServiceGrpc.getUpdateMethod) == null) {
      synchronized (LogGroupServiceGrpc.class) {
        if ((getUpdateMethod = LogGroupServiceGrpc.getUpdateMethod) == null) {
          LogGroupServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.UpdateLogGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.UpdateLogGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new LogGroupServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.DeleteLogGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.DeleteLogGroupRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.DeleteLogGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.DeleteLogGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = LogGroupServiceGrpc.getDeleteMethod) == null) {
      synchronized (LogGroupServiceGrpc.class) {
        if ((getDeleteMethod = LogGroupServiceGrpc.getDeleteMethod) == null) {
          LogGroupServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.DeleteLogGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.DeleteLogGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new LogGroupServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListResourcesRequest,
      yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListResourcesResponse> getListResourcesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListResources",
      requestType = yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListResourcesRequest.class,
      responseType = yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListResourcesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListResourcesRequest,
      yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListResourcesResponse> getListResourcesMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListResourcesRequest, yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListResourcesResponse> getListResourcesMethod;
    if ((getListResourcesMethod = LogGroupServiceGrpc.getListResourcesMethod) == null) {
      synchronized (LogGroupServiceGrpc.class) {
        if ((getListResourcesMethod = LogGroupServiceGrpc.getListResourcesMethod) == null) {
          LogGroupServiceGrpc.getListResourcesMethod = getListResourcesMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListResourcesRequest, yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListResourcesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListResources"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListResourcesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListResourcesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LogGroupServiceMethodDescriptorSupplier("ListResources"))
              .build();
        }
      }
    }
    return getListResourcesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListOperationsRequest,
      yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListOperationsResponse> getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListOperationsRequest.class,
      responseType = yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListOperationsRequest,
      yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListOperationsResponse> getListOperationsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListOperationsRequest, yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListOperationsResponse> getListOperationsMethod;
    if ((getListOperationsMethod = LogGroupServiceGrpc.getListOperationsMethod) == null) {
      synchronized (LogGroupServiceGrpc.class) {
        if ((getListOperationsMethod = LogGroupServiceGrpc.getListOperationsMethod) == null) {
          LogGroupServiceGrpc.getListOperationsMethod = getListOperationsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListOperationsRequest, yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListOperationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LogGroupServiceMethodDescriptorSupplier("ListOperations"))
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
    if ((getListAccessBindingsMethod = LogGroupServiceGrpc.getListAccessBindingsMethod) == null) {
      synchronized (LogGroupServiceGrpc.class) {
        if ((getListAccessBindingsMethod = LogGroupServiceGrpc.getListAccessBindingsMethod) == null) {
          LogGroupServiceGrpc.getListAccessBindingsMethod = getListAccessBindingsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.ListAccessBindingsRequest, yandex.cloud.api.access.Access.ListAccessBindingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.ListAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.ListAccessBindingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LogGroupServiceMethodDescriptorSupplier("ListAccessBindings"))
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
    if ((getSetAccessBindingsMethod = LogGroupServiceGrpc.getSetAccessBindingsMethod) == null) {
      synchronized (LogGroupServiceGrpc.class) {
        if ((getSetAccessBindingsMethod = LogGroupServiceGrpc.getSetAccessBindingsMethod) == null) {
          LogGroupServiceGrpc.getSetAccessBindingsMethod = getSetAccessBindingsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.SetAccessBindingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.SetAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new LogGroupServiceMethodDescriptorSupplier("SetAccessBindings"))
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
    if ((getUpdateAccessBindingsMethod = LogGroupServiceGrpc.getUpdateAccessBindingsMethod) == null) {
      synchronized (LogGroupServiceGrpc.class) {
        if ((getUpdateAccessBindingsMethod = LogGroupServiceGrpc.getUpdateAccessBindingsMethod) == null) {
          LogGroupServiceGrpc.getUpdateAccessBindingsMethod = getUpdateAccessBindingsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.UpdateAccessBindingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.UpdateAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new LogGroupServiceMethodDescriptorSupplier("UpdateAccessBindings"))
              .build();
        }
      }
    }
    return getUpdateAccessBindingsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LogGroupServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LogGroupServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LogGroupServiceStub>() {
        @java.lang.Override
        public LogGroupServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LogGroupServiceStub(channel, callOptions);
        }
      };
    return LogGroupServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LogGroupServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LogGroupServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LogGroupServiceBlockingStub>() {
        @java.lang.Override
        public LogGroupServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LogGroupServiceBlockingStub(channel, callOptions);
        }
      };
    return LogGroupServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LogGroupServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LogGroupServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LogGroupServiceFutureStub>() {
        @java.lang.Override
        public LogGroupServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LogGroupServiceFutureStub(channel, callOptions);
        }
      };
    return LogGroupServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing log groups.
   * </pre>
   */
  public static abstract class LogGroupServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified log group.
     * To get the list of all available log groups, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetLogGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.logging.v1.LogGroupOuterClass.LogGroup> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns stats for the specified log group.
     * </pre>
     */
    public void stats(yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetLogGroupStatsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetLogGroupStatsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStatsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of log groups in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListLogGroupsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListLogGroupsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a log group in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.CreateLogGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified log group.
     * </pre>
     */
    public void update(yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.UpdateLogGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified log group.
     * </pre>
     */
    public void delete(yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.DeleteLogGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the resources (type and IDs) in the specified log group.
     * </pre>
     */
    public void listResources(yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListResourcesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListResourcesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListResourcesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified log group.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListOperationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists existing access bindings for the specified log group.
     * </pre>
     */
    public void listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.access.Access.ListAccessBindingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAccessBindingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sets access bindings for the specified log group.
     * </pre>
     */
    public void setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetAccessBindingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates access bindings for the specified log group.
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
                yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetLogGroupRequest,
                yandex.cloud.api.logging.v1.LogGroupOuterClass.LogGroup>(
                  this, METHODID_GET)))
          .addMethod(
            getStatsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetLogGroupStatsRequest,
                yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetLogGroupStatsResponse>(
                  this, METHODID_STATS)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListLogGroupsRequest,
                yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListLogGroupsResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.CreateLogGroupRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.UpdateLogGroupRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.DeleteLogGroupRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListResourcesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListResourcesRequest,
                yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListResourcesResponse>(
                  this, METHODID_LIST_RESOURCES)))
          .addMethod(
            getListOperationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListOperationsRequest,
                yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListOperationsResponse>(
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
   * A set of methods for managing log groups.
   * </pre>
   */
  public static final class LogGroupServiceStub extends io.grpc.stub.AbstractAsyncStub<LogGroupServiceStub> {
    private LogGroupServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LogGroupServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LogGroupServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified log group.
     * To get the list of all available log groups, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetLogGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.logging.v1.LogGroupOuterClass.LogGroup> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns stats for the specified log group.
     * </pre>
     */
    public void stats(yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetLogGroupStatsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetLogGroupStatsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStatsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of log groups in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListLogGroupsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListLogGroupsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a log group in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.CreateLogGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified log group.
     * </pre>
     */
    public void update(yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.UpdateLogGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified log group.
     * </pre>
     */
    public void delete(yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.DeleteLogGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the resources (type and IDs) in the specified log group.
     * </pre>
     */
    public void listResources(yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListResourcesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListResourcesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListResourcesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified log group.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListOperationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists existing access bindings for the specified log group.
     * </pre>
     */
    public void listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.access.Access.ListAccessBindingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sets access bindings for the specified log group.
     * </pre>
     */
    public void setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates access bindings for the specified log group.
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
   * A set of methods for managing log groups.
   * </pre>
   */
  public static final class LogGroupServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<LogGroupServiceBlockingStub> {
    private LogGroupServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LogGroupServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LogGroupServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified log group.
     * To get the list of all available log groups, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.logging.v1.LogGroupOuterClass.LogGroup get(yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetLogGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns stats for the specified log group.
     * </pre>
     */
    public yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetLogGroupStatsResponse stats(yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetLogGroupStatsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStatsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of log groups in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListLogGroupsResponse list(yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListLogGroupsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a log group in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.CreateLogGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified log group.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.UpdateLogGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified log group.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.DeleteLogGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the resources (type and IDs) in the specified log group.
     * </pre>
     */
    public yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListResourcesResponse listResources(yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListResourcesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListResourcesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists operations for the specified log group.
     * </pre>
     */
    public yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListOperationsResponse listOperations(yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListOperationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists existing access bindings for the specified log group.
     * </pre>
     */
    public yandex.cloud.api.access.Access.ListAccessBindingsResponse listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAccessBindingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets access bindings for the specified log group.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetAccessBindingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates access bindings for the specified log group.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation updateAccessBindings(yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAccessBindingsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing log groups.
   * </pre>
   */
  public static final class LogGroupServiceFutureStub extends io.grpc.stub.AbstractFutureStub<LogGroupServiceFutureStub> {
    private LogGroupServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LogGroupServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LogGroupServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified log group.
     * To get the list of all available log groups, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.logging.v1.LogGroupOuterClass.LogGroup> get(
        yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetLogGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns stats for the specified log group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetLogGroupStatsResponse> stats(
        yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetLogGroupStatsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStatsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of log groups in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListLogGroupsResponse> list(
        yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListLogGroupsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a log group in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.CreateLogGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified log group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.UpdateLogGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified log group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.DeleteLogGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the resources (type and IDs) in the specified log group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListResourcesResponse> listResources(
        yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListResourcesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListResourcesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists operations for the specified log group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListOperationsResponse> listOperations(
        yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListOperationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists existing access bindings for the specified log group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.access.Access.ListAccessBindingsResponse> listAccessBindings(
        yandex.cloud.api.access.Access.ListAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAccessBindingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sets access bindings for the specified log group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> setAccessBindings(
        yandex.cloud.api.access.Access.SetAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetAccessBindingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates access bindings for the specified log group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> updateAccessBindings(
        yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAccessBindingsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_STATS = 1;
  private static final int METHODID_LIST = 2;
  private static final int METHODID_CREATE = 3;
  private static final int METHODID_UPDATE = 4;
  private static final int METHODID_DELETE = 5;
  private static final int METHODID_LIST_RESOURCES = 6;
  private static final int METHODID_LIST_OPERATIONS = 7;
  private static final int METHODID_LIST_ACCESS_BINDINGS = 8;
  private static final int METHODID_SET_ACCESS_BINDINGS = 9;
  private static final int METHODID_UPDATE_ACCESS_BINDINGS = 10;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LogGroupServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LogGroupServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetLogGroupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.logging.v1.LogGroupOuterClass.LogGroup>) responseObserver);
          break;
        case METHODID_STATS:
          serviceImpl.stats((yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetLogGroupStatsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.GetLogGroupStatsResponse>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListLogGroupsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListLogGroupsResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.CreateLogGroupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.UpdateLogGroupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.DeleteLogGroupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_RESOURCES:
          serviceImpl.listResources((yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListResourcesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListResourcesResponse>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListOperationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.ListOperationsResponse>) responseObserver);
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

  private static abstract class LogGroupServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LogGroupServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.logging.v1.LogGroupServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LogGroupService");
    }
  }

  private static final class LogGroupServiceFileDescriptorSupplier
      extends LogGroupServiceBaseDescriptorSupplier {
    LogGroupServiceFileDescriptorSupplier() {}
  }

  private static final class LogGroupServiceMethodDescriptorSupplier
      extends LogGroupServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LogGroupServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (LogGroupServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LogGroupServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getStatsMethod())
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getListResourcesMethod())
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
