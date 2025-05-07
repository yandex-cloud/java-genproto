package yandex.cloud.api.ai.batch_inference.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/ai/batch_inference/v1/batch_inference_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BatchInferenceServiceGrpc {

  private BatchInferenceServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.ai.batch_inference.v1.BatchInferenceService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.DescribeBatchInferenceRequest,
      yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.DescribeBatchInferenceResponse> getDescribeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Describe",
      requestType = yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.DescribeBatchInferenceRequest.class,
      responseType = yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.DescribeBatchInferenceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.DescribeBatchInferenceRequest,
      yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.DescribeBatchInferenceResponse> getDescribeMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.DescribeBatchInferenceRequest, yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.DescribeBatchInferenceResponse> getDescribeMethod;
    if ((getDescribeMethod = BatchInferenceServiceGrpc.getDescribeMethod) == null) {
      synchronized (BatchInferenceServiceGrpc.class) {
        if ((getDescribeMethod = BatchInferenceServiceGrpc.getDescribeMethod) == null) {
          BatchInferenceServiceGrpc.getDescribeMethod = getDescribeMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.DescribeBatchInferenceRequest, yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.DescribeBatchInferenceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Describe"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.DescribeBatchInferenceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.DescribeBatchInferenceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BatchInferenceServiceMethodDescriptorSupplier("Describe"))
              .build();
        }
      }
    }
    return getDescribeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.ListBatchInferencesRequest,
      yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.ListBatchInferencesResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.ListBatchInferencesRequest.class,
      responseType = yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.ListBatchInferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.ListBatchInferencesRequest,
      yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.ListBatchInferencesResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.ListBatchInferencesRequest, yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.ListBatchInferencesResponse> getListMethod;
    if ((getListMethod = BatchInferenceServiceGrpc.getListMethod) == null) {
      synchronized (BatchInferenceServiceGrpc.class) {
        if ((getListMethod = BatchInferenceServiceGrpc.getListMethod) == null) {
          BatchInferenceServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.ListBatchInferencesRequest, yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.ListBatchInferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.ListBatchInferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.ListBatchInferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BatchInferenceServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.CancelBatchInferenceRequest,
      yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.CancelBatchInferenceResponse> getCancelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Cancel",
      requestType = yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.CancelBatchInferenceRequest.class,
      responseType = yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.CancelBatchInferenceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.CancelBatchInferenceRequest,
      yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.CancelBatchInferenceResponse> getCancelMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.CancelBatchInferenceRequest, yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.CancelBatchInferenceResponse> getCancelMethod;
    if ((getCancelMethod = BatchInferenceServiceGrpc.getCancelMethod) == null) {
      synchronized (BatchInferenceServiceGrpc.class) {
        if ((getCancelMethod = BatchInferenceServiceGrpc.getCancelMethod) == null) {
          BatchInferenceServiceGrpc.getCancelMethod = getCancelMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.CancelBatchInferenceRequest, yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.CancelBatchInferenceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Cancel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.CancelBatchInferenceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.CancelBatchInferenceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BatchInferenceServiceMethodDescriptorSupplier("Cancel"))
              .build();
        }
      }
    }
    return getCancelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.DeleteBatchInferenceRequest,
      yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.DeleteBatchInferenceResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.DeleteBatchInferenceRequest.class,
      responseType = yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.DeleteBatchInferenceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.DeleteBatchInferenceRequest,
      yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.DeleteBatchInferenceResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.DeleteBatchInferenceRequest, yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.DeleteBatchInferenceResponse> getDeleteMethod;
    if ((getDeleteMethod = BatchInferenceServiceGrpc.getDeleteMethod) == null) {
      synchronized (BatchInferenceServiceGrpc.class) {
        if ((getDeleteMethod = BatchInferenceServiceGrpc.getDeleteMethod) == null) {
          BatchInferenceServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.DeleteBatchInferenceRequest, yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.DeleteBatchInferenceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.DeleteBatchInferenceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.DeleteBatchInferenceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BatchInferenceServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BatchInferenceServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BatchInferenceServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BatchInferenceServiceStub>() {
        @java.lang.Override
        public BatchInferenceServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BatchInferenceServiceStub(channel, callOptions);
        }
      };
    return BatchInferenceServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BatchInferenceServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BatchInferenceServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BatchInferenceServiceBlockingStub>() {
        @java.lang.Override
        public BatchInferenceServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BatchInferenceServiceBlockingStub(channel, callOptions);
        }
      };
    return BatchInferenceServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BatchInferenceServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BatchInferenceServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BatchInferenceServiceFutureStub>() {
        @java.lang.Override
        public BatchInferenceServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BatchInferenceServiceFutureStub(channel, callOptions);
        }
      };
    return BatchInferenceServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class BatchInferenceServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Describes a concrete task
     * </pre>
     */
    public void describe(yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.DescribeBatchInferenceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.DescribeBatchInferenceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDescribeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists tasks in folder
     * </pre>
     */
    public void list(yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.ListBatchInferencesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.ListBatchInferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Cancels a concrete task
     * </pre>
     */
    public void cancel(yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.CancelBatchInferenceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.CancelBatchInferenceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes a concrete task
     * </pre>
     */
    public void delete(yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.DeleteBatchInferenceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.DeleteBatchInferenceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDescribeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.DescribeBatchInferenceRequest,
                yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.DescribeBatchInferenceResponse>(
                  this, METHODID_DESCRIBE)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.ListBatchInferencesRequest,
                yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.ListBatchInferencesResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCancelMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.CancelBatchInferenceRequest,
                yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.CancelBatchInferenceResponse>(
                  this, METHODID_CANCEL)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.DeleteBatchInferenceRequest,
                yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.DeleteBatchInferenceResponse>(
                  this, METHODID_DELETE)))
          .build();
    }
  }

  /**
   */
  public static final class BatchInferenceServiceStub extends io.grpc.stub.AbstractAsyncStub<BatchInferenceServiceStub> {
    private BatchInferenceServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BatchInferenceServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BatchInferenceServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Describes a concrete task
     * </pre>
     */
    public void describe(yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.DescribeBatchInferenceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.DescribeBatchInferenceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDescribeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists tasks in folder
     * </pre>
     */
    public void list(yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.ListBatchInferencesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.ListBatchInferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Cancels a concrete task
     * </pre>
     */
    public void cancel(yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.CancelBatchInferenceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.CancelBatchInferenceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a concrete task
     * </pre>
     */
    public void delete(yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.DeleteBatchInferenceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.DeleteBatchInferenceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class BatchInferenceServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<BatchInferenceServiceBlockingStub> {
    private BatchInferenceServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BatchInferenceServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BatchInferenceServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Describes a concrete task
     * </pre>
     */
    public yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.DescribeBatchInferenceResponse describe(yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.DescribeBatchInferenceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDescribeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists tasks in folder
     * </pre>
     */
    public yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.ListBatchInferencesResponse list(yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.ListBatchInferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Cancels a concrete task
     * </pre>
     */
    public yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.CancelBatchInferenceResponse cancel(yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.CancelBatchInferenceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a concrete task
     * </pre>
     */
    public yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.DeleteBatchInferenceResponse delete(yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.DeleteBatchInferenceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BatchInferenceServiceFutureStub extends io.grpc.stub.AbstractFutureStub<BatchInferenceServiceFutureStub> {
    private BatchInferenceServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BatchInferenceServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BatchInferenceServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Describes a concrete task
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.DescribeBatchInferenceResponse> describe(
        yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.DescribeBatchInferenceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDescribeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists tasks in folder
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.ListBatchInferencesResponse> list(
        yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.ListBatchInferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Cancels a concrete task
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.CancelBatchInferenceResponse> cancel(
        yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.CancelBatchInferenceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a concrete task
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.DeleteBatchInferenceResponse> delete(
        yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.DeleteBatchInferenceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DESCRIBE = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_CANCEL = 2;
  private static final int METHODID_DELETE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BatchInferenceServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BatchInferenceServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DESCRIBE:
          serviceImpl.describe((yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.DescribeBatchInferenceRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.DescribeBatchInferenceResponse>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.ListBatchInferencesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.ListBatchInferencesResponse>) responseObserver);
          break;
        case METHODID_CANCEL:
          serviceImpl.cancel((yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.CancelBatchInferenceRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.CancelBatchInferenceResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.DeleteBatchInferenceRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.DeleteBatchInferenceResponse>) responseObserver);
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

  private static abstract class BatchInferenceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BatchInferenceServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.ai.batch_inference.v1.BatchInferenceServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BatchInferenceService");
    }
  }

  private static final class BatchInferenceServiceFileDescriptorSupplier
      extends BatchInferenceServiceBaseDescriptorSupplier {
    BatchInferenceServiceFileDescriptorSupplier() {}
  }

  private static final class BatchInferenceServiceMethodDescriptorSupplier
      extends BatchInferenceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BatchInferenceServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (BatchInferenceServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BatchInferenceServiceFileDescriptorSupplier())
              .addMethod(getDescribeMethod())
              .addMethod(getListMethod())
              .addMethod(getCancelMethod())
              .addMethod(getDeleteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
