/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.credits.client.node.thrift.generated;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2019-06-27")
public class SmartStateTransInfo implements org.apache.thrift.TBase<SmartStateTransInfo, SmartStateTransInfo._Fields>, java.io.Serializable, Cloneable, Comparable<SmartStateTransInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SmartStateTransInfo");

  private static final org.apache.thrift.protocol.TField SUCCESS_FIELD_DESC = new org.apache.thrift.protocol.TField("success", org.apache.thrift.protocol.TType.BOOL, (short)1);
  private static final org.apache.thrift.protocol.TField EXECUTION_FEE_FIELD_DESC = new org.apache.thrift.protocol.TField("executionFee", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField RETURN_VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("returnValue", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField START_TRANSACTION_FIELD_DESC = new org.apache.thrift.protocol.TField("startTransaction", org.apache.thrift.protocol.TType.STRUCT, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new SmartStateTransInfoStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new SmartStateTransInfoTupleSchemeFactory();

  public boolean success; // required
  public @org.apache.thrift.annotation.Nullable com.credits.general.thrift.generated.Amount executionFee; // required
  public @org.apache.thrift.annotation.Nullable com.credits.general.thrift.generated.Variant returnValue; // optional
  public @org.apache.thrift.annotation.Nullable TransactionId startTransaction; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SUCCESS((short)1, "success"),
    EXECUTION_FEE((short)2, "executionFee"),
    RETURN_VALUE((short)3, "returnValue"),
    START_TRANSACTION((short)4, "startTransaction");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // SUCCESS
          return SUCCESS;
        case 2: // EXECUTION_FEE
          return EXECUTION_FEE;
        case 3: // RETURN_VALUE
          return RETURN_VALUE;
        case 4: // START_TRANSACTION
          return START_TRANSACTION;
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
    @org.apache.thrift.annotation.Nullable
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
  private static final int __SUCCESS_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.RETURN_VALUE};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SUCCESS, new org.apache.thrift.meta_data.FieldMetaData("success", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.EXECUTION_FEE, new org.apache.thrift.meta_data.FieldMetaData("executionFee", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.credits.general.thrift.generated.Amount.class)));
    tmpMap.put(_Fields.RETURN_VALUE, new org.apache.thrift.meta_data.FieldMetaData("returnValue", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.credits.general.thrift.generated.Variant.class)));
    tmpMap.put(_Fields.START_TRANSACTION, new org.apache.thrift.meta_data.FieldMetaData("startTransaction", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TransactionId.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SmartStateTransInfo.class, metaDataMap);
  }

  public SmartStateTransInfo() {
  }

  public SmartStateTransInfo(
    boolean success,
    com.credits.general.thrift.generated.Amount executionFee,
    TransactionId startTransaction)
  {
    this();
    this.success = success;
    setSuccessIsSet(true);
    this.executionFee = executionFee;
    this.startTransaction = startTransaction;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SmartStateTransInfo(SmartStateTransInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    this.success = other.success;
    if (other.isSetExecutionFee()) {
      this.executionFee = new com.credits.general.thrift.generated.Amount(other.executionFee);
    }
    if (other.isSetReturnValue()) {
      this.returnValue = new com.credits.general.thrift.generated.Variant(other.returnValue);
    }
    if (other.isSetStartTransaction()) {
      this.startTransaction = new TransactionId(other.startTransaction);
    }
  }

  public SmartStateTransInfo deepCopy() {
    return new SmartStateTransInfo(this);
  }

  @Override
  public void clear() {
    setSuccessIsSet(false);
    this.success = false;
    this.executionFee = null;
    this.returnValue = null;
    this.startTransaction = null;
  }

  public boolean isSuccess() {
    return this.success;
  }

  public SmartStateTransInfo setSuccess(boolean success) {
    this.success = success;
    setSuccessIsSet(true);
    return this;
  }

  public void unsetSuccess() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __SUCCESS_ISSET_ID);
  }

  /** Returns true if field success is set (has been assigned a value) and false otherwise */
  public boolean isSetSuccess() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __SUCCESS_ISSET_ID);
  }

  public void setSuccessIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __SUCCESS_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public com.credits.general.thrift.generated.Amount getExecutionFee() {
    return this.executionFee;
  }

  public SmartStateTransInfo setExecutionFee(@org.apache.thrift.annotation.Nullable com.credits.general.thrift.generated.Amount executionFee) {
    this.executionFee = executionFee;
    return this;
  }

  public void unsetExecutionFee() {
    this.executionFee = null;
  }

  /** Returns true if field executionFee is set (has been assigned a value) and false otherwise */
  public boolean isSetExecutionFee() {
    return this.executionFee != null;
  }

  public void setExecutionFeeIsSet(boolean value) {
    if (!value) {
      this.executionFee = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public com.credits.general.thrift.generated.Variant getReturnValue() {
    return this.returnValue;
  }

  public SmartStateTransInfo setReturnValue(@org.apache.thrift.annotation.Nullable com.credits.general.thrift.generated.Variant returnValue) {
    this.returnValue = returnValue;
    return this;
  }

  public void unsetReturnValue() {
    this.returnValue = null;
  }

  /** Returns true if field returnValue is set (has been assigned a value) and false otherwise */
  public boolean isSetReturnValue() {
    return this.returnValue != null;
  }

  public void setReturnValueIsSet(boolean value) {
    if (!value) {
      this.returnValue = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public TransactionId getStartTransaction() {
    return this.startTransaction;
  }

  public SmartStateTransInfo setStartTransaction(@org.apache.thrift.annotation.Nullable TransactionId startTransaction) {
    this.startTransaction = startTransaction;
    return this;
  }

  public void unsetStartTransaction() {
    this.startTransaction = null;
  }

  /** Returns true if field startTransaction is set (has been assigned a value) and false otherwise */
  public boolean isSetStartTransaction() {
    return this.startTransaction != null;
  }

  public void setStartTransactionIsSet(boolean value) {
    if (!value) {
      this.startTransaction = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case SUCCESS:
      if (value == null) {
        unsetSuccess();
      } else {
        setSuccess((java.lang.Boolean)value);
      }
      break;

    case EXECUTION_FEE:
      if (value == null) {
        unsetExecutionFee();
      } else {
        setExecutionFee((com.credits.general.thrift.generated.Amount)value);
      }
      break;

    case RETURN_VALUE:
      if (value == null) {
        unsetReturnValue();
      } else {
        setReturnValue((com.credits.general.thrift.generated.Variant)value);
      }
      break;

    case START_TRANSACTION:
      if (value == null) {
        unsetStartTransaction();
      } else {
        setStartTransaction((TransactionId)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case SUCCESS:
      return isSuccess();

    case EXECUTION_FEE:
      return getExecutionFee();

    case RETURN_VALUE:
      return getReturnValue();

    case START_TRANSACTION:
      return getStartTransaction();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case SUCCESS:
      return isSetSuccess();
    case EXECUTION_FEE:
      return isSetExecutionFee();
    case RETURN_VALUE:
      return isSetReturnValue();
    case START_TRANSACTION:
      return isSetStartTransaction();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof SmartStateTransInfo)
      return this.equals((SmartStateTransInfo)that);
    return false;
  }

  public boolean equals(SmartStateTransInfo that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_success = true;
    boolean that_present_success = true;
    if (this_present_success || that_present_success) {
      if (!(this_present_success && that_present_success))
        return false;
      if (this.success != that.success)
        return false;
    }

    boolean this_present_executionFee = true && this.isSetExecutionFee();
    boolean that_present_executionFee = true && that.isSetExecutionFee();
    if (this_present_executionFee || that_present_executionFee) {
      if (!(this_present_executionFee && that_present_executionFee))
        return false;
      if (!this.executionFee.equals(that.executionFee))
        return false;
    }

    boolean this_present_returnValue = true && this.isSetReturnValue();
    boolean that_present_returnValue = true && that.isSetReturnValue();
    if (this_present_returnValue || that_present_returnValue) {
      if (!(this_present_returnValue && that_present_returnValue))
        return false;
      if (!this.returnValue.equals(that.returnValue))
        return false;
    }

    boolean this_present_startTransaction = true && this.isSetStartTransaction();
    boolean that_present_startTransaction = true && that.isSetStartTransaction();
    if (this_present_startTransaction || that_present_startTransaction) {
      if (!(this_present_startTransaction && that_present_startTransaction))
        return false;
      if (!this.startTransaction.equals(that.startTransaction))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((success) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetExecutionFee()) ? 131071 : 524287);
    if (isSetExecutionFee())
      hashCode = hashCode * 8191 + executionFee.hashCode();

    hashCode = hashCode * 8191 + ((isSetReturnValue()) ? 131071 : 524287);
    if (isSetReturnValue())
      hashCode = hashCode * 8191 + returnValue.hashCode();

    hashCode = hashCode * 8191 + ((isSetStartTransaction()) ? 131071 : 524287);
    if (isSetStartTransaction())
      hashCode = hashCode * 8191 + startTransaction.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(SmartStateTransInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetSuccess()).compareTo(other.isSetSuccess());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSuccess()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.success, other.success);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetExecutionFee()).compareTo(other.isSetExecutionFee());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExecutionFee()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.executionFee, other.executionFee);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetReturnValue()).compareTo(other.isSetReturnValue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReturnValue()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.returnValue, other.returnValue);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetStartTransaction()).compareTo(other.isSetStartTransaction());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStartTransaction()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.startTransaction, other.startTransaction);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("SmartStateTransInfo(");
    boolean first = true;

    sb.append("success:");
    sb.append(this.success);
    first = false;
    if (!first) sb.append(", ");
    sb.append("executionFee:");
    if (this.executionFee == null) {
      sb.append("null");
    } else {
      sb.append(this.executionFee);
    }
    first = false;
    if (isSetReturnValue()) {
      if (!first) sb.append(", ");
      sb.append("returnValue:");
      if (this.returnValue == null) {
        sb.append("null");
      } else {
        sb.append(this.returnValue);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("startTransaction:");
    if (this.startTransaction == null) {
      sb.append("null");
    } else {
      sb.append(this.startTransaction);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (executionFee != null) {
      executionFee.validate();
    }
    if (startTransaction != null) {
      startTransaction.validate();
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

  private static class SmartStateTransInfoStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SmartStateTransInfoStandardScheme getScheme() {
      return new SmartStateTransInfoStandardScheme();
    }
  }

  private static class SmartStateTransInfoStandardScheme extends org.apache.thrift.scheme.StandardScheme<SmartStateTransInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SmartStateTransInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SUCCESS
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.success = iprot.readBool();
              struct.setSuccessIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // EXECUTION_FEE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.executionFee = new com.credits.general.thrift.generated.Amount();
              struct.executionFee.read(iprot);
              struct.setExecutionFeeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // RETURN_VALUE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.returnValue = new com.credits.general.thrift.generated.Variant();
              struct.returnValue.read(iprot);
              struct.setReturnValueIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // START_TRANSACTION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.startTransaction = new TransactionId();
              struct.startTransaction.read(iprot);
              struct.setStartTransactionIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SmartStateTransInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(SUCCESS_FIELD_DESC);
      oprot.writeBool(struct.success);
      oprot.writeFieldEnd();
      if (struct.executionFee != null) {
        oprot.writeFieldBegin(EXECUTION_FEE_FIELD_DESC);
        struct.executionFee.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.returnValue != null) {
        if (struct.isSetReturnValue()) {
          oprot.writeFieldBegin(RETURN_VALUE_FIELD_DESC);
          struct.returnValue.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.startTransaction != null) {
        oprot.writeFieldBegin(START_TRANSACTION_FIELD_DESC);
        struct.startTransaction.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SmartStateTransInfoTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SmartStateTransInfoTupleScheme getScheme() {
      return new SmartStateTransInfoTupleScheme();
    }
  }

  private static class SmartStateTransInfoTupleScheme extends org.apache.thrift.scheme.TupleScheme<SmartStateTransInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SmartStateTransInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetSuccess()) {
        optionals.set(0);
      }
      if (struct.isSetExecutionFee()) {
        optionals.set(1);
      }
      if (struct.isSetReturnValue()) {
        optionals.set(2);
      }
      if (struct.isSetStartTransaction()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetSuccess()) {
        oprot.writeBool(struct.success);
      }
      if (struct.isSetExecutionFee()) {
        struct.executionFee.write(oprot);
      }
      if (struct.isSetReturnValue()) {
        struct.returnValue.write(oprot);
      }
      if (struct.isSetStartTransaction()) {
        struct.startTransaction.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SmartStateTransInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.success = iprot.readBool();
        struct.setSuccessIsSet(true);
      }
      if (incoming.get(1)) {
        struct.executionFee = new com.credits.general.thrift.generated.Amount();
        struct.executionFee.read(iprot);
        struct.setExecutionFeeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.returnValue = new com.credits.general.thrift.generated.Variant();
        struct.returnValue.read(iprot);
        struct.setReturnValueIsSet(true);
      }
      if (incoming.get(3)) {
        struct.startTransaction = new TransactionId();
        struct.startTransaction.read(iprot);
        struct.setStartTransactionIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

