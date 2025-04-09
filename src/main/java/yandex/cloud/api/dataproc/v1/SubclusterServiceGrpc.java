package yandex.cloud.api.dataproc.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing Yandex Data Processing subclusters.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/dataproc/v1/subcluster_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SubclusterServiceGrpc {

  private SubclusterServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.dataproc.v1.SubclusterService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.dataproc.v1.SubclusterServiceOuterClass.GetSubclusterRequest,
      yandex.cloud.api.dataproc.v1.SubclusterOuterClass.Subcluster> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.dataproc.v1.SubclusterServiceOuterClass.GetSubclusterRequest.class,
      responseType = yandex.cloud.api.dataproc.v1.SubclusterOuterClass.Subcluster.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.dataproc.v1.SubclusterServiceOuterClass.GetSubclusterRequest,
      yandex.cloud.api.dataproc.v1.SubclusterOuterClass.Subcluster> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.dataproc.v1.SubclusterServiceOuterClass.GetSubclusterRequest, yandex.cloud.api.dataproc.v1.SubclusterOuterClass.Subcluster> getGetMethod;
    if ((getGetMethod = SubclusterServiceGrpc.getGetMethod) == null) {
      synchronized (SubclusterServiceGrpc.class) {
        if ((getGetMethod = SubclusterServiceGrpc.getGetMethod) == null) {
          SubclusterServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.dataproc.v1.SubclusterServiceOuterClass.GetSubclusterRequest, yandex.cloud.api.dataproc.v1.SubclusterOuterClass.Subcluster>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.dataproc.v1.SubclusterServiceOuterClass.GetSubclusterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.dataproc.v1.SubclusterOuterClass.Subcluster.getDefaultInstance()))
              .setSchemaDescriptor(new SubclusterServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.dataproc.v1.SubclusterServiceOuterClass.ListSubclustersRequest,
      yandex.cloud.api.dataproc.v1.SubclusterServiceOuterClass.ListSubclustersResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.dataproc.v1.SubclusterServiceOuterClass.ListSubclustersRequest.class,
      responseType = yandex.cloud.api.dataproc.v1.SubclusterServiceOuterClass.ListSubclustersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.dataproc.v1.SubclusterServiceOuterClass.ListSubclustersRequest,
      yandex.cloud.api.dataproc.v1.SubclusterServiceOuterClass.ListSubclustersResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.dataproc.v1.SubclusterServiceOuterClass.ListSubclustersRequest, yandex.cloud.api.dataproc.v1.SubclusterServiceOuterClass.ListSubclustersResponse> getListMethod;
    if ((getListMethod = SubclusterServiceGrpc.getListMethod) == null) {
      synchronized (SubclusterServiceGrpc.class) {
        if ((getListMethod = SubclusterServiceGrpc.getListMethod) == null) {
          SubclusterServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.dataproc.v1.SubclusterServiceOuterClass.ListSubclustersRequest, yandex.cloud.api.dataproc.v1.SubclusterServiceOuterClass.ListSubclustersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.dataproc.v1.SubclusterServiceOuterClass.ListSubclustersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.dataproc.v1.SubclusterServiceOuterClass.ListSubclustersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SubclusterServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.dataproc.v1.SubclusterServiceOuterClass.CreateSubclusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.dataproc.v1.SubclusterServiceOuterClass.CreateSubclusterRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.dataproc.v1.SubclusterServiceOuterClass.CreateSubclusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.dataproc.v1.SubclusterServiceOuterClass.CreateSubclusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = SubclusterServiceGrpc.getCreateMethod) == null) {
      synchronized (SubclusterServiceGrpc.class) {
        if ((getCreateMethod = SubclusterServiceGrpc.getCreateMethod) == null) {
          SubclusterServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.dataproc.v1.SubclusterServiceOuterClass.CreateSubclusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.dataproc.v1.SubclusterServiceOuterClass.CreateSubclusterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new SubclusterServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.dataproc.v1.SubclusterServiceOuterClass.UpdateSubclusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.dataproc.v1.SubclusterServiceOuterClass.UpdateSubclusterRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.dataproc.v1.SubclusterServiceOuterClass.UpdateSubclusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.dataproc.v1.SubclusterServiceOuterClass.UpdateSubclusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = SubclusterServiceGrpc.getUpdateMethod) == null) {
      synchronized (SubclusterServiceGrpc.class) {
        if ((getUpdateMethod = SubclusterServiceGrpc.getUpdateMethod) == null) {
          SubclusterServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.dataproc.v1.SubclusterServiceOuterClass.UpdateSubclusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.dataproc.v1.SubclusterServiceOuterClass.UpdateSubclusterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new SubclusterServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.dataproc.v1.SubclusterServiceOuterClass.DeleteSubclusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.dataproc.v1.SubclusterServiceOuterClass.DeleteSubclusterRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.dataproc.v1.SubclusterServiceOuterClass.DeleteSubclusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.dataproc.v1.SubclusterServiceOuterClass.DeleteSubclusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = SubclusterServiceGrpc.getDeleteMethod) == null) {
      synchronized (SubclusterServiceGrpc.class) {
        if ((getDeleteMethod = SubclusterServiceGrpc.getDeleteMethod) == null) {
          SubclusterServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.dataproc.v1.SubclusterServiceOuterClass.DeleteSubclusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.dataproc.v1.SubclusterServiceOuterClass.DeleteSubclusterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new SubclusterServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SubclusterServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SubclusterServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SubclusterServiceStub>() {
        @java.lang.Override
        public SubclusterServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SubclusterServiceStub(channel, callOptions);
        }
      };
    return SubclusterServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SubclusterServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SubclusterServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SubclusterServiceBlockingStub>() {
        @java.lang.Override
        public SubclusterServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SubclusterServiceBlockingStub(channel, callOptions);
        }
      };
    return SubclusterServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SubclusterServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SubclusterServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SubclusterServiceFutureStub>() {
        @java.lang.Override
        public SubclusterServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SubclusterServiceFutureStub(channel, callOptions);
        }
      };
    return SubclusterServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing Yandex Data Processing subclusters.
   * </pre>
   */
  public static abstract class SubclusterServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified subcluster.
     * To get the list of all available subclusters, make a [SubclusterService.List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.dataproc.v1.SubclusterServiceOuterClass.GetSubclusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.dataproc.v1.SubclusterOuterClass.Subcluster> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves a list of subclusters in the specified cluster.
     * </pre>
     */
    public void list(yandex.cloud.api.dataproc.v1.SubclusterServiceOuterClass.ListSubclustersRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.dataproc.v1.SubclusterServiceOuterClass.ListSubclustersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a subcluster in the specified cluster.
     * </pre>
     */
    public void create(yandex.cloud.api.dataproc.v1.SubclusterServiceOuterClass.CreateSubclusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified subcluster.
     * </pre>
     */
    public void update(yandex.cloud.api.dataproc.v1.SubclusterServiceOuterClass.UpdateSubclusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified subcluster.
     * </pre>
     */
    public void delete(yandex.cloud.api.dataproc.v1.SubclusterServiceOuterClass.DeleteSubclusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.dataproc.v1.SubclusterServiceOuterClass.GetSubclusterRequest,
                yandex.cloud.api.dataproc.v1.SubclusterOuterClass.Subcluster>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.dataproc.v1.SubclusterServiceOuterClass.ListSubclustersRequest,
                yandex.cloud.api.dataproc.v1.SubclusterServiceOuterClass.ListSubclustersResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.dataproc.v1.SubclusterServiceOuterClass.CreateSubclusterRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.dataproc.v1.SubclusterServiceOuterClass.UpdateSubclusterRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.dataproc.v1.SubclusterServiceOuterClass.DeleteSubclusterRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing Yandex Data Processing subclusters.
   * </pre>
   */
  public static final class SubclusterServiceStub extends io.grpc.stub.AbstractAsyncStub<SubclusterServiceStub> {
    private SubclusterServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SubclusterServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SubclusterServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified subcluster.
     * To get the list of all available subclusters, make a [SubclusterService.List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.dataproc.v1.SubclusterServiceOuterClass.GetSubclusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.dataproc.v1.SubclusterOuterClass.Subcluster> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves a list of subclusters in the specified cluster.
     * </pre>
     */
    public void list(yandex.cloud.api.dataproc.v1.SubclusterServiceOuterClass.ListSubclustersRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.dataproc.v1.SubclusterServiceOuterClass.ListSubclustersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a subcluster in the specified cluster.
     * </pre>
     */
    public void create(yandex.cloud.api.dataproc.v1.SubclusterServiceOuterClass.CreateSubclusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified subcluster.
     * </pre>
     */
    public void update(yandex.cloud.api.dataproc.v1.SubclusterServiceOuterClass.UpdateSubclusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified subcluster.
     * </pre>
     */
    public void delete(yandex.cloud.api.dataproc.v1.SubclusterServiceOuterClass.DeleteSubclusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Yandex Data Processing subclusters.
   * </pre>
   */
  public static final class SubclusterServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<SubclusterServiceBlockingStub> {
    private SubclusterServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SubclusterServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SubclusterServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified subcluster.
     * To get the list of all available subclusters, make a [SubclusterService.List] request.
     * </pre>
     */
    public yandex.cloud.api.dataproc.v1.SubclusterOuterClass.Subcluster get(yandex.cloud.api.dataproc.v1.SubclusterServiceOuterClass.GetSubclusterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves a list of subclusters in the specified cluster.
     * </pre>
     */
    public yandex.cloud.api.dataproc.v1.SubclusterServiceOuterClass.ListSubclustersResponse list(yandex.cloud.api.dataproc.v1.SubclusterServiceOuterClass.ListSubclustersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a subcluster in the specified cluster.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.dataproc.v1.SubclusterServiceOuterClass.CreateSubclusterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified subcluster.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.dataproc.v1.SubclusterServiceOuterClass.UpdateSubclusterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified subcluster.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.dataproc.v1.SubclusterServiceOuterClass.DeleteSubclusterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Yandex Data Processing subclusters.
   * </pre>
   */
  public static final class SubclusterServiceFutureStub extends io.grpc.stub.AbstractFutureStub<SubclusterServiceFutureStub> {
    private SubclusterServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SubclusterServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SubclusterServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified subcluster.
     * To get the list of all available subclusters, make a [SubclusterService.List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.dataproc.v1.SubclusterOuterClass.Subcluster> get(
        yandex.cloud.api.dataproc.v1.SubclusterServiceOuterClass.GetSubclusterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves a list of subclusters in the specified cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.dataproc.v1.SubclusterServiceOuterClass.ListSubclustersResponse> list(
        yandex.cloud.api.dataproc.v1.SubclusterServiceOuterClass.ListSubclustersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a subcluster in the specified cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.dataproc.v1.SubclusterServiceOuterClass.CreateSubclusterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified subcluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.dataproc.v1.SubclusterServiceOuterClass.UpdateSubclusterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified subcluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.dataproc.v1.SubclusterServiceOuterClass.DeleteSubclusterRequest request) {
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
    private final SubclusterServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SubclusterServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.dataproc.v1.SubclusterServiceOuterClass.GetSubclusterRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.dataproc.v1.SubclusterOuterClass.Subcluster>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.dataproc.v1.SubclusterServiceOuterClass.ListSubclustersRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.dataproc.v1.SubclusterServiceOuterClass.ListSubclustersResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.dataproc.v1.SubclusterServiceOuterClass.CreateSubclusterRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.dataproc.v1.SubclusterServiceOuterClass.UpdateSubclusterRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.dataproc.v1.SubclusterServiceOuterClass.DeleteSubclusterRequest) request,
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

  private static abstract class SubclusterServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SubclusterServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.dataproc.v1.SubclusterServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SubclusterService");
    }
  }

  private static final class SubclusterServiceFileDescriptorSupplier
      extends SubclusterServiceBaseDescriptorSupplier {
    SubclusterServiceFileDescriptorSupplier() {}
  }

  private static final class SubclusterServiceMethodDescriptorSupplier
      extends SubclusterServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SubclusterServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SubclusterServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SubclusterServiceFileDescriptorSupplier())
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
