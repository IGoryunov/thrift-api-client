/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.credits.general.thrift.generated;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2019-04-11")
public class object implements org.apache.thrift.TBase<object, object._Fields>, java.io.Serializable, Cloneable, Comparable<object> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("object");

  private static final org.apache.thrift.protocol.TField NAME_CLASS_FIELD_DESC = new org.apache.thrift.protocol.TField("nameClass", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField INSTANCE_FIELD_DESC = new org.apache.thrift.protocol.TField("instance", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new objectStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new objectTupleSchemeFactory();

  public java.lang.String nameClass; // required
  public java.nio.ByteBuffer instance; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NAME_CLASS((short)1, "nameClass"),
    INSTANCE((short)2, "instance");

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
        case 1: // NAME_CLASS
          return NAME_CLASS;
        case 2: // INSTANCE
          return INSTANCE;
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
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NAME_CLASS, new org.apache.thrift.meta_data.FieldMetaData("nameClass", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.INSTANCE, new org.apache.thrift.meta_data.FieldMetaData("instance", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(object.class, metaDataMap);
  }

  public object() {
  }

  public object(
    java.lang.String nameClass,
    java.nio.ByteBuffer instance)
  {
    this();
    this.nameClass = nameClass;
    this.instance = org.apache.thrift.TBaseHelper.copyBinary(instance);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public object(object other) {
    if (other.isSetNameClass()) {
      this.nameClass = other.nameClass;
    }
    if (other.isSetInstance()) {
      this.instance = org.apache.thrift.TBaseHelper.copyBinary(other.instance);
    }
  }

  public object deepCopy() {
    return new object(this);
  }

  @Override
  public void clear() {
    this.nameClass = null;
    this.instance = null;
  }

  public java.lang.String getNameClass() {
    return this.nameClass;
  }

  public object setNameClass(java.lang.String nameClass) {
    this.nameClass = nameClass;
    return this;
  }

  public void unsetNameClass() {
    this.nameClass = null;
  }

  /** Returns true if field nameClass is set (has been assigned a value) and false otherwise */
  public boolean isSetNameClass() {
    return this.nameClass != null;
  }

  public void setNameClassIsSet(boolean value) {
    if (!value) {
      this.nameClass = null;
    }
  }

  public byte[] getInstance() {
    setInstance(org.apache.thrift.TBaseHelper.rightSize(instance));
    return instance == null ? null : instance.array();
  }

  public java.nio.ByteBuffer bufferForInstance() {
    return org.apache.thrift.TBaseHelper.copyBinary(instance);
  }

  public object setInstance(byte[] instance) {
    this.instance = instance == null ? (java.nio.ByteBuffer)null : java.nio.ByteBuffer.wrap(instance.clone());
    return this;
  }

  public object setInstance(java.nio.ByteBuffer instance) {
    this.instance = org.apache.thrift.TBaseHelper.copyBinary(instance);
    return this;
  }

  public void unsetInstance() {
    this.instance = null;
  }

  /** Returns true if field instance is set (has been assigned a value) and false otherwise */
  public boolean isSetInstance() {
    return this.instance != null;
  }

  public void setInstanceIsSet(boolean value) {
    if (!value) {
      this.instance = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case NAME_CLASS:
      if (value == null) {
        unsetNameClass();
      } else {
        setNameClass((java.lang.String)value);
      }
      break;

    case INSTANCE:
      if (value == null) {
        unsetInstance();
      } else {
        if (value instanceof byte[]) {
          setInstance((byte[])value);
        } else {
          setInstance((java.nio.ByteBuffer)value);
        }
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case NAME_CLASS:
      return getNameClass();

    case INSTANCE:
      return getInstance();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case NAME_CLASS:
      return isSetNameClass();
    case INSTANCE:
      return isSetInstance();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof object)
      return this.equals((object)that);
    return false;
  }

  public boolean equals(object that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_nameClass = true && this.isSetNameClass();
    boolean that_present_nameClass = true && that.isSetNameClass();
    if (this_present_nameClass || that_present_nameClass) {
      if (!(this_present_nameClass && that_present_nameClass))
        return false;
      if (!this.nameClass.equals(that.nameClass))
        return false;
    }

    boolean this_present_instance = true && this.isSetInstance();
    boolean that_present_instance = true && that.isSetInstance();
    if (this_present_instance || that_present_instance) {
      if (!(this_present_instance && that_present_instance))
        return false;
      if (!this.instance.equals(that.instance))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetNameClass()) ? 131071 : 524287);
    if (isSetNameClass())
      hashCode = hashCode * 8191 + nameClass.hashCode();

    hashCode = hashCode * 8191 + ((isSetInstance()) ? 131071 : 524287);
    if (isSetInstance())
      hashCode = hashCode * 8191 + instance.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(object other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetNameClass()).compareTo(other.isSetNameClass());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNameClass()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nameClass, other.nameClass);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetInstance()).compareTo(other.isSetInstance());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInstance()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.instance, other.instance);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("object(");
    boolean first = true;

    sb.append("nameClass:");
    if (this.nameClass == null) {
      sb.append("null");
    } else {
      sb.append(this.nameClass);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("instance:");
    if (this.instance == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.instance, sb);
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class objectStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public objectStandardScheme getScheme() {
      return new objectStandardScheme();
    }
  }

  private static class objectStandardScheme extends org.apache.thrift.scheme.StandardScheme<object> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, object struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NAME_CLASS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.nameClass = iprot.readString();
              struct.setNameClassIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // INSTANCE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.instance = iprot.readBinary();
              struct.setInstanceIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, object struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.nameClass != null) {
        oprot.writeFieldBegin(NAME_CLASS_FIELD_DESC);
        oprot.writeString(struct.nameClass);
        oprot.writeFieldEnd();
      }
      if (struct.instance != null) {
        oprot.writeFieldBegin(INSTANCE_FIELD_DESC);
        oprot.writeBinary(struct.instance);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class objectTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public objectTupleScheme getScheme() {
      return new objectTupleScheme();
    }
  }

  private static class objectTupleScheme extends org.apache.thrift.scheme.TupleScheme<object> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, object struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetNameClass()) {
        optionals.set(0);
      }
      if (struct.isSetInstance()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetNameClass()) {
        oprot.writeString(struct.nameClass);
      }
      if (struct.isSetInstance()) {
        oprot.writeBinary(struct.instance);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, object struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.nameClass = iprot.readString();
        struct.setNameClassIsSet(true);
      }
      if (incoming.get(1)) {
        struct.instance = iprot.readBinary();
        struct.setInstanceIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

