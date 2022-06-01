package yandex.cloud.api.containerregistry.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for scanning Docker images.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/containerregistry/v1/scanner_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ScannerServiceGrpc {

  private ScannerServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.containerregistry.v1.ScannerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.ScanRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getScanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Scan",
      requestType = yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.ScanRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.ScanRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getScanMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.ScanRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getScanMethod;
    if ((getScanMethod = ScannerServiceGrpc.getScanMethod) == null) {
      synchronized (ScannerServiceGrpc.class) {
        if ((getScanMethod = ScannerServiceGrpc.getScanMethod) == null) {
          ScannerServiceGrpc.getScanMethod = getScanMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.ScanRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Scan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.ScanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ScannerServiceMethodDescriptorSupplier("Scan"))
              .build();
        }
      }
    }
    return getScanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.GetScanResultRequest,
      yandex.cloud.api.containerregistry.v1.Scanner.ScanResult> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.GetScanResultRequest.class,
      responseType = yandex.cloud.api.containerregistry.v1.Scanner.ScanResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.GetScanResultRequest,
      yandex.cloud.api.containerregistry.v1.Scanner.ScanResult> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.GetScanResultRequest, yandex.cloud.api.containerregistry.v1.Scanner.ScanResult> getGetMethod;
    if ((getGetMethod = ScannerServiceGrpc.getGetMethod) == null) {
      synchronized (ScannerServiceGrpc.class) {
        if ((getGetMethod = ScannerServiceGrpc.getGetMethod) == null) {
          ScannerServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.GetScanResultRequest, yandex.cloud.api.containerregistry.v1.Scanner.ScanResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.GetScanResultRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.containerregistry.v1.Scanner.ScanResult.getDefaultInstance()))
              .setSchemaDescriptor(new ScannerServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.GetLastScanResultRequest,
      yandex.cloud.api.containerregistry.v1.Scanner.ScanResult> getGetLastMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLast",
      requestType = yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.GetLastScanResultRequest.class,
      responseType = yandex.cloud.api.containerregistry.v1.Scanner.ScanResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.GetLastScanResultRequest,
      yandex.cloud.api.containerregistry.v1.Scanner.ScanResult> getGetLastMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.GetLastScanResultRequest, yandex.cloud.api.containerregistry.v1.Scanner.ScanResult> getGetLastMethod;
    if ((getGetLastMethod = ScannerServiceGrpc.getGetLastMethod) == null) {
      synchronized (ScannerServiceGrpc.class) {
        if ((getGetLastMethod = ScannerServiceGrpc.getGetLastMethod) == null) {
          ScannerServiceGrpc.getGetLastMethod = getGetLastMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.GetLastScanResultRequest, yandex.cloud.api.containerregistry.v1.Scanner.ScanResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLast"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.GetLastScanResultRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.containerregistry.v1.Scanner.ScanResult.getDefaultInstance()))
              .setSchemaDescriptor(new ScannerServiceMethodDescriptorSupplier("GetLast"))
              .build();
        }
      }
    }
    return getGetLastMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.ListScanResultsRequest,
      yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.ListScanResultsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.ListScanResultsRequest.class,
      responseType = yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.ListScanResultsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.ListScanResultsRequest,
      yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.ListScanResultsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.ListScanResultsRequest, yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.ListScanResultsResponse> getListMethod;
    if ((getListMethod = ScannerServiceGrpc.getListMethod) == null) {
      synchronized (ScannerServiceGrpc.class) {
        if ((getListMethod = ScannerServiceGrpc.getListMethod) == null) {
          ScannerServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.ListScanResultsRequest, yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.ListScanResultsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.ListScanResultsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.ListScanResultsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ScannerServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.ListVulnerabilitiesRequest,
      yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.ListVulnerabilitiesResponse> getListVulnerabilitiesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListVulnerabilities",
      requestType = yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.ListVulnerabilitiesRequest.class,
      responseType = yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.ListVulnerabilitiesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.ListVulnerabilitiesRequest,
      yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.ListVulnerabilitiesResponse> getListVulnerabilitiesMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.ListVulnerabilitiesRequest, yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.ListVulnerabilitiesResponse> getListVulnerabilitiesMethod;
    if ((getListVulnerabilitiesMethod = ScannerServiceGrpc.getListVulnerabilitiesMethod) == null) {
      synchronized (ScannerServiceGrpc.class) {
        if ((getListVulnerabilitiesMethod = ScannerServiceGrpc.getListVulnerabilitiesMethod) == null) {
          ScannerServiceGrpc.getListVulnerabilitiesMethod = getListVulnerabilitiesMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.ListVulnerabilitiesRequest, yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.ListVulnerabilitiesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListVulnerabilities"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.ListVulnerabilitiesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.ListVulnerabilitiesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ScannerServiceMethodDescriptorSupplier("ListVulnerabilities"))
              .build();
        }
      }
    }
    return getListVulnerabilitiesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ScannerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ScannerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ScannerServiceStub>() {
        @java.lang.Override
        public ScannerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ScannerServiceStub(channel, callOptions);
        }
      };
    return ScannerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ScannerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ScannerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ScannerServiceBlockingStub>() {
        @java.lang.Override
        public ScannerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ScannerServiceBlockingStub(channel, callOptions);
        }
      };
    return ScannerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ScannerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ScannerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ScannerServiceFutureStub>() {
        @java.lang.Override
        public ScannerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ScannerServiceFutureStub(channel, callOptions);
        }
      };
    return ScannerServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for scanning Docker images.
   * </pre>
   */
  public static abstract class ScannerServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Executes scanning of specified image.
     * </pre>
     */
    public void scan(yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.ScanRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getScanMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the specified ScanResult resource.
     * To get the list of ScanResults for specified Image, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.GetScanResultRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.containerregistry.v1.Scanner.ScanResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the last finished ScanResult for the specified Image.
     * </pre>
     */
    public void getLast(yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.GetLastScanResultRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.containerregistry.v1.Scanner.ScanResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLastMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of ScanResults for specified Image.
     * </pre>
     */
    public void list(yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.ListScanResultsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.ListScanResultsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of vulnerabilities found in particular scan.
     * </pre>
     */
    public void listVulnerabilities(yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.ListVulnerabilitiesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.ListVulnerabilitiesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListVulnerabilitiesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getScanMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.ScanRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_SCAN)))
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.GetScanResultRequest,
                yandex.cloud.api.containerregistry.v1.Scanner.ScanResult>(
                  this, METHODID_GET)))
          .addMethod(
            getGetLastMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.GetLastScanResultRequest,
                yandex.cloud.api.containerregistry.v1.Scanner.ScanResult>(
                  this, METHODID_GET_LAST)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.ListScanResultsRequest,
                yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.ListScanResultsResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getListVulnerabilitiesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.ListVulnerabilitiesRequest,
                yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.ListVulnerabilitiesResponse>(
                  this, METHODID_LIST_VULNERABILITIES)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for scanning Docker images.
   * </pre>
   */
  public static final class ScannerServiceStub extends io.grpc.stub.AbstractAsyncStub<ScannerServiceStub> {
    private ScannerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ScannerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ScannerServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Executes scanning of specified image.
     * </pre>
     */
    public void scan(yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.ScanRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getScanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the specified ScanResult resource.
     * To get the list of ScanResults for specified Image, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.GetScanResultRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.containerregistry.v1.Scanner.ScanResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the last finished ScanResult for the specified Image.
     * </pre>
     */
    public void getLast(yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.GetLastScanResultRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.containerregistry.v1.Scanner.ScanResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLastMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of ScanResults for specified Image.
     * </pre>
     */
    public void list(yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.ListScanResultsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.ListScanResultsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of vulnerabilities found in particular scan.
     * </pre>
     */
    public void listVulnerabilities(yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.ListVulnerabilitiesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.ListVulnerabilitiesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListVulnerabilitiesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for scanning Docker images.
   * </pre>
   */
  public static final class ScannerServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ScannerServiceBlockingStub> {
    private ScannerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ScannerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ScannerServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Executes scanning of specified image.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation scan(yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.ScanRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getScanMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the specified ScanResult resource.
     * To get the list of ScanResults for specified Image, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.containerregistry.v1.Scanner.ScanResult get(yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.GetScanResultRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the last finished ScanResult for the specified Image.
     * </pre>
     */
    public yandex.cloud.api.containerregistry.v1.Scanner.ScanResult getLast(yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.GetLastScanResultRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLastMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of ScanResults for specified Image.
     * </pre>
     */
    public yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.ListScanResultsResponse list(yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.ListScanResultsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of vulnerabilities found in particular scan.
     * </pre>
     */
    public yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.ListVulnerabilitiesResponse listVulnerabilities(yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.ListVulnerabilitiesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListVulnerabilitiesMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for scanning Docker images.
   * </pre>
   */
  public static final class ScannerServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ScannerServiceFutureStub> {
    private ScannerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ScannerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ScannerServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Executes scanning of specified image.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> scan(
        yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.ScanRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getScanMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the specified ScanResult resource.
     * To get the list of ScanResults for specified Image, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.containerregistry.v1.Scanner.ScanResult> get(
        yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.GetScanResultRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the last finished ScanResult for the specified Image.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.containerregistry.v1.Scanner.ScanResult> getLast(
        yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.GetLastScanResultRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLastMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of ScanResults for specified Image.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.ListScanResultsResponse> list(
        yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.ListScanResultsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of vulnerabilities found in particular scan.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.ListVulnerabilitiesResponse> listVulnerabilities(
        yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.ListVulnerabilitiesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListVulnerabilitiesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SCAN = 0;
  private static final int METHODID_GET = 1;
  private static final int METHODID_GET_LAST = 2;
  private static final int METHODID_LIST = 3;
  private static final int METHODID_LIST_VULNERABILITIES = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ScannerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ScannerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SCAN:
          serviceImpl.scan((yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.ScanRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.GetScanResultRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.containerregistry.v1.Scanner.ScanResult>) responseObserver);
          break;
        case METHODID_GET_LAST:
          serviceImpl.getLast((yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.GetLastScanResultRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.containerregistry.v1.Scanner.ScanResult>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.ListScanResultsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.ListScanResultsResponse>) responseObserver);
          break;
        case METHODID_LIST_VULNERABILITIES:
          serviceImpl.listVulnerabilities((yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.ListVulnerabilitiesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.ListVulnerabilitiesResponse>) responseObserver);
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

  private static abstract class ScannerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ScannerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.containerregistry.v1.ScannerServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ScannerService");
    }
  }

  private static final class ScannerServiceFileDescriptorSupplier
      extends ScannerServiceBaseDescriptorSupplier {
    ScannerServiceFileDescriptorSupplier() {}
  }

  private static final class ScannerServiceMethodDescriptorSupplier
      extends ScannerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ScannerServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ScannerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ScannerServiceFileDescriptorSupplier())
              .addMethod(getScanMethod())
              .addMethod(getGetMethod())
              .addMethod(getGetLastMethod())
              .addMethod(getListMethod())
              .addMethod(getListVulnerabilitiesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
