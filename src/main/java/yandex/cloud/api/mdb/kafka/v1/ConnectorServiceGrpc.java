package yandex.cloud.api.mdb.kafka.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing Apache Kafka® connectors.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/mdb/kafka/v1/connector_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ConnectorServiceGrpc {

  private ConnectorServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.mdb.kafka.v1.ConnectorService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.GetConnectorRequest,
      yandex.cloud.api.mdb.kafka.v1.ConnectorOuterClass.Connector> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.GetConnectorRequest.class,
      responseType = yandex.cloud.api.mdb.kafka.v1.ConnectorOuterClass.Connector.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.GetConnectorRequest,
      yandex.cloud.api.mdb.kafka.v1.ConnectorOuterClass.Connector> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.GetConnectorRequest, yandex.cloud.api.mdb.kafka.v1.ConnectorOuterClass.Connector> getGetMethod;
    if ((getGetMethod = ConnectorServiceGrpc.getGetMethod) == null) {
      synchronized (ConnectorServiceGrpc.class) {
        if ((getGetMethod = ConnectorServiceGrpc.getGetMethod) == null) {
          ConnectorServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.GetConnectorRequest, yandex.cloud.api.mdb.kafka.v1.ConnectorOuterClass.Connector>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.GetConnectorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.kafka.v1.ConnectorOuterClass.Connector.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectorServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.ListConnectorsRequest,
      yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.ListConnectorsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.ListConnectorsRequest.class,
      responseType = yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.ListConnectorsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.ListConnectorsRequest,
      yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.ListConnectorsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.ListConnectorsRequest, yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.ListConnectorsResponse> getListMethod;
    if ((getListMethod = ConnectorServiceGrpc.getListMethod) == null) {
      synchronized (ConnectorServiceGrpc.class) {
        if ((getListMethod = ConnectorServiceGrpc.getListMethod) == null) {
          ConnectorServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.ListConnectorsRequest, yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.ListConnectorsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.ListConnectorsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.ListConnectorsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectorServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.CreateConnectorRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.CreateConnectorRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.CreateConnectorRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.CreateConnectorRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = ConnectorServiceGrpc.getCreateMethod) == null) {
      synchronized (ConnectorServiceGrpc.class) {
        if ((getCreateMethod = ConnectorServiceGrpc.getCreateMethod) == null) {
          ConnectorServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.CreateConnectorRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.CreateConnectorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectorServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.UpdateConnectorRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.UpdateConnectorRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.UpdateConnectorRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.UpdateConnectorRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = ConnectorServiceGrpc.getUpdateMethod) == null) {
      synchronized (ConnectorServiceGrpc.class) {
        if ((getUpdateMethod = ConnectorServiceGrpc.getUpdateMethod) == null) {
          ConnectorServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.UpdateConnectorRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.UpdateConnectorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectorServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.DeleteConnectorRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.DeleteConnectorRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.DeleteConnectorRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.DeleteConnectorRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = ConnectorServiceGrpc.getDeleteMethod) == null) {
      synchronized (ConnectorServiceGrpc.class) {
        if ((getDeleteMethod = ConnectorServiceGrpc.getDeleteMethod) == null) {
          ConnectorServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.DeleteConnectorRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.DeleteConnectorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectorServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.ResumeConnectorRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getResumeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Resume",
      requestType = yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.ResumeConnectorRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.ResumeConnectorRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getResumeMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.ResumeConnectorRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getResumeMethod;
    if ((getResumeMethod = ConnectorServiceGrpc.getResumeMethod) == null) {
      synchronized (ConnectorServiceGrpc.class) {
        if ((getResumeMethod = ConnectorServiceGrpc.getResumeMethod) == null) {
          ConnectorServiceGrpc.getResumeMethod = getResumeMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.ResumeConnectorRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Resume"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.ResumeConnectorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectorServiceMethodDescriptorSupplier("Resume"))
              .build();
        }
      }
    }
    return getResumeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.PauseConnectorRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getPauseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Pause",
      requestType = yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.PauseConnectorRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.PauseConnectorRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getPauseMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.PauseConnectorRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getPauseMethod;
    if ((getPauseMethod = ConnectorServiceGrpc.getPauseMethod) == null) {
      synchronized (ConnectorServiceGrpc.class) {
        if ((getPauseMethod = ConnectorServiceGrpc.getPauseMethod) == null) {
          ConnectorServiceGrpc.getPauseMethod = getPauseMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.PauseConnectorRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Pause"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.PauseConnectorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectorServiceMethodDescriptorSupplier("Pause"))
              .build();
        }
      }
    }
    return getPauseMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ConnectorServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConnectorServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConnectorServiceStub>() {
        @java.lang.Override
        public ConnectorServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConnectorServiceStub(channel, callOptions);
        }
      };
    return ConnectorServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ConnectorServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConnectorServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConnectorServiceBlockingStub>() {
        @java.lang.Override
        public ConnectorServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConnectorServiceBlockingStub(channel, callOptions);
        }
      };
    return ConnectorServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ConnectorServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConnectorServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConnectorServiceFutureStub>() {
        @java.lang.Override
        public ConnectorServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConnectorServiceFutureStub(channel, callOptions);
        }
      };
    return ConnectorServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing Apache Kafka® connectors.
   * </pre>
   */
  public static abstract class ConnectorServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns information about an Apache Kafka® connector.
     * </pre>
     */
    public void get(yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.GetConnectorRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.kafka.v1.ConnectorOuterClass.Connector> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of Apache Kafka® connectors in a cluster.
     * </pre>
     */
    public void list(yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.ListConnectorsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.ListConnectorsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a new Apache Kafka® connector in a cluster.
     * </pre>
     */
    public void create(yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.CreateConnectorRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates an Apache Kafka® connector.
     * </pre>
     */
    public void update(yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.UpdateConnectorRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes an Apache Kafka® connector.
     * </pre>
     */
    public void delete(yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.DeleteConnectorRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Resumes an Apache Kafka® connector.
     * </pre>
     */
    public void resume(yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.ResumeConnectorRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResumeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Pauses an Apache Kafka® connector.
     * </pre>
     */
    public void pause(yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.PauseConnectorRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPauseMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.GetConnectorRequest,
                yandex.cloud.api.mdb.kafka.v1.ConnectorOuterClass.Connector>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.ListConnectorsRequest,
                yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.ListConnectorsResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.CreateConnectorRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.UpdateConnectorRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.DeleteConnectorRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getResumeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.ResumeConnectorRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_RESUME)))
          .addMethod(
            getPauseMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.PauseConnectorRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_PAUSE)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing Apache Kafka® connectors.
   * </pre>
   */
  public static final class ConnectorServiceStub extends io.grpc.stub.AbstractAsyncStub<ConnectorServiceStub> {
    private ConnectorServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConnectorServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConnectorServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns information about an Apache Kafka® connector.
     * </pre>
     */
    public void get(yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.GetConnectorRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.kafka.v1.ConnectorOuterClass.Connector> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of Apache Kafka® connectors in a cluster.
     * </pre>
     */
    public void list(yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.ListConnectorsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.ListConnectorsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a new Apache Kafka® connector in a cluster.
     * </pre>
     */
    public void create(yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.CreateConnectorRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates an Apache Kafka® connector.
     * </pre>
     */
    public void update(yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.UpdateConnectorRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes an Apache Kafka® connector.
     * </pre>
     */
    public void delete(yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.DeleteConnectorRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Resumes an Apache Kafka® connector.
     * </pre>
     */
    public void resume(yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.ResumeConnectorRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResumeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Pauses an Apache Kafka® connector.
     * </pre>
     */
    public void pause(yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.PauseConnectorRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPauseMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Apache Kafka® connectors.
   * </pre>
   */
  public static final class ConnectorServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ConnectorServiceBlockingStub> {
    private ConnectorServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConnectorServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConnectorServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns information about an Apache Kafka® connector.
     * </pre>
     */
    public yandex.cloud.api.mdb.kafka.v1.ConnectorOuterClass.Connector get(yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.GetConnectorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of Apache Kafka® connectors in a cluster.
     * </pre>
     */
    public yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.ListConnectorsResponse list(yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.ListConnectorsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new Apache Kafka® connector in a cluster.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.CreateConnectorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates an Apache Kafka® connector.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.UpdateConnectorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes an Apache Kafka® connector.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.DeleteConnectorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Resumes an Apache Kafka® connector.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation resume(yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.ResumeConnectorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResumeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Pauses an Apache Kafka® connector.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation pause(yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.PauseConnectorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPauseMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Apache Kafka® connectors.
   * </pre>
   */
  public static final class ConnectorServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ConnectorServiceFutureStub> {
    private ConnectorServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConnectorServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConnectorServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns information about an Apache Kafka® connector.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.mdb.kafka.v1.ConnectorOuterClass.Connector> get(
        yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.GetConnectorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of Apache Kafka® connectors in a cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.ListConnectorsResponse> list(
        yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.ListConnectorsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a new Apache Kafka® connector in a cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.CreateConnectorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates an Apache Kafka® connector.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.UpdateConnectorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes an Apache Kafka® connector.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.DeleteConnectorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Resumes an Apache Kafka® connector.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> resume(
        yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.ResumeConnectorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResumeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Pauses an Apache Kafka® connector.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> pause(
        yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.PauseConnectorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPauseMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_DELETE = 4;
  private static final int METHODID_RESUME = 5;
  private static final int METHODID_PAUSE = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ConnectorServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ConnectorServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.GetConnectorRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.kafka.v1.ConnectorOuterClass.Connector>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.ListConnectorsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.ListConnectorsResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.CreateConnectorRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.UpdateConnectorRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.DeleteConnectorRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_RESUME:
          serviceImpl.resume((yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.ResumeConnectorRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_PAUSE:
          serviceImpl.pause((yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.PauseConnectorRequest) request,
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

  private static abstract class ConnectorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ConnectorServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.mdb.kafka.v1.ConnectorServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ConnectorService");
    }
  }

  private static final class ConnectorServiceFileDescriptorSupplier
      extends ConnectorServiceBaseDescriptorSupplier {
    ConnectorServiceFileDescriptorSupplier() {}
  }

  private static final class ConnectorServiceMethodDescriptorSupplier
      extends ConnectorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ConnectorServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ConnectorServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ConnectorServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getResumeMethod())
              .addMethod(getPauseMethod())
              .build();
        }
      }
    }
    return result;
  }
}
