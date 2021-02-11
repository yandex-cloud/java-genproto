package yandex.cloud.api.containerregistry.v1;

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
 * A set of methods for managing Repository resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.0)",
    comments = "Source: yandex/cloud/containerregistry/v1/repository_service.proto")
public final class RepositoryServiceGrpc {

  private RepositoryServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.containerregistry.v1.RepositoryService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.RepositoryServiceOuterClass.GetRepositoryRequest,
      yandex.cloud.api.containerregistry.v1.RepositoryOuterClass.Repository> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.containerregistry.v1.RepositoryServiceOuterClass.GetRepositoryRequest.class,
      responseType = yandex.cloud.api.containerregistry.v1.RepositoryOuterClass.Repository.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.RepositoryServiceOuterClass.GetRepositoryRequest,
      yandex.cloud.api.containerregistry.v1.RepositoryOuterClass.Repository> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.RepositoryServiceOuterClass.GetRepositoryRequest, yandex.cloud.api.containerregistry.v1.RepositoryOuterClass.Repository> getGetMethod;
    if ((getGetMethod = RepositoryServiceGrpc.getGetMethod) == null) {
      synchronized (RepositoryServiceGrpc.class) {
        if ((getGetMethod = RepositoryServiceGrpc.getGetMethod) == null) {
          RepositoryServiceGrpc.getGetMethod = getGetMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.containerregistry.v1.RepositoryServiceOuterClass.GetRepositoryRequest, yandex.cloud.api.containerregistry.v1.RepositoryOuterClass.Repository>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.containerregistry.v1.RepositoryService", "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.containerregistry.v1.RepositoryServiceOuterClass.GetRepositoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.containerregistry.v1.RepositoryOuterClass.Repository.getDefaultInstance()))
                  .setSchemaDescriptor(new RepositoryServiceMethodDescriptorSupplier("Get"))
                  .build();
          }
        }
     }
     return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.RepositoryServiceOuterClass.GetRepositoryByNameRequest,
      yandex.cloud.api.containerregistry.v1.RepositoryOuterClass.Repository> getGetByNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetByName",
      requestType = yandex.cloud.api.containerregistry.v1.RepositoryServiceOuterClass.GetRepositoryByNameRequest.class,
      responseType = yandex.cloud.api.containerregistry.v1.RepositoryOuterClass.Repository.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.RepositoryServiceOuterClass.GetRepositoryByNameRequest,
      yandex.cloud.api.containerregistry.v1.RepositoryOuterClass.Repository> getGetByNameMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.RepositoryServiceOuterClass.GetRepositoryByNameRequest, yandex.cloud.api.containerregistry.v1.RepositoryOuterClass.Repository> getGetByNameMethod;
    if ((getGetByNameMethod = RepositoryServiceGrpc.getGetByNameMethod) == null) {
      synchronized (RepositoryServiceGrpc.class) {
        if ((getGetByNameMethod = RepositoryServiceGrpc.getGetByNameMethod) == null) {
          RepositoryServiceGrpc.getGetByNameMethod = getGetByNameMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.containerregistry.v1.RepositoryServiceOuterClass.GetRepositoryByNameRequest, yandex.cloud.api.containerregistry.v1.RepositoryOuterClass.Repository>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.containerregistry.v1.RepositoryService", "GetByName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.containerregistry.v1.RepositoryServiceOuterClass.GetRepositoryByNameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.containerregistry.v1.RepositoryOuterClass.Repository.getDefaultInstance()))
                  .setSchemaDescriptor(new RepositoryServiceMethodDescriptorSupplier("GetByName"))
                  .build();
          }
        }
     }
     return getGetByNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.RepositoryServiceOuterClass.ListRepositoriesRequest,
      yandex.cloud.api.containerregistry.v1.RepositoryServiceOuterClass.ListRepositoriesResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.containerregistry.v1.RepositoryServiceOuterClass.ListRepositoriesRequest.class,
      responseType = yandex.cloud.api.containerregistry.v1.RepositoryServiceOuterClass.ListRepositoriesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.RepositoryServiceOuterClass.ListRepositoriesRequest,
      yandex.cloud.api.containerregistry.v1.RepositoryServiceOuterClass.ListRepositoriesResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.RepositoryServiceOuterClass.ListRepositoriesRequest, yandex.cloud.api.containerregistry.v1.RepositoryServiceOuterClass.ListRepositoriesResponse> getListMethod;
    if ((getListMethod = RepositoryServiceGrpc.getListMethod) == null) {
      synchronized (RepositoryServiceGrpc.class) {
        if ((getListMethod = RepositoryServiceGrpc.getListMethod) == null) {
          RepositoryServiceGrpc.getListMethod = getListMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.containerregistry.v1.RepositoryServiceOuterClass.ListRepositoriesRequest, yandex.cloud.api.containerregistry.v1.RepositoryServiceOuterClass.ListRepositoriesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.containerregistry.v1.RepositoryService", "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.containerregistry.v1.RepositoryServiceOuterClass.ListRepositoriesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.containerregistry.v1.RepositoryServiceOuterClass.ListRepositoriesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RepositoryServiceMethodDescriptorSupplier("List"))
                  .build();
          }
        }
     }
     return getListMethod;
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
    if ((getListAccessBindingsMethod = RepositoryServiceGrpc.getListAccessBindingsMethod) == null) {
      synchronized (RepositoryServiceGrpc.class) {
        if ((getListAccessBindingsMethod = RepositoryServiceGrpc.getListAccessBindingsMethod) == null) {
          RepositoryServiceGrpc.getListAccessBindingsMethod = getListAccessBindingsMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.ListAccessBindingsRequest, yandex.cloud.api.access.Access.ListAccessBindingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.containerregistry.v1.RepositoryService", "ListAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.ListAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.ListAccessBindingsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RepositoryServiceMethodDescriptorSupplier("ListAccessBindings"))
                  .build();
          }
        }
     }
     return getListAccessBindingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.RepositoryServiceOuterClass.UpsertRepositoryRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpsertMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Upsert",
      requestType = yandex.cloud.api.containerregistry.v1.RepositoryServiceOuterClass.UpsertRepositoryRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.RepositoryServiceOuterClass.UpsertRepositoryRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpsertMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.RepositoryServiceOuterClass.UpsertRepositoryRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpsertMethod;
    if ((getUpsertMethod = RepositoryServiceGrpc.getUpsertMethod) == null) {
      synchronized (RepositoryServiceGrpc.class) {
        if ((getUpsertMethod = RepositoryServiceGrpc.getUpsertMethod) == null) {
          RepositoryServiceGrpc.getUpsertMethod = getUpsertMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.containerregistry.v1.RepositoryServiceOuterClass.UpsertRepositoryRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.containerregistry.v1.RepositoryService", "Upsert"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.containerregistry.v1.RepositoryServiceOuterClass.UpsertRepositoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new RepositoryServiceMethodDescriptorSupplier("Upsert"))
                  .build();
          }
        }
     }
     return getUpsertMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.RepositoryServiceOuterClass.DeleteRepositoryRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.containerregistry.v1.RepositoryServiceOuterClass.DeleteRepositoryRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.RepositoryServiceOuterClass.DeleteRepositoryRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.RepositoryServiceOuterClass.DeleteRepositoryRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = RepositoryServiceGrpc.getDeleteMethod) == null) {
      synchronized (RepositoryServiceGrpc.class) {
        if ((getDeleteMethod = RepositoryServiceGrpc.getDeleteMethod) == null) {
          RepositoryServiceGrpc.getDeleteMethod = getDeleteMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.containerregistry.v1.RepositoryServiceOuterClass.DeleteRepositoryRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.containerregistry.v1.RepositoryService", "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.containerregistry.v1.RepositoryServiceOuterClass.DeleteRepositoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new RepositoryServiceMethodDescriptorSupplier("Delete"))
                  .build();
          }
        }
     }
     return getDeleteMethod;
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
    if ((getSetAccessBindingsMethod = RepositoryServiceGrpc.getSetAccessBindingsMethod) == null) {
      synchronized (RepositoryServiceGrpc.class) {
        if ((getSetAccessBindingsMethod = RepositoryServiceGrpc.getSetAccessBindingsMethod) == null) {
          RepositoryServiceGrpc.getSetAccessBindingsMethod = getSetAccessBindingsMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.SetAccessBindingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.containerregistry.v1.RepositoryService", "SetAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.SetAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new RepositoryServiceMethodDescriptorSupplier("SetAccessBindings"))
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
    if ((getUpdateAccessBindingsMethod = RepositoryServiceGrpc.getUpdateAccessBindingsMethod) == null) {
      synchronized (RepositoryServiceGrpc.class) {
        if ((getUpdateAccessBindingsMethod = RepositoryServiceGrpc.getUpdateAccessBindingsMethod) == null) {
          RepositoryServiceGrpc.getUpdateAccessBindingsMethod = getUpdateAccessBindingsMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.UpdateAccessBindingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.containerregistry.v1.RepositoryService", "UpdateAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.UpdateAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new RepositoryServiceMethodDescriptorSupplier("UpdateAccessBindings"))
                  .build();
          }
        }
     }
     return getUpdateAccessBindingsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RepositoryServiceStub newStub(io.grpc.Channel channel) {
    return new RepositoryServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RepositoryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RepositoryServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RepositoryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RepositoryServiceFutureStub(channel);
  }

  /**
   * <pre>
   * A set of methods for managing Repository resources.
   * </pre>
   */
  public static abstract class RepositoryServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified Repository resource.
     * To get the list of available Repository resources, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.containerregistry.v1.RepositoryServiceOuterClass.GetRepositoryRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.containerregistry.v1.RepositoryOuterClass.Repository> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the specified Repository resource.
     * To get the list of available Repository resources, make a [List] request.
     * </pre>
     */
    public void getByName(yandex.cloud.api.containerregistry.v1.RepositoryServiceOuterClass.GetRepositoryByNameRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.containerregistry.v1.RepositoryOuterClass.Repository> responseObserver) {
      asyncUnimplementedUnaryCall(getGetByNameMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of Repository resources in the specified registry.
     * </pre>
     */
    public void list(yandex.cloud.api.containerregistry.v1.RepositoryServiceOuterClass.ListRepositoriesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.containerregistry.v1.RepositoryServiceOuterClass.ListRepositoriesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists access bindings for the specified repository.
     * </pre>
     */
    public void listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.access.Access.ListAccessBindingsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListAccessBindingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Upserts a repository in the specified registry.
     * </pre>
     */
    public void upsert(yandex.cloud.api.containerregistry.v1.RepositoryServiceOuterClass.UpsertRepositoryRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getUpsertMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified repository.
     * </pre>
     */
    public void delete(yandex.cloud.api.containerregistry.v1.RepositoryServiceOuterClass.DeleteRepositoryRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sets access bindings for the specified repository.
     * </pre>
     */
    public void setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getSetAccessBindingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates access bindings for the specified repository.
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
                yandex.cloud.api.containerregistry.v1.RepositoryServiceOuterClass.GetRepositoryRequest,
                yandex.cloud.api.containerregistry.v1.RepositoryOuterClass.Repository>(
                  this, METHODID_GET)))
          .addMethod(
            getGetByNameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.containerregistry.v1.RepositoryServiceOuterClass.GetRepositoryByNameRequest,
                yandex.cloud.api.containerregistry.v1.RepositoryOuterClass.Repository>(
                  this, METHODID_GET_BY_NAME)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.containerregistry.v1.RepositoryServiceOuterClass.ListRepositoriesRequest,
                yandex.cloud.api.containerregistry.v1.RepositoryServiceOuterClass.ListRepositoriesResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getListAccessBindingsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.access.Access.ListAccessBindingsRequest,
                yandex.cloud.api.access.Access.ListAccessBindingsResponse>(
                  this, METHODID_LIST_ACCESS_BINDINGS)))
          .addMethod(
            getUpsertMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.containerregistry.v1.RepositoryServiceOuterClass.UpsertRepositoryRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPSERT)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.containerregistry.v1.RepositoryServiceOuterClass.DeleteRepositoryRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
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
   * A set of methods for managing Repository resources.
   * </pre>
   */
  public static final class RepositoryServiceStub extends io.grpc.stub.AbstractStub<RepositoryServiceStub> {
    private RepositoryServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RepositoryServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RepositoryServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RepositoryServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified Repository resource.
     * To get the list of available Repository resources, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.containerregistry.v1.RepositoryServiceOuterClass.GetRepositoryRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.containerregistry.v1.RepositoryOuterClass.Repository> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the specified Repository resource.
     * To get the list of available Repository resources, make a [List] request.
     * </pre>
     */
    public void getByName(yandex.cloud.api.containerregistry.v1.RepositoryServiceOuterClass.GetRepositoryByNameRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.containerregistry.v1.RepositoryOuterClass.Repository> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetByNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of Repository resources in the specified registry.
     * </pre>
     */
    public void list(yandex.cloud.api.containerregistry.v1.RepositoryServiceOuterClass.ListRepositoriesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.containerregistry.v1.RepositoryServiceOuterClass.ListRepositoriesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists access bindings for the specified repository.
     * </pre>
     */
    public void listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.access.Access.ListAccessBindingsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Upserts a repository in the specified registry.
     * </pre>
     */
    public void upsert(yandex.cloud.api.containerregistry.v1.RepositoryServiceOuterClass.UpsertRepositoryRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpsertMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified repository.
     * </pre>
     */
    public void delete(yandex.cloud.api.containerregistry.v1.RepositoryServiceOuterClass.DeleteRepositoryRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sets access bindings for the specified repository.
     * </pre>
     */
    public void setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates access bindings for the specified repository.
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
   * A set of methods for managing Repository resources.
   * </pre>
   */
  public static final class RepositoryServiceBlockingStub extends io.grpc.stub.AbstractStub<RepositoryServiceBlockingStub> {
    private RepositoryServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RepositoryServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RepositoryServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RepositoryServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified Repository resource.
     * To get the list of available Repository resources, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.containerregistry.v1.RepositoryOuterClass.Repository get(yandex.cloud.api.containerregistry.v1.RepositoryServiceOuterClass.GetRepositoryRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the specified Repository resource.
     * To get the list of available Repository resources, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.containerregistry.v1.RepositoryOuterClass.Repository getByName(yandex.cloud.api.containerregistry.v1.RepositoryServiceOuterClass.GetRepositoryByNameRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetByNameMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of Repository resources in the specified registry.
     * </pre>
     */
    public yandex.cloud.api.containerregistry.v1.RepositoryServiceOuterClass.ListRepositoriesResponse list(yandex.cloud.api.containerregistry.v1.RepositoryServiceOuterClass.ListRepositoriesRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists access bindings for the specified repository.
     * </pre>
     */
    public yandex.cloud.api.access.Access.ListAccessBindingsResponse listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListAccessBindingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Upserts a repository in the specified registry.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation upsert(yandex.cloud.api.containerregistry.v1.RepositoryServiceOuterClass.UpsertRepositoryRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpsertMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified repository.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.containerregistry.v1.RepositoryServiceOuterClass.DeleteRepositoryRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets access bindings for the specified repository.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetAccessBindingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates access bindings for the specified repository.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation updateAccessBindings(yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateAccessBindingsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Repository resources.
   * </pre>
   */
  public static final class RepositoryServiceFutureStub extends io.grpc.stub.AbstractStub<RepositoryServiceFutureStub> {
    private RepositoryServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RepositoryServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RepositoryServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RepositoryServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified Repository resource.
     * To get the list of available Repository resources, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.containerregistry.v1.RepositoryOuterClass.Repository> get(
        yandex.cloud.api.containerregistry.v1.RepositoryServiceOuterClass.GetRepositoryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the specified Repository resource.
     * To get the list of available Repository resources, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.containerregistry.v1.RepositoryOuterClass.Repository> getByName(
        yandex.cloud.api.containerregistry.v1.RepositoryServiceOuterClass.GetRepositoryByNameRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetByNameMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of Repository resources in the specified registry.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.containerregistry.v1.RepositoryServiceOuterClass.ListRepositoriesResponse> list(
        yandex.cloud.api.containerregistry.v1.RepositoryServiceOuterClass.ListRepositoriesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists access bindings for the specified repository.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.access.Access.ListAccessBindingsResponse> listAccessBindings(
        yandex.cloud.api.access.Access.ListAccessBindingsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListAccessBindingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Upserts a repository in the specified registry.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> upsert(
        yandex.cloud.api.containerregistry.v1.RepositoryServiceOuterClass.UpsertRepositoryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpsertMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified repository.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.containerregistry.v1.RepositoryServiceOuterClass.DeleteRepositoryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sets access bindings for the specified repository.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> setAccessBindings(
        yandex.cloud.api.access.Access.SetAccessBindingsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetAccessBindingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates access bindings for the specified repository.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> updateAccessBindings(
        yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateAccessBindingsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_GET_BY_NAME = 1;
  private static final int METHODID_LIST = 2;
  private static final int METHODID_LIST_ACCESS_BINDINGS = 3;
  private static final int METHODID_UPSERT = 4;
  private static final int METHODID_DELETE = 5;
  private static final int METHODID_SET_ACCESS_BINDINGS = 6;
  private static final int METHODID_UPDATE_ACCESS_BINDINGS = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RepositoryServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RepositoryServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.containerregistry.v1.RepositoryServiceOuterClass.GetRepositoryRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.containerregistry.v1.RepositoryOuterClass.Repository>) responseObserver);
          break;
        case METHODID_GET_BY_NAME:
          serviceImpl.getByName((yandex.cloud.api.containerregistry.v1.RepositoryServiceOuterClass.GetRepositoryByNameRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.containerregistry.v1.RepositoryOuterClass.Repository>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.containerregistry.v1.RepositoryServiceOuterClass.ListRepositoriesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.containerregistry.v1.RepositoryServiceOuterClass.ListRepositoriesResponse>) responseObserver);
          break;
        case METHODID_LIST_ACCESS_BINDINGS:
          serviceImpl.listAccessBindings((yandex.cloud.api.access.Access.ListAccessBindingsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.access.Access.ListAccessBindingsResponse>) responseObserver);
          break;
        case METHODID_UPSERT:
          serviceImpl.upsert((yandex.cloud.api.containerregistry.v1.RepositoryServiceOuterClass.UpsertRepositoryRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.containerregistry.v1.RepositoryServiceOuterClass.DeleteRepositoryRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
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

  private static abstract class RepositoryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RepositoryServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.containerregistry.v1.RepositoryServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RepositoryService");
    }
  }

  private static final class RepositoryServiceFileDescriptorSupplier
      extends RepositoryServiceBaseDescriptorSupplier {
    RepositoryServiceFileDescriptorSupplier() {}
  }

  private static final class RepositoryServiceMethodDescriptorSupplier
      extends RepositoryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RepositoryServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (RepositoryServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RepositoryServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getGetByNameMethod())
              .addMethod(getListMethod())
              .addMethod(getListAccessBindingsMethod())
              .addMethod(getUpsertMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getSetAccessBindingsMethod())
              .addMethod(getUpdateAccessBindingsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
