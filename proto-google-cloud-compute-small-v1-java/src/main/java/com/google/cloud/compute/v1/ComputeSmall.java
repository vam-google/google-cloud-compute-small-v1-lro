// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute_small.proto

package com.google.cloud.compute.v1;

public final class ComputeSmall {
  private ComputeSmall() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_compute_v1_Errors_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_compute_v1_Errors_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_compute_v1_Error_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_compute_v1_Error_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_compute_v1_Data_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_compute_v1_Data_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_compute_v1_Warnings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_compute_v1_Warnings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_compute_v1_Operation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_compute_v1_Operation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_compute_v1_Address_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_compute_v1_Address_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_compute_v1_AddressesScopedList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_compute_v1_AddressesScopedList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_compute_v1_Warning_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_compute_v1_Warning_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_compute_v1_AddressAggregatedList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_compute_v1_AddressAggregatedList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_compute_v1_AddressAggregatedList_ItemsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_compute_v1_AddressAggregatedList_ItemsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_compute_v1_AddressList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_compute_v1_AddressList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_compute_v1_AggregatedListAddressesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_compute_v1_AggregatedListAddressesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_compute_v1_DeleteAddressRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_compute_v1_DeleteAddressRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_compute_v1_InsertAddressRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_compute_v1_InsertAddressRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_compute_v1_ListAddressesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_compute_v1_ListAddressesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_compute_v1_GetRegionOperationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_compute_v1_GetRegionOperationRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n+google/cloud/compute/v1/compute_small." +
      "proto\022\027google.cloud.compute.v1\032\034google/a" +
      "pi/annotations.proto\032\027google/api/client." +
      "proto\032\037google/api/field_behavior.proto\032\031" +
      "google/api/resource.proto\"D\n\006Errors\022\017\n\004c" +
      "ode\030\355\333\272\001 \001(\t\022\024\n\010location\030\265\277\276\212\001 \001(\t\022\023\n\007me" +
      "ssage\030\207\200\254\307\001 \001(\t\"<\n\005Error\0223\n\006errors\030\353\336\325\226\001" +
      " \003(\0132\037.google.cloud.compute.v1.Errors\"\'\n" +
      "\004Data\022\r\n\003key\030\337\274\006 \001(\t\022\020\n\005value\030\361\242\2625 \001(\t\"\244" +
      "\007\n\010Warnings\0227\n\004code\030\355\333\272\001 \001(\0162&.google.cl" +
      "oud.compute.v1.Warnings.Code\022.\n\004data\030\252\337\273" +
      "\001 \003(\0132\035.google.cloud.compute.v1.Data\022\023\n\007" +
      "message\030\207\200\254\307\001 \001(\t\"\231\006\n\004Code\022\022\n\016UNDEFINED_" +
      "CODE\020\000\022\025\n\016CLEANUP_FAILED\020\330\214\326G\022 \n\030DEPRECA" +
      "TED_RESOURCE_USED\020\302\337\353\272\001\022\034\n\024DEPRECATED_TY" +
      "PE_USED\020\226\244\236\245\001\022(\n DISK_SIZE_LARGER_THAN_I" +
      "MAGE_SIZE\020\227\201\225\260\001\022\036\n\026EXPERIMENTAL_TYPE_USE" +
      "D\020\213\216\301\327\001\022\033\n\024EXTERNAL_API_WARNING\020\303\277\332S\022\035\n\025" +
      "FIELD_VALUE_OVERRIDEN\020\257\266\231\235\001\022#\n\033INJECTED_" +
      "KERNELS_DEPRECATED\020\213\331\202\307\001\022\037\n\027MISSING_TYPE" +
      "_DEPENDENCY\020\367\370\242\244\001\022%\n\035NEXT_HOP_ADDRESS_NO" +
      "T_ASSIGNED\020\207\245\372\232\001\022\"\n\032NEXT_HOP_CANNOT_IP_F" +
      "ORWARD\020\347\352\347\266\001\022#\n\033NEXT_HOP_INSTANCE_NOT_FO" +
      "UND\020\316\314\257\335\001\022\'\n NEXT_HOP_INSTANCE_NOT_ON_NE" +
      "TWORK\020\302\350\235t\022\034\n\024NEXT_HOP_NOT_RUNNING\020\261\317\360\306\001" +
      "\022\031\n\022NOT_CRITICAL_ERROR\020\324\250\2672\022\031\n\022NO_RESULT" +
      "S_ON_PAGE\020\210\246\251\016\022\035\n\026REQUIRED_TOS_AGREEMENT" +
      "\020\203\316\344\001\0221\n)RESOURCE_IN_USE_BY_OTHER_RESOUR" +
      "CE_WARNING\020\301\364\355\354\001\022\033\n\024RESOURCE_NOT_DELETED" +
      "\020\274\267\262P\022!\n\031SCHEMA_VALIDATION_IGNORED\020\312\324\237\203\001" +
      "\022(\n!SINGLE_INSTANCE_PROPERTY_TEMPLATE\020\321\211" +
      "\370\177\022\035\n\025UNDECLARED_PROPERTIES\020\237\206\233\272\001\022\022\n\013UNR" +
      "EACHABLE\020\264\275\255\006\"\327\005\n\tOperation\022\037\n\023client_op" +
      "eration_id\030\347\215\336\215\001 \001(\t\022\035\n\022creation_timesta" +
      "mp\030\266\217\307\016 \001(\t\022\027\n\013description\030\374\207\326\311\001 \001(\t\022\023\n\010" +
      "end_time\030\261\247\3476 \001(\t\0220\n\005error\030\210\244\223. \001(\0132\036.go" +
      "ogle.cloud.compute.v1.Error\022\035\n\022http_erro" +
      "r_message\030\331\372\310` \001(\t\022\"\n\026http_error_status_" +
      "code\030\354\204\370\224\001 \001(\005\022\013\n\002id\030\233\032 \001(\t\022\027\n\013insert_ti" +
      "me\030\223\251\350\316\001 \001(\t\022\017\n\004kind\030\224\367\310\001 \001(\t\022\017\n\004name\030\213\365" +
      "\315\001 \001(\t\022\031\n\016operation_type\030\222\366\332T \001(\t\022\023\n\010pro" +
      "gress\030\255\204\323\" \001(\005\022\021\n\006region\030\364\315\240B \001(\t\022\025\n\tsel" +
      "f_link\030\215\222\305\331\001 \001(\t\022\025\n\nstart_time\030\212\351\356\021 \001(\t\022" +
      "<\n\006status\030\362\237\267V \001(\0162).google.cloud.comput" +
      "e.v1.Operation.Status\022\032\n\016status_message\030" +
      "\272\311\351\215\001 \001(\t\022\024\n\ttarget_id\030\211\225\215{ \001(\t\022\026\n\013targe" +
      "t_link\030\350\223\361\035 \001(\t\022\017\n\004user\030\313\327\333\001 \001(\t\0227\n\010warn" +
      "ings\030\327\210\301\355\001 \003(\0132!.google.cloud.compute.v1" +
      ".Warnings\022\017\n\004zone\030\254\307\344\001 \001(\t\"K\n\006Status\022\024\n\020" +
      "UNDEFINED_STATUS\020\000\022\013\n\004DONE\020\202\267\200\001\022\016\n\007PENDI" +
      "NG\020\367\252\360\020\022\016\n\007RUNNING\020\237\303\3529\"\257\010\n\007Address\022\023\n\007a" +
      "ddress\030\364\267\336\334\001 \001(\t\022E\n\014address_type\030\245\211\204~ \001(" +
      "\0162,.google.cloud.compute.v1.Address.Addr" +
      "essType\022\035\n\022creation_timestamp\030\266\217\307\016 \001(\t\022\027" +
      "\n\013description\030\374\207\326\311\001 \001(\t\022\013\n\002id\030\233\032 \001(\t\022B\n\n" +
      "ip_version\030\300\363\322\214\001 \001(\0162*.google.cloud.comp" +
      "ute.v1.Address.IpVersion\022\017\n\004kind\030\224\367\310\001 \001(" +
      "\t\022\017\n\004name\030\213\365\315\001 \001(\t\022\022\n\007network\030\256\264\205o \001(\t\022F" +
      "\n\014network_tier\030\323\272\333\366\001 \001(\0162,.google.cloud." +
      "compute.v1.Address.NetworkTier\022\031\n\rprefix" +
      "_length\030\263\272\243\330\001 \001(\005\022=\n\007purpose\030\236\372\357\226\001 \001(\0162(" +
      ".google.cloud.compute.v1.Address.Purpose" +
      "\022\021\n\006region\030\364\315\240B \001(\t\022\025\n\tself_link\030\215\222\305\331\001 \001" +
      "(\t\022:\n\006status\030\362\237\267V \001(\0162\'.google.cloud.com" +
      "pute.v1.Address.Status\022\026\n\nsubnetwork\030\356\247\344" +
      "\222\001 \001(\t\022\020\n\005users\030\210\234\2325 \003(\t\"e\n\013AddressType\022" +
      "\032\n\026UNDEFINED_ADDRESS_TYPE\020\000\022\017\n\010EXTERNAL\020" +
      "\313\247\375\020\022\020\n\010INTERNAL\020\275\355\226\205\001\022\027\n\020UNSPECIFIED_TY" +
      "PE\020\342\356\333\031\"[\n\tIpVersion\022\030\n\024UNDEFINED_IP_VER" +
      "SION\020\000\022\013\n\004IPV4\020\205\314\211\001\022\013\n\004IPV6\020\207\314\211\001\022\032\n\023UNSP" +
      "ECIFIED_VERSION\020\220\317\265\n\"L\n\013NetworkTier\022\032\n\026U" +
      "NDEFINED_NETWORK_TIER\020\000\022\017\n\007PREMIUM\020\267\264\301\276\001" +
      "\022\020\n\010STANDARD\020\275\235\214\347\001\"q\n\007Purpose\022\025\n\021UNDEFIN" +
      "ED_PURPOSE\020\000\022\024\n\014DNS_RESOLVER\020\374\334\203\343\001\022\023\n\014GC" +
      "E_ENDPOINT\020\253\304\365m\022\017\n\010NAT_AUTO\020\255\264\205N\022\023\n\013VPC_" +
      "PEERING\020\252\363\216\277\001\"R\n\006Status\022\024\n\020UNDEFINED_STA" +
      "TUS\020\000\022\r\n\006IN_USE\020\315\316\245\010\022\020\n\010RESERVED\020\250\366\215\316\001\022\021" +
      "\n\tRESERVING\020\331\364\257\365\001\"\204\001\n\023AddressesScopedLis" +
      "t\0227\n\taddresses\030\242\367\201\241\001 \003(\0132 .google.cloud." +
      "compute.v1.Address\0224\n\007warning\030\234\337\226\030 \001(\0132 " +
      ".google.cloud.compute.v1.Warning\"\242\007\n\007War" +
      "ning\0226\n\004code\030\355\333\272\001 \001(\0162%.google.cloud.com" +
      "pute.v1.Warning.Code\022.\n\004data\030\252\337\273\001 \003(\0132\035." +
      "google.cloud.compute.v1.Data\022\023\n\007message\030" +
      "\207\200\254\307\001 \001(\t\"\231\006\n\004Code\022\022\n\016UNDEFINED_CODE\020\000\022\025" +
      "\n\016CLEANUP_FAILED\020\330\214\326G\022 \n\030DEPRECATED_RESO" +
      "URCE_USED\020\302\337\353\272\001\022\034\n\024DEPRECATED_TYPE_USED\020" +
      "\226\244\236\245\001\022(\n DISK_SIZE_LARGER_THAN_IMAGE_SIZ" +
      "E\020\227\201\225\260\001\022\036\n\026EXPERIMENTAL_TYPE_USED\020\213\216\301\327\001\022" +
      "\033\n\024EXTERNAL_API_WARNING\020\303\277\332S\022\035\n\025FIELD_VA" +
      "LUE_OVERRIDEN\020\257\266\231\235\001\022#\n\033INJECTED_KERNELS_" +
      "DEPRECATED\020\213\331\202\307\001\022\037\n\027MISSING_TYPE_DEPENDE" +
      "NCY\020\367\370\242\244\001\022%\n\035NEXT_HOP_ADDRESS_NOT_ASSIGN" +
      "ED\020\207\245\372\232\001\022\"\n\032NEXT_HOP_CANNOT_IP_FORWARD\020\347" +
      "\352\347\266\001\022#\n\033NEXT_HOP_INSTANCE_NOT_FOUND\020\316\314\257\335" +
      "\001\022\'\n NEXT_HOP_INSTANCE_NOT_ON_NETWORK\020\302\350" +
      "\235t\022\034\n\024NEXT_HOP_NOT_RUNNING\020\261\317\360\306\001\022\031\n\022NOT_" +
      "CRITICAL_ERROR\020\324\250\2672\022\031\n\022NO_RESULTS_ON_PAG" +
      "E\020\210\246\251\016\022\035\n\026REQUIRED_TOS_AGREEMENT\020\203\316\344\001\0221\n" +
      ")RESOURCE_IN_USE_BY_OTHER_RESOURCE_WARNI" +
      "NG\020\301\364\355\354\001\022\033\n\024RESOURCE_NOT_DELETED\020\274\267\262P\022!\n" +
      "\031SCHEMA_VALIDATION_IGNORED\020\312\324\237\203\001\022(\n!SING" +
      "LE_INSTANCE_PROPERTY_TEMPLATE\020\321\211\370\177\022\035\n\025UN" +
      "DECLARED_PROPERTIES\020\237\206\233\272\001\022\022\n\013UNREACHABLE" +
      "\020\264\275\255\006\"\307\002\n\025AddressAggregatedList\022\013\n\002id\030\233\032" +
      " \001(\t\022K\n\005items\030\300\317\367/ \003(\01329.google.cloud.co" +
      "mpute.v1.AddressAggregatedList.ItemsEntr" +
      "y\022\017\n\004kind\030\224\367\310\001 \001(\t\022\032\n\017next_page_token\030\225\272" +
      "\206& \001(\t\022\025\n\tself_link\030\215\222\305\331\001 \001(\t\0224\n\007warning" +
      "\030\234\337\226\030 \001(\0132 .google.cloud.compute.v1.Warn" +
      "ing\032Z\n\nItemsEntry\022\013\n\003key\030\001 \001(\t\022;\n\005value\030" +
      "\002 \001(\0132,.google.cloud.compute.v1.Addresse" +
      "sScopedList:\0028\001\"\310\001\n\013AddressList\022\013\n\002id\030\233\032" +
      " \001(\t\0222\n\005items\030\300\317\367/ \003(\0132 .google.cloud.co" +
      "mpute.v1.Address\022\017\n\004kind\030\224\367\310\001 \001(\t\022\032\n\017nex" +
      "t_page_token\030\225\272\206& \001(\t\022\025\n\tself_link\030\215\222\305\331\001" +
      " \001(\t\0224\n\007warning\030\234\337\226\030 \001(\0132 .google.cloud." +
      "compute.v1.Warning\"\261\001\n\036AggregatedListAdd" +
      "ressesRequest\022\022\n\006filter\030\370\226\243\240\001 \001(\t\022\036\n\022inc" +
      "lude_all_scopes\030\364\341\314\272\001 \001(\010\022\026\n\013max_results" +
      "\030\233\310\213\032 \001(\r\022\023\n\010order_by\030\350\375\307L \001(\t\022\025\n\npage_t" +
      "oken\030\311\260\304\t \001(\t\022\027\n\007project\030\231\226\301l \001(\tB\003\340A\002\"x" +
      "\n\024DeleteAddressRequest\022\030\n\007address\030\364\267\336\334\001 " +
      "\001(\tB\003\340A\002\022\027\n\007project\030\231\226\301l \001(\tB\003\340A\002\022\026\n\006reg" +
      "ion\030\364\315\240B \001(\tB\003\340A\002\022\025\n\nrequest_id\030\313\201\331\021 \001(\t" +
      "\"\236\001\n\024InsertAddressRequest\022>\n\020address_res" +
      "ource\030\371\227\336\346\001 \001(\0132 .google.cloud.compute.v" +
      "1.Address\022\027\n\007project\030\231\226\301l \001(\tB\003\340A\002\022\026\n\006re" +
      "gion\030\364\315\240B \001(\tB\003\340A\002\022\025\n\nrequest_id\030\313\201\331\021 \001(" +
      "\t\"\244\001\n\024ListAddressesRequest\022\022\n\006filter\030\370\226\243" +
      "\240\001 \001(\t\022\026\n\013max_results\030\233\310\213\032 \001(\r\022\030\n\010order_" +
      "by\030\350\375\307L \001(\tB\003\340A\002\022\025\n\npage_token\030\311\260\304\t \001(\t\022" +
      "\027\n\007project\030\231\226\301l \001(\tB\003\340A\002\022\026\n\006region\030\364\315\240B " +
      "\001(\tB\003\340A\002\"g\n\031GetRegionOperationRequest\022\031\n" +
      "\toperation\030\347\252\353\030 \001(\tB\003\340A\002\022\027\n\007project\030\231\226\301l" +
      " \001(\tB\003\340A\002\022\026\n\006region\030\364\315\240B \001(\tB\003\340A\0022\226\007\n\tAd" +
      "dresses\022\300\001\n\016AggregatedList\0227.google.clou" +
      "d.compute.v1.AggregatedListAddressesRequ" +
      "est\032..google.cloud.compute.v1.AddressAgg" +
      "regatedList\"E\202\323\344\223\0025\0223/compute/v1/project" +
      "s/{project}/aggregated/addresses\332A\007proje" +
      "ct\022\301\001\n\006Delete\022-.google.cloud.compute.v1." +
      "DeleteAddressRequest\032\".google.cloud.comp" +
      "ute.v1.Operation\"d\202\323\344\223\002E*C/compute/v1/pr" +
      "ojects/{project}/regions/{region}/addres" +
      "ses/{address}\332A\026project,region,address\022\322" +
      "\001\n\006Insert\022-.google.cloud.compute.v1.Inse" +
      "rtAddressRequest\032\".google.cloud.compute." +
      "v1.Operation\"u\202\323\344\223\002M\"9/compute/v1/projec" +
      "ts/{project}/regions/{region}/addresses:" +
      "\020address_resource\332A\037project,region,addre" +
      "ss_resource\022\270\001\n\004List\022-.google.cloud.comp" +
      "ute.v1.ListAddressesRequest\032$.google.clo" +
      "ud.compute.v1.AddressList\"[\202\323\344\223\002;\0229/comp" +
      "ute/v1/projects/{project}/regions/{regio" +
      "n}/addresses\332A\027project,region,order_by\032r" +
      "\312A\026compute.googleapis.com\322AVhttps://www." +
      "googleapis.com/auth/compute,https://www." +
      "googleapis.com/auth/cloud-platform2\204\003\n\020R" +
      "egionOperations\022\310\001\n\003Get\0222.google.cloud.c" +
      "ompute.v1.GetRegionOperationRequest\032\".go" +
      "ogle.cloud.compute.v1.Operation\"i\202\323\344\223\002H\022" +
      "F/compute/v1/projects/{project}/regions/" +
      "{region}/operations/{operation}\332A\030projec" +
      "t,region,operation\032\244\001\312A\026compute.googleap" +
      "is.com\322A\207\001https://www.googleapis.com/aut" +
      "h/compute.readonly,https://www.googleapi" +
      "s.com/auth/compute,https://www.googleapi" +
      "s.com/auth/cloud-platformB\260\001\n\033com.google" +
      ".cloud.compute.v1P\001Z>google.golang.org/g" +
      "enproto/googleapis/cloud/compute/v1;comp" +
      "ute\252\002\027Google.Cloud.Compute.V1\312\002\027Google\\C" +
      "loud\\Compute\\V1\352\002\032Google::Cloud::Compute" +
      "::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_cloud_compute_v1_Errors_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_compute_v1_Errors_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_compute_v1_Errors_descriptor,
        new java.lang.String[] { "Code", "Location", "Message", });
    internal_static_google_cloud_compute_v1_Error_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_compute_v1_Error_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_compute_v1_Error_descriptor,
        new java.lang.String[] { "Errors", });
    internal_static_google_cloud_compute_v1_Data_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_compute_v1_Data_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_compute_v1_Data_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_compute_v1_Warnings_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_compute_v1_Warnings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_compute_v1_Warnings_descriptor,
        new java.lang.String[] { "Code", "Data", "Message", });
    internal_static_google_cloud_compute_v1_Operation_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_compute_v1_Operation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_compute_v1_Operation_descriptor,
        new java.lang.String[] { "ClientOperationId", "CreationTimestamp", "Description", "EndTime", "Error", "HttpErrorMessage", "HttpErrorStatusCode", "Id", "InsertTime", "Kind", "Name", "OperationType", "Progress", "Region", "SelfLink", "StartTime", "Status", "StatusMessage", "TargetId", "TargetLink", "User", "Warnings", "Zone", });
    internal_static_google_cloud_compute_v1_Address_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_compute_v1_Address_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_compute_v1_Address_descriptor,
        new java.lang.String[] { "Address", "AddressType", "CreationTimestamp", "Description", "Id", "IpVersion", "Kind", "Name", "Network", "NetworkTier", "PrefixLength", "Purpose", "Region", "SelfLink", "Status", "Subnetwork", "Users", });
    internal_static_google_cloud_compute_v1_AddressesScopedList_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_compute_v1_AddressesScopedList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_compute_v1_AddressesScopedList_descriptor,
        new java.lang.String[] { "Addresses", "Warning", });
    internal_static_google_cloud_compute_v1_Warning_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_compute_v1_Warning_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_compute_v1_Warning_descriptor,
        new java.lang.String[] { "Code", "Data", "Message", });
    internal_static_google_cloud_compute_v1_AddressAggregatedList_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_compute_v1_AddressAggregatedList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_compute_v1_AddressAggregatedList_descriptor,
        new java.lang.String[] { "Id", "Items", "Kind", "NextPageToken", "SelfLink", "Warning", });
    internal_static_google_cloud_compute_v1_AddressAggregatedList_ItemsEntry_descriptor =
      internal_static_google_cloud_compute_v1_AddressAggregatedList_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_compute_v1_AddressAggregatedList_ItemsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_compute_v1_AddressAggregatedList_ItemsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_compute_v1_AddressList_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_compute_v1_AddressList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_compute_v1_AddressList_descriptor,
        new java.lang.String[] { "Id", "Items", "Kind", "NextPageToken", "SelfLink", "Warning", });
    internal_static_google_cloud_compute_v1_AggregatedListAddressesRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_compute_v1_AggregatedListAddressesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_compute_v1_AggregatedListAddressesRequest_descriptor,
        new java.lang.String[] { "Filter", "IncludeAllScopes", "MaxResults", "OrderBy", "PageToken", "Project", });
    internal_static_google_cloud_compute_v1_DeleteAddressRequest_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_compute_v1_DeleteAddressRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_compute_v1_DeleteAddressRequest_descriptor,
        new java.lang.String[] { "Address", "Project", "Region", "RequestId", });
    internal_static_google_cloud_compute_v1_InsertAddressRequest_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_compute_v1_InsertAddressRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_compute_v1_InsertAddressRequest_descriptor,
        new java.lang.String[] { "AddressResource", "Project", "Region", "RequestId", });
    internal_static_google_cloud_compute_v1_ListAddressesRequest_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_compute_v1_ListAddressesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_compute_v1_ListAddressesRequest_descriptor,
        new java.lang.String[] { "Filter", "MaxResults", "OrderBy", "PageToken", "Project", "Region", });
    internal_static_google_cloud_compute_v1_GetRegionOperationRequest_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_compute_v1_GetRegionOperationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_compute_v1_GetRegionOperationRequest_descriptor,
        new java.lang.String[] { "Operation", "Project", "Region", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
