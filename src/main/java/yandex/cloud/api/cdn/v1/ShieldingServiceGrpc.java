package yandex.cloud.api.cdn.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Shielding management service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/cdn/v1/shielding_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ShieldingServiceGrpc {

  private ShieldingServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.cdn.v1.ShieldingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.ShieldingServiceOuterClass.ActivateShieldingRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getActivateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Activate",
      requestType = yandex.cloud.api.cdn.v1.ShieldingServiceOuterClass.ActivateShieldingRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.ShieldingServiceOuterClass.ActivateShieldingRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getActivateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.ShieldingServiceOuterClass.ActivateShieldingRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getActivateMethod;
    if ((getActivateMethod = ShieldingServiceGrpc.getActivateMethod) == null) {
      synchronized (ShieldingServiceGrpc.class) {
        if ((getActivateMethod = ShieldingServiceGrpc.getActivateMethod) == null) {
          ShieldingServiceGrpc.getActivateMethod = getActivateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cdn.v1.ShieldingServiceOuterClass.ActivateShieldingRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Activate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cdn.v1.ShieldingServiceOuterClass.ActivateShieldingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ShieldingServiceMethodDescriptorSupplier("Activate"))
              .build();
        }
      }
    }
    return getActivateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.ShieldingServiceOuterClass.DeactivateShieldingRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeactivateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Deactivate",
      requestType = yandex.cloud.api.cdn.v1.ShieldingServiceOuterClass.DeactivateShieldingRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.ShieldingServiceOuterClass.DeactivateShieldingRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeactivateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.ShieldingServiceOuterClass.DeactivateShieldingRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeactivateMethod;
    if ((getDeactivateMethod = ShieldingServiceGrpc.getDeactivateMethod) == null) {
      synchronized (ShieldingServiceGrpc.class) {
        if ((getDeactivateMethod = ShieldingServiceGrpc.getDeactivateMethod) == null) {
          ShieldingServiceGrpc.getDeactivateMethod = getDeactivateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cdn.v1.ShieldingServiceOuterClass.DeactivateShieldingRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Deactivate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cdn.v1.ShieldingServiceOuterClass.DeactivateShieldingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ShieldingServiceMethodDescriptorSupplier("Deactivate"))
              .build();
        }
      }
    }
    return getDeactivateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.ShieldingServiceOuterClass.GetShieldingDetailsRequest,
      yandex.cloud.api.cdn.v1.Shielding.ShieldingDetails> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.cdn.v1.ShieldingServiceOuterClass.GetShieldingDetailsRequest.class,
      responseType = yandex.cloud.api.cdn.v1.Shielding.ShieldingDetails.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.ShieldingServiceOuterClass.GetShieldingDetailsRequest,
      yandex.cloud.api.cdn.v1.Shielding.ShieldingDetails> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.ShieldingServiceOuterClass.GetShieldingDetailsRequest, yandex.cloud.api.cdn.v1.Shielding.ShieldingDetails> getGetMethod;
    if ((getGetMethod = ShieldingServiceGrpc.getGetMethod) == null) {
      synchronized (ShieldingServiceGrpc.class) {
        if ((getGetMethod = ShieldingServiceGrpc.getGetMethod) == null) {
          ShieldingServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cdn.v1.ShieldingServiceOuterClass.GetShieldingDetailsRequest, yandex.cloud.api.cdn.v1.Shielding.ShieldingDetails>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cdn.v1.ShieldingServiceOuterClass.GetShieldingDetailsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cdn.v1.Shielding.ShieldingDetails.getDefaultInstance()))
              .setSchemaDescriptor(new ShieldingServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.ShieldingServiceOuterClass.UpdateShieldingRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.cdn.v1.ShieldingServiceOuterClass.UpdateShieldingRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.ShieldingServiceOuterClass.UpdateShieldingRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.ShieldingServiceOuterClass.UpdateShieldingRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = ShieldingServiceGrpc.getUpdateMethod) == null) {
      synchronized (ShieldingServiceGrpc.class) {
        if ((getUpdateMethod = ShieldingServiceGrpc.getUpdateMethod) == null) {
          ShieldingServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cdn.v1.ShieldingServiceOuterClass.UpdateShieldingRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cdn.v1.ShieldingServiceOuterClass.UpdateShieldingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ShieldingServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.ShieldingServiceOuterClass.ListShieldingLocationsRequest,
      yandex.cloud.api.cdn.v1.ShieldingServiceOuterClass.ListShieldingLocationsResponse> getListAvailableLocationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAvailableLocations",
      requestType = yandex.cloud.api.cdn.v1.ShieldingServiceOuterClass.ListShieldingLocationsRequest.class,
      responseType = yandex.cloud.api.cdn.v1.ShieldingServiceOuterClass.ListShieldingLocationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.ShieldingServiceOuterClass.ListShieldingLocationsRequest,
      yandex.cloud.api.cdn.v1.ShieldingServiceOuterClass.ListShieldingLocationsResponse> getListAvailableLocationsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.ShieldingServiceOuterClass.ListShieldingLocationsRequest, yandex.cloud.api.cdn.v1.ShieldingServiceOuterClass.ListShieldingLocationsResponse> getListAvailableLocationsMethod;
    if ((getListAvailableLocationsMethod = ShieldingServiceGrpc.getListAvailableLocationsMethod) == null) {
      synchronized (ShieldingServiceGrpc.class) {
        if ((getListAvailableLocationsMethod = ShieldingServiceGrpc.getListAvailableLocationsMethod) == null) {
          ShieldingServiceGrpc.getListAvailableLocationsMethod = getListAvailableLocationsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cdn.v1.ShieldingServiceOuterClass.ListShieldingLocationsRequest, yandex.cloud.api.cdn.v1.ShieldingServiceOuterClass.ListShieldingLocationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAvailableLocations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cdn.v1.ShieldingServiceOuterClass.ListShieldingLocationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cdn.v1.ShieldingServiceOuterClass.ListShieldingLocationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ShieldingServiceMethodDescriptorSupplier("ListAvailableLocations"))
              .build();
        }
      }
    }
    return getListAvailableLocationsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ShieldingServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ShieldingServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ShieldingServiceStub>() {
        @java.lang.Override
        public ShieldingServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ShieldingServiceStub(channel, callOptions);
        }
      };
    return ShieldingServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ShieldingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ShieldingServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ShieldingServiceBlockingStub>() {
        @java.lang.Override
        public ShieldingServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ShieldingServiceBlockingStub(channel, callOptions);
        }
      };
    return ShieldingServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ShieldingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ShieldingServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ShieldingServiceFutureStub>() {
        @java.lang.Override
        public ShieldingServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ShieldingServiceFutureStub(channel, callOptions);
        }
      };
    return ShieldingServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Shielding management service.
   * </pre>
   */
  public static abstract class ShieldingServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Activate shielding for a resource.
     * </pre>
     */
    public void activate(yandex.cloud.api.cdn.v1.ShieldingServiceOuterClass.ActivateShieldingRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getActivateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deactivate shielding for a resource.
     * </pre>
     */
    public void deactivate(yandex.cloud.api.cdn.v1.ShieldingServiceOuterClass.DeactivateShieldingRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeactivateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get shielding details by resource ID.
     * </pre>
     */
    public void get(yandex.cloud.api.cdn.v1.ShieldingServiceOuterClass.GetShieldingDetailsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cdn.v1.Shielding.ShieldingDetails> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates shielding parameters for a resource, such as changing the geographical location of the shielding server.
     * Changes may take up to 15 minutes to propagate across CDN servers.
     * After updating, it is recommended to purge the resource's cache.
     * </pre>
     */
    public void update(yandex.cloud.api.cdn.v1.ShieldingServiceOuterClass.UpdateShieldingRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists available geographical locations.
     * </pre>
     */
    public void listAvailableLocations(yandex.cloud.api.cdn.v1.ShieldingServiceOuterClass.ListShieldingLocationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cdn.v1.ShieldingServiceOuterClass.ListShieldingLocationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAvailableLocationsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getActivateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cdn.v1.ShieldingServiceOuterClass.ActivateShieldingRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_ACTIVATE)))
          .addMethod(
            getDeactivateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cdn.v1.ShieldingServiceOuterClass.DeactivateShieldingRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DEACTIVATE)))
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cdn.v1.ShieldingServiceOuterClass.GetShieldingDetailsRequest,
                yandex.cloud.api.cdn.v1.Shielding.ShieldingDetails>(
                  this, METHODID_GET)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cdn.v1.ShieldingServiceOuterClass.UpdateShieldingRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getListAvailableLocationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cdn.v1.ShieldingServiceOuterClass.ListShieldingLocationsRequest,
                yandex.cloud.api.cdn.v1.ShieldingServiceOuterClass.ListShieldingLocationsResponse>(
                  this, METHODID_LIST_AVAILABLE_LOCATIONS)))
          .build();
    }
  }

  /**
   * <pre>
   * Shielding management service.
   * </pre>
   */
  public static final class ShieldingServiceStub extends io.grpc.stub.AbstractAsyncStub<ShieldingServiceStub> {
    private ShieldingServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ShieldingServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ShieldingServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Activate shielding for a resource.
     * </pre>
     */
    public void activate(yandex.cloud.api.cdn.v1.ShieldingServiceOuterClass.ActivateShieldingRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getActivateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deactivate shielding for a resource.
     * </pre>
     */
    public void deactivate(yandex.cloud.api.cdn.v1.ShieldingServiceOuterClass.DeactivateShieldingRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeactivateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get shielding details by resource ID.
     * </pre>
     */
    public void get(yandex.cloud.api.cdn.v1.ShieldingServiceOuterClass.GetShieldingDetailsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cdn.v1.Shielding.ShieldingDetails> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates shielding parameters for a resource, such as changing the geographical location of the shielding server.
     * Changes may take up to 15 minutes to propagate across CDN servers.
     * After updating, it is recommended to purge the resource's cache.
     * </pre>
     */
    public void update(yandex.cloud.api.cdn.v1.ShieldingServiceOuterClass.UpdateShieldingRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists available geographical locations.
     * </pre>
     */
    public void listAvailableLocations(yandex.cloud.api.cdn.v1.ShieldingServiceOuterClass.ListShieldingLocationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cdn.v1.ShieldingServiceOuterClass.ListShieldingLocationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAvailableLocationsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Shielding management service.
   * </pre>
   */
  public static final class ShieldingServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ShieldingServiceBlockingStub> {
    private ShieldingServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ShieldingServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ShieldingServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Activate shielding for a resource.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation activate(yandex.cloud.api.cdn.v1.ShieldingServiceOuterClass.ActivateShieldingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getActivateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deactivate shielding for a resource.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation deactivate(yandex.cloud.api.cdn.v1.ShieldingServiceOuterClass.DeactivateShieldingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeactivateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get shielding details by resource ID.
     * </pre>
     */
    public yandex.cloud.api.cdn.v1.Shielding.ShieldingDetails get(yandex.cloud.api.cdn.v1.ShieldingServiceOuterClass.GetShieldingDetailsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates shielding parameters for a resource, such as changing the geographical location of the shielding server.
     * Changes may take up to 15 minutes to propagate across CDN servers.
     * After updating, it is recommended to purge the resource's cache.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.cdn.v1.ShieldingServiceOuterClass.UpdateShieldingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists available geographical locations.
     * </pre>
     */
    public yandex.cloud.api.cdn.v1.ShieldingServiceOuterClass.ListShieldingLocationsResponse listAvailableLocations(yandex.cloud.api.cdn.v1.ShieldingServiceOuterClass.ListShieldingLocationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAvailableLocationsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Shielding management service.
   * </pre>
   */
  public static final class ShieldingServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ShieldingServiceFutureStub> {
    private ShieldingServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ShieldingServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ShieldingServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Activate shielding for a resource.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> activate(
        yandex.cloud.api.cdn.v1.ShieldingServiceOuterClass.ActivateShieldingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getActivateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deactivate shielding for a resource.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> deactivate(
        yandex.cloud.api.cdn.v1.ShieldingServiceOuterClass.DeactivateShieldingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeactivateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get shielding details by resource ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.cdn.v1.Shielding.ShieldingDetails> get(
        yandex.cloud.api.cdn.v1.ShieldingServiceOuterClass.GetShieldingDetailsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates shielding parameters for a resource, such as changing the geographical location of the shielding server.
     * Changes may take up to 15 minutes to propagate across CDN servers.
     * After updating, it is recommended to purge the resource's cache.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.cdn.v1.ShieldingServiceOuterClass.UpdateShieldingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists available geographical locations.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.cdn.v1.ShieldingServiceOuterClass.ListShieldingLocationsResponse> listAvailableLocations(
        yandex.cloud.api.cdn.v1.ShieldingServiceOuterClass.ListShieldingLocationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAvailableLocationsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ACTIVATE = 0;
  private static final int METHODID_DEACTIVATE = 1;
  private static final int METHODID_GET = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_LIST_AVAILABLE_LOCATIONS = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ShieldingServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ShieldingServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ACTIVATE:
          serviceImpl.activate((yandex.cloud.api.cdn.v1.ShieldingServiceOuterClass.ActivateShieldingRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DEACTIVATE:
          serviceImpl.deactivate((yandex.cloud.api.cdn.v1.ShieldingServiceOuterClass.DeactivateShieldingRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.cdn.v1.ShieldingServiceOuterClass.GetShieldingDetailsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.cdn.v1.Shielding.ShieldingDetails>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.cdn.v1.ShieldingServiceOuterClass.UpdateShieldingRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_AVAILABLE_LOCATIONS:
          serviceImpl.listAvailableLocations((yandex.cloud.api.cdn.v1.ShieldingServiceOuterClass.ListShieldingLocationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.cdn.v1.ShieldingServiceOuterClass.ListShieldingLocationsResponse>) responseObserver);
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

  private static abstract class ShieldingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ShieldingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.cdn.v1.ShieldingServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ShieldingService");
    }
  }

  private static final class ShieldingServiceFileDescriptorSupplier
      extends ShieldingServiceBaseDescriptorSupplier {
    ShieldingServiceFileDescriptorSupplier() {}
  }

  private static final class ShieldingServiceMethodDescriptorSupplier
      extends ShieldingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ShieldingServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ShieldingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ShieldingServiceFileDescriptorSupplier())
              .addMethod(getActivateMethod())
              .addMethod(getDeactivateMethod())
              .addMethod(getGetMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getListAvailableLocationsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
