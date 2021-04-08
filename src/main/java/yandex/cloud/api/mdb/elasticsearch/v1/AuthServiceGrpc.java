package yandex.cloud.api.mdb.elasticsearch.v1;

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
 * A set of methods for managing Elasticsearch Authentication resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.0)",
    comments = "Source: yandex/cloud/mdb/elasticsearch/v1/auth_service.proto")
public final class AuthServiceGrpc {

  private AuthServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.mdb.elasticsearch.v1.AuthService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.ListAuthProvidersRequest,
      yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.ListAuthProvidersResponse> getListProvidersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListProviders",
      requestType = yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.ListAuthProvidersRequest.class,
      responseType = yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.ListAuthProvidersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.ListAuthProvidersRequest,
      yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.ListAuthProvidersResponse> getListProvidersMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.ListAuthProvidersRequest, yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.ListAuthProvidersResponse> getListProvidersMethod;
    if ((getListProvidersMethod = AuthServiceGrpc.getListProvidersMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getListProvidersMethod = AuthServiceGrpc.getListProvidersMethod) == null) {
          AuthServiceGrpc.getListProvidersMethod = getListProvidersMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.ListAuthProvidersRequest, yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.ListAuthProvidersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.mdb.elasticsearch.v1.AuthService", "ListProviders"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.ListAuthProvidersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.ListAuthProvidersResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("ListProviders"))
                  .build();
          }
        }
     }
     return getListProvidersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.GetAuthProviderRequest,
      yandex.cloud.api.mdb.elasticsearch.v1.Auth.AuthProvider> getGetProviderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProvider",
      requestType = yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.GetAuthProviderRequest.class,
      responseType = yandex.cloud.api.mdb.elasticsearch.v1.Auth.AuthProvider.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.GetAuthProviderRequest,
      yandex.cloud.api.mdb.elasticsearch.v1.Auth.AuthProvider> getGetProviderMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.GetAuthProviderRequest, yandex.cloud.api.mdb.elasticsearch.v1.Auth.AuthProvider> getGetProviderMethod;
    if ((getGetProviderMethod = AuthServiceGrpc.getGetProviderMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getGetProviderMethod = AuthServiceGrpc.getGetProviderMethod) == null) {
          AuthServiceGrpc.getGetProviderMethod = getGetProviderMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.GetAuthProviderRequest, yandex.cloud.api.mdb.elasticsearch.v1.Auth.AuthProvider>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.mdb.elasticsearch.v1.AuthService", "GetProvider"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.GetAuthProviderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.elasticsearch.v1.Auth.AuthProvider.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("GetProvider"))
                  .build();
          }
        }
     }
     return getGetProviderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.AddAuthProvidersRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getAddProvidersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddProviders",
      requestType = yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.AddAuthProvidersRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.AddAuthProvidersRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getAddProvidersMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.AddAuthProvidersRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getAddProvidersMethod;
    if ((getAddProvidersMethod = AuthServiceGrpc.getAddProvidersMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getAddProvidersMethod = AuthServiceGrpc.getAddProvidersMethod) == null) {
          AuthServiceGrpc.getAddProvidersMethod = getAddProvidersMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.AddAuthProvidersRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.mdb.elasticsearch.v1.AuthService", "AddProviders"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.AddAuthProvidersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("AddProviders"))
                  .build();
          }
        }
     }
     return getAddProvidersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.UpdateAuthProvidersRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateProvidersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateProviders",
      requestType = yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.UpdateAuthProvidersRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.UpdateAuthProvidersRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateProvidersMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.UpdateAuthProvidersRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateProvidersMethod;
    if ((getUpdateProvidersMethod = AuthServiceGrpc.getUpdateProvidersMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getUpdateProvidersMethod = AuthServiceGrpc.getUpdateProvidersMethod) == null) {
          AuthServiceGrpc.getUpdateProvidersMethod = getUpdateProvidersMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.UpdateAuthProvidersRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.mdb.elasticsearch.v1.AuthService", "UpdateProviders"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.UpdateAuthProvidersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("UpdateProviders"))
                  .build();
          }
        }
     }
     return getUpdateProvidersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.DeleteAuthProvidersRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteProvidersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteProviders",
      requestType = yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.DeleteAuthProvidersRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.DeleteAuthProvidersRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteProvidersMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.DeleteAuthProvidersRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteProvidersMethod;
    if ((getDeleteProvidersMethod = AuthServiceGrpc.getDeleteProvidersMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getDeleteProvidersMethod = AuthServiceGrpc.getDeleteProvidersMethod) == null) {
          AuthServiceGrpc.getDeleteProvidersMethod = getDeleteProvidersMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.DeleteAuthProvidersRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.mdb.elasticsearch.v1.AuthService", "DeleteProviders"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.DeleteAuthProvidersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("DeleteProviders"))
                  .build();
          }
        }
     }
     return getDeleteProvidersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.UpdateAuthProviderRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateProviderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateProvider",
      requestType = yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.UpdateAuthProviderRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.UpdateAuthProviderRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateProviderMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.UpdateAuthProviderRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateProviderMethod;
    if ((getUpdateProviderMethod = AuthServiceGrpc.getUpdateProviderMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getUpdateProviderMethod = AuthServiceGrpc.getUpdateProviderMethod) == null) {
          AuthServiceGrpc.getUpdateProviderMethod = getUpdateProviderMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.UpdateAuthProviderRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.mdb.elasticsearch.v1.AuthService", "UpdateProvider"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.UpdateAuthProviderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("UpdateProvider"))
                  .build();
          }
        }
     }
     return getUpdateProviderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.DeleteAuthProviderRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteProviderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteProvider",
      requestType = yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.DeleteAuthProviderRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.DeleteAuthProviderRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteProviderMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.DeleteAuthProviderRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteProviderMethod;
    if ((getDeleteProviderMethod = AuthServiceGrpc.getDeleteProviderMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getDeleteProviderMethod = AuthServiceGrpc.getDeleteProviderMethod) == null) {
          AuthServiceGrpc.getDeleteProviderMethod = getDeleteProviderMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.DeleteAuthProviderRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.mdb.elasticsearch.v1.AuthService", "DeleteProvider"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.DeleteAuthProviderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("DeleteProvider"))
                  .build();
          }
        }
     }
     return getDeleteProviderMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AuthServiceStub newStub(io.grpc.Channel channel) {
    return new AuthServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AuthServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AuthServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AuthServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AuthServiceFutureStub(channel);
  }

  /**
   * <pre>
   * A set of methods for managing Elasticsearch Authentication resources.
   * </pre>
   */
  public static abstract class AuthServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Retrieves the list of registered auth providers for Elasticsearch cluster.
     * </pre>
     */
    public void listProviders(yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.ListAuthProvidersRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.ListAuthProvidersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListProvidersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns registered auth provider by name.
     * </pre>
     */
    public void getProvider(yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.GetAuthProviderRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.elasticsearch.v1.Auth.AuthProvider> responseObserver) {
      asyncUnimplementedUnaryCall(getGetProviderMethod(), responseObserver);
    }

    /**
     * <pre>
     * Adds new auth providers to Elasticsearch cluster.
     * </pre>
     */
    public void addProviders(yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.AddAuthProvidersRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getAddProvidersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Replase the list of auth providers.
     * </pre>
     */
    public void updateProviders(yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.UpdateAuthProvidersRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateProvidersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Removes auth providers from Elasticsearch cluster by name.
     * </pre>
     */
    public void deleteProviders(yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.DeleteAuthProvidersRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteProvidersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates registered auth provider.
     * </pre>
     */
    public void updateProvider(yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.UpdateAuthProviderRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateProviderMethod(), responseObserver);
    }

    /**
     * <pre>
     * Removes auth provider from Elasticsearch cluster by name.
     * </pre>
     */
    public void deleteProvider(yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.DeleteAuthProviderRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteProviderMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListProvidersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.ListAuthProvidersRequest,
                yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.ListAuthProvidersResponse>(
                  this, METHODID_LIST_PROVIDERS)))
          .addMethod(
            getGetProviderMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.GetAuthProviderRequest,
                yandex.cloud.api.mdb.elasticsearch.v1.Auth.AuthProvider>(
                  this, METHODID_GET_PROVIDER)))
          .addMethod(
            getAddProvidersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.AddAuthProvidersRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_ADD_PROVIDERS)))
          .addMethod(
            getUpdateProvidersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.UpdateAuthProvidersRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE_PROVIDERS)))
          .addMethod(
            getDeleteProvidersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.DeleteAuthProvidersRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE_PROVIDERS)))
          .addMethod(
            getUpdateProviderMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.UpdateAuthProviderRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE_PROVIDER)))
          .addMethod(
            getDeleteProviderMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.DeleteAuthProviderRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE_PROVIDER)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing Elasticsearch Authentication resources.
   * </pre>
   */
  public static final class AuthServiceStub extends io.grpc.stub.AbstractStub<AuthServiceStub> {
    private AuthServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuthServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuthServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves the list of registered auth providers for Elasticsearch cluster.
     * </pre>
     */
    public void listProviders(yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.ListAuthProvidersRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.ListAuthProvidersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListProvidersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns registered auth provider by name.
     * </pre>
     */
    public void getProvider(yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.GetAuthProviderRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.elasticsearch.v1.Auth.AuthProvider> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetProviderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Adds new auth providers to Elasticsearch cluster.
     * </pre>
     */
    public void addProviders(yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.AddAuthProvidersRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddProvidersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Replase the list of auth providers.
     * </pre>
     */
    public void updateProviders(yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.UpdateAuthProvidersRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateProvidersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Removes auth providers from Elasticsearch cluster by name.
     * </pre>
     */
    public void deleteProviders(yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.DeleteAuthProvidersRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteProvidersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates registered auth provider.
     * </pre>
     */
    public void updateProvider(yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.UpdateAuthProviderRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateProviderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Removes auth provider from Elasticsearch cluster by name.
     * </pre>
     */
    public void deleteProvider(yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.DeleteAuthProviderRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteProviderMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Elasticsearch Authentication resources.
   * </pre>
   */
  public static final class AuthServiceBlockingStub extends io.grpc.stub.AbstractStub<AuthServiceBlockingStub> {
    private AuthServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuthServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuthServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves the list of registered auth providers for Elasticsearch cluster.
     * </pre>
     */
    public yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.ListAuthProvidersResponse listProviders(yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.ListAuthProvidersRequest request) {
      return blockingUnaryCall(
          getChannel(), getListProvidersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns registered auth provider by name.
     * </pre>
     */
    public yandex.cloud.api.mdb.elasticsearch.v1.Auth.AuthProvider getProvider(yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.GetAuthProviderRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetProviderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Adds new auth providers to Elasticsearch cluster.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation addProviders(yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.AddAuthProvidersRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddProvidersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Replase the list of auth providers.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation updateProviders(yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.UpdateAuthProvidersRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateProvidersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Removes auth providers from Elasticsearch cluster by name.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation deleteProviders(yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.DeleteAuthProvidersRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteProvidersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates registered auth provider.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation updateProvider(yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.UpdateAuthProviderRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateProviderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Removes auth provider from Elasticsearch cluster by name.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation deleteProvider(yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.DeleteAuthProviderRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteProviderMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Elasticsearch Authentication resources.
   * </pre>
   */
  public static final class AuthServiceFutureStub extends io.grpc.stub.AbstractStub<AuthServiceFutureStub> {
    private AuthServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuthServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuthServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves the list of registered auth providers for Elasticsearch cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.ListAuthProvidersResponse> listProviders(
        yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.ListAuthProvidersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListProvidersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns registered auth provider by name.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.mdb.elasticsearch.v1.Auth.AuthProvider> getProvider(
        yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.GetAuthProviderRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetProviderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Adds new auth providers to Elasticsearch cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> addProviders(
        yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.AddAuthProvidersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddProvidersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Replase the list of auth providers.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> updateProviders(
        yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.UpdateAuthProvidersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateProvidersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Removes auth providers from Elasticsearch cluster by name.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> deleteProviders(
        yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.DeleteAuthProvidersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteProvidersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates registered auth provider.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> updateProvider(
        yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.UpdateAuthProviderRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateProviderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Removes auth provider from Elasticsearch cluster by name.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> deleteProvider(
        yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.DeleteAuthProviderRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteProviderMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_PROVIDERS = 0;
  private static final int METHODID_GET_PROVIDER = 1;
  private static final int METHODID_ADD_PROVIDERS = 2;
  private static final int METHODID_UPDATE_PROVIDERS = 3;
  private static final int METHODID_DELETE_PROVIDERS = 4;
  private static final int METHODID_UPDATE_PROVIDER = 5;
  private static final int METHODID_DELETE_PROVIDER = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AuthServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AuthServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_PROVIDERS:
          serviceImpl.listProviders((yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.ListAuthProvidersRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.ListAuthProvidersResponse>) responseObserver);
          break;
        case METHODID_GET_PROVIDER:
          serviceImpl.getProvider((yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.GetAuthProviderRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.elasticsearch.v1.Auth.AuthProvider>) responseObserver);
          break;
        case METHODID_ADD_PROVIDERS:
          serviceImpl.addProviders((yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.AddAuthProvidersRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE_PROVIDERS:
          serviceImpl.updateProviders((yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.UpdateAuthProvidersRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE_PROVIDERS:
          serviceImpl.deleteProviders((yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.DeleteAuthProvidersRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE_PROVIDER:
          serviceImpl.updateProvider((yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.UpdateAuthProviderRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE_PROVIDER:
          serviceImpl.deleteProvider((yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.DeleteAuthProviderRequest) request,
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

  private static abstract class AuthServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AuthServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.mdb.elasticsearch.v1.AuthServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AuthService");
    }
  }

  private static final class AuthServiceFileDescriptorSupplier
      extends AuthServiceBaseDescriptorSupplier {
    AuthServiceFileDescriptorSupplier() {}
  }

  private static final class AuthServiceMethodDescriptorSupplier
      extends AuthServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AuthServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AuthServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AuthServiceFileDescriptorSupplier())
              .addMethod(getListProvidersMethod())
              .addMethod(getGetProviderMethod())
              .addMethod(getAddProvidersMethod())
              .addMethod(getUpdateProvidersMethod())
              .addMethod(getDeleteProvidersMethod())
              .addMethod(getUpdateProviderMethod())
              .addMethod(getDeleteProviderMethod())
              .build();
        }
      }
    }
    return result;
  }
}
