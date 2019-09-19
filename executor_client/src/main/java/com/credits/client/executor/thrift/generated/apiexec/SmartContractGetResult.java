/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.credits.client.executor.thrift.generated.apiexec;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2019-09-19")
public class SmartContractGetResult implements org.apache.thrift.TBase<SmartContractGetResult, SmartContractGetResult._Fields>, java.io.Serializable, Cloneable, Comparable<SmartContractGetResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SmartContractGetResult");

  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField BYTE_CODE_OBJECTS_FIELD_DESC = new org.apache.thrift.protocol.TField("byteCodeObjects", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField CONTRACT_STATE_FIELD_DESC = new org.apache.thrift.protocol.TField("contractState", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField STATE_CAN_MODIFY_FIELD_DESC = new org.apache.thrift.protocol.TField("stateCanModify", org.apache.thrift.protocol.TType.BOOL, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new SmartContractGetResultStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new SmartContractGetResultTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable com.credits.general.thrift.generated.APIResponse status; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<com.credits.general.thrift.generated.ByteCodeObject> byteCodeObjects; // required
  public @org.apache.thrift.annotation.Nullable java.nio.ByteBuffer contractState; // required
  public boolean stateCanModify; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STATUS((short)1, "status"),
    BYTE_CODE_OBJECTS((short)2, "byteCodeObjects"),
    CONTRACT_STATE((short)3, "contractState"),
    STATE_CAN_MODIFY((short)4, "stateCanModify");

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
        case 2: // BYTE_CODE_OBJECTS
          return BYTE_CODE_OBJECTS;
        case 3: // CONTRACT_STATE
          return CONTRACT_STATE;
        case 4: // STATE_CAN_MODIFY
          return STATE_CAN_MODIFY;
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
  private static final int __STATECANMODIFY_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.credits.general.thrift.generated.APIResponse.class)));
    tmpMap.put(_Fields.BYTE_CODE_OBJECTS, new org.apache.thrift.meta_data.FieldMetaData("byteCodeObjects", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.credits.general.thrift.generated.ByteCodeObject.class))));
    tmpMap.put(_Fields.CONTRACT_STATE, new org.apache.thrift.meta_data.FieldMetaData("contractState", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.STATE_CAN_MODIFY, new org.apache.thrift.meta_data.FieldMetaData("stateCanModify", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SmartContractGetResult.class, metaDataMap);
  }

  public SmartContractGetResult() {
  }

  public SmartContractGetResult(
    com.credits.general.thrift.generated.APIResponse status,
    java.util.List<com.credits.general.thrift.generated.ByteCodeObject> byteCodeObjects,
    java.nio.ByteBuffer contractState,
    boolean stateCanModify)
  {
    this();
    this.status = status;
    this.byteCodeObjects = byteCodeObjects;
    this.contractState = org.apache.thrift.TBaseHelper.copyBinary(contractState);
    this.stateCanModify = stateCanModify;
    setStateCanModifyIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SmartContractGetResult(SmartContractGetResult other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetStatus()) {
      this.status = new com.credits.general.thrift.generated.APIResponse(other.status);
    }
    if (other.isSetByteCodeObjects()) {
      java.util.List<com.credits.general.thrift.generated.ByteCodeObject> __this__byteCodeObjects = new java.util.ArrayList<com.credits.general.thrift.generated.ByteCodeObject>(other.byteCodeObjects.size());
      for (com.credits.general.thrift.generated.ByteCodeObject other_element : other.byteCodeObjects) {
        __this__byteCodeObjects.add(new com.credits.general.thrift.generated.ByteCodeObject(other_element));
      }
      this.byteCodeObjects = __this__byteCodeObjects;
    }
    if (other.isSetContractState()) {
      this.contractState = org.apache.thrift.TBaseHelper.copyBinary(other.contractState);
    }
    this.stateCanModify = other.stateCanModify;
  }

  public SmartContractGetResult deepCopy() {
    return new SmartContractGetResult(this);
  }

  @Override
  public void clear() {
    this.status = null;
    this.byteCodeObjects = null;
    this.contractState = null;
    setStateCanModifyIsSet(false);
    this.stateCanModify = false;
  }

  @org.apache.thrift.annotation.Nullable
  public com.credits.general.thrift.generated.APIResponse getStatus() {
    return this.status;
  }

  public SmartContractGetResult setStatus(@org.apache.thrift.annotation.Nullable com.credits.general.thrift.generated.APIResponse status) {
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

  public int getByteCodeObjectsSize() {
    return (this.byteCodeObjects == null) ? 0 : this.byteCodeObjects.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<com.credits.general.thrift.generated.ByteCodeObject> getByteCodeObjectsIterator() {
    return (this.byteCodeObjects == null) ? null : this.byteCodeObjects.iterator();
  }

  public void addToByteCodeObjects(com.credits.general.thrift.generated.ByteCodeObject elem) {
    if (this.byteCodeObjects == null) {
      this.byteCodeObjects = new java.util.ArrayList<com.credits.general.thrift.generated.ByteCodeObject>();
    }
    this.byteCodeObjects.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<com.credits.general.thrift.generated.ByteCodeObject> getByteCodeObjects() {
    return this.byteCodeObjects;
  }

  public SmartContractGetResult setByteCodeObjects(@org.apache.thrift.annotation.Nullable java.util.List<com.credits.general.thrift.generated.ByteCodeObject> byteCodeObjects) {
    this.byteCodeObjects = byteCodeObjects;
    return this;
  }

  public void unsetByteCodeObjects() {
    this.byteCodeObjects = null;
  }

  /** Returns true if field byteCodeObjects is set (has been assigned a value) and false otherwise */
  public boolean isSetByteCodeObjects() {
    return this.byteCodeObjects != null;
  }

  public void setByteCodeObjectsIsSet(boolean value) {
    if (!value) {
      this.byteCodeObjects = null;
    }
  }

  public byte[] getContractState() {
    setContractState(org.apache.thrift.TBaseHelper.rightSize(contractState));
    return contractState == null ? null : contractState.array();
  }

  public java.nio.ByteBuffer bufferForContractState() {
    return org.apache.thrift.TBaseHelper.copyBinary(contractState);
  }

  public SmartContractGetResult setContractState(byte[] contractState) {
    this.contractState = contractState == null ? (java.nio.ByteBuffer)null   : java.nio.ByteBuffer.wrap(contractState.clone());
    return this;
  }

  public SmartContractGetResult setContractState(@org.apache.thrift.annotation.Nullable java.nio.ByteBuffer contractState) {
    this.contractState = org.apache.thrift.TBaseHelper.copyBinary(contractState);
    return this;
  }

  public void unsetContractState() {
    this.contractState = null;
  }

  /** Returns true if field contractState is set (has been assigned a value) and false otherwise */
  public boolean isSetContractState() {
    return this.contractState != null;
  }

  public void setContractStateIsSet(boolean value) {
    if (!value) {
      this.contractState = null;
    }
  }

  public boolean isStateCanModify() {
    return this.stateCanModify;
  }

  public SmartContractGetResult setStateCanModify(boolean stateCanModify) {
    this.stateCanModify = stateCanModify;
    setStateCanModifyIsSet(true);
    return this;
  }

  public void unsetStateCanModify() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __STATECANMODIFY_ISSET_ID);
  }

  /** Returns true if field stateCanModify is set (has been assigned a value) and false otherwise */
  public boolean isSetStateCanModify() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __STATECANMODIFY_ISSET_ID);
  }

  public void setStateCanModifyIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __STATECANMODIFY_ISSET_ID, value);
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

    case BYTE_CODE_OBJECTS:
      if (value == null) {
        unsetByteCodeObjects();
      } else {
        setByteCodeObjects((java.util.List<com.credits.general.thrift.generated.ByteCodeObject>)value);
      }
      break;

    case CONTRACT_STATE:
      if (value == null) {
        unsetContractState();
      } else {
        if (value instanceof byte[]) {
          setContractState((byte[])value);
        } else {
          setContractState((java.nio.ByteBuffer)value);
        }
      }
      break;

    case STATE_CAN_MODIFY:
      if (value == null) {
        unsetStateCanModify();
      } else {
        setStateCanModify((java.lang.Boolean)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case STATUS:
      return getStatus();

    case BYTE_CODE_OBJECTS:
      return getByteCodeObjects();

    case CONTRACT_STATE:
      return getContractState();

    case STATE_CAN_MODIFY:
      return isStateCanModify();

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
    case BYTE_CODE_OBJECTS:
      return isSetByteCodeObjects();
    case CONTRACT_STATE:
      return isSetContractState();
    case STATE_CAN_MODIFY:
      return isSetStateCanModify();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof SmartContractGetResult)
      return this.equals((SmartContractGetResult)that);
    return false;
  }

  public boolean equals(SmartContractGetResult that) {
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

    boolean this_present_byteCodeObjects = true && this.isSetByteCodeObjects();
    boolean that_present_byteCodeObjects = true && that.isSetByteCodeObjects();
    if (this_present_byteCodeObjects || that_present_byteCodeObjects) {
      if (!(this_present_byteCodeObjects && that_present_byteCodeObjects))
        return false;
      if (!this.byteCodeObjects.equals(that.byteCodeObjects))
        return false;
    }

    boolean this_present_contractState = true && this.isSetContractState();
    boolean that_present_contractState = true && that.isSetContractState();
    if (this_present_contractState || that_present_contractState) {
      if (!(this_present_contractState && that_present_contractState))
        return false;
      if (!this.contractState.equals(that.contractState))
        return false;
    }

    boolean this_present_stateCanModify = true;
    boolean that_present_stateCanModify = true;
    if (this_present_stateCanModify || that_present_stateCanModify) {
      if (!(this_present_stateCanModify && that_present_stateCanModify))
        return false;
      if (this.stateCanModify != that.stateCanModify)
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

    hashCode = hashCode * 8191 + ((isSetByteCodeObjects()) ? 131071 : 524287);
    if (isSetByteCodeObjects())
      hashCode = hashCode * 8191 + byteCodeObjects.hashCode();

    hashCode = hashCode * 8191 + ((isSetContractState()) ? 131071 : 524287);
    if (isSetContractState())
      hashCode = hashCode * 8191 + contractState.hashCode();

    hashCode = hashCode * 8191 + ((stateCanModify) ? 131071 : 524287);

    return hashCode;
  }

  @Override
  public int compareTo(SmartContractGetResult other) {
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
    lastComparison = java.lang.Boolean.valueOf(isSetByteCodeObjects()).compareTo(other.isSetByteCodeObjects());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetByteCodeObjects()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.byteCodeObjects, other.byteCodeObjects);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetContractState()).compareTo(other.isSetContractState());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetContractState()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.contractState, other.contractState);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetStateCanModify()).compareTo(other.isSetStateCanModify());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStateCanModify()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.stateCanModify, other.stateCanModify);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("SmartContractGetResult(");
    boolean first = true;

    sb.append("status:");
    if (this.status == null) {
      sb.append("null");
    } else {
      sb.append(this.status);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("byteCodeObjects:");
    if (this.byteCodeObjects == null) {
      sb.append("null");
    } else {
      sb.append(this.byteCodeObjects);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("contractState:");
    if (this.contractState == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.contractState, sb);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("stateCanModify:");
    sb.append(this.stateCanModify);
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

  private static class SmartContractGetResultStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SmartContractGetResultStandardScheme getScheme() {
      return new SmartContractGetResultStandardScheme();
    }
  }

  private static class SmartContractGetResultStandardScheme extends org.apache.thrift.scheme.StandardScheme<SmartContractGetResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SmartContractGetResult struct) throws org.apache.thrift.TException {
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
          case 2: // BYTE_CODE_OBJECTS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.byteCodeObjects = new java.util.ArrayList<com.credits.general.thrift.generated.ByteCodeObject>(_list0.size);
                @org.apache.thrift.annotation.Nullable com.credits.general.thrift.generated.ByteCodeObject _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = new com.credits.general.thrift.generated.ByteCodeObject();
                  _elem1.read(iprot);
                  struct.byteCodeObjects.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setByteCodeObjectsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CONTRACT_STATE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.contractState = iprot.readBinary();
              struct.setContractStateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // STATE_CAN_MODIFY
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.stateCanModify = iprot.readBool();
              struct.setStateCanModifyIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SmartContractGetResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.status != null) {
        oprot.writeFieldBegin(STATUS_FIELD_DESC);
        struct.status.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.byteCodeObjects != null) {
        oprot.writeFieldBegin(BYTE_CODE_OBJECTS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.byteCodeObjects.size()));
          for (com.credits.general.thrift.generated.ByteCodeObject _iter3 : struct.byteCodeObjects)
          {
            _iter3.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.contractState != null) {
        oprot.writeFieldBegin(CONTRACT_STATE_FIELD_DESC);
        oprot.writeBinary(struct.contractState);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(STATE_CAN_MODIFY_FIELD_DESC);
      oprot.writeBool(struct.stateCanModify);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SmartContractGetResultTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SmartContractGetResultTupleScheme getScheme() {
      return new SmartContractGetResultTupleScheme();
    }
  }

  private static class SmartContractGetResultTupleScheme extends org.apache.thrift.scheme.TupleScheme<SmartContractGetResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SmartContractGetResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetStatus()) {
        optionals.set(0);
      }
      if (struct.isSetByteCodeObjects()) {
        optionals.set(1);
      }
      if (struct.isSetContractState()) {
        optionals.set(2);
      }
      if (struct.isSetStateCanModify()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetStatus()) {
        struct.status.write(oprot);
      }
      if (struct.isSetByteCodeObjects()) {
        {
          oprot.writeI32(struct.byteCodeObjects.size());
          for (com.credits.general.thrift.generated.ByteCodeObject _iter4 : struct.byteCodeObjects)
          {
            _iter4.write(oprot);
          }
        }
      }
      if (struct.isSetContractState()) {
        oprot.writeBinary(struct.contractState);
      }
      if (struct.isSetStateCanModify()) {
        oprot.writeBool(struct.stateCanModify);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SmartContractGetResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.status = new com.credits.general.thrift.generated.APIResponse();
        struct.status.read(iprot);
        struct.setStatusIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.byteCodeObjects = new java.util.ArrayList<com.credits.general.thrift.generated.ByteCodeObject>(_list5.size);
          @org.apache.thrift.annotation.Nullable com.credits.general.thrift.generated.ByteCodeObject _elem6;
          for (int _i7 = 0; _i7 < _list5.size; ++_i7)
          {
            _elem6 = new com.credits.general.thrift.generated.ByteCodeObject();
            _elem6.read(iprot);
            struct.byteCodeObjects.add(_elem6);
          }
        }
        struct.setByteCodeObjectsIsSet(true);
      }
      if (incoming.get(2)) {
        struct.contractState = iprot.readBinary();
        struct.setContractStateIsSet(true);
      }
      if (incoming.get(3)) {
        struct.stateCanModify = iprot.readBool();
        struct.setStateCanModifyIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

