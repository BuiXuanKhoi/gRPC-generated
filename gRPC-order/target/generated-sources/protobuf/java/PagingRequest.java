// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: order.proto

/**
 * Protobuf type {@code PagingRequest}
 */
public  final class PagingRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:PagingRequest)
    PagingRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PagingRequest.newBuilder() to construct.
  private PagingRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PagingRequest() {
    sortBy_ = "";
    sortMode_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PagingRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PagingRequest(
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
          case 8: {

            limit_ = input.readInt32();
            break;
          }
          case 16: {

            offset_ = input.readInt32();
            break;
          }
          case 24: {

            isSort_ = input.readBool();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            sortBy_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            sortMode_ = s;
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
    return Order.internal_static_PagingRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return Order.internal_static_PagingRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            PagingRequest.class, PagingRequest.Builder.class);
  }

  public static final int LIMIT_FIELD_NUMBER = 1;
  private int limit_;
  /**
   * <code>int32 limit = 1;</code>
   */
  public int getLimit() {
    return limit_;
  }

  public static final int OFFSET_FIELD_NUMBER = 2;
  private int offset_;
  /**
   * <code>int32 offset = 2;</code>
   */
  public int getOffset() {
    return offset_;
  }

  public static final int ISSORT_FIELD_NUMBER = 3;
  private boolean isSort_;
  /**
   * <code>bool isSort = 3;</code>
   */
  public boolean getIsSort() {
    return isSort_;
  }

  public static final int SORTBY_FIELD_NUMBER = 4;
  private volatile java.lang.Object sortBy_;
  /**
   * <code>string sortBy = 4;</code>
   */
  public java.lang.String getSortBy() {
    java.lang.Object ref = sortBy_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sortBy_ = s;
      return s;
    }
  }
  /**
   * <code>string sortBy = 4;</code>
   */
  public com.google.protobuf.ByteString
      getSortByBytes() {
    java.lang.Object ref = sortBy_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sortBy_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SORTMODE_FIELD_NUMBER = 5;
  private volatile java.lang.Object sortMode_;
  /**
   * <code>string sortMode = 5;</code>
   */
  public java.lang.String getSortMode() {
    java.lang.Object ref = sortMode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sortMode_ = s;
      return s;
    }
  }
  /**
   * <code>string sortMode = 5;</code>
   */
  public com.google.protobuf.ByteString
      getSortModeBytes() {
    java.lang.Object ref = sortMode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sortMode_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (limit_ != 0) {
      output.writeInt32(1, limit_);
    }
    if (offset_ != 0) {
      output.writeInt32(2, offset_);
    }
    if (isSort_ != false) {
      output.writeBool(3, isSort_);
    }
    if (!getSortByBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, sortBy_);
    }
    if (!getSortModeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, sortMode_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (limit_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, limit_);
    }
    if (offset_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, offset_);
    }
    if (isSort_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, isSort_);
    }
    if (!getSortByBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, sortBy_);
    }
    if (!getSortModeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, sortMode_);
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
    if (!(obj instanceof PagingRequest)) {
      return super.equals(obj);
    }
    PagingRequest other = (PagingRequest) obj;

    if (getLimit()
        != other.getLimit()) return false;
    if (getOffset()
        != other.getOffset()) return false;
    if (getIsSort()
        != other.getIsSort()) return false;
    if (!getSortBy()
        .equals(other.getSortBy())) return false;
    if (!getSortMode()
        .equals(other.getSortMode())) return false;
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
    hash = (37 * hash) + LIMIT_FIELD_NUMBER;
    hash = (53 * hash) + getLimit();
    hash = (37 * hash) + OFFSET_FIELD_NUMBER;
    hash = (53 * hash) + getOffset();
    hash = (37 * hash) + ISSORT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsSort());
    hash = (37 * hash) + SORTBY_FIELD_NUMBER;
    hash = (53 * hash) + getSortBy().hashCode();
    hash = (37 * hash) + SORTMODE_FIELD_NUMBER;
    hash = (53 * hash) + getSortMode().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static PagingRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static PagingRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static PagingRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static PagingRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static PagingRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static PagingRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static PagingRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static PagingRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static PagingRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static PagingRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static PagingRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static PagingRequest parseFrom(
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
  public static Builder newBuilder(PagingRequest prototype) {
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
   * Protobuf type {@code PagingRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:PagingRequest)
      PagingRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Order.internal_static_PagingRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Order.internal_static_PagingRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              PagingRequest.class, PagingRequest.Builder.class);
    }

    // Construct using PagingRequest.newBuilder()
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
      limit_ = 0;

      offset_ = 0;

      isSort_ = false;

      sortBy_ = "";

      sortMode_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return Order.internal_static_PagingRequest_descriptor;
    }

    @java.lang.Override
    public PagingRequest getDefaultInstanceForType() {
      return PagingRequest.getDefaultInstance();
    }

    @java.lang.Override
    public PagingRequest build() {
      PagingRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public PagingRequest buildPartial() {
      PagingRequest result = new PagingRequest(this);
      result.limit_ = limit_;
      result.offset_ = offset_;
      result.isSort_ = isSort_;
      result.sortBy_ = sortBy_;
      result.sortMode_ = sortMode_;
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
      if (other instanceof PagingRequest) {
        return mergeFrom((PagingRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(PagingRequest other) {
      if (other == PagingRequest.getDefaultInstance()) return this;
      if (other.getLimit() != 0) {
        setLimit(other.getLimit());
      }
      if (other.getOffset() != 0) {
        setOffset(other.getOffset());
      }
      if (other.getIsSort() != false) {
        setIsSort(other.getIsSort());
      }
      if (!other.getSortBy().isEmpty()) {
        sortBy_ = other.sortBy_;
        onChanged();
      }
      if (!other.getSortMode().isEmpty()) {
        sortMode_ = other.sortMode_;
        onChanged();
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
      PagingRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (PagingRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int limit_ ;
    /**
     * <code>int32 limit = 1;</code>
     */
    public int getLimit() {
      return limit_;
    }
    /**
     * <code>int32 limit = 1;</code>
     */
    public Builder setLimit(int value) {
      
      limit_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 limit = 1;</code>
     */
    public Builder clearLimit() {
      
      limit_ = 0;
      onChanged();
      return this;
    }

    private int offset_ ;
    /**
     * <code>int32 offset = 2;</code>
     */
    public int getOffset() {
      return offset_;
    }
    /**
     * <code>int32 offset = 2;</code>
     */
    public Builder setOffset(int value) {
      
      offset_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 offset = 2;</code>
     */
    public Builder clearOffset() {
      
      offset_ = 0;
      onChanged();
      return this;
    }

    private boolean isSort_ ;
    /**
     * <code>bool isSort = 3;</code>
     */
    public boolean getIsSort() {
      return isSort_;
    }
    /**
     * <code>bool isSort = 3;</code>
     */
    public Builder setIsSort(boolean value) {
      
      isSort_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool isSort = 3;</code>
     */
    public Builder clearIsSort() {
      
      isSort_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object sortBy_ = "";
    /**
     * <code>string sortBy = 4;</code>
     */
    public java.lang.String getSortBy() {
      java.lang.Object ref = sortBy_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sortBy_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string sortBy = 4;</code>
     */
    public com.google.protobuf.ByteString
        getSortByBytes() {
      java.lang.Object ref = sortBy_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sortBy_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string sortBy = 4;</code>
     */
    public Builder setSortBy(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      sortBy_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string sortBy = 4;</code>
     */
    public Builder clearSortBy() {
      
      sortBy_ = getDefaultInstance().getSortBy();
      onChanged();
      return this;
    }
    /**
     * <code>string sortBy = 4;</code>
     */
    public Builder setSortByBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      sortBy_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object sortMode_ = "";
    /**
     * <code>string sortMode = 5;</code>
     */
    public java.lang.String getSortMode() {
      java.lang.Object ref = sortMode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sortMode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string sortMode = 5;</code>
     */
    public com.google.protobuf.ByteString
        getSortModeBytes() {
      java.lang.Object ref = sortMode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sortMode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string sortMode = 5;</code>
     */
    public Builder setSortMode(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      sortMode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string sortMode = 5;</code>
     */
    public Builder clearSortMode() {
      
      sortMode_ = getDefaultInstance().getSortMode();
      onChanged();
      return this;
    }
    /**
     * <code>string sortMode = 5;</code>
     */
    public Builder setSortModeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      sortMode_ = value;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:PagingRequest)
  }

  // @@protoc_insertion_point(class_scope:PagingRequest)
  private static final PagingRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new PagingRequest();
  }

  public static PagingRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PagingRequest>
      PARSER = new com.google.protobuf.AbstractParser<PagingRequest>() {
    @java.lang.Override
    public PagingRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PagingRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PagingRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PagingRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public PagingRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

