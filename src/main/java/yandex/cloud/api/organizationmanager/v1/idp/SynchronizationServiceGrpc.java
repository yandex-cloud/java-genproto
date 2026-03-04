package yandex.cloud.api.organizationmanager.v1.idp;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing synchronization settings.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/organizationmanager/v1/idp/synchronization_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SynchronizationServiceGrpc {

  private SynchronizationServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.organizationmanager.v1.idp.SynchronizationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.SetReplicationTokenRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getSetReplicationTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetReplicationToken",
      requestType = yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.SetReplicationTokenRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.SetReplicationTokenRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getSetReplicationTokenMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.SetReplicationTokenRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getSetReplicationTokenMethod;
    if ((getSetReplicationTokenMethod = SynchronizationServiceGrpc.getSetReplicationTokenMethod) == null) {
      synchronized (SynchronizationServiceGrpc.class) {
        if ((getSetReplicationTokenMethod = SynchronizationServiceGrpc.getSetReplicationTokenMethod) == null) {
          SynchronizationServiceGrpc.getSetReplicationTokenMethod = getSetReplicationTokenMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.SetReplicationTokenRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetReplicationToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.SetReplicationTokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new SynchronizationServiceMethodDescriptorSupplier("SetReplicationToken"))
              .build();
        }
      }
    }
    return getSetReplicationTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.ResetReplicationTokenRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getResetReplicationTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResetReplicationToken",
      requestType = yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.ResetReplicationTokenRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.ResetReplicationTokenRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getResetReplicationTokenMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.ResetReplicationTokenRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getResetReplicationTokenMethod;
    if ((getResetReplicationTokenMethod = SynchronizationServiceGrpc.getResetReplicationTokenMethod) == null) {
      synchronized (SynchronizationServiceGrpc.class) {
        if ((getResetReplicationTokenMethod = SynchronizationServiceGrpc.getResetReplicationTokenMethod) == null) {
          SynchronizationServiceGrpc.getResetReplicationTokenMethod = getResetReplicationTokenMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.ResetReplicationTokenRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResetReplicationToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.ResetReplicationTokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new SynchronizationServiceMethodDescriptorSupplier("ResetReplicationToken"))
              .build();
        }
      }
    }
    return getResetReplicationTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.CreateSynchronizationSettingsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateSynchronizationSettingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateSynchronizationSettings",
      requestType = yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.CreateSynchronizationSettingsRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.CreateSynchronizationSettingsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateSynchronizationSettingsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.CreateSynchronizationSettingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateSynchronizationSettingsMethod;
    if ((getCreateSynchronizationSettingsMethod = SynchronizationServiceGrpc.getCreateSynchronizationSettingsMethod) == null) {
      synchronized (SynchronizationServiceGrpc.class) {
        if ((getCreateSynchronizationSettingsMethod = SynchronizationServiceGrpc.getCreateSynchronizationSettingsMethod) == null) {
          SynchronizationServiceGrpc.getCreateSynchronizationSettingsMethod = getCreateSynchronizationSettingsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.CreateSynchronizationSettingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateSynchronizationSettings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.CreateSynchronizationSettingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new SynchronizationServiceMethodDescriptorSupplier("CreateSynchronizationSettings"))
              .build();
        }
      }
    }
    return getCreateSynchronizationSettingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.UpdateSynchronizationSettingsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateSynchronizationSettingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateSynchronizationSettings",
      requestType = yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.UpdateSynchronizationSettingsRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.UpdateSynchronizationSettingsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateSynchronizationSettingsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.UpdateSynchronizationSettingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateSynchronizationSettingsMethod;
    if ((getUpdateSynchronizationSettingsMethod = SynchronizationServiceGrpc.getUpdateSynchronizationSettingsMethod) == null) {
      synchronized (SynchronizationServiceGrpc.class) {
        if ((getUpdateSynchronizationSettingsMethod = SynchronizationServiceGrpc.getUpdateSynchronizationSettingsMethod) == null) {
          SynchronizationServiceGrpc.getUpdateSynchronizationSettingsMethod = getUpdateSynchronizationSettingsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.UpdateSynchronizationSettingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateSynchronizationSettings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.UpdateSynchronizationSettingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new SynchronizationServiceMethodDescriptorSupplier("UpdateSynchronizationSettings"))
              .build();
        }
      }
    }
    return getUpdateSynchronizationSettingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.DeleteSynchronizationSettingsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteSynchronizationSettingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteSynchronizationSettings",
      requestType = yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.DeleteSynchronizationSettingsRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.DeleteSynchronizationSettingsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteSynchronizationSettingsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.DeleteSynchronizationSettingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteSynchronizationSettingsMethod;
    if ((getDeleteSynchronizationSettingsMethod = SynchronizationServiceGrpc.getDeleteSynchronizationSettingsMethod) == null) {
      synchronized (SynchronizationServiceGrpc.class) {
        if ((getDeleteSynchronizationSettingsMethod = SynchronizationServiceGrpc.getDeleteSynchronizationSettingsMethod) == null) {
          SynchronizationServiceGrpc.getDeleteSynchronizationSettingsMethod = getDeleteSynchronizationSettingsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.DeleteSynchronizationSettingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteSynchronizationSettings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.DeleteSynchronizationSettingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new SynchronizationServiceMethodDescriptorSupplier("DeleteSynchronizationSettings"))
              .build();
        }
      }
    }
    return getDeleteSynchronizationSettingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.GetSynchronizationSettingsRequest,
      yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSettingsOuterClass.SynchronizationSettings> getGetSynchronizationSettingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSynchronizationSettings",
      requestType = yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.GetSynchronizationSettingsRequest.class,
      responseType = yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSettingsOuterClass.SynchronizationSettings.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.GetSynchronizationSettingsRequest,
      yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSettingsOuterClass.SynchronizationSettings> getGetSynchronizationSettingsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.GetSynchronizationSettingsRequest, yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSettingsOuterClass.SynchronizationSettings> getGetSynchronizationSettingsMethod;
    if ((getGetSynchronizationSettingsMethod = SynchronizationServiceGrpc.getGetSynchronizationSettingsMethod) == null) {
      synchronized (SynchronizationServiceGrpc.class) {
        if ((getGetSynchronizationSettingsMethod = SynchronizationServiceGrpc.getGetSynchronizationSettingsMethod) == null) {
          SynchronizationServiceGrpc.getGetSynchronizationSettingsMethod = getGetSynchronizationSettingsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.GetSynchronizationSettingsRequest, yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSettingsOuterClass.SynchronizationSettings>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSynchronizationSettings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.GetSynchronizationSettingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSettingsOuterClass.SynchronizationSettings.getDefaultInstance()))
              .setSchemaDescriptor(new SynchronizationServiceMethodDescriptorSupplier("GetSynchronizationSettings"))
              .build();
        }
      }
    }
    return getGetSynchronizationSettingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.ListSupportedAttributesRequest,
      yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.ListSupportedAttributesResponse> getListSupportedAttributesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSupportedAttributes",
      requestType = yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.ListSupportedAttributesRequest.class,
      responseType = yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.ListSupportedAttributesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.ListSupportedAttributesRequest,
      yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.ListSupportedAttributesResponse> getListSupportedAttributesMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.ListSupportedAttributesRequest, yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.ListSupportedAttributesResponse> getListSupportedAttributesMethod;
    if ((getListSupportedAttributesMethod = SynchronizationServiceGrpc.getListSupportedAttributesMethod) == null) {
      synchronized (SynchronizationServiceGrpc.class) {
        if ((getListSupportedAttributesMethod = SynchronizationServiceGrpc.getListSupportedAttributesMethod) == null) {
          SynchronizationServiceGrpc.getListSupportedAttributesMethod = getListSupportedAttributesMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.ListSupportedAttributesRequest, yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.ListSupportedAttributesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListSupportedAttributes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.ListSupportedAttributesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.ListSupportedAttributesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SynchronizationServiceMethodDescriptorSupplier("ListSupportedAttributes"))
              .build();
        }
      }
    }
    return getListSupportedAttributesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SynchronizationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SynchronizationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SynchronizationServiceStub>() {
        @java.lang.Override
        public SynchronizationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SynchronizationServiceStub(channel, callOptions);
        }
      };
    return SynchronizationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SynchronizationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SynchronizationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SynchronizationServiceBlockingStub>() {
        @java.lang.Override
        public SynchronizationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SynchronizationServiceBlockingStub(channel, callOptions);
        }
      };
    return SynchronizationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SynchronizationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SynchronizationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SynchronizationServiceFutureStub>() {
        @java.lang.Override
        public SynchronizationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SynchronizationServiceFutureStub(channel, callOptions);
        }
      };
    return SynchronizationServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing synchronization settings.
   * </pre>
   */
  public static abstract class SynchronizationServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Sets the replication token for synchronization.
     * </pre>
     */
    public void setReplicationToken(yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.SetReplicationTokenRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetReplicationTokenMethod(), responseObserver);
    }

    /**
     * <pre>
     * Resets the replication token for synchronization.
     * </pre>
     */
    public void resetReplicationToken(yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.ResetReplicationTokenRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResetReplicationTokenMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates synchronization settings for a subject container.
     * </pre>
     */
    public void createSynchronizationSettings(yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.CreateSynchronizationSettingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateSynchronizationSettingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates synchronization settings for a subject container.
     * </pre>
     */
    public void updateSynchronizationSettings(yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.UpdateSynchronizationSettingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateSynchronizationSettingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes synchronization settings for a subject container.
     * </pre>
     */
    public void deleteSynchronizationSettings(yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.DeleteSynchronizationSettingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteSynchronizationSettingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns synchronization settings for a subject container.
     * </pre>
     */
    public void getSynchronizationSettings(yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.GetSynchronizationSettingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSettingsOuterClass.SynchronizationSettings> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSynchronizationSettingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists supported attributes for synchronization.
     * </pre>
     */
    public void listSupportedAttributes(yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.ListSupportedAttributesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.ListSupportedAttributesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListSupportedAttributesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSetReplicationTokenMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.SetReplicationTokenRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_SET_REPLICATION_TOKEN)))
          .addMethod(
            getResetReplicationTokenMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.ResetReplicationTokenRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_RESET_REPLICATION_TOKEN)))
          .addMethod(
            getCreateSynchronizationSettingsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.CreateSynchronizationSettingsRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE_SYNCHRONIZATION_SETTINGS)))
          .addMethod(
            getUpdateSynchronizationSettingsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.UpdateSynchronizationSettingsRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE_SYNCHRONIZATION_SETTINGS)))
          .addMethod(
            getDeleteSynchronizationSettingsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.DeleteSynchronizationSettingsRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE_SYNCHRONIZATION_SETTINGS)))
          .addMethod(
            getGetSynchronizationSettingsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.GetSynchronizationSettingsRequest,
                yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSettingsOuterClass.SynchronizationSettings>(
                  this, METHODID_GET_SYNCHRONIZATION_SETTINGS)))
          .addMethod(
            getListSupportedAttributesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.ListSupportedAttributesRequest,
                yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.ListSupportedAttributesResponse>(
                  this, METHODID_LIST_SUPPORTED_ATTRIBUTES)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing synchronization settings.
   * </pre>
   */
  public static final class SynchronizationServiceStub extends io.grpc.stub.AbstractAsyncStub<SynchronizationServiceStub> {
    private SynchronizationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SynchronizationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SynchronizationServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sets the replication token for synchronization.
     * </pre>
     */
    public void setReplicationToken(yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.SetReplicationTokenRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetReplicationTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Resets the replication token for synchronization.
     * </pre>
     */
    public void resetReplicationToken(yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.ResetReplicationTokenRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResetReplicationTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates synchronization settings for a subject container.
     * </pre>
     */
    public void createSynchronizationSettings(yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.CreateSynchronizationSettingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateSynchronizationSettingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates synchronization settings for a subject container.
     * </pre>
     */
    public void updateSynchronizationSettings(yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.UpdateSynchronizationSettingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateSynchronizationSettingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes synchronization settings for a subject container.
     * </pre>
     */
    public void deleteSynchronizationSettings(yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.DeleteSynchronizationSettingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteSynchronizationSettingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns synchronization settings for a subject container.
     * </pre>
     */
    public void getSynchronizationSettings(yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.GetSynchronizationSettingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSettingsOuterClass.SynchronizationSettings> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSynchronizationSettingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists supported attributes for synchronization.
     * </pre>
     */
    public void listSupportedAttributes(yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.ListSupportedAttributesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.ListSupportedAttributesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListSupportedAttributesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing synchronization settings.
   * </pre>
   */
  public static final class SynchronizationServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<SynchronizationServiceBlockingStub> {
    private SynchronizationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SynchronizationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SynchronizationServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sets the replication token for synchronization.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation setReplicationToken(yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.SetReplicationTokenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetReplicationTokenMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Resets the replication token for synchronization.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation resetReplicationToken(yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.ResetReplicationTokenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResetReplicationTokenMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates synchronization settings for a subject container.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation createSynchronizationSettings(yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.CreateSynchronizationSettingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateSynchronizationSettingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates synchronization settings for a subject container.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation updateSynchronizationSettings(yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.UpdateSynchronizationSettingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateSynchronizationSettingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes synchronization settings for a subject container.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation deleteSynchronizationSettings(yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.DeleteSynchronizationSettingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteSynchronizationSettingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns synchronization settings for a subject container.
     * </pre>
     */
    public yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSettingsOuterClass.SynchronizationSettings getSynchronizationSettings(yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.GetSynchronizationSettingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSynchronizationSettingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists supported attributes for synchronization.
     * </pre>
     */
    public yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.ListSupportedAttributesResponse listSupportedAttributes(yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.ListSupportedAttributesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListSupportedAttributesMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing synchronization settings.
   * </pre>
   */
  public static final class SynchronizationServiceFutureStub extends io.grpc.stub.AbstractFutureStub<SynchronizationServiceFutureStub> {
    private SynchronizationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SynchronizationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SynchronizationServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sets the replication token for synchronization.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> setReplicationToken(
        yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.SetReplicationTokenRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetReplicationTokenMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Resets the replication token for synchronization.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> resetReplicationToken(
        yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.ResetReplicationTokenRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResetReplicationTokenMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates synchronization settings for a subject container.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> createSynchronizationSettings(
        yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.CreateSynchronizationSettingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateSynchronizationSettingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates synchronization settings for a subject container.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> updateSynchronizationSettings(
        yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.UpdateSynchronizationSettingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateSynchronizationSettingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes synchronization settings for a subject container.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> deleteSynchronizationSettings(
        yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.DeleteSynchronizationSettingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteSynchronizationSettingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns synchronization settings for a subject container.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSettingsOuterClass.SynchronizationSettings> getSynchronizationSettings(
        yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.GetSynchronizationSettingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSynchronizationSettingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists supported attributes for synchronization.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.ListSupportedAttributesResponse> listSupportedAttributes(
        yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.ListSupportedAttributesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListSupportedAttributesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SET_REPLICATION_TOKEN = 0;
  private static final int METHODID_RESET_REPLICATION_TOKEN = 1;
  private static final int METHODID_CREATE_SYNCHRONIZATION_SETTINGS = 2;
  private static final int METHODID_UPDATE_SYNCHRONIZATION_SETTINGS = 3;
  private static final int METHODID_DELETE_SYNCHRONIZATION_SETTINGS = 4;
  private static final int METHODID_GET_SYNCHRONIZATION_SETTINGS = 5;
  private static final int METHODID_LIST_SUPPORTED_ATTRIBUTES = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SynchronizationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SynchronizationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SET_REPLICATION_TOKEN:
          serviceImpl.setReplicationToken((yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.SetReplicationTokenRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_RESET_REPLICATION_TOKEN:
          serviceImpl.resetReplicationToken((yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.ResetReplicationTokenRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_CREATE_SYNCHRONIZATION_SETTINGS:
          serviceImpl.createSynchronizationSettings((yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.CreateSynchronizationSettingsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE_SYNCHRONIZATION_SETTINGS:
          serviceImpl.updateSynchronizationSettings((yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.UpdateSynchronizationSettingsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE_SYNCHRONIZATION_SETTINGS:
          serviceImpl.deleteSynchronizationSettings((yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.DeleteSynchronizationSettingsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_GET_SYNCHRONIZATION_SETTINGS:
          serviceImpl.getSynchronizationSettings((yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.GetSynchronizationSettingsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.idp.SynchronizationSettingsOuterClass.SynchronizationSettings>) responseObserver);
          break;
        case METHODID_LIST_SUPPORTED_ATTRIBUTES:
          serviceImpl.listSupportedAttributes((yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.ListSupportedAttributesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.ListSupportedAttributesResponse>) responseObserver);
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

  private static abstract class SynchronizationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SynchronizationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.organizationmanager.v1.idp.SynchronizationServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SynchronizationService");
    }
  }

  private static final class SynchronizationServiceFileDescriptorSupplier
      extends SynchronizationServiceBaseDescriptorSupplier {
    SynchronizationServiceFileDescriptorSupplier() {}
  }

  private static final class SynchronizationServiceMethodDescriptorSupplier
      extends SynchronizationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SynchronizationServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SynchronizationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SynchronizationServiceFileDescriptorSupplier())
              .addMethod(getSetReplicationTokenMethod())
              .addMethod(getResetReplicationTokenMethod())
              .addMethod(getCreateSynchronizationSettingsMethod())
              .addMethod(getUpdateSynchronizationSettingsMethod())
              .addMethod(getDeleteSynchronizationSettingsMethod())
              .addMethod(getGetSynchronizationSettingsMethod())
              .addMethod(getListSupportedAttributesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
