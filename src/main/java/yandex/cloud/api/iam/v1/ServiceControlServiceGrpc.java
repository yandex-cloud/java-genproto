package yandex.cloud.api.iam.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing Service resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/iam/v1/service_control_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ServiceControlServiceGrpc {

  private ServiceControlServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.iam.v1.ServiceControlService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.GetServiceRequest,
      yandex.cloud.api.iam.v1.ServiceControl.Service> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.GetServiceRequest.class,
      responseType = yandex.cloud.api.iam.v1.ServiceControl.Service.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.GetServiceRequest,
      yandex.cloud.api.iam.v1.ServiceControl.Service> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.GetServiceRequest, yandex.cloud.api.iam.v1.ServiceControl.Service> getGetMethod;
    if ((getGetMethod = ServiceControlServiceGrpc.getGetMethod) == null) {
      synchronized (ServiceControlServiceGrpc.class) {
        if ((getGetMethod = ServiceControlServiceGrpc.getGetMethod) == null) {
          ServiceControlServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.GetServiceRequest, yandex.cloud.api.iam.v1.ServiceControl.Service>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.GetServiceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.ServiceControl.Service.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceControlServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.ListServicesRequest,
      yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.ListServicesResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.ListServicesRequest.class,
      responseType = yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.ListServicesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.ListServicesRequest,
      yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.ListServicesResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.ListServicesRequest, yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.ListServicesResponse> getListMethod;
    if ((getListMethod = ServiceControlServiceGrpc.getListMethod) == null) {
      synchronized (ServiceControlServiceGrpc.class) {
        if ((getListMethod = ServiceControlServiceGrpc.getListMethod) == null) {
          ServiceControlServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.ListServicesRequest, yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.ListServicesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.ListServicesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.ListServicesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceControlServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.EnableServiceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getEnableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Enable",
      requestType = yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.EnableServiceRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.EnableServiceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getEnableMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.EnableServiceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getEnableMethod;
    if ((getEnableMethod = ServiceControlServiceGrpc.getEnableMethod) == null) {
      synchronized (ServiceControlServiceGrpc.class) {
        if ((getEnableMethod = ServiceControlServiceGrpc.getEnableMethod) == null) {
          ServiceControlServiceGrpc.getEnableMethod = getEnableMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.EnableServiceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Enable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.EnableServiceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceControlServiceMethodDescriptorSupplier("Enable"))
              .build();
        }
      }
    }
    return getEnableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.ResumeServiceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getResumeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Resume",
      requestType = yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.ResumeServiceRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.ResumeServiceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getResumeMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.ResumeServiceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getResumeMethod;
    if ((getResumeMethod = ServiceControlServiceGrpc.getResumeMethod) == null) {
      synchronized (ServiceControlServiceGrpc.class) {
        if ((getResumeMethod = ServiceControlServiceGrpc.getResumeMethod) == null) {
          ServiceControlServiceGrpc.getResumeMethod = getResumeMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.ResumeServiceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Resume"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.ResumeServiceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceControlServiceMethodDescriptorSupplier("Resume"))
              .build();
        }
      }
    }
    return getResumeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.PauseServiceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getPauseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Pause",
      requestType = yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.PauseServiceRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.PauseServiceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getPauseMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.PauseServiceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getPauseMethod;
    if ((getPauseMethod = ServiceControlServiceGrpc.getPauseMethod) == null) {
      synchronized (ServiceControlServiceGrpc.class) {
        if ((getPauseMethod = ServiceControlServiceGrpc.getPauseMethod) == null) {
          ServiceControlServiceGrpc.getPauseMethod = getPauseMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.PauseServiceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Pause"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.PauseServiceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceControlServiceMethodDescriptorSupplier("Pause"))
              .build();
        }
      }
    }
    return getPauseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.DisableServiceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDisableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Disable",
      requestType = yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.DisableServiceRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.DisableServiceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDisableMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.DisableServiceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDisableMethod;
    if ((getDisableMethod = ServiceControlServiceGrpc.getDisableMethod) == null) {
      synchronized (ServiceControlServiceGrpc.class) {
        if ((getDisableMethod = ServiceControlServiceGrpc.getDisableMethod) == null) {
          ServiceControlServiceGrpc.getDisableMethod = getDisableMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.DisableServiceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Disable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.DisableServiceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceControlServiceMethodDescriptorSupplier("Disable"))
              .build();
        }
      }
    }
    return getDisableMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ServiceControlServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServiceControlServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServiceControlServiceStub>() {
        @java.lang.Override
        public ServiceControlServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServiceControlServiceStub(channel, callOptions);
        }
      };
    return ServiceControlServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ServiceControlServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServiceControlServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServiceControlServiceBlockingStub>() {
        @java.lang.Override
        public ServiceControlServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServiceControlServiceBlockingStub(channel, callOptions);
        }
      };
    return ServiceControlServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ServiceControlServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServiceControlServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServiceControlServiceFutureStub>() {
        @java.lang.Override
        public ServiceControlServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServiceControlServiceFutureStub(channel, callOptions);
        }
      };
    return ServiceControlServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing Service resources.
   * </pre>
   */
  public static abstract class ServiceControlServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the Service information in the specified resource container.
     * To get the list of available Services, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.GetServiceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.ServiceControl.Service> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of Service in the specified resource container.
     * </pre>
     */
    public void list(yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.ListServicesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.ListServicesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Enable a service in the specified resource container.
     * </pre>
     */
    public void enable(yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.EnableServiceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEnableMethod(), responseObserver);
    }

    /**
     * <pre>
     * Resume a service in the specified resource container.
     * </pre>
     */
    public void resume(yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.ResumeServiceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResumeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Pause a service in the specified resource container.
     * </pre>
     */
    public void pause(yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.PauseServiceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPauseMethod(), responseObserver);
    }

    /**
     * <pre>
     * Disable a service in the specified resource container.
     * </pre>
     */
    public void disable(yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.DisableServiceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDisableMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.GetServiceRequest,
                yandex.cloud.api.iam.v1.ServiceControl.Service>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.ListServicesRequest,
                yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.ListServicesResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getEnableMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.EnableServiceRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_ENABLE)))
          .addMethod(
            getResumeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.ResumeServiceRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_RESUME)))
          .addMethod(
            getPauseMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.PauseServiceRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_PAUSE)))
          .addMethod(
            getDisableMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.DisableServiceRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DISABLE)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing Service resources.
   * </pre>
   */
  public static final class ServiceControlServiceStub extends io.grpc.stub.AbstractAsyncStub<ServiceControlServiceStub> {
    private ServiceControlServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceControlServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServiceControlServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the Service information in the specified resource container.
     * To get the list of available Services, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.GetServiceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.ServiceControl.Service> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of Service in the specified resource container.
     * </pre>
     */
    public void list(yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.ListServicesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.ListServicesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Enable a service in the specified resource container.
     * </pre>
     */
    public void enable(yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.EnableServiceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEnableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Resume a service in the specified resource container.
     * </pre>
     */
    public void resume(yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.ResumeServiceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResumeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Pause a service in the specified resource container.
     * </pre>
     */
    public void pause(yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.PauseServiceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPauseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Disable a service in the specified resource container.
     * </pre>
     */
    public void disable(yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.DisableServiceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDisableMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Service resources.
   * </pre>
   */
  public static final class ServiceControlServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ServiceControlServiceBlockingStub> {
    private ServiceControlServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceControlServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServiceControlServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the Service information in the specified resource container.
     * To get the list of available Services, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.iam.v1.ServiceControl.Service get(yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.GetServiceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of Service in the specified resource container.
     * </pre>
     */
    public yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.ListServicesResponse list(yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.ListServicesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Enable a service in the specified resource container.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation enable(yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.EnableServiceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEnableMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Resume a service in the specified resource container.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation resume(yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.ResumeServiceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResumeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Pause a service in the specified resource container.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation pause(yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.PauseServiceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPauseMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Disable a service in the specified resource container.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation disable(yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.DisableServiceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDisableMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Service resources.
   * </pre>
   */
  public static final class ServiceControlServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ServiceControlServiceFutureStub> {
    private ServiceControlServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceControlServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServiceControlServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the Service information in the specified resource container.
     * To get the list of available Services, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.iam.v1.ServiceControl.Service> get(
        yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.GetServiceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of Service in the specified resource container.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.ListServicesResponse> list(
        yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.ListServicesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Enable a service in the specified resource container.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> enable(
        yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.EnableServiceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEnableMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Resume a service in the specified resource container.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> resume(
        yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.ResumeServiceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResumeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Pause a service in the specified resource container.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> pause(
        yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.PauseServiceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPauseMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Disable a service in the specified resource container.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> disable(
        yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.DisableServiceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDisableMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_ENABLE = 2;
  private static final int METHODID_RESUME = 3;
  private static final int METHODID_PAUSE = 4;
  private static final int METHODID_DISABLE = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ServiceControlServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ServiceControlServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.GetServiceRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.ServiceControl.Service>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.ListServicesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.ListServicesResponse>) responseObserver);
          break;
        case METHODID_ENABLE:
          serviceImpl.enable((yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.EnableServiceRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_RESUME:
          serviceImpl.resume((yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.ResumeServiceRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_PAUSE:
          serviceImpl.pause((yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.PauseServiceRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DISABLE:
          serviceImpl.disable((yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.DisableServiceRequest) request,
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

  private static abstract class ServiceControlServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ServiceControlServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.iam.v1.ServiceControlServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ServiceControlService");
    }
  }

  private static final class ServiceControlServiceFileDescriptorSupplier
      extends ServiceControlServiceBaseDescriptorSupplier {
    ServiceControlServiceFileDescriptorSupplier() {}
  }

  private static final class ServiceControlServiceMethodDescriptorSupplier
      extends ServiceControlServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ServiceControlServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ServiceControlServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ServiceControlServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getEnableMethod())
              .addMethod(getResumeMethod())
              .addMethod(getPauseMethod())
              .addMethod(getDisableMethod())
              .build();
        }
      }
    }
    return result;
  }
}
