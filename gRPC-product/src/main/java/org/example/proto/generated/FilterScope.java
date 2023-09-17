// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: product.proto

package org.example.proto.generated;

/**
 * Protobuf enum {@code FilterScope}
 */
public enum FilterScope
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>LOWER = 0;</code>
   */
  LOWER(0),
  /**
   * <code>EQUAL = 1;</code>
   */
  EQUAL(1),
  /**
   * <code>LARGER = 2;</code>
   */
  LARGER(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>LOWER = 0;</code>
   */
  public static final int LOWER_VALUE = 0;
  /**
   * <code>EQUAL = 1;</code>
   */
  public static final int EQUAL_VALUE = 1;
  /**
   * <code>LARGER = 2;</code>
   */
  public static final int LARGER_VALUE = 2;


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
  public static FilterScope valueOf(int value) {
    return forNumber(value);
  }

  public static FilterScope forNumber(int value) {
    switch (value) {
      case 0: return LOWER;
      case 1: return EQUAL;
      case 2: return LARGER;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<FilterScope>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      FilterScope> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<FilterScope>() {
          public FilterScope findValueByNumber(int number) {
            return FilterScope.forNumber(number);
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
    return org.example.proto.generated.Product.getDescriptor().getEnumTypes().get(2);
  }

  private static final FilterScope[] VALUES = values();

  public static FilterScope valueOf(
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

  private FilterScope(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:FilterScope)
}
