// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute_small.proto

package com.google.cloud.compute.v1;

public interface AddressesScopedListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.AddressesScopedList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * [Output Only] A list of addresses contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Address addresses = 337673122;</code>
   */
  java.util.List<com.google.cloud.compute.v1.Address> 
      getAddressesList();
  /**
   * <pre>
   * [Output Only] A list of addresses contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Address addresses = 337673122;</code>
   */
  com.google.cloud.compute.v1.Address getAddresses(int index);
  /**
   * <pre>
   * [Output Only] A list of addresses contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Address addresses = 337673122;</code>
   */
  int getAddressesCount();
  /**
   * <pre>
   * [Output Only] A list of addresses contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Address addresses = 337673122;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.AddressOrBuilder> 
      getAddressesOrBuilderList();
  /**
   * <pre>
   * [Output Only] A list of addresses contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Address addresses = 337673122;</code>
   */
  com.google.cloud.compute.v1.AddressOrBuilder getAddressesOrBuilder(
      int index);

  /**
   * <pre>
   * [Output Only] Informational warning which replaces the list of addresses when the list is empty.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Warning warning = 50704284;</code>
   * @return Whether the warning field is set.
   */
  boolean hasWarning();
  /**
   * <pre>
   * [Output Only] Informational warning which replaces the list of addresses when the list is empty.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Warning warning = 50704284;</code>
   * @return The warning.
   */
  com.google.cloud.compute.v1.Warning getWarning();
  /**
   * <pre>
   * [Output Only] Informational warning which replaces the list of addresses when the list is empty.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Warning warning = 50704284;</code>
   */
  com.google.cloud.compute.v1.WarningOrBuilder getWarningOrBuilder();
}