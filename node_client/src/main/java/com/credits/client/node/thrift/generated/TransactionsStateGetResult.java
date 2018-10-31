/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.credits.client.node.thrift.generated;

import com.credits.general.thrift.generated.APIResponse;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-10-31")
public class TransactionsStateGetResult implements org.apache.thrift.TBase<TransactionsStateGetResult, TransactionsStateGetResult._Fields>, java.io.Serializable, Cloneable, Comparable<TransactionsStateGetResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TransactionsStateGetResult");

  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField STATES_FIELD_DESC = new org.apache.thrift.protocol.TField("states", org.apache.thrift.protocol.TType.MAP, (short)2);
  private static final org.apache.thrift.protocol.TField ROUND_NUM_FIELD_DESC = new org.apache.thrift.protocol.TField("roundNum", org.apache.thrift.protocol.TType.I32, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TransactionsStateGetResultStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TransactionsStateGetResultTupleSchemeFactory();

  public APIResponse status; // required
  public java.util.Map<java.lang.Long,TransactionState> states; // required
  public int roundNum; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STATUS((short)1, "status"),
    STATES((short)2, "states"),
    ROUND_NUM((short)3, "roundNum");

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
        case 1: // STATUS
          return STATUS;
        case 2: // STATES
          return STATES;
        case 3: // ROUND_NUM
          return ROUND_NUM;
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
  private static final int __ROUNDNUM_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, APIResponse.class)));
    tmpMap.put(_Fields.STATES, new org.apache.thrift.meta_data.FieldMetaData("states", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64            , "TransactionInnerId"), 
            new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TransactionState.class))));
    tmpMap.put(_Fields.ROUND_NUM, new org.apache.thrift.meta_data.FieldMetaData("roundNum", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TransactionsStateGetResult.class, metaDataMap);
  }

  public TransactionsStateGetResult() {
  }

  public TransactionsStateGetResult(
    APIResponse status,
    java.util.Map<java.lang.Long,TransactionState> states,
    int roundNum)
  {
    this();
    this.status = status;
    this.states = states;
    this.roundNum = roundNum;
    setRoundNumIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TransactionsStateGetResult(TransactionsStateGetResult other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetStatus()) {
      this.status = new APIResponse(other.status);
    }
    if (other.isSetStates()) {
      java.util.Map<java.lang.Long,TransactionState> __this__states = new java.util.HashMap<java.lang.Long,TransactionState>(other.states.size());
      for (java.util.Map.Entry<java.lang.Long, TransactionState> other_element : other.states.entrySet()) {

        java.lang.Long other_element_key = other_element.getKey();
        TransactionState other_element_value = other_element.getValue();

        java.lang.Long __this__states_copy_key = other_element_key;

        TransactionState __this__states_copy_value = other_element_value;

        __this__states.put(__this__states_copy_key, __this__states_copy_value);
      }
      this.states = __this__states;
    }
    this.roundNum = other.roundNum;
  }

  public TransactionsStateGetResult deepCopy() {
    return new TransactionsStateGetResult(this);
  }

  @Override
  public void clear() {
    this.status = null;
    this.states = null;
    setRoundNumIsSet(false);
    this.roundNum = 0;
  }

  public APIResponse getStatus() {
    return this.status;
  }

  public TransactionsStateGetResult setStatus(APIResponse status) {
    this.status = status;
    return this;
  }

  public void unsetStatus() {
    this.status = null;
  }

  /** Returns true if field status is set (has been assigned a value) and false otherwise */
  public boolean isSetStatus() {
    return this.status != null;
  }

  public void setStatusIsSet(boolean value) {
    if (!value) {
      this.status = null;
    }
  }

  public int getStatesSize() {
    return (this.states == null) ? 0 : this.states.size();
  }

  public void putToStates(long key, TransactionState val) {
    if (this.states == null) {
      this.states = new java.util.HashMap<java.lang.Long,TransactionState>();
    }
    this.states.put(key, val);
  }

  public java.util.Map<java.lang.Long,TransactionState> getStates() {
    return this.states;
  }

  public TransactionsStateGetResult setStates(java.util.Map<java.lang.Long,TransactionState> states) {
    this.states = states;
    return this;
  }

  public void unsetStates() {
    this.states = null;
  }

  /** Returns true if field states is set (has been assigned a value) and false otherwise */
  public boolean isSetStates() {
    return this.states != null;
  }

  public void setStatesIsSet(boolean value) {
    if (!value) {
      this.states = null;
    }
  }

  public int getRoundNum() {
    return this.roundNum;
  }

  public TransactionsStateGetResult setRoundNum(int roundNum) {
    this.roundNum = roundNum;
    setRoundNumIsSet(true);
    return this;
  }

  public void unsetRoundNum() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ROUNDNUM_ISSET_ID);
  }

  /** Returns true if field roundNum is set (has been assigned a value) and false otherwise */
  public boolean isSetRoundNum() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ROUNDNUM_ISSET_ID);
  }

  public void setRoundNumIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ROUNDNUM_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case STATUS:
      if (value == null) {
        unsetStatus();
      } else {
        setStatus((APIResponse)value);
      }
      break;

    case STATES:
      if (value == null) {
        unsetStates();
      } else {
        setStates((java.util.Map<java.lang.Long,TransactionState>)value);
      }
      break;

    case ROUND_NUM:
      if (value == null) {
        unsetRoundNum();
      } else {
        setRoundNum((java.lang.Integer)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case STATUS:
      return getStatus();

    case STATES:
      return getStates();

    case ROUND_NUM:
      return getRoundNum();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case STATUS:
      return isSetStatus();
    case STATES:
      return isSetStates();
    case ROUND_NUM:
      return isSetRoundNum();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TransactionsStateGetResult)
      return this.equals((TransactionsStateGetResult)that);
    return false;
  }

  public boolean equals(TransactionsStateGetResult that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_status = true && this.isSetStatus();
    boolean that_present_status = true && that.isSetStatus();
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (!this.status.equals(that.status))
        return false;
    }

    boolean this_present_states = true && this.isSetStates();
    boolean that_present_states = true && that.isSetStates();
    if (this_present_states || that_present_states) {
      if (!(this_present_states && that_present_states))
        return false;
      if (!this.states.equals(that.states))
        return false;
    }

    boolean this_present_roundNum = true;
    boolean that_present_roundNum = true;
    if (this_present_roundNum || that_present_roundNum) {
      if (!(this_present_roundNum && that_present_roundNum))
        return false;
      if (this.roundNum != that.roundNum)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetStatus()) ? 131071 : 524287);
    if (isSetStatus())
      hashCode = hashCode * 8191 + status.hashCode();

    hashCode = hashCode * 8191 + ((isSetStates()) ? 131071 : 524287);
    if (isSetStates())
      hashCode = hashCode * 8191 + states.hashCode();

    hashCode = hashCode * 8191 + roundNum;

    return hashCode;
  }

  @Override
  public int compareTo(TransactionsStateGetResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetStatus()).compareTo(other.isSetStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.status, other.status);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetStates()).compareTo(other.isSetStates());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStates()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.states, other.states);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetRoundNum()).compareTo(other.isSetRoundNum());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRoundNum()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.roundNum, other.roundNum);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TransactionsStateGetResult(");
    boolean first = true;

    sb.append("status:");
    if (this.status == null) {
      sb.append("null");
    } else {
      sb.append(this.status);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("states:");
    if (this.states == null) {
      sb.append("null");
    } else {
      sb.append(this.states);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("roundNum:");
    sb.append(this.roundNum);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (status != null) {
      status.validate();
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

  private static class TransactionsStateGetResultStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TransactionsStateGetResultStandardScheme getScheme() {
      return new TransactionsStateGetResultStandardScheme();
    }
  }

  private static class TransactionsStateGetResultStandardScheme extends org.apache.thrift.scheme.StandardScheme<TransactionsStateGetResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TransactionsStateGetResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.status = new APIResponse();
              struct.status.read(iprot);
              struct.setStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // STATES
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map66 = iprot.readMapBegin();
                struct.states = new java.util.HashMap<java.lang.Long,TransactionState>(2*_map66.size);
                long _key67;
                TransactionState _val68;
                for (int _i69 = 0; _i69 < _map66.size; ++_i69)
                {
                  _key67 = iprot.readI64();
                  _val68 = com.credits.client.node.thrift.generated.TransactionState.findByValue(iprot.readI32());
                  struct.states.put(_key67, _val68);
                }
                iprot.readMapEnd();
              }
              struct.setStatesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ROUND_NUM
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.roundNum = iprot.readI32();
              struct.setRoundNumIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TransactionsStateGetResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.status != null) {
        oprot.writeFieldBegin(STATUS_FIELD_DESC);
        struct.status.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.states != null) {
        oprot.writeFieldBegin(STATES_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I64, org.apache.thrift.protocol.TType.I32, struct.states.size()));
          for (java.util.Map.Entry<java.lang.Long, TransactionState> _iter70 : struct.states.entrySet())
          {
            oprot.writeI64(_iter70.getKey());
            oprot.writeI32(_iter70.getValue().getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(ROUND_NUM_FIELD_DESC);
      oprot.writeI32(struct.roundNum);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TransactionsStateGetResultTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TransactionsStateGetResultTupleScheme getScheme() {
      return new TransactionsStateGetResultTupleScheme();
    }
  }

  private static class TransactionsStateGetResultTupleScheme extends org.apache.thrift.scheme.TupleScheme<TransactionsStateGetResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TransactionsStateGetResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetStatus()) {
        optionals.set(0);
      }
      if (struct.isSetStates()) {
        optionals.set(1);
      }
      if (struct.isSetRoundNum()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetStatus()) {
        struct.status.write(oprot);
      }
      if (struct.isSetStates()) {
        {
          oprot.writeI32(struct.states.size());
          for (java.util.Map.Entry<java.lang.Long, TransactionState> _iter71 : struct.states.entrySet())
          {
            oprot.writeI64(_iter71.getKey());
            oprot.writeI32(_iter71.getValue().getValue());
          }
        }
      }
      if (struct.isSetRoundNum()) {
        oprot.writeI32(struct.roundNum);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TransactionsStateGetResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.status = new APIResponse();
        struct.status.read(iprot);
        struct.setStatusIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TMap _map72 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I64, org.apache.thrift.protocol.TType.I32, iprot.readI32());
          struct.states = new java.util.HashMap<java.lang.Long,TransactionState>(2*_map72.size);
          long _key73;
          TransactionState _val74;
          for (int _i75 = 0; _i75 < _map72.size; ++_i75)
          {
            _key73 = iprot.readI64();
            _val74 = com.credits.client.node.thrift.generated.TransactionState.findByValue(iprot.readI32());
            struct.states.put(_key73, _val74);
          }
        }
        struct.setStatesIsSet(true);
      }
      if (incoming.get(2)) {
        struct.roundNum = iprot.readI32();
        struct.setRoundNumIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

