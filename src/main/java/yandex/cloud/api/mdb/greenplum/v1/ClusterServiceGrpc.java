package yandex.cloud.api.mdb.greenplum.v1;

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
 * A set of methods for managing Greenplum clusters.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.0)",
    comments = "Source: yandex/cloud/mdb/greenplum/v1/cluster_service.proto")
public final class ClusterServiceGrpc {

  private ClusterServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.mdb.greenplum.v1.ClusterService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.greenplum.v1.GPCS.GetClusterRequest,
      yandex.cloud.api.mdb.greenplum.v1.GPC.Cluster> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.mdb.greenplum.v1.GPCS.GetClusterRequest.class,
      responseType = yandex.cloud.api.mdb.greenplum.v1.GPC.Cluster.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.greenplum.v1.GPCS.GetClusterRequest,
      yandex.cloud.api.mdb.greenplum.v1.GPC.Cluster> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.greenplum.v1.GPCS.GetClusterRequest, yandex.cloud.api.mdb.greenplum.v1.GPC.Cluster> getGetMethod;
    if ((getGetMethod = ClusterServiceGrpc.getGetMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getGetMethod = ClusterServiceGrpc.getGetMethod) == null) {
          ClusterServiceGrpc.getGetMethod = getGetMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.greenplum.v1.GPCS.GetClusterRequest, yandex.cloud.api.mdb.greenplum.v1.GPC.Cluster>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.mdb.greenplum.v1.ClusterService", "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.greenplum.v1.GPCS.GetClusterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.greenplum.v1.GPC.Cluster.getDefaultInstance()))
                  .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("Get"))
                  .build();
          }
        }
     }
     return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClustersRequest,
      yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClustersResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClustersRequest.class,
      responseType = yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClustersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClustersRequest,
      yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClustersResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClustersRequest, yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClustersResponse> getListMethod;
    if ((getListMethod = ClusterServiceGrpc.getListMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getListMethod = ClusterServiceGrpc.getListMethod) == null) {
          ClusterServiceGrpc.getListMethod = getListMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClustersRequest, yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClustersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.mdb.greenplum.v1.ClusterService", "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClustersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClustersResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("List"))
                  .build();
          }
        }
     }
     return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.greenplum.v1.GPCS.CreateClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.mdb.greenplum.v1.GPCS.CreateClusterRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.greenplum.v1.GPCS.CreateClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.greenplum.v1.GPCS.CreateClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = ClusterServiceGrpc.getCreateMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getCreateMethod = ClusterServiceGrpc.getCreateMethod) == null) {
          ClusterServiceGrpc.getCreateMethod = getCreateMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.greenplum.v1.GPCS.CreateClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.mdb.greenplum.v1.ClusterService", "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.greenplum.v1.GPCS.CreateClusterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("Create"))
                  .build();
          }
        }
     }
     return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.greenplum.v1.GPCS.DeleteClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.mdb.greenplum.v1.GPCS.DeleteClusterRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.greenplum.v1.GPCS.DeleteClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.greenplum.v1.GPCS.DeleteClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = ClusterServiceGrpc.getDeleteMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getDeleteMethod = ClusterServiceGrpc.getDeleteMethod) == null) {
          ClusterServiceGrpc.getDeleteMethod = getDeleteMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.greenplum.v1.GPCS.DeleteClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.mdb.greenplum.v1.ClusterService", "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.greenplum.v1.GPCS.DeleteClusterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("Delete"))
                  .build();
          }
        }
     }
     return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.greenplum.v1.GPCS.StartClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getStartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Start",
      requestType = yandex.cloud.api.mdb.greenplum.v1.GPCS.StartClusterRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.greenplum.v1.GPCS.StartClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getStartMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.greenplum.v1.GPCS.StartClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getStartMethod;
    if ((getStartMethod = ClusterServiceGrpc.getStartMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getStartMethod = ClusterServiceGrpc.getStartMethod) == null) {
          ClusterServiceGrpc.getStartMethod = getStartMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.greenplum.v1.GPCS.StartClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.mdb.greenplum.v1.ClusterService", "Start"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.greenplum.v1.GPCS.StartClusterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("Start"))
                  .build();
          }
        }
     }
     return getStartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.greenplum.v1.GPCS.StopClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getStopMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Stop",
      requestType = yandex.cloud.api.mdb.greenplum.v1.GPCS.StopClusterRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.greenplum.v1.GPCS.StopClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getStopMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.greenplum.v1.GPCS.StopClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getStopMethod;
    if ((getStopMethod = ClusterServiceGrpc.getStopMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getStopMethod = ClusterServiceGrpc.getStopMethod) == null) {
          ClusterServiceGrpc.getStopMethod = getStopMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.greenplum.v1.GPCS.StopClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.mdb.greenplum.v1.ClusterService", "Stop"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.greenplum.v1.GPCS.StopClusterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("Stop"))
                  .build();
          }
        }
     }
     return getStopMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClusterOperationsRequest,
      yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClusterOperationsResponse> getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClusterOperationsRequest.class,
      responseType = yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClusterOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClusterOperationsRequest,
      yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClusterOperationsResponse> getListOperationsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClusterOperationsRequest, yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClusterOperationsResponse> getListOperationsMethod;
    if ((getListOperationsMethod = ClusterServiceGrpc.getListOperationsMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getListOperationsMethod = ClusterServiceGrpc.getListOperationsMethod) == null) {
          ClusterServiceGrpc.getListOperationsMethod = getListOperationsMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClusterOperationsRequest, yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClusterOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.mdb.greenplum.v1.ClusterService", "ListOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClusterOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClusterOperationsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("ListOperations"))
                  .build();
          }
        }
     }
     return getListOperationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClusterHostsRequest,
      yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClusterHostsResponse> getListMasterHostsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListMasterHosts",
      requestType = yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClusterHostsRequest.class,
      responseType = yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClusterHostsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClusterHostsRequest,
      yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClusterHostsResponse> getListMasterHostsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClusterHostsRequest, yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClusterHostsResponse> getListMasterHostsMethod;
    if ((getListMasterHostsMethod = ClusterServiceGrpc.getListMasterHostsMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getListMasterHostsMethod = ClusterServiceGrpc.getListMasterHostsMethod) == null) {
          ClusterServiceGrpc.getListMasterHostsMethod = getListMasterHostsMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClusterHostsRequest, yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClusterHostsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.mdb.greenplum.v1.ClusterService", "ListMasterHosts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClusterHostsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClusterHostsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("ListMasterHosts"))
                  .build();
          }
        }
     }
     return getListMasterHostsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClusterHostsRequest,
      yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClusterHostsResponse> getListSegmentHostsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSegmentHosts",
      requestType = yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClusterHostsRequest.class,
      responseType = yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClusterHostsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClusterHostsRequest,
      yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClusterHostsResponse> getListSegmentHostsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClusterHostsRequest, yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClusterHostsResponse> getListSegmentHostsMethod;
    if ((getListSegmentHostsMethod = ClusterServiceGrpc.getListSegmentHostsMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getListSegmentHostsMethod = ClusterServiceGrpc.getListSegmentHostsMethod) == null) {
          ClusterServiceGrpc.getListSegmentHostsMethod = getListSegmentHostsMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClusterHostsRequest, yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClusterHostsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.mdb.greenplum.v1.ClusterService", "ListSegmentHosts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClusterHostsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClusterHostsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("ListSegmentHosts"))
                  .build();
          }
        }
     }
     return getListSegmentHostsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ClusterServiceStub newStub(io.grpc.Channel channel) {
    return new ClusterServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ClusterServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ClusterServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ClusterServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ClusterServiceFutureStub(channel);
  }

  /**
   * <pre>
   * A set of methods for managing Greenplum clusters.
   * </pre>
   */
  public static abstract class ClusterServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified Greenplum cluster.
     * To get the list of available Greenplum clusters, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.mdb.greenplum.v1.GPCS.GetClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.greenplum.v1.GPC.Cluster> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves a list of Greenplum clusters that belong
     * to the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClustersRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClustersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a Greenplum cluster in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.mdb.greenplum.v1.GPCS.CreateClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified Greenplum cluster.
     * </pre>
     */
    public void delete(yandex.cloud.api.mdb.greenplum.v1.GPCS.DeleteClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Starts the specified Greenplum cluster.
     * </pre>
     */
    public void start(yandex.cloud.api.mdb.greenplum.v1.GPCS.StartClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getStartMethod(), responseObserver);
    }

    /**
     * <pre>
     * Stops the specified Greenplum cluster.
     * </pre>
     */
    public void stop(yandex.cloud.api.mdb.greenplum.v1.GPCS.StopClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getStopMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of Operation resources for the specified cluster.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClusterOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClusterOperationsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves a list of master hosts for the specified cluster.
     * </pre>
     */
    public void listMasterHosts(yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClusterHostsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClusterHostsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMasterHostsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves a list of segment hosts for the specified cluster.
     * </pre>
     */
    public void listSegmentHosts(yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClusterHostsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClusterHostsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListSegmentHostsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.greenplum.v1.GPCS.GetClusterRequest,
                yandex.cloud.api.mdb.greenplum.v1.GPC.Cluster>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClustersRequest,
                yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClustersResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.greenplum.v1.GPCS.CreateClusterRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.greenplum.v1.GPCS.DeleteClusterRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getStartMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.greenplum.v1.GPCS.StartClusterRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_START)))
          .addMethod(
            getStopMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.greenplum.v1.GPCS.StopClusterRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_STOP)))
          .addMethod(
            getListOperationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClusterOperationsRequest,
                yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClusterOperationsResponse>(
                  this, METHODID_LIST_OPERATIONS)))
          .addMethod(
            getListMasterHostsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClusterHostsRequest,
                yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClusterHostsResponse>(
                  this, METHODID_LIST_MASTER_HOSTS)))
          .addMethod(
            getListSegmentHostsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClusterHostsRequest,
                yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClusterHostsResponse>(
                  this, METHODID_LIST_SEGMENT_HOSTS)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing Greenplum clusters.
   * </pre>
   */
  public static final class ClusterServiceStub extends io.grpc.stub.AbstractStub<ClusterServiceStub> {
    private ClusterServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClusterServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClusterServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClusterServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified Greenplum cluster.
     * To get the list of available Greenplum clusters, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.mdb.greenplum.v1.GPCS.GetClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.greenplum.v1.GPC.Cluster> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves a list of Greenplum clusters that belong
     * to the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClustersRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClustersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a Greenplum cluster in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.mdb.greenplum.v1.GPCS.CreateClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified Greenplum cluster.
     * </pre>
     */
    public void delete(yandex.cloud.api.mdb.greenplum.v1.GPCS.DeleteClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Starts the specified Greenplum cluster.
     * </pre>
     */
    public void start(yandex.cloud.api.mdb.greenplum.v1.GPCS.StartClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Stops the specified Greenplum cluster.
     * </pre>
     */
    public void stop(yandex.cloud.api.mdb.greenplum.v1.GPCS.StopClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStopMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of Operation resources for the specified cluster.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClusterOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClusterOperationsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves a list of master hosts for the specified cluster.
     * </pre>
     */
    public void listMasterHosts(yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClusterHostsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClusterHostsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMasterHostsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves a list of segment hosts for the specified cluster.
     * </pre>
     */
    public void listSegmentHosts(yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClusterHostsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClusterHostsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListSegmentHostsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Greenplum clusters.
   * </pre>
   */
  public static final class ClusterServiceBlockingStub extends io.grpc.stub.AbstractStub<ClusterServiceBlockingStub> {
    private ClusterServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClusterServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClusterServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClusterServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified Greenplum cluster.
     * To get the list of available Greenplum clusters, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.mdb.greenplum.v1.GPC.Cluster get(yandex.cloud.api.mdb.greenplum.v1.GPCS.GetClusterRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves a list of Greenplum clusters that belong
     * to the specified folder.
     * </pre>
     */
    public yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClustersResponse list(yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClustersRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a Greenplum cluster in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.mdb.greenplum.v1.GPCS.CreateClusterRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified Greenplum cluster.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.mdb.greenplum.v1.GPCS.DeleteClusterRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Starts the specified Greenplum cluster.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation start(yandex.cloud.api.mdb.greenplum.v1.GPCS.StartClusterRequest request) {
      return blockingUnaryCall(
          getChannel(), getStartMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Stops the specified Greenplum cluster.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation stop(yandex.cloud.api.mdb.greenplum.v1.GPCS.StopClusterRequest request) {
      return blockingUnaryCall(
          getChannel(), getStopMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of Operation resources for the specified cluster.
     * </pre>
     */
    public yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClusterOperationsResponse listOperations(yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClusterOperationsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves a list of master hosts for the specified cluster.
     * </pre>
     */
    public yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClusterHostsResponse listMasterHosts(yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClusterHostsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMasterHostsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves a list of segment hosts for the specified cluster.
     * </pre>
     */
    public yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClusterHostsResponse listSegmentHosts(yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClusterHostsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListSegmentHostsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Greenplum clusters.
   * </pre>
   */
  public static final class ClusterServiceFutureStub extends io.grpc.stub.AbstractStub<ClusterServiceFutureStub> {
    private ClusterServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClusterServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClusterServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClusterServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified Greenplum cluster.
     * To get the list of available Greenplum clusters, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.mdb.greenplum.v1.GPC.Cluster> get(
        yandex.cloud.api.mdb.greenplum.v1.GPCS.GetClusterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves a list of Greenplum clusters that belong
     * to the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClustersResponse> list(
        yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClustersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a Greenplum cluster in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.mdb.greenplum.v1.GPCS.CreateClusterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified Greenplum cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.mdb.greenplum.v1.GPCS.DeleteClusterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Starts the specified Greenplum cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> start(
        yandex.cloud.api.mdb.greenplum.v1.GPCS.StartClusterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStartMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Stops the specified Greenplum cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> stop(
        yandex.cloud.api.mdb.greenplum.v1.GPCS.StopClusterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStopMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of Operation resources for the specified cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClusterOperationsResponse> listOperations(
        yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClusterOperationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves a list of master hosts for the specified cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClusterHostsResponse> listMasterHosts(
        yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClusterHostsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMasterHostsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves a list of segment hosts for the specified cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClusterHostsResponse> listSegmentHosts(
        yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClusterHostsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListSegmentHostsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_DELETE = 3;
  private static final int METHODID_START = 4;
  private static final int METHODID_STOP = 5;
  private static final int METHODID_LIST_OPERATIONS = 6;
  private static final int METHODID_LIST_MASTER_HOSTS = 7;
  private static final int METHODID_LIST_SEGMENT_HOSTS = 8;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ClusterServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ClusterServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.mdb.greenplum.v1.GPCS.GetClusterRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.greenplum.v1.GPC.Cluster>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClustersRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClustersResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.mdb.greenplum.v1.GPCS.CreateClusterRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.mdb.greenplum.v1.GPCS.DeleteClusterRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_START:
          serviceImpl.start((yandex.cloud.api.mdb.greenplum.v1.GPCS.StartClusterRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_STOP:
          serviceImpl.stop((yandex.cloud.api.mdb.greenplum.v1.GPCS.StopClusterRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClusterOperationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClusterOperationsResponse>) responseObserver);
          break;
        case METHODID_LIST_MASTER_HOSTS:
          serviceImpl.listMasterHosts((yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClusterHostsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClusterHostsResponse>) responseObserver);
          break;
        case METHODID_LIST_SEGMENT_HOSTS:
          serviceImpl.listSegmentHosts((yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClusterHostsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.greenplum.v1.GPCS.ListClusterHostsResponse>) responseObserver);
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

  private static abstract class ClusterServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ClusterServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.mdb.greenplum.v1.GPCS.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ClusterService");
    }
  }

  private static final class ClusterServiceFileDescriptorSupplier
      extends ClusterServiceBaseDescriptorSupplier {
    ClusterServiceFileDescriptorSupplier() {}
  }

  private static final class ClusterServiceMethodDescriptorSupplier
      extends ClusterServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ClusterServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ClusterServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ClusterServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getStartMethod())
              .addMethod(getStopMethod())
              .addMethod(getListOperationsMethod())
              .addMethod(getListMasterHostsMethod())
              .addMethod(getListSegmentHostsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
