package yandex.cloud.api.vpc.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * A set of methods for managing Subnet resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.0)",
    comments = "Source: yandex/cloud/vpc/v1/subnet_service.proto")
public final class SubnetServiceGrpc {

  private SubnetServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.vpc.v1.SubnetService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.GetSubnetRequest,
      yandex.cloud.api.vpc.v1.SubnetOuterClass.Subnet> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.GetSubnetRequest.class,
      responseType = yandex.cloud.api.vpc.v1.SubnetOuterClass.Subnet.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.GetSubnetRequest,
      yandex.cloud.api.vpc.v1.SubnetOuterClass.Subnet> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.GetSubnetRequest, yandex.cloud.api.vpc.v1.SubnetOuterClass.Subnet> getGetMethod;
    if ((getGetMethod = SubnetServiceGrpc.getGetMethod) == null) {
      synchronized (SubnetServiceGrpc.class) {
        if ((getGetMethod = SubnetServiceGrpc.getGetMethod) == null) {
          SubnetServiceGrpc.getGetMethod = getGetMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.GetSubnetRequest, yandex.cloud.api.vpc.v1.SubnetOuterClass.Subnet>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.vpc.v1.SubnetService", "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.GetSubnetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.SubnetOuterClass.Subnet.getDefaultInstance()))
                  .setSchemaDescriptor(new SubnetServiceMethodDescriptorSupplier("Get"))
                  .build();
          }
        }
     }
     return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetsRequest,
      yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetsRequest.class,
      responseType = yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetsRequest,
      yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetsRequest, yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetsResponse> getListMethod;
    if ((getListMethod = SubnetServiceGrpc.getListMethod) == null) {
      synchronized (SubnetServiceGrpc.class) {
        if ((getListMethod = SubnetServiceGrpc.getListMethod) == null) {
          SubnetServiceGrpc.getListMethod = getListMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetsRequest, yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.vpc.v1.SubnetService", "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SubnetServiceMethodDescriptorSupplier("List"))
                  .build();
          }
        }
     }
     return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.CreateSubnetRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.CreateSubnetRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.CreateSubnetRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.CreateSubnetRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = SubnetServiceGrpc.getCreateMethod) == null) {
      synchronized (SubnetServiceGrpc.class) {
        if ((getCreateMethod = SubnetServiceGrpc.getCreateMethod) == null) {
          SubnetServiceGrpc.getCreateMethod = getCreateMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.CreateSubnetRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.vpc.v1.SubnetService", "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.CreateSubnetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new SubnetServiceMethodDescriptorSupplier("Create"))
                  .build();
          }
        }
     }
     return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.UpdateSubnetRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.UpdateSubnetRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.UpdateSubnetRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.UpdateSubnetRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = SubnetServiceGrpc.getUpdateMethod) == null) {
      synchronized (SubnetServiceGrpc.class) {
        if ((getUpdateMethod = SubnetServiceGrpc.getUpdateMethod) == null) {
          SubnetServiceGrpc.getUpdateMethod = getUpdateMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.UpdateSubnetRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.vpc.v1.SubnetService", "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.UpdateSubnetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new SubnetServiceMethodDescriptorSupplier("Update"))
                  .build();
          }
        }
     }
     return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.DeleteSubnetRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.DeleteSubnetRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.DeleteSubnetRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.DeleteSubnetRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = SubnetServiceGrpc.getDeleteMethod) == null) {
      synchronized (SubnetServiceGrpc.class) {
        if ((getDeleteMethod = SubnetServiceGrpc.getDeleteMethod) == null) {
          SubnetServiceGrpc.getDeleteMethod = getDeleteMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.DeleteSubnetRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.vpc.v1.SubnetService", "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.DeleteSubnetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new SubnetServiceMethodDescriptorSupplier("Delete"))
                  .build();
          }
        }
     }
     return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetOperationsRequest,
      yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetOperationsResponse> getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetOperationsRequest.class,
      responseType = yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetOperationsRequest,
      yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetOperationsResponse> getListOperationsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetOperationsRequest, yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetOperationsResponse> getListOperationsMethod;
    if ((getListOperationsMethod = SubnetServiceGrpc.getListOperationsMethod) == null) {
      synchronized (SubnetServiceGrpc.class) {
        if ((getListOperationsMethod = SubnetServiceGrpc.getListOperationsMethod) == null) {
          SubnetServiceGrpc.getListOperationsMethod = getListOperationsMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetOperationsRequest, yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.vpc.v1.SubnetService", "ListOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetOperationsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SubnetServiceMethodDescriptorSupplier("ListOperations"))
                  .build();
          }
        }
     }
     return getListOperationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.MoveSubnetRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getMoveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Move",
      requestType = yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.MoveSubnetRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.MoveSubnetRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getMoveMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.MoveSubnetRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getMoveMethod;
    if ((getMoveMethod = SubnetServiceGrpc.getMoveMethod) == null) {
      synchronized (SubnetServiceGrpc.class) {
        if ((getMoveMethod = SubnetServiceGrpc.getMoveMethod) == null) {
          SubnetServiceGrpc.getMoveMethod = getMoveMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.MoveSubnetRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.vpc.v1.SubnetService", "Move"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.MoveSubnetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new SubnetServiceMethodDescriptorSupplier("Move"))
                  .build();
          }
        }
     }
     return getMoveMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SubnetServiceStub newStub(io.grpc.Channel channel) {
    return new SubnetServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SubnetServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SubnetServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SubnetServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SubnetServiceFutureStub(channel);
  }

  /**
   * <pre>
   * A set of methods for managing Subnet resources.
   * </pre>
   */
  public static abstract class SubnetServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified Subnet resource.
     * To get the list of available Subnet resources, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.GetSubnetRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.SubnetOuterClass.Subnet> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of Subnet resources in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a subnet in the specified folder and network.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public void create(yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.CreateSubnetRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified subnet.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public void update(yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.UpdateSubnetRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified subnet.
     * </pre>
     */
    public void delete(yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.DeleteSubnetRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * List operations for the specified subnet.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetOperationsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Move subnet to another folder.
     * </pre>
     */
    public void move(yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.MoveSubnetRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getMoveMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.GetSubnetRequest,
                yandex.cloud.api.vpc.v1.SubnetOuterClass.Subnet>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetsRequest,
                yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetsResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.CreateSubnetRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.UpdateSubnetRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.DeleteSubnetRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListOperationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetOperationsRequest,
                yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetOperationsResponse>(
                  this, METHODID_LIST_OPERATIONS)))
          .addMethod(
            getMoveMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.MoveSubnetRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_MOVE)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing Subnet resources.
   * </pre>
   */
  public static final class SubnetServiceStub extends io.grpc.stub.AbstractStub<SubnetServiceStub> {
    private SubnetServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SubnetServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SubnetServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SubnetServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified Subnet resource.
     * To get the list of available Subnet resources, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.GetSubnetRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.SubnetOuterClass.Subnet> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of Subnet resources in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a subnet in the specified folder and network.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public void create(yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.CreateSubnetRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified subnet.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public void update(yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.UpdateSubnetRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified subnet.
     * </pre>
     */
    public void delete(yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.DeleteSubnetRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List operations for the specified subnet.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetOperationsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Move subnet to another folder.
     * </pre>
     */
    public void move(yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.MoveSubnetRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMoveMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Subnet resources.
   * </pre>
   */
  public static final class SubnetServiceBlockingStub extends io.grpc.stub.AbstractStub<SubnetServiceBlockingStub> {
    private SubnetServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SubnetServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SubnetServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SubnetServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified Subnet resource.
     * To get the list of available Subnet resources, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.vpc.v1.SubnetOuterClass.Subnet get(yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.GetSubnetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of Subnet resources in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetsResponse list(yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a subnet in the specified folder and network.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.CreateSubnetRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified subnet.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.UpdateSubnetRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified subnet.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.DeleteSubnetRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List operations for the specified subnet.
     * </pre>
     */
    public yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetOperationsResponse listOperations(yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetOperationsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Move subnet to another folder.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation move(yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.MoveSubnetRequest request) {
      return blockingUnaryCall(
          getChannel(), getMoveMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Subnet resources.
   * </pre>
   */
  public static final class SubnetServiceFutureStub extends io.grpc.stub.AbstractStub<SubnetServiceFutureStub> {
    private SubnetServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SubnetServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SubnetServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SubnetServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified Subnet resource.
     * To get the list of available Subnet resources, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.vpc.v1.SubnetOuterClass.Subnet> get(
        yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.GetSubnetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of Subnet resources in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetsResponse> list(
        yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a subnet in the specified folder and network.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.CreateSubnetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified subnet.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.UpdateSubnetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified subnet.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.DeleteSubnetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List operations for the specified subnet.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetOperationsResponse> listOperations(
        yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetOperationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Move subnet to another folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> move(
        yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.MoveSubnetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMoveMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_DELETE = 4;
  private static final int METHODID_LIST_OPERATIONS = 5;
  private static final int METHODID_MOVE = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SubnetServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SubnetServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.GetSubnetRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.SubnetOuterClass.Subnet>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetsResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.CreateSubnetRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.UpdateSubnetRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.DeleteSubnetRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetOperationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetOperationsResponse>) responseObserver);
          break;
        case METHODID_MOVE:
          serviceImpl.move((yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.MoveSubnetRequest) request,
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

  private static abstract class SubnetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SubnetServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SubnetService");
    }
  }

  private static final class SubnetServiceFileDescriptorSupplier
      extends SubnetServiceBaseDescriptorSupplier {
    SubnetServiceFileDescriptorSupplier() {}
  }

  private static final class SubnetServiceMethodDescriptorSupplier
      extends SubnetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SubnetServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SubnetServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SubnetServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
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
