// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: customer.proto

package org.example.proto.generated;

public interface WithDrawMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.example.generated.WithDrawMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string userId = 1;</code>
   */
  java.lang.String getUserId();
  /**
   * <code>string userId = 1;</code>
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <code>double amount = 2;</code>
   */
  double getAmount();

  /**
   * <code>.org.example.generated.AuditMessage audit = 3;</code>
   */
  boolean hasAudit();
  /**
   * <code>.org.example.generated.AuditMessage audit = 3;</code>
   */
  AuditMessage getAudit();
  /**
   * <code>.org.example.generated.AuditMessage audit = 3;</code>
   */
  AuditMessageOrBuilder getAuditOrBuilder();
}
