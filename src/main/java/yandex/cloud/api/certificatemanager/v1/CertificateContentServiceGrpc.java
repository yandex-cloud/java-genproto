package yandex.cloud.api.certificatemanager.v1;

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
 * A set of methods for managing certificate content.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.0)",
    comments = "Source: yandex/cloud/certificatemanager/v1/certificate_content_service.proto")
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
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.certificatemanager.v1.CertificateContentService", "Get"))
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
    return new CertificateContentServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CertificateContentServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CertificateContentServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CertificateContentServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CertificateContentServiceFutureStub(channel);
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
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
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
  public static final class CertificateContentServiceStub extends io.grpc.stub.AbstractStub<CertificateContentServiceStub> {
    private CertificateContentServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CertificateContentServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CertificateContentServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CertificateContentServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns chain and private key of the specified certificate.
     * </pre>
     */
    public void get(yandex.cloud.api.certificatemanager.v1.CertificateContentServiceOuterClass.GetCertificateContentRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.certificatemanager.v1.CertificateContentServiceOuterClass.GetCertificateContentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing certificate content.
   * </pre>
   */
  public static final class CertificateContentServiceBlockingStub extends io.grpc.stub.AbstractStub<CertificateContentServiceBlockingStub> {
    private CertificateContentServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CertificateContentServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CertificateContentServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CertificateContentServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns chain and private key of the specified certificate.
     * </pre>
     */
    public yandex.cloud.api.certificatemanager.v1.CertificateContentServiceOuterClass.GetCertificateContentResponse get(yandex.cloud.api.certificatemanager.v1.CertificateContentServiceOuterClass.GetCertificateContentRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing certificate content.
   * </pre>
   */
  public static final class CertificateContentServiceFutureStub extends io.grpc.stub.AbstractStub<CertificateContentServiceFutureStub> {
    private CertificateContentServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CertificateContentServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CertificateContentServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CertificateContentServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns chain and private key of the specified certificate.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.certificatemanager.v1.CertificateContentServiceOuterClass.GetCertificateContentResponse> get(
        yandex.cloud.api.certificatemanager.v1.CertificateContentServiceOuterClass.GetCertificateContentRequest request) {
      return futureUnaryCall(
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
