package yandex.cloud.api.serverless.containers.v1;

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
    comments = "Source: yandex/cloud/serverless/containers/v1/container_service.proto")
public final class ContainerServiceGrpc {

  private ContainerServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.serverless.containers.v1.ContainerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.GetContainerRequest,
      yandex.cloud.api.serverless.containers.v1.ContainerOuterClass.Container> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.GetContainerRequest.class,
      responseType = yandex.cloud.api.serverless.containers.v1.ContainerOuterClass.Container.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.GetContainerRequest,
      yandex.cloud.api.serverless.containers.v1.ContainerOuterClass.Container> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.GetContainerRequest, yandex.cloud.api.serverless.containers.v1.ContainerOuterClass.Container> getGetMethod;
    if ((getGetMethod = ContainerServiceGrpc.getGetMethod) == null) {
      synchronized (ContainerServiceGrpc.class) {
        if ((getGetMethod = ContainerServiceGrpc.getGetMethod) == null) {
          ContainerServiceGrpc.getGetMethod = getGetMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.GetContainerRequest, yandex.cloud.api.serverless.containers.v1.ContainerOuterClass.Container>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.serverless.containers.v1.ContainerService", "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.GetContainerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.containers.v1.ContainerOuterClass.Container.getDefaultInstance()))
                  .setSchemaDescriptor(new ContainerServiceMethodDescriptorSupplier("Get"))
                  .build();
          }
        }
     }
     return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.ListContainersRequest,
      yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.ListContainersResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.ListContainersRequest.class,
      responseType = yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.ListContainersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.ListContainersRequest,
      yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.ListContainersResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.ListContainersRequest, yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.ListContainersResponse> getListMethod;
    if ((getListMethod = ContainerServiceGrpc.getListMethod) == null) {
      synchronized (ContainerServiceGrpc.class) {
        if ((getListMethod = ContainerServiceGrpc.getListMethod) == null) {
          ContainerServiceGrpc.getListMethod = getListMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.ListContainersRequest, yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.ListContainersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.serverless.containers.v1.ContainerService", "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.ListContainersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.ListContainersResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ContainerServiceMethodDescriptorSupplier("List"))
                  .build();
          }
        }
     }
     return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.CreateContainerRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.CreateContainerRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.CreateContainerRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.CreateContainerRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = ContainerServiceGrpc.getCreateMethod) == null) {
      synchronized (ContainerServiceGrpc.class) {
        if ((getCreateMethod = ContainerServiceGrpc.getCreateMethod) == null) {
          ContainerServiceGrpc.getCreateMethod = getCreateMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.CreateContainerRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.serverless.containers.v1.ContainerService", "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.CreateContainerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new ContainerServiceMethodDescriptorSupplier("Create"))
                  .build();
          }
        }
     }
     return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.UpdateContainerRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.UpdateContainerRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.UpdateContainerRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.UpdateContainerRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = ContainerServiceGrpc.getUpdateMethod) == null) {
      synchronized (ContainerServiceGrpc.class) {
        if ((getUpdateMethod = ContainerServiceGrpc.getUpdateMethod) == null) {
          ContainerServiceGrpc.getUpdateMethod = getUpdateMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.UpdateContainerRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.serverless.containers.v1.ContainerService", "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.UpdateContainerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new ContainerServiceMethodDescriptorSupplier("Update"))
                  .build();
          }
        }
     }
     return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.DeleteContainerRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.DeleteContainerRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.DeleteContainerRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.DeleteContainerRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = ContainerServiceGrpc.getDeleteMethod) == null) {
      synchronized (ContainerServiceGrpc.class) {
        if ((getDeleteMethod = ContainerServiceGrpc.getDeleteMethod) == null) {
          ContainerServiceGrpc.getDeleteMethod = getDeleteMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.DeleteContainerRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.serverless.containers.v1.ContainerService", "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.DeleteContainerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new ContainerServiceMethodDescriptorSupplier("Delete"))
                  .build();
          }
        }
     }
     return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.DeployContainerRevisionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeployRevisionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeployRevision",
      requestType = yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.DeployContainerRevisionRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.DeployContainerRevisionRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeployRevisionMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.DeployContainerRevisionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeployRevisionMethod;
    if ((getDeployRevisionMethod = ContainerServiceGrpc.getDeployRevisionMethod) == null) {
      synchronized (ContainerServiceGrpc.class) {
        if ((getDeployRevisionMethod = ContainerServiceGrpc.getDeployRevisionMethod) == null) {
          ContainerServiceGrpc.getDeployRevisionMethod = getDeployRevisionMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.DeployContainerRevisionRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.serverless.containers.v1.ContainerService", "DeployRevision"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.DeployContainerRevisionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new ContainerServiceMethodDescriptorSupplier("DeployRevision"))
                  .build();
          }
        }
     }
     return getDeployRevisionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.RollbackContainerRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRollbackMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Rollback",
      requestType = yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.RollbackContainerRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.RollbackContainerRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRollbackMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.RollbackContainerRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getRollbackMethod;
    if ((getRollbackMethod = ContainerServiceGrpc.getRollbackMethod) == null) {
      synchronized (ContainerServiceGrpc.class) {
        if ((getRollbackMethod = ContainerServiceGrpc.getRollbackMethod) == null) {
          ContainerServiceGrpc.getRollbackMethod = getRollbackMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.RollbackContainerRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.serverless.containers.v1.ContainerService", "Rollback"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.RollbackContainerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new ContainerServiceMethodDescriptorSupplier("Rollback"))
                  .build();
          }
        }
     }
     return getRollbackMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.GetContainerRevisionRequest,
      yandex.cloud.api.serverless.containers.v1.ContainerOuterClass.Revision> getGetRevisionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRevision",
      requestType = yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.GetContainerRevisionRequest.class,
      responseType = yandex.cloud.api.serverless.containers.v1.ContainerOuterClass.Revision.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.GetContainerRevisionRequest,
      yandex.cloud.api.serverless.containers.v1.ContainerOuterClass.Revision> getGetRevisionMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.GetContainerRevisionRequest, yandex.cloud.api.serverless.containers.v1.ContainerOuterClass.Revision> getGetRevisionMethod;
    if ((getGetRevisionMethod = ContainerServiceGrpc.getGetRevisionMethod) == null) {
      synchronized (ContainerServiceGrpc.class) {
        if ((getGetRevisionMethod = ContainerServiceGrpc.getGetRevisionMethod) == null) {
          ContainerServiceGrpc.getGetRevisionMethod = getGetRevisionMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.GetContainerRevisionRequest, yandex.cloud.api.serverless.containers.v1.ContainerOuterClass.Revision>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.serverless.containers.v1.ContainerService", "GetRevision"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.GetContainerRevisionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.containers.v1.ContainerOuterClass.Revision.getDefaultInstance()))
                  .setSchemaDescriptor(new ContainerServiceMethodDescriptorSupplier("GetRevision"))
                  .build();
          }
        }
     }
     return getGetRevisionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.ListContainersRevisionsRequest,
      yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.ListContainersRevisionsResponse> getListRevisionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListRevisions",
      requestType = yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.ListContainersRevisionsRequest.class,
      responseType = yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.ListContainersRevisionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.ListContainersRevisionsRequest,
      yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.ListContainersRevisionsResponse> getListRevisionsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.ListContainersRevisionsRequest, yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.ListContainersRevisionsResponse> getListRevisionsMethod;
    if ((getListRevisionsMethod = ContainerServiceGrpc.getListRevisionsMethod) == null) {
      synchronized (ContainerServiceGrpc.class) {
        if ((getListRevisionsMethod = ContainerServiceGrpc.getListRevisionsMethod) == null) {
          ContainerServiceGrpc.getListRevisionsMethod = getListRevisionsMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.ListContainersRevisionsRequest, yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.ListContainersRevisionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.serverless.containers.v1.ContainerService", "ListRevisions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.ListContainersRevisionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.ListContainersRevisionsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ContainerServiceMethodDescriptorSupplier("ListRevisions"))
                  .build();
          }
        }
     }
     return getListRevisionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.ListContainerOperationsRequest,
      yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.ListContainerOperationsResponse> getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.ListContainerOperationsRequest.class,
      responseType = yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.ListContainerOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.ListContainerOperationsRequest,
      yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.ListContainerOperationsResponse> getListOperationsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.ListContainerOperationsRequest, yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.ListContainerOperationsResponse> getListOperationsMethod;
    if ((getListOperationsMethod = ContainerServiceGrpc.getListOperationsMethod) == null) {
      synchronized (ContainerServiceGrpc.class) {
        if ((getListOperationsMethod = ContainerServiceGrpc.getListOperationsMethod) == null) {
          ContainerServiceGrpc.getListOperationsMethod = getListOperationsMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.ListContainerOperationsRequest, yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.ListContainerOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.serverless.containers.v1.ContainerService", "ListOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.ListContainerOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.ListContainerOperationsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ContainerServiceMethodDescriptorSupplier("ListOperations"))
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
    if ((getListAccessBindingsMethod = ContainerServiceGrpc.getListAccessBindingsMethod) == null) {
      synchronized (ContainerServiceGrpc.class) {
        if ((getListAccessBindingsMethod = ContainerServiceGrpc.getListAccessBindingsMethod) == null) {
          ContainerServiceGrpc.getListAccessBindingsMethod = getListAccessBindingsMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.ListAccessBindingsRequest, yandex.cloud.api.access.Access.ListAccessBindingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.serverless.containers.v1.ContainerService", "ListAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.ListAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.ListAccessBindingsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ContainerServiceMethodDescriptorSupplier("ListAccessBindings"))
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
    if ((getSetAccessBindingsMethod = ContainerServiceGrpc.getSetAccessBindingsMethod) == null) {
      synchronized (ContainerServiceGrpc.class) {
        if ((getSetAccessBindingsMethod = ContainerServiceGrpc.getSetAccessBindingsMethod) == null) {
          ContainerServiceGrpc.getSetAccessBindingsMethod = getSetAccessBindingsMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.SetAccessBindingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.serverless.containers.v1.ContainerService", "SetAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.SetAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new ContainerServiceMethodDescriptorSupplier("SetAccessBindings"))
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
    if ((getUpdateAccessBindingsMethod = ContainerServiceGrpc.getUpdateAccessBindingsMethod) == null) {
      synchronized (ContainerServiceGrpc.class) {
        if ((getUpdateAccessBindingsMethod = ContainerServiceGrpc.getUpdateAccessBindingsMethod) == null) {
          ContainerServiceGrpc.getUpdateAccessBindingsMethod = getUpdateAccessBindingsMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.UpdateAccessBindingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.serverless.containers.v1.ContainerService", "UpdateAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.UpdateAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new ContainerServiceMethodDescriptorSupplier("UpdateAccessBindings"))
                  .build();
          }
        }
     }
     return getUpdateAccessBindingsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ContainerServiceStub newStub(io.grpc.Channel channel) {
    return new ContainerServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ContainerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ContainerServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ContainerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ContainerServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ContainerServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void get(yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.GetContainerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.containers.v1.ContainerOuterClass.Container> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     */
    public void list(yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.ListContainersRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.ListContainersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     */
    public void create(yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.CreateContainerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    public void update(yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.UpdateContainerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     */
    public void delete(yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.DeleteContainerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     */
    public void deployRevision(yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.DeployContainerRevisionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getDeployRevisionMethod(), responseObserver);
    }

    /**
     */
    public void rollback(yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.RollbackContainerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getRollbackMethod(), responseObserver);
    }

    /**
     */
    public void getRevision(yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.GetContainerRevisionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.containers.v1.ContainerOuterClass.Revision> responseObserver) {
      asyncUnimplementedUnaryCall(getGetRevisionMethod(), responseObserver);
    }

    /**
     */
    public void listRevisions(yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.ListContainersRevisionsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.ListContainersRevisionsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListRevisionsMethod(), responseObserver);
    }

    /**
     */
    public void listOperations(yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.ListContainerOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.ListContainerOperationsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    /**
     */
    public void listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.access.Access.ListAccessBindingsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListAccessBindingsMethod(), responseObserver);
    }

    /**
     */
    public void setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getSetAccessBindingsMethod(), responseObserver);
    }

    /**
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
                yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.GetContainerRequest,
                yandex.cloud.api.serverless.containers.v1.ContainerOuterClass.Container>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.ListContainersRequest,
                yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.ListContainersResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.CreateContainerRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.UpdateContainerRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.DeleteContainerRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getDeployRevisionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.DeployContainerRevisionRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DEPLOY_REVISION)))
          .addMethod(
            getRollbackMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.RollbackContainerRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_ROLLBACK)))
          .addMethod(
            getGetRevisionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.GetContainerRevisionRequest,
                yandex.cloud.api.serverless.containers.v1.ContainerOuterClass.Revision>(
                  this, METHODID_GET_REVISION)))
          .addMethod(
            getListRevisionsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.ListContainersRevisionsRequest,
                yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.ListContainersRevisionsResponse>(
                  this, METHODID_LIST_REVISIONS)))
          .addMethod(
            getListOperationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.ListContainerOperationsRequest,
                yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.ListContainerOperationsResponse>(
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
   */
  public static final class ContainerServiceStub extends io.grpc.stub.AbstractStub<ContainerServiceStub> {
    private ContainerServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ContainerServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContainerServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ContainerServiceStub(channel, callOptions);
    }

    /**
     */
    public void get(yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.GetContainerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.containers.v1.ContainerOuterClass.Container> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void list(yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.ListContainersRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.ListContainersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void create(yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.CreateContainerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void update(yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.UpdateContainerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.DeleteContainerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deployRevision(yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.DeployContainerRevisionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeployRevisionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rollback(yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.RollbackContainerRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRollbackMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRevision(yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.GetContainerRevisionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.containers.v1.ContainerOuterClass.Revision> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetRevisionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listRevisions(yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.ListContainersRevisionsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.ListContainersRevisionsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListRevisionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listOperations(yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.ListContainerOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.ListContainerOperationsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.access.Access.ListAccessBindingsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateAccessBindings(yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ContainerServiceBlockingStub extends io.grpc.stub.AbstractStub<ContainerServiceBlockingStub> {
    private ContainerServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ContainerServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContainerServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ContainerServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public yandex.cloud.api.serverless.containers.v1.ContainerOuterClass.Container get(yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.GetContainerRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.ListContainersResponse list(yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.ListContainersRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.CreateContainerRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.UpdateContainerRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.DeleteContainerRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation deployRevision(yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.DeployContainerRevisionRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeployRevisionMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation rollback(yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.RollbackContainerRequest request) {
      return blockingUnaryCall(
          getChannel(), getRollbackMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.serverless.containers.v1.ContainerOuterClass.Revision getRevision(yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.GetContainerRevisionRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetRevisionMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.ListContainersRevisionsResponse listRevisions(yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.ListContainersRevisionsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListRevisionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.ListContainerOperationsResponse listOperations(yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.ListContainerOperationsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.access.Access.ListAccessBindingsResponse listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListAccessBindingsMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetAccessBindingsMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation updateAccessBindings(yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateAccessBindingsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ContainerServiceFutureStub extends io.grpc.stub.AbstractStub<ContainerServiceFutureStub> {
    private ContainerServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ContainerServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContainerServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ContainerServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.serverless.containers.v1.ContainerOuterClass.Container> get(
        yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.GetContainerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.ListContainersResponse> list(
        yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.ListContainersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.CreateContainerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.UpdateContainerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.DeleteContainerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> deployRevision(
        yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.DeployContainerRevisionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeployRevisionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> rollback(
        yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.RollbackContainerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRollbackMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.serverless.containers.v1.ContainerOuterClass.Revision> getRevision(
        yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.GetContainerRevisionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetRevisionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.ListContainersRevisionsResponse> listRevisions(
        yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.ListContainersRevisionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListRevisionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.ListContainerOperationsResponse> listOperations(
        yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.ListContainerOperationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.access.Access.ListAccessBindingsResponse> listAccessBindings(
        yandex.cloud.api.access.Access.ListAccessBindingsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListAccessBindingsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> setAccessBindings(
        yandex.cloud.api.access.Access.SetAccessBindingsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetAccessBindingsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> updateAccessBindings(
        yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateAccessBindingsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_DELETE = 4;
  private static final int METHODID_DEPLOY_REVISION = 5;
  private static final int METHODID_ROLLBACK = 6;
  private static final int METHODID_GET_REVISION = 7;
  private static final int METHODID_LIST_REVISIONS = 8;
  private static final int METHODID_LIST_OPERATIONS = 9;
  private static final int METHODID_LIST_ACCESS_BINDINGS = 10;
  private static final int METHODID_SET_ACCESS_BINDINGS = 11;
  private static final int METHODID_UPDATE_ACCESS_BINDINGS = 12;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ContainerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ContainerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.GetContainerRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.containers.v1.ContainerOuterClass.Container>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.ListContainersRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.ListContainersResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.CreateContainerRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.UpdateContainerRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.DeleteContainerRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DEPLOY_REVISION:
          serviceImpl.deployRevision((yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.DeployContainerRevisionRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_ROLLBACK:
          serviceImpl.rollback((yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.RollbackContainerRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_GET_REVISION:
          serviceImpl.getRevision((yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.GetContainerRevisionRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.containers.v1.ContainerOuterClass.Revision>) responseObserver);
          break;
        case METHODID_LIST_REVISIONS:
          serviceImpl.listRevisions((yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.ListContainersRevisionsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.ListContainersRevisionsResponse>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.ListContainerOperationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.ListContainerOperationsResponse>) responseObserver);
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

  private static abstract class ContainerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ContainerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.serverless.containers.v1.ContainerServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ContainerService");
    }
  }

  private static final class ContainerServiceFileDescriptorSupplier
      extends ContainerServiceBaseDescriptorSupplier {
    ContainerServiceFileDescriptorSupplier() {}
  }

  private static final class ContainerServiceMethodDescriptorSupplier
      extends ContainerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ContainerServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ContainerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ContainerServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getDeployRevisionMethod())
              .addMethod(getRollbackMethod())
              .addMethod(getGetRevisionMethod())
              .addMethod(getListRevisionsMethod())
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
