package yandex.cloud.api.compute.v1;

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
 * A set of methods for managing groups of dedicated hosts
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.0)",
    comments = "Source: yandex/cloud/compute/v1/host_group_service.proto")
public final class HostGroupServiceGrpc {

  private HostGroupServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.compute.v1.HostGroupService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.GetHostGroupRequest,
      yandex.cloud.api.compute.v1.HostGroupOuterClass.HostGroup> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.GetHostGroupRequest.class,
      responseType = yandex.cloud.api.compute.v1.HostGroupOuterClass.HostGroup.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.GetHostGroupRequest,
      yandex.cloud.api.compute.v1.HostGroupOuterClass.HostGroup> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.GetHostGroupRequest, yandex.cloud.api.compute.v1.HostGroupOuterClass.HostGroup> getGetMethod;
    if ((getGetMethod = HostGroupServiceGrpc.getGetMethod) == null) {
      synchronized (HostGroupServiceGrpc.class) {
        if ((getGetMethod = HostGroupServiceGrpc.getGetMethod) == null) {
          HostGroupServiceGrpc.getGetMethod = getGetMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.GetHostGroupRequest, yandex.cloud.api.compute.v1.HostGroupOuterClass.HostGroup>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.compute.v1.HostGroupService", "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.GetHostGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.HostGroupOuterClass.HostGroup.getDefaultInstance()))
                  .setSchemaDescriptor(new HostGroupServiceMethodDescriptorSupplier("Get"))
                  .build();
          }
        }
     }
     return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupsRequest,
      yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupsRequest.class,
      responseType = yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupsRequest,
      yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupsRequest, yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupsResponse> getListMethod;
    if ((getListMethod = HostGroupServiceGrpc.getListMethod) == null) {
      synchronized (HostGroupServiceGrpc.class) {
        if ((getListMethod = HostGroupServiceGrpc.getListMethod) == null) {
          HostGroupServiceGrpc.getListMethod = getListMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupsRequest, yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.compute.v1.HostGroupService", "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HostGroupServiceMethodDescriptorSupplier("List"))
                  .build();
          }
        }
     }
     return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.CreateHostGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.CreateHostGroupRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.CreateHostGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.CreateHostGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = HostGroupServiceGrpc.getCreateMethod) == null) {
      synchronized (HostGroupServiceGrpc.class) {
        if ((getCreateMethod = HostGroupServiceGrpc.getCreateMethod) == null) {
          HostGroupServiceGrpc.getCreateMethod = getCreateMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.CreateHostGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.compute.v1.HostGroupService", "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.CreateHostGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new HostGroupServiceMethodDescriptorSupplier("Create"))
                  .build();
          }
        }
     }
     return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.UpdateHostGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.UpdateHostGroupRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.UpdateHostGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.UpdateHostGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = HostGroupServiceGrpc.getUpdateMethod) == null) {
      synchronized (HostGroupServiceGrpc.class) {
        if ((getUpdateMethod = HostGroupServiceGrpc.getUpdateMethod) == null) {
          HostGroupServiceGrpc.getUpdateMethod = getUpdateMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.UpdateHostGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.compute.v1.HostGroupService", "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.UpdateHostGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new HostGroupServiceMethodDescriptorSupplier("Update"))
                  .build();
          }
        }
     }
     return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.DeleteHostGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.DeleteHostGroupRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.DeleteHostGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.DeleteHostGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = HostGroupServiceGrpc.getDeleteMethod) == null) {
      synchronized (HostGroupServiceGrpc.class) {
        if ((getDeleteMethod = HostGroupServiceGrpc.getDeleteMethod) == null) {
          HostGroupServiceGrpc.getDeleteMethod = getDeleteMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.DeleteHostGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.compute.v1.HostGroupService", "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.DeleteHostGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new HostGroupServiceMethodDescriptorSupplier("Delete"))
                  .build();
          }
        }
     }
     return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupOperationsRequest,
      yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupOperationsResponse> getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupOperationsRequest.class,
      responseType = yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupOperationsRequest,
      yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupOperationsResponse> getListOperationsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupOperationsRequest, yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupOperationsResponse> getListOperationsMethod;
    if ((getListOperationsMethod = HostGroupServiceGrpc.getListOperationsMethod) == null) {
      synchronized (HostGroupServiceGrpc.class) {
        if ((getListOperationsMethod = HostGroupServiceGrpc.getListOperationsMethod) == null) {
          HostGroupServiceGrpc.getListOperationsMethod = getListOperationsMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupOperationsRequest, yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.compute.v1.HostGroupService", "ListOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupOperationsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HostGroupServiceMethodDescriptorSupplier("ListOperations"))
                  .build();
          }
        }
     }
     return getListOperationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupInstancesRequest,
      yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupInstancesResponse> getListInstancesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListInstances",
      requestType = yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupInstancesRequest.class,
      responseType = yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupInstancesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupInstancesRequest,
      yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupInstancesResponse> getListInstancesMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupInstancesRequest, yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupInstancesResponse> getListInstancesMethod;
    if ((getListInstancesMethod = HostGroupServiceGrpc.getListInstancesMethod) == null) {
      synchronized (HostGroupServiceGrpc.class) {
        if ((getListInstancesMethod = HostGroupServiceGrpc.getListInstancesMethod) == null) {
          HostGroupServiceGrpc.getListInstancesMethod = getListInstancesMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupInstancesRequest, yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupInstancesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.compute.v1.HostGroupService", "ListInstances"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupInstancesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupInstancesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HostGroupServiceMethodDescriptorSupplier("ListInstances"))
                  .build();
          }
        }
     }
     return getListInstancesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupHostsRequest,
      yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupHostsResponse> getListHostsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListHosts",
      requestType = yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupHostsRequest.class,
      responseType = yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupHostsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupHostsRequest,
      yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupHostsResponse> getListHostsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupHostsRequest, yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupHostsResponse> getListHostsMethod;
    if ((getListHostsMethod = HostGroupServiceGrpc.getListHostsMethod) == null) {
      synchronized (HostGroupServiceGrpc.class) {
        if ((getListHostsMethod = HostGroupServiceGrpc.getListHostsMethod) == null) {
          HostGroupServiceGrpc.getListHostsMethod = getListHostsMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupHostsRequest, yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupHostsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.compute.v1.HostGroupService", "ListHosts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupHostsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupHostsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HostGroupServiceMethodDescriptorSupplier("ListHosts"))
                  .build();
          }
        }
     }
     return getListHostsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HostGroupServiceStub newStub(io.grpc.Channel channel) {
    return new HostGroupServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HostGroupServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new HostGroupServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HostGroupServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new HostGroupServiceFutureStub(channel);
  }

  /**
   * <pre>
   * A set of methods for managing groups of dedicated hosts
   * </pre>
   */
  public static abstract class HostGroupServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified host group
     * </pre>
     */
    public void get(yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.GetHostGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.HostGroupOuterClass.HostGroup> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of host groups in the specified folder
     * </pre>
     */
    public void list(yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a host group in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.CreateHostGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified host group.
     * </pre>
     */
    public void update(yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.UpdateHostGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified host group.
     * </pre>
     */
    public void delete(yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.DeleteHostGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified host group
     * </pre>
     */
    public void listOperations(yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupOperationsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists instances that belongs to the specified host group
     * </pre>
     */
    public void listInstances(yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupInstancesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupInstancesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListInstancesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists hosts that belongs to the specified host group
     * </pre>
     */
    public void listHosts(yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupHostsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupHostsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListHostsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.GetHostGroupRequest,
                yandex.cloud.api.compute.v1.HostGroupOuterClass.HostGroup>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupsRequest,
                yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupsResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.CreateHostGroupRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.UpdateHostGroupRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.DeleteHostGroupRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListOperationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupOperationsRequest,
                yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupOperationsResponse>(
                  this, METHODID_LIST_OPERATIONS)))
          .addMethod(
            getListInstancesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupInstancesRequest,
                yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupInstancesResponse>(
                  this, METHODID_LIST_INSTANCES)))
          .addMethod(
            getListHostsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupHostsRequest,
                yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupHostsResponse>(
                  this, METHODID_LIST_HOSTS)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing groups of dedicated hosts
   * </pre>
   */
  public static final class HostGroupServiceStub extends io.grpc.stub.AbstractStub<HostGroupServiceStub> {
    private HostGroupServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HostGroupServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HostGroupServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HostGroupServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified host group
     * </pre>
     */
    public void get(yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.GetHostGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.HostGroupOuterClass.HostGroup> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of host groups in the specified folder
     * </pre>
     */
    public void list(yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a host group in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.CreateHostGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified host group.
     * </pre>
     */
    public void update(yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.UpdateHostGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified host group.
     * </pre>
     */
    public void delete(yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.DeleteHostGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified host group
     * </pre>
     */
    public void listOperations(yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupOperationsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists instances that belongs to the specified host group
     * </pre>
     */
    public void listInstances(yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupInstancesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupInstancesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListInstancesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists hosts that belongs to the specified host group
     * </pre>
     */
    public void listHosts(yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupHostsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupHostsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListHostsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing groups of dedicated hosts
   * </pre>
   */
  public static final class HostGroupServiceBlockingStub extends io.grpc.stub.AbstractStub<HostGroupServiceBlockingStub> {
    private HostGroupServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HostGroupServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HostGroupServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HostGroupServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified host group
     * </pre>
     */
    public yandex.cloud.api.compute.v1.HostGroupOuterClass.HostGroup get(yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.GetHostGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of host groups in the specified folder
     * </pre>
     */
    public yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupsResponse list(yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a host group in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.CreateHostGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified host group.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.UpdateHostGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified host group.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.DeleteHostGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists operations for the specified host group
     * </pre>
     */
    public yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupOperationsResponse listOperations(yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupOperationsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists instances that belongs to the specified host group
     * </pre>
     */
    public yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupInstancesResponse listInstances(yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupInstancesRequest request) {
      return blockingUnaryCall(
          getChannel(), getListInstancesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists hosts that belongs to the specified host group
     * </pre>
     */
    public yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupHostsResponse listHosts(yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupHostsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListHostsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing groups of dedicated hosts
   * </pre>
   */
  public static final class HostGroupServiceFutureStub extends io.grpc.stub.AbstractStub<HostGroupServiceFutureStub> {
    private HostGroupServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HostGroupServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HostGroupServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HostGroupServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified host group
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.compute.v1.HostGroupOuterClass.HostGroup> get(
        yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.GetHostGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of host groups in the specified folder
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupsResponse> list(
        yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a host group in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.CreateHostGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified host group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.UpdateHostGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified host group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.DeleteHostGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists operations for the specified host group
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupOperationsResponse> listOperations(
        yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupOperationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists instances that belongs to the specified host group
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupInstancesResponse> listInstances(
        yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupInstancesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListInstancesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists hosts that belongs to the specified host group
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupHostsResponse> listHosts(
        yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupHostsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListHostsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_DELETE = 4;
  private static final int METHODID_LIST_OPERATIONS = 5;
  private static final int METHODID_LIST_INSTANCES = 6;
  private static final int METHODID_LIST_HOSTS = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HostGroupServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HostGroupServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.GetHostGroupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.HostGroupOuterClass.HostGroup>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupsResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.CreateHostGroupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.UpdateHostGroupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.DeleteHostGroupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupOperationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupOperationsResponse>) responseObserver);
          break;
        case METHODID_LIST_INSTANCES:
          serviceImpl.listInstances((yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupInstancesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupInstancesResponse>) responseObserver);
          break;
        case METHODID_LIST_HOSTS:
          serviceImpl.listHosts((yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupHostsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.ListHostGroupHostsResponse>) responseObserver);
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

  private static abstract class HostGroupServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HostGroupServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.compute.v1.HostGroupServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HostGroupService");
    }
  }

  private static final class HostGroupServiceFileDescriptorSupplier
      extends HostGroupServiceBaseDescriptorSupplier {
    HostGroupServiceFileDescriptorSupplier() {}
  }

  private static final class HostGroupServiceMethodDescriptorSupplier
      extends HostGroupServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HostGroupServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (HostGroupServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HostGroupServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getListOperationsMethod())
              .addMethod(getListInstancesMethod())
              .addMethod(getListHostsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
