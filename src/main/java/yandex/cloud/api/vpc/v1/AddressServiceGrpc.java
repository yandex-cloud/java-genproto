package yandex.cloud.api.vpc.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing Address resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/vpc/v1/address_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AddressServiceGrpc {

  private AddressServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.vpc.v1.AddressService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.AddressServiceOuterClass.GetAddressRequest,
      yandex.cloud.api.vpc.v1.AddressOuterClass.Address> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.vpc.v1.AddressServiceOuterClass.GetAddressRequest.class,
      responseType = yandex.cloud.api.vpc.v1.AddressOuterClass.Address.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.AddressServiceOuterClass.GetAddressRequest,
      yandex.cloud.api.vpc.v1.AddressOuterClass.Address> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.AddressServiceOuterClass.GetAddressRequest, yandex.cloud.api.vpc.v1.AddressOuterClass.Address> getGetMethod;
    if ((getGetMethod = AddressServiceGrpc.getGetMethod) == null) {
      synchronized (AddressServiceGrpc.class) {
        if ((getGetMethod = AddressServiceGrpc.getGetMethod) == null) {
          AddressServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.vpc.v1.AddressServiceOuterClass.GetAddressRequest, yandex.cloud.api.vpc.v1.AddressOuterClass.Address>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.AddressServiceOuterClass.GetAddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.AddressOuterClass.Address.getDefaultInstance()))
              .setSchemaDescriptor(new AddressServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.AddressServiceOuterClass.GetAddressByValueRequest,
      yandex.cloud.api.vpc.v1.AddressOuterClass.Address> getGetByValueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetByValue",
      requestType = yandex.cloud.api.vpc.v1.AddressServiceOuterClass.GetAddressByValueRequest.class,
      responseType = yandex.cloud.api.vpc.v1.AddressOuterClass.Address.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.AddressServiceOuterClass.GetAddressByValueRequest,
      yandex.cloud.api.vpc.v1.AddressOuterClass.Address> getGetByValueMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.AddressServiceOuterClass.GetAddressByValueRequest, yandex.cloud.api.vpc.v1.AddressOuterClass.Address> getGetByValueMethod;
    if ((getGetByValueMethod = AddressServiceGrpc.getGetByValueMethod) == null) {
      synchronized (AddressServiceGrpc.class) {
        if ((getGetByValueMethod = AddressServiceGrpc.getGetByValueMethod) == null) {
          AddressServiceGrpc.getGetByValueMethod = getGetByValueMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.vpc.v1.AddressServiceOuterClass.GetAddressByValueRequest, yandex.cloud.api.vpc.v1.AddressOuterClass.Address>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetByValue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.AddressServiceOuterClass.GetAddressByValueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.AddressOuterClass.Address.getDefaultInstance()))
              .setSchemaDescriptor(new AddressServiceMethodDescriptorSupplier("GetByValue"))
              .build();
        }
      }
    }
    return getGetByValueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.AddressServiceOuterClass.ListAddressesRequest,
      yandex.cloud.api.vpc.v1.AddressServiceOuterClass.ListAddressesResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.vpc.v1.AddressServiceOuterClass.ListAddressesRequest.class,
      responseType = yandex.cloud.api.vpc.v1.AddressServiceOuterClass.ListAddressesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.AddressServiceOuterClass.ListAddressesRequest,
      yandex.cloud.api.vpc.v1.AddressServiceOuterClass.ListAddressesResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.AddressServiceOuterClass.ListAddressesRequest, yandex.cloud.api.vpc.v1.AddressServiceOuterClass.ListAddressesResponse> getListMethod;
    if ((getListMethod = AddressServiceGrpc.getListMethod) == null) {
      synchronized (AddressServiceGrpc.class) {
        if ((getListMethod = AddressServiceGrpc.getListMethod) == null) {
          AddressServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.vpc.v1.AddressServiceOuterClass.ListAddressesRequest, yandex.cloud.api.vpc.v1.AddressServiceOuterClass.ListAddressesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.AddressServiceOuterClass.ListAddressesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.AddressServiceOuterClass.ListAddressesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AddressServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.AddressServiceOuterClass.CreateAddressRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.vpc.v1.AddressServiceOuterClass.CreateAddressRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.AddressServiceOuterClass.CreateAddressRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.AddressServiceOuterClass.CreateAddressRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = AddressServiceGrpc.getCreateMethod) == null) {
      synchronized (AddressServiceGrpc.class) {
        if ((getCreateMethod = AddressServiceGrpc.getCreateMethod) == null) {
          AddressServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.vpc.v1.AddressServiceOuterClass.CreateAddressRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.AddressServiceOuterClass.CreateAddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new AddressServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.AddressServiceOuterClass.UpdateAddressRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.vpc.v1.AddressServiceOuterClass.UpdateAddressRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.AddressServiceOuterClass.UpdateAddressRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.AddressServiceOuterClass.UpdateAddressRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = AddressServiceGrpc.getUpdateMethod) == null) {
      synchronized (AddressServiceGrpc.class) {
        if ((getUpdateMethod = AddressServiceGrpc.getUpdateMethod) == null) {
          AddressServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.vpc.v1.AddressServiceOuterClass.UpdateAddressRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.AddressServiceOuterClass.UpdateAddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new AddressServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.AddressServiceOuterClass.DeleteAddressRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.vpc.v1.AddressServiceOuterClass.DeleteAddressRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.AddressServiceOuterClass.DeleteAddressRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.AddressServiceOuterClass.DeleteAddressRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = AddressServiceGrpc.getDeleteMethod) == null) {
      synchronized (AddressServiceGrpc.class) {
        if ((getDeleteMethod = AddressServiceGrpc.getDeleteMethod) == null) {
          AddressServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.vpc.v1.AddressServiceOuterClass.DeleteAddressRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.AddressServiceOuterClass.DeleteAddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new AddressServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.AddressServiceOuterClass.ListAddressOperationsRequest,
      yandex.cloud.api.vpc.v1.AddressServiceOuterClass.ListAddressOperationsResponse> getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = yandex.cloud.api.vpc.v1.AddressServiceOuterClass.ListAddressOperationsRequest.class,
      responseType = yandex.cloud.api.vpc.v1.AddressServiceOuterClass.ListAddressOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.AddressServiceOuterClass.ListAddressOperationsRequest,
      yandex.cloud.api.vpc.v1.AddressServiceOuterClass.ListAddressOperationsResponse> getListOperationsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.AddressServiceOuterClass.ListAddressOperationsRequest, yandex.cloud.api.vpc.v1.AddressServiceOuterClass.ListAddressOperationsResponse> getListOperationsMethod;
    if ((getListOperationsMethod = AddressServiceGrpc.getListOperationsMethod) == null) {
      synchronized (AddressServiceGrpc.class) {
        if ((getListOperationsMethod = AddressServiceGrpc.getListOperationsMethod) == null) {
          AddressServiceGrpc.getListOperationsMethod = getListOperationsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.vpc.v1.AddressServiceOuterClass.ListAddressOperationsRequest, yandex.cloud.api.vpc.v1.AddressServiceOuterClass.ListAddressOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.AddressServiceOuterClass.ListAddressOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.AddressServiceOuterClass.ListAddressOperationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AddressServiceMethodDescriptorSupplier("ListOperations"))
              .build();
        }
      }
    }
    return getListOperationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.AddressServiceOuterClass.MoveAddressRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getMoveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Move",
      requestType = yandex.cloud.api.vpc.v1.AddressServiceOuterClass.MoveAddressRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.AddressServiceOuterClass.MoveAddressRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getMoveMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.AddressServiceOuterClass.MoveAddressRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getMoveMethod;
    if ((getMoveMethod = AddressServiceGrpc.getMoveMethod) == null) {
      synchronized (AddressServiceGrpc.class) {
        if ((getMoveMethod = AddressServiceGrpc.getMoveMethod) == null) {
          AddressServiceGrpc.getMoveMethod = getMoveMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.vpc.v1.AddressServiceOuterClass.MoveAddressRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Move"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.AddressServiceOuterClass.MoveAddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new AddressServiceMethodDescriptorSupplier("Move"))
              .build();
        }
      }
    }
    return getMoveMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AddressServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AddressServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AddressServiceStub>() {
        @java.lang.Override
        public AddressServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AddressServiceStub(channel, callOptions);
        }
      };
    return AddressServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AddressServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AddressServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AddressServiceBlockingStub>() {
        @java.lang.Override
        public AddressServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AddressServiceBlockingStub(channel, callOptions);
        }
      };
    return AddressServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AddressServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AddressServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AddressServiceFutureStub>() {
        @java.lang.Override
        public AddressServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AddressServiceFutureStub(channel, callOptions);
        }
      };
    return AddressServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing Address resources.
   * </pre>
   */
  public static abstract class AddressServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified Address resource.
     * To get the list of all available Address resources, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.vpc.v1.AddressServiceOuterClass.GetAddressRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.AddressOuterClass.Address> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the specified Address resource by a given value.
     * To get the list of all available Address resources, make a [List] request.
     * </pre>
     */
    public void getByValue(yandex.cloud.api.vpc.v1.AddressServiceOuterClass.GetAddressByValueRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.AddressOuterClass.Address> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetByValueMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of Address resources in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.vpc.v1.AddressServiceOuterClass.ListAddressesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.AddressServiceOuterClass.ListAddressesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates an address in the specified folder and network.
     * </pre>
     */
    public void create(yandex.cloud.api.vpc.v1.AddressServiceOuterClass.CreateAddressRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified address.
     * </pre>
     */
    public void update(yandex.cloud.api.vpc.v1.AddressServiceOuterClass.UpdateAddressRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified address.
     * </pre>
     */
    public void delete(yandex.cloud.api.vpc.v1.AddressServiceOuterClass.DeleteAddressRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * List operations for the specified address.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.vpc.v1.AddressServiceOuterClass.ListAddressOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.AddressServiceOuterClass.ListAddressOperationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Move an address to another folder
     * </pre>
     */
    public void move(yandex.cloud.api.vpc.v1.AddressServiceOuterClass.MoveAddressRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMoveMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.vpc.v1.AddressServiceOuterClass.GetAddressRequest,
                yandex.cloud.api.vpc.v1.AddressOuterClass.Address>(
                  this, METHODID_GET)))
          .addMethod(
            getGetByValueMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.vpc.v1.AddressServiceOuterClass.GetAddressByValueRequest,
                yandex.cloud.api.vpc.v1.AddressOuterClass.Address>(
                  this, METHODID_GET_BY_VALUE)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.vpc.v1.AddressServiceOuterClass.ListAddressesRequest,
                yandex.cloud.api.vpc.v1.AddressServiceOuterClass.ListAddressesResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.vpc.v1.AddressServiceOuterClass.CreateAddressRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.vpc.v1.AddressServiceOuterClass.UpdateAddressRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.vpc.v1.AddressServiceOuterClass.DeleteAddressRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListOperationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.vpc.v1.AddressServiceOuterClass.ListAddressOperationsRequest,
                yandex.cloud.api.vpc.v1.AddressServiceOuterClass.ListAddressOperationsResponse>(
                  this, METHODID_LIST_OPERATIONS)))
          .addMethod(
            getMoveMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.vpc.v1.AddressServiceOuterClass.MoveAddressRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_MOVE)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing Address resources.
   * </pre>
   */
  public static final class AddressServiceStub extends io.grpc.stub.AbstractAsyncStub<AddressServiceStub> {
    private AddressServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AddressServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AddressServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified Address resource.
     * To get the list of all available Address resources, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.vpc.v1.AddressServiceOuterClass.GetAddressRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.AddressOuterClass.Address> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the specified Address resource by a given value.
     * To get the list of all available Address resources, make a [List] request.
     * </pre>
     */
    public void getByValue(yandex.cloud.api.vpc.v1.AddressServiceOuterClass.GetAddressByValueRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.AddressOuterClass.Address> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetByValueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of Address resources in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.vpc.v1.AddressServiceOuterClass.ListAddressesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.AddressServiceOuterClass.ListAddressesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates an address in the specified folder and network.
     * </pre>
     */
    public void create(yandex.cloud.api.vpc.v1.AddressServiceOuterClass.CreateAddressRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified address.
     * </pre>
     */
    public void update(yandex.cloud.api.vpc.v1.AddressServiceOuterClass.UpdateAddressRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified address.
     * </pre>
     */
    public void delete(yandex.cloud.api.vpc.v1.AddressServiceOuterClass.DeleteAddressRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List operations for the specified address.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.vpc.v1.AddressServiceOuterClass.ListAddressOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.AddressServiceOuterClass.ListAddressOperationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Move an address to another folder
     * </pre>
     */
    public void move(yandex.cloud.api.vpc.v1.AddressServiceOuterClass.MoveAddressRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMoveMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Address resources.
   * </pre>
   */
  public static final class AddressServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AddressServiceBlockingStub> {
    private AddressServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AddressServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AddressServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified Address resource.
     * To get the list of all available Address resources, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.vpc.v1.AddressOuterClass.Address get(yandex.cloud.api.vpc.v1.AddressServiceOuterClass.GetAddressRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the specified Address resource by a given value.
     * To get the list of all available Address resources, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.vpc.v1.AddressOuterClass.Address getByValue(yandex.cloud.api.vpc.v1.AddressServiceOuterClass.GetAddressByValueRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetByValueMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of Address resources in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.vpc.v1.AddressServiceOuterClass.ListAddressesResponse list(yandex.cloud.api.vpc.v1.AddressServiceOuterClass.ListAddressesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates an address in the specified folder and network.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.vpc.v1.AddressServiceOuterClass.CreateAddressRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified address.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.vpc.v1.AddressServiceOuterClass.UpdateAddressRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified address.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.vpc.v1.AddressServiceOuterClass.DeleteAddressRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List operations for the specified address.
     * </pre>
     */
    public yandex.cloud.api.vpc.v1.AddressServiceOuterClass.ListAddressOperationsResponse listOperations(yandex.cloud.api.vpc.v1.AddressServiceOuterClass.ListAddressOperationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Move an address to another folder
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation move(yandex.cloud.api.vpc.v1.AddressServiceOuterClass.MoveAddressRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMoveMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Address resources.
   * </pre>
   */
  public static final class AddressServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AddressServiceFutureStub> {
    private AddressServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AddressServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AddressServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified Address resource.
     * To get the list of all available Address resources, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.vpc.v1.AddressOuterClass.Address> get(
        yandex.cloud.api.vpc.v1.AddressServiceOuterClass.GetAddressRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the specified Address resource by a given value.
     * To get the list of all available Address resources, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.vpc.v1.AddressOuterClass.Address> getByValue(
        yandex.cloud.api.vpc.v1.AddressServiceOuterClass.GetAddressByValueRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetByValueMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of Address resources in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.vpc.v1.AddressServiceOuterClass.ListAddressesResponse> list(
        yandex.cloud.api.vpc.v1.AddressServiceOuterClass.ListAddressesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates an address in the specified folder and network.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.vpc.v1.AddressServiceOuterClass.CreateAddressRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified address.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.vpc.v1.AddressServiceOuterClass.UpdateAddressRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified address.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.vpc.v1.AddressServiceOuterClass.DeleteAddressRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List operations for the specified address.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.vpc.v1.AddressServiceOuterClass.ListAddressOperationsResponse> listOperations(
        yandex.cloud.api.vpc.v1.AddressServiceOuterClass.ListAddressOperationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Move an address to another folder
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> move(
        yandex.cloud.api.vpc.v1.AddressServiceOuterClass.MoveAddressRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMoveMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_GET_BY_VALUE = 1;
  private static final int METHODID_LIST = 2;
  private static final int METHODID_CREATE = 3;
  private static final int METHODID_UPDATE = 4;
  private static final int METHODID_DELETE = 5;
  private static final int METHODID_LIST_OPERATIONS = 6;
  private static final int METHODID_MOVE = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AddressServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AddressServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.vpc.v1.AddressServiceOuterClass.GetAddressRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.AddressOuterClass.Address>) responseObserver);
          break;
        case METHODID_GET_BY_VALUE:
          serviceImpl.getByValue((yandex.cloud.api.vpc.v1.AddressServiceOuterClass.GetAddressByValueRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.AddressOuterClass.Address>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.vpc.v1.AddressServiceOuterClass.ListAddressesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.AddressServiceOuterClass.ListAddressesResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.vpc.v1.AddressServiceOuterClass.CreateAddressRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.vpc.v1.AddressServiceOuterClass.UpdateAddressRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.vpc.v1.AddressServiceOuterClass.DeleteAddressRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((yandex.cloud.api.vpc.v1.AddressServiceOuterClass.ListAddressOperationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.AddressServiceOuterClass.ListAddressOperationsResponse>) responseObserver);
          break;
        case METHODID_MOVE:
          serviceImpl.move((yandex.cloud.api.vpc.v1.AddressServiceOuterClass.MoveAddressRequest) request,
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

  private static abstract class AddressServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AddressServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.vpc.v1.AddressServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AddressService");
    }
  }

  private static final class AddressServiceFileDescriptorSupplier
      extends AddressServiceBaseDescriptorSupplier {
    AddressServiceFileDescriptorSupplier() {}
  }

  private static final class AddressServiceMethodDescriptorSupplier
      extends AddressServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AddressServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AddressServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AddressServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getGetByValueMethod())
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getListOperationsMethod())
              .addMethod(getMoveMethod())
              .build();
        }
      }
    }
    return result;
  }
}
