// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: product.proto

package org.example.proto.generated;

/**
 * Protobuf type {@code SellProductRequest}
 */
public  final class SellProductRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:SellProductRequest)
    SellProductRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SellProductRequest.newBuilder() to construct.
  private SellProductRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SellProductRequest() {
    productId_ = "";
    productStatus_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SellProductRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SellProductRequest(
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
          case 17: {

            price_ = input.readDouble();
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            productStatus_ = rawValue;
            break;
          }
          case 32: {

            sellQuantity_ = input.readInt32();
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
    return org.example.proto.generated.Product.internal_static_SellProductRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.example.proto.generated.Product.internal_static_SellProductRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.example.proto.generated.SellProductRequest.class, org.example.proto.generated.SellProductRequest.Builder.class);
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

  public static final int PRICE_FIELD_NUMBER = 2;
  private double price_;
  /**
   * <code>double price = 2;</code>
   */
  public double getPrice() {
    return price_;
  }

  public static final int PRODUCTSTATUS_FIELD_NUMBER = 3;
  private int productStatus_;
  /**
   * <code>.ProductStatus productStatus = 3;</code>
   */
  public int getProductStatusValue() {
    return productStatus_;
  }
  /**
   * <code>.ProductStatus productStatus = 3;</code>
   */
  public org.example.proto.generated.ProductStatus getProductStatus() {
    @SuppressWarnings("deprecation")
    org.example.proto.generated.ProductStatus result = org.example.proto.generated.ProductStatus.valueOf(productStatus_);
    return result == null ? org.example.proto.generated.ProductStatus.UNRECOGNIZED : result;
  }

  public static final int SELLQUANTITY_FIELD_NUMBER = 4;
  private int sellQuantity_;
  /**
   * <code>int32 sellQuantity = 4;</code>
   */
  public int getSellQuantity() {
    return sellQuantity_;
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
    if (price_ != 0D) {
      output.writeDouble(2, price_);
    }
    if (productStatus_ != org.example.proto.generated.ProductStatus.OUT_OF_STOCK.getNumber()) {
      output.writeEnum(3, productStatus_);
    }
    if (sellQuantity_ != 0) {
      output.writeInt32(4, sellQuantity_);
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
    if (price_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, price_);
    }
    if (productStatus_ != org.example.proto.generated.ProductStatus.OUT_OF_STOCK.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, productStatus_);
    }
    if (sellQuantity_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, sellQuantity_);
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
    if (!(obj instanceof org.example.proto.generated.SellProductRequest)) {
      return super.equals(obj);
    }
    org.example.proto.generated.SellProductRequest other = (org.example.proto.generated.SellProductRequest) obj;

    if (!getProductId()
        .equals(other.getProductId())) return false;
    if (java.lang.Double.doubleToLongBits(getPrice())
        != java.lang.Double.doubleToLongBits(
            other.getPrice())) return false;
    if (productStatus_ != other.productStatus_) return false;
    if (getSellQuantity()
        != other.getSellQuantity()) return false;
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
    hash = (37 * hash) + PRICE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getPrice()));
    hash = (37 * hash) + PRODUCTSTATUS_FIELD_NUMBER;
    hash = (53 * hash) + productStatus_;
    hash = (37 * hash) + SELLQUANTITY_FIELD_NUMBER;
    hash = (53 * hash) + getSellQuantity();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.example.proto.generated.SellProductRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.example.proto.generated.SellProductRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.example.proto.generated.SellProductRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.example.proto.generated.SellProductRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.example.proto.generated.SellProductRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.example.proto.generated.SellProductRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.example.proto.generated.SellProductRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.example.proto.generated.SellProductRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.example.proto.generated.SellProductRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.example.proto.generated.SellProductRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.example.proto.generated.SellProductRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.example.proto.generated.SellProductRequest parseFrom(
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
  public static Builder newBuilder(org.example.proto.generated.SellProductRequest prototype) {
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
   * Protobuf type {@code SellProductRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:SellProductRequest)
      org.example.proto.generated.SellProductRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.example.proto.generated.Product.internal_static_SellProductRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.example.proto.generated.Product.internal_static_SellProductRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.example.proto.generated.SellProductRequest.class, org.example.proto.generated.SellProductRequest.Builder.class);
    }

    // Construct using org.example.proto.generated.SellProductRequest.newBuilder()
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

      price_ = 0D;

      productStatus_ = 0;

      sellQuantity_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.example.proto.generated.Product.internal_static_SellProductRequest_descriptor;
    }

    @java.lang.Override
    public org.example.proto.generated.SellProductRequest getDefaultInstanceForType() {
      return org.example.proto.generated.SellProductRequest.getDefaultInstance();
    }

    @java.lang.Override
    public org.example.proto.generated.SellProductRequest build() {
      org.example.proto.generated.SellProductRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.example.proto.generated.SellProductRequest buildPartial() {
      org.example.proto.generated.SellProductRequest result = new org.example.proto.generated.SellProductRequest(this);
      result.productId_ = productId_;
      result.price_ = price_;
      result.productStatus_ = productStatus_;
      result.sellQuantity_ = sellQuantity_;
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
      if (other instanceof org.example.proto.generated.SellProductRequest) {
        return mergeFrom((org.example.proto.generated.SellProductRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.example.proto.generated.SellProductRequest other) {
      if (other == org.example.proto.generated.SellProductRequest.getDefaultInstance()) return this;
      if (!other.getProductId().isEmpty()) {
        productId_ = other.productId_;
        onChanged();
      }
      if (other.getPrice() != 0D) {
        setPrice(other.getPrice());
      }
      if (other.productStatus_ != 0) {
        setProductStatusValue(other.getProductStatusValue());
      }
      if (other.getSellQuantity() != 0) {
        setSellQuantity(other.getSellQuantity());
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
      org.example.proto.generated.SellProductRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.example.proto.generated.SellProductRequest) e.getUnfinishedMessage();
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

    private double price_ ;
    /**
     * <code>double price = 2;</code>
     */
    public double getPrice() {
      return price_;
    }
    /**
     * <code>double price = 2;</code>
     */
    public Builder setPrice(double value) {
      
      price_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double price = 2;</code>
     */
    public Builder clearPrice() {
      
      price_ = 0D;
      onChanged();
      return this;
    }

    private int productStatus_ = 0;
    /**
     * <code>.ProductStatus productStatus = 3;</code>
     */
    public int getProductStatusValue() {
      return productStatus_;
    }
    /**
     * <code>.ProductStatus productStatus = 3;</code>
     */
    public Builder setProductStatusValue(int value) {
      productStatus_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.ProductStatus productStatus = 3;</code>
     */
    public org.example.proto.generated.ProductStatus getProductStatus() {
      @SuppressWarnings("deprecation")
      org.example.proto.generated.ProductStatus result = org.example.proto.generated.ProductStatus.valueOf(productStatus_);
      return result == null ? org.example.proto.generated.ProductStatus.UNRECOGNIZED : result;
    }
    /**
     * <code>.ProductStatus productStatus = 3;</code>
     */
    public Builder setProductStatus(org.example.proto.generated.ProductStatus value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      productStatus_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.ProductStatus productStatus = 3;</code>
     */
    public Builder clearProductStatus() {
      
      productStatus_ = 0;
      onChanged();
      return this;
    }

    private int sellQuantity_ ;
    /**
     * <code>int32 sellQuantity = 4;</code>
     */
    public int getSellQuantity() {
      return sellQuantity_;
    }
    /**
     * <code>int32 sellQuantity = 4;</code>
     */
    public Builder setSellQuantity(int value) {
      
      sellQuantity_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 sellQuantity = 4;</code>
     */
    public Builder clearSellQuantity() {
      
      sellQuantity_ = 0;
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


    // @@protoc_insertion_point(builder_scope:SellProductRequest)
  }

  // @@protoc_insertion_point(class_scope:SellProductRequest)
  private static final org.example.proto.generated.SellProductRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.example.proto.generated.SellProductRequest();
  }

  public static org.example.proto.generated.SellProductRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SellProductRequest>
      PARSER = new com.google.protobuf.AbstractParser<SellProductRequest>() {
    @java.lang.Override
    public SellProductRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SellProductRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SellProductRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SellProductRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.example.proto.generated.SellProductRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

