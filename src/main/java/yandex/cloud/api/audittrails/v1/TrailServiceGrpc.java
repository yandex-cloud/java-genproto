package yandex.cloud.api.audittrails.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing trails.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/audittrails/v1/trail_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TrailServiceGrpc {

  private TrailServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.audittrails.v1.TrailService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.audittrails.v1.ATS.GetTrailRequest,
      yandex.cloud.api.audittrails.v1.AT.Trail> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.audittrails.v1.ATS.GetTrailRequest.class,
      responseType = yandex.cloud.api.audittrails.v1.AT.Trail.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.audittrails.v1.ATS.GetTrailRequest,
      yandex.cloud.api.audittrails.v1.AT.Trail> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.audittrails.v1.ATS.GetTrailRequest, yandex.cloud.api.audittrails.v1.AT.Trail> getGetMethod;
    if ((getGetMethod = TrailServiceGrpc.getGetMethod) == null) {
      synchronized (TrailServiceGrpc.class) {
        if ((getGetMethod = TrailServiceGrpc.getGetMethod) == null) {
          TrailServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.audittrails.v1.ATS.GetTrailRequest, yandex.cloud.api.audittrails.v1.AT.Trail>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.audittrails.v1.ATS.GetTrailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.audittrails.v1.AT.Trail.getDefaultInstance()))
              .setSchemaDescriptor(new TrailServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.audittrails.v1.ATS.ListTrailsRequest,
      yandex.cloud.api.audittrails.v1.ATS.ListTrailsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.audittrails.v1.ATS.ListTrailsRequest.class,
      responseType = yandex.cloud.api.audittrails.v1.ATS.ListTrailsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.audittrails.v1.ATS.ListTrailsRequest,
      yandex.cloud.api.audittrails.v1.ATS.ListTrailsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.audittrails.v1.ATS.ListTrailsRequest, yandex.cloud.api.audittrails.v1.ATS.ListTrailsResponse> getListMethod;
    if ((getListMethod = TrailServiceGrpc.getListMethod) == null) {
      synchronized (TrailServiceGrpc.class) {
        if ((getListMethod = TrailServiceGrpc.getListMethod) == null) {
          TrailServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.audittrails.v1.ATS.ListTrailsRequest, yandex.cloud.api.audittrails.v1.ATS.ListTrailsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.audittrails.v1.ATS.ListTrailsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.audittrails.v1.ATS.ListTrailsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TrailServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.audittrails.v1.ATS.CreateTrailRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.audittrails.v1.ATS.CreateTrailRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.audittrails.v1.ATS.CreateTrailRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.audittrails.v1.ATS.CreateTrailRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = TrailServiceGrpc.getCreateMethod) == null) {
      synchronized (TrailServiceGrpc.class) {
        if ((getCreateMethod = TrailServiceGrpc.getCreateMethod) == null) {
          TrailServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.audittrails.v1.ATS.CreateTrailRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.audittrails.v1.ATS.CreateTrailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new TrailServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.audittrails.v1.ATS.UpdateTrailRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.audittrails.v1.ATS.UpdateTrailRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.audittrails.v1.ATS.UpdateTrailRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.audittrails.v1.ATS.UpdateTrailRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = TrailServiceGrpc.getUpdateMethod) == null) {
      synchronized (TrailServiceGrpc.class) {
        if ((getUpdateMethod = TrailServiceGrpc.getUpdateMethod) == null) {
          TrailServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.audittrails.v1.ATS.UpdateTrailRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.audittrails.v1.ATS.UpdateTrailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new TrailServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.audittrails.v1.ATS.DeleteTrailRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.audittrails.v1.ATS.DeleteTrailRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.audittrails.v1.ATS.DeleteTrailRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.audittrails.v1.ATS.DeleteTrailRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = TrailServiceGrpc.getDeleteMethod) == null) {
      synchronized (TrailServiceGrpc.class) {
        if ((getDeleteMethod = TrailServiceGrpc.getDeleteMethod) == null) {
          TrailServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.audittrails.v1.ATS.DeleteTrailRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.audittrails.v1.ATS.DeleteTrailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new TrailServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.audittrails.v1.ATS.ListTrailOperationsRequest,
      yandex.cloud.api.audittrails.v1.ATS.ListTrailOperationsResponse> getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = yandex.cloud.api.audittrails.v1.ATS.ListTrailOperationsRequest.class,
      responseType = yandex.cloud.api.audittrails.v1.ATS.ListTrailOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.audittrails.v1.ATS.ListTrailOperationsRequest,
      yandex.cloud.api.audittrails.v1.ATS.ListTrailOperationsResponse> getListOperationsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.audittrails.v1.ATS.ListTrailOperationsRequest, yandex.cloud.api.audittrails.v1.ATS.ListTrailOperationsResponse> getListOperationsMethod;
    if ((getListOperationsMethod = TrailServiceGrpc.getListOperationsMethod) == null) {
      synchronized (TrailServiceGrpc.class) {
        if ((getListOperationsMethod = TrailServiceGrpc.getListOperationsMethod) == null) {
          TrailServiceGrpc.getListOperationsMethod = getListOperationsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.audittrails.v1.ATS.ListTrailOperationsRequest, yandex.cloud.api.audittrails.v1.ATS.ListTrailOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.audittrails.v1.ATS.ListTrailOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.audittrails.v1.ATS.ListTrailOperationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TrailServiceMethodDescriptorSupplier("ListOperations"))
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
    if ((getListAccessBindingsMethod = TrailServiceGrpc.getListAccessBindingsMethod) == null) {
      synchronized (TrailServiceGrpc.class) {
        if ((getListAccessBindingsMethod = TrailServiceGrpc.getListAccessBindingsMethod) == null) {
          TrailServiceGrpc.getListAccessBindingsMethod = getListAccessBindingsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.ListAccessBindingsRequest, yandex.cloud.api.access.Access.ListAccessBindingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.ListAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.ListAccessBindingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TrailServiceMethodDescriptorSupplier("ListAccessBindings"))
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
    if ((getSetAccessBindingsMethod = TrailServiceGrpc.getSetAccessBindingsMethod) == null) {
      synchronized (TrailServiceGrpc.class) {
        if ((getSetAccessBindingsMethod = TrailServiceGrpc.getSetAccessBindingsMethod) == null) {
          TrailServiceGrpc.getSetAccessBindingsMethod = getSetAccessBindingsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.SetAccessBindingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.SetAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new TrailServiceMethodDescriptorSupplier("SetAccessBindings"))
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
    if ((getUpdateAccessBindingsMethod = TrailServiceGrpc.getUpdateAccessBindingsMethod) == null) {
      synchronized (TrailServiceGrpc.class) {
        if ((getUpdateAccessBindingsMethod = TrailServiceGrpc.getUpdateAccessBindingsMethod) == null) {
          TrailServiceGrpc.getUpdateAccessBindingsMethod = getUpdateAccessBindingsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.UpdateAccessBindingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.UpdateAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new TrailServiceMethodDescriptorSupplier("UpdateAccessBindings"))
              .build();
        }
      }
    }
    return getUpdateAccessBindingsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TrailServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TrailServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TrailServiceStub>() {
        @java.lang.Override
        public TrailServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TrailServiceStub(channel, callOptions);
        }
      };
    return TrailServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TrailServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TrailServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TrailServiceBlockingStub>() {
        @java.lang.Override
        public TrailServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TrailServiceBlockingStub(channel, callOptions);
        }
      };
    return TrailServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TrailServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TrailServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TrailServiceFutureStub>() {
        @java.lang.Override
        public TrailServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TrailServiceFutureStub(channel, callOptions);
        }
      };
    return TrailServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing trails.
   * </pre>
   */
  public static abstract class TrailServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified trail.
     * To get the list of all available trails, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.audittrails.v1.ATS.GetTrailRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.audittrails.v1.AT.Trail> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of trails in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.audittrails.v1.ATS.ListTrailsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.audittrails.v1.ATS.ListTrailsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a trail in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.audittrails.v1.ATS.CreateTrailRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified trail.
     * </pre>
     */
    public void update(yandex.cloud.api.audittrails.v1.ATS.UpdateTrailRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified trail.
     * </pre>
     */
    public void delete(yandex.cloud.api.audittrails.v1.ATS.DeleteTrailRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified trail.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.audittrails.v1.ATS.ListTrailOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.audittrails.v1.ATS.ListTrailOperationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists existing access bindings for the specified trail.
     * </pre>
     */
    public void listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.access.Access.ListAccessBindingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAccessBindingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sets access bindings for the trail.
     * </pre>
     */
    public void setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetAccessBindingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates access bindings for the trail.
     * </pre>
     */
    public void updateAccessBindings(yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAccessBindingsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.audittrails.v1.ATS.GetTrailRequest,
                yandex.cloud.api.audittrails.v1.AT.Trail>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.audittrails.v1.ATS.ListTrailsRequest,
                yandex.cloud.api.audittrails.v1.ATS.ListTrailsResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.audittrails.v1.ATS.CreateTrailRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.audittrails.v1.ATS.UpdateTrailRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.audittrails.v1.ATS.DeleteTrailRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListOperationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.audittrails.v1.ATS.ListTrailOperationsRequest,
                yandex.cloud.api.audittrails.v1.ATS.ListTrailOperationsResponse>(
                  this, METHODID_LIST_OPERATIONS)))
          .addMethod(
            getListAccessBindingsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.access.Access.ListAccessBindingsRequest,
                yandex.cloud.api.access.Access.ListAccessBindingsResponse>(
                  this, METHODID_LIST_ACCESS_BINDINGS)))
          .addMethod(
            getSetAccessBindingsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.access.Access.SetAccessBindingsRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_SET_ACCESS_BINDINGS)))
          .addMethod(
            getUpdateAccessBindingsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.access.Access.UpdateAccessBindingsRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE_ACCESS_BINDINGS)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing trails.
   * </pre>
   */
  public static final class TrailServiceStub extends io.grpc.stub.AbstractAsyncStub<TrailServiceStub> {
    private TrailServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrailServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TrailServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified trail.
     * To get the list of all available trails, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.audittrails.v1.ATS.GetTrailRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.audittrails.v1.AT.Trail> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of trails in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.audittrails.v1.ATS.ListTrailsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.audittrails.v1.ATS.ListTrailsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a trail in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.audittrails.v1.ATS.CreateTrailRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified trail.
     * </pre>
     */
    public void update(yandex.cloud.api.audittrails.v1.ATS.UpdateTrailRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified trail.
     * </pre>
     */
    public void delete(yandex.cloud.api.audittrails.v1.ATS.DeleteTrailRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified trail.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.audittrails.v1.ATS.ListTrailOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.audittrails.v1.ATS.ListTrailOperationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists existing access bindings for the specified trail.
     * </pre>
     */
    public void listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.access.Access.ListAccessBindingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sets access bindings for the trail.
     * </pre>
     */
    public void setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates access bindings for the trail.
     * </pre>
     */
    public void updateAccessBindings(yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing trails.
   * </pre>
   */
  public static final class TrailServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<TrailServiceBlockingStub> {
    private TrailServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrailServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TrailServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified trail.
     * To get the list of all available trails, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.audittrails.v1.AT.Trail get(yandex.cloud.api.audittrails.v1.ATS.GetTrailRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of trails in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.audittrails.v1.ATS.ListTrailsResponse list(yandex.cloud.api.audittrails.v1.ATS.ListTrailsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a trail in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.audittrails.v1.ATS.CreateTrailRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified trail.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.audittrails.v1.ATS.UpdateTrailRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified trail.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.audittrails.v1.ATS.DeleteTrailRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists operations for the specified trail.
     * </pre>
     */
    public yandex.cloud.api.audittrails.v1.ATS.ListTrailOperationsResponse listOperations(yandex.cloud.api.audittrails.v1.ATS.ListTrailOperationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists existing access bindings for the specified trail.
     * </pre>
     */
    public yandex.cloud.api.access.Access.ListAccessBindingsResponse listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAccessBindingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets access bindings for the trail.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetAccessBindingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates access bindings for the trail.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation updateAccessBindings(yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAccessBindingsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing trails.
   * </pre>
   */
  public static final class TrailServiceFutureStub extends io.grpc.stub.AbstractFutureStub<TrailServiceFutureStub> {
    private TrailServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrailServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TrailServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified trail.
     * To get the list of all available trails, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.audittrails.v1.AT.Trail> get(
        yandex.cloud.api.audittrails.v1.ATS.GetTrailRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of trails in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.audittrails.v1.ATS.ListTrailsResponse> list(
        yandex.cloud.api.audittrails.v1.ATS.ListTrailsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a trail in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.audittrails.v1.ATS.CreateTrailRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified trail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.audittrails.v1.ATS.UpdateTrailRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified trail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.audittrails.v1.ATS.DeleteTrailRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists operations for the specified trail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.audittrails.v1.ATS.ListTrailOperationsResponse> listOperations(
        yandex.cloud.api.audittrails.v1.ATS.ListTrailOperationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists existing access bindings for the specified trail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.access.Access.ListAccessBindingsResponse> listAccessBindings(
        yandex.cloud.api.access.Access.ListAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAccessBindingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sets access bindings for the trail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> setAccessBindings(
        yandex.cloud.api.access.Access.SetAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetAccessBindingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates access bindings for the trail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> updateAccessBindings(
        yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
    private final TrailServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TrailServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.audittrails.v1.ATS.GetTrailRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.audittrails.v1.AT.Trail>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.audittrails.v1.ATS.ListTrailsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.audittrails.v1.ATS.ListTrailsResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.audittrails.v1.ATS.CreateTrailRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.audittrails.v1.ATS.UpdateTrailRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.audittrails.v1.ATS.DeleteTrailRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((yandex.cloud.api.audittrails.v1.ATS.ListTrailOperationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.audittrails.v1.ATS.ListTrailOperationsResponse>) responseObserver);
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

  private static abstract class TrailServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TrailServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.audittrails.v1.ATS.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TrailService");
    }
  }

  private static final class TrailServiceFileDescriptorSupplier
      extends TrailServiceBaseDescriptorSupplier {
    TrailServiceFileDescriptorSupplier() {}
  }

  private static final class TrailServiceMethodDescriptorSupplier
      extends TrailServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TrailServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TrailServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TrailServiceFileDescriptorSupplier())
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
