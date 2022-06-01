package yandex.cloud.api.organizationmanager.v1.saml;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing certificates.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/organizationmanager/v1/saml/certificate_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CertificateServiceGrpc {

  private CertificateServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.organizationmanager.v1.saml.CertificateService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.GetCertificateRequest,
      yandex.cloud.api.organizationmanager.v1.saml.CertificateOuterClass.Certificate> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.GetCertificateRequest.class,
      responseType = yandex.cloud.api.organizationmanager.v1.saml.CertificateOuterClass.Certificate.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.GetCertificateRequest,
      yandex.cloud.api.organizationmanager.v1.saml.CertificateOuterClass.Certificate> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.GetCertificateRequest, yandex.cloud.api.organizationmanager.v1.saml.CertificateOuterClass.Certificate> getGetMethod;
    if ((getGetMethod = CertificateServiceGrpc.getGetMethod) == null) {
      synchronized (CertificateServiceGrpc.class) {
        if ((getGetMethod = CertificateServiceGrpc.getGetMethod) == null) {
          CertificateServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.GetCertificateRequest, yandex.cloud.api.organizationmanager.v1.saml.CertificateOuterClass.Certificate>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.GetCertificateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.saml.CertificateOuterClass.Certificate.getDefaultInstance()))
              .setSchemaDescriptor(new CertificateServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.ListCertificatesRequest,
      yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.ListCertificatesResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.ListCertificatesRequest.class,
      responseType = yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.ListCertificatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.ListCertificatesRequest,
      yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.ListCertificatesResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.ListCertificatesRequest, yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.ListCertificatesResponse> getListMethod;
    if ((getListMethod = CertificateServiceGrpc.getListMethod) == null) {
      synchronized (CertificateServiceGrpc.class) {
        if ((getListMethod = CertificateServiceGrpc.getListMethod) == null) {
          CertificateServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.ListCertificatesRequest, yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.ListCertificatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.ListCertificatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.ListCertificatesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CertificateServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.CreateCertificateRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.CreateCertificateRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.CreateCertificateRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.CreateCertificateRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = CertificateServiceGrpc.getCreateMethod) == null) {
      synchronized (CertificateServiceGrpc.class) {
        if ((getCreateMethod = CertificateServiceGrpc.getCreateMethod) == null) {
          CertificateServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.CreateCertificateRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.CreateCertificateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new CertificateServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.UpdateCertificateRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.UpdateCertificateRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.UpdateCertificateRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.UpdateCertificateRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = CertificateServiceGrpc.getUpdateMethod) == null) {
      synchronized (CertificateServiceGrpc.class) {
        if ((getUpdateMethod = CertificateServiceGrpc.getUpdateMethod) == null) {
          CertificateServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.UpdateCertificateRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.UpdateCertificateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new CertificateServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.DeleteCertificateRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.DeleteCertificateRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.DeleteCertificateRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.DeleteCertificateRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = CertificateServiceGrpc.getDeleteMethod) == null) {
      synchronized (CertificateServiceGrpc.class) {
        if ((getDeleteMethod = CertificateServiceGrpc.getDeleteMethod) == null) {
          CertificateServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.DeleteCertificateRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.DeleteCertificateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new CertificateServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.ListCertificateOperationsRequest,
      yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.ListCertificateOperationsResponse> getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.ListCertificateOperationsRequest.class,
      responseType = yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.ListCertificateOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.ListCertificateOperationsRequest,
      yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.ListCertificateOperationsResponse> getListOperationsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.ListCertificateOperationsRequest, yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.ListCertificateOperationsResponse> getListOperationsMethod;
    if ((getListOperationsMethod = CertificateServiceGrpc.getListOperationsMethod) == null) {
      synchronized (CertificateServiceGrpc.class) {
        if ((getListOperationsMethod = CertificateServiceGrpc.getListOperationsMethod) == null) {
          CertificateServiceGrpc.getListOperationsMethod = getListOperationsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.ListCertificateOperationsRequest, yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.ListCertificateOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.ListCertificateOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.ListCertificateOperationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CertificateServiceMethodDescriptorSupplier("ListOperations"))
              .build();
        }
      }
    }
    return getListOperationsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CertificateServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CertificateServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CertificateServiceStub>() {
        @java.lang.Override
        public CertificateServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CertificateServiceStub(channel, callOptions);
        }
      };
    return CertificateServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CertificateServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CertificateServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CertificateServiceBlockingStub>() {
        @java.lang.Override
        public CertificateServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CertificateServiceBlockingStub(channel, callOptions);
        }
      };
    return CertificateServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CertificateServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CertificateServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CertificateServiceFutureStub>() {
        @java.lang.Override
        public CertificateServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CertificateServiceFutureStub(channel, callOptions);
        }
      };
    return CertificateServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing certificates.
   * </pre>
   */
  public static abstract class CertificateServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified certificate.
     * To get the list of available certificates, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.GetCertificateRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.saml.CertificateOuterClass.Certificate> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of certificates in the specified federation.
     * </pre>
     */
    public void list(yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.ListCertificatesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.ListCertificatesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a certificate in the specified federation.
     * </pre>
     */
    public void create(yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.CreateCertificateRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified certificate.
     * </pre>
     */
    public void update(yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.UpdateCertificateRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified certificate.
     * </pre>
     */
    public void delete(yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.DeleteCertificateRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified certificate.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.ListCertificateOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.ListCertificateOperationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.GetCertificateRequest,
                yandex.cloud.api.organizationmanager.v1.saml.CertificateOuterClass.Certificate>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.ListCertificatesRequest,
                yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.ListCertificatesResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.CreateCertificateRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.UpdateCertificateRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.DeleteCertificateRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListOperationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.ListCertificateOperationsRequest,
                yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.ListCertificateOperationsResponse>(
                  this, METHODID_LIST_OPERATIONS)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing certificates.
   * </pre>
   */
  public static final class CertificateServiceStub extends io.grpc.stub.AbstractAsyncStub<CertificateServiceStub> {
    private CertificateServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CertificateServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CertificateServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified certificate.
     * To get the list of available certificates, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.GetCertificateRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.saml.CertificateOuterClass.Certificate> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of certificates in the specified federation.
     * </pre>
     */
    public void list(yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.ListCertificatesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.ListCertificatesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a certificate in the specified federation.
     * </pre>
     */
    public void create(yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.CreateCertificateRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified certificate.
     * </pre>
     */
    public void update(yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.UpdateCertificateRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified certificate.
     * </pre>
     */
    public void delete(yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.DeleteCertificateRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified certificate.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.ListCertificateOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.ListCertificateOperationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing certificates.
   * </pre>
   */
  public static final class CertificateServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CertificateServiceBlockingStub> {
    private CertificateServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CertificateServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CertificateServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified certificate.
     * To get the list of available certificates, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.organizationmanager.v1.saml.CertificateOuterClass.Certificate get(yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.GetCertificateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of certificates in the specified federation.
     * </pre>
     */
    public yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.ListCertificatesResponse list(yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.ListCertificatesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a certificate in the specified federation.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.CreateCertificateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified certificate.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.UpdateCertificateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified certificate.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.DeleteCertificateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists operations for the specified certificate.
     * </pre>
     */
    public yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.ListCertificateOperationsResponse listOperations(yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.ListCertificateOperationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing certificates.
   * </pre>
   */
  public static final class CertificateServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CertificateServiceFutureStub> {
    private CertificateServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CertificateServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CertificateServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified certificate.
     * To get the list of available certificates, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.organizationmanager.v1.saml.CertificateOuterClass.Certificate> get(
        yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.GetCertificateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of certificates in the specified federation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.ListCertificatesResponse> list(
        yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.ListCertificatesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a certificate in the specified federation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.CreateCertificateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified certificate.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.UpdateCertificateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified certificate.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.DeleteCertificateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists operations for the specified certificate.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.ListCertificateOperationsResponse> listOperations(
        yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.ListCertificateOperationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_DELETE = 4;
  private static final int METHODID_LIST_OPERATIONS = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CertificateServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CertificateServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.GetCertificateRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.saml.CertificateOuterClass.Certificate>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.ListCertificatesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.ListCertificatesResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.CreateCertificateRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.UpdateCertificateRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.DeleteCertificateRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.ListCertificateOperationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.ListCertificateOperationsResponse>) responseObserver);
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

  private static abstract class CertificateServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CertificateServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.organizationmanager.v1.saml.CertificateServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CertificateService");
    }
  }

  private static final class CertificateServiceFileDescriptorSupplier
      extends CertificateServiceBaseDescriptorSupplier {
    CertificateServiceFileDescriptorSupplier() {}
  }

  private static final class CertificateServiceMethodDescriptorSupplier
      extends CertificateServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CertificateServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CertificateServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CertificateServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getListOperationsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
