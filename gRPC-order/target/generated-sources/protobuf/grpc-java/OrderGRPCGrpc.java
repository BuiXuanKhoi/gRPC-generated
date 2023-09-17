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
    value = "by gRPC proto compiler (version 1.24.0)",
    comments = "Source: order.proto")
public final class OrderGRPCGrpc {

  private OrderGRPCGrpc() {}

  public static final String SERVICE_NAME = "OrderGRPC";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<CreateOrderRequest,
      OrderDetail> getCreateOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateOrder",
      requestType = CreateOrderRequest.class,
      responseType = OrderDetail.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<CreateOrderRequest,
      OrderDetail> getCreateOrderMethod() {
    io.grpc.MethodDescriptor<CreateOrderRequest, OrderDetail> getCreateOrderMethod;
    if ((getCreateOrderMethod = OrderGRPCGrpc.getCreateOrderMethod) == null) {
      synchronized (OrderGRPCGrpc.class) {
        if ((getCreateOrderMethod = OrderGRPCGrpc.getCreateOrderMethod) == null) {
          OrderGRPCGrpc.getCreateOrderMethod = getCreateOrderMethod =
              io.grpc.MethodDescriptor.<CreateOrderRequest, OrderDetail>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CreateOrderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  OrderDetail.getDefaultInstance()))
              .setSchemaDescriptor(new OrderGRPCMethodDescriptorSupplier("CreateOrder"))
              .build();
        }
      }
    }
    return getCreateOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<CreateOrderRequest,
      OrderDetail> getUpdateOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateOrder",
      requestType = CreateOrderRequest.class,
      responseType = OrderDetail.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<CreateOrderRequest,
      OrderDetail> getUpdateOrderMethod() {
    io.grpc.MethodDescriptor<CreateOrderRequest, OrderDetail> getUpdateOrderMethod;
    if ((getUpdateOrderMethod = OrderGRPCGrpc.getUpdateOrderMethod) == null) {
      synchronized (OrderGRPCGrpc.class) {
        if ((getUpdateOrderMethod = OrderGRPCGrpc.getUpdateOrderMethod) == null) {
          OrderGRPCGrpc.getUpdateOrderMethod = getUpdateOrderMethod =
              io.grpc.MethodDescriptor.<CreateOrderRequest, OrderDetail>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CreateOrderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  OrderDetail.getDefaultInstance()))
              .setSchemaDescriptor(new OrderGRPCMethodDescriptorSupplier("UpdateOrder"))
              .build();
        }
      }
    }
    return getUpdateOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GetOrderDetailRequest,
      EmptyMessage> getRemoveOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveOrder",
      requestType = GetOrderDetailRequest.class,
      responseType = EmptyMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GetOrderDetailRequest,
      EmptyMessage> getRemoveOrderMethod() {
    io.grpc.MethodDescriptor<GetOrderDetailRequest, EmptyMessage> getRemoveOrderMethod;
    if ((getRemoveOrderMethod = OrderGRPCGrpc.getRemoveOrderMethod) == null) {
      synchronized (OrderGRPCGrpc.class) {
        if ((getRemoveOrderMethod = OrderGRPCGrpc.getRemoveOrderMethod) == null) {
          OrderGRPCGrpc.getRemoveOrderMethod = getRemoveOrderMethod =
              io.grpc.MethodDescriptor.<GetOrderDetailRequest, EmptyMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GetOrderDetailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  EmptyMessage.getDefaultInstance()))
              .setSchemaDescriptor(new OrderGRPCMethodDescriptorSupplier("RemoveOrder"))
              .build();
        }
      }
    }
    return getRemoveOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GetOrderDetailRequest,
      OrderDetail> getGetOrderDetailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOrderDetail",
      requestType = GetOrderDetailRequest.class,
      responseType = OrderDetail.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GetOrderDetailRequest,
      OrderDetail> getGetOrderDetailMethod() {
    io.grpc.MethodDescriptor<GetOrderDetailRequest, OrderDetail> getGetOrderDetailMethod;
    if ((getGetOrderDetailMethod = OrderGRPCGrpc.getGetOrderDetailMethod) == null) {
      synchronized (OrderGRPCGrpc.class) {
        if ((getGetOrderDetailMethod = OrderGRPCGrpc.getGetOrderDetailMethod) == null) {
          OrderGRPCGrpc.getGetOrderDetailMethod = getGetOrderDetailMethod =
              io.grpc.MethodDescriptor.<GetOrderDetailRequest, OrderDetail>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOrderDetail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GetOrderDetailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  OrderDetail.getDefaultInstance()))
              .setSchemaDescriptor(new OrderGRPCMethodDescriptorSupplier("GetOrderDetail"))
              .build();
        }
      }
    }
    return getGetOrderDetailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GetAllOrderByUserRequest,
      AllOrdersDetail> getGetAllOrdersByUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllOrdersByUser",
      requestType = GetAllOrderByUserRequest.class,
      responseType = AllOrdersDetail.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GetAllOrderByUserRequest,
      AllOrdersDetail> getGetAllOrdersByUserMethod() {
    io.grpc.MethodDescriptor<GetAllOrderByUserRequest, AllOrdersDetail> getGetAllOrdersByUserMethod;
    if ((getGetAllOrdersByUserMethod = OrderGRPCGrpc.getGetAllOrdersByUserMethod) == null) {
      synchronized (OrderGRPCGrpc.class) {
        if ((getGetAllOrdersByUserMethod = OrderGRPCGrpc.getGetAllOrdersByUserMethod) == null) {
          OrderGRPCGrpc.getGetAllOrdersByUserMethod = getGetAllOrdersByUserMethod =
              io.grpc.MethodDescriptor.<GetAllOrderByUserRequest, AllOrdersDetail>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllOrdersByUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GetAllOrderByUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AllOrdersDetail.getDefaultInstance()))
              .setSchemaDescriptor(new OrderGRPCMethodDescriptorSupplier("GetAllOrdersByUser"))
              .build();
        }
      }
    }
    return getGetAllOrdersByUserMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OrderGRPCStub newStub(io.grpc.Channel channel) {
    return new OrderGRPCStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OrderGRPCBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new OrderGRPCBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OrderGRPCFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new OrderGRPCFutureStub(channel);
  }

  /**
   */
  public static abstract class OrderGRPCImplBase implements io.grpc.BindableService {

    /**
     */
    public void createOrder(CreateOrderRequest request,
        io.grpc.stub.StreamObserver<OrderDetail> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateOrderMethod(), responseObserver);
    }

    /**
     */
    public void updateOrder(CreateOrderRequest request,
        io.grpc.stub.StreamObserver<OrderDetail> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateOrderMethod(), responseObserver);
    }

    /**
     */
    public void removeOrder(GetOrderDetailRequest request,
        io.grpc.stub.StreamObserver<EmptyMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveOrderMethod(), responseObserver);
    }

    /**
     */
    public void getOrderDetail(GetOrderDetailRequest request,
        io.grpc.stub.StreamObserver<OrderDetail> responseObserver) {
      asyncUnimplementedUnaryCall(getGetOrderDetailMethod(), responseObserver);
    }

    /**
     */
    public void getAllOrdersByUser(GetAllOrderByUserRequest request,
        io.grpc.stub.StreamObserver<AllOrdersDetail> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllOrdersByUserMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateOrderMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                CreateOrderRequest,
                OrderDetail>(
                  this, METHODID_CREATE_ORDER)))
          .addMethod(
            getUpdateOrderMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                CreateOrderRequest,
                OrderDetail>(
                  this, METHODID_UPDATE_ORDER)))
          .addMethod(
            getRemoveOrderMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GetOrderDetailRequest,
                EmptyMessage>(
                  this, METHODID_REMOVE_ORDER)))
          .addMethod(
            getGetOrderDetailMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GetOrderDetailRequest,
                OrderDetail>(
                  this, METHODID_GET_ORDER_DETAIL)))
          .addMethod(
            getGetAllOrdersByUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GetAllOrderByUserRequest,
                AllOrdersDetail>(
                  this, METHODID_GET_ALL_ORDERS_BY_USER)))
          .build();
    }
  }

  /**
   */
  public static final class OrderGRPCStub extends io.grpc.stub.AbstractStub<OrderGRPCStub> {
    private OrderGRPCStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OrderGRPCStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrderGRPCStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OrderGRPCStub(channel, callOptions);
    }

    /**
     */
    public void createOrder(CreateOrderRequest request,
        io.grpc.stub.StreamObserver<OrderDetail> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateOrder(CreateOrderRequest request,
        io.grpc.stub.StreamObserver<OrderDetail> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeOrder(GetOrderDetailRequest request,
        io.grpc.stub.StreamObserver<EmptyMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getOrderDetail(GetOrderDetailRequest request,
        io.grpc.stub.StreamObserver<OrderDetail> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetOrderDetailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllOrdersByUser(GetAllOrderByUserRequest request,
        io.grpc.stub.StreamObserver<AllOrdersDetail> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllOrdersByUserMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class OrderGRPCBlockingStub extends io.grpc.stub.AbstractStub<OrderGRPCBlockingStub> {
    private OrderGRPCBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OrderGRPCBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrderGRPCBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OrderGRPCBlockingStub(channel, callOptions);
    }

    /**
     */
    public OrderDetail createOrder(CreateOrderRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateOrderMethod(), getCallOptions(), request);
    }

    /**
     */
    public OrderDetail updateOrder(CreateOrderRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateOrderMethod(), getCallOptions(), request);
    }

    /**
     */
    public EmptyMessage removeOrder(GetOrderDetailRequest request) {
      return blockingUnaryCall(
          getChannel(), getRemoveOrderMethod(), getCallOptions(), request);
    }

    /**
     */
    public OrderDetail getOrderDetail(GetOrderDetailRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetOrderDetailMethod(), getCallOptions(), request);
    }

    /**
     */
    public AllOrdersDetail getAllOrdersByUser(GetAllOrderByUserRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAllOrdersByUserMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class OrderGRPCFutureStub extends io.grpc.stub.AbstractStub<OrderGRPCFutureStub> {
    private OrderGRPCFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OrderGRPCFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrderGRPCFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OrderGRPCFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<OrderDetail> createOrder(
        CreateOrderRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateOrderMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<OrderDetail> updateOrder(
        CreateOrderRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateOrderMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<EmptyMessage> removeOrder(
        GetOrderDetailRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveOrderMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<OrderDetail> getOrderDetail(
        GetOrderDetailRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetOrderDetailMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<AllOrdersDetail> getAllOrdersByUser(
        GetAllOrderByUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllOrdersByUserMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_ORDER = 0;
  private static final int METHODID_UPDATE_ORDER = 1;
  private static final int METHODID_REMOVE_ORDER = 2;
  private static final int METHODID_GET_ORDER_DETAIL = 3;
  private static final int METHODID_GET_ALL_ORDERS_BY_USER = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final OrderGRPCImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(OrderGRPCImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_ORDER:
          serviceImpl.createOrder((CreateOrderRequest) request,
              (io.grpc.stub.StreamObserver<OrderDetail>) responseObserver);
          break;
        case METHODID_UPDATE_ORDER:
          serviceImpl.updateOrder((CreateOrderRequest) request,
              (io.grpc.stub.StreamObserver<OrderDetail>) responseObserver);
          break;
        case METHODID_REMOVE_ORDER:
          serviceImpl.removeOrder((GetOrderDetailRequest) request,
              (io.grpc.stub.StreamObserver<EmptyMessage>) responseObserver);
          break;
        case METHODID_GET_ORDER_DETAIL:
          serviceImpl.getOrderDetail((GetOrderDetailRequest) request,
              (io.grpc.stub.StreamObserver<OrderDetail>) responseObserver);
          break;
        case METHODID_GET_ALL_ORDERS_BY_USER:
          serviceImpl.getAllOrdersByUser((GetAllOrderByUserRequest) request,
              (io.grpc.stub.StreamObserver<AllOrdersDetail>) responseObserver);
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

  private static abstract class OrderGRPCBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OrderGRPCBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return Order.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("OrderGRPC");
    }
  }

  private static final class OrderGRPCFileDescriptorSupplier
      extends OrderGRPCBaseDescriptorSupplier {
    OrderGRPCFileDescriptorSupplier() {}
  }

  private static final class OrderGRPCMethodDescriptorSupplier
      extends OrderGRPCBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    OrderGRPCMethodDescriptorSupplier(String methodName) {
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
      synchronized (OrderGRPCGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OrderGRPCFileDescriptorSupplier())
              .addMethod(getCreateOrderMethod())
              .addMethod(getUpdateOrderMethod())
              .addMethod(getRemoveOrderMethod())
              .addMethod(getGetOrderDetailMethod())
              .addMethod(getGetAllOrdersByUserMethod())
              .build();
        }
      }
    }
    return result;
  }
}
