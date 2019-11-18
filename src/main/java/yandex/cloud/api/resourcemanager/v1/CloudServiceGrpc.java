package yandex.cloud.api.resourcemanager.v1;

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
 * A set of methods for managing Cloud resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.0)",
    comments = "Source: yandex/cloud/resourcemanager/v1/cloud_service.proto")
public final class CloudServiceGrpc {

  private CloudServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.resourcemanager.v1.CloudService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.resourcemanager.v1.CloudServiceOuterClass.GetCloudRequest,
      yandex.cloud.api.resourcemanager.v1.CloudOuterClass.Cloud> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.resourcemanager.v1.CloudServiceOuterClass.GetCloudRequest.class,
      responseType = yandex.cloud.api.resourcemanager.v1.CloudOuterClass.Cloud.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.resourcemanager.v1.CloudServiceOuterClass.GetCloudRequest,
      yandex.cloud.api.resourcemanager.v1.CloudOuterClass.Cloud> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.resourcemanager.v1.CloudServiceOuterClass.GetCloudRequest, yandex.cloud.api.resourcemanager.v1.CloudOuterClass.Cloud> getGetMethod;
    if ((getGetMethod = CloudServiceGrpc.getGetMethod) == null) {
      synchronized (CloudServiceGrpc.class) {
        if ((getGetMethod = CloudServiceGrpc.getGetMethod) == null) {
          CloudServiceGrpc.getGetMethod = getGetMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.resourcemanager.v1.CloudServiceOuterClass.GetCloudRequest, yandex.cloud.api.resourcemanager.v1.CloudOuterClass.Cloud>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.resourcemanager.v1.CloudService", "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.resourcemanager.v1.CloudServiceOuterClass.GetCloudRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.resourcemanager.v1.CloudOuterClass.Cloud.getDefaultInstance()))
                  .setSchemaDescriptor(new CloudServiceMethodDescriptorSupplier("Get"))
                  .build();
          }
        }
     }
     return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.resourcemanager.v1.CloudServiceOuterClass.ListCloudsRequest,
      yandex.cloud.api.resourcemanager.v1.CloudServiceOuterClass.ListCloudsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.resourcemanager.v1.CloudServiceOuterClass.ListCloudsRequest.class,
      responseType = yandex.cloud.api.resourcemanager.v1.CloudServiceOuterClass.ListCloudsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.resourcemanager.v1.CloudServiceOuterClass.ListCloudsRequest,
      yandex.cloud.api.resourcemanager.v1.CloudServiceOuterClass.ListCloudsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.resourcemanager.v1.CloudServiceOuterClass.ListCloudsRequest, yandex.cloud.api.resourcemanager.v1.CloudServiceOuterClass.ListCloudsResponse> getListMethod;
    if ((getListMethod = CloudServiceGrpc.getListMethod) == null) {
      synchronized (CloudServiceGrpc.class) {
        if ((getListMethod = CloudServiceGrpc.getListMethod) == null) {
          CloudServiceGrpc.getListMethod = getListMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.resourcemanager.v1.CloudServiceOuterClass.ListCloudsRequest, yandex.cloud.api.resourcemanager.v1.CloudServiceOuterClass.ListCloudsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.resourcemanager.v1.CloudService", "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.resourcemanager.v1.CloudServiceOuterClass.ListCloudsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.resourcemanager.v1.CloudServiceOuterClass.ListCloudsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CloudServiceMethodDescriptorSupplier("List"))
                  .build();
          }
        }
     }
     return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.resourcemanager.v1.CloudServiceOuterClass.UpdateCloudRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.resourcemanager.v1.CloudServiceOuterClass.UpdateCloudRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.resourcemanager.v1.CloudServiceOuterClass.UpdateCloudRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.resourcemanager.v1.CloudServiceOuterClass.UpdateCloudRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = CloudServiceGrpc.getUpdateMethod) == null) {
      synchronized (CloudServiceGrpc.class) {
        if ((getUpdateMethod = CloudServiceGrpc.getUpdateMethod) == null) {
          CloudServiceGrpc.getUpdateMethod = getUpdateMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.resourcemanager.v1.CloudServiceOuterClass.UpdateCloudRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.resourcemanager.v1.CloudService", "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.resourcemanager.v1.CloudServiceOuterClass.UpdateCloudRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new CloudServiceMethodDescriptorSupplier("Update"))
                  .build();
          }
        }
     }
     return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.resourcemanager.v1.CloudServiceOuterClass.ListCloudOperationsRequest,
      yandex.cloud.api.resourcemanager.v1.CloudServiceOuterClass.ListCloudOperationsResponse> getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = yandex.cloud.api.resourcemanager.v1.CloudServiceOuterClass.ListCloudOperationsRequest.class,
      responseType = yandex.cloud.api.resourcemanager.v1.CloudServiceOuterClass.ListCloudOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.resourcemanager.v1.CloudServiceOuterClass.ListCloudOperationsRequest,
      yandex.cloud.api.resourcemanager.v1.CloudServiceOuterClass.ListCloudOperationsResponse> getListOperationsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.resourcemanager.v1.CloudServiceOuterClass.ListCloudOperationsRequest, yandex.cloud.api.resourcemanager.v1.CloudServiceOuterClass.ListCloudOperationsResponse> getListOperationsMethod;
    if ((getListOperationsMethod = CloudServiceGrpc.getListOperationsMethod) == null) {
      synchronized (CloudServiceGrpc.class) {
        if ((getListOperationsMethod = CloudServiceGrpc.getListOperationsMethod) == null) {
          CloudServiceGrpc.getListOperationsMethod = getListOperationsMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.resourcemanager.v1.CloudServiceOuterClass.ListCloudOperationsRequest, yandex.cloud.api.resourcemanager.v1.CloudServiceOuterClass.ListCloudOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.resourcemanager.v1.CloudService", "ListOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.resourcemanager.v1.CloudServiceOuterClass.ListCloudOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.resourcemanager.v1.CloudServiceOuterClass.ListCloudOperationsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CloudServiceMethodDescriptorSupplier("ListOperations"))
                  .build();
          }
        }
     }
     return getListOperationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.access.Access.ListAccessBindingsRequest,
      yandex.cloud.api.access.Access.ListAccessBindingsResponse> getListAccessBindingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAccessBindings",
      requestType = yandex.cloud.api.access.Access.ListAccessBindingsRequest.class,
      responseType = yandex.cloud.api.access.Access.ListAccessBindingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.access.Access.ListAccessBindingsRequest,
      yandex.cloud.api.access.Access.ListAccessBindingsResponse> getListAccessBindingsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.access.Access.ListAccessBindingsRequest, yandex.cloud.api.access.Access.ListAccessBindingsResponse> getListAccessBindingsMethod;
    if ((getListAccessBindingsMethod = CloudServiceGrpc.getListAccessBindingsMethod) == null) {
      synchronized (CloudServiceGrpc.class) {
        if ((getListAccessBindingsMethod = CloudServiceGrpc.getListAccessBindingsMethod) == null) {
          CloudServiceGrpc.getListAccessBindingsMethod = getListAccessBindingsMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.ListAccessBindingsRequest, yandex.cloud.api.access.Access.ListAccessBindingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.resourcemanager.v1.CloudService", "ListAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.ListAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.ListAccessBindingsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CloudServiceMethodDescriptorSupplier("ListAccessBindings"))
                  .build();
          }
        }
     }
     return getListAccessBindingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.access.Access.SetAccessBindingsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getSetAccessBindingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetAccessBindings",
      requestType = yandex.cloud.api.access.Access.SetAccessBindingsRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.access.Access.SetAccessBindingsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getSetAccessBindingsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.access.Access.SetAccessBindingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getSetAccessBindingsMethod;
    if ((getSetAccessBindingsMethod = CloudServiceGrpc.getSetAccessBindingsMethod) == null) {
      synchronized (CloudServiceGrpc.class) {
        if ((getSetAccessBindingsMethod = CloudServiceGrpc.getSetAccessBindingsMethod) == null) {
          CloudServiceGrpc.getSetAccessBindingsMethod = getSetAccessBindingsMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.SetAccessBindingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.resourcemanager.v1.CloudService", "SetAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.SetAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new CloudServiceMethodDescriptorSupplier("SetAccessBindings"))
                  .build();
          }
        }
     }
     return getSetAccessBindingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.access.Access.UpdateAccessBindingsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateAccessBindingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAccessBindings",
      requestType = yandex.cloud.api.access.Access.UpdateAccessBindingsRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.access.Access.UpdateAccessBindingsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateAccessBindingsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.access.Access.UpdateAccessBindingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateAccessBindingsMethod;
    if ((getUpdateAccessBindingsMethod = CloudServiceGrpc.getUpdateAccessBindingsMethod) == null) {
      synchronized (CloudServiceGrpc.class) {
        if ((getUpdateAccessBindingsMethod = CloudServiceGrpc.getUpdateAccessBindingsMethod) == null) {
          CloudServiceGrpc.getUpdateAccessBindingsMethod = getUpdateAccessBindingsMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.UpdateAccessBindingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.resourcemanager.v1.CloudService", "UpdateAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.UpdateAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new CloudServiceMethodDescriptorSupplier("UpdateAccessBindings"))
                  .build();
          }
        }
     }
     return getUpdateAccessBindingsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CloudServiceStub newStub(io.grpc.Channel channel) {
    return new CloudServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CloudServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CloudServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CloudServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CloudServiceFutureStub(channel);
  }

  /**
   * <pre>
   * A set of methods for managing Cloud resources.
   * </pre>
   */
  public static abstract class CloudServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified Cloud resource.
     * To get the list of available Cloud resources, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.resourcemanager.v1.CloudServiceOuterClass.GetCloudRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.resourcemanager.v1.CloudOuterClass.Cloud> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of Cloud resources.
     * </pre>
     */
    public void list(yandex.cloud.api.resourcemanager.v1.CloudServiceOuterClass.ListCloudsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.resourcemanager.v1.CloudServiceOuterClass.ListCloudsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified cloud.
     * </pre>
     */
    public void update(yandex.cloud.api.resourcemanager.v1.CloudServiceOuterClass.UpdateCloudRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified cloud.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.resourcemanager.v1.CloudServiceOuterClass.ListCloudOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.resourcemanager.v1.CloudServiceOuterClass.ListCloudOperationsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists access bindings for the specified cloud.
     * </pre>
     */
    public void listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.access.Access.ListAccessBindingsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListAccessBindingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sets access bindings for the specified cloud.
     * </pre>
     */
    public void setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getSetAccessBindingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates access bindings for the specified cloud.
     * </pre>
     */
    public void updateAccessBindings(yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateAccessBindingsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.resourcemanager.v1.CloudServiceOuterClass.GetCloudRequest,
                yandex.cloud.api.resourcemanager.v1.CloudOuterClass.Cloud>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.resourcemanager.v1.CloudServiceOuterClass.ListCloudsRequest,
                yandex.cloud.api.resourcemanager.v1.CloudServiceOuterClass.ListCloudsResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.resourcemanager.v1.CloudServiceOuterClass.UpdateCloudRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getListOperationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.resourcemanager.v1.CloudServiceOuterClass.ListCloudOperationsRequest,
                yandex.cloud.api.resourcemanager.v1.CloudServiceOuterClass.ListCloudOperationsResponse>(
                  this, METHODID_LIST_OPERATIONS)))
          .addMethod(
            getListAccessBindingsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.access.Access.ListAccessBindingsRequest,
                yandex.cloud.api.access.Access.ListAccessBindingsResponse>(
                  this, METHODID_LIST_ACCESS_BINDINGS)))
          .addMethod(
            getSetAccessBindingsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.access.Access.SetAccessBindingsRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_SET_ACCESS_BINDINGS)))
          .addMethod(
            getUpdateAccessBindingsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.access.Access.UpdateAccessBindingsRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE_ACCESS_BINDINGS)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing Cloud resources.
   * </pre>
   */
  public static final class CloudServiceStub extends io.grpc.stub.AbstractStub<CloudServiceStub> {
    private CloudServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CloudServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CloudServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CloudServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified Cloud resource.
     * To get the list of available Cloud resources, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.resourcemanager.v1.CloudServiceOuterClass.GetCloudRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.resourcemanager.v1.CloudOuterClass.Cloud> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of Cloud resources.
     * </pre>
     */
    public void list(yandex.cloud.api.resourcemanager.v1.CloudServiceOuterClass.ListCloudsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.resourcemanager.v1.CloudServiceOuterClass.ListCloudsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified cloud.
     * </pre>
     */
    public void update(yandex.cloud.api.resourcemanager.v1.CloudServiceOuterClass.UpdateCloudRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified cloud.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.resourcemanager.v1.CloudServiceOuterClass.ListCloudOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.resourcemanager.v1.CloudServiceOuterClass.ListCloudOperationsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists access bindings for the specified cloud.
     * </pre>
     */
    public void listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.access.Access.ListAccessBindingsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sets access bindings for the specified cloud.
     * </pre>
     */
    public void setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates access bindings for the specified cloud.
     * </pre>
     */
    public void updateAccessBindings(yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Cloud resources.
   * </pre>
   */
  public static final class CloudServiceBlockingStub extends io.grpc.stub.AbstractStub<CloudServiceBlockingStub> {
    private CloudServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CloudServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CloudServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CloudServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified Cloud resource.
     * To get the list of available Cloud resources, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.resourcemanager.v1.CloudOuterClass.Cloud get(yandex.cloud.api.resourcemanager.v1.CloudServiceOuterClass.GetCloudRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of Cloud resources.
     * </pre>
     */
    public yandex.cloud.api.resourcemanager.v1.CloudServiceOuterClass.ListCloudsResponse list(yandex.cloud.api.resourcemanager.v1.CloudServiceOuterClass.ListCloudsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified cloud.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.resourcemanager.v1.CloudServiceOuterClass.UpdateCloudRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists operations for the specified cloud.
     * </pre>
     */
    public yandex.cloud.api.resourcemanager.v1.CloudServiceOuterClass.ListCloudOperationsResponse listOperations(yandex.cloud.api.resourcemanager.v1.CloudServiceOuterClass.ListCloudOperationsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists access bindings for the specified cloud.
     * </pre>
     */
    public yandex.cloud.api.access.Access.ListAccessBindingsResponse listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListAccessBindingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets access bindings for the specified cloud.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetAccessBindingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates access bindings for the specified cloud.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation updateAccessBindings(yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateAccessBindingsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Cloud resources.
   * </pre>
   */
  public static final class CloudServiceFutureStub extends io.grpc.stub.AbstractStub<CloudServiceFutureStub> {
    private CloudServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CloudServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CloudServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CloudServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified Cloud resource.
     * To get the list of available Cloud resources, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.resourcemanager.v1.CloudOuterClass.Cloud> get(
        yandex.cloud.api.resourcemanager.v1.CloudServiceOuterClass.GetCloudRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of Cloud resources.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.resourcemanager.v1.CloudServiceOuterClass.ListCloudsResponse> list(
        yandex.cloud.api.resourcemanager.v1.CloudServiceOuterClass.ListCloudsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified cloud.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.resourcemanager.v1.CloudServiceOuterClass.UpdateCloudRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists operations for the specified cloud.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.resourcemanager.v1.CloudServiceOuterClass.ListCloudOperationsResponse> listOperations(
        yandex.cloud.api.resourcemanager.v1.CloudServiceOuterClass.ListCloudOperationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists access bindings for the specified cloud.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.access.Access.ListAccessBindingsResponse> listAccessBindings(
        yandex.cloud.api.access.Access.ListAccessBindingsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListAccessBindingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sets access bindings for the specified cloud.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> setAccessBindings(
        yandex.cloud.api.access.Access.SetAccessBindingsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetAccessBindingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates access bindings for the specified cloud.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> updateAccessBindings(
        yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateAccessBindingsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_UPDATE = 2;
  private static final int METHODID_LIST_OPERATIONS = 3;
  private static final int METHODID_LIST_ACCESS_BINDINGS = 4;
  private static final int METHODID_SET_ACCESS_BINDINGS = 5;
  private static final int METHODID_UPDATE_ACCESS_BINDINGS = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CloudServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CloudServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.resourcemanager.v1.CloudServiceOuterClass.GetCloudRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.resourcemanager.v1.CloudOuterClass.Cloud>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.resourcemanager.v1.CloudServiceOuterClass.ListCloudsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.resourcemanager.v1.CloudServiceOuterClass.ListCloudsResponse>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.resourcemanager.v1.CloudServiceOuterClass.UpdateCloudRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((yandex.cloud.api.resourcemanager.v1.CloudServiceOuterClass.ListCloudOperationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.resourcemanager.v1.CloudServiceOuterClass.ListCloudOperationsResponse>) responseObserver);
          break;
        case METHODID_LIST_ACCESS_BINDINGS:
          serviceImpl.listAccessBindings((yandex.cloud.api.access.Access.ListAccessBindingsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.access.Access.ListAccessBindingsResponse>) responseObserver);
          break;
        case METHODID_SET_ACCESS_BINDINGS:
          serviceImpl.setAccessBindings((yandex.cloud.api.access.Access.SetAccessBindingsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE_ACCESS_BINDINGS:
          serviceImpl.updateAccessBindings((yandex.cloud.api.access.Access.UpdateAccessBindingsRequest) request,
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

  private static abstract class CloudServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CloudServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.resourcemanager.v1.CloudServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CloudService");
    }
  }

  private static final class CloudServiceFileDescriptorSupplier
      extends CloudServiceBaseDescriptorSupplier {
    CloudServiceFileDescriptorSupplier() {}
  }

  private static final class CloudServiceMethodDescriptorSupplier
      extends CloudServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CloudServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CloudServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CloudServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getListOperationsMethod())
              .addMethod(getListAccessBindingsMethod())
              .addMethod(getSetAccessBindingsMethod())
              .addMethod(getUpdateAccessBindingsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
