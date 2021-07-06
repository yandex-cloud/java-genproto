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
 * A set of methods for managing target groups.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.0)",
    comments = "Source: yandex/cloud/apploadbalancer/v1/target_group_service.proto")
public final class TargetGroupServiceGrpc {

  private TargetGroupServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.apploadbalancer.v1.TargetGroupService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.GetTargetGroupRequest,
      yandex.cloud.api.apploadbalancer.v1.TargetGroupOuterClass.TargetGroup> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.GetTargetGroupRequest.class,
      responseType = yandex.cloud.api.apploadbalancer.v1.TargetGroupOuterClass.TargetGroup.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.GetTargetGroupRequest,
      yandex.cloud.api.apploadbalancer.v1.TargetGroupOuterClass.TargetGroup> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.GetTargetGroupRequest, yandex.cloud.api.apploadbalancer.v1.TargetGroupOuterClass.TargetGroup> getGetMethod;
    if ((getGetMethod = TargetGroupServiceGrpc.getGetMethod) == null) {
      synchronized (TargetGroupServiceGrpc.class) {
        if ((getGetMethod = TargetGroupServiceGrpc.getGetMethod) == null) {
          TargetGroupServiceGrpc.getGetMethod = getGetMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.GetTargetGroupRequest, yandex.cloud.api.apploadbalancer.v1.TargetGroupOuterClass.TargetGroup>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.apploadbalancer.v1.TargetGroupService", "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.GetTargetGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.apploadbalancer.v1.TargetGroupOuterClass.TargetGroup.getDefaultInstance()))
                  .setSchemaDescriptor(new TargetGroupServiceMethodDescriptorSupplier("Get"))
                  .build();
          }
        }
     }
     return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupsRequest,
      yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupsRequest.class,
      responseType = yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupsRequest,
      yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupsRequest, yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupsResponse> getListMethod;
    if ((getListMethod = TargetGroupServiceGrpc.getListMethod) == null) {
      synchronized (TargetGroupServiceGrpc.class) {
        if ((getListMethod = TargetGroupServiceGrpc.getListMethod) == null) {
          TargetGroupServiceGrpc.getListMethod = getListMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupsRequest, yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.apploadbalancer.v1.TargetGroupService", "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TargetGroupServiceMethodDescriptorSupplier("List"))
                  .build();
          }
        }
     }
     return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.CreateTargetGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.CreateTargetGroupRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.CreateTargetGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.CreateTargetGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = TargetGroupServiceGrpc.getCreateMethod) == null) {
      synchronized (TargetGroupServiceGrpc.class) {
        if ((getCreateMethod = TargetGroupServiceGrpc.getCreateMethod) == null) {
          TargetGroupServiceGrpc.getCreateMethod = getCreateMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.CreateTargetGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.apploadbalancer.v1.TargetGroupService", "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.CreateTargetGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new TargetGroupServiceMethodDescriptorSupplier("Create"))
                  .build();
          }
        }
     }
     return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.UpdateTargetGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.UpdateTargetGroupRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.UpdateTargetGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.UpdateTargetGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = TargetGroupServiceGrpc.getUpdateMethod) == null) {
      synchronized (TargetGroupServiceGrpc.class) {
        if ((getUpdateMethod = TargetGroupServiceGrpc.getUpdateMethod) == null) {
          TargetGroupServiceGrpc.getUpdateMethod = getUpdateMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.UpdateTargetGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.apploadbalancer.v1.TargetGroupService", "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.UpdateTargetGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new TargetGroupServiceMethodDescriptorSupplier("Update"))
                  .build();
          }
        }
     }
     return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.DeleteTargetGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.DeleteTargetGroupRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.DeleteTargetGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.DeleteTargetGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = TargetGroupServiceGrpc.getDeleteMethod) == null) {
      synchronized (TargetGroupServiceGrpc.class) {
        if ((getDeleteMethod = TargetGroupServiceGrpc.getDeleteMethod) == null) {
          TargetGroupServiceGrpc.getDeleteMethod = getDeleteMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.DeleteTargetGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.apploadbalancer.v1.TargetGroupService", "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.DeleteTargetGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new TargetGroupServiceMethodDescriptorSupplier("Delete"))
                  .build();
          }
        }
     }
     return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.AddTargetsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getAddTargetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddTargets",
      requestType = yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.AddTargetsRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.AddTargetsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getAddTargetsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.AddTargetsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getAddTargetsMethod;
    if ((getAddTargetsMethod = TargetGroupServiceGrpc.getAddTargetsMethod) == null) {
      synchronized (TargetGroupServiceGrpc.class) {
        if ((getAddTargetsMethod = TargetGroupServiceGrpc.getAddTargetsMethod) == null) {
          TargetGroupServiceGrpc.getAddTargetsMethod = getAddTargetsMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.AddTargetsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.apploadbalancer.v1.TargetGroupService", "AddTargets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.AddTargetsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new TargetGroupServiceMethodDescriptorSupplier("AddTargets"))
                  .build();
          }
        }
     }
     return getAddTargetsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.RemoveTargetsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRemoveTargetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveTargets",
      requestType = yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.RemoveTargetsRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.RemoveTargetsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRemoveTargetsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.RemoveTargetsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getRemoveTargetsMethod;
    if ((getRemoveTargetsMethod = TargetGroupServiceGrpc.getRemoveTargetsMethod) == null) {
      synchronized (TargetGroupServiceGrpc.class) {
        if ((getRemoveTargetsMethod = TargetGroupServiceGrpc.getRemoveTargetsMethod) == null) {
          TargetGroupServiceGrpc.getRemoveTargetsMethod = getRemoveTargetsMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.RemoveTargetsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.apploadbalancer.v1.TargetGroupService", "RemoveTargets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.RemoveTargetsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new TargetGroupServiceMethodDescriptorSupplier("RemoveTargets"))
                  .build();
          }
        }
     }
     return getRemoveTargetsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupOperationsRequest,
      yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupOperationsResponse> getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupOperationsRequest.class,
      responseType = yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupOperationsRequest,
      yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupOperationsResponse> getListOperationsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupOperationsRequest, yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupOperationsResponse> getListOperationsMethod;
    if ((getListOperationsMethod = TargetGroupServiceGrpc.getListOperationsMethod) == null) {
      synchronized (TargetGroupServiceGrpc.class) {
        if ((getListOperationsMethod = TargetGroupServiceGrpc.getListOperationsMethod) == null) {
          TargetGroupServiceGrpc.getListOperationsMethod = getListOperationsMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupOperationsRequest, yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.apploadbalancer.v1.TargetGroupService", "ListOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupOperationsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TargetGroupServiceMethodDescriptorSupplier("ListOperations"))
                  .build();
          }
        }
     }
     return getListOperationsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TargetGroupServiceStub newStub(io.grpc.Channel channel) {
    return new TargetGroupServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TargetGroupServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TargetGroupServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TargetGroupServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TargetGroupServiceFutureStub(channel);
  }

  /**
   * <pre>
   * A set of methods for managing target groups.
   * </pre>
   */
  public static abstract class TargetGroupServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified target group.
     * To get the list of all available target groups, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.GetTargetGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.apploadbalancer.v1.TargetGroupOuterClass.TargetGroup> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists target groups in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a target group in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.CreateTargetGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified target group.
     * </pre>
     */
    public void update(yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.UpdateTargetGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified target group.
     * </pre>
     */
    public void delete(yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.DeleteTargetGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Adds targets to the specified target group.
     * </pre>
     */
    public void addTargets(yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.AddTargetsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getAddTargetsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Removes targets from the specified target group.
     * </pre>
     */
    public void removeTargets(yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.RemoveTargetsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveTargetsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified target group.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupOperationsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.GetTargetGroupRequest,
                yandex.cloud.api.apploadbalancer.v1.TargetGroupOuterClass.TargetGroup>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupsRequest,
                yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupsResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.CreateTargetGroupRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.UpdateTargetGroupRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.DeleteTargetGroupRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getAddTargetsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.AddTargetsRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_ADD_TARGETS)))
          .addMethod(
            getRemoveTargetsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.RemoveTargetsRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_REMOVE_TARGETS)))
          .addMethod(
            getListOperationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupOperationsRequest,
                yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupOperationsResponse>(
                  this, METHODID_LIST_OPERATIONS)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing target groups.
   * </pre>
   */
  public static final class TargetGroupServiceStub extends io.grpc.stub.AbstractStub<TargetGroupServiceStub> {
    private TargetGroupServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TargetGroupServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TargetGroupServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TargetGroupServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified target group.
     * To get the list of all available target groups, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.GetTargetGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.apploadbalancer.v1.TargetGroupOuterClass.TargetGroup> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists target groups in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a target group in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.CreateTargetGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified target group.
     * </pre>
     */
    public void update(yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.UpdateTargetGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified target group.
     * </pre>
     */
    public void delete(yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.DeleteTargetGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Adds targets to the specified target group.
     * </pre>
     */
    public void addTargets(yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.AddTargetsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddTargetsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Removes targets from the specified target group.
     * </pre>
     */
    public void removeTargets(yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.RemoveTargetsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveTargetsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified target group.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupOperationsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing target groups.
   * </pre>
   */
  public static final class TargetGroupServiceBlockingStub extends io.grpc.stub.AbstractStub<TargetGroupServiceBlockingStub> {
    private TargetGroupServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TargetGroupServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TargetGroupServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TargetGroupServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified target group.
     * To get the list of all available target groups, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.apploadbalancer.v1.TargetGroupOuterClass.TargetGroup get(yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.GetTargetGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists target groups in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupsResponse list(yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a target group in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.CreateTargetGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified target group.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.UpdateTargetGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified target group.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.DeleteTargetGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Adds targets to the specified target group.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation addTargets(yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.AddTargetsRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddTargetsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Removes targets from the specified target group.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation removeTargets(yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.RemoveTargetsRequest request) {
      return blockingUnaryCall(
          getChannel(), getRemoveTargetsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists operations for the specified target group.
     * </pre>
     */
    public yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupOperationsResponse listOperations(yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupOperationsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing target groups.
   * </pre>
   */
  public static final class TargetGroupServiceFutureStub extends io.grpc.stub.AbstractStub<TargetGroupServiceFutureStub> {
    private TargetGroupServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TargetGroupServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TargetGroupServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TargetGroupServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified target group.
     * To get the list of all available target groups, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.apploadbalancer.v1.TargetGroupOuterClass.TargetGroup> get(
        yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.GetTargetGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists target groups in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupsResponse> list(
        yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a target group in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.CreateTargetGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified target group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.UpdateTargetGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified target group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.DeleteTargetGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Adds targets to the specified target group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> addTargets(
        yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.AddTargetsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddTargetsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Removes targets from the specified target group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> removeTargets(
        yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.RemoveTargetsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveTargetsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists operations for the specified target group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupOperationsResponse> listOperations(
        yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupOperationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_DELETE = 4;
  private static final int METHODID_ADD_TARGETS = 5;
  private static final int METHODID_REMOVE_TARGETS = 6;
  private static final int METHODID_LIST_OPERATIONS = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TargetGroupServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TargetGroupServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.GetTargetGroupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.apploadbalancer.v1.TargetGroupOuterClass.TargetGroup>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupsResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.CreateTargetGroupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.UpdateTargetGroupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.DeleteTargetGroupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_ADD_TARGETS:
          serviceImpl.addTargets((yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.AddTargetsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_REMOVE_TARGETS:
          serviceImpl.removeTargets((yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.RemoveTargetsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupOperationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.ListTargetGroupOperationsResponse>) responseObserver);
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

  private static abstract class TargetGroupServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TargetGroupServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.apploadbalancer.v1.TargetGroupServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TargetGroupService");
    }
  }

  private static final class TargetGroupServiceFileDescriptorSupplier
      extends TargetGroupServiceBaseDescriptorSupplier {
    TargetGroupServiceFileDescriptorSupplier() {}
  }

  private static final class TargetGroupServiceMethodDescriptorSupplier
      extends TargetGroupServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TargetGroupServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TargetGroupServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TargetGroupServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getAddTargetsMethod())
              .addMethod(getRemoveTargetsMethod())
              .addMethod(getListOperationsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
