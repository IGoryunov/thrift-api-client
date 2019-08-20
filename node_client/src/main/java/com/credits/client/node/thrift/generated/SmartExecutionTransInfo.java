/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.credits.client.node.thrift.generated;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2019-08-13")
public class SmartExecutionTransInfo implements org.apache.thrift.TBase<SmartExecutionTransInfo, SmartExecutionTransInfo._Fields>, java.io.Serializable, Cloneable, Comparable<SmartExecutionTransInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SmartExecutionTransInfo");

  private static final org.apache.thrift.protocol.TField METHOD_FIELD_DESC = new org.apache.thrift.protocol.TField("method", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField PARAMS_FIELD_DESC = new org.apache.thrift.protocol.TField("params", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField STATE_FIELD_DESC = new org.apache.thrift.protocol.TField("state", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField STATE_TRANSACTION_FIELD_DESC = new org.apache.thrift.protocol.TField("stateTransaction", org.apache.thrift.protocol.TType.STRUCT, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new SmartExecutionTransInfoStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new SmartExecutionTransInfoTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String method; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<com.credits.general.thrift.generated.Variant> params; // required
  /**
   * 
   * @see SmartOperationState
   */
  public @org.apache.thrift.annotation.Nullable SmartOperationState state; // required
  public @org.apache.thrift.annotation.Nullable TransactionId stateTransaction; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    METHOD((short)1, "method"),
    PARAMS((short)2, "params"),
    /**
     * 
     * @see SmartOperationState
     */
    STATE((short)3, "state"),
    STATE_TRANSACTION((short)4, "stateTransaction");

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
        case 1: // METHOD
          return METHOD;
        case 2: // PARAMS
          return PARAMS;
        case 3: // STATE
          return STATE;
        case 4: // STATE_TRANSACTION
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
    tmpMap.put(_Fields.METHOD, new org.apache.thrift.meta_data.FieldMetaData("method", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PARAMS, new org.apache.thrift.meta_data.FieldMetaData("params", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.credits.general.thrift.generated.Variant.class))));
    tmpMap.put(_Fields.STATE, new org.apache.thrift.meta_data.FieldMetaData("state", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, SmartOperationState.class)));
    tmpMap.put(_Fields.STATE_TRANSACTION, new org.apache.thrift.meta_data.FieldMetaData("stateTransaction", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TransactionId.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SmartExecutionTransInfo.class, metaDataMap);
  }

  public SmartExecutionTransInfo() {
  }

  public SmartExecutionTransInfo(
    java.lang.String method,
    java.util.List<com.credits.general.thrift.generated.Variant> params,
    SmartOperationState state)
  {
    this();
    this.method = method;
    this.params = params;
    this.state = state;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SmartExecutionTransInfo(SmartExecutionTransInfo other) {
    if (other.isSetMethod()) {
      this.method = other.method;
    }
    if (other.isSetParams()) {
      java.util.List<com.credits.general.thrift.generated.Variant> __this__params = new java.util.ArrayList<com.credits.general.thrift.generated.Variant>(other.params.size());
      for (com.credits.general.thrift.generated.Variant other_element : other.params) {
        __this__params.add(new com.credits.general.thrift.generated.Variant(other_element));
      }
      this.params = __this__params;
    }
    if (other.isSetState()) {
      this.state = other.state;
    }
    if (other.isSetStateTransaction()) {
      this.stateTransaction = new TransactionId(other.stateTransaction);
    }
  }

  public SmartExecutionTransInfo deepCopy() {
    return new SmartExecutionTransInfo(this);
  }

  @Override
  public void clear() {
    this.method = null;
    this.params = null;
    this.state = null;
    this.stateTransaction = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getMethod() {
    return this.method;
  }

  public SmartExecutionTransInfo setMethod(@org.apache.thrift.annotation.Nullable java.lang.String method) {
    this.method = method;
    return this;
  }

  public void unsetMethod() {
    this.method = null;
  }

  /** Returns true if field method is set (has been assigned a value) and false otherwise */
  public boolean isSetMethod() {
    return this.method != null;
  }

  public void setMethodIsSet(boolean value) {
    if (!value) {
      this.method = null;
    }
  }

  public int getParamsSize() {
    return (this.params == null) ? 0 : this.params.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<com.credits.general.thrift.generated.Variant> getParamsIterator() {
    return (this.params == null) ? null : this.params.iterator();
  }

  public void addToParams(com.credits.general.thrift.generated.Variant elem) {
    if (this.params == null) {
      this.params = new java.util.ArrayList<com.credits.general.thrift.generated.Variant>();
    }
    this.params.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<com.credits.general.thrift.generated.Variant> getParams() {
    return this.params;
  }

  public SmartExecutionTransInfo setParams(@org.apache.thrift.annotation.Nullable java.util.List<com.credits.general.thrift.generated.Variant> params) {
    this.params = params;
    return this;
  }

  public void unsetParams() {
    this.params = null;
  }

  /** Returns true if field params is set (has been assigned a value) and false otherwise */
  public boolean isSetParams() {
    return this.params != null;
  }

  public void setParamsIsSet(boolean value) {
    if (!value) {
      this.params = null;
    }
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
  public SmartExecutionTransInfo setState(@org.apache.thrift.annotation.Nullable SmartOperationState state) {
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

  public SmartExecutionTransInfo setStateTransaction(@org.apache.thrift.annotation.Nullable TransactionId stateTransaction) {
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
    case METHOD:
      if (value == null) {
        unsetMethod();
      } else {
        setMethod((java.lang.String)value);
      }
      break;

    case PARAMS:
      if (value == null) {
        unsetParams();
      } else {
        setParams((java.util.List<com.credits.general.thrift.generated.Variant>)value);
      }
      break;

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
    case METHOD:
      return getMethod();

    case PARAMS:
      return getParams();

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
    case METHOD:
      return isSetMethod();
    case PARAMS:
      return isSetParams();
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
    if (that instanceof SmartExecutionTransInfo)
      return this.equals((SmartExecutionTransInfo)that);
    return false;
  }

  public boolean equals(SmartExecutionTransInfo that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_method = true && this.isSetMethod();
    boolean that_present_method = true && that.isSetMethod();
    if (this_present_method || that_present_method) {
      if (!(this_present_method && that_present_method))
        return false;
      if (!this.method.equals(that.method))
        return false;
    }

    boolean this_present_params = true && this.isSetParams();
    boolean that_present_params = true && that.isSetParams();
    if (this_present_params || that_present_params) {
      if (!(this_present_params && that_present_params))
        return false;
      if (!this.params.equals(that.params))
        return false;
    }

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

    hashCode = hashCode * 8191 + ((isSetMethod()) ? 131071 : 524287);
    if (isSetMethod())
      hashCode = hashCode * 8191 + method.hashCode();

    hashCode = hashCode * 8191 + ((isSetParams()) ? 131071 : 524287);
    if (isSetParams())
      hashCode = hashCode * 8191 + params.hashCode();

    hashCode = hashCode * 8191 + ((isSetState()) ? 131071 : 524287);
    if (isSetState())
      hashCode = hashCode * 8191 + state.getValue();

    hashCode = hashCode * 8191 + ((isSetStateTransaction()) ? 131071 : 524287);
    if (isSetStateTransaction())
      hashCode = hashCode * 8191 + stateTransaction.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(SmartExecutionTransInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetMethod()).compareTo(other.isSetMethod());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMethod()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.method, other.method);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetParams()).compareTo(other.isSetParams());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetParams()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.params, other.params);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("SmartExecutionTransInfo(");
    boolean first = true;

    sb.append("method:");
    if (this.method == null) {
      sb.append("null");
    } else {
      sb.append(this.method);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("params:");
    if (this.params == null) {
      sb.append("null");
    } else {
      sb.append(this.params);
    }
    first = false;
    if (!first) sb.append(", ");
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

  private static class SmartExecutionTransInfoStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SmartExecutionTransInfoStandardScheme getScheme() {
      return new SmartExecutionTransInfoStandardScheme();
    }
  }

  private static class SmartExecutionTransInfoStandardScheme extends org.apache.thrift.scheme.StandardScheme<SmartExecutionTransInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SmartExecutionTransInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // METHOD
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.method = iprot.readString();
              struct.setMethodIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PARAMS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list24 = iprot.readListBegin();
                struct.params = new java.util.ArrayList<com.credits.general.thrift.generated.Variant>(_list24.size);
                @org.apache.thrift.annotation.Nullable com.credits.general.thrift.generated.Variant _elem25;
                for (int _i26 = 0; _i26 < _list24.size; ++_i26)
                {
                  _elem25 = new com.credits.general.thrift.generated.Variant();
                  _elem25.read(iprot);
                  struct.params.add(_elem25);
                }
                iprot.readListEnd();
              }
              struct.setParamsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // STATE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.state = com.credits.client.node.thrift.generated.SmartOperationState.findByValue(iprot.readI32());
              struct.setStateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // STATE_TRANSACTION
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SmartExecutionTransInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.method != null) {
        oprot.writeFieldBegin(METHOD_FIELD_DESC);
        oprot.writeString(struct.method);
        oprot.writeFieldEnd();
      }
      if (struct.params != null) {
        oprot.writeFieldBegin(PARAMS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.params.size()));
          for (com.credits.general.thrift.generated.Variant _iter27 : struct.params)
          {
            _iter27.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
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

  private static class SmartExecutionTransInfoTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SmartExecutionTransInfoTupleScheme getScheme() {
      return new SmartExecutionTransInfoTupleScheme();
    }
  }

  private static class SmartExecutionTransInfoTupleScheme extends org.apache.thrift.scheme.TupleScheme<SmartExecutionTransInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SmartExecutionTransInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetMethod()) {
        optionals.set(0);
      }
      if (struct.isSetParams()) {
        optionals.set(1);
      }
      if (struct.isSetState()) {
        optionals.set(2);
      }
      if (struct.isSetStateTransaction()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetMethod()) {
        oprot.writeString(struct.method);
      }
      if (struct.isSetParams()) {
        {
          oprot.writeI32(struct.params.size());
          for (com.credits.general.thrift.generated.Variant _iter28 : struct.params)
          {
            _iter28.write(oprot);
          }
        }
      }
      if (struct.isSetState()) {
        oprot.writeI32(struct.state.getValue());
      }
      if (struct.isSetStateTransaction()) {
        struct.stateTransaction.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SmartExecutionTransInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.method = iprot.readString();
        struct.setMethodIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list29 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.params = new java.util.ArrayList<com.credits.general.thrift.generated.Variant>(_list29.size);
          @org.apache.thrift.annotation.Nullable com.credits.general.thrift.generated.Variant _elem30;
          for (int _i31 = 0; _i31 < _list29.size; ++_i31)
          {
            _elem30 = new com.credits.general.thrift.generated.Variant();
            _elem30.read(iprot);
            struct.params.add(_elem30);
          }
        }
        struct.setParamsIsSet(true);
      }
      if (incoming.get(2)) {
        struct.state = com.credits.client.node.thrift.generated.SmartOperationState.findByValue(iprot.readI32());
        struct.setStateIsSet(true);
      }
      if (incoming.get(3)) {
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

