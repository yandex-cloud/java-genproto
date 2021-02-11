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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.0)",
    comments = "Source: yandex/cloud/apploadbalancer/v1/backend_group_service.proto")
public final class BackendGroupServiceGrpc {

  private BackendGroupServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.apploadbalancer.v1.BackendGroupService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.GetBackendGroupRequest,
      yandex.cloud.api.apploadbalancer.v1.BackendGroupOuterClass.BackendGroup> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.GetBackendGroupRequest.class,
      responseType = yandex.cloud.api.apploadbalancer.v1.BackendGroupOuterClass.BackendGroup.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.GetBackendGroupRequest,
      yandex.cloud.api.apploadbalancer.v1.BackendGroupOuterClass.BackendGroup> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.GetBackendGroupRequest, yandex.cloud.api.apploadbalancer.v1.BackendGroupOuterClass.BackendGroup> getGetMethod;
    if ((getGetMethod = BackendGroupServiceGrpc.getGetMethod) == null) {
      synchronized (BackendGroupServiceGrpc.class) {
        if ((getGetMethod = BackendGroupServiceGrpc.getGetMethod) == null) {
          BackendGroupServiceGrpc.getGetMethod = getGetMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.GetBackendGroupRequest, yandex.cloud.api.apploadbalancer.v1.BackendGroupOuterClass.BackendGroup>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.apploadbalancer.v1.BackendGroupService", "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.GetBackendGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.apploadbalancer.v1.BackendGroupOuterClass.BackendGroup.getDefaultInstance()))
                  .setSchemaDescriptor(new BackendGroupServiceMethodDescriptorSupplier("Get"))
                  .build();
          }
        }
     }
     return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.ListBackendGroupsRequest,
      yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.ListBackendGroupsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.ListBackendGroupsRequest.class,
      responseType = yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.ListBackendGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.ListBackendGroupsRequest,
      yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.ListBackendGroupsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.ListBackendGroupsRequest, yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.ListBackendGroupsResponse> getListMethod;
    if ((getListMethod = BackendGroupServiceGrpc.getListMethod) == null) {
      synchronized (BackendGroupServiceGrpc.class) {
        if ((getListMethod = BackendGroupServiceGrpc.getListMethod) == null) {
          BackendGroupServiceGrpc.getListMethod = getListMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.ListBackendGroupsRequest, yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.ListBackendGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.apploadbalancer.v1.BackendGroupService", "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.ListBackendGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.ListBackendGroupsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BackendGroupServiceMethodDescriptorSupplier("List"))
                  .build();
          }
        }
     }
     return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.CreateBackendGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.CreateBackendGroupRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.CreateBackendGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.CreateBackendGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = BackendGroupServiceGrpc.getCreateMethod) == null) {
      synchronized (BackendGroupServiceGrpc.class) {
        if ((getCreateMethod = BackendGroupServiceGrpc.getCreateMethod) == null) {
          BackendGroupServiceGrpc.getCreateMethod = getCreateMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.CreateBackendGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.apploadbalancer.v1.BackendGroupService", "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.CreateBackendGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new BackendGroupServiceMethodDescriptorSupplier("Create"))
                  .build();
          }
        }
     }
     return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.UpdateBackendGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.UpdateBackendGroupRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.UpdateBackendGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.UpdateBackendGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = BackendGroupServiceGrpc.getUpdateMethod) == null) {
      synchronized (BackendGroupServiceGrpc.class) {
        if ((getUpdateMethod = BackendGroupServiceGrpc.getUpdateMethod) == null) {
          BackendGroupServiceGrpc.getUpdateMethod = getUpdateMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.UpdateBackendGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.apploadbalancer.v1.BackendGroupService", "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.UpdateBackendGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new BackendGroupServiceMethodDescriptorSupplier("Update"))
                  .build();
          }
        }
     }
     return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.DeleteBackendGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.DeleteBackendGroupRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.DeleteBackendGroupRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.DeleteBackendGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = BackendGroupServiceGrpc.getDeleteMethod) == null) {
      synchronized (BackendGroupServiceGrpc.class) {
        if ((getDeleteMethod = BackendGroupServiceGrpc.getDeleteMethod) == null) {
          BackendGroupServiceGrpc.getDeleteMethod = getDeleteMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.DeleteBackendGroupRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.apploadbalancer.v1.BackendGroupService", "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.DeleteBackendGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new BackendGroupServiceMethodDescriptorSupplier("Delete"))
                  .build();
          }
        }
     }
     return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.AddBackendRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getAddBackendMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddBackend",
      requestType = yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.AddBackendRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.AddBackendRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getAddBackendMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.AddBackendRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getAddBackendMethod;
    if ((getAddBackendMethod = BackendGroupServiceGrpc.getAddBackendMethod) == null) {
      synchronized (BackendGroupServiceGrpc.class) {
        if ((getAddBackendMethod = BackendGroupServiceGrpc.getAddBackendMethod) == null) {
          BackendGroupServiceGrpc.getAddBackendMethod = getAddBackendMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.AddBackendRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.apploadbalancer.v1.BackendGroupService", "AddBackend"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.AddBackendRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new BackendGroupServiceMethodDescriptorSupplier("AddBackend"))
                  .build();
          }
        }
     }
     return getAddBackendMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.RemoveBackendRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRemoveBackendMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveBackend",
      requestType = yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.RemoveBackendRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.RemoveBackendRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRemoveBackendMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.RemoveBackendRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getRemoveBackendMethod;
    if ((getRemoveBackendMethod = BackendGroupServiceGrpc.getRemoveBackendMethod) == null) {
      synchronized (BackendGroupServiceGrpc.class) {
        if ((getRemoveBackendMethod = BackendGroupServiceGrpc.getRemoveBackendMethod) == null) {
          BackendGroupServiceGrpc.getRemoveBackendMethod = getRemoveBackendMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.RemoveBackendRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.apploadbalancer.v1.BackendGroupService", "RemoveBackend"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.RemoveBackendRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new BackendGroupServiceMethodDescriptorSupplier("RemoveBackend"))
                  .build();
          }
        }
     }
     return getRemoveBackendMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.UpdateBackendRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateBackendMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateBackend",
      requestType = yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.UpdateBackendRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.UpdateBackendRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateBackendMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.UpdateBackendRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateBackendMethod;
    if ((getUpdateBackendMethod = BackendGroupServiceGrpc.getUpdateBackendMethod) == null) {
      synchronized (BackendGroupServiceGrpc.class) {
        if ((getUpdateBackendMethod = BackendGroupServiceGrpc.getUpdateBackendMethod) == null) {
          BackendGroupServiceGrpc.getUpdateBackendMethod = getUpdateBackendMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.UpdateBackendRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.apploadbalancer.v1.BackendGroupService", "UpdateBackend"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.UpdateBackendRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new BackendGroupServiceMethodDescriptorSupplier("UpdateBackend"))
                  .build();
          }
        }
     }
     return getUpdateBackendMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.ListBackendGroupOperationsRequest,
      yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.ListBackendGroupOperationsResponse> getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.ListBackendGroupOperationsRequest.class,
      responseType = yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.ListBackendGroupOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.ListBackendGroupOperationsRequest,
      yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.ListBackendGroupOperationsResponse> getListOperationsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.ListBackendGroupOperationsRequest, yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.ListBackendGroupOperationsResponse> getListOperationsMethod;
    if ((getListOperationsMethod = BackendGroupServiceGrpc.getListOperationsMethod) == null) {
      synchronized (BackendGroupServiceGrpc.class) {
        if ((getListOperationsMethod = BackendGroupServiceGrpc.getListOperationsMethod) == null) {
          BackendGroupServiceGrpc.getListOperationsMethod = getListOperationsMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.ListBackendGroupOperationsRequest, yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.ListBackendGroupOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.apploadbalancer.v1.BackendGroupService", "ListOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.ListBackendGroupOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.ListBackendGroupOperationsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BackendGroupServiceMethodDescriptorSupplier("ListOperations"))
                  .build();
          }
        }
     }
     return getListOperationsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BackendGroupServiceStub newStub(io.grpc.Channel channel) {
    return new BackendGroupServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BackendGroupServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BackendGroupServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BackendGroupServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BackendGroupServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class BackendGroupServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void get(yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.GetBackendGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.apploadbalancer.v1.BackendGroupOuterClass.BackendGroup> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     */
    public void list(yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.ListBackendGroupsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.ListBackendGroupsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     */
    public void create(yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.CreateBackendGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    public void update(yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.UpdateBackendGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     */
    public void delete(yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.DeleteBackendGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * AddBackend/RemoveBackend technically do the same, but have different semantics.
     * </pre>
     */
    public void addBackend(yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.AddBackendRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getAddBackendMethod(), responseObserver);
    }

    /**
     */
    public void removeBackend(yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.RemoveBackendRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveBackendMethod(), responseObserver);
    }

    /**
     */
    public void updateBackend(yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.UpdateBackendRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateBackendMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified backend group.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.ListBackendGroupOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.ListBackendGroupOperationsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.GetBackendGroupRequest,
                yandex.cloud.api.apploadbalancer.v1.BackendGroupOuterClass.BackendGroup>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.ListBackendGroupsRequest,
                yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.ListBackendGroupsResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.CreateBackendGroupRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.UpdateBackendGroupRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.DeleteBackendGroupRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getAddBackendMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.AddBackendRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_ADD_BACKEND)))
          .addMethod(
            getRemoveBackendMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.RemoveBackendRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_REMOVE_BACKEND)))
          .addMethod(
            getUpdateBackendMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.UpdateBackendRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE_BACKEND)))
          .addMethod(
            getListOperationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.ListBackendGroupOperationsRequest,
                yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.ListBackendGroupOperationsResponse>(
                  this, METHODID_LIST_OPERATIONS)))
          .build();
    }
  }

  /**
   */
  public static final class BackendGroupServiceStub extends io.grpc.stub.AbstractStub<BackendGroupServiceStub> {
    private BackendGroupServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BackendGroupServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BackendGroupServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BackendGroupServiceStub(channel, callOptions);
    }

    /**
     */
    public void get(yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.GetBackendGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.apploadbalancer.v1.BackendGroupOuterClass.BackendGroup> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void list(yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.ListBackendGroupsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.ListBackendGroupsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void create(yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.CreateBackendGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void update(yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.UpdateBackendGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.DeleteBackendGroupRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AddBackend/RemoveBackend technically do the same, but have different semantics.
     * </pre>
     */
    public void addBackend(yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.AddBackendRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddBackendMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeBackend(yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.RemoveBackendRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveBackendMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateBackend(yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.UpdateBackendRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateBackendMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified backend group.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.ListBackendGroupOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.ListBackendGroupOperationsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class BackendGroupServiceBlockingStub extends io.grpc.stub.AbstractStub<BackendGroupServiceBlockingStub> {
    private BackendGroupServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BackendGroupServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BackendGroupServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BackendGroupServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public yandex.cloud.api.apploadbalancer.v1.BackendGroupOuterClass.BackendGroup get(yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.GetBackendGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.ListBackendGroupsResponse list(yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.ListBackendGroupsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.CreateBackendGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.UpdateBackendGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.DeleteBackendGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AddBackend/RemoveBackend technically do the same, but have different semantics.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation addBackend(yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.AddBackendRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddBackendMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation removeBackend(yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.RemoveBackendRequest request) {
      return blockingUnaryCall(
          getChannel(), getRemoveBackendMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation updateBackend(yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.UpdateBackendRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateBackendMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists operations for the specified backend group.
     * </pre>
     */
    public yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.ListBackendGroupOperationsResponse listOperations(yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.ListBackendGroupOperationsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BackendGroupServiceFutureStub extends io.grpc.stub.AbstractStub<BackendGroupServiceFutureStub> {
    private BackendGroupServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BackendGroupServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BackendGroupServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BackendGroupServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.apploadbalancer.v1.BackendGroupOuterClass.BackendGroup> get(
        yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.GetBackendGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.ListBackendGroupsResponse> list(
        yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.ListBackendGroupsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.CreateBackendGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.UpdateBackendGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.DeleteBackendGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AddBackend/RemoveBackend technically do the same, but have different semantics.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> addBackend(
        yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.AddBackendRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddBackendMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> removeBackend(
        yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.RemoveBackendRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveBackendMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> updateBackend(
        yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.UpdateBackendRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateBackendMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists operations for the specified backend group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.ListBackendGroupOperationsResponse> listOperations(
        yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.ListBackendGroupOperationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_DELETE = 4;
  private static final int METHODID_ADD_BACKEND = 5;
  private static final int METHODID_REMOVE_BACKEND = 6;
  private static final int METHODID_UPDATE_BACKEND = 7;
  private static final int METHODID_LIST_OPERATIONS = 8;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BackendGroupServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BackendGroupServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.GetBackendGroupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.apploadbalancer.v1.BackendGroupOuterClass.BackendGroup>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.ListBackendGroupsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.ListBackendGroupsResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.CreateBackendGroupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.UpdateBackendGroupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.DeleteBackendGroupRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_ADD_BACKEND:
          serviceImpl.addBackend((yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.AddBackendRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_REMOVE_BACKEND:
          serviceImpl.removeBackend((yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.RemoveBackendRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE_BACKEND:
          serviceImpl.updateBackend((yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.UpdateBackendRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.ListBackendGroupOperationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.ListBackendGroupOperationsResponse>) responseObserver);
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

  private static abstract class BackendGroupServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BackendGroupServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.apploadbalancer.v1.BackendGroupServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BackendGroupService");
    }
  }

  private static final class BackendGroupServiceFileDescriptorSupplier
      extends BackendGroupServiceBaseDescriptorSupplier {
    BackendGroupServiceFileDescriptorSupplier() {}
  }

  private static final class BackendGroupServiceMethodDescriptorSupplier
      extends BackendGroupServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BackendGroupServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (BackendGroupServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BackendGroupServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getAddBackendMethod())
              .addMethod(getRemoveBackendMethod())
              .addMethod(getUpdateBackendMethod())
              .addMethod(getListOperationsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
