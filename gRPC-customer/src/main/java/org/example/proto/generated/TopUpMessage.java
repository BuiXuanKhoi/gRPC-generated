// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: customer.proto

package org.example.proto.generated;

/**
 * Protobuf type {@code org.example.generated.TopUpMessage}
 */
public  final class TopUpMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:org.example.generated.TopUpMessage)
    TopUpMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TopUpMessage.newBuilder() to construct.
  private TopUpMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TopUpMessage() {
    userId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TopUpMessage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TopUpMessage(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            userId_ = s;
            break;
          }
          case 17: {

            amount_ = input.readDouble();
            break;
          }
          case 26: {
            AuditMessage.Builder subBuilder = null;
            if (audit_ != null) {
              subBuilder = audit_.toBuilder();
            }
            audit_ = input.readMessage(AuditMessage.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(audit_);
              audit_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return Customer.internal_static_org_example_generated_TopUpMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return Customer.internal_static_org_example_generated_TopUpMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            TopUpMessage.class, TopUpMessage.Builder.class);
  }

  public static final int USERID_FIELD_NUMBER = 1;
  private volatile java.lang.Object userId_;
  /**
   * <code>string userId = 1;</code>
   */
  public java.lang.String getUserId() {
    java.lang.Object ref = userId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userId_ = s;
      return s;
    }
  }
  /**
   * <code>string userId = 1;</code>
   */
  public com.google.protobuf.ByteString
      getUserIdBytes() {
    java.lang.Object ref = userId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      userId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AMOUNT_FIELD_NUMBER = 2;
  private double amount_;
  /**
   * <code>double amount = 2;</code>
   */
  public double getAmount() {
    return amount_;
  }

  public static final int AUDIT_FIELD_NUMBER = 3;
  private AuditMessage audit_;
  /**
   * <code>.org.example.generated.AuditMessage audit = 3;</code>
   */
  public boolean hasAudit() {
    return audit_ != null;
  }
  /**
   * <code>.org.example.generated.AuditMessage audit = 3;</code>
   */
  public AuditMessage getAudit() {
    return audit_ == null ? AuditMessage.getDefaultInstance() : audit_;
  }
  /**
   * <code>.org.example.generated.AuditMessage audit = 3;</code>
   */
  public AuditMessageOrBuilder getAuditOrBuilder() {
    return getAudit();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getUserIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, userId_);
    }
    if (amount_ != 0D) {
      output.writeDouble(2, amount_);
    }
    if (audit_ != null) {
      output.writeMessage(3, getAudit());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getUserIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, userId_);
    }
    if (amount_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, amount_);
    }
    if (audit_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getAudit());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof TopUpMessage)) {
      return super.equals(obj);
    }
    TopUpMessage other = (TopUpMessage) obj;

    if (!getUserId()
        .equals(other.getUserId())) return false;
    if (java.lang.Double.doubleToLongBits(getAmount())
        != java.lang.Double.doubleToLongBits(
            other.getAmount())) return false;
    if (hasAudit() != other.hasAudit()) return false;
    if (hasAudit()) {
      if (!getAudit()
          .equals(other.getAudit())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + USERID_FIELD_NUMBER;
    hash = (53 * hash) + getUserId().hashCode();
    hash = (37 * hash) + AMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getAmount()));
    if (hasAudit()) {
      hash = (37 * hash) + AUDIT_FIELD_NUMBER;
      hash = (53 * hash) + getAudit().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static TopUpMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static TopUpMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static TopUpMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static TopUpMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static TopUpMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static TopUpMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static TopUpMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static TopUpMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static TopUpMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static TopUpMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static TopUpMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static TopUpMessage parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(TopUpMessage prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code org.example.generated.TopUpMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.example.generated.TopUpMessage)
          TopUpMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Customer.internal_static_org_example_generated_TopUpMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Customer.internal_static_org_example_generated_TopUpMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              TopUpMessage.class, TopUpMessage.Builder.class);
    }

    // Construct using org.example.generated.TopUpMessage.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      userId_ = "";

      amount_ = 0D;

      if (auditBuilder_ == null) {
        audit_ = null;
      } else {
        audit_ = null;
        auditBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return Customer.internal_static_org_example_generated_TopUpMessage_descriptor;
    }

    @java.lang.Override
    public TopUpMessage getDefaultInstanceForType() {
      return TopUpMessage.getDefaultInstance();
    }

    @java.lang.Override
    public TopUpMessage build() {
      TopUpMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public TopUpMessage buildPartial() {
      TopUpMessage result = new TopUpMessage(this);
      result.userId_ = userId_;
      result.amount_ = amount_;
      if (auditBuilder_ == null) {
        result.audit_ = audit_;
      } else {
        result.audit_ = auditBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof TopUpMessage) {
        return mergeFrom((TopUpMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(TopUpMessage other) {
      if (other == TopUpMessage.getDefaultInstance()) return this;
      if (!other.getUserId().isEmpty()) {
        userId_ = other.userId_;
        onChanged();
      }
      if (other.getAmount() != 0D) {
        setAmount(other.getAmount());
      }
      if (other.hasAudit()) {
        mergeAudit(other.getAudit());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      TopUpMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (TopUpMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object userId_ = "";
    /**
     * <code>string userId = 1;</code>
     */
    public java.lang.String getUserId() {
      java.lang.Object ref = userId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string userId = 1;</code>
     */
    public com.google.protobuf.ByteString
        getUserIdBytes() {
      java.lang.Object ref = userId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string userId = 1;</code>
     */
    public Builder setUserId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      userId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string userId = 1;</code>
     */
    public Builder clearUserId() {
      
      userId_ = getDefaultInstance().getUserId();
      onChanged();
      return this;
    }
    /**
     * <code>string userId = 1;</code>
     */
    public Builder setUserIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      userId_ = value;
      onChanged();
      return this;
    }

    private double amount_ ;
    /**
     * <code>double amount = 2;</code>
     */
    public double getAmount() {
      return amount_;
    }
    /**
     * <code>double amount = 2;</code>
     */
    public Builder setAmount(double value) {
      
      amount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double amount = 2;</code>
     */
    public Builder clearAmount() {
      
      amount_ = 0D;
      onChanged();
      return this;
    }

    private AuditMessage audit_;
    private com.google.protobuf.SingleFieldBuilderV3<
            AuditMessage, AuditMessage.Builder, AuditMessageOrBuilder> auditBuilder_;
    /**
     * <code>.org.example.generated.AuditMessage audit = 3;</code>
     */
    public boolean hasAudit() {
      return auditBuilder_ != null || audit_ != null;
    }
    /**
     * <code>.org.example.generated.AuditMessage audit = 3;</code>
     */
    public AuditMessage getAudit() {
      if (auditBuilder_ == null) {
        return audit_ == null ? AuditMessage.getDefaultInstance() : audit_;
      } else {
        return auditBuilder_.getMessage();
      }
    }
    /**
     * <code>.org.example.generated.AuditMessage audit = 3;</code>
     */
    public Builder setAudit(AuditMessage value) {
      if (auditBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        audit_ = value;
        onChanged();
      } else {
        auditBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.org.example.generated.AuditMessage audit = 3;</code>
     */
    public Builder setAudit(
        AuditMessage.Builder builderForValue) {
      if (auditBuilder_ == null) {
        audit_ = builderForValue.build();
        onChanged();
      } else {
        auditBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.org.example.generated.AuditMessage audit = 3;</code>
     */
    public Builder mergeAudit(AuditMessage value) {
      if (auditBuilder_ == null) {
        if (audit_ != null) {
          audit_ =
            AuditMessage.newBuilder(audit_).mergeFrom(value).buildPartial();
        } else {
          audit_ = value;
        }
        onChanged();
      } else {
        auditBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.org.example.generated.AuditMessage audit = 3;</code>
     */
    public Builder clearAudit() {
      if (auditBuilder_ == null) {
        audit_ = null;
        onChanged();
      } else {
        audit_ = null;
        auditBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.org.example.generated.AuditMessage audit = 3;</code>
     */
    public AuditMessage.Builder getAuditBuilder() {
      
      onChanged();
      return getAuditFieldBuilder().getBuilder();
    }
    /**
     * <code>.org.example.generated.AuditMessage audit = 3;</code>
     */
    public AuditMessageOrBuilder getAuditOrBuilder() {
      if (auditBuilder_ != null) {
        return auditBuilder_.getMessageOrBuilder();
      } else {
        return audit_ == null ?
            AuditMessage.getDefaultInstance() : audit_;
      }
    }
    /**
     * <code>.org.example.generated.AuditMessage audit = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            AuditMessage, AuditMessage.Builder, AuditMessageOrBuilder>
        getAuditFieldBuilder() {
      if (auditBuilder_ == null) {
        auditBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                AuditMessage, AuditMessage.Builder, AuditMessageOrBuilder>(
                getAudit(),
                getParentForChildren(),
                isClean());
        audit_ = null;
      }
      return auditBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:org.example.generated.TopUpMessage)
  }

  // @@protoc_insertion_point(class_scope:org.example.generated.TopUpMessage)
  private static final TopUpMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new TopUpMessage();
  }

  public static TopUpMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TopUpMessage>
      PARSER = new com.google.protobuf.AbstractParser<TopUpMessage>() {
    @java.lang.Override
    public TopUpMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TopUpMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TopUpMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TopUpMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public TopUpMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

