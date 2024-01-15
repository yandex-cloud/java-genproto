package yandex.cloud.api.mdb.greenplum.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing Greenplum clusters.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/mdb/greenplum/v1/hba_rule_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class HBARuleServiceGrpc {

  private HBARuleServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.mdb.greenplum.v1.HBARuleService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.ListHBARulesRequest,
      yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.ListHBARulesResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.ListHBARulesRequest.class,
      responseType = yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.ListHBARulesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.ListHBARulesRequest,
      yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.ListHBARulesResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.ListHBARulesRequest, yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.ListHBARulesResponse> getListMethod;
    if ((getListMethod = HBARuleServiceGrpc.getListMethod) == null) {
      synchronized (HBARuleServiceGrpc.class) {
        if ((getListMethod = HBARuleServiceGrpc.getListMethod) == null) {
          HBARuleServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.ListHBARulesRequest, yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.ListHBARulesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.ListHBARulesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.ListHBARulesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HBARuleServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.ListHBARulesAtRevisionRequest,
      yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.ListHBARulesResponse> getListAtRevisionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAtRevision",
      requestType = yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.ListHBARulesAtRevisionRequest.class,
      responseType = yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.ListHBARulesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.ListHBARulesAtRevisionRequest,
      yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.ListHBARulesResponse> getListAtRevisionMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.ListHBARulesAtRevisionRequest, yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.ListHBARulesResponse> getListAtRevisionMethod;
    if ((getListAtRevisionMethod = HBARuleServiceGrpc.getListAtRevisionMethod) == null) {
      synchronized (HBARuleServiceGrpc.class) {
        if ((getListAtRevisionMethod = HBARuleServiceGrpc.getListAtRevisionMethod) == null) {
          HBARuleServiceGrpc.getListAtRevisionMethod = getListAtRevisionMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.ListHBARulesAtRevisionRequest, yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.ListHBARulesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAtRevision"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.ListHBARulesAtRevisionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.ListHBARulesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HBARuleServiceMethodDescriptorSupplier("ListAtRevision"))
              .build();
        }
      }
    }
    return getListAtRevisionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.CreateHBARuleRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.CreateHBARuleRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.CreateHBARuleRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.CreateHBARuleRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = HBARuleServiceGrpc.getCreateMethod) == null) {
      synchronized (HBARuleServiceGrpc.class) {
        if ((getCreateMethod = HBARuleServiceGrpc.getCreateMethod) == null) {
          HBARuleServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.CreateHBARuleRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.CreateHBARuleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new HBARuleServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.UpdateHBARuleRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.UpdateHBARuleRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.UpdateHBARuleRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.UpdateHBARuleRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = HBARuleServiceGrpc.getUpdateMethod) == null) {
      synchronized (HBARuleServiceGrpc.class) {
        if ((getUpdateMethod = HBARuleServiceGrpc.getUpdateMethod) == null) {
          HBARuleServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.UpdateHBARuleRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.UpdateHBARuleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new HBARuleServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.DeleteHBARuleRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.DeleteHBARuleRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.DeleteHBARuleRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.DeleteHBARuleRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = HBARuleServiceGrpc.getDeleteMethod) == null) {
      synchronized (HBARuleServiceGrpc.class) {
        if ((getDeleteMethod = HBARuleServiceGrpc.getDeleteMethod) == null) {
          HBARuleServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.DeleteHBARuleRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.DeleteHBARuleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new HBARuleServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.BatchUpdateHBARulesRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getBatchUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchUpdate",
      requestType = yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.BatchUpdateHBARulesRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.BatchUpdateHBARulesRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getBatchUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.BatchUpdateHBARulesRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getBatchUpdateMethod;
    if ((getBatchUpdateMethod = HBARuleServiceGrpc.getBatchUpdateMethod) == null) {
      synchronized (HBARuleServiceGrpc.class) {
        if ((getBatchUpdateMethod = HBARuleServiceGrpc.getBatchUpdateMethod) == null) {
          HBARuleServiceGrpc.getBatchUpdateMethod = getBatchUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.BatchUpdateHBARulesRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.BatchUpdateHBARulesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new HBARuleServiceMethodDescriptorSupplier("BatchUpdate"))
              .build();
        }
      }
    }
    return getBatchUpdateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HBARuleServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HBARuleServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HBARuleServiceStub>() {
        @java.lang.Override
        public HBARuleServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HBARuleServiceStub(channel, callOptions);
        }
      };
    return HBARuleServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HBARuleServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HBARuleServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HBARuleServiceBlockingStub>() {
        @java.lang.Override
        public HBARuleServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HBARuleServiceBlockingStub(channel, callOptions);
        }
      };
    return HBARuleServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HBARuleServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HBARuleServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HBARuleServiceFutureStub>() {
        @java.lang.Override
        public HBARuleServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HBARuleServiceFutureStub(channel, callOptions);
        }
      };
    return HBARuleServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing Greenplum clusters.
   * </pre>
   */
  public static abstract class HBARuleServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Retrieves a list of HBA rules for Greenplum clusters.
     * </pre>
     */
    public void list(yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.ListHBARulesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.ListHBARulesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves a list of HBA rules for Greenplum clusters for particular revision.
     * </pre>
     */
    public void listAtRevision(yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.ListHBARulesAtRevisionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.ListHBARulesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAtRevisionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create single HBA rule for the specified Greenplum cluster to the end of HBA rules list.
     * </pre>
     */
    public void create(yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.CreateHBARuleRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update specified HBA rule for the specified Greenplum cluster without changind it order.
     * </pre>
     */
    public void update(yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.UpdateHBARuleRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete specified HBA rule for the specified Greenplum cluster.
     * </pre>
     */
    public void delete(yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.DeleteHBARuleRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Modifies all HBA rules for the specified Greenplum cluster.
     * </pre>
     */
    public void batchUpdate(yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.BatchUpdateHBARulesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchUpdateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.ListHBARulesRequest,
                yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.ListHBARulesResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getListAtRevisionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.ListHBARulesAtRevisionRequest,
                yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.ListHBARulesResponse>(
                  this, METHODID_LIST_AT_REVISION)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.CreateHBARuleRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.UpdateHBARuleRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.DeleteHBARuleRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getBatchUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.BatchUpdateHBARulesRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_BATCH_UPDATE)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing Greenplum clusters.
   * </pre>
   */
  public static final class HBARuleServiceStub extends io.grpc.stub.AbstractAsyncStub<HBARuleServiceStub> {
    private HBARuleServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HBARuleServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HBARuleServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves a list of HBA rules for Greenplum clusters.
     * </pre>
     */
    public void list(yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.ListHBARulesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.ListHBARulesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves a list of HBA rules for Greenplum clusters for particular revision.
     * </pre>
     */
    public void listAtRevision(yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.ListHBARulesAtRevisionRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.ListHBARulesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAtRevisionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create single HBA rule for the specified Greenplum cluster to the end of HBA rules list.
     * </pre>
     */
    public void create(yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.CreateHBARuleRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update specified HBA rule for the specified Greenplum cluster without changind it order.
     * </pre>
     */
    public void update(yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.UpdateHBARuleRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete specified HBA rule for the specified Greenplum cluster.
     * </pre>
     */
    public void delete(yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.DeleteHBARuleRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Modifies all HBA rules for the specified Greenplum cluster.
     * </pre>
     */
    public void batchUpdate(yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.BatchUpdateHBARulesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchUpdateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Greenplum clusters.
   * </pre>
   */
  public static final class HBARuleServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<HBARuleServiceBlockingStub> {
    private HBARuleServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HBARuleServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HBARuleServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves a list of HBA rules for Greenplum clusters.
     * </pre>
     */
    public yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.ListHBARulesResponse list(yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.ListHBARulesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves a list of HBA rules for Greenplum clusters for particular revision.
     * </pre>
     */
    public yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.ListHBARulesResponse listAtRevision(yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.ListHBARulesAtRevisionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAtRevisionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create single HBA rule for the specified Greenplum cluster to the end of HBA rules list.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.CreateHBARuleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update specified HBA rule for the specified Greenplum cluster without changind it order.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.UpdateHBARuleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete specified HBA rule for the specified Greenplum cluster.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.DeleteHBARuleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Modifies all HBA rules for the specified Greenplum cluster.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation batchUpdate(yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.BatchUpdateHBARulesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchUpdateMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Greenplum clusters.
   * </pre>
   */
  public static final class HBARuleServiceFutureStub extends io.grpc.stub.AbstractFutureStub<HBARuleServiceFutureStub> {
    private HBARuleServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HBARuleServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HBARuleServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves a list of HBA rules for Greenplum clusters.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.ListHBARulesResponse> list(
        yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.ListHBARulesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves a list of HBA rules for Greenplum clusters for particular revision.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.ListHBARulesResponse> listAtRevision(
        yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.ListHBARulesAtRevisionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAtRevisionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create single HBA rule for the specified Greenplum cluster to the end of HBA rules list.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.CreateHBARuleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update specified HBA rule for the specified Greenplum cluster without changind it order.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.UpdateHBARuleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete specified HBA rule for the specified Greenplum cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.DeleteHBARuleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Modifies all HBA rules for the specified Greenplum cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> batchUpdate(
        yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.BatchUpdateHBARulesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchUpdateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST = 0;
  private static final int METHODID_LIST_AT_REVISION = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_DELETE = 4;
  private static final int METHODID_BATCH_UPDATE = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HBARuleServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HBARuleServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.ListHBARulesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.ListHBARulesResponse>) responseObserver);
          break;
        case METHODID_LIST_AT_REVISION:
          serviceImpl.listAtRevision((yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.ListHBARulesAtRevisionRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.ListHBARulesResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.CreateHBARuleRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.UpdateHBARuleRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.DeleteHBARuleRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_BATCH_UPDATE:
          serviceImpl.batchUpdate((yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.BatchUpdateHBARulesRequest) request,
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

  private static abstract class HBARuleServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HBARuleServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.mdb.greenplum.v1.HbaRuleService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HBARuleService");
    }
  }

  private static final class HBARuleServiceFileDescriptorSupplier
      extends HBARuleServiceBaseDescriptorSupplier {
    HBARuleServiceFileDescriptorSupplier() {}
  }

  private static final class HBARuleServiceMethodDescriptorSupplier
      extends HBARuleServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HBARuleServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (HBARuleServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HBARuleServiceFileDescriptorSupplier())
              .addMethod(getListMethod())
              .addMethod(getListAtRevisionMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getBatchUpdateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
