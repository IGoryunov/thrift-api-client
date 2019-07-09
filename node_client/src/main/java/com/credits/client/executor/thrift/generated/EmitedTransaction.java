/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.credits.client.executor.thrift.generated;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2019-07-03")
public class EmitedTransaction implements org.apache.thrift.TBase<EmitedTransaction, EmitedTransaction._Fields>, java.io.Serializable, Cloneable, Comparable<EmitedTransaction> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("EmitedTransaction");

  private static final org.apache.thrift.protocol.TField SOURCE_FIELD_DESC = new org.apache.thrift.protocol.TField("source", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField TARGET_FIELD_DESC = new org.apache.thrift.protocol.TField("target", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField AMOUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("amount", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField USER_DATA_FIELD_DESC = new org.apache.thrift.protocol.TField("userData", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new EmitedTransactionStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new EmitedTransactionTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.nio.ByteBuffer source; // required
  public @org.apache.thrift.annotation.Nullable java.nio.ByteBuffer target; // required
  public @org.apache.thrift.annotation.Nullable com.credits.general.thrift.generated.Amount amount; // required
  public @org.apache.thrift.annotation.Nullable java.nio.ByteBuffer userData; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SOURCE((short)1, "source"),
    TARGET((short)2, "target"),
    AMOUNT((short)3, "amount"),
    USER_DATA((short)4, "userData");

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
        case 1: // SOURCE
          return SOURCE;
        case 2: // TARGET
          return TARGET;
        case 3: // AMOUNT
          return AMOUNT;
        case 4: // USER_DATA
          return USER_DATA;
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
  private static final _Fields optionals[] = {_Fields.USER_DATA};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SOURCE, new org.apache.thrift.meta_data.FieldMetaData("source", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "Address")));
    tmpMap.put(_Fields.TARGET, new org.apache.thrift.meta_data.FieldMetaData("target", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "Address")));
    tmpMap.put(_Fields.AMOUNT, new org.apache.thrift.meta_data.FieldMetaData("amount", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.credits.general.thrift.generated.Amount.class)));
    tmpMap.put(_Fields.USER_DATA, new org.apache.thrift.meta_data.FieldMetaData("userData", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(EmitedTransaction.class, metaDataMap);
  }

  public EmitedTransaction() {
  }

  public EmitedTransaction(
    java.nio.ByteBuffer source,
    java.nio.ByteBuffer target,
    com.credits.general.thrift.generated.Amount amount)
  {
    this();
    this.source = org.apache.thrift.TBaseHelper.copyBinary(source);
    this.target = org.apache.thrift.TBaseHelper.copyBinary(target);
    this.amount = amount;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public EmitedTransaction(EmitedTransaction other) {
    if (other.isSetSource()) {
      this.source = org.apache.thrift.TBaseHelper.copyBinary(other.source);
    }
    if (other.isSetTarget()) {
      this.target = org.apache.thrift.TBaseHelper.copyBinary(other.target);
    }
    if (other.isSetAmount()) {
      this.amount = new com.credits.general.thrift.generated.Amount(other.amount);
    }
    if (other.isSetUserData()) {
      this.userData = org.apache.thrift.TBaseHelper.copyBinary(other.userData);
    }
  }

  public EmitedTransaction deepCopy() {
    return new EmitedTransaction(this);
  }

  @Override
  public void clear() {
    this.source = null;
    this.target = null;
    this.amount = null;
    this.userData = null;
  }

  public byte[] getSource() {
    setSource(org.apache.thrift.TBaseHelper.rightSize(source));
    return source == null ? null : source.array();
  }

  public java.nio.ByteBuffer bufferForSource() {
    return org.apache.thrift.TBaseHelper.copyBinary(source);
  }

  public EmitedTransaction setSource(byte[] source) {
    this.source = source == null ? (java.nio.ByteBuffer)null   : java.nio.ByteBuffer.wrap(source.clone());
    return this;
  }

  public EmitedTransaction setSource(@org.apache.thrift.annotation.Nullable java.nio.ByteBuffer source) {
    this.source = org.apache.thrift.TBaseHelper.copyBinary(source);
    return this;
  }

  public void unsetSource() {
    this.source = null;
  }

  /** Returns true if field source is set (has been assigned a value) and false otherwise */
  public boolean isSetSource() {
    return this.source != null;
  }

  public void setSourceIsSet(boolean value) {
    if (!value) {
      this.source = null;
    }
  }

  public byte[] getTarget() {
    setTarget(org.apache.thrift.TBaseHelper.rightSize(target));
    return target == null ? null : target.array();
  }

  public java.nio.ByteBuffer bufferForTarget() {
    return org.apache.thrift.TBaseHelper.copyBinary(target);
  }

  public EmitedTransaction setTarget(byte[] target) {
    this.target = target == null ? (java.nio.ByteBuffer)null   : java.nio.ByteBuffer.wrap(target.clone());
    return this;
  }

  public EmitedTransaction setTarget(@org.apache.thrift.annotation.Nullable java.nio.ByteBuffer target) {
    this.target = org.apache.thrift.TBaseHelper.copyBinary(target);
    return this;
  }

  public void unsetTarget() {
    this.target = null;
  }

  /** Returns true if field target is set (has been assigned a value) and false otherwise */
  public boolean isSetTarget() {
    return this.target != null;
  }

  public void setTargetIsSet(boolean value) {
    if (!value) {
      this.target = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public com.credits.general.thrift.generated.Amount getAmount() {
    return this.amount;
  }

  public EmitedTransaction setAmount(@org.apache.thrift.annotation.Nullable com.credits.general.thrift.generated.Amount amount) {
    this.amount = amount;
    return this;
  }

  public void unsetAmount() {
    this.amount = null;
  }

  /** Returns true if field amount is set (has been assigned a value) and false otherwise */
  public boolean isSetAmount() {
    return this.amount != null;
  }

  public void setAmountIsSet(boolean value) {
    if (!value) {
      this.amount = null;
    }
  }

  public byte[] getUserData() {
    setUserData(org.apache.thrift.TBaseHelper.rightSize(userData));
    return userData == null ? null : userData.array();
  }

  public java.nio.ByteBuffer bufferForUserData() {
    return org.apache.thrift.TBaseHelper.copyBinary(userData);
  }

  public EmitedTransaction setUserData(byte[] userData) {
    this.userData = userData == null ? (java.nio.ByteBuffer)null   : java.nio.ByteBuffer.wrap(userData.clone());
    return this;
  }

  public EmitedTransaction setUserData(@org.apache.thrift.annotation.Nullable java.nio.ByteBuffer userData) {
    this.userData = org.apache.thrift.TBaseHelper.copyBinary(userData);
    return this;
  }

  public void unsetUserData() {
    this.userData = null;
  }

  /** Returns true if field userData is set (has been assigned a value) and false otherwise */
  public boolean isSetUserData() {
    return this.userData != null;
  }

  public void setUserDataIsSet(boolean value) {
    if (!value) {
      this.userData = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case SOURCE:
      if (value == null) {
        unsetSource();
      } else {
        if (value instanceof byte[]) {
          setSource((byte[])value);
        } else {
          setSource((java.nio.ByteBuffer)value);
        }
      }
      break;

    case TARGET:
      if (value == null) {
        unsetTarget();
      } else {
        if (value instanceof byte[]) {
          setTarget((byte[])value);
        } else {
          setTarget((java.nio.ByteBuffer)value);
        }
      }
      break;

    case AMOUNT:
      if (value == null) {
        unsetAmount();
      } else {
        setAmount((com.credits.general.thrift.generated.Amount)value);
      }
      break;

    case USER_DATA:
      if (value == null) {
        unsetUserData();
      } else {
        if (value instanceof byte[]) {
          setUserData((byte[])value);
        } else {
          setUserData((java.nio.ByteBuffer)value);
        }
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case SOURCE:
      return getSource();

    case TARGET:
      return getTarget();

    case AMOUNT:
      return getAmount();

    case USER_DATA:
      return getUserData();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case SOURCE:
      return isSetSource();
    case TARGET:
      return isSetTarget();
    case AMOUNT:
      return isSetAmount();
    case USER_DATA:
      return isSetUserData();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof EmitedTransaction)
      return this.equals((EmitedTransaction)that);
    return false;
  }

  public boolean equals(EmitedTransaction that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_source = true && this.isSetSource();
    boolean that_present_source = true && that.isSetSource();
    if (this_present_source || that_present_source) {
      if (!(this_present_source && that_present_source))
        return false;
      if (!this.source.equals(that.source))
        return false;
    }

    boolean this_present_target = true && this.isSetTarget();
    boolean that_present_target = true && that.isSetTarget();
    if (this_present_target || that_present_target) {
      if (!(this_present_target && that_present_target))
        return false;
      if (!this.target.equals(that.target))
        return false;
    }

    boolean this_present_amount = true && this.isSetAmount();
    boolean that_present_amount = true && that.isSetAmount();
    if (this_present_amount || that_present_amount) {
      if (!(this_present_amount && that_present_amount))
        return false;
      if (!this.amount.equals(that.amount))
        return false;
    }

    boolean this_present_userData = true && this.isSetUserData();
    boolean that_present_userData = true && that.isSetUserData();
    if (this_present_userData || that_present_userData) {
      if (!(this_present_userData && that_present_userData))
        return false;
      if (!this.userData.equals(that.userData))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetSource()) ? 131071 : 524287);
    if (isSetSource())
      hashCode = hashCode * 8191 + source.hashCode();

    hashCode = hashCode * 8191 + ((isSetTarget()) ? 131071 : 524287);
    if (isSetTarget())
      hashCode = hashCode * 8191 + target.hashCode();

    hashCode = hashCode * 8191 + ((isSetAmount()) ? 131071 : 524287);
    if (isSetAmount())
      hashCode = hashCode * 8191 + amount.hashCode();

    hashCode = hashCode * 8191 + ((isSetUserData()) ? 131071 : 524287);
    if (isSetUserData())
      hashCode = hashCode * 8191 + userData.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(EmitedTransaction other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetSource()).compareTo(other.isSetSource());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSource()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.source, other.source);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetTarget()).compareTo(other.isSetTarget());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTarget()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.target, other.target);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetAmount()).compareTo(other.isSetAmount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAmount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.amount, other.amount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetUserData()).compareTo(other.isSetUserData());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserData()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userData, other.userData);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("EmitedTransaction(");
    boolean first = true;

    sb.append("source:");
    if (this.source == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.source, sb);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("target:");
    if (this.target == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.target, sb);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("amount:");
    if (this.amount == null) {
      sb.append("null");
    } else {
      sb.append(this.amount);
    }
    first = false;
    if (isSetUserData()) {
      if (!first) sb.append(", ");
      sb.append("userData:");
      if (this.userData == null) {
        sb.append("null");
      } else {
        org.apache.thrift.TBaseHelper.toString(this.userData, sb);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (amount != null) {
      amount.validate();
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class EmitedTransactionStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public EmitedTransactionStandardScheme getScheme() {
      return new EmitedTransactionStandardScheme();
    }
  }

  private static class EmitedTransactionStandardScheme extends org.apache.thrift.scheme.StandardScheme<EmitedTransaction> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, EmitedTransaction struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SOURCE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.source = iprot.readBinary();
              struct.setSourceIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TARGET
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.target = iprot.readBinary();
              struct.setTargetIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // AMOUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.amount = new com.credits.general.thrift.generated.Amount();
              struct.amount.read(iprot);
              struct.setAmountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // USER_DATA
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.userData = iprot.readBinary();
              struct.setUserDataIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, EmitedTransaction struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.source != null) {
        oprot.writeFieldBegin(SOURCE_FIELD_DESC);
        oprot.writeBinary(struct.source);
        oprot.writeFieldEnd();
      }
      if (struct.target != null) {
        oprot.writeFieldBegin(TARGET_FIELD_DESC);
        oprot.writeBinary(struct.target);
        oprot.writeFieldEnd();
      }
      if (struct.amount != null) {
        oprot.writeFieldBegin(AMOUNT_FIELD_DESC);
        struct.amount.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.userData != null) {
        if (struct.isSetUserData()) {
          oprot.writeFieldBegin(USER_DATA_FIELD_DESC);
          oprot.writeBinary(struct.userData);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class EmitedTransactionTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public EmitedTransactionTupleScheme getScheme() {
      return new EmitedTransactionTupleScheme();
    }
  }

  private static class EmitedTransactionTupleScheme extends org.apache.thrift.scheme.TupleScheme<EmitedTransaction> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, EmitedTransaction struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetSource()) {
        optionals.set(0);
      }
      if (struct.isSetTarget()) {
        optionals.set(1);
      }
      if (struct.isSetAmount()) {
        optionals.set(2);
      }
      if (struct.isSetUserData()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetSource()) {
        oprot.writeBinary(struct.source);
      }
      if (struct.isSetTarget()) {
        oprot.writeBinary(struct.target);
      }
      if (struct.isSetAmount()) {
        struct.amount.write(oprot);
      }
      if (struct.isSetUserData()) {
        oprot.writeBinary(struct.userData);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, EmitedTransaction struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.source = iprot.readBinary();
        struct.setSourceIsSet(true);
      }
      if (incoming.get(1)) {
        struct.target = iprot.readBinary();
        struct.setTargetIsSet(true);
      }
      if (incoming.get(2)) {
        struct.amount = new com.credits.general.thrift.generated.Amount();
        struct.amount.read(iprot);
        struct.setAmountIsSet(true);
      }
      if (incoming.get(3)) {
        struct.userData = iprot.readBinary();
        struct.setUserDataIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

