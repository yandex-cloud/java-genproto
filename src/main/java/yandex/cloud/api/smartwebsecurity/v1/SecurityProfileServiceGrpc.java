package yandex.cloud.api.smartwebsecurity.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing SecurityProfile resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/smartwebsecurity/v1/security_profile_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SecurityProfileServiceGrpc {

  private SecurityProfileServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.smartwebsecurity.v1.SecurityProfileService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.smartwebsecurity.v1.SecurityProfileServiceOuterClass.GetSecurityProfileRequest,
      yandex.cloud.api.smartwebsecurity.v1.SecurityProfileOuterClass.SecurityProfile> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.smartwebsecurity.v1.SecurityProfileServiceOuterClass.GetSecurityProfileRequest.class,
      responseType = yandex.cloud.api.smartwebsecurity.v1.SecurityProfileOuterClass.SecurityProfile.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.smartwebsecurity.v1.SecurityProfileServiceOuterClass.GetSecurityProfileRequest,
      yandex.cloud.api.smartwebsecurity.v1.SecurityProfileOuterClass.SecurityProfile> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.smartwebsecurity.v1.SecurityProfileServiceOuterClass.GetSecurityProfileRequest, yandex.cloud.api.smartwebsecurity.v1.SecurityProfileOuterClass.SecurityProfile> getGetMethod;
    if ((getGetMethod = SecurityProfileServiceGrpc.getGetMethod) == null) {
      synchronized (SecurityProfileServiceGrpc.class) {
        if ((getGetMethod = SecurityProfileServiceGrpc.getGetMethod) == null) {
          SecurityProfileServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.smartwebsecurity.v1.SecurityProfileServiceOuterClass.GetSecurityProfileRequest, yandex.cloud.api.smartwebsecurity.v1.SecurityProfileOuterClass.SecurityProfile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.smartwebsecurity.v1.SecurityProfileServiceOuterClass.GetSecurityProfileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.smartwebsecurity.v1.SecurityProfileOuterClass.SecurityProfile.getDefaultInstance()))
              .setSchemaDescriptor(new SecurityProfileServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.smartwebsecurity.v1.SecurityProfileServiceOuterClass.ListSecurityProfilesRequest,
      yandex.cloud.api.smartwebsecurity.v1.SecurityProfileServiceOuterClass.ListSecurityProfilesResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.smartwebsecurity.v1.SecurityProfileServiceOuterClass.ListSecurityProfilesRequest.class,
      responseType = yandex.cloud.api.smartwebsecurity.v1.SecurityProfileServiceOuterClass.ListSecurityProfilesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.smartwebsecurity.v1.SecurityProfileServiceOuterClass.ListSecurityProfilesRequest,
      yandex.cloud.api.smartwebsecurity.v1.SecurityProfileServiceOuterClass.ListSecurityProfilesResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.smartwebsecurity.v1.SecurityProfileServiceOuterClass.ListSecurityProfilesRequest, yandex.cloud.api.smartwebsecurity.v1.SecurityProfileServiceOuterClass.ListSecurityProfilesResponse> getListMethod;
    if ((getListMethod = SecurityProfileServiceGrpc.getListMethod) == null) {
      synchronized (SecurityProfileServiceGrpc.class) {
        if ((getListMethod = SecurityProfileServiceGrpc.getListMethod) == null) {
          SecurityProfileServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.smartwebsecurity.v1.SecurityProfileServiceOuterClass.ListSecurityProfilesRequest, yandex.cloud.api.smartwebsecurity.v1.SecurityProfileServiceOuterClass.ListSecurityProfilesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.smartwebsecurity.v1.SecurityProfileServiceOuterClass.ListSecurityProfilesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.smartwebsecurity.v1.SecurityProfileServiceOuterClass.ListSecurityProfilesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SecurityProfileServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.smartwebsecurity.v1.SecurityProfileServiceOuterClass.CreateSecurityProfileRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.smartwebsecurity.v1.SecurityProfileServiceOuterClass.CreateSecurityProfileRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.smartwebsecurity.v1.SecurityProfileServiceOuterClass.CreateSecurityProfileRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.smartwebsecurity.v1.SecurityProfileServiceOuterClass.CreateSecurityProfileRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = SecurityProfileServiceGrpc.getCreateMethod) == null) {
      synchronized (SecurityProfileServiceGrpc.class) {
        if ((getCreateMethod = SecurityProfileServiceGrpc.getCreateMethod) == null) {
          SecurityProfileServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.smartwebsecurity.v1.SecurityProfileServiceOuterClass.CreateSecurityProfileRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.smartwebsecurity.v1.SecurityProfileServiceOuterClass.CreateSecurityProfileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new SecurityProfileServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.smartwebsecurity.v1.SecurityProfileServiceOuterClass.UpdateSecurityProfileRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.smartwebsecurity.v1.SecurityProfileServiceOuterClass.UpdateSecurityProfileRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.smartwebsecurity.v1.SecurityProfileServiceOuterClass.UpdateSecurityProfileRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.smartwebsecurity.v1.SecurityProfileServiceOuterClass.UpdateSecurityProfileRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = SecurityProfileServiceGrpc.getUpdateMethod) == null) {
      synchronized (SecurityProfileServiceGrpc.class) {
        if ((getUpdateMethod = SecurityProfileServiceGrpc.getUpdateMethod) == null) {
          SecurityProfileServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.smartwebsecurity.v1.SecurityProfileServiceOuterClass.UpdateSecurityProfileRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.smartwebsecurity.v1.SecurityProfileServiceOuterClass.UpdateSecurityProfileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new SecurityProfileServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.smartwebsecurity.v1.SecurityProfileServiceOuterClass.DeleteSecurityProfileRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.smartwebsecurity.v1.SecurityProfileServiceOuterClass.DeleteSecurityProfileRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.smartwebsecurity.v1.SecurityProfileServiceOuterClass.DeleteSecurityProfileRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.smartwebsecurity.v1.SecurityProfileServiceOuterClass.DeleteSecurityProfileRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = SecurityProfileServiceGrpc.getDeleteMethod) == null) {
      synchronized (SecurityProfileServiceGrpc.class) {
        if ((getDeleteMethod = SecurityProfileServiceGrpc.getDeleteMethod) == null) {
          SecurityProfileServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.smartwebsecurity.v1.SecurityProfileServiceOuterClass.DeleteSecurityProfileRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.smartwebsecurity.v1.SecurityProfileServiceOuterClass.DeleteSecurityProfileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new SecurityProfileServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SecurityProfileServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SecurityProfileServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SecurityProfileServiceStub>() {
        @java.lang.Override
        public SecurityProfileServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SecurityProfileServiceStub(channel, callOptions);
        }
      };
    return SecurityProfileServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SecurityProfileServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SecurityProfileServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SecurityProfileServiceBlockingStub>() {
        @java.lang.Override
        public SecurityProfileServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SecurityProfileServiceBlockingStub(channel, callOptions);
        }
      };
    return SecurityProfileServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SecurityProfileServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SecurityProfileServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SecurityProfileServiceFutureStub>() {
        @java.lang.Override
        public SecurityProfileServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SecurityProfileServiceFutureStub(channel, callOptions);
        }
      };
    return SecurityProfileServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing SecurityProfile resources.
   * </pre>
   */
  public static abstract class SecurityProfileServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified SecurityProfile resource.
     * </pre>
     */
    public void get(yandex.cloud.api.smartwebsecurity.v1.SecurityProfileServiceOuterClass.GetSecurityProfileRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.smartwebsecurity.v1.SecurityProfileOuterClass.SecurityProfile> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of SecurityProfile resources in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.smartwebsecurity.v1.SecurityProfileServiceOuterClass.ListSecurityProfilesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.smartwebsecurity.v1.SecurityProfileServiceOuterClass.ListSecurityProfilesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a security profile in the specified folder using the data specified in the request.
     * </pre>
     */
    public void create(yandex.cloud.api.smartwebsecurity.v1.SecurityProfileServiceOuterClass.CreateSecurityProfileRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified security profile.
     * </pre>
     */
    public void update(yandex.cloud.api.smartwebsecurity.v1.SecurityProfileServiceOuterClass.UpdateSecurityProfileRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified security profile.
     * </pre>
     */
    public void delete(yandex.cloud.api.smartwebsecurity.v1.SecurityProfileServiceOuterClass.DeleteSecurityProfileRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.smartwebsecurity.v1.SecurityProfileServiceOuterClass.GetSecurityProfileRequest,
                yandex.cloud.api.smartwebsecurity.v1.SecurityProfileOuterClass.SecurityProfile>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.smartwebsecurity.v1.SecurityProfileServiceOuterClass.ListSecurityProfilesRequest,
                yandex.cloud.api.smartwebsecurity.v1.SecurityProfileServiceOuterClass.ListSecurityProfilesResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.smartwebsecurity.v1.SecurityProfileServiceOuterClass.CreateSecurityProfileRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.smartwebsecurity.v1.SecurityProfileServiceOuterClass.UpdateSecurityProfileRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.smartwebsecurity.v1.SecurityProfileServiceOuterClass.DeleteSecurityProfileRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing SecurityProfile resources.
   * </pre>
   */
  public static final class SecurityProfileServiceStub extends io.grpc.stub.AbstractAsyncStub<SecurityProfileServiceStub> {
    private SecurityProfileServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SecurityProfileServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SecurityProfileServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified SecurityProfile resource.
     * </pre>
     */
    public void get(yandex.cloud.api.smartwebsecurity.v1.SecurityProfileServiceOuterClass.GetSecurityProfileRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.smartwebsecurity.v1.SecurityProfileOuterClass.SecurityProfile> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of SecurityProfile resources in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.smartwebsecurity.v1.SecurityProfileServiceOuterClass.ListSecurityProfilesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.smartwebsecurity.v1.SecurityProfileServiceOuterClass.ListSecurityProfilesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a security profile in the specified folder using the data specified in the request.
     * </pre>
     */
    public void create(yandex.cloud.api.smartwebsecurity.v1.SecurityProfileServiceOuterClass.CreateSecurityProfileRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified security profile.
     * </pre>
     */
    public void update(yandex.cloud.api.smartwebsecurity.v1.SecurityProfileServiceOuterClass.UpdateSecurityProfileRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified security profile.
     * </pre>
     */
    public void delete(yandex.cloud.api.smartwebsecurity.v1.SecurityProfileServiceOuterClass.DeleteSecurityProfileRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing SecurityProfile resources.
   * </pre>
   */
  public static final class SecurityProfileServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<SecurityProfileServiceBlockingStub> {
    private SecurityProfileServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SecurityProfileServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SecurityProfileServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified SecurityProfile resource.
     * </pre>
     */
    public yandex.cloud.api.smartwebsecurity.v1.SecurityProfileOuterClass.SecurityProfile get(yandex.cloud.api.smartwebsecurity.v1.SecurityProfileServiceOuterClass.GetSecurityProfileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of SecurityProfile resources in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.smartwebsecurity.v1.SecurityProfileServiceOuterClass.ListSecurityProfilesResponse list(yandex.cloud.api.smartwebsecurity.v1.SecurityProfileServiceOuterClass.ListSecurityProfilesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a security profile in the specified folder using the data specified in the request.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.smartwebsecurity.v1.SecurityProfileServiceOuterClass.CreateSecurityProfileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified security profile.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.smartwebsecurity.v1.SecurityProfileServiceOuterClass.UpdateSecurityProfileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified security profile.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.smartwebsecurity.v1.SecurityProfileServiceOuterClass.DeleteSecurityProfileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing SecurityProfile resources.
   * </pre>
   */
  public static final class SecurityProfileServiceFutureStub extends io.grpc.stub.AbstractFutureStub<SecurityProfileServiceFutureStub> {
    private SecurityProfileServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SecurityProfileServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SecurityProfileServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified SecurityProfile resource.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.smartwebsecurity.v1.SecurityProfileOuterClass.SecurityProfile> get(
        yandex.cloud.api.smartwebsecurity.v1.SecurityProfileServiceOuterClass.GetSecurityProfileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of SecurityProfile resources in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.smartwebsecurity.v1.SecurityProfileServiceOuterClass.ListSecurityProfilesResponse> list(
        yandex.cloud.api.smartwebsecurity.v1.SecurityProfileServiceOuterClass.ListSecurityProfilesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a security profile in the specified folder using the data specified in the request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.smartwebsecurity.v1.SecurityProfileServiceOuterClass.CreateSecurityProfileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified security profile.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.smartwebsecurity.v1.SecurityProfileServiceOuterClass.UpdateSecurityProfileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified security profile.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.smartwebsecurity.v1.SecurityProfileServiceOuterClass.DeleteSecurityProfileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_DELETE = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SecurityProfileServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SecurityProfileServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.smartwebsecurity.v1.SecurityProfileServiceOuterClass.GetSecurityProfileRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.smartwebsecurity.v1.SecurityProfileOuterClass.SecurityProfile>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.smartwebsecurity.v1.SecurityProfileServiceOuterClass.ListSecurityProfilesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.smartwebsecurity.v1.SecurityProfileServiceOuterClass.ListSecurityProfilesResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.smartwebsecurity.v1.SecurityProfileServiceOuterClass.CreateSecurityProfileRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.smartwebsecurity.v1.SecurityProfileServiceOuterClass.UpdateSecurityProfileRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.smartwebsecurity.v1.SecurityProfileServiceOuterClass.DeleteSecurityProfileRequest) request,
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

  private static abstract class SecurityProfileServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SecurityProfileServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.smartwebsecurity.v1.SecurityProfileServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SecurityProfileService");
    }
  }

  private static final class SecurityProfileServiceFileDescriptorSupplier
      extends SecurityProfileServiceBaseDescriptorSupplier {
    SecurityProfileServiceFileDescriptorSupplier() {}
  }

  private static final class SecurityProfileServiceMethodDescriptorSupplier
      extends SecurityProfileServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SecurityProfileServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SecurityProfileServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SecurityProfileServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
