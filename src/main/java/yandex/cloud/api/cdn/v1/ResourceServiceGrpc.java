package yandex.cloud.api.cdn.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Provider's resources management service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/cdn/v1/resource_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ResourceServiceGrpc {

  private ResourceServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.cdn.v1.ResourceService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.GetResourceRequest,
      yandex.cloud.api.cdn.v1.ResourceOuterClass.Resource> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.GetResourceRequest.class,
      responseType = yandex.cloud.api.cdn.v1.ResourceOuterClass.Resource.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.GetResourceRequest,
      yandex.cloud.api.cdn.v1.ResourceOuterClass.Resource> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.GetResourceRequest, yandex.cloud.api.cdn.v1.ResourceOuterClass.Resource> getGetMethod;
    if ((getGetMethod = ResourceServiceGrpc.getGetMethod) == null) {
      synchronized (ResourceServiceGrpc.class) {
        if ((getGetMethod = ResourceServiceGrpc.getGetMethod) == null) {
          ResourceServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.GetResourceRequest, yandex.cloud.api.cdn.v1.ResourceOuterClass.Resource>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.GetResourceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cdn.v1.ResourceOuterClass.Resource.getDefaultInstance()))
              .setSchemaDescriptor(new ResourceServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.ListResourcesRequest,
      yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.ListResourcesResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.ListResourcesRequest.class,
      responseType = yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.ListResourcesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.ListResourcesRequest,
      yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.ListResourcesResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.ListResourcesRequest, yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.ListResourcesResponse> getListMethod;
    if ((getListMethod = ResourceServiceGrpc.getListMethod) == null) {
      synchronized (ResourceServiceGrpc.class) {
        if ((getListMethod = ResourceServiceGrpc.getListMethod) == null) {
          ResourceServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.ListResourcesRequest, yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.ListResourcesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.ListResourcesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.ListResourcesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ResourceServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.CreateResourceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.CreateResourceRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.CreateResourceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.CreateResourceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = ResourceServiceGrpc.getCreateMethod) == null) {
      synchronized (ResourceServiceGrpc.class) {
        if ((getCreateMethod = ResourceServiceGrpc.getCreateMethod) == null) {
          ResourceServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.CreateResourceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.CreateResourceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ResourceServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.UpdateResourceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.UpdateResourceRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.UpdateResourceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.UpdateResourceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = ResourceServiceGrpc.getUpdateMethod) == null) {
      synchronized (ResourceServiceGrpc.class) {
        if ((getUpdateMethod = ResourceServiceGrpc.getUpdateMethod) == null) {
          ResourceServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.UpdateResourceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.UpdateResourceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ResourceServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.DeleteResourceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.DeleteResourceRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.DeleteResourceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.DeleteResourceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = ResourceServiceGrpc.getDeleteMethod) == null) {
      synchronized (ResourceServiceGrpc.class) {
        if ((getDeleteMethod = ResourceServiceGrpc.getDeleteMethod) == null) {
          ResourceServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.DeleteResourceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.DeleteResourceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ResourceServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.GetProviderCNameRequest,
      yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.GetProviderCNameResponse> getGetProviderCNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProviderCName",
      requestType = yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.GetProviderCNameRequest.class,
      responseType = yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.GetProviderCNameResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.GetProviderCNameRequest,
      yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.GetProviderCNameResponse> getGetProviderCNameMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.GetProviderCNameRequest, yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.GetProviderCNameResponse> getGetProviderCNameMethod;
    if ((getGetProviderCNameMethod = ResourceServiceGrpc.getGetProviderCNameMethod) == null) {
      synchronized (ResourceServiceGrpc.class) {
        if ((getGetProviderCNameMethod = ResourceServiceGrpc.getGetProviderCNameMethod) == null) {
          ResourceServiceGrpc.getGetProviderCNameMethod = getGetProviderCNameMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.GetProviderCNameRequest, yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.GetProviderCNameResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProviderCName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.GetProviderCNameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.GetProviderCNameResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ResourceServiceMethodDescriptorSupplier("GetProviderCName"))
              .build();
        }
      }
    }
    return getGetProviderCNameMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ResourceServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ResourceServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ResourceServiceStub>() {
        @java.lang.Override
        public ResourceServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ResourceServiceStub(channel, callOptions);
        }
      };
    return ResourceServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ResourceServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ResourceServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ResourceServiceBlockingStub>() {
        @java.lang.Override
        public ResourceServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ResourceServiceBlockingStub(channel, callOptions);
        }
      };
    return ResourceServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ResourceServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ResourceServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ResourceServiceFutureStub>() {
        @java.lang.Override
        public ResourceServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ResourceServiceFutureStub(channel, callOptions);
        }
      };
    return ResourceServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Provider's resources management service.
   * </pre>
   */
  public static abstract class ResourceServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Get client's CDN resource by resource id.
     * </pre>
     */
    public void get(yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.GetResourceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cdn.v1.ResourceOuterClass.Resource> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists CDN resources.
     * </pre>
     */
    public void list(yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.ListResourcesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.ListResourcesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a CDN resource in the specified folder.
     * Creation may take up to 15 minutes.
     * </pre>
     */
    public void create(yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.CreateResourceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified CDN resource.
     * The method implements patch behaviour, i.e. only the fields specified in the request are updated in the resource.
     * Changes may take up to 15 minutes to apply. Afterwards, it is recommended to purge the resource's cache via a
     * [CacheService.Purge] request.
     * </pre>
     */
    public void update(yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.UpdateResourceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes client's CDN resource.
     * </pre>
     */
    public void delete(yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.DeleteResourceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deprecated: Provider-specific CNAME is now available in the `provider_cname` field of each Resource message.
     * </pre>
     */
    public void getProviderCName(yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.GetProviderCNameRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.GetProviderCNameResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProviderCNameMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.GetResourceRequest,
                yandex.cloud.api.cdn.v1.ResourceOuterClass.Resource>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.ListResourcesRequest,
                yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.ListResourcesResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.CreateResourceRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.UpdateResourceRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.DeleteResourceRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getGetProviderCNameMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.GetProviderCNameRequest,
                yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.GetProviderCNameResponse>(
                  this, METHODID_GET_PROVIDER_CNAME)))
          .build();
    }
  }

  /**
   * <pre>
   * Provider's resources management service.
   * </pre>
   */
  public static final class ResourceServiceStub extends io.grpc.stub.AbstractAsyncStub<ResourceServiceStub> {
    private ResourceServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ResourceServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ResourceServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get client's CDN resource by resource id.
     * </pre>
     */
    public void get(yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.GetResourceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cdn.v1.ResourceOuterClass.Resource> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists CDN resources.
     * </pre>
     */
    public void list(yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.ListResourcesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.ListResourcesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a CDN resource in the specified folder.
     * Creation may take up to 15 minutes.
     * </pre>
     */
    public void create(yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.CreateResourceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified CDN resource.
     * The method implements patch behaviour, i.e. only the fields specified in the request are updated in the resource.
     * Changes may take up to 15 minutes to apply. Afterwards, it is recommended to purge the resource's cache via a
     * [CacheService.Purge] request.
     * </pre>
     */
    public void update(yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.UpdateResourceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes client's CDN resource.
     * </pre>
     */
    public void delete(yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.DeleteResourceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deprecated: Provider-specific CNAME is now available in the `provider_cname` field of each Resource message.
     * </pre>
     */
    public void getProviderCName(yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.GetProviderCNameRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.GetProviderCNameResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProviderCNameMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Provider's resources management service.
   * </pre>
   */
  public static final class ResourceServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ResourceServiceBlockingStub> {
    private ResourceServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ResourceServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ResourceServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get client's CDN resource by resource id.
     * </pre>
     */
    public yandex.cloud.api.cdn.v1.ResourceOuterClass.Resource get(yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.GetResourceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists CDN resources.
     * </pre>
     */
    public yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.ListResourcesResponse list(yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.ListResourcesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a CDN resource in the specified folder.
     * Creation may take up to 15 minutes.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.CreateResourceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified CDN resource.
     * The method implements patch behaviour, i.e. only the fields specified in the request are updated in the resource.
     * Changes may take up to 15 minutes to apply. Afterwards, it is recommended to purge the resource's cache via a
     * [CacheService.Purge] request.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.UpdateResourceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes client's CDN resource.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.DeleteResourceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deprecated: Provider-specific CNAME is now available in the `provider_cname` field of each Resource message.
     * </pre>
     */
    public yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.GetProviderCNameResponse getProviderCName(yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.GetProviderCNameRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProviderCNameMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Provider's resources management service.
   * </pre>
   */
  public static final class ResourceServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ResourceServiceFutureStub> {
    private ResourceServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ResourceServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ResourceServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get client's CDN resource by resource id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.cdn.v1.ResourceOuterClass.Resource> get(
        yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.GetResourceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists CDN resources.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.ListResourcesResponse> list(
        yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.ListResourcesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a CDN resource in the specified folder.
     * Creation may take up to 15 minutes.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.CreateResourceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified CDN resource.
     * The method implements patch behaviour, i.e. only the fields specified in the request are updated in the resource.
     * Changes may take up to 15 minutes to apply. Afterwards, it is recommended to purge the resource's cache via a
     * [CacheService.Purge] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.UpdateResourceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes client's CDN resource.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.DeleteResourceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deprecated: Provider-specific CNAME is now available in the `provider_cname` field of each Resource message.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.GetProviderCNameResponse> getProviderCName(
        yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.GetProviderCNameRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProviderCNameMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_DELETE = 4;
  private static final int METHODID_GET_PROVIDER_CNAME = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ResourceServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ResourceServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.GetResourceRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.cdn.v1.ResourceOuterClass.Resource>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.ListResourcesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.ListResourcesResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.CreateResourceRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.UpdateResourceRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.DeleteResourceRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_GET_PROVIDER_CNAME:
          serviceImpl.getProviderCName((yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.GetProviderCNameRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.GetProviderCNameResponse>) responseObserver);
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

  private static abstract class ResourceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ResourceServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.cdn.v1.ResourceServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ResourceService");
    }
  }

  private static final class ResourceServiceFileDescriptorSupplier
      extends ResourceServiceBaseDescriptorSupplier {
    ResourceServiceFileDescriptorSupplier() {}
  }

  private static final class ResourceServiceMethodDescriptorSupplier
      extends ResourceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ResourceServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ResourceServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ResourceServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getGetProviderCNameMethod())
              .build();
        }
      }
    }
    return result;
  }
}
