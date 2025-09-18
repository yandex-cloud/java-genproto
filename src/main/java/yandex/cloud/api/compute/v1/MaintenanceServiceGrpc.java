package yandex.cloud.api.compute.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing maintenances in a service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/compute/v1/maintenance_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MaintenanceServiceGrpc {

  private MaintenanceServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.compute.v1.MaintenanceService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.maintenance.v2.Common.ListMaintenancesRequest,
      yandex.cloud.api.maintenance.v2.Common.ListMaintenancesResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.maintenance.v2.Common.ListMaintenancesRequest.class,
      responseType = yandex.cloud.api.maintenance.v2.Common.ListMaintenancesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.maintenance.v2.Common.ListMaintenancesRequest,
      yandex.cloud.api.maintenance.v2.Common.ListMaintenancesResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.maintenance.v2.Common.ListMaintenancesRequest, yandex.cloud.api.maintenance.v2.Common.ListMaintenancesResponse> getListMethod;
    if ((getListMethod = MaintenanceServiceGrpc.getListMethod) == null) {
      synchronized (MaintenanceServiceGrpc.class) {
        if ((getListMethod = MaintenanceServiceGrpc.getListMethod) == null) {
          MaintenanceServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.maintenance.v2.Common.ListMaintenancesRequest, yandex.cloud.api.maintenance.v2.Common.ListMaintenancesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.maintenance.v2.Common.ListMaintenancesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.maintenance.v2.Common.ListMaintenancesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MaintenanceServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.maintenance.v2.Common.GetMaintenanceRequest,
      yandex.cloud.api.maintenance.v2.Common.Maintenance> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.maintenance.v2.Common.GetMaintenanceRequest.class,
      responseType = yandex.cloud.api.maintenance.v2.Common.Maintenance.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.maintenance.v2.Common.GetMaintenanceRequest,
      yandex.cloud.api.maintenance.v2.Common.Maintenance> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.maintenance.v2.Common.GetMaintenanceRequest, yandex.cloud.api.maintenance.v2.Common.Maintenance> getGetMethod;
    if ((getGetMethod = MaintenanceServiceGrpc.getGetMethod) == null) {
      synchronized (MaintenanceServiceGrpc.class) {
        if ((getGetMethod = MaintenanceServiceGrpc.getGetMethod) == null) {
          MaintenanceServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.maintenance.v2.Common.GetMaintenanceRequest, yandex.cloud.api.maintenance.v2.Common.Maintenance>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.maintenance.v2.Common.GetMaintenanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.maintenance.v2.Common.Maintenance.getDefaultInstance()))
              .setSchemaDescriptor(new MaintenanceServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.maintenance.v2.Common.RescheduleMaintenanceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRescheduleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Reschedule",
      requestType = yandex.cloud.api.maintenance.v2.Common.RescheduleMaintenanceRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.maintenance.v2.Common.RescheduleMaintenanceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRescheduleMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.maintenance.v2.Common.RescheduleMaintenanceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getRescheduleMethod;
    if ((getRescheduleMethod = MaintenanceServiceGrpc.getRescheduleMethod) == null) {
      synchronized (MaintenanceServiceGrpc.class) {
        if ((getRescheduleMethod = MaintenanceServiceGrpc.getRescheduleMethod) == null) {
          MaintenanceServiceGrpc.getRescheduleMethod = getRescheduleMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.maintenance.v2.Common.RescheduleMaintenanceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Reschedule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.maintenance.v2.Common.RescheduleMaintenanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new MaintenanceServiceMethodDescriptorSupplier("Reschedule"))
              .build();
        }
      }
    }
    return getRescheduleMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MaintenanceServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MaintenanceServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MaintenanceServiceStub>() {
        @java.lang.Override
        public MaintenanceServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MaintenanceServiceStub(channel, callOptions);
        }
      };
    return MaintenanceServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MaintenanceServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MaintenanceServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MaintenanceServiceBlockingStub>() {
        @java.lang.Override
        public MaintenanceServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MaintenanceServiceBlockingStub(channel, callOptions);
        }
      };
    return MaintenanceServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MaintenanceServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MaintenanceServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MaintenanceServiceFutureStub>() {
        @java.lang.Override
        public MaintenanceServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MaintenanceServiceFutureStub(channel, callOptions);
        }
      };
    return MaintenanceServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing maintenances in a service.
   * </pre>
   */
  public static abstract class MaintenanceServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Lists maintenances by conditions, specified in request.
     * </pre>
     */
    public void list(yandex.cloud.api.maintenance.v2.Common.ListMaintenancesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.maintenance.v2.Common.ListMaintenancesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the specific Maintenance by ID.
     * </pre>
     */
    public void get(yandex.cloud.api.maintenance.v2.Common.GetMaintenanceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.maintenance.v2.Common.Maintenance> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Allows user to reschedule Maintenance to another date and time.
     * </pre>
     */
    public void reschedule(yandex.cloud.api.maintenance.v2.Common.RescheduleMaintenanceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRescheduleMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.maintenance.v2.Common.ListMaintenancesRequest,
                yandex.cloud.api.maintenance.v2.Common.ListMaintenancesResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.maintenance.v2.Common.GetMaintenanceRequest,
                yandex.cloud.api.maintenance.v2.Common.Maintenance>(
                  this, METHODID_GET)))
          .addMethod(
            getRescheduleMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.maintenance.v2.Common.RescheduleMaintenanceRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_RESCHEDULE)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing maintenances in a service.
   * </pre>
   */
  public static final class MaintenanceServiceStub extends io.grpc.stub.AbstractAsyncStub<MaintenanceServiceStub> {
    private MaintenanceServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MaintenanceServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MaintenanceServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists maintenances by conditions, specified in request.
     * </pre>
     */
    public void list(yandex.cloud.api.maintenance.v2.Common.ListMaintenancesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.maintenance.v2.Common.ListMaintenancesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the specific Maintenance by ID.
     * </pre>
     */
    public void get(yandex.cloud.api.maintenance.v2.Common.GetMaintenanceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.maintenance.v2.Common.Maintenance> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Allows user to reschedule Maintenance to another date and time.
     * </pre>
     */
    public void reschedule(yandex.cloud.api.maintenance.v2.Common.RescheduleMaintenanceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRescheduleMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing maintenances in a service.
   * </pre>
   */
  public static final class MaintenanceServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<MaintenanceServiceBlockingStub> {
    private MaintenanceServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MaintenanceServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MaintenanceServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists maintenances by conditions, specified in request.
     * </pre>
     */
    public yandex.cloud.api.maintenance.v2.Common.ListMaintenancesResponse list(yandex.cloud.api.maintenance.v2.Common.ListMaintenancesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the specific Maintenance by ID.
     * </pre>
     */
    public yandex.cloud.api.maintenance.v2.Common.Maintenance get(yandex.cloud.api.maintenance.v2.Common.GetMaintenanceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Allows user to reschedule Maintenance to another date and time.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation reschedule(yandex.cloud.api.maintenance.v2.Common.RescheduleMaintenanceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRescheduleMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing maintenances in a service.
   * </pre>
   */
  public static final class MaintenanceServiceFutureStub extends io.grpc.stub.AbstractFutureStub<MaintenanceServiceFutureStub> {
    private MaintenanceServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MaintenanceServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MaintenanceServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists maintenances by conditions, specified in request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.maintenance.v2.Common.ListMaintenancesResponse> list(
        yandex.cloud.api.maintenance.v2.Common.ListMaintenancesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the specific Maintenance by ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.maintenance.v2.Common.Maintenance> get(
        yandex.cloud.api.maintenance.v2.Common.GetMaintenanceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Allows user to reschedule Maintenance to another date and time.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> reschedule(
        yandex.cloud.api.maintenance.v2.Common.RescheduleMaintenanceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRescheduleMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST = 0;
  private static final int METHODID_GET = 1;
  private static final int METHODID_RESCHEDULE = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MaintenanceServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MaintenanceServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.maintenance.v2.Common.ListMaintenancesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.maintenance.v2.Common.ListMaintenancesResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.maintenance.v2.Common.GetMaintenanceRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.maintenance.v2.Common.Maintenance>) responseObserver);
          break;
        case METHODID_RESCHEDULE:
          serviceImpl.reschedule((yandex.cloud.api.maintenance.v2.Common.RescheduleMaintenanceRequest) request,
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

  private static abstract class MaintenanceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MaintenanceServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.compute.v1.MaintenanceServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MaintenanceService");
    }
  }

  private static final class MaintenanceServiceFileDescriptorSupplier
      extends MaintenanceServiceBaseDescriptorSupplier {
    MaintenanceServiceFileDescriptorSupplier() {}
  }

  private static final class MaintenanceServiceMethodDescriptorSupplier
      extends MaintenanceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MaintenanceServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MaintenanceServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MaintenanceServiceFileDescriptorSupplier())
              .addMethod(getListMethod())
              .addMethod(getGetMethod())
              .addMethod(getRescheduleMethod())
              .build();
        }
      }
    }
    return result;
  }
}
