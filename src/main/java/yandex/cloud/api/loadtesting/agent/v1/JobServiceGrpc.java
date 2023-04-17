package yandex.cloud.api.loadtesting.agent.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/loadtesting/agent/v1/job_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class JobServiceGrpc {

  private JobServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.loadtesting.agent.v1.JobService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.ClaimJobStatusRequest,
      yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.ClaimJobStatusResponse> getClaimStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClaimStatus",
      requestType = yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.ClaimJobStatusRequest.class,
      responseType = yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.ClaimJobStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.ClaimJobStatusRequest,
      yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.ClaimJobStatusResponse> getClaimStatusMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.ClaimJobStatusRequest, yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.ClaimJobStatusResponse> getClaimStatusMethod;
    if ((getClaimStatusMethod = JobServiceGrpc.getClaimStatusMethod) == null) {
      synchronized (JobServiceGrpc.class) {
        if ((getClaimStatusMethod = JobServiceGrpc.getClaimStatusMethod) == null) {
          JobServiceGrpc.getClaimStatusMethod = getClaimStatusMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.ClaimJobStatusRequest, yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.ClaimJobStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClaimStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.ClaimJobStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.ClaimJobStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new JobServiceMethodDescriptorSupplier("ClaimStatus"))
              .build();
        }
      }
    }
    return getClaimStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.GetJobRequest,
      yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.Job> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.GetJobRequest.class,
      responseType = yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.Job.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.GetJobRequest,
      yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.Job> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.GetJobRequest, yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.Job> getGetMethod;
    if ((getGetMethod = JobServiceGrpc.getGetMethod) == null) {
      synchronized (JobServiceGrpc.class) {
        if ((getGetMethod = JobServiceGrpc.getGetMethod) == null) {
          JobServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.GetJobRequest, yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.Job>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.GetJobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.Job.getDefaultInstance()))
              .setSchemaDescriptor(new JobServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.JobSignalRequest,
      yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.JobSignalResponse> getGetSignalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSignal",
      requestType = yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.JobSignalRequest.class,
      responseType = yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.JobSignalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.JobSignalRequest,
      yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.JobSignalResponse> getGetSignalMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.JobSignalRequest, yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.JobSignalResponse> getGetSignalMethod;
    if ((getGetSignalMethod = JobServiceGrpc.getGetSignalMethod) == null) {
      synchronized (JobServiceGrpc.class) {
        if ((getGetSignalMethod = JobServiceGrpc.getGetSignalMethod) == null) {
          JobServiceGrpc.getGetSignalMethod = getGetSignalMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.JobSignalRequest, yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.JobSignalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSignal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.JobSignalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.JobSignalResponse.getDefaultInstance()))
              .setSchemaDescriptor(new JobServiceMethodDescriptorSupplier("GetSignal"))
              .build();
        }
      }
    }
    return getGetSignalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.GetJobTransientFile,
      yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.File> getGetTransientFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransientFile",
      requestType = yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.GetJobTransientFile.class,
      responseType = yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.File.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.GetJobTransientFile,
      yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.File> getGetTransientFileMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.GetJobTransientFile, yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.File> getGetTransientFileMethod;
    if ((getGetTransientFileMethod = JobServiceGrpc.getGetTransientFileMethod) == null) {
      synchronized (JobServiceGrpc.class) {
        if ((getGetTransientFileMethod = JobServiceGrpc.getGetTransientFileMethod) == null) {
          JobServiceGrpc.getGetTransientFileMethod = getGetTransientFileMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.GetJobTransientFile, yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.File>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransientFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.GetJobTransientFile.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.File.getDefaultInstance()))
              .setSchemaDescriptor(new JobServiceMethodDescriptorSupplier("GetTransientFile"))
              .build();
        }
      }
    }
    return getGetTransientFileMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static JobServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<JobServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<JobServiceStub>() {
        @java.lang.Override
        public JobServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new JobServiceStub(channel, callOptions);
        }
      };
    return JobServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static JobServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<JobServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<JobServiceBlockingStub>() {
        @java.lang.Override
        public JobServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new JobServiceBlockingStub(channel, callOptions);
        }
      };
    return JobServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static JobServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<JobServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<JobServiceFutureStub>() {
        @java.lang.Override
        public JobServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new JobServiceFutureStub(channel, callOptions);
        }
      };
    return JobServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class JobServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Claims status for the specified job.
     * </pre>
     */
    public void claimStatus(yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.ClaimJobStatusRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.ClaimJobStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClaimStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the job for the specified agent.
     * </pre>
     */
    public void get(yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.GetJobRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.Job> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the signal for the specified job.
     * </pre>
     */
    public void getSignal(yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.JobSignalRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.JobSignalResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSignalMethod(), responseObserver);
    }

    /**
     */
    public void getTransientFile(yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.GetJobTransientFile request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.File> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTransientFileMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getClaimStatusMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.ClaimJobStatusRequest,
                yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.ClaimJobStatusResponse>(
                  this, METHODID_CLAIM_STATUS)))
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.GetJobRequest,
                yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.Job>(
                  this, METHODID_GET)))
          .addMethod(
            getGetSignalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.JobSignalRequest,
                yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.JobSignalResponse>(
                  this, METHODID_GET_SIGNAL)))
          .addMethod(
            getGetTransientFileMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.GetJobTransientFile,
                yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.File>(
                  this, METHODID_GET_TRANSIENT_FILE)))
          .build();
    }
  }

  /**
   */
  public static final class JobServiceStub extends io.grpc.stub.AbstractAsyncStub<JobServiceStub> {
    private JobServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JobServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new JobServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Claims status for the specified job.
     * </pre>
     */
    public void claimStatus(yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.ClaimJobStatusRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.ClaimJobStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClaimStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the job for the specified agent.
     * </pre>
     */
    public void get(yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.GetJobRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.Job> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the signal for the specified job.
     * </pre>
     */
    public void getSignal(yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.JobSignalRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.JobSignalResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSignalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransientFile(yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.GetJobTransientFile request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.File> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTransientFileMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class JobServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<JobServiceBlockingStub> {
    private JobServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JobServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new JobServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Claims status for the specified job.
     * </pre>
     */
    public yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.ClaimJobStatusResponse claimStatus(yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.ClaimJobStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClaimStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the job for the specified agent.
     * </pre>
     */
    public yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.Job get(yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.GetJobRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the signal for the specified job.
     * </pre>
     */
    public yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.JobSignalResponse getSignal(yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.JobSignalRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSignalMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.File getTransientFile(yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.GetJobTransientFile request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTransientFileMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class JobServiceFutureStub extends io.grpc.stub.AbstractFutureStub<JobServiceFutureStub> {
    private JobServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JobServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new JobServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Claims status for the specified job.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.ClaimJobStatusResponse> claimStatus(
        yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.ClaimJobStatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClaimStatusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the job for the specified agent.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.Job> get(
        yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.GetJobRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the signal for the specified job.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.JobSignalResponse> getSignal(
        yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.JobSignalRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSignalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.File> getTransientFile(
        yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.GetJobTransientFile request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTransientFileMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CLAIM_STATUS = 0;
  private static final int METHODID_GET = 1;
  private static final int METHODID_GET_SIGNAL = 2;
  private static final int METHODID_GET_TRANSIENT_FILE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final JobServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(JobServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CLAIM_STATUS:
          serviceImpl.claimStatus((yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.ClaimJobStatusRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.ClaimJobStatusResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.GetJobRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.Job>) responseObserver);
          break;
        case METHODID_GET_SIGNAL:
          serviceImpl.getSignal((yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.JobSignalRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.JobSignalResponse>) responseObserver);
          break;
        case METHODID_GET_TRANSIENT_FILE:
          serviceImpl.getTransientFile((yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.GetJobTransientFile) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.File>) responseObserver);
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

  private static abstract class JobServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    JobServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.loadtesting.agent.v1.JobServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("JobService");
    }
  }

  private static final class JobServiceFileDescriptorSupplier
      extends JobServiceBaseDescriptorSupplier {
    JobServiceFileDescriptorSupplier() {}
  }

  private static final class JobServiceMethodDescriptorSupplier
      extends JobServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    JobServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (JobServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new JobServiceFileDescriptorSupplier())
              .addMethod(getClaimStatusMethod())
              .addMethod(getGetMethod())
              .addMethod(getGetSignalMethod())
              .addMethod(getGetTransientFileMethod())
              .build();
        }
      }
    }
    return result;
  }
}
