package yandex.cloud.api.endpoint;

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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.0)",
    comments = "Source: yandex/cloud/endpoint/api_endpoint_service.proto")
public final class ApiEndpointServiceGrpc {

  private ApiEndpointServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.endpoint.ApiEndpointService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.endpoint.ApiEndpointServiceOuterClass.GetApiEndpointRequest,
      yandex.cloud.api.endpoint.ApiEndpointOuterClass.ApiEndpoint> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.endpoint.ApiEndpointServiceOuterClass.GetApiEndpointRequest.class,
      responseType = yandex.cloud.api.endpoint.ApiEndpointOuterClass.ApiEndpoint.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.endpoint.ApiEndpointServiceOuterClass.GetApiEndpointRequest,
      yandex.cloud.api.endpoint.ApiEndpointOuterClass.ApiEndpoint> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.endpoint.ApiEndpointServiceOuterClass.GetApiEndpointRequest, yandex.cloud.api.endpoint.ApiEndpointOuterClass.ApiEndpoint> getGetMethod;
    if ((getGetMethod = ApiEndpointServiceGrpc.getGetMethod) == null) {
      synchronized (ApiEndpointServiceGrpc.class) {
        if ((getGetMethod = ApiEndpointServiceGrpc.getGetMethod) == null) {
          ApiEndpointServiceGrpc.getGetMethod = getGetMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.endpoint.ApiEndpointServiceOuterClass.GetApiEndpointRequest, yandex.cloud.api.endpoint.ApiEndpointOuterClass.ApiEndpoint>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.endpoint.ApiEndpointService", "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.endpoint.ApiEndpointServiceOuterClass.GetApiEndpointRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.endpoint.ApiEndpointOuterClass.ApiEndpoint.getDefaultInstance()))
                  .setSchemaDescriptor(new ApiEndpointServiceMethodDescriptorSupplier("Get"))
                  .build();
          }
        }
     }
     return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.endpoint.ApiEndpointServiceOuterClass.ListApiEndpointsRequest,
      yandex.cloud.api.endpoint.ApiEndpointServiceOuterClass.ListApiEndpointsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.endpoint.ApiEndpointServiceOuterClass.ListApiEndpointsRequest.class,
      responseType = yandex.cloud.api.endpoint.ApiEndpointServiceOuterClass.ListApiEndpointsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.endpoint.ApiEndpointServiceOuterClass.ListApiEndpointsRequest,
      yandex.cloud.api.endpoint.ApiEndpointServiceOuterClass.ListApiEndpointsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.endpoint.ApiEndpointServiceOuterClass.ListApiEndpointsRequest, yandex.cloud.api.endpoint.ApiEndpointServiceOuterClass.ListApiEndpointsResponse> getListMethod;
    if ((getListMethod = ApiEndpointServiceGrpc.getListMethod) == null) {
      synchronized (ApiEndpointServiceGrpc.class) {
        if ((getListMethod = ApiEndpointServiceGrpc.getListMethod) == null) {
          ApiEndpointServiceGrpc.getListMethod = getListMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.endpoint.ApiEndpointServiceOuterClass.ListApiEndpointsRequest, yandex.cloud.api.endpoint.ApiEndpointServiceOuterClass.ListApiEndpointsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.endpoint.ApiEndpointService", "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.endpoint.ApiEndpointServiceOuterClass.ListApiEndpointsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.endpoint.ApiEndpointServiceOuterClass.ListApiEndpointsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ApiEndpointServiceMethodDescriptorSupplier("List"))
                  .build();
          }
        }
     }
     return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ApiEndpointServiceStub newStub(io.grpc.Channel channel) {
    return new ApiEndpointServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ApiEndpointServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ApiEndpointServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ApiEndpointServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ApiEndpointServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ApiEndpointServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void get(yandex.cloud.api.endpoint.ApiEndpointServiceOuterClass.GetApiEndpointRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.endpoint.ApiEndpointOuterClass.ApiEndpoint> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     */
    public void list(yandex.cloud.api.endpoint.ApiEndpointServiceOuterClass.ListApiEndpointsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.endpoint.ApiEndpointServiceOuterClass.ListApiEndpointsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.endpoint.ApiEndpointServiceOuterClass.GetApiEndpointRequest,
                yandex.cloud.api.endpoint.ApiEndpointOuterClass.ApiEndpoint>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.endpoint.ApiEndpointServiceOuterClass.ListApiEndpointsRequest,
                yandex.cloud.api.endpoint.ApiEndpointServiceOuterClass.ListApiEndpointsResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   */
  public static final class ApiEndpointServiceStub extends io.grpc.stub.AbstractStub<ApiEndpointServiceStub> {
    private ApiEndpointServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ApiEndpointServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ApiEndpointServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ApiEndpointServiceStub(channel, callOptions);
    }

    /**
     */
    public void get(yandex.cloud.api.endpoint.ApiEndpointServiceOuterClass.GetApiEndpointRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.endpoint.ApiEndpointOuterClass.ApiEndpoint> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void list(yandex.cloud.api.endpoint.ApiEndpointServiceOuterClass.ListApiEndpointsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.endpoint.ApiEndpointServiceOuterClass.ListApiEndpointsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ApiEndpointServiceBlockingStub extends io.grpc.stub.AbstractStub<ApiEndpointServiceBlockingStub> {
    private ApiEndpointServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ApiEndpointServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ApiEndpointServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ApiEndpointServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public yandex.cloud.api.endpoint.ApiEndpointOuterClass.ApiEndpoint get(yandex.cloud.api.endpoint.ApiEndpointServiceOuterClass.GetApiEndpointRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.endpoint.ApiEndpointServiceOuterClass.ListApiEndpointsResponse list(yandex.cloud.api.endpoint.ApiEndpointServiceOuterClass.ListApiEndpointsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ApiEndpointServiceFutureStub extends io.grpc.stub.AbstractStub<ApiEndpointServiceFutureStub> {
    private ApiEndpointServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ApiEndpointServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ApiEndpointServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ApiEndpointServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.endpoint.ApiEndpointOuterClass.ApiEndpoint> get(
        yandex.cloud.api.endpoint.ApiEndpointServiceOuterClass.GetApiEndpointRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.endpoint.ApiEndpointServiceOuterClass.ListApiEndpointsResponse> list(
        yandex.cloud.api.endpoint.ApiEndpointServiceOuterClass.ListApiEndpointsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ApiEndpointServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ApiEndpointServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.endpoint.ApiEndpointServiceOuterClass.GetApiEndpointRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.endpoint.ApiEndpointOuterClass.ApiEndpoint>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.endpoint.ApiEndpointServiceOuterClass.ListApiEndpointsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.endpoint.ApiEndpointServiceOuterClass.ListApiEndpointsResponse>) responseObserver);
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

  private static abstract class ApiEndpointServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ApiEndpointServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.endpoint.ApiEndpointServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ApiEndpointService");
    }
  }

  private static final class ApiEndpointServiceFileDescriptorSupplier
      extends ApiEndpointServiceBaseDescriptorSupplier {
    ApiEndpointServiceFileDescriptorSupplier() {}
  }

  private static final class ApiEndpointServiceMethodDescriptorSupplier
      extends ApiEndpointServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ApiEndpointServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ApiEndpointServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ApiEndpointServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
