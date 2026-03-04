package yandex.cloud.api.dns.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing DNS firewalls.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/dns/v1/dns_firewall_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DnsFirewallServiceGrpc {

  private DnsFirewallServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.dns.v1.DnsFirewallService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.GetDnsFirewallRequest,
      yandex.cloud.api.dns.v1.DnsFirewallOuterClass.DnsFirewall> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.GetDnsFirewallRequest.class,
      responseType = yandex.cloud.api.dns.v1.DnsFirewallOuterClass.DnsFirewall.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.GetDnsFirewallRequest,
      yandex.cloud.api.dns.v1.DnsFirewallOuterClass.DnsFirewall> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.GetDnsFirewallRequest, yandex.cloud.api.dns.v1.DnsFirewallOuterClass.DnsFirewall> getGetMethod;
    if ((getGetMethod = DnsFirewallServiceGrpc.getGetMethod) == null) {
      synchronized (DnsFirewallServiceGrpc.class) {
        if ((getGetMethod = DnsFirewallServiceGrpc.getGetMethod) == null) {
          DnsFirewallServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.GetDnsFirewallRequest, yandex.cloud.api.dns.v1.DnsFirewallOuterClass.DnsFirewall>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.GetDnsFirewallRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.dns.v1.DnsFirewallOuterClass.DnsFirewall.getDefaultInstance()))
              .setSchemaDescriptor(new DnsFirewallServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.ListDnsFirewallsRequest,
      yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.ListDnsFirewallsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.ListDnsFirewallsRequest.class,
      responseType = yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.ListDnsFirewallsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.ListDnsFirewallsRequest,
      yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.ListDnsFirewallsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.ListDnsFirewallsRequest, yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.ListDnsFirewallsResponse> getListMethod;
    if ((getListMethod = DnsFirewallServiceGrpc.getListMethod) == null) {
      synchronized (DnsFirewallServiceGrpc.class) {
        if ((getListMethod = DnsFirewallServiceGrpc.getListMethod) == null) {
          DnsFirewallServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.ListDnsFirewallsRequest, yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.ListDnsFirewallsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.ListDnsFirewallsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.ListDnsFirewallsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DnsFirewallServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.CreateDnsFirewallRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.CreateDnsFirewallRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.CreateDnsFirewallRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.CreateDnsFirewallRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = DnsFirewallServiceGrpc.getCreateMethod) == null) {
      synchronized (DnsFirewallServiceGrpc.class) {
        if ((getCreateMethod = DnsFirewallServiceGrpc.getCreateMethod) == null) {
          DnsFirewallServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.CreateDnsFirewallRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.CreateDnsFirewallRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new DnsFirewallServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.UpdateDnsFirewallRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.UpdateDnsFirewallRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.UpdateDnsFirewallRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.UpdateDnsFirewallRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = DnsFirewallServiceGrpc.getUpdateMethod) == null) {
      synchronized (DnsFirewallServiceGrpc.class) {
        if ((getUpdateMethod = DnsFirewallServiceGrpc.getUpdateMethod) == null) {
          DnsFirewallServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.UpdateDnsFirewallRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.UpdateDnsFirewallRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new DnsFirewallServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.MoveDnsFirewallRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getMoveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Move",
      requestType = yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.MoveDnsFirewallRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.MoveDnsFirewallRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getMoveMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.MoveDnsFirewallRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getMoveMethod;
    if ((getMoveMethod = DnsFirewallServiceGrpc.getMoveMethod) == null) {
      synchronized (DnsFirewallServiceGrpc.class) {
        if ((getMoveMethod = DnsFirewallServiceGrpc.getMoveMethod) == null) {
          DnsFirewallServiceGrpc.getMoveMethod = getMoveMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.MoveDnsFirewallRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Move"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.MoveDnsFirewallRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new DnsFirewallServiceMethodDescriptorSupplier("Move"))
              .build();
        }
      }
    }
    return getMoveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.DeleteDnsFirewallRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.DeleteDnsFirewallRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.DeleteDnsFirewallRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.DeleteDnsFirewallRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = DnsFirewallServiceGrpc.getDeleteMethod) == null) {
      synchronized (DnsFirewallServiceGrpc.class) {
        if ((getDeleteMethod = DnsFirewallServiceGrpc.getDeleteMethod) == null) {
          DnsFirewallServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.DeleteDnsFirewallRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.DeleteDnsFirewallRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new DnsFirewallServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.ListDnsFirewallOperationsRequest,
      yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.ListDnsFirewallOperationsResponse> getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.ListDnsFirewallOperationsRequest.class,
      responseType = yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.ListDnsFirewallOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.ListDnsFirewallOperationsRequest,
      yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.ListDnsFirewallOperationsResponse> getListOperationsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.ListDnsFirewallOperationsRequest, yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.ListDnsFirewallOperationsResponse> getListOperationsMethod;
    if ((getListOperationsMethod = DnsFirewallServiceGrpc.getListOperationsMethod) == null) {
      synchronized (DnsFirewallServiceGrpc.class) {
        if ((getListOperationsMethod = DnsFirewallServiceGrpc.getListOperationsMethod) == null) {
          DnsFirewallServiceGrpc.getListOperationsMethod = getListOperationsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.ListDnsFirewallOperationsRequest, yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.ListDnsFirewallOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.ListDnsFirewallOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.ListDnsFirewallOperationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DnsFirewallServiceMethodDescriptorSupplier("ListOperations"))
              .build();
        }
      }
    }
    return getListOperationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.access.Access.ListAccessBindingsRequest,
      yandex.cloud.api.access.Access.ListAccessBindingsResponse> getListAccessBindingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAccessBindings",
      requestType = yandex.cloud.api.access.Access.ListAccessBindingsRequest.class,
      responseType = yandex.cloud.api.access.Access.ListAccessBindingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.access.Access.ListAccessBindingsRequest,
      yandex.cloud.api.access.Access.ListAccessBindingsResponse> getListAccessBindingsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.access.Access.ListAccessBindingsRequest, yandex.cloud.api.access.Access.ListAccessBindingsResponse> getListAccessBindingsMethod;
    if ((getListAccessBindingsMethod = DnsFirewallServiceGrpc.getListAccessBindingsMethod) == null) {
      synchronized (DnsFirewallServiceGrpc.class) {
        if ((getListAccessBindingsMethod = DnsFirewallServiceGrpc.getListAccessBindingsMethod) == null) {
          DnsFirewallServiceGrpc.getListAccessBindingsMethod = getListAccessBindingsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.ListAccessBindingsRequest, yandex.cloud.api.access.Access.ListAccessBindingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.ListAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.ListAccessBindingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DnsFirewallServiceMethodDescriptorSupplier("ListAccessBindings"))
              .build();
        }
      }
    }
    return getListAccessBindingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.access.Access.SetAccessBindingsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getSetAccessBindingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetAccessBindings",
      requestType = yandex.cloud.api.access.Access.SetAccessBindingsRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.access.Access.SetAccessBindingsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getSetAccessBindingsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.access.Access.SetAccessBindingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getSetAccessBindingsMethod;
    if ((getSetAccessBindingsMethod = DnsFirewallServiceGrpc.getSetAccessBindingsMethod) == null) {
      synchronized (DnsFirewallServiceGrpc.class) {
        if ((getSetAccessBindingsMethod = DnsFirewallServiceGrpc.getSetAccessBindingsMethod) == null) {
          DnsFirewallServiceGrpc.getSetAccessBindingsMethod = getSetAccessBindingsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.SetAccessBindingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.SetAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new DnsFirewallServiceMethodDescriptorSupplier("SetAccessBindings"))
              .build();
        }
      }
    }
    return getSetAccessBindingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.access.Access.UpdateAccessBindingsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateAccessBindingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAccessBindings",
      requestType = yandex.cloud.api.access.Access.UpdateAccessBindingsRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.access.Access.UpdateAccessBindingsRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateAccessBindingsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.access.Access.UpdateAccessBindingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateAccessBindingsMethod;
    if ((getUpdateAccessBindingsMethod = DnsFirewallServiceGrpc.getUpdateAccessBindingsMethod) == null) {
      synchronized (DnsFirewallServiceGrpc.class) {
        if ((getUpdateAccessBindingsMethod = DnsFirewallServiceGrpc.getUpdateAccessBindingsMethod) == null) {
          DnsFirewallServiceGrpc.getUpdateAccessBindingsMethod = getUpdateAccessBindingsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.access.Access.UpdateAccessBindingsRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAccessBindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.access.Access.UpdateAccessBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new DnsFirewallServiceMethodDescriptorSupplier("UpdateAccessBindings"))
              .build();
        }
      }
    }
    return getUpdateAccessBindingsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DnsFirewallServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DnsFirewallServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DnsFirewallServiceStub>() {
        @java.lang.Override
        public DnsFirewallServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DnsFirewallServiceStub(channel, callOptions);
        }
      };
    return DnsFirewallServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DnsFirewallServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DnsFirewallServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DnsFirewallServiceBlockingStub>() {
        @java.lang.Override
        public DnsFirewallServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DnsFirewallServiceBlockingStub(channel, callOptions);
        }
      };
    return DnsFirewallServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DnsFirewallServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DnsFirewallServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DnsFirewallServiceFutureStub>() {
        @java.lang.Override
        public DnsFirewallServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DnsFirewallServiceFutureStub(channel, callOptions);
        }
      };
    return DnsFirewallServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing DNS firewalls.
   * </pre>
   */
  public static abstract class DnsFirewallServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified DNS firewall.
     * To get the list of all available DNS firewalls, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.GetDnsFirewallRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.dns.v1.DnsFirewallOuterClass.DnsFirewall> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of DNS firewalls in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.ListDnsFirewallsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.ListDnsFirewallsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a DNS firewall in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.CreateDnsFirewallRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified DNS firewall.
     * </pre>
     */
    public void update(yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.UpdateDnsFirewallRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Moves the specified DNS firewall to another folder.
     * </pre>
     */
    public void move(yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.MoveDnsFirewallRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMoveMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified DNS firewall.
     * </pre>
     */
    public void delete(yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.DeleteDnsFirewallRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified DNS firewall.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.ListDnsFirewallOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.ListDnsFirewallOperationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists existing access bindings for the specified DNS firewall.
     * </pre>
     */
    public void listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.access.Access.ListAccessBindingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAccessBindingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sets access bindings for the specified DNS firewall.
     * </pre>
     */
    public void setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetAccessBindingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates access bindings for the specified DNS firewall.
     * </pre>
     */
    public void updateAccessBindings(yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAccessBindingsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.GetDnsFirewallRequest,
                yandex.cloud.api.dns.v1.DnsFirewallOuterClass.DnsFirewall>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.ListDnsFirewallsRequest,
                yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.ListDnsFirewallsResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.CreateDnsFirewallRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.UpdateDnsFirewallRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getMoveMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.MoveDnsFirewallRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_MOVE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.DeleteDnsFirewallRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListOperationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.ListDnsFirewallOperationsRequest,
                yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.ListDnsFirewallOperationsResponse>(
                  this, METHODID_LIST_OPERATIONS)))
          .addMethod(
            getListAccessBindingsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.access.Access.ListAccessBindingsRequest,
                yandex.cloud.api.access.Access.ListAccessBindingsResponse>(
                  this, METHODID_LIST_ACCESS_BINDINGS)))
          .addMethod(
            getSetAccessBindingsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.access.Access.SetAccessBindingsRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_SET_ACCESS_BINDINGS)))
          .addMethod(
            getUpdateAccessBindingsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.access.Access.UpdateAccessBindingsRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE_ACCESS_BINDINGS)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing DNS firewalls.
   * </pre>
   */
  public static final class DnsFirewallServiceStub extends io.grpc.stub.AbstractAsyncStub<DnsFirewallServiceStub> {
    private DnsFirewallServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DnsFirewallServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DnsFirewallServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified DNS firewall.
     * To get the list of all available DNS firewalls, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.GetDnsFirewallRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.dns.v1.DnsFirewallOuterClass.DnsFirewall> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of DNS firewalls in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.ListDnsFirewallsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.ListDnsFirewallsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a DNS firewall in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.CreateDnsFirewallRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified DNS firewall.
     * </pre>
     */
    public void update(yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.UpdateDnsFirewallRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Moves the specified DNS firewall to another folder.
     * </pre>
     */
    public void move(yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.MoveDnsFirewallRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMoveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified DNS firewall.
     * </pre>
     */
    public void delete(yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.DeleteDnsFirewallRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified DNS firewall.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.ListDnsFirewallOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.ListDnsFirewallOperationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists existing access bindings for the specified DNS firewall.
     * </pre>
     */
    public void listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.access.Access.ListAccessBindingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sets access bindings for the specified DNS firewall.
     * </pre>
     */
    public void setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates access bindings for the specified DNS firewall.
     * </pre>
     */
    public void updateAccessBindings(yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAccessBindingsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing DNS firewalls.
   * </pre>
   */
  public static final class DnsFirewallServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<DnsFirewallServiceBlockingStub> {
    private DnsFirewallServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DnsFirewallServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DnsFirewallServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified DNS firewall.
     * To get the list of all available DNS firewalls, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.dns.v1.DnsFirewallOuterClass.DnsFirewall get(yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.GetDnsFirewallRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of DNS firewalls in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.ListDnsFirewallsResponse list(yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.ListDnsFirewallsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a DNS firewall in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.CreateDnsFirewallRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified DNS firewall.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.UpdateDnsFirewallRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Moves the specified DNS firewall to another folder.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation move(yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.MoveDnsFirewallRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMoveMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified DNS firewall.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.DeleteDnsFirewallRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists operations for the specified DNS firewall.
     * </pre>
     */
    public yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.ListDnsFirewallOperationsResponse listOperations(yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.ListDnsFirewallOperationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists existing access bindings for the specified DNS firewall.
     * </pre>
     */
    public yandex.cloud.api.access.Access.ListAccessBindingsResponse listAccessBindings(yandex.cloud.api.access.Access.ListAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAccessBindingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets access bindings for the specified DNS firewall.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation setAccessBindings(yandex.cloud.api.access.Access.SetAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetAccessBindingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates access bindings for the specified DNS firewall.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation updateAccessBindings(yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAccessBindingsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing DNS firewalls.
   * </pre>
   */
  public static final class DnsFirewallServiceFutureStub extends io.grpc.stub.AbstractFutureStub<DnsFirewallServiceFutureStub> {
    private DnsFirewallServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DnsFirewallServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DnsFirewallServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified DNS firewall.
     * To get the list of all available DNS firewalls, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.dns.v1.DnsFirewallOuterClass.DnsFirewall> get(
        yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.GetDnsFirewallRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of DNS firewalls in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.ListDnsFirewallsResponse> list(
        yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.ListDnsFirewallsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a DNS firewall in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.CreateDnsFirewallRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified DNS firewall.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.UpdateDnsFirewallRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Moves the specified DNS firewall to another folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> move(
        yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.MoveDnsFirewallRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMoveMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified DNS firewall.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.DeleteDnsFirewallRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists operations for the specified DNS firewall.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.ListDnsFirewallOperationsResponse> listOperations(
        yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.ListDnsFirewallOperationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists existing access bindings for the specified DNS firewall.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.access.Access.ListAccessBindingsResponse> listAccessBindings(
        yandex.cloud.api.access.Access.ListAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAccessBindingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sets access bindings for the specified DNS firewall.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> setAccessBindings(
        yandex.cloud.api.access.Access.SetAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetAccessBindingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates access bindings for the specified DNS firewall.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> updateAccessBindings(
        yandex.cloud.api.access.Access.UpdateAccessBindingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAccessBindingsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_MOVE = 4;
  private static final int METHODID_DELETE = 5;
  private static final int METHODID_LIST_OPERATIONS = 6;
  private static final int METHODID_LIST_ACCESS_BINDINGS = 7;
  private static final int METHODID_SET_ACCESS_BINDINGS = 8;
  private static final int METHODID_UPDATE_ACCESS_BINDINGS = 9;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DnsFirewallServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DnsFirewallServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.GetDnsFirewallRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.dns.v1.DnsFirewallOuterClass.DnsFirewall>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.ListDnsFirewallsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.ListDnsFirewallsResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.CreateDnsFirewallRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.UpdateDnsFirewallRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_MOVE:
          serviceImpl.move((yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.MoveDnsFirewallRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.DeleteDnsFirewallRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.ListDnsFirewallOperationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.ListDnsFirewallOperationsResponse>) responseObserver);
          break;
        case METHODID_LIST_ACCESS_BINDINGS:
          serviceImpl.listAccessBindings((yandex.cloud.api.access.Access.ListAccessBindingsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.access.Access.ListAccessBindingsResponse>) responseObserver);
          break;
        case METHODID_SET_ACCESS_BINDINGS:
          serviceImpl.setAccessBindings((yandex.cloud.api.access.Access.SetAccessBindingsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE_ACCESS_BINDINGS:
          serviceImpl.updateAccessBindings((yandex.cloud.api.access.Access.UpdateAccessBindingsRequest) request,
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

  private static abstract class DnsFirewallServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DnsFirewallServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.dns.v1.DnsFirewallServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DnsFirewallService");
    }
  }

  private static final class DnsFirewallServiceFileDescriptorSupplier
      extends DnsFirewallServiceBaseDescriptorSupplier {
    DnsFirewallServiceFileDescriptorSupplier() {}
  }

  private static final class DnsFirewallServiceMethodDescriptorSupplier
      extends DnsFirewallServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DnsFirewallServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DnsFirewallServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DnsFirewallServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getMoveMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getListOperationsMethod())
              .addMethod(getListAccessBindingsMethod())
              .addMethod(getSetAccessBindingsMethod())
              .addMethod(getUpdateAccessBindingsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
