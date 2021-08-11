package yandex.cloud.api.organizationmanager.v1;

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
 * A set of methods for managing Organization resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.0)",
    comments = "Source: yandex/cloud/organizationmanager/v1/organization_service.proto")
public final class OrganizationServiceGrpc {

  private OrganizationServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.organizationmanager.v1.OrganizationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.OrganizationServiceOuterClass.GetOrganizationRequest,
      yandex.cloud.api.organizationmanager.v1.OrganizationOuterClass.Organization> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.organizationmanager.v1.OrganizationServiceOuterClass.GetOrganizationRequest.class,
      responseType = yandex.cloud.api.organizationmanager.v1.OrganizationOuterClass.Organization.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.OrganizationServiceOuterClass.GetOrganizationRequest,
      yandex.cloud.api.organizationmanager.v1.OrganizationOuterClass.Organization> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.OrganizationServiceOuterClass.GetOrganizationRequest, yandex.cloud.api.organizationmanager.v1.OrganizationOuterClass.Organization> getGetMethod;
    if ((getGetMethod = OrganizationServiceGrpc.getGetMethod) == null) {
      synchronized (OrganizationServiceGrpc.class) {
        if ((getGetMethod = OrganizationServiceGrpc.getGetMethod) == null) {
          OrganizationServiceGrpc.getGetMethod = getGetMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.OrganizationServiceOuterClass.GetOrganizationRequest, yandex.cloud.api.organizationmanager.v1.OrganizationOuterClass.Organization>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.organizationmanager.v1.OrganizationService", "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.OrganizationServiceOuterClass.GetOrganizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.OrganizationOuterClass.Organization.getDefaultInstance()))
                  .setSchemaDescriptor(new OrganizationServiceMethodDescriptorSupplier("Get"))
                  .build();
          }
        }
     }
     return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.OrganizationServiceOuterClass.ListOrganizationsRequest,
      yandex.cloud.api.organizationmanager.v1.OrganizationServiceOuterClass.ListOrganizationsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.organizationmanager.v1.OrganizationServiceOuterClass.ListOrganizationsRequest.class,
      responseType = yandex.cloud.api.organizationmanager.v1.OrganizationServiceOuterClass.ListOrganizationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.OrganizationServiceOuterClass.ListOrganizationsRequest,
      yandex.cloud.api.organizationmanager.v1.OrganizationServiceOuterClass.ListOrganizationsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.OrganizationServiceOuterClass.ListOrganizationsRequest, yandex.cloud.api.organizationmanager.v1.OrganizationServiceOuterClass.ListOrganizationsResponse> getListMethod;
    if ((getListMethod = OrganizationServiceGrpc.getListMethod) == null) {
      synchronized (OrganizationServiceGrpc.class) {
        if ((getListMethod = OrganizationServiceGrpc.getListMethod) == null) {
          OrganizationServiceGrpc.getListMethod = getListMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.OrganizationServiceOuterClass.ListOrganizationsRequest, yandex.cloud.api.organizationmanager.v1.OrganizationServiceOuterClass.ListOrganizationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.organizationmanager.v1.OrganizationService", "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.OrganizationServiceOuterClass.ListOrganizationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.OrganizationServiceOuterClass.ListOrganizationsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrganizationServiceMethodDescriptorSupplier("List"))
                  .build();
          }
        }
     }
     return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.OrganizationServiceOuterClass.UpdateOrganizationRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.organizationmanager.v1.OrganizationServiceOuterClass.UpdateOrganizationRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.OrganizationServiceOuterClass.UpdateOrganizationRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.OrganizationServiceOuterClass.UpdateOrganizationRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = OrganizationServiceGrpc.getUpdateMethod) == null) {
      synchronized (OrganizationServiceGrpc.class) {
        if ((getUpdateMethod = OrganizationServiceGrpc.getUpdateMethod) == null) {
          OrganizationServiceGrpc.getUpdateMethod = getUpdateMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.OrganizationServiceOuterClass.UpdateOrganizationRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.organizationmanager.v1.OrganizationService", "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.OrganizationServiceOuterClass.UpdateOrganizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new OrganizationServiceMethodDescriptorSupplier("Update"))
                  .build();
          }
        }
     }
     return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.OrganizationServiceOuterClass.ListOrganizationOperationsRequest,
      yandex.cloud.api.organizationmanager.v1.OrganizationServiceOuterClass.ListOrganizationOperationsResponse> getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = yandex.cloud.api.organizationmanager.v1.OrganizationServiceOuterClass.ListOrganizationOperationsRequest.class,
      responseType = yandex.cloud.api.organizationmanager.v1.OrganizationServiceOuterClass.ListOrganizationOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.OrganizationServiceOuterClass.ListOrganizationOperationsRequest,
      yandex.cloud.api.organizationmanager.v1.OrganizationServiceOuterClass.ListOrganizationOperationsResponse> getListOperationsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.OrganizationServiceOuterClass.ListOrganizationOperationsRequest, yandex.cloud.api.organizationmanager.v1.OrganizationServiceOuterClass.ListOrganizationOperationsResponse> getListOperationsMethod;
    if ((getListOperationsMethod = OrganizationServiceGrpc.getListOperationsMethod) == null) {
      synchronized (OrganizationServiceGrpc.class) {
        if ((getListOperationsMethod = OrganizationServiceGrpc.getListOperationsMethod) == null) {
          OrganizationServiceGrpc.getListOperationsMethod = getListOperationsMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.OrganizationServiceOuterClass.ListOrganizationOperationsRequest, yandex.cloud.api.organizationmanager.v1.OrganizationServiceOuterClass.ListOrganizationOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.organizationmanager.v1.OrganizationService", "ListOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.OrganizationServiceOuterClass.ListOrganizationOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.OrganizationServiceOuterClass.ListOrganizationOperationsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrganizationServiceMethodDescriptorSupplier("ListOperations"))
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
    if ((getListAccessBindingsMethod = OrganizationServiceGrpc.getListAccessBindingsMethod) == null) {
      synchronized (OrganizationServiceGrpc.class) {
        if ((getListAccessBindingsMethod = OrganizationServiceGrpc.getListAccessBindingsMethod) == null) {
          OrganizationServiceGrpc.getListAccessBindingsMethod = getListAccessBindingsMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.ListAccessBindingsRequest, yandex.cloud.api.access.Access.ListAccessBindingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.organizationmanager.v1.OrganizationService", "ListAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.ListAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.ListAccessBindingsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrganizationServiceMethodDescriptorSupplier("ListAccessBindings"))
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
    if ((getSetAccessBindingsMethod = OrganizationServiceGrpc.getSetAccessBindingsMethod) == null) {
      synchronized (OrganizationServiceGrpc.class) {
        if ((getSetAccessBindingsMethod = OrganizationServiceGrpc.getSetAccessBindingsMethod) == null) {
          OrganizationServiceGrpc.getSetAccessBindingsMethod = getSetAccessBindingsMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.SetAccessBindingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.organizationmanager.v1.OrganizationService", "SetAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.SetAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new OrganizationServiceMethodDescriptorSupplier("SetAccessBindings"))
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
    if ((getUpdateAccessBindingsMethod = OrganizationServiceGrpc.getUpdateAccessBindingsMethod) == null) {
      synchronized (OrganizationServiceGrpc.class) {
        if ((getUpdateAccessBindingsMethod = OrganizationServiceGrpc.getUpdateAccessBindingsMethod) == null) {
          OrganizationServiceGrpc.getUpdateAccessBindingsMethod = getUpdateAccessBindingsMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.UpdateAccessBindingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.organizationmanager.v1.OrganizationService", "UpdateAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.UpdateAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new OrganizationServiceMethodDescriptorSupplier("UpdateAccessBindings"))
                  .build();
          }
        }
     }
     return getUpdateAccessBindingsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OrganizationServiceStub newStub(io.grpc.Channel channel) {
    return new OrganizationServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OrganizationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new OrganizationServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OrganizationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new OrganizationServiceFutureStub(channel);
  }

  /**
   * <pre>
   * A set of methods for managing Organization resources.
   * </pre>
   */
  public static abstract class OrganizationServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified Organization resource.
     * To get the list of available Organization resources, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.organizationmanager.v1.OrganizationServiceOuterClass.GetOrganizationRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.OrganizationOuterClass.Organization> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of Organization resources.
     * </pre>
     */
    public void list(yandex.cloud.api.organizationmanager.v1.OrganizationServiceOuterClass.ListOrganizationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.OrganizationServiceOuterClass.ListOrganizationsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified organization.
     * </pre>
     */
    public void update(yandex.cloud.api.organizationmanager.v1.OrganizationServiceOuterClass.UpdateOrganizationRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified organization.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.organizationmanager.v1.OrganizationServiceOuterClass.ListOrganizationOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.OrganizationServiceOuterClass.ListOrganizationOperationsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists access bindings for the specified organization.
     * </pre>
     */
    public void listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.access.Access.ListAccessBindingsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListAccessBindingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sets access bindings for the specified organization.
     * </pre>
     */
    public void setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getSetAccessBindingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates access bindings for the specified organization.
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
                yandex.cloud.api.organizationmanager.v1.OrganizationServiceOuterClass.GetOrganizationRequest,
                yandex.cloud.api.organizationmanager.v1.OrganizationOuterClass.Organization>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.OrganizationServiceOuterClass.ListOrganizationsRequest,
                yandex.cloud.api.organizationmanager.v1.OrganizationServiceOuterClass.ListOrganizationsResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.OrganizationServiceOuterClass.UpdateOrganizationRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getListOperationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.OrganizationServiceOuterClass.ListOrganizationOperationsRequest,
                yandex.cloud.api.organizationmanager.v1.OrganizationServiceOuterClass.ListOrganizationOperationsResponse>(
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
   * A set of methods for managing Organization resources.
   * </pre>
   */
  public static final class OrganizationServiceStub extends io.grpc.stub.AbstractStub<OrganizationServiceStub> {
    private OrganizationServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OrganizationServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrganizationServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OrganizationServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified Organization resource.
     * To get the list of available Organization resources, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.organizationmanager.v1.OrganizationServiceOuterClass.GetOrganizationRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.OrganizationOuterClass.Organization> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of Organization resources.
     * </pre>
     */
    public void list(yandex.cloud.api.organizationmanager.v1.OrganizationServiceOuterClass.ListOrganizationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.OrganizationServiceOuterClass.ListOrganizationsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified organization.
     * </pre>
     */
    public void update(yandex.cloud.api.organizationmanager.v1.OrganizationServiceOuterClass.UpdateOrganizationRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified organization.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.organizationmanager.v1.OrganizationServiceOuterClass.ListOrganizationOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.OrganizationServiceOuterClass.ListOrganizationOperationsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists access bindings for the specified organization.
     * </pre>
     */
    public void listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.access.Access.ListAccessBindingsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sets access bindings for the specified organization.
     * </pre>
     */
    public void setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates access bindings for the specified organization.
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
   * A set of methods for managing Organization resources.
   * </pre>
   */
  public static final class OrganizationServiceBlockingStub extends io.grpc.stub.AbstractStub<OrganizationServiceBlockingStub> {
    private OrganizationServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OrganizationServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrganizationServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OrganizationServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified Organization resource.
     * To get the list of available Organization resources, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.organizationmanager.v1.OrganizationOuterClass.Organization get(yandex.cloud.api.organizationmanager.v1.OrganizationServiceOuterClass.GetOrganizationRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of Organization resources.
     * </pre>
     */
    public yandex.cloud.api.organizationmanager.v1.OrganizationServiceOuterClass.ListOrganizationsResponse list(yandex.cloud.api.organizationmanager.v1.OrganizationServiceOuterClass.ListOrganizationsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified organization.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.organizationmanager.v1.OrganizationServiceOuterClass.UpdateOrganizationRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists operations for the specified organization.
     * </pre>
     */
    public yandex.cloud.api.organizationmanager.v1.OrganizationServiceOuterClass.ListOrganizationOperationsResponse listOperations(yandex.cloud.api.organizationmanager.v1.OrganizationServiceOuterClass.ListOrganizationOperationsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists access bindings for the specified organization.
     * </pre>
     */
    public yandex.cloud.api.access.Access.ListAccessBindingsResponse listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListAccessBindingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets access bindings for the specified organization.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetAccessBindingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates access bindings for the specified organization.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation updateAccessBindings(yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateAccessBindingsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Organization resources.
   * </pre>
   */
  public static final class OrganizationServiceFutureStub extends io.grpc.stub.AbstractStub<OrganizationServiceFutureStub> {
    private OrganizationServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OrganizationServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrganizationServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OrganizationServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified Organization resource.
     * To get the list of available Organization resources, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.organizationmanager.v1.OrganizationOuterClass.Organization> get(
        yandex.cloud.api.organizationmanager.v1.OrganizationServiceOuterClass.GetOrganizationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of Organization resources.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.organizationmanager.v1.OrganizationServiceOuterClass.ListOrganizationsResponse> list(
        yandex.cloud.api.organizationmanager.v1.OrganizationServiceOuterClass.ListOrganizationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified organization.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.organizationmanager.v1.OrganizationServiceOuterClass.UpdateOrganizationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists operations for the specified organization.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.organizationmanager.v1.OrganizationServiceOuterClass.ListOrganizationOperationsResponse> listOperations(
        yandex.cloud.api.organizationmanager.v1.OrganizationServiceOuterClass.ListOrganizationOperationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists access bindings for the specified organization.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.access.Access.ListAccessBindingsResponse> listAccessBindings(
        yandex.cloud.api.access.Access.ListAccessBindingsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListAccessBindingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sets access bindings for the specified organization.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> setAccessBindings(
        yandex.cloud.api.access.Access.SetAccessBindingsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetAccessBindingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates access bindings for the specified organization.
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
  private static final int METHODID_UPDATE = 2;
  private static final int METHODID_LIST_OPERATIONS = 3;
  private static final int METHODID_LIST_ACCESS_BINDINGS = 4;
  private static final int METHODID_SET_ACCESS_BINDINGS = 5;
  private static final int METHODID_UPDATE_ACCESS_BINDINGS = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final OrganizationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(OrganizationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.organizationmanager.v1.OrganizationServiceOuterClass.GetOrganizationRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.OrganizationOuterClass.Organization>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.organizationmanager.v1.OrganizationServiceOuterClass.ListOrganizationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.OrganizationServiceOuterClass.ListOrganizationsResponse>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.organizationmanager.v1.OrganizationServiceOuterClass.UpdateOrganizationRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((yandex.cloud.api.organizationmanager.v1.OrganizationServiceOuterClass.ListOrganizationOperationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.OrganizationServiceOuterClass.ListOrganizationOperationsResponse>) responseObserver);
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

  private static abstract class OrganizationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OrganizationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.organizationmanager.v1.OrganizationServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("OrganizationService");
    }
  }

  private static final class OrganizationServiceFileDescriptorSupplier
      extends OrganizationServiceBaseDescriptorSupplier {
    OrganizationServiceFileDescriptorSupplier() {}
  }

  private static final class OrganizationServiceMethodDescriptorSupplier
      extends OrganizationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    OrganizationServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (OrganizationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OrganizationServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getUpdateMethod())
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
