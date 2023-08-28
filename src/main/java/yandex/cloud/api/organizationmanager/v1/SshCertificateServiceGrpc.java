package yandex.cloud.api.organizationmanager.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/organizationmanager/v1/ssh_certificate_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SshCertificateServiceGrpc {

  private SshCertificateServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.organizationmanager.v1.SshCertificateService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.SshCertificateServiceOuterClass.GenerateSshCertificateRequest,
      yandex.cloud.api.organizationmanager.v1.SshCertificateServiceOuterClass.GenerateSshCertificateResponse> getGenerateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Generate",
      requestType = yandex.cloud.api.organizationmanager.v1.SshCertificateServiceOuterClass.GenerateSshCertificateRequest.class,
      responseType = yandex.cloud.api.organizationmanager.v1.SshCertificateServiceOuterClass.GenerateSshCertificateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.SshCertificateServiceOuterClass.GenerateSshCertificateRequest,
      yandex.cloud.api.organizationmanager.v1.SshCertificateServiceOuterClass.GenerateSshCertificateResponse> getGenerateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.organizationmanager.v1.SshCertificateServiceOuterClass.GenerateSshCertificateRequest, yandex.cloud.api.organizationmanager.v1.SshCertificateServiceOuterClass.GenerateSshCertificateResponse> getGenerateMethod;
    if ((getGenerateMethod = SshCertificateServiceGrpc.getGenerateMethod) == null) {
      synchronized (SshCertificateServiceGrpc.class) {
        if ((getGenerateMethod = SshCertificateServiceGrpc.getGenerateMethod) == null) {
          SshCertificateServiceGrpc.getGenerateMethod = getGenerateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.organizationmanager.v1.SshCertificateServiceOuterClass.GenerateSshCertificateRequest, yandex.cloud.api.organizationmanager.v1.SshCertificateServiceOuterClass.GenerateSshCertificateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Generate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.SshCertificateServiceOuterClass.GenerateSshCertificateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.organizationmanager.v1.SshCertificateServiceOuterClass.GenerateSshCertificateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SshCertificateServiceMethodDescriptorSupplier("Generate"))
              .build();
        }
      }
    }
    return getGenerateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SshCertificateServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SshCertificateServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SshCertificateServiceStub>() {
        @java.lang.Override
        public SshCertificateServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SshCertificateServiceStub(channel, callOptions);
        }
      };
    return SshCertificateServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SshCertificateServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SshCertificateServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SshCertificateServiceBlockingStub>() {
        @java.lang.Override
        public SshCertificateServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SshCertificateServiceBlockingStub(channel, callOptions);
        }
      };
    return SshCertificateServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SshCertificateServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SshCertificateServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SshCertificateServiceFutureStub>() {
        @java.lang.Override
        public SshCertificateServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SshCertificateServiceFutureStub(channel, callOptions);
        }
      };
    return SshCertificateServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SshCertificateServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Members of an organization can generate certificates for themselves
     * Signing certificates for other users requires a special permission
     * </pre>
     */
    public void generate(yandex.cloud.api.organizationmanager.v1.SshCertificateServiceOuterClass.GenerateSshCertificateRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.SshCertificateServiceOuterClass.GenerateSshCertificateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGenerateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.organizationmanager.v1.SshCertificateServiceOuterClass.GenerateSshCertificateRequest,
                yandex.cloud.api.organizationmanager.v1.SshCertificateServiceOuterClass.GenerateSshCertificateResponse>(
                  this, METHODID_GENERATE)))
          .build();
    }
  }

  /**
   */
  public static final class SshCertificateServiceStub extends io.grpc.stub.AbstractAsyncStub<SshCertificateServiceStub> {
    private SshCertificateServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SshCertificateServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SshCertificateServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Members of an organization can generate certificates for themselves
     * Signing certificates for other users requires a special permission
     * </pre>
     */
    public void generate(yandex.cloud.api.organizationmanager.v1.SshCertificateServiceOuterClass.GenerateSshCertificateRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.SshCertificateServiceOuterClass.GenerateSshCertificateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenerateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SshCertificateServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<SshCertificateServiceBlockingStub> {
    private SshCertificateServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SshCertificateServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SshCertificateServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Members of an organization can generate certificates for themselves
     * Signing certificates for other users requires a special permission
     * </pre>
     */
    public yandex.cloud.api.organizationmanager.v1.SshCertificateServiceOuterClass.GenerateSshCertificateResponse generate(yandex.cloud.api.organizationmanager.v1.SshCertificateServiceOuterClass.GenerateSshCertificateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SshCertificateServiceFutureStub extends io.grpc.stub.AbstractFutureStub<SshCertificateServiceFutureStub> {
    private SshCertificateServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SshCertificateServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SshCertificateServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Members of an organization can generate certificates for themselves
     * Signing certificates for other users requires a special permission
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.organizationmanager.v1.SshCertificateServiceOuterClass.GenerateSshCertificateResponse> generate(
        yandex.cloud.api.organizationmanager.v1.SshCertificateServiceOuterClass.GenerateSshCertificateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenerateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GENERATE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SshCertificateServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SshCertificateServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GENERATE:
          serviceImpl.generate((yandex.cloud.api.organizationmanager.v1.SshCertificateServiceOuterClass.GenerateSshCertificateRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.organizationmanager.v1.SshCertificateServiceOuterClass.GenerateSshCertificateResponse>) responseObserver);
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

  private static abstract class SshCertificateServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SshCertificateServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.organizationmanager.v1.SshCertificateServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SshCertificateService");
    }
  }

  private static final class SshCertificateServiceFileDescriptorSupplier
      extends SshCertificateServiceBaseDescriptorSupplier {
    SshCertificateServiceFileDescriptorSupplier() {}
  }

  private static final class SshCertificateServiceMethodDescriptorSupplier
      extends SshCertificateServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SshCertificateServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SshCertificateServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SshCertificateServiceFileDescriptorSupplier())
              .addMethod(getGenerateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
