package yandex.cloud.api.organizationmanager.v1.idp.application.saml;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing signature certificates for SAML applications.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/organizationmanager/v1/idp/application/saml/signature_certificate_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SignatureCertificateServiceGrpc {

  private SignatureCertificateServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.organizationmanager.v1.idp.application.saml.SignatureCertificateService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateServiceOuterClass.GetSignatureCertificateRequest,
      yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateOuterClass.SignatureCertificate> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateServiceOuterClass.GetSignatureCertificateRequest.class,
      responseType = yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateOuterClass.SignatureCertificate.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateServiceOuterClass.GetSignatureCertificateRequest,
      yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateOuterClass.SignatureCertificate> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateServiceOuterClass.GetSignatureCertificateRequest, yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateOuterClass.SignatureCertificate> getGetMethod;
    if ((getGetMethod = SignatureCertificateServiceGrpc.getGetMethod) == null) {
      synchronized (SignatureCertificateServiceGrpc.class) {
        if ((getGetMethod = SignatureCertificateServiceGrpc.getGetMethod) == null) {
          SignatureCertificateServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateServiceOuterClass.GetSignatureCertificateRequest, yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateOuterClass.SignatureCertificate>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateServiceOuterClass.GetSignatureCertificateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateOuterClass.SignatureCertificate.getDefaultInstance()))
              .setSchemaDescriptor(new SignatureCertificateServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateServiceOuterClass.ListSignatureCertificatesRequest,
      yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateServiceOuterClass.ListSignatureCertificatesResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateServiceOuterClass.ListSignatureCertificatesRequest.class,
      responseType = yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateServiceOuterClass.ListSignatureCertificatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateServiceOuterClass.ListSignatureCertificatesRequest,
      yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateServiceOuterClass.ListSignatureCertificatesResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateServiceOuterClass.ListSignatureCertificatesRequest, yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateServiceOuterClass.ListSignatureCertificatesResponse> getListMethod;
    if ((getListMethod = SignatureCertificateServiceGrpc.getListMethod) == null) {
      synchronized (SignatureCertificateServiceGrpc.class) {
        if ((getListMethod = SignatureCertificateServiceGrpc.getListMethod) == null) {
          SignatureCertificateServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateServiceOuterClass.ListSignatureCertificatesRequest, yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateServiceOuterClass.ListSignatureCertificatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateServiceOuterClass.ListSignatureCertificatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateServiceOuterClass.ListSignatureCertificatesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SignatureCertificateServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateServiceOuterClass.CreateSignatureCertificateRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateServiceOuterClass.CreateSignatureCertificateRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateServiceOuterClass.CreateSignatureCertificateRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateServiceOuterClass.CreateSignatureCertificateRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = SignatureCertificateServiceGrpc.getCreateMethod) == null) {
      synchronized (SignatureCertificateServiceGrpc.class) {
        if ((getCreateMethod = SignatureCertificateServiceGrpc.getCreateMethod) == null) {
          SignatureCertificateServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateServiceOuterClass.CreateSignatureCertificateRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateServiceOuterClass.CreateSignatureCertificateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new SignatureCertificateServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateServiceOuterClass.UpdateSignatureCertificateRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateServiceOuterClass.UpdateSignatureCertificateRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateServiceOuterClass.UpdateSignatureCertificateRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateServiceOuterClass.UpdateSignatureCertificateRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = SignatureCertificateServiceGrpc.getUpdateMethod) == null) {
      synchronized (SignatureCertificateServiceGrpc.class) {
        if ((getUpdateMethod = SignatureCertificateServiceGrpc.getUpdateMethod) == null) {
          SignatureCertificateServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateServiceOuterClass.UpdateSignatureCertificateRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateServiceOuterClass.UpdateSignatureCertificateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new SignatureCertificateServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateServiceOuterClass.DeleteSignatureCertificateRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateServiceOuterClass.DeleteSignatureCertificateRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateServiceOuterClass.DeleteSignatureCertificateRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateServiceOuterClass.DeleteSignatureCertificateRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = SignatureCertificateServiceGrpc.getDeleteMethod) == null) {
      synchronized (SignatureCertificateServiceGrpc.class) {
        if ((getDeleteMethod = SignatureCertificateServiceGrpc.getDeleteMethod) == null) {
          SignatureCertificateServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateServiceOuterClass.DeleteSignatureCertificateRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateServiceOuterClass.DeleteSignatureCertificateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new SignatureCertificateServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SignatureCertificateServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SignatureCertificateServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SignatureCertificateServiceStub>() {
        @java.lang.Override
        public SignatureCertificateServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SignatureCertificateServiceStub(channel, callOptions);
        }
      };
    return SignatureCertificateServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SignatureCertificateServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SignatureCertificateServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SignatureCertificateServiceBlockingStub>() {
        @java.lang.Override
        public SignatureCertificateServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SignatureCertificateServiceBlockingStub(channel, callOptions);
        }
      };
    return SignatureCertificateServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SignatureCertificateServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SignatureCertificateServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SignatureCertificateServiceFutureStub>() {
        @java.lang.Override
        public SignatureCertificateServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SignatureCertificateServiceFutureStub(channel, callOptions);
        }
      };
    return SignatureCertificateServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing signature certificates for SAML applications.
   * </pre>
   */
  public static abstract class SignatureCertificateServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified signature certificate.
     * To get the list of available certificates, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateServiceOuterClass.GetSignatureCertificateRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateOuterClass.SignatureCertificate> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of signature certificates for the specified SAML application.
     * </pre>
     */
    public void list(yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateServiceOuterClass.ListSignatureCertificatesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateServiceOuterClass.ListSignatureCertificatesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a new signature certificate for the specified SAML application.
     * </pre>
     */
    public void create(yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateServiceOuterClass.CreateSignatureCertificateRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified signature certificate.
     * </pre>
     */
    public void update(yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateServiceOuterClass.UpdateSignatureCertificateRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified signature certificate.
     * </pre>
     */
    public void delete(yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateServiceOuterClass.DeleteSignatureCertificateRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateServiceOuterClass.GetSignatureCertificateRequest,
                yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateOuterClass.SignatureCertificate>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateServiceOuterClass.ListSignatureCertificatesRequest,
                yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateServiceOuterClass.ListSignatureCertificatesResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateServiceOuterClass.CreateSignatureCertificateRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateServiceOuterClass.UpdateSignatureCertificateRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateServiceOuterClass.DeleteSignatureCertificateRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing signature certificates for SAML applications.
   * </pre>
   */
  public static final class SignatureCertificateServiceStub extends io.grpc.stub.AbstractAsyncStub<SignatureCertificateServiceStub> {
    private SignatureCertificateServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SignatureCertificateServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SignatureCertificateServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified signature certificate.
     * To get the list of available certificates, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateServiceOuterClass.GetSignatureCertificateRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateOuterClass.SignatureCertificate> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of signature certificates for the specified SAML application.
     * </pre>
     */
    public void list(yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateServiceOuterClass.ListSignatureCertificatesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateServiceOuterClass.ListSignatureCertificatesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a new signature certificate for the specified SAML application.
     * </pre>
     */
    public void create(yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateServiceOuterClass.CreateSignatureCertificateRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified signature certificate.
     * </pre>
     */
    public void update(yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateServiceOuterClass.UpdateSignatureCertificateRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified signature certificate.
     * </pre>
     */
    public void delete(yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateServiceOuterClass.DeleteSignatureCertificateRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing signature certificates for SAML applications.
   * </pre>
   */
  public static final class SignatureCertificateServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<SignatureCertificateServiceBlockingStub> {
    private SignatureCertificateServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SignatureCertificateServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SignatureCertificateServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified signature certificate.
     * To get the list of available certificates, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateOuterClass.SignatureCertificate get(yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateServiceOuterClass.GetSignatureCertificateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of signature certificates for the specified SAML application.
     * </pre>
     */
    public yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateServiceOuterClass.ListSignatureCertificatesResponse list(yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateServiceOuterClass.ListSignatureCertificatesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new signature certificate for the specified SAML application.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateServiceOuterClass.CreateSignatureCertificateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified signature certificate.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateServiceOuterClass.UpdateSignatureCertificateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified signature certificate.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateServiceOuterClass.DeleteSignatureCertificateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing signature certificates for SAML applications.
   * </pre>
   */
  public static final class SignatureCertificateServiceFutureStub extends io.grpc.stub.AbstractFutureStub<SignatureCertificateServiceFutureStub> {
    private SignatureCertificateServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SignatureCertificateServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SignatureCertificateServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified signature certificate.
     * To get the list of available certificates, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateOuterClass.SignatureCertificate> get(
        yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateServiceOuterClass.GetSignatureCertificateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of signature certificates for the specified SAML application.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateServiceOuterClass.ListSignatureCertificatesResponse> list(
        yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateServiceOuterClass.ListSignatureCertificatesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a new signature certificate for the specified SAML application.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateServiceOuterClass.CreateSignatureCertificateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified signature certificate.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateServiceOuterClass.UpdateSignatureCertificateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified signature certificate.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateServiceOuterClass.DeleteSignatureCertificateRequest request) {
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
    private final SignatureCertificateServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SignatureCertificateServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateServiceOuterClass.GetSignatureCertificateRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateOuterClass.SignatureCertificate>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateServiceOuterClass.ListSignatureCertificatesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateServiceOuterClass.ListSignatureCertificatesResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateServiceOuterClass.CreateSignatureCertificateRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateServiceOuterClass.UpdateSignatureCertificateRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateServiceOuterClass.DeleteSignatureCertificateRequest) request,
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

  private static abstract class SignatureCertificateServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SignatureCertificateServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.organizationmanager.v1.idp.application.saml.SignatureCertificateServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SignatureCertificateService");
    }
  }

  private static final class SignatureCertificateServiceFileDescriptorSupplier
      extends SignatureCertificateServiceBaseDescriptorSupplier {
    SignatureCertificateServiceFileDescriptorSupplier() {}
  }

  private static final class SignatureCertificateServiceMethodDescriptorSupplier
      extends SignatureCertificateServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SignatureCertificateServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SignatureCertificateServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SignatureCertificateServiceFileDescriptorSupplier())
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
