package yandex.cloud.api.mdb.clickhouse.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/mdb/clickhouse/v1/cluster_extension_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ClusterExtensionServiceGrpc {

  private ClusterExtensionServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.mdb.clickhouse.v1.ClusterExtensionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.GetClusterExtensionRequest,
      yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionOuterClass.ClusterExtension> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.GetClusterExtensionRequest.class,
      responseType = yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionOuterClass.ClusterExtension.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.GetClusterExtensionRequest,
      yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionOuterClass.ClusterExtension> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.GetClusterExtensionRequest, yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionOuterClass.ClusterExtension> getGetMethod;
    if ((getGetMethod = ClusterExtensionServiceGrpc.getGetMethod) == null) {
      synchronized (ClusterExtensionServiceGrpc.class) {
        if ((getGetMethod = ClusterExtensionServiceGrpc.getGetMethod) == null) {
          ClusterExtensionServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.GetClusterExtensionRequest, yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionOuterClass.ClusterExtension>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.GetClusterExtensionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionOuterClass.ClusterExtension.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterExtensionServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.ListClusterExtensionsRequest,
      yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.ListClusterExtensionsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.ListClusterExtensionsRequest.class,
      responseType = yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.ListClusterExtensionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.ListClusterExtensionsRequest,
      yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.ListClusterExtensionsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.ListClusterExtensionsRequest, yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.ListClusterExtensionsResponse> getListMethod;
    if ((getListMethod = ClusterExtensionServiceGrpc.getListMethod) == null) {
      synchronized (ClusterExtensionServiceGrpc.class) {
        if ((getListMethod = ClusterExtensionServiceGrpc.getListMethod) == null) {
          ClusterExtensionServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.ListClusterExtensionsRequest, yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.ListClusterExtensionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.ListClusterExtensionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.ListClusterExtensionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterExtensionServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.CreateClusterExtensionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.CreateClusterExtensionRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.CreateClusterExtensionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.CreateClusterExtensionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = ClusterExtensionServiceGrpc.getCreateMethod) == null) {
      synchronized (ClusterExtensionServiceGrpc.class) {
        if ((getCreateMethod = ClusterExtensionServiceGrpc.getCreateMethod) == null) {
          ClusterExtensionServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.CreateClusterExtensionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.CreateClusterExtensionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterExtensionServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.DeleteClusterExtensionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.DeleteClusterExtensionRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.DeleteClusterExtensionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.DeleteClusterExtensionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = ClusterExtensionServiceGrpc.getDeleteMethod) == null) {
      synchronized (ClusterExtensionServiceGrpc.class) {
        if ((getDeleteMethod = ClusterExtensionServiceGrpc.getDeleteMethod) == null) {
          ClusterExtensionServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.DeleteClusterExtensionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.DeleteClusterExtensionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterExtensionServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.UpdateClusterExtensionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.UpdateClusterExtensionRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.UpdateClusterExtensionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.UpdateClusterExtensionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = ClusterExtensionServiceGrpc.getUpdateMethod) == null) {
      synchronized (ClusterExtensionServiceGrpc.class) {
        if ((getUpdateMethod = ClusterExtensionServiceGrpc.getUpdateMethod) == null) {
          ClusterExtensionServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.UpdateClusterExtensionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.UpdateClusterExtensionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterExtensionServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.SetClusterExtensionsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getSetExtensionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetExtensions",
      requestType = yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.SetClusterExtensionsRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.SetClusterExtensionsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getSetExtensionsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.SetClusterExtensionsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getSetExtensionsMethod;
    if ((getSetExtensionsMethod = ClusterExtensionServiceGrpc.getSetExtensionsMethod) == null) {
      synchronized (ClusterExtensionServiceGrpc.class) {
        if ((getSetExtensionsMethod = ClusterExtensionServiceGrpc.getSetExtensionsMethod) == null) {
          ClusterExtensionServiceGrpc.getSetExtensionsMethod = getSetExtensionsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.SetClusterExtensionsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetExtensions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.SetClusterExtensionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterExtensionServiceMethodDescriptorSupplier("SetExtensions"))
              .build();
        }
      }
    }
    return getSetExtensionsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ClusterExtensionServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClusterExtensionServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClusterExtensionServiceStub>() {
        @java.lang.Override
        public ClusterExtensionServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClusterExtensionServiceStub(channel, callOptions);
        }
      };
    return ClusterExtensionServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ClusterExtensionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClusterExtensionServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClusterExtensionServiceBlockingStub>() {
        @java.lang.Override
        public ClusterExtensionServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClusterExtensionServiceBlockingStub(channel, callOptions);
        }
      };
    return ClusterExtensionServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ClusterExtensionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClusterExtensionServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClusterExtensionServiceFutureStub>() {
        @java.lang.Override
        public ClusterExtensionServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClusterExtensionServiceFutureStub(channel, callOptions);
        }
      };
    return ClusterExtensionServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ClusterExtensionServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void get(yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.GetClusterExtensionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionOuterClass.ClusterExtension> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     */
    public void list(yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.ListClusterExtensionsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.ListClusterExtensionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     */
    public void create(yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.CreateClusterExtensionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    public void delete(yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.DeleteClusterExtensionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     */
    public void update(yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.UpdateClusterExtensionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set the list of cluster extensions. Not specified extensions will be deleted.
     * </pre>
     */
    public void setExtensions(yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.SetClusterExtensionsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetExtensionsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.GetClusterExtensionRequest,
                yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionOuterClass.ClusterExtension>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.ListClusterExtensionsRequest,
                yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.ListClusterExtensionsResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.CreateClusterExtensionRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.DeleteClusterExtensionRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.UpdateClusterExtensionRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getSetExtensionsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.SetClusterExtensionsRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_SET_EXTENSIONS)))
          .build();
    }
  }

  /**
   */
  public static final class ClusterExtensionServiceStub extends io.grpc.stub.AbstractAsyncStub<ClusterExtensionServiceStub> {
    private ClusterExtensionServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClusterExtensionServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClusterExtensionServiceStub(channel, callOptions);
    }

    /**
     */
    public void get(yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.GetClusterExtensionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionOuterClass.ClusterExtension> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void list(yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.ListClusterExtensionsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.ListClusterExtensionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void create(yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.CreateClusterExtensionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.DeleteClusterExtensionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void update(yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.UpdateClusterExtensionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set the list of cluster extensions. Not specified extensions will be deleted.
     * </pre>
     */
    public void setExtensions(yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.SetClusterExtensionsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetExtensionsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ClusterExtensionServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ClusterExtensionServiceBlockingStub> {
    private ClusterExtensionServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClusterExtensionServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClusterExtensionServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionOuterClass.ClusterExtension get(yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.GetClusterExtensionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.ListClusterExtensionsResponse list(yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.ListClusterExtensionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.CreateClusterExtensionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.DeleteClusterExtensionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.UpdateClusterExtensionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set the list of cluster extensions. Not specified extensions will be deleted.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation setExtensions(yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.SetClusterExtensionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetExtensionsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ClusterExtensionServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ClusterExtensionServiceFutureStub> {
    private ClusterExtensionServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClusterExtensionServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClusterExtensionServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionOuterClass.ClusterExtension> get(
        yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.GetClusterExtensionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.ListClusterExtensionsResponse> list(
        yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.ListClusterExtensionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.CreateClusterExtensionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.DeleteClusterExtensionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.UpdateClusterExtensionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set the list of cluster extensions. Not specified extensions will be deleted.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> setExtensions(
        yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.SetClusterExtensionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetExtensionsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_DELETE = 3;
  private static final int METHODID_UPDATE = 4;
  private static final int METHODID_SET_EXTENSIONS = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ClusterExtensionServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ClusterExtensionServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.GetClusterExtensionRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionOuterClass.ClusterExtension>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.ListClusterExtensionsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.ListClusterExtensionsResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.CreateClusterExtensionRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.DeleteClusterExtensionRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.UpdateClusterExtensionRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_SET_EXTENSIONS:
          serviceImpl.setExtensions((yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.SetClusterExtensionsRequest) request,
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

  private static abstract class ClusterExtensionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ClusterExtensionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.mdb.clickhouse.v1.ClusterExtensionServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ClusterExtensionService");
    }
  }

  private static final class ClusterExtensionServiceFileDescriptorSupplier
      extends ClusterExtensionServiceBaseDescriptorSupplier {
    ClusterExtensionServiceFileDescriptorSupplier() {}
  }

  private static final class ClusterExtensionServiceMethodDescriptorSupplier
      extends ClusterExtensionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ClusterExtensionServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ClusterExtensionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ClusterExtensionServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getSetExtensionsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
