/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.credits.client.node.thrift.generated;


@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2019-07-11")
public enum TokenHoldersSortField implements org.apache.thrift.TEnum {
  TH_Balance(0),
  TH_TransfersCount(1);

  private final int value;

  private TokenHoldersSortField(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  @org.apache.thrift.annotation.Nullable
  public static TokenHoldersSortField findByValue(int value) { 
    switch (value) {
      case 0:
        return TH_Balance;
      case 1:
        return TH_TransfersCount;
      default:
        return null;
    }
  }
}
