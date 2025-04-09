package yandex.cloud.api.baremetal.v1alpha;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing PrivateSubnet resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/baremetal/v1alpha/private_subnet_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PrivateSubnetServiceGrpc {

  private PrivateSubnetServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.baremetal.v1alpha.PrivateSubnetService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.GetPrivateSubnetRequest,
      yandex.cloud.api.baremetal.v1alpha.PrivateSubnetOuterClass.PrivateSubnet> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.GetPrivateSubnetRequest.class,
      responseType = yandex.cloud.api.baremetal.v1alpha.PrivateSubnetOuterClass.PrivateSubnet.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.GetPrivateSubnetRequest,
      yandex.cloud.api.baremetal.v1alpha.PrivateSubnetOuterClass.PrivateSubnet> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.GetPrivateSubnetRequest, yandex.cloud.api.baremetal.v1alpha.PrivateSubnetOuterClass.PrivateSubnet> getGetMethod;
    if ((getGetMethod = PrivateSubnetServiceGrpc.getGetMethod) == null) {
      synchronized (PrivateSubnetServiceGrpc.class) {
        if ((getGetMethod = PrivateSubnetServiceGrpc.getGetMethod) == null) {
          PrivateSubnetServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.GetPrivateSubnetRequest, yandex.cloud.api.baremetal.v1alpha.PrivateSubnetOuterClass.PrivateSubnet>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.GetPrivateSubnetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.baremetal.v1alpha.PrivateSubnetOuterClass.PrivateSubnet.getDefaultInstance()))
              .setSchemaDescriptor(new PrivateSubnetServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.ListPrivateSubnetRequest,
      yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.ListPrivateSubnetResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.ListPrivateSubnetRequest.class,
      responseType = yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.ListPrivateSubnetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.ListPrivateSubnetRequest,
      yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.ListPrivateSubnetResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.ListPrivateSubnetRequest, yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.ListPrivateSubnetResponse> getListMethod;
    if ((getListMethod = PrivateSubnetServiceGrpc.getListMethod) == null) {
      synchronized (PrivateSubnetServiceGrpc.class) {
        if ((getListMethod = PrivateSubnetServiceGrpc.getListMethod) == null) {
          PrivateSubnetServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.ListPrivateSubnetRequest, yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.ListPrivateSubnetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.ListPrivateSubnetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.ListPrivateSubnetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PrivateSubnetServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.CreatePrivateSubnetRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.CreatePrivateSubnetRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.CreatePrivateSubnetRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.CreatePrivateSubnetRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = PrivateSubnetServiceGrpc.getCreateMethod) == null) {
      synchronized (PrivateSubnetServiceGrpc.class) {
        if ((getCreateMethod = PrivateSubnetServiceGrpc.getCreateMethod) == null) {
          PrivateSubnetServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.CreatePrivateSubnetRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.CreatePrivateSubnetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new PrivateSubnetServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.UpdatePrivateSubnetRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.UpdatePrivateSubnetRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.UpdatePrivateSubnetRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.UpdatePrivateSubnetRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = PrivateSubnetServiceGrpc.getUpdateMethod) == null) {
      synchronized (PrivateSubnetServiceGrpc.class) {
        if ((getUpdateMethod = PrivateSubnetServiceGrpc.getUpdateMethod) == null) {
          PrivateSubnetServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.UpdatePrivateSubnetRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.UpdatePrivateSubnetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new PrivateSubnetServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.DeletePrivateSubnetRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.DeletePrivateSubnetRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.DeletePrivateSubnetRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.DeletePrivateSubnetRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = PrivateSubnetServiceGrpc.getDeleteMethod) == null) {
      synchronized (PrivateSubnetServiceGrpc.class) {
        if ((getDeleteMethod = PrivateSubnetServiceGrpc.getDeleteMethod) == null) {
          PrivateSubnetServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.DeletePrivateSubnetRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.DeletePrivateSubnetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new PrivateSubnetServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.ListPrivateSubnetOperationsRequest,
      yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.ListPrivateSubnetOperationsResponse> getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.ListPrivateSubnetOperationsRequest.class,
      responseType = yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.ListPrivateSubnetOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.ListPrivateSubnetOperationsRequest,
      yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.ListPrivateSubnetOperationsResponse> getListOperationsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.ListPrivateSubnetOperationsRequest, yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.ListPrivateSubnetOperationsResponse> getListOperationsMethod;
    if ((getListOperationsMethod = PrivateSubnetServiceGrpc.getListOperationsMethod) == null) {
      synchronized (PrivateSubnetServiceGrpc.class) {
        if ((getListOperationsMethod = PrivateSubnetServiceGrpc.getListOperationsMethod) == null) {
          PrivateSubnetServiceGrpc.getListOperationsMethod = getListOperationsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.ListPrivateSubnetOperationsRequest, yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.ListPrivateSubnetOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.ListPrivateSubnetOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.ListPrivateSubnetOperationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PrivateSubnetServiceMethodDescriptorSupplier("ListOperations"))
              .build();
        }
      }
    }
    return getListOperationsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PrivateSubnetServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PrivateSubnetServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PrivateSubnetServiceStub>() {
        @java.lang.Override
        public PrivateSubnetServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PrivateSubnetServiceStub(channel, callOptions);
        }
      };
    return PrivateSubnetServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PrivateSubnetServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PrivateSubnetServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PrivateSubnetServiceBlockingStub>() {
        @java.lang.Override
        public PrivateSubnetServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PrivateSubnetServiceBlockingStub(channel, callOptions);
        }
      };
    return PrivateSubnetServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PrivateSubnetServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PrivateSubnetServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PrivateSubnetServiceFutureStub>() {
        @java.lang.Override
        public PrivateSubnetServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PrivateSubnetServiceFutureStub(channel, callOptions);
        }
      };
    return PrivateSubnetServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing PrivateSubnet resources.
   * </pre>
   */
  public static abstract class PrivateSubnetServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specific PrivateSubnet resource.
     * To get the list of available PrivateSubnet resources, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.GetPrivateSubnetRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.baremetal.v1alpha.PrivateSubnetOuterClass.PrivateSubnet> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of PrivateSubnet resources in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.ListPrivateSubnetRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.ListPrivateSubnetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a private subnet in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.CreatePrivateSubnetRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified private subnet.
     * </pre>
     */
    public void update(yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.UpdatePrivateSubnetRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified private subnet.
     * Deleting a private subnet removes its data permanently and is irreversible.
     * </pre>
     */
    public void delete(yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.DeletePrivateSubnetRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified private subnet.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.ListPrivateSubnetOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.ListPrivateSubnetOperationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.GetPrivateSubnetRequest,
                yandex.cloud.api.baremetal.v1alpha.PrivateSubnetOuterClass.PrivateSubnet>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.ListPrivateSubnetRequest,
                yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.ListPrivateSubnetResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.CreatePrivateSubnetRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.UpdatePrivateSubnetRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.DeletePrivateSubnetRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListOperationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.ListPrivateSubnetOperationsRequest,
                yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.ListPrivateSubnetOperationsResponse>(
                  this, METHODID_LIST_OPERATIONS)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing PrivateSubnet resources.
   * </pre>
   */
  public static final class PrivateSubnetServiceStub extends io.grpc.stub.AbstractAsyncStub<PrivateSubnetServiceStub> {
    private PrivateSubnetServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PrivateSubnetServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PrivateSubnetServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specific PrivateSubnet resource.
     * To get the list of available PrivateSubnet resources, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.GetPrivateSubnetRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.baremetal.v1alpha.PrivateSubnetOuterClass.PrivateSubnet> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of PrivateSubnet resources in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.ListPrivateSubnetRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.ListPrivateSubnetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a private subnet in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.CreatePrivateSubnetRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified private subnet.
     * </pre>
     */
    public void update(yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.UpdatePrivateSubnetRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified private subnet.
     * Deleting a private subnet removes its data permanently and is irreversible.
     * </pre>
     */
    public void delete(yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.DeletePrivateSubnetRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified private subnet.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.ListPrivateSubnetOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.ListPrivateSubnetOperationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing PrivateSubnet resources.
   * </pre>
   */
  public static final class PrivateSubnetServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<PrivateSubnetServiceBlockingStub> {
    private PrivateSubnetServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PrivateSubnetServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PrivateSubnetServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specific PrivateSubnet resource.
     * To get the list of available PrivateSubnet resources, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.baremetal.v1alpha.PrivateSubnetOuterClass.PrivateSubnet get(yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.GetPrivateSubnetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of PrivateSubnet resources in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.ListPrivateSubnetResponse list(yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.ListPrivateSubnetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a private subnet in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.CreatePrivateSubnetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified private subnet.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.UpdatePrivateSubnetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified private subnet.
     * Deleting a private subnet removes its data permanently and is irreversible.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.DeletePrivateSubnetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists operations for the specified private subnet.
     * </pre>
     */
    public yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.ListPrivateSubnetOperationsResponse listOperations(yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.ListPrivateSubnetOperationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing PrivateSubnet resources.
   * </pre>
   */
  public static final class PrivateSubnetServiceFutureStub extends io.grpc.stub.AbstractFutureStub<PrivateSubnetServiceFutureStub> {
    private PrivateSubnetServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PrivateSubnetServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PrivateSubnetServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specific PrivateSubnet resource.
     * To get the list of available PrivateSubnet resources, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.baremetal.v1alpha.PrivateSubnetOuterClass.PrivateSubnet> get(
        yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.GetPrivateSubnetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of PrivateSubnet resources in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.ListPrivateSubnetResponse> list(
        yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.ListPrivateSubnetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a private subnet in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.CreatePrivateSubnetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified private subnet.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.UpdatePrivateSubnetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified private subnet.
     * Deleting a private subnet removes its data permanently and is irreversible.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.DeletePrivateSubnetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists operations for the specified private subnet.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.ListPrivateSubnetOperationsResponse> listOperations(
        yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.ListPrivateSubnetOperationsRequest request) {
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
    private final PrivateSubnetServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PrivateSubnetServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.GetPrivateSubnetRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.baremetal.v1alpha.PrivateSubnetOuterClass.PrivateSubnet>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.ListPrivateSubnetRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.ListPrivateSubnetResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.CreatePrivateSubnetRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.UpdatePrivateSubnetRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.DeletePrivateSubnetRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.ListPrivateSubnetOperationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.ListPrivateSubnetOperationsResponse>) responseObserver);
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

  private static abstract class PrivateSubnetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PrivateSubnetServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.baremetal.v1alpha.PrivateSubnetServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PrivateSubnetService");
    }
  }

  private static final class PrivateSubnetServiceFileDescriptorSupplier
      extends PrivateSubnetServiceBaseDescriptorSupplier {
    PrivateSubnetServiceFileDescriptorSupplier() {}
  }

  private static final class PrivateSubnetServiceMethodDescriptorSupplier
      extends PrivateSubnetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PrivateSubnetServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PrivateSubnetServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PrivateSubnetServiceFileDescriptorSupplier())
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
