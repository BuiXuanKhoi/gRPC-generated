// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: order.proto

public interface AllOrdersDetailOrBuilder extends
    // @@protoc_insertion_point(interface_extends:AllOrdersDetail)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.PagingRequest pagingRequest = 2;</code>
   */
  boolean hasPagingRequest();
  /**
   * <code>.PagingRequest pagingRequest = 2;</code>
   */
  PagingRequest getPagingRequest();
  /**
   * <code>.PagingRequest pagingRequest = 2;</code>
   */
  PagingRequestOrBuilder getPagingRequestOrBuilder();

  /**
   * <code>repeated .OrderDetail ordersDetail = 1;</code>
   */
  java.util.List<OrderDetail> 
      getOrdersDetailList();
  /**
   * <code>repeated .OrderDetail ordersDetail = 1;</code>
   */
  OrderDetail getOrdersDetail(int index);
  /**
   * <code>repeated .OrderDetail ordersDetail = 1;</code>
   */
  int getOrdersDetailCount();
  /**
   * <code>repeated .OrderDetail ordersDetail = 1;</code>
   */
  java.util.List<? extends OrderDetailOrBuilder> 
      getOrdersDetailOrBuilderList();
  /**
   * <code>repeated .OrderDetail ordersDetail = 1;</code>
   */
  OrderDetailOrBuilder getOrdersDetailOrBuilder(
      int index);
}
