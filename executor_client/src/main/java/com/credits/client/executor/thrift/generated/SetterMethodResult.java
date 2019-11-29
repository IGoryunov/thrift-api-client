/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.credits.client.executor.thrift.generated;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2019-11-29")
public class SetterMethodResult implements org.apache.thrift.TBase<SetterMethodResult, SetterMethodResult._Fields>, java.io.Serializable, Cloneable, Comparable<SetterMethodResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SetterMethodResult");

  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField RET_VAL_FIELD_DESC = new org.apache.thrift.protocol.TField("ret_val", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField CONTRACTS_STATE_FIELD_DESC = new org.apache.thrift.protocol.TField("contractsState", org.apache.thrift.protocol.TType.MAP, (short)3);
  private static final org.apache.thrift.protocol.TField EMITTED_TRANSACTIONS_FIELD_DESC = new org.apache.thrift.protocol.TField("emittedTransactions", org.apache.thrift.protocol.TType.LIST, (short)4);
  private static final org.apache.thrift.protocol.TField EXECUTION_COST_FIELD_DESC = new org.apache.thrift.protocol.TField("executionCost", org.apache.thrift.protocol.TType.I64, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new SetterMethodResultStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new SetterMethodResultTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable com.credits.general.thrift.generated.APIResponse status; // required
  public @org.apache.thrift.annotation.Nullable com.credits.general.thrift.generated.Variant ret_val; // required
  public @org.apache.thrift.annotation.Nullable java.util.Map<java.nio.ByteBuffer,java.nio.ByteBuffer> contractsState; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<EmittedTransaction> emittedTransactions; // required
  public long executionCost; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STATUS((short)1, "status"),
    RET_VAL((short)2, "ret_val"),
    CONTRACTS_STATE((short)3, "contractsState"),
    EMITTED_TRANSACTIONS((short)4, "emittedTransactions"),
    EXECUTION_COST((short)5, "executionCost");

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
        case 1: // STATUS
          return STATUS;
        case 2: // RET_VAL
          return RET_VAL;
        case 3: // CONTRACTS_STATE
          return CONTRACTS_STATE;
        case 4: // EMITTED_TRANSACTIONS
          return EMITTED_TRANSACTIONS;
        case 5: // EXECUTION_COST
          return EXECUTION_COST;
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
  private static final int __EXECUTIONCOST_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.credits.general.thrift.generated.APIResponse.class)));
    tmpMap.put(_Fields.RET_VAL, new org.apache.thrift.meta_data.FieldMetaData("ret_val", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.credits.general.thrift.generated.Variant.class)));
    tmpMap.put(_Fields.CONTRACTS_STATE, new org.apache.thrift.meta_data.FieldMetaData("contractsState", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING            , "Address"), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING            , true))));
    tmpMap.put(_Fields.EMITTED_TRANSACTIONS, new org.apache.thrift.meta_data.FieldMetaData("emittedTransactions", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT            , "EmittedTransaction"))));
    tmpMap.put(_Fields.EXECUTION_COST, new org.apache.thrift.meta_data.FieldMetaData("executionCost", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SetterMethodResult.class, metaDataMap);
  }

  public SetterMethodResult() {
  }

  public SetterMethodResult(
    com.credits.general.thrift.generated.APIResponse status,
    com.credits.general.thrift.generated.Variant ret_val,
    java.util.Map<java.nio.ByteBuffer,java.nio.ByteBuffer> contractsState,
    java.util.List<EmittedTransaction> emittedTransactions,
    long executionCost)
  {
    this();
    this.status = status;
    this.ret_val = ret_val;
    this.contractsState = contractsState;
    this.emittedTransactions = emittedTransactions;
    this.executionCost = executionCost;
    setExecutionCostIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SetterMethodResult(SetterMethodResult other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetStatus()) {
      this.status = new com.credits.general.thrift.generated.APIResponse(other.status);
    }
    if (other.isSetRet_val()) {
      this.ret_val = new com.credits.general.thrift.generated.Variant(other.ret_val);
    }
    if (other.isSetContractsState()) {
      java.util.Map<java.nio.ByteBuffer,java.nio.ByteBuffer> __this__contractsState = new java.util.HashMap<java.nio.ByteBuffer,java.nio.ByteBuffer>(other.contractsState.size());
      for (java.util.Map.Entry<java.nio.ByteBuffer, java.nio.ByteBuffer> other_element : other.contractsState.entrySet()) {

        java.nio.ByteBuffer other_element_key = other_element.getKey();
        java.nio.ByteBuffer other_element_value = other_element.getValue();

        java.nio.ByteBuffer __this__contractsState_copy_key = org.apache.thrift.TBaseHelper.copyBinary(other_element_key);

        java.nio.ByteBuffer __this__contractsState_copy_value = org.apache.thrift.TBaseHelper.copyBinary(other_element_value);

        __this__contractsState.put(__this__contractsState_copy_key, __this__contractsState_copy_value);
      }
      this.contractsState = __this__contractsState;
    }
    if (other.isSetEmittedTransactions()) {
      java.util.List<EmittedTransaction> __this__emittedTransactions = new java.util.ArrayList<EmittedTransaction>(other.emittedTransactions.size());
      for (EmittedTransaction other_element : other.emittedTransactions) {
        __this__emittedTransactions.add(new EmittedTransaction(other_element));
      }
      this.emittedTransactions = __this__emittedTransactions;
    }
    this.executionCost = other.executionCost;
  }

  public SetterMethodResult deepCopy() {
    return new SetterMethodResult(this);
  }

  @Override
  public void clear() {
    this.status = null;
    this.ret_val = null;
    this.contractsState = null;
    this.emittedTransactions = null;
    setExecutionCostIsSet(false);
    this.executionCost = 0;
  }

  @org.apache.thrift.annotation.Nullable
  public com.credits.general.thrift.generated.APIResponse getStatus() {
    return this.status;
  }

  public SetterMethodResult setStatus(@org.apache.thrift.annotation.Nullable com.credits.general.thrift.generated.APIResponse status) {
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

  @org.apache.thrift.annotation.Nullable
  public com.credits.general.thrift.generated.Variant getRet_val() {
    return this.ret_val;
  }

  public SetterMethodResult setRet_val(@org.apache.thrift.annotation.Nullable com.credits.general.thrift.generated.Variant ret_val) {
    this.ret_val = ret_val;
    return this;
  }

  public void unsetRet_val() {
    this.ret_val = null;
  }

  /** Returns true if field ret_val is set (has been assigned a value) and false otherwise */
  public boolean isSetRet_val() {
    return this.ret_val != null;
  }

  public void setRet_valIsSet(boolean value) {
    if (!value) {
      this.ret_val = null;
    }
  }

  public int getContractsStateSize() {
    return (this.contractsState == null) ? 0 : this.contractsState.size();
  }

  public void putToContractsState(java.nio.ByteBuffer key, java.nio.ByteBuffer val) {
    if (this.contractsState == null) {
      this.contractsState = new java.util.HashMap<java.nio.ByteBuffer,java.nio.ByteBuffer>();
    }
    this.contractsState.put(key, val);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Map<java.nio.ByteBuffer,java.nio.ByteBuffer> getContractsState() {
    return this.contractsState;
  }

  public SetterMethodResult setContractsState(@org.apache.thrift.annotation.Nullable java.util.Map<java.nio.ByteBuffer,java.nio.ByteBuffer> contractsState) {
    this.contractsState = contractsState;
    return this;
  }

  public void unsetContractsState() {
    this.contractsState = null;
  }

  /** Returns true if field contractsState is set (has been assigned a value) and false otherwise */
  public boolean isSetContractsState() {
    return this.contractsState != null;
  }

  public void setContractsStateIsSet(boolean value) {
    if (!value) {
      this.contractsState = null;
    }
  }

  public int getEmittedTransactionsSize() {
    return (this.emittedTransactions == null) ? 0 : this.emittedTransactions.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<EmittedTransaction> getEmittedTransactionsIterator() {
    return (this.emittedTransactions == null) ? null : this.emittedTransactions.iterator();
  }

  public void addToEmittedTransactions(EmittedTransaction elem) {
    if (this.emittedTransactions == null) {
      this.emittedTransactions = new java.util.ArrayList<EmittedTransaction>();
    }
    this.emittedTransactions.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<EmittedTransaction> getEmittedTransactions() {
    return this.emittedTransactions;
  }

  public SetterMethodResult setEmittedTransactions(@org.apache.thrift.annotation.Nullable java.util.List<EmittedTransaction> emittedTransactions) {
    this.emittedTransactions = emittedTransactions;
    return this;
  }

  public void unsetEmittedTransactions() {
    this.emittedTransactions = null;
  }

  /** Returns true if field emittedTransactions is set (has been assigned a value) and false otherwise */
  public boolean isSetEmittedTransactions() {
    return this.emittedTransactions != null;
  }

  public void setEmittedTransactionsIsSet(boolean value) {
    if (!value) {
      this.emittedTransactions = null;
    }
  }

  public long getExecutionCost() {
    return this.executionCost;
  }

  public SetterMethodResult setExecutionCost(long executionCost) {
    this.executionCost = executionCost;
    setExecutionCostIsSet(true);
    return this;
  }

  public void unsetExecutionCost() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __EXECUTIONCOST_ISSET_ID);
  }

  /** Returns true if field executionCost is set (has been assigned a value) and false otherwise */
  public boolean isSetExecutionCost() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __EXECUTIONCOST_ISSET_ID);
  }

  public void setExecutionCostIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __EXECUTIONCOST_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case STATUS:
      if (value == null) {
        unsetStatus();
      } else {
        setStatus((com.credits.general.thrift.generated.APIResponse)value);
      }
      break;

    case RET_VAL:
      if (value == null) {
        unsetRet_val();
      } else {
        setRet_val((com.credits.general.thrift.generated.Variant)value);
      }
      break;

    case CONTRACTS_STATE:
      if (value == null) {
        unsetContractsState();
      } else {
        setContractsState((java.util.Map<java.nio.ByteBuffer,java.nio.ByteBuffer>)value);
      }
      break;

    case EMITTED_TRANSACTIONS:
      if (value == null) {
        unsetEmittedTransactions();
      } else {
        setEmittedTransactions((java.util.List<EmittedTransaction>)value);
      }
      break;

    case EXECUTION_COST:
      if (value == null) {
        unsetExecutionCost();
      } else {
        setExecutionCost((java.lang.Long)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case STATUS:
      return getStatus();

    case RET_VAL:
      return getRet_val();

    case CONTRACTS_STATE:
      return getContractsState();

    case EMITTED_TRANSACTIONS:
      return getEmittedTransactions();

    case EXECUTION_COST:
      return getExecutionCost();

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
    case RET_VAL:
      return isSetRet_val();
    case CONTRACTS_STATE:
      return isSetContractsState();
    case EMITTED_TRANSACTIONS:
      return isSetEmittedTransactions();
    case EXECUTION_COST:
      return isSetExecutionCost();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof SetterMethodResult)
      return this.equals((SetterMethodResult)that);
    return false;
  }

  public boolean equals(SetterMethodResult that) {
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

    boolean this_present_ret_val = true && this.isSetRet_val();
    boolean that_present_ret_val = true && that.isSetRet_val();
    if (this_present_ret_val || that_present_ret_val) {
      if (!(this_present_ret_val && that_present_ret_val))
        return false;
      if (!this.ret_val.equals(that.ret_val))
        return false;
    }

    boolean this_present_contractsState = true && this.isSetContractsState();
    boolean that_present_contractsState = true && that.isSetContractsState();
    if (this_present_contractsState || that_present_contractsState) {
      if (!(this_present_contractsState && that_present_contractsState))
        return false;
      if (!this.contractsState.equals(that.contractsState))
        return false;
    }

    boolean this_present_emittedTransactions = true && this.isSetEmittedTransactions();
    boolean that_present_emittedTransactions = true && that.isSetEmittedTransactions();
    if (this_present_emittedTransactions || that_present_emittedTransactions) {
      if (!(this_present_emittedTransactions && that_present_emittedTransactions))
        return false;
      if (!this.emittedTransactions.equals(that.emittedTransactions))
        return false;
    }

    boolean this_present_executionCost = true;
    boolean that_present_executionCost = true;
    if (this_present_executionCost || that_present_executionCost) {
      if (!(this_present_executionCost && that_present_executionCost))
        return false;
      if (this.executionCost != that.executionCost)
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

    hashCode = hashCode * 8191 + ((isSetRet_val()) ? 131071 : 524287);
    if (isSetRet_val())
      hashCode = hashCode * 8191 + ret_val.hashCode();

    hashCode = hashCode * 8191 + ((isSetContractsState()) ? 131071 : 524287);
    if (isSetContractsState())
      hashCode = hashCode * 8191 + contractsState.hashCode();

    hashCode = hashCode * 8191 + ((isSetEmittedTransactions()) ? 131071 : 524287);
    if (isSetEmittedTransactions())
      hashCode = hashCode * 8191 + emittedTransactions.hashCode();

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(executionCost);

    return hashCode;
  }

  @Override
  public int compareTo(SetterMethodResult other) {
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
    lastComparison = java.lang.Boolean.valueOf(isSetRet_val()).compareTo(other.isSetRet_val());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRet_val()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ret_val, other.ret_val);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetContractsState()).compareTo(other.isSetContractsState());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetContractsState()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.contractsState, other.contractsState);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetEmittedTransactions()).compareTo(other.isSetEmittedTransactions());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEmittedTransactions()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.emittedTransactions, other.emittedTransactions);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetExecutionCost()).compareTo(other.isSetExecutionCost());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExecutionCost()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.executionCost, other.executionCost);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("SetterMethodResult(");
    boolean first = true;

    sb.append("status:");
    if (this.status == null) {
      sb.append("null");
    } else {
      sb.append(this.status);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("ret_val:");
    if (this.ret_val == null) {
      sb.append("null");
    } else {
      sb.append(this.ret_val);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("contractsState:");
    if (this.contractsState == null) {
      sb.append("null");
    } else {
      sb.append(this.contractsState);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("emittedTransactions:");
    if (this.emittedTransactions == null) {
      sb.append("null");
    } else {
      sb.append(this.emittedTransactions);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("executionCost:");
    sb.append(this.executionCost);
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

  private static class SetterMethodResultStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SetterMethodResultStandardScheme getScheme() {
      return new SetterMethodResultStandardScheme();
    }
  }

  private static class SetterMethodResultStandardScheme extends org.apache.thrift.scheme.StandardScheme<SetterMethodResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SetterMethodResult struct) throws org.apache.thrift.TException {
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
              struct.status = new com.credits.general.thrift.generated.APIResponse();
              struct.status.read(iprot);
              struct.setStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // RET_VAL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.ret_val = new com.credits.general.thrift.generated.Variant();
              struct.ret_val.read(iprot);
              struct.setRet_valIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CONTRACTS_STATE
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map8 = iprot.readMapBegin();
                struct.contractsState = new java.util.HashMap<java.nio.ByteBuffer,java.nio.ByteBuffer>(2*_map8.size);
                @org.apache.thrift.annotation.Nullable java.nio.ByteBuffer _key9;
                @org.apache.thrift.annotation.Nullable java.nio.ByteBuffer _val10;
                for (int _i11 = 0; _i11 < _map8.size; ++_i11)
                {
                  _key9 = iprot.readBinary();
                  _val10 = iprot.readBinary();
                  struct.contractsState.put(_key9, _val10);
                }
                iprot.readMapEnd();
              }
              struct.setContractsStateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // EMITTED_TRANSACTIONS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list12 = iprot.readListBegin();
                struct.emittedTransactions = new java.util.ArrayList<EmittedTransaction>(_list12.size);
                @org.apache.thrift.annotation.Nullable EmittedTransaction _elem13;
                for (int _i14 = 0; _i14 < _list12.size; ++_i14)
                {
                  _elem13 = new EmittedTransaction();
                  _elem13.read(iprot);
                  struct.emittedTransactions.add(_elem13);
                }
                iprot.readListEnd();
              }
              struct.setEmittedTransactionsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // EXECUTION_COST
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.executionCost = iprot.readI64();
              struct.setExecutionCostIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SetterMethodResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.status != null) {
        oprot.writeFieldBegin(STATUS_FIELD_DESC);
        struct.status.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.ret_val != null) {
        oprot.writeFieldBegin(RET_VAL_FIELD_DESC);
        struct.ret_val.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.contractsState != null) {
        oprot.writeFieldBegin(CONTRACTS_STATE_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.contractsState.size()));
          for (java.util.Map.Entry<java.nio.ByteBuffer, java.nio.ByteBuffer> _iter15 : struct.contractsState.entrySet())
          {
            oprot.writeBinary(_iter15.getKey());
            oprot.writeBinary(_iter15.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.emittedTransactions != null) {
        oprot.writeFieldBegin(EMITTED_TRANSACTIONS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.emittedTransactions.size()));
          for (EmittedTransaction _iter16 : struct.emittedTransactions)
          {
            _iter16.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(EXECUTION_COST_FIELD_DESC);
      oprot.writeI64(struct.executionCost);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SetterMethodResultTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SetterMethodResultTupleScheme getScheme() {
      return new SetterMethodResultTupleScheme();
    }
  }

  private static class SetterMethodResultTupleScheme extends org.apache.thrift.scheme.TupleScheme<SetterMethodResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SetterMethodResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetStatus()) {
        optionals.set(0);
      }
      if (struct.isSetRet_val()) {
        optionals.set(1);
      }
      if (struct.isSetContractsState()) {
        optionals.set(2);
      }
      if (struct.isSetEmittedTransactions()) {
        optionals.set(3);
      }
      if (struct.isSetExecutionCost()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetStatus()) {
        struct.status.write(oprot);
      }
      if (struct.isSetRet_val()) {
        struct.ret_val.write(oprot);
      }
      if (struct.isSetContractsState()) {
        {
          oprot.writeI32(struct.contractsState.size());
          for (java.util.Map.Entry<java.nio.ByteBuffer, java.nio.ByteBuffer> _iter17 : struct.contractsState.entrySet())
          {
            oprot.writeBinary(_iter17.getKey());
            oprot.writeBinary(_iter17.getValue());
          }
        }
      }
      if (struct.isSetEmittedTransactions()) {
        {
          oprot.writeI32(struct.emittedTransactions.size());
          for (EmittedTransaction _iter18 : struct.emittedTransactions)
          {
            _iter18.write(oprot);
          }
        }
      }
      if (struct.isSetExecutionCost()) {
        oprot.writeI64(struct.executionCost);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SetterMethodResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.status = new com.credits.general.thrift.generated.APIResponse();
        struct.status.read(iprot);
        struct.setStatusIsSet(true);
      }
      if (incoming.get(1)) {
        struct.ret_val = new com.credits.general.thrift.generated.Variant();
        struct.ret_val.read(iprot);
        struct.setRet_valIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TMap _map19 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.contractsState = new java.util.HashMap<java.nio.ByteBuffer,java.nio.ByteBuffer>(2*_map19.size);
          @org.apache.thrift.annotation.Nullable java.nio.ByteBuffer _key20;
          @org.apache.thrift.annotation.Nullable java.nio.ByteBuffer _val21;
          for (int _i22 = 0; _i22 < _map19.size; ++_i22)
          {
            _key20 = iprot.readBinary();
            _val21 = iprot.readBinary();
            struct.contractsState.put(_key20, _val21);
          }
        }
        struct.setContractsStateIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TList _list23 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.emittedTransactions = new java.util.ArrayList<EmittedTransaction>(_list23.size);
          @org.apache.thrift.annotation.Nullable EmittedTransaction _elem24;
          for (int _i25 = 0; _i25 < _list23.size; ++_i25)
          {
            _elem24 = new EmittedTransaction();
            _elem24.read(iprot);
            struct.emittedTransactions.add(_elem24);
          }
        }
        struct.setEmittedTransactionsIsSet(true);
      }
      if (incoming.get(4)) {
        struct.executionCost = iprot.readI64();
        struct.setExecutionCostIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

