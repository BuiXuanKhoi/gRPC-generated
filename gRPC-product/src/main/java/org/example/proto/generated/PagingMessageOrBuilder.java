// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: product.proto

package org.example.proto.generated;

public interface PagingMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:PagingMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 capacity = 4;</code>
   */
  int getCapacity();

  /**
   * <code>int32 currentPage = 5;</code>
   */
  int getCurrentPage();

  /**
   * <code>int32 previousPage = 6;</code>
   */
  int getPreviousPage();

  /**
   * <code>int32 nextPage = 7;</code>
   */
  int getNextPage();

  /**
   * <code>bool isAsc = 2;</code>
   */
  boolean getIsAsc();

  /**
   * <code>bool isSort = 9;</code>
   */
  boolean getIsSort();

  /**
   * <code>repeated .Criteria sortCriteria = 3;</code>
   */
  java.util.List<org.example.proto.generated.Criteria> getSortCriteriaList();
  /**
   * <code>repeated .Criteria sortCriteria = 3;</code>
   */
  int getSortCriteriaCount();
  /**
   * <code>repeated .Criteria sortCriteria = 3;</code>
   */
  org.example.proto.generated.Criteria getSortCriteria(int index);
  /**
   * <code>repeated .Criteria sortCriteria = 3;</code>
   */
  java.util.List<java.lang.Integer>
  getSortCriteriaValueList();
  /**
   * <code>repeated .Criteria sortCriteria = 3;</code>
   */
  int getSortCriteriaValue(int index);

  /**
   * <code>repeated .Criteria filterCriteria = 10;</code>
   */
  java.util.List<org.example.proto.generated.Criteria> getFilterCriteriaList();
  /**
   * <code>repeated .Criteria filterCriteria = 10;</code>
   */
  int getFilterCriteriaCount();
  /**
   * <code>repeated .Criteria filterCriteria = 10;</code>
   */
  org.example.proto.generated.Criteria getFilterCriteria(int index);
  /**
   * <code>repeated .Criteria filterCriteria = 10;</code>
   */
  java.util.List<java.lang.Integer>
  getFilterCriteriaValueList();
  /**
   * <code>repeated .Criteria filterCriteria = 10;</code>
   */
  int getFilterCriteriaValue(int index);

  /**
   * <code>.FilterScope filterScope = 1;</code>
   */
  int getFilterScopeValue();
  /**
   * <code>.FilterScope filterScope = 1;</code>
   */
  org.example.proto.generated.FilterScope getFilterScope();

  /**
   * <code>.PagingAction action = 8;</code>
   */
  int getActionValue();
  /**
   * <code>.PagingAction action = 8;</code>
   */
  org.example.proto.generated.PagingAction getAction();
}
