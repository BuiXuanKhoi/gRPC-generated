package org.example.proto.generated;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.24.0)",
    comments = "Source: customer.proto")
public final class CustomerGRPCGrpc {

  private CustomerGRPCGrpc() {}

  public static final String SERVICE_NAME = "org.example.generated.CustomerGRPC";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<LoginMessage,
          LoginDetail> getLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Login",
      requestType = LoginMessage.class,
      responseType = LoginDetail.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<LoginMessage,
          LoginDetail> getLoginMethod() {
    io.grpc.MethodDescriptor<LoginMessage, LoginDetail> getLoginMethod;
    if ((getLoginMethod = CustomerGRPCGrpc.getLoginMethod) == null) {
      synchronized (CustomerGRPCGrpc.class) {
        if ((getLoginMethod = CustomerGRPCGrpc.getLoginMethod) == null) {
          CustomerGRPCGrpc.getLoginMethod = getLoginMethod =
              io.grpc.MethodDescriptor.<LoginMessage, LoginDetail>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Login"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  LoginMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  LoginDetail.getDefaultInstance()))
              .setSchemaDescriptor(new CustomerGRPCMethodDescriptorSupplier("Login"))
              .build();
        }
      }
    }
    return getLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<SignupMessage,
          UserInformation> getSignupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Signup",
      requestType = SignupMessage.class,
      responseType = UserInformation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<SignupMessage,
          UserInformation> getSignupMethod() {
    io.grpc.MethodDescriptor<SignupMessage, UserInformation> getSignupMethod;
    if ((getSignupMethod = CustomerGRPCGrpc.getSignupMethod) == null) {
      synchronized (CustomerGRPCGrpc.class) {
        if ((getSignupMethod = CustomerGRPCGrpc.getSignupMethod) == null) {
          CustomerGRPCGrpc.getSignupMethod = getSignupMethod =
              io.grpc.MethodDescriptor.<SignupMessage, UserInformation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Signup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SignupMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  UserInformation.getDefaultInstance()))
              .setSchemaDescriptor(new CustomerGRPCMethodDescriptorSupplier("Signup"))
              .build();
        }
      }
    }
    return getSignupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<UpdateInformationMessage,
          UserInformation> getUpdateInformationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateInformation",
      requestType = UpdateInformationMessage.class,
      responseType = UserInformation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<UpdateInformationMessage,
          UserInformation> getUpdateInformationMethod() {
    io.grpc.MethodDescriptor<UpdateInformationMessage, UserInformation> getUpdateInformationMethod;
    if ((getUpdateInformationMethod = CustomerGRPCGrpc.getUpdateInformationMethod) == null) {
      synchronized (CustomerGRPCGrpc.class) {
        if ((getUpdateInformationMethod = CustomerGRPCGrpc.getUpdateInformationMethod) == null) {
          CustomerGRPCGrpc.getUpdateInformationMethod = getUpdateInformationMethod =
              io.grpc.MethodDescriptor.<UpdateInformationMessage, UserInformation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateInformation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  UpdateInformationMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  UserInformation.getDefaultInstance()))
              .setSchemaDescriptor(new CustomerGRPCMethodDescriptorSupplier("UpdateInformation"))
              .build();
        }
      }
    }
    return getUpdateInformationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ChangePasswordMessage,
          StandardMessage> getChangePasswordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChangePassword",
      requestType = ChangePasswordMessage.class,
      responseType = StandardMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ChangePasswordMessage,
          StandardMessage> getChangePasswordMethod() {
    io.grpc.MethodDescriptor<ChangePasswordMessage, StandardMessage> getChangePasswordMethod;
    if ((getChangePasswordMethod = CustomerGRPCGrpc.getChangePasswordMethod) == null) {
      synchronized (CustomerGRPCGrpc.class) {
        if ((getChangePasswordMethod = CustomerGRPCGrpc.getChangePasswordMethod) == null) {
          CustomerGRPCGrpc.getChangePasswordMethod = getChangePasswordMethod =
              io.grpc.MethodDescriptor.<ChangePasswordMessage, StandardMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ChangePassword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ChangePasswordMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  StandardMessage.getDefaultInstance()))
              .setSchemaDescriptor(new CustomerGRPCMethodDescriptorSupplier("ChangePassword"))
              .build();
        }
      }
    }
    return getChangePasswordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<RemindPasswordMessage,
          StandardMessage> getRemindPasswordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemindPassword",
      requestType = RemindPasswordMessage.class,
      responseType = StandardMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<RemindPasswordMessage,
          StandardMessage> getRemindPasswordMethod() {
    io.grpc.MethodDescriptor<RemindPasswordMessage, StandardMessage> getRemindPasswordMethod;
    if ((getRemindPasswordMethod = CustomerGRPCGrpc.getRemindPasswordMethod) == null) {
      synchronized (CustomerGRPCGrpc.class) {
        if ((getRemindPasswordMethod = CustomerGRPCGrpc.getRemindPasswordMethod) == null) {
          CustomerGRPCGrpc.getRemindPasswordMethod = getRemindPasswordMethod =
              io.grpc.MethodDescriptor.<RemindPasswordMessage, StandardMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemindPassword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  RemindPasswordMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  StandardMessage.getDefaultInstance()))
              .setSchemaDescriptor(new CustomerGRPCMethodDescriptorSupplier("RemindPassword"))
              .build();
        }
      }
    }
    return getRemindPasswordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<RetakePasswordMessage,
          StandardMessage> getRetakePasswordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RetakePassword",
      requestType = RetakePasswordMessage.class,
      responseType = StandardMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<RetakePasswordMessage,
          StandardMessage> getRetakePasswordMethod() {
    io.grpc.MethodDescriptor<RetakePasswordMessage, StandardMessage> getRetakePasswordMethod;
    if ((getRetakePasswordMethod = CustomerGRPCGrpc.getRetakePasswordMethod) == null) {
      synchronized (CustomerGRPCGrpc.class) {
        if ((getRetakePasswordMethod = CustomerGRPCGrpc.getRetakePasswordMethod) == null) {
          CustomerGRPCGrpc.getRetakePasswordMethod = getRetakePasswordMethod =
              io.grpc.MethodDescriptor.<RetakePasswordMessage, StandardMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RetakePassword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  RetakePasswordMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  StandardMessage.getDefaultInstance()))
              .setSchemaDescriptor(new CustomerGRPCMethodDescriptorSupplier("RetakePassword"))
              .build();
        }
      }
    }
    return getRetakePasswordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<WithDrawMessage,
          StandardMessage> getWithDrawMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WithDraw",
      requestType = WithDrawMessage.class,
      responseType = StandardMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<WithDrawMessage,
          StandardMessage> getWithDrawMethod() {
    io.grpc.MethodDescriptor<WithDrawMessage, StandardMessage> getWithDrawMethod;
    if ((getWithDrawMethod = CustomerGRPCGrpc.getWithDrawMethod) == null) {
      synchronized (CustomerGRPCGrpc.class) {
        if ((getWithDrawMethod = CustomerGRPCGrpc.getWithDrawMethod) == null) {
          CustomerGRPCGrpc.getWithDrawMethod = getWithDrawMethod =
              io.grpc.MethodDescriptor.<WithDrawMessage, StandardMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WithDraw"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  WithDrawMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  StandardMessage.getDefaultInstance()))
              .setSchemaDescriptor(new CustomerGRPCMethodDescriptorSupplier("WithDraw"))
              .build();
        }
      }
    }
    return getWithDrawMethod;
  }

  private static volatile io.grpc.MethodDescriptor<TopUpMessage,
          StandardMessage> getTopUpMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TopUp",
      requestType = TopUpMessage.class,
      responseType = StandardMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<TopUpMessage,
          StandardMessage> getTopUpMethod() {
    io.grpc.MethodDescriptor<TopUpMessage, StandardMessage> getTopUpMethod;
    if ((getTopUpMethod = CustomerGRPCGrpc.getTopUpMethod) == null) {
      synchronized (CustomerGRPCGrpc.class) {
        if ((getTopUpMethod = CustomerGRPCGrpc.getTopUpMethod) == null) {
          CustomerGRPCGrpc.getTopUpMethod = getTopUpMethod =
              io.grpc.MethodDescriptor.<TopUpMessage, StandardMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TopUp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TopUpMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  StandardMessage.getDefaultInstance()))
              .setSchemaDescriptor(new CustomerGRPCMethodDescriptorSupplier("TopUp"))
              .build();
        }
      }
    }
    return getTopUpMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CustomerGRPCStub newStub(io.grpc.Channel channel) {
    return new CustomerGRPCStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CustomerGRPCBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CustomerGRPCBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CustomerGRPCFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CustomerGRPCFutureStub(channel);
  }

  /**
   */
  public static abstract class CustomerGRPCImplBase implements io.grpc.BindableService {

    /**
     */
    public void login(LoginMessage request,
                      io.grpc.stub.StreamObserver<LoginDetail> responseObserver) {
      asyncUnimplementedUnaryCall(getLoginMethod(), responseObserver);
    }

    /**
     */
    public void signup(SignupMessage request,
                       io.grpc.stub.StreamObserver<UserInformation> responseObserver) {
      asyncUnimplementedUnaryCall(getSignupMethod(), responseObserver);
    }

    /**
     */
    public void updateInformation(UpdateInformationMessage request,
                                  io.grpc.stub.StreamObserver<UserInformation> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateInformationMethod(), responseObserver);
    }

    /**
     */
    public void changePassword(ChangePasswordMessage request,
                               io.grpc.stub.StreamObserver<StandardMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getChangePasswordMethod(), responseObserver);
    }

    /**
     */
    public void remindPassword(RemindPasswordMessage request,
                               io.grpc.stub.StreamObserver<StandardMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getRemindPasswordMethod(), responseObserver);
    }

    /**
     */
    public void retakePassword(RetakePasswordMessage request,
                               io.grpc.stub.StreamObserver<StandardMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getRetakePasswordMethod(), responseObserver);
    }

    /**
     */
    public void withDraw(WithDrawMessage request,
                         io.grpc.stub.StreamObserver<StandardMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getWithDrawMethod(), responseObserver);
    }

    /**
     */
    public void topUp(TopUpMessage request,
                      io.grpc.stub.StreamObserver<StandardMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getTopUpMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLoginMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                      LoginMessage,
                      LoginDetail>(
                  this, METHODID_LOGIN)))
          .addMethod(
            getSignupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                      SignupMessage,
                      UserInformation>(
                  this, METHODID_SIGNUP)))
          .addMethod(
            getUpdateInformationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                      UpdateInformationMessage,
                      UserInformation>(
                  this, METHODID_UPDATE_INFORMATION)))
          .addMethod(
            getChangePasswordMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                      ChangePasswordMessage,
                      StandardMessage>(
                  this, METHODID_CHANGE_PASSWORD)))
          .addMethod(
            getRemindPasswordMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                      RemindPasswordMessage,
                      StandardMessage>(
                  this, METHODID_REMIND_PASSWORD)))
          .addMethod(
            getRetakePasswordMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                      RetakePasswordMessage,
                      StandardMessage>(
                  this, METHODID_RETAKE_PASSWORD)))
          .addMethod(
            getWithDrawMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                      WithDrawMessage,
                      StandardMessage>(
                  this, METHODID_WITH_DRAW)))
          .addMethod(
            getTopUpMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                      TopUpMessage,
                      StandardMessage>(
                  this, METHODID_TOP_UP)))
          .build();
    }
  }

  /**
   */
  public static final class CustomerGRPCStub extends io.grpc.stub.AbstractStub<CustomerGRPCStub> {
    private CustomerGRPCStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CustomerGRPCStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerGRPCStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CustomerGRPCStub(channel, callOptions);
    }

    /**
     */
    public void login(LoginMessage request,
                      io.grpc.stub.StreamObserver<LoginDetail> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void signup(SignupMessage request,
                       io.grpc.stub.StreamObserver<UserInformation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSignupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateInformation(UpdateInformationMessage request,
                                  io.grpc.stub.StreamObserver<UserInformation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateInformationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changePassword(ChangePasswordMessage request,
                               io.grpc.stub.StreamObserver<StandardMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChangePasswordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void remindPassword(RemindPasswordMessage request,
                               io.grpc.stub.StreamObserver<StandardMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemindPasswordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void retakePassword(RetakePasswordMessage request,
                               io.grpc.stub.StreamObserver<StandardMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRetakePasswordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void withDraw(WithDrawMessage request,
                         io.grpc.stub.StreamObserver<StandardMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getWithDrawMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void topUp(TopUpMessage request,
                      io.grpc.stub.StreamObserver<StandardMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTopUpMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CustomerGRPCBlockingStub extends io.grpc.stub.AbstractStub<CustomerGRPCBlockingStub> {
    private CustomerGRPCBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CustomerGRPCBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerGRPCBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CustomerGRPCBlockingStub(channel, callOptions);
    }

    /**
     */
    public LoginDetail login(LoginMessage request) {
      return blockingUnaryCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }

    /**
     */
    public UserInformation signup(SignupMessage request) {
      return blockingUnaryCall(
          getChannel(), getSignupMethod(), getCallOptions(), request);
    }

    /**
     */
    public UserInformation updateInformation(UpdateInformationMessage request) {
      return blockingUnaryCall(
          getChannel(), getUpdateInformationMethod(), getCallOptions(), request);
    }

    /**
     */
    public StandardMessage changePassword(ChangePasswordMessage request) {
      return blockingUnaryCall(
          getChannel(), getChangePasswordMethod(), getCallOptions(), request);
    }

    /**
     */
    public StandardMessage remindPassword(RemindPasswordMessage request) {
      return blockingUnaryCall(
          getChannel(), getRemindPasswordMethod(), getCallOptions(), request);
    }

    /**
     */
    public StandardMessage retakePassword(RetakePasswordMessage request) {
      return blockingUnaryCall(
          getChannel(), getRetakePasswordMethod(), getCallOptions(), request);
    }

    /**
     */
    public StandardMessage withDraw(WithDrawMessage request) {
      return blockingUnaryCall(
          getChannel(), getWithDrawMethod(), getCallOptions(), request);
    }

    /**
     */
    public StandardMessage topUp(TopUpMessage request) {
      return blockingUnaryCall(
          getChannel(), getTopUpMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CustomerGRPCFutureStub extends io.grpc.stub.AbstractStub<CustomerGRPCFutureStub> {
    private CustomerGRPCFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CustomerGRPCFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerGRPCFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CustomerGRPCFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<LoginDetail> login(
        LoginMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<UserInformation> signup(
        SignupMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getSignupMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<UserInformation> updateInformation(
        UpdateInformationMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateInformationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<StandardMessage> changePassword(
        ChangePasswordMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getChangePasswordMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<StandardMessage> remindPassword(
        RemindPasswordMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getRemindPasswordMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<StandardMessage> retakePassword(
        RetakePasswordMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getRetakePasswordMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<StandardMessage> withDraw(
        WithDrawMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getWithDrawMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<StandardMessage> topUp(
        TopUpMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getTopUpMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LOGIN = 0;
  private static final int METHODID_SIGNUP = 1;
  private static final int METHODID_UPDATE_INFORMATION = 2;
  private static final int METHODID_CHANGE_PASSWORD = 3;
  private static final int METHODID_REMIND_PASSWORD = 4;
  private static final int METHODID_RETAKE_PASSWORD = 5;
  private static final int METHODID_WITH_DRAW = 6;
  private static final int METHODID_TOP_UP = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CustomerGRPCImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CustomerGRPCImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LOGIN:
          serviceImpl.login((LoginMessage) request,
              (io.grpc.stub.StreamObserver<LoginDetail>) responseObserver);
          break;
        case METHODID_SIGNUP:
          serviceImpl.signup((SignupMessage) request,
              (io.grpc.stub.StreamObserver<UserInformation>) responseObserver);
          break;
        case METHODID_UPDATE_INFORMATION:
          serviceImpl.updateInformation((UpdateInformationMessage) request,
              (io.grpc.stub.StreamObserver<UserInformation>) responseObserver);
          break;
        case METHODID_CHANGE_PASSWORD:
          serviceImpl.changePassword((ChangePasswordMessage) request,
              (io.grpc.stub.StreamObserver<StandardMessage>) responseObserver);
          break;
        case METHODID_REMIND_PASSWORD:
          serviceImpl.remindPassword((RemindPasswordMessage) request,
              (io.grpc.stub.StreamObserver<StandardMessage>) responseObserver);
          break;
        case METHODID_RETAKE_PASSWORD:
          serviceImpl.retakePassword((RetakePasswordMessage) request,
              (io.grpc.stub.StreamObserver<StandardMessage>) responseObserver);
          break;
        case METHODID_WITH_DRAW:
          serviceImpl.withDraw((WithDrawMessage) request,
              (io.grpc.stub.StreamObserver<StandardMessage>) responseObserver);
          break;
        case METHODID_TOP_UP:
          serviceImpl.topUp((TopUpMessage) request,
              (io.grpc.stub.StreamObserver<StandardMessage>) responseObserver);
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

  private static abstract class CustomerGRPCBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CustomerGRPCBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return Customer.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CustomerGRPC");
    }
  }

  private static final class CustomerGRPCFileDescriptorSupplier
      extends CustomerGRPCBaseDescriptorSupplier {
    CustomerGRPCFileDescriptorSupplier() {}
  }

  private static final class CustomerGRPCMethodDescriptorSupplier
      extends CustomerGRPCBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CustomerGRPCMethodDescriptorSupplier(String methodName) {
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
      synchronized (CustomerGRPCGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CustomerGRPCFileDescriptorSupplier())
              .addMethod(getLoginMethod())
              .addMethod(getSignupMethod())
              .addMethod(getUpdateInformationMethod())
              .addMethod(getChangePasswordMethod())
              .addMethod(getRemindPasswordMethod())
              .addMethod(getRetakePasswordMethod())
              .addMethod(getWithDrawMethod())
              .addMethod(getTopUpMethod())
              .build();
        }
      }
    }
    return result;
  }
}
