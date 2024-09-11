package yandex.cloud.api.smartwebsecurity.v1.waf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing WafProfile resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/smartwebsecurity/v1/waf/waf_profile_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class WafProfileServiceGrpc {

  private WafProfileServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.smartwebsecurity.v1.waf.WafProfileService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileServiceOuterClass.GetWafProfileRequest,
      yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileOuterClass.WafProfile> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileServiceOuterClass.GetWafProfileRequest.class,
      responseType = yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileOuterClass.WafProfile.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileServiceOuterClass.GetWafProfileRequest,
      yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileOuterClass.WafProfile> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileServiceOuterClass.GetWafProfileRequest, yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileOuterClass.WafProfile> getGetMethod;
    if ((getGetMethod = WafProfileServiceGrpc.getGetMethod) == null) {
      synchronized (WafProfileServiceGrpc.class) {
        if ((getGetMethod = WafProfileServiceGrpc.getGetMethod) == null) {
          WafProfileServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileServiceOuterClass.GetWafProfileRequest, yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileOuterClass.WafProfile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileServiceOuterClass.GetWafProfileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileOuterClass.WafProfile.getDefaultInstance()))
              .setSchemaDescriptor(new WafProfileServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileServiceOuterClass.ListWafProfilesRequest,
      yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileServiceOuterClass.ListWafProfilesResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileServiceOuterClass.ListWafProfilesRequest.class,
      responseType = yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileServiceOuterClass.ListWafProfilesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileServiceOuterClass.ListWafProfilesRequest,
      yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileServiceOuterClass.ListWafProfilesResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileServiceOuterClass.ListWafProfilesRequest, yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileServiceOuterClass.ListWafProfilesResponse> getListMethod;
    if ((getListMethod = WafProfileServiceGrpc.getListMethod) == null) {
      synchronized (WafProfileServiceGrpc.class) {
        if ((getListMethod = WafProfileServiceGrpc.getListMethod) == null) {
          WafProfileServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileServiceOuterClass.ListWafProfilesRequest, yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileServiceOuterClass.ListWafProfilesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileServiceOuterClass.ListWafProfilesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileServiceOuterClass.ListWafProfilesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WafProfileServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileServiceOuterClass.CreateWafProfileRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileServiceOuterClass.CreateWafProfileRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileServiceOuterClass.CreateWafProfileRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileServiceOuterClass.CreateWafProfileRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = WafProfileServiceGrpc.getCreateMethod) == null) {
      synchronized (WafProfileServiceGrpc.class) {
        if ((getCreateMethod = WafProfileServiceGrpc.getCreateMethod) == null) {
          WafProfileServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileServiceOuterClass.CreateWafProfileRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileServiceOuterClass.CreateWafProfileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new WafProfileServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileServiceOuterClass.UpdateWafProfileRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileServiceOuterClass.UpdateWafProfileRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileServiceOuterClass.UpdateWafProfileRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileServiceOuterClass.UpdateWafProfileRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = WafProfileServiceGrpc.getUpdateMethod) == null) {
      synchronized (WafProfileServiceGrpc.class) {
        if ((getUpdateMethod = WafProfileServiceGrpc.getUpdateMethod) == null) {
          WafProfileServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileServiceOuterClass.UpdateWafProfileRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileServiceOuterClass.UpdateWafProfileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new WafProfileServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileServiceOuterClass.DeleteWafProfileRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileServiceOuterClass.DeleteWafProfileRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileServiceOuterClass.DeleteWafProfileRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileServiceOuterClass.DeleteWafProfileRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = WafProfileServiceGrpc.getDeleteMethod) == null) {
      synchronized (WafProfileServiceGrpc.class) {
        if ((getDeleteMethod = WafProfileServiceGrpc.getDeleteMethod) == null) {
          WafProfileServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileServiceOuterClass.DeleteWafProfileRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileServiceOuterClass.DeleteWafProfileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new WafProfileServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WafProfileServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WafProfileServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WafProfileServiceStub>() {
        @java.lang.Override
        public WafProfileServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WafProfileServiceStub(channel, callOptions);
        }
      };
    return WafProfileServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WafProfileServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WafProfileServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WafProfileServiceBlockingStub>() {
        @java.lang.Override
        public WafProfileServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WafProfileServiceBlockingStub(channel, callOptions);
        }
      };
    return WafProfileServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WafProfileServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WafProfileServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WafProfileServiceFutureStub>() {
        @java.lang.Override
        public WafProfileServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WafProfileServiceFutureStub(channel, callOptions);
        }
      };
    return WafProfileServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing WafProfile resources.
   * </pre>
   */
  public static abstract class WafProfileServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified WafProfile resource.
     * </pre>
     */
    public void get(yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileServiceOuterClass.GetWafProfileRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileOuterClass.WafProfile> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of WafProfile resources in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileServiceOuterClass.ListWafProfilesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileServiceOuterClass.ListWafProfilesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a WAF profile in the specified folder using the data specified in the request.
     * </pre>
     */
    public void create(yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileServiceOuterClass.CreateWafProfileRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified WAF profile.
     * </pre>
     */
    public void update(yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileServiceOuterClass.UpdateWafProfileRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified WAF profile.
     * </pre>
     */
    public void delete(yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileServiceOuterClass.DeleteWafProfileRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileServiceOuterClass.GetWafProfileRequest,
                yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileOuterClass.WafProfile>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileServiceOuterClass.ListWafProfilesRequest,
                yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileServiceOuterClass.ListWafProfilesResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileServiceOuterClass.CreateWafProfileRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileServiceOuterClass.UpdateWafProfileRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileServiceOuterClass.DeleteWafProfileRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing WafProfile resources.
   * </pre>
   */
  public static final class WafProfileServiceStub extends io.grpc.stub.AbstractAsyncStub<WafProfileServiceStub> {
    private WafProfileServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WafProfileServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WafProfileServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified WafProfile resource.
     * </pre>
     */
    public void get(yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileServiceOuterClass.GetWafProfileRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileOuterClass.WafProfile> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of WafProfile resources in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileServiceOuterClass.ListWafProfilesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileServiceOuterClass.ListWafProfilesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a WAF profile in the specified folder using the data specified in the request.
     * </pre>
     */
    public void create(yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileServiceOuterClass.CreateWafProfileRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified WAF profile.
     * </pre>
     */
    public void update(yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileServiceOuterClass.UpdateWafProfileRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified WAF profile.
     * </pre>
     */
    public void delete(yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileServiceOuterClass.DeleteWafProfileRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing WafProfile resources.
   * </pre>
   */
  public static final class WafProfileServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<WafProfileServiceBlockingStub> {
    private WafProfileServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WafProfileServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WafProfileServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified WafProfile resource.
     * </pre>
     */
    public yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileOuterClass.WafProfile get(yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileServiceOuterClass.GetWafProfileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of WafProfile resources in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileServiceOuterClass.ListWafProfilesResponse list(yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileServiceOuterClass.ListWafProfilesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a WAF profile in the specified folder using the data specified in the request.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileServiceOuterClass.CreateWafProfileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified WAF profile.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileServiceOuterClass.UpdateWafProfileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified WAF profile.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileServiceOuterClass.DeleteWafProfileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing WafProfile resources.
   * </pre>
   */
  public static final class WafProfileServiceFutureStub extends io.grpc.stub.AbstractFutureStub<WafProfileServiceFutureStub> {
    private WafProfileServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WafProfileServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WafProfileServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified WafProfile resource.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileOuterClass.WafProfile> get(
        yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileServiceOuterClass.GetWafProfileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of WafProfile resources in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileServiceOuterClass.ListWafProfilesResponse> list(
        yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileServiceOuterClass.ListWafProfilesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a WAF profile in the specified folder using the data specified in the request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileServiceOuterClass.CreateWafProfileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified WAF profile.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileServiceOuterClass.UpdateWafProfileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified WAF profile.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileServiceOuterClass.DeleteWafProfileRequest request) {
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
    private final WafProfileServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(WafProfileServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileServiceOuterClass.GetWafProfileRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileOuterClass.WafProfile>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileServiceOuterClass.ListWafProfilesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileServiceOuterClass.ListWafProfilesResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileServiceOuterClass.CreateWafProfileRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileServiceOuterClass.UpdateWafProfileRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileServiceOuterClass.DeleteWafProfileRequest) request,
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

  private static abstract class WafProfileServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WafProfileServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.smartwebsecurity.v1.waf.WafProfileServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WafProfileService");
    }
  }

  private static final class WafProfileServiceFileDescriptorSupplier
      extends WafProfileServiceBaseDescriptorSupplier {
    WafProfileServiceFileDescriptorSupplier() {}
  }

  private static final class WafProfileServiceMethodDescriptorSupplier
      extends WafProfileServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WafProfileServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (WafProfileServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WafProfileServiceFileDescriptorSupplier())
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
