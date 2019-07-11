/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.credits.client.node.thrift.generated;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2019-07-11")
public class SmartDeployTransInfo implements org.apache.thrift.TBase<SmartDeployTransInfo, SmartDeployTransInfo._Fields>, java.io.Serializable, Cloneable, Comparable<SmartDeployTransInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SmartDeployTransInfo");

  private static final org.apache.thrift.protocol.TField STATE_FIELD_DESC = new org.apache.thrift.protocol.TField("state", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField STATE_TRANSACTION_FIELD_DESC = new org.apache.thrift.protocol.TField("stateTransaction", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new SmartDeployTransInfoStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new SmartDeployTransInfoTupleSchemeFactory();

  /**
   * 
   * @see SmartOperationState
   */
  public @org.apache.thrift.annotation.Nullable SmartOperationState state; // required
  public @org.apache.thrift.annotation.Nullable TransactionId stateTransaction; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see SmartOperationState
     */
    STATE((short)1, "state"),
    STATE_TRANSACTION((short)2, "stateTransaction");

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
        case 1: // STATE
          return STATE;
        case 2: // STATE_TRANSACTION
          return STATE_TRANSACTION;
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
  private static final _Fields optionals[] = {_Fields.STATE_TRANSACTION};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STATE, new org.apache.thrift.meta_data.FieldMetaData("state", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, SmartOperationState.class)));
    tmpMap.put(_Fields.STATE_TRANSACTION, new org.apache.thrift.meta_data.FieldMetaData("stateTransaction", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TransactionId.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SmartDeployTransInfo.class, metaDataMap);
  }

  public SmartDeployTransInfo() {
  }

  public SmartDeployTransInfo(
    SmartOperationState state)
  {
    this();
    this.state = state;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SmartDeployTransInfo(SmartDeployTransInfo other) {
    if (other.isSetState()) {
      this.state = other.state;
    }
    if (other.isSetStateTransaction()) {
      this.stateTransaction = new TransactionId(other.stateTransaction);
    }
  }

  public SmartDeployTransInfo deepCopy() {
    return new SmartDeployTransInfo(this);
  }

  @Override
  public void clear() {
    this.state = null;
    this.stateTransaction = null;
  }

  /**
   * 
   * @see SmartOperationState
   */
  @org.apache.thrift.annotation.Nullable
  public SmartOperationState getState() {
    return this.state;
  }

  /**
   * 
   * @see SmartOperationState
   */
  public SmartDeployTransInfo setState(@org.apache.thrift.annotation.Nullable SmartOperationState state) {
    this.state = state;
    return this;
  }

  public void unsetState() {
    this.state = null;
  }

  /** Returns true if field state is set (has been assigned a value) and false otherwise */
  public boolean isSetState() {
    return this.state != null;
  }

  public void setStateIsSet(boolean value) {
    if (!value) {
      this.state = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public TransactionId getStateTransaction() {
    return this.stateTransaction;
  }

  public SmartDeployTransInfo setStateTransaction(@org.apache.thrift.annotation.Nullable TransactionId stateTransaction) {
    this.stateTransaction = stateTransaction;
    return this;
  }

  public void unsetStateTransaction() {
    this.stateTransaction = null;
  }

  /** Returns true if field stateTransaction is set (has been assigned a value) and false otherwise */
  public boolean isSetStateTransaction() {
    return this.stateTransaction != null;
  }

  public void setStateTransactionIsSet(boolean value) {
    if (!value) {
      this.stateTransaction = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case STATE:
      if (value == null) {
        unsetState();
      } else {
        setState((SmartOperationState)value);
      }
      break;

    case STATE_TRANSACTION:
      if (value == null) {
        unsetStateTransaction();
      } else {
        setStateTransaction((TransactionId)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case STATE:
      return getState();

    case STATE_TRANSACTION:
      return getStateTransaction();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case STATE:
      return isSetState();
    case STATE_TRANSACTION:
      return isSetStateTransaction();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof SmartDeployTransInfo)
      return this.equals((SmartDeployTransInfo)that);
    return false;
  }

  public boolean equals(SmartDeployTransInfo that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_state = true && this.isSetState();
    boolean that_present_state = true && that.isSetState();
    if (this_present_state || that_present_state) {
      if (!(this_present_state && that_present_state))
        return false;
      if (!this.state.equals(that.state))
        return false;
    }

    boolean this_present_stateTransaction = true && this.isSetStateTransaction();
    boolean that_present_stateTransaction = true && that.isSetStateTransaction();
    if (this_present_stateTransaction || that_present_stateTransaction) {
      if (!(this_present_stateTransaction && that_present_stateTransaction))
        return false;
      if (!this.stateTransaction.equals(that.stateTransaction))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetState()) ? 131071 : 524287);
    if (isSetState())
      hashCode = hashCode * 8191 + state.getValue();

    hashCode = hashCode * 8191 + ((isSetStateTransaction()) ? 131071 : 524287);
    if (isSetStateTransaction())
      hashCode = hashCode * 8191 + stateTransaction.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(SmartDeployTransInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetState()).compareTo(other.isSetState());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetState()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.state, other.state);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetStateTransaction()).compareTo(other.isSetStateTransaction());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStateTransaction()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.stateTransaction, other.stateTransaction);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("SmartDeployTransInfo(");
    boolean first = true;

    sb.append("state:");
    if (this.state == null) {
      sb.append("null");
    } else {
      sb.append(this.state);
    }
    first = false;
    if (isSetStateTransaction()) {
      if (!first) sb.append(", ");
      sb.append("stateTransaction:");
      if (this.stateTransaction == null) {
        sb.append("null");
      } else {
        sb.append(this.stateTransaction);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (stateTransaction != null) {
      stateTransaction.validate();
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

  private static class SmartDeployTransInfoStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SmartDeployTransInfoStandardScheme getScheme() {
      return new SmartDeployTransInfoStandardScheme();
    }
  }

  private static class SmartDeployTransInfoStandardScheme extends org.apache.thrift.scheme.StandardScheme<SmartDeployTransInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SmartDeployTransInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STATE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.state = com.credits.client.node.thrift.generated.SmartOperationState.findByValue(iprot.readI32());
              struct.setStateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // STATE_TRANSACTION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.stateTransaction = new TransactionId();
              struct.stateTransaction.read(iprot);
              struct.setStateTransactionIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SmartDeployTransInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.state != null) {
        oprot.writeFieldBegin(STATE_FIELD_DESC);
        oprot.writeI32(struct.state.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.stateTransaction != null) {
        if (struct.isSetStateTransaction()) {
          oprot.writeFieldBegin(STATE_TRANSACTION_FIELD_DESC);
          struct.stateTransaction.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SmartDeployTransInfoTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SmartDeployTransInfoTupleScheme getScheme() {
      return new SmartDeployTransInfoTupleScheme();
    }
  }

  private static class SmartDeployTransInfoTupleScheme extends org.apache.thrift.scheme.TupleScheme<SmartDeployTransInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SmartDeployTransInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetState()) {
        optionals.set(0);
      }
      if (struct.isSetStateTransaction()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetState()) {
        oprot.writeI32(struct.state.getValue());
      }
      if (struct.isSetStateTransaction()) {
        struct.stateTransaction.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SmartDeployTransInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.state = com.credits.client.node.thrift.generated.SmartOperationState.findByValue(iprot.readI32());
        struct.setStateIsSet(true);
      }
      if (incoming.get(1)) {
        struct.stateTransaction = new TransactionId();
        struct.stateTransaction.read(iprot);
        struct.setStateTransactionIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

