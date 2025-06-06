package yandex.cloud.api.loadtesting.api.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing Load Testing Regression Dashboards.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/loadtesting/api/v1/regression_dashboard_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RegressionDashboardServiceGrpc {

  private RegressionDashboardServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.loadtesting.api.v1.RegressionDashboardService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.loadtesting.api.v1.RegressionDashboardServiceOuterClass.CreateRegressionDashboardRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.loadtesting.api.v1.RegressionDashboardServiceOuterClass.CreateRegressionDashboardRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.loadtesting.api.v1.RegressionDashboardServiceOuterClass.CreateRegressionDashboardRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.loadtesting.api.v1.RegressionDashboardServiceOuterClass.CreateRegressionDashboardRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = RegressionDashboardServiceGrpc.getCreateMethod) == null) {
      synchronized (RegressionDashboardServiceGrpc.class) {
        if ((getCreateMethod = RegressionDashboardServiceGrpc.getCreateMethod) == null) {
          RegressionDashboardServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.loadtesting.api.v1.RegressionDashboardServiceOuterClass.CreateRegressionDashboardRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.loadtesting.api.v1.RegressionDashboardServiceOuterClass.CreateRegressionDashboardRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new RegressionDashboardServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.loadtesting.api.v1.RegressionDashboardServiceOuterClass.GetRegressionDashboardRequest,
      yandex.cloud.api.loadtesting.api.v1.regression.DashboardOuterClass.Dashboard> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.loadtesting.api.v1.RegressionDashboardServiceOuterClass.GetRegressionDashboardRequest.class,
      responseType = yandex.cloud.api.loadtesting.api.v1.regression.DashboardOuterClass.Dashboard.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.loadtesting.api.v1.RegressionDashboardServiceOuterClass.GetRegressionDashboardRequest,
      yandex.cloud.api.loadtesting.api.v1.regression.DashboardOuterClass.Dashboard> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.loadtesting.api.v1.RegressionDashboardServiceOuterClass.GetRegressionDashboardRequest, yandex.cloud.api.loadtesting.api.v1.regression.DashboardOuterClass.Dashboard> getGetMethod;
    if ((getGetMethod = RegressionDashboardServiceGrpc.getGetMethod) == null) {
      synchronized (RegressionDashboardServiceGrpc.class) {
        if ((getGetMethod = RegressionDashboardServiceGrpc.getGetMethod) == null) {
          RegressionDashboardServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.loadtesting.api.v1.RegressionDashboardServiceOuterClass.GetRegressionDashboardRequest, yandex.cloud.api.loadtesting.api.v1.regression.DashboardOuterClass.Dashboard>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.loadtesting.api.v1.RegressionDashboardServiceOuterClass.GetRegressionDashboardRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.loadtesting.api.v1.regression.DashboardOuterClass.Dashboard.getDefaultInstance()))
              .setSchemaDescriptor(new RegressionDashboardServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.loadtesting.api.v1.RegressionDashboardServiceOuterClass.ListRegressionDashboardsRequest,
      yandex.cloud.api.loadtesting.api.v1.RegressionDashboardServiceOuterClass.ListRegressionDashboardsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.loadtesting.api.v1.RegressionDashboardServiceOuterClass.ListRegressionDashboardsRequest.class,
      responseType = yandex.cloud.api.loadtesting.api.v1.RegressionDashboardServiceOuterClass.ListRegressionDashboardsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.loadtesting.api.v1.RegressionDashboardServiceOuterClass.ListRegressionDashboardsRequest,
      yandex.cloud.api.loadtesting.api.v1.RegressionDashboardServiceOuterClass.ListRegressionDashboardsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.loadtesting.api.v1.RegressionDashboardServiceOuterClass.ListRegressionDashboardsRequest, yandex.cloud.api.loadtesting.api.v1.RegressionDashboardServiceOuterClass.ListRegressionDashboardsResponse> getListMethod;
    if ((getListMethod = RegressionDashboardServiceGrpc.getListMethod) == null) {
      synchronized (RegressionDashboardServiceGrpc.class) {
        if ((getListMethod = RegressionDashboardServiceGrpc.getListMethod) == null) {
          RegressionDashboardServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.loadtesting.api.v1.RegressionDashboardServiceOuterClass.ListRegressionDashboardsRequest, yandex.cloud.api.loadtesting.api.v1.RegressionDashboardServiceOuterClass.ListRegressionDashboardsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.loadtesting.api.v1.RegressionDashboardServiceOuterClass.ListRegressionDashboardsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.loadtesting.api.v1.RegressionDashboardServiceOuterClass.ListRegressionDashboardsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RegressionDashboardServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.loadtesting.api.v1.RegressionDashboardServiceOuterClass.DeleteRegressionDashboardRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.loadtesting.api.v1.RegressionDashboardServiceOuterClass.DeleteRegressionDashboardRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.loadtesting.api.v1.RegressionDashboardServiceOuterClass.DeleteRegressionDashboardRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.loadtesting.api.v1.RegressionDashboardServiceOuterClass.DeleteRegressionDashboardRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = RegressionDashboardServiceGrpc.getDeleteMethod) == null) {
      synchronized (RegressionDashboardServiceGrpc.class) {
        if ((getDeleteMethod = RegressionDashboardServiceGrpc.getDeleteMethod) == null) {
          RegressionDashboardServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.loadtesting.api.v1.RegressionDashboardServiceOuterClass.DeleteRegressionDashboardRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.loadtesting.api.v1.RegressionDashboardServiceOuterClass.DeleteRegressionDashboardRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new RegressionDashboardServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.loadtesting.api.v1.RegressionDashboardServiceOuterClass.UpdateRegressionDashboardRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.loadtesting.api.v1.RegressionDashboardServiceOuterClass.UpdateRegressionDashboardRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.loadtesting.api.v1.RegressionDashboardServiceOuterClass.UpdateRegressionDashboardRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.loadtesting.api.v1.RegressionDashboardServiceOuterClass.UpdateRegressionDashboardRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = RegressionDashboardServiceGrpc.getUpdateMethod) == null) {
      synchronized (RegressionDashboardServiceGrpc.class) {
        if ((getUpdateMethod = RegressionDashboardServiceGrpc.getUpdateMethod) == null) {
          RegressionDashboardServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.loadtesting.api.v1.RegressionDashboardServiceOuterClass.UpdateRegressionDashboardRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.loadtesting.api.v1.RegressionDashboardServiceOuterClass.UpdateRegressionDashboardRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new RegressionDashboardServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RegressionDashboardServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RegressionDashboardServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RegressionDashboardServiceStub>() {
        @java.lang.Override
        public RegressionDashboardServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RegressionDashboardServiceStub(channel, callOptions);
        }
      };
    return RegressionDashboardServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RegressionDashboardServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RegressionDashboardServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RegressionDashboardServiceBlockingStub>() {
        @java.lang.Override
        public RegressionDashboardServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RegressionDashboardServiceBlockingStub(channel, callOptions);
        }
      };
    return RegressionDashboardServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RegressionDashboardServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RegressionDashboardServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RegressionDashboardServiceFutureStub>() {
        @java.lang.Override
        public RegressionDashboardServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RegressionDashboardServiceFutureStub(channel, callOptions);
        }
      };
    return RegressionDashboardServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing Load Testing Regression Dashboards.
   * </pre>
   */
  public static abstract class RegressionDashboardServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Creates a regression dashboard in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.loadtesting.api.v1.RegressionDashboardServiceOuterClass.CreateRegressionDashboardRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the specified regression dashboard.
     * To get the list of all available regression dashboards, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.loadtesting.api.v1.RegressionDashboardServiceOuterClass.GetRegressionDashboardRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.loadtesting.api.v1.regression.DashboardOuterClass.Dashboard> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of regression dashboards in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.loadtesting.api.v1.RegressionDashboardServiceOuterClass.ListRegressionDashboardsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.loadtesting.api.v1.RegressionDashboardServiceOuterClass.ListRegressionDashboardsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified regression dashboard.
     * </pre>
     */
    public void delete(yandex.cloud.api.loadtesting.api.v1.RegressionDashboardServiceOuterClass.DeleteRegressionDashboardRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified regression dashboard.
     * </pre>
     */
    public void update(yandex.cloud.api.loadtesting.api.v1.RegressionDashboardServiceOuterClass.UpdateRegressionDashboardRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.loadtesting.api.v1.RegressionDashboardServiceOuterClass.CreateRegressionDashboardRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.loadtesting.api.v1.RegressionDashboardServiceOuterClass.GetRegressionDashboardRequest,
                yandex.cloud.api.loadtesting.api.v1.regression.DashboardOuterClass.Dashboard>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.loadtesting.api.v1.RegressionDashboardServiceOuterClass.ListRegressionDashboardsRequest,
                yandex.cloud.api.loadtesting.api.v1.RegressionDashboardServiceOuterClass.ListRegressionDashboardsResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.loadtesting.api.v1.RegressionDashboardServiceOuterClass.DeleteRegressionDashboardRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.loadtesting.api.v1.RegressionDashboardServiceOuterClass.UpdateRegressionDashboardRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing Load Testing Regression Dashboards.
   * </pre>
   */
  public static final class RegressionDashboardServiceStub extends io.grpc.stub.AbstractAsyncStub<RegressionDashboardServiceStub> {
    private RegressionDashboardServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RegressionDashboardServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RegressionDashboardServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a regression dashboard in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.loadtesting.api.v1.RegressionDashboardServiceOuterClass.CreateRegressionDashboardRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the specified regression dashboard.
     * To get the list of all available regression dashboards, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.loadtesting.api.v1.RegressionDashboardServiceOuterClass.GetRegressionDashboardRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.loadtesting.api.v1.regression.DashboardOuterClass.Dashboard> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of regression dashboards in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.loadtesting.api.v1.RegressionDashboardServiceOuterClass.ListRegressionDashboardsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.loadtesting.api.v1.RegressionDashboardServiceOuterClass.ListRegressionDashboardsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified regression dashboard.
     * </pre>
     */
    public void delete(yandex.cloud.api.loadtesting.api.v1.RegressionDashboardServiceOuterClass.DeleteRegressionDashboardRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified regression dashboard.
     * </pre>
     */
    public void update(yandex.cloud.api.loadtesting.api.v1.RegressionDashboardServiceOuterClass.UpdateRegressionDashboardRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Load Testing Regression Dashboards.
   * </pre>
   */
  public static final class RegressionDashboardServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<RegressionDashboardServiceBlockingStub> {
    private RegressionDashboardServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RegressionDashboardServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RegressionDashboardServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a regression dashboard in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.loadtesting.api.v1.RegressionDashboardServiceOuterClass.CreateRegressionDashboardRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the specified regression dashboard.
     * To get the list of all available regression dashboards, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.loadtesting.api.v1.regression.DashboardOuterClass.Dashboard get(yandex.cloud.api.loadtesting.api.v1.RegressionDashboardServiceOuterClass.GetRegressionDashboardRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of regression dashboards in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.loadtesting.api.v1.RegressionDashboardServiceOuterClass.ListRegressionDashboardsResponse list(yandex.cloud.api.loadtesting.api.v1.RegressionDashboardServiceOuterClass.ListRegressionDashboardsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified regression dashboard.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.loadtesting.api.v1.RegressionDashboardServiceOuterClass.DeleteRegressionDashboardRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified regression dashboard.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.loadtesting.api.v1.RegressionDashboardServiceOuterClass.UpdateRegressionDashboardRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Load Testing Regression Dashboards.
   * </pre>
   */
  public static final class RegressionDashboardServiceFutureStub extends io.grpc.stub.AbstractFutureStub<RegressionDashboardServiceFutureStub> {
    private RegressionDashboardServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RegressionDashboardServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RegressionDashboardServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a regression dashboard in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.loadtesting.api.v1.RegressionDashboardServiceOuterClass.CreateRegressionDashboardRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the specified regression dashboard.
     * To get the list of all available regression dashboards, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.loadtesting.api.v1.regression.DashboardOuterClass.Dashboard> get(
        yandex.cloud.api.loadtesting.api.v1.RegressionDashboardServiceOuterClass.GetRegressionDashboardRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of regression dashboards in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.loadtesting.api.v1.RegressionDashboardServiceOuterClass.ListRegressionDashboardsResponse> list(
        yandex.cloud.api.loadtesting.api.v1.RegressionDashboardServiceOuterClass.ListRegressionDashboardsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified regression dashboard.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.loadtesting.api.v1.RegressionDashboardServiceOuterClass.DeleteRegressionDashboardRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified regression dashboard.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.loadtesting.api.v1.RegressionDashboardServiceOuterClass.UpdateRegressionDashboardRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_GET = 1;
  private static final int METHODID_LIST = 2;
  private static final int METHODID_DELETE = 3;
  private static final int METHODID_UPDATE = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RegressionDashboardServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RegressionDashboardServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.loadtesting.api.v1.RegressionDashboardServiceOuterClass.CreateRegressionDashboardRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.loadtesting.api.v1.RegressionDashboardServiceOuterClass.GetRegressionDashboardRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.loadtesting.api.v1.regression.DashboardOuterClass.Dashboard>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.loadtesting.api.v1.RegressionDashboardServiceOuterClass.ListRegressionDashboardsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.loadtesting.api.v1.RegressionDashboardServiceOuterClass.ListRegressionDashboardsResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.loadtesting.api.v1.RegressionDashboardServiceOuterClass.DeleteRegressionDashboardRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.loadtesting.api.v1.RegressionDashboardServiceOuterClass.UpdateRegressionDashboardRequest) request,
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

  private static abstract class RegressionDashboardServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RegressionDashboardServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.loadtesting.api.v1.RegressionDashboardServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RegressionDashboardService");
    }
  }

  private static final class RegressionDashboardServiceFileDescriptorSupplier
      extends RegressionDashboardServiceBaseDescriptorSupplier {
    RegressionDashboardServiceFileDescriptorSupplier() {}
  }

  private static final class RegressionDashboardServiceMethodDescriptorSupplier
      extends RegressionDashboardServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RegressionDashboardServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (RegressionDashboardServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RegressionDashboardServiceFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getUpdateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
