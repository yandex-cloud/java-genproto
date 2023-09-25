package yandex.cloud.api.vpc.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A set of methods for managing Subnet resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/vpc/v1/subnet_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SubnetServiceGrpc {

  private SubnetServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.vpc.v1.SubnetService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.GetSubnetRequest,
      yandex.cloud.api.vpc.v1.SubnetOuterClass.Subnet> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.GetSubnetRequest.class,
      responseType = yandex.cloud.api.vpc.v1.SubnetOuterClass.Subnet.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.GetSubnetRequest,
      yandex.cloud.api.vpc.v1.SubnetOuterClass.Subnet> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.GetSubnetRequest, yandex.cloud.api.vpc.v1.SubnetOuterClass.Subnet> getGetMethod;
    if ((getGetMethod = SubnetServiceGrpc.getGetMethod) == null) {
      synchronized (SubnetServiceGrpc.class) {
        if ((getGetMethod = SubnetServiceGrpc.getGetMethod) == null) {
          SubnetServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.GetSubnetRequest, yandex.cloud.api.vpc.v1.SubnetOuterClass.Subnet>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.GetSubnetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.SubnetOuterClass.Subnet.getDefaultInstance()))
              .setSchemaDescriptor(new SubnetServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetsRequest,
      yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetsRequest.class,
      responseType = yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetsRequest,
      yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetsRequest, yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetsResponse> getListMethod;
    if ((getListMethod = SubnetServiceGrpc.getListMethod) == null) {
      synchronized (SubnetServiceGrpc.class) {
        if ((getListMethod = SubnetServiceGrpc.getListMethod) == null) {
          SubnetServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetsRequest, yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SubnetServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.CreateSubnetRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.CreateSubnetRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.CreateSubnetRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.CreateSubnetRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = SubnetServiceGrpc.getCreateMethod) == null) {
      synchronized (SubnetServiceGrpc.class) {
        if ((getCreateMethod = SubnetServiceGrpc.getCreateMethod) == null) {
          SubnetServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.CreateSubnetRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.CreateSubnetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new SubnetServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.UpdateSubnetRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.UpdateSubnetRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.UpdateSubnetRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.UpdateSubnetRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = SubnetServiceGrpc.getUpdateMethod) == null) {
      synchronized (SubnetServiceGrpc.class) {
        if ((getUpdateMethod = SubnetServiceGrpc.getUpdateMethod) == null) {
          SubnetServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.UpdateSubnetRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.UpdateSubnetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new SubnetServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.AddSubnetCidrBlocksRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getAddCidrBlocksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddCidrBlocks",
      requestType = yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.AddSubnetCidrBlocksRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.AddSubnetCidrBlocksRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getAddCidrBlocksMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.AddSubnetCidrBlocksRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getAddCidrBlocksMethod;
    if ((getAddCidrBlocksMethod = SubnetServiceGrpc.getAddCidrBlocksMethod) == null) {
      synchronized (SubnetServiceGrpc.class) {
        if ((getAddCidrBlocksMethod = SubnetServiceGrpc.getAddCidrBlocksMethod) == null) {
          SubnetServiceGrpc.getAddCidrBlocksMethod = getAddCidrBlocksMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.AddSubnetCidrBlocksRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddCidrBlocks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.AddSubnetCidrBlocksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new SubnetServiceMethodDescriptorSupplier("AddCidrBlocks"))
              .build();
        }
      }
    }
    return getAddCidrBlocksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.RemoveSubnetCidrBlocksRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRemoveCidrBlocksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveCidrBlocks",
      requestType = yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.RemoveSubnetCidrBlocksRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.RemoveSubnetCidrBlocksRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRemoveCidrBlocksMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.RemoveSubnetCidrBlocksRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getRemoveCidrBlocksMethod;
    if ((getRemoveCidrBlocksMethod = SubnetServiceGrpc.getRemoveCidrBlocksMethod) == null) {
      synchronized (SubnetServiceGrpc.class) {
        if ((getRemoveCidrBlocksMethod = SubnetServiceGrpc.getRemoveCidrBlocksMethod) == null) {
          SubnetServiceGrpc.getRemoveCidrBlocksMethod = getRemoveCidrBlocksMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.RemoveSubnetCidrBlocksRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveCidrBlocks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.RemoveSubnetCidrBlocksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new SubnetServiceMethodDescriptorSupplier("RemoveCidrBlocks"))
              .build();
        }
      }
    }
    return getRemoveCidrBlocksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.DeleteSubnetRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.DeleteSubnetRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.DeleteSubnetRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.DeleteSubnetRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = SubnetServiceGrpc.getDeleteMethod) == null) {
      synchronized (SubnetServiceGrpc.class) {
        if ((getDeleteMethod = SubnetServiceGrpc.getDeleteMethod) == null) {
          SubnetServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.DeleteSubnetRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.DeleteSubnetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new SubnetServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetOperationsRequest,
      yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetOperationsResponse> getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetOperationsRequest.class,
      responseType = yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetOperationsRequest,
      yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetOperationsResponse> getListOperationsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetOperationsRequest, yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetOperationsResponse> getListOperationsMethod;
    if ((getListOperationsMethod = SubnetServiceGrpc.getListOperationsMethod) == null) {
      synchronized (SubnetServiceGrpc.class) {
        if ((getListOperationsMethod = SubnetServiceGrpc.getListOperationsMethod) == null) {
          SubnetServiceGrpc.getListOperationsMethod = getListOperationsMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetOperationsRequest, yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetOperationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SubnetServiceMethodDescriptorSupplier("ListOperations"))
              .build();
        }
      }
    }
    return getListOperationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.MoveSubnetRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getMoveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Move",
      requestType = yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.MoveSubnetRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.MoveSubnetRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getMoveMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.MoveSubnetRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getMoveMethod;
    if ((getMoveMethod = SubnetServiceGrpc.getMoveMethod) == null) {
      synchronized (SubnetServiceGrpc.class) {
        if ((getMoveMethod = SubnetServiceGrpc.getMoveMethod) == null) {
          SubnetServiceGrpc.getMoveMethod = getMoveMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.MoveSubnetRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Move"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.MoveSubnetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new SubnetServiceMethodDescriptorSupplier("Move"))
              .build();
        }
      }
    }
    return getMoveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.RelocateSubnetRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRelocateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Relocate",
      requestType = yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.RelocateSubnetRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.RelocateSubnetRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getRelocateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.RelocateSubnetRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getRelocateMethod;
    if ((getRelocateMethod = SubnetServiceGrpc.getRelocateMethod) == null) {
      synchronized (SubnetServiceGrpc.class) {
        if ((getRelocateMethod = SubnetServiceGrpc.getRelocateMethod) == null) {
          SubnetServiceGrpc.getRelocateMethod = getRelocateMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.RelocateSubnetRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Relocate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.RelocateSubnetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new SubnetServiceMethodDescriptorSupplier("Relocate"))
              .build();
        }
      }
    }
    return getRelocateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListUsedAddressesRequest,
      yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListUsedAddressesResponse> getListUsedAddressesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListUsedAddresses",
      requestType = yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListUsedAddressesRequest.class,
      responseType = yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListUsedAddressesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListUsedAddressesRequest,
      yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListUsedAddressesResponse> getListUsedAddressesMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListUsedAddressesRequest, yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListUsedAddressesResponse> getListUsedAddressesMethod;
    if ((getListUsedAddressesMethod = SubnetServiceGrpc.getListUsedAddressesMethod) == null) {
      synchronized (SubnetServiceGrpc.class) {
        if ((getListUsedAddressesMethod = SubnetServiceGrpc.getListUsedAddressesMethod) == null) {
          SubnetServiceGrpc.getListUsedAddressesMethod = getListUsedAddressesMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListUsedAddressesRequest, yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListUsedAddressesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListUsedAddresses"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListUsedAddressesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListUsedAddressesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SubnetServiceMethodDescriptorSupplier("ListUsedAddresses"))
              .build();
        }
      }
    }
    return getListUsedAddressesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SubnetServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SubnetServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SubnetServiceStub>() {
        @java.lang.Override
        public SubnetServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SubnetServiceStub(channel, callOptions);
        }
      };
    return SubnetServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SubnetServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SubnetServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SubnetServiceBlockingStub>() {
        @java.lang.Override
        public SubnetServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SubnetServiceBlockingStub(channel, callOptions);
        }
      };
    return SubnetServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SubnetServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SubnetServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SubnetServiceFutureStub>() {
        @java.lang.Override
        public SubnetServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SubnetServiceFutureStub(channel, callOptions);
        }
      };
    return SubnetServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A set of methods for managing Subnet resources.
   * </pre>
   */
  public static abstract class SubnetServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified Subnet resource.
     * To get the list of available Subnet resources, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.GetSubnetRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.SubnetOuterClass.Subnet> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of Subnet resources in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a subnet in the specified folder and network.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public void create(yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.CreateSubnetRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified subnet.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public void update(yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.UpdateSubnetRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Adds CIDR blocks to the specified subnet.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public void addCidrBlocks(yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.AddSubnetCidrBlocksRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddCidrBlocksMethod(), responseObserver);
    }

    /**
     * <pre>
     * Removes CIDR blocks from the specified subnet.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public void removeCidrBlocks(yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.RemoveSubnetCidrBlocksRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveCidrBlocksMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified subnet.
     * </pre>
     */
    public void delete(yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.DeleteSubnetRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * List operations for the specified subnet.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetOperationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Move subnet to another folder.
     * </pre>
     */
    public void move(yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.MoveSubnetRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMoveMethod(), responseObserver);
    }

    /**
     */
    public void relocate(yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.RelocateSubnetRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRelocateMethod(), responseObserver);
    }

    /**
     * <pre>
     * List used addresses in specified subnet.
     * </pre>
     */
    public void listUsedAddresses(yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListUsedAddressesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListUsedAddressesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListUsedAddressesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.GetSubnetRequest,
                yandex.cloud.api.vpc.v1.SubnetOuterClass.Subnet>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetsRequest,
                yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetsResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.CreateSubnetRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.UpdateSubnetRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getAddCidrBlocksMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.AddSubnetCidrBlocksRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_ADD_CIDR_BLOCKS)))
          .addMethod(
            getRemoveCidrBlocksMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.RemoveSubnetCidrBlocksRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_REMOVE_CIDR_BLOCKS)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.DeleteSubnetRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListOperationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetOperationsRequest,
                yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetOperationsResponse>(
                  this, METHODID_LIST_OPERATIONS)))
          .addMethod(
            getMoveMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.MoveSubnetRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_MOVE)))
          .addMethod(
            getRelocateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.RelocateSubnetRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_RELOCATE)))
          .addMethod(
            getListUsedAddressesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListUsedAddressesRequest,
                yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListUsedAddressesResponse>(
                  this, METHODID_LIST_USED_ADDRESSES)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing Subnet resources.
   * </pre>
   */
  public static final class SubnetServiceStub extends io.grpc.stub.AbstractAsyncStub<SubnetServiceStub> {
    private SubnetServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SubnetServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SubnetServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified Subnet resource.
     * To get the list of available Subnet resources, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.GetSubnetRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.SubnetOuterClass.Subnet> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of Subnet resources in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a subnet in the specified folder and network.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public void create(yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.CreateSubnetRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified subnet.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public void update(yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.UpdateSubnetRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Adds CIDR blocks to the specified subnet.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public void addCidrBlocks(yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.AddSubnetCidrBlocksRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddCidrBlocksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Removes CIDR blocks from the specified subnet.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public void removeCidrBlocks(yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.RemoveSubnetCidrBlocksRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveCidrBlocksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified subnet.
     * </pre>
     */
    public void delete(yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.DeleteSubnetRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List operations for the specified subnet.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetOperationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Move subnet to another folder.
     * </pre>
     */
    public void move(yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.MoveSubnetRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMoveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void relocate(yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.RelocateSubnetRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRelocateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List used addresses in specified subnet.
     * </pre>
     */
    public void listUsedAddresses(yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListUsedAddressesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListUsedAddressesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListUsedAddressesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Subnet resources.
   * </pre>
   */
  public static final class SubnetServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<SubnetServiceBlockingStub> {
    private SubnetServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SubnetServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SubnetServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified Subnet resource.
     * To get the list of available Subnet resources, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.vpc.v1.SubnetOuterClass.Subnet get(yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.GetSubnetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of Subnet resources in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetsResponse list(yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a subnet in the specified folder and network.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.CreateSubnetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified subnet.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.UpdateSubnetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Adds CIDR blocks to the specified subnet.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation addCidrBlocks(yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.AddSubnetCidrBlocksRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddCidrBlocksMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Removes CIDR blocks from the specified subnet.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation removeCidrBlocks(yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.RemoveSubnetCidrBlocksRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveCidrBlocksMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified subnet.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.DeleteSubnetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List operations for the specified subnet.
     * </pre>
     */
    public yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetOperationsResponse listOperations(yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetOperationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Move subnet to another folder.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation move(yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.MoveSubnetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMoveMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation relocate(yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.RelocateSubnetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRelocateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List used addresses in specified subnet.
     * </pre>
     */
    public yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListUsedAddressesResponse listUsedAddresses(yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListUsedAddressesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListUsedAddressesMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Subnet resources.
   * </pre>
   */
  public static final class SubnetServiceFutureStub extends io.grpc.stub.AbstractFutureStub<SubnetServiceFutureStub> {
    private SubnetServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SubnetServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SubnetServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified Subnet resource.
     * To get the list of available Subnet resources, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.vpc.v1.SubnetOuterClass.Subnet> get(
        yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.GetSubnetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of Subnet resources in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetsResponse> list(
        yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a subnet in the specified folder and network.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.CreateSubnetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified subnet.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.UpdateSubnetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Adds CIDR blocks to the specified subnet.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> addCidrBlocks(
        yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.AddSubnetCidrBlocksRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddCidrBlocksMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Removes CIDR blocks from the specified subnet.
     * Method starts an asynchronous operation that can be cancelled while it is in progress.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> removeCidrBlocks(
        yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.RemoveSubnetCidrBlocksRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveCidrBlocksMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified subnet.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.DeleteSubnetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List operations for the specified subnet.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetOperationsResponse> listOperations(
        yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetOperationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Move subnet to another folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> move(
        yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.MoveSubnetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMoveMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> relocate(
        yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.RelocateSubnetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRelocateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List used addresses in specified subnet.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListUsedAddressesResponse> listUsedAddresses(
        yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListUsedAddressesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListUsedAddressesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_ADD_CIDR_BLOCKS = 4;
  private static final int METHODID_REMOVE_CIDR_BLOCKS = 5;
  private static final int METHODID_DELETE = 6;
  private static final int METHODID_LIST_OPERATIONS = 7;
  private static final int METHODID_MOVE = 8;
  private static final int METHODID_RELOCATE = 9;
  private static final int METHODID_LIST_USED_ADDRESSES = 10;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SubnetServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SubnetServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.GetSubnetRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.SubnetOuterClass.Subnet>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetsResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.CreateSubnetRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.UpdateSubnetRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_ADD_CIDR_BLOCKS:
          serviceImpl.addCidrBlocks((yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.AddSubnetCidrBlocksRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_REMOVE_CIDR_BLOCKS:
          serviceImpl.removeCidrBlocks((yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.RemoveSubnetCidrBlocksRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.DeleteSubnetRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetOperationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListSubnetOperationsResponse>) responseObserver);
          break;
        case METHODID_MOVE:
          serviceImpl.move((yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.MoveSubnetRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_RELOCATE:
          serviceImpl.relocate((yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.RelocateSubnetRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_USED_ADDRESSES:
          serviceImpl.listUsedAddresses((yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListUsedAddressesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.ListUsedAddressesResponse>) responseObserver);
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

  private static abstract class SubnetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SubnetServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.vpc.v1.SubnetServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SubnetService");
    }
  }

  private static final class SubnetServiceFileDescriptorSupplier
      extends SubnetServiceBaseDescriptorSupplier {
    SubnetServiceFileDescriptorSupplier() {}
  }

  private static final class SubnetServiceMethodDescriptorSupplier
      extends SubnetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SubnetServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SubnetServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SubnetServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getAddCidrBlocksMethod())
              .addMethod(getRemoveCidrBlocksMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getListOperationsMethod())
              .addMethod(getMoveMethod())
              .addMethod(getRelocateMethod())
              .addMethod(getListUsedAddressesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
