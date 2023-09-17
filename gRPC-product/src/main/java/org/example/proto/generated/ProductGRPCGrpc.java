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
    comments = "Source: product.proto")
public final class ProductGRPCGrpc {

  private ProductGRPCGrpc() {}

  public static final String SERVICE_NAME = "ProductGRPC";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.example.proto.generated.ProductGetDetailRequest,
      org.example.proto.generated.ProductDetail> getGetProductDetailByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProductDetailById",
      requestType = org.example.proto.generated.ProductGetDetailRequest.class,
      responseType = org.example.proto.generated.ProductDetail.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.proto.generated.ProductGetDetailRequest,
      org.example.proto.generated.ProductDetail> getGetProductDetailByIdMethod() {
    io.grpc.MethodDescriptor<org.example.proto.generated.ProductGetDetailRequest, org.example.proto.generated.ProductDetail> getGetProductDetailByIdMethod;
    if ((getGetProductDetailByIdMethod = ProductGRPCGrpc.getGetProductDetailByIdMethod) == null) {
      synchronized (ProductGRPCGrpc.class) {
        if ((getGetProductDetailByIdMethod = ProductGRPCGrpc.getGetProductDetailByIdMethod) == null) {
          ProductGRPCGrpc.getGetProductDetailByIdMethod = getGetProductDetailByIdMethod =
              io.grpc.MethodDescriptor.<org.example.proto.generated.ProductGetDetailRequest, org.example.proto.generated.ProductDetail>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProductDetailById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.proto.generated.ProductGetDetailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.proto.generated.ProductDetail.getDefaultInstance()))
              .setSchemaDescriptor(new ProductGRPCMethodDescriptorSupplier("GetProductDetailById"))
              .build();
        }
      }
    }
    return getGetProductDetailByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.proto.generated.ProductsGetDetailRequest,
      org.example.proto.generated.ProductsDetail> getGetMultiProductDetailByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMultiProductDetailById",
      requestType = org.example.proto.generated.ProductsGetDetailRequest.class,
      responseType = org.example.proto.generated.ProductsDetail.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.proto.generated.ProductsGetDetailRequest,
      org.example.proto.generated.ProductsDetail> getGetMultiProductDetailByIdMethod() {
    io.grpc.MethodDescriptor<org.example.proto.generated.ProductsGetDetailRequest, org.example.proto.generated.ProductsDetail> getGetMultiProductDetailByIdMethod;
    if ((getGetMultiProductDetailByIdMethod = ProductGRPCGrpc.getGetMultiProductDetailByIdMethod) == null) {
      synchronized (ProductGRPCGrpc.class) {
        if ((getGetMultiProductDetailByIdMethod = ProductGRPCGrpc.getGetMultiProductDetailByIdMethod) == null) {
          ProductGRPCGrpc.getGetMultiProductDetailByIdMethod = getGetMultiProductDetailByIdMethod =
              io.grpc.MethodDescriptor.<org.example.proto.generated.ProductsGetDetailRequest, org.example.proto.generated.ProductsDetail>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMultiProductDetailById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.proto.generated.ProductsGetDetailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.proto.generated.ProductsDetail.getDefaultInstance()))
              .setSchemaDescriptor(new ProductGRPCMethodDescriptorSupplier("GetMultiProductDetailById"))
              .build();
        }
      }
    }
    return getGetMultiProductDetailByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.proto.generated.EmptyMessage,
      org.example.proto.generated.ProductsDetail> getGetAllProductsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllProducts",
      requestType = org.example.proto.generated.EmptyMessage.class,
      responseType = org.example.proto.generated.ProductsDetail.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.proto.generated.EmptyMessage,
      org.example.proto.generated.ProductsDetail> getGetAllProductsMethod() {
    io.grpc.MethodDescriptor<org.example.proto.generated.EmptyMessage, org.example.proto.generated.ProductsDetail> getGetAllProductsMethod;
    if ((getGetAllProductsMethod = ProductGRPCGrpc.getGetAllProductsMethod) == null) {
      synchronized (ProductGRPCGrpc.class) {
        if ((getGetAllProductsMethod = ProductGRPCGrpc.getGetAllProductsMethod) == null) {
          ProductGRPCGrpc.getGetAllProductsMethod = getGetAllProductsMethod =
              io.grpc.MethodDescriptor.<org.example.proto.generated.EmptyMessage, org.example.proto.generated.ProductsDetail>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllProducts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.proto.generated.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.proto.generated.ProductsDetail.getDefaultInstance()))
              .setSchemaDescriptor(new ProductGRPCMethodDescriptorSupplier("GetAllProducts"))
              .build();
        }
      }
    }
    return getGetAllProductsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.proto.generated.SearchProductMessage,
      org.example.proto.generated.SearchProductResult> getSearchProductByNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchProductByName",
      requestType = org.example.proto.generated.SearchProductMessage.class,
      responseType = org.example.proto.generated.SearchProductResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.proto.generated.SearchProductMessage,
      org.example.proto.generated.SearchProductResult> getSearchProductByNameMethod() {
    io.grpc.MethodDescriptor<org.example.proto.generated.SearchProductMessage, org.example.proto.generated.SearchProductResult> getSearchProductByNameMethod;
    if ((getSearchProductByNameMethod = ProductGRPCGrpc.getSearchProductByNameMethod) == null) {
      synchronized (ProductGRPCGrpc.class) {
        if ((getSearchProductByNameMethod = ProductGRPCGrpc.getSearchProductByNameMethod) == null) {
          ProductGRPCGrpc.getSearchProductByNameMethod = getSearchProductByNameMethod =
              io.grpc.MethodDescriptor.<org.example.proto.generated.SearchProductMessage, org.example.proto.generated.SearchProductResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchProductByName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.proto.generated.SearchProductMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.proto.generated.SearchProductResult.getDefaultInstance()))
              .setSchemaDescriptor(new ProductGRPCMethodDescriptorSupplier("SearchProductByName"))
              .build();
        }
      }
    }
    return getSearchProductByNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.proto.generated.ProductGetDetailRequest,
      org.example.proto.generated.StandardRespond> getRemoveProductByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveProductById",
      requestType = org.example.proto.generated.ProductGetDetailRequest.class,
      responseType = org.example.proto.generated.StandardRespond.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.proto.generated.ProductGetDetailRequest,
      org.example.proto.generated.StandardRespond> getRemoveProductByIdMethod() {
    io.grpc.MethodDescriptor<org.example.proto.generated.ProductGetDetailRequest, org.example.proto.generated.StandardRespond> getRemoveProductByIdMethod;
    if ((getRemoveProductByIdMethod = ProductGRPCGrpc.getRemoveProductByIdMethod) == null) {
      synchronized (ProductGRPCGrpc.class) {
        if ((getRemoveProductByIdMethod = ProductGRPCGrpc.getRemoveProductByIdMethod) == null) {
          ProductGRPCGrpc.getRemoveProductByIdMethod = getRemoveProductByIdMethod =
              io.grpc.MethodDescriptor.<org.example.proto.generated.ProductGetDetailRequest, org.example.proto.generated.StandardRespond>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveProductById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.proto.generated.ProductGetDetailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.proto.generated.StandardRespond.getDefaultInstance()))
              .setSchemaDescriptor(new ProductGRPCMethodDescriptorSupplier("RemoveProductById"))
              .build();
        }
      }
    }
    return getRemoveProductByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.proto.generated.ProductsGetDetailRequest,
      org.example.proto.generated.StandardRespond> getRemoveMultiProductByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveMultiProductById",
      requestType = org.example.proto.generated.ProductsGetDetailRequest.class,
      responseType = org.example.proto.generated.StandardRespond.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.proto.generated.ProductsGetDetailRequest,
      org.example.proto.generated.StandardRespond> getRemoveMultiProductByIdMethod() {
    io.grpc.MethodDescriptor<org.example.proto.generated.ProductsGetDetailRequest, org.example.proto.generated.StandardRespond> getRemoveMultiProductByIdMethod;
    if ((getRemoveMultiProductByIdMethod = ProductGRPCGrpc.getRemoveMultiProductByIdMethod) == null) {
      synchronized (ProductGRPCGrpc.class) {
        if ((getRemoveMultiProductByIdMethod = ProductGRPCGrpc.getRemoveMultiProductByIdMethod) == null) {
          ProductGRPCGrpc.getRemoveMultiProductByIdMethod = getRemoveMultiProductByIdMethod =
              io.grpc.MethodDescriptor.<org.example.proto.generated.ProductsGetDetailRequest, org.example.proto.generated.StandardRespond>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveMultiProductById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.proto.generated.ProductsGetDetailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.proto.generated.StandardRespond.getDefaultInstance()))
              .setSchemaDescriptor(new ProductGRPCMethodDescriptorSupplier("RemoveMultiProductById"))
              .build();
        }
      }
    }
    return getRemoveMultiProductByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.proto.generated.CreateProductRequest,
      org.example.proto.generated.ProductDetail> getCreateProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateProduct",
      requestType = org.example.proto.generated.CreateProductRequest.class,
      responseType = org.example.proto.generated.ProductDetail.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.proto.generated.CreateProductRequest,
      org.example.proto.generated.ProductDetail> getCreateProductMethod() {
    io.grpc.MethodDescriptor<org.example.proto.generated.CreateProductRequest, org.example.proto.generated.ProductDetail> getCreateProductMethod;
    if ((getCreateProductMethod = ProductGRPCGrpc.getCreateProductMethod) == null) {
      synchronized (ProductGRPCGrpc.class) {
        if ((getCreateProductMethod = ProductGRPCGrpc.getCreateProductMethod) == null) {
          ProductGRPCGrpc.getCreateProductMethod = getCreateProductMethod =
              io.grpc.MethodDescriptor.<org.example.proto.generated.CreateProductRequest, org.example.proto.generated.ProductDetail>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.proto.generated.CreateProductRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.proto.generated.ProductDetail.getDefaultInstance()))
              .setSchemaDescriptor(new ProductGRPCMethodDescriptorSupplier("CreateProduct"))
              .build();
        }
      }
    }
    return getCreateProductMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.proto.generated.CreateProductsRequest,
      org.example.proto.generated.ProductsDetail> getCreateMultiProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateMultiProduct",
      requestType = org.example.proto.generated.CreateProductsRequest.class,
      responseType = org.example.proto.generated.ProductsDetail.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.proto.generated.CreateProductsRequest,
      org.example.proto.generated.ProductsDetail> getCreateMultiProductMethod() {
    io.grpc.MethodDescriptor<org.example.proto.generated.CreateProductsRequest, org.example.proto.generated.ProductsDetail> getCreateMultiProductMethod;
    if ((getCreateMultiProductMethod = ProductGRPCGrpc.getCreateMultiProductMethod) == null) {
      synchronized (ProductGRPCGrpc.class) {
        if ((getCreateMultiProductMethod = ProductGRPCGrpc.getCreateMultiProductMethod) == null) {
          ProductGRPCGrpc.getCreateMultiProductMethod = getCreateMultiProductMethod =
              io.grpc.MethodDescriptor.<org.example.proto.generated.CreateProductsRequest, org.example.proto.generated.ProductsDetail>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateMultiProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.proto.generated.CreateProductsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.proto.generated.ProductsDetail.getDefaultInstance()))
              .setSchemaDescriptor(new ProductGRPCMethodDescriptorSupplier("CreateMultiProduct"))
              .build();
        }
      }
    }
    return getCreateMultiProductMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.proto.generated.UpdateProductRequest,
      org.example.proto.generated.ProductDetail> getUpdateProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateProduct",
      requestType = org.example.proto.generated.UpdateProductRequest.class,
      responseType = org.example.proto.generated.ProductDetail.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.proto.generated.UpdateProductRequest,
      org.example.proto.generated.ProductDetail> getUpdateProductMethod() {
    io.grpc.MethodDescriptor<org.example.proto.generated.UpdateProductRequest, org.example.proto.generated.ProductDetail> getUpdateProductMethod;
    if ((getUpdateProductMethod = ProductGRPCGrpc.getUpdateProductMethod) == null) {
      synchronized (ProductGRPCGrpc.class) {
        if ((getUpdateProductMethod = ProductGRPCGrpc.getUpdateProductMethod) == null) {
          ProductGRPCGrpc.getUpdateProductMethod = getUpdateProductMethod =
              io.grpc.MethodDescriptor.<org.example.proto.generated.UpdateProductRequest, org.example.proto.generated.ProductDetail>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.proto.generated.UpdateProductRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.proto.generated.ProductDetail.getDefaultInstance()))
              .setSchemaDescriptor(new ProductGRPCMethodDescriptorSupplier("UpdateProduct"))
              .build();
        }
      }
    }
    return getUpdateProductMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.proto.generated.UpdateProductsRequest,
      org.example.proto.generated.ProductsDetail> getUpdateMultiProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateMultiProduct",
      requestType = org.example.proto.generated.UpdateProductsRequest.class,
      responseType = org.example.proto.generated.ProductsDetail.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.proto.generated.UpdateProductsRequest,
      org.example.proto.generated.ProductsDetail> getUpdateMultiProductMethod() {
    io.grpc.MethodDescriptor<org.example.proto.generated.UpdateProductsRequest, org.example.proto.generated.ProductsDetail> getUpdateMultiProductMethod;
    if ((getUpdateMultiProductMethod = ProductGRPCGrpc.getUpdateMultiProductMethod) == null) {
      synchronized (ProductGRPCGrpc.class) {
        if ((getUpdateMultiProductMethod = ProductGRPCGrpc.getUpdateMultiProductMethod) == null) {
          ProductGRPCGrpc.getUpdateMultiProductMethod = getUpdateMultiProductMethod =
              io.grpc.MethodDescriptor.<org.example.proto.generated.UpdateProductsRequest, org.example.proto.generated.ProductsDetail>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateMultiProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.proto.generated.UpdateProductsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.proto.generated.ProductsDetail.getDefaultInstance()))
              .setSchemaDescriptor(new ProductGRPCMethodDescriptorSupplier("UpdateMultiProduct"))
              .build();
        }
      }
    }
    return getUpdateMultiProductMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.proto.generated.SellProductRequest,
      org.example.proto.generated.StandardRespond> getSellProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SellProduct",
      requestType = org.example.proto.generated.SellProductRequest.class,
      responseType = org.example.proto.generated.StandardRespond.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.proto.generated.SellProductRequest,
      org.example.proto.generated.StandardRespond> getSellProductMethod() {
    io.grpc.MethodDescriptor<org.example.proto.generated.SellProductRequest, org.example.proto.generated.StandardRespond> getSellProductMethod;
    if ((getSellProductMethod = ProductGRPCGrpc.getSellProductMethod) == null) {
      synchronized (ProductGRPCGrpc.class) {
        if ((getSellProductMethod = ProductGRPCGrpc.getSellProductMethod) == null) {
          ProductGRPCGrpc.getSellProductMethod = getSellProductMethod =
              io.grpc.MethodDescriptor.<org.example.proto.generated.SellProductRequest, org.example.proto.generated.StandardRespond>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SellProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.proto.generated.SellProductRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.proto.generated.StandardRespond.getDefaultInstance()))
              .setSchemaDescriptor(new ProductGRPCMethodDescriptorSupplier("SellProduct"))
              .build();
        }
      }
    }
    return getSellProductMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProductGRPCStub newStub(io.grpc.Channel channel) {
    return new ProductGRPCStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProductGRPCBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ProductGRPCBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProductGRPCFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ProductGRPCFutureStub(channel);
  }

  /**
   */
  public static abstract class ProductGRPCImplBase implements io.grpc.BindableService {

    /**
     */
    public void getProductDetailById(org.example.proto.generated.ProductGetDetailRequest request,
        io.grpc.stub.StreamObserver<org.example.proto.generated.ProductDetail> responseObserver) {
      asyncUnimplementedUnaryCall(getGetProductDetailByIdMethod(), responseObserver);
    }

    /**
     */
    public void getMultiProductDetailById(org.example.proto.generated.ProductsGetDetailRequest request,
        io.grpc.stub.StreamObserver<org.example.proto.generated.ProductsDetail> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMultiProductDetailByIdMethod(), responseObserver);
    }

    /**
     */
    public void getAllProducts(org.example.proto.generated.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.example.proto.generated.ProductsDetail> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllProductsMethod(), responseObserver);
    }

    /**
     */
    public void searchProductByName(org.example.proto.generated.SearchProductMessage request,
        io.grpc.stub.StreamObserver<org.example.proto.generated.SearchProductResult> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchProductByNameMethod(), responseObserver);
    }

    /**
     */
    public void removeProductById(org.example.proto.generated.ProductGetDetailRequest request,
        io.grpc.stub.StreamObserver<org.example.proto.generated.StandardRespond> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveProductByIdMethod(), responseObserver);
    }

    /**
     */
    public void removeMultiProductById(org.example.proto.generated.ProductsGetDetailRequest request,
        io.grpc.stub.StreamObserver<org.example.proto.generated.StandardRespond> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveMultiProductByIdMethod(), responseObserver);
    }

    /**
     */
    public void createProduct(org.example.proto.generated.CreateProductRequest request,
        io.grpc.stub.StreamObserver<org.example.proto.generated.ProductDetail> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateProductMethod(), responseObserver);
    }

    /**
     */
    public void createMultiProduct(org.example.proto.generated.CreateProductsRequest request,
        io.grpc.stub.StreamObserver<org.example.proto.generated.ProductsDetail> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMultiProductMethod(), responseObserver);
    }

    /**
     */
    public void updateProduct(org.example.proto.generated.UpdateProductRequest request,
        io.grpc.stub.StreamObserver<org.example.proto.generated.ProductDetail> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateProductMethod(), responseObserver);
    }

    /**
     */
    public void updateMultiProduct(org.example.proto.generated.UpdateProductsRequest request,
        io.grpc.stub.StreamObserver<org.example.proto.generated.ProductsDetail> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMultiProductMethod(), responseObserver);
    }

    /**
     */
    public void sellProduct(org.example.proto.generated.SellProductRequest request,
        io.grpc.stub.StreamObserver<org.example.proto.generated.StandardRespond> responseObserver) {
      asyncUnimplementedUnaryCall(getSellProductMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetProductDetailByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.proto.generated.ProductGetDetailRequest,
                org.example.proto.generated.ProductDetail>(
                  this, METHODID_GET_PRODUCT_DETAIL_BY_ID)))
          .addMethod(
            getGetMultiProductDetailByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.proto.generated.ProductsGetDetailRequest,
                org.example.proto.generated.ProductsDetail>(
                  this, METHODID_GET_MULTI_PRODUCT_DETAIL_BY_ID)))
          .addMethod(
            getGetAllProductsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.proto.generated.EmptyMessage,
                org.example.proto.generated.ProductsDetail>(
                  this, METHODID_GET_ALL_PRODUCTS)))
          .addMethod(
            getSearchProductByNameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.proto.generated.SearchProductMessage,
                org.example.proto.generated.SearchProductResult>(
                  this, METHODID_SEARCH_PRODUCT_BY_NAME)))
          .addMethod(
            getRemoveProductByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.proto.generated.ProductGetDetailRequest,
                org.example.proto.generated.StandardRespond>(
                  this, METHODID_REMOVE_PRODUCT_BY_ID)))
          .addMethod(
            getRemoveMultiProductByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.proto.generated.ProductsGetDetailRequest,
                org.example.proto.generated.StandardRespond>(
                  this, METHODID_REMOVE_MULTI_PRODUCT_BY_ID)))
          .addMethod(
            getCreateProductMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.proto.generated.CreateProductRequest,
                org.example.proto.generated.ProductDetail>(
                  this, METHODID_CREATE_PRODUCT)))
          .addMethod(
            getCreateMultiProductMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.proto.generated.CreateProductsRequest,
                org.example.proto.generated.ProductsDetail>(
                  this, METHODID_CREATE_MULTI_PRODUCT)))
          .addMethod(
            getUpdateProductMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.proto.generated.UpdateProductRequest,
                org.example.proto.generated.ProductDetail>(
                  this, METHODID_UPDATE_PRODUCT)))
          .addMethod(
            getUpdateMultiProductMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.proto.generated.UpdateProductsRequest,
                org.example.proto.generated.ProductsDetail>(
                  this, METHODID_UPDATE_MULTI_PRODUCT)))
          .addMethod(
            getSellProductMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.proto.generated.SellProductRequest,
                org.example.proto.generated.StandardRespond>(
                  this, METHODID_SELL_PRODUCT)))
          .build();
    }
  }

  /**
   */
  public static final class ProductGRPCStub extends io.grpc.stub.AbstractStub<ProductGRPCStub> {
    private ProductGRPCStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProductGRPCStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductGRPCStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProductGRPCStub(channel, callOptions);
    }

    /**
     */
    public void getProductDetailById(org.example.proto.generated.ProductGetDetailRequest request,
        io.grpc.stub.StreamObserver<org.example.proto.generated.ProductDetail> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetProductDetailByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMultiProductDetailById(org.example.proto.generated.ProductsGetDetailRequest request,
        io.grpc.stub.StreamObserver<org.example.proto.generated.ProductsDetail> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMultiProductDetailByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllProducts(org.example.proto.generated.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.example.proto.generated.ProductsDetail> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllProductsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchProductByName(org.example.proto.generated.SearchProductMessage request,
        io.grpc.stub.StreamObserver<org.example.proto.generated.SearchProductResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchProductByNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeProductById(org.example.proto.generated.ProductGetDetailRequest request,
        io.grpc.stub.StreamObserver<org.example.proto.generated.StandardRespond> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveProductByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeMultiProductById(org.example.proto.generated.ProductsGetDetailRequest request,
        io.grpc.stub.StreamObserver<org.example.proto.generated.StandardRespond> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveMultiProductByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createProduct(org.example.proto.generated.CreateProductRequest request,
        io.grpc.stub.StreamObserver<org.example.proto.generated.ProductDetail> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateProductMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createMultiProduct(org.example.proto.generated.CreateProductsRequest request,
        io.grpc.stub.StreamObserver<org.example.proto.generated.ProductsDetail> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMultiProductMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateProduct(org.example.proto.generated.UpdateProductRequest request,
        io.grpc.stub.StreamObserver<org.example.proto.generated.ProductDetail> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateProductMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateMultiProduct(org.example.proto.generated.UpdateProductsRequest request,
        io.grpc.stub.StreamObserver<org.example.proto.generated.ProductsDetail> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMultiProductMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sellProduct(org.example.proto.generated.SellProductRequest request,
        io.grpc.stub.StreamObserver<org.example.proto.generated.StandardRespond> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSellProductMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ProductGRPCBlockingStub extends io.grpc.stub.AbstractStub<ProductGRPCBlockingStub> {
    private ProductGRPCBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProductGRPCBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductGRPCBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProductGRPCBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.example.proto.generated.ProductDetail getProductDetailById(org.example.proto.generated.ProductGetDetailRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetProductDetailByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.proto.generated.ProductsDetail getMultiProductDetailById(org.example.proto.generated.ProductsGetDetailRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMultiProductDetailByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.proto.generated.ProductsDetail getAllProducts(org.example.proto.generated.EmptyMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetAllProductsMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.proto.generated.SearchProductResult searchProductByName(org.example.proto.generated.SearchProductMessage request) {
      return blockingUnaryCall(
          getChannel(), getSearchProductByNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.proto.generated.StandardRespond removeProductById(org.example.proto.generated.ProductGetDetailRequest request) {
      return blockingUnaryCall(
          getChannel(), getRemoveProductByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.proto.generated.StandardRespond removeMultiProductById(org.example.proto.generated.ProductsGetDetailRequest request) {
      return blockingUnaryCall(
          getChannel(), getRemoveMultiProductByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.proto.generated.ProductDetail createProduct(org.example.proto.generated.CreateProductRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateProductMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.proto.generated.ProductsDetail createMultiProduct(org.example.proto.generated.CreateProductsRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMultiProductMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.proto.generated.ProductDetail updateProduct(org.example.proto.generated.UpdateProductRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateProductMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.proto.generated.ProductsDetail updateMultiProduct(org.example.proto.generated.UpdateProductsRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMultiProductMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.proto.generated.StandardRespond sellProduct(org.example.proto.generated.SellProductRequest request) {
      return blockingUnaryCall(
          getChannel(), getSellProductMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ProductGRPCFutureStub extends io.grpc.stub.AbstractStub<ProductGRPCFutureStub> {
    private ProductGRPCFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProductGRPCFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductGRPCFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProductGRPCFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.proto.generated.ProductDetail> getProductDetailById(
        org.example.proto.generated.ProductGetDetailRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetProductDetailByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.proto.generated.ProductsDetail> getMultiProductDetailById(
        org.example.proto.generated.ProductsGetDetailRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMultiProductDetailByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.proto.generated.ProductsDetail> getAllProducts(
        org.example.proto.generated.EmptyMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllProductsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.proto.generated.SearchProductResult> searchProductByName(
        org.example.proto.generated.SearchProductMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchProductByNameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.proto.generated.StandardRespond> removeProductById(
        org.example.proto.generated.ProductGetDetailRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveProductByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.proto.generated.StandardRespond> removeMultiProductById(
        org.example.proto.generated.ProductsGetDetailRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveMultiProductByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.proto.generated.ProductDetail> createProduct(
        org.example.proto.generated.CreateProductRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateProductMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.proto.generated.ProductsDetail> createMultiProduct(
        org.example.proto.generated.CreateProductsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMultiProductMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.proto.generated.ProductDetail> updateProduct(
        org.example.proto.generated.UpdateProductRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateProductMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.proto.generated.ProductsDetail> updateMultiProduct(
        org.example.proto.generated.UpdateProductsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMultiProductMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.proto.generated.StandardRespond> sellProduct(
        org.example.proto.generated.SellProductRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSellProductMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PRODUCT_DETAIL_BY_ID = 0;
  private static final int METHODID_GET_MULTI_PRODUCT_DETAIL_BY_ID = 1;
  private static final int METHODID_GET_ALL_PRODUCTS = 2;
  private static final int METHODID_SEARCH_PRODUCT_BY_NAME = 3;
  private static final int METHODID_REMOVE_PRODUCT_BY_ID = 4;
  private static final int METHODID_REMOVE_MULTI_PRODUCT_BY_ID = 5;
  private static final int METHODID_CREATE_PRODUCT = 6;
  private static final int METHODID_CREATE_MULTI_PRODUCT = 7;
  private static final int METHODID_UPDATE_PRODUCT = 8;
  private static final int METHODID_UPDATE_MULTI_PRODUCT = 9;
  private static final int METHODID_SELL_PRODUCT = 10;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProductGRPCImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProductGRPCImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PRODUCT_DETAIL_BY_ID:
          serviceImpl.getProductDetailById((org.example.proto.generated.ProductGetDetailRequest) request,
              (io.grpc.stub.StreamObserver<org.example.proto.generated.ProductDetail>) responseObserver);
          break;
        case METHODID_GET_MULTI_PRODUCT_DETAIL_BY_ID:
          serviceImpl.getMultiProductDetailById((org.example.proto.generated.ProductsGetDetailRequest) request,
              (io.grpc.stub.StreamObserver<org.example.proto.generated.ProductsDetail>) responseObserver);
          break;
        case METHODID_GET_ALL_PRODUCTS:
          serviceImpl.getAllProducts((org.example.proto.generated.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<org.example.proto.generated.ProductsDetail>) responseObserver);
          break;
        case METHODID_SEARCH_PRODUCT_BY_NAME:
          serviceImpl.searchProductByName((org.example.proto.generated.SearchProductMessage) request,
              (io.grpc.stub.StreamObserver<org.example.proto.generated.SearchProductResult>) responseObserver);
          break;
        case METHODID_REMOVE_PRODUCT_BY_ID:
          serviceImpl.removeProductById((org.example.proto.generated.ProductGetDetailRequest) request,
              (io.grpc.stub.StreamObserver<org.example.proto.generated.StandardRespond>) responseObserver);
          break;
        case METHODID_REMOVE_MULTI_PRODUCT_BY_ID:
          serviceImpl.removeMultiProductById((org.example.proto.generated.ProductsGetDetailRequest) request,
              (io.grpc.stub.StreamObserver<org.example.proto.generated.StandardRespond>) responseObserver);
          break;
        case METHODID_CREATE_PRODUCT:
          serviceImpl.createProduct((org.example.proto.generated.CreateProductRequest) request,
              (io.grpc.stub.StreamObserver<org.example.proto.generated.ProductDetail>) responseObserver);
          break;
        case METHODID_CREATE_MULTI_PRODUCT:
          serviceImpl.createMultiProduct((org.example.proto.generated.CreateProductsRequest) request,
              (io.grpc.stub.StreamObserver<org.example.proto.generated.ProductsDetail>) responseObserver);
          break;
        case METHODID_UPDATE_PRODUCT:
          serviceImpl.updateProduct((org.example.proto.generated.UpdateProductRequest) request,
              (io.grpc.stub.StreamObserver<org.example.proto.generated.ProductDetail>) responseObserver);
          break;
        case METHODID_UPDATE_MULTI_PRODUCT:
          serviceImpl.updateMultiProduct((org.example.proto.generated.UpdateProductsRequest) request,
              (io.grpc.stub.StreamObserver<org.example.proto.generated.ProductsDetail>) responseObserver);
          break;
        case METHODID_SELL_PRODUCT:
          serviceImpl.sellProduct((org.example.proto.generated.SellProductRequest) request,
              (io.grpc.stub.StreamObserver<org.example.proto.generated.StandardRespond>) responseObserver);
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

  private static abstract class ProductGRPCBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProductGRPCBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.proto.generated.Product.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProductGRPC");
    }
  }

  private static final class ProductGRPCFileDescriptorSupplier
      extends ProductGRPCBaseDescriptorSupplier {
    ProductGRPCFileDescriptorSupplier() {}
  }

  private static final class ProductGRPCMethodDescriptorSupplier
      extends ProductGRPCBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProductGRPCMethodDescriptorSupplier(String methodName) {
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
      synchronized (ProductGRPCGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProductGRPCFileDescriptorSupplier())
              .addMethod(getGetProductDetailByIdMethod())
              .addMethod(getGetMultiProductDetailByIdMethod())
              .addMethod(getGetAllProductsMethod())
              .addMethod(getSearchProductByNameMethod())
              .addMethod(getRemoveProductByIdMethod())
              .addMethod(getRemoveMultiProductByIdMethod())
              .addMethod(getCreateProductMethod())
              .addMethod(getCreateMultiProductMethod())
              .addMethod(getUpdateProductMethod())
              .addMethod(getUpdateMultiProductMethod())
              .addMethod(getSellProductMethod())
              .build();
        }
      }
    }
    return result;
  }
}
