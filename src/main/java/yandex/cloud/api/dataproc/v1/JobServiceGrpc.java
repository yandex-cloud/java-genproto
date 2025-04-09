package yandex.cloud.api.dataproc.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing Yandex Data Processing jobs.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/dataproc/v1/job_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class JobServiceGrpc {

  private JobServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.dataproc.v1.JobService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.dataproc.v1.PHJS.ListJobsRequest,
      yandex.cloud.api.dataproc.v1.PHJS.ListJobsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.dataproc.v1.PHJS.ListJobsRequest.class,
      responseType = yandex.cloud.api.dataproc.v1.PHJS.ListJobsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.dataproc.v1.PHJS.ListJobsRequest,
      yandex.cloud.api.dataproc.v1.PHJS.ListJobsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.dataproc.v1.PHJS.ListJobsRequest, yandex.cloud.api.dataproc.v1.PHJS.ListJobsResponse> getListMethod;
    if ((getListMethod = JobServiceGrpc.getListMethod) == null) {
      synchronized (JobServiceGrpc.class) {
        if ((getListMethod = JobServiceGrpc.getListMethod) == null) {
          JobServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.dataproc.v1.PHJS.ListJobsRequest, yandex.cloud.api.dataproc.v1.PHJS.ListJobsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.dataproc.v1.PHJS.ListJobsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.dataproc.v1.PHJS.ListJobsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new JobServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.dataproc.v1.PHJS.CreateJobRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.dataproc.v1.PHJS.CreateJobRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.dataproc.v1.PHJS.CreateJobRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.dataproc.v1.PHJS.CreateJobRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = JobServiceGrpc.getCreateMethod) == null) {
      synchronized (JobServiceGrpc.class) {
        if ((getCreateMethod = JobServiceGrpc.getCreateMethod) == null) {
          JobServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.dataproc.v1.PHJS.CreateJobRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.dataproc.v1.PHJS.CreateJobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new JobServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.dataproc.v1.PHJS.GetJobRequest,
      yandex.cloud.api.dataproc.v1.PHJ.Job> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.dataproc.v1.PHJS.GetJobRequest.class,
      responseType = yandex.cloud.api.dataproc.v1.PHJ.Job.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.dataproc.v1.PHJS.GetJobRequest,
      yandex.cloud.api.dataproc.v1.PHJ.Job> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.dataproc.v1.PHJS.GetJobRequest, yandex.cloud.api.dataproc.v1.PHJ.Job> getGetMethod;
    if ((getGetMethod = JobServiceGrpc.getGetMethod) == null) {
      synchronized (JobServiceGrpc.class) {
        if ((getGetMethod = JobServiceGrpc.getGetMethod) == null) {
          JobServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.dataproc.v1.PHJS.GetJobRequest, yandex.cloud.api.dataproc.v1.PHJ.Job>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.dataproc.v1.PHJS.GetJobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.dataproc.v1.PHJ.Job.getDefaultInstance()))
              .setSchemaDescriptor(new JobServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.dataproc.v1.PHJS.ListJobLogRequest,
      yandex.cloud.api.dataproc.v1.PHJS.ListJobLogResponse> getListLogMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListLog",
      requestType = yandex.cloud.api.dataproc.v1.PHJS.ListJobLogRequest.class,
      responseType = yandex.cloud.api.dataproc.v1.PHJS.ListJobLogResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.dataproc.v1.PHJS.ListJobLogRequest,
      yandex.cloud.api.dataproc.v1.PHJS.ListJobLogResponse> getListLogMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.dataproc.v1.PHJS.ListJobLogRequest, yandex.cloud.api.dataproc.v1.PHJS.ListJobLogResponse> getListLogMethod;
    if ((getListLogMethod = JobServiceGrpc.getListLogMethod) == null) {
      synchronized (JobServiceGrpc.class) {
        if ((getListLogMethod = JobServiceGrpc.getListLogMethod) == null) {
          JobServiceGrpc.getListLogMethod = getListLogMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.dataproc.v1.PHJS.ListJobLogRequest, yandex.cloud.api.dataproc.v1.PHJS.ListJobLogResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListLog"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.dataproc.v1.PHJS.ListJobLogRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.dataproc.v1.PHJS.ListJobLogResponse.getDefaultInstance()))
              .setSchemaDescriptor(new JobServiceMethodDescriptorSupplier("ListLog"))
              .build();
        }
      }
    }
    return getListLogMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.dataproc.v1.PHJS.CancelJobRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCancelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Cancel",
      requestType = yandex.cloud.api.dataproc.v1.PHJS.CancelJobRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.dataproc.v1.PHJS.CancelJobRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCancelMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.dataproc.v1.PHJS.CancelJobRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCancelMethod;
    if ((getCancelMethod = JobServiceGrpc.getCancelMethod) == null) {
      synchronized (JobServiceGrpc.class) {
        if ((getCancelMethod = JobServiceGrpc.getCancelMethod) == null) {
          JobServiceGrpc.getCancelMethod = getCancelMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.dataproc.v1.PHJS.CancelJobRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Cancel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.dataproc.v1.PHJS.CancelJobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new JobServiceMethodDescriptorSupplier("Cancel"))
              .build();
        }
      }
    }
    return getCancelMethod;
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
   * <pre>
   * A set of methods for managing Yandex Data Processing jobs.
   * </pre>
   */
  public static abstract class JobServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Retrieves a list of jobs for a cluster.
     * </pre>
     */
    public void list(yandex.cloud.api.dataproc.v1.PHJS.ListJobsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.dataproc.v1.PHJS.ListJobsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a job for a cluster.
     * </pre>
     */
    public void create(yandex.cloud.api.dataproc.v1.PHJS.CreateJobRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the specified job.
     * </pre>
     */
    public void get(yandex.cloud.api.dataproc.v1.PHJS.GetJobRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.dataproc.v1.PHJ.Job> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns a log for specified job.
     * </pre>
     */
    public void listLog(yandex.cloud.api.dataproc.v1.PHJS.ListJobLogRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.dataproc.v1.PHJS.ListJobLogResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListLogMethod(), responseObserver);
    }

    /**
     * <pre>
     * Cancels the specified Yandex Data Processing job.
     * </pre>
     */
    public void cancel(yandex.cloud.api.dataproc.v1.PHJS.CancelJobRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.dataproc.v1.PHJS.ListJobsRequest,
                yandex.cloud.api.dataproc.v1.PHJS.ListJobsResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.dataproc.v1.PHJS.CreateJobRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.dataproc.v1.PHJS.GetJobRequest,
                yandex.cloud.api.dataproc.v1.PHJ.Job>(
                  this, METHODID_GET)))
          .addMethod(
            getListLogMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.dataproc.v1.PHJS.ListJobLogRequest,
                yandex.cloud.api.dataproc.v1.PHJS.ListJobLogResponse>(
                  this, METHODID_LIST_LOG)))
          .addMethod(
            getCancelMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.dataproc.v1.PHJS.CancelJobRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CANCEL)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing Yandex Data Processing jobs.
   * </pre>
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
     * Retrieves a list of jobs for a cluster.
     * </pre>
     */
    public void list(yandex.cloud.api.dataproc.v1.PHJS.ListJobsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.dataproc.v1.PHJS.ListJobsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a job for a cluster.
     * </pre>
     */
    public void create(yandex.cloud.api.dataproc.v1.PHJS.CreateJobRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the specified job.
     * </pre>
     */
    public void get(yandex.cloud.api.dataproc.v1.PHJS.GetJobRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.dataproc.v1.PHJ.Job> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns a log for specified job.
     * </pre>
     */
    public void listLog(yandex.cloud.api.dataproc.v1.PHJS.ListJobLogRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.dataproc.v1.PHJS.ListJobLogResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListLogMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Cancels the specified Yandex Data Processing job.
     * </pre>
     */
    public void cancel(yandex.cloud.api.dataproc.v1.PHJS.CancelJobRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Yandex Data Processing jobs.
   * </pre>
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
     * Retrieves a list of jobs for a cluster.
     * </pre>
     */
    public yandex.cloud.api.dataproc.v1.PHJS.ListJobsResponse list(yandex.cloud.api.dataproc.v1.PHJS.ListJobsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a job for a cluster.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.dataproc.v1.PHJS.CreateJobRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the specified job.
     * </pre>
     */
    public yandex.cloud.api.dataproc.v1.PHJ.Job get(yandex.cloud.api.dataproc.v1.PHJS.GetJobRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns a log for specified job.
     * </pre>
     */
    public yandex.cloud.api.dataproc.v1.PHJS.ListJobLogResponse listLog(yandex.cloud.api.dataproc.v1.PHJS.ListJobLogRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListLogMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Cancels the specified Yandex Data Processing job.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation cancel(yandex.cloud.api.dataproc.v1.PHJS.CancelJobRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Yandex Data Processing jobs.
   * </pre>
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
     * Retrieves a list of jobs for a cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.dataproc.v1.PHJS.ListJobsResponse> list(
        yandex.cloud.api.dataproc.v1.PHJS.ListJobsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a job for a cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.dataproc.v1.PHJS.CreateJobRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the specified job.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.dataproc.v1.PHJ.Job> get(
        yandex.cloud.api.dataproc.v1.PHJS.GetJobRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns a log for specified job.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.dataproc.v1.PHJS.ListJobLogResponse> listLog(
        yandex.cloud.api.dataproc.v1.PHJS.ListJobLogRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListLogMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Cancels the specified Yandex Data Processing job.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> cancel(
        yandex.cloud.api.dataproc.v1.PHJS.CancelJobRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST = 0;
  private static final int METHODID_CREATE = 1;
  private static final int METHODID_GET = 2;
  private static final int METHODID_LIST_LOG = 3;
  private static final int METHODID_CANCEL = 4;

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
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.dataproc.v1.PHJS.ListJobsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.dataproc.v1.PHJS.ListJobsResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.dataproc.v1.PHJS.CreateJobRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.dataproc.v1.PHJS.GetJobRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.dataproc.v1.PHJ.Job>) responseObserver);
          break;
        case METHODID_LIST_LOG:
          serviceImpl.listLog((yandex.cloud.api.dataproc.v1.PHJS.ListJobLogRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.dataproc.v1.PHJS.ListJobLogResponse>) responseObserver);
          break;
        case METHODID_CANCEL:
          serviceImpl.cancel((yandex.cloud.api.dataproc.v1.PHJS.CancelJobRequest) request,
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

  private static abstract class JobServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    JobServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.dataproc.v1.PHJS.getDescriptor();
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
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .addMethod(getGetMethod())
              .addMethod(getListLogMethod())
              .addMethod(getCancelMethod())
              .build();
        }
      }
    }
    return result;
  }
}
