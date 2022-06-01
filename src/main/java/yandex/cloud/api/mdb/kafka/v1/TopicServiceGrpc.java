package yandex.cloud.api.mdb.kafka.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing Kafka topics.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/mdb/kafka/v1/topic_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TopicServiceGrpc {

  private TopicServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.mdb.kafka.v1.TopicService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.kafka.v1.TopicServiceOuterClass.GetTopicRequest,
      yandex.cloud.api.mdb.kafka.v1.TopicOuterClass.Topic> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.mdb.kafka.v1.TopicServiceOuterClass.GetTopicRequest.class,
      responseType = yandex.cloud.api.mdb.kafka.v1.TopicOuterClass.Topic.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.kafka.v1.TopicServiceOuterClass.GetTopicRequest,
      yandex.cloud.api.mdb.kafka.v1.TopicOuterClass.Topic> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.kafka.v1.TopicServiceOuterClass.GetTopicRequest, yandex.cloud.api.mdb.kafka.v1.TopicOuterClass.Topic> getGetMethod;
    if ((getGetMethod = TopicServiceGrpc.getGetMethod) == null) {
      synchronized (TopicServiceGrpc.class) {
        if ((getGetMethod = TopicServiceGrpc.getGetMethod) == null) {
          TopicServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.kafka.v1.TopicServiceOuterClass.GetTopicRequest, yandex.cloud.api.mdb.kafka.v1.TopicOuterClass.Topic>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.kafka.v1.TopicServiceOuterClass.GetTopicRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.kafka.v1.TopicOuterClass.Topic.getDefaultInstance()))
              .setSchemaDescriptor(new TopicServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.kafka.v1.TopicServiceOuterClass.ListTopicsRequest,
      yandex.cloud.api.mdb.kafka.v1.TopicServiceOuterClass.ListTopicsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.mdb.kafka.v1.TopicServiceOuterClass.ListTopicsRequest.class,
      responseType = yandex.cloud.api.mdb.kafka.v1.TopicServiceOuterClass.ListTopicsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.kafka.v1.TopicServiceOuterClass.ListTopicsRequest,
      yandex.cloud.api.mdb.kafka.v1.TopicServiceOuterClass.ListTopicsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.kafka.v1.TopicServiceOuterClass.ListTopicsRequest, yandex.cloud.api.mdb.kafka.v1.TopicServiceOuterClass.ListTopicsResponse> getListMethod;
    if ((getListMethod = TopicServiceGrpc.getListMethod) == null) {
      synchronized (TopicServiceGrpc.class) {
        if ((getListMethod = TopicServiceGrpc.getListMethod) == null) {
          TopicServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.kafka.v1.TopicServiceOuterClass.ListTopicsRequest, yandex.cloud.api.mdb.kafka.v1.TopicServiceOuterClass.ListTopicsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.kafka.v1.TopicServiceOuterClass.ListTopicsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.kafka.v1.TopicServiceOuterClass.ListTopicsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TopicServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.kafka.v1.TopicServiceOuterClass.CreateTopicRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.mdb.kafka.v1.TopicServiceOuterClass.CreateTopicRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.kafka.v1.TopicServiceOuterClass.CreateTopicRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.kafka.v1.TopicServiceOuterClass.CreateTopicRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = TopicServiceGrpc.getCreateMethod) == null) {
      synchronized (TopicServiceGrpc.class) {
        if ((getCreateMethod = TopicServiceGrpc.getCreateMethod) == null) {
          TopicServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.kafka.v1.TopicServiceOuterClass.CreateTopicRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.kafka.v1.TopicServiceOuterClass.CreateTopicRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new TopicServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.kafka.v1.TopicServiceOuterClass.UpdateTopicRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.mdb.kafka.v1.TopicServiceOuterClass.UpdateTopicRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.kafka.v1.TopicServiceOuterClass.UpdateTopicRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.kafka.v1.TopicServiceOuterClass.UpdateTopicRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = TopicServiceGrpc.getUpdateMethod) == null) {
      synchronized (TopicServiceGrpc.class) {
        if ((getUpdateMethod = TopicServiceGrpc.getUpdateMethod) == null) {
          TopicServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.kafka.v1.TopicServiceOuterClass.UpdateTopicRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.kafka.v1.TopicServiceOuterClass.UpdateTopicRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new TopicServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.kafka.v1.TopicServiceOuterClass.DeleteTopicRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.mdb.kafka.v1.TopicServiceOuterClass.DeleteTopicRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.kafka.v1.TopicServiceOuterClass.DeleteTopicRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.kafka.v1.TopicServiceOuterClass.DeleteTopicRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = TopicServiceGrpc.getDeleteMethod) == null) {
      synchronized (TopicServiceGrpc.class) {
        if ((getDeleteMethod = TopicServiceGrpc.getDeleteMethod) == null) {
          TopicServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.kafka.v1.TopicServiceOuterClass.DeleteTopicRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.kafka.v1.TopicServiceOuterClass.DeleteTopicRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new TopicServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TopicServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TopicServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TopicServiceStub>() {
        @java.lang.Override
        public TopicServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TopicServiceStub(channel, callOptions);
        }
      };
    return TopicServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TopicServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TopicServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TopicServiceBlockingStub>() {
        @java.lang.Override
        public TopicServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TopicServiceBlockingStub(channel, callOptions);
        }
      };
    return TopicServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TopicServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TopicServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TopicServiceFutureStub>() {
        @java.lang.Override
        public TopicServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TopicServiceFutureStub(channel, callOptions);
        }
      };
    return TopicServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing Kafka topics.
   * </pre>
   */
  public static abstract class TopicServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified Kafka topic.
     * To get the list of available Kafka topics, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.mdb.kafka.v1.TopicServiceOuterClass.GetTopicRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.kafka.v1.TopicOuterClass.Topic> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of Kafka topics in the specified cluster.
     * </pre>
     */
    public void list(yandex.cloud.api.mdb.kafka.v1.TopicServiceOuterClass.ListTopicsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.kafka.v1.TopicServiceOuterClass.ListTopicsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a new Kafka topic in the specified cluster.
     * </pre>
     */
    public void create(yandex.cloud.api.mdb.kafka.v1.TopicServiceOuterClass.CreateTopicRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified Kafka topic.
     * </pre>
     */
    public void update(yandex.cloud.api.mdb.kafka.v1.TopicServiceOuterClass.UpdateTopicRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified Kafka topic.
     * </pre>
     */
    public void delete(yandex.cloud.api.mdb.kafka.v1.TopicServiceOuterClass.DeleteTopicRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.kafka.v1.TopicServiceOuterClass.GetTopicRequest,
                yandex.cloud.api.mdb.kafka.v1.TopicOuterClass.Topic>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.kafka.v1.TopicServiceOuterClass.ListTopicsRequest,
                yandex.cloud.api.mdb.kafka.v1.TopicServiceOuterClass.ListTopicsResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.kafka.v1.TopicServiceOuterClass.CreateTopicRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.kafka.v1.TopicServiceOuterClass.UpdateTopicRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.kafka.v1.TopicServiceOuterClass.DeleteTopicRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing Kafka topics.
   * </pre>
   */
  public static final class TopicServiceStub extends io.grpc.stub.AbstractAsyncStub<TopicServiceStub> {
    private TopicServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TopicServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TopicServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified Kafka topic.
     * To get the list of available Kafka topics, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.mdb.kafka.v1.TopicServiceOuterClass.GetTopicRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.kafka.v1.TopicOuterClass.Topic> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of Kafka topics in the specified cluster.
     * </pre>
     */
    public void list(yandex.cloud.api.mdb.kafka.v1.TopicServiceOuterClass.ListTopicsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.kafka.v1.TopicServiceOuterClass.ListTopicsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a new Kafka topic in the specified cluster.
     * </pre>
     */
    public void create(yandex.cloud.api.mdb.kafka.v1.TopicServiceOuterClass.CreateTopicRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified Kafka topic.
     * </pre>
     */
    public void update(yandex.cloud.api.mdb.kafka.v1.TopicServiceOuterClass.UpdateTopicRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified Kafka topic.
     * </pre>
     */
    public void delete(yandex.cloud.api.mdb.kafka.v1.TopicServiceOuterClass.DeleteTopicRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Kafka topics.
   * </pre>
   */
  public static final class TopicServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<TopicServiceBlockingStub> {
    private TopicServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TopicServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TopicServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified Kafka topic.
     * To get the list of available Kafka topics, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.mdb.kafka.v1.TopicOuterClass.Topic get(yandex.cloud.api.mdb.kafka.v1.TopicServiceOuterClass.GetTopicRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of Kafka topics in the specified cluster.
     * </pre>
     */
    public yandex.cloud.api.mdb.kafka.v1.TopicServiceOuterClass.ListTopicsResponse list(yandex.cloud.api.mdb.kafka.v1.TopicServiceOuterClass.ListTopicsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new Kafka topic in the specified cluster.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.mdb.kafka.v1.TopicServiceOuterClass.CreateTopicRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified Kafka topic.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.mdb.kafka.v1.TopicServiceOuterClass.UpdateTopicRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified Kafka topic.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.mdb.kafka.v1.TopicServiceOuterClass.DeleteTopicRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Kafka topics.
   * </pre>
   */
  public static final class TopicServiceFutureStub extends io.grpc.stub.AbstractFutureStub<TopicServiceFutureStub> {
    private TopicServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TopicServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TopicServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified Kafka topic.
     * To get the list of available Kafka topics, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.mdb.kafka.v1.TopicOuterClass.Topic> get(
        yandex.cloud.api.mdb.kafka.v1.TopicServiceOuterClass.GetTopicRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of Kafka topics in the specified cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.mdb.kafka.v1.TopicServiceOuterClass.ListTopicsResponse> list(
        yandex.cloud.api.mdb.kafka.v1.TopicServiceOuterClass.ListTopicsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a new Kafka topic in the specified cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.mdb.kafka.v1.TopicServiceOuterClass.CreateTopicRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified Kafka topic.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.mdb.kafka.v1.TopicServiceOuterClass.UpdateTopicRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified Kafka topic.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.mdb.kafka.v1.TopicServiceOuterClass.DeleteTopicRequest request) {
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
    private final TopicServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TopicServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.mdb.kafka.v1.TopicServiceOuterClass.GetTopicRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.kafka.v1.TopicOuterClass.Topic>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.mdb.kafka.v1.TopicServiceOuterClass.ListTopicsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.kafka.v1.TopicServiceOuterClass.ListTopicsResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.mdb.kafka.v1.TopicServiceOuterClass.CreateTopicRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.mdb.kafka.v1.TopicServiceOuterClass.UpdateTopicRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.mdb.kafka.v1.TopicServiceOuterClass.DeleteTopicRequest) request,
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

  private static abstract class TopicServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TopicServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.mdb.kafka.v1.TopicServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TopicService");
    }
  }

  private static final class TopicServiceFileDescriptorSupplier
      extends TopicServiceBaseDescriptorSupplier {
    TopicServiceFileDescriptorSupplier() {}
  }

  private static final class TopicServiceMethodDescriptorSupplier
      extends TopicServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TopicServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TopicServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TopicServiceFileDescriptorSupplier())
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
