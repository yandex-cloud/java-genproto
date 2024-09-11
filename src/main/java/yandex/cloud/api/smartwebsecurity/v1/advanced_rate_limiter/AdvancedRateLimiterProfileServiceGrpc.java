package yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing AdvancedRateLimiterProfile resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/smartwebsecurity/v1/advanced_rate_limiter/advanced_rate_limiter_profile_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AdvancedRateLimiterProfileServiceGrpc {

  private AdvancedRateLimiterProfileServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileServiceOuterClass.GetAdvancedRateLimiterProfileRequest,
      yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileOuterClass.AdvancedRateLimiterProfile> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileServiceOuterClass.GetAdvancedRateLimiterProfileRequest.class,
      responseType = yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileOuterClass.AdvancedRateLimiterProfile.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileServiceOuterClass.GetAdvancedRateLimiterProfileRequest,
      yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileOuterClass.AdvancedRateLimiterProfile> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileServiceOuterClass.GetAdvancedRateLimiterProfileRequest, yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileOuterClass.AdvancedRateLimiterProfile> getGetMethod;
    if ((getGetMethod = AdvancedRateLimiterProfileServiceGrpc.getGetMethod) == null) {
      synchronized (AdvancedRateLimiterProfileServiceGrpc.class) {
        if ((getGetMethod = AdvancedRateLimiterProfileServiceGrpc.getGetMethod) == null) {
          AdvancedRateLimiterProfileServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileServiceOuterClass.GetAdvancedRateLimiterProfileRequest, yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileOuterClass.AdvancedRateLimiterProfile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileServiceOuterClass.GetAdvancedRateLimiterProfileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileOuterClass.AdvancedRateLimiterProfile.getDefaultInstance()))
              .setSchemaDescriptor(new AdvancedRateLimiterProfileServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileServiceOuterClass.ListAdvancedRateLimiterProfilesRequest,
      yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileServiceOuterClass.ListAdvancedRateLimiterProfilesResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileServiceOuterClass.ListAdvancedRateLimiterProfilesRequest.class,
      responseType = yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileServiceOuterClass.ListAdvancedRateLimiterProfilesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileServiceOuterClass.ListAdvancedRateLimiterProfilesRequest,
      yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileServiceOuterClass.ListAdvancedRateLimiterProfilesResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileServiceOuterClass.ListAdvancedRateLimiterProfilesRequest, yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileServiceOuterClass.ListAdvancedRateLimiterProfilesResponse> getListMethod;
    if ((getListMethod = AdvancedRateLimiterProfileServiceGrpc.getListMethod) == null) {
      synchronized (AdvancedRateLimiterProfileServiceGrpc.class) {
        if ((getListMethod = AdvancedRateLimiterProfileServiceGrpc.getListMethod) == null) {
          AdvancedRateLimiterProfileServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileServiceOuterClass.ListAdvancedRateLimiterProfilesRequest, yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileServiceOuterClass.ListAdvancedRateLimiterProfilesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileServiceOuterClass.ListAdvancedRateLimiterProfilesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileServiceOuterClass.ListAdvancedRateLimiterProfilesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdvancedRateLimiterProfileServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileServiceOuterClass.CreateAdvancedRateLimiterProfileRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileServiceOuterClass.CreateAdvancedRateLimiterProfileRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileServiceOuterClass.CreateAdvancedRateLimiterProfileRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileServiceOuterClass.CreateAdvancedRateLimiterProfileRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = AdvancedRateLimiterProfileServiceGrpc.getCreateMethod) == null) {
      synchronized (AdvancedRateLimiterProfileServiceGrpc.class) {
        if ((getCreateMethod = AdvancedRateLimiterProfileServiceGrpc.getCreateMethod) == null) {
          AdvancedRateLimiterProfileServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileServiceOuterClass.CreateAdvancedRateLimiterProfileRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileServiceOuterClass.CreateAdvancedRateLimiterProfileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new AdvancedRateLimiterProfileServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileServiceOuterClass.UpdateAdvancedRateLimiterProfileRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileServiceOuterClass.UpdateAdvancedRateLimiterProfileRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileServiceOuterClass.UpdateAdvancedRateLimiterProfileRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileServiceOuterClass.UpdateAdvancedRateLimiterProfileRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = AdvancedRateLimiterProfileServiceGrpc.getUpdateMethod) == null) {
      synchronized (AdvancedRateLimiterProfileServiceGrpc.class) {
        if ((getUpdateMethod = AdvancedRateLimiterProfileServiceGrpc.getUpdateMethod) == null) {
          AdvancedRateLimiterProfileServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileServiceOuterClass.UpdateAdvancedRateLimiterProfileRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileServiceOuterClass.UpdateAdvancedRateLimiterProfileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new AdvancedRateLimiterProfileServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileServiceOuterClass.DeleteAdvancedRateLimiterProfileRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileServiceOuterClass.DeleteAdvancedRateLimiterProfileRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileServiceOuterClass.DeleteAdvancedRateLimiterProfileRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileServiceOuterClass.DeleteAdvancedRateLimiterProfileRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = AdvancedRateLimiterProfileServiceGrpc.getDeleteMethod) == null) {
      synchronized (AdvancedRateLimiterProfileServiceGrpc.class) {
        if ((getDeleteMethod = AdvancedRateLimiterProfileServiceGrpc.getDeleteMethod) == null) {
          AdvancedRateLimiterProfileServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileServiceOuterClass.DeleteAdvancedRateLimiterProfileRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileServiceOuterClass.DeleteAdvancedRateLimiterProfileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new AdvancedRateLimiterProfileServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AdvancedRateLimiterProfileServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdvancedRateLimiterProfileServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdvancedRateLimiterProfileServiceStub>() {
        @java.lang.Override
        public AdvancedRateLimiterProfileServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdvancedRateLimiterProfileServiceStub(channel, callOptions);
        }
      };
    return AdvancedRateLimiterProfileServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AdvancedRateLimiterProfileServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdvancedRateLimiterProfileServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdvancedRateLimiterProfileServiceBlockingStub>() {
        @java.lang.Override
        public AdvancedRateLimiterProfileServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdvancedRateLimiterProfileServiceBlockingStub(channel, callOptions);
        }
      };
    return AdvancedRateLimiterProfileServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AdvancedRateLimiterProfileServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdvancedRateLimiterProfileServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdvancedRateLimiterProfileServiceFutureStub>() {
        @java.lang.Override
        public AdvancedRateLimiterProfileServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdvancedRateLimiterProfileServiceFutureStub(channel, callOptions);
        }
      };
    return AdvancedRateLimiterProfileServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing AdvancedRateLimiterProfile resources.
   * </pre>
   */
  public static abstract class AdvancedRateLimiterProfileServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified AdvancedRateLimiterProfile resource.
     * </pre>
     */
    public void get(yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileServiceOuterClass.GetAdvancedRateLimiterProfileRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileOuterClass.AdvancedRateLimiterProfile> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of AdvancedRateLimiterProfile resources in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileServiceOuterClass.ListAdvancedRateLimiterProfilesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileServiceOuterClass.ListAdvancedRateLimiterProfilesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a ARL profile in the specified folder using the data specified in the request.
     * </pre>
     */
    public void create(yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileServiceOuterClass.CreateAdvancedRateLimiterProfileRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified ARL profile.
     * </pre>
     */
    public void update(yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileServiceOuterClass.UpdateAdvancedRateLimiterProfileRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified ARL profile.
     * </pre>
     */
    public void delete(yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileServiceOuterClass.DeleteAdvancedRateLimiterProfileRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileServiceOuterClass.GetAdvancedRateLimiterProfileRequest,
                yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileOuterClass.AdvancedRateLimiterProfile>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileServiceOuterClass.ListAdvancedRateLimiterProfilesRequest,
                yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileServiceOuterClass.ListAdvancedRateLimiterProfilesResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileServiceOuterClass.CreateAdvancedRateLimiterProfileRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileServiceOuterClass.UpdateAdvancedRateLimiterProfileRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileServiceOuterClass.DeleteAdvancedRateLimiterProfileRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing AdvancedRateLimiterProfile resources.
   * </pre>
   */
  public static final class AdvancedRateLimiterProfileServiceStub extends io.grpc.stub.AbstractAsyncStub<AdvancedRateLimiterProfileServiceStub> {
    private AdvancedRateLimiterProfileServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdvancedRateLimiterProfileServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdvancedRateLimiterProfileServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified AdvancedRateLimiterProfile resource.
     * </pre>
     */
    public void get(yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileServiceOuterClass.GetAdvancedRateLimiterProfileRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileOuterClass.AdvancedRateLimiterProfile> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of AdvancedRateLimiterProfile resources in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileServiceOuterClass.ListAdvancedRateLimiterProfilesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileServiceOuterClass.ListAdvancedRateLimiterProfilesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a ARL profile in the specified folder using the data specified in the request.
     * </pre>
     */
    public void create(yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileServiceOuterClass.CreateAdvancedRateLimiterProfileRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified ARL profile.
     * </pre>
     */
    public void update(yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileServiceOuterClass.UpdateAdvancedRateLimiterProfileRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified ARL profile.
     * </pre>
     */
    public void delete(yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileServiceOuterClass.DeleteAdvancedRateLimiterProfileRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing AdvancedRateLimiterProfile resources.
   * </pre>
   */
  public static final class AdvancedRateLimiterProfileServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AdvancedRateLimiterProfileServiceBlockingStub> {
    private AdvancedRateLimiterProfileServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdvancedRateLimiterProfileServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdvancedRateLimiterProfileServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified AdvancedRateLimiterProfile resource.
     * </pre>
     */
    public yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileOuterClass.AdvancedRateLimiterProfile get(yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileServiceOuterClass.GetAdvancedRateLimiterProfileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of AdvancedRateLimiterProfile resources in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileServiceOuterClass.ListAdvancedRateLimiterProfilesResponse list(yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileServiceOuterClass.ListAdvancedRateLimiterProfilesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a ARL profile in the specified folder using the data specified in the request.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileServiceOuterClass.CreateAdvancedRateLimiterProfileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified ARL profile.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileServiceOuterClass.UpdateAdvancedRateLimiterProfileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified ARL profile.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileServiceOuterClass.DeleteAdvancedRateLimiterProfileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing AdvancedRateLimiterProfile resources.
   * </pre>
   */
  public static final class AdvancedRateLimiterProfileServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AdvancedRateLimiterProfileServiceFutureStub> {
    private AdvancedRateLimiterProfileServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdvancedRateLimiterProfileServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdvancedRateLimiterProfileServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified AdvancedRateLimiterProfile resource.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileOuterClass.AdvancedRateLimiterProfile> get(
        yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileServiceOuterClass.GetAdvancedRateLimiterProfileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of AdvancedRateLimiterProfile resources in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileServiceOuterClass.ListAdvancedRateLimiterProfilesResponse> list(
        yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileServiceOuterClass.ListAdvancedRateLimiterProfilesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a ARL profile in the specified folder using the data specified in the request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileServiceOuterClass.CreateAdvancedRateLimiterProfileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified ARL profile.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileServiceOuterClass.UpdateAdvancedRateLimiterProfileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified ARL profile.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileServiceOuterClass.DeleteAdvancedRateLimiterProfileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_DELETE = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AdvancedRateLimiterProfileServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AdvancedRateLimiterProfileServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileServiceOuterClass.GetAdvancedRateLimiterProfileRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileOuterClass.AdvancedRateLimiterProfile>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileServiceOuterClass.ListAdvancedRateLimiterProfilesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileServiceOuterClass.ListAdvancedRateLimiterProfilesResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileServiceOuterClass.CreateAdvancedRateLimiterProfileRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileServiceOuterClass.UpdateAdvancedRateLimiterProfileRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileServiceOuterClass.DeleteAdvancedRateLimiterProfileRequest) request,
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

  private static abstract class AdvancedRateLimiterProfileServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AdvancedRateLimiterProfileServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.smartwebsecurity.v1.advanced_rate_limiter.AdvancedRateLimiterProfileServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AdvancedRateLimiterProfileService");
    }
  }

  private static final class AdvancedRateLimiterProfileServiceFileDescriptorSupplier
      extends AdvancedRateLimiterProfileServiceBaseDescriptorSupplier {
    AdvancedRateLimiterProfileServiceFileDescriptorSupplier() {}
  }

  private static final class AdvancedRateLimiterProfileServiceMethodDescriptorSupplier
      extends AdvancedRateLimiterProfileServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AdvancedRateLimiterProfileServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AdvancedRateLimiterProfileServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AdvancedRateLimiterProfileServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
