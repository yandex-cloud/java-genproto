package yandex.cloud.api.serverless.mcpgateway.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing MCP Gateway resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/serverless/mcpgateway/v1/mcp_gateway_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class McpGatewayServiceGrpc {

  private McpGatewayServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.serverless.mcpgateway.v1.McpGatewayService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.GetMcpGatewayRequest,
      yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayOuterClass.McpGateway> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.GetMcpGatewayRequest.class,
      responseType = yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayOuterClass.McpGateway.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.GetMcpGatewayRequest,
      yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayOuterClass.McpGateway> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.GetMcpGatewayRequest, yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayOuterClass.McpGateway> getGetMethod;
    if ((getGetMethod = McpGatewayServiceGrpc.getGetMethod) == null) {
      synchronized (McpGatewayServiceGrpc.class) {
        if ((getGetMethod = McpGatewayServiceGrpc.getGetMethod) == null) {
          McpGatewayServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.GetMcpGatewayRequest, yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayOuterClass.McpGateway>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.GetMcpGatewayRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayOuterClass.McpGateway.getDefaultInstance()))
              .setSchemaDescriptor(new McpGatewayServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.ListMcpGatewayRequest,
      yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.ListMcpGatewayResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.ListMcpGatewayRequest.class,
      responseType = yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.ListMcpGatewayResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.ListMcpGatewayRequest,
      yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.ListMcpGatewayResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.ListMcpGatewayRequest, yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.ListMcpGatewayResponse> getListMethod;
    if ((getListMethod = McpGatewayServiceGrpc.getListMethod) == null) {
      synchronized (McpGatewayServiceGrpc.class) {
        if ((getListMethod = McpGatewayServiceGrpc.getListMethod) == null) {
          McpGatewayServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.ListMcpGatewayRequest, yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.ListMcpGatewayResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.ListMcpGatewayRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.ListMcpGatewayResponse.getDefaultInstance()))
              .setSchemaDescriptor(new McpGatewayServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.CreateMcpGatewayRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.CreateMcpGatewayRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.CreateMcpGatewayRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.CreateMcpGatewayRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = McpGatewayServiceGrpc.getCreateMethod) == null) {
      synchronized (McpGatewayServiceGrpc.class) {
        if ((getCreateMethod = McpGatewayServiceGrpc.getCreateMethod) == null) {
          McpGatewayServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.CreateMcpGatewayRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.CreateMcpGatewayRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new McpGatewayServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.UpdateMcpGatewayRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.UpdateMcpGatewayRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.UpdateMcpGatewayRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.UpdateMcpGatewayRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = McpGatewayServiceGrpc.getUpdateMethod) == null) {
      synchronized (McpGatewayServiceGrpc.class) {
        if ((getUpdateMethod = McpGatewayServiceGrpc.getUpdateMethod) == null) {
          McpGatewayServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.UpdateMcpGatewayRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.UpdateMcpGatewayRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new McpGatewayServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.DeleteMcpGatewayRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.DeleteMcpGatewayRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.DeleteMcpGatewayRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.DeleteMcpGatewayRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = McpGatewayServiceGrpc.getDeleteMethod) == null) {
      synchronized (McpGatewayServiceGrpc.class) {
        if ((getDeleteMethod = McpGatewayServiceGrpc.getDeleteMethod) == null) {
          McpGatewayServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.DeleteMcpGatewayRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.DeleteMcpGatewayRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new McpGatewayServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.ListOperationsRequest,
      yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.ListOperationsResponse> getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.ListOperationsRequest.class,
      responseType = yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.ListOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.ListOperationsRequest,
      yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.ListOperationsResponse> getListOperationsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.ListOperationsRequest, yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.ListOperationsResponse> getListOperationsMethod;
    if ((getListOperationsMethod = McpGatewayServiceGrpc.getListOperationsMethod) == null) {
      synchronized (McpGatewayServiceGrpc.class) {
        if ((getListOperationsMethod = McpGatewayServiceGrpc.getListOperationsMethod) == null) {
          McpGatewayServiceGrpc.getListOperationsMethod = getListOperationsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.ListOperationsRequest, yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.ListOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.ListOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.ListOperationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new McpGatewayServiceMethodDescriptorSupplier("ListOperations"))
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
    if ((getListAccessBindingsMethod = McpGatewayServiceGrpc.getListAccessBindingsMethod) == null) {
      synchronized (McpGatewayServiceGrpc.class) {
        if ((getListAccessBindingsMethod = McpGatewayServiceGrpc.getListAccessBindingsMethod) == null) {
          McpGatewayServiceGrpc.getListAccessBindingsMethod = getListAccessBindingsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.ListAccessBindingsRequest, yandex.cloud.api.access.Access.ListAccessBindingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.ListAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.ListAccessBindingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new McpGatewayServiceMethodDescriptorSupplier("ListAccessBindings"))
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
    if ((getSetAccessBindingsMethod = McpGatewayServiceGrpc.getSetAccessBindingsMethod) == null) {
      synchronized (McpGatewayServiceGrpc.class) {
        if ((getSetAccessBindingsMethod = McpGatewayServiceGrpc.getSetAccessBindingsMethod) == null) {
          McpGatewayServiceGrpc.getSetAccessBindingsMethod = getSetAccessBindingsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.SetAccessBindingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.SetAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new McpGatewayServiceMethodDescriptorSupplier("SetAccessBindings"))
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
    if ((getUpdateAccessBindingsMethod = McpGatewayServiceGrpc.getUpdateAccessBindingsMethod) == null) {
      synchronized (McpGatewayServiceGrpc.class) {
        if ((getUpdateAccessBindingsMethod = McpGatewayServiceGrpc.getUpdateAccessBindingsMethod) == null) {
          McpGatewayServiceGrpc.getUpdateAccessBindingsMethod = getUpdateAccessBindingsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.UpdateAccessBindingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.UpdateAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new McpGatewayServiceMethodDescriptorSupplier("UpdateAccessBindings"))
              .build();
        }
      }
    }
    return getUpdateAccessBindingsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static McpGatewayServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<McpGatewayServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<McpGatewayServiceStub>() {
        @java.lang.Override
        public McpGatewayServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new McpGatewayServiceStub(channel, callOptions);
        }
      };
    return McpGatewayServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static McpGatewayServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<McpGatewayServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<McpGatewayServiceBlockingStub>() {
        @java.lang.Override
        public McpGatewayServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new McpGatewayServiceBlockingStub(channel, callOptions);
        }
      };
    return McpGatewayServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static McpGatewayServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<McpGatewayServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<McpGatewayServiceFutureStub>() {
        @java.lang.Override
        public McpGatewayServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new McpGatewayServiceFutureStub(channel, callOptions);
        }
      };
    return McpGatewayServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing MCP Gateway resources.
   * </pre>
   */
  public static abstract class McpGatewayServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Retrieves the specified MCP Gateway.
     * </pre>
     */
    public void get(yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.GetMcpGatewayRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayOuterClass.McpGateway> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of MCP Gateways in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.ListMcpGatewayRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.ListMcpGatewayResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates an MCP Gateway in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.CreateMcpGatewayRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified MCP Gateway.
     * </pre>
     */
    public void update(yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.UpdateMcpGatewayRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified MCP Gateway.
     * </pre>
     */
    public void delete(yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.DeleteMcpGatewayRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified MCP Gateway.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.ListOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.ListOperationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists access bindings for the specified MCP Gateway.
     * </pre>
     */
    public void listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.access.Access.ListAccessBindingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAccessBindingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sets access bindings for the specified MCP Gateway.
     * </pre>
     */
    public void setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetAccessBindingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates access bindings for the specified MCP Gateway.
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
                yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.GetMcpGatewayRequest,
                yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayOuterClass.McpGateway>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.ListMcpGatewayRequest,
                yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.ListMcpGatewayResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.CreateMcpGatewayRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.UpdateMcpGatewayRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.DeleteMcpGatewayRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListOperationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.ListOperationsRequest,
                yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.ListOperationsResponse>(
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
   * A set of methods for managing MCP Gateway resources.
   * </pre>
   */
  public static final class McpGatewayServiceStub extends io.grpc.stub.AbstractAsyncStub<McpGatewayServiceStub> {
    private McpGatewayServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected McpGatewayServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new McpGatewayServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves the specified MCP Gateway.
     * </pre>
     */
    public void get(yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.GetMcpGatewayRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayOuterClass.McpGateway> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of MCP Gateways in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.ListMcpGatewayRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.ListMcpGatewayResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates an MCP Gateway in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.CreateMcpGatewayRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified MCP Gateway.
     * </pre>
     */
    public void update(yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.UpdateMcpGatewayRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified MCP Gateway.
     * </pre>
     */
    public void delete(yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.DeleteMcpGatewayRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified MCP Gateway.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.ListOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.ListOperationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists access bindings for the specified MCP Gateway.
     * </pre>
     */
    public void listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.access.Access.ListAccessBindingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sets access bindings for the specified MCP Gateway.
     * </pre>
     */
    public void setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates access bindings for the specified MCP Gateway.
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
   * A set of methods for managing MCP Gateway resources.
   * </pre>
   */
  public static final class McpGatewayServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<McpGatewayServiceBlockingStub> {
    private McpGatewayServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected McpGatewayServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new McpGatewayServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves the specified MCP Gateway.
     * </pre>
     */
    public yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayOuterClass.McpGateway get(yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.GetMcpGatewayRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of MCP Gateways in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.ListMcpGatewayResponse list(yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.ListMcpGatewayRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates an MCP Gateway in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.CreateMcpGatewayRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified MCP Gateway.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.UpdateMcpGatewayRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified MCP Gateway.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.DeleteMcpGatewayRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists operations for the specified MCP Gateway.
     * </pre>
     */
    public yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.ListOperationsResponse listOperations(yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.ListOperationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists access bindings for the specified MCP Gateway.
     * </pre>
     */
    public yandex.cloud.api.access.Access.ListAccessBindingsResponse listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAccessBindingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets access bindings for the specified MCP Gateway.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetAccessBindingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates access bindings for the specified MCP Gateway.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation updateAccessBindings(yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAccessBindingsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing MCP Gateway resources.
   * </pre>
   */
  public static final class McpGatewayServiceFutureStub extends io.grpc.stub.AbstractFutureStub<McpGatewayServiceFutureStub> {
    private McpGatewayServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected McpGatewayServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new McpGatewayServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves the specified MCP Gateway.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayOuterClass.McpGateway> get(
        yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.GetMcpGatewayRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of MCP Gateways in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.ListMcpGatewayResponse> list(
        yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.ListMcpGatewayRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates an MCP Gateway in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.CreateMcpGatewayRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified MCP Gateway.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.UpdateMcpGatewayRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified MCP Gateway.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.DeleteMcpGatewayRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists operations for the specified MCP Gateway.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.ListOperationsResponse> listOperations(
        yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.ListOperationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists access bindings for the specified MCP Gateway.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.access.Access.ListAccessBindingsResponse> listAccessBindings(
        yandex.cloud.api.access.Access.ListAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAccessBindingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sets access bindings for the specified MCP Gateway.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> setAccessBindings(
        yandex.cloud.api.access.Access.SetAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetAccessBindingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates access bindings for the specified MCP Gateway.
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
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_DELETE = 4;
  private static final int METHODID_LIST_OPERATIONS = 5;
  private static final int METHODID_LIST_ACCESS_BINDINGS = 6;
  private static final int METHODID_SET_ACCESS_BINDINGS = 7;
  private static final int METHODID_UPDATE_ACCESS_BINDINGS = 8;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final McpGatewayServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(McpGatewayServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.GetMcpGatewayRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayOuterClass.McpGateway>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.ListMcpGatewayRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.ListMcpGatewayResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.CreateMcpGatewayRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.UpdateMcpGatewayRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.DeleteMcpGatewayRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.ListOperationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.ListOperationsResponse>) responseObserver);
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

  private static abstract class McpGatewayServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    McpGatewayServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.serverless.mcpgateway.v1.McpGatewayServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("McpGatewayService");
    }
  }

  private static final class McpGatewayServiceFileDescriptorSupplier
      extends McpGatewayServiceBaseDescriptorSupplier {
    McpGatewayServiceFileDescriptorSupplier() {}
  }

  private static final class McpGatewayServiceMethodDescriptorSupplier
      extends McpGatewayServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    McpGatewayServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (McpGatewayServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new McpGatewayServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
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
