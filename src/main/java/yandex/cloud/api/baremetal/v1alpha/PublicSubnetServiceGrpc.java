package yandex.cloud.api.baremetal.v1alpha;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing PublicSubnet resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/baremetal/v1alpha/public_subnet_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PublicSubnetServiceGrpc {

  private PublicSubnetServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.baremetal.v1alpha.PublicSubnetService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.GetPublicSubnetRequest,
      yandex.cloud.api.baremetal.v1alpha.PublicSubnetOuterClass.PublicSubnet> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.GetPublicSubnetRequest.class,
      responseType = yandex.cloud.api.baremetal.v1alpha.PublicSubnetOuterClass.PublicSubnet.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.GetPublicSubnetRequest,
      yandex.cloud.api.baremetal.v1alpha.PublicSubnetOuterClass.PublicSubnet> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.GetPublicSubnetRequest, yandex.cloud.api.baremetal.v1alpha.PublicSubnetOuterClass.PublicSubnet> getGetMethod;
    if ((getGetMethod = PublicSubnetServiceGrpc.getGetMethod) == null) {
      synchronized (PublicSubnetServiceGrpc.class) {
        if ((getGetMethod = PublicSubnetServiceGrpc.getGetMethod) == null) {
          PublicSubnetServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.GetPublicSubnetRequest, yandex.cloud.api.baremetal.v1alpha.PublicSubnetOuterClass.PublicSubnet>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.GetPublicSubnetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.baremetal.v1alpha.PublicSubnetOuterClass.PublicSubnet.getDefaultInstance()))
              .setSchemaDescriptor(new PublicSubnetServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.ListPublicSubnetRequest,
      yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.ListPublicSubnetResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.ListPublicSubnetRequest.class,
      responseType = yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.ListPublicSubnetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.ListPublicSubnetRequest,
      yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.ListPublicSubnetResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.ListPublicSubnetRequest, yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.ListPublicSubnetResponse> getListMethod;
    if ((getListMethod = PublicSubnetServiceGrpc.getListMethod) == null) {
      synchronized (PublicSubnetServiceGrpc.class) {
        if ((getListMethod = PublicSubnetServiceGrpc.getListMethod) == null) {
          PublicSubnetServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.ListPublicSubnetRequest, yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.ListPublicSubnetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.ListPublicSubnetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.ListPublicSubnetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PublicSubnetServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.CreatePublicSubnetRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.CreatePublicSubnetRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.CreatePublicSubnetRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.CreatePublicSubnetRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = PublicSubnetServiceGrpc.getCreateMethod) == null) {
      synchronized (PublicSubnetServiceGrpc.class) {
        if ((getCreateMethod = PublicSubnetServiceGrpc.getCreateMethod) == null) {
          PublicSubnetServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.CreatePublicSubnetRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.CreatePublicSubnetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new PublicSubnetServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.UpdatePublicSubnetRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.UpdatePublicSubnetRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.UpdatePublicSubnetRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.UpdatePublicSubnetRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = PublicSubnetServiceGrpc.getUpdateMethod) == null) {
      synchronized (PublicSubnetServiceGrpc.class) {
        if ((getUpdateMethod = PublicSubnetServiceGrpc.getUpdateMethod) == null) {
          PublicSubnetServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.UpdatePublicSubnetRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.UpdatePublicSubnetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new PublicSubnetServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.DeletePublicSubnetRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.DeletePublicSubnetRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.DeletePublicSubnetRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.DeletePublicSubnetRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = PublicSubnetServiceGrpc.getDeleteMethod) == null) {
      synchronized (PublicSubnetServiceGrpc.class) {
        if ((getDeleteMethod = PublicSubnetServiceGrpc.getDeleteMethod) == null) {
          PublicSubnetServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.DeletePublicSubnetRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.DeletePublicSubnetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new PublicSubnetServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.ListPublicSubnetOperationsRequest,
      yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.ListPublicSubnetOperationsResponse> getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.ListPublicSubnetOperationsRequest.class,
      responseType = yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.ListPublicSubnetOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.ListPublicSubnetOperationsRequest,
      yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.ListPublicSubnetOperationsResponse> getListOperationsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.ListPublicSubnetOperationsRequest, yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.ListPublicSubnetOperationsResponse> getListOperationsMethod;
    if ((getListOperationsMethod = PublicSubnetServiceGrpc.getListOperationsMethod) == null) {
      synchronized (PublicSubnetServiceGrpc.class) {
        if ((getListOperationsMethod = PublicSubnetServiceGrpc.getListOperationsMethod) == null) {
          PublicSubnetServiceGrpc.getListOperationsMethod = getListOperationsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.ListPublicSubnetOperationsRequest, yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.ListPublicSubnetOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.ListPublicSubnetOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.ListPublicSubnetOperationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PublicSubnetServiceMethodDescriptorSupplier("ListOperations"))
              .build();
        }
      }
    }
    return getListOperationsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PublicSubnetServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PublicSubnetServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PublicSubnetServiceStub>() {
        @java.lang.Override
        public PublicSubnetServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PublicSubnetServiceStub(channel, callOptions);
        }
      };
    return PublicSubnetServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PublicSubnetServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PublicSubnetServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PublicSubnetServiceBlockingStub>() {
        @java.lang.Override
        public PublicSubnetServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PublicSubnetServiceBlockingStub(channel, callOptions);
        }
      };
    return PublicSubnetServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PublicSubnetServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PublicSubnetServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PublicSubnetServiceFutureStub>() {
        @java.lang.Override
        public PublicSubnetServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PublicSubnetServiceFutureStub(channel, callOptions);
        }
      };
    return PublicSubnetServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing PublicSubnet resources.
   * </pre>
   */
  public static abstract class PublicSubnetServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specific PublicSubnet resource.
     * To get the list of available PublicSubnet resources, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.GetPublicSubnetRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.baremetal.v1alpha.PublicSubnetOuterClass.PublicSubnet> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of PublicSubnet resources in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.ListPublicSubnetRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.ListPublicSubnetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a public subnet in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.CreatePublicSubnetRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified public subnet.
     * </pre>
     */
    public void update(yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.UpdatePublicSubnetRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified public subnet.
     * Deleting a public subnet removes its data permanently and is irreversible.
     * </pre>
     */
    public void delete(yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.DeletePublicSubnetRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified public subnet.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.ListPublicSubnetOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.ListPublicSubnetOperationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.GetPublicSubnetRequest,
                yandex.cloud.api.baremetal.v1alpha.PublicSubnetOuterClass.PublicSubnet>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.ListPublicSubnetRequest,
                yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.ListPublicSubnetResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.CreatePublicSubnetRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.UpdatePublicSubnetRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.DeletePublicSubnetRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListOperationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.ListPublicSubnetOperationsRequest,
                yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.ListPublicSubnetOperationsResponse>(
                  this, METHODID_LIST_OPERATIONS)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing PublicSubnet resources.
   * </pre>
   */
  public static final class PublicSubnetServiceStub extends io.grpc.stub.AbstractAsyncStub<PublicSubnetServiceStub> {
    private PublicSubnetServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PublicSubnetServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PublicSubnetServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specific PublicSubnet resource.
     * To get the list of available PublicSubnet resources, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.GetPublicSubnetRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.baremetal.v1alpha.PublicSubnetOuterClass.PublicSubnet> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of PublicSubnet resources in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.ListPublicSubnetRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.ListPublicSubnetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a public subnet in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.CreatePublicSubnetRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified public subnet.
     * </pre>
     */
    public void update(yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.UpdatePublicSubnetRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified public subnet.
     * Deleting a public subnet removes its data permanently and is irreversible.
     * </pre>
     */
    public void delete(yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.DeletePublicSubnetRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified public subnet.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.ListPublicSubnetOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.ListPublicSubnetOperationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing PublicSubnet resources.
   * </pre>
   */
  public static final class PublicSubnetServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<PublicSubnetServiceBlockingStub> {
    private PublicSubnetServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PublicSubnetServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PublicSubnetServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specific PublicSubnet resource.
     * To get the list of available PublicSubnet resources, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.baremetal.v1alpha.PublicSubnetOuterClass.PublicSubnet get(yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.GetPublicSubnetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of PublicSubnet resources in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.ListPublicSubnetResponse list(yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.ListPublicSubnetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a public subnet in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.CreatePublicSubnetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified public subnet.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.UpdatePublicSubnetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified public subnet.
     * Deleting a public subnet removes its data permanently and is irreversible.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.DeletePublicSubnetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists operations for the specified public subnet.
     * </pre>
     */
    public yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.ListPublicSubnetOperationsResponse listOperations(yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.ListPublicSubnetOperationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing PublicSubnet resources.
   * </pre>
   */
  public static final class PublicSubnetServiceFutureStub extends io.grpc.stub.AbstractFutureStub<PublicSubnetServiceFutureStub> {
    private PublicSubnetServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PublicSubnetServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PublicSubnetServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specific PublicSubnet resource.
     * To get the list of available PublicSubnet resources, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.baremetal.v1alpha.PublicSubnetOuterClass.PublicSubnet> get(
        yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.GetPublicSubnetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of PublicSubnet resources in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.ListPublicSubnetResponse> list(
        yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.ListPublicSubnetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a public subnet in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.CreatePublicSubnetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified public subnet.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.UpdatePublicSubnetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified public subnet.
     * Deleting a public subnet removes its data permanently and is irreversible.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.DeletePublicSubnetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists operations for the specified public subnet.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.ListPublicSubnetOperationsResponse> listOperations(
        yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.ListPublicSubnetOperationsRequest request) {
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
    private final PublicSubnetServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PublicSubnetServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.GetPublicSubnetRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.baremetal.v1alpha.PublicSubnetOuterClass.PublicSubnet>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.ListPublicSubnetRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.ListPublicSubnetResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.CreatePublicSubnetRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.UpdatePublicSubnetRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.DeletePublicSubnetRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.ListPublicSubnetOperationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.ListPublicSubnetOperationsResponse>) responseObserver);
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

  private static abstract class PublicSubnetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PublicSubnetServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.baremetal.v1alpha.PublicSubnetServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PublicSubnetService");
    }
  }

  private static final class PublicSubnetServiceFileDescriptorSupplier
      extends PublicSubnetServiceBaseDescriptorSupplier {
    PublicSubnetServiceFileDescriptorSupplier() {}
  }

  private static final class PublicSubnetServiceMethodDescriptorSupplier
      extends PublicSubnetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PublicSubnetServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PublicSubnetServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PublicSubnetServiceFileDescriptorSupplier())
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
