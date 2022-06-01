package yandex.cloud.api.billing.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing BillingAccount resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/billing/v1/billing_account_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BillingAccountServiceGrpc {

  private BillingAccountServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.billing.v1.BillingAccountService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.billing.v1.BillingAccountServiceOuterClass.GetBillingAccountRequest,
      yandex.cloud.api.billing.v1.BillingAccountOuterClass.BillingAccount> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.billing.v1.BillingAccountServiceOuterClass.GetBillingAccountRequest.class,
      responseType = yandex.cloud.api.billing.v1.BillingAccountOuterClass.BillingAccount.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.billing.v1.BillingAccountServiceOuterClass.GetBillingAccountRequest,
      yandex.cloud.api.billing.v1.BillingAccountOuterClass.BillingAccount> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.billing.v1.BillingAccountServiceOuterClass.GetBillingAccountRequest, yandex.cloud.api.billing.v1.BillingAccountOuterClass.BillingAccount> getGetMethod;
    if ((getGetMethod = BillingAccountServiceGrpc.getGetMethod) == null) {
      synchronized (BillingAccountServiceGrpc.class) {
        if ((getGetMethod = BillingAccountServiceGrpc.getGetMethod) == null) {
          BillingAccountServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.billing.v1.BillingAccountServiceOuterClass.GetBillingAccountRequest, yandex.cloud.api.billing.v1.BillingAccountOuterClass.BillingAccount>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.billing.v1.BillingAccountServiceOuterClass.GetBillingAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.billing.v1.BillingAccountOuterClass.BillingAccount.getDefaultInstance()))
              .setSchemaDescriptor(new BillingAccountServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.billing.v1.BillingAccountServiceOuterClass.ListBillingAccountsRequest,
      yandex.cloud.api.billing.v1.BillingAccountServiceOuterClass.ListBillingAccountsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.billing.v1.BillingAccountServiceOuterClass.ListBillingAccountsRequest.class,
      responseType = yandex.cloud.api.billing.v1.BillingAccountServiceOuterClass.ListBillingAccountsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.billing.v1.BillingAccountServiceOuterClass.ListBillingAccountsRequest,
      yandex.cloud.api.billing.v1.BillingAccountServiceOuterClass.ListBillingAccountsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.billing.v1.BillingAccountServiceOuterClass.ListBillingAccountsRequest, yandex.cloud.api.billing.v1.BillingAccountServiceOuterClass.ListBillingAccountsResponse> getListMethod;
    if ((getListMethod = BillingAccountServiceGrpc.getListMethod) == null) {
      synchronized (BillingAccountServiceGrpc.class) {
        if ((getListMethod = BillingAccountServiceGrpc.getListMethod) == null) {
          BillingAccountServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.billing.v1.BillingAccountServiceOuterClass.ListBillingAccountsRequest, yandex.cloud.api.billing.v1.BillingAccountServiceOuterClass.ListBillingAccountsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.billing.v1.BillingAccountServiceOuterClass.ListBillingAccountsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.billing.v1.BillingAccountServiceOuterClass.ListBillingAccountsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingAccountServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.billing.v1.BillingAccountServiceOuterClass.ListBillableObjectBindingsRequest,
      yandex.cloud.api.billing.v1.BillingAccountServiceOuterClass.ListBillableObjectBindingsResponse> getListBillableObjectBindingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListBillableObjectBindings",
      requestType = yandex.cloud.api.billing.v1.BillingAccountServiceOuterClass.ListBillableObjectBindingsRequest.class,
      responseType = yandex.cloud.api.billing.v1.BillingAccountServiceOuterClass.ListBillableObjectBindingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.billing.v1.BillingAccountServiceOuterClass.ListBillableObjectBindingsRequest,
      yandex.cloud.api.billing.v1.BillingAccountServiceOuterClass.ListBillableObjectBindingsResponse> getListBillableObjectBindingsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.billing.v1.BillingAccountServiceOuterClass.ListBillableObjectBindingsRequest, yandex.cloud.api.billing.v1.BillingAccountServiceOuterClass.ListBillableObjectBindingsResponse> getListBillableObjectBindingsMethod;
    if ((getListBillableObjectBindingsMethod = BillingAccountServiceGrpc.getListBillableObjectBindingsMethod) == null) {
      synchronized (BillingAccountServiceGrpc.class) {
        if ((getListBillableObjectBindingsMethod = BillingAccountServiceGrpc.getListBillableObjectBindingsMethod) == null) {
          BillingAccountServiceGrpc.getListBillableObjectBindingsMethod = getListBillableObjectBindingsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.billing.v1.BillingAccountServiceOuterClass.ListBillableObjectBindingsRequest, yandex.cloud.api.billing.v1.BillingAccountServiceOuterClass.ListBillableObjectBindingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListBillableObjectBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.billing.v1.BillingAccountServiceOuterClass.ListBillableObjectBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.billing.v1.BillingAccountServiceOuterClass.ListBillableObjectBindingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingAccountServiceMethodDescriptorSupplier("ListBillableObjectBindings"))
              .build();
        }
      }
    }
    return getListBillableObjectBindingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.billing.v1.BillingAccountServiceOuterClass.BindBillableObjectRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getBindBillableObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BindBillableObject",
      requestType = yandex.cloud.api.billing.v1.BillingAccountServiceOuterClass.BindBillableObjectRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.billing.v1.BillingAccountServiceOuterClass.BindBillableObjectRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getBindBillableObjectMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.billing.v1.BillingAccountServiceOuterClass.BindBillableObjectRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getBindBillableObjectMethod;
    if ((getBindBillableObjectMethod = BillingAccountServiceGrpc.getBindBillableObjectMethod) == null) {
      synchronized (BillingAccountServiceGrpc.class) {
        if ((getBindBillableObjectMethod = BillingAccountServiceGrpc.getBindBillableObjectMethod) == null) {
          BillingAccountServiceGrpc.getBindBillableObjectMethod = getBindBillableObjectMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.billing.v1.BillingAccountServiceOuterClass.BindBillableObjectRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BindBillableObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.billing.v1.BillingAccountServiceOuterClass.BindBillableObjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new BillingAccountServiceMethodDescriptorSupplier("BindBillableObject"))
              .build();
        }
      }
    }
    return getBindBillableObjectMethod;
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
    if ((getListAccessBindingsMethod = BillingAccountServiceGrpc.getListAccessBindingsMethod) == null) {
      synchronized (BillingAccountServiceGrpc.class) {
        if ((getListAccessBindingsMethod = BillingAccountServiceGrpc.getListAccessBindingsMethod) == null) {
          BillingAccountServiceGrpc.getListAccessBindingsMethod = getListAccessBindingsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.ListAccessBindingsRequest, yandex.cloud.api.access.Access.ListAccessBindingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.ListAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.ListAccessBindingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingAccountServiceMethodDescriptorSupplier("ListAccessBindings"))
              .build();
        }
      }
    }
    return getListAccessBindingsMethod;
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
    if ((getUpdateAccessBindingsMethod = BillingAccountServiceGrpc.getUpdateAccessBindingsMethod) == null) {
      synchronized (BillingAccountServiceGrpc.class) {
        if ((getUpdateAccessBindingsMethod = BillingAccountServiceGrpc.getUpdateAccessBindingsMethod) == null) {
          BillingAccountServiceGrpc.getUpdateAccessBindingsMethod = getUpdateAccessBindingsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.UpdateAccessBindingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.UpdateAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new BillingAccountServiceMethodDescriptorSupplier("UpdateAccessBindings"))
              .build();
        }
      }
    }
    return getUpdateAccessBindingsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BillingAccountServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BillingAccountServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BillingAccountServiceStub>() {
        @java.lang.Override
        public BillingAccountServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BillingAccountServiceStub(channel, callOptions);
        }
      };
    return BillingAccountServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BillingAccountServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BillingAccountServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BillingAccountServiceBlockingStub>() {
        @java.lang.Override
        public BillingAccountServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BillingAccountServiceBlockingStub(channel, callOptions);
        }
      };
    return BillingAccountServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BillingAccountServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BillingAccountServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BillingAccountServiceFutureStub>() {
        @java.lang.Override
        public BillingAccountServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BillingAccountServiceFutureStub(channel, callOptions);
        }
      };
    return BillingAccountServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing BillingAccount resources.
   * </pre>
   */
  public static abstract class BillingAccountServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified billing account.
     * </pre>
     */
    public void get(yandex.cloud.api.billing.v1.BillingAccountServiceOuterClass.GetBillingAccountRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.billing.v1.BillingAccountOuterClass.BillingAccount> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of billing accounts available for current user.
     * </pre>
     */
    public void list(yandex.cloud.api.billing.v1.BillingAccountServiceOuterClass.ListBillingAccountsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.billing.v1.BillingAccountServiceOuterClass.ListBillingAccountsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of billable object bindings associated with the specified billing account.
     * </pre>
     */
    public void listBillableObjectBindings(yandex.cloud.api.billing.v1.BillingAccountServiceOuterClass.ListBillableObjectBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.billing.v1.BillingAccountServiceOuterClass.ListBillableObjectBindingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListBillableObjectBindingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Binds billable object to the specified billing account.
     * </pre>
     */
    public void bindBillableObject(yandex.cloud.api.billing.v1.BillingAccountServiceOuterClass.BindBillableObjectRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBindBillableObjectMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists access bindings for the specified billing account.
     * </pre>
     */
    public void listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.access.Access.ListAccessBindingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAccessBindingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates access bindings for the specified billing account.
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
                yandex.cloud.api.billing.v1.BillingAccountServiceOuterClass.GetBillingAccountRequest,
                yandex.cloud.api.billing.v1.BillingAccountOuterClass.BillingAccount>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.billing.v1.BillingAccountServiceOuterClass.ListBillingAccountsRequest,
                yandex.cloud.api.billing.v1.BillingAccountServiceOuterClass.ListBillingAccountsResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getListBillableObjectBindingsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.billing.v1.BillingAccountServiceOuterClass.ListBillableObjectBindingsRequest,
                yandex.cloud.api.billing.v1.BillingAccountServiceOuterClass.ListBillableObjectBindingsResponse>(
                  this, METHODID_LIST_BILLABLE_OBJECT_BINDINGS)))
          .addMethod(
            getBindBillableObjectMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.billing.v1.BillingAccountServiceOuterClass.BindBillableObjectRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_BIND_BILLABLE_OBJECT)))
          .addMethod(
            getListAccessBindingsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.access.Access.ListAccessBindingsRequest,
                yandex.cloud.api.access.Access.ListAccessBindingsResponse>(
                  this, METHODID_LIST_ACCESS_BINDINGS)))
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
   * A set of methods for managing BillingAccount resources.
   * </pre>
   */
  public static final class BillingAccountServiceStub extends io.grpc.stub.AbstractAsyncStub<BillingAccountServiceStub> {
    private BillingAccountServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BillingAccountServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BillingAccountServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified billing account.
     * </pre>
     */
    public void get(yandex.cloud.api.billing.v1.BillingAccountServiceOuterClass.GetBillingAccountRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.billing.v1.BillingAccountOuterClass.BillingAccount> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of billing accounts available for current user.
     * </pre>
     */
    public void list(yandex.cloud.api.billing.v1.BillingAccountServiceOuterClass.ListBillingAccountsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.billing.v1.BillingAccountServiceOuterClass.ListBillingAccountsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of billable object bindings associated with the specified billing account.
     * </pre>
     */
    public void listBillableObjectBindings(yandex.cloud.api.billing.v1.BillingAccountServiceOuterClass.ListBillableObjectBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.billing.v1.BillingAccountServiceOuterClass.ListBillableObjectBindingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListBillableObjectBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Binds billable object to the specified billing account.
     * </pre>
     */
    public void bindBillableObject(yandex.cloud.api.billing.v1.BillingAccountServiceOuterClass.BindBillableObjectRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBindBillableObjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists access bindings for the specified billing account.
     * </pre>
     */
    public void listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.access.Access.ListAccessBindingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates access bindings for the specified billing account.
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
   * A set of methods for managing BillingAccount resources.
   * </pre>
   */
  public static final class BillingAccountServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<BillingAccountServiceBlockingStub> {
    private BillingAccountServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BillingAccountServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BillingAccountServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified billing account.
     * </pre>
     */
    public yandex.cloud.api.billing.v1.BillingAccountOuterClass.BillingAccount get(yandex.cloud.api.billing.v1.BillingAccountServiceOuterClass.GetBillingAccountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of billing accounts available for current user.
     * </pre>
     */
    public yandex.cloud.api.billing.v1.BillingAccountServiceOuterClass.ListBillingAccountsResponse list(yandex.cloud.api.billing.v1.BillingAccountServiceOuterClass.ListBillingAccountsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of billable object bindings associated with the specified billing account.
     * </pre>
     */
    public yandex.cloud.api.billing.v1.BillingAccountServiceOuterClass.ListBillableObjectBindingsResponse listBillableObjectBindings(yandex.cloud.api.billing.v1.BillingAccountServiceOuterClass.ListBillableObjectBindingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListBillableObjectBindingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Binds billable object to the specified billing account.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation bindBillableObject(yandex.cloud.api.billing.v1.BillingAccountServiceOuterClass.BindBillableObjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBindBillableObjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists access bindings for the specified billing account.
     * </pre>
     */
    public yandex.cloud.api.access.Access.ListAccessBindingsResponse listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAccessBindingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates access bindings for the specified billing account.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation updateAccessBindings(yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAccessBindingsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing BillingAccount resources.
   * </pre>
   */
  public static final class BillingAccountServiceFutureStub extends io.grpc.stub.AbstractFutureStub<BillingAccountServiceFutureStub> {
    private BillingAccountServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BillingAccountServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BillingAccountServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified billing account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.billing.v1.BillingAccountOuterClass.BillingAccount> get(
        yandex.cloud.api.billing.v1.BillingAccountServiceOuterClass.GetBillingAccountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of billing accounts available for current user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.billing.v1.BillingAccountServiceOuterClass.ListBillingAccountsResponse> list(
        yandex.cloud.api.billing.v1.BillingAccountServiceOuterClass.ListBillingAccountsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of billable object bindings associated with the specified billing account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.billing.v1.BillingAccountServiceOuterClass.ListBillableObjectBindingsResponse> listBillableObjectBindings(
        yandex.cloud.api.billing.v1.BillingAccountServiceOuterClass.ListBillableObjectBindingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListBillableObjectBindingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Binds billable object to the specified billing account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> bindBillableObject(
        yandex.cloud.api.billing.v1.BillingAccountServiceOuterClass.BindBillableObjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBindBillableObjectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists access bindings for the specified billing account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.access.Access.ListAccessBindingsResponse> listAccessBindings(
        yandex.cloud.api.access.Access.ListAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAccessBindingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates access bindings for the specified billing account.
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
  private static final int METHODID_LIST_BILLABLE_OBJECT_BINDINGS = 2;
  private static final int METHODID_BIND_BILLABLE_OBJECT = 3;
  private static final int METHODID_LIST_ACCESS_BINDINGS = 4;
  private static final int METHODID_UPDATE_ACCESS_BINDINGS = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BillingAccountServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BillingAccountServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.billing.v1.BillingAccountServiceOuterClass.GetBillingAccountRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.billing.v1.BillingAccountOuterClass.BillingAccount>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.billing.v1.BillingAccountServiceOuterClass.ListBillingAccountsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.billing.v1.BillingAccountServiceOuterClass.ListBillingAccountsResponse>) responseObserver);
          break;
        case METHODID_LIST_BILLABLE_OBJECT_BINDINGS:
          serviceImpl.listBillableObjectBindings((yandex.cloud.api.billing.v1.BillingAccountServiceOuterClass.ListBillableObjectBindingsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.billing.v1.BillingAccountServiceOuterClass.ListBillableObjectBindingsResponse>) responseObserver);
          break;
        case METHODID_BIND_BILLABLE_OBJECT:
          serviceImpl.bindBillableObject((yandex.cloud.api.billing.v1.BillingAccountServiceOuterClass.BindBillableObjectRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_ACCESS_BINDINGS:
          serviceImpl.listAccessBindings((yandex.cloud.api.access.Access.ListAccessBindingsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.access.Access.ListAccessBindingsResponse>) responseObserver);
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

  private static abstract class BillingAccountServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BillingAccountServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.billing.v1.BillingAccountServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BillingAccountService");
    }
  }

  private static final class BillingAccountServiceFileDescriptorSupplier
      extends BillingAccountServiceBaseDescriptorSupplier {
    BillingAccountServiceFileDescriptorSupplier() {}
  }

  private static final class BillingAccountServiceMethodDescriptorSupplier
      extends BillingAccountServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BillingAccountServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (BillingAccountServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BillingAccountServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getListBillableObjectBindingsMethod())
              .addMethod(getBindBillableObjectMethod())
              .addMethod(getListAccessBindingsMethod())
              .addMethod(getUpdateAccessBindingsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
