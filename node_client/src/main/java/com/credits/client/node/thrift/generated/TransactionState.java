/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.credits.client.node.thrift.generated;


@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2019-06-27")
public enum TransactionState implements org.apache.thrift.TEnum {
  INVALID(0),
  VALID(1),
  INPROGRESS(2);

  private final int value;

  private TransactionState(int value) {
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
  public static TransactionState findByValue(int value) { 
    switch (value) {
      case 0:
        return INVALID;
      case 1:
        return VALID;
      case 2:
        return INPROGRESS;
      default:
        return null;
    }
  }
}
