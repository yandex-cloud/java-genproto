package yandex.cloud.api.serverless.mdbproxy.v1;

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
 * A set of methods for managing serverless MDB proxy.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.0)",
    comments = "Source: yandex/cloud/serverless/mdbproxy/v1/proxy_service.proto")
public final class ProxyServiceGrpc {

  private ProxyServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.serverless.mdbproxy.v1.ProxyService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.GetProxyRequest,
      yandex.cloud.api.serverless.mdbproxy.v1.ProxyOuterClass.Proxy> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.GetProxyRequest.class,
      responseType = yandex.cloud.api.serverless.mdbproxy.v1.ProxyOuterClass.Proxy.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.GetProxyRequest,
      yandex.cloud.api.serverless.mdbproxy.v1.ProxyOuterClass.Proxy> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.GetProxyRequest, yandex.cloud.api.serverless.mdbproxy.v1.ProxyOuterClass.Proxy> getGetMethod;
    if ((getGetMethod = ProxyServiceGrpc.getGetMethod) == null) {
      synchronized (ProxyServiceGrpc.class) {
        if ((getGetMethod = ProxyServiceGrpc.getGetMethod) == null) {
          ProxyServiceGrpc.getGetMethod = getGetMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.GetProxyRequest, yandex.cloud.api.serverless.mdbproxy.v1.ProxyOuterClass.Proxy>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.serverless.mdbproxy.v1.ProxyService", "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.GetProxyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.mdbproxy.v1.ProxyOuterClass.Proxy.getDefaultInstance()))
                  .setSchemaDescriptor(new ProxyServiceMethodDescriptorSupplier("Get"))
                  .build();
          }
        }
     }
     return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.ListProxyRequest,
      yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.ListProxyResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.ListProxyRequest.class,
      responseType = yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.ListProxyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.ListProxyRequest,
      yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.ListProxyResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.ListProxyRequest, yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.ListProxyResponse> getListMethod;
    if ((getListMethod = ProxyServiceGrpc.getListMethod) == null) {
      synchronized (ProxyServiceGrpc.class) {
        if ((getListMethod = ProxyServiceGrpc.getListMethod) == null) {
          ProxyServiceGrpc.getListMethod = getListMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.ListProxyRequest, yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.ListProxyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.serverless.mdbproxy.v1.ProxyService", "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.ListProxyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.ListProxyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ProxyServiceMethodDescriptorSupplier("List"))
                  .build();
          }
        }
     }
     return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.CreateProxyRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.CreateProxyRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.CreateProxyRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.CreateProxyRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = ProxyServiceGrpc.getCreateMethod) == null) {
      synchronized (ProxyServiceGrpc.class) {
        if ((getCreateMethod = ProxyServiceGrpc.getCreateMethod) == null) {
          ProxyServiceGrpc.getCreateMethod = getCreateMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.CreateProxyRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.serverless.mdbproxy.v1.ProxyService", "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.CreateProxyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new ProxyServiceMethodDescriptorSupplier("Create"))
                  .build();
          }
        }
     }
     return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.UpdateProxyRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.UpdateProxyRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.UpdateProxyRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.UpdateProxyRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = ProxyServiceGrpc.getUpdateMethod) == null) {
      synchronized (ProxyServiceGrpc.class) {
        if ((getUpdateMethod = ProxyServiceGrpc.getUpdateMethod) == null) {
          ProxyServiceGrpc.getUpdateMethod = getUpdateMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.UpdateProxyRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.serverless.mdbproxy.v1.ProxyService", "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.UpdateProxyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new ProxyServiceMethodDescriptorSupplier("Update"))
                  .build();
          }
        }
     }
     return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.DeleteProxyRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.DeleteProxyRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.DeleteProxyRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.DeleteProxyRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = ProxyServiceGrpc.getDeleteMethod) == null) {
      synchronized (ProxyServiceGrpc.class) {
        if ((getDeleteMethod = ProxyServiceGrpc.getDeleteMethod) == null) {
          ProxyServiceGrpc.getDeleteMethod = getDeleteMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.DeleteProxyRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.serverless.mdbproxy.v1.ProxyService", "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.DeleteProxyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new ProxyServiceMethodDescriptorSupplier("Delete"))
                  .build();
          }
        }
     }
     return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.ListProxyOperationsRequest,
      yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.ListProxyOperationsResponse> getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.ListProxyOperationsRequest.class,
      responseType = yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.ListProxyOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.ListProxyOperationsRequest,
      yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.ListProxyOperationsResponse> getListOperationsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.ListProxyOperationsRequest, yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.ListProxyOperationsResponse> getListOperationsMethod;
    if ((getListOperationsMethod = ProxyServiceGrpc.getListOperationsMethod) == null) {
      synchronized (ProxyServiceGrpc.class) {
        if ((getListOperationsMethod = ProxyServiceGrpc.getListOperationsMethod) == null) {
          ProxyServiceGrpc.getListOperationsMethod = getListOperationsMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.ListProxyOperationsRequest, yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.ListProxyOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.serverless.mdbproxy.v1.ProxyService", "ListOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.ListProxyOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.ListProxyOperationsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ProxyServiceMethodDescriptorSupplier("ListOperations"))
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
    if ((getListAccessBindingsMethod = ProxyServiceGrpc.getListAccessBindingsMethod) == null) {
      synchronized (ProxyServiceGrpc.class) {
        if ((getListAccessBindingsMethod = ProxyServiceGrpc.getListAccessBindingsMethod) == null) {
          ProxyServiceGrpc.getListAccessBindingsMethod = getListAccessBindingsMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.ListAccessBindingsRequest, yandex.cloud.api.access.Access.ListAccessBindingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.serverless.mdbproxy.v1.ProxyService", "ListAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.ListAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.ListAccessBindingsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ProxyServiceMethodDescriptorSupplier("ListAccessBindings"))
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
    if ((getSetAccessBindingsMethod = ProxyServiceGrpc.getSetAccessBindingsMethod) == null) {
      synchronized (ProxyServiceGrpc.class) {
        if ((getSetAccessBindingsMethod = ProxyServiceGrpc.getSetAccessBindingsMethod) == null) {
          ProxyServiceGrpc.getSetAccessBindingsMethod = getSetAccessBindingsMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.SetAccessBindingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.serverless.mdbproxy.v1.ProxyService", "SetAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.SetAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new ProxyServiceMethodDescriptorSupplier("SetAccessBindings"))
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
    if ((getUpdateAccessBindingsMethod = ProxyServiceGrpc.getUpdateAccessBindingsMethod) == null) {
      synchronized (ProxyServiceGrpc.class) {
        if ((getUpdateAccessBindingsMethod = ProxyServiceGrpc.getUpdateAccessBindingsMethod) == null) {
          ProxyServiceGrpc.getUpdateAccessBindingsMethod = getUpdateAccessBindingsMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.UpdateAccessBindingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.serverless.mdbproxy.v1.ProxyService", "UpdateAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.UpdateAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new ProxyServiceMethodDescriptorSupplier("UpdateAccessBindings"))
                  .build();
          }
        }
     }
     return getUpdateAccessBindingsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProxyServiceStub newStub(io.grpc.Channel channel) {
    return new ProxyServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProxyServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ProxyServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProxyServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ProxyServiceFutureStub(channel);
  }

  /**
   * <pre>
   * A set of methods for managing serverless MDB proxy.
   * </pre>
   */
  public static abstract class ProxyServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified proxy.
     * To get the list of all available proxies, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.GetProxyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.mdbproxy.v1.ProxyOuterClass.Proxy> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of proxies in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.ListProxyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.ListProxyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a proxy in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.CreateProxyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified proxy.
     * </pre>
     */
    public void update(yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.UpdateProxyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified proxy.
     * </pre>
     */
    public void delete(yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.DeleteProxyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified proxy.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.ListProxyOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.ListProxyOperationsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists existing access bindings for the specified proxy.
     * </pre>
     */
    public void listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.access.Access.ListAccessBindingsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListAccessBindingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sets access bindings for the proxy.
     * </pre>
     */
    public void setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getSetAccessBindingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates access bindings for the specified proxy.
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
                yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.GetProxyRequest,
                yandex.cloud.api.serverless.mdbproxy.v1.ProxyOuterClass.Proxy>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.ListProxyRequest,
                yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.ListProxyResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.CreateProxyRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.UpdateProxyRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.DeleteProxyRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListOperationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.ListProxyOperationsRequest,
                yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.ListProxyOperationsResponse>(
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
   * A set of methods for managing serverless MDB proxy.
   * </pre>
   */
  public static final class ProxyServiceStub extends io.grpc.stub.AbstractStub<ProxyServiceStub> {
    private ProxyServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProxyServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProxyServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProxyServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified proxy.
     * To get the list of all available proxies, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.GetProxyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.mdbproxy.v1.ProxyOuterClass.Proxy> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of proxies in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.ListProxyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.ListProxyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a proxy in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.CreateProxyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified proxy.
     * </pre>
     */
    public void update(yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.UpdateProxyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified proxy.
     * </pre>
     */
    public void delete(yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.DeleteProxyRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified proxy.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.ListProxyOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.ListProxyOperationsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists existing access bindings for the specified proxy.
     * </pre>
     */
    public void listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.access.Access.ListAccessBindingsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sets access bindings for the proxy.
     * </pre>
     */
    public void setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates access bindings for the specified proxy.
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
   * A set of methods for managing serverless MDB proxy.
   * </pre>
   */
  public static final class ProxyServiceBlockingStub extends io.grpc.stub.AbstractStub<ProxyServiceBlockingStub> {
    private ProxyServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProxyServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProxyServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProxyServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified proxy.
     * To get the list of all available proxies, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.serverless.mdbproxy.v1.ProxyOuterClass.Proxy get(yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.GetProxyRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of proxies in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.ListProxyResponse list(yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.ListProxyRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a proxy in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.CreateProxyRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified proxy.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.UpdateProxyRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified proxy.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.DeleteProxyRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists operations for the specified proxy.
     * </pre>
     */
    public yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.ListProxyOperationsResponse listOperations(yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.ListProxyOperationsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists existing access bindings for the specified proxy.
     * </pre>
     */
    public yandex.cloud.api.access.Access.ListAccessBindingsResponse listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListAccessBindingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets access bindings for the proxy.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetAccessBindingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates access bindings for the specified proxy.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation updateAccessBindings(yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateAccessBindingsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing serverless MDB proxy.
   * </pre>
   */
  public static final class ProxyServiceFutureStub extends io.grpc.stub.AbstractStub<ProxyServiceFutureStub> {
    private ProxyServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProxyServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProxyServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProxyServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified proxy.
     * To get the list of all available proxies, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.serverless.mdbproxy.v1.ProxyOuterClass.Proxy> get(
        yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.GetProxyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of proxies in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.ListProxyResponse> list(
        yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.ListProxyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a proxy in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.CreateProxyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified proxy.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.UpdateProxyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified proxy.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.DeleteProxyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists operations for the specified proxy.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.ListProxyOperationsResponse> listOperations(
        yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.ListProxyOperationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists existing access bindings for the specified proxy.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.access.Access.ListAccessBindingsResponse> listAccessBindings(
        yandex.cloud.api.access.Access.ListAccessBindingsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListAccessBindingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sets access bindings for the proxy.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> setAccessBindings(
        yandex.cloud.api.access.Access.SetAccessBindingsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetAccessBindingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates access bindings for the specified proxy.
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
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_DELETE = 4;
  private static final int METHODID_LIST_OPERATIONS = 5;
  private static final int METHODID_LIST_ACCESS_BINDINGS = 6;
  private static final int METHODID_SET_ACCESS_BINDINGS = 7;
  private static final int METHODID_UPDATE_ACCESS_BINDINGS = 8;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProxyServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProxyServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.GetProxyRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.mdbproxy.v1.ProxyOuterClass.Proxy>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.ListProxyRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.ListProxyResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.CreateProxyRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.UpdateProxyRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.DeleteProxyRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.ListProxyOperationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.ListProxyOperationsResponse>) responseObserver);
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

  private static abstract class ProxyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProxyServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.serverless.mdbproxy.v1.ProxyServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProxyService");
    }
  }

  private static final class ProxyServiceFileDescriptorSupplier
      extends ProxyServiceBaseDescriptorSupplier {
    ProxyServiceFileDescriptorSupplier() {}
  }

  private static final class ProxyServiceMethodDescriptorSupplier
      extends ProxyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProxyServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ProxyServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProxyServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
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
