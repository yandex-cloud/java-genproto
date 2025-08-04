package yandex.cloud.api.video.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * StylePreset management service.
 * Provides methods for creating, retrieving, updating, and deleting style presets,
 * which define the visual appearance and layout of video players and associated widgets.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/video/v1/style_preset_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class StylePresetServiceGrpc {

  private StylePresetServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.video.v1.StylePresetService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.StylePresetServiceOuterClass.GetStylePresetRequest,
      yandex.cloud.api.video.v1.StylePresetOuterClass.StylePreset> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.video.v1.StylePresetServiceOuterClass.GetStylePresetRequest.class,
      responseType = yandex.cloud.api.video.v1.StylePresetOuterClass.StylePreset.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.StylePresetServiceOuterClass.GetStylePresetRequest,
      yandex.cloud.api.video.v1.StylePresetOuterClass.StylePreset> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.StylePresetServiceOuterClass.GetStylePresetRequest, yandex.cloud.api.video.v1.StylePresetOuterClass.StylePreset> getGetMethod;
    if ((getGetMethod = StylePresetServiceGrpc.getGetMethod) == null) {
      synchronized (StylePresetServiceGrpc.class) {
        if ((getGetMethod = StylePresetServiceGrpc.getGetMethod) == null) {
          StylePresetServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.video.v1.StylePresetServiceOuterClass.GetStylePresetRequest, yandex.cloud.api.video.v1.StylePresetOuterClass.StylePreset>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.StylePresetServiceOuterClass.GetStylePresetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.StylePresetOuterClass.StylePreset.getDefaultInstance()))
              .setSchemaDescriptor(new StylePresetServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.StylePresetServiceOuterClass.ListStylePresetsRequest,
      yandex.cloud.api.video.v1.StylePresetServiceOuterClass.ListStylePresetsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.video.v1.StylePresetServiceOuterClass.ListStylePresetsRequest.class,
      responseType = yandex.cloud.api.video.v1.StylePresetServiceOuterClass.ListStylePresetsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.StylePresetServiceOuterClass.ListStylePresetsRequest,
      yandex.cloud.api.video.v1.StylePresetServiceOuterClass.ListStylePresetsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.StylePresetServiceOuterClass.ListStylePresetsRequest, yandex.cloud.api.video.v1.StylePresetServiceOuterClass.ListStylePresetsResponse> getListMethod;
    if ((getListMethod = StylePresetServiceGrpc.getListMethod) == null) {
      synchronized (StylePresetServiceGrpc.class) {
        if ((getListMethod = StylePresetServiceGrpc.getListMethod) == null) {
          StylePresetServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.video.v1.StylePresetServiceOuterClass.ListStylePresetsRequest, yandex.cloud.api.video.v1.StylePresetServiceOuterClass.ListStylePresetsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.StylePresetServiceOuterClass.ListStylePresetsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.StylePresetServiceOuterClass.ListStylePresetsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StylePresetServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.StylePresetServiceOuterClass.CreateStylePresetRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.video.v1.StylePresetServiceOuterClass.CreateStylePresetRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.StylePresetServiceOuterClass.CreateStylePresetRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.StylePresetServiceOuterClass.CreateStylePresetRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = StylePresetServiceGrpc.getCreateMethod) == null) {
      synchronized (StylePresetServiceGrpc.class) {
        if ((getCreateMethod = StylePresetServiceGrpc.getCreateMethod) == null) {
          StylePresetServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.video.v1.StylePresetServiceOuterClass.CreateStylePresetRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.StylePresetServiceOuterClass.CreateStylePresetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new StylePresetServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.StylePresetServiceOuterClass.UpdateStylePresetRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.video.v1.StylePresetServiceOuterClass.UpdateStylePresetRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.StylePresetServiceOuterClass.UpdateStylePresetRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.StylePresetServiceOuterClass.UpdateStylePresetRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = StylePresetServiceGrpc.getUpdateMethod) == null) {
      synchronized (StylePresetServiceGrpc.class) {
        if ((getUpdateMethod = StylePresetServiceGrpc.getUpdateMethod) == null) {
          StylePresetServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.video.v1.StylePresetServiceOuterClass.UpdateStylePresetRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.StylePresetServiceOuterClass.UpdateStylePresetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new StylePresetServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.StylePresetServiceOuterClass.DeleteStylePresetRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.video.v1.StylePresetServiceOuterClass.DeleteStylePresetRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.StylePresetServiceOuterClass.DeleteStylePresetRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.video.v1.StylePresetServiceOuterClass.DeleteStylePresetRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = StylePresetServiceGrpc.getDeleteMethod) == null) {
      synchronized (StylePresetServiceGrpc.class) {
        if ((getDeleteMethod = StylePresetServiceGrpc.getDeleteMethod) == null) {
          StylePresetServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.video.v1.StylePresetServiceOuterClass.DeleteStylePresetRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.video.v1.StylePresetServiceOuterClass.DeleteStylePresetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new StylePresetServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StylePresetServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StylePresetServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StylePresetServiceStub>() {
        @java.lang.Override
        public StylePresetServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StylePresetServiceStub(channel, callOptions);
        }
      };
    return StylePresetServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StylePresetServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StylePresetServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StylePresetServiceBlockingStub>() {
        @java.lang.Override
        public StylePresetServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StylePresetServiceBlockingStub(channel, callOptions);
        }
      };
    return StylePresetServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StylePresetServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StylePresetServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StylePresetServiceFutureStub>() {
        @java.lang.Override
        public StylePresetServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StylePresetServiceFutureStub(channel, callOptions);
        }
      };
    return StylePresetServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * StylePreset management service.
   * Provides methods for creating, retrieving, updating, and deleting style presets,
   * which define the visual appearance and layout of video players and associated widgets.
   * </pre>
   */
  public static abstract class StylePresetServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Retrieves detailed information about a specific style preset by its ID.
     * Returns all style preset properties, colors, layout settings, and widget configurations.
     * </pre>
     */
    public void get(yandex.cloud.api.video.v1.StylePresetServiceOuterClass.GetStylePresetRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.StylePresetOuterClass.StylePreset> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists all style presets in a specific channel with pagination support.
     * Results can be filtered and sorted using the provided parameters.
     * </pre>
     */
    public void list(yandex.cloud.api.video.v1.StylePresetServiceOuterClass.ListStylePresetsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.StylePresetServiceOuterClass.ListStylePresetsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a new style preset in the specified channel with the provided visual settings.
     * Style presets define the appearance of players, including colors, spacing, borders, and widgets.
     * </pre>
     */
    public void create(yandex.cloud.api.video.v1.StylePresetServiceOuterClass.CreateStylePresetRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates an existing style preset's properties and visual settings.
     * Only fields specified in the field_mask will be updated.
     * </pre>
     */
    public void update(yandex.cloud.api.video.v1.StylePresetServiceOuterClass.UpdateStylePresetRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes a specific style preset by its ID.
     * This operation will fail if the style preset is currently in use by any videos, streams, or playlists.
     * </pre>
     */
    public void delete(yandex.cloud.api.video.v1.StylePresetServiceOuterClass.DeleteStylePresetRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.video.v1.StylePresetServiceOuterClass.GetStylePresetRequest,
                yandex.cloud.api.video.v1.StylePresetOuterClass.StylePreset>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.video.v1.StylePresetServiceOuterClass.ListStylePresetsRequest,
                yandex.cloud.api.video.v1.StylePresetServiceOuterClass.ListStylePresetsResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.video.v1.StylePresetServiceOuterClass.CreateStylePresetRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.video.v1.StylePresetServiceOuterClass.UpdateStylePresetRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.video.v1.StylePresetServiceOuterClass.DeleteStylePresetRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .build();
    }
  }

  /**
   * <pre>
   * StylePreset management service.
   * Provides methods for creating, retrieving, updating, and deleting style presets,
   * which define the visual appearance and layout of video players and associated widgets.
   * </pre>
   */
  public static final class StylePresetServiceStub extends io.grpc.stub.AbstractAsyncStub<StylePresetServiceStub> {
    private StylePresetServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StylePresetServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StylePresetServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves detailed information about a specific style preset by its ID.
     * Returns all style preset properties, colors, layout settings, and widget configurations.
     * </pre>
     */
    public void get(yandex.cloud.api.video.v1.StylePresetServiceOuterClass.GetStylePresetRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.StylePresetOuterClass.StylePreset> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists all style presets in a specific channel with pagination support.
     * Results can be filtered and sorted using the provided parameters.
     * </pre>
     */
    public void list(yandex.cloud.api.video.v1.StylePresetServiceOuterClass.ListStylePresetsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.StylePresetServiceOuterClass.ListStylePresetsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a new style preset in the specified channel with the provided visual settings.
     * Style presets define the appearance of players, including colors, spacing, borders, and widgets.
     * </pre>
     */
    public void create(yandex.cloud.api.video.v1.StylePresetServiceOuterClass.CreateStylePresetRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates an existing style preset's properties and visual settings.
     * Only fields specified in the field_mask will be updated.
     * </pre>
     */
    public void update(yandex.cloud.api.video.v1.StylePresetServiceOuterClass.UpdateStylePresetRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a specific style preset by its ID.
     * This operation will fail if the style preset is currently in use by any videos, streams, or playlists.
     * </pre>
     */
    public void delete(yandex.cloud.api.video.v1.StylePresetServiceOuterClass.DeleteStylePresetRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * StylePreset management service.
   * Provides methods for creating, retrieving, updating, and deleting style presets,
   * which define the visual appearance and layout of video players and associated widgets.
   * </pre>
   */
  public static final class StylePresetServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<StylePresetServiceBlockingStub> {
    private StylePresetServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StylePresetServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StylePresetServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves detailed information about a specific style preset by its ID.
     * Returns all style preset properties, colors, layout settings, and widget configurations.
     * </pre>
     */
    public yandex.cloud.api.video.v1.StylePresetOuterClass.StylePreset get(yandex.cloud.api.video.v1.StylePresetServiceOuterClass.GetStylePresetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists all style presets in a specific channel with pagination support.
     * Results can be filtered and sorted using the provided parameters.
     * </pre>
     */
    public yandex.cloud.api.video.v1.StylePresetServiceOuterClass.ListStylePresetsResponse list(yandex.cloud.api.video.v1.StylePresetServiceOuterClass.ListStylePresetsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new style preset in the specified channel with the provided visual settings.
     * Style presets define the appearance of players, including colors, spacing, borders, and widgets.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.video.v1.StylePresetServiceOuterClass.CreateStylePresetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates an existing style preset's properties and visual settings.
     * Only fields specified in the field_mask will be updated.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.video.v1.StylePresetServiceOuterClass.UpdateStylePresetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a specific style preset by its ID.
     * This operation will fail if the style preset is currently in use by any videos, streams, or playlists.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.video.v1.StylePresetServiceOuterClass.DeleteStylePresetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * StylePreset management service.
   * Provides methods for creating, retrieving, updating, and deleting style presets,
   * which define the visual appearance and layout of video players and associated widgets.
   * </pre>
   */
  public static final class StylePresetServiceFutureStub extends io.grpc.stub.AbstractFutureStub<StylePresetServiceFutureStub> {
    private StylePresetServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StylePresetServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StylePresetServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves detailed information about a specific style preset by its ID.
     * Returns all style preset properties, colors, layout settings, and widget configurations.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.video.v1.StylePresetOuterClass.StylePreset> get(
        yandex.cloud.api.video.v1.StylePresetServiceOuterClass.GetStylePresetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists all style presets in a specific channel with pagination support.
     * Results can be filtered and sorted using the provided parameters.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.video.v1.StylePresetServiceOuterClass.ListStylePresetsResponse> list(
        yandex.cloud.api.video.v1.StylePresetServiceOuterClass.ListStylePresetsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a new style preset in the specified channel with the provided visual settings.
     * Style presets define the appearance of players, including colors, spacing, borders, and widgets.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.video.v1.StylePresetServiceOuterClass.CreateStylePresetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates an existing style preset's properties and visual settings.
     * Only fields specified in the field_mask will be updated.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.video.v1.StylePresetServiceOuterClass.UpdateStylePresetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a specific style preset by its ID.
     * This operation will fail if the style preset is currently in use by any videos, streams, or playlists.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.video.v1.StylePresetServiceOuterClass.DeleteStylePresetRequest request) {
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
    private final StylePresetServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(StylePresetServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.video.v1.StylePresetServiceOuterClass.GetStylePresetRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.StylePresetOuterClass.StylePreset>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.video.v1.StylePresetServiceOuterClass.ListStylePresetsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.video.v1.StylePresetServiceOuterClass.ListStylePresetsResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.video.v1.StylePresetServiceOuterClass.CreateStylePresetRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.video.v1.StylePresetServiceOuterClass.UpdateStylePresetRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.video.v1.StylePresetServiceOuterClass.DeleteStylePresetRequest) request,
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

  private static abstract class StylePresetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StylePresetServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.video.v1.StylePresetServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StylePresetService");
    }
  }

  private static final class StylePresetServiceFileDescriptorSupplier
      extends StylePresetServiceBaseDescriptorSupplier {
    StylePresetServiceFileDescriptorSupplier() {}
  }

  private static final class StylePresetServiceMethodDescriptorSupplier
      extends StylePresetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StylePresetServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (StylePresetServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StylePresetServiceFileDescriptorSupplier())
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
