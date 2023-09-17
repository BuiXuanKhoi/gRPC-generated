// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: order.proto

/**
 * Protobuf type {@code CreateOrderRequest}
 */
public  final class CreateOrderRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:CreateOrderRequest)
    CreateOrderRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateOrderRequest.newBuilder() to construct.
  private CreateOrderRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateOrderRequest() {
    productId_ = "";
    quantity_ = "";
    status_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateOrderRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateOrderRequest(
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

            productId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            quantity_ = s;
            break;
          }
          case 29: {

            unitPrice_ = input.readFloat();
            break;
          }
          case 37: {

            totalPrice_ = input.readFloat();
            break;
          }
          case 40: {
            int rawValue = input.readEnum();

            status_ = rawValue;
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
    return Order.internal_static_CreateOrderRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return Order.internal_static_CreateOrderRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            CreateOrderRequest.class, CreateOrderRequest.Builder.class);
  }

  public static final int PRODUCTID_FIELD_NUMBER = 1;
  private volatile java.lang.Object productId_;
  /**
   * <code>string productId = 1;</code>
   */
  public java.lang.String getProductId() {
    java.lang.Object ref = productId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      productId_ = s;
      return s;
    }
  }
  /**
   * <code>string productId = 1;</code>
   */
  public com.google.protobuf.ByteString
      getProductIdBytes() {
    java.lang.Object ref = productId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      productId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int QUANTITY_FIELD_NUMBER = 2;
  private volatile java.lang.Object quantity_;
  /**
   * <code>string quantity = 2;</code>
   */
  public java.lang.String getQuantity() {
    java.lang.Object ref = quantity_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      quantity_ = s;
      return s;
    }
  }
  /**
   * <code>string quantity = 2;</code>
   */
  public com.google.protobuf.ByteString
      getQuantityBytes() {
    java.lang.Object ref = quantity_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      quantity_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int UNITPRICE_FIELD_NUMBER = 3;
  private float unitPrice_;
  /**
   * <code>float unitPrice = 3;</code>
   */
  public float getUnitPrice() {
    return unitPrice_;
  }

  public static final int TOTALPRICE_FIELD_NUMBER = 4;
  private float totalPrice_;
  /**
   * <code>float totalPrice = 4;</code>
   */
  public float getTotalPrice() {
    return totalPrice_;
  }

  public static final int STATUS_FIELD_NUMBER = 5;
  private int status_;
  /**
   * <code>.OrderStatus status = 5;</code>
   */
  public int getStatusValue() {
    return status_;
  }
  /**
   * <code>.OrderStatus status = 5;</code>
   */
  public OrderStatus getStatus() {
    @SuppressWarnings("deprecation")
    OrderStatus result = OrderStatus.valueOf(status_);
    return result == null ? OrderStatus.UNRECOGNIZED : result;
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
    if (!getProductIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, productId_);
    }
    if (!getQuantityBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, quantity_);
    }
    if (unitPrice_ != 0F) {
      output.writeFloat(3, unitPrice_);
    }
    if (totalPrice_ != 0F) {
      output.writeFloat(4, totalPrice_);
    }
    if (status_ != OrderStatus.PREPARED.getNumber()) {
      output.writeEnum(5, status_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getProductIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, productId_);
    }
    if (!getQuantityBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, quantity_);
    }
    if (unitPrice_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, unitPrice_);
    }
    if (totalPrice_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(4, totalPrice_);
    }
    if (status_ != OrderStatus.PREPARED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(5, status_);
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
    if (!(obj instanceof CreateOrderRequest)) {
      return super.equals(obj);
    }
    CreateOrderRequest other = (CreateOrderRequest) obj;

    if (!getProductId()
        .equals(other.getProductId())) return false;
    if (!getQuantity()
        .equals(other.getQuantity())) return false;
    if (java.lang.Float.floatToIntBits(getUnitPrice())
        != java.lang.Float.floatToIntBits(
            other.getUnitPrice())) return false;
    if (java.lang.Float.floatToIntBits(getTotalPrice())
        != java.lang.Float.floatToIntBits(
            other.getTotalPrice())) return false;
    if (status_ != other.status_) return false;
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
    hash = (37 * hash) + PRODUCTID_FIELD_NUMBER;
    hash = (53 * hash) + getProductId().hashCode();
    hash = (37 * hash) + QUANTITY_FIELD_NUMBER;
    hash = (53 * hash) + getQuantity().hashCode();
    hash = (37 * hash) + UNITPRICE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getUnitPrice());
    hash = (37 * hash) + TOTALPRICE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getTotalPrice());
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + status_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static CreateOrderRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static CreateOrderRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static CreateOrderRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static CreateOrderRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static CreateOrderRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static CreateOrderRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static CreateOrderRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static CreateOrderRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static CreateOrderRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static CreateOrderRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static CreateOrderRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static CreateOrderRequest parseFrom(
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
  public static Builder newBuilder(CreateOrderRequest prototype) {
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
   * Protobuf type {@code CreateOrderRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:CreateOrderRequest)
      CreateOrderRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Order.internal_static_CreateOrderRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Order.internal_static_CreateOrderRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              CreateOrderRequest.class, CreateOrderRequest.Builder.class);
    }

    // Construct using CreateOrderRequest.newBuilder()
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
      productId_ = "";

      quantity_ = "";

      unitPrice_ = 0F;

      totalPrice_ = 0F;

      status_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return Order.internal_static_CreateOrderRequest_descriptor;
    }

    @java.lang.Override
    public CreateOrderRequest getDefaultInstanceForType() {
      return CreateOrderRequest.getDefaultInstance();
    }

    @java.lang.Override
    public CreateOrderRequest build() {
      CreateOrderRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public CreateOrderRequest buildPartial() {
      CreateOrderRequest result = new CreateOrderRequest(this);
      result.productId_ = productId_;
      result.quantity_ = quantity_;
      result.unitPrice_ = unitPrice_;
      result.totalPrice_ = totalPrice_;
      result.status_ = status_;
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
      if (other instanceof CreateOrderRequest) {
        return mergeFrom((CreateOrderRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(CreateOrderRequest other) {
      if (other == CreateOrderRequest.getDefaultInstance()) return this;
      if (!other.getProductId().isEmpty()) {
        productId_ = other.productId_;
        onChanged();
      }
      if (!other.getQuantity().isEmpty()) {
        quantity_ = other.quantity_;
        onChanged();
      }
      if (other.getUnitPrice() != 0F) {
        setUnitPrice(other.getUnitPrice());
      }
      if (other.getTotalPrice() != 0F) {
        setTotalPrice(other.getTotalPrice());
      }
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
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
      CreateOrderRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (CreateOrderRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object productId_ = "";
    /**
     * <code>string productId = 1;</code>
     */
    public java.lang.String getProductId() {
      java.lang.Object ref = productId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        productId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string productId = 1;</code>
     */
    public com.google.protobuf.ByteString
        getProductIdBytes() {
      java.lang.Object ref = productId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        productId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string productId = 1;</code>
     */
    public Builder setProductId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      productId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string productId = 1;</code>
     */
    public Builder clearProductId() {
      
      productId_ = getDefaultInstance().getProductId();
      onChanged();
      return this;
    }
    /**
     * <code>string productId = 1;</code>
     */
    public Builder setProductIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      productId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object quantity_ = "";
    /**
     * <code>string quantity = 2;</code>
     */
    public java.lang.String getQuantity() {
      java.lang.Object ref = quantity_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        quantity_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string quantity = 2;</code>
     */
    public com.google.protobuf.ByteString
        getQuantityBytes() {
      java.lang.Object ref = quantity_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        quantity_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string quantity = 2;</code>
     */
    public Builder setQuantity(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      quantity_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string quantity = 2;</code>
     */
    public Builder clearQuantity() {
      
      quantity_ = getDefaultInstance().getQuantity();
      onChanged();
      return this;
    }
    /**
     * <code>string quantity = 2;</code>
     */
    public Builder setQuantityBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      quantity_ = value;
      onChanged();
      return this;
    }

    private float unitPrice_ ;
    /**
     * <code>float unitPrice = 3;</code>
     */
    public float getUnitPrice() {
      return unitPrice_;
    }
    /**
     * <code>float unitPrice = 3;</code>
     */
    public Builder setUnitPrice(float value) {
      
      unitPrice_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float unitPrice = 3;</code>
     */
    public Builder clearUnitPrice() {
      
      unitPrice_ = 0F;
      onChanged();
      return this;
    }

    private float totalPrice_ ;
    /**
     * <code>float totalPrice = 4;</code>
     */
    public float getTotalPrice() {
      return totalPrice_;
    }
    /**
     * <code>float totalPrice = 4;</code>
     */
    public Builder setTotalPrice(float value) {
      
      totalPrice_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float totalPrice = 4;</code>
     */
    public Builder clearTotalPrice() {
      
      totalPrice_ = 0F;
      onChanged();
      return this;
    }

    private int status_ = 0;
    /**
     * <code>.OrderStatus status = 5;</code>
     */
    public int getStatusValue() {
      return status_;
    }
    /**
     * <code>.OrderStatus status = 5;</code>
     */
    public Builder setStatusValue(int value) {
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.OrderStatus status = 5;</code>
     */
    public OrderStatus getStatus() {
      @SuppressWarnings("deprecation")
      OrderStatus result = OrderStatus.valueOf(status_);
      return result == null ? OrderStatus.UNRECOGNIZED : result;
    }
    /**
     * <code>.OrderStatus status = 5;</code>
     */
    public Builder setStatus(OrderStatus value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.OrderStatus status = 5;</code>
     */
    public Builder clearStatus() {
      
      status_ = 0;
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


    // @@protoc_insertion_point(builder_scope:CreateOrderRequest)
  }

  // @@protoc_insertion_point(class_scope:CreateOrderRequest)
  private static final CreateOrderRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new CreateOrderRequest();
  }

  public static CreateOrderRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateOrderRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateOrderRequest>() {
    @java.lang.Override
    public CreateOrderRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateOrderRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateOrderRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateOrderRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public CreateOrderRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

