package yandex.cloud.api.baremetal.v1alpha;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing VRF resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/baremetal/v1alpha/vrf_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class VrfServiceGrpc {

  private VrfServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.baremetal.v1alpha.VrfService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.GetVrfRequest,
      yandex.cloud.api.baremetal.v1alpha.VrfOuterClass.Vrf> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.GetVrfRequest.class,
      responseType = yandex.cloud.api.baremetal.v1alpha.VrfOuterClass.Vrf.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.GetVrfRequest,
      yandex.cloud.api.baremetal.v1alpha.VrfOuterClass.Vrf> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.GetVrfRequest, yandex.cloud.api.baremetal.v1alpha.VrfOuterClass.Vrf> getGetMethod;
    if ((getGetMethod = VrfServiceGrpc.getGetMethod) == null) {
      synchronized (VrfServiceGrpc.class) {
        if ((getGetMethod = VrfServiceGrpc.getGetMethod) == null) {
          VrfServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.GetVrfRequest, yandex.cloud.api.baremetal.v1alpha.VrfOuterClass.Vrf>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.GetVrfRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.baremetal.v1alpha.VrfOuterClass.Vrf.getDefaultInstance()))
              .setSchemaDescriptor(new VrfServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.ListVrfRequest,
      yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.ListVrfResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.ListVrfRequest.class,
      responseType = yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.ListVrfResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.ListVrfRequest,
      yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.ListVrfResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.ListVrfRequest, yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.ListVrfResponse> getListMethod;
    if ((getListMethod = VrfServiceGrpc.getListMethod) == null) {
      synchronized (VrfServiceGrpc.class) {
        if ((getListMethod = VrfServiceGrpc.getListMethod) == null) {
          VrfServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.ListVrfRequest, yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.ListVrfResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.ListVrfRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.ListVrfResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VrfServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.CreateVrfRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.CreateVrfRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.CreateVrfRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.CreateVrfRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = VrfServiceGrpc.getCreateMethod) == null) {
      synchronized (VrfServiceGrpc.class) {
        if ((getCreateMethod = VrfServiceGrpc.getCreateMethod) == null) {
          VrfServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.CreateVrfRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.CreateVrfRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new VrfServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.UpdateVrfRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.UpdateVrfRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.UpdateVrfRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.UpdateVrfRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = VrfServiceGrpc.getUpdateMethod) == null) {
      synchronized (VrfServiceGrpc.class) {
        if ((getUpdateMethod = VrfServiceGrpc.getUpdateMethod) == null) {
          VrfServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.UpdateVrfRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.UpdateVrfRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new VrfServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.DeleteVrfRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.DeleteVrfRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.DeleteVrfRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.DeleteVrfRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = VrfServiceGrpc.getDeleteMethod) == null) {
      synchronized (VrfServiceGrpc.class) {
        if ((getDeleteMethod = VrfServiceGrpc.getDeleteMethod) == null) {
          VrfServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.DeleteVrfRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.DeleteVrfRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new VrfServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.ListVrfOperationsRequest,
      yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.ListVrfOperationsResponse> getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.ListVrfOperationsRequest.class,
      responseType = yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.ListVrfOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.ListVrfOperationsRequest,
      yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.ListVrfOperationsResponse> getListOperationsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.ListVrfOperationsRequest, yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.ListVrfOperationsResponse> getListOperationsMethod;
    if ((getListOperationsMethod = VrfServiceGrpc.getListOperationsMethod) == null) {
      synchronized (VrfServiceGrpc.class) {
        if ((getListOperationsMethod = VrfServiceGrpc.getListOperationsMethod) == null) {
          VrfServiceGrpc.getListOperationsMethod = getListOperationsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.ListVrfOperationsRequest, yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.ListVrfOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.ListVrfOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.ListVrfOperationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VrfServiceMethodDescriptorSupplier("ListOperations"))
              .build();
        }
      }
    }
    return getListOperationsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static VrfServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VrfServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VrfServiceStub>() {
        @java.lang.Override
        public VrfServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VrfServiceStub(channel, callOptions);
        }
      };
    return VrfServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static VrfServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VrfServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VrfServiceBlockingStub>() {
        @java.lang.Override
        public VrfServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VrfServiceBlockingStub(channel, callOptions);
        }
      };
    return VrfServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static VrfServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VrfServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VrfServiceFutureStub>() {
        @java.lang.Override
        public VrfServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VrfServiceFutureStub(channel, callOptions);
        }
      };
    return VrfServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing VRF resources.
   * </pre>
   */
  public static abstract class VrfServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specific VRF resource.
     * To get the list of available VRFs, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.GetVrfRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.baremetal.v1alpha.VrfOuterClass.Vrf> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of VRF resources in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.ListVrfRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.ListVrfResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a VRF in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.CreateVrfRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified VRF resource.
     * </pre>
     */
    public void update(yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.UpdateVrfRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified VRF resource.
     * Deleting a VRF removes its data permanently and is irreversible.
     * </pre>
     */
    public void delete(yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.DeleteVrfRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified VRF.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.ListVrfOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.ListVrfOperationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.GetVrfRequest,
                yandex.cloud.api.baremetal.v1alpha.VrfOuterClass.Vrf>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.ListVrfRequest,
                yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.ListVrfResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.CreateVrfRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.UpdateVrfRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.DeleteVrfRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListOperationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.ListVrfOperationsRequest,
                yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.ListVrfOperationsResponse>(
                  this, METHODID_LIST_OPERATIONS)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing VRF resources.
   * </pre>
   */
  public static final class VrfServiceStub extends io.grpc.stub.AbstractAsyncStub<VrfServiceStub> {
    private VrfServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VrfServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VrfServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specific VRF resource.
     * To get the list of available VRFs, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.GetVrfRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.baremetal.v1alpha.VrfOuterClass.Vrf> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of VRF resources in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.ListVrfRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.ListVrfResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a VRF in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.CreateVrfRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified VRF resource.
     * </pre>
     */
    public void update(yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.UpdateVrfRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified VRF resource.
     * Deleting a VRF removes its data permanently and is irreversible.
     * </pre>
     */
    public void delete(yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.DeleteVrfRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified VRF.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.ListVrfOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.ListVrfOperationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing VRF resources.
   * </pre>
   */
  public static final class VrfServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<VrfServiceBlockingStub> {
    private VrfServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VrfServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VrfServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specific VRF resource.
     * To get the list of available VRFs, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.baremetal.v1alpha.VrfOuterClass.Vrf get(yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.GetVrfRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of VRF resources in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.ListVrfResponse list(yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.ListVrfRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a VRF in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.CreateVrfRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified VRF resource.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.UpdateVrfRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified VRF resource.
     * Deleting a VRF removes its data permanently and is irreversible.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.DeleteVrfRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists operations for the specified VRF.
     * </pre>
     */
    public yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.ListVrfOperationsResponse listOperations(yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.ListVrfOperationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing VRF resources.
   * </pre>
   */
  public static final class VrfServiceFutureStub extends io.grpc.stub.AbstractFutureStub<VrfServiceFutureStub> {
    private VrfServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VrfServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VrfServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specific VRF resource.
     * To get the list of available VRFs, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.baremetal.v1alpha.VrfOuterClass.Vrf> get(
        yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.GetVrfRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of VRF resources in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.ListVrfResponse> list(
        yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.ListVrfRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a VRF in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.CreateVrfRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified VRF resource.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.UpdateVrfRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified VRF resource.
     * Deleting a VRF removes its data permanently and is irreversible.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.DeleteVrfRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists operations for the specified VRF.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.ListVrfOperationsResponse> listOperations(
        yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.ListVrfOperationsRequest request) {
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
    private final VrfServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(VrfServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.GetVrfRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.baremetal.v1alpha.VrfOuterClass.Vrf>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.ListVrfRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.ListVrfResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.CreateVrfRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.UpdateVrfRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.DeleteVrfRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.ListVrfOperationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.ListVrfOperationsResponse>) responseObserver);
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

  private static abstract class VrfServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    VrfServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.baremetal.v1alpha.VrfServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("VrfService");
    }
  }

  private static final class VrfServiceFileDescriptorSupplier
      extends VrfServiceBaseDescriptorSupplier {
    VrfServiceFileDescriptorSupplier() {}
  }

  private static final class VrfServiceMethodDescriptorSupplier
      extends VrfServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    VrfServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (VrfServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new VrfServiceFileDescriptorSupplier())
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
