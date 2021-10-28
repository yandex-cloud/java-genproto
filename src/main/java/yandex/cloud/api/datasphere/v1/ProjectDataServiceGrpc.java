package yandex.cloud.api.datasphere.v1;

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
 * A set of methods for managing data of the Project resource.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.0)",
    comments = "Source: yandex/cloud/datasphere/v1/project_data_service.proto")
public final class ProjectDataServiceGrpc {

  private ProjectDataServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.datasphere.v1.ProjectDataService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v1.ProjectDataServiceOuterClass.UploadFileRequest,
      yandex.cloud.api.datasphere.v1.ProjectDataServiceOuterClass.UploadFileResponse> getUploadFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UploadFile",
      requestType = yandex.cloud.api.datasphere.v1.ProjectDataServiceOuterClass.UploadFileRequest.class,
      responseType = yandex.cloud.api.datasphere.v1.ProjectDataServiceOuterClass.UploadFileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v1.ProjectDataServiceOuterClass.UploadFileRequest,
      yandex.cloud.api.datasphere.v1.ProjectDataServiceOuterClass.UploadFileResponse> getUploadFileMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v1.ProjectDataServiceOuterClass.UploadFileRequest, yandex.cloud.api.datasphere.v1.ProjectDataServiceOuterClass.UploadFileResponse> getUploadFileMethod;
    if ((getUploadFileMethod = ProjectDataServiceGrpc.getUploadFileMethod) == null) {
      synchronized (ProjectDataServiceGrpc.class) {
        if ((getUploadFileMethod = ProjectDataServiceGrpc.getUploadFileMethod) == null) {
          ProjectDataServiceGrpc.getUploadFileMethod = getUploadFileMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.datasphere.v1.ProjectDataServiceOuterClass.UploadFileRequest, yandex.cloud.api.datasphere.v1.ProjectDataServiceOuterClass.UploadFileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.datasphere.v1.ProjectDataService", "UploadFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datasphere.v1.ProjectDataServiceOuterClass.UploadFileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datasphere.v1.ProjectDataServiceOuterClass.UploadFileResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ProjectDataServiceMethodDescriptorSupplier("UploadFile"))
                  .build();
          }
        }
     }
     return getUploadFileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v1.ProjectDataServiceOuterClass.DownloadFileRequest,
      yandex.cloud.api.datasphere.v1.ProjectDataServiceOuterClass.DownloadFileResponse> getDownloadFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DownloadFile",
      requestType = yandex.cloud.api.datasphere.v1.ProjectDataServiceOuterClass.DownloadFileRequest.class,
      responseType = yandex.cloud.api.datasphere.v1.ProjectDataServiceOuterClass.DownloadFileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v1.ProjectDataServiceOuterClass.DownloadFileRequest,
      yandex.cloud.api.datasphere.v1.ProjectDataServiceOuterClass.DownloadFileResponse> getDownloadFileMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.datasphere.v1.ProjectDataServiceOuterClass.DownloadFileRequest, yandex.cloud.api.datasphere.v1.ProjectDataServiceOuterClass.DownloadFileResponse> getDownloadFileMethod;
    if ((getDownloadFileMethod = ProjectDataServiceGrpc.getDownloadFileMethod) == null) {
      synchronized (ProjectDataServiceGrpc.class) {
        if ((getDownloadFileMethod = ProjectDataServiceGrpc.getDownloadFileMethod) == null) {
          ProjectDataServiceGrpc.getDownloadFileMethod = getDownloadFileMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.datasphere.v1.ProjectDataServiceOuterClass.DownloadFileRequest, yandex.cloud.api.datasphere.v1.ProjectDataServiceOuterClass.DownloadFileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.datasphere.v1.ProjectDataService", "DownloadFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datasphere.v1.ProjectDataServiceOuterClass.DownloadFileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.datasphere.v1.ProjectDataServiceOuterClass.DownloadFileResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ProjectDataServiceMethodDescriptorSupplier("DownloadFile"))
                  .build();
          }
        }
     }
     return getDownloadFileMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProjectDataServiceStub newStub(io.grpc.Channel channel) {
    return new ProjectDataServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProjectDataServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ProjectDataServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProjectDataServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ProjectDataServiceFutureStub(channel);
  }

  /**
   * <pre>
   * A set of methods for managing data of the Project resource.
   * </pre>
   */
  public static abstract class ProjectDataServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Uploads a file to the specified project.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<yandex.cloud.api.datasphere.v1.ProjectDataServiceOuterClass.UploadFileRequest> uploadFile(
        io.grpc.stub.StreamObserver<yandex.cloud.api.datasphere.v1.ProjectDataServiceOuterClass.UploadFileResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getUploadFileMethod(), responseObserver);
    }

    /**
     * <pre>
     * Downloads the specified file from the specified project.
     * </pre>
     */
    public void downloadFile(yandex.cloud.api.datasphere.v1.ProjectDataServiceOuterClass.DownloadFileRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.datasphere.v1.ProjectDataServiceOuterClass.DownloadFileResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDownloadFileMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getUploadFileMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                yandex.cloud.api.datasphere.v1.ProjectDataServiceOuterClass.UploadFileRequest,
                yandex.cloud.api.datasphere.v1.ProjectDataServiceOuterClass.UploadFileResponse>(
                  this, METHODID_UPLOAD_FILE)))
          .addMethod(
            getDownloadFileMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                yandex.cloud.api.datasphere.v1.ProjectDataServiceOuterClass.DownloadFileRequest,
                yandex.cloud.api.datasphere.v1.ProjectDataServiceOuterClass.DownloadFileResponse>(
                  this, METHODID_DOWNLOAD_FILE)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing data of the Project resource.
   * </pre>
   */
  public static final class ProjectDataServiceStub extends io.grpc.stub.AbstractStub<ProjectDataServiceStub> {
    private ProjectDataServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProjectDataServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProjectDataServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProjectDataServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Uploads a file to the specified project.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<yandex.cloud.api.datasphere.v1.ProjectDataServiceOuterClass.UploadFileRequest> uploadFile(
        io.grpc.stub.StreamObserver<yandex.cloud.api.datasphere.v1.ProjectDataServiceOuterClass.UploadFileResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getUploadFileMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Downloads the specified file from the specified project.
     * </pre>
     */
    public void downloadFile(yandex.cloud.api.datasphere.v1.ProjectDataServiceOuterClass.DownloadFileRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.datasphere.v1.ProjectDataServiceOuterClass.DownloadFileResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getDownloadFileMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing data of the Project resource.
   * </pre>
   */
  public static final class ProjectDataServiceBlockingStub extends io.grpc.stub.AbstractStub<ProjectDataServiceBlockingStub> {
    private ProjectDataServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProjectDataServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProjectDataServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProjectDataServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Downloads the specified file from the specified project.
     * </pre>
     */
    public java.util.Iterator<yandex.cloud.api.datasphere.v1.ProjectDataServiceOuterClass.DownloadFileResponse> downloadFile(
        yandex.cloud.api.datasphere.v1.ProjectDataServiceOuterClass.DownloadFileRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getDownloadFileMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing data of the Project resource.
   * </pre>
   */
  public static final class ProjectDataServiceFutureStub extends io.grpc.stub.AbstractStub<ProjectDataServiceFutureStub> {
    private ProjectDataServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProjectDataServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProjectDataServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProjectDataServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_DOWNLOAD_FILE = 0;
  private static final int METHODID_UPLOAD_FILE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProjectDataServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProjectDataServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DOWNLOAD_FILE:
          serviceImpl.downloadFile((yandex.cloud.api.datasphere.v1.ProjectDataServiceOuterClass.DownloadFileRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.datasphere.v1.ProjectDataServiceOuterClass.DownloadFileResponse>) responseObserver);
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
        case METHODID_UPLOAD_FILE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.uploadFile(
              (io.grpc.stub.StreamObserver<yandex.cloud.api.datasphere.v1.ProjectDataServiceOuterClass.UploadFileResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ProjectDataServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProjectDataServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.datasphere.v1.ProjectDataServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProjectDataService");
    }
  }

  private static final class ProjectDataServiceFileDescriptorSupplier
      extends ProjectDataServiceBaseDescriptorSupplier {
    ProjectDataServiceFileDescriptorSupplier() {}
  }

  private static final class ProjectDataServiceMethodDescriptorSupplier
      extends ProjectDataServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProjectDataServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ProjectDataServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProjectDataServiceFileDescriptorSupplier())
              .addMethod(getUploadFileMethod())
              .addMethod(getDownloadFileMethod())
              .build();
        }
      }
    }
    return result;
  }
}
