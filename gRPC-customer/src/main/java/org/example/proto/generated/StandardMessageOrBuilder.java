// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: customer.proto

package org.example.proto.generated;

public interface StandardMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.example.generated.StandardMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string statusCode = 1;</code>
   */
  java.lang.String getStatusCode();
  /**
   * <code>string statusCode = 1;</code>
   */
  com.google.protobuf.ByteString
      getStatusCodeBytes();

  /**
   * <code>string message = 2;</code>
   */
  java.lang.String getMessage();
  /**
   * <code>string message = 2;</code>
   */
  com.google.protobuf.ByteString
      getMessageBytes();

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
