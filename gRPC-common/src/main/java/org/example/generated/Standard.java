// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: standard.proto

package org.example.generated;

public final class Standard {
  private Standard() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_example_generated_SuccessMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_example_generated_SuccessMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_example_generated_ErrorMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_example_generated_ErrorMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_example_generated_ErrorMessageWithDetail_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_example_generated_ErrorMessageWithDetail_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_example_generated_ErrorMessageWithDetail_DetailEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_example_generated_ErrorMessageWithDetail_DetailEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016standard.proto\022\025org.example.generated\"" +
      "5\n\016SuccessMessage\022\022\n\nstatusCode\030\001 \001(\005\022\017\n" +
      "\007message\030\002 \001(\t\"C\n\014ErrorMessage\022\022\n\nstatus" +
      "Code\030\001 \001(\005\022\017\n\007message\030\002 \001(\t\022\016\n\006reason\030\003 " +
      "\001(\t\"\315\001\n\026ErrorMessageWithDetail\0229\n\014errorM" +
      "essage\030\001 \001(\0132#.org.example.generated.Err" +
      "orMessage\022I\n\006detail\030\002 \003(\01329.org.example." +
      "generated.ErrorMessageWithDetail.DetailE" +
      "ntry\032-\n\013DetailEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005valu" +
      "e\030\002 \001(\t:\0028\001B\005P\001\240\001\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_org_example_generated_SuccessMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_org_example_generated_SuccessMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_example_generated_SuccessMessage_descriptor,
        new java.lang.String[] { "StatusCode", "Message", });
    internal_static_org_example_generated_ErrorMessage_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_org_example_generated_ErrorMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_example_generated_ErrorMessage_descriptor,
        new java.lang.String[] { "StatusCode", "Message", "Reason", });
    internal_static_org_example_generated_ErrorMessageWithDetail_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_org_example_generated_ErrorMessageWithDetail_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_example_generated_ErrorMessageWithDetail_descriptor,
        new java.lang.String[] { "ErrorMessage", "Detail", });
    internal_static_org_example_generated_ErrorMessageWithDetail_DetailEntry_descriptor =
      internal_static_org_example_generated_ErrorMessageWithDetail_descriptor.getNestedTypes().get(0);
    internal_static_org_example_generated_ErrorMessageWithDetail_DetailEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_example_generated_ErrorMessageWithDetail_DetailEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
