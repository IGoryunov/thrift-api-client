/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.credits.client.node.thrift.generated;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2019-07-09")
public class ContractAllMethodsGetResult implements org.apache.thrift.TBase<ContractAllMethodsGetResult, ContractAllMethodsGetResult._Fields>, java.io.Serializable, Cloneable, Comparable<ContractAllMethodsGetResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ContractAllMethodsGetResult");

  private static final org.apache.thrift.protocol.TField CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("code", org.apache.thrift.protocol.TType.BYTE, (short)1);
  private static final org.apache.thrift.protocol.TField MESSAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("message", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField METHODS_FIELD_DESC = new org.apache.thrift.protocol.TField("methods", org.apache.thrift.protocol.TType.LIST, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ContractAllMethodsGetResultStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ContractAllMethodsGetResultTupleSchemeFactory();

  public byte code; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String message; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<com.credits.general.thrift.generated.MethodDescription> methods; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CODE((short)1, "code"),
    MESSAGE((short)2, "message"),
    METHODS((short)3, "methods");

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
        case 1: // CODE
          return CODE;
        case 2: // MESSAGE
          return MESSAGE;
        case 3: // METHODS
          return METHODS;
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
  private static final int __CODE_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CODE, new org.apache.thrift.meta_data.FieldMetaData("code", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.MESSAGE, new org.apache.thrift.meta_data.FieldMetaData("message", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.METHODS, new org.apache.thrift.meta_data.FieldMetaData("methods", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.credits.general.thrift.generated.MethodDescription.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ContractAllMethodsGetResult.class, metaDataMap);
  }

  public ContractAllMethodsGetResult() {
  }

  public ContractAllMethodsGetResult(
    byte code,
    java.lang.String message,
    java.util.List<com.credits.general.thrift.generated.MethodDescription> methods)
  {
    this();
    this.code = code;
    setCodeIsSet(true);
    this.message = message;
    this.methods = methods;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ContractAllMethodsGetResult(ContractAllMethodsGetResult other) {
    __isset_bitfield = other.__isset_bitfield;
    this.code = other.code;
    if (other.isSetMessage()) {
      this.message = other.message;
    }
    if (other.isSetMethods()) {
      java.util.List<com.credits.general.thrift.generated.MethodDescription> __this__methods = new java.util.ArrayList<com.credits.general.thrift.generated.MethodDescription>(other.methods.size());
      for (com.credits.general.thrift.generated.MethodDescription other_element : other.methods) {
        __this__methods.add(new com.credits.general.thrift.generated.MethodDescription(other_element));
      }
      this.methods = __this__methods;
    }
  }

  public ContractAllMethodsGetResult deepCopy() {
    return new ContractAllMethodsGetResult(this);
  }

  @Override
  public void clear() {
    setCodeIsSet(false);
    this.code = 0;
    this.message = null;
    this.methods = null;
  }

  public byte getCode() {
    return this.code;
  }

  public ContractAllMethodsGetResult setCode(byte code) {
    this.code = code;
    setCodeIsSet(true);
    return this;
  }

  public void unsetCode() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __CODE_ISSET_ID);
  }

  /** Returns true if field code is set (has been assigned a value) and false otherwise */
  public boolean isSetCode() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __CODE_ISSET_ID);
  }

  public void setCodeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __CODE_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getMessage() {
    return this.message;
  }

  public ContractAllMethodsGetResult setMessage(@org.apache.thrift.annotation.Nullable java.lang.String message) {
    this.message = message;
    return this;
  }

  public void unsetMessage() {
    this.message = null;
  }

  /** Returns true if field message is set (has been assigned a value) and false otherwise */
  public boolean isSetMessage() {
    return this.message != null;
  }

  public void setMessageIsSet(boolean value) {
    if (!value) {
      this.message = null;
    }
  }

  public int getMethodsSize() {
    return (this.methods == null) ? 0 : this.methods.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<com.credits.general.thrift.generated.MethodDescription> getMethodsIterator() {
    return (this.methods == null) ? null : this.methods.iterator();
  }

  public void addToMethods(com.credits.general.thrift.generated.MethodDescription elem) {
    if (this.methods == null) {
      this.methods = new java.util.ArrayList<com.credits.general.thrift.generated.MethodDescription>();
    }
    this.methods.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<com.credits.general.thrift.generated.MethodDescription> getMethods() {
    return this.methods;
  }

  public ContractAllMethodsGetResult setMethods(@org.apache.thrift.annotation.Nullable java.util.List<com.credits.general.thrift.generated.MethodDescription> methods) {
    this.methods = methods;
    return this;
  }

  public void unsetMethods() {
    this.methods = null;
  }

  /** Returns true if field methods is set (has been assigned a value) and false otherwise */
  public boolean isSetMethods() {
    return this.methods != null;
  }

  public void setMethodsIsSet(boolean value) {
    if (!value) {
      this.methods = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case CODE:
      if (value == null) {
        unsetCode();
      } else {
        setCode((java.lang.Byte)value);
      }
      break;

    case MESSAGE:
      if (value == null) {
        unsetMessage();
      } else {
        setMessage((java.lang.String)value);
      }
      break;

    case METHODS:
      if (value == null) {
        unsetMethods();
      } else {
        setMethods((java.util.List<com.credits.general.thrift.generated.MethodDescription>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case CODE:
      return getCode();

    case MESSAGE:
      return getMessage();

    case METHODS:
      return getMethods();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case CODE:
      return isSetCode();
    case MESSAGE:
      return isSetMessage();
    case METHODS:
      return isSetMethods();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof ContractAllMethodsGetResult)
      return this.equals((ContractAllMethodsGetResult)that);
    return false;
  }

  public boolean equals(ContractAllMethodsGetResult that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_code = true;
    boolean that_present_code = true;
    if (this_present_code || that_present_code) {
      if (!(this_present_code && that_present_code))
        return false;
      if (this.code != that.code)
        return false;
    }

    boolean this_present_message = true && this.isSetMessage();
    boolean that_present_message = true && that.isSetMessage();
    if (this_present_message || that_present_message) {
      if (!(this_present_message && that_present_message))
        return false;
      if (!this.message.equals(that.message))
        return false;
    }

    boolean this_present_methods = true && this.isSetMethods();
    boolean that_present_methods = true && that.isSetMethods();
    if (this_present_methods || that_present_methods) {
      if (!(this_present_methods && that_present_methods))
        return false;
      if (!this.methods.equals(that.methods))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + (int) (code);

    hashCode = hashCode * 8191 + ((isSetMessage()) ? 131071 : 524287);
    if (isSetMessage())
      hashCode = hashCode * 8191 + message.hashCode();

    hashCode = hashCode * 8191 + ((isSetMethods()) ? 131071 : 524287);
    if (isSetMethods())
      hashCode = hashCode * 8191 + methods.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(ContractAllMethodsGetResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetCode()).compareTo(other.isSetCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.code, other.code);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetMessage()).compareTo(other.isSetMessage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMessage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.message, other.message);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetMethods()).compareTo(other.isSetMethods());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMethods()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.methods, other.methods);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("ContractAllMethodsGetResult(");
    boolean first = true;

    sb.append("code:");
    sb.append(this.code);
    first = false;
    if (!first) sb.append(", ");
    sb.append("message:");
    if (this.message == null) {
      sb.append("null");
    } else {
      sb.append(this.message);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("methods:");
    if (this.methods == null) {
      sb.append("null");
    } else {
      sb.append(this.methods);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
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

  private static class ContractAllMethodsGetResultStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ContractAllMethodsGetResultStandardScheme getScheme() {
      return new ContractAllMethodsGetResultStandardScheme();
    }
  }

  private static class ContractAllMethodsGetResultStandardScheme extends org.apache.thrift.scheme.StandardScheme<ContractAllMethodsGetResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ContractAllMethodsGetResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.code = iprot.readByte();
              struct.setCodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // MESSAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.message = iprot.readString();
              struct.setMessageIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // METHODS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list116 = iprot.readListBegin();
                struct.methods = new java.util.ArrayList<com.credits.general.thrift.generated.MethodDescription>(_list116.size);
                @org.apache.thrift.annotation.Nullable com.credits.general.thrift.generated.MethodDescription _elem117;
                for (int _i118 = 0; _i118 < _list116.size; ++_i118)
                {
                  _elem117 = new com.credits.general.thrift.generated.MethodDescription();
                  _elem117.read(iprot);
                  struct.methods.add(_elem117);
                }
                iprot.readListEnd();
              }
              struct.setMethodsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ContractAllMethodsGetResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(CODE_FIELD_DESC);
      oprot.writeByte(struct.code);
      oprot.writeFieldEnd();
      if (struct.message != null) {
        oprot.writeFieldBegin(MESSAGE_FIELD_DESC);
        oprot.writeString(struct.message);
        oprot.writeFieldEnd();
      }
      if (struct.methods != null) {
        oprot.writeFieldBegin(METHODS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.methods.size()));
          for (com.credits.general.thrift.generated.MethodDescription _iter119 : struct.methods)
          {
            _iter119.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ContractAllMethodsGetResultTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ContractAllMethodsGetResultTupleScheme getScheme() {
      return new ContractAllMethodsGetResultTupleScheme();
    }
  }

  private static class ContractAllMethodsGetResultTupleScheme extends org.apache.thrift.scheme.TupleScheme<ContractAllMethodsGetResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ContractAllMethodsGetResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetCode()) {
        optionals.set(0);
      }
      if (struct.isSetMessage()) {
        optionals.set(1);
      }
      if (struct.isSetMethods()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetCode()) {
        oprot.writeByte(struct.code);
      }
      if (struct.isSetMessage()) {
        oprot.writeString(struct.message);
      }
      if (struct.isSetMethods()) {
        {
          oprot.writeI32(struct.methods.size());
          for (com.credits.general.thrift.generated.MethodDescription _iter120 : struct.methods)
          {
            _iter120.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ContractAllMethodsGetResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.code = iprot.readByte();
        struct.setCodeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.message = iprot.readString();
        struct.setMessageIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list121 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.methods = new java.util.ArrayList<com.credits.general.thrift.generated.MethodDescription>(_list121.size);
          @org.apache.thrift.annotation.Nullable com.credits.general.thrift.generated.MethodDescription _elem122;
          for (int _i123 = 0; _i123 < _list121.size; ++_i123)
          {
            _elem122 = new com.credits.general.thrift.generated.MethodDescription();
            _elem122.read(iprot);
            struct.methods.add(_elem122);
          }
        }
        struct.setMethodsIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

