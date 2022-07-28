package yandex.cloud.api.monitoring.v3;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing dashboards.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/monitoring/v3/dashboard_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DashboardServiceGrpc {

  private DashboardServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.monitoring.v3.DashboardService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.GetDashboardRequest,
      yandex.cloud.api.monitoring.v3.DashboardOuterClass.Dashboard> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.GetDashboardRequest.class,
      responseType = yandex.cloud.api.monitoring.v3.DashboardOuterClass.Dashboard.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.GetDashboardRequest,
      yandex.cloud.api.monitoring.v3.DashboardOuterClass.Dashboard> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.GetDashboardRequest, yandex.cloud.api.monitoring.v3.DashboardOuterClass.Dashboard> getGetMethod;
    if ((getGetMethod = DashboardServiceGrpc.getGetMethod) == null) {
      synchronized (DashboardServiceGrpc.class) {
        if ((getGetMethod = DashboardServiceGrpc.getGetMethod) == null) {
          DashboardServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.GetDashboardRequest, yandex.cloud.api.monitoring.v3.DashboardOuterClass.Dashboard>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.GetDashboardRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.monitoring.v3.DashboardOuterClass.Dashboard.getDefaultInstance()))
              .setSchemaDescriptor(new DashboardServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.ListDashboardsRequest,
      yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.ListDashboardsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.ListDashboardsRequest.class,
      responseType = yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.ListDashboardsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.ListDashboardsRequest,
      yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.ListDashboardsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.ListDashboardsRequest, yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.ListDashboardsResponse> getListMethod;
    if ((getListMethod = DashboardServiceGrpc.getListMethod) == null) {
      synchronized (DashboardServiceGrpc.class) {
        if ((getListMethod = DashboardServiceGrpc.getListMethod) == null) {
          DashboardServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.ListDashboardsRequest, yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.ListDashboardsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.ListDashboardsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.ListDashboardsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DashboardServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.CreateDashboardRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.CreateDashboardRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.CreateDashboardRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.CreateDashboardRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = DashboardServiceGrpc.getCreateMethod) == null) {
      synchronized (DashboardServiceGrpc.class) {
        if ((getCreateMethod = DashboardServiceGrpc.getCreateMethod) == null) {
          DashboardServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.CreateDashboardRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.CreateDashboardRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new DashboardServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.UpdateDashboardRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.UpdateDashboardRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.UpdateDashboardRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.UpdateDashboardRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = DashboardServiceGrpc.getUpdateMethod) == null) {
      synchronized (DashboardServiceGrpc.class) {
        if ((getUpdateMethod = DashboardServiceGrpc.getUpdateMethod) == null) {
          DashboardServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.UpdateDashboardRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.UpdateDashboardRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new DashboardServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.DeleteDashboardRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.DeleteDashboardRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.DeleteDashboardRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.DeleteDashboardRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = DashboardServiceGrpc.getDeleteMethod) == null) {
      synchronized (DashboardServiceGrpc.class) {
        if ((getDeleteMethod = DashboardServiceGrpc.getDeleteMethod) == null) {
          DashboardServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.DeleteDashboardRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.DeleteDashboardRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new DashboardServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.ListDashboardOperationsRequest,
      yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.ListDashboardOperationsResponse> getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.ListDashboardOperationsRequest.class,
      responseType = yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.ListDashboardOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.ListDashboardOperationsRequest,
      yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.ListDashboardOperationsResponse> getListOperationsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.ListDashboardOperationsRequest, yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.ListDashboardOperationsResponse> getListOperationsMethod;
    if ((getListOperationsMethod = DashboardServiceGrpc.getListOperationsMethod) == null) {
      synchronized (DashboardServiceGrpc.class) {
        if ((getListOperationsMethod = DashboardServiceGrpc.getListOperationsMethod) == null) {
          DashboardServiceGrpc.getListOperationsMethod = getListOperationsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.ListDashboardOperationsRequest, yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.ListDashboardOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.ListDashboardOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.ListDashboardOperationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DashboardServiceMethodDescriptorSupplier("ListOperations"))
              .build();
        }
      }
    }
    return getListOperationsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DashboardServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DashboardServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DashboardServiceStub>() {
        @java.lang.Override
        public DashboardServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DashboardServiceStub(channel, callOptions);
        }
      };
    return DashboardServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DashboardServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DashboardServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DashboardServiceBlockingStub>() {
        @java.lang.Override
        public DashboardServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DashboardServiceBlockingStub(channel, callOptions);
        }
      };
    return DashboardServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DashboardServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DashboardServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DashboardServiceFutureStub>() {
        @java.lang.Override
        public DashboardServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DashboardServiceFutureStub(channel, callOptions);
        }
      };
    return DashboardServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing dashboards.
   * </pre>
   */
  public static abstract class DashboardServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified dashboard.
     * </pre>
     */
    public void get(yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.GetDashboardRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.monitoring.v3.DashboardOuterClass.Dashboard> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of dashboards in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.ListDashboardsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.ListDashboardsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a new dashboard in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.CreateDashboardRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified dashboard.
     * </pre>
     */
    public void update(yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.UpdateDashboardRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified dashboard.
     * </pre>
     */
    public void delete(yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.DeleteDashboardRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified dashboard.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.ListDashboardOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.ListDashboardOperationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.GetDashboardRequest,
                yandex.cloud.api.monitoring.v3.DashboardOuterClass.Dashboard>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.ListDashboardsRequest,
                yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.ListDashboardsResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.CreateDashboardRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.UpdateDashboardRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.DeleteDashboardRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListOperationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.ListDashboardOperationsRequest,
                yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.ListDashboardOperationsResponse>(
                  this, METHODID_LIST_OPERATIONS)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing dashboards.
   * </pre>
   */
  public static final class DashboardServiceStub extends io.grpc.stub.AbstractAsyncStub<DashboardServiceStub> {
    private DashboardServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DashboardServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DashboardServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified dashboard.
     * </pre>
     */
    public void get(yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.GetDashboardRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.monitoring.v3.DashboardOuterClass.Dashboard> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of dashboards in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.ListDashboardsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.ListDashboardsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a new dashboard in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.CreateDashboardRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified dashboard.
     * </pre>
     */
    public void update(yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.UpdateDashboardRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified dashboard.
     * </pre>
     */
    public void delete(yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.DeleteDashboardRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified dashboard.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.ListDashboardOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.ListDashboardOperationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing dashboards.
   * </pre>
   */
  public static final class DashboardServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<DashboardServiceBlockingStub> {
    private DashboardServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DashboardServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DashboardServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified dashboard.
     * </pre>
     */
    public yandex.cloud.api.monitoring.v3.DashboardOuterClass.Dashboard get(yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.GetDashboardRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of dashboards in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.ListDashboardsResponse list(yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.ListDashboardsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new dashboard in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.CreateDashboardRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified dashboard.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.UpdateDashboardRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified dashboard.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.DeleteDashboardRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists operations for the specified dashboard.
     * </pre>
     */
    public yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.ListDashboardOperationsResponse listOperations(yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.ListDashboardOperationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing dashboards.
   * </pre>
   */
  public static final class DashboardServiceFutureStub extends io.grpc.stub.AbstractFutureStub<DashboardServiceFutureStub> {
    private DashboardServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DashboardServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DashboardServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified dashboard.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.monitoring.v3.DashboardOuterClass.Dashboard> get(
        yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.GetDashboardRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of dashboards in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.ListDashboardsResponse> list(
        yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.ListDashboardsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a new dashboard in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.CreateDashboardRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified dashboard.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.UpdateDashboardRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified dashboard.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.DeleteDashboardRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists operations for the specified dashboard.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.ListDashboardOperationsResponse> listOperations(
        yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.ListDashboardOperationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_DELETE = 4;
  private static final int METHODID_LIST_OPERATIONS = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DashboardServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DashboardServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.GetDashboardRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.monitoring.v3.DashboardOuterClass.Dashboard>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.ListDashboardsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.ListDashboardsResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.CreateDashboardRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.UpdateDashboardRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.DeleteDashboardRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.ListDashboardOperationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.ListDashboardOperationsResponse>) responseObserver);
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

  private static abstract class DashboardServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DashboardServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.monitoring.v3.DashboardServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DashboardService");
    }
  }

  private static final class DashboardServiceFileDescriptorSupplier
      extends DashboardServiceBaseDescriptorSupplier {
    DashboardServiceFileDescriptorSupplier() {}
  }

  private static final class DashboardServiceMethodDescriptorSupplier
      extends DashboardServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DashboardServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DashboardServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DashboardServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getListOperationsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
