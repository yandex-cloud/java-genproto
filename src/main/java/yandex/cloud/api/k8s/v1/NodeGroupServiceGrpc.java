package yandex.cloud.api.k8s.v1;

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
 * A set of methods for managing node groups.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.0)",
    comments = "Source: yandex/cloud/k8s/v1/node_group_service.proto")
public final class NodeGroupServiceGrpc {

  private NodeGroupServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.k8s.v1.NodeGroupService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.GetNodeGroupRequest,
      yandex.cloud.api.k8s.v1.NodeGroupOuterClass.NodeGroup> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.GetNodeGroupRequest.class,
      responseType = yandex.cloud.api.k8s.v1.NodeGroupOuterClass.NodeGroup.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.GetNodeGroupRequest,
      yandex.cloud.api.k8s.v1.NodeGroupOuterClass.NodeGroup> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.GetNodeGroupRequest, yandex.cloud.api.k8s.v1.NodeGroupOuterClass.NodeGroup> getGetMethod;
    if ((getGetMethod = NodeGroupServiceGrpc.getGetMethod) == null) {
      synchronized (NodeGroupServiceGrpc.class) {
        if ((getGetMethod = NodeGroupServiceGrpc.getGetMethod) == null) {
          NodeGroupServiceGrpc.getGetMethod = getGetMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.GetNodeGroupRequest, yandex.cloud.api.k8s.v1.NodeGroupOuterClass.NodeGroup>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.k8s.v1.NodeGroupService", "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.GetNodeGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.k8s.v1.NodeGroupOuterClass.NodeGroup.getDefaultInstance()))
                  .setSchemaDescriptor(new NodeGroupServiceMethodDescriptorSupplier("Get"))
                  .build();
          }
        }
     }
     return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.ListNodeGroupsRequest,
      yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.ListNodeGroupsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.ListNodeGroupsRequest.class,
      responseType = yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.ListNodeGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.ListNodeGroupsRequest,
      yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.ListNodeGroupsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.ListNodeGroupsRequest, yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.ListNodeGroupsResponse> getListMethod;
    if ((getListMethod = NodeGroupServiceGrpc.getListMethod) == null) {
      synchronized (NodeGroupServiceGrpc.class) {
        if ((getListMethod = NodeGroupServiceGrpc.getListMethod) == null) {
          NodeGroupServiceGrpc.getListMethod = getListMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.ListNodeGroupsRequest, yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.ListNodeGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.k8s.v1.NodeGroupService", "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.ListNodeGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.ListNodeGroupsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new NodeGroupServiceMethodDescriptorSupplier("List"))
                  .build();
          }
        }
     }
     return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.CreateNodeGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.CreateNodeGroupRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.CreateNodeGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.CreateNodeGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = NodeGroupServiceGrpc.getCreateMethod) == null) {
      synchronized (NodeGroupServiceGrpc.class) {
        if ((getCreateMethod = NodeGroupServiceGrpc.getCreateMethod) == null) {
          NodeGroupServiceGrpc.getCreateMethod = getCreateMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.CreateNodeGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.k8s.v1.NodeGroupService", "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.CreateNodeGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new NodeGroupServiceMethodDescriptorSupplier("Create"))
                  .build();
          }
        }
     }
     return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.UpdateNodeGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.UpdateNodeGroupRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.UpdateNodeGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.UpdateNodeGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = NodeGroupServiceGrpc.getUpdateMethod) == null) {
      synchronized (NodeGroupServiceGrpc.class) {
        if ((getUpdateMethod = NodeGroupServiceGrpc.getUpdateMethod) == null) {
          NodeGroupServiceGrpc.getUpdateMethod = getUpdateMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.UpdateNodeGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.k8s.v1.NodeGroupService", "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.UpdateNodeGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new NodeGroupServiceMethodDescriptorSupplier("Update"))
                  .build();
          }
        }
     }
     return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.DeleteNodeGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.DeleteNodeGroupRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.DeleteNodeGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.DeleteNodeGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = NodeGroupServiceGrpc.getDeleteMethod) == null) {
      synchronized (NodeGroupServiceGrpc.class) {
        if ((getDeleteMethod = NodeGroupServiceGrpc.getDeleteMethod) == null) {
          NodeGroupServiceGrpc.getDeleteMethod = getDeleteMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.DeleteNodeGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.k8s.v1.NodeGroupService", "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.DeleteNodeGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new NodeGroupServiceMethodDescriptorSupplier("Delete"))
                  .build();
          }
        }
     }
     return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.ListNodeGroupOperationsRequest,
      yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.ListNodeGroupOperationsResponse> getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.ListNodeGroupOperationsRequest.class,
      responseType = yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.ListNodeGroupOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.ListNodeGroupOperationsRequest,
      yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.ListNodeGroupOperationsResponse> getListOperationsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.ListNodeGroupOperationsRequest, yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.ListNodeGroupOperationsResponse> getListOperationsMethod;
    if ((getListOperationsMethod = NodeGroupServiceGrpc.getListOperationsMethod) == null) {
      synchronized (NodeGroupServiceGrpc.class) {
        if ((getListOperationsMethod = NodeGroupServiceGrpc.getListOperationsMethod) == null) {
          NodeGroupServiceGrpc.getListOperationsMethod = getListOperationsMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.ListNodeGroupOperationsRequest, yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.ListNodeGroupOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.k8s.v1.NodeGroupService", "ListOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.ListNodeGroupOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.ListNodeGroupOperationsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new NodeGroupServiceMethodDescriptorSupplier("ListOperations"))
                  .build();
          }
        }
     }
     return getListOperationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.ListNodeGroupNodesRequest,
      yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.ListNodeGroupNodesResponse> getListNodesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListNodes",
      requestType = yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.ListNodeGroupNodesRequest.class,
      responseType = yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.ListNodeGroupNodesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.ListNodeGroupNodesRequest,
      yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.ListNodeGroupNodesResponse> getListNodesMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.ListNodeGroupNodesRequest, yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.ListNodeGroupNodesResponse> getListNodesMethod;
    if ((getListNodesMethod = NodeGroupServiceGrpc.getListNodesMethod) == null) {
      synchronized (NodeGroupServiceGrpc.class) {
        if ((getListNodesMethod = NodeGroupServiceGrpc.getListNodesMethod) == null) {
          NodeGroupServiceGrpc.getListNodesMethod = getListNodesMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.ListNodeGroupNodesRequest, yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.ListNodeGroupNodesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.k8s.v1.NodeGroupService", "ListNodes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.ListNodeGroupNodesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.ListNodeGroupNodesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new NodeGroupServiceMethodDescriptorSupplier("ListNodes"))
                  .build();
          }
        }
     }
     return getListNodesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NodeGroupServiceStub newStub(io.grpc.Channel channel) {
    return new NodeGroupServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NodeGroupServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new NodeGroupServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NodeGroupServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new NodeGroupServiceFutureStub(channel);
  }

  /**
   * <pre>
   * A set of methods for managing node groups.
   * </pre>
   */
  public static abstract class NodeGroupServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified node group.
     * To get the list of available node group, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.GetNodeGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.k8s.v1.NodeGroupOuterClass.NodeGroup> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of node group in the specified Kubernetes cluster.
     * </pre>
     */
    public void list(yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.ListNodeGroupsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.ListNodeGroupsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a node group in the specified Kubernetes cluster.
     * </pre>
     */
    public void create(yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.CreateNodeGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified node group.
     * </pre>
     */
    public void update(yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.UpdateNodeGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified node group.
     * </pre>
     */
    public void delete(yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.DeleteNodeGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified node group.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.ListNodeGroupOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.ListNodeGroupOperationsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of nodes in the specified Kubernetes cluster.
     * </pre>
     */
    public void listNodes(yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.ListNodeGroupNodesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.ListNodeGroupNodesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListNodesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.GetNodeGroupRequest,
                yandex.cloud.api.k8s.v1.NodeGroupOuterClass.NodeGroup>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.ListNodeGroupsRequest,
                yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.ListNodeGroupsResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.CreateNodeGroupRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.UpdateNodeGroupRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.DeleteNodeGroupRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListOperationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.ListNodeGroupOperationsRequest,
                yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.ListNodeGroupOperationsResponse>(
                  this, METHODID_LIST_OPERATIONS)))
          .addMethod(
            getListNodesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.ListNodeGroupNodesRequest,
                yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.ListNodeGroupNodesResponse>(
                  this, METHODID_LIST_NODES)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing node groups.
   * </pre>
   */
  public static final class NodeGroupServiceStub extends io.grpc.stub.AbstractStub<NodeGroupServiceStub> {
    private NodeGroupServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NodeGroupServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NodeGroupServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NodeGroupServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified node group.
     * To get the list of available node group, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.GetNodeGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.k8s.v1.NodeGroupOuterClass.NodeGroup> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of node group in the specified Kubernetes cluster.
     * </pre>
     */
    public void list(yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.ListNodeGroupsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.ListNodeGroupsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a node group in the specified Kubernetes cluster.
     * </pre>
     */
    public void create(yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.CreateNodeGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified node group.
     * </pre>
     */
    public void update(yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.UpdateNodeGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified node group.
     * </pre>
     */
    public void delete(yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.DeleteNodeGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified node group.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.ListNodeGroupOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.ListNodeGroupOperationsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of nodes in the specified Kubernetes cluster.
     * </pre>
     */
    public void listNodes(yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.ListNodeGroupNodesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.ListNodeGroupNodesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListNodesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing node groups.
   * </pre>
   */
  public static final class NodeGroupServiceBlockingStub extends io.grpc.stub.AbstractStub<NodeGroupServiceBlockingStub> {
    private NodeGroupServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NodeGroupServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NodeGroupServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NodeGroupServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified node group.
     * To get the list of available node group, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.k8s.v1.NodeGroupOuterClass.NodeGroup get(yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.GetNodeGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of node group in the specified Kubernetes cluster.
     * </pre>
     */
    public yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.ListNodeGroupsResponse list(yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.ListNodeGroupsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a node group in the specified Kubernetes cluster.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.CreateNodeGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified node group.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.UpdateNodeGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified node group.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.DeleteNodeGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists operations for the specified node group.
     * </pre>
     */
    public yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.ListNodeGroupOperationsResponse listOperations(yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.ListNodeGroupOperationsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of nodes in the specified Kubernetes cluster.
     * </pre>
     */
    public yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.ListNodeGroupNodesResponse listNodes(yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.ListNodeGroupNodesRequest request) {
      return blockingUnaryCall(
          getChannel(), getListNodesMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing node groups.
   * </pre>
   */
  public static final class NodeGroupServiceFutureStub extends io.grpc.stub.AbstractStub<NodeGroupServiceFutureStub> {
    private NodeGroupServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NodeGroupServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NodeGroupServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NodeGroupServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified node group.
     * To get the list of available node group, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.k8s.v1.NodeGroupOuterClass.NodeGroup> get(
        yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.GetNodeGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of node group in the specified Kubernetes cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.ListNodeGroupsResponse> list(
        yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.ListNodeGroupsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a node group in the specified Kubernetes cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.CreateNodeGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified node group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.UpdateNodeGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified node group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.DeleteNodeGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists operations for the specified node group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.ListNodeGroupOperationsResponse> listOperations(
        yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.ListNodeGroupOperationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of nodes in the specified Kubernetes cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.ListNodeGroupNodesResponse> listNodes(
        yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.ListNodeGroupNodesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListNodesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_DELETE = 4;
  private static final int METHODID_LIST_OPERATIONS = 5;
  private static final int METHODID_LIST_NODES = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NodeGroupServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(NodeGroupServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.GetNodeGroupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.k8s.v1.NodeGroupOuterClass.NodeGroup>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.ListNodeGroupsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.ListNodeGroupsResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.CreateNodeGroupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.UpdateNodeGroupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.DeleteNodeGroupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.ListNodeGroupOperationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.ListNodeGroupOperationsResponse>) responseObserver);
          break;
        case METHODID_LIST_NODES:
          serviceImpl.listNodes((yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.ListNodeGroupNodesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.ListNodeGroupNodesResponse>) responseObserver);
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

  private static abstract class NodeGroupServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NodeGroupServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.k8s.v1.NodeGroupServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("NodeGroupService");
    }
  }

  private static final class NodeGroupServiceFileDescriptorSupplier
      extends NodeGroupServiceBaseDescriptorSupplier {
    NodeGroupServiceFileDescriptorSupplier() {}
  }

  private static final class NodeGroupServiceMethodDescriptorSupplier
      extends NodeGroupServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    NodeGroupServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (NodeGroupServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NodeGroupServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getListOperationsMethod())
              .addMethod(getListNodesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
