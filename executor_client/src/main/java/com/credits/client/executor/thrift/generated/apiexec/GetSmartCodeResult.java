/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.credits.client.executor.thrift.generated.apiexec;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2019-02-22")
public class GetSmartCodeResult implements org.apache.thrift.TBase<GetSmartCodeResult, GetSmartCodeResult._Fields>, java.io.Serializable, Cloneable, Comparable<GetSmartCodeResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GetSmartCodeResult");

  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField BYTE_CODE_OBJECTS_FIELD_DESC = new org.apache.thrift.protocol.TField("byteCodeObjects", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField CONTRACT_STATE_FIELD_DESC = new org.apache.thrift.protocol.TField("contractState", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new GetSmartCodeResultStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new GetSmartCodeResultTupleSchemeFactory();

  public com.credits.general.thrift.generated.APIResponse status; // required
  public java.util.List<com.credits.general.thrift.generated.ByteCodeObject> byteCodeObjects; // required
  public java.nio.ByteBuffer contractState; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STATUS((short)1, "status"),
    BYTE_CODE_OBJECTS((short)2, "byteCodeObjects"),
    CONTRACT_STATE((short)3, "contractState");

    private static final java.util.Map<String, _Fields> byName = new java.util.HashMap<String, _Fields>();

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
        case 2: // BYTE_CODE_OBJECTS
          return BYTE_CODE_OBJECTS;
        case 3: // CONTRACT_STATE
          return CONTRACT_STATE;
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
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
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
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GetSmartCodeResult.class, metaDataMap);
  }

  public GetSmartCodeResult() {
  }

  public GetSmartCodeResult(
    com.credits.general.thrift.generated.APIResponse status,
    java.util.List<com.credits.general.thrift.generated.ByteCodeObject> byteCodeObjects,
    java.nio.ByteBuffer contractState)
  {
    this();
    this.status = status;
    this.byteCodeObjects = byteCodeObjects;
    this.contractState = org.apache.thrift.TBaseHelper.copyBinary(contractState);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetSmartCodeResult(GetSmartCodeResult other) {
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
  }

  public GetSmartCodeResult deepCopy() {
    return new GetSmartCodeResult(this);
  }

  @Override
  public void clear() {
    this.status = null;
    this.byteCodeObjects = null;
    this.contractState = null;
  }

  public com.credits.general.thrift.generated.APIResponse getStatus() {
    return this.status;
  }

  public GetSmartCodeResult setStatus(com.credits.general.thrift.generated.APIResponse status) {
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

  public java.util.Iterator<com.credits.general.thrift.generated.ByteCodeObject> getByteCodeObjectsIterator() {
    return (this.byteCodeObjects == null) ? null : this.byteCodeObjects.iterator();
  }

  public void addToByteCodeObjects(com.credits.general.thrift.generated.ByteCodeObject elem) {
    if (this.byteCodeObjects == null) {
      this.byteCodeObjects = new java.util.ArrayList<com.credits.general.thrift.generated.ByteCodeObject>();
    }
    this.byteCodeObjects.add(elem);
  }

  public java.util.List<com.credits.general.thrift.generated.ByteCodeObject> getByteCodeObjects() {
    return this.byteCodeObjects;
  }

  public GetSmartCodeResult setByteCodeObjects(java.util.List<com.credits.general.thrift.generated.ByteCodeObject> byteCodeObjects) {
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

  public GetSmartCodeResult setContractState(byte[] contractState) {
    this.contractState = contractState == null ? (java.nio.ByteBuffer)null : java.nio.ByteBuffer.wrap(contractState.clone());
    return this;
  }

  public GetSmartCodeResult setContractState(java.nio.ByteBuffer contractState) {
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

  public void setFieldValue(_Fields field, Object value) {
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

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case STATUS:
      return getStatus();

    case BYTE_CODE_OBJECTS:
      return getByteCodeObjects();

    case CONTRACT_STATE:
      return getContractState();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case STATUS:
      return isSetStatus();
    case BYTE_CODE_OBJECTS:
      return isSetByteCodeObjects();
    case CONTRACT_STATE:
      return isSetContractState();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GetSmartCodeResult)
      return this.equals((GetSmartCodeResult)that);
    return false;
  }

  public boolean equals(GetSmartCodeResult that) {
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

    return hashCode;
  }

  @Override
  public int compareTo(GetSmartCodeResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetStatus()).compareTo(other.isSetStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.status, other.status);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetByteCodeObjects()).compareTo(other.isSetByteCodeObjects());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetByteCodeObjects()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.byteCodeObjects, other.byteCodeObjects);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetContractState()).compareTo(other.isSetContractState());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetContractState()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.contractState, other.contractState);
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
  public String toString() {
    StringBuilder sb = new StringBuilder("GetSmartCodeResult(");
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

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class GetSmartCodeResultStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public GetSmartCodeResultStandardScheme getScheme() {
      return new GetSmartCodeResultStandardScheme();
    }
  }

  private static class GetSmartCodeResultStandardScheme extends org.apache.thrift.scheme.StandardScheme<GetSmartCodeResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GetSmartCodeResult struct) throws org.apache.thrift.TException {
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
                com.credits.general.thrift.generated.ByteCodeObject _elem1;
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
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, GetSmartCodeResult struct) throws org.apache.thrift.TException {
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
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GetSmartCodeResultTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public GetSmartCodeResultTupleScheme getScheme() {
      return new GetSmartCodeResultTupleScheme();
    }
  }

  private static class GetSmartCodeResultTupleScheme extends org.apache.thrift.scheme.TupleScheme<GetSmartCodeResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GetSmartCodeResult struct) throws org.apache.thrift.TException {
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
      oprot.writeBitSet(optionals, 3);
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
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GetSmartCodeResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.status = new com.credits.general.thrift.generated.APIResponse();
        struct.status.read(iprot);
        struct.setStatusIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.byteCodeObjects = new java.util.ArrayList<com.credits.general.thrift.generated.ByteCodeObject>(_list5.size);
          com.credits.general.thrift.generated.ByteCodeObject _elem6;
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
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
