// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: order.proto

public interface CreateOrderRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:CreateOrderRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string productId = 1;</code>
   */
  java.lang.String getProductId();
  /**
   * <code>string productId = 1;</code>
   */
  com.google.protobuf.ByteString
      getProductIdBytes();

  /**
   * <code>string quantity = 2;</code>
   */
  java.lang.String getQuantity();
  /**
   * <code>string quantity = 2;</code>
   */
  com.google.protobuf.ByteString
      getQuantityBytes();

  /**
   * <code>float unitPrice = 3;</code>
   */
  float getUnitPrice();

  /**
   * <code>float totalPrice = 4;</code>
   */
  float getTotalPrice();

  /**
   * <code>.OrderStatus status = 5;</code>
   */
  int getStatusValue();
  /**
   * <code>.OrderStatus status = 5;</code>
   */
  OrderStatus getStatus();
}
