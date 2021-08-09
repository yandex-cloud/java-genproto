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
 * A set of methods for managing Network resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.0)",
    comments = "Source: yandex/cloud/vpc/v1/network_service.proto")
public final class NetworkServiceGrpc {

  private NetworkServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.vpc.v1.NetworkService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.GetNetworkRequest,
      yandex.cloud.api.vpc.v1.NetworkOuterClass.Network> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.GetNetworkRequest.class,
      responseType = yandex.cloud.api.vpc.v1.NetworkOuterClass.Network.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.GetNetworkRequest,
      yandex.cloud.api.vpc.v1.NetworkOuterClass.Network> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.GetNetworkRequest, yandex.cloud.api.vpc.v1.NetworkOuterClass.Network> getGetMethod;
    if ((getGetMethod = NetworkServiceGrpc.getGetMethod) == null) {
      synchronized (NetworkServiceGrpc.class) {
        if ((getGetMethod = NetworkServiceGrpc.getGetMethod) == null) {
          NetworkServiceGrpc.getGetMethod = getGetMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.GetNetworkRequest, yandex.cloud.api.vpc.v1.NetworkOuterClass.Network>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.vpc.v1.NetworkService", "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.GetNetworkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.NetworkOuterClass.Network.getDefaultInstance()))
                  .setSchemaDescriptor(new NetworkServiceMethodDescriptorSupplier("Get"))
                  .build();
          }
        }
     }
     return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworksRequest,
      yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworksResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworksRequest.class,
      responseType = yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworksResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworksRequest,
      yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworksResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworksRequest, yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworksResponse> getListMethod;
    if ((getListMethod = NetworkServiceGrpc.getListMethod) == null) {
      synchronized (NetworkServiceGrpc.class) {
        if ((getListMethod = NetworkServiceGrpc.getListMethod) == null) {
          NetworkServiceGrpc.getListMethod = getListMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworksRequest, yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworksResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.vpc.v1.NetworkService", "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworksResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new NetworkServiceMethodDescriptorSupplier("List"))
                  .build();
          }
        }
     }
     return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.CreateNetworkRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.CreateNetworkRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.CreateNetworkRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.CreateNetworkRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = NetworkServiceGrpc.getCreateMethod) == null) {
      synchronized (NetworkServiceGrpc.class) {
        if ((getCreateMethod = NetworkServiceGrpc.getCreateMethod) == null) {
          NetworkServiceGrpc.getCreateMethod = getCreateMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.CreateNetworkRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.vpc.v1.NetworkService", "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.CreateNetworkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new NetworkServiceMethodDescriptorSupplier("Create"))
                  .build();
          }
        }
     }
     return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.UpdateNetworkRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.UpdateNetworkRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.UpdateNetworkRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.UpdateNetworkRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = NetworkServiceGrpc.getUpdateMethod) == null) {
      synchronized (NetworkServiceGrpc.class) {
        if ((getUpdateMethod = NetworkServiceGrpc.getUpdateMethod) == null) {
          NetworkServiceGrpc.getUpdateMethod = getUpdateMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.UpdateNetworkRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.vpc.v1.NetworkService", "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.UpdateNetworkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new NetworkServiceMethodDescriptorSupplier("Update"))
                  .build();
          }
        }
     }
     return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.DeleteNetworkRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.DeleteNetworkRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.DeleteNetworkRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.DeleteNetworkRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = NetworkServiceGrpc.getDeleteMethod) == null) {
      synchronized (NetworkServiceGrpc.class) {
        if ((getDeleteMethod = NetworkServiceGrpc.getDeleteMethod) == null) {
          NetworkServiceGrpc.getDeleteMethod = getDeleteMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.DeleteNetworkRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.vpc.v1.NetworkService", "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.DeleteNetworkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new NetworkServiceMethodDescriptorSupplier("Delete"))
                  .build();
          }
        }
     }
     return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkSubnetsRequest,
      yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkSubnetsResponse> getListSubnetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSubnets",
      requestType = yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkSubnetsRequest.class,
      responseType = yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkSubnetsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkSubnetsRequest,
      yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkSubnetsResponse> getListSubnetsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkSubnetsRequest, yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkSubnetsResponse> getListSubnetsMethod;
    if ((getListSubnetsMethod = NetworkServiceGrpc.getListSubnetsMethod) == null) {
      synchronized (NetworkServiceGrpc.class) {
        if ((getListSubnetsMethod = NetworkServiceGrpc.getListSubnetsMethod) == null) {
          NetworkServiceGrpc.getListSubnetsMethod = getListSubnetsMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkSubnetsRequest, yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkSubnetsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.vpc.v1.NetworkService", "ListSubnets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkSubnetsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkSubnetsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new NetworkServiceMethodDescriptorSupplier("ListSubnets"))
                  .build();
          }
        }
     }
     return getListSubnetsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkSecurityGroupsRequest,
      yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkSecurityGroupsResponse> getListSecurityGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSecurityGroups",
      requestType = yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkSecurityGroupsRequest.class,
      responseType = yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkSecurityGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkSecurityGroupsRequest,
      yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkSecurityGroupsResponse> getListSecurityGroupsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkSecurityGroupsRequest, yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkSecurityGroupsResponse> getListSecurityGroupsMethod;
    if ((getListSecurityGroupsMethod = NetworkServiceGrpc.getListSecurityGroupsMethod) == null) {
      synchronized (NetworkServiceGrpc.class) {
        if ((getListSecurityGroupsMethod = NetworkServiceGrpc.getListSecurityGroupsMethod) == null) {
          NetworkServiceGrpc.getListSecurityGroupsMethod = getListSecurityGroupsMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkSecurityGroupsRequest, yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkSecurityGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.vpc.v1.NetworkService", "ListSecurityGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkSecurityGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkSecurityGroupsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new NetworkServiceMethodDescriptorSupplier("ListSecurityGroups"))
                  .build();
          }
        }
     }
     return getListSecurityGroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkRouteTablesRequest,
      yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkRouteTablesResponse> getListRouteTablesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListRouteTables",
      requestType = yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkRouteTablesRequest.class,
      responseType = yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkRouteTablesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkRouteTablesRequest,
      yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkRouteTablesResponse> getListRouteTablesMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkRouteTablesRequest, yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkRouteTablesResponse> getListRouteTablesMethod;
    if ((getListRouteTablesMethod = NetworkServiceGrpc.getListRouteTablesMethod) == null) {
      synchronized (NetworkServiceGrpc.class) {
        if ((getListRouteTablesMethod = NetworkServiceGrpc.getListRouteTablesMethod) == null) {
          NetworkServiceGrpc.getListRouteTablesMethod = getListRouteTablesMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkRouteTablesRequest, yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkRouteTablesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.vpc.v1.NetworkService", "ListRouteTables"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkRouteTablesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkRouteTablesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new NetworkServiceMethodDescriptorSupplier("ListRouteTables"))
                  .build();
          }
        }
     }
     return getListRouteTablesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkOperationsRequest,
      yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkOperationsResponse> getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkOperationsRequest.class,
      responseType = yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkOperationsRequest,
      yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkOperationsResponse> getListOperationsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkOperationsRequest, yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkOperationsResponse> getListOperationsMethod;
    if ((getListOperationsMethod = NetworkServiceGrpc.getListOperationsMethod) == null) {
      synchronized (NetworkServiceGrpc.class) {
        if ((getListOperationsMethod = NetworkServiceGrpc.getListOperationsMethod) == null) {
          NetworkServiceGrpc.getListOperationsMethod = getListOperationsMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkOperationsRequest, yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.vpc.v1.NetworkService", "ListOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkOperationsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new NetworkServiceMethodDescriptorSupplier("ListOperations"))
                  .build();
          }
        }
     }
     return getListOperationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.MoveNetworkRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getMoveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Move",
      requestType = yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.MoveNetworkRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.MoveNetworkRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getMoveMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.MoveNetworkRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getMoveMethod;
    if ((getMoveMethod = NetworkServiceGrpc.getMoveMethod) == null) {
      synchronized (NetworkServiceGrpc.class) {
        if ((getMoveMethod = NetworkServiceGrpc.getMoveMethod) == null) {
          NetworkServiceGrpc.getMoveMethod = getMoveMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.MoveNetworkRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.vpc.v1.NetworkService", "Move"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.MoveNetworkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new NetworkServiceMethodDescriptorSupplier("Move"))
                  .build();
          }
        }
     }
     return getMoveMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NetworkServiceStub newStub(io.grpc.Channel channel) {
    return new NetworkServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NetworkServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new NetworkServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NetworkServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new NetworkServiceFutureStub(channel);
  }

  /**
   * <pre>
   * A set of methods for managing Network resources.
   * </pre>
   */
  public static abstract class NetworkServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified Network resource.
     * Get the list of available Network resources by making a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.GetNetworkRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.NetworkOuterClass.Network> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of Network resources in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworksRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworksResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a network in the specified folder using the data specified in the request.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public void create(yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.CreateNetworkRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified network.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public void update(yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.UpdateNetworkRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified network.
     * </pre>
     */
    public void delete(yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.DeleteNetworkRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists subnets from the specified network.
     * </pre>
     */
    public void listSubnets(yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkSubnetsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkSubnetsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListSubnetsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists security groups from the specified network.
     * </pre>
     */
    public void listSecurityGroups(yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkSecurityGroupsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkSecurityGroupsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListSecurityGroupsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists route tables from the specified network.
     * </pre>
     */
    public void listRouteTables(yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkRouteTablesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkRouteTablesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListRouteTablesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified network.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkOperationsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Move network to another folder.
     * </pre>
     */
    public void move(yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.MoveNetworkRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getMoveMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.GetNetworkRequest,
                yandex.cloud.api.vpc.v1.NetworkOuterClass.Network>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworksRequest,
                yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworksResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.CreateNetworkRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.UpdateNetworkRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.DeleteNetworkRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListSubnetsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkSubnetsRequest,
                yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkSubnetsResponse>(
                  this, METHODID_LIST_SUBNETS)))
          .addMethod(
            getListSecurityGroupsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkSecurityGroupsRequest,
                yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkSecurityGroupsResponse>(
                  this, METHODID_LIST_SECURITY_GROUPS)))
          .addMethod(
            getListRouteTablesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkRouteTablesRequest,
                yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkRouteTablesResponse>(
                  this, METHODID_LIST_ROUTE_TABLES)))
          .addMethod(
            getListOperationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkOperationsRequest,
                yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkOperationsResponse>(
                  this, METHODID_LIST_OPERATIONS)))
          .addMethod(
            getMoveMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.MoveNetworkRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_MOVE)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing Network resources.
   * </pre>
   */
  public static final class NetworkServiceStub extends io.grpc.stub.AbstractStub<NetworkServiceStub> {
    private NetworkServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NetworkServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NetworkServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NetworkServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified Network resource.
     * Get the list of available Network resources by making a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.GetNetworkRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.NetworkOuterClass.Network> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of Network resources in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworksRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworksResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a network in the specified folder using the data specified in the request.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public void create(yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.CreateNetworkRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified network.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public void update(yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.UpdateNetworkRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified network.
     * </pre>
     */
    public void delete(yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.DeleteNetworkRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists subnets from the specified network.
     * </pre>
     */
    public void listSubnets(yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkSubnetsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkSubnetsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListSubnetsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists security groups from the specified network.
     * </pre>
     */
    public void listSecurityGroups(yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkSecurityGroupsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkSecurityGroupsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListSecurityGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists route tables from the specified network.
     * </pre>
     */
    public void listRouteTables(yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkRouteTablesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkRouteTablesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListRouteTablesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified network.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkOperationsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Move network to another folder.
     * </pre>
     */
    public void move(yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.MoveNetworkRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMoveMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Network resources.
   * </pre>
   */
  public static final class NetworkServiceBlockingStub extends io.grpc.stub.AbstractStub<NetworkServiceBlockingStub> {
    private NetworkServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NetworkServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NetworkServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NetworkServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified Network resource.
     * Get the list of available Network resources by making a [List] request.
     * </pre>
     */
    public yandex.cloud.api.vpc.v1.NetworkOuterClass.Network get(yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.GetNetworkRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of Network resources in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworksResponse list(yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworksRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a network in the specified folder using the data specified in the request.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.CreateNetworkRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified network.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.UpdateNetworkRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified network.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.DeleteNetworkRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists subnets from the specified network.
     * </pre>
     */
    public yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkSubnetsResponse listSubnets(yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkSubnetsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListSubnetsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists security groups from the specified network.
     * </pre>
     */
    public yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkSecurityGroupsResponse listSecurityGroups(yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkSecurityGroupsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListSecurityGroupsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists route tables from the specified network.
     * </pre>
     */
    public yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkRouteTablesResponse listRouteTables(yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkRouteTablesRequest request) {
      return blockingUnaryCall(
          getChannel(), getListRouteTablesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists operations for the specified network.
     * </pre>
     */
    public yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkOperationsResponse listOperations(yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkOperationsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Move network to another folder.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation move(yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.MoveNetworkRequest request) {
      return blockingUnaryCall(
          getChannel(), getMoveMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Network resources.
   * </pre>
   */
  public static final class NetworkServiceFutureStub extends io.grpc.stub.AbstractStub<NetworkServiceFutureStub> {
    private NetworkServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NetworkServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NetworkServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NetworkServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified Network resource.
     * Get the list of available Network resources by making a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.vpc.v1.NetworkOuterClass.Network> get(
        yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.GetNetworkRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of Network resources in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworksResponse> list(
        yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworksRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a network in the specified folder using the data specified in the request.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.CreateNetworkRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified network.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.UpdateNetworkRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified network.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.DeleteNetworkRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists subnets from the specified network.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkSubnetsResponse> listSubnets(
        yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkSubnetsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListSubnetsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists security groups from the specified network.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkSecurityGroupsResponse> listSecurityGroups(
        yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkSecurityGroupsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListSecurityGroupsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists route tables from the specified network.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkRouteTablesResponse> listRouteTables(
        yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkRouteTablesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListRouteTablesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists operations for the specified network.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkOperationsResponse> listOperations(
        yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkOperationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Move network to another folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> move(
        yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.MoveNetworkRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMoveMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_DELETE = 4;
  private static final int METHODID_LIST_SUBNETS = 5;
  private static final int METHODID_LIST_SECURITY_GROUPS = 6;
  private static final int METHODID_LIST_ROUTE_TABLES = 7;
  private static final int METHODID_LIST_OPERATIONS = 8;
  private static final int METHODID_MOVE = 9;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NetworkServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(NetworkServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.GetNetworkRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.NetworkOuterClass.Network>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworksRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworksResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.CreateNetworkRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.UpdateNetworkRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.DeleteNetworkRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_SUBNETS:
          serviceImpl.listSubnets((yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkSubnetsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkSubnetsResponse>) responseObserver);
          break;
        case METHODID_LIST_SECURITY_GROUPS:
          serviceImpl.listSecurityGroups((yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkSecurityGroupsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkSecurityGroupsResponse>) responseObserver);
          break;
        case METHODID_LIST_ROUTE_TABLES:
          serviceImpl.listRouteTables((yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkRouteTablesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkRouteTablesResponse>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkOperationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.ListNetworkOperationsResponse>) responseObserver);
          break;
        case METHODID_MOVE:
          serviceImpl.move((yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.MoveNetworkRequest) request,
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

  private static abstract class NetworkServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NetworkServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.vpc.v1.NetworkServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("NetworkService");
    }
  }

  private static final class NetworkServiceFileDescriptorSupplier
      extends NetworkServiceBaseDescriptorSupplier {
    NetworkServiceFileDescriptorSupplier() {}
  }

  private static final class NetworkServiceMethodDescriptorSupplier
      extends NetworkServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    NetworkServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (NetworkServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NetworkServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getListSubnetsMethod())
              .addMethod(getListSecurityGroupsMethod())
              .addMethod(getListRouteTablesMethod())
              .addMethod(getListOperationsMethod())
              .addMethod(getMoveMethod())
              .build();
        }
      }
    }
    return result;
  }
}
