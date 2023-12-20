package yandex.cloud.api.datasphere.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing Community resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/datasphere/v2/community_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CommunityServiceGrpc {

  private CommunityServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.datasphere.v2.CommunityService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.CreateCommunityRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.CreateCommunityRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.CreateCommunityRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.CreateCommunityRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = CommunityServiceGrpc.getCreateMethod) == null) {
      synchronized (CommunityServiceGrpc.class) {
        if ((getCreateMethod = CommunityServiceGrpc.getCreateMethod) == null) {
          CommunityServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.CreateCommunityRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.CreateCommunityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new CommunityServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.GetCommunityRequest,
      yandex.cloud.api.datasphere.v2.CommunityOuterClass.Community> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.GetCommunityRequest.class,
      responseType = yandex.cloud.api.datasphere.v2.CommunityOuterClass.Community.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.GetCommunityRequest,
      yandex.cloud.api.datasphere.v2.CommunityOuterClass.Community> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.GetCommunityRequest, yandex.cloud.api.datasphere.v2.CommunityOuterClass.Community> getGetMethod;
    if ((getGetMethod = CommunityServiceGrpc.getGetMethod) == null) {
      synchronized (CommunityServiceGrpc.class) {
        if ((getGetMethod = CommunityServiceGrpc.getGetMethod) == null) {
          CommunityServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.GetCommunityRequest, yandex.cloud.api.datasphere.v2.CommunityOuterClass.Community>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.GetCommunityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datasphere.v2.CommunityOuterClass.Community.getDefaultInstance()))
              .setSchemaDescriptor(new CommunityServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.UpdateCommunityRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.UpdateCommunityRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.UpdateCommunityRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.UpdateCommunityRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = CommunityServiceGrpc.getUpdateMethod) == null) {
      synchronized (CommunityServiceGrpc.class) {
        if ((getUpdateMethod = CommunityServiceGrpc.getUpdateMethod) == null) {
          CommunityServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.UpdateCommunityRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.UpdateCommunityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new CommunityServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.DeleteCommunityRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.DeleteCommunityRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.DeleteCommunityRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.DeleteCommunityRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = CommunityServiceGrpc.getDeleteMethod) == null) {
      synchronized (CommunityServiceGrpc.class) {
        if ((getDeleteMethod = CommunityServiceGrpc.getDeleteMethod) == null) {
          CommunityServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.DeleteCommunityRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.DeleteCommunityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new CommunityServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.ListCommunitiesRequest,
      yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.ListCommunitiesResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.ListCommunitiesRequest.class,
      responseType = yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.ListCommunitiesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.ListCommunitiesRequest,
      yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.ListCommunitiesResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.ListCommunitiesRequest, yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.ListCommunitiesResponse> getListMethod;
    if ((getListMethod = CommunityServiceGrpc.getListMethod) == null) {
      synchronized (CommunityServiceGrpc.class) {
        if ((getListMethod = CommunityServiceGrpc.getListMethod) == null) {
          CommunityServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.ListCommunitiesRequest, yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.ListCommunitiesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.ListCommunitiesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.ListCommunitiesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CommunityServiceMethodDescriptorSupplier("List"))
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
    if ((getListAccessBindingsMethod = CommunityServiceGrpc.getListAccessBindingsMethod) == null) {
      synchronized (CommunityServiceGrpc.class) {
        if ((getListAccessBindingsMethod = CommunityServiceGrpc.getListAccessBindingsMethod) == null) {
          CommunityServiceGrpc.getListAccessBindingsMethod = getListAccessBindingsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.ListAccessBindingsRequest, yandex.cloud.api.access.Access.ListAccessBindingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.ListAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.ListAccessBindingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CommunityServiceMethodDescriptorSupplier("ListAccessBindings"))
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
    if ((getSetAccessBindingsMethod = CommunityServiceGrpc.getSetAccessBindingsMethod) == null) {
      synchronized (CommunityServiceGrpc.class) {
        if ((getSetAccessBindingsMethod = CommunityServiceGrpc.getSetAccessBindingsMethod) == null) {
          CommunityServiceGrpc.getSetAccessBindingsMethod = getSetAccessBindingsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.SetAccessBindingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.SetAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new CommunityServiceMethodDescriptorSupplier("SetAccessBindings"))
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
    if ((getUpdateAccessBindingsMethod = CommunityServiceGrpc.getUpdateAccessBindingsMethod) == null) {
      synchronized (CommunityServiceGrpc.class) {
        if ((getUpdateAccessBindingsMethod = CommunityServiceGrpc.getUpdateAccessBindingsMethod) == null) {
          CommunityServiceGrpc.getUpdateAccessBindingsMethod = getUpdateAccessBindingsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.UpdateAccessBindingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.UpdateAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new CommunityServiceMethodDescriptorSupplier("UpdateAccessBindings"))
              .build();
        }
      }
    }
    return getUpdateAccessBindingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.AddCommunityResourceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getAddResourceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddResource",
      requestType = yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.AddCommunityResourceRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.AddCommunityResourceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getAddResourceMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.AddCommunityResourceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getAddResourceMethod;
    if ((getAddResourceMethod = CommunityServiceGrpc.getAddResourceMethod) == null) {
      synchronized (CommunityServiceGrpc.class) {
        if ((getAddResourceMethod = CommunityServiceGrpc.getAddResourceMethod) == null) {
          CommunityServiceGrpc.getAddResourceMethod = getAddResourceMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.AddCommunityResourceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddResource"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.AddCommunityResourceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new CommunityServiceMethodDescriptorSupplier("AddResource"))
              .build();
        }
      }
    }
    return getAddResourceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.RemoveCommunityResourceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRemoveResourceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveResource",
      requestType = yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.RemoveCommunityResourceRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.RemoveCommunityResourceRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRemoveResourceMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.RemoveCommunityResourceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getRemoveResourceMethod;
    if ((getRemoveResourceMethod = CommunityServiceGrpc.getRemoveResourceMethod) == null) {
      synchronized (CommunityServiceGrpc.class) {
        if ((getRemoveResourceMethod = CommunityServiceGrpc.getRemoveResourceMethod) == null) {
          CommunityServiceGrpc.getRemoveResourceMethod = getRemoveResourceMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.RemoveCommunityResourceRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveResource"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.RemoveCommunityResourceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new CommunityServiceMethodDescriptorSupplier("RemoveResource"))
              .build();
        }
      }
    }
    return getRemoveResourceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CommunityServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CommunityServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CommunityServiceStub>() {
        @java.lang.Override
        public CommunityServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CommunityServiceStub(channel, callOptions);
        }
      };
    return CommunityServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CommunityServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CommunityServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CommunityServiceBlockingStub>() {
        @java.lang.Override
        public CommunityServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CommunityServiceBlockingStub(channel, callOptions);
        }
      };
    return CommunityServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CommunityServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CommunityServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CommunityServiceFutureStub>() {
        @java.lang.Override
        public CommunityServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CommunityServiceFutureStub(channel, callOptions);
        }
      };
    return CommunityServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing Community resources.
   * </pre>
   */
  public static abstract class CommunityServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Creates community in specified organization.
     * </pre>
     */
    public void create(yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.CreateCommunityRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns community.
     * </pre>
     */
    public void get(yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.GetCommunityRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.datasphere.v2.CommunityOuterClass.Community> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates specified community.
     * </pre>
     */
    public void update(yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.UpdateCommunityRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes specified community.
     * </pre>
     */
    public void delete(yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.DeleteCommunityRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * List communities in specified organization.
     * </pre>
     */
    public void list(yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.ListCommunitiesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.ListCommunitiesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists access bindings for specified community.
     * </pre>
     */
    public void listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.access.Access.ListAccessBindingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAccessBindingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sets access bindings for specified community.
     * </pre>
     */
    public void setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetAccessBindingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates access bindings for specified community.
     * </pre>
     */
    public void updateAccessBindings(yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAccessBindingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Adds shared resource to community
     * </pre>
     */
    public void addResource(yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.AddCommunityResourceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddResourceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Removes shared resource from community
     * </pre>
     */
    public void removeResource(yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.RemoveCommunityResourceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveResourceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.CreateCommunityRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.GetCommunityRequest,
                yandex.cloud.api.datasphere.v2.CommunityOuterClass.Community>(
                  this, METHODID_GET)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.UpdateCommunityRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.DeleteCommunityRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.ListCommunitiesRequest,
                yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.ListCommunitiesResponse>(
                  this, METHODID_LIST)))
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
          .addMethod(
            getAddResourceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.AddCommunityResourceRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_ADD_RESOURCE)))
          .addMethod(
            getRemoveResourceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.RemoveCommunityResourceRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_REMOVE_RESOURCE)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing Community resources.
   * </pre>
   */
  public static final class CommunityServiceStub extends io.grpc.stub.AbstractAsyncStub<CommunityServiceStub> {
    private CommunityServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommunityServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CommunityServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates community in specified organization.
     * </pre>
     */
    public void create(yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.CreateCommunityRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns community.
     * </pre>
     */
    public void get(yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.GetCommunityRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.datasphere.v2.CommunityOuterClass.Community> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates specified community.
     * </pre>
     */
    public void update(yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.UpdateCommunityRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes specified community.
     * </pre>
     */
    public void delete(yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.DeleteCommunityRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List communities in specified organization.
     * </pre>
     */
    public void list(yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.ListCommunitiesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.ListCommunitiesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists access bindings for specified community.
     * </pre>
     */
    public void listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.access.Access.ListAccessBindingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sets access bindings for specified community.
     * </pre>
     */
    public void setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates access bindings for specified community.
     * </pre>
     */
    public void updateAccessBindings(yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Adds shared resource to community
     * </pre>
     */
    public void addResource(yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.AddCommunityResourceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddResourceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Removes shared resource from community
     * </pre>
     */
    public void removeResource(yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.RemoveCommunityResourceRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveResourceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Community resources.
   * </pre>
   */
  public static final class CommunityServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CommunityServiceBlockingStub> {
    private CommunityServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommunityServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CommunityServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates community in specified organization.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.CreateCommunityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns community.
     * </pre>
     */
    public yandex.cloud.api.datasphere.v2.CommunityOuterClass.Community get(yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.GetCommunityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates specified community.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.UpdateCommunityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes specified community.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.DeleteCommunityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List communities in specified organization.
     * </pre>
     */
    public yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.ListCommunitiesResponse list(yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.ListCommunitiesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists access bindings for specified community.
     * </pre>
     */
    public yandex.cloud.api.access.Access.ListAccessBindingsResponse listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAccessBindingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets access bindings for specified community.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetAccessBindingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates access bindings for specified community.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation updateAccessBindings(yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAccessBindingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Adds shared resource to community
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation addResource(yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.AddCommunityResourceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddResourceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Removes shared resource from community
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation removeResource(yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.RemoveCommunityResourceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveResourceMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Community resources.
   * </pre>
   */
  public static final class CommunityServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CommunityServiceFutureStub> {
    private CommunityServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommunityServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CommunityServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates community in specified organization.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.CreateCommunityRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns community.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.datasphere.v2.CommunityOuterClass.Community> get(
        yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.GetCommunityRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates specified community.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.UpdateCommunityRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes specified community.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.DeleteCommunityRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List communities in specified organization.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.ListCommunitiesResponse> list(
        yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.ListCommunitiesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists access bindings for specified community.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.access.Access.ListAccessBindingsResponse> listAccessBindings(
        yandex.cloud.api.access.Access.ListAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAccessBindingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sets access bindings for specified community.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> setAccessBindings(
        yandex.cloud.api.access.Access.SetAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetAccessBindingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates access bindings for specified community.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> updateAccessBindings(
        yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAccessBindingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Adds shared resource to community
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> addResource(
        yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.AddCommunityResourceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddResourceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Removes shared resource from community
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> removeResource(
        yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.RemoveCommunityResourceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveResourceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_GET = 1;
  private static final int METHODID_UPDATE = 2;
  private static final int METHODID_DELETE = 3;
  private static final int METHODID_LIST = 4;
  private static final int METHODID_LIST_ACCESS_BINDINGS = 5;
  private static final int METHODID_SET_ACCESS_BINDINGS = 6;
  private static final int METHODID_UPDATE_ACCESS_BINDINGS = 7;
  private static final int METHODID_ADD_RESOURCE = 8;
  private static final int METHODID_REMOVE_RESOURCE = 9;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CommunityServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CommunityServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.CreateCommunityRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.GetCommunityRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.datasphere.v2.CommunityOuterClass.Community>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.UpdateCommunityRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.DeleteCommunityRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.ListCommunitiesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.ListCommunitiesResponse>) responseObserver);
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
        case METHODID_ADD_RESOURCE:
          serviceImpl.addResource((yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.AddCommunityResourceRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_REMOVE_RESOURCE:
          serviceImpl.removeResource((yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.RemoveCommunityResourceRequest) request,
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

  private static abstract class CommunityServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CommunityServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.datasphere.v2.CommunityServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CommunityService");
    }
  }

  private static final class CommunityServiceFileDescriptorSupplier
      extends CommunityServiceBaseDescriptorSupplier {
    CommunityServiceFileDescriptorSupplier() {}
  }

  private static final class CommunityServiceMethodDescriptorSupplier
      extends CommunityServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CommunityServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CommunityServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CommunityServiceFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getGetMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getListMethod())
              .addMethod(getListAccessBindingsMethod())
              .addMethod(getSetAccessBindingsMethod())
              .addMethod(getUpdateAccessBindingsMethod())
              .addMethod(getAddResourceMethod())
              .addMethod(getRemoveResourceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
