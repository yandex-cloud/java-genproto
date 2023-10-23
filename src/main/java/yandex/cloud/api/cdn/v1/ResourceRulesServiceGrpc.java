package yandex.cloud.api.cdn.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Rules management service.
 * Used for Resources Rules management.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/cdn/v1/rule_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ResourceRulesServiceGrpc {

  private ResourceRulesServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.cdn.v1.ResourceRulesService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.RuleService.ListResourceRulesRequest,
      yandex.cloud.api.cdn.v1.RuleService.ListResourceRulesResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.cdn.v1.RuleService.ListResourceRulesRequest.class,
      responseType = yandex.cloud.api.cdn.v1.RuleService.ListResourceRulesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.RuleService.ListResourceRulesRequest,
      yandex.cloud.api.cdn.v1.RuleService.ListResourceRulesResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.RuleService.ListResourceRulesRequest, yandex.cloud.api.cdn.v1.RuleService.ListResourceRulesResponse> getListMethod;
    if ((getListMethod = ResourceRulesServiceGrpc.getListMethod) == null) {
      synchronized (ResourceRulesServiceGrpc.class) {
        if ((getListMethod = ResourceRulesServiceGrpc.getListMethod) == null) {
          ResourceRulesServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cdn.v1.RuleService.ListResourceRulesRequest, yandex.cloud.api.cdn.v1.RuleService.ListResourceRulesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cdn.v1.RuleService.ListResourceRulesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cdn.v1.RuleService.ListResourceRulesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ResourceRulesServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.RuleService.CreateResourceRuleRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.cdn.v1.RuleService.CreateResourceRuleRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.RuleService.CreateResourceRuleRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.RuleService.CreateResourceRuleRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = ResourceRulesServiceGrpc.getCreateMethod) == null) {
      synchronized (ResourceRulesServiceGrpc.class) {
        if ((getCreateMethod = ResourceRulesServiceGrpc.getCreateMethod) == null) {
          ResourceRulesServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cdn.v1.RuleService.CreateResourceRuleRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cdn.v1.RuleService.CreateResourceRuleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ResourceRulesServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.RuleService.GetResourceRuleRequest,
      yandex.cloud.api.cdn.v1.RuleOuterClass.Rule> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.cdn.v1.RuleService.GetResourceRuleRequest.class,
      responseType = yandex.cloud.api.cdn.v1.RuleOuterClass.Rule.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.RuleService.GetResourceRuleRequest,
      yandex.cloud.api.cdn.v1.RuleOuterClass.Rule> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.RuleService.GetResourceRuleRequest, yandex.cloud.api.cdn.v1.RuleOuterClass.Rule> getGetMethod;
    if ((getGetMethod = ResourceRulesServiceGrpc.getGetMethod) == null) {
      synchronized (ResourceRulesServiceGrpc.class) {
        if ((getGetMethod = ResourceRulesServiceGrpc.getGetMethod) == null) {
          ResourceRulesServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cdn.v1.RuleService.GetResourceRuleRequest, yandex.cloud.api.cdn.v1.RuleOuterClass.Rule>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cdn.v1.RuleService.GetResourceRuleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cdn.v1.RuleOuterClass.Rule.getDefaultInstance()))
              .setSchemaDescriptor(new ResourceRulesServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.RuleService.UpdateResourceRuleRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.cdn.v1.RuleService.UpdateResourceRuleRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.RuleService.UpdateResourceRuleRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.RuleService.UpdateResourceRuleRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = ResourceRulesServiceGrpc.getUpdateMethod) == null) {
      synchronized (ResourceRulesServiceGrpc.class) {
        if ((getUpdateMethod = ResourceRulesServiceGrpc.getUpdateMethod) == null) {
          ResourceRulesServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cdn.v1.RuleService.UpdateResourceRuleRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cdn.v1.RuleService.UpdateResourceRuleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ResourceRulesServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.RuleService.DeleteResourceRuleRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.cdn.v1.RuleService.DeleteResourceRuleRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.RuleService.DeleteResourceRuleRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.cdn.v1.RuleService.DeleteResourceRuleRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = ResourceRulesServiceGrpc.getDeleteMethod) == null) {
      synchronized (ResourceRulesServiceGrpc.class) {
        if ((getDeleteMethod = ResourceRulesServiceGrpc.getDeleteMethod) == null) {
          ResourceRulesServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.cdn.v1.RuleService.DeleteResourceRuleRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.cdn.v1.RuleService.DeleteResourceRuleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ResourceRulesServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ResourceRulesServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ResourceRulesServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ResourceRulesServiceStub>() {
        @java.lang.Override
        public ResourceRulesServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ResourceRulesServiceStub(channel, callOptions);
        }
      };
    return ResourceRulesServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ResourceRulesServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ResourceRulesServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ResourceRulesServiceBlockingStub>() {
        @java.lang.Override
        public ResourceRulesServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ResourceRulesServiceBlockingStub(channel, callOptions);
        }
      };
    return ResourceRulesServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ResourceRulesServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ResourceRulesServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ResourceRulesServiceFutureStub>() {
        @java.lang.Override
        public ResourceRulesServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ResourceRulesServiceFutureStub(channel, callOptions);
        }
      };
    return ResourceRulesServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Rules management service.
   * Used for Resources Rules management.
   * </pre>
   */
  public static abstract class ResourceRulesServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * List all rules for specified resource.
     * </pre>
     */
    public void list(yandex.cloud.api.cdn.v1.RuleService.ListResourceRulesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cdn.v1.RuleService.ListResourceRulesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create new resource rule with specified unique name and rule patter.
     * </pre>
     */
    public void create(yandex.cloud.api.cdn.v1.RuleService.CreateResourceRuleRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get specified by id resource rule.
     * </pre>
     */
    public void get(yandex.cloud.api.cdn.v1.RuleService.GetResourceRuleRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cdn.v1.RuleOuterClass.Rule> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update specified by id resource rule.
     * </pre>
     */
    public void update(yandex.cloud.api.cdn.v1.RuleService.UpdateResourceRuleRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete specified by id resource rule.
     * </pre>
     */
    public void delete(yandex.cloud.api.cdn.v1.RuleService.DeleteResourceRuleRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cdn.v1.RuleService.ListResourceRulesRequest,
                yandex.cloud.api.cdn.v1.RuleService.ListResourceRulesResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cdn.v1.RuleService.CreateResourceRuleRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cdn.v1.RuleService.GetResourceRuleRequest,
                yandex.cloud.api.cdn.v1.RuleOuterClass.Rule>(
                  this, METHODID_GET)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cdn.v1.RuleService.UpdateResourceRuleRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.cdn.v1.RuleService.DeleteResourceRuleRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .build();
    }
  }

  /**
   * <pre>
   * Rules management service.
   * Used for Resources Rules management.
   * </pre>
   */
  public static final class ResourceRulesServiceStub extends io.grpc.stub.AbstractAsyncStub<ResourceRulesServiceStub> {
    private ResourceRulesServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ResourceRulesServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ResourceRulesServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * List all rules for specified resource.
     * </pre>
     */
    public void list(yandex.cloud.api.cdn.v1.RuleService.ListResourceRulesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cdn.v1.RuleService.ListResourceRulesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create new resource rule with specified unique name and rule patter.
     * </pre>
     */
    public void create(yandex.cloud.api.cdn.v1.RuleService.CreateResourceRuleRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get specified by id resource rule.
     * </pre>
     */
    public void get(yandex.cloud.api.cdn.v1.RuleService.GetResourceRuleRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.cdn.v1.RuleOuterClass.Rule> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update specified by id resource rule.
     * </pre>
     */
    public void update(yandex.cloud.api.cdn.v1.RuleService.UpdateResourceRuleRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete specified by id resource rule.
     * </pre>
     */
    public void delete(yandex.cloud.api.cdn.v1.RuleService.DeleteResourceRuleRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Rules management service.
   * Used for Resources Rules management.
   * </pre>
   */
  public static final class ResourceRulesServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ResourceRulesServiceBlockingStub> {
    private ResourceRulesServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ResourceRulesServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ResourceRulesServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * List all rules for specified resource.
     * </pre>
     */
    public yandex.cloud.api.cdn.v1.RuleService.ListResourceRulesResponse list(yandex.cloud.api.cdn.v1.RuleService.ListResourceRulesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create new resource rule with specified unique name and rule patter.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.cdn.v1.RuleService.CreateResourceRuleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get specified by id resource rule.
     * </pre>
     */
    public yandex.cloud.api.cdn.v1.RuleOuterClass.Rule get(yandex.cloud.api.cdn.v1.RuleService.GetResourceRuleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update specified by id resource rule.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.cdn.v1.RuleService.UpdateResourceRuleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete specified by id resource rule.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.cdn.v1.RuleService.DeleteResourceRuleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Rules management service.
   * Used for Resources Rules management.
   * </pre>
   */
  public static final class ResourceRulesServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ResourceRulesServiceFutureStub> {
    private ResourceRulesServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ResourceRulesServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ResourceRulesServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * List all rules for specified resource.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.cdn.v1.RuleService.ListResourceRulesResponse> list(
        yandex.cloud.api.cdn.v1.RuleService.ListResourceRulesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create new resource rule with specified unique name and rule patter.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.cdn.v1.RuleService.CreateResourceRuleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get specified by id resource rule.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.cdn.v1.RuleOuterClass.Rule> get(
        yandex.cloud.api.cdn.v1.RuleService.GetResourceRuleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update specified by id resource rule.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.cdn.v1.RuleService.UpdateResourceRuleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete specified by id resource rule.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.cdn.v1.RuleService.DeleteResourceRuleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST = 0;
  private static final int METHODID_CREATE = 1;
  private static final int METHODID_GET = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_DELETE = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ResourceRulesServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ResourceRulesServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.cdn.v1.RuleService.ListResourceRulesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.cdn.v1.RuleService.ListResourceRulesResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.cdn.v1.RuleService.CreateResourceRuleRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.cdn.v1.RuleService.GetResourceRuleRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.cdn.v1.RuleOuterClass.Rule>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.cdn.v1.RuleService.UpdateResourceRuleRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.cdn.v1.RuleService.DeleteResourceRuleRequest) request,
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

  private static abstract class ResourceRulesServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ResourceRulesServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.cdn.v1.RuleService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ResourceRulesService");
    }
  }

  private static final class ResourceRulesServiceFileDescriptorSupplier
      extends ResourceRulesServiceBaseDescriptorSupplier {
    ResourceRulesServiceFileDescriptorSupplier() {}
  }

  private static final class ResourceRulesServiceMethodDescriptorSupplier
      extends ResourceRulesServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ResourceRulesServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ResourceRulesServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ResourceRulesServiceFileDescriptorSupplier())
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .addMethod(getGetMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
