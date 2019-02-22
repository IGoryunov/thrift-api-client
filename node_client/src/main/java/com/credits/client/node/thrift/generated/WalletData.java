/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.credits.client.node.thrift.generated;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2019-02-19")
public class WalletData implements org.apache.thrift.TBase<WalletData, WalletData._Fields>, java.io.Serializable, Cloneable, Comparable<WalletData> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("WalletData");

  private static final org.apache.thrift.protocol.TField WALLET_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("walletId", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField BALANCE_FIELD_DESC = new org.apache.thrift.protocol.TField("balance", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField LAST_TRANSACTION_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("lastTransactionId", org.apache.thrift.protocol.TType.I64, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new WalletDataStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new WalletDataTupleSchemeFactory();

  public int walletId; // required
  public Amount balance; // required
  public long lastTransactionId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    WALLET_ID((short)1, "walletId"),
    BALANCE((short)2, "balance"),
    LAST_TRANSACTION_ID((short)3, "lastTransactionId");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // WALLET_ID
          return WALLET_ID;
        case 2: // BALANCE
          return BALANCE;
        case 3: // LAST_TRANSACTION_ID
          return LAST_TRANSACTION_ID;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __WALLETID_ISSET_ID = 0;
  private static final int __LASTTRANSACTIONID_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.WALLET_ID, new org.apache.thrift.meta_data.FieldMetaData("walletId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "WalletId")));
    tmpMap.put(_Fields.BALANCE, new org.apache.thrift.meta_data.FieldMetaData("balance", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Amount.class)));
    tmpMap.put(_Fields.LAST_TRANSACTION_ID, new org.apache.thrift.meta_data.FieldMetaData("lastTransactionId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64        , "TransactionInnerId")));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(WalletData.class, metaDataMap);
  }

  public WalletData() {
  }

  public WalletData(
    int walletId,
    Amount balance,
    long lastTransactionId)
  {
    this();
    this.walletId = walletId;
    setWalletIdIsSet(true);
    this.balance = balance;
    this.lastTransactionId = lastTransactionId;
    setLastTransactionIdIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public WalletData(WalletData other) {
    __isset_bitfield = other.__isset_bitfield;
    this.walletId = other.walletId;
    if (other.isSetBalance()) {
      this.balance = new Amount(other.balance);
    }
    this.lastTransactionId = other.lastTransactionId;
  }

  public WalletData deepCopy() {
    return new WalletData(this);
  }

  @Override
  public void clear() {
    setWalletIdIsSet(false);
    this.walletId = 0;
    this.balance = null;
    setLastTransactionIdIsSet(false);
    this.lastTransactionId = 0;
  }

  public int getWalletId() {
    return this.walletId;
  }

  public WalletData setWalletId(int walletId) {
    this.walletId = walletId;
    setWalletIdIsSet(true);
    return this;
  }

  public void unsetWalletId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __WALLETID_ISSET_ID);
  }

  /** Returns true if field walletId is set (has been assigned a value) and false otherwise */
  public boolean isSetWalletId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __WALLETID_ISSET_ID);
  }

  public void setWalletIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __WALLETID_ISSET_ID, value);
  }

  public Amount getBalance() {
    return this.balance;
  }

  public WalletData setBalance(Amount balance) {
    this.balance = balance;
    return this;
  }

  public void unsetBalance() {
    this.balance = null;
  }

  /** Returns true if field balance is set (has been assigned a value) and false otherwise */
  public boolean isSetBalance() {
    return this.balance != null;
  }

  public void setBalanceIsSet(boolean value) {
    if (!value) {
      this.balance = null;
    }
  }

  public long getLastTransactionId() {
    return this.lastTransactionId;
  }

  public WalletData setLastTransactionId(long lastTransactionId) {
    this.lastTransactionId = lastTransactionId;
    setLastTransactionIdIsSet(true);
    return this;
  }

  public void unsetLastTransactionId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __LASTTRANSACTIONID_ISSET_ID);
  }

  /** Returns true if field lastTransactionId is set (has been assigned a value) and false otherwise */
  public boolean isSetLastTransactionId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __LASTTRANSACTIONID_ISSET_ID);
  }

  public void setLastTransactionIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __LASTTRANSACTIONID_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case WALLET_ID:
      if (value == null) {
        unsetWalletId();
      } else {
        setWalletId((java.lang.Integer)value);
      }
      break;

    case BALANCE:
      if (value == null) {
        unsetBalance();
      } else {
        setBalance((Amount)value);
      }
      break;

    case LAST_TRANSACTION_ID:
      if (value == null) {
        unsetLastTransactionId();
      } else {
        setLastTransactionId((java.lang.Long)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case WALLET_ID:
      return getWalletId();

    case BALANCE:
      return getBalance();

    case LAST_TRANSACTION_ID:
      return getLastTransactionId();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case WALLET_ID:
      return isSetWalletId();
    case BALANCE:
      return isSetBalance();
    case LAST_TRANSACTION_ID:
      return isSetLastTransactionId();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof WalletData)
      return this.equals((WalletData)that);
    return false;
  }

  public boolean equals(WalletData that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_walletId = true;
    boolean that_present_walletId = true;
    if (this_present_walletId || that_present_walletId) {
      if (!(this_present_walletId && that_present_walletId))
        return false;
      if (this.walletId != that.walletId)
        return false;
    }

    boolean this_present_balance = true && this.isSetBalance();
    boolean that_present_balance = true && that.isSetBalance();
    if (this_present_balance || that_present_balance) {
      if (!(this_present_balance && that_present_balance))
        return false;
      if (!this.balance.equals(that.balance))
        return false;
    }

    boolean this_present_lastTransactionId = true;
    boolean that_present_lastTransactionId = true;
    if (this_present_lastTransactionId || that_present_lastTransactionId) {
      if (!(this_present_lastTransactionId && that_present_lastTransactionId))
        return false;
      if (this.lastTransactionId != that.lastTransactionId)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + walletId;

    hashCode = hashCode * 8191 + ((isSetBalance()) ? 131071 : 524287);
    if (isSetBalance())
      hashCode = hashCode * 8191 + balance.hashCode();

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(lastTransactionId);

    return hashCode;
  }

  @Override
  public int compareTo(WalletData other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetWalletId()).compareTo(other.isSetWalletId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWalletId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.walletId, other.walletId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetBalance()).compareTo(other.isSetBalance());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBalance()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.balance, other.balance);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetLastTransactionId()).compareTo(other.isSetLastTransactionId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLastTransactionId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.lastTransactionId, other.lastTransactionId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("WalletData(");
    boolean first = true;

    sb.append("walletId:");
    sb.append(this.walletId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("balance:");
    if (this.balance == null) {
      sb.append("null");
    } else {
      sb.append(this.balance);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("lastTransactionId:");
    sb.append(this.lastTransactionId);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (balance != null) {
      balance.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class WalletDataStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public WalletDataStandardScheme getScheme() {
      return new WalletDataStandardScheme();
    }
  }

  private static class WalletDataStandardScheme extends org.apache.thrift.scheme.StandardScheme<WalletData> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, WalletData struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // WALLET_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.walletId = iprot.readI32();
              struct.setWalletIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // BALANCE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.balance = new Amount();
              struct.balance.read(iprot);
              struct.setBalanceIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // LAST_TRANSACTION_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.lastTransactionId = iprot.readI64();
              struct.setLastTransactionIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, WalletData struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(WALLET_ID_FIELD_DESC);
      oprot.writeI32(struct.walletId);
      oprot.writeFieldEnd();
      if (struct.balance != null) {
        oprot.writeFieldBegin(BALANCE_FIELD_DESC);
        struct.balance.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(LAST_TRANSACTION_ID_FIELD_DESC);
      oprot.writeI64(struct.lastTransactionId);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class WalletDataTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public WalletDataTupleScheme getScheme() {
      return new WalletDataTupleScheme();
    }
  }

  private static class WalletDataTupleScheme extends org.apache.thrift.scheme.TupleScheme<WalletData> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, WalletData struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetWalletId()) {
        optionals.set(0);
      }
      if (struct.isSetBalance()) {
        optionals.set(1);
      }
      if (struct.isSetLastTransactionId()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetWalletId()) {
        oprot.writeI32(struct.walletId);
      }
      if (struct.isSetBalance()) {
        struct.balance.write(oprot);
      }
      if (struct.isSetLastTransactionId()) {
        oprot.writeI64(struct.lastTransactionId);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, WalletData struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.walletId = iprot.readI32();
        struct.setWalletIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.balance = new Amount();
        struct.balance.read(iprot);
        struct.setBalanceIsSet(true);
      }
      if (incoming.get(2)) {
        struct.lastTransactionId = iprot.readI64();
        struct.setLastTransactionIdIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

