// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: order.proto

public interface OrderDetailOrBuilder extends
    // @@protoc_insertion_point(interface_extends:OrderDetail)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string orderId = 1;</code>
   */
  java.lang.String getOrderId();
  /**
   * <code>string orderId = 1;</code>
   */
  com.google.protobuf.ByteString
      getOrderIdBytes();

  /**
   * <code>string productId = 2;</code>
   */
  java.lang.String getProductId();
  /**
   * <code>string productId = 2;</code>
   */
  com.google.protobuf.ByteString
      getProductIdBytes();

  /**
   * <code>string quantity = 3;</code>
   */
  java.lang.String getQuantity();
  /**
   * <code>string quantity = 3;</code>
   */
  com.google.protobuf.ByteString
      getQuantityBytes();

  /**
   * <code>float unitPrice = 4;</code>
   */
  float getUnitPrice();

  /**
   * <code>float totalPrice = 5;</code>
   */
  float getTotalPrice();

  /**
   * <code>.OrderStatus status = 6;</code>
   */
  int getStatusValue();
  /**
   * <code>.OrderStatus status = 6;</code>
   */
  OrderStatus getStatus();

  /**
   * <code>string createDate = 7;</code>
   */
  java.lang.String getCreateDate();
  /**
   * <code>string createDate = 7;</code>
   */
  com.google.protobuf.ByteString
      getCreateDateBytes();

  /**
   * <code>string updateDate = 8;</code>
   */
  java.lang.String getUpdateDate();
  /**
   * <code>string updateDate = 8;</code>
   */
  com.google.protobuf.ByteString
      getUpdateDateBytes();
}