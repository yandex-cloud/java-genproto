package yandex.cloud.api.vpc.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/vpc/v1/gateway_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class GatewayServiceGrpc {

  private GatewayServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.vpc.v1.GatewayService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.GetGatewayRequest,
      yandex.cloud.api.vpc.v1.GatewayOuterClass.Gateway> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.GetGatewayRequest.class,
      responseType = yandex.cloud.api.vpc.v1.GatewayOuterClass.Gateway.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.GetGatewayRequest,
      yandex.cloud.api.vpc.v1.GatewayOuterClass.Gateway> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.GetGatewayRequest, yandex.cloud.api.vpc.v1.GatewayOuterClass.Gateway> getGetMethod;
    if ((getGetMethod = GatewayServiceGrpc.getGetMethod) == null) {
      synchronized (GatewayServiceGrpc.class) {
        if ((getGetMethod = GatewayServiceGrpc.getGetMethod) == null) {
          GatewayServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.GetGatewayRequest, yandex.cloud.api.vpc.v1.GatewayOuterClass.Gateway>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.GetGatewayRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.GatewayOuterClass.Gateway.getDefaultInstance()))
              .setSchemaDescriptor(new GatewayServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.ListGatewaysRequest,
      yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.ListGatewaysResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.ListGatewaysRequest.class,
      responseType = yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.ListGatewaysResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.ListGatewaysRequest,
      yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.ListGatewaysResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.ListGatewaysRequest, yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.ListGatewaysResponse> getListMethod;
    if ((getListMethod = GatewayServiceGrpc.getListMethod) == null) {
      synchronized (GatewayServiceGrpc.class) {
        if ((getListMethod = GatewayServiceGrpc.getListMethod) == null) {
          GatewayServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.ListGatewaysRequest, yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.ListGatewaysResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.ListGatewaysRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.ListGatewaysResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GatewayServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.CreateGatewayRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.CreateGatewayRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.CreateGatewayRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.CreateGatewayRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = GatewayServiceGrpc.getCreateMethod) == null) {
      synchronized (GatewayServiceGrpc.class) {
        if ((getCreateMethod = GatewayServiceGrpc.getCreateMethod) == null) {
          GatewayServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.CreateGatewayRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.CreateGatewayRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new GatewayServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.UpdateGatewayRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.UpdateGatewayRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.UpdateGatewayRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.UpdateGatewayRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = GatewayServiceGrpc.getUpdateMethod) == null) {
      synchronized (GatewayServiceGrpc.class) {
        if ((getUpdateMethod = GatewayServiceGrpc.getUpdateMethod) == null) {
          GatewayServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.UpdateGatewayRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.UpdateGatewayRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new GatewayServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.DeleteGatewayRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.DeleteGatewayRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.DeleteGatewayRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.DeleteGatewayRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = GatewayServiceGrpc.getDeleteMethod) == null) {
      synchronized (GatewayServiceGrpc.class) {
        if ((getDeleteMethod = GatewayServiceGrpc.getDeleteMethod) == null) {
          GatewayServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.DeleteGatewayRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.DeleteGatewayRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new GatewayServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.ListGatewayOperationsRequest,
      yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.ListGatewayOperationsResponse> getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.ListGatewayOperationsRequest.class,
      responseType = yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.ListGatewayOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.ListGatewayOperationsRequest,
      yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.ListGatewayOperationsResponse> getListOperationsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.ListGatewayOperationsRequest, yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.ListGatewayOperationsResponse> getListOperationsMethod;
    if ((getListOperationsMethod = GatewayServiceGrpc.getListOperationsMethod) == null) {
      synchronized (GatewayServiceGrpc.class) {
        if ((getListOperationsMethod = GatewayServiceGrpc.getListOperationsMethod) == null) {
          GatewayServiceGrpc.getListOperationsMethod = getListOperationsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.ListGatewayOperationsRequest, yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.ListGatewayOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.ListGatewayOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.ListGatewayOperationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GatewayServiceMethodDescriptorSupplier("ListOperations"))
              .build();
        }
      }
    }
    return getListOperationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.MoveGatewayRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getMoveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Move",
      requestType = yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.MoveGatewayRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.MoveGatewayRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getMoveMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.MoveGatewayRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getMoveMethod;
    if ((getMoveMethod = GatewayServiceGrpc.getMoveMethod) == null) {
      synchronized (GatewayServiceGrpc.class) {
        if ((getMoveMethod = GatewayServiceGrpc.getMoveMethod) == null) {
          GatewayServiceGrpc.getMoveMethod = getMoveMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.MoveGatewayRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Move"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.MoveGatewayRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new GatewayServiceMethodDescriptorSupplier("Move"))
              .build();
        }
      }
    }
    return getMoveMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GatewayServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GatewayServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GatewayServiceStub>() {
        @java.lang.Override
        public GatewayServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GatewayServiceStub(channel, callOptions);
        }
      };
    return GatewayServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GatewayServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GatewayServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GatewayServiceBlockingStub>() {
        @java.lang.Override
        public GatewayServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GatewayServiceBlockingStub(channel, callOptions);
        }
      };
    return GatewayServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GatewayServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GatewayServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GatewayServiceFutureStub>() {
        @java.lang.Override
        public GatewayServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GatewayServiceFutureStub(channel, callOptions);
        }
      };
    return GatewayServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class GatewayServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified Gateway resource.
     * To get the list of all available Gateway resources, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.GetGatewayRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.GatewayOuterClass.Gateway> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of Gateway resources in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.ListGatewaysRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.ListGatewaysResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a gateway in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.CreateGatewayRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified gateway.
     * </pre>
     */
    public void update(yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.UpdateGatewayRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified gateway.
     * </pre>
     */
    public void delete(yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.DeleteGatewayRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * List operations for the specified gateway.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.ListGatewayOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.ListGatewayOperationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Move a gateway to another folder
     * </pre>
     */
    public void move(yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.MoveGatewayRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMoveMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.GetGatewayRequest,
                yandex.cloud.api.vpc.v1.GatewayOuterClass.Gateway>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.ListGatewaysRequest,
                yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.ListGatewaysResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.CreateGatewayRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.UpdateGatewayRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.DeleteGatewayRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListOperationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.ListGatewayOperationsRequest,
                yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.ListGatewayOperationsResponse>(
                  this, METHODID_LIST_OPERATIONS)))
          .addMethod(
            getMoveMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.MoveGatewayRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_MOVE)))
          .build();
    }
  }

  /**
   */
  public static final class GatewayServiceStub extends io.grpc.stub.AbstractAsyncStub<GatewayServiceStub> {
    private GatewayServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GatewayServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GatewayServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified Gateway resource.
     * To get the list of all available Gateway resources, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.GetGatewayRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.GatewayOuterClass.Gateway> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of Gateway resources in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.ListGatewaysRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.ListGatewaysResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a gateway in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.CreateGatewayRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified gateway.
     * </pre>
     */
    public void update(yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.UpdateGatewayRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified gateway.
     * </pre>
     */
    public void delete(yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.DeleteGatewayRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List operations for the specified gateway.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.ListGatewayOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.ListGatewayOperationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Move a gateway to another folder
     * </pre>
     */
    public void move(yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.MoveGatewayRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMoveMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GatewayServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<GatewayServiceBlockingStub> {
    private GatewayServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GatewayServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GatewayServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified Gateway resource.
     * To get the list of all available Gateway resources, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.vpc.v1.GatewayOuterClass.Gateway get(yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.GetGatewayRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of Gateway resources in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.ListGatewaysResponse list(yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.ListGatewaysRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a gateway in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.CreateGatewayRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified gateway.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.UpdateGatewayRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified gateway.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.DeleteGatewayRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List operations for the specified gateway.
     * </pre>
     */
    public yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.ListGatewayOperationsResponse listOperations(yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.ListGatewayOperationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Move a gateway to another folder
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation move(yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.MoveGatewayRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMoveMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GatewayServiceFutureStub extends io.grpc.stub.AbstractFutureStub<GatewayServiceFutureStub> {
    private GatewayServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GatewayServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GatewayServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified Gateway resource.
     * To get the list of all available Gateway resources, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.vpc.v1.GatewayOuterClass.Gateway> get(
        yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.GetGatewayRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of Gateway resources in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.ListGatewaysResponse> list(
        yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.ListGatewaysRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a gateway in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.CreateGatewayRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified gateway.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.UpdateGatewayRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified gateway.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.DeleteGatewayRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List operations for the specified gateway.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.ListGatewayOperationsResponse> listOperations(
        yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.ListGatewayOperationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Move a gateway to another folder
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> move(
        yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.MoveGatewayRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMoveMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_DELETE = 4;
  private static final int METHODID_LIST_OPERATIONS = 5;
  private static final int METHODID_MOVE = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GatewayServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GatewayServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.GetGatewayRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.GatewayOuterClass.Gateway>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.ListGatewaysRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.ListGatewaysResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.CreateGatewayRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.UpdateGatewayRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.DeleteGatewayRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.ListGatewayOperationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.ListGatewayOperationsResponse>) responseObserver);
          break;
        case METHODID_MOVE:
          serviceImpl.move((yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.MoveGatewayRequest) request,
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

  private static abstract class GatewayServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GatewayServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.vpc.v1.GatewayServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GatewayService");
    }
  }

  private static final class GatewayServiceFileDescriptorSupplier
      extends GatewayServiceBaseDescriptorSupplier {
    GatewayServiceFileDescriptorSupplier() {}
  }

  private static final class GatewayServiceMethodDescriptorSupplier
      extends GatewayServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GatewayServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (GatewayServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GatewayServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getListOperationsMethod())
              .addMethod(getMoveMethod())
              .build();
        }
      }
    }
    return result;
  }
}
