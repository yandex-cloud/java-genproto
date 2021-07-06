package yandex.cloud.api.apploadbalancer.v1;

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
 * A set of methods for managing virtual hosts of HTTP routers.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.0)",
    comments = "Source: yandex/cloud/apploadbalancer/v1/virtual_host_service.proto")
public final class VirtualHostServiceGrpc {

  private VirtualHostServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.apploadbalancer.v1.VirtualHostService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.GetVirtualHostRequest,
      yandex.cloud.api.apploadbalancer.v1.VirtualHostOuterClass.VirtualHost> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.GetVirtualHostRequest.class,
      responseType = yandex.cloud.api.apploadbalancer.v1.VirtualHostOuterClass.VirtualHost.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.GetVirtualHostRequest,
      yandex.cloud.api.apploadbalancer.v1.VirtualHostOuterClass.VirtualHost> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.GetVirtualHostRequest, yandex.cloud.api.apploadbalancer.v1.VirtualHostOuterClass.VirtualHost> getGetMethod;
    if ((getGetMethod = VirtualHostServiceGrpc.getGetMethod) == null) {
      synchronized (VirtualHostServiceGrpc.class) {
        if ((getGetMethod = VirtualHostServiceGrpc.getGetMethod) == null) {
          VirtualHostServiceGrpc.getGetMethod = getGetMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.GetVirtualHostRequest, yandex.cloud.api.apploadbalancer.v1.VirtualHostOuterClass.VirtualHost>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.apploadbalancer.v1.VirtualHostService", "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.GetVirtualHostRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.apploadbalancer.v1.VirtualHostOuterClass.VirtualHost.getDefaultInstance()))
                  .setSchemaDescriptor(new VirtualHostServiceMethodDescriptorSupplier("Get"))
                  .build();
          }
        }
     }
     return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.ListVirtualHostsRequest,
      yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.ListVirtualHostsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.ListVirtualHostsRequest.class,
      responseType = yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.ListVirtualHostsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.ListVirtualHostsRequest,
      yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.ListVirtualHostsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.ListVirtualHostsRequest, yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.ListVirtualHostsResponse> getListMethod;
    if ((getListMethod = VirtualHostServiceGrpc.getListMethod) == null) {
      synchronized (VirtualHostServiceGrpc.class) {
        if ((getListMethod = VirtualHostServiceGrpc.getListMethod) == null) {
          VirtualHostServiceGrpc.getListMethod = getListMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.ListVirtualHostsRequest, yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.ListVirtualHostsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.apploadbalancer.v1.VirtualHostService", "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.ListVirtualHostsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.ListVirtualHostsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new VirtualHostServiceMethodDescriptorSupplier("List"))
                  .build();
          }
        }
     }
     return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.CreateVirtualHostRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.CreateVirtualHostRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.CreateVirtualHostRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.CreateVirtualHostRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = VirtualHostServiceGrpc.getCreateMethod) == null) {
      synchronized (VirtualHostServiceGrpc.class) {
        if ((getCreateMethod = VirtualHostServiceGrpc.getCreateMethod) == null) {
          VirtualHostServiceGrpc.getCreateMethod = getCreateMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.CreateVirtualHostRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.apploadbalancer.v1.VirtualHostService", "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.CreateVirtualHostRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new VirtualHostServiceMethodDescriptorSupplier("Create"))
                  .build();
          }
        }
     }
     return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.UpdateVirtualHostRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.UpdateVirtualHostRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.UpdateVirtualHostRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.UpdateVirtualHostRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = VirtualHostServiceGrpc.getUpdateMethod) == null) {
      synchronized (VirtualHostServiceGrpc.class) {
        if ((getUpdateMethod = VirtualHostServiceGrpc.getUpdateMethod) == null) {
          VirtualHostServiceGrpc.getUpdateMethod = getUpdateMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.UpdateVirtualHostRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.apploadbalancer.v1.VirtualHostService", "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.UpdateVirtualHostRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new VirtualHostServiceMethodDescriptorSupplier("Update"))
                  .build();
          }
        }
     }
     return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.DeleteVirtualHostRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.DeleteVirtualHostRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.DeleteVirtualHostRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.DeleteVirtualHostRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = VirtualHostServiceGrpc.getDeleteMethod) == null) {
      synchronized (VirtualHostServiceGrpc.class) {
        if ((getDeleteMethod = VirtualHostServiceGrpc.getDeleteMethod) == null) {
          VirtualHostServiceGrpc.getDeleteMethod = getDeleteMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.DeleteVirtualHostRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.apploadbalancer.v1.VirtualHostService", "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.DeleteVirtualHostRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new VirtualHostServiceMethodDescriptorSupplier("Delete"))
                  .build();
          }
        }
     }
     return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.RemoveRouteRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRemoveRouteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveRoute",
      requestType = yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.RemoveRouteRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.RemoveRouteRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRemoveRouteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.RemoveRouteRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getRemoveRouteMethod;
    if ((getRemoveRouteMethod = VirtualHostServiceGrpc.getRemoveRouteMethod) == null) {
      synchronized (VirtualHostServiceGrpc.class) {
        if ((getRemoveRouteMethod = VirtualHostServiceGrpc.getRemoveRouteMethod) == null) {
          VirtualHostServiceGrpc.getRemoveRouteMethod = getRemoveRouteMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.RemoveRouteRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.apploadbalancer.v1.VirtualHostService", "RemoveRoute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.RemoveRouteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new VirtualHostServiceMethodDescriptorSupplier("RemoveRoute"))
                  .build();
          }
        }
     }
     return getRemoveRouteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.UpdateRouteRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateRouteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateRoute",
      requestType = yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.UpdateRouteRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.UpdateRouteRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateRouteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.UpdateRouteRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateRouteMethod;
    if ((getUpdateRouteMethod = VirtualHostServiceGrpc.getUpdateRouteMethod) == null) {
      synchronized (VirtualHostServiceGrpc.class) {
        if ((getUpdateRouteMethod = VirtualHostServiceGrpc.getUpdateRouteMethod) == null) {
          VirtualHostServiceGrpc.getUpdateRouteMethod = getUpdateRouteMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.UpdateRouteRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.apploadbalancer.v1.VirtualHostService", "UpdateRoute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.UpdateRouteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new VirtualHostServiceMethodDescriptorSupplier("UpdateRoute"))
                  .build();
          }
        }
     }
     return getUpdateRouteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static VirtualHostServiceStub newStub(io.grpc.Channel channel) {
    return new VirtualHostServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static VirtualHostServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new VirtualHostServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static VirtualHostServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new VirtualHostServiceFutureStub(channel);
  }

  /**
   * <pre>
   * A set of methods for managing virtual hosts of HTTP routers.
   * </pre>
   */
  public static abstract class VirtualHostServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified virtual host.
     * To get the list of all virtual hosts of an HTTP router, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.GetVirtualHostRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.apploadbalancer.v1.VirtualHostOuterClass.VirtualHost> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists virtual hosts of the specified HTTP router.
     * </pre>
     */
    public void list(yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.ListVirtualHostsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.ListVirtualHostsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a virtual host in the specified HTTP router.
     * </pre>
     */
    public void create(yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.CreateVirtualHostRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified virtual host of the specified HTTP router.
     * </pre>
     */
    public void update(yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.UpdateVirtualHostRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified virtual host.
     * </pre>
     */
    public void delete(yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.DeleteVirtualHostRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified route from the specified virtual host.
     * </pre>
     */
    public void removeRoute(yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.RemoveRouteRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveRouteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified route of the specified virtual host.
     * </pre>
     */
    public void updateRoute(yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.UpdateRouteRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateRouteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.GetVirtualHostRequest,
                yandex.cloud.api.apploadbalancer.v1.VirtualHostOuterClass.VirtualHost>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.ListVirtualHostsRequest,
                yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.ListVirtualHostsResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.CreateVirtualHostRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.UpdateVirtualHostRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.DeleteVirtualHostRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getRemoveRouteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.RemoveRouteRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_REMOVE_ROUTE)))
          .addMethod(
            getUpdateRouteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.UpdateRouteRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE_ROUTE)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing virtual hosts of HTTP routers.
   * </pre>
   */
  public static final class VirtualHostServiceStub extends io.grpc.stub.AbstractStub<VirtualHostServiceStub> {
    private VirtualHostServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VirtualHostServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VirtualHostServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VirtualHostServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified virtual host.
     * To get the list of all virtual hosts of an HTTP router, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.GetVirtualHostRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.apploadbalancer.v1.VirtualHostOuterClass.VirtualHost> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists virtual hosts of the specified HTTP router.
     * </pre>
     */
    public void list(yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.ListVirtualHostsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.ListVirtualHostsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a virtual host in the specified HTTP router.
     * </pre>
     */
    public void create(yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.CreateVirtualHostRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified virtual host of the specified HTTP router.
     * </pre>
     */
    public void update(yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.UpdateVirtualHostRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified virtual host.
     * </pre>
     */
    public void delete(yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.DeleteVirtualHostRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified route from the specified virtual host.
     * </pre>
     */
    public void removeRoute(yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.RemoveRouteRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveRouteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified route of the specified virtual host.
     * </pre>
     */
    public void updateRoute(yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.UpdateRouteRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateRouteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing virtual hosts of HTTP routers.
   * </pre>
   */
  public static final class VirtualHostServiceBlockingStub extends io.grpc.stub.AbstractStub<VirtualHostServiceBlockingStub> {
    private VirtualHostServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VirtualHostServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VirtualHostServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VirtualHostServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified virtual host.
     * To get the list of all virtual hosts of an HTTP router, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.apploadbalancer.v1.VirtualHostOuterClass.VirtualHost get(yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.GetVirtualHostRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists virtual hosts of the specified HTTP router.
     * </pre>
     */
    public yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.ListVirtualHostsResponse list(yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.ListVirtualHostsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a virtual host in the specified HTTP router.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.CreateVirtualHostRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified virtual host of the specified HTTP router.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.UpdateVirtualHostRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified virtual host.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.DeleteVirtualHostRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified route from the specified virtual host.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation removeRoute(yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.RemoveRouteRequest request) {
      return blockingUnaryCall(
          getChannel(), getRemoveRouteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified route of the specified virtual host.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation updateRoute(yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.UpdateRouteRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateRouteMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing virtual hosts of HTTP routers.
   * </pre>
   */
  public static final class VirtualHostServiceFutureStub extends io.grpc.stub.AbstractStub<VirtualHostServiceFutureStub> {
    private VirtualHostServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VirtualHostServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VirtualHostServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VirtualHostServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified virtual host.
     * To get the list of all virtual hosts of an HTTP router, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.apploadbalancer.v1.VirtualHostOuterClass.VirtualHost> get(
        yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.GetVirtualHostRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists virtual hosts of the specified HTTP router.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.ListVirtualHostsResponse> list(
        yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.ListVirtualHostsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a virtual host in the specified HTTP router.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.CreateVirtualHostRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified virtual host of the specified HTTP router.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.UpdateVirtualHostRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified virtual host.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.DeleteVirtualHostRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified route from the specified virtual host.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> removeRoute(
        yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.RemoveRouteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveRouteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified route of the specified virtual host.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> updateRoute(
        yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.UpdateRouteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateRouteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_DELETE = 4;
  private static final int METHODID_REMOVE_ROUTE = 5;
  private static final int METHODID_UPDATE_ROUTE = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final VirtualHostServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(VirtualHostServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.GetVirtualHostRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.apploadbalancer.v1.VirtualHostOuterClass.VirtualHost>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.ListVirtualHostsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.ListVirtualHostsResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.CreateVirtualHostRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.UpdateVirtualHostRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.DeleteVirtualHostRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_REMOVE_ROUTE:
          serviceImpl.removeRoute((yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.RemoveRouteRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE_ROUTE:
          serviceImpl.updateRoute((yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.UpdateRouteRequest) request,
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

  private static abstract class VirtualHostServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    VirtualHostServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.apploadbalancer.v1.VirtualHostServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("VirtualHostService");
    }
  }

  private static final class VirtualHostServiceFileDescriptorSupplier
      extends VirtualHostServiceBaseDescriptorSupplier {
    VirtualHostServiceFileDescriptorSupplier() {}
  }

  private static final class VirtualHostServiceMethodDescriptorSupplier
      extends VirtualHostServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    VirtualHostServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (VirtualHostServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new VirtualHostServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getRemoveRouteMethod())
              .addMethod(getUpdateRouteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
