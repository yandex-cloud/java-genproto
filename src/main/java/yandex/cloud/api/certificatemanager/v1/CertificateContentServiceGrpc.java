package yandex.cloud.api.certificatemanager.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing certificate content.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/certificatemanager/v1/certificate_content_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CertificateContentServiceGrpc {

  private CertificateContentServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.certificatemanager.v1.CertificateContentService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.certificatemanager.v1.CertificateContentServiceOuterClass.GetCertificateContentRequest,
      yandex.cloud.api.certificatemanager.v1.CertificateContentServiceOuterClass.GetCertificateContentResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.certificatemanager.v1.CertificateContentServiceOuterClass.GetCertificateContentRequest.class,
      responseType = yandex.cloud.api.certificatemanager.v1.CertificateContentServiceOuterClass.GetCertificateContentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.certificatemanager.v1.CertificateContentServiceOuterClass.GetCertificateContentRequest,
      yandex.cloud.api.certificatemanager.v1.CertificateContentServiceOuterClass.GetCertificateContentResponse> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.certificatemanager.v1.CertificateContentServiceOuterClass.GetCertificateContentRequest, yandex.cloud.api.certificatemanager.v1.CertificateContentServiceOuterClass.GetCertificateContentResponse> getGetMethod;
    if ((getGetMethod = CertificateContentServiceGrpc.getGetMethod) == null) {
      synchronized (CertificateContentServiceGrpc.class) {
        if ((getGetMethod = CertificateContentServiceGrpc.getGetMethod) == null) {
          CertificateContentServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.certificatemanager.v1.CertificateContentServiceOuterClass.GetCertificateContentRequest, yandex.cloud.api.certificatemanager.v1.CertificateContentServiceOuterClass.GetCertificateContentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.certificatemanager.v1.CertificateContentServiceOuterClass.GetCertificateContentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.certificatemanager.v1.CertificateContentServiceOuterClass.GetCertificateContentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CertificateContentServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CertificateContentServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CertificateContentServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CertificateContentServiceStub>() {
        @java.lang.Override
        public CertificateContentServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CertificateContentServiceStub(channel, callOptions);
        }
      };
    return CertificateContentServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CertificateContentServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CertificateContentServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CertificateContentServiceBlockingStub>() {
        @java.lang.Override
        public CertificateContentServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CertificateContentServiceBlockingStub(channel, callOptions);
        }
      };
    return CertificateContentServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CertificateContentServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CertificateContentServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CertificateContentServiceFutureStub>() {
        @java.lang.Override
        public CertificateContentServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CertificateContentServiceFutureStub(channel, callOptions);
        }
      };
    return CertificateContentServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing certificate content.
   * </pre>
   */
  public static abstract class CertificateContentServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns chain and private key of the specified certificate.
     * </pre>
     */
    public void get(yandex.cloud.api.certificatemanager.v1.CertificateContentServiceOuterClass.GetCertificateContentRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.certificatemanager.v1.CertificateContentServiceOuterClass.GetCertificateContentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.certificatemanager.v1.CertificateContentServiceOuterClass.GetCertificateContentRequest,
                yandex.cloud.api.certificatemanager.v1.CertificateContentServiceOuterClass.GetCertificateContentResponse>(
                  this, METHODID_GET)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing certificate content.
   * </pre>
   */
  public static final class CertificateContentServiceStub extends io.grpc.stub.AbstractAsyncStub<CertificateContentServiceStub> {
    private CertificateContentServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CertificateContentServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CertificateContentServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns chain and private key of the specified certificate.
     * </pre>
     */
    public void get(yandex.cloud.api.certificatemanager.v1.CertificateContentServiceOuterClass.GetCertificateContentRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.certificatemanager.v1.CertificateContentServiceOuterClass.GetCertificateContentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing certificate content.
   * </pre>
   */
  public static final class CertificateContentServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CertificateContentServiceBlockingStub> {
    private CertificateContentServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CertificateContentServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CertificateContentServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns chain and private key of the specified certificate.
     * </pre>
     */
    public yandex.cloud.api.certificatemanager.v1.CertificateContentServiceOuterClass.GetCertificateContentResponse get(yandex.cloud.api.certificatemanager.v1.CertificateContentServiceOuterClass.GetCertificateContentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing certificate content.
   * </pre>
   */
  public static final class CertificateContentServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CertificateContentServiceFutureStub> {
    private CertificateContentServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CertificateContentServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CertificateContentServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns chain and private key of the specified certificate.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.certificatemanager.v1.CertificateContentServiceOuterClass.GetCertificateContentResponse> get(
        yandex.cloud.api.certificatemanager.v1.CertificateContentServiceOuterClass.GetCertificateContentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CertificateContentServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CertificateContentServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.certificatemanager.v1.CertificateContentServiceOuterClass.GetCertificateContentRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.certificatemanager.v1.CertificateContentServiceOuterClass.GetCertificateContentResponse>) responseObserver);
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

  private static abstract class CertificateContentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CertificateContentServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.certificatemanager.v1.CertificateContentServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CertificateContentService");
    }
  }

  private static final class CertificateContentServiceFileDescriptorSupplier
      extends CertificateContentServiceBaseDescriptorSupplier {
    CertificateContentServiceFileDescriptorSupplier() {}
  }

  private static final class CertificateContentServiceMethodDescriptorSupplier
      extends CertificateContentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CertificateContentServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CertificateContentServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CertificateContentServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .build();
        }
      }
    }
    return result;
  }
}
