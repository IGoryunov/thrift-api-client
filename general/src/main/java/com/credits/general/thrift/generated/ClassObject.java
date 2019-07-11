/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.credits.general.thrift.generated;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2019-07-11")
public class ClassObject implements org.apache.thrift.TBase<ClassObject, ClassObject._Fields>, java.io.Serializable, Cloneable, Comparable<ClassObject> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ClassObject");

  private static final org.apache.thrift.protocol.TField BYTE_CODE_OBJECTS_FIELD_DESC = new org.apache.thrift.protocol.TField("byteCodeObjects", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField INSTANCE_FIELD_DESC = new org.apache.thrift.protocol.TField("instance", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ClassObjectStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ClassObjectTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.util.List<ByteCodeObject> byteCodeObjects; // required
  public @org.apache.thrift.annotation.Nullable java.nio.ByteBuffer instance; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BYTE_CODE_OBJECTS((short)1, "byteCodeObjects"),
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
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // BYTE_CODE_OBJECTS
          return BYTE_CODE_OBJECTS;
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
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.BYTE_CODE_OBJECTS, new org.apache.thrift.meta_data.FieldMetaData("byteCodeObjects", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT            , "ByteCodeObject"))));
    tmpMap.put(_Fields.INSTANCE, new org.apache.thrift.meta_data.FieldMetaData("instance", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ClassObject.class, metaDataMap);
  }

  public ClassObject() {
  }

  public ClassObject(
    java.util.List<ByteCodeObject> byteCodeObjects,
    java.nio.ByteBuffer instance)
  {
    this();
    this.byteCodeObjects = byteCodeObjects;
    this.instance = org.apache.thrift.TBaseHelper.copyBinary(instance);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ClassObject(ClassObject other) {
    if (other.isSetByteCodeObjects()) {
      java.util.List<ByteCodeObject> __this__byteCodeObjects = new java.util.ArrayList<ByteCodeObject>(other.byteCodeObjects.size());
      for (ByteCodeObject other_element : other.byteCodeObjects) {
        __this__byteCodeObjects.add(new ByteCodeObject(other_element));
      }
      this.byteCodeObjects = __this__byteCodeObjects;
    }
    if (other.isSetInstance()) {
      this.instance = org.apache.thrift.TBaseHelper.copyBinary(other.instance);
    }
  }

  public ClassObject deepCopy() {
    return new ClassObject(this);
  }

  @Override
  public void clear() {
    this.byteCodeObjects = null;
    this.instance = null;
  }

  public int getByteCodeObjectsSize() {
    return (this.byteCodeObjects == null) ? 0 : this.byteCodeObjects.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<ByteCodeObject> getByteCodeObjectsIterator() {
    return (this.byteCodeObjects == null) ? null : this.byteCodeObjects.iterator();
  }

  public void addToByteCodeObjects(ByteCodeObject elem) {
    if (this.byteCodeObjects == null) {
      this.byteCodeObjects = new java.util.ArrayList<ByteCodeObject>();
    }
    this.byteCodeObjects.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<ByteCodeObject> getByteCodeObjects() {
    return this.byteCodeObjects;
  }

  public ClassObject setByteCodeObjects(@org.apache.thrift.annotation.Nullable java.util.List<ByteCodeObject> byteCodeObjects) {
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

  public byte[] getInstance() {
    setInstance(org.apache.thrift.TBaseHelper.rightSize(instance));
    return instance == null ? null : instance.array();
  }

  public java.nio.ByteBuffer bufferForInstance() {
    return org.apache.thrift.TBaseHelper.copyBinary(instance);
  }

  public ClassObject setInstance(byte[] instance) {
    this.instance = instance == null ? (java.nio.ByteBuffer)null   : java.nio.ByteBuffer.wrap(instance.clone());
    return this;
  }

  public ClassObject setInstance(@org.apache.thrift.annotation.Nullable java.nio.ByteBuffer instance) {
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

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case BYTE_CODE_OBJECTS:
      if (value == null) {
        unsetByteCodeObjects();
      } else {
        setByteCodeObjects((java.util.List<ByteCodeObject>)value);
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

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case BYTE_CODE_OBJECTS:
      return getByteCodeObjects();

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
    case BYTE_CODE_OBJECTS:
      return isSetByteCodeObjects();
    case INSTANCE:
      return isSetInstance();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof ClassObject)
      return this.equals((ClassObject)that);
    return false;
  }

  public boolean equals(ClassObject that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_byteCodeObjects = true && this.isSetByteCodeObjects();
    boolean that_present_byteCodeObjects = true && that.isSetByteCodeObjects();
    if (this_present_byteCodeObjects || that_present_byteCodeObjects) {
      if (!(this_present_byteCodeObjects && that_present_byteCodeObjects))
        return false;
      if (!this.byteCodeObjects.equals(that.byteCodeObjects))
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

    hashCode = hashCode * 8191 + ((isSetByteCodeObjects()) ? 131071 : 524287);
    if (isSetByteCodeObjects())
      hashCode = hashCode * 8191 + byteCodeObjects.hashCode();

    hashCode = hashCode * 8191 + ((isSetInstance()) ? 131071 : 524287);
    if (isSetInstance())
      hashCode = hashCode * 8191 + instance.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(ClassObject other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("ClassObject(");
    boolean first = true;

    sb.append("byteCodeObjects:");
    if (this.byteCodeObjects == null) {
      sb.append("null");
    } else {
      sb.append(this.byteCodeObjects);
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

  private static class ClassObjectStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ClassObjectStandardScheme getScheme() {
      return new ClassObjectStandardScheme();
    }
  }

  private static class ClassObjectStandardScheme extends org.apache.thrift.scheme.StandardScheme<ClassObject> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ClassObject struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // BYTE_CODE_OBJECTS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.byteCodeObjects = new java.util.ArrayList<ByteCodeObject>(_list0.size);
                @org.apache.thrift.annotation.Nullable ByteCodeObject _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = new ByteCodeObject();
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ClassObject struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.byteCodeObjects != null) {
        oprot.writeFieldBegin(BYTE_CODE_OBJECTS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.byteCodeObjects.size()));
          for (ByteCodeObject _iter3 : struct.byteCodeObjects)
          {
            _iter3.write(oprot);
          }
          oprot.writeListEnd();
        }
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

  private static class ClassObjectTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ClassObjectTupleScheme getScheme() {
      return new ClassObjectTupleScheme();
    }
  }

  private static class ClassObjectTupleScheme extends org.apache.thrift.scheme.TupleScheme<ClassObject> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ClassObject struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetByteCodeObjects()) {
        optionals.set(0);
      }
      if (struct.isSetInstance()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetByteCodeObjects()) {
        {
          oprot.writeI32(struct.byteCodeObjects.size());
          for (ByteCodeObject _iter4 : struct.byteCodeObjects)
          {
            _iter4.write(oprot);
          }
        }
      }
      if (struct.isSetInstance()) {
        oprot.writeBinary(struct.instance);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ClassObject struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.byteCodeObjects = new java.util.ArrayList<ByteCodeObject>(_list5.size);
          @org.apache.thrift.annotation.Nullable ByteCodeObject _elem6;
          for (int _i7 = 0; _i7 < _list5.size; ++_i7)
          {
            _elem6 = new ByteCodeObject();
            _elem6.read(iprot);
            struct.byteCodeObjects.add(_elem6);
          }
        }
        struct.setByteCodeObjectsIsSet(true);
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

