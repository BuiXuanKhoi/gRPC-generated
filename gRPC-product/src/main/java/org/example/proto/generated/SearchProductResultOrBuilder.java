// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: product.proto

package org.example.proto.generated;

public interface SearchProductResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:SearchProductResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.PagingResponse pagingResponse = 1;</code>
   */
  boolean hasPagingResponse();
  /**
   * <code>.PagingResponse pagingResponse = 1;</code>
   */
  org.example.proto.generated.PagingResponse getPagingResponse();
  /**
   * <code>.PagingResponse pagingResponse = 1;</code>
   */
  org.example.proto.generated.PagingResponseOrBuilder getPagingResponseOrBuilder();

  /**
   * <code>repeated .ProductView productView = 2;</code>
   */
  java.util.List<org.example.proto.generated.ProductView> 
      getProductViewList();
  /**
   * <code>repeated .ProductView productView = 2;</code>
   */
  org.example.proto.generated.ProductView getProductView(int index);
  /**
   * <code>repeated .ProductView productView = 2;</code>
   */
  int getProductViewCount();
  /**
   * <code>repeated .ProductView productView = 2;</code>
   */
  java.util.List<? extends org.example.proto.generated.ProductViewOrBuilder> 
      getProductViewOrBuilderList();
  /**
   * <code>repeated .ProductView productView = 2;</code>
   */
  org.example.proto.generated.ProductViewOrBuilder getProductViewOrBuilder(
      int index);
}