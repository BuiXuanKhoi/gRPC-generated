// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: product.proto

package org.example.proto.generated;

/**
 * Protobuf enum {@code ProductStatus}
 */
public enum ProductStatus
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>OUT_OF_STOCK = 0;</code>
   */
  OUT_OF_STOCK(0),
  /**
   * <code>EXISTED = 1;</code>
   */
  EXISTED(1),
  /**
   * <code>OUT_OF_DATE = 2;</code>
   */
  OUT_OF_DATE(2),
  /**
   * <code>PROMOTED = 3;</code>
   */
  PROMOTED(3),
  /**
   * <code>BANNED = 4;</code>
   */
  BANNED(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>OUT_OF_STOCK = 0;</code>
   */
  public static final int OUT_OF_STOCK_VALUE = 0;
  /**
   * <code>EXISTED = 1;</code>
   */
  public static final int EXISTED_VALUE = 1;
  /**
   * <code>OUT_OF_DATE = 2;</code>
   */
  public static final int OUT_OF_DATE_VALUE = 2;
  /**
   * <code>PROMOTED = 3;</code>
   */
  public static final int PROMOTED_VALUE = 3;
  /**
   * <code>BANNED = 4;</code>
   */
  public static final int BANNED_VALUE = 4;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static ProductStatus valueOf(int value) {
    return forNumber(value);
  }

  public static ProductStatus forNumber(int value) {
    switch (value) {
      case 0: return OUT_OF_STOCK;
      case 1: return EXISTED;
      case 2: return OUT_OF_DATE;
      case 3: return PROMOTED;
      case 4: return BANNED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ProductStatus>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ProductStatus> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ProductStatus>() {
          public ProductStatus findValueByNumber(int number) {
            return ProductStatus.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return org.example.proto.generated.Product.getDescriptor().getEnumTypes().get(3);
  }

  private static final ProductStatus[] VALUES = values();

  public static ProductStatus valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ProductStatus(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:ProductStatus)
}

