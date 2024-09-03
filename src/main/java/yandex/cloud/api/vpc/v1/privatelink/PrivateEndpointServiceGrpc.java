package yandex.cloud.api.vpc.v1.privatelink;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing PrivateEndpoint resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/vpc/v1/privatelink/private_endpoint_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PrivateEndpointServiceGrpc {

  private PrivateEndpointServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.vpc.v1.privatelink.PrivateEndpointService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.GetPrivateEndpointRequest,
      yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointOuterClass.PrivateEndpoint> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.GetPrivateEndpointRequest.class,
      responseType = yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointOuterClass.PrivateEndpoint.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.GetPrivateEndpointRequest,
      yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointOuterClass.PrivateEndpoint> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.GetPrivateEndpointRequest, yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointOuterClass.PrivateEndpoint> getGetMethod;
    if ((getGetMethod = PrivateEndpointServiceGrpc.getGetMethod) == null) {
      synchronized (PrivateEndpointServiceGrpc.class) {
        if ((getGetMethod = PrivateEndpointServiceGrpc.getGetMethod) == null) {
          PrivateEndpointServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.GetPrivateEndpointRequest, yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointOuterClass.PrivateEndpoint>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.GetPrivateEndpointRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointOuterClass.PrivateEndpoint.getDefaultInstance()))
              .setSchemaDescriptor(new PrivateEndpointServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.ListPrivateEndpointsRequest,
      yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.ListPrivateEndpointsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.ListPrivateEndpointsRequest.class,
      responseType = yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.ListPrivateEndpointsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.ListPrivateEndpointsRequest,
      yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.ListPrivateEndpointsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.ListPrivateEndpointsRequest, yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.ListPrivateEndpointsResponse> getListMethod;
    if ((getListMethod = PrivateEndpointServiceGrpc.getListMethod) == null) {
      synchronized (PrivateEndpointServiceGrpc.class) {
        if ((getListMethod = PrivateEndpointServiceGrpc.getListMethod) == null) {
          PrivateEndpointServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.ListPrivateEndpointsRequest, yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.ListPrivateEndpointsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.ListPrivateEndpointsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.ListPrivateEndpointsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PrivateEndpointServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.CreatePrivateEndpointRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.CreatePrivateEndpointRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.CreatePrivateEndpointRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.CreatePrivateEndpointRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = PrivateEndpointServiceGrpc.getCreateMethod) == null) {
      synchronized (PrivateEndpointServiceGrpc.class) {
        if ((getCreateMethod = PrivateEndpointServiceGrpc.getCreateMethod) == null) {
          PrivateEndpointServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.CreatePrivateEndpointRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.CreatePrivateEndpointRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new PrivateEndpointServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.UpdatePrivateEndpointRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.UpdatePrivateEndpointRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.UpdatePrivateEndpointRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.UpdatePrivateEndpointRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = PrivateEndpointServiceGrpc.getUpdateMethod) == null) {
      synchronized (PrivateEndpointServiceGrpc.class) {
        if ((getUpdateMethod = PrivateEndpointServiceGrpc.getUpdateMethod) == null) {
          PrivateEndpointServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.UpdatePrivateEndpointRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.UpdatePrivateEndpointRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new PrivateEndpointServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.DeletePrivateEndpointRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.DeletePrivateEndpointRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.DeletePrivateEndpointRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.DeletePrivateEndpointRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = PrivateEndpointServiceGrpc.getDeleteMethod) == null) {
      synchronized (PrivateEndpointServiceGrpc.class) {
        if ((getDeleteMethod = PrivateEndpointServiceGrpc.getDeleteMethod) == null) {
          PrivateEndpointServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.DeletePrivateEndpointRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.DeletePrivateEndpointRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new PrivateEndpointServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.ListPrivateEndpointOperationsRequest,
      yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.ListPrivateEndpointOperationsResponse> getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.ListPrivateEndpointOperationsRequest.class,
      responseType = yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.ListPrivateEndpointOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.ListPrivateEndpointOperationsRequest,
      yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.ListPrivateEndpointOperationsResponse> getListOperationsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.ListPrivateEndpointOperationsRequest, yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.ListPrivateEndpointOperationsResponse> getListOperationsMethod;
    if ((getListOperationsMethod = PrivateEndpointServiceGrpc.getListOperationsMethod) == null) {
      synchronized (PrivateEndpointServiceGrpc.class) {
        if ((getListOperationsMethod = PrivateEndpointServiceGrpc.getListOperationsMethod) == null) {
          PrivateEndpointServiceGrpc.getListOperationsMethod = getListOperationsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.ListPrivateEndpointOperationsRequest, yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.ListPrivateEndpointOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.ListPrivateEndpointOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.ListPrivateEndpointOperationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PrivateEndpointServiceMethodDescriptorSupplier("ListOperations"))
              .build();
        }
      }
    }
    return getListOperationsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PrivateEndpointServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PrivateEndpointServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PrivateEndpointServiceStub>() {
        @java.lang.Override
        public PrivateEndpointServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PrivateEndpointServiceStub(channel, callOptions);
        }
      };
    return PrivateEndpointServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PrivateEndpointServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PrivateEndpointServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PrivateEndpointServiceBlockingStub>() {
        @java.lang.Override
        public PrivateEndpointServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PrivateEndpointServiceBlockingStub(channel, callOptions);
        }
      };
    return PrivateEndpointServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PrivateEndpointServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PrivateEndpointServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PrivateEndpointServiceFutureStub>() {
        @java.lang.Override
        public PrivateEndpointServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PrivateEndpointServiceFutureStub(channel, callOptions);
        }
      };
    return PrivateEndpointServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing PrivateEndpoint resources.
   * </pre>
   */
  public static abstract class PrivateEndpointServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified Private Endpoint resource.
     * To get the list of all available PrivateEndpoint resources, make a [List]
     * request.
     * </pre>
     */
    public void get(yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.GetPrivateEndpointRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointOuterClass.PrivateEndpoint> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of PrivateEndpoint resources in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.ListPrivateEndpointsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.ListPrivateEndpointsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates an private endpoint in the specified folder and network.
     * </pre>
     */
    public void create(yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.CreatePrivateEndpointRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified private endpoint.
     * </pre>
     */
    public void update(yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.UpdatePrivateEndpointRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified private endpoint.
     * </pre>
     */
    public void delete(yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.DeletePrivateEndpointRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * List operations for the specified private endpoint.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.ListPrivateEndpointOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.ListPrivateEndpointOperationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.GetPrivateEndpointRequest,
                yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointOuterClass.PrivateEndpoint>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.ListPrivateEndpointsRequest,
                yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.ListPrivateEndpointsResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.CreatePrivateEndpointRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.UpdatePrivateEndpointRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.DeletePrivateEndpointRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListOperationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.ListPrivateEndpointOperationsRequest,
                yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.ListPrivateEndpointOperationsResponse>(
                  this, METHODID_LIST_OPERATIONS)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing PrivateEndpoint resources.
   * </pre>
   */
  public static final class PrivateEndpointServiceStub extends io.grpc.stub.AbstractAsyncStub<PrivateEndpointServiceStub> {
    private PrivateEndpointServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PrivateEndpointServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PrivateEndpointServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified Private Endpoint resource.
     * To get the list of all available PrivateEndpoint resources, make a [List]
     * request.
     * </pre>
     */
    public void get(yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.GetPrivateEndpointRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointOuterClass.PrivateEndpoint> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of PrivateEndpoint resources in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.ListPrivateEndpointsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.ListPrivateEndpointsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates an private endpoint in the specified folder and network.
     * </pre>
     */
    public void create(yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.CreatePrivateEndpointRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified private endpoint.
     * </pre>
     */
    public void update(yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.UpdatePrivateEndpointRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified private endpoint.
     * </pre>
     */
    public void delete(yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.DeletePrivateEndpointRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List operations for the specified private endpoint.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.ListPrivateEndpointOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.ListPrivateEndpointOperationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing PrivateEndpoint resources.
   * </pre>
   */
  public static final class PrivateEndpointServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<PrivateEndpointServiceBlockingStub> {
    private PrivateEndpointServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PrivateEndpointServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PrivateEndpointServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified Private Endpoint resource.
     * To get the list of all available PrivateEndpoint resources, make a [List]
     * request.
     * </pre>
     */
    public yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointOuterClass.PrivateEndpoint get(yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.GetPrivateEndpointRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of PrivateEndpoint resources in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.ListPrivateEndpointsResponse list(yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.ListPrivateEndpointsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates an private endpoint in the specified folder and network.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.CreatePrivateEndpointRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified private endpoint.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.UpdatePrivateEndpointRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified private endpoint.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.DeletePrivateEndpointRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List operations for the specified private endpoint.
     * </pre>
     */
    public yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.ListPrivateEndpointOperationsResponse listOperations(yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.ListPrivateEndpointOperationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing PrivateEndpoint resources.
   * </pre>
   */
  public static final class PrivateEndpointServiceFutureStub extends io.grpc.stub.AbstractFutureStub<PrivateEndpointServiceFutureStub> {
    private PrivateEndpointServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PrivateEndpointServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PrivateEndpointServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified Private Endpoint resource.
     * To get the list of all available PrivateEndpoint resources, make a [List]
     * request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointOuterClass.PrivateEndpoint> get(
        yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.GetPrivateEndpointRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of PrivateEndpoint resources in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.ListPrivateEndpointsResponse> list(
        yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.ListPrivateEndpointsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates an private endpoint in the specified folder and network.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.CreatePrivateEndpointRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified private endpoint.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.UpdatePrivateEndpointRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified private endpoint.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.DeletePrivateEndpointRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List operations for the specified private endpoint.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.ListPrivateEndpointOperationsResponse> listOperations(
        yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.ListPrivateEndpointOperationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_DELETE = 4;
  private static final int METHODID_LIST_OPERATIONS = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PrivateEndpointServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PrivateEndpointServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.GetPrivateEndpointRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointOuterClass.PrivateEndpoint>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.ListPrivateEndpointsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.ListPrivateEndpointsResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.CreatePrivateEndpointRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.UpdatePrivateEndpointRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.DeletePrivateEndpointRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.ListPrivateEndpointOperationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.ListPrivateEndpointOperationsResponse>) responseObserver);
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

  private static abstract class PrivateEndpointServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PrivateEndpointServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.vpc.v1.privatelink.PrivateEndpointServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PrivateEndpointService");
    }
  }

  private static final class PrivateEndpointServiceFileDescriptorSupplier
      extends PrivateEndpointServiceBaseDescriptorSupplier {
    PrivateEndpointServiceFileDescriptorSupplier() {}
  }

  private static final class PrivateEndpointServiceMethodDescriptorSupplier
      extends PrivateEndpointServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PrivateEndpointServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PrivateEndpointServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PrivateEndpointServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getListOperationsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
