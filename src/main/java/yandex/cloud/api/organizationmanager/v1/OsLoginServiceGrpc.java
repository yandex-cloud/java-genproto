package yandex.cloud.api.organizationmanager.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/organizationmanager/v1/os_login_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class OsLoginServiceGrpc {

  private OsLoginServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.organizationmanager.v1.OsLoginService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.GetOsLoginSettingsRequest,
      yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.OsLoginSettings> getGetSettingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSettings",
      requestType = yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.GetOsLoginSettingsRequest.class,
      responseType = yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.OsLoginSettings.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.GetOsLoginSettingsRequest,
      yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.OsLoginSettings> getGetSettingsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.GetOsLoginSettingsRequest, yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.OsLoginSettings> getGetSettingsMethod;
    if ((getGetSettingsMethod = OsLoginServiceGrpc.getGetSettingsMethod) == null) {
      synchronized (OsLoginServiceGrpc.class) {
        if ((getGetSettingsMethod = OsLoginServiceGrpc.getGetSettingsMethod) == null) {
          OsLoginServiceGrpc.getGetSettingsMethod = getGetSettingsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.GetOsLoginSettingsRequest, yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.OsLoginSettings>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSettings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.GetOsLoginSettingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.OsLoginSettings.getDefaultInstance()))
              .setSchemaDescriptor(new OsLoginServiceMethodDescriptorSupplier("GetSettings"))
              .build();
        }
      }
    }
    return getGetSettingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.UpdateOsLoginSettingsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateSettingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateSettings",
      requestType = yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.UpdateOsLoginSettingsRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.UpdateOsLoginSettingsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateSettingsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.UpdateOsLoginSettingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateSettingsMethod;
    if ((getUpdateSettingsMethod = OsLoginServiceGrpc.getUpdateSettingsMethod) == null) {
      synchronized (OsLoginServiceGrpc.class) {
        if ((getUpdateSettingsMethod = OsLoginServiceGrpc.getUpdateSettingsMethod) == null) {
          OsLoginServiceGrpc.getUpdateSettingsMethod = getUpdateSettingsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.UpdateOsLoginSettingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateSettings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.UpdateOsLoginSettingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new OsLoginServiceMethodDescriptorSupplier("UpdateSettings"))
              .build();
        }
      }
    }
    return getUpdateSettingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.GetOsLoginProfileRequest,
      yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.OsLoginProfile> getGetProfileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProfile",
      requestType = yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.GetOsLoginProfileRequest.class,
      responseType = yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.OsLoginProfile.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.GetOsLoginProfileRequest,
      yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.OsLoginProfile> getGetProfileMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.GetOsLoginProfileRequest, yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.OsLoginProfile> getGetProfileMethod;
    if ((getGetProfileMethod = OsLoginServiceGrpc.getGetProfileMethod) == null) {
      synchronized (OsLoginServiceGrpc.class) {
        if ((getGetProfileMethod = OsLoginServiceGrpc.getGetProfileMethod) == null) {
          OsLoginServiceGrpc.getGetProfileMethod = getGetProfileMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.GetOsLoginProfileRequest, yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.OsLoginProfile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProfile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.GetOsLoginProfileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.OsLoginProfile.getDefaultInstance()))
              .setSchemaDescriptor(new OsLoginServiceMethodDescriptorSupplier("GetProfile"))
              .build();
        }
      }
    }
    return getGetProfileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.ListOsLoginProfilesRequest,
      yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.ListOsLoginProfilesResponse> getListProfilesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListProfiles",
      requestType = yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.ListOsLoginProfilesRequest.class,
      responseType = yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.ListOsLoginProfilesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.ListOsLoginProfilesRequest,
      yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.ListOsLoginProfilesResponse> getListProfilesMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.ListOsLoginProfilesRequest, yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.ListOsLoginProfilesResponse> getListProfilesMethod;
    if ((getListProfilesMethod = OsLoginServiceGrpc.getListProfilesMethod) == null) {
      synchronized (OsLoginServiceGrpc.class) {
        if ((getListProfilesMethod = OsLoginServiceGrpc.getListProfilesMethod) == null) {
          OsLoginServiceGrpc.getListProfilesMethod = getListProfilesMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.ListOsLoginProfilesRequest, yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.ListOsLoginProfilesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListProfiles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.ListOsLoginProfilesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.ListOsLoginProfilesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OsLoginServiceMethodDescriptorSupplier("ListProfiles"))
              .build();
        }
      }
    }
    return getListProfilesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.CreateOsLoginProfileRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateProfileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateProfile",
      requestType = yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.CreateOsLoginProfileRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.CreateOsLoginProfileRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateProfileMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.CreateOsLoginProfileRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateProfileMethod;
    if ((getCreateProfileMethod = OsLoginServiceGrpc.getCreateProfileMethod) == null) {
      synchronized (OsLoginServiceGrpc.class) {
        if ((getCreateProfileMethod = OsLoginServiceGrpc.getCreateProfileMethod) == null) {
          OsLoginServiceGrpc.getCreateProfileMethod = getCreateProfileMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.CreateOsLoginProfileRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateProfile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.CreateOsLoginProfileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new OsLoginServiceMethodDescriptorSupplier("CreateProfile"))
              .build();
        }
      }
    }
    return getCreateProfileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.UpdateOsLoginProfileRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateProfileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateProfile",
      requestType = yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.UpdateOsLoginProfileRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.UpdateOsLoginProfileRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateProfileMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.UpdateOsLoginProfileRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateProfileMethod;
    if ((getUpdateProfileMethod = OsLoginServiceGrpc.getUpdateProfileMethod) == null) {
      synchronized (OsLoginServiceGrpc.class) {
        if ((getUpdateProfileMethod = OsLoginServiceGrpc.getUpdateProfileMethod) == null) {
          OsLoginServiceGrpc.getUpdateProfileMethod = getUpdateProfileMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.UpdateOsLoginProfileRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateProfile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.UpdateOsLoginProfileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new OsLoginServiceMethodDescriptorSupplier("UpdateProfile"))
              .build();
        }
      }
    }
    return getUpdateProfileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.SetDefaultOsLoginProfileRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getSetDefaultProfileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetDefaultProfile",
      requestType = yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.SetDefaultOsLoginProfileRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.SetDefaultOsLoginProfileRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getSetDefaultProfileMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.SetDefaultOsLoginProfileRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getSetDefaultProfileMethod;
    if ((getSetDefaultProfileMethod = OsLoginServiceGrpc.getSetDefaultProfileMethod) == null) {
      synchronized (OsLoginServiceGrpc.class) {
        if ((getSetDefaultProfileMethod = OsLoginServiceGrpc.getSetDefaultProfileMethod) == null) {
          OsLoginServiceGrpc.getSetDefaultProfileMethod = getSetDefaultProfileMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.SetDefaultOsLoginProfileRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetDefaultProfile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.SetDefaultOsLoginProfileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new OsLoginServiceMethodDescriptorSupplier("SetDefaultProfile"))
              .build();
        }
      }
    }
    return getSetDefaultProfileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.DeleteOsLoginProfileRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteProfileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteProfile",
      requestType = yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.DeleteOsLoginProfileRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.DeleteOsLoginProfileRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteProfileMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.DeleteOsLoginProfileRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteProfileMethod;
    if ((getDeleteProfileMethod = OsLoginServiceGrpc.getDeleteProfileMethod) == null) {
      synchronized (OsLoginServiceGrpc.class) {
        if ((getDeleteProfileMethod = OsLoginServiceGrpc.getDeleteProfileMethod) == null) {
          OsLoginServiceGrpc.getDeleteProfileMethod = getDeleteProfileMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.DeleteOsLoginProfileRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteProfile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.DeleteOsLoginProfileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new OsLoginServiceMethodDescriptorSupplier("DeleteProfile"))
              .build();
        }
      }
    }
    return getDeleteProfileMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OsLoginServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OsLoginServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OsLoginServiceStub>() {
        @java.lang.Override
        public OsLoginServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OsLoginServiceStub(channel, callOptions);
        }
      };
    return OsLoginServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OsLoginServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OsLoginServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OsLoginServiceBlockingStub>() {
        @java.lang.Override
        public OsLoginServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OsLoginServiceBlockingStub(channel, callOptions);
        }
      };
    return OsLoginServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OsLoginServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OsLoginServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OsLoginServiceFutureStub>() {
        @java.lang.Override
        public OsLoginServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OsLoginServiceFutureStub(channel, callOptions);
        }
      };
    return OsLoginServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class OsLoginServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * OsLogin settings
     * </pre>
     */
    public void getSettings(yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.GetOsLoginSettingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.OsLoginSettings> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSettingsMethod(), responseObserver);
    }

    /**
     */
    public void updateSettings(yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.UpdateOsLoginSettingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateSettingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * OsLogin Profiles
     * </pre>
     */
    public void getProfile(yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.GetOsLoginProfileRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.OsLoginProfile> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProfileMethod(), responseObserver);
    }

    /**
     */
    public void listProfiles(yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.ListOsLoginProfilesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.ListOsLoginProfilesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListProfilesMethod(), responseObserver);
    }

    /**
     */
    public void createProfile(yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.CreateOsLoginProfileRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateProfileMethod(), responseObserver);
    }

    /**
     */
    public void updateProfile(yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.UpdateOsLoginProfileRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateProfileMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sets a profile as a default for the subject assigned to this profile
     * </pre>
     */
    public void setDefaultProfile(yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.SetDefaultOsLoginProfileRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetDefaultProfileMethod(), responseObserver);
    }

    /**
     */
    public void deleteProfile(yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.DeleteOsLoginProfileRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteProfileMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetSettingsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.GetOsLoginSettingsRequest,
                yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.OsLoginSettings>(
                  this, METHODID_GET_SETTINGS)))
          .addMethod(
            getUpdateSettingsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.UpdateOsLoginSettingsRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE_SETTINGS)))
          .addMethod(
            getGetProfileMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.GetOsLoginProfileRequest,
                yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.OsLoginProfile>(
                  this, METHODID_GET_PROFILE)))
          .addMethod(
            getListProfilesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.ListOsLoginProfilesRequest,
                yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.ListOsLoginProfilesResponse>(
                  this, METHODID_LIST_PROFILES)))
          .addMethod(
            getCreateProfileMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.CreateOsLoginProfileRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE_PROFILE)))
          .addMethod(
            getUpdateProfileMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.UpdateOsLoginProfileRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE_PROFILE)))
          .addMethod(
            getSetDefaultProfileMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.SetDefaultOsLoginProfileRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_SET_DEFAULT_PROFILE)))
          .addMethod(
            getDeleteProfileMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.DeleteOsLoginProfileRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE_PROFILE)))
          .build();
    }
  }

  /**
   */
  public static final class OsLoginServiceStub extends io.grpc.stub.AbstractAsyncStub<OsLoginServiceStub> {
    private OsLoginServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OsLoginServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OsLoginServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * OsLogin settings
     * </pre>
     */
    public void getSettings(yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.GetOsLoginSettingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.OsLoginSettings> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSettingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateSettings(yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.UpdateOsLoginSettingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateSettingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * OsLogin Profiles
     * </pre>
     */
    public void getProfile(yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.GetOsLoginProfileRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.OsLoginProfile> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProfileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listProfiles(yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.ListOsLoginProfilesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.ListOsLoginProfilesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListProfilesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createProfile(yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.CreateOsLoginProfileRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateProfileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateProfile(yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.UpdateOsLoginProfileRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateProfileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sets a profile as a default for the subject assigned to this profile
     * </pre>
     */
    public void setDefaultProfile(yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.SetDefaultOsLoginProfileRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetDefaultProfileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteProfile(yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.DeleteOsLoginProfileRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteProfileMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class OsLoginServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<OsLoginServiceBlockingStub> {
    private OsLoginServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OsLoginServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OsLoginServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * OsLogin settings
     * </pre>
     */
    public yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.OsLoginSettings getSettings(yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.GetOsLoginSettingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSettingsMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation updateSettings(yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.UpdateOsLoginSettingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateSettingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * OsLogin Profiles
     * </pre>
     */
    public yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.OsLoginProfile getProfile(yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.GetOsLoginProfileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProfileMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.ListOsLoginProfilesResponse listProfiles(yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.ListOsLoginProfilesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListProfilesMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation createProfile(yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.CreateOsLoginProfileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateProfileMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation updateProfile(yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.UpdateOsLoginProfileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateProfileMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets a profile as a default for the subject assigned to this profile
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation setDefaultProfile(yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.SetDefaultOsLoginProfileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetDefaultProfileMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation deleteProfile(yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.DeleteOsLoginProfileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteProfileMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class OsLoginServiceFutureStub extends io.grpc.stub.AbstractFutureStub<OsLoginServiceFutureStub> {
    private OsLoginServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OsLoginServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OsLoginServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * OsLogin settings
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.OsLoginSettings> getSettings(
        yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.GetOsLoginSettingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSettingsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> updateSettings(
        yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.UpdateOsLoginSettingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateSettingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * OsLogin Profiles
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.OsLoginProfile> getProfile(
        yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.GetOsLoginProfileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProfileMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.ListOsLoginProfilesResponse> listProfiles(
        yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.ListOsLoginProfilesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListProfilesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> createProfile(
        yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.CreateOsLoginProfileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateProfileMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> updateProfile(
        yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.UpdateOsLoginProfileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateProfileMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sets a profile as a default for the subject assigned to this profile
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> setDefaultProfile(
        yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.SetDefaultOsLoginProfileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetDefaultProfileMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> deleteProfile(
        yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.DeleteOsLoginProfileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteProfileMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_SETTINGS = 0;
  private static final int METHODID_UPDATE_SETTINGS = 1;
  private static final int METHODID_GET_PROFILE = 2;
  private static final int METHODID_LIST_PROFILES = 3;
  private static final int METHODID_CREATE_PROFILE = 4;
  private static final int METHODID_UPDATE_PROFILE = 5;
  private static final int METHODID_SET_DEFAULT_PROFILE = 6;
  private static final int METHODID_DELETE_PROFILE = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final OsLoginServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(OsLoginServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_SETTINGS:
          serviceImpl.getSettings((yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.GetOsLoginSettingsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.OsLoginSettings>) responseObserver);
          break;
        case METHODID_UPDATE_SETTINGS:
          serviceImpl.updateSettings((yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.UpdateOsLoginSettingsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_GET_PROFILE:
          serviceImpl.getProfile((yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.GetOsLoginProfileRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.OsLoginProfile>) responseObserver);
          break;
        case METHODID_LIST_PROFILES:
          serviceImpl.listProfiles((yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.ListOsLoginProfilesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.ListOsLoginProfilesResponse>) responseObserver);
          break;
        case METHODID_CREATE_PROFILE:
          serviceImpl.createProfile((yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.CreateOsLoginProfileRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE_PROFILE:
          serviceImpl.updateProfile((yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.UpdateOsLoginProfileRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_SET_DEFAULT_PROFILE:
          serviceImpl.setDefaultProfile((yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.SetDefaultOsLoginProfileRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE_PROFILE:
          serviceImpl.deleteProfile((yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.DeleteOsLoginProfileRequest) request,
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

  private static abstract class OsLoginServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OsLoginServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.organizationmanager.v1.OsLoginServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("OsLoginService");
    }
  }

  private static final class OsLoginServiceFileDescriptorSupplier
      extends OsLoginServiceBaseDescriptorSupplier {
    OsLoginServiceFileDescriptorSupplier() {}
  }

  private static final class OsLoginServiceMethodDescriptorSupplier
      extends OsLoginServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    OsLoginServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (OsLoginServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OsLoginServiceFileDescriptorSupplier())
              .addMethod(getGetSettingsMethod())
              .addMethod(getUpdateSettingsMethod())
              .addMethod(getGetProfileMethod())
              .addMethod(getListProfilesMethod())
              .addMethod(getCreateProfileMethod())
              .addMethod(getUpdateProfileMethod())
              .addMethod(getSetDefaultProfileMethod())
              .addMethod(getDeleteProfileMethod())
              .build();
        }
      }
    }
    return result;
  }
}
