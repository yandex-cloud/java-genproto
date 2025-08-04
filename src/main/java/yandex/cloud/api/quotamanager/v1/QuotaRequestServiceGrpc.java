package yandex.cloud.api.quotamanager.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing quota requests.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/quotamanager/v1/quota_request_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QuotaRequestServiceGrpc {

  private QuotaRequestServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.quotamanager.v1.QuotaRequestService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.GetQuotaRequestRequest,
      yandex.cloud.api.quotamanager.v1.QuotaRequestOuterClass.QuotaRequest> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.GetQuotaRequestRequest.class,
      responseType = yandex.cloud.api.quotamanager.v1.QuotaRequestOuterClass.QuotaRequest.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.GetQuotaRequestRequest,
      yandex.cloud.api.quotamanager.v1.QuotaRequestOuterClass.QuotaRequest> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.GetQuotaRequestRequest, yandex.cloud.api.quotamanager.v1.QuotaRequestOuterClass.QuotaRequest> getGetMethod;
    if ((getGetMethod = QuotaRequestServiceGrpc.getGetMethod) == null) {
      synchronized (QuotaRequestServiceGrpc.class) {
        if ((getGetMethod = QuotaRequestServiceGrpc.getGetMethod) == null) {
          QuotaRequestServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.GetQuotaRequestRequest, yandex.cloud.api.quotamanager.v1.QuotaRequestOuterClass.QuotaRequest>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.GetQuotaRequestRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.quotamanager.v1.QuotaRequestOuterClass.QuotaRequest.getDefaultInstance()))
              .setSchemaDescriptor(new QuotaRequestServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.CreateQuotaRequestRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.CreateQuotaRequestRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.CreateQuotaRequestRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.CreateQuotaRequestRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = QuotaRequestServiceGrpc.getCreateMethod) == null) {
      synchronized (QuotaRequestServiceGrpc.class) {
        if ((getCreateMethod = QuotaRequestServiceGrpc.getCreateMethod) == null) {
          QuotaRequestServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.CreateQuotaRequestRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.CreateQuotaRequestRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new QuotaRequestServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.CancelQuotaRequestRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCancelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Cancel",
      requestType = yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.CancelQuotaRequestRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.CancelQuotaRequestRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCancelMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.CancelQuotaRequestRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCancelMethod;
    if ((getCancelMethod = QuotaRequestServiceGrpc.getCancelMethod) == null) {
      synchronized (QuotaRequestServiceGrpc.class) {
        if ((getCancelMethod = QuotaRequestServiceGrpc.getCancelMethod) == null) {
          QuotaRequestServiceGrpc.getCancelMethod = getCancelMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.CancelQuotaRequestRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Cancel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.CancelQuotaRequestRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new QuotaRequestServiceMethodDescriptorSupplier("Cancel"))
              .build();
        }
      }
    }
    return getCancelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.ListQuotaRequestRequest,
      yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.ListQuotaRequestResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.ListQuotaRequestRequest.class,
      responseType = yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.ListQuotaRequestResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.ListQuotaRequestRequest,
      yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.ListQuotaRequestResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.ListQuotaRequestRequest, yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.ListQuotaRequestResponse> getListMethod;
    if ((getListMethod = QuotaRequestServiceGrpc.getListMethod) == null) {
      synchronized (QuotaRequestServiceGrpc.class) {
        if ((getListMethod = QuotaRequestServiceGrpc.getListMethod) == null) {
          QuotaRequestServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.ListQuotaRequestRequest, yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.ListQuotaRequestResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.ListQuotaRequestRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.ListQuotaRequestResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QuotaRequestServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.ListQuotaRequestOperationsRequest,
      yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.ListQuotaRequestOperationsResponse> getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.ListQuotaRequestOperationsRequest.class,
      responseType = yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.ListQuotaRequestOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.ListQuotaRequestOperationsRequest,
      yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.ListQuotaRequestOperationsResponse> getListOperationsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.ListQuotaRequestOperationsRequest, yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.ListQuotaRequestOperationsResponse> getListOperationsMethod;
    if ((getListOperationsMethod = QuotaRequestServiceGrpc.getListOperationsMethod) == null) {
      synchronized (QuotaRequestServiceGrpc.class) {
        if ((getListOperationsMethod = QuotaRequestServiceGrpc.getListOperationsMethod) == null) {
          QuotaRequestServiceGrpc.getListOperationsMethod = getListOperationsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.ListQuotaRequestOperationsRequest, yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.ListQuotaRequestOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.ListQuotaRequestOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.ListQuotaRequestOperationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QuotaRequestServiceMethodDescriptorSupplier("ListOperations"))
              .build();
        }
      }
    }
    return getListOperationsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static QuotaRequestServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QuotaRequestServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QuotaRequestServiceStub>() {
        @java.lang.Override
        public QuotaRequestServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QuotaRequestServiceStub(channel, callOptions);
        }
      };
    return QuotaRequestServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static QuotaRequestServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QuotaRequestServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QuotaRequestServiceBlockingStub>() {
        @java.lang.Override
        public QuotaRequestServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QuotaRequestServiceBlockingStub(channel, callOptions);
        }
      };
    return QuotaRequestServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static QuotaRequestServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QuotaRequestServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QuotaRequestServiceFutureStub>() {
        @java.lang.Override
        public QuotaRequestServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QuotaRequestServiceFutureStub(channel, callOptions);
        }
      };
    return QuotaRequestServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing quota requests.
   * </pre>
   */
  public static abstract class QuotaRequestServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified quota request.
     * </pre>
     */
    public void get(yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.GetQuotaRequestRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.quotamanager.v1.QuotaRequestOuterClass.QuotaRequest> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a quota request in the specified resource.
     * </pre>
     */
    public void create(yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.CreateQuotaRequestRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Cancels quotas in the specified quota request.
     * </pre>
     */
    public void cancel(yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.CancelQuotaRequestRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of quota requests in the specified resource.
     * </pre>
     */
    public void list(yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.ListQuotaRequestRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.ListQuotaRequestResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified quota request.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.ListQuotaRequestOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.ListQuotaRequestOperationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.GetQuotaRequestRequest,
                yandex.cloud.api.quotamanager.v1.QuotaRequestOuterClass.QuotaRequest>(
                  this, METHODID_GET)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.CreateQuotaRequestRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getCancelMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.CancelQuotaRequestRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CANCEL)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.ListQuotaRequestRequest,
                yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.ListQuotaRequestResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getListOperationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.ListQuotaRequestOperationsRequest,
                yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.ListQuotaRequestOperationsResponse>(
                  this, METHODID_LIST_OPERATIONS)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing quota requests.
   * </pre>
   */
  public static final class QuotaRequestServiceStub extends io.grpc.stub.AbstractAsyncStub<QuotaRequestServiceStub> {
    private QuotaRequestServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QuotaRequestServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QuotaRequestServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified quota request.
     * </pre>
     */
    public void get(yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.GetQuotaRequestRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.quotamanager.v1.QuotaRequestOuterClass.QuotaRequest> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a quota request in the specified resource.
     * </pre>
     */
    public void create(yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.CreateQuotaRequestRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Cancels quotas in the specified quota request.
     * </pre>
     */
    public void cancel(yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.CancelQuotaRequestRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of quota requests in the specified resource.
     * </pre>
     */
    public void list(yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.ListQuotaRequestRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.ListQuotaRequestResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified quota request.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.ListQuotaRequestOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.ListQuotaRequestOperationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing quota requests.
   * </pre>
   */
  public static final class QuotaRequestServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<QuotaRequestServiceBlockingStub> {
    private QuotaRequestServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QuotaRequestServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QuotaRequestServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified quota request.
     * </pre>
     */
    public yandex.cloud.api.quotamanager.v1.QuotaRequestOuterClass.QuotaRequest get(yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.GetQuotaRequestRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a quota request in the specified resource.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.CreateQuotaRequestRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Cancels quotas in the specified quota request.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation cancel(yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.CancelQuotaRequestRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of quota requests in the specified resource.
     * </pre>
     */
    public yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.ListQuotaRequestResponse list(yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.ListQuotaRequestRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists operations for the specified quota request.
     * </pre>
     */
    public yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.ListQuotaRequestOperationsResponse listOperations(yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.ListQuotaRequestOperationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing quota requests.
   * </pre>
   */
  public static final class QuotaRequestServiceFutureStub extends io.grpc.stub.AbstractFutureStub<QuotaRequestServiceFutureStub> {
    private QuotaRequestServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QuotaRequestServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QuotaRequestServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified quota request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.quotamanager.v1.QuotaRequestOuterClass.QuotaRequest> get(
        yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.GetQuotaRequestRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a quota request in the specified resource.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.CreateQuotaRequestRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Cancels quotas in the specified quota request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> cancel(
        yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.CancelQuotaRequestRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of quota requests in the specified resource.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.ListQuotaRequestResponse> list(
        yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.ListQuotaRequestRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists operations for the specified quota request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.ListQuotaRequestOperationsResponse> listOperations(
        yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.ListQuotaRequestOperationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_CREATE = 1;
  private static final int METHODID_CANCEL = 2;
  private static final int METHODID_LIST = 3;
  private static final int METHODID_LIST_OPERATIONS = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final QuotaRequestServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(QuotaRequestServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.GetQuotaRequestRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.quotamanager.v1.QuotaRequestOuterClass.QuotaRequest>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.CreateQuotaRequestRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_CANCEL:
          serviceImpl.cancel((yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.CancelQuotaRequestRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.ListQuotaRequestRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.ListQuotaRequestResponse>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.ListQuotaRequestOperationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.ListQuotaRequestOperationsResponse>) responseObserver);
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

  private static abstract class QuotaRequestServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QuotaRequestServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.quotamanager.v1.QuotaRequestServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("QuotaRequestService");
    }
  }

  private static final class QuotaRequestServiceFileDescriptorSupplier
      extends QuotaRequestServiceBaseDescriptorSupplier {
    QuotaRequestServiceFileDescriptorSupplier() {}
  }

  private static final class QuotaRequestServiceMethodDescriptorSupplier
      extends QuotaRequestServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    QuotaRequestServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (QuotaRequestServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new QuotaRequestServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getCreateMethod())
              .addMethod(getCancelMethod())
              .addMethod(getListMethod())
              .addMethod(getListOperationsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
